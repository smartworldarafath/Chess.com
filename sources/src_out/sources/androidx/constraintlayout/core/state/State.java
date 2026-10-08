package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.google.inputmethod.bca;
import com.google.inputmethod.gc5;
import com.google.inputmethod.ij4;
import com.google.inputmethod.jf0;
import com.google.inputmethod.lo6;
import com.google.inputmethod.of5;
import com.google.inputmethod.r15;
import com.google.inputmethod.r25;
import com.google.inputmethod.rc;
import com.google.inputmethod.s4e;
import com.google.inputmethod.sc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class State {
    public static final Integer j = 0;
    private boolean a = true;
    protected HashMap<Object, bca> b = new HashMap<>();
    protected HashMap<Object, c> c = new HashMap<>();
    HashMap<String, ArrayList<String>> d = new HashMap<>();
    public final a e;
    private int f;
    ArrayList<Object> g;
    ArrayList<ConstraintWidget> h;
    boolean i;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 androidx.constraintlayout.core.state.State$Chain, still in use, count: 1, list:
  (r0v0 androidx.constraintlayout.core.state.State$Chain) from 0x0044: INVOKE 
  (wrap java.util.Map<java.lang.String, androidx.constraintlayout.core.state.State$Chain>:0x0040: SGET  A[WRAPPED] androidx.constraintlayout.core.state.State.Chain.d java.util.Map)
  ("spread")
  (r0v0 androidx.constraintlayout.core.state.State$Chain)
 INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(K, V):V (c)]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class Chain {
        SPREAD,
        SPREAD_INSIDE,
        PACKED;

        public static Map<String, Chain> d = new HashMap();
        public static Map<String, Integer> e = new HashMap();

        static {
            d.put("packed", new Chain());
            d.put("spread_inside", new Chain());
            d.put("spread", new Chain());
            e.put("packed", 2);
            e.put("spread_inside", 1);
            e.put("spread", 0);
        }

        private Chain() {
            super(str, i);
        }

        public static Chain valueOf(String str) {
            return (Chain) Enum.valueOf(Chain.class, str);
        }

        public static Chain[] values() {
            return (Chain[]) f.clone();
        }
    }

    public enum Constraint {
        LEFT_TO_LEFT,
        LEFT_TO_RIGHT,
        RIGHT_TO_LEFT,
        RIGHT_TO_RIGHT,
        START_TO_START,
        START_TO_END,
        END_TO_START,
        END_TO_END,
        TOP_TO_TOP,
        TOP_TO_BOTTOM,
        TOP_TO_BASELINE,
        BOTTOM_TO_TOP,
        BOTTOM_TO_BOTTOM,
        BOTTOM_TO_BASELINE,
        BASELINE_TO_BASELINE,
        BASELINE_TO_TOP,
        BASELINE_TO_BOTTOM,
        CENTER_HORIZONTALLY,
        CENTER_VERTICALLY,
        CIRCULAR_CONSTRAINT
    }

    public enum Direction {
        LEFT,
        RIGHT,
        START,
        END,
        TOP,
        BOTTOM
    }

    public enum Helper {
        HORIZONTAL_CHAIN,
        VERTICAL_CHAIN,
        ALIGN_HORIZONTALLY,
        ALIGN_VERTICALLY,
        BARRIER,
        LAYER,
        HORIZONTAL_FLOW,
        VERTICAL_FLOW,
        GRID,
        ROW,
        COLUMN,
        FLOW
    }

    public State() {
        a aVar = new a(this);
        this.e = aVar;
        this.f = 0;
        this.g = new ArrayList<>();
        this.h = new ArrayList<>();
        this.i = true;
        Integer num = j;
        aVar.c(num);
        this.b.put(num, aVar);
    }

    private String f() {
        StringBuilder sb = new StringBuilder();
        sb.append("__HELPER_KEY_");
        int i = this.f;
        this.f = i + 1;
        sb.append(i);
        sb.append("__");
        return sb.toString();
    }

    public void a(androidx.constraintlayout.core.widgets.d dVar) {
        c cVar;
        gc5 gc5VarC0;
        gc5 gc5VarC1;
        dVar.C1();
        this.e.x().e(this, dVar, 0);
        this.e.v().e(this, dVar, 1);
        for (Object obj : this.c.keySet()) {
            gc5 gc5VarC2 = this.c.get(obj).c0();
            if (gc5VarC2 != null) {
                bca bcaVarC = this.b.get(obj);
                if (bcaVarC == null) {
                    bcaVarC = c(obj);
                }
                bcaVarC.b(gc5VarC2);
            }
        }
        for (Object obj2 : this.b.keySet()) {
            bca bcaVar = this.b.get(obj2);
            if (bcaVar != this.e && (bcaVar.d() instanceof c) && (gc5VarC1 = ((c) bcaVar.d()).c0()) != null) {
                bca bcaVarC2 = this.b.get(obj2);
                if (bcaVarC2 == null) {
                    bcaVarC2 = c(obj2);
                }
                bcaVarC2.b(gc5VarC1);
            }
        }
        Iterator<Object> it = this.b.keySet().iterator();
        while (it.hasNext()) {
            bca bcaVar2 = this.b.get(it.next());
            if (bcaVar2 != this.e) {
                ConstraintWidget constraintWidgetA = bcaVar2.a();
                constraintWidgetA.J0(bcaVar2.getKey().toString());
                constraintWidgetA.j1(null);
                if (bcaVar2.d() instanceof r25) {
                    bcaVar2.apply();
                }
                dVar.a(constraintWidgetA);
            } else {
                bcaVar2.b(dVar);
            }
        }
        Iterator<Object> it2 = this.c.keySet().iterator();
        while (it2.hasNext()) {
            c cVar2 = this.c.get(it2.next());
            if (cVar2.c0() != null) {
                Iterator<Object> it3 = cVar2.n0.iterator();
                while (it3.hasNext()) {
                    cVar2.c0().a(this.b.get(it3.next()).a());
                }
                cVar2.apply();
            } else {
                cVar2.apply();
            }
        }
        Iterator<Object> it4 = this.b.keySet().iterator();
        while (it4.hasNext()) {
            bca bcaVar3 = this.b.get(it4.next());
            if (bcaVar3 != this.e && (bcaVar3.d() instanceof c) && (gc5VarC0 = (cVar = (c) bcaVar3.d()).c0()) != null) {
                for (Object obj3 : cVar.n0) {
                    bca bcaVar4 = this.b.get(obj3);
                    if (bcaVar4 != null) {
                        gc5VarC0.a(bcaVar4.a());
                    } else if (obj3 instanceof bca) {
                        gc5VarC0.a(((bca) obj3).a());
                    } else {
                        System.out.println("couldn't find reference for " + obj3);
                    }
                }
                bcaVar3.apply();
            }
        }
        for (Object obj4 : this.b.keySet()) {
            bca bcaVar5 = this.b.get(obj4);
            bcaVar5.apply();
            ConstraintWidget constraintWidgetA2 = bcaVar5.a();
            if (constraintWidgetA2 != null && obj4 != null) {
                constraintWidgetA2.o = obj4.toString();
            }
        }
    }

    public jf0 b(Object obj, Direction direction) {
        a aVarC = c(obj);
        if (aVarC.d() == null || !(aVarC.d() instanceof jf0)) {
            jf0 jf0Var = new jf0(this);
            jf0Var.d0(direction);
            aVarC.J(jf0Var);
        }
        return (jf0) aVarC.d();
    }

    public a c(Object obj) {
        bca bcaVarE = this.b.get(obj);
        if (bcaVarE == null) {
            bcaVarE = e(obj);
            this.b.put(obj, bcaVarE);
            bcaVarE.c(obj);
        }
        if (bcaVarE instanceof a) {
            return (a) bcaVarE;
        }
        return null;
    }

    public int d(Object obj) {
        if (obj instanceof Float) {
            return Math.round(((Float) obj).floatValue());
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    public a e(Object obj) {
        return new a(this);
    }

    public r25 g(Object obj, int i) {
        a aVarC = c(obj);
        if (aVarC.d() == null || !(aVarC.d() instanceof r25)) {
            r25 r25Var = new r25(this);
            r25Var.f(i);
            r25Var.c(obj);
            aVarC.J(r25Var);
        }
        return (r25) aVarC.d();
    }

    public State h(b bVar) {
        return m(bVar);
    }

    public c i(Object obj, Helper helper) {
        if (obj == null) {
            obj = f();
        }
        c of5Var = this.c.get(obj);
        if (of5Var == null) {
            switch (helper.ordinal()) {
                case 0:
                    of5Var = new of5(this);
                    break;
                case 1:
                    of5Var = new s4e(this);
                    break;
                case 2:
                    of5Var = new rc(this);
                    break;
                case 3:
                    of5Var = new sc(this);
                    break;
                case 4:
                    of5Var = new jf0(this);
                    break;
                case 5:
                default:
                    of5Var = new c(this, helper);
                    break;
                case 6:
                case 7:
                    of5Var = new ij4(this, helper);
                    break;
                case 8:
                case lo6.HASACTION_FIELD_NUMBER /* 9 */:
                case lo6.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                    of5Var = new r15(this, helper);
                    break;
            }
            of5Var.c(obj);
            this.c.put(obj, of5Var);
        }
        return of5Var;
    }

    public void j(Object obj, Object obj2) {
        a aVarC = c(obj);
        if (aVarC != null) {
            aVarC.Q(obj2);
        }
    }

    bca k(Object obj) {
        return this.b.get(obj);
    }

    public void l() {
        Iterator<Object> it = this.b.keySet().iterator();
        while (it.hasNext()) {
            this.b.get(it.next()).a().x0();
        }
        this.b.clear();
        this.b.put(j, this.e);
        this.c.clear();
        this.d.clear();
        this.g.clear();
        this.i = true;
    }

    public State m(b bVar) {
        this.e.K(bVar);
        return this;
    }

    public void n(String str, String str2) {
        ArrayList<String> arrayList;
        a aVarC = c(str);
        if (aVarC != null) {
            aVarC.N(str2);
            if (this.d.containsKey(str2)) {
                arrayList = this.d.get(str2);
            } else {
                arrayList = new ArrayList<>();
                this.d.put(str2, arrayList);
            }
            arrayList.add(str);
        }
    }

    public State o(b bVar) {
        this.e.R(bVar);
        return this;
    }

    public r25 p(Object obj) {
        return g(obj, 1);
    }

    public State q(b bVar) {
        return o(bVar);
    }
}
