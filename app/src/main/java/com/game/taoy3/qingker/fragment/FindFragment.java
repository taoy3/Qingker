package com.game.taoy3.qingker.fragment;


import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.Toast;

import com.game.taoy3.qingker.R;
import com.game.taoy3.qingker.adapter.ArticlesPagerAdapter;
import com.game.taoy3.qingker.adapter.CollectionAdapter;
import com.game.taoy3.qingker.adapter.NextStopAdapter;
import com.game.taoy3.qingker.adapter.SelectionsAdapter;
import com.game.taoy3.qingker.adapter.TagsRecAdapter;
import com.game.taoy3.qingker.bean.CollectionsBean;
import com.game.taoy3.qingker.bean.Discover;
import com.game.taoy3.qingker.constant.UrlConstant;
import com.game.taoy3.qingker.utils.BufferDialog;
import com.game.taoy3.qingker.utils.GsonUtils;
import com.game.taoy3.qingker.utils.HttpRequest;
import com.game.taoy3.qingker.widght.AutoScrollViewPager;
import com.game.taoy3.qingker.widght.ChildGridView;
import com.game.taoy3.qingker.widght.ChildListView;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class FindFragment extends BaseFragment {

    private List<Discover.ArticlesBean> articles = new ArrayList<>();
    private ArticlesPagerAdapter articlesPagerAdapter;
    private List<Discover.TagsBean> tags=new ArrayList<>();
    private TagsRecAdapter tagsAdapter;
    private List<Discover.NextStopsBean> next_stops = new ArrayList<>();
    private BaseAdapter nextAdapter;
    private List<CollectionsBean> collections= new ArrayList<>();
    private BaseAdapter collectionsAdapter;
    private List<Discover.TopSelectionsBean> top_selections= new ArrayList<>();
    private BaseAdapter selectionsAdapter;
    private BufferDialog dialog;
    private AutoScrollViewPager articlesPager;

    public FindFragment() {
    }

    @Override
    protected void initView(View view) {
        titleView.setText(R.string.find);
        rightView.setImageResource(R.mipmap.search);
        rightView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        articlesPager = (AutoScrollViewPager) view.findViewById(R.id.articles);
        articlesPagerAdapter = new ArticlesPagerAdapter(getActivity(),articles);
        articlesPager.setAdapter(articlesPagerAdapter);

        RecyclerView tagsRecycler = (RecyclerView) view.findViewById(R.id.tags);
        tagsAdapter = new TagsRecAdapter(getActivity(),tags);
        tagsRecycler.setAdapter(tagsAdapter);

        ChildGridView stopsGv = (ChildGridView) view.findViewById(R.id.next_stops);
        nextAdapter = new NextStopAdapter(next_stops,getActivity());
        stopsGv.setAdapter(nextAdapter);

        ChildListView collectionsLv = (ChildListView) view.findViewById(R.id.collections);
        collectionsAdapter = new CollectionAdapter(collections,getActivity());
        collectionsLv.setAdapter(collectionsAdapter);

        ChildListView top_selectionsLv = (ChildListView) view.findViewById(R.id.top_selections);
        selectionsAdapter = new SelectionsAdapter(top_selections,getActivity());
        top_selectionsLv.setAdapter(selectionsAdapter);

        dialog = new BufferDialog(getActivity());

        dialog.show();
    }

    @Override
    protected void initData() {
        HttpRequest.getInstance().get(UrlConstant.DISCOVERY,getActivity(), null, new HttpRequest.RequestCallBack() {
            @Override
            public void onFail(Exception e) {
                Toast.makeText(getActivity(),e.getMessage(),Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }

            @Override
            public void onSucceed(String result) {
                dialog.dismiss();
                try {
                    String json = new JSONObject(result).getString("recomms");
                    Discover discover = GsonUtils.getInstance().parseBean(json, Discover.class);
                    if(null!=discover.getArticles()&&discover.getArticles().size()>0){
                        articles.addAll(discover.getArticles());
                        articlesPagerAdapter.notifyDataSetChanged();
                        articlesPager.startAutoScroll();
                    }
                    if(null!=discover.getTags()&&discover.getTags().size()>0){
                        tags.addAll(discover.getTags());
                        tagsAdapter.notifyDataSetChanged();
                    }
                    if(null!=discover.getNext_stops()&&discover.getNext_stops().size()>0){
                        next_stops.addAll(discover.getNext_stops());
                        nextAdapter.notifyDataSetChanged();
                    }
                    if(null!=discover.getCollections()&&discover.getCollections().size()>0){
                        for (int i = 0; i < 3&&i<discover.getCollections().size(); i++) {
                            collections.add(discover.getCollections().get(i));
                        }
                        collectionsAdapter.notifyDataSetChanged();
                    }
                    if(null!=discover.getTop_selections()&&discover.getTop_selections().size()>0){
                        top_selections.addAll(discover.getTop_selections());
                        selectionsAdapter.notifyDataSetChanged();
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_find;
    }

}
