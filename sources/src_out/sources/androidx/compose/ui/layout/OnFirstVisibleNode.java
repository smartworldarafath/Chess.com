package androidx.compose.ui.layout;

import com.google.android.rw0;
import com.google.inputmethod.ar8;
import com.google.inputmethod.gn6;
import com.google.inputmethod.nea;
import com.google.inputmethod.on8;
import com.google.inputmethod.x23;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0014J\r\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0014J\r\u0010\u0017\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0014J\r\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0014J\u000f\u0010\u0019\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u0014J\u000f\u0010\u001a\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u0014J\u000f\u0010\u001b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001b\u0010\u0014J\u000f\u0010\u001c\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u0014R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u00106\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u0010>\u001a\u0004\u0018\u0001078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010F\u001a\u00020?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER$\u0010M\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR.\u0010R\u001a\u0004\u0018\u00010\u000e2\b\u0010N\u001a\u0004\u0018\u00010\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010H\u001a\u0004\bP\u0010J\"\u0004\bQ\u0010LR#\u0010X\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0S8\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR.\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010N\u001a\u0004\u0018\u00010\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]¨\u0006^"}, d2 = {"Landroidx/compose/ui/layout/OnFirstVisibleNode;", "Landroidx/compose/ui/b$c;", "Lcom/google/android/on8;", "", "minDurationMs", "", "minFractionVisible", "Lcom/google/android/gn6;", "viewportBounds", "Lkotlin/Function0;", "", "callback", "<init>", "(JFLcom/google/android/gn6;Lkotlin/jvm/functions/Function0;)V", "Lcom/google/android/nea;", "bounds", "viewport", "n3", "(FLcom/google/android/nea;Lcom/google/android/nea;)V", "w3", "()V", "m3", "x3", "o3", "y3", "V2", "X2", "W2", "M1", "p", "J", "getMinDurationMs", "()J", "t3", "(J)V", "q", "F", "q3", "()F", "u3", "(F)V", "r", "Lkotlin/jvm/functions/Function0;", "getCallback", "()Lkotlin/jvm/functions/Function0;", "r3", "(Lkotlin/jvm/functions/Function0;)V", "Lcom/google/android/x23$a;", "s", "Lcom/google/android/x23$a;", "getHandle", "()Lcom/google/android/x23$a;", "setHandle", "(Lcom/google/android/x23$a;)V", "handle", "Lkotlinx/coroutines/s;", "t", "Lkotlinx/coroutines/s;", "getJob", "()Lkotlinx/coroutines/s;", "setJob", "(Lkotlinx/coroutines/s;)V", "job", "", "u", "Z", "getLastResult", "()Z", "setLastResult", "(Z)V", "lastResult", "v", "Lcom/google/android/nea;", "getLastBounds", "()Lcom/google/android/nea;", "setLastBounds", "(Lcom/google/android/nea;)V", "lastBounds", "value", "w", "p3", "s3", "lastViewport", "Lkotlin/Function1;", "x", "Lkotlin/jvm/functions/Function1;", "getRectChanged", "()Lkotlin/jvm/functions/Function1;", "rectChanged", "Lcom/google/android/gn6;", "getViewportBounds", "()Lcom/google/android/gn6;", "v3", "(Lcom/google/android/gn6;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class OnFirstVisibleNode extends androidx.compose.ui.b.c implements on8 {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private long minDurationMs;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private float minFractionVisible;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private Function0<Unit> callback;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private x23.a handle;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private kotlinx.coroutines.s job;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private boolean lastResult;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private nea lastBounds;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private nea lastViewport;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final Function1<nea, Unit> rectChanged = new Function1<nea, Unit>() { // from class: androidx.compose.ui.layout.OnFirstVisibleNode$rectChanged$1
        {
            super(1);
        }

        public final void a(nea neaVar) {
            OnFirstVisibleNode onFirstVisibleNode = this.this$0;
            onFirstVisibleNode.n3(onFirstVisibleNode.getMinFractionVisible(), neaVar, this.this$0.getLastViewport());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((nea) obj);
            return Unit.a;
        }
    };

    public OnFirstVisibleNode(long j, float f, gn6 gn6Var, Function0<Unit> function0) {
        this.minDurationMs = j;
        this.minFractionVisible = f;
        this.callback = function0;
    }

    @Override // com.google.inputmethod.on8
    public void M1() {
        y3();
    }

    @Override // androidx.compose.ui.b.c
    public void V2() {
        x23.a aVar = this.handle;
        if (aVar != null) {
            aVar.a();
        }
        y3();
        this.handle = ar8.a(this, 0L, 0L, this.rectChanged);
    }

    @Override // androidx.compose.ui.b.c
    public void W2() {
        x23.a aVar = this.handle;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // androidx.compose.ui.b.c
    public void X2() {
        kotlinx.coroutines.s sVar = this.job;
        if (sVar != null) {
            kotlinx.coroutines.s.a.a(sVar, (CancellationException) null, 1, (Object) null);
        }
        this.job = null;
        this.lastResult = false;
        this.lastBounds = null;
        s3(null);
    }

    public final void m3() {
        kotlinx.coroutines.s sVar = this.job;
        if (sVar != null) {
            kotlinx.coroutines.s.a.a(sVar, (CancellationException) null, 1, (Object) null);
        }
    }

    public final void n3(float minFractionVisible, nea bounds, nea viewport) {
        this.lastBounds = bounds;
        float fA = viewport != null ? bounds.a(viewport) : bounds.c();
        boolean z = fA > minFractionVisible || fA == 1.0f;
        if (z && !this.lastResult) {
            w3();
        } else if (!z && this.lastResult) {
            m3();
        }
        this.lastResult = z;
    }

    public final void o3() {
        nea neaVar = this.lastBounds;
        if (neaVar != null) {
            n3(this.minFractionVisible, neaVar, this.lastViewport);
        }
    }

    /* JADX INFO: renamed from: p3, reason: from getter */
    public final nea getLastViewport() {
        return this.lastViewport;
    }

    /* JADX INFO: renamed from: q3, reason: from getter */
    public final float getMinFractionVisible() {
        return this.minFractionVisible;
    }

    public final void r3(Function0<Unit> function0) {
        this.callback = function0;
    }

    public final void s3(nea neaVar) {
        if (Intrinsics.e(this.lastViewport, neaVar)) {
            return;
        }
        this.lastViewport = neaVar;
        o3();
    }

    public final void t3(long j) {
        this.minDurationMs = j;
    }

    public final void u3(float f) {
        this.minFractionVisible = f;
    }

    public final void v3(gn6 gn6Var) {
        y3();
    }

    public final void w3() {
        long j = this.minDurationMs;
        if (j == 0) {
            x3();
            return;
        }
        kotlinx.coroutines.s sVar = this.job;
        if (sVar != null) {
            kotlinx.coroutines.s.a.a(sVar, (CancellationException) null, 1, (Object) null);
        }
        this.job = rw0.d(L2(), (CoroutineContext) null, (CoroutineStart) null, new OnFirstVisibleNode$startTimer$1(j, this, null), 3, (Object) null);
    }

    public final void x3() {
        x23.a aVar = this.handle;
        if (aVar != null) {
            aVar.a();
        }
        kotlinx.coroutines.s sVar = this.job;
        if (sVar != null) {
            kotlinx.coroutines.s.a.a(sVar, (CancellationException) null, 1, (Object) null);
        }
        this.callback.invoke();
    }

    public final void y3() {
        s3(null);
    }
}
