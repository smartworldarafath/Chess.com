package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.inputmethod.bf8;
import com.google.inputmethod.d7c;
import com.google.inputmethod.e73;
import com.google.inputmethod.f9c;
import com.google.inputmethod.fc5;
import com.google.inputmethod.gc5;
import com.google.inputmethod.hq2;
import com.google.inputmethod.ki6;
import com.google.inputmethod.qae;
import com.google.inputmethod.v0a;
import com.google.inputmethod.wz7;
import com.google.inputmethod.xz7;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class MotionLayout extends ConstraintLayout implements bf8 {
    public static boolean d1;
    Interpolator A;
    protected boolean A0;
    Interpolator B;
    int B0;
    float C;
    int C0;
    private int D;
    int D0;
    int E;
    int E0;
    private int F;
    int F0;
    private int G;
    int G0;
    private int H;
    float H0;
    private boolean I;
    private ki6 I0;
    HashMap<View, j> J;
    private boolean J0;
    private long K;
    private h K0;
    private float L;
    private Runnable L0;
    float M;
    private int[] M0;
    float N;
    int N0;
    private long O;
    private boolean O0;
    float P;
    int P0;
    private boolean Q;
    HashMap<View, qae> Q0;
    boolean R;
    private int R0;
    boolean S;
    private int S0;
    private i T;
    private int T0;
    private float U;
    Rect U0;
    private float V;
    private boolean V0;
    int W;
    TransitionState W0;
    e X0;
    private boolean Y0;
    private RectF Z0;
    d a0;
    private View a1;
    private boolean b0;
    private Matrix b1;
    private f9c c0;
    ArrayList<Integer> c1;
    private c d0;
    private e73 e0;
    boolean f0;
    int g0;
    int h0;
    int i0;
    int j0;
    boolean k0;
    float l0;
    float m0;
    long n0;
    float o0;
    private boolean p0;
    private ArrayList<wz7> q0;
    private ArrayList<wz7> r0;
    private ArrayList<wz7> s0;
    private CopyOnWriteArrayList<i> t0;
    private int u0;
    private long v0;
    private float w0;
    private int x0;
    private float y0;
    l z;
    boolean z0;

    enum TransitionState {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    class a implements Runnable {
        final /* synthetic */ View a;

        a(View view) {
            this.a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.setNestedScrollingEnabled(true);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MotionLayout.this.K0.a();
        }
    }

    class c extends xz7 {
        float a = 0.0f;
        float b = 0.0f;
        float c;

        c() {
        }

        @Override // com.google.inputmethod.xz7
        public float a() {
            return MotionLayout.this.C;
        }

        public void b(float f, float f2, float f3) {
            this.a = f;
            this.b = f2;
            this.c = f3;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2;
            float f3;
            float f4 = this.a;
            if (f4 > 0.0f) {
                float f5 = this.c;
                if (f4 / f5 < f) {
                    f = f4 / f5;
                }
                MotionLayout.this.C = f4 - (f5 * f);
                f2 = (f4 * f) - (((f5 * f) * f) / 2.0f);
                f3 = this.b;
            } else {
                float f6 = this.c;
                if ((-f4) / f6 < f) {
                    f = (-f4) / f6;
                }
                MotionLayout.this.C = (f6 * f) + f4;
                f2 = (f4 * f) + (((f6 * f) * f) / 2.0f);
                f3 = this.b;
            }
            return f2 + f3;
        }
    }

    private class d {
        float[] a;
        int[] b;
        float[] c;
        Path d;
        Paint e;
        Paint f;
        Paint g;
        Paint h;
        Paint i;
        private float[] j;
        DashPathEffect p;
        int q;
        int t;
        final int k = -21965;
        final int l = -2067046;
        final int m = -13391360;
        final int n = 1996488704;
        final int o = 10;
        Rect r = new Rect();
        boolean s = false;

        d() {
            this.t = 1;
            Paint paint = new Paint();
            this.e = paint;
            paint.setAntiAlias(true);
            this.e.setColor(-21965);
            this.e.setStrokeWidth(2.0f);
            Paint paint2 = this.e;
            Paint.Style style = Paint.Style.STROKE;
            paint2.setStyle(style);
            Paint paint3 = new Paint();
            this.f = paint3;
            paint3.setAntiAlias(true);
            this.f.setColor(-2067046);
            this.f.setStrokeWidth(2.0f);
            this.f.setStyle(style);
            Paint paint4 = new Paint();
            this.g = paint4;
            paint4.setAntiAlias(true);
            this.g.setColor(-13391360);
            this.g.setStrokeWidth(2.0f);
            this.g.setStyle(style);
            Paint paint5 = new Paint();
            this.h = paint5;
            paint5.setAntiAlias(true);
            this.h.setColor(-13391360);
            this.h.setTextSize(MotionLayout.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.j = new float[8];
            Paint paint6 = new Paint();
            this.i = paint6;
            paint6.setAntiAlias(true);
            DashPathEffect dashPathEffect = new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
            this.p = dashPathEffect;
            this.g.setPathEffect(dashPathEffect);
            this.c = new float[100];
            this.b = new int[50];
            if (this.s) {
                this.e.setStrokeWidth(8.0f);
                this.i.setStrokeWidth(8.0f);
                this.f.setStrokeWidth(8.0f);
                this.t = 4;
            }
        }

        private void c(Canvas canvas) {
            canvas.drawLines(this.a, this.e);
        }

        private void d(Canvas canvas) {
            boolean z = false;
            boolean z2 = false;
            for (int i = 0; i < this.q; i++) {
                int i2 = this.b[i];
                if (i2 == 1) {
                    z = true;
                }
                if (i2 == 0) {
                    z2 = true;
                }
            }
            if (z) {
                g(canvas);
            }
            if (z2) {
                e(canvas);
            }
        }

        private void e(Canvas canvas) {
            float[] fArr = this.a;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[fArr.length - 2];
            float f4 = fArr[fArr.length - 1];
            canvas.drawLine(Math.min(f, f3), Math.max(f2, f4), Math.max(f, f3), Math.max(f2, f4), this.g);
            canvas.drawLine(Math.min(f, f3), Math.min(f2, f4), Math.min(f, f3), Math.max(f2, f4), this.g);
        }

        private void f(Canvas canvas, float f, float f2) {
            float[] fArr = this.a;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float fMin = Math.min(f3, f5);
            float fMax = Math.max(f4, f6);
            float fMin2 = f - Math.min(f3, f5);
            float fMax2 = Math.max(f4, f6) - f2;
            String str = "" + (((int) (((double) ((fMin2 * 100.0f) / Math.abs(f5 - f3))) + 0.5d)) / 100.0f);
            l(str, this.h);
            canvas.drawText(str, ((fMin2 / 2.0f) - (this.r.width() / 2)) + fMin, f2 - 20.0f, this.h);
            canvas.drawLine(f, f2, Math.min(f3, f5), f2, this.g);
            String str2 = "" + (((int) (((double) ((fMax2 * 100.0f) / Math.abs(f6 - f4))) + 0.5d)) / 100.0f);
            l(str2, this.h);
            canvas.drawText(str2, f + 5.0f, fMax - ((fMax2 / 2.0f) - (this.r.height() / 2)), this.h);
            canvas.drawLine(f, f2, f, Math.max(f4, f6), this.g);
        }

        private void g(Canvas canvas) {
            float[] fArr = this.a;
            canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.g);
        }

        private void h(Canvas canvas, float f, float f2) {
            float[] fArr = this.a;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float fHypot = (float) Math.hypot(f3 - f5, f4 - f6);
            float f7 = f5 - f3;
            float f8 = f6 - f4;
            float f9 = (((f - f3) * f7) + ((f2 - f4) * f8)) / (fHypot * fHypot);
            float f10 = f3 + (f7 * f9);
            float f11 = f4 + (f9 * f8);
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f10, f11);
            float fHypot2 = (float) Math.hypot(f10 - f, f11 - f2);
            String str = "" + (((int) ((fHypot2 * 100.0f) / fHypot)) / 100.0f);
            l(str, this.h);
            canvas.drawTextOnPath(str, path, (fHypot2 / 2.0f) - (this.r.width() / 2), -20.0f, this.h);
            canvas.drawLine(f, f2, f10, f11, this.g);
        }

        private void i(Canvas canvas, float f, float f2, int i, int i2) {
            String str = "" + (((int) (((double) (((f - (i / 2)) * 100.0f) / (MotionLayout.this.getWidth() - i))) + 0.5d)) / 100.0f);
            l(str, this.h);
            canvas.drawText(str, ((f / 2.0f) - (this.r.width() / 2)) + 0.0f, f2 - 20.0f, this.h);
            canvas.drawLine(f, f2, Math.min(0.0f, 1.0f), f2, this.g);
            String str2 = "" + (((int) (((double) (((f2 - (i2 / 2)) * 100.0f) / (MotionLayout.this.getHeight() - i2))) + 0.5d)) / 100.0f);
            l(str2, this.h);
            canvas.drawText(str2, 5.0f + f, 0.0f - ((f2 / 2.0f) - (this.r.height() / 2)), this.h);
            canvas.drawLine(f, f2, f, Math.max(0.0f, 1.0f), this.g);
        }

        private void j(Canvas canvas, j jVar) {
            this.d.reset();
            for (int i = 0; i <= 50; i++) {
                jVar.e(i / 50, this.j, 0);
                Path path = this.d;
                float[] fArr = this.j;
                path.moveTo(fArr[0], fArr[1]);
                Path path2 = this.d;
                float[] fArr2 = this.j;
                path2.lineTo(fArr2[2], fArr2[3]);
                Path path3 = this.d;
                float[] fArr3 = this.j;
                path3.lineTo(fArr3[4], fArr3[5]);
                Path path4 = this.d;
                float[] fArr4 = this.j;
                path4.lineTo(fArr4[6], fArr4[7]);
                this.d.close();
            }
            this.e.setColor(1140850688);
            canvas.translate(2.0f, 2.0f);
            canvas.drawPath(this.d, this.e);
            canvas.translate(-2.0f, -2.0f);
            this.e.setColor(-65536);
            canvas.drawPath(this.d, this.e);
        }

        private void k(Canvas canvas, int i, int i2, j jVar) {
            int width;
            int height;
            View view = jVar.b;
            if (view != null) {
                width = view.getWidth();
                height = jVar.b.getHeight();
            } else {
                width = 0;
                height = 0;
            }
            for (int i3 = 1; i3 < i2 - 1; i3++) {
                if (i != 4 || this.b[i3 - 1] != 0) {
                    float[] fArr = this.c;
                    int i4 = i3 * 2;
                    float f = fArr[i4];
                    float f2 = fArr[i4 + 1];
                    this.d.reset();
                    this.d.moveTo(f, f2 + 10.0f);
                    this.d.lineTo(f + 10.0f, f2);
                    this.d.lineTo(f, f2 - 10.0f);
                    this.d.lineTo(f - 10.0f, f2);
                    this.d.close();
                    int i5 = i3 - 1;
                    jVar.q(i5);
                    if (i == 4) {
                        int i6 = this.b[i5];
                        if (i6 == 1) {
                            h(canvas, f - 0.0f, f2 - 0.0f);
                        } else if (i6 == 0) {
                            f(canvas, f - 0.0f, f2 - 0.0f);
                        } else if (i6 == 2) {
                            i(canvas, f - 0.0f, f2 - 0.0f, width, height);
                        }
                        canvas.drawPath(this.d, this.i);
                    }
                    if (i == 2) {
                        h(canvas, f - 0.0f, f2 - 0.0f);
                    }
                    if (i == 3) {
                        f(canvas, f - 0.0f, f2 - 0.0f);
                    }
                    if (i == 6) {
                        i(canvas, f - 0.0f, f2 - 0.0f, width, height);
                    }
                    canvas.drawPath(this.d, this.i);
                }
            }
            float[] fArr2 = this.a;
            if (fArr2.length > 1) {
                canvas.drawCircle(fArr2[0], fArr2[1], 8.0f, this.f);
                float[] fArr3 = this.a;
                canvas.drawCircle(fArr3[fArr3.length - 2], fArr3[fArr3.length - 1], 8.0f, this.f);
            }
        }

        public void a(Canvas canvas, HashMap<View, j> map, int i, int i2) {
            if (map == null || map.size() == 0) {
                return;
            }
            canvas.save();
            if (!MotionLayout.this.isInEditMode() && (i2 & 1) == 2) {
                String str = MotionLayout.this.getContext().getResources().getResourceName(MotionLayout.this.F) + ":" + MotionLayout.this.getProgress();
                canvas.drawText(str, 10.0f, MotionLayout.this.getHeight() - 30, this.h);
                canvas.drawText(str, 11.0f, MotionLayout.this.getHeight() - 29, this.e);
            }
            for (j jVar : map.values()) {
                int iM = jVar.m();
                if (i2 > 0 && iM == 0) {
                    iM = 1;
                }
                if (iM != 0) {
                    this.q = jVar.c(this.c, this.b);
                    if (iM >= 1) {
                        int i3 = i / 16;
                        float[] fArr = this.a;
                        if (fArr == null || fArr.length != i3 * 2) {
                            this.a = new float[i3 * 2];
                            this.d = new Path();
                        }
                        int i4 = this.t;
                        canvas.translate(i4, i4);
                        this.e.setColor(1996488704);
                        this.i.setColor(1996488704);
                        this.f.setColor(1996488704);
                        this.g.setColor(1996488704);
                        jVar.d(this.a, i3);
                        b(canvas, iM, this.q, jVar);
                        this.e.setColor(-21965);
                        this.f.setColor(-2067046);
                        this.i.setColor(-2067046);
                        this.g.setColor(-13391360);
                        int i5 = this.t;
                        canvas.translate(-i5, -i5);
                        b(canvas, iM, this.q, jVar);
                        if (iM == 5) {
                            j(canvas, jVar);
                        }
                    }
                }
            }
            canvas.restore();
        }

        public void b(Canvas canvas, int i, int i2, j jVar) {
            if (i == 4) {
                d(canvas);
            }
            if (i == 2) {
                g(canvas);
            }
            if (i == 3) {
                e(canvas);
            }
            c(canvas);
            k(canvas, i, i2, jVar);
        }

        void l(String str, Paint paint) {
            paint.getTextBounds(str, 0, str.length(), this.r);
        }
    }

    class e {
        androidx.constraintlayout.core.widgets.d a = new androidx.constraintlayout.core.widgets.d();
        androidx.constraintlayout.core.widgets.d b = new androidx.constraintlayout.core.widgets.d();
        androidx.constraintlayout.widget.c c = null;
        androidx.constraintlayout.widget.c d = null;
        int e;
        int f;

        e() {
        }

        private void b(int i, int i2) {
            int optimizationLevel = MotionLayout.this.getOptimizationLevel();
            MotionLayout motionLayout = MotionLayout.this;
            if (motionLayout.E == motionLayout.getStartState()) {
                MotionLayout motionLayout2 = MotionLayout.this;
                androidx.constraintlayout.core.widgets.d dVar = this.b;
                androidx.constraintlayout.widget.c cVar = this.d;
                motionLayout2.t(dVar, optimizationLevel, (cVar == null || cVar.e == 0) ? i : i2, (cVar == null || cVar.e == 0) ? i2 : i);
                androidx.constraintlayout.widget.c cVar2 = this.c;
                if (cVar2 != null) {
                    MotionLayout motionLayout3 = MotionLayout.this;
                    androidx.constraintlayout.core.widgets.d dVar2 = this.a;
                    int i3 = cVar2.e;
                    int i4 = i3 == 0 ? i : i2;
                    if (i3 == 0) {
                        i = i2;
                    }
                    motionLayout3.t(dVar2, optimizationLevel, i4, i);
                    return;
                }
                return;
            }
            androidx.constraintlayout.widget.c cVar3 = this.c;
            if (cVar3 != null) {
                MotionLayout motionLayout4 = MotionLayout.this;
                androidx.constraintlayout.core.widgets.d dVar3 = this.a;
                int i5 = cVar3.e;
                motionLayout4.t(dVar3, optimizationLevel, i5 == 0 ? i : i2, i5 == 0 ? i2 : i);
            }
            MotionLayout motionLayout5 = MotionLayout.this;
            androidx.constraintlayout.core.widgets.d dVar4 = this.b;
            androidx.constraintlayout.widget.c cVar4 = this.d;
            int i6 = (cVar4 == null || cVar4.e == 0) ? i : i2;
            if (cVar4 == null || cVar4.e == 0) {
                i = i2;
            }
            motionLayout5.t(dVar4, optimizationLevel, i6, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void j(androidx.constraintlayout.core.widgets.d dVar, androidx.constraintlayout.widget.c cVar) {
            SparseArray<ConstraintWidget> sparseArray = new SparseArray<>();
            androidx.constraintlayout.widget.d.a aVar = new androidx.constraintlayout.widget.d.a(-2, -2);
            sparseArray.clear();
            sparseArray.put(0, dVar);
            sparseArray.put(MotionLayout.this.getId(), dVar);
            if (cVar != null && cVar.e != 0) {
                MotionLayout motionLayout = MotionLayout.this;
                motionLayout.t(this.b, motionLayout.getOptimizationLevel(), View.MeasureSpec.makeMeasureSpec(MotionLayout.this.getHeight(), 1073741824), View.MeasureSpec.makeMeasureSpec(MotionLayout.this.getWidth(), 1073741824));
            }
            for (ConstraintWidget constraintWidget : dVar.z1()) {
                constraintWidget.G0(true);
                sparseArray.put(((View) constraintWidget.u()).getId(), constraintWidget);
            }
            for (ConstraintWidget constraintWidget2 : dVar.z1()) {
                View view = (View) constraintWidget2.u();
                cVar.l(view.getId(), aVar);
                constraintWidget2.r1(cVar.D(view.getId()));
                constraintWidget2.S0(cVar.y(view.getId()));
                if (view instanceof androidx.constraintlayout.widget.a) {
                    cVar.j((androidx.constraintlayout.widget.a) view, constraintWidget2, aVar, sparseArray);
                    if (view instanceof Barrier) {
                        ((Barrier) view).w();
                    }
                }
                aVar.resolveLayoutDirection(MotionLayout.this.getLayoutDirection());
                MotionLayout.this.g(false, view, constraintWidget2, aVar, sparseArray);
                if (cVar.C(view.getId()) == 1) {
                    constraintWidget2.q1(view.getVisibility());
                } else {
                    constraintWidget2.q1(cVar.B(view.getId()));
                }
            }
            for (ConstraintWidget constraintWidget3 : dVar.z1()) {
                if (constraintWidget3 instanceof androidx.constraintlayout.core.widgets.i) {
                    androidx.constraintlayout.widget.a aVar2 = (androidx.constraintlayout.widget.a) constraintWidget3.u();
                    fc5 fc5Var = (fc5) constraintWidget3;
                    aVar2.u(dVar, fc5Var, sparseArray);
                    ((androidx.constraintlayout.core.widgets.i) fc5Var).B1();
                }
            }
        }

        public void a() {
            int childCount = MotionLayout.this.getChildCount();
            MotionLayout.this.J.clear();
            SparseArray sparseArray = new SparseArray();
            int[] iArr = new int[childCount];
            for (int i = 0; i < childCount; i++) {
                View childAt = MotionLayout.this.getChildAt(i);
                j jVar = new j(childAt);
                int id = childAt.getId();
                iArr[i] = id;
                sparseArray.put(id, jVar);
                MotionLayout.this.J.put(childAt, jVar);
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt2 = MotionLayout.this.getChildAt(i2);
                j jVar2 = MotionLayout.this.J.get(childAt2);
                if (jVar2 != null) {
                    if (this.c != null) {
                        ConstraintWidget constraintWidgetD = d(this.a, childAt2);
                        if (constraintWidgetD != null) {
                            jVar2.C(MotionLayout.this.y0(constraintWidgetD), this.c, MotionLayout.this.getWidth(), MotionLayout.this.getHeight());
                        } else if (MotionLayout.this.W != 0) {
                            hq2.b();
                            hq2.d(childAt2);
                            childAt2.getClass();
                        }
                    } else if (MotionLayout.this.O0) {
                        qae qaeVar = MotionLayout.this.Q0.get(childAt2);
                        MotionLayout motionLayout = MotionLayout.this;
                        jVar2.D(qaeVar, childAt2, motionLayout.P0, motionLayout.R0, MotionLayout.this.S0);
                    }
                    if (this.d != null) {
                        ConstraintWidget constraintWidgetD2 = d(this.b, childAt2);
                        if (constraintWidgetD2 != null) {
                            jVar2.z(MotionLayout.this.y0(constraintWidgetD2), this.d, MotionLayout.this.getWidth(), MotionLayout.this.getHeight());
                        } else if (MotionLayout.this.W != 0) {
                            hq2.b();
                            hq2.d(childAt2);
                            childAt2.getClass();
                        }
                    }
                }
            }
            for (int i3 = 0; i3 < childCount; i3++) {
                j jVar3 = (j) sparseArray.get(iArr[i3]);
                int iH = jVar3.h();
                if (iH != -1) {
                    jVar3.G((j) sparseArray.get(iH));
                }
            }
        }

        void c(androidx.constraintlayout.core.widgets.d dVar, androidx.constraintlayout.core.widgets.d dVar2) {
            ConstraintWidget gc5Var;
            ArrayList<ConstraintWidget> arrayListZ1 = dVar.z1();
            HashMap<ConstraintWidget, ConstraintWidget> map = new HashMap<>();
            map.put(dVar, dVar2);
            dVar2.z1().clear();
            dVar2.n(dVar, map);
            for (ConstraintWidget constraintWidget : arrayListZ1) {
                if (constraintWidget instanceof androidx.constraintlayout.core.widgets.a) {
                    gc5Var = new androidx.constraintlayout.core.widgets.a();
                } else if (constraintWidget instanceof androidx.constraintlayout.core.widgets.f) {
                    gc5Var = new androidx.constraintlayout.core.widgets.f();
                } else if (constraintWidget instanceof androidx.constraintlayout.core.widgets.e) {
                    gc5Var = new androidx.constraintlayout.core.widgets.e();
                } else if (constraintWidget instanceof androidx.constraintlayout.core.widgets.h) {
                    gc5Var = new androidx.constraintlayout.core.widgets.h();
                } else {
                    gc5Var = constraintWidget instanceof fc5 ? new gc5() : new ConstraintWidget();
                }
                dVar2.a(gc5Var);
                map.put(constraintWidget, gc5Var);
            }
            for (ConstraintWidget constraintWidget2 : arrayListZ1) {
                map.get(constraintWidget2).n(constraintWidget2, map);
            }
        }

        ConstraintWidget d(androidx.constraintlayout.core.widgets.d dVar, View view) {
            if (dVar.u() == view) {
                return dVar;
            }
            ArrayList<ConstraintWidget> arrayListZ1 = dVar.z1();
            int size = arrayListZ1.size();
            for (int i = 0; i < size; i++) {
                ConstraintWidget constraintWidget = arrayListZ1.get(i);
                if (constraintWidget.u() == view) {
                    return constraintWidget;
                }
            }
            return null;
        }

        void e(androidx.constraintlayout.core.widgets.d dVar, androidx.constraintlayout.widget.c cVar, androidx.constraintlayout.widget.c cVar2) {
            this.c = cVar;
            this.d = cVar2;
            this.a = new androidx.constraintlayout.core.widgets.d();
            this.b = new androidx.constraintlayout.core.widgets.d();
            this.a.e2(((ConstraintLayout) MotionLayout.this).c.R1());
            this.b.e2(((ConstraintLayout) MotionLayout.this).c.R1());
            this.a.C1();
            this.b.C1();
            c(((ConstraintLayout) MotionLayout.this).c, this.a);
            c(((ConstraintLayout) MotionLayout.this).c, this.b);
            if (MotionLayout.this.N > 0.5d) {
                if (cVar != null) {
                    j(this.a, cVar);
                }
                j(this.b, cVar2);
            } else {
                j(this.b, cVar2);
                if (cVar != null) {
                    j(this.a, cVar);
                }
            }
            this.a.h2(MotionLayout.this.p());
            this.a.j2();
            this.b.h2(MotionLayout.this.p());
            this.b.j2();
            ViewGroup.LayoutParams layoutParams = MotionLayout.this.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    androidx.constraintlayout.core.widgets.d dVar2 = this.a;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    dVar2.W0(dimensionBehaviour);
                    this.b.W0(dimensionBehaviour);
                }
                if (layoutParams.height == -2) {
                    androidx.constraintlayout.core.widgets.d dVar3 = this.a;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    dVar3.n1(dimensionBehaviour2);
                    this.b.n1(dimensionBehaviour2);
                }
            }
        }

        public boolean f(int i, int i2) {
            return (i == this.e && i2 == this.f) ? false : true;
        }

        public void g(int i, int i2) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            MotionLayout motionLayout = MotionLayout.this;
            motionLayout.F0 = mode;
            motionLayout.G0 = mode2;
            b(i, i2);
            if (!(MotionLayout.this.getParent() instanceof MotionLayout) || mode != 1073741824 || mode2 != 1073741824) {
                b(i, i2);
                MotionLayout.this.B0 = this.a.a0();
                MotionLayout.this.C0 = this.a.z();
                MotionLayout.this.D0 = this.b.a0();
                MotionLayout.this.E0 = this.b.z();
                MotionLayout motionLayout2 = MotionLayout.this;
                motionLayout2.A0 = (motionLayout2.B0 == motionLayout2.D0 && motionLayout2.C0 == motionLayout2.E0) ? false : true;
            }
            MotionLayout motionLayout3 = MotionLayout.this;
            int i3 = motionLayout3.B0;
            int i4 = motionLayout3.C0;
            int i5 = motionLayout3.F0;
            if (i5 == Integer.MIN_VALUE || i5 == 0) {
                i3 = (int) (i3 + (motionLayout3.H0 * (motionLayout3.D0 - i3)));
            }
            int i6 = i3;
            int i7 = motionLayout3.G0;
            if (i7 == Integer.MIN_VALUE || i7 == 0) {
                i4 = (int) (i4 + (motionLayout3.H0 * (motionLayout3.E0 - i4)));
            }
            MotionLayout.this.s(i, i2, i6, i4, this.a.Z1() || this.b.Z1(), this.a.X1() || this.b.X1());
        }

        public void h() {
            g(MotionLayout.this.G, MotionLayout.this.H);
            MotionLayout.this.x0();
        }

        public void i(int i, int i2) {
            this.e = i;
            this.f = i2;
        }
    }

    protected interface f {
        void a(MotionEvent motionEvent);

        float b();

        void c(int i);

        float d();

        void recycle();
    }

    private static class g implements f {
        private static g b = new g();
        VelocityTracker a;

        private g() {
        }

        public static g e() {
            b.a = VelocityTracker.obtain();
            return b;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.f
        public void a(MotionEvent motionEvent) {
            VelocityTracker velocityTracker = this.a;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.f
        public float b() {
            VelocityTracker velocityTracker = this.a;
            if (velocityTracker != null) {
                return velocityTracker.getYVelocity();
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.f
        public void c(int i) {
            VelocityTracker velocityTracker = this.a;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(i);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.f
        public float d() {
            VelocityTracker velocityTracker = this.a;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity();
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.f
        public void recycle() {
            VelocityTracker velocityTracker = this.a;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.a = null;
            }
        }
    }

    class h {
        float a = Float.NaN;
        float b = Float.NaN;
        int c = -1;
        int d = -1;
        final String e = "motion.progress";
        final String f = "motion.velocity";
        final String g = "motion.StartState";
        final String h = "motion.EndState";

        h() {
        }

        void a() {
            int i = this.c;
            if (i != -1 || this.d != -1) {
                if (i == -1) {
                    MotionLayout.this.D0(this.d);
                } else {
                    int i2 = this.d;
                    if (i2 == -1) {
                        MotionLayout.this.v0(i, -1, -1);
                    } else {
                        MotionLayout.this.w0(i, i2);
                    }
                }
                MotionLayout.this.setState(TransitionState.SETUP);
            }
            if (Float.isNaN(this.b)) {
                if (Float.isNaN(this.a)) {
                    return;
                }
                MotionLayout.this.setProgress(this.a);
            } else {
                MotionLayout.this.u0(this.a, this.b);
                this.a = Float.NaN;
                this.b = Float.NaN;
                this.c = -1;
                this.d = -1;
            }
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putFloat("motion.progress", this.a);
            bundle.putFloat("motion.velocity", this.b);
            bundle.putInt("motion.StartState", this.c);
            bundle.putInt("motion.EndState", this.d);
            return bundle;
        }

        public void c() {
            this.d = MotionLayout.this.F;
            this.c = MotionLayout.this.D;
            this.b = MotionLayout.this.getVelocity();
            this.a = MotionLayout.this.getProgress();
        }

        public void d(int i) {
            this.d = i;
        }

        public void e(float f) {
            this.a = f;
        }

        public void f(int i) {
            this.c = i;
        }

        public void g(Bundle bundle) {
            this.a = bundle.getFloat("motion.progress");
            this.b = bundle.getFloat("motion.velocity");
            this.c = bundle.getInt("motion.StartState");
            this.d = bundle.getInt("motion.EndState");
        }

        public void h(float f) {
            this.b = f;
        }
    }

    public interface i {
        void a(MotionLayout motionLayout, int i, int i2, float f);

        void b(MotionLayout motionLayout, int i);

        void c(MotionLayout motionLayout, int i, int i2);

        void d(MotionLayout motionLayout, int i, boolean z, float f);
    }

    public MotionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.B = null;
        this.C = 0.0f;
        this.D = -1;
        this.E = -1;
        this.F = -1;
        this.G = 0;
        this.H = 0;
        this.I = true;
        this.J = new HashMap<>();
        this.K = 0L;
        this.L = 1.0f;
        this.M = 0.0f;
        this.N = 0.0f;
        this.P = 0.0f;
        this.R = false;
        this.S = false;
        this.W = 0;
        this.b0 = false;
        this.c0 = new f9c();
        this.d0 = new c();
        this.f0 = true;
        this.k0 = false;
        this.p0 = false;
        this.q0 = null;
        this.r0 = null;
        this.s0 = null;
        this.t0 = null;
        this.u0 = 0;
        this.v0 = -1L;
        this.w0 = 0.0f;
        this.x0 = 0;
        this.y0 = 0.0f;
        this.z0 = false;
        this.A0 = false;
        this.I0 = new ki6();
        this.J0 = false;
        this.L0 = null;
        this.M0 = null;
        this.N0 = 0;
        this.O0 = false;
        this.P0 = 0;
        this.Q0 = new HashMap<>();
        this.U0 = new Rect();
        this.V0 = false;
        this.W0 = TransitionState.UNDEFINED;
        this.X0 = new e();
        this.Y0 = false;
        this.Z0 = new RectF();
        this.a1 = null;
        this.b1 = null;
        this.c1 = new ArrayList<>();
        o0(attributeSet);
    }

    private static boolean J0(float f2, float f3, float f4) {
        if (f2 > 0.0f) {
            float f5 = f2 / f4;
            return f3 + ((f2 * f5) - (((f4 * f5) * f5) / 2.0f)) > 1.0f;
        }
        float f6 = (-f2) / f4;
        return f3 + ((f2 * f6) + (((f4 * f6) * f6) / 2.0f)) < 0.0f;
    }

    private boolean X(View view, MotionEvent motionEvent, float f2, float f3) {
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            motionEvent.offsetLocation(f2, f3);
            boolean zOnTouchEvent = view.onTouchEvent(motionEvent);
            motionEvent.offsetLocation(-f2, -f3);
            return zOnTouchEvent;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(f2, f3);
        if (this.b1 == null) {
            this.b1 = new Matrix();
        }
        matrix.invert(this.b1);
        motionEventObtain.transform(this.b1);
        boolean zOnTouchEvent2 = view.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
        return zOnTouchEvent2;
    }

    private void Y() {
        l lVar = this.z;
        if (lVar == null) {
            return;
        }
        int iE = lVar.E();
        l lVar2 = this.z;
        Z(iE, lVar2.k(lVar2.E()));
        SparseIntArray sparseIntArray = new SparseIntArray();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        for (l.b bVar : this.z.n()) {
            l.b bVar2 = this.z.c;
            a0(bVar);
            int iA = bVar.A();
            int iY = bVar.y();
            hq2.c(getContext(), iA);
            hq2.c(getContext(), iY);
            sparseIntArray.get(iA);
            sparseIntArray2.get(iY);
            sparseIntArray.put(iA, iY);
            sparseIntArray2.put(iY, iA);
            this.z.k(iA);
            this.z.k(iY);
        }
    }

    private void Z(int i2, androidx.constraintlayout.widget.c cVar) {
        hq2.c(getContext(), i2);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (cVar.x(childAt.getId()) == null) {
                hq2.d(childAt);
            }
        }
        int[] iArrZ = cVar.z();
        for (int i4 = 0; i4 < iArrZ.length; i4++) {
            int i5 = iArrZ[i4];
            hq2.c(getContext(), i5);
            findViewById(iArrZ[i4]);
            cVar.y(i5);
            cVar.D(i5);
        }
    }

    private void a0(l.b bVar) {
        bVar.A();
        bVar.y();
    }

    private void b0() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            j jVar = this.J.get(childAt);
            if (jVar != null) {
                jVar.B(childAt);
            }
        }
    }

    private void e0() {
        boolean z;
        float fSignum = Math.signum(this.P - this.N);
        long nanoTime = getNanoTime();
        Interpolator interpolator = this.A;
        float interpolation = this.N + (!(interpolator instanceof f9c) ? (((nanoTime - this.O) * fSignum) * 1.0E-9f) / this.L : 0.0f);
        if (this.Q) {
            interpolation = this.P;
        }
        if ((fSignum <= 0.0f || interpolation < this.P) && (fSignum > 0.0f || interpolation > this.P)) {
            z = false;
        } else {
            interpolation = this.P;
            z = true;
        }
        if (interpolator != null && !z) {
            interpolation = this.b0 ? interpolator.getInterpolation((nanoTime - this.K) * 1.0E-9f) : interpolator.getInterpolation(interpolation);
        }
        if ((fSignum > 0.0f && interpolation >= this.P) || (fSignum <= 0.0f && interpolation <= this.P)) {
            interpolation = this.P;
        }
        this.H0 = interpolation;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        Interpolator interpolator2 = this.B;
        if (interpolator2 != null) {
            interpolation = interpolator2.getInterpolation(interpolation);
        }
        float f2 = interpolation;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            j jVar = this.J.get(childAt);
            if (jVar != null) {
                jVar.u(childAt, f2, nanoTime2, this.I0);
            }
        }
        if (this.A0) {
            requestLayout();
        }
    }

    private void f0() {
        CopyOnWriteArrayList<i> copyOnWriteArrayList;
        if ((this.T == null && ((copyOnWriteArrayList = this.t0) == null || copyOnWriteArrayList.isEmpty())) || this.y0 == this.M) {
            return;
        }
        if (this.x0 != -1) {
            h0();
            this.z0 = true;
        }
        this.x0 = -1;
        float f2 = this.M;
        this.y0 = f2;
        i iVar = this.T;
        if (iVar != null) {
            iVar.a(this, this.D, this.F, f2);
        }
        CopyOnWriteArrayList<i> copyOnWriteArrayList2 = this.t0;
        if (copyOnWriteArrayList2 != null) {
            Iterator<i> it = copyOnWriteArrayList2.iterator();
            while (it.hasNext()) {
                it.next().a(this, this.D, this.F, this.M);
            }
        }
        this.z0 = true;
    }

    private void h0() {
        i iVar = this.T;
        if (iVar != null) {
            iVar.c(this, this.D, this.F);
        }
        CopyOnWriteArrayList<i> copyOnWriteArrayList = this.t0;
        if (copyOnWriteArrayList != null) {
            Iterator<i> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().c(this, this.D, this.F);
            }
        }
    }

    private boolean n0(float f2, float f3, View view, MotionEvent motionEvent) {
        boolean z;
        if (!(view instanceof ViewGroup)) {
            z = false;
            break;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                z = false;
                break;
            }
            View childAt = viewGroup.getChildAt(childCount);
            if (n0((childAt.getLeft() + f2) - view.getScrollX(), (childAt.getTop() + f3) - view.getScrollY(), childAt, motionEvent)) {
                z = true;
                break;
            }
            childCount--;
        }
        if (!z) {
            this.Z0.set(f2, f3, (view.getRight() + f2) - view.getLeft(), (view.getBottom() + f3) - view.getTop());
            if ((motionEvent.getAction() != 0 || this.Z0.contains(motionEvent.getX(), motionEvent.getY())) && X(view, motionEvent, -f2, -f3)) {
                return true;
            }
        }
        return z;
    }

    private void o0(AttributeSet attributeSet) {
        l lVar;
        d1 = isInEditMode();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, v0a.k8);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            boolean z = true;
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == v0a.n8) {
                    this.z = new l(getContext(), this, typedArrayObtainStyledAttributes.getResourceId(index, -1));
                } else if (index == v0a.m8) {
                    this.E = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                } else if (index == v0a.p8) {
                    this.P = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                    this.R = true;
                } else if (index == v0a.l8) {
                    z = typedArrayObtainStyledAttributes.getBoolean(index, z);
                } else if (index == v0a.q8) {
                    if (this.W == 0) {
                        this.W = typedArrayObtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == v0a.o8) {
                    this.W = typedArrayObtainStyledAttributes.getInt(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            if (!z) {
                this.z = null;
            }
        }
        if (this.W != 0) {
            Y();
        }
        if (this.E != -1 || (lVar = this.z) == null) {
            return;
        }
        this.E = lVar.E();
        this.D = this.z.E();
        this.F = this.z.p();
    }

    private void s0() {
        CopyOnWriteArrayList<i> copyOnWriteArrayList;
        if (this.T == null && ((copyOnWriteArrayList = this.t0) == null || copyOnWriteArrayList.isEmpty())) {
            return;
        }
        this.z0 = false;
        for (Integer num : this.c1) {
            i iVar = this.T;
            if (iVar != null) {
                iVar.b(this, num.intValue());
            }
            CopyOnWriteArrayList<i> copyOnWriteArrayList2 = this.t0;
            if (copyOnWriteArrayList2 != null) {
                Iterator<i> it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    it.next().b(this, num.intValue());
                }
            }
        }
        this.c1.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x0() {
        int childCount = getChildCount();
        this.X0.a();
        this.R = true;
        SparseArray sparseArray = new SparseArray();
        int i2 = 0;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            sparseArray.put(childAt.getId(), this.J.get(childAt));
        }
        int width = getWidth();
        int height = getHeight();
        int i4 = this.z.i();
        if (i4 != -1) {
            for (int i5 = 0; i5 < childCount; i5++) {
                j jVar = this.J.get(getChildAt(i5));
                if (jVar != null) {
                    jVar.A(i4);
                }
            }
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int[] iArr = new int[this.J.size()];
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            j jVar2 = this.J.get(getChildAt(i7));
            if (jVar2.h() != -1) {
                sparseBooleanArray.put(jVar2.h(), true);
                iArr[i6] = jVar2.h();
                i6++;
            }
        }
        if (this.s0 != null) {
            for (int i8 = 0; i8 < i6; i8++) {
                j jVar3 = this.J.get(findViewById(iArr[i8]));
                if (jVar3 != null) {
                    this.z.s(jVar3);
                }
            }
            Iterator<wz7> it = this.s0.iterator();
            while (it.hasNext()) {
                it.next().D(this, this.J);
            }
            for (int i9 = 0; i9 < i6; i9++) {
                j jVar4 = this.J.get(findViewById(iArr[i9]));
                if (jVar4 != null) {
                    jVar4.F(width, height, this.L, getNanoTime());
                }
            }
        } else {
            for (int i10 = 0; i10 < i6; i10++) {
                j jVar5 = this.J.get(findViewById(iArr[i10]));
                if (jVar5 != null) {
                    this.z.s(jVar5);
                    jVar5.F(width, height, this.L, getNanoTime());
                }
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = getChildAt(i11);
            j jVar6 = this.J.get(childAt2);
            if (!sparseBooleanArray.get(childAt2.getId()) && jVar6 != null) {
                this.z.s(jVar6);
                jVar6.F(width, height, this.L, getNanoTime());
            }
        }
        float fD = this.z.D();
        if (fD != 0.0f) {
            boolean z = ((double) fD) < 0.0d;
            float fAbs = Math.abs(fD);
            float fMax = -3.4028235E38f;
            float fMin = Float.MAX_VALUE;
            float fMax2 = -3.4028235E38f;
            float fMin2 = Float.MAX_VALUE;
            for (int i12 = 0; i12 < childCount; i12++) {
                j jVar7 = this.J.get(getChildAt(i12));
                if (!Float.isNaN(jVar7.m)) {
                    for (int i13 = 0; i13 < childCount; i13++) {
                        j jVar8 = this.J.get(getChildAt(i13));
                        if (!Float.isNaN(jVar8.m)) {
                            fMin = Math.min(fMin, jVar8.m);
                            fMax = Math.max(fMax, jVar8.m);
                        }
                    }
                    while (i2 < childCount) {
                        j jVar9 = this.J.get(getChildAt(i2));
                        if (!Float.isNaN(jVar9.m)) {
                            jVar9.o = 1.0f / (1.0f - fAbs);
                            if (z) {
                                jVar9.n = fAbs - (((fMax - jVar9.m) / (fMax - fMin)) * fAbs);
                            } else {
                                jVar9.n = fAbs - (((jVar9.m - fMin) * fAbs) / (fMax - fMin));
                            }
                        }
                        i2++;
                    }
                    return;
                }
                float fN = jVar7.n();
                float fO = jVar7.o();
                float f2 = z ? fO - fN : fO + fN;
                fMin2 = Math.min(fMin2, f2);
                fMax2 = Math.max(fMax2, f2);
            }
            while (i2 < childCount) {
                j jVar10 = this.J.get(getChildAt(i2));
                float fN2 = jVar10.n();
                float fO2 = jVar10.o();
                float f3 = z ? fO2 - fN2 : fO2 + fN2;
                jVar10.o = 1.0f / (1.0f - fAbs);
                jVar10.n = fAbs - (((f3 - fMin2) * fAbs) / (fMax2 - fMin2));
                i2++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect y0(ConstraintWidget constraintWidget) {
        this.U0.top = constraintWidget.c0();
        this.U0.left = constraintWidget.b0();
        Rect rect = this.U0;
        int iA0 = constraintWidget.a0();
        Rect rect2 = this.U0;
        rect.right = iA0 + rect2.left;
        int iZ = constraintWidget.z();
        Rect rect3 = this.U0;
        rect2.bottom = iZ + rect3.top;
        return rect3;
    }

    public void A0() {
        W(1.0f);
        this.L0 = null;
    }

    public void B0(Runnable runnable) {
        W(1.0f);
        this.L0 = runnable;
    }

    public void C0() {
        W(0.0f);
    }

    public void D0(int i2) {
        if (isAttachedToWindow()) {
            E0(i2, -1, -1);
            return;
        }
        if (this.K0 == null) {
            this.K0 = new h();
        }
        this.K0.d(i2);
    }

    public void E0(int i2, int i3, int i4) {
        F0(i2, i3, i4, -1);
    }

    public void F0(int i2, int i3, int i4, int i5) {
        d7c d7cVar;
        int iA;
        l lVar = this.z;
        if (lVar != null && (d7cVar = lVar.b) != null && (iA = d7cVar.a(this.E, i2, i3, i4)) != -1) {
            i2 = iA;
        }
        int i6 = this.E;
        if (i6 == i2) {
            return;
        }
        if (this.D == i2) {
            W(0.0f);
            if (i5 > 0) {
                this.L = i5 / 1000.0f;
                return;
            }
            return;
        }
        if (this.F == i2) {
            W(1.0f);
            if (i5 > 0) {
                this.L = i5 / 1000.0f;
                return;
            }
            return;
        }
        this.F = i2;
        if (i6 != -1) {
            w0(i6, i2);
            W(1.0f);
            this.N = 0.0f;
            A0();
            if (i5 > 0) {
                this.L = i5 / 1000.0f;
                return;
            }
            return;
        }
        this.b0 = false;
        this.P = 1.0f;
        this.M = 0.0f;
        this.N = 0.0f;
        this.O = getNanoTime();
        this.K = getNanoTime();
        this.Q = false;
        this.A = null;
        if (i5 == -1) {
            this.L = this.z.o() / 1000.0f;
        }
        this.D = -1;
        this.z.W(-1, this.F);
        SparseArray sparseArray = new SparseArray();
        if (i5 == 0) {
            this.L = this.z.o() / 1000.0f;
        } else if (i5 > 0) {
            this.L = i5 / 1000.0f;
        }
        int childCount = getChildCount();
        this.J.clear();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            this.J.put(childAt, new j(childAt));
            sparseArray.put(childAt.getId(), this.J.get(childAt));
        }
        this.R = true;
        this.X0.e(this.c, null, this.z.k(i2));
        t0();
        this.X0.a();
        b0();
        int width = getWidth();
        int height = getHeight();
        if (this.s0 != null) {
            for (int i8 = 0; i8 < childCount; i8++) {
                j jVar = this.J.get(getChildAt(i8));
                if (jVar != null) {
                    this.z.s(jVar);
                }
            }
            Iterator<wz7> it = this.s0.iterator();
            while (it.hasNext()) {
                it.next().D(this, this.J);
            }
            for (int i9 = 0; i9 < childCount; i9++) {
                j jVar2 = this.J.get(getChildAt(i9));
                if (jVar2 != null) {
                    jVar2.F(width, height, this.L, getNanoTime());
                }
            }
        } else {
            for (int i10 = 0; i10 < childCount; i10++) {
                j jVar3 = this.J.get(getChildAt(i10));
                if (jVar3 != null) {
                    this.z.s(jVar3);
                    jVar3.F(width, height, this.L, getNanoTime());
                }
            }
        }
        float fD = this.z.D();
        if (fD != 0.0f) {
            float fMin = Float.MAX_VALUE;
            float fMax = -3.4028235E38f;
            for (int i11 = 0; i11 < childCount; i11++) {
                j jVar4 = this.J.get(getChildAt(i11));
                float fO = jVar4.o() + jVar4.n();
                fMin = Math.min(fMin, fO);
                fMax = Math.max(fMax, fO);
            }
            for (int i12 = 0; i12 < childCount; i12++) {
                j jVar5 = this.J.get(getChildAt(i12));
                float fN = jVar5.n();
                float fO2 = jVar5.o();
                jVar5.o = 1.0f / (1.0f - fD);
                jVar5.n = fD - ((((fN + fO2) - fMin) * fD) / (fMax - fMin));
            }
        }
        this.M = 0.0f;
        this.N = 0.0f;
        this.R = true;
        invalidate();
    }

    public void G0() {
        this.X0.e(this.c, this.z.k(this.D), this.z.k(this.F));
        t0();
    }

    public void H0(int i2, androidx.constraintlayout.widget.c cVar) {
        l lVar = this.z;
        if (lVar != null) {
            lVar.T(i2, cVar);
        }
        G0();
        if (this.E == i2) {
            cVar.i(this);
        }
    }

    public void I0(int i2, View... viewArr) {
        l lVar = this.z;
        if (lVar != null) {
            lVar.b0(i2, viewArr);
        }
    }

    void W(float f2) {
        l lVar = this.z;
        if (lVar == null) {
            return;
        }
        float f3 = this.N;
        float f4 = this.M;
        if (f3 != f4 && this.Q) {
            this.N = f4;
        }
        float f5 = this.N;
        if (f5 == f2) {
            return;
        }
        this.b0 = false;
        this.P = f2;
        this.L = lVar.o() / 1000.0f;
        setProgress(this.P);
        this.A = null;
        this.B = this.z.r();
        this.Q = false;
        this.K = getNanoTime();
        this.R = true;
        this.M = f5;
        this.N = f5;
        invalidate();
    }

    void c0(boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            j jVar = this.J.get(getChildAt(i2));
            if (jVar != null) {
                jVar.f(z);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:117:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:127:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:129:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:143:0x0219  */
    /* JADX WARN: Code duplicated, block: B:180:0x018d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00e2 A[PHI: r3
  0x00e2: PHI (r3v50 float) = (r3v49 float), (r3v51 float), (r3v51 float) binds: [B:47:0x00ae, B:58:0x00d6, B:60:0x00da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x0111  */
    /* JADX WARN: Code duplicated, block: B:74:0x0118  */
    /* JADX WARN: Code duplicated, block: B:86:0x0136  */
    /* JADX WARN: Code duplicated, block: B:89:0x014d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0150  */
    /* JADX WARN: Code duplicated, block: B:93:0x015a  */
    /* JADX WARN: Code duplicated, block: B:96:0x0171  */
    /* JADX WARN: Code duplicated, block: B:98:0x0180  */
    void d0(boolean z) {
        boolean z2;
        char c2;
        int childCount;
        long nanoTime;
        Interpolator interpolator;
        float interpolation;
        Interpolator interpolator2;
        int i2;
        int i3;
        int i4;
        int i5;
        View childAt;
        j jVar;
        boolean z3;
        if (this.O == -1) {
            this.O = getNanoTime();
        }
        float f2 = this.N;
        if (f2 > 0.0f && f2 < 1.0f) {
            this.E = -1;
        }
        boolean z4 = false;
        if (this.p0 || (this.R && (z || this.P != f2))) {
            float fSignum = Math.signum(this.P - f2);
            long nanoTime2 = getNanoTime();
            Interpolator interpolator3 = this.A;
            float f3 = !(interpolator3 instanceof xz7) ? (((nanoTime2 - this.O) * fSignum) * 1.0E-9f) / this.L : 0.0f;
            float f4 = this.N + f3;
            if (this.Q) {
                f4 = this.P;
            }
            if ((fSignum <= 0.0f || f4 < this.P) && (fSignum > 0.0f || f4 > this.P)) {
                z2 = false;
            } else {
                f4 = this.P;
                this.R = false;
                z2 = true;
            }
            this.N = f4;
            this.M = f4;
            this.O = nanoTime2;
            if (interpolator3 == null || z2) {
                this.C = f3;
            } else {
                if (this.b0) {
                    float interpolation2 = interpolator3.getInterpolation((nanoTime2 - this.K) * 1.0E-9f);
                    Interpolator interpolator4 = this.A;
                    f9c f9cVar = this.c0;
                    c2 = interpolator4 == f9cVar ? f9cVar.c() ? (char) 2 : (char) 1 : (char) 0;
                    this.N = interpolation2;
                    this.O = nanoTime2;
                    Interpolator interpolator5 = this.A;
                    if (interpolator5 instanceof xz7) {
                        float fA = ((xz7) interpolator5).a();
                        this.C = fA;
                        if (Math.abs(fA) * this.L <= 1.0E-5f && c2 == 2) {
                            this.R = false;
                        }
                        if (fA > 0.0f && interpolation2 >= 1.0f) {
                            this.N = 1.0f;
                            this.R = false;
                            interpolation2 = 1.0f;
                        }
                        if (fA >= 0.0f || interpolation2 > 0.0f) {
                            f4 = interpolation2;
                        } else {
                            this.N = 0.0f;
                            this.R = false;
                            f4 = 0.0f;
                        }
                    } else {
                        f4 = interpolation2;
                    }
                } else {
                    float interpolation3 = interpolator3.getInterpolation(f4);
                    Interpolator interpolator6 = this.A;
                    if (interpolator6 instanceof xz7) {
                        this.C = ((xz7) interpolator6).a();
                    } else {
                        this.C = ((interpolator6.getInterpolation(f4 + f3) - interpolation3) * fSignum) / f3;
                    }
                    f4 = interpolation3;
                }
                if (Math.abs(this.C) > 1.0E-5f) {
                    setState(TransitionState.MOVING);
                }
                if (c2 != 1) {
                    if ((fSignum <= 0.0f && f4 >= this.P) || (fSignum <= 0.0f && f4 <= this.P)) {
                        f4 = this.P;
                        this.R = false;
                    }
                    if (f4 < 1.0f || f4 <= 0.0f) {
                        this.R = false;
                        setState(TransitionState.FINISHED);
                    }
                }
                childCount = getChildCount();
                this.p0 = false;
                nanoTime = getNanoTime();
                this.H0 = f4;
                interpolator = this.B;
                if (interpolator == null) {
                    interpolation = f4;
                } else {
                    interpolation = interpolator.getInterpolation(f4);
                }
                interpolator2 = this.B;
                if (interpolator2 != null) {
                    float interpolation4 = interpolator2.getInterpolation((fSignum / this.L) + f4);
                    this.C = interpolation4;
                    this.C = interpolation4 - this.B.getInterpolation(f4);
                }
                for (i2 = 0; i2 < childCount; i2++) {
                    childAt = getChildAt(i2);
                    jVar = this.J.get(childAt);
                    if (jVar != null) {
                        this.p0 |= jVar.u(childAt, interpolation, nanoTime, this.I0);
                    }
                }
                boolean z5 = (fSignum <= 0.0f && f4 >= this.P) || (fSignum <= 0.0f && f4 <= this.P);
                if (!this.p0 && !this.R && z5) {
                    setState(TransitionState.FINISHED);
                }
                if (this.A0) {
                    requestLayout();
                }
                this.p0 = (!z5) | this.p0;
                if (f4 <= 0.0f && (i5 = this.D) != -1 && this.E != i5) {
                    this.E = i5;
                    this.z.k(i5).g(this);
                    setState(TransitionState.FINISHED);
                    z4 = true;
                }
                if (f4 >= 1.0d) {
                    i3 = this.E;
                    i4 = this.F;
                    if (i3 != i4) {
                        this.E = i4;
                        this.z.k(i4).g(this);
                        setState(TransitionState.FINISHED);
                        z4 = true;
                    }
                }
                if (!this.p0 || this.R) {
                    invalidate();
                } else if ((fSignum > 0.0f && f4 == 1.0f) || (fSignum < 0.0f && f4 == 0.0f)) {
                    setState(TransitionState.FINISHED);
                }
                if (!this.p0 && !this.R && ((fSignum > 0.0f && f4 == 1.0f) || (fSignum < 0.0f && f4 == 0.0f))) {
                    r0();
                }
            }
            c2 = 0;
            if (Math.abs(this.C) > 1.0E-5f) {
                setState(TransitionState.MOVING);
            }
            if (c2 != 1) {
                if (fSignum <= 0.0f) {
                    f4 = this.P;
                    this.R = false;
                } else {
                    f4 = this.P;
                    this.R = false;
                }
                if (f4 < 1.0f) {
                    this.R = false;
                    setState(TransitionState.FINISHED);
                } else {
                    this.R = false;
                    setState(TransitionState.FINISHED);
                }
            }
            childCount = getChildCount();
            this.p0 = false;
            nanoTime = getNanoTime();
            this.H0 = f4;
            interpolator = this.B;
            if (interpolator == null) {
                interpolation = f4;
            } else {
                interpolation = interpolator.getInterpolation(f4);
            }
            interpolator2 = this.B;
            if (interpolator2 != null) {
                float interpolation5 = interpolator2.getInterpolation((fSignum / this.L) + f4);
                this.C = interpolation5;
                this.C = interpolation5 - this.B.getInterpolation(f4);
            }
            while (i2 < childCount) {
                childAt = getChildAt(i2);
                jVar = this.J.get(childAt);
                if (jVar != null) {
                    this.p0 |= jVar.u(childAt, interpolation, nanoTime, this.I0);
                }
            }
            if (fSignum <= 0.0f) {
            }
            if (!this.p0) {
                setState(TransitionState.FINISHED);
            }
            if (this.A0) {
                requestLayout();
            }
            this.p0 = (!z5) | this.p0;
            if (f4 <= 0.0f) {
                this.E = i5;
                this.z.k(i5).g(this);
                setState(TransitionState.FINISHED);
                z4 = true;
            }
            if (f4 >= 1.0d) {
                i3 = this.E;
                i4 = this.F;
                if (i3 != i4) {
                    this.E = i4;
                    this.z.k(i4).g(this);
                    setState(TransitionState.FINISHED);
                    z4 = true;
                }
            }
            if (this.p0) {
                invalidate();
            } else {
                invalidate();
            }
            if (!this.p0) {
                r0();
            }
        }
        float f5 = this.N;
        if (f5 < 1.0f) {
            if (f5 <= 0.0f) {
                int i6 = this.E;
                int i7 = this.D;
                z3 = i6 == i7 ? z4 : true;
                this.E = i7;
            }
            this.Y0 |= z4;
            if (z4 && !this.J0) {
                requestLayout();
            }
            this.M = this.N;
        }
        int i8 = this.E;
        int i9 = this.F;
        z3 = i8 == i9 ? z4 : true;
        this.E = i9;
        z4 = z3;
        this.Y0 |= z4;
        if (z4) {
            requestLayout();
        }
        this.M = this.N;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        o oVar;
        ArrayList<wz7> arrayList = this.s0;
        if (arrayList != null) {
            Iterator<wz7> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().C(canvas);
            }
        }
        d0(false);
        l lVar = this.z;
        if (lVar != null && (oVar = lVar.r) != null) {
            oVar.c();
        }
        super.dispatchDraw(canvas);
        if (this.z == null) {
            return;
        }
        if ((this.W & 1) == 1 && !isInEditMode()) {
            this.u0++;
            long nanoTime = getNanoTime();
            long j = this.v0;
            if (j != -1) {
                long j2 = nanoTime - j;
                if (j2 > 200000000) {
                    this.w0 = ((int) ((this.u0 / (j2 * 1.0E-9f)) * 100.0f)) / 100.0f;
                    this.u0 = 0;
                    this.v0 = nanoTime;
                }
            } else {
                this.v0 = nanoTime;
            }
            Paint paint = new Paint();
            paint.setTextSize(42.0f);
            float progress = ((int) (getProgress() * 1000.0f)) / 10.0f;
            String str = this.w0 + " fps " + hq2.e(this, this.D) + " -> ";
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(hq2.e(this, this.F));
            sb.append(" (progress: ");
            sb.append(progress);
            sb.append(" ) state=");
            int i2 = this.E;
            sb.append(i2 == -1 ? "undefined" : hq2.e(this, i2));
            String string = sb.toString();
            paint.setColor(-16777216);
            canvas.drawText(string, 11.0f, getHeight() - 29, paint);
            paint.setColor(-7864184);
            canvas.drawText(string, 10.0f, getHeight() - 30, paint);
        }
        if (this.W > 1) {
            if (this.a0 == null) {
                this.a0 = new d();
            }
            this.a0.a(canvas, this.J, this.z.o(), this.W);
        }
        ArrayList<wz7> arrayList2 = this.s0;
        if (arrayList2 != null) {
            Iterator<wz7> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                it2.next().B(canvas);
            }
        }
    }

    protected void g0() {
        int iIntValue;
        CopyOnWriteArrayList<i> copyOnWriteArrayList;
        if ((this.T != null || ((copyOnWriteArrayList = this.t0) != null && !copyOnWriteArrayList.isEmpty())) && this.x0 == -1) {
            this.x0 = this.E;
            if (this.c1.isEmpty()) {
                iIntValue = -1;
            } else {
                ArrayList<Integer> arrayList = this.c1;
                iIntValue = arrayList.get(arrayList.size() - 1).intValue();
            }
            int i2 = this.E;
            if (iIntValue != i2 && i2 != -1) {
                this.c1.add(Integer.valueOf(i2));
            }
        }
        s0();
        Runnable runnable = this.L0;
        if (runnable != null) {
            runnable.run();
            this.L0 = null;
        }
        int[] iArr = this.M0;
        if (iArr == null || this.N0 <= 0) {
            return;
        }
        D0(iArr[0]);
        int[] iArr2 = this.M0;
        System.arraycopy(iArr2, 1, iArr2, 0, iArr2.length - 1);
        this.N0--;
    }

    public int[] getConstraintSetIds() {
        l lVar = this.z;
        if (lVar == null) {
            return null;
        }
        return lVar.m();
    }

    public int getCurrentState() {
        return this.E;
    }

    public ArrayList<l.b> getDefinedTransitions() {
        l lVar = this.z;
        if (lVar == null) {
            return null;
        }
        return lVar.n();
    }

    public e73 getDesignTool() {
        if (this.e0 == null) {
            this.e0 = new e73(this);
        }
        return this.e0;
    }

    public int getEndState() {
        return this.F;
    }

    protected long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.N;
    }

    public l getScene() {
        return this.z;
    }

    public int getStartState() {
        return this.D;
    }

    public float getTargetPosition() {
        return this.P;
    }

    public Bundle getTransitionState() {
        if (this.K0 == null) {
            this.K0 = new h();
        }
        this.K0.c();
        return this.K0.b();
    }

    public long getTransitionTimeMs() {
        l lVar = this.z;
        if (lVar != null) {
            this.L = lVar.o() / 1000.0f;
        }
        return (long) (this.L * 1000.0f);
    }

    public float getVelocity() {
        return this.C;
    }

    public void i0(int i2, boolean z, float f2) {
        i iVar = this.T;
        if (iVar != null) {
            iVar.d(this, i2, z, f2);
        }
        CopyOnWriteArrayList<i> copyOnWriteArrayList = this.t0;
        if (copyOnWriteArrayList != null) {
            Iterator<i> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().d(this, i2, z, f2);
            }
        }
    }

    void j0(int i2, float f2, float f3, float f4, float[] fArr) {
        HashMap<View, j> map = this.J;
        View viewM = m(i2);
        j jVar = map.get(viewM);
        if (jVar != null) {
            jVar.l(f2, f3, f4, fArr);
            float y = viewM.getY();
            this.U = f2;
            this.V = y;
            return;
        }
        if (viewM != null) {
            viewM.getContext().getResources().getResourceName(i2);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(i2);
    }

    public androidx.constraintlayout.widget.c k0(int i2) {
        l lVar = this.z;
        if (lVar == null) {
            return null;
        }
        return lVar.k(i2);
    }

    j l0(int i2) {
        return this.J.get(findViewById(i2));
    }

    public l.b m0(int i2) {
        return this.z.F(i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        l.b bVar;
        int i2;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            this.T0 = display.getRotation();
        }
        l lVar = this.z;
        if (lVar != null && (i2 = this.E) != -1) {
            androidx.constraintlayout.widget.c cVarK = lVar.k(i2);
            this.z.S(this);
            ArrayList<wz7> arrayList = this.s0;
            if (arrayList != null) {
                Iterator<wz7> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().A(this);
                }
            }
            if (cVarK != null) {
                cVarK.i(this);
            }
            this.D = this.E;
        }
        r0();
        h hVar = this.K0;
        if (hVar != null) {
            if (this.V0) {
                post(new b());
                return;
            } else {
                hVar.a();
                return;
            }
        }
        l lVar2 = this.z;
        if (lVar2 == null || (bVar = lVar2.c) == null || bVar.x() != 4) {
            return;
        }
        A0();
        setState(TransitionState.SETUP);
        setState(TransitionState.MOVING);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        m mVarB;
        int iQ;
        RectF rectFP;
        l lVar = this.z;
        if (lVar != null && this.I) {
            o oVar = lVar.r;
            if (oVar != null) {
                oVar.g(motionEvent);
            }
            l.b bVar = this.z.c;
            if (bVar != null && bVar.C() && (mVarB = bVar.B()) != null && ((motionEvent.getAction() != 0 || (rectFP = mVarB.p(this, new RectF())) == null || rectFP.contains(motionEvent.getX(), motionEvent.getY())) && (iQ = mVarB.q()) != -1)) {
                View view = this.a1;
                if (view == null || view.getId() != iQ) {
                    this.a1 = findViewById(iQ);
                }
                View view2 = this.a1;
                if (view2 != null) {
                    this.Z0.set(view2.getLeft(), this.a1.getTop(), this.a1.getRight(), this.a1.getBottom());
                    if (this.Z0.contains(motionEvent.getX(), motionEvent.getY()) && !n0(this.a1.getLeft(), this.a1.getTop(), this.a1, motionEvent)) {
                        return onTouchEvent(motionEvent);
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) throws Throwable {
        MotionLayout motionLayout;
        this.J0 = true;
        try {
            if (this.z == null) {
                super.onLayout(z, i2, i3, i4, i5);
                this.J0 = false;
                return;
            }
            motionLayout = this;
            int i6 = i4 - i2;
            int i7 = i5 - i3;
            try {
                if (motionLayout.i0 != i6 || motionLayout.j0 != i7) {
                    t0();
                    d0(true);
                }
                motionLayout.i0 = i6;
                motionLayout.j0 = i7;
                motionLayout.g0 = i6;
                motionLayout.h0 = i7;
                motionLayout.J0 = false;
                return;
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            motionLayout = this;
        }
        Throwable th3 = th;
        motionLayout.J0 = false;
        throw th3;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        if (this.z == null) {
            super.onMeasure(i2, i3);
            return;
        }
        boolean z = false;
        boolean z2 = (this.G == i2 && this.H == i3) ? false : true;
        if (this.Y0) {
            this.Y0 = false;
            r0();
            s0();
            z2 = true;
        }
        if (this.h) {
            z2 = true;
        }
        this.G = i2;
        this.H = i3;
        int iE = this.z.E();
        int iP = this.z.p();
        if ((z2 || this.X0.f(iE, iP)) && this.D != -1) {
            super.onMeasure(i2, i3);
            this.X0.e(this.c, this.z.k(iE), this.z.k(iP));
            this.X0.h();
            this.X0.i(iE, iP);
        } else {
            if (z2) {
                super.onMeasure(i2, i3);
            }
            z = true;
        }
        if (this.A0 || z) {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int iA0 = this.c.a0() + getPaddingLeft() + getPaddingRight();
            int iZ = this.c.z() + paddingTop;
            int i4 = this.F0;
            if (i4 == Integer.MIN_VALUE || i4 == 0) {
                int i5 = this.B0;
                iA0 = (int) (i5 + (this.H0 * (this.D0 - i5)));
                requestLayout();
            }
            int i6 = this.G0;
            if (i6 == Integer.MIN_VALUE || i6 == 0) {
                int i7 = this.C0;
                iZ = (int) (i7 + (this.H0 * (this.E0 - i7)));
                requestLayout();
            }
            setMeasuredDimension(iA0, iZ);
        }
        e0();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    @Override // com.google.inputmethod.af8
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr, int i4) {
        l.b bVar;
        m mVarB;
        int iQ;
        l lVar = this.z;
        if (lVar == null || (bVar = lVar.c) == null || !bVar.C()) {
            return;
        }
        int i5 = -1;
        if (!bVar.C() || (mVarB = bVar.B()) == null || (iQ = mVarB.q()) == -1 || view.getId() == iQ) {
            if (lVar.v()) {
                m mVarB2 = bVar.B();
                if (mVarB2 != null && (mVarB2.e() & 4) != 0) {
                    i5 = i3;
                }
                float f2 = this.M;
                if ((f2 == 1.0f || f2 == 0.0f) && view.canScrollVertically(i5)) {
                    return;
                }
            }
            if (bVar.B() != null && (bVar.B().e() & 1) != 0) {
                float fW = lVar.w(i2, i3);
                float f3 = this.N;
                if ((f3 <= 0.0f && fW < 0.0f) || (f3 >= 1.0f && fW > 0.0f)) {
                    view.setNestedScrollingEnabled(false);
                    view.post(new a(view));
                    return;
                }
            }
            float f4 = this.M;
            long nanoTime = getNanoTime();
            float f5 = i2;
            this.l0 = f5;
            float f6 = i3;
            this.m0 = f6;
            this.o0 = (float) ((nanoTime - this.n0) * 1.0E-9d);
            this.n0 = nanoTime;
            lVar.O(f5, f6);
            if (f4 != this.M) {
                iArr[0] = i2;
                iArr[1] = i3;
            }
            d0(false);
            if (iArr[0] == 0 && iArr[1] == 0) {
                return;
            }
            this.k0 = true;
        }
    }

    @Override // com.google.inputmethod.af8
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5, int i6) {
    }

    @Override // com.google.inputmethod.af8
    public void onNestedScrollAccepted(View view, View view2, int i2, int i3) {
        this.n0 = getNanoTime();
        this.o0 = 0.0f;
        this.l0 = 0.0f;
        this.m0 = 0.0f;
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i2) {
        l lVar = this.z;
        if (lVar != null) {
            lVar.V(p());
        }
    }

    @Override // com.google.inputmethod.af8
    public boolean onStartNestedScroll(View view, View view2, int i2, int i3) {
        l.b bVar;
        l lVar = this.z;
        return (lVar == null || (bVar = lVar.c) == null || bVar.B() == null || (this.z.c.B().e() & 2) != 0) ? false : true;
    }

    @Override // com.google.inputmethod.af8
    public void onStopNestedScroll(View view, int i2) {
        l lVar = this.z;
        if (lVar != null) {
            float f2 = this.o0;
            if (f2 == 0.0f) {
                return;
            }
            lVar.P(this.l0 / f2, this.m0 / f2);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        l lVar = this.z;
        if (lVar == null || !this.I || !lVar.a0()) {
            return super.onTouchEvent(motionEvent);
        }
        l.b bVar = this.z.c;
        if (bVar != null && !bVar.C()) {
            return super.onTouchEvent(motionEvent);
        }
        this.z.Q(motionEvent, getCurrentState(), this);
        if (this.z.c.D(4)) {
            return this.z.c.B().r();
        }
        return true;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof wz7) {
            wz7 wz7Var = (wz7) view;
            if (this.t0 == null) {
                this.t0 = new CopyOnWriteArrayList<>();
            }
            this.t0.add(wz7Var);
            if (wz7Var.z()) {
                if (this.q0 == null) {
                    this.q0 = new ArrayList<>();
                }
                this.q0.add(wz7Var);
            }
            if (wz7Var.y()) {
                if (this.r0 == null) {
                    this.r0 = new ArrayList<>();
                }
                this.r0.add(wz7Var);
            }
            if (wz7Var.x()) {
                if (this.s0 == null) {
                    this.s0 = new ArrayList<>();
                }
                this.s0.add(wz7Var);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<wz7> arrayList = this.q0;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<wz7> arrayList2 = this.r0;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    public boolean p0() {
        return this.I;
    }

    protected f q0() {
        return g.e();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    protected void r(int i2) {
        this.k = null;
    }

    void r0() {
        l lVar = this.z;
        if (lVar == null) {
            return;
        }
        if (lVar.g(this, this.E)) {
            requestLayout();
            return;
        }
        int i2 = this.E;
        if (i2 != -1) {
            this.z.f(this, i2);
        }
        if (this.z.a0()) {
            this.z.Y();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        l lVar;
        l.b bVar;
        if (!this.A0 && this.E == -1 && (lVar = this.z) != null && (bVar = lVar.c) != null) {
            int iZ = bVar.z();
            if (iZ == 0) {
                return;
            }
            if (iZ == 2) {
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    this.J.get(getChildAt(i2)).w();
                }
                return;
            }
        }
        super.requestLayout();
    }

    public void setDebugMode(int i2) {
        this.W = i2;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z) {
        this.V0 = z;
    }

    public void setInteractionEnabled(boolean z) {
        this.I = z;
    }

    public void setInterpolatedProgress(float f2) {
        if (this.z != null) {
            setState(TransitionState.MOVING);
            Interpolator interpolatorR = this.z.r();
            if (interpolatorR != null) {
                setProgress(interpolatorR.getInterpolation(f2));
                return;
            }
        }
        setProgress(f2);
    }

    public void setOnHide(float f2) {
        ArrayList<wz7> arrayList = this.r0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.r0.get(i2).setProgress(f2);
            }
        }
    }

    public void setOnShow(float f2) {
        ArrayList<wz7> arrayList = this.q0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.q0.get(i2).setProgress(f2);
            }
        }
    }

    public void setProgress(float f2) {
        if (f2 >= 0.0f) {
            int i2 = (f2 > 1.0f ? 1 : (f2 == 1.0f ? 0 : -1));
        }
        if (!isAttachedToWindow()) {
            if (this.K0 == null) {
                this.K0 = new h();
            }
            this.K0.e(f2);
            return;
        }
        if (f2 <= 0.0f) {
            if (this.N == 1.0f && this.E == this.F) {
                setState(TransitionState.MOVING);
            }
            this.E = this.D;
            if (this.N == 0.0f) {
                setState(TransitionState.FINISHED);
            }
        } else if (f2 >= 1.0f) {
            if (this.N == 0.0f && this.E == this.D) {
                setState(TransitionState.MOVING);
            }
            this.E = this.F;
            if (this.N == 1.0f) {
                setState(TransitionState.FINISHED);
            }
        } else {
            this.E = -1;
            setState(TransitionState.MOVING);
        }
        if (this.z == null) {
            return;
        }
        this.Q = true;
        this.P = f2;
        this.M = f2;
        this.O = -1L;
        this.K = -1L;
        this.A = null;
        this.R = true;
        invalidate();
    }

    public void setScene(l lVar) {
        this.z = lVar;
        lVar.V(p());
        t0();
    }

    void setStartState(int i2) {
        if (isAttachedToWindow()) {
            this.E = i2;
            return;
        }
        if (this.K0 == null) {
            this.K0 = new h();
        }
        this.K0.f(i2);
        this.K0.d(i2);
    }

    void setState(TransitionState transitionState) {
        TransitionState transitionState2 = TransitionState.FINISHED;
        if (transitionState == transitionState2 && this.E == -1) {
            return;
        }
        TransitionState transitionState3 = this.W0;
        this.W0 = transitionState;
        TransitionState transitionState4 = TransitionState.MOVING;
        if (transitionState3 == transitionState4 && transitionState == transitionState4) {
            f0();
        }
        int iOrdinal = transitionState3.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 && transitionState == transitionState2) {
                g0();
                return;
            }
            return;
        }
        if (transitionState == transitionState4) {
            f0();
        }
        if (transitionState == transitionState2) {
            g0();
        }
    }

    public void setTransition(int i2) {
        float f2;
        if (this.z != null) {
            l.b bVarM0 = m0(i2);
            this.D = bVarM0.A();
            this.F = bVarM0.y();
            if (!isAttachedToWindow()) {
                if (this.K0 == null) {
                    this.K0 = new h();
                }
                this.K0.f(this.D);
                this.K0.d(this.F);
                return;
            }
            int i3 = this.E;
            if (i3 == this.D) {
                f2 = 0.0f;
            } else {
                f2 = i3 == this.F ? 1.0f : Float.NaN;
            }
            this.z.X(bVarM0);
            this.X0.e(this.c, this.z.k(this.D), this.z.k(this.F));
            t0();
            if (this.N != f2) {
                if (f2 == 0.0f) {
                    c0(true);
                    this.z.k(this.D).i(this);
                } else if (f2 == 1.0f) {
                    c0(false);
                    this.z.k(this.F).i(this);
                }
            }
            this.N = Float.isNaN(f2) ? 0.0f : f2;
            if (!Float.isNaN(f2)) {
                setProgress(f2);
            } else {
                hq2.b();
                C0();
            }
        }
    }

    public void setTransitionDuration(int i2) {
        l lVar = this.z;
        if (lVar == null) {
            return;
        }
        lVar.U(i2);
    }

    public void setTransitionListener(i iVar) {
        this.T = iVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.K0 == null) {
            this.K0 = new h();
        }
        this.K0.g(bundle);
        if (isAttachedToWindow()) {
            this.K0.a();
        }
    }

    public void t0() {
        this.X0.h();
        invalidate();
    }

    @Override // android.view.View
    public String toString() {
        Context context = getContext();
        return hq2.c(context, this.D) + "->" + hq2.c(context, this.F) + " (pos:" + this.N + " Dpos/Dt:" + this.C;
    }

    public void u0(float f2, float f3) {
        if (!isAttachedToWindow()) {
            if (this.K0 == null) {
                this.K0 = new h();
            }
            this.K0.e(f2);
            this.K0.h(f3);
            return;
        }
        setProgress(f2);
        setState(TransitionState.MOVING);
        this.C = f3;
        if (f3 != 0.0f) {
            W(f3 > 0.0f ? 1.0f : 0.0f);
        } else {
            if (f2 == 0.0f || f2 == 1.0f) {
                return;
            }
            W(f2 > 0.5f ? 1.0f : 0.0f);
        }
    }

    public void v0(int i2, int i3, int i4) {
        setState(TransitionState.SETUP);
        this.E = i2;
        this.D = -1;
        this.F = -1;
        androidx.constraintlayout.widget.b bVar = this.k;
        if (bVar != null) {
            bVar.d(i2, i3, i4);
            return;
        }
        l lVar = this.z;
        if (lVar != null) {
            lVar.k(i2).i(this);
        }
    }

    public void w0(int i2, int i3) {
        if (!isAttachedToWindow()) {
            if (this.K0 == null) {
                this.K0 = new h();
            }
            this.K0.f(i2);
            this.K0.d(i3);
            return;
        }
        l lVar = this.z;
        if (lVar != null) {
            this.D = i2;
            this.F = i3;
            lVar.W(i2, i3);
            this.X0.e(this.c, this.z.k(i2), this.z.k(i3));
            t0();
            this.N = 0.0f;
            C0();
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003b  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c6  */
    public void z0(int i2, float f2, float f3) {
        float f4;
        if (this.z == null || this.N == f2) {
            return;
        }
        this.b0 = true;
        this.K = getNanoTime();
        this.L = this.z.o() / 1000.0f;
        this.P = f2;
        this.R = true;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            if (i2 != 1 || i2 == 7) {
                f4 = 0.0f;
            } else {
                if (i2 == 2 || i2 == 6) {
                    f2 = 1.0f;
                }
                f4 = f2;
            }
            if (this.z.j() == 0) {
                this.c0.b(this.N, f4, f3, this.L, this.z.t(), this.z.u());
            } else {
                this.c0.d(this.N, f4, f3, this.z.A(), this.z.B(), this.z.z(), this.z.C(), this.z.y());
            }
            int i3 = this.E;
            this.P = f4;
            this.E = i3;
            this.A = this.c0;
        } else if (i2 == 4) {
            this.d0.b(f3, this.N, this.z.t());
            this.A = this.d0;
        } else if (i2 != 5) {
            if (i2 == 6 || i2 == 7) {
                if (i2 != 1) {
                    f4 = 0.0f;
                } else {
                    f4 = 0.0f;
                }
                if (this.z.j() == 0) {
                    this.c0.b(this.N, f4, f3, this.L, this.z.t(), this.z.u());
                } else {
                    this.c0.d(this.N, f4, f3, this.z.A(), this.z.B(), this.z.z(), this.z.C(), this.z.y());
                }
                int i4 = this.E;
                this.P = f4;
                this.E = i4;
                this.A = this.c0;
            }
        } else if (J0(f3, this.N, this.z.t())) {
            this.d0.b(f3, this.N, this.z.t());
            this.A = this.d0;
        } else {
            this.c0.b(this.N, f2, f3, this.L, this.z.t(), this.z.u());
            this.C = 0.0f;
            int i5 = this.E;
            this.P = f2;
            this.E = i5;
            this.A = this.c0;
        }
        this.Q = false;
        this.K = getNanoTime();
        invalidate();
    }

    @Override // com.google.inputmethod.bf8
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        if (this.k0 || i2 != 0 || i3 != 0) {
            iArr[0] = iArr[0] + i4;
            iArr[1] = iArr[1] + i5;
        }
        this.k0 = false;
    }

    protected void setTransition(l.b bVar) {
        this.z.X(bVar);
        setState(TransitionState.SETUP);
        if (this.E == this.z.p()) {
            this.N = 1.0f;
            this.M = 1.0f;
            this.P = 1.0f;
        } else {
            this.N = 0.0f;
            this.M = 0.0f;
            this.P = 0.0f;
        }
        this.O = bVar.D(1) ? -1L : getNanoTime();
        int iE = this.z.E();
        int iP = this.z.p();
        if (iE == this.D && iP == this.F) {
            return;
        }
        this.D = iE;
        this.F = iP;
        this.z.W(iE, iP);
        this.X0.e(this.c, this.z.k(this.D), this.z.k(this.F));
        this.X0.i(this.D, this.F);
        this.X0.h();
        t0();
    }
}
