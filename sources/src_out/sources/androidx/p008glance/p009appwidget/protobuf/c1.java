package androidx.p008glance.p009appwidget.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
class c1 extends a1<b1, b1> {
    c1() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.p008glance.p009appwidget.protobuf.a1
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public b1 g(Object obj) {
        return ((GeneratedMessageLite) obj).unknownFields;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.p008glance.p009appwidget.protobuf.a1
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public int h(b1 b1Var) {
        return b1Var.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.p008glance.p009appwidget.protobuf.a1
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public int i(b1 b1Var) {
        return b1Var.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.p008glance.p009appwidget.protobuf.a1
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public b1 k(b1 b1Var, b1 b1Var2) {
        if (b1.c().equals(b1Var2)) {
            return b1Var;
        }
        return b1.c().equals(b1Var) ? b1.j(b1Var, b1Var2) : b1Var.i(b1Var2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.p008glance.p009appwidget.protobuf.a1
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public b1 n() {
        return b1.k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.p008glance.p009appwidget.protobuf.a1
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void o(Object obj, b1 b1Var) {
        p(obj, b1Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.p008glance.p009appwidget.protobuf.a1
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void p(Object obj, b1 b1Var) {
        ((GeneratedMessageLite) obj).unknownFields = b1Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.p008glance.p009appwidget.protobuf.a1
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public b1 r(b1 b1Var) {
        b1Var.h();
        return b1Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.p008glance.p009appwidget.protobuf.a1
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void s(b1 b1Var, Writer writer) throws IOException {
        b1Var.p(writer);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.p008glance.p009appwidget.protobuf.a1
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void t(b1 b1Var, Writer writer) throws IOException {
        b1Var.r(writer);
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.a1
    void j(Object obj) {
        g(obj).h();
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.a1
    boolean q(t0 t0Var) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.p008glance.p009appwidget.protobuf.a1
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void a(b1 b1Var, int i, int i2) {
        b1Var.n(WireFormat.c(i, 5), Integer.valueOf(i2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.p008glance.p009appwidget.protobuf.a1
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void b(b1 b1Var, int i, long j) {
        b1Var.n(WireFormat.c(i, 1), Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.p008glance.p009appwidget.protobuf.a1
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void c(b1 b1Var, int i, b1 b1Var2) {
        b1Var.n(WireFormat.c(i, 3), b1Var2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.p008glance.p009appwidget.protobuf.a1
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void d(b1 b1Var, int i, ByteString byteString) {
        b1Var.n(WireFormat.c(i, 2), byteString);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.p008glance.p009appwidget.protobuf.a1
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void e(b1 b1Var, int i, long j) {
        b1Var.n(WireFormat.c(i, 0), Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.p008glance.p009appwidget.protobuf.a1
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public b1 f(Object obj) {
        b1 b1VarG = g(obj);
        if (b1VarG != b1.c()) {
            return b1VarG;
        }
        b1 b1VarK = b1.k();
        p(obj, b1VarK);
        return b1VarK;
    }
}
