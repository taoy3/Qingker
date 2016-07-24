package com.game.taoy3.qingker.widght;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by Administrator on 2015/8/14.
 */
    public class CircularImageView extends ImageView {
        public CircularImageView(Context context) {
            super(context);
        }
        public CircularImageView(Context context, AttributeSet attrs) {
            super(context, attrs);
        }
        public CircularImageView(Context context, AttributeSet attrs,
                                 int defStyle) {
            super(context, attrs, defStyle);
        }
        @Override
        protected void onDraw(Canvas canvas) {
            Path clipPath = new Path();
            int w = this.getWidth();
            int h = this.getHeight();
            clipPath.addRoundRect(new RectF(0, 0, w, h), 5, 5, Path.Direction.CW);
            canvas.clipPath(clipPath);
            super.onDraw(canvas);
        }
    }
