package com.google.inputmethod;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class cr {
    private static final ThreadLocal<cr> j = new ThreadLocal<>();
    private lq4 e;
    public e i;
    private final qpb<c, Long> a = new qpb<>();
    final ArrayList<c> b = new ArrayList<>();
    private final b c = new b();
    private final Runnable d = new Runnable() { // from class: com.google.android.br
        @Override // java.lang.Runnable
        public final void run() {
            this.a.c.a();
        }
    };
    long f = 0;
    private boolean g = false;
    public float h = 1.0f;

    /* JADX INFO: Access modifiers changed from: private */
    class b {
        private b() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a() {
            cr.this.f = SystemClock.uptimeMillis();
            cr crVar = cr.this;
            crVar.f(crVar.f);
            if (cr.this.b.size() > 0) {
                cr.this.e.a(cr.this.d);
            }
        }
    }

    interface c {
        boolean a(long j);
    }

    public class d implements e {
        ValueAnimator.DurationScaleChangeListener a;

        public d() {
        }

        @Override // com.google.android.cr.e
        public boolean a() {
            boolean zUnregisterDurationScaleChangeListener = ValueAnimator.unregisterDurationScaleChangeListener(this.a);
            this.a = null;
            return zUnregisterDurationScaleChangeListener;
        }

        @Override // com.google.android.cr.e
        public boolean b() {
            if (this.a != null) {
                return true;
            }
            ValueAnimator.DurationScaleChangeListener durationScaleChangeListener = new ValueAnimator.DurationScaleChangeListener() { // from class: com.google.android.fr
                @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                public final void onChanged(float f) {
                    cr.this.h = f;
                }
            };
            this.a = durationScaleChangeListener;
            return ValueAnimator.registerDurationScaleChangeListener(durationScaleChangeListener);
        }
    }

    public interface e {
        boolean a();

        boolean b();
    }

    static final class f implements lq4 {
        private final Choreographer a = Choreographer.getInstance();
        private final Looper b = Looper.myLooper();

        f() {
        }

        @Override // com.google.inputmethod.lq4
        public void a(final Runnable runnable) {
            this.a.postFrameCallback(new Choreographer.FrameCallback() { // from class: com.google.android.gr
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j) {
                    runnable.run();
                }
            });
        }

        @Override // com.google.inputmethod.lq4
        public boolean b() {
            return Thread.currentThread() == this.b.getThread();
        }
    }

    public cr(lq4 lq4Var) {
        this.e = lq4Var;
    }

    private void e() {
        if (this.g) {
            for (int size = this.b.size() - 1; size >= 0; size--) {
                if (this.b.get(size) == null) {
                    this.b.remove(size);
                }
            }
            if (this.b.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                this.i.a();
            }
            this.g = false;
        }
    }

    static cr h() {
        ThreadLocal<cr> threadLocal = j;
        if (threadLocal.get() == null) {
            threadLocal.set(new cr(new f()));
        }
        return threadLocal.get();
    }

    private boolean i(c cVar, long j2) {
        Long l = this.a.get(cVar);
        if (l == null) {
            return true;
        }
        if (l.longValue() >= j2) {
            return false;
        }
        this.a.remove(cVar);
        return true;
    }

    void d(c cVar, long j2) {
        if (this.b.size() == 0) {
            this.e.a(this.d);
            if (Build.VERSION.SDK_INT >= 33) {
                this.h = ValueAnimator.getDurationScale();
                if (this.i == null) {
                    this.i = new d();
                }
                this.i.b();
            }
        }
        if (!this.b.contains(cVar)) {
            this.b.add(cVar);
        }
        if (j2 > 0) {
            this.a.put(cVar, Long.valueOf(SystemClock.uptimeMillis() + j2));
        }
    }

    void f(long j2) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        for (int i = 0; i < this.b.size(); i++) {
            c cVar = this.b.get(i);
            if (cVar != null && i(cVar, jUptimeMillis)) {
                cVar.a(j2);
            }
        }
        e();
    }

    public float g() {
        return this.h;
    }

    boolean j() {
        return this.e.b();
    }

    void k(c cVar) {
        this.a.remove(cVar);
        int iIndexOf = this.b.indexOf(cVar);
        if (iIndexOf >= 0) {
            this.b.set(iIndexOf, null);
            this.g = true;
        }
    }
}
