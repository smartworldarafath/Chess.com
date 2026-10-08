package androidx.lifecycle;

import com.google.inputmethod.exa;
import com.google.inputmethod.mn8;
import com.google.inputmethod.u48;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class o<T> extends u48<T> {
    private exa<n<?>, a<?>> l = new exa<>();

    private static class a<V> implements mn8<V> {
        final n<V> a;
        final mn8<? super V> b;
        int c = -1;

        a(n<V> nVar, mn8<? super V> mn8Var) {
            this.a = nVar;
            this.b = mn8Var;
        }

        @Override // com.google.inputmethod.mn8
        public void a(V v) {
            if (this.c != this.a.g()) {
                this.c = this.a.g();
                this.b.a(v);
            }
        }

        void b() {
            this.a.j(this);
        }

        void c() {
            this.a.n(this);
        }
    }

    @Override // androidx.lifecycle.n
    protected void k() {
        Iterator<Map.Entry<n<?>, a<?>>> it = this.l.iterator();
        while (it.hasNext()) {
            it.next().getValue().b();
        }
    }

    @Override // androidx.lifecycle.n
    protected void l() {
        Iterator<Map.Entry<n<?>, a<?>>> it = this.l.iterator();
        while (it.hasNext()) {
            it.next().getValue().c();
        }
    }

    public <S> void p(n<S> nVar, mn8<? super S> mn8Var) {
        if (nVar == null) {
            throw new NullPointerException("source cannot be null");
        }
        a<?> aVar = new a<>(nVar, mn8Var);
        a<?> aVarI = this.l.i(nVar, aVar);
        if (aVarI != null && aVarI.b != mn8Var) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (aVarI == null && h()) {
            aVar.b();
        }
    }
}
