package com.google.inputmethod;

import androidx.compose.p000animation.ColorVectorConverterKt;
import androidx.compose.p000animation.core.Animatable;
import androidx.compose.p000animation.core.AnimateAsStateKt;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aO\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\f\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\"\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00000\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/google/android/ei1;", "targetValue", "Lcom/google/android/kr;", "animationSpec", "", "label", "Lkotlin/Function1;", "", "finishedListener", "Lcom/google/android/q6c;", "b", "(JLcom/google/android/kr;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/d;II)Lcom/google/android/q6c;", "initialValue", "Landroidx/compose/animation/core/Animatable;", "Lcom/google/android/tr;", "a", "(J)Landroidx/compose/animation/core/Animatable;", "Lcom/google/android/w2c;", "Lcom/google/android/w2c;", "colorDefaultSpring", "animation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class osb {
    private static final w2c<ei1> a = lr.j(0.0f, 0.0f, null, 7, null);

    public static final Animatable<ei1, tr> a(long j) {
        return new Animatable<>(ei1.l(j), (tjd) ColorVectorConverterKt.a(ei1.INSTANCE).invoke(ei1.u(j)), null, null, 12, null);
    }

    public static final q6c<ei1> b(long j, kr<ei1> krVar, String str, Function1<? super ei1, Unit> function1, d dVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            krVar = a;
        }
        kr<ei1> krVar2 = krVar;
        if ((i2 & 4) != 0) {
            str = "ColorAnimation";
        }
        String str2 = str;
        if ((i2 & 8) != 0) {
            function1 = null;
        }
        Function1<? super ei1, Unit> function2 = function1;
        if (e.k()) {
            e.o(-451899108, i, -1, "androidx.compose.animation.animateColorAsState (SingleValueAnimation.kt:61)");
        }
        boolean zX = dVar.x(ei1.u(j));
        Object objR = dVar.R();
        if (zX || objR == d.INSTANCE.a()) {
            objR = (tjd) ColorVectorConverterKt.a(ei1.INSTANCE).invoke(ei1.u(j));
            dVar.L(objR);
        }
        int i3 = i << 6;
        q6c<ei1> q6cVarG = AnimateAsStateKt.g(ei1.l(j), (tjd) objR, krVar2, null, str2, function2, dVar, (i & 14) | ((i << 3) & 896) | (57344 & i3) | (i3 & 458752), 8);
        if (e.k()) {
            e.n();
        }
        return q6cVarG;
    }
}
