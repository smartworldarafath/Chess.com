package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.inputmethod.imb;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class o {
    private final MotionLayout a;
    private HashSet<View> c;
    ArrayList<n.b> e;
    private ArrayList<n> b = new ArrayList<>();
    private String d = "ViewTransitionController";
    ArrayList<n.b> f = new ArrayList<>();

    class a implements imb.a {
        final /* synthetic */ n a;
        final /* synthetic */ int b;
        final /* synthetic */ boolean c;
        final /* synthetic */ int d;

        a(n nVar, int i, boolean z, int i2) {
            this.a = nVar;
            this.b = i;
            this.c = z;
            this.d = i2;
        }
    }

    public o(MotionLayout motionLayout) {
        this.a = motionLayout;
    }

    private void e(n nVar, boolean z) {
        ConstraintLayout.getSharedValues().a(nVar.h(), new a(nVar, nVar.h(), z, nVar.g()));
    }

    private void i(n nVar, View... viewArr) {
        int currentState = this.a.getCurrentState();
        if (nVar.e == 2) {
            nVar.c(this, this.a, currentState, null, viewArr);
            return;
        }
        if (currentState == -1) {
            this.a.toString();
            return;
        }
        androidx.constraintlayout.widget.c cVarK0 = this.a.k0(currentState);
        if (cVarK0 == null) {
            return;
        }
        nVar.c(this, this.a, currentState, cVarK0, viewArr);
    }

    public void a(n nVar) {
        this.b.add(nVar);
        this.c = null;
        if (nVar.i() == 4) {
            e(nVar, true);
        } else if (nVar.i() == 5) {
            e(nVar, false);
        }
    }

    void b(n.b bVar) {
        if (this.e == null) {
            this.e = new ArrayList<>();
        }
        this.e.add(bVar);
    }

    void c() {
        ArrayList<n.b> arrayList = this.e;
        if (arrayList == null) {
            return;
        }
        Iterator<n.b> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.e.removeAll(this.f);
        this.f.clear();
        if (this.e.isEmpty()) {
            this.e = null;
        }
    }

    void d() {
        this.a.invalidate();
    }

    void f(n.b bVar) {
        this.f.add(bVar);
    }

    void g(MotionEvent motionEvent) {
        int currentState = this.a.getCurrentState();
        if (currentState == -1) {
            return;
        }
        if (this.c == null) {
            this.c = new HashSet<>();
            for (n nVar : this.b) {
                int childCount = this.a.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = this.a.getChildAt(i);
                    if (nVar.j(childAt)) {
                        childAt.getId();
                        this.c.add(childAt);
                    }
                }
            }
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        Rect rect = new Rect();
        int action = motionEvent.getAction();
        ArrayList<n.b> arrayList = this.e;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<n.b> it = this.e.iterator();
            while (it.hasNext()) {
                it.next().d(action, x, y);
            }
        }
        if (action == 0 || action == 1) {
            androidx.constraintlayout.widget.c cVarK0 = this.a.k0(currentState);
            for (n nVar2 : this.b) {
                if (nVar2.l(action)) {
                    for (View view : this.c) {
                        if (nVar2.j(view)) {
                            view.getHitRect(rect);
                            if (rect.contains((int) x, (int) y)) {
                                nVar2.c(this, this.a, currentState, cVarK0, view);
                            }
                        }
                    }
                }
            }
        }
    }

    void h(int i, View... viewArr) {
        ArrayList arrayList = new ArrayList();
        for (n nVar : this.b) {
            if (nVar.e() == i) {
                for (View view : viewArr) {
                    if (nVar.d(view)) {
                        arrayList.add(view);
                    }
                }
                if (!arrayList.isEmpty()) {
                    i(nVar, (View[]) arrayList.toArray(new View[0]));
                    arrayList.clear();
                }
            }
        }
    }
}
