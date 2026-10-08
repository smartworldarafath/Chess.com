package androidx.compose.ui.scrollcapture;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.View;
import androidx.compose.p004runtime.w;
import androidx.compose.ui.semantics.SemanticsNode;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.rw0;
import com.google.android.sh7;
import com.google.android.ta2;
import com.google.inputmethod.cq1;
import com.google.inputmethod.jba;
import com.google.inputmethod.k16;
import com.google.inputmethod.t04;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.j;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001#B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ \u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ5\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00162\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u001bH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010+R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00103\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102¨\u00064"}, d2 = {"Landroidx/compose/ui/scrollcapture/ComposeScrollCaptureCallback;", "Landroid/view/ScrollCaptureCallback;", "Landroidx/compose/ui/semantics/SemanticsNode;", "node", "Lcom/google/android/k16;", "viewportBoundsInWindow", "Lcom/google/android/ta2;", "coroutineScope", "Landroidx/compose/ui/scrollcapture/ComposeScrollCaptureCallback$a;", "listener", "Landroid/view/View;", "composeView", "<init>", "(Landroidx/compose/ui/semantics/SemanticsNode;Lcom/google/android/k16;Lcom/google/android/ta2;Landroidx/compose/ui/scrollcapture/ComposeScrollCaptureCallback$a;Landroid/view/View;)V", "Landroid/view/ScrollCaptureSession;", "session", "captureArea", "e", "(Landroid/view/ScrollCaptureSession;Lcom/google/android/k16;Lcom/google/android/q22;)Ljava/lang/Object;", "Landroid/os/CancellationSignal;", "signal", "Ljava/util/function/Consumer;", "Landroid/graphics/Rect;", "onReady", "", "onScrollCaptureSearch", "(Landroid/os/CancellationSignal;Ljava/util/function/Consumer;)V", "Ljava/lang/Runnable;", "onScrollCaptureStart", "(Landroid/view/ScrollCaptureSession;Landroid/os/CancellationSignal;Ljava/lang/Runnable;)V", "onComplete", "onScrollCaptureImageRequest", "(Landroid/view/ScrollCaptureSession;Landroid/os/CancellationSignal;Landroid/graphics/Rect;Ljava/util/function/Consumer;)V", "onScrollCaptureEnd", "(Ljava/lang/Runnable;)V", "a", "Landroidx/compose/ui/semantics/SemanticsNode;", "b", "Lcom/google/android/k16;", "c", "Landroidx/compose/ui/scrollcapture/ComposeScrollCaptureCallback$a;", "d", "Landroid/view/View;", "Lcom/google/android/ta2;", "Landroidx/compose/ui/scrollcapture/RelativeScroller;", "f", "Landroidx/compose/ui/scrollcapture/RelativeScroller;", "scrollTracker", "", "g", "I", "requestCount", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ComposeScrollCaptureCallback implements ScrollCaptureCallback {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final SemanticsNode node;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final k16 viewportBoundsInWindow;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final a listener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final View composeView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final ta2 coroutineScope;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final RelativeScroller scrollTracker;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int requestCount;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/scrollcapture/ComposeScrollCaptureCallback$a;", "", "", "b", "()V", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface a {
        void a();

        void b();
    }

    /* JADX INFO: renamed from: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureEnd$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
    @lq2(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureEnd$1", f = "ComposeScrollCaptureCallback.android.kt", l = {188}, m = "invokeSuspend", v = 1)
    static final class AnonymousClass1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
        final /* synthetic */ Runnable $onReady;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Runnable runnable, q22<? super AnonymousClass1> q22Var) {
            super(2, q22Var);
            this.$onReady = runnable;
        }

        public final q22<Unit> create(Object obj, q22<?> q22Var) {
            return ComposeScrollCaptureCallback.this.new AnonymousClass1(this.$onReady, q22Var);
        }

        public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
            return create(ta2Var, q22Var).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object objG = kotlin.coroutines.intrinsics.a.g();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                RelativeScroller relativeScroller = ComposeScrollCaptureCallback.this.scrollTracker;
                this.label = 1;
                if (relativeScroller.g(0.0f, this) == objG) {
                    return objG;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
            ComposeScrollCaptureCallback.this.listener.a();
            this.$onReady.run();
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
    @lq2(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1", f = "ComposeScrollCaptureCallback.android.kt", l = {120}, m = "invokeSuspend", v = 1)
    static final class C02191 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
        final /* synthetic */ Rect $captureArea;
        final /* synthetic */ Consumer<Rect> $onComplete;
        final /* synthetic */ ScrollCaptureSession $session;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02191(ScrollCaptureSession scrollCaptureSession, Rect rect, Consumer<Rect> consumer, q22<? super C02191> q22Var) {
            super(2, q22Var);
            this.$session = scrollCaptureSession;
            this.$captureArea = rect;
            this.$onComplete = consumer;
        }

        public final q22<Unit> create(Object obj, q22<?> q22Var) {
            return ComposeScrollCaptureCallback.this.new C02191(this.$session, this.$captureArea, this.$onComplete, q22Var);
        }

        public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
            return create(ta2Var, q22Var).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object objG = kotlin.coroutines.intrinsics.a.g();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                ComposeScrollCaptureCallback composeScrollCaptureCallback = ComposeScrollCaptureCallback.this;
                ScrollCaptureSession scrollCaptureSession = this.$session;
                k16 k16VarD = jba.d(this.$captureArea);
                this.label = 1;
                obj = composeScrollCaptureCallback.e(scrollCaptureSession, k16VarD, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
            this.$onComplete.accept(jba.a((k16) obj));
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$2, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @lq2(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback", f = "ComposeScrollCaptureCallback.android.kt", l = {134, 137}, m = "onScrollCaptureImageRequest", v = 1)
    static final class AnonymousClass2 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass2(q22<? super AnonymousClass2> q22Var) {
            super(q22Var);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= t04.INVALID_ID;
            return ComposeScrollCaptureCallback.this.e(null, null, this);
        }
    }

    public ComposeScrollCaptureCallback(SemanticsNode semanticsNode, k16 k16Var, ta2 ta2Var, a aVar, View view) {
        this.node = semanticsNode;
        this.viewportBoundsInWindow = k16Var;
        this.listener = aVar;
        this.composeView = view;
        this.coroutineScope = j.j(ta2Var, androidx.compose.ui.scrollcapture.a.a);
        this.scrollTracker = new RelativeScroller(k16Var.j(), new ComposeScrollCaptureCallback$scrollTracker$1(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(ScrollCaptureSession scrollCaptureSession, k16 k16Var, q22<? super k16> q22Var) {
        AnonymousClass2 anonymousClass2;
        int top;
        int bottom;
        k16 k16Var2;
        int i;
        ScrollCaptureSession scrollCaptureSession2;
        int i2;
        int iC;
        int iC2;
        k16 k16VarD;
        Canvas canvasLockHardwareCanvas;
        if (q22Var instanceof AnonymousClass2) {
            anonymousClass2 = (AnonymousClass2) q22Var;
            int i3 = anonymousClass2.label;
            if ((i3 & t04.INVALID_ID) != 0) {
                anonymousClass2.label = i3 - t04.INVALID_ID;
            } else {
                anonymousClass2 = new AnonymousClass2(q22Var);
            }
        } else {
            anonymousClass2 = new AnonymousClass2(q22Var);
        }
        Object obj = anonymousClass2.result;
        Object objG = kotlin.coroutines.intrinsics.a.g();
        int i4 = anonymousClass2.label;
        if (i4 == 0) {
            f.b(obj);
            top = k16Var.getTop();
            bottom = k16Var.getBottom();
            RelativeScroller relativeScroller = this.scrollTracker;
            anonymousClass2.L$0 = scrollCaptureSession;
            anonymousClass2.L$1 = k16Var;
            anonymousClass2.I$0 = top;
            anonymousClass2.I$1 = bottom;
            anonymousClass2.label = 1;
            if (relativeScroller.f(top, bottom, anonymousClass2) != objG) {
            }
            return objG;
        }
        if (i4 == 1) {
            int i5 = anonymousClass2.I$1;
            int i6 = anonymousClass2.I$0;
            k16 k16Var3 = (k16) anonymousClass2.L$1;
            ScrollCaptureSession scrollCaptureSessionA = cq1.a(anonymousClass2.L$0);
            f.b(obj);
            top = i6;
            k16Var = k16Var3;
            bottom = i5;
            scrollCaptureSession = scrollCaptureSessionA;
        } else {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = anonymousClass2.I$1;
            i = anonymousClass2.I$0;
            k16 k16Var4 = (k16) anonymousClass2.L$1;
            ScrollCaptureSession scrollCaptureSessionA2 = cq1.a(anonymousClass2.L$0);
            f.b(obj);
            scrollCaptureSession2 = scrollCaptureSessionA2;
            k16Var2 = k16Var4;
        }
        iC = this.scrollTracker.c(i);
        iC2 = this.scrollTracker.c(i2);
        k16VarD = k16.d(k16Var2, 0, iC, 0, iC2, 5, null);
        if (iC == iC2) {
            return k16.INSTANCE.a();
        }
        canvasLockHardwareCanvas = scrollCaptureSession2.getSurface().lockHardwareCanvas();
        try {
            canvasLockHardwareCanvas.save();
            canvasLockHardwareCanvas.translate(-k16VarD.getLeft(), -k16VarD.getTop());
            canvasLockHardwareCanvas.translate(-this.viewportBoundsInWindow.getLeft(), -this.viewportBoundsInWindow.getTop());
            this.composeView.getRootView().draw(canvasLockHardwareCanvas);
            return k16VarD.t(0, sh7.d(this.scrollTracker.getScrollAmount()));
        } finally {
            scrollCaptureSession2.getSurface().unlockCanvasAndPost(canvasLockHardwareCanvas);
        }
        AnonymousClass3 anonymousClass3 = new Function1<Long, Unit>() { // from class: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback.onScrollCaptureImageRequest.3
            public final void invoke(long j) {
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                invoke(((Number) obj2).longValue());
                return Unit.a;
            }
        };
        anonymousClass2.L$0 = scrollCaptureSession;
        anonymousClass2.L$1 = k16Var;
        anonymousClass2.I$0 = top;
        anonymousClass2.I$1 = bottom;
        anonymousClass2.label = 2;
        if (w.c(anonymousClass3, anonymousClass2) != objG) {
            k16Var2 = k16Var;
            i = top;
            scrollCaptureSession2 = scrollCaptureSession;
            i2 = bottom;
            iC = this.scrollTracker.c(i);
            iC2 = this.scrollTracker.c(i2);
            k16VarD = k16.d(k16Var2, 0, iC, 0, iC2, 5, null);
            if (iC == iC2) {
                return k16.INSTANCE.a();
            }
            canvasLockHardwareCanvas = scrollCaptureSession2.getSurface().lockHardwareCanvas();
            canvasLockHardwareCanvas.save();
            canvasLockHardwareCanvas.translate(-k16VarD.getLeft(), -k16VarD.getTop());
            canvasLockHardwareCanvas.translate(-this.viewportBoundsInWindow.getLeft(), -this.viewportBoundsInWindow.getTop());
            this.composeView.getRootView().draw(canvasLockHardwareCanvas);
            return k16VarD.t(0, sh7.d(this.scrollTracker.getScrollAmount()));
        }
        return objG;
    }

    public void onScrollCaptureEnd(Runnable onReady) {
        rw0.d(this.coroutineScope, kotlinx.coroutines.w.b, (CoroutineStart) null, new AnonymousClass1(onReady, null), 2, (Object) null);
    }

    public void onScrollCaptureImageRequest(ScrollCaptureSession session, CancellationSignal signal, Rect captureArea, Consumer<Rect> onComplete) {
        ComposeScrollCaptureCallback_androidKt.c(this.coroutineScope, signal, new C02191(session, captureArea, onComplete, null));
    }

    public void onScrollCaptureSearch(CancellationSignal signal, Consumer<Rect> onReady) {
        onReady.accept(jba.a(this.viewportBoundsInWindow));
    }

    public void onScrollCaptureStart(ScrollCaptureSession session, CancellationSignal signal, Runnable onReady) {
        this.scrollTracker.d();
        this.requestCount = 0;
        this.listener.b();
        onReady.run();
    }
}
