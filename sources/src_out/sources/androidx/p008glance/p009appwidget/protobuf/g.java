package androidx.p008glance.p009appwidget.protobuf;

import com.google.inputmethod.iz6;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
final class g implements t0 {
    private final f a;
    private int b;
    private int c;
    private int d = 0;

    private g(f fVar) {
        f fVar2 = (f) u.b(fVar, "input");
        this.a = fVar2;
        fVar2.d = this;
    }

    public static g L(f fVar) {
        g gVar = fVar.d;
        return gVar != null ? gVar : new g(fVar);
    }

    private <T> void M(T t, u0<T> u0Var, l lVar) throws IOException {
        int i = this.c;
        this.c = WireFormat.c(WireFormat.a(this.b), 4);
        try {
            u0Var.i(t, this, lVar);
            if (this.b != this.c) {
                throw InvalidProtocolBufferException.h();
            }
            this.c = i;
        } catch (Throwable th) {
            this.c = i;
            throw th;
        }
    }

    private <T> void N(T t, u0<T> u0Var, l lVar) throws IOException {
        int iD = this.a.D();
        f fVar = this.a;
        if (fVar.a >= fVar.b) {
            throw InvalidProtocolBufferException.i();
        }
        int iM = fVar.m(iD);
        this.a.a++;
        u0Var.i(t, this, lVar);
        this.a.a(0);
        f fVar2 = this.a;
        fVar2.a--;
        fVar2.l(iM);
    }

    private <T> T O(u0<T> u0Var, l lVar) throws IOException {
        T tG = u0Var.g();
        M(tG, u0Var, lVar);
        u0Var.e(tG);
        return tG;
    }

    private <T> T P(u0<T> u0Var, l lVar) throws IOException {
        T tG = u0Var.g();
        N(tG, u0Var, lVar);
        u0Var.e(tG);
        return tG;
    }

    private void R(int i) throws IOException {
        if (this.a.e() != i) {
            throw InvalidProtocolBufferException.m();
        }
    }

    private void S(int i) throws IOException {
        if (WireFormat.b(this.b) != i) {
            throw InvalidProtocolBufferException.e();
        }
    }

    private void T(int i) throws IOException {
        if ((i & 3) != 0) {
            throw InvalidProtocolBufferException.h();
        }
    }

