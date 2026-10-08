package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.google.inputmethod.lo6;
import com.google.inputmethod.pae;
import com.google.inputmethod.ul3;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
class i implements Comparable<i> {
    static String[] D = {"position", "x", "y", "width", "height", "pathRotate"};
    int c;
    private ul3 t;
    private float v;
    private float w;
    private float x;
    private float y;
    private float z;
    public float a = 0.0f;
    int b = 0;
    LinkedHashMap<String, ConstraintAttribute> d = new LinkedHashMap<>();
    int e = 0;
    double[] f = new double[18];
    double[] g = new double[18];
    private float h = 1.0f;
    private boolean i = false;
    private float j = 0.0f;
    private float k = 0.0f;
    private float l = 0.0f;
    private float m = 1.0f;
    private float n = 1.0f;
    private float o = Float.NaN;
    private float p = Float.NaN;
    private float q = 0.0f;
    private float r = 0.0f;
    private float s = 0.0f;
    private int u = 0;
    private float A = Float.NaN;
    private float B = Float.NaN;
    private int C = -1;

    i() {
    }

    private boolean g(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return Float.isNaN(f) != Float.isNaN(f2);
        }
        return Math.abs(f - f2) > 1.0E-6f;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void a(HashMap<String, pae> map, int i) {
        for (String str : map.keySet()) {
            pae paeVar = map.get(str);
            if (paeVar != null) {
                str.getClass();
                byte b = -1;
                switch (str.hashCode()) {
                    case -1249320806:
                        if (str.equals("rotationX")) {
                            b = 0;
                        }
                        break;
                    case -1249320805:
                        if (str.equals("rotationY")) {
                            b = 1;
                        }
                        break;
                    case -1225497657:
                        if (str.equals("translationX")) {
                            b = 2;
                        }
                        break;
                    case -1225497656:
                        if (str.equals("translationY")) {
                            b = 3;
                        }
                        break;
                    case -1225497655:
                        if (str.equals("translationZ")) {
                            b = 4;
                        }
                        break;
                    case -1001078227:
                        if (str.equals("progress")) {
                            b = 5;
                        }
                        break;
                    case -908189618:
                        if (str.equals("scaleX")) {
                            b = 6;
                        }
                        break;
                    case -908189617:
                        if (str.equals("scaleY")) {
                            b = 7;
                        }
                        break;
                    case -760884510:
                        if (str.equals("transformPivotX")) {
                            b = 8;
                        }
                        break;
                    case -760884509:
                        if (str.equals("transformPivotY")) {
                            b = 9;
                        }
                        break;
                    case -40300674:
                        if (str.equals("rotation")) {
                            b = 10;
                        }
                        break;
                    case -4379043:
                        if (str.equals("elevation")) {
                            b = 11;
                        }
                        break;
                    case 37232917:
                        if (str.equals("transitionPathRotate")) {
                            b = 12;
                        }
                        break;
                    case 92909918:
                        if (str.equals("alpha")) {
                            b = 13;
                        }
                        break;
                }
                switch (b) {
                    case 0:
                        paeVar.b(i, Float.isNaN(this.l) ? 0.0f : this.l);
                        break;
                    case 1:
                        paeVar.b(i, Float.isNaN(this.a) ? 0.0f : this.a);
                        break;
                    case 2:
                        paeVar.b(i, Float.isNaN(this.q) ? 0.0f : this.q);
                        break;
                    case 3:
                        paeVar.b(i, Float.isNaN(this.r) ? 0.0f : this.r);
                        break;
                    case 4:
                        paeVar.b(i, Float.isNaN(this.s) ? 0.0f : this.s);
                        break;
                    case 5:
                        paeVar.b(i, Float.isNaN(this.B) ? 0.0f : this.B);
                        break;
                    case 6:
                        paeVar.b(i, Float.isNaN(this.m) ? 1.0f : this.m);
                        break;
                    case 7:
                        paeVar.b(i, Float.isNaN(this.n) ? 1.0f : this.n);
                        break;
                    case 8:
                        paeVar.b(i, Float.isNaN(this.o) ? 0.0f : this.o);
                        break;
                    case lo6.HASACTION_FIELD_NUMBER /* 9 */:
                        paeVar.b(i, Float.isNaN(this.p) ? 0.0f : this.p);
                        break;
                    case lo6.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                        paeVar.b(i, Float.isNaN(this.k) ? 0.0f : this.k);
                        break;
                    case lo6.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                        paeVar.b(i, Float.isNaN(this.j) ? 0.0f : this.j);
                        break;
                    case 12:
                        paeVar.b(i, Float.isNaN(this.A) ? 0.0f : this.A);
                        break;
                    case 13:
                        paeVar.b(i, Float.isNaN(this.h) ? 1.0f : this.h);
                        break;
                    default:
                        if (str.startsWith("CUSTOM")) {
                            String str2 = str.split(",")[1];
                            if (this.d.containsKey(str2)) {
                                ConstraintAttribute constraintAttribute = this.d.get(str2);
                                if (paeVar instanceof pae.b) {
                                    ((pae.b) paeVar).h(i, constraintAttribute);
                                } else {
                                    constraintAttribute.e();
                                    paeVar.toString();
                                }
                            }
                        }
                        break;
                }
            }
        }
    }

