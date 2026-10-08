package androidx.compose.p001foundation.pager;

import com.google.android.q22;
import com.google.android.sh7;
import com.google.android.ut0;
import com.google.inputmethod.omc;
import com.google.inputmethod.p9b;
import com.google.inputmethod.qg4;
import com.google.inputmethod.t04;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.f;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u000b\u001a\u00020\t*\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/pager/PagerWrapperFlingBehavior;", "Lcom/google/android/qg4;", "Lcom/google/android/omc;", "originalFlingBehavior", "Landroidx/compose/foundation/pager/PagerState;", "pagerState", "<init>", "(Lcom/google/android/omc;Landroidx/compose/foundation/pager/PagerState;)V", "Lcom/google/android/p9b;", "", "initialVelocity", "a", "(Lcom/google/android/p9b;FLcom/google/android/q22;)Ljava/lang/Object;", "Lcom/google/android/omc;", "getOriginalFlingBehavior", "()Lcom/google/android/omc;", "b", "Landroidx/compose/foundation/pager/PagerState;", "getPagerState", "()Landroidx/compose/foundation/pager/PagerState;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class PagerWrapperFlingBehavior implements qg4 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final omc originalFlingBehavior;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final PagerState pagerState;

    public PagerWrapperFlingBehavior(omc omcVar, PagerState pagerState) {
        this.originalFlingBehavior = omcVar;
        this.pagerState = pagerState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(PagerWrapperFlingBehavior pagerWrapperFlingBehavior, p9b p9bVar, float f) {
        pagerWrapperFlingBehavior.pagerState.B0(p9bVar, sh7.d(pagerWrapperFlingBehavior.pagerState.Q() != 0 ? f / pagerWrapperFlingBehavior.pagerState.Q() : 0.0f) + pagerWrapperFlingBehavior.pagerState.A());
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.google.inputmethod.qg4
    public Object a(final p9b p9bVar, float f, q22<? super Float> q22Var) {
        PagerWrapperFlingBehavior$performFling$1 pagerWrapperFlingBehavior$performFling$1;
        if (q22Var instanceof PagerWrapperFlingBehavior$performFling$1) {
            pagerWrapperFlingBehavior$performFling$1 = (PagerWrapperFlingBehavior$performFling$1) q22Var;
            int i = pagerWrapperFlingBehavior$performFling$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                pagerWrapperFlingBehavior$performFling$1.label = i - t04.INVALID_ID;
            } else {
                pagerWrapperFlingBehavior$performFling$1 = new PagerWrapperFlingBehavior$performFling$1(this, q22Var);
            }
        } else {
            pagerWrapperFlingBehavior$performFling$1 = new PagerWrapperFlingBehavior$performFling$1(this, q22Var);
        }
        Object objB = pagerWrapperFlingBehavior$performFling$1.result;
        Object objG = a.g();
        int i2 = pagerWrapperFlingBehavior$performFling$1.label;
        if (i2 == 0) {
            f.b(objB);
            omc omcVar = this.originalFlingBehavior;
            Function1<? super Float, Unit> function1 = new Function1() { // from class: androidx.compose.foundation.pager.k
                public final Object invoke(Object obj) {
                    return PagerWrapperFlingBehavior.f(this.a, p9bVar, ((Float) obj).floatValue());
                }
            };
            pagerWrapperFlingBehavior$performFling$1.label = 1;
            objB = omcVar.b(p9bVar, f, function1, pagerWrapperFlingBehavior$performFling$1);
            if (objB == objG) {
                return objG;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(objB);
        }
        float fFloatValue = ((Number) objB).floatValue();
        if (this.pagerState.B() != 0.0f && Math.abs(this.pagerState.B()) < 0.001d) {
            PagerState pagerState = this.pagerState;
            PagerState.k0(pagerState, pagerState.A(), 0.0f, 2, null);
        } else {
            ut0.d(this.pagerState.B());
        }
        return ut0.d(fFloatValue);
    }
}
