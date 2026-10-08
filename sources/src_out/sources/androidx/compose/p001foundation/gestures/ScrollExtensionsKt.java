package androidx.compose.p001foundation.gestures;

import androidx.compose.p001foundation.MutatePriority;
import com.google.android.q22;
import com.google.android.ut0;
import com.google.inputmethod.hab;
import com.google.inputmethod.kr;
import com.google.inputmethod.lr;
import com.google.inputmethod.t04;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.f;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a,\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001c\u0010\u0007\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u0007\u0010\b\u001a\u001e\u0010\f\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\tH\u0086@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/google/android/hab;", "", "value", "Lcom/google/android/kr;", "animationSpec", "a", "(Lcom/google/android/hab;FLcom/google/android/kr;Lcom/google/android/q22;)Ljava/lang/Object;", "c", "(Lcom/google/android/hab;FLcom/google/android/q22;)Ljava/lang/Object;", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "", "d", "(Lcom/google/android/hab;Landroidx/compose/foundation/MutatePriority;Lcom/google/android/q22;)Ljava/lang/Object;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ScrollExtensionsKt {
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object a(hab habVar, float f, kr<Float> krVar, q22<? super Float> q22Var) {
        ScrollExtensionsKt$animateScrollBy$1 scrollExtensionsKt$animateScrollBy$1;
        Ref.FloatRef floatRef;
        if (q22Var instanceof ScrollExtensionsKt$animateScrollBy$1) {
            scrollExtensionsKt$animateScrollBy$1 = (ScrollExtensionsKt$animateScrollBy$1) q22Var;
            int i = scrollExtensionsKt$animateScrollBy$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                scrollExtensionsKt$animateScrollBy$1.label = i - t04.INVALID_ID;
            } else {
                scrollExtensionsKt$animateScrollBy$1 = new ScrollExtensionsKt$animateScrollBy$1(q22Var);
            }
        } else {
            scrollExtensionsKt$animateScrollBy$1 = new ScrollExtensionsKt$animateScrollBy$1(q22Var);
        }
        ScrollExtensionsKt$animateScrollBy$1 scrollExtensionsKt$animateScrollBy$2 = scrollExtensionsKt$animateScrollBy$1;
        Object obj = scrollExtensionsKt$animateScrollBy$2.result;
        Object objG = a.g();
        int i2 = scrollExtensionsKt$animateScrollBy$2.label;
        if (i2 == 0) {
            f.b(obj);
            Ref.FloatRef floatRef2 = new Ref.FloatRef();
            ScrollExtensionsKt$animateScrollBy$2 scrollExtensionsKt$animateScrollBy$3 = new ScrollExtensionsKt$animateScrollBy$2(f, krVar, floatRef2, null);
            scrollExtensionsKt$animateScrollBy$2.L$0 = floatRef2;
            scrollExtensionsKt$animateScrollBy$2.label = 1;
            if (hab.e(habVar, null, scrollExtensionsKt$animateScrollBy$3, scrollExtensionsKt$animateScrollBy$2, 1, null) == objG) {
                return objG;
            }
            floatRef = floatRef2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            floatRef = (Ref.FloatRef) scrollExtensionsKt$animateScrollBy$2.L$0;
            f.b(obj);
        }
        return ut0.d(floatRef.element);
    }

    public static /* synthetic */ Object b(hab habVar, float f, kr krVar, q22 q22Var, int i, Object obj) {
        if ((i & 2) != 0) {
            krVar = lr.j(0.0f, 0.0f, null, 7, null);
        }
        return a(habVar, f, krVar, q22Var);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object c(hab habVar, float f, q22<? super Float> q22Var) {
        ScrollExtensionsKt$scrollBy$1 scrollExtensionsKt$scrollBy$1;
        Ref.FloatRef floatRef;
        if (q22Var instanceof ScrollExtensionsKt$scrollBy$1) {
            scrollExtensionsKt$scrollBy$1 = (ScrollExtensionsKt$scrollBy$1) q22Var;
            int i = scrollExtensionsKt$scrollBy$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                scrollExtensionsKt$scrollBy$1.label = i - t04.INVALID_ID;
            } else {
                scrollExtensionsKt$scrollBy$1 = new ScrollExtensionsKt$scrollBy$1(q22Var);
            }
        } else {
            scrollExtensionsKt$scrollBy$1 = new ScrollExtensionsKt$scrollBy$1(q22Var);
        }
        ScrollExtensionsKt$scrollBy$1 scrollExtensionsKt$scrollBy$2 = scrollExtensionsKt$scrollBy$1;
        Object obj = scrollExtensionsKt$scrollBy$2.result;
        Object objG = a.g();
        int i2 = scrollExtensionsKt$scrollBy$2.label;
        if (i2 == 0) {
            f.b(obj);
            Ref.FloatRef floatRef2 = new Ref.FloatRef();
            ScrollExtensionsKt$scrollBy$2 scrollExtensionsKt$scrollBy$3 = new ScrollExtensionsKt$scrollBy$2(floatRef2, f, null);
            scrollExtensionsKt$scrollBy$2.L$0 = floatRef2;
            scrollExtensionsKt$scrollBy$2.label = 1;
            if (hab.e(habVar, null, scrollExtensionsKt$scrollBy$3, scrollExtensionsKt$scrollBy$2, 1, null) == objG) {
                return objG;
            }
            floatRef = floatRef2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            floatRef = (Ref.FloatRef) scrollExtensionsKt$scrollBy$2.L$0;
            f.b(obj);
        }
        return ut0.d(floatRef.element);
    }

    public static final Object d(hab habVar, MutatePriority mutatePriority, q22<? super Unit> q22Var) {
        Object objA = habVar.a(mutatePriority, new ScrollExtensionsKt$stopScroll$2(null), q22Var);
        return objA == a.g() ? objA : Unit.a;
    }

    public static /* synthetic */ Object e(hab habVar, MutatePriority mutatePriority, q22 q22Var, int i, Object obj) {
        if ((i & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return d(habVar, mutatePriority, q22Var);
    }
}
