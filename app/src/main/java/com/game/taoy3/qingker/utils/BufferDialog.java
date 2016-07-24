package com.game.taoy3.qingker.utils;

import android.app.Dialog;
import android.content.Context;

import com.game.taoy3.qingker.R;

/**
 * Created by taoy3 on 16/4/11.
 */
public class BufferDialog extends Dialog {
    public BufferDialog(Context context) {
        super(context);
        setContentView(R.layout.view_buffer_dialog);
        setCanceledOnTouchOutside(false);
    }
}
