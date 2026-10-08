package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.google.inputmethod.hj2;
import com.google.inputmethod.ind;
import java.util.HashMap;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class d {
    public static float u = Float.NaN;
    public ConstraintWidget a;
    public int b;
    public int c;
    public int d;
    public int e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public int r;
    private final HashMap<String, hj2> s;
    public String t;

    public d() {
        this.a = null;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = Float.NaN;
        this.g = Float.NaN;
        this.h = Float.NaN;
        this.i = Float.NaN;
        this.j = Float.NaN;
        this.k = Float.NaN;
        this.l = Float.NaN;
        this.m = Float.NaN;
        this.n = Float.NaN;
        this.o = Float.NaN;
        this.p = Float.NaN;
        this.q = Float.NaN;
        this.r = 0;
        this.s = new HashMap<>();
        this.t = null;
    }

    private static void a(StringBuilder sb, String str, float f) {
        if (Float.isNaN(f)) {
            return;
        }
        sb.append(str);
        sb.append(": ");
        sb.append(f);
        sb.append(",\n");
    }

    private static void b(StringBuilder sb, String str, int i) {
        sb.append(str);
        sb.append(": ");
        sb.append(i);
        sb.append(",\n");
    }

    private void e(StringBuilder sb, ConstraintAnchor.Type type) {
        ConstraintAnchor constraintAnchorQ = this.a.q(type);
        if (constraintAnchorQ == null || constraintAnchorQ.f == null) {
            return;
        }
        sb.append("Anchor");
        sb.append(type.name());
        sb.append(": ['");
        String str = constraintAnchorQ.f.h().o;
        if (str == null) {
            str = "#PARENT";
        }
        sb.append(str);
        sb.append("', '");
        sb.append(constraintAnchorQ.f.k().name());
        sb.append("', '");
        sb.append(constraintAnchorQ.g);
        sb.append("'],\n");
    }

    public boolean c() {
        return Float.isNaN(this.h) && Float.isNaN(this.i) && Float.isNaN(this.j) && Float.isNaN(this.k) && Float.isNaN(this.l) && Float.isNaN(this.m) && Float.isNaN(this.n) && Float.isNaN(this.o) && Float.isNaN(this.p);
    }

    public StringBuilder d(StringBuilder sb, boolean z) {
        sb.append("{\n");
        b(sb, "left", this.b);
        b(sb, "top", this.c);
        b(sb, "right", this.d);
        b(sb, "bottom", this.e);
        a(sb, "pivotX", this.f);
        a(sb, "pivotY", this.g);
        a(sb, "rotationX", this.h);
        a(sb, "rotationY", this.i);
        a(sb, "rotationZ", this.j);
        a(sb, "translationX", this.k);
        a(sb, "translationY", this.l);
        a(sb, "translationZ", this.m);
        a(sb, "scaleX", this.n);
        a(sb, "scaleY", this.o);
        a(sb, "alpha", this.p);
        b(sb, "visibility", this.r);
        a(sb, "interpolatedPos", this.q);
        if (this.a != null) {
            for (ConstraintAnchor.Type type : ConstraintAnchor.Type.values()) {
                e(sb, type);
            }
        }
        if (z) {
            a(sb, "phone_orientation", u);
        }
        if (z) {
            a(sb, "phone_orientation", u);
        }
        if (this.s.size() != 0) {
            sb.append("custom : {\n");
            for (String str : this.s.keySet()) {
                hj2 hj2Var = this.s.get(str);
                sb.append(str);
                sb.append(": ");
                switch (hj2Var.h()) {
                    case 900:
                        sb.append(hj2Var.e());
                        sb.append(",\n");
                        break;
                    case 901:
                    case 905:
                        sb.append(hj2Var.d());
                        sb.append(",\n");
                        break;
                    case 902:
                        sb.append("'");
                        sb.append(hj2.a(hj2Var.e()));
                        sb.append("',\n");
                        break;
                    case 903:
                        sb.append("'");
                        sb.append(hj2Var.g());
                        sb.append("',\n");
                        break;
                    case 904:
                        sb.append("'");
                        sb.append(hj2Var.c());
                        sb.append("',\n");
                        break;
                }
            }
            sb.append("}\n");
        }
        sb.append("}\n");
        return sb;
    }

    public void f(String str, int i, float f) {
        if (this.s.containsKey(str)) {
            this.s.get(str).i(f);
        } else {
            this.s.put(str, new hj2(str, i, f));
        }
    }

    public void g(String str, int i, int i2) {
        if (this.s.containsKey(str)) {
            this.s.get(str).j(i2);
        } else {
            this.s.put(str, new hj2(str, i, i2));
        }
    }

    void h(ind indVar) {
    }

    public d i() {
        ConstraintWidget constraintWidget = this.a;
        if (constraintWidget != null) {
            this.b = constraintWidget.G();
            this.c = this.a.U();
            this.d = this.a.P();
            this.e = this.a.t();
            j(this.a.n);
        }
        return this;
    }

    public void j(d dVar) {
        if (dVar == null) {
            return;
        }
        this.f = dVar.f;
        this.g = dVar.g;
        this.h = dVar.h;
        this.i = dVar.i;
        this.j = dVar.j;
        this.k = dVar.k;
        this.l = dVar.l;
        this.m = dVar.m;
        this.n = dVar.n;
        this.o = dVar.o;
        this.p = dVar.p;
        this.r = dVar.r;
        h(null);
        this.s.clear();
        for (hj2 hj2Var : dVar.s.values()) {
            this.s.put(hj2Var.f(), hj2Var.b());
        }
    }

    public d(ConstraintWidget constraintWidget) {
        this.a = null;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = Float.NaN;
        this.g = Float.NaN;
        this.h = Float.NaN;
        this.i = Float.NaN;
        this.j = Float.NaN;
        this.k = Float.NaN;
        this.l = Float.NaN;
        this.m = Float.NaN;
        this.n = Float.NaN;
        this.o = Float.NaN;
        this.p = Float.NaN;
        this.q = Float.NaN;
        this.r = 0;
        this.s = new HashMap<>();
        this.t = null;
        this.a = constraintWidget;
    }

    public d(d dVar) {
        this.a = null;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = Float.NaN;
        this.g = Float.NaN;
        this.h = Float.NaN;
        this.i = Float.NaN;
        this.j = Float.NaN;
        this.k = Float.NaN;
        this.l = Float.NaN;
        this.m = Float.NaN;
        this.n = Float.NaN;
        this.o = Float.NaN;
        this.p = Float.NaN;
        this.q = Float.NaN;
        this.r = 0;
        this.s = new HashMap<>();
        this.t = null;
        this.a = dVar.a;
        this.b = dVar.b;
        this.c = dVar.c;
        this.d = dVar.d;
        this.e = dVar.e;
        j(dVar);
    }
}
