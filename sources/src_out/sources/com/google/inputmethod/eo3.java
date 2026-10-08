package com.google.inputmethod;

import androidx.compose.p000animation.core.Animatable;
import com.google.android.q22;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a>\u0010\u0007\u001a\u00020\u0006*\f\u0012\u0004\u0012\u00020\u0001\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0080@¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f\"\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f¨\u0006\u0014"}, d2 = {"Landroidx/compose/animation/core/Animatable;", "Lcom/google/android/ff3;", "target", "Lcom/google/android/i26;", "from", "to", "", "d", "(Landroidx/compose/animation/core/Animatable;FLcom/google/android/i26;Lcom/google/android/i26;Lcom/google/android/q22;)Ljava/lang/Object;", "Lcom/google/android/vl3;", "a", "Lcom/google/android/vl3;", "OutgoingSpecEasing", "Lcom/google/android/rjd;", "b", "Lcom/google/android/rjd;", "DefaultIncomingSpec", "c", "DefaultOutgoingSpec", "HoveredOutgoingSpec", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class eo3 {
    private static final vl3 a;
    private static final rjd<ff3> b;
    private static final rjd<ff3> c;
    private static final rjd<ff3> d;

    static {
        CubicBezierEasing cubicBezierEasing = new CubicBezierEasing(0.4f, 0.0f, 0.6f, 1.0f);
        a = cubicBezierEasing;
        b = new rjd<>(120, 0, em3.d(), 2, null);
        int i = 2;
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i2 = 0;
        c = new rjd<>(150, i2, cubicBezierEasing, i, defaultConstructorMarker);
        d = new rjd<>(120, i2, cubicBezierEasing, i, defaultConstructorMarker);
    }

    public static final Object d(Animatable<ff3, ?> animatable, float f, i26 i26Var, i26 i26Var2, q22<? super Unit> q22Var) {
        kr<ff3> krVarB;
        if (i26Var2 != null) {
            krVarB = do3.a.a(i26Var2);
        } else {
            krVarB = i26Var != null ? do3.a.b(i26Var) : null;
        }
        kr<ff3> krVar = krVarB;
        if (krVar != null) {
            Object objF = Animatable.f(animatable, ff3.e(f), krVar, null, null, q22Var, 12, null);
            return objF == a.g() ? objF : Unit.a;
        }
        Object objT = animatable.t(ff3.e(f), q22Var);
        return objT == a.g() ? objT : Unit.a;
    }
}
