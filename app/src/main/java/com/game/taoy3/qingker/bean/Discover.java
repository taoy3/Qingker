package com.game.taoy3.qingker.bean;

import java.util.List;

/**
 * Created by taoy3 on 16/4/6.
 */
public class Discover {

    private List<ArticlesBean> articles;
    private List<TopSelectionsBean> top_selections;
    private List<NextStopsBean> next_stops;
    private List<CollectionsBean> collections;
    private List<TagsBean> tags;

    public List<ArticlesBean> getArticles() {
        return articles;
    }

    public void setArticles(List<ArticlesBean> articles) {
        this.articles = articles;
    }

    public List<TopSelectionsBean> getTop_selections() {
        return top_selections;
    }

    public void setTop_selections(List<TopSelectionsBean> top_selections) {
        this.top_selections = top_selections;
    }

    public List<NextStopsBean> getNext_stops() {
        return next_stops;
    }

    public void setNext_stops(List<NextStopsBean> next_stops) {
        this.next_stops = next_stops;
    }

    public List<CollectionsBean> getCollections() {
        return collections;
    }

    public void setCollections(List<CollectionsBean> collections) {
        this.collections = collections;
    }

    public List<TagsBean> getTags() {
        return tags;
    }

    public void setTags(List<TagsBean> tags) {
        this.tags = tags;
    }

    public static class ArticlesBean {
        private int id;
        private String title;
        private String sub_title;
        private String bg_pic;
        private int bg_color;
        private boolean title_notshown;
        private String url;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getSub_title() {
            return sub_title;
        }

        public void setSub_title(String sub_title) {
            this.sub_title = sub_title;
        }

        public String getBg_pic() {
            return bg_pic;
        }

        public void setBg_pic(String bg_pic) {
            this.bg_pic = bg_pic;
        }

        public int getBg_color() {
            return bg_color;
        }

        public void setBg_color(int bg_color) {
            this.bg_color = bg_color;
        }

        public boolean isTitle_notshown() {
            return title_notshown;
        }

        public void setTitle_notshown(boolean title_notshown) {
            this.title_notshown = title_notshown;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }

    public static class TopSelectionsBean {
        private String type;
        private int hotness;
        /**
         * id : 3369
         * title : 饵多鱼傻速来！
         * sub_title : 苏梅岛出海垂钓、烤鱼BBQ1日游
         * bg_pic : http://data.qinker.com/image/original/de/3a/bf/de3abf3bf467c78c56dafd1d64c0c4e5.jpg
         * bg_video :
         * destination : 泰国, 苏梅岛
         * short_desc : 船夫示范用最原始的方法，也就是《少年派》里的方法钓鱼：一根鱼线挂着钩子，挂着鱼食，然后扔向远方，船夫在半小时之内钓上来四条鱼！
         这么热的天，在海上，能喝到冰可乐，还能吃到冰西瓜和菠萝，这种感觉才对。
         * start_date : 2016-02-01
         * end_date : 2016-12-31
         * share_url : /digests/recomm/O3X3pIJkX_8
         * bg_color : 7241618
         * liker_count : 10
         * price : ￥202
         * is_liked : 0
         */

        private SelectionBean selection;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getHotness() {
            return hotness;
        }

        public void setHotness(int hotness) {
            this.hotness = hotness;
        }

        public SelectionBean getSelection() {
            return selection;
        }

        public void setSelection(SelectionBean selection) {
            this.selection = selection;
        }

        public static class SelectionBean {
            private int id;
            private String title;
            private String sub_title;
            private String bg_pic;
            private String bg_video;
            private String destination;
            private String short_desc;
            private String start_date;
            private String end_date;
            private String share_url;
            private int bg_color;
            private int liker_count;
            private String price;
            private int is_liked;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getSub_title() {
                return sub_title;
            }

            public void setSub_title(String sub_title) {
                this.sub_title = sub_title;
            }

            public String getBg_pic() {
                return bg_pic;
            }

            public void setBg_pic(String bg_pic) {
                this.bg_pic = bg_pic;
            }

            public String getBg_video() {
                return bg_video;
            }

            public void setBg_video(String bg_video) {
                this.bg_video = bg_video;
            }

            public String getDestination() {
                return destination;
            }

            public void setDestination(String destination) {
                this.destination = destination;
            }

            public String getShort_desc() {
                return short_desc;
            }

            public void setShort_desc(String short_desc) {
                this.short_desc = short_desc;
            }

            public String getStart_date() {
                return start_date;
            }

            public void setStart_date(String start_date) {
                this.start_date = start_date;
            }

            public String getEnd_date() {
                return end_date;
            }

            public void setEnd_date(String end_date) {
                this.end_date = end_date;
            }

            public String getShare_url() {
                return share_url;
            }

            public void setShare_url(String share_url) {
                this.share_url = share_url;
            }

            public int getBg_color() {
                return bg_color;
            }

            public void setBg_color(int bg_color) {
                this.bg_color = bg_color;
            }

            public int getLiker_count() {
                return liker_count;
            }

            public void setLiker_count(int liker_count) {
                this.liker_count = liker_count;
            }

            public String getPrice() {
                return price;
            }

            public void setPrice(String price) {
                this.price = price;
            }

            public int getIs_liked() {
                return is_liked;
            }

            public void setIs_liked(int is_liked) {
                this.is_liked = is_liked;
            }
        }
    }

    public static class NextStopsBean {
        private int id;
        private String title;
        private String sub_title;
        private String bg_pic;
        private int bg_color;
        private boolean title_notshown;
        private String url;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getSub_title() {
            return sub_title;
        }

        public void setSub_title(String sub_title) {
            this.sub_title = sub_title;
        }

        public String getBg_pic() {
            return bg_pic;
        }

        public void setBg_pic(String bg_pic) {
            this.bg_pic = bg_pic;
        }

        public int getBg_color() {
            return bg_color;
        }

        public void setBg_color(int bg_color) {
            this.bg_color = bg_color;
        }

        public boolean isTitle_notshown() {
            return title_notshown;
        }

        public void setTitle_notshown(boolean title_notshown) {
            this.title_notshown = title_notshown;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }

    public static class TagsBean {
        private int id;
        private String name;
        private String icon;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }
    }
}
