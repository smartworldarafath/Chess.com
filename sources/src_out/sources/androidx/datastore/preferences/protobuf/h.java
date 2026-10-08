package androidx.datastore.preferences.protobuf;

import com.google.inputmethod.lo6;
import com.google.inputmethod.lz6;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
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
        this.a.V0(i, 2);
        int iE = 0;
        for (int i3 = 0; i3 < eVar.size(); i3++) {
            iE += CodedOutputStream.e(eVar.getBoolean(i3));
        }
        this.a.X0(iE);
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
        this.a.V0(i, 2);
        int iE = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iE += CodedOutputStream.e(list.get(i3).booleanValue());
        }
        this.a.X0(iE);
        while (i2 < list.size()) {
            this.a.k0(list.get(i2).booleanValue());
            i2++;
        }
    }

    private <V> void S(int i, boolean z, V v, c0.a<Boolean, V> aVar) throws IOException {
        this.a.V0(i, 2);
        this.a.X0(c0.b(aVar, Boolean.valueOf(z), v));
        c0.e(this.a, aVar, Boolean.valueOf(z), v);
    }

    private <V> void T(int i, c0.a<Integer, V> aVar, Map<Integer, V> map) throws IOException {
        int size = map.size();
        int[] iArr = new int[size];
        Iterator<Integer> it = map.keySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            iArr[i2] = it.next().intValue();
            i2++;
        }
        Arrays.sort(iArr);
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = iArr[i3];
            V v = map.get(Integer.valueOf(i4));
            this.a.V0(i, 2);
            this.a.X0(c0.b(aVar, Integer.valueOf(i4), v));
            c0.e(this.a, aVar, Integer.valueOf(i4), v);
        }
    }

    private <V> void U(int i, c0.a<Long, V> aVar, Map<Long, V> map) throws IOException {
        int size = map.size();
        long[] jArr = new long[size];
        Iterator<Long> it = map.keySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            jArr[i2] = it.next().longValue();
            i2++;
        }
        Arrays.sort(jArr);
        for (int i3 = 0; i3 < size; i3++) {
            long j = jArr[i3];
            V v = map.get(Long.valueOf(j));
            this.a.V0(i, 2);
            this.a.X0(c0.b(aVar, Long.valueOf(j), v));
            c0.e(this.a, aVar, Long.valueOf(j), v);
        }
    }

    private <K, V> void V(int i, c0.a<K, V> aVar, Map<K, V> map) throws IOException {
        switch (a.a[aVar.a.ordinal()]) {
            case 1:
                V v = map.get(Boolean.FALSE);
                if (v != null) {
                    S(i, false, v, aVar);
                }
                V v2 = map.get(Boolean.TRUE);
                if (v2 != null) {
                    S(i, true, v2, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                T(i, aVar, map);
                return;
            case 7:
            case 8:
            case lo6.HASACTION_FIELD_NUMBER /* 9 */:
            case lo6.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
            case lo6.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                U(i, aVar, map);
                return;
            case 12:
                W(i, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.a);
        }
    }

    private <V> void W(int i, c0.a<String, V> aVar, Map<String, V> map) throws IOException {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator<String> it = map.keySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            strArr[i2] = it.next();
            i2++;
        }
        Arrays.sort(strArr);
        for (int i3 = 0; i3 < size; i3++) {
            String str = strArr[i3];
            V v = map.get(str);
            this.a.V0(i, 2);
            this.a.X0(c0.b(aVar, str, v));
            c0.e(this.a, aVar, str, v);
        }
    }

    private void X(int i, i iVar, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < iVar.size()) {
                this.a.p0(i, iVar.getDouble(i2));
                i2++;
            }
            return;
        }
        this.a.V0(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < iVar.size(); i3++) {
            iJ += CodedOutputStream.j(iVar.getDouble(i3));
        }
        this.a.X0(iJ);
        while (i2 < iVar.size()) {
            this.a.q0(iVar.getDouble(i2));
            i2++;
        }
    }

    private void Y(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.p0(i, list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        this.a.V0(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iJ += CodedOutputStream.j(list.get(i3).doubleValue());
        }
        this.a.X0(iJ);
        while (i2 < list.size()) {
            this.a.q0(list.get(i2).doubleValue());
            i2++;
        }
    }

    private void Z(int i, t tVar, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < tVar.size()) {
                this.a.r0(i, tVar.getInt(i2));
                i2++;
            }
            return;
        }
        this.a.V0(i, 2);
        int iL = 0;
        for (int i3 = 0; i3 < tVar.size(); i3++) {
            iL += CodedOutputStream.l(tVar.getInt(i3));
        }
        this.a.X0(iL);
        while (i2 < tVar.size()) {
            this.a.s0(tVar.getInt(i2));
            i2++;
        }
    }

    private void a0(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.r0(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.a.V0(i, 2);
        int iL = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iL += CodedOutputStream.l(list.get(i3).intValue());
        }
        this.a.X0(iL);
        while (i2 < list.size()) {
            this.a.s0(list.get(i2).intValue());
            i2++;
        }
    }

    private void b0(int i, t tVar, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < tVar.size()) {
                this.a.t0(i, tVar.getInt(i2));
                i2++;
            }
            return;
        }
        this.a.V0(i, 2);
        int iN = 0;
        for (int i3 = 0; i3 < tVar.size(); i3++) {
            iN += CodedOutputStream.n(tVar.getInt(i3));
        }
        this.a.X0(iN);
        while (i2 < tVar.size()) {
            this.a.u0(tVar.getInt(i2));
            i2++;
        }
    }

    private void c0(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.t0(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.a.V0(i, 2);
        int iN = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iN += CodedOutputStream.n(list.get(i3).intValue());
        }
        this.a.X0(iN);
        while (i2 < list.size()) {
            this.a.u0(list.get(i2).intValue());
            i2++;
        }
    }

    private void d0(int i, a0 a0Var, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < a0Var.size()) {
                this.a.v0(i, a0Var.getLong(i2));
                i2++;
            }
            return;
        }
        this.a.V0(i, 2);
        int iP = 0;
        for (int i3 = 0; i3 < a0Var.size(); i3++) {
            iP += CodedOutputStream.p(a0Var.getLong(i3));
        }
        this.a.X0(iP);
        while (i2 < a0Var.size()) {
            this.a.w0(a0Var.getLong(i2));
            i2++;
        }
    }

    private void e0(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.v0(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.a.V0(i, 2);
        int iP = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iP += CodedOutputStream.p(list.get(i3).longValue());
        }
        this.a.X0(iP);
        while (i2 < list.size()) {
            this.a.w0(list.get(i2).longValue());
            i2++;
        }
    }

    private void f0(int i, r rVar, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < rVar.size()) {
                this.a.x0(i, rVar.d(i2));
                i2++;
            }
            return;
        }
        this.a.V0(i, 2);
        int iR = 0;
        for (int i3 = 0; i3 < rVar.size(); i3++) {
            iR += CodedOutputStream.r(rVar.d(i3));
        }
        this.a.X0(iR);
        while (i2 < rVar.size()) {
            this.a.y0(rVar.d(i2));
            i2++;
        }
    }

    private void g0(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.x0(i, list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        this.a.V0(i, 2);
        int iR = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iR += CodedOutputStream.r(list.get(i3).floatValue());
        }
        this.a.X0(iR);
        while (i2 < list.size()) {
            this.a.y0(list.get(i2).floatValue());
            i2++;
        }
    }

    private void h0(int i, t tVar, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < tVar.size()) {
                this.a.D0(i, tVar.getInt(i2));
                i2++;
            }
            return;
        }
        this.a.V0(i, 2);
        int iW = 0;
        for (int i3 = 0; i3 < tVar.size(); i3++) {
            iW += CodedOutputStream.w(tVar.getInt(i3));
        }
        this.a.X0(iW);
        while (i2 < tVar.size()) {
            this.a.E0(tVar.getInt(i2));
            i2++;
        }
    }

    private void i0(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.D0(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.a.V0(i, 2);
        int iW = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iW += CodedOutputStream.w(list.get(i3).intValue());
        }
        this.a.X0(iW);
        while (i2 < list.size()) {
            this.a.E0(list.get(i2).intValue());
            i2++;
        }
    }

    private void j0(int i, a0 a0Var, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < a0Var.size()) {
                this.a.F0(i, a0Var.getLong(i2));
                i2++;
            }
            return;
        }
        this.a.V0(i, 2);
        int iY = 0;
        for (int i3 = 0; i3 < a0Var.size(); i3++) {
            iY += CodedOutputStream.y(a0Var.getLong(i3));
        }
        this.a.X0(iY);
        while (i2 < a0Var.size()) {
            this.a.G0(a0Var.getLong(i2));
            i2++;
        }
    }

    private void k0(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.F0(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.a.V0(i, 2);
        int iY = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iY += CodedOutputStream.y(list.get(i3).longValue());
        }
        this.a.X0(iY);
        while (i2 < list.size()) {
            this.a.G0(list.get(i2).longValue());
            i2++;
        }
    }

    private void l0(int i, Object obj) throws IOException {
        if (obj instanceof String) {
            this.a.T0(i, (String) obj);
        } else {
            this.a.n0(i, (ByteString) obj);
        }
    }

    private void m0(int i, t tVar, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < tVar.size()) {
                this.a.L0(i, tVar.getInt(i2));
                i2++;
            }
            return;
        }
        this.a.V0(i, 2);
        int iL = 0;
        for (int i3 = 0; i3 < tVar.size(); i3++) {
            iL += CodedOutputStream.L(tVar.getInt(i3));
        }
        this.a.X0(iL);
        while (i2 < tVar.size()) {
            this.a.M0(tVar.getInt(i2));
            i2++;
        }
    }

    private void n0(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.L0(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.a.V0(i, 2);
        int iL = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iL += CodedOutputStream.L(list.get(i3).intValue());
        }
        this.a.X0(iL);
        while (i2 < list.size()) {
            this.a.M0(list.get(i2).intValue());
            i2++;
        }
    }

    private void o0(int i, a0 a0Var, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < a0Var.size()) {
                this.a.N0(i, a0Var.getLong(i2));
                i2++;
            }
            return;
        }
        this.a.V0(i, 2);
        int iN = 0;
        for (int i3 = 0; i3 < a0Var.size(); i3++) {
            iN += CodedOutputStream.N(a0Var.getLong(i3));
        }
        this.a.X0(iN);
        while (i2 < a0Var.size()) {
            this.a.O0(a0Var.getLong(i2));
            i2++;
        }
    }

    private void p0(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.N0(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.a.V0(i, 2);
        int iN = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iN += CodedOutputStream.N(list.get(i3).longValue());
        }
        this.a.X0(iN);
        while (i2 < list.size()) {
            this.a.O0(list.get(i2).longValue());
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
        this.a.V0(i, 2);
        int iP = 0;
        for (int i3 = 0; i3 < tVar.size(); i3++) {
            iP += CodedOutputStream.P(tVar.getInt(i3));
        }
        this.a.X0(iP);
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
        this.a.V0(i, 2);
        int iR = 0;
        for (int i3 = 0; i3 < a0Var.size(); i3++) {
            iR += CodedOutputStream.R(a0Var.getLong(i3));
        }
        this.a.X0(iR);
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
        this.a.V0(i, 2);
        int iR = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iR += CodedOutputStream.R(list.get(i3).longValue());
        }
        this.a.X0(iR);
        while (i2 < list.size()) {
            this.a.S0(list.get(i2).longValue());
            i2++;
        }
    }

    private void u0(int i, t tVar, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < tVar.size()) {
                this.a.W0(i, tVar.getInt(i2));
                i2++;
            }
            return;
        }
        this.a.V0(i, 2);
        int iW = 0;
        for (int i3 = 0; i3 < tVar.size(); i3++) {
            iW += CodedOutputStream.W(tVar.getInt(i3));
        }
        this.a.X0(iW);
        while (i2 < tVar.size()) {
            this.a.X0(tVar.getInt(i2));
            i2++;
        }
    }

    private void w0(int i, a0 a0Var, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < a0Var.size()) {
                this.a.Y0(i, a0Var.getLong(i2));
                i2++;
            }
            return;
        }
        this.a.V0(i, 2);
        int iY = 0;
        for (int i3 = 0; i3 < a0Var.size(); i3++) {
            iY += CodedOutputStream.Y(a0Var.getLong(i3));
        }
        this.a.X0(iY);
        while (i2 < a0Var.size()) {
            this.a.Z0(a0Var.getLong(i2));
            i2++;
        }
    }

    private void x0(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.Y0(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.a.V0(i, 2);
        int iY = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iY += CodedOutputStream.Y(list.get(i3).longValue());
        }
        this.a.X0(iY);
        while (i2 < list.size()) {
            this.a.Z0(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void A(int i, List<Long> list, boolean z) throws IOException {
        if (list instanceof a0) {
            o0(i, (a0) list, z);
        } else {
            p0(i, list, z);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public Writer.FieldOrder B() {
        return Writer.FieldOrder.ASCENDING;
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void C(int i, long j) throws IOException {
        this.a.F0(i, j);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void D(int i, List<Integer> list, boolean z) throws IOException {
        if (list instanceof t) {
            m0(i, (t) list, z);
        } else {
            n0(i, list, z);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void E(int i, List<Boolean> list, boolean z) throws IOException {
        if (list instanceof e) {
            Q(i, (e) list, z);
        } else {
            R(i, list, z);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void F(int i, float f) throws IOException {
        this.a.x0(i, f);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void G(int i, int i2) throws IOException {
        this.a.r0(i, i2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void H(int i, List<Long> list, boolean z) throws IOException {
        if (list instanceof a0) {
            j0(i, (a0) list, z);
        } else {
            k0(i, list, z);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void I(int i, int i2) throws IOException {
        this.a.P0(i, i2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void J(int i, ByteString byteString) throws IOException {
        this.a.n0(i, byteString);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void K(int i, Object obj, u0 u0Var) throws IOException {
        this.a.H0(i, (i0) obj, u0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public <K, V> void L(int i, c0.a<K, V> aVar, Map<K, V> map) throws IOException {
        if (this.a.d0()) {
            V(i, aVar, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.a.V0(i, 2);
            this.a.X0(c0.b(aVar, entry.getKey(), entry.getValue()));
            c0.e(this.a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void M(int i, List<?> list, u0 u0Var) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            N(i, list.get(i2), u0Var);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void N(int i, Object obj, u0 u0Var) throws IOException {
        this.a.A0(i, (i0) obj, u0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void O(int i, List<?> list, u0 u0Var) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            K(i, list.get(i2), u0Var);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void a(int i, List<Float> list, boolean z) throws IOException {
        if (list instanceof r) {
            f0(i, (r) list, z);
        } else {
            g0(i, list, z);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void b(int i, Object obj) throws IOException {
        if (obj instanceof ByteString) {
            this.a.K0(i, (ByteString) obj);
        } else {
            this.a.J0(i, (i0) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void c(int i, int i2) throws IOException {
        this.a.t0(i, i2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void d(int i, String str) throws IOException {
        this.a.T0(i, str);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void e(int i, long j) throws IOException {
        this.a.Y0(i, j);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void f(int i, List<Integer> list, boolean z) throws IOException {
        if (list instanceof t) {
            h0(i, (t) list, z);
        } else {
            i0(i, list, z);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void g(int i, int i2) throws IOException {
        this.a.D0(i, i2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void h(int i, List<Integer> list, boolean z) throws IOException {
        if (list instanceof t) {
            b0(i, (t) list, z);
        } else {
            c0(i, list, z);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void i(int i, List<Integer> list, boolean z) throws IOException {
        if (list instanceof t) {
            u0(i, (t) list, z);
        } else {
            v0(i, list, z);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void j(int i, long j) throws IOException {
        this.a.R0(i, j);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void k(int i, int i2) throws IOException {
        this.a.W0(i, i2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void l(int i, List<Long> list, boolean z) throws IOException {
        if (list instanceof a0) {
            w0(i, (a0) list, z);
        } else {
            x0(i, list, z);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void m(int i, long j) throws IOException {
        this.a.v0(i, j);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void n(int i, boolean z) throws IOException {
        this.a.j0(i, z);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void o(int i, int i2) throws IOException {
        this.a.L0(i, i2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    @Deprecated
    public void p(int i) throws IOException {
        this.a.V0(i, 3);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void q(int i, List<Long> list, boolean z) throws IOException {
        if (list instanceof a0) {
            d0(i, (a0) list, z);
        } else {
            e0(i, list, z);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    @Deprecated
    public void r(int i) throws IOException {
        this.a.V0(i, 4);
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
        this.a.V0(i, 2);
        int iP = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iP += CodedOutputStream.P(list.get(i3).intValue());
        }
        this.a.X0(iP);
        while (i2 < list.size()) {
            this.a.Q0(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void s(int i, List<Integer> list, boolean z) throws IOException {
        if (list instanceof t) {
            q0(i, (t) list, z);
        } else {
            r0(i, list, z);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void t(int i, List<Double> list, boolean z) throws IOException {
        if (list instanceof i) {
            X(i, (i) list, z);
        } else {
            Y(i, list, z);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void u(int i, List<ByteString> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.a.n0(i, list.get(i2));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void v(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (!(list instanceof lz6)) {
            while (i2 < list.size()) {
                this.a.T0(i, list.get(i2));
                i2++;
            }
        } else {
            lz6 lz6Var = (lz6) list;
            while (i2 < list.size()) {
                l0(i, lz6Var.m(i2));
                i2++;
            }
        }
    }

    public void v0(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.W0(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.a.V0(i, 2);
        int iW = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iW += CodedOutputStream.W(list.get(i3).intValue());
        }
        this.a.X0(iW);
        while (i2 < list.size()) {
            this.a.X0(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void w(int i, long j) throws IOException {
        this.a.N0(i, j);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void x(int i, List<Long> list, boolean z) throws IOException {
        if (list instanceof a0) {
            s0(i, (a0) list, z);
        } else {
            t0(i, list, z);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void y(int i, List<Integer> list, boolean z) throws IOException {
        if (list instanceof t) {
            Z(i, (t) list, z);
        } else {
            a0(i, list, z);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void z(int i, double d) throws IOException {
        this.a.p0(i, d);
    }
}
