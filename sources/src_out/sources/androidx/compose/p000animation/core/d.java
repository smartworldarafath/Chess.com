package androidx.compose.p000animation.core;

import androidx.compose.animation.core.InfiniteTransition.a;
import androidx.compose.p000animation.core.d;
import androidx.compose.p004runtime.e;
import com.google.android.yg4;
import com.google.inputmethod.jd3;
import com.google.inputmethod.kd3;
import com.google.inputmethod.ov5;
import com.google.inputmethod.q6c;
import com.google.inputmethod.tjd;
import com.google.inputmethod.ur;
import com.google.inputmethod.vn3;
import com.google.inputmethod.w2e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001ae\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\u0005\"\b\b\u0001\u0010\u0007*\u00020\u0006*\u00020\u00022\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001aA\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e*\u00020\u00022\u0006\u0010\b\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00112\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00110\f2\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"", "label", "Landroidx/compose/animation/core/InfiniteTransition;", "g", "(Ljava/lang/String;Landroidx/compose/runtime/d;II)Landroidx/compose/animation/core/InfiniteTransition;", "T", "Lcom/google/android/ur;", "V", "initialValue", "targetValue", "Lcom/google/android/tjd;", "typeConverter", "Lcom/google/android/ov5;", "animationSpec", "Lcom/google/android/q6c;", "d", "(Landroidx/compose/animation/core/InfiniteTransition;Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/tjd;Lcom/google/android/ov5;Ljava/lang/String;Landroidx/compose/runtime/d;II)Lcom/google/android/q6c;", "", "c", "(Landroidx/compose/animation/core/InfiniteTransition;FFLcom/google/android/ov5;Ljava/lang/String;Landroidx/compose/runtime/d;II)Lcom/google/android/q6c;", "animation-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d {

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/animation/core/d$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements jd3 {
        final /* synthetic */ InfiniteTransition a;
        final /* synthetic */ InfiniteTransition.a b;

        public a(InfiniteTransition infiniteTransition, InfiniteTransition.a aVar) {
            this.a = infiniteTransition;
            this.b = aVar;
        }

        @Override // com.google.inputmethod.jd3
        public void dispose() {
            this.a.k(this.b);
        }
    }

    public static final q6c<Float> c(InfiniteTransition infiniteTransition, float f, float f2, ov5<Float> ov5Var, String str, androidx.compose.p004runtime.d dVar, int i, int i2) {
        if ((i2 & 8) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        if (e.k()) {
            e.o(-644770905, i, -1, "androidx.compose.animation.core.animateFloat (InfiniteTransition.kt:296)");
        }
        int i3 = i << 3;
        q6c<Float> q6cVarD = d(infiniteTransition, Float.valueOf(f), Float.valueOf(f2), w2e.N(yg4.a), ov5Var, str2, dVar, (i & 1022) | (57344 & i3) | (i3 & 458752), 0);
        if (e.k()) {
            e.n();
        }
        return q6cVarD;
    }

    public static final <T, V extends ur> q6c<T> d(InfiniteTransition infiniteTransition, T t, T t2, tjd<T, V> tjdVar, ov5<T> ov5Var, String str, androidx.compose.p004runtime.d dVar, int i, int i2) {
        final InfiniteTransition infiniteTransition2;
        final Object obj;
        final Object obj2;
        final ov5<T> ov5Var2;
        if ((i2 & 16) != 0) {
            str = "ValueAnimation";
        }
        String str2 = str;
        if (e.k()) {
            e.o(-1062847727, i, -1, "androidx.compose.animation.core.animateValue (InfiniteTransition.kt:245)");
        }
        Object objR = dVar.R();
        androidx.compose.p004runtime.d.Companion companion = androidx.compose.p004runtime.d.INSTANCE;
        if (objR == companion.a()) {
            infiniteTransition2 = infiniteTransition;
            obj = t;
            obj2 = t2;
            ov5Var2 = ov5Var;
            InfiniteTransition.a aVar = infiniteTransition2.new a(obj, obj2, tjdVar, ov5Var2, str2);
            dVar.L(aVar);
            objR = aVar;
        } else {
            infiniteTransition2 = infiniteTransition;
            obj = t;
            obj2 = t2;
            ov5Var2 = ov5Var;
        }
        final InfiniteTransition.a aVar2 = (InfiniteTransition.a) objR;
        boolean z = true;
        boolean z2 = ((((i & 112) ^ 48) > 32 && dVar.T(obj)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && dVar.T(obj2)) || (i & 384) == 256);
        if ((((57344 & i) ^ 24576) <= 16384 || !dVar.T(ov5Var2)) && (i & 24576) != 16384) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objR2 = dVar.R();
        if (z3 || objR2 == companion.a()) {
            objR2 = new Function0() { // from class: com.google.android.qv5
                public final Object invoke() {
                    return d.e(obj, aVar2, obj2, ov5Var2);
                }
            };
            dVar.L(objR2);
        }
        vn3.i((Function0) objR2, dVar, 0);
        boolean zT = dVar.T(infiniteTransition2);
        Object objR3 = dVar.R();
        if (zT || objR3 == companion.a()) {
            objR3 = new Function1() { // from class: com.google.android.rv5
                public final Object invoke(Object obj3) {
                    return d.f(infiniteTransition2, aVar2, (kd3) obj3);
                }
            };
            dVar.L(objR3);
        }
        vn3.c(aVar2, (Function1) objR3, dVar, 6);
        if (e.k()) {
            e.n();
        }
        return aVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(Object obj, InfiniteTransition.a aVar, Object obj2, ov5 ov5Var) {
        if (!Intrinsics.e(obj, aVar.c()) || !Intrinsics.e(obj2, aVar.g())) {
            aVar.x(obj, obj2, ov5Var);
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jd3 f(InfiniteTransition infiniteTransition, InfiniteTransition.a aVar, kd3 kd3Var) {
        infiniteTransition.g(aVar);
        return new a(infiniteTransition, aVar);
    }

    public static final InfiniteTransition g(String str, androidx.compose.p004runtime.d dVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            str = "InfiniteTransition";
        }
        if (e.k()) {
            e.o(1013651573, i, -1, "androidx.compose.animation.core.rememberInfiniteTransition (InfiniteTransition.kt:44)");
        }
        Object objR = dVar.R();
        if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
            objR = new InfiniteTransition(str);
            dVar.L(objR);
        }
        InfiniteTransition infiniteTransition = (InfiniteTransition) objR;
        infiniteTransition.l(dVar, 0);
        if (e.k()) {
            e.n();
        }
        return infiniteTransition;
    }
}
