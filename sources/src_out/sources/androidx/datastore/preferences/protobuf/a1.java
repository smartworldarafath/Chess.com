package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
abstract class a1<T, B> {
    private static volatile int a = 100;

    a1() {
    }

    private final void l(B b, t0 t0Var, int i) throws IOException {
        while (t0Var.l() != Integer.MAX_VALUE && m(b, t0Var, i)) {
        }
    }

    abstract void a(B b, int i, int i2);

    abstract void b(B b, int i, long j);

    abstract void c(B b, int i, T t);

    abstract void d(B b, int i, ByteString byteString);

    abstract void e(B b, int i, long j);

    abstract B f(Object obj);

    abstract T g(Object obj);

    abstract int h(T t);

    abstract int i(T t);

    abstract void j(Object obj);

    abstract T k(T t, T t2);

    final boolean m(B b, t0 t0Var, int i) throws IOException {
        int tag = t0Var.getTag();
        int iA = WireFormat.a(tag);
        int iB = WireFormat.b(tag);
        if (iB == 0) {
            e(b, iA, t0Var.r());
            return true;
        }
        if (iB == 1) {
            b(b, iA, t0Var.readFixed64());
            return true;
        }
        if (iB == 2) {
            d(b, iA, t0Var.readBytes());
            return true;
        }
        if (iB != 3) {
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.e();
            }
            a(b, iA, t0Var.readFixed32());
            return true;
        }
        B bN = n();
        int iC = WireFormat.c(iA, 4);
        int i2 = i + 1;
        if (i2 >= a) {
            throw InvalidProtocolBufferException.i();
        }
        l(bN, t0Var, i2);
        if (iC != t0Var.getTag()) {
            throw InvalidProtocolBufferException.b();
        }
        c(b, iA, r(bN));
        return true;
    }

    abstract B n();

    abstract void o(Object obj, B b);

    abstract void p(Object obj, T t);

    abstract boolean q(t0 t0Var);

    abstract T r(B b);

    abstract void s(T t, Writer writer) throws IOException;

    abstract void t(T t, Writer writer) throws IOException;
}
