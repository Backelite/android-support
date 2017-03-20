package com.backelite.support.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

import com.backelite.support.util.FontUtils;
import com.kfaraj.support.widget.SupportTextView;

public class BkTextView extends SupportTextView {

    public BkTextView(Context context) {
        super(context);
    }

    public BkTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs, 0);
    }

    public BkTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs, defStyleAttr);
    }

    private void init(Context context, AttributeSet attrs, int defStyleAttr) {
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.BkTextView, defStyleAttr, 0);
        if (a.hasValue(R.styleable.BkTextView_textFontPath)) {
            setTypeface(a.getString(R.styleable.BkTextView_textFontPath));
        }
        a.recycle();
    }

    public void setTypeface(String fontPath) {
        if (!isInEditMode()) {
            setTypeface(
                    FontUtils.getAssetTypeFace(
                            getContext(),
                            fontPath
                    )
            );
        }
    }

}