    private void U(int i) throws IOException {
        if ((i & 7) != 0) {
            throw InvalidProtocolBufferException.h();
        }
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.t0
    public void A(List<Integer> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof t)) {
            int iB = WireFormat.b(this.b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.a.D()));
                    if (this.a.f()) {
                        return;
                    } else {
                        iC = this.a.C();
                    }
                } while (iC == this.b);
                this.d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iE = this.a.e() + this.a.D();
            do {
                list.add(Integer.valueOf(this.a.D()));
            } while (this.a.e() < iE);
            R(iE);
            return;
        }
        t tVar = (t) list;
        int iB2 = WireFormat.b(this.b);
        if (iB2 == 0) {
            do {
                tVar.g2(this.a.D());
                if (this.a.f()) {
                    return;
                } else {
                    iC2 = this.a.C();
                }
            } while (iC2 == this.b);
            this.d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iE2 = this.a.e() + this.a.D();
        do {
            tVar.g2(this.a.D());
        } while (this.a.e() < iE2);
        R(iE2);
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.t0
    public long B() throws IOException {
        S(0);
        return this.a.z();
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.t0
    public int C() throws IOException {
        S(5);
        return this.a.w();
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.t0
    public String D() throws IOException {
        S(2);
        return this.a.B();
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.t0
    public <K, V> void E(Map<K, V> map, c0.a<K, V> aVar, l lVar) throws IOException {
        S(2);
        this.a.m(this.a.D());
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.p008glance.p009appwidget.protobuf.t0
    @Deprecated
    public <T> void F(List<T> list, u0<T> u0Var, l lVar) throws IOException {
        int iC;
        if (WireFormat.b(this.b) != 3) {
            throw InvalidProtocolBufferException.e();
        }
        int i = this.b;
        do {
            list.add(O(u0Var, lVar));
            if (this.a.f() || this.d != 0) {
                return;
            } else {
                iC = this.a.C();
            }
        } while (iC == i);
        this.d = iC;
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.t0
    public <T> T G(Class<T> cls, l lVar) throws IOException {
        S(2);
        return (T) P(q0.a().c(cls), lVar);
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.t0
    public <T> void H(T t, u0<T> u0Var, l lVar) throws IOException {
        S(3);
        M(t, u0Var, lVar);
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.t0
    public <T> void I(T t, u0<T> u0Var, l lVar) throws IOException {
        S(2);
        N(t, u0Var, lVar);
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.t0
    @Deprecated
    public <T> T J(Class<T> cls, l lVar) throws IOException {
        S(3);
        return (T) O(q0.a().c(cls), lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.p008glance.p009appwidget.protobuf.t0
    public <T> void K(List<T> list, u0<T> u0Var, l lVar) throws IOException {
        int iC;
        if (WireFormat.b(this.b) != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int i = this.b;
        do {
            list.add(P(u0Var, lVar));
            if (this.a.f() || this.d != 0) {
                return;
            } else {
                iC = this.a.C();
            }
        } while (iC == i);
        this.d = iC;
    }

    public void Q(List<String> list, boolean z) throws IOException {
        int iC;
        int iC2;
        if (WireFormat.b(this.b) != 2) {
            throw InvalidProtocolBufferException.e();
        }
        if (!(list instanceof iz6) || z) {
            do {
                list.add(z ? D() : readString());
                if (this.a.f()) {
                    return;
                } else {
                    iC = this.a.C();
                }
            } while (iC == this.b);
            this.d = iC;
            return;
        }
        iz6 iz6Var = (iz6) list;
        do {
            iz6Var.h0(readBytes());
            if (this.a.f()) {
                return;
            } else {
                iC2 = this.a.C();
            }
        } while (iC2 == this.b);
        this.d = iC2;
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.t0
    public void a(List<Long> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof a0)) {
            int iB = WireFormat.b(this.b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.a.z()));
                    if (this.a.f()) {
                        return;
                    } else {
                        iC = this.a.C();
                    }
                } while (iC == this.b);
                this.d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iE = this.a.e() + this.a.D();
            do {
                list.add(Long.valueOf(this.a.z()));
            } while (this.a.e() < iE);
            R(iE);
            return;
        }
        a0 a0Var = (a0) list;
        int iB2 = WireFormat.b(this.b);
        if (iB2 == 0) {
            do {
                a0Var.f(this.a.z());
                if (this.a.f()) {
                    return;
                } else {
                    iC2 = this.a.C();
                }
            } while (iC2 == this.b);
            this.d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iE2 = this.a.e() + this.a.D();
        do {
            a0Var.f(this.a.z());
        } while (this.a.e() < iE2);
        R(iE2);
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.t0
    public long b() throws IOException {
        S(1);
        return this.a.x();
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.t0
    public int c() throws IOException {
        S(0);
        return this.a.D();
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.t0
    public int d() throws IOException {
        S(0);
        return this.a.q();
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.t0
    public int e() throws IOException {
        S(0);
        return this.a.y();
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.t0
    public void f(List<Boolean> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof e)) {
            int iB = WireFormat.b(this.b);
            if (iB == 0) {
                do {
                    list.add(Boolean.valueOf(this.a.n()));
                    if (this.a.f()) {
                        return;
                    } else {
                        iC = this.a.C();
                    }
                } while (iC == this.b);
                this.d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iE = this.a.e() + this.a.D();
            do {
                list.add(Boolean.valueOf(this.a.n()));
            } while (this.a.e() < iE);
            R(iE);
            return;
        }
        e eVar = (e) list;
        int iB2 = WireFormat.b(this.b);
        if (iB2 == 0) {
            do {
                eVar.c(this.a.n());
                if (this.a.f()) {
                    return;
                } else {
                    iC2 = this.a.C();
                }
            } while (iC2 == this.b);
            this.d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iE2 = this.a.e() + this.a.D();
        do {
            eVar.c(this.a.n());
        } while (this.a.e() < iE2);
        R(iE2);
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.t0
    public void g(List<Integer> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof t)) {
            int iB = WireFormat.b(this.b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.a.y()));
                    if (this.a.f()) {
                        return;
                    } else {
                        iC = this.a.C();
                    }
                } while (iC == this.b);
                this.d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iE = this.a.e() + this.a.D();
            do {
                list.add(Integer.valueOf(this.a.y()));
            } while (this.a.e() < iE);
            R(iE);
            return;
        }
        t tVar = (t) list;
        int iB2 = WireFormat.b(this.b);
        if (iB2 == 0) {
            do {
                tVar.g2(this.a.y());
                if (this.a.f()) {
                    return;
                } else {
                    iC2 = this.a.C();
                }
            } while (iC2 == this.b);
            this.d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iE2 = this.a.e() + this.a.D();
        do {
            tVar.g2(this.a.y());
        } while (this.a.e() < iE2);
        R(iE2);
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.t0
    public int getTag() {
        return this.b;
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.t0
    public long h() throws IOException {
        S(0);
        return this.a.E();
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.t0
    public void i(List<Long> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof a0)) {
            int iB = WireFormat.b(this.b);
            if (iB == 1) {
                do {
                    list.add(Long.valueOf(this.a.x()));
                    if (this.a.f()) {
                        return;
                    } else {
                        iC = this.a.C();
                    }
                } while (iC == this.b);
                this.d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iD = this.a.D();
            U(iD);
            int iE = this.a.e() + iD;
            do {
                list.add(Long.valueOf(this.a.x()));
            } while (this.a.e() < iE);
            return;
        }
        a0 a0Var = (a0) list;
        int iB2 = WireFormat.b(this.b);
        if (iB2 == 1) {
            do {
                a0Var.f(this.a.x());
                if (this.a.f()) {
                    return;
                } else {
                    iC2 = this.a.C();
                }
            } while (iC2 == this.b);
            this.d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iD2 = this.a.D();
        U(iD2);
        int iE2 = this.a.e() + iD2;
        do {
            a0Var.f(this.a.x());
        } while (this.a.e() < iE2);
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.t0
    public void j(List<Integer> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof t)) {
            int iB = WireFormat.b(this.b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.a.u()));
                    if (this.a.f()) {
                        return;
                    } else {
                        iC = this.a.C();
                    }
                } while (iC == this.b);
                this.d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iE = this.a.e() + this.a.D();
            do {
                list.add(Integer.valueOf(this.a.u()));
            } while (this.a.e() < iE);
            R(iE);
            return;
        }
        t tVar = (t) list;
        int iB2 = WireFormat.b(this.b);
        if (iB2 == 0) {
            do {
                tVar.g2(this.a.u());
                if (this.a.f()) {
                    return;
                } else {
                    iC2 = this.a.C();
                }
            } while (iC2 == this.b);
            this.d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iE2 = this.a.e() + this.a.D();
        do {
            tVar.g2(this.a.u());
        } while (this.a.e() < iE2);
        R(iE2);
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.t0
    public void k(List<Integer> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof t)) {
            int iB = WireFormat.b(this.b);
            if (iB == 2) {
                int iD = this.a.D();
                T(iD);
                int iE = this.a.e() + iD;
                do {
                    list.add(Integer.valueOf(this.a.r()));
                } while (this.a.e() < iE);
                return;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(Integer.valueOf(this.a.r()));
                if (this.a.f()) {
                    return;
                } else {
                    iC = this.a.C();
                }
            } while (iC == this.b);
            this.d = iC;
            return;
        }
        t tVar = (t) list;
        int iB2 = WireFormat.b(this.b);
        if (iB2 == 2) {
            int iD2 = this.a.D();
            T(iD2);
            int iE2 = this.a.e() + iD2;
            do {
                tVar.g2(this.a.r());
            } while (this.a.e() < iE2);
            return;
        }
        if (iB2 != 5) {
            throw InvalidProtocolBufferException.e();
        }
        do {
            tVar.g2(this.a.r());
            if (this.a.f()) {
                return;
            } else {
                iC2 = this.a.C();
            }
        } while (iC2 == this.b);
        this.d = iC2;
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.t0
    public int l() throws IOException {
        int i = this.d;
        if (i != 0) {
            this.b = i;
            this.d = 0;
        } else {
            this.b = this.a.C();
        }
        int i2 = this.b;
        if (i2 == 0 || i2 == this.c) {
            return Integer.MAX_VALUE;
        }
        return WireFormat.a(i2);
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.t0
    public void m(List<String> list) throws IOException {
        Q(list, false);
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.t0
    public void n(List<Float> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof r)) {
            int iB = WireFormat.b(this.b);
            if (iB == 2) {
                int iD = this.a.D();
                T(iD);
                int iE = this.a.e() + iD;
                do {
                    list.add(Float.valueOf(this.a.t()));
                } while (this.a.e() < iE);
                return;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(Float.valueOf(this.a.t()));
                if (this.a.f()) {
                    return;
                } else {
                    iC = this.a.C();
                }
            } while (iC == this.b);
            this.d = iC;
            return;
        }
        r rVar = (r) list;
        int iB2 = WireFormat.b(this.b);
        if (iB2 == 2) {
            int iD2 = this.a.D();
            T(iD2);
            int iE2 = this.a.e() + iD2;
            do {
                rVar.c(this.a.t());
            } while (this.a.e() < iE2);
            return;
        }
        if (iB2 != 5) {
            throw InvalidProtocolBufferException.e();
        }
        do {
            rVar.c(this.a.t());
            if (this.a.f()) {
                return;
            } else {
                iC2 = this.a.C();
            }
        } while (iC2 == this.b);
        this.d = iC2;
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.t0
    public boolean o() throws IOException {
        int i;
        if (this.a.f() || (i = this.b) == this.c) {
            return false;
        }
        return this.a.F(i);
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.t0
    public void p(List<ByteString> list) throws IOException {
        int iC;
        if (WireFormat.b(this.b) != 2) {
            throw InvalidProtocolBufferException.e();
        }
        do {
            list.add(readBytes());
            if (this.a.f()) {
                return;
            } else {
                iC = this.a.C();
            }
        } while (iC == this.b);
        this.d = iC;
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.t0
    public void q(List<Double> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof i)) {
            int iB = WireFormat.b(this.b);
            if (iB == 1) {
                do {
                    list.add(Double.valueOf(this.a.p()));
                    if (this.a.f()) {
                        return;
                    } else {
                        iC = this.a.C();
                    }
                } while (iC == this.b);
                this.d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iD = this.a.D();
            U(iD);
            int iE = this.a.e() + iD;
            do {
                list.add(Double.valueOf(this.a.p()));
            } while (this.a.e() < iE);
            return;
        }
        i iVar = (i) list;
        int iB2 = WireFormat.b(this.b);
        if (iB2 == 1) {
            do {
                iVar.c(this.a.p());
                if (this.a.f()) {
                    return;
                } else {
                    iC2 = this.a.C();
                }
            } while (iC2 == this.b);
            this.d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iD2 = this.a.D();
        U(iD2);
        int iE2 = this.a.e() + iD2;
        do {
            iVar.c(this.a.p());
        } while (this.a.e() < iE2);
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.t0
    public long r() throws IOException {
        S(0);
        return this.a.v();
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.t0
    public ByteString readBytes() throws IOException {
        S(2);
        return this.a.o();
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.t0
    public double readDouble() throws IOException {
        S(1);
        return this.a.p();
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.t0
    public int readFixed32() throws IOException {
        S(5);
        return this.a.r();
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.t0
    public long readFixed64() throws IOException {
        S(1);
        return this.a.s();
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.t0
    public float readFloat() throws IOException {
        S(5);
        return this.a.t();
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.t0
    public String readString() throws IOException {
        S(2);
        return this.a.A();
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.t0
    public void s(List<Integer> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof t)) {
            int iB = WireFormat.b(this.b);
            if (iB == 2) {
                int iD = this.a.D();
                T(iD);
                int iE = this.a.e() + iD;
                do {
                    list.add(Integer.valueOf(this.a.w()));
                } while (this.a.e() < iE);
                return;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(Integer.valueOf(this.a.w()));
                if (this.a.f()) {
                    return;
                } else {
                    iC = this.a.C();
                }
            } while (iC == this.b);
            this.d = iC;
            return;
        }
        t tVar = (t) list;
        int iB2 = WireFormat.b(this.b);
        if (iB2 == 2) {
            int iD2 = this.a.D();
            T(iD2);
            int iE2 = this.a.e() + iD2;
            do {
                tVar.g2(this.a.w());
            } while (this.a.e() < iE2);
            return;
        }
        if (iB2 != 5) {
            throw InvalidProtocolBufferException.e();
        }
        do {
            tVar.g2(this.a.w());
            if (this.a.f()) {
                return;
            } else {
                iC2 = this.a.C();
            }
        } while (iC2 == this.b);
        this.d = iC2;
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.t0
    public boolean t() throws IOException {
        S(0);
        return this.a.n();
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.t0
    public void u(List<Long> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof a0)) {
            int iB = WireFormat.b(this.b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.a.E()));
                    if (this.a.f()) {
                        return;
                    } else {
                        iC = this.a.C();
                    }
                } while (iC == this.b);
                this.d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iE = this.a.e() + this.a.D();
            do {
                list.add(Long.valueOf(this.a.E()));
            } while (this.a.e() < iE);
            R(iE);
            return;
        }
        a0 a0Var = (a0) list;
        int iB2 = WireFormat.b(this.b);
        if (iB2 == 0) {
            do {
                a0Var.f(this.a.E());
                if (this.a.f()) {
                    return;
                } else {
                    iC2 = this.a.C();
                }
            } while (iC2 == this.b);
            this.d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iE2 = this.a.e() + this.a.D();
        do {
            a0Var.f(this.a.E());
        } while (this.a.e() < iE2);
        R(iE2);
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.t0
    public void v(List<Long> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof a0)) {
            int iB = WireFormat.b(this.b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.a.v()));
                    if (this.a.f()) {
                        return;
                    } else {
                        iC = this.a.C();
                    }
                } while (iC == this.b);
                this.d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iE = this.a.e() + this.a.D();
            do {
                list.add(Long.valueOf(this.a.v()));
            } while (this.a.e() < iE);
            R(iE);
            return;
        }
        a0 a0Var = (a0) list;
        int iB2 = WireFormat.b(this.b);
        if (iB2 == 0) {
            do {
                a0Var.f(this.a.v());
                if (this.a.f()) {
                    return;
                } else {
                    iC2 = this.a.C();
                }
            } while (iC2 == this.b);
            this.d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iE2 = this.a.e() + this.a.D();
        do {
            a0Var.f(this.a.v());
        } while (this.a.e() < iE2);
        R(iE2);
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.t0
    public void w(List<Integer> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof t)) {
            int iB = WireFormat.b(this.b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.a.q()));
                    if (this.a.f()) {
                        return;
                    } else {
                        iC = this.a.C();
                    }
                } while (iC == this.b);
                this.d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iE = this.a.e() + this.a.D();
            do {
                list.add(Integer.valueOf(this.a.q()));
            } while (this.a.e() < iE);
            R(iE);
            return;
        }
        t tVar = (t) list;
        int iB2 = WireFormat.b(this.b);
        if (iB2 == 0) {
            do {
                tVar.g2(this.a.q());
                if (this.a.f()) {
                    return;
                } else {
                    iC2 = this.a.C();
                }
            } while (iC2 == this.b);
            this.d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iE2 = this.a.e() + this.a.D();
        do {
            tVar.g2(this.a.q());
        } while (this.a.e() < iE2);
        R(iE2);
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.t0
    public void x(List<String> list) throws IOException {
        Q(list, true);
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.t0
    public int y() throws IOException {
        S(0);
        return this.a.u();
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.t0
    public void z(List<Long> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof a0)) {
            int iB = WireFormat.b(this.b);
            if (iB == 1) {
                do {
                    list.add(Long.valueOf(this.a.s()));
                    if (this.a.f()) {
                        return;
                    } else {
                        iC = this.a.C();
                    }
                } while (iC == this.b);
                this.d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iD = this.a.D();
            U(iD);
            int iE = this.a.e() + iD;
            do {
                list.add(Long.valueOf(this.a.s()));
            } while (this.a.e() < iE);
            return;
        }
        a0 a0Var = (a0) list;
        int iB2 = WireFormat.b(this.b);
        if (iB2 == 1) {
            do {
                a0Var.f(this.a.s());
                if (this.a.f()) {
                    return;
                } else {
                    iC2 = this.a.C();
                }
            } while (iC2 == this.b);
            this.d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iD2 = this.a.D();
        U(iD2);
        int iE2 = this.a.e() + iD2;
        do {
            a0Var.f(this.a.s());
        } while (this.a.e() < iE2);
    }
}
