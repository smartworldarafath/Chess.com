package com.google.inputmethod;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import com.google.android.sh7;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u00020\t*\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u0010*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0016\u001a\u00020\t*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\u0010*\u00020\u00062\u0006\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aR\u0015\u0010\u001d\u001a\u00020\t*\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/google/android/km3;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/widget/EdgeEffect;", "b", "(Landroid/content/Context;)Landroid/widget/EdgeEffect;", "", "deltaDistance", "displacement", "e", "(Landroid/widget/EdgeEffect;FF)F", "", "velocity", "", "d", "(Landroid/widget/EdgeEffect;I)V", "edgeEffectLength", "Lcom/google/android/f43;", "density", "a", "(Landroid/widget/EdgeEffect;FFLcom/google/android/f43;)F", "delta", "f", "(Landroid/widget/EdgeEffect;F)V", "c", "(Landroid/widget/EdgeEffect;)F", "distanceCompat", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class km3 {
    public static final km3 a = new km3();

    private km3() {
    }

    public final float a(EdgeEffect edgeEffect, float f, float f2, f43 f43Var) {
        if (lm3.b(f43Var, f) > c(edgeEffect) * f2) {
            return 0.0f;
        }
        d(edgeEffect, sh7.d(f));
        return f;
    }

    public final EdgeEffect b(Context context) {
        return Build.VERSION.SDK_INT >= 31 ? rt.a.a(context, null) : new hz4(context);
    }

    public final float c(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return rt.a.b(edgeEffect);
        }
        return 0.0f;
    }

    public final void d(EdgeEffect edgeEffect, int i) {
        if (Build.VERSION.SDK_INT >= 31) {
            edgeEffect.onAbsorb(i);
        } else if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(i);
        }
    }

    public final float e(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return rt.a.c(edgeEffect, f, f2);
        }
        edgeEffect.onPull(f, f2);
        return f;
    }

    public final void f(EdgeEffect edgeEffect, float f) {
        if (edgeEffect instanceof hz4) {
            ((hz4) edgeEffect).a(f);
        } else {
            edgeEffect.onRelease();
        }
    }
}
