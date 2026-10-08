package androidx.lifecycle;

import com.google.inputmethod.n17;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Deprecated
class r implements i {
    private final Object a;
    private final a.C0092a b;

    r(Object obj) {
        this.a = obj;
        this.b = a.c.c(obj.getClass());
    }

    @Override // androidx.lifecycle.i
    public void d6(n17 n17Var, Lifecycle.Event event) {
        this.b.a(n17Var, event, this.a);
    }
}
