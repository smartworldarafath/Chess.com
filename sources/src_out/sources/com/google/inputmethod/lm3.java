package com.google.inputmethod;

import android.view.ViewConfiguration;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0005\u001a\u001f\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\n\"\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/google/android/f43;", "density", "", "velocity", "b", "(Lcom/google/android/f43;F)F", "a", "F", "PlatformFlingScrollFriction", "", "D", "DecelerationRate", "c", "DecelMinusOne", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class lm3 {
    private static final float a = ViewConfiguration.getScrollFriction();
    private static final double b;
    private static final double c;

    static {
        double dLog = Math.log(0.78d) / Math.log(0.9d);
        b = dLog;
        c = dLog - 1.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float b(f43 f43Var, float f) {
        double density = f43Var.getDensity() * 386.0878f * 160.0f * 0.84f;
        double dAbs = Math.abs(f) * 0.35f;
        float f2 = a;
        return (float) (((double) f2) * density * Math.exp((b / c) * Math.log(dAbs / (((double) f2) * density))));
    }
}
