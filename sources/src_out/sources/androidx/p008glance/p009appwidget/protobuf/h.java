package androidx.p008glance.p009appwidget.protobuf;

import com.google.inputmethod.iz6;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
final class h implements Writer {
    private final CodedOutputStream a;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            a = iArr;
            try {
                iArr[WireFormat.FieldType.h.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[WireFormat.FieldType.g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[WireFormat.FieldType.e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[WireFormat.FieldType.o.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[WireFormat.FieldType.q.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[WireFormat.FieldType.m.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[WireFormat.FieldType.f.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[WireFormat.FieldType.c.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[WireFormat.FieldType.p.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[WireFormat.FieldType.r.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[WireFormat.FieldType.d.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[WireFormat.FieldType.i.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private h(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) u.b(codedOutputStream, "output");
        this.a = codedOutputStream2;
        codedOutputStream2.a = this;
    }

    public static h P(CodedOutputStream codedOutputStream) {
        h hVar = codedOutputStream.a;
        return hVar != null ? hVar : new h(codedOutputStream);
    }

    private void Q(int i, e eVar, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < eVar.size()) {
                this.a.j0(i, eVar.getBoolean(i2));
                i2++;
            }
            return;
        }
        this.a.O0(i, 2);
        int iE = 0;
        for (int i3 = 0; i3 < eVar.size(); i3++) {
            iE += CodedOutputStream.e(eVar.getBoolean(i3));
        }
        this.a.Q0(iE);
        while (i2 < eVar.size()) {
            this.a.k0(eVar.getBoolean(i2));
            i2++;
        }
    }

    private void R(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.j0(i, list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        this.a.O0(i, 2);
        int iE = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iE += CodedOutputStream.e(list.get(i3).booleanValue());
        }
        this.a.Q0(iE);
        while (i2 < list.size()) {
            this.a.k0(list.get(i2).booleanValue());
            i2++;
        }
    }

    private <K, V> void S(int i, c0.a<K, V> aVar, Map<K, V> map) throws IOException {
        int[] iArr = a.a;
        throw null;
    }

    private void T(int i, i iVar, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < iVar.size()) {
                this.a.m0(i, iVar.getDouble(i2));
                i2++;
            }
            return;
        }
        this.a.O0(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < iVar.size(); i3++) {
            iJ += CodedOutputStream.j(iVar.getDouble(i3));
        }
        this.a.Q0(iJ);
        while (i2 < iVar.size()) {
            this.a.n0(iVar.getDouble(i2));
            i2++;
        }
    }

    private void U(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.m0(i, list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        this.a.O0(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iJ += CodedOutputStream.j(list.get(i3).doubleValue());
        }
        this.a.Q0(iJ);
        while (i2 < list.size()) {
            this.a.n0(list.get(i2).doubleValue());
            i2++;
        }
    }

    private void V(int i, t tVar, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < tVar.size()) {
                this.a.o0(i, tVar.getInt(i2));
                i2++;
            }
            return;
        }
        this.a.O0(i, 2);
        int iL = 0;
        for (int i3 = 0; i3 < tVar.size(); i3++) {
            iL += CodedOutputStream.l(tVar.getInt(i3));
        }
        this.a.Q0(iL);
        while (i2 < tVar.size()) {
            this.a.p0(tVar.getInt(i2));
            i2++;
        }
    }

    private void W(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.o0(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.a.O0(i, 2);
        int iL = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iL += CodedOutputStream.l(list.get(i3).intValue());
        }
        this.a.Q0(iL);
        while (i2 < list.size()) {
            this.a.p0(list.get(i2).intValue());
            i2++;
        }
    }

    private void X(int i, t tVar, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < tVar.size()) {
                this.a.q0(i, tVar.getInt(i2));
                i2++;
            }
            return;
        }
        this.a.O0(i, 2);
        int iN = 0;
        for (int i3 = 0; i3 < tVar.size(); i3++) {
            iN += CodedOutputStream.n(tVar.getInt(i3));
        }
        this.a.Q0(iN);
        while (i2 < tVar.size()) {
            this.a.r0(tVar.getInt(i2));
            i2++;
        }
    }

    private void Y(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.q0(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.a.O0(i, 2);
        int iN = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iN += CodedOutputStream.n(list.get(i3).intValue());
        }
        this.a.Q0(iN);
        while (i2 < list.size()) {
            this.a.r0(list.get(i2).intValue());
            i2++;
        }
    }

    private void Z(int i, a0 a0Var, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < a0Var.size()) {
                this.a.s0(i, a0Var.getLong(i2));
                i2++;
            }
            return;
        }
        this.a.O0(i, 2);
        int iP = 0;
        for (int i3 = 0; i3 < a0Var.size(); i3++) {
            iP += CodedOutputStream.p(a0Var.getLong(i3));
        }
        this.a.Q0(iP);
        while (i2 < a0Var.size()) {
            this.a.t0(a0Var.getLong(i2));
            i2++;
        }
    }

    private void a0(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.s0(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.a.O0(i, 2);
        int iP = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iP += CodedOutputStream.p(list.get(i3).longValue());
        }
        this.a.Q0(iP);
        while (i2 < list.size()) {
            this.a.t0(list.get(i2).longValue());
            i2++;
        }
    }

    private void b0(int i, r rVar, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < rVar.size()) {
                this.a.u0(i, rVar.d(i2));
                i2++;
            }
            return;
        }
        this.a.O0(i, 2);
        int iR = 0;
        for (int i3 = 0; i3 < rVar.size(); i3++) {
            iR += CodedOutputStream.r(rVar.d(i3));
        }
        this.a.Q0(iR);
        while (i2 < rVar.size()) {
            this.a.v0(rVar.d(i2));
            i2++;
        }
    }

    private void c0(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.u0(i, list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        this.a.O0(i, 2);
        int iR = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iR += CodedOutputStream.r(list.get(i3).floatValue());
        }
        this.a.Q0(iR);
        while (i2 < list.size()) {
            this.a.v0(list.get(i2).floatValue());
            i2++;
        }
    }

    private void d0(int i, t tVar, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < tVar.size()) {
                this.a.y0(i, tVar.getInt(i2));
                i2++;
            }
            return;
        }
        this.a.O0(i, 2);
        int iW = 0;
        for (int i3 = 0; i3 < tVar.size(); i3++) {
            iW += CodedOutputStream.w(tVar.getInt(i3));
        }
        this.a.Q0(iW);
        while (i2 < tVar.size()) {
            this.a.z0(tVar.getInt(i2));
            i2++;
        }
    }

    private void e0(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.y0(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.a.O0(i, 2);
        int iW = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iW += CodedOutputStream.w(list.get(i3).intValue());
        }
        this.a.Q0(iW);
        while (i2 < list.size()) {
            this.a.z0(list.get(i2).intValue());
            i2++;
        }
    }

    private void f0(int i, a0 a0Var, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < a0Var.size()) {
                this.a.A0(i, a0Var.getLong(i2));
                i2++;
            }
            return;
        }
        this.a.O0(i, 2);
        int iY = 0;
        for (int i3 = 0; i3 < a0Var.size(); i3++) {
            iY += CodedOutputStream.y(a0Var.getLong(i3));
        }
        this.a.Q0(iY);
        while (i2 < a0Var.size()) {
            this.a.B0(a0Var.getLong(i2));
            i2++;
        }
    }

    private void g0(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.A0(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.a.O0(i, 2);
        int iY = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iY += CodedOutputStream.y(list.get(i3).longValue());
        }
        this.a.Q0(iY);
        while (i2 < list.size()) {
            this.a.B0(list.get(i2).longValue());
            i2++;
        }
    }

    private void h0(int i, Object obj) throws IOException {
        if (obj instanceof String) {
            this.a.N0(i, (String) obj);
        } else {
            this.a.l0(i, (ByteString) obj);
        }
    }

    private void i0(int i, t tVar, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < tVar.size()) {
                this.a.F0(i, tVar.getInt(i2));
                i2++;
            }
            return;
        }
        this.a.O0(i, 2);
        int iL = 0;
        for (int i3 = 0; i3 < tVar.size(); i3++) {
            iL += CodedOutputStream.L(tVar.getInt(i3));
        }
        this.a.Q0(iL);
        while (i2 < tVar.size()) {
            this.a.G0(tVar.getInt(i2));
            i2++;
        }
    }

    private void j0(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.F0(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.a.O0(i, 2);
        int iL = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iL += CodedOutputStream.L(list.get(i3).intValue());
        }
        this.a.Q0(iL);
        while (i2 < list.size()) {
            this.a.G0(list.get(i2).intValue());
            i2++;
        }
    }

    private void k0(int i, a0 a0Var, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < a0Var.size()) {
                this.a.H0(i, a0Var.getLong(i2));
                i2++;
            }
            return;
        }
        this.a.O0(i, 2);
        int iN = 0;
        for (int i3 = 0; i3 < a0Var.size(); i3++) {
            iN += CodedOutputStream.N(a0Var.getLong(i3));
        }
        this.a.Q0(iN);
        while (i2 < a0Var.size()) {
            this.a.I0(a0Var.getLong(i2));
            i2++;
        }
    }

    private void l0(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.H0(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.a.O0(i, 2);
        int iN = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iN += CodedOutputStream.N(list.get(i3).longValue());
        }
        this.a.Q0(iN);
        while (i2 < list.size()) {
            this.a.I0(list.get(i2).longValue());
            i2++;
        }
    }

    private void m0(int i, t tVar, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < tVar.size()) {
                this.a.J0(i, tVar.getInt(i2));
                i2++;
            }
            return;
        }
        this.a.O0(i, 2);
        int iP = 0;
        for (int i3 = 0; i3 < tVar.size(); i3++) {
            iP += CodedOutputStream.P(tVar.getInt(i3));
        }
        this.a.Q0(iP);
        while (i2 < tVar.size()) {
            this.a.K0(tVar.getInt(i2));
            i2++;
        }
    }

    private void o0(int i, a0 a0Var, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < a0Var.size()) {
                this.a.L0(i, a0Var.getLong(i2));
                i2++;
            }
            return;
        }
        this.a.O0(i, 2);
        int iR = 0;
        for (int i3 = 0; i3 < a0Var.size(); i3++) {
            iR += CodedOutputStream.R(a0Var.getLong(i3));
        }
        this.a.Q0(iR);
        while (i2 < a0Var.size()) {
            this.a.M0(a0Var.getLong(i2));
            i2++;
        }
    }

    private void p0(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.L0(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.a.O0(i, 2);
        int iR = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iR += CodedOutputStream.R(list.get(i3).longValue());
        }
        this.a.Q0(iR);
        while (i2 < list.size()) {
            this.a.M0(list.get(i2).longValue());
            i2++;
        }
    }

    private void q0(int i, t tVar, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < tVar.size()) {
                this.a.P0(i, tVar.getInt(i2));
                i2++;
            }
            return;
        }
        this.a.O0(i, 2);
        int iW = 0;
        for (int i3 = 0; i3 < tVar.size(); i3++) {
            iW += CodedOutputStream.W(tVar.getInt(i3));
        }
        this.a.Q0(iW);
        while (i2 < tVar.size()) {
            this.a.Q0(tVar.getInt(i2));
            i2++;
        }
    }

    private void s0(int i, a0 a0Var, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < a0Var.size()) {
                this.a.R0(i, a0Var.getLong(i2));
                i2++;
            }
            return;
        }
        this.a.O0(i, 2);
        int iY = 0;
        for (int i3 = 0; i3 < a0Var.size(); i3++) {
            iY += CodedOutputStream.Y(a0Var.getLong(i3));
        }
        this.a.Q0(iY);
        while (i2 < a0Var.size()) {
            this.a.S0(a0Var.getLong(i2));
            i2++;
        }
    }

    private void t0(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.R0(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.a.O0(i, 2);
        int iY = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iY += CodedOutputStream.Y(list.get(i3).longValue());
        }
        this.a.Q0(iY);
        while (i2 < list.size()) {
            this.a.S0(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.Writer
    public void A(int i, List<Long> list, boolean z) throws IOException {
        if (list instanceof a0) {
            k0(i, (a0) list, z);
        } else {
            l0(i, list, z);
        }
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.Writer
    public Writer.FieldOrder B() {
        return Writer.FieldOrder.ASCENDING;
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.Writer
    public void C(int i, long j) throws IOException {
        this.a.A0(i, j);
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.Writer
    public void D(int i, List<Integer> list, boolean z) throws IOException {
        if (list instanceof t) {
            i0(i, (t) list, z);
        } else {
            j0(i, list, z);
        }
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.Writer
    public void E(int i, List<Boolean> list, boolean z) throws IOException {
        if (list instanceof e) {
            Q(i, (e) list, z);
        } else {
            R(i, list, z);
        }
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.Writer
    public void F(int i, float f) throws IOException {
        this.a.u0(i, f);
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.Writer
    public void G(int i, int i2) throws IOException {
        this.a.o0(i, i2);
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.Writer
    public void H(int i, List<Long> list, boolean z) throws IOException {
        if (list instanceof a0) {
            f0(i, (a0) list, z);
        } else {
            g0(i, list, z);
        }
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.Writer
    public void I(int i, int i2) throws IOException {
        this.a.J0(i, i2);
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.Writer
    public void J(int i, Object obj, u0 u0Var) throws IOException {
        this.a.C0(i, (i0) obj, u0Var);
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.Writer
    public void K(int i, ByteString byteString) throws IOException {
        this.a.l0(i, byteString);
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.Writer
    public void L(int i, List<?> list, u0 u0Var) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            O(i, list.get(i2), u0Var);
        }
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.Writer
    public <K, V> void M(int i, c0.a<K, V> aVar, Map<K, V> map) throws IOException {
        if (this.a.d0()) {
            S(i, aVar, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.a.O0(i, 2);
            this.a.Q0(c0.b(aVar, entry.getKey(), entry.getValue()));
            c0.d(this.a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.Writer
    public void N(int i, List<?> list, u0 u0Var) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            J(i, list.get(i2), u0Var);
        }
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.Writer
    public void O(int i, Object obj, u0 u0Var) throws IOException {
        this.a.w0(i, (i0) obj, u0Var);
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.Writer
    public void a(int i, List<Float> list, boolean z) throws IOException {
        if (list instanceof r) {
            b0(i, (r) list, z);
        } else {
            c0(i, list, z);
        }
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.Writer
    public final void b(int i, Object obj) throws IOException {
        if (obj instanceof ByteString) {
            this.a.E0(i, (ByteString) obj);
        } else {
            this.a.D0(i, (i0) obj);
        }
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.Writer
    public void c(int i, int i2) throws IOException {
        this.a.q0(i, i2);
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.Writer
    public void d(int i, String str) throws IOException {
        this.a.N0(i, str);
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.Writer
    public void e(int i, long j) throws IOException {
        this.a.R0(i, j);
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.Writer
    public void f(int i, List<Integer> list, boolean z) throws IOException {
        if (list instanceof t) {
            d0(i, (t) list, z);
        } else {
            e0(i, list, z);
        }
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.Writer
    public void g(int i, int i2) throws IOException {
        this.a.y0(i, i2);
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.Writer
    public void h(int i, List<Integer> list, boolean z) throws IOException {
        if (list instanceof t) {
            X(i, (t) list, z);
        } else {
            Y(i, list, z);
        }
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.Writer
    public void i(int i, List<Integer> list, boolean z) throws IOException {
        if (list instanceof t) {
            q0(i, (t) list, z);
        } else {
            r0(i, list, z);
        }
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.Writer
    public void j(int i, long j) throws IOException {
        this.a.L0(i, j);
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.Writer
    public void k(int i, int i2) throws IOException {
        this.a.P0(i, i2);
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.Writer
    public void l(int i, List<Long> list, boolean z) throws IOException {
        if (list instanceof a0) {
            s0(i, (a0) list, z);
        } else {
            t0(i, list, z);
        }
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.Writer
    public void m(int i, long j) throws IOException {
        this.a.s0(i, j);
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.Writer
    public void n(int i, boolean z) throws IOException {
        this.a.j0(i, z);
    }

    public void n0(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.J0(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.a.O0(i, 2);
        int iP = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iP += CodedOutputStream.P(list.get(i3).intValue());
        }
        this.a.Q0(iP);
        while (i2 < list.size()) {
            this.a.K0(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.Writer
    public void o(int i, int i2) throws IOException {
        this.a.F0(i, i2);
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.Writer
    @Deprecated
    public void p(int i) throws IOException {
        this.a.O0(i, 3);
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.Writer
    public void q(int i, List<Long> list, boolean z) throws IOException {
        if (list instanceof a0) {
            Z(i, (a0) list, z);
        } else {
            a0(i, list, z);
        }
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.Writer
    @Deprecated
    public void r(int i) throws IOException {
        this.a.O0(i, 4);
    }

    public void r0(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.P0(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.a.O0(i, 2);
        int iW = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iW += CodedOutputStream.W(list.get(i3).intValue());
        }
        this.a.Q0(iW);
        while (i2 < list.size()) {
            this.a.Q0(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.Writer
    public void s(int i, List<Integer> list, boolean z) throws IOException {
        if (list instanceof t) {
            m0(i, (t) list, z);
        } else {
            n0(i, list, z);
        }
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.Writer
    public void t(int i, List<Double> list, boolean z) throws IOException {
        if (list instanceof i) {
            T(i, (i) list, z);
        } else {
            U(i, list, z);
        }
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.Writer
    public void u(int i, List<ByteString> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.a.l0(i, list.get(i2));
        }
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.Writer
    public void v(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (!(list instanceof iz6)) {
            while (i2 < list.size()) {
                this.a.N0(i, list.get(i2));
                i2++;
            }
        } else {
            iz6 iz6Var = (iz6) list;
            while (i2 < list.size()) {
                h0(i, iz6Var.m(i2));
                i2++;
            }
        }
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.Writer
    public void w(int i, long j) throws IOException {
        this.a.H0(i, j);
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.Writer
    public void x(int i, List<Long> list, boolean z) throws IOException {
        if (list instanceof a0) {
            o0(i, (a0) list, z);
        } else {
            p0(i, list, z);
        }
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.Writer
    public void y(int i, List<Integer> list, boolean z) throws IOException {
        if (list instanceof t) {
            V(i, (t) list, z);
        } else {
            W(i, list, z);
        }
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.Writer
    public void z(int i, double d) throws IOException {
        this.a.m0(i, d);
    }
}
