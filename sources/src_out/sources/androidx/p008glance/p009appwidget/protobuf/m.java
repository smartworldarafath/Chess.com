package androidx.p008glance.p009appwidget.protobuf;

import androidx.glance.appwidget.protobuf.q.b;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
abstract class m<T extends q.b<T>> {
    m() {
    }

    abstract int a(Map.Entry<?, ?> entry);

    abstract Object b(l lVar, i0 i0Var, int i);

    abstract q<T> c(Object obj);

    abstract q<T> d(Object obj);

    abstract boolean e(i0 i0Var);

    abstract void f(Object obj);

    abstract <UT, UB> UB g(Object obj, t0 t0Var, Object obj2, l lVar, q<T> qVar, UB ub, a1<UT, UB> a1Var) throws IOException;

    abstract void h(t0 t0Var, Object obj, l lVar, q<T> qVar) throws IOException;

    abstract void i(ByteString byteString, Object obj, l lVar, q<T> qVar) throws IOException;

    abstract void j(Writer writer, Map.Entry<?, ?> entry) throws IOException;
}
