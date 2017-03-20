package com.backelite.support.util;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.NonNull;

public final class FontUtils {

    private FontUtils() {

    }

    public static Typeface getAssetTypeFace(@NonNull Context context, @NonNull String fontPath) {

        return Typeface.createFromAsset(
                context.getResources().getAssets(),
                fontPath
        );

    }

}
