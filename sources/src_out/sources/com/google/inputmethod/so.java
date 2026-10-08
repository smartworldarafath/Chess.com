package com.google.inputmethod;

import android.graphics.Shader;
import android.os.Build;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/google/android/i5d;", "Landroid/graphics/Shader$TileMode;", "a", "(I)Landroid/graphics/Shader$TileMode;", "ui-graphics"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class so {
    public static final Shader.TileMode a(int i) {
        i5d.Companion companion = i5d.INSTANCE;
        if (i5d.f(i, companion.a())) {
            return Shader.TileMode.CLAMP;
        }
        if (i5d.f(i, companion.d())) {
            return Shader.TileMode.REPEAT;
        }
        if (i5d.f(i, companion.c())) {
            return Shader.TileMode.MIRROR;
        }
        if (i5d.f(i, companion.b()) && Build.VERSION.SDK_INT >= 31) {
            return k5d.a.a();
        }
        return Shader.TileMode.CLAMP;
    }
}
