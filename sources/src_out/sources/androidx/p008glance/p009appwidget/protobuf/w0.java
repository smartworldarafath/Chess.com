package androidx.p008glance.p009appwidget.protobuf;

import com.google.inputmethod.iz6;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
final class w0 {
    private static final Class<?> a = B();
    private static final a1<?, ?> b = C();
    private static final a1<?, ?> c = new c1();

    static <UT, UB> UB A(Object obj, int i, List<Integer> list, u.c cVar, UB ub, a1<UT, UB> a1Var) {
        if (cVar == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (!cVar.isInRange(iIntValue)) {
                    ub = (UB) J(obj, i, iIntValue, ub, a1Var);
                    it.remove();
                }
            }
            return ub;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = list.get(i3);
            int iIntValue2 = num.intValue();
            if (cVar.isInRange(iIntValue2)) {
                if (i3 != i2) {
                    list.set(i2, num);
                }
                i2++;
            } else {
                ub = (UB) J(obj, i, iIntValue2, ub, a1Var);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return ub;
    }

    private static Class<?> B() {
        if (q0.d) {
            return null;
        }
        try {
            return Class.forName("androidx.glance.appwidget.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static a1<?, ?> C() {
        try {
            Class<?> clsD = D();
            if (clsD == null) {
                return null;
            }
            return (a1) clsD.getConstructor(null).newInstance(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> D() {
        if (q0.d) {
            return null;
        }
        try {
            return Class.forName("androidx.glance.appwidget.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static <T, FT extends q.b<FT>> void E(m<FT> mVar, T t, T t2) {
        q<T> qVarC = mVar.c(t2);
        if (qVarC.m()) {
            return;
        }
        mVar.d(t).u(qVarC);
    }

    static <T> void F(d0 d0Var, T t, T t2, long j) {
        d1.O(t, j, d0Var.a(d1.z(t, j), d1.z(t2, j)));
    }

    static <T, UT, UB> void G(a1<UT, UB> a1Var, T t, T t2) {
        a1Var.p(t, a1Var.k(a1Var.g(t), a1Var.g(t2)));
    }

    public static void H(Class<?> cls) {
        Class<?> cls2;
        if (!GeneratedMessageLite.class.isAssignableFrom(cls) && !q0.d && (cls2 = a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean I(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static <UT, UB> UB J(Object obj, int i, int i2, UB ub, a1<UT, UB> a1Var) {
        if (ub == null) {
            ub = a1Var.f(obj);
        }
        a1Var.e(ub, i, i2);
        return ub;
    }

    public static a1<?, ?> K() {
        return b;
    }

    public static a1<?, ?> L() {
        return c;
    }

    public static void M(int i, List<Boolean> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.E(i, list, z);
    }

    public static void N(int i, List<ByteString> list, Writer writer) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.u(i, list);
    }

    public static void O(int i, List<Double> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.t(i, list, z);
    }

    public static void P(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.y(i, list, z);
    }

    public static void Q(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.h(i, list, z);
    }

    public static void R(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.q(i, list, z);
    }

    public static void S(int i, List<Float> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.a(i, list, z);
    }

    public static void T(int i, List<?> list, Writer writer, u0 u0Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.L(i, list, u0Var);
    }

    public static void U(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.f(i, list, z);
    }

    public static void V(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.H(i, list, z);
    }

    public static void W(int i, List<?> list, Writer writer, u0 u0Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.N(i, list, u0Var);
    }

    public static void X(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.D(i, list, z);
    }

    public static void Y(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.A(i, list, z);
    }

    public static void Z(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.s(i, list, z);
    }

    static int a(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z ? CodedOutputStream.U(i) + CodedOutputStream.C(size) : size * CodedOutputStream.d(i, true);
    }

    public static void a0(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.x(i, list, z);
    }

    static int b(List<?> list) {
        return list.size();
    }

    public static void b0(int i, List<String> list, Writer writer) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.v(i, list);
    }

    static int c(int i, List<ByteString> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iU = size * CodedOutputStream.U(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            iU += CodedOutputStream.h(list.get(i2));
        }
        return iU;
    }

    public static void c0(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.i(i, list, z);
    }

    static int d(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iE = e(list);
        return z ? CodedOutputStream.U(i) + CodedOutputStream.C(iE) : iE + (size * CodedOutputStream.U(i));
    }

    public static void d0(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.l(i, list, z);
    }

    static int e(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof t)) {
            int iL = 0;
            while (i < size) {
                iL += CodedOutputStream.l(list.get(i).intValue());
                i++;
            }
            return iL;
        }
        t tVar = (t) list;
        int iL2 = 0;
        while (i < size) {
            iL2 += CodedOutputStream.l(tVar.getInt(i));
            i++;
        }
        return iL2;
    }

    static int f(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z ? CodedOutputStream.U(i) + CodedOutputStream.C(size * 4) : size * CodedOutputStream.m(i, 0);
    }

    static int g(List<?> list) {
        return list.size() * 4;
    }

    static int h(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z ? CodedOutputStream.U(i) + CodedOutputStream.C(size * 8) : size * CodedOutputStream.o(i, 0L);
    }

    static int i(List<?> list) {
        return list.size() * 8;
    }

    static int j(int i, List<i0> list, u0 u0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iS = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iS += CodedOutputStream.s(i, list.get(i2), u0Var);
        }
        return iS;
    }

    static int k(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iL = l(list);
        return z ? CodedOutputStream.U(i) + CodedOutputStream.C(iL) : iL + (size * CodedOutputStream.U(i));
    }

    static int l(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof t)) {
            int iW = 0;
            while (i < size) {
                iW += CodedOutputStream.w(list.get(i).intValue());
                i++;
            }
            return iW;
        }
        t tVar = (t) list;
        int iW2 = 0;
        while (i < size) {
            iW2 += CodedOutputStream.w(tVar.getInt(i));
            i++;
        }
        return iW2;
    }

    static int m(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        int iN = n(list);
        return z ? CodedOutputStream.U(i) + CodedOutputStream.C(iN) : iN + (list.size() * CodedOutputStream.U(i));
    }

    static int n(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof a0)) {
            int iY = 0;
            while (i < size) {
                iY += CodedOutputStream.y(list.get(i).longValue());
                i++;
            }
            return iY;
        }
        a0 a0Var = (a0) list;
        int iY2 = 0;
        while (i < size) {
            iY2 += CodedOutputStream.y(a0Var.getLong(i));
            i++;
        }
        return iY2;
    }

    static int o(int i, Object obj, u0 u0Var) {
        return obj instanceof w ? CodedOutputStream.A(i, (w) obj) : CodedOutputStream.F(i, (i0) obj, u0Var);
    }

    static int p(int i, List<?> list, u0 u0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iU = CodedOutputStream.U(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            iU += obj instanceof w ? CodedOutputStream.B((w) obj) : CodedOutputStream.H((i0) obj, u0Var);
        }
        return iU;
    }

    static int q(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR = r(list);
        return z ? CodedOutputStream.U(i) + CodedOutputStream.C(iR) : iR + (size * CodedOutputStream.U(i));
    }

    static int r(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof t)) {
            int iP = 0;
            while (i < size) {
                iP += CodedOutputStream.P(list.get(i).intValue());
                i++;
            }
            return iP;
        }
        t tVar = (t) list;
        int iP2 = 0;
        while (i < size) {
            iP2 += CodedOutputStream.P(tVar.getInt(i));
            i++;
        }
        return iP2;
    }

    static int s(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iT = t(list);
        return z ? CodedOutputStream.U(i) + CodedOutputStream.C(iT) : iT + (size * CodedOutputStream.U(i));
    }

    static int t(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof a0)) {
            int iR = 0;
            while (i < size) {
                iR += CodedOutputStream.R(list.get(i).longValue());
                i++;
            }
            return iR;
        }
        a0 a0Var = (a0) list;
        int iR2 = 0;
        while (i < size) {
            iR2 += CodedOutputStream.R(a0Var.getLong(i));
            i++;
        }
        return iR2;
    }

    static int u(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iU = CodedOutputStream.U(i) * size;
        if (!(list instanceof iz6)) {
            while (i2 < size) {
                Object obj = list.get(i2);
                iU += obj instanceof ByteString ? CodedOutputStream.h((ByteString) obj) : CodedOutputStream.T((String) obj);
                i2++;
            }
            return iU;
        }
        iz6 iz6Var = (iz6) list;
        while (i2 < size) {
            Object objM = iz6Var.m(i2);
            iU += objM instanceof ByteString ? CodedOutputStream.h((ByteString) objM) : CodedOutputStream.T((String) objM);
            i2++;
        }
        return iU;
    }

    static int v(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iW = w(list);
        return z ? CodedOutputStream.U(i) + CodedOutputStream.C(iW) : iW + (size * CodedOutputStream.U(i));
    }

    static int w(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof t)) {
            int iW = 0;
            while (i < size) {
                iW += CodedOutputStream.W(list.get(i).intValue());
                i++;
            }
            return iW;
        }
        t tVar = (t) list;
        int iW2 = 0;
        while (i < size) {
            iW2 += CodedOutputStream.W(tVar.getInt(i));
            i++;
        }
        return iW2;
    }

    static int x(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iY = y(list);
        return z ? CodedOutputStream.U(i) + CodedOutputStream.C(iY) : iY + (size * CodedOutputStream.U(i));
    }

    static int y(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof a0)) {
            int iY = 0;
            while (i < size) {
                iY += CodedOutputStream.Y(list.get(i).longValue());
                i++;
            }
            return iY;
        }
        a0 a0Var = (a0) list;
        int iY2 = 0;
        while (i < size) {
            iY2 += CodedOutputStream.Y(a0Var.getLong(i));
            i++;
        }
        return iY2;
    }

    static <UT, UB> UB z(Object obj, int i, List<Integer> list, u.b<?> bVar, UB ub, a1<UT, UB> a1Var) {
        if (bVar == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (bVar.findValueByNumber(iIntValue) == null) {
                    ub = (UB) J(obj, i, iIntValue, ub, a1Var);
                    it.remove();
                }
            }
            return ub;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = list.get(i3);
            int iIntValue2 = num.intValue();
            if (bVar.findValueByNumber(iIntValue2) != null) {
                if (i3 != i2) {
                    list.set(i2, num);
                }
                i2++;
            } else {
                ub = (UB) J(obj, i, iIntValue2, ub, a1Var);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return ub;
    }
}
