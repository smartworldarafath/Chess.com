package androidx.compose.ui.layout;

import com.google.android.rw0;
import com.google.inputmethod.ar8;
import com.google.inputmethod.gn6;
import com.google.inputmethod.ltd;
import com.google.inputmethod.nea;
import com.google.inputmethod.on8;
import com.google.inputmethod.x23;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b'\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B5\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0016J\r\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u0016J\r\u0010\u001a\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u0016J\u000f\u0010\u001b\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001b\u0010\u0016J\u000f\u0010\u001c\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001c\u0010\u0016J\u000f\u0010\u001d\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u0016J\u000f\u0010\u001e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001e\u0010\u0016R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R.\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00108\u001a\u0004\u0018\u0001018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R$\u0010@\u001a\u0004\u0018\u0001098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010G\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010K\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010B\u001a\u0004\bI\u0010D\"\u0004\bJ\u0010FR$\u0010R\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR$\u0010V\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010M\u001a\u0004\bT\u0010O\"\u0004\bU\u0010QR#\u0010Y\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\n8\u0006¢\u0006\f\n\u0004\bW\u0010,\u001a\u0004\bX\u0010.R.\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010Z\u001a\u0004\u0018\u00010\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_¨\u0006`"}, d2 = {"Landroidx/compose/ui/layout/OnVisibilityChangedNode;", "Landroidx/compose/ui/b$c;", "Lcom/google/android/on8;", "Lcom/google/android/ltd;", "", "minDurationMs", "", "minFractionVisible", "Lcom/google/android/gn6;", "viewportBounds", "Lkotlin/Function1;", "", "", "callback", "<init>", "(JFLcom/google/android/gn6;Lkotlin/jvm/functions/Function1;)V", "Lcom/google/android/nea;", "bounds", "viewport", "m3", "(FLcom/google/android/nea;Lcom/google/android/nea;)V", "y3", "()V", "o3", "n3", "X2", "z3", "V2", "W2", "M1", "H2", "p", "J", "q3", "()J", "v3", "(J)V", "q", "F", "r3", "()F", "w3", "(F)V", "r", "Lkotlin/jvm/functions/Function1;", "getCallback", "()Lkotlin/jvm/functions/Function1;", "t3", "(Lkotlin/jvm/functions/Function1;)V", "Lcom/google/android/x23$a;", "s", "Lcom/google/android/x23$a;", "getHandle", "()Lcom/google/android/x23$a;", "setHandle", "(Lcom/google/android/x23$a;)V", "handle", "Lkotlinx/coroutines/s;", "t", "Lkotlinx/coroutines/s;", "getJob", "()Lkotlinx/coroutines/s;", "setJob", "(Lkotlinx/coroutines/s;)V", "job", "u", "Z", "getLastResult", "()Z", "setLastResult", "(Z)V", "lastResult", "v", "getLastReportedResult", "setLastReportedResult", "lastReportedResult", "w", "Lcom/google/android/nea;", "getLastBounds", "()Lcom/google/android/nea;", "setLastBounds", "(Lcom/google/android/nea;)V", "lastBounds", "x", "p3", "u3", "lastViewport", "y", "getRectChanged", "rectChanged", "value", "Lcom/google/android/gn6;", "s3", "()Lcom/google/android/gn6;", "x3", "(Lcom/google/android/gn6;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OnVisibilityChangedNode extends androidx.compose.ui.b.c implements on8, ltd {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private long minDurationMs;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private float minFractionVisible;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private Function1<? super Boolean, Unit> callback;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private x23.a handle;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private kotlinx.coroutines.s job;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private boolean lastResult;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private boolean lastReportedResult;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private nea lastBounds;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private nea lastViewport;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final Function1<nea, Unit> rectChanged = new Function1<nea, Unit>() { // from class: androidx.compose.ui.layout.OnVisibilityChangedNode$rectChanged$1
        {
            super(1);
        }

        public final void a(nea neaVar) {
            OnVisibilityChangedNode onVisibilityChangedNode = this.this$0;
            onVisibilityChangedNode.s3();
            onVisibilityChangedNode.u3(null);
            OnVisibilityChangedNode onVisibilityChangedNode2 = this.this$0;
            onVisibilityChangedNode2.m3(onVisibilityChangedNode2.getMinFractionVisible(), neaVar, this.this$0.getLastViewport());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((nea) obj);
            return Unit.a;
        }
    };

    public OnVisibilityChangedNode(long j, float f, gn6 gn6Var, Function1<? super Boolean, Unit> function1) {
        this.minDurationMs = j;
        this.minFractionVisible = f;
        this.callback = function1;
    }

    @Override // com.google.inputmethod.ltd
    public void H2() {
        n3();
    }

    @Override // com.google.inputmethod.on8
    public void M1() {
        z3();
    }

    @Override // androidx.compose.ui.b.c
    public void V2() {
        x23.a aVar = this.handle;
        if (aVar != null) {
            aVar.a();
        }
        this.handle = ar8.a(this, 0L, 0L, this.rectChanged);
        z3();
    }

    @Override // androidx.compose.ui.b.c
    public void W2() {
        x23.a aVar = this.handle;
        if (aVar != null) {
            aVar.a();
        }
        n3();
    }

    @Override // androidx.compose.ui.b.c
    public void X2() {
        n3();
        kotlinx.coroutines.s sVar = this.job;
        if (sVar != null) {
            kotlinx.coroutines.s.a.a(sVar, (CancellationException) null, 1, (Object) null);
        }
        this.job = null;
        this.lastResult = false;
        this.lastBounds = null;
        this.lastViewport = null;
    }

    public final void m3(float minFractionVisible, nea bounds, nea viewport) {
        this.lastBounds = bounds;
        float fA = viewport != null ? bounds.a(viewport) : bounds.c();
        boolean z = fA > minFractionVisible || fA == 1.0f;
        if (z != this.lastResult) {
            this.lastResult = z;
            kotlinx.coroutines.s sVar = this.job;
            if (sVar != null) {
                kotlinx.coroutines.s.a.a(sVar, (CancellationException) null, 1, (Object) null);
            }
            this.job = null;
            if (z != this.lastReportedResult) {
                if (!z || this.minDurationMs <= 0) {
                    y3();
                } else {
                    this.job = rw0.d(L2(), (CoroutineContext) null, (CoroutineStart) null, new OnVisibilityChangedNode$checkVisibility$1(this, null), 3, (Object) null);
                }
            }
        }
    }

    public final void n3() {
        kotlinx.coroutines.s sVar = this.job;
        if (sVar != null) {
            kotlinx.coroutines.s.a.a(sVar, (CancellationException) null, 1, (Object) null);
        }
        this.job = null;
        this.lastResult = false;
        if (this.lastReportedResult) {
            y3();
        }
    }

    public final void o3() {
        nea neaVar = this.lastBounds;
        if (neaVar != null) {
            m3(this.minFractionVisible, neaVar, this.lastViewport);
        }
    }

    /* JADX INFO: renamed from: p3, reason: from getter */
    public final nea getLastViewport() {
        return this.lastViewport;
    }

    /* JADX INFO: renamed from: q3, reason: from getter */
    public final long getMinDurationMs() {
        return this.minDurationMs;
    }

    /* JADX INFO: renamed from: r3, reason: from getter */
    public final float getMinFractionVisible() {
        return this.minFractionVisible;
    }

    public final gn6 s3() {
        return null;
    }

    public final void t3(Function1<? super Boolean, Unit> function1) {
        this.callback = function1;
    }

    public final void u3(nea neaVar) {
        this.lastViewport = neaVar;
    }

    public final void v3(long j) {
        this.minDurationMs = j;
    }

    public final void w3(float f) {
        this.minFractionVisible = f;
    }

    public final void x3(gn6 gn6Var) {
        z3();
    }

    public final void y3() {
        kotlinx.coroutines.s sVar = this.job;
        if (sVar != null) {
            kotlinx.coroutines.s.a.a(sVar, (CancellationException) null, 1, (Object) null);
        }
        this.job = null;
        this.callback.invoke(Boolean.valueOf(this.lastResult));
        this.lastReportedResult = this.lastResult;
    }

    public final void z3() {
        if (this.lastViewport != null) {
            this.lastViewport = null;
            o3();
        }
    }
}
