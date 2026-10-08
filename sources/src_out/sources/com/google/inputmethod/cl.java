package com.google.inputmethod;

import android.graphics.Bitmap;
import androidx.compose.ui.graphics.colorspace.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a7\u0010\r\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0011\u0010\u000f\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0007H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0014\u001a\u00020\u0007*\u00020\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroid/graphics/Bitmap;", "Lcom/google/android/ml5;", "c", "(Landroid/graphics/Bitmap;)Lcom/google/android/ml5;", "", "width", "height", "Lcom/google/android/nl5;", "config", "", "hasAlpha", "Landroidx/compose/ui/graphics/colorspace/c;", "colorSpace", "a", "(IIIZLandroidx/compose/ui/graphics/colorspace/c;)Lcom/google/android/ml5;", "b", "(Lcom/google/android/ml5;)Landroid/graphics/Bitmap;", "Landroid/graphics/Bitmap$Config;", "d", "(I)Landroid/graphics/Bitmap$Config;", "e", "(Landroid/graphics/Bitmap$Config;)I", "ui-graphics"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class cl {
    public static final ml5 a(int i, int i2, int i3, boolean z, c cVar) {
        d(i3);
        return new bl(lt.a(i, i2, i3, z, cVar));
    }

    public static final Bitmap b(ml5 ml5Var) {
        if (ml5Var instanceof bl) {
            return ((bl) ml5Var).getBitmap();
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final ml5 c(Bitmap bitmap) {
        return new bl(bitmap);
    }

    public static final Bitmap.Config d(int i) {
        nl5.Companion companion = nl5.INSTANCE;
        if (nl5.i(i, companion.b())) {
            return Bitmap.Config.ARGB_8888;
        }
        if (nl5.i(i, companion.a())) {
            return Bitmap.Config.ALPHA_8;
        }
        if (nl5.i(i, companion.e())) {
            return Bitmap.Config.RGB_565;
        }
        if (nl5.i(i, companion.c())) {
            return Bitmap.Config.RGBA_F16;
        }
        return nl5.i(i, companion.d()) ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    public static final int e(Bitmap.Config config) {
        if (config == Bitmap.Config.ALPHA_8) {
            return nl5.INSTANCE.a();
        }
        if (config == Bitmap.Config.RGB_565) {
            return nl5.INSTANCE.e();
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return nl5.INSTANCE.b();
        }
        if (config == Bitmap.Config.RGBA_F16) {
            return nl5.INSTANCE.c();
        }
        return config == Bitmap.Config.HARDWARE ? nl5.INSTANCE.d() : nl5.INSTANCE.b();
    }
}
