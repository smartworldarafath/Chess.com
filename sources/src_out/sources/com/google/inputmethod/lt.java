package com.google.inputmethod;

import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import androidx.compose.ui.graphics.colorspace.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/google/android/lt;", "", "<init>", "()V", "", "width", "height", "Lcom/google/android/nl5;", "bitmapConfig", "", "hasAlpha", "Landroidx/compose/ui/graphics/colorspace/c;", "colorSpace", "Landroid/graphics/Bitmap;", "a", "(IIIZLandroidx/compose/ui/graphics/colorspace/c;)Landroid/graphics/Bitmap;", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class lt {
    public static final lt a = new lt();

    private lt() {
    }

    public static final Bitmap a(int width, int height, int bitmapConfig, boolean hasAlpha, c colorSpace) {
        return Bitmap.createBitmap((DisplayMetrics) null, width, height, cl.d(bitmapConfig), hasAlpha, dj.a(colorSpace));
    }
}
