package androidx.p008glance.p009appwidget.protobuf;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
final class l0<T> implements u0<T> {
    private final i0 a;
    private final a1<?, ?> b;
    private final boolean c;
    private final m<?> d;

    private l0(a1<?, ?> a1Var, m<?> mVar, i0 i0Var) {
        this.b = a1Var;
        this.c = mVar.e(i0Var);
        this.d = mVar;
        this.a = i0Var;
    }

    private <UT, UB> int j(a1<UT, UB> a1Var, T t) {
        return a1Var.i(a1Var.g(t));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <UT, UB, ET extends q.b<ET>> void k(a1<UT, UB> a1Var, m<ET> mVar, T t, t0 t0Var, l lVar) throws Throwable {
        a1<UT, UB> a1Var2;
        UB ubF = a1Var.f(t);
        Object objD = mVar.d(t);
        while (t0Var.l() != Integer.MAX_VALUE) {
            try {
                a1Var2 = a1Var;
                m<ET> mVar2 = mVar;
                t0 t0Var2 = t0Var;
                l lVar2 = lVar;
                try {
                    if (!m(t0Var2, lVar2, mVar2, objD, a1Var2, ubF)) {
                        a1Var2.o(t, ubF);
                        return;
                    }
                    t0Var = t0Var2;
                    lVar = lVar2;
                    mVar = mVar2;
                    a1Var = a1Var2;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    a1Var2.o(t, ubF);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                a1Var2 = a1Var;
            }
        }
        a1Var.o(t, ubF);
    }

    static <T> l0<T> l(a1<?, ?> a1Var, m<?> mVar, i0 i0Var) {
        return new l0<>(a1Var, mVar, i0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <UT, UB, ET extends q.b<ET>> boolean m(t0 t0Var, l lVar, m<ET> mVar, q<ET> qVar, a1<UT, UB> a1Var, UB ub) throws IOException {
        int tag = t0Var.getTag();
        int iC = 0;
        if (tag != WireFormat.a) {
            if (WireFormat.b(tag) != 2) {
                return t0Var.o();
            }
            Object objB = mVar.b(lVar, this.a, WireFormat.a(tag));
            if (objB == null) {
                return a1Var.m(ub, t0Var, 0);
            }
            mVar.h(t0Var, objB, lVar, qVar);
            return true;
        }
        Object objB2 = null;
        ByteString bytes = null;
        while (t0Var.l() != Integer.MAX_VALUE) {
            int tag2 = t0Var.getTag();
            if (tag2 == WireFormat.c) {
                iC = t0Var.c();
                objB2 = mVar.b(lVar, this.a, iC);
            } else if (tag2 == WireFormat.d) {
                if (objB2 != null) {
                    mVar.h(t0Var, objB2, lVar, qVar);
                } else {
                    bytes = t0Var.readBytes();
                }
            } else if (!t0Var.o()) {
                break;
            }
        }
        if (t0Var.getTag() != WireFormat.b) {
            throw InvalidProtocolBufferException.b();
        }
        if (bytes != null) {
            if (objB2 != null) {
                mVar.i(bytes, objB2, lVar, qVar);
            } else {
                a1Var.d(ub, iC, bytes);
            }
        }
        return true;
    }

    private <UT, UB> void n(a1<UT, UB> a1Var, T t, Writer writer) throws IOException {
        a1Var.s(a1Var.g(t), writer);
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.u0
    public void a(T t, T t2) {
        w0.G(this.b, t, t2);
        if (this.c) {
            w0.E(this.d, t, t2);
        }
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.u0
    public boolean b(T t, T t2) {
        if (!this.b.g(t).equals(this.b.g(t2))) {
            return false;
        }
        if (this.c) {
            return this.d.c(t).equals(this.d.c(t2));
        }
        return true;
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.u0
    public int c(T t) {
        int iHashCode = this.b.g(t).hashCode();
        return this.c ? (iHashCode * 53) + this.d.c(t).hashCode() : iHashCode;
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.u0
    public final boolean d(T t) {
        return this.d.c(t).o();
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.u0
    public void e(T t) {
        this.b.j(t);
        this.d.f(t);
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.u0
    public int f(T t) {
        int iJ = j(this.b, t);
        return this.c ? iJ + this.d.c(t).j() : iJ;
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.u0
    public T g() {
        i0 i0Var = this.a;
        return i0Var instanceof GeneratedMessageLite ? (T) ((GeneratedMessageLite) i0Var).F() : (T) i0Var.newBuilderForType().buildPartial();
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.u0
    public void h(T t, Writer writer) throws IOException {
        Iterator itS = this.d.c(t).s();
        while (itS.hasNext()) {
            Map.Entry entry = (Map.Entry) itS.next();
            q.b bVar = (q.b) entry.getKey();
            if (bVar.f() != WireFormat.JavaType.MESSAGE || bVar.isRepeated() || bVar.isPacked()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof v.b) {
                writer.b(bVar.getNumber(), ((v.b) entry).a().e());
            } else {
                writer.b(bVar.getNumber(), entry.getValue());
            }
        }
        n(this.b, t, writer);
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.u0
    public void i(T t, t0 t0Var, l lVar) throws Throwable {
        k(this.b, this.d, t, t0Var, lVar);
    }
}
