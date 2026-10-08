package com.google.inputmethod;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class da3 {
    private final Context a;
    private final ea3 b;
    private final b c;
    private final a d;
    private VelocityTracker e;
    private float f;
    private int g;
    private int h;
    private int i;
    private final int[] j;

    interface a {
        float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i);
    }

    interface b {
        void a(Context context, int[] iArr, MotionEvent motionEvent, int i);
    }

    public da3(Context context, ea3 ea3Var) {
        this(context, ea3Var, new b() { // from class: com.google.android.ba3
            @Override // com.google.android.da3.b
            public final void a(Context context2, int[] iArr, MotionEvent motionEvent, int i) {
                da3.c(context2, iArr, motionEvent, i);
            }
        }, new a() { // from class: com.google.android.ca3
            @Override // com.google.android.da3.a
            public final float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i) {
                return da3.f(velocityTracker, motionEvent, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context, int[] iArr, MotionEvent motionEvent, int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        iArr[0] = t7e.g(context, viewConfiguration, motionEvent.getDeviceId(), i, motionEvent.getSource());
        iArr[1] = t7e.f(context, viewConfiguration, motionEvent.getDeviceId(), i, motionEvent.getSource());
    }

    private boolean d(MotionEvent motionEvent, int i) {
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.h == source && this.i == deviceId && this.g == i) {
            return false;
        }
        this.c.a(this.a, this.j, motionEvent, i);
        this.h = source;
        this.i = deviceId;
        this.g = i;
        return true;
    }

    private float e(MotionEvent motionEvent, int i) {
        if (this.e == null) {
            this.e = VelocityTracker.obtain();
        }
        return this.d.a(this.e, motionEvent, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float f(VelocityTracker velocityTracker, MotionEvent motionEvent, int i) {
        x3e.a(velocityTracker, motionEvent);
        x3e.b(velocityTracker, 1000);
        return x3e.d(velocityTracker, i);
    }

    public void g(MotionEvent motionEvent, int i) {
        boolean zD = d(motionEvent, i);
        if (this.j[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.e;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.e = null;
                return;
            }
            return;
        }
        float fE = e(motionEvent, i) * this.b.a();
        float fSignum = Math.signum(fE);
        if (zD || (fSignum != Math.signum(this.f) && fSignum != 0.0f)) {
            this.b.c();
        }
        float fAbs = Math.abs(fE);
        int[] iArr = this.j;
        if (fAbs < iArr[0]) {
            return;
        }
        int i2 = iArr[1];
        float fMax = Math.max(-i2, Math.min(fE, i2));
        this.f = this.b.b(fMax) ? fMax : 0.0f;
    }

    da3(Context context, ea3 ea3Var, b bVar, a aVar) {
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = new int[]{Integer.MAX_VALUE, 0};
        this.a = context;
        this.b = ea3Var;
        this.c = bVar;
        this.d = aVar;
    }
}
