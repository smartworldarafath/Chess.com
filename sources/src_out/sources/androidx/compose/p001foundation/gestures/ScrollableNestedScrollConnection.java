package androidx.compose.p001foundation.gestures;

import com.google.android.q22;
import com.google.inputmethod.i9b;
import com.google.inputmethod.re8;
import com.google.inputmethod.rn8;
import com.google.inputmethod.t04;
import com.google.inputmethod.t3e;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.a;
import kotlin.f;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u0012\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollableNestedScrollConnection;", "Lcom/google/android/re8;", "Lcom/google/android/i9b;", "scrollingLogic", "", "enabled", "<init>", "(Lcom/google/android/i9b;Z)V", "Lcom/google/android/rn8;", "consumed", "available", "Lcom/google/android/we8;", "source", "o0", "(JJI)J", "Lcom/google/android/t3e;", "r1", "(JJLcom/google/android/q22;)Ljava/lang/Object;", "a", "Lcom/google/android/i9b;", "getScrollingLogic", "()Lcom/google/android/i9b;", "b", "Z", "getEnabled", "()Z", "(Z)V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScrollableNestedScrollConnection implements re8 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final i9b scrollingLogic;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean enabled;

    public ScrollableNestedScrollConnection(i9b i9bVar, boolean z) {
        this.scrollingLogic = i9bVar;
        this.enabled = z;
    }

    public final void a(boolean z) {
        this.enabled = z;
    }

    @Override // com.google.inputmethod.re8
    public long o0(long consumed, long available, int source) {
        return this.enabled ? this.scrollingLogic.c(available) : rn8.INSTANCE.c();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.google.inputmethod.re8
    public Object r1(long j, long j2, q22<? super t3e> q22Var) {
        ScrollableNestedScrollConnection$onPostFling$1 scrollableNestedScrollConnection$onPostFling$1;
        long jA;
        long jA2;
        if (q22Var instanceof ScrollableNestedScrollConnection$onPostFling$1) {
            scrollableNestedScrollConnection$onPostFling$1 = (ScrollableNestedScrollConnection$onPostFling$1) q22Var;
            int i = scrollableNestedScrollConnection$onPostFling$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                scrollableNestedScrollConnection$onPostFling$1.label = i - t04.INVALID_ID;
            } else {
                scrollableNestedScrollConnection$onPostFling$1 = new ScrollableNestedScrollConnection$onPostFling$1(this, q22Var);
            }
        } else {
            scrollableNestedScrollConnection$onPostFling$1 = new ScrollableNestedScrollConnection$onPostFling$1(this, q22Var);
        }
        Object objA = scrollableNestedScrollConnection$onPostFling$1.result;
        Object objG = a.g();
        int i2 = scrollableNestedScrollConnection$onPostFling$1.label;
        if (i2 == 0) {
            f.b(objA);
            if (this.enabled) {
                if (this.scrollingLogic.b()) {
                    jA2 = t3e.INSTANCE.a();
                } else {
                    i9b i9bVar = this.scrollingLogic;
                    scrollableNestedScrollConnection$onPostFling$1.J$0 = j2;
                    scrollableNestedScrollConnection$onPostFling$1.label = 1;
                    objA = i9bVar.a(j2, scrollableNestedScrollConnection$onPostFling$1);
                    if (objA == objG) {
                        return objG;
                    }
                }
                jA = t3e.k(j2, jA2);
            } else {
                jA = t3e.INSTANCE.a();
            }
            return t3e.b(jA);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j2 = scrollableNestedScrollConnection$onPostFling$1.J$0;
        f.b(objA);
        jA2 = ((t3e) objA).getPackedValue();
        jA = t3e.k(j2, jA2);
        return t3e.b(jA);
    }
}