    public void c(View view) {
        this.c = view.getVisibility();
        this.h = view.getVisibility() != 0 ? 0.0f : view.getAlpha();
        this.i = false;
        this.j = view.getElevation();
        this.k = view.getRotation();
        this.l = view.getRotationX();
        this.a = view.getRotationY();
        this.m = view.getScaleX();
        this.n = view.getScaleY();
        this.o = view.getPivotX();
        this.p = view.getPivotY();
        this.q = view.getTranslationX();
        this.r = view.getTranslationY();
        this.s = view.getTranslationZ();
    }

    public void d(androidx.constraintlayout.widget.c.a aVar) {
        androidx.constraintlayout.widget.c.d dVar = aVar.c;
        int i = dVar.c;
        this.b = i;
        int i2 = dVar.b;
        this.c = i2;
        this.h = (i2 == 0 || i != 0) ? dVar.d : 0.0f;
        androidx.constraintlayout.widget.c.e eVar = aVar.f;
        this.i = eVar.m;
        this.j = eVar.n;
        this.k = eVar.b;
        this.l = eVar.c;
        this.a = eVar.d;
        this.m = eVar.e;
        this.n = eVar.f;
        this.o = eVar.g;
        this.p = eVar.h;
        this.q = eVar.j;
        this.r = eVar.k;
        this.s = eVar.l;
        this.t = ul3.c(aVar.d.d);
        androidx.constraintlayout.widget.c.C0071c c0071c = aVar.d;
        this.A = c0071c.i;
        this.u = c0071c.f;
        this.C = c0071c.b;
        this.B = aVar.c.e;
        for (String str : aVar.g.keySet()) {
            ConstraintAttribute constraintAttribute = aVar.g.get(str);
            if (constraintAttribute.g()) {
                this.d.put(str, constraintAttribute);
            }
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compareTo(i iVar) {
        return Float.compare(this.v, iVar.v);
    }

    void h(i iVar, HashSet<String> hashSet) {
        if (g(this.h, iVar.h)) {
            hashSet.add("alpha");
        }
        if (g(this.j, iVar.j)) {
            hashSet.add("elevation");
        }
        int i = this.c;
        int i2 = iVar.c;
        if (i != i2 && this.b == 0 && (i == 0 || i2 == 0)) {
            hashSet.add("alpha");
        }
        if (g(this.k, iVar.k)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.A) || !Float.isNaN(iVar.A)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.B) || !Float.isNaN(iVar.B)) {
            hashSet.add("progress");
        }
        if (g(this.l, iVar.l)) {
            hashSet.add("rotationX");
        }
        if (g(this.a, iVar.a)) {
            hashSet.add("rotationY");
        }
        if (g(this.o, iVar.o)) {
            hashSet.add("transformPivotX");
        }
        if (g(this.p, iVar.p)) {
            hashSet.add("transformPivotY");
        }
        if (g(this.m, iVar.m)) {
            hashSet.add("scaleX");
        }
        if (g(this.n, iVar.n)) {
            hashSet.add("scaleY");
        }
        if (g(this.q, iVar.q)) {
            hashSet.add("translationX");
        }
        if (g(this.r, iVar.r)) {
            hashSet.add("translationY");
        }
        if (g(this.s, iVar.s)) {
            hashSet.add("translationZ");
        }
    }

    void i(float f, float f2, float f3, float f4) {
        this.w = f;
        this.x = f2;
        this.y = f3;
        this.z = f4;
    }

    public void j(Rect rect, View view, int i, float f) {
        i(rect.left, rect.top, rect.width(), rect.height());
        c(view);
        this.o = Float.NaN;
        this.p = Float.NaN;
        if (i == 1) {
            this.k = f - 90.0f;
        } else {
            if (i != 2) {
                return;
            }
            this.k = f + 90.0f;
        }
    }

    public void k(Rect rect, androidx.constraintlayout.widget.c cVar, int i, int i2) {
        i(rect.left, rect.top, rect.width(), rect.height());
        d(cVar.A(i2));
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                }
            }
            float f = this.k + 90.0f;
            this.k = f;
            if (f > 180.0f) {
                this.k = f - 360.0f;
                return;
            }
            return;
        }
        this.k -= 90.0f;
    }

    public void l(View view) {
        i(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        c(view);
    }
}
