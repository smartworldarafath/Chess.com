package androidx.constraintlayout.core.widgets.analyzer;

import com.google.inputmethod.o43;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class DependencyNode implements o43 {
    WidgetRun d;
    int f;
    public int g;
    public o43 a = null;
    public boolean b = false;
    public boolean c = false;
    Type e = Type.UNKNOWN;
    int h = 1;
    e i = null;
    public boolean j = false;
    List<o43> k = new ArrayList();
    List<DependencyNode> l = new ArrayList();

    enum Type {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public DependencyNode(WidgetRun widgetRun) {
        this.d = widgetRun;
    }

    @Override // com.google.inputmethod.o43
    public void a(o43 o43Var) {
        Iterator<DependencyNode> it = this.l.iterator();
        while (it.hasNext()) {
            if (!it.next().j) {
                return;
            }
        }
        this.c = true;
        o43 o43Var2 = this.a;
        if (o43Var2 != null) {
            o43Var2.a(this);
        }
        if (this.b) {
            this.d.a(this);
            return;
        }
        DependencyNode dependencyNode = null;
        int i = 0;
        for (DependencyNode dependencyNode2 : this.l) {
            if (!(dependencyNode2 instanceof e)) {
                i++;
                dependencyNode = dependencyNode2;
            }
        }
        if (dependencyNode != null && i == 1 && dependencyNode.j) {
            e eVar = this.i;
            if (eVar != null) {
                if (!eVar.j) {
                    return;
                } else {
                    this.f = this.h * eVar.g;
                }
            }
            d(dependencyNode.g + this.f);
        }
        o43 o43Var3 = this.a;
        if (o43Var3 != null) {
            o43Var3.a(this);
        }
    }

    public void b(o43 o43Var) {
        this.k.add(o43Var);
        if (this.j) {
            o43Var.a(o43Var);
        }
    }

    public void c() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.b = false;
    }

    public void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        for (o43 o43Var : this.k) {
            o43Var.a(o43Var);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.b.v());
        sb.append(":");
        sb.append(this.e);
        sb.append("(");
        sb.append(this.j ? Integer.valueOf(this.g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }
}
