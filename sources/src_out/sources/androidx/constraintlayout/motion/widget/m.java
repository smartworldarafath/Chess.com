package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import com.google.inputmethod.hq2;
import com.google.inputmethod.v0a;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
class m {
    private static final float[][] G = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};
    private static final float[][] H = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};
    private float r;
    private float s;
    private final MotionLayout t;
    private int a = 0;
    private int b = 0;
    private int c = 0;
    private int d = -1;
    private int e = -1;
    private int f = -1;
    private float g = 0.5f;
    private float h = 0.5f;
    float i = 0.5f;
    float j = 0.5f;
    private int k = -1;
    boolean l = false;
    private float m = 0.0f;
    private float n = 1.0f;
    private boolean o = false;
    private float[] p = new float[2];
    private int[] q = new int[2];
    private float u = 4.0f;
    private float v = 1.2f;
    private boolean w = true;
    private float x = 1.0f;
    private int y = 0;
    private float z = 10.0f;
    private float A = 10.0f;
    private float B = 1.0f;
    private float C = Float.NaN;
    private float D = Float.NaN;
    private int E = 0;
    private int F = 0;

    class a implements View.OnTouchListener {
        a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    class b implements NestedScrollView.d {
        b() {
        }

        @Override // androidx.core.widget.NestedScrollView.d
        public void a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        }
    }

    m(Context context, MotionLayout motionLayout, XmlPullParser xmlPullParser) {
        this.t = motionLayout;
        c(context, Xml.asAttributeSet(xmlPullParser));
    }

    private void b(TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (index == v0a.P8) {
                this.d = typedArray.getResourceId(index, this.d);
            } else if (index == v0a.Q8) {
                int i2 = typedArray.getInt(index, this.a);
                this.a = i2;
                float[] fArr = G[i2];
                this.h = fArr[0];
                this.g = fArr[1];
            } else if (index == v0a.A8) {
                int i3 = typedArray.getInt(index, this.b);
                this.b = i3;
                float[][] fArr2 = H;
                if (i3 < fArr2.length) {
                    float[] fArr3 = fArr2[i3];
                    this.m = fArr3[0];
                    this.n = fArr3[1];
                } else {
                    this.n = Float.NaN;
                    this.m = Float.NaN;
                    this.l = true;
                }
            } else if (index == v0a.F8) {
                this.u = typedArray.getFloat(index, this.u);
            } else if (index == v0a.E8) {
                this.v = typedArray.getFloat(index, this.v);
            } else if (index == v0a.G8) {
                this.w = typedArray.getBoolean(index, this.w);
            } else if (index == v0a.B8) {
                this.x = typedArray.getFloat(index, this.x);
            } else if (index == v0a.C8) {
                this.z = typedArray.getFloat(index, this.z);
            } else if (index == v0a.R8) {
                this.e = typedArray.getResourceId(index, this.e);
            } else if (index == v0a.I8) {
                this.c = typedArray.getInt(index, this.c);
            } else if (index == v0a.H8) {
                this.y = typedArray.getInteger(index, 0);
            } else if (index == v0a.D8) {
                this.f = typedArray.getResourceId(index, 0);
            } else if (index == v0a.J8) {
                this.k = typedArray.getResourceId(index, this.k);
            } else if (index == v0a.L8) {
                this.A = typedArray.getFloat(index, this.A);
            } else if (index == v0a.M8) {
                this.B = typedArray.getFloat(index, this.B);
            } else if (index == v0a.N8) {
                this.C = typedArray.getFloat(index, this.C);
            } else if (index == v0a.O8) {
                this.D = typedArray.getFloat(index, this.D);
            } else if (index == v0a.K8) {
                this.E = typedArray.getInt(index, this.E);
            } else if (index == v0a.z8) {
                this.F = typedArray.getInt(index, this.F);
            }
        }
    }

    private void c(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v0a.y8);
        b(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    float a(float f, float f2) {
        return (f * this.m) + (f2 * this.n);
    }

    public int d() {
        return this.F;
    }

    public int e() {
        return this.y;
    }

    RectF f(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i = this.f;
        if (i == -1 || (viewFindViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    float g() {
        return this.v;
    }

    public float h() {
        return this.u;
    }

    boolean i() {
        return this.w;
    }

    float j(float f, float f2) {
        this.t.j0(this.d, this.t.getProgress(), this.h, this.g, this.p);
        float f3 = this.m;
        if (f3 != 0.0f) {
            float[] fArr = this.p;
            if (fArr[0] == 0.0f) {
                fArr[0] = 1.0E-7f;
            }
            return (f * f3) / fArr[0];
        }
        float[] fArr2 = this.p;
        if (fArr2[1] == 0.0f) {
            fArr2[1] = 1.0E-7f;
        }
        return (f2 * this.n) / fArr2[1];
    }

    public int k() {
        return this.E;
    }

    public float l() {
        return this.A;
    }

    public float m() {
        return this.B;
    }

    public float n() {
        return this.C;
    }

    public float o() {
        return this.D;
    }

    RectF p(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i = this.e;
        if (i == -1 || (viewFindViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    int q() {
        return this.e;
    }

    boolean r() {
        return this.o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    void s(MotionEvent motionEvent, MotionLayout.f fVar, int i, l lVar) {
        char c;
        int i2;
        char c2;
        float f;
        char c3;
        if (this.l) {
            t(motionEvent, fVar, i, lVar);
            return;
        }
        fVar.a(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.r = motionEvent.getRawX();
            this.s = motionEvent.getRawY();
            this.o = false;
            return;
        }
        if (action == 1) {
            this.o = false;
            fVar.c(1000);
            float fD = fVar.d();
            float fB = fVar.b();
            float progress = this.t.getProgress();
            int i3 = this.d;
            if (i3 != -1) {
                this.t.j0(i3, progress, this.h, this.g, this.p);
                c = 0;
            } else {
                float fMin = Math.min(this.t.getWidth(), this.t.getHeight());
                float[] fArr = this.p;
                fArr[1] = this.n * fMin;
                c = 0;
                fArr[0] = fMin * this.m;
            }
            float f2 = this.m;
            float[] fArr2 = this.p;
            float fAbs = f2 != 0.0f ? fD / fArr2[c] : fB / fArr2[1];
            float f3 = !Float.isNaN(fAbs) ? (fAbs / 3.0f) + progress : progress;
            if (f3 == 0.0f || f3 == 1.0f || (i2 = this.c) == 3) {
                if (0.0f >= f3 || 1.0f <= f3) {
                    this.t.setState(MotionLayout.TransitionState.FINISHED);
                    return;
                }
                return;
            }
            float f4 = ((double) f3) < 0.5d ? 0.0f : 1.0f;
            if (i2 == 6) {
                if (progress + fAbs < 0.0f) {
                    fAbs = Math.abs(fAbs);
                }
                f4 = 1.0f;
            }
            if (this.c == 7) {
                if (progress + fAbs > 1.0f) {
                    fAbs = -Math.abs(fAbs);
                }
                f4 = 0.0f;
            }
            this.t.z0(this.c, f4, fAbs);
            if (0.0f >= progress || 1.0f <= progress) {
                this.t.setState(MotionLayout.TransitionState.FINISHED);
                return;
            }
            return;
        }
        if (action != 2) {
            return;
        }
        float rawY = motionEvent.getRawY() - this.s;
        float rawX = motionEvent.getRawX() - this.r;
        if (Math.abs((this.m * rawX) + (this.n * rawY)) > this.z || this.o) {
            float progress2 = this.t.getProgress();
            if (!this.o) {
                this.o = true;
                this.t.setProgress(progress2);
            }
            int i4 = this.d;
            if (i4 != -1) {
                c2 = 1;
                c3 = 0;
                f = progress2;
                this.t.j0(i4, f, this.h, this.g, this.p);
            } else {
                c2 = 1;
                f = progress2;
                c3 = 0;
                float fMin2 = Math.min(this.t.getWidth(), this.t.getHeight());
                float[] fArr3 = this.p;
                fArr3[1] = this.n * fMin2;
                fArr3[0] = fMin2 * this.m;
            }
            float f5 = this.m;
            float[] fArr4 = this.p;
            if (Math.abs(((f5 * fArr4[c3]) + (this.n * fArr4[c2])) * this.x) < 0.01d) {
                float[] fArr5 = this.p;
                fArr5[c3] = 0.01f;
                fArr5[c2] = 0.01f;
            }
            float fMax = Math.max(Math.min(f + (this.m != 0.0f ? rawX / this.p[c3] : rawY / this.p[c2]), 1.0f), 0.0f);
            if (this.c == 6) {
                fMax = Math.max(fMax, 0.01f);
            }
            if (this.c == 7) {
                fMax = Math.min(fMax, 0.99f);
            }
            float progress3 = this.t.getProgress();
            if (fMax != progress3) {
                if (progress3 == 0.0f || progress3 == 1.0f) {
                    this.t.c0(progress3 == 0.0f ? c2 : c3);
                }
                this.t.setProgress(fMax);
                fVar.c(1000);
                this.t.C = this.m != 0.0f ? fVar.d() / this.p[c3] : fVar.b() / this.p[c2];
            } else {
                this.t.C = 0.0f;
            }
            this.r = motionEvent.getRawX();
            this.s = motionEvent.getRawY();
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x026f  */
    /* JADX WARN: Code duplicated, block: B:60:0x0289  */
    /* JADX WARN: Code duplicated, block: B:63:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:65:0x02b4  */
    void t(MotionEvent motionEvent, MotionLayout.f fVar, int i, l lVar) {
        float left;
        float f;
        int top;
        int bottom;
        int i2;
        float degrees;
        float f2;
        int i3;
        float f3;
        fVar.a(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.r = motionEvent.getRawX();
            this.s = motionEvent.getRawY();
            this.o = false;
            return;
        }
        if (action != 1) {
            if (action != 2) {
                return;
            }
            motionEvent.getRawY();
            motionEvent.getRawX();
            float width = this.t.getWidth() / 2.0f;
            float height = this.t.getHeight() / 2.0f;
            int i4 = this.k;
            if (i4 != -1) {
                View viewFindViewById = this.t.findViewById(i4);
                this.t.getLocationOnScreen(this.q);
                float left2 = this.q[0] + ((viewFindViewById.getLeft() + viewFindViewById.getRight()) / 2.0f);
                height = ((viewFindViewById.getTop() + viewFindViewById.getBottom()) / 2.0f) + this.q[1];
                width = left2;
            } else {
                int i5 = this.d;
                if (i5 != -1) {
                    View viewFindViewById2 = this.t.findViewById(this.t.l0(i5).h());
                    if (viewFindViewById2 != null) {
                        this.t.getLocationOnScreen(this.q);
                        width = this.q[0] + ((viewFindViewById2.getLeft() + viewFindViewById2.getRight()) / 2.0f);
                        height = this.q[1] + ((viewFindViewById2.getTop() + viewFindViewById2.getBottom()) / 2.0f);
                    }
                }
            }
            float rawX = motionEvent.getRawX() - width;
            float rawY = motionEvent.getRawY() - height;
            double dAtan2 = Math.atan2(motionEvent.getRawY() - height, motionEvent.getRawX() - width);
            float fAtan2 = (float) (((dAtan2 - Math.atan2(this.s - height, this.r - width)) * 180.0d) / 3.141592653589793d);
            if (fAtan2 > 330.0f) {
                fAtan2 -= 360.0f;
            } else if (fAtan2 < -330.0f) {
                fAtan2 += 360.0f;
            }
            if (Math.abs(fAtan2) > 0.01d || this.o) {
                float progress = this.t.getProgress();
                if (!this.o) {
                    this.o = true;
                    this.t.setProgress(progress);
                }
                int i6 = this.d;
                if (i6 != -1) {
                    f3 = progress;
                    this.t.j0(i6, f3, this.h, this.g, this.p);
                    float[] fArr = this.p;
                    fArr[1] = (float) Math.toDegrees(fArr[1]);
                } else {
                    f3 = progress;
                    this.p[1] = 360.0f;
                }
                float fMax = Math.max(Math.min(f3 + ((fAtan2 * this.x) / this.p[1]), 1.0f), 0.0f);
                float progress2 = this.t.getProgress();
                if (fMax != progress2) {
                    if (progress2 == 0.0f || progress2 == 1.0f) {
                        this.t.c0(progress2 == 0.0f);
                    }
                    this.t.setProgress(fMax);
                    fVar.c(1000);
                    float fD = fVar.d();
                    double dB = fVar.b();
                    double d = fD;
                    this.t.C = (float) Math.toDegrees((float) ((Math.hypot(dB, d) * Math.sin(Math.atan2(dB, d) - dAtan2)) / Math.hypot(rawX, rawY)));
                } else {
                    this.t.C = 0.0f;
                }
                this.r = motionEvent.getRawX();
                this.s = motionEvent.getRawY();
                return;
            }
            return;
        }
        this.o = false;
        fVar.c(16);
        float fD2 = fVar.d();
        float fB = fVar.b();
        float progress3 = this.t.getProgress();
        float width2 = this.t.getWidth() / 2.0f;
        float height2 = this.t.getHeight() / 2.0f;
        int i7 = this.k;
        if (i7 == -1) {
            int i8 = this.d;
            if (i8 != -1) {
                View viewFindViewById3 = this.t.findViewById(this.t.l0(i8).h());
                this.t.getLocationOnScreen(this.q);
                left = this.q[0] + ((viewFindViewById3.getLeft() + viewFindViewById3.getRight()) / 2.0f);
                f = this.q[1];
                top = viewFindViewById3.getTop();
                bottom = viewFindViewById3.getBottom();
            }
            float rawX2 = motionEvent.getRawX() - width2;
            float rawY2 = motionEvent.getRawY() - height2;
            double degrees2 = Math.toDegrees(Math.atan2(rawY2, rawX2));
            i2 = this.d;
            if (i2 != -1) {
                this.t.j0(i2, progress3, this.h, this.g, this.p);
                float[] fArr2 = this.p;
                fArr2[1] = (float) Math.toDegrees(fArr2[1]);
            } else {
                this.p[1] = 360.0f;
            }
            degrees = ((float) (Math.toDegrees(Math.atan2(fB + rawY2, fD2 + rawX2)) - degrees2)) * 62.5f;
            if (Float.isNaN(degrees)) {
                f2 = progress3;
            } else {
                f2 = (((degrees * 3.0f) * this.x) / this.p[1]) + progress3;
            }
            if (f2 != 0.0f || f2 == 1.0f || (i3 = this.c) == 3) {
                if (0.0f < f2 || 1.0f <= f2) {
                    this.t.setState(MotionLayout.TransitionState.FINISHED);
                }
                return;
            }
            float fAbs = (degrees * this.x) / this.p[1];
            float f4 = ((double) f2) < 0.5d ? 0.0f : 1.0f;
            if (i3 == 6) {
                if (progress3 + fAbs < 0.0f) {
                    fAbs = Math.abs(fAbs);
                }
                f4 = 1.0f;
            }
            if (this.c == 7) {
                if (progress3 + fAbs > 1.0f) {
                    fAbs = -Math.abs(fAbs);
                }
                f4 = 0.0f;
            }
            this.t.z0(this.c, f4, fAbs * 3.0f);
            if (0.0f >= progress3 || 1.0f <= progress3) {
                this.t.setState(MotionLayout.TransitionState.FINISHED);
                return;
            }
            return;
        }
        View viewFindViewById4 = this.t.findViewById(i7);
        this.t.getLocationOnScreen(this.q);
        left = this.q[0] + ((viewFindViewById4.getLeft() + viewFindViewById4.getRight()) / 2.0f);
        f = this.q[1];
        top = viewFindViewById4.getTop();
        bottom = viewFindViewById4.getBottom();
        float f5 = left;
        height2 = ((top + bottom) / 2.0f) + f;
        width2 = f5;
        float rawX3 = motionEvent.getRawX() - width2;
        float rawY3 = motionEvent.getRawY() - height2;
        double degrees3 = Math.toDegrees(Math.atan2(rawY3, rawX3));
        i2 = this.d;
        if (i2 != -1) {
            this.t.j0(i2, progress3, this.h, this.g, this.p);
            float[] fArr3 = this.p;
            fArr3[1] = (float) Math.toDegrees(fArr3[1]);
        } else {
            this.p[1] = 360.0f;
        }
        degrees = ((float) (Math.toDegrees(Math.atan2(fB + rawY3, fD2 + rawX3)) - degrees3)) * 62.5f;
        if (Float.isNaN(degrees)) {
            f2 = (((degrees * 3.0f) * this.x) / this.p[1]) + progress3;
        } else {
            f2 = progress3;
        }
        if (f2 != 0.0f) {
        }
        if (0.0f < f2) {
        }
        this.t.setState(MotionLayout.TransitionState.FINISHED);
    }

    public String toString() {
        if (Float.isNaN(this.m)) {
            return "rotation";
        }
        return this.m + " , " + this.n;
    }

    void u(float f, float f2) {
        float progress = this.t.getProgress();
        if (!this.o) {
            this.o = true;
            this.t.setProgress(progress);
        }
        this.t.j0(this.d, progress, this.h, this.g, this.p);
        float f3 = this.m;
        float[] fArr = this.p;
        if (Math.abs((f3 * fArr[0]) + (this.n * fArr[1])) < 0.01d) {
            float[] fArr2 = this.p;
            fArr2[0] = 0.01f;
            fArr2[1] = 0.01f;
        }
        float f4 = this.m;
        float fMax = Math.max(Math.min(progress + (f4 != 0.0f ? (f * f4) / this.p[0] : (f2 * this.n) / this.p[1]), 1.0f), 0.0f);
        if (fMax != this.t.getProgress()) {
            this.t.setProgress(fMax);
        }
    }

    void v(float f, float f2) {
        int i;
        this.o = false;
        float progress = this.t.getProgress();
        this.t.j0(this.d, progress, this.h, this.g, this.p);
        float f3 = this.m;
        float[] fArr = this.p;
        float f4 = f3 != 0.0f ? (f * f3) / fArr[0] : (f2 * this.n) / fArr[1];
        if (!Float.isNaN(f4)) {
            progress += f4 / 3.0f;
        }
        if (progress == 0.0f || progress == 1.0f || (i = this.c) == 3) {
            return;
        }
        this.t.z0(i, ((double) progress) >= 0.5d ? 1.0f : 0.0f, f4);
    }

    void w(float f, float f2) {
        this.r = f;
        this.s = f2;
    }

    public void x(boolean z) {
        if (z) {
            float[][] fArr = H;
            fArr[4] = fArr[3];
            fArr[5] = fArr[2];
            float[][] fArr2 = G;
            fArr2[5] = fArr2[2];
            fArr2[6] = fArr2[1];
        } else {
            float[][] fArr3 = H;
            fArr3[4] = fArr3[2];
            fArr3[5] = fArr3[3];
            float[][] fArr4 = G;
            fArr4[5] = fArr4[1];
            fArr4[6] = fArr4[2];
        }
        float[] fArr5 = G[this.a];
        this.h = fArr5[0];
        this.g = fArr5[1];
        int i = this.b;
        float[][] fArr6 = H;
        if (i >= fArr6.length) {
            return;
        }
        float[] fArr7 = fArr6[i];
        this.m = fArr7[0];
        this.n = fArr7[1];
    }

    void y(float f, float f2) {
        this.r = f;
        this.s = f2;
        this.o = false;
    }

    void z() {
        View viewFindViewById;
        int i = this.d;
        if (i != -1) {
            viewFindViewById = this.t.findViewById(i);
            if (viewFindViewById == null) {
                hq2.c(this.t.getContext(), this.d);
            }
        } else {
            viewFindViewById = null;
        }
        if (viewFindViewById instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) viewFindViewById;
            nestedScrollView.setOnTouchListener(new a());
            nestedScrollView.setOnScrollChangeListener(new b());
        }
    }
}
