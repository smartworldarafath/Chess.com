package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.n;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.inputmethod.az9;
import com.google.inputmethod.hq2;
import com.google.inputmethod.ki6;
import com.google.inputmethod.ul3;
import com.google.inputmethod.v0a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class n {
    private int a;
    int e;
    d f;
    androidx.constraintlayout.widget.c.a g;
    private int j;
    private String k;
    Context o;
    private int b = -1;
    private boolean c = false;
    private int d = 0;
    private int h = -1;
    private int i = -1;
    private int l = 0;
    private String m = null;
    private int n = -1;
    private int p = -1;
    private int q = -1;
    private int r = -1;
    private int s = -1;
    private int t = -1;
    private int u = -1;
    private int v = -1;

    class a implements Interpolator {
        final /* synthetic */ ul3 a;

        a(ul3 ul3Var) {
            this.a = ul3Var;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return (float) this.a.a(f);
        }
    }

    static class b {
        private final int a;
        private final int b;
        long c;
        j d;
        int e;
        int f;
        o h;
        Interpolator i;
        float k;
        float l;
        long m;
        boolean o;
        ki6 g = new ki6();
        boolean j = false;
        Rect n = new Rect();

        b(o oVar, j jVar, int i, int i2, int i3, Interpolator interpolator, int i4, int i5) {
            this.o = false;
            this.h = oVar;
            this.d = jVar;
            this.e = i;
            this.f = i2;
            long jNanoTime = System.nanoTime();
            this.c = jNanoTime;
            this.m = jNanoTime;
            this.h.b(this);
            this.i = interpolator;
            this.a = i4;
            this.b = i5;
            if (i3 == 3) {
                this.o = true;
            }
            this.l = i == 0 ? Float.MAX_VALUE : 1.0f / i;
            a();
        }

        void a() {
            if (this.j) {
                c();
            } else {
                b();
            }
        }

        void b() {
            long jNanoTime = System.nanoTime();
            long j = jNanoTime - this.m;
            this.m = jNanoTime;
            float f = this.k + (((float) (j * 1.0E-6d)) * this.l);
            this.k = f;
            if (f >= 1.0f) {
                this.k = 1.0f;
            }
            Interpolator interpolator = this.i;
            float interpolation = interpolator == null ? this.k : interpolator.getInterpolation(this.k);
            j jVar = this.d;
            boolean zU = jVar.u(jVar.b, interpolation, jNanoTime, this.g);
            if (this.k >= 1.0f) {
                if (this.a != -1) {
                    this.d.s().setTag(this.a, Long.valueOf(System.nanoTime()));
                }
                if (this.b != -1) {
                    this.d.s().setTag(this.b, null);
                }
                if (!this.o) {
                    this.h.f(this);
                }
            }
            if (this.k < 1.0f || zU) {
                this.h.d();
            }
        }

        void c() {
            long jNanoTime = System.nanoTime();
            long j = jNanoTime - this.m;
            this.m = jNanoTime;
            float f = this.k - (((float) (j * 1.0E-6d)) * this.l);
            this.k = f;
            if (f < 0.0f) {
                this.k = 0.0f;
            }
            Interpolator interpolator = this.i;
            float interpolation = interpolator == null ? this.k : interpolator.getInterpolation(this.k);
            j jVar = this.d;
            boolean zU = jVar.u(jVar.b, interpolation, jNanoTime, this.g);
            if (this.k <= 0.0f) {
                if (this.a != -1) {
                    this.d.s().setTag(this.a, Long.valueOf(System.nanoTime()));
                }
                if (this.b != -1) {
                    this.d.s().setTag(this.b, null);
                }
                this.h.f(this);
            }
            if (this.k > 0.0f || zU) {
                this.h.d();
            }
        }

        public void d(int i, float f, float f2) {
            if (i == 1) {
                if (this.j) {
                    return;
                }
                e(true);
            } else {
                if (i != 2) {
                    return;
                }
                this.d.s().getHitRect(this.n);
                if (this.n.contains((int) f, (int) f2) || this.j) {
                    return;
                }
                e(true);
            }
        }

        void e(boolean z) {
            int i;
            this.j = z;
            if (z && (i = this.f) != -1) {
                this.l = i == 0 ? Float.MAX_VALUE : 1.0f / i;
            }
            this.h.d();
            this.m = System.nanoTime();
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008f A[Catch: IOException | XmlPullParserException -> 0x009a, IOException | XmlPullParserException -> 0x009a, TryCatch #0 {IOException | XmlPullParserException -> 0x009a, blocks: (B:3:0x0026, B:11:0x0036, B:11:0x0036, B:33:0x0095, B:33:0x0095, B:14:0x0041, B:14:0x0041, B:15:0x0049, B:15:0x0049, B:32:0x008f, B:32:0x008f, B:17:0x004d, B:17:0x004d, B:22:0x005e, B:22:0x005e, B:20:0x0056, B:20:0x0056, B:23:0x0066, B:23:0x0066, B:25:0x006c, B:25:0x006c, B:26:0x0070, B:26:0x0070, B:28:0x0078, B:28:0x0078, B:29:0x0080, B:29:0x0080, B:31:0x0088, B:31:0x0088), top: B:37:0x0026 }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    n(Context context, XmlPullParser xmlPullParser) {
        this.o = context;
        try {
            int eventType = xmlPullParser.getEventType();
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    switch (name.hashCode()) {
                        case -1962203927:
                            if (!name.equals("ConstraintOverride")) {
                                hq2.a();
                                xmlPullParser.getLineNumber();
                            } else {
                                this.g = androidx.constraintlayout.widget.c.m(context, xmlPullParser);
                            }
                            break;
                        case -1239391468:
                            if (!name.equals("KeyFrameSet")) {
                                hq2.a();
                                xmlPullParser.getLineNumber();
                            } else {
                                this.f = new d(context, xmlPullParser);
                            }
                            break;
                        case 61998586:
                            if (!name.equals("ViewTransition")) {
                                hq2.a();
                                xmlPullParser.getLineNumber();
                            } else {
                                k(context, xmlPullParser);
                            }
                            break;
                        case 366511058:
                            if (!name.equals("CustomMethod")) {
                                hq2.a();
                                xmlPullParser.getLineNumber();
                            } else {
                                ConstraintAttribute.i(context, xmlPullParser, this.g.g);
                            }
                            break;
                        case 1791837707:
                            if (!name.equals("CustomAttribute")) {
                                hq2.a();
                                xmlPullParser.getLineNumber();
                            } else {
                                ConstraintAttribute.i(context, xmlPullParser, this.g.g);
                            }
                            break;
                        default:
                            hq2.a();
                            xmlPullParser.getLineNumber();
                            break;
                    }
                } else if (eventType == 3 && "ViewTransition".equals(xmlPullParser.getName())) {
                    return;
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    public static /* synthetic */ void a(n nVar, View[] viewArr) {
        if (nVar.p != -1) {
            for (View view : viewArr) {
                view.setTag(nVar.p, Long.valueOf(System.nanoTime()));
            }
        }
        if (nVar.q != -1) {
            for (View view2 : viewArr) {
                view2.setTag(nVar.q, null);
            }
        }
    }

    private void k(Context context, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), v0a.I9);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == v0a.J9) {
                this.a = typedArrayObtainStyledAttributes.getResourceId(index, this.a);
            } else if (index == v0a.R9) {
                if (MotionLayout.d1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.j);
                    this.j = resourceId;
                    if (resourceId == -1) {
                        this.k = typedArrayObtainStyledAttributes.getString(index);
                    }
                } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                    this.k = typedArrayObtainStyledAttributes.getString(index);
                } else {
                    this.j = typedArrayObtainStyledAttributes.getResourceId(index, this.j);
                }
            } else if (index == v0a.S9) {
                this.b = typedArrayObtainStyledAttributes.getInt(index, this.b);
            } else if (index == v0a.V9) {
                this.c = typedArrayObtainStyledAttributes.getBoolean(index, this.c);
            } else if (index == v0a.T9) {
                this.d = typedArrayObtainStyledAttributes.getInt(index, this.d);
            } else if (index == v0a.N9) {
                this.h = typedArrayObtainStyledAttributes.getInt(index, this.h);
            } else if (index == v0a.W9) {
                this.i = typedArrayObtainStyledAttributes.getInt(index, this.i);
            } else if (index == v0a.X9) {
                this.e = typedArrayObtainStyledAttributes.getInt(index, this.e);
            } else if (index == v0a.Q9) {
                int i2 = typedArrayObtainStyledAttributes.peekValue(index).type;
                if (i2 == 1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    this.n = resourceId2;
                    if (resourceId2 != -1) {
                        this.l = -2;
                    }
                } else if (i2 == 3) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.m = string;
                    if (string == null || string.indexOf("/") <= 0) {
                        this.l = -1;
                    } else {
                        this.n = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        this.l = -2;
                    }
                } else {
                    this.l = typedArrayObtainStyledAttributes.getInteger(index, this.l);
                }
            } else if (index == v0a.U9) {
                this.p = typedArrayObtainStyledAttributes.getResourceId(index, this.p);
            } else if (index == v0a.M9) {
                this.q = typedArrayObtainStyledAttributes.getResourceId(index, this.q);
            } else if (index == v0a.P9) {
                this.r = typedArrayObtainStyledAttributes.getResourceId(index, this.r);
            } else if (index == v0a.O9) {
                this.s = typedArrayObtainStyledAttributes.getResourceId(index, this.s);
            } else if (index == v0a.L9) {
                this.u = typedArrayObtainStyledAttributes.getResourceId(index, this.u);
            } else if (index == v0a.K9) {
                this.t = typedArrayObtainStyledAttributes.getInteger(index, this.t);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void m(l.b bVar, View view) {
        int i = this.h;
        if (i != -1) {
            bVar.E(i);
        }
        bVar.G(this.d);
        bVar.F(this.l, this.m, this.n);
        int id = view.getId();
        d dVar = this.f;
        if (dVar != null) {
            ArrayList<androidx.constraintlayout.motion.widget.a> arrayListD = dVar.d(-1);
            d dVar2 = new d();
            Iterator<androidx.constraintlayout.motion.widget.a> it = arrayListD.iterator();
            while (it.hasNext()) {
                dVar2.c(it.next().clone().h(id));
            }
            bVar.t(dVar2);
        }
    }

    void b(o oVar, MotionLayout motionLayout, View view) {
        j jVar = new j(view);
        jVar.y(view);
        this.f.a(jVar);
        jVar.F(motionLayout.getWidth(), motionLayout.getHeight(), this.h, System.nanoTime());
        new b(oVar, jVar, this.h, this.i, this.b, f(motionLayout.getContext()), this.p, this.q);
    }

    void c(o oVar, MotionLayout motionLayout, int i, androidx.constraintlayout.widget.c cVar, final View... viewArr) {
        if (this.c) {
            return;
        }
        int i2 = this.e;
        if (i2 == 2) {
            b(oVar, motionLayout, viewArr[0]);
            return;
        }
        if (i2 == 1) {
            for (int i3 : motionLayout.getConstraintSetIds()) {
                if (i3 != i) {
                    androidx.constraintlayout.widget.c cVarK0 = motionLayout.k0(i3);
                    for (View view : viewArr) {
                        androidx.constraintlayout.widget.c.a aVarX = cVarK0.x(view.getId());
                        androidx.constraintlayout.widget.c.a aVar = this.g;
                        if (aVar != null) {
                            aVar.d(aVarX);
                            aVarX.g.putAll(this.g.g);
                        }
                    }
                }
            }
        }
        androidx.constraintlayout.widget.c cVar2 = new androidx.constraintlayout.widget.c();
        cVar2.p(cVar);
        for (View view2 : viewArr) {
            androidx.constraintlayout.widget.c.a aVarX2 = cVar2.x(view2.getId());
            androidx.constraintlayout.widget.c.a aVar2 = this.g;
            if (aVar2 != null) {
                aVar2.d(aVarX2);
                aVarX2.g.putAll(this.g.g);
            }
        }
        motionLayout.H0(i, cVar2);
        motionLayout.H0(az9.b, cVar);
        motionLayout.v0(az9.b, -1, -1);
        l.b bVar = new l.b(-1, motionLayout.z, az9.b, i);
        for (View view3 : viewArr) {
            m(bVar, view3);
        }
        motionLayout.setTransition(bVar);
        motionLayout.B0(new Runnable() { // from class: com.google.android.bbe
            @Override // java.lang.Runnable
            public final void run() {
                n.a(this.a, viewArr);
            }
        });
    }

    boolean d(View view) {
        int i = this.r;
        boolean z = i == -1 || view.getTag(i) != null;
        int i2 = this.s;
        return z && (i2 == -1 || view.getTag(i2) == null);
    }

    int e() {
        return this.a;
    }

    Interpolator f(Context context) {
        int i = this.l;
        if (i == -2) {
            return AnimationUtils.loadInterpolator(context, this.n);
        }
        if (i == -1) {
            return new a(ul3.c(this.m));
        }
        if (i == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i == 1) {
            return new AccelerateInterpolator();
        }
        if (i == 2) {
            return new DecelerateInterpolator();
        }
        if (i == 4) {
            return new BounceInterpolator();
        }
        if (i == 5) {
            return new OvershootInterpolator();
        }
        if (i != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    public int g() {
        return this.t;
    }

    public int h() {
        return this.u;
    }

    public int i() {
        return this.b;
    }

    boolean j(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if ((this.j == -1 && this.k == null) || !d(view)) {
            return false;
        }
        if (view.getId() == this.j) {
            return true;
        }
        return this.k != null && (view.getLayoutParams() instanceof ConstraintLayout.b) && (str = ((ConstraintLayout.b) view.getLayoutParams()).c0) != null && str.matches(this.k);
    }

    boolean l(int i) {
        int i2 = this.b;
        if (i2 == 1) {
            return i == 0;
        }
        if (i2 == 2) {
            return i == 1;
        }
        return i2 == 3 && i == 0;
    }

    public String toString() {
        return "ViewTransition(" + hq2.c(this.o, this.a) + ")";
    }
}
