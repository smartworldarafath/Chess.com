package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\r\u001a\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0013\"\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/google/android/j26;", "interactionSource", "", "bounded", "Lcom/google/android/ff3;", "radius", "Lcom/google/android/ri1;", "color", "Lkotlin/Function0;", "Lcom/google/android/joa;", "rippleAlpha", "Lcom/google/android/x23;", "c", "(Lcom/google/android/j26;ZFLcom/google/android/ri1;Lkotlin/jvm/functions/Function0;)Lcom/google/android/x23;", "Lcom/google/android/i26;", "interaction", "Lcom/google/android/kr;", "", "d", "(Lcom/google/android/i26;)Lcom/google/android/kr;", "e", "Lcom/google/android/rjd;", "a", "Lcom/google/android/rjd;", "DefaultTweenSpec", "material-ripple"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class woa {
    private static final rjd<Float> a = new rjd<>(15, 0, em3.e(), 2, null);

    public static final x23 c(j26 j26Var, boolean z, float f, ri1 ri1Var, Function0<RippleAlpha> function0) {
        return cpa.d(j26Var, z, f, ri1Var, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kr<Float> d(i26 i26Var) {
        if (i26Var instanceof yf5) {
            return a;
        }
        if (!(i26Var instanceof lk4) && !(i26Var instanceof zf3)) {
            return a;
        }
        return new rjd(45, 0, em3.e(), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kr<Float> e(i26 i26Var) {
        if (!(i26Var instanceof yf5) && !(i26Var instanceof lk4) && (i26Var instanceof zf3)) {
            return new rjd(150, 0, em3.e(), 2, null);
        }
        return a;
    }
}
