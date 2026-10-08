package com.google.inputmethod;

import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u000b2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002\u0019\u001dB\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\tJ\u0017\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\tR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010!R\u0016\u0010$\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010#R\u001c\u0010)\u001a\n &*\u0004\u0018\u00010%0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010/\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010#R\u0016\u00102\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101¨\u00063"}, d2 = {"Lcom/google/android/um;", "Lcom/google/android/fl9;", "Lcom/google/android/bn9;", "Landroid/view/View$OnAttachStateChangeListener;", "Ljava/lang/Runnable;", "Landroid/view/Choreographer$FrameCallback;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "", "h", "()Z", "", "i", "()V", "run", "", "frameTimeNanos", "doFrame", "(J)V", "Lcom/google/android/dl9;", "prefetchRequest", "c", "(Lcom/google/android/dl9;)V", "b", "v", "onViewAttachedToWindow", "onViewDetachedFromWindow", "a", "Landroid/view/View;", "Ljava/util/PriorityQueue;", "Lcom/google/android/fn9;", "Ljava/util/PriorityQueue;", "prefetchRequests", "Z", "prefetchScheduled", "Landroid/view/Choreographer;", "kotlin.jvm.PlatformType", "d", "Landroid/view/Choreographer;", "choreographer", "Lcom/google/android/um$b;", "e", "Lcom/google/android/um$b;", "scope", "f", "isActive", "g", "J", "frameStartTimeNanos", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class um implements fl9, bn9, View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int i = 8;
    private static long j;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final View view;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean prefetchScheduled;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean isActive;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private long frameStartTimeNanos;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final PriorityQueue<fn9> prefetchRequests = new PriorityQueue<>(11, new Comparator() { // from class: com.google.android.tm
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return um.g((fn9) obj, (fn9) obj2);
        }
    });

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Choreographer choreographer = Choreographer.getInstance();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final b scope = new b();

    /* JADX INFO: renamed from: com.google.android.um$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/google/android/um$a;", "", "<init>", "()V", "Landroid/view/View;", "view", "", "b", "(Landroid/view/View;)V", "", "frameIntervalNs", "J", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0021  */
        public final void b(View view) {
            float refreshRate;
            if (um.j == 0) {
                Display display = view.getDisplay();
                if (view.isInEditMode() || display == null) {
                    refreshRate = 60.0f;
                } else {
                    refreshRate = display.getRefreshRate();
                    if (refreshRate < 30.0f) {
                        refreshRate = 60.0f;
                    }
                }
                um.j = (long) (1000000000 / refreshRate);
            }
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\r\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/google/android/um$b;", "Lcom/google/android/el9;", "<init>", "()V", "", "a", "()J", "", "Z", "b", "()Z", "c", "(Z)V", "isFrameIdle", "J", "getNextFrameTimeNs", "d", "(J)V", "nextFrameTimeNs", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements el9 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private boolean isFrameIdle;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private long nextFrameTimeNs;

        @Override // com.google.inputmethod.el9
        public long a() {
            if (this.isFrameIdle) {
                return Long.MAX_VALUE;
            }
            return Math.max(0L, this.nextFrameTimeNs - System.nanoTime());
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsFrameIdle() {
            return this.isFrameIdle;
        }

        public final void c(boolean z) {
            this.isFrameIdle = z;
        }

        public final void d(long j) {
            this.nextFrameTimeNs = j;
        }
    }

    public um(View view) {
        this.view = view;
        INSTANCE.b(view);
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            onViewAttachedToWindow(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int g(fn9 fn9Var, fn9 fn9Var2) {
        return Intrinsics.i(fn9Var2.getPriority(), fn9Var.getPriority());
    }

    private final boolean h() {
        long jA = this.scope.a();
        uo.a("compose:lazy:prefetch:available_time_nanos", jA);
        boolean z = true;
        if (jA > 0) {
            fn9 fn9VarPeek = this.prefetchRequests.peek();
            Intrinsics.g(fn9VarPeek);
            if (!fn9VarPeek.getRequest().a(this.scope)) {
                this.prefetchRequests.poll();
                z = false;
            }
            this.scope.c(false);
        }
        return z;
    }

    private final void i() {
        if (this.prefetchScheduled) {
            return;
        }
        this.prefetchScheduled = true;
        this.view.post(this);
    }

    @Override // com.google.inputmethod.bn9
    public void b(dl9 prefetchRequest) {
        this.prefetchRequests.add(new fn9(fn9.INSTANCE.a(), prefetchRequest));
        i();
    }

    @Override // com.google.inputmethod.bn9
    public void c(dl9 prefetchRequest) {
        this.prefetchRequests.add(new fn9(fn9.INSTANCE.b(), prefetchRequest));
        i();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long frameTimeNanos) {
        if (this.isActive) {
            this.frameStartTimeNanos = frameTimeNanos;
            this.view.post(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View v) {
        this.isActive = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v) {
        this.isActive = false;
        this.view.removeCallbacks(this);
        this.choreographer.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.prefetchRequests.isEmpty() || !this.prefetchScheduled || !this.isActive || this.view.getWindowVisibility() != 0) {
            this.prefetchScheduled = false;
            return;
        }
        long nanos = TimeUnit.MILLISECONDS.toNanos(this.view.getDrawingTime());
        this.scope.c(System.nanoTime() > (((long) 2) * j) + nanos);
        this.scope.d(Math.max(this.frameStartTimeNanos, nanos) + j);
        boolean zH = false;
        while (!this.prefetchRequests.isEmpty() && !zH) {
            if (this.scope.getIsFrameIdle()) {
                Trace.beginSection("compose:lazy:prefetch:idle_frame");
                try {
                    zH = h();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } else {
                zH = h();
            }
        }
        if (zH) {
            this.choreographer.postFrameCallback(this);
        } else {
            this.prefetchScheduled = false;
        }
        uo.a("compose:lazy:prefetch:available_time_nanos", 0L);
    }
}
