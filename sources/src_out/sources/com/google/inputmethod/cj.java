package com.google.inputmethod;

import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.ui.graphics.a;
import androidx.compose.ui.graphics.h;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a#\u0010\t\u001a\u00060\u0001j\u0002`\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\r\u001a\u00060\u0001j\u0002`\b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u0010\u001a\u00020\u000b2\n\u0010\u000f\u001a\u00060\u0001j\u0002`\bH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u000f\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0013\u0010\u0014*\f\b\u0000\u0010\u0015\"\u00020\u00012\u00020\u0001¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/graphics/h;", "Landroid/graphics/ColorFilter;", "d", "(Landroidx/compose/ui/graphics/h;)Landroid/graphics/ColorFilter;", "Lcom/google/android/ei1;", "color", "Landroidx/compose/ui/graphics/e;", "blendMode", "Landroidx/compose/ui/graphics/NativeColorFilter;", "c", "(JI)Landroid/graphics/ColorFilter;", "Lcom/google/android/mi1;", "colorMatrix", "a", "([F)Landroid/graphics/ColorFilter;", "filter", "b", "(Landroid/graphics/ColorFilter;)[F", "", "e", "()Z", "NativeColorFilter", "ui-graphics"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class cj {
    public static final ColorFilter a(float[] fArr) {
        return new ColorMatrixColorFilter(fArr);
    }

    public static final float[] b(ColorFilter colorFilter) {
        if ((colorFilter instanceof ColorMatrixColorFilter) && e()) {
            return ni1.a.a((ColorMatrixColorFilter) colorFilter);
        }
        throw new IllegalArgumentException("Unable to obtain ColorMatrix from Android ColorMatrixColorFilter. This method was invoked on an unsupported Android version");
    }

    public static final ColorFilter c(long j, int i) {
        return Build.VERSION.SDK_INT >= 29 ? to0.a.a(j, i) : new PorterDuffColorFilter(ki1.j(j), a.b(i));
    }

    public static final ColorFilter d(h hVar) {
        return hVar.getNativeColorFilter();
    }

    public static final boolean e() {
        return true;
    }
}
