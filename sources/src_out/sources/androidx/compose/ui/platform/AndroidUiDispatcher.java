package androidx.compose.ui.platform;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.google.android.fc3;
import com.google.android.pa2;
import com.google.android.rw0;
import com.google.inputmethod.h45;
import com.google.inputmethod.wo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000m\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b*\u00016\b\u0007\u0018\u0000 @2\u00020\u0001:\u0001AB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0016\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\b0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00120*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001c\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00120*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010,R\u0016\u00103\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00105\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00102R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0017\u0010?\u001a\u00020:8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>¨\u0006B"}, d2 = {"Landroidx/compose/ui/platform/AndroidUiDispatcher;", "Lcom/google/android/pa2;", "Landroid/view/Choreographer;", "choreographer", "Landroid/os/Handler;", "handler", "<init>", "(Landroid/view/Choreographer;Landroid/os/Handler;)V", "Ljava/lang/Runnable;", "L1", "()Ljava/lang/Runnable;", "", "O1", "()V", "", "frameTimeNanos", "M1", "(J)V", "Landroid/view/Choreographer$FrameCallback;", "callback", "P1", "(Landroid/view/Choreographer$FrameCallback;)V", "R1", "Lkotlin/coroutines/CoroutineContext;", "context", "block", "U", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "c", "Landroid/view/Choreographer;", "o1", "()Landroid/view/Choreographer;", "d", "Landroid/os/Handler;", "", "e", "Ljava/lang/Object;", "lock", "Lkotlin/collections/e;", "f", "Lkotlin/collections/e;", "toRunTrampolined", "", "g", "Ljava/util/List;", "toRunOnFrame", "h", "spareToRunOnFrame", "", "i", "Z", "scheduledTrampolineDispatch", "j", "scheduledFrameDispatch", "androidx/compose/ui/platform/AndroidUiDispatcher$c", "k", "Landroidx/compose/ui/platform/AndroidUiDispatcher$c;", "dispatchCallback", "Landroidx/compose/runtime/v;", "l", "Landroidx/compose/runtime/v;", "v1", "()Landroidx/compose/runtime/v;", "frameClock", "m", "b", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AndroidUiDispatcher extends pa2 {

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int n = 8;
    private static final Lazy<CoroutineContext> o = kotlin.c.b(new Function0<CoroutineContext>() { // from class: androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CoroutineContext invoke() {
            AndroidUiDispatcher androidUiDispatcher = new AndroidUiDispatcher(wo.b() ? Choreographer.getInstance() : (Choreographer) rw0.e(fc3.c(), new AndroidUiDispatcher$Companion$Main$2$dispatcher$1(null)), h45.a(Looper.getMainLooper()), null);
            return androidUiDispatcher.plus(androidUiDispatcher.getFrameClock());
        }
    });
    private static final ThreadLocal<CoroutineContext> p = new a();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Choreographer choreographer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Handler handler;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Object lock;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final kotlin.collections.e<Runnable> toRunTrampolined;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private List<Choreographer.FrameCallback> toRunOnFrame;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private List<Choreographer.FrameCallback> spareToRunOnFrame;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private boolean scheduledTrampolineDispatch;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private boolean scheduledFrameDispatch;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final c dispatchCallback;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final androidx.compose.p004runtime.v frameClock;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/platform/AndroidUiDispatcher$a", "Ljava/lang/ThreadLocal;", "Lkotlin/coroutines/CoroutineContext;", "a", "()Lkotlin/coroutines/CoroutineContext;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends ThreadLocal<CoroutineContext> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CoroutineContext initialValue() {
            Choreographer choreographer = Choreographer.getInstance();
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                throw new IllegalStateException("no Looper on this thread");
            }
            AndroidUiDispatcher androidUiDispatcher = new AndroidUiDispatcher(choreographer, h45.a(looperMyLooper), null);
            return androidUiDispatcher.plus(androidUiDispatcher.getFrameClock());
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidUiDispatcher$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u000b\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/platform/AndroidUiDispatcher$b;", "", "<init>", "()V", "Lkotlin/coroutines/CoroutineContext;", "Main$delegate", "Lkotlin/Lazy;", "b", "()Lkotlin/coroutines/CoroutineContext;", "Main", "a", "CurrentThread", "Ljava/lang/ThreadLocal;", "currentThread", "Ljava/lang/ThreadLocal;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CoroutineContext a() {
            if (wo.b()) {
                return b();
            }
            CoroutineContext coroutineContext = (CoroutineContext) AndroidUiDispatcher.p.get();
            if (coroutineContext != null) {
                return coroutineContext;
            }
            throw new IllegalStateException("no AndroidUiDispatcher for this thread");
        }

        public final CoroutineContext b() {
            return (CoroutineContext) AndroidUiDispatcher.o.getValue();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"androidx/compose/ui/platform/AndroidUiDispatcher$c", "Landroid/view/Choreographer$FrameCallback;", "Ljava/lang/Runnable;", "", "run", "()V", "", "frameTimeNanos", "doFrame", "(J)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements Choreographer.FrameCallback, Runnable {
        c() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long frameTimeNanos) {
            AndroidUiDispatcher.this.handler.removeCallbacks(this);
            AndroidUiDispatcher.this.O1();
            AndroidUiDispatcher.this.M1(frameTimeNanos);
        }

        @Override // java.lang.Runnable
        public void run() {
            AndroidUiDispatcher.this.O1();
            Object obj = AndroidUiDispatcher.this.lock;
            AndroidUiDispatcher androidUiDispatcher = AndroidUiDispatcher.this;
            synchronized (obj) {
                try {
                    if (androidUiDispatcher.toRunOnFrame.isEmpty()) {
                        androidUiDispatcher.getChoreographer().removeFrameCallback(this);
                        androidUiDispatcher.scheduledFrameDispatch = false;
                    }
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public /* synthetic */ AndroidUiDispatcher(Choreographer choreographer, Handler handler, DefaultConstructorMarker defaultConstructorMarker) {
        this(choreographer, handler);
    }

    private final Runnable L1() {
        Runnable runnable;
        synchronized (this.lock) {
            runnable = (Runnable) this.toRunTrampolined.s();
        }
        return runnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M1(long frameTimeNanos) {
        synchronized (this.lock) {
            if (this.scheduledFrameDispatch) {
                this.scheduledFrameDispatch = false;
                List<Choreographer.FrameCallback> list = this.toRunOnFrame;
                this.toRunOnFrame = this.spareToRunOnFrame;
                this.spareToRunOnFrame = list;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    list.get(i).doFrame(frameTimeNanos);
                }
                list.clear();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O1() {
        boolean z;
        do {
            Runnable runnableL1 = L1();
            while (runnableL1 != null) {
                runnableL1.run();
                runnableL1 = L1();
            }
            synchronized (this.lock) {
                if (this.toRunTrampolined.isEmpty()) {
                    z = false;
                    this.scheduledTrampolineDispatch = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    public final void P1(Choreographer.FrameCallback callback) {
        synchronized (this.lock) {
            try {
                this.toRunOnFrame.add(callback);
                if (!this.scheduledFrameDispatch) {
                    this.scheduledFrameDispatch = true;
                    this.choreographer.postFrameCallback(this.dispatchCallback);
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void R1(Choreographer.FrameCallback callback) {
        synchronized (this.lock) {
            this.toRunOnFrame.remove(callback);
        }
    }

    public void U(CoroutineContext context, Runnable block) {
        synchronized (this.lock) {
            try {
                this.toRunTrampolined.addLast(block);
                if (!this.scheduledTrampolineDispatch) {
                    this.scheduledTrampolineDispatch = true;
                    this.handler.post(this.dispatchCallback);
                    if (!this.scheduledFrameDispatch) {
                        this.scheduledFrameDispatch = true;
                        this.choreographer.postFrameCallback(this.dispatchCallback);
                    }
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: o1, reason: from getter */
    public final Choreographer getChoreographer() {
        return this.choreographer;
    }

    /* JADX INFO: renamed from: v1, reason: from getter */
    public final androidx.compose.p004runtime.v getFrameClock() {
        return this.frameClock;
    }

    private AndroidUiDispatcher(Choreographer choreographer, Handler handler) {
        this.choreographer = choreographer;
        this.handler = handler;
        this.lock = new Object();
        this.toRunTrampolined = new kotlin.collections.e<>();
        this.toRunOnFrame = new ArrayList();
        this.spareToRunOnFrame = new ArrayList();
        this.dispatchCallback = new c();
        this.frameClock = new AndroidUiFrameClock(choreographer, this);
    }
}
