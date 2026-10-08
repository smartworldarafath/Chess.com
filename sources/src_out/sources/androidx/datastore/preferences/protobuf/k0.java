package androidx.datastore.preferences.protobuf;

import com.google.inputmethod.lo6;
import com.google.inputmethod.t04;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
final class k0<T> implements u0<T> {
    private static final int[] r = new int[0];
    private static final Unsafe s = d1.A();
    private final int[] a;
    private final Object[] b;
    private final int c;
    private final int d;
    private final i0 e;
    private final boolean f;
    private final boolean g;
    private final ProtoSyntax h;
    private final boolean i;
    private final int[] j;
    private final int k;
    private final int l;
    private final m0 m;
    private final x n;
    private final a1<?, ?> o;
    private final m<?> p;
    private final d0 q;

    private k0(int[] iArr, Object[] objArr, int i, int i2, i0 i0Var, ProtoSyntax protoSyntax, boolean z, int[] iArr2, int i3, int i4, m0 m0Var, x xVar, a1<?, ?> a1Var, m<?> mVar, d0 d0Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.g = i0Var instanceof GeneratedMessageLite;
        this.h = protoSyntax;
        this.f = mVar != null && mVar.e(i0Var);
        this.i = z;
        this.j = iArr2;
        this.k = i3;
        this.l = i4;
        this.m = m0Var;
        this.n = xVar;
        this.o = a1Var;
        this.p = mVar;
        this.e = i0Var;
        this.q = d0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean A(Object obj, int i, int i2) {
        List list = (List) d1.z(obj, S(i));
        if (list.isEmpty()) {
            return true;
        }
        u0 u0VarT = t(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (!u0VarT.d(list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [androidx.datastore.preferences.protobuf.u0] */
    private boolean B(T t, int i, int i2) {
        Map<?, ?> mapG = this.q.g(d1.z(t, S(i)));
        if (mapG.isEmpty()) {
            return true;
        }
        if (this.q.b(s(i2)).c.a() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        ?? C = 0;
        for (Object obj : mapG.values()) {
            if (C == 0) {
                C = C;
                C = q0.a().c(obj.getClass());
            }
            C = C;
            if (!C.d(obj)) {
                return false;
            }
        }
        return true;
    }

    private static boolean C(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof GeneratedMessageLite) {
            return ((GeneratedMessageLite) obj).z();
        }
        return true;
    }

    private boolean D(T t, T t2, int i) {
        long jZ = Z(i) & 1048575;
        return d1.w(t, jZ) == d1.w(t2, jZ);
    }

    private boolean E(T t, int i, int i2) {
        return d1.w(t, (long) (Z(i2) & 1048575)) == i;
    }

    private static boolean F(int i) {
        return (i & 268435456) != 0;
    }

    private static <T> long G(T t, long j) {
        return d1.x(t, j);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 20401. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    private <UT, UB, ET extends androidx.datastore.preferences.protobuf.q.b<ET>> void H(androidx.datastore.preferences.protobuf.a1<UT, UB> r18, androidx.datastore.preferences.protobuf.m<ET> r19, T r20, androidx.datastore.preferences.protobuf.t0 r21, androidx.datastore.preferences.protobuf.l r22) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 2040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.k0.H(androidx.datastore.preferences.protobuf.a1, androidx.datastore.preferences.protobuf.m, java.lang.Object, androidx.datastore.preferences.protobuf.t0, androidx.datastore.preferences.protobuf.l):void");
    }

    private final <K, V> void I(Object obj, int i, Object obj2, l lVar, t0 t0Var) throws IOException {
        long jS = S(l0(i));
        Object objZ = d1.z(obj, jS);
        if (objZ == null) {
            objZ = this.q.f(obj2);
            d1.O(obj, jS, objZ);
        } else if (this.q.h(objZ)) {
            Object objF = this.q.f(obj2);
            this.q.a(objF, objZ);
            d1.O(obj, jS, objF);
            objZ = objF;
        }
        t0Var.I(this.q.e(objZ), this.q.b(obj2), lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void J(T t, T t2, int i) {
        if (x(t2, i)) {
            long jS = S(l0(i));
            Unsafe unsafe = s;
            Object object = unsafe.getObject(t2, jS);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + R(i) + " is present but null: " + t2);
            }
            u0 u0VarT = t(i);
            if (!x(t, i)) {
                if (C(object)) {
                    Object objG = u0VarT.g();
                    u0VarT.a(objG, object);
                    unsafe.putObject(t, jS, objG);
                } else {
                    unsafe.putObject(t, jS, object);
                }
                f0(t, i);
                return;
            }
            Object object2 = unsafe.getObject(t, jS);
            if (!C(object2)) {
                Object objG2 = u0VarT.g();
                u0VarT.a(objG2, object2);
                unsafe.putObject(t, jS, objG2);
                object2 = objG2;
            }
            u0VarT.a(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void K(T t, T t2, int i) {
        int iR = R(i);
        if (E(t2, iR, i)) {
            long jS = S(l0(i));
            Unsafe unsafe = s;
            Object object = unsafe.getObject(t2, jS);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + R(i) + " is present but null: " + t2);
            }
            u0 u0VarT = t(i);
            if (!E(t, iR, i)) {
                if (C(object)) {
                    Object objG = u0VarT.g();
                    u0VarT.a(objG, object);
                    unsafe.putObject(t, jS, objG);
                } else {
                    unsafe.putObject(t, jS, object);
                }
                g0(t, iR, i);
                return;
            }
            Object object2 = unsafe.getObject(t, jS);
            if (!C(object2)) {
                Object objG2 = u0VarT.g();
                u0VarT.a(objG2, object2);
                unsafe.putObject(t, jS, objG2);
                object2 = objG2;
            }
            u0VarT.a(object2, object);
        }
    }

    private void L(T t, T t2, int i) {
        int iL0 = l0(i);
        long jS = S(iL0);
        int iR = R(i);
        switch (k0(iL0)) {
            case 0:
                if (x(t2, i)) {
                    d1.K(t, jS, d1.u(t2, jS));
                    f0(t, i);
                }
                break;
            case 1:
                if (x(t2, i)) {
                    d1.L(t, jS, d1.v(t2, jS));
                    f0(t, i);
                }
                break;
            case 2:
                if (x(t2, i)) {
                    d1.N(t, jS, d1.x(t2, jS));
                    f0(t, i);
                }
                break;
            case 3:
                if (x(t2, i)) {
                    d1.N(t, jS, d1.x(t2, jS));
                    f0(t, i);
                }
                break;
            case 4:
                if (x(t2, i)) {
                    d1.M(t, jS, d1.w(t2, jS));
                    f0(t, i);
                }
                break;
            case 5:
                if (x(t2, i)) {
                    d1.N(t, jS, d1.x(t2, jS));
                    f0(t, i);
                }
                break;
            case 6:
                if (x(t2, i)) {
                    d1.M(t, jS, d1.w(t2, jS));
                    f0(t, i);
                }
                break;
            case 7:
                if (x(t2, i)) {
                    d1.E(t, jS, d1.p(t2, jS));
                    f0(t, i);
                }
                break;
            case 8:
                if (x(t2, i)) {
                    d1.O(t, jS, d1.z(t2, jS));
                    f0(t, i);
                }
                break;
            case lo6.HASACTION_FIELD_NUMBER /* 9 */:
                J(t, t2, i);
                break;
            case lo6.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                if (x(t2, i)) {
                    d1.O(t, jS, d1.z(t2, jS));
                    f0(t, i);
                }
                break;
            case lo6.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                if (x(t2, i)) {
                    d1.M(t, jS, d1.w(t2, jS));
                    f0(t, i);
                }
                break;
            case 12:
                if (x(t2, i)) {
                    d1.M(t, jS, d1.w(t2, jS));
                    f0(t, i);
                }
                break;
            case 13:
                if (x(t2, i)) {
                    d1.M(t, jS, d1.w(t2, jS));
                    f0(t, i);
                }
                break;
            case 14:
                if (x(t2, i)) {
                    d1.N(t, jS, d1.x(t2, jS));
                    f0(t, i);
                }
                break;
            case 15:
                if (x(t2, i)) {
                    d1.M(t, jS, d1.w(t2, jS));
                    f0(t, i);
                }
                break;
            case 16:
                if (x(t2, i)) {
                    d1.N(t, jS, d1.x(t2, jS));
                    f0(t, i);
                }
                break;
            case 17:
                J(t, t2, i);
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.n.a(t, t2, jS);
                break;
            case 50:
                w0.F(this.q, t, t2, jS);
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (E(t2, iR, i)) {
                    d1.O(t, jS, d1.z(t2, jS));
                    g0(t, iR, i);
                }
                break;
            case 60:
                K(t, t2, i);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (E(t2, iR, i)) {
                    d1.O(t, jS, d1.z(t2, jS));
                    g0(t, iR, i);
                }
                break;
            case 68:
                K(t, t2, i);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object M(T t, int i) {
        u0 u0VarT = t(i);
        long jS = S(l0(i));
        if (!x(t, i)) {
            return u0VarT.g();
        }
        Object object = s.getObject(t, jS);
        if (C(object)) {
            return object;
        }
        Object objG = u0VarT.g();
        if (object != null) {
            u0VarT.a(objG, object);
        }
        return objG;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object N(T t, int i, int i2) {
        u0 u0VarT = t(i2);
        if (!E(t, i, i2)) {
            return u0VarT.g();
        }
        Object object = s.getObject(t, S(l0(i2)));
        if (C(object)) {
            return object;
        }
        Object objG = u0VarT.g();
        if (object != null) {
            u0VarT.a(objG, object);
        }
        return objG;
    }

    static <T> k0<T> O(Class<T> cls, g0 g0Var, m0 m0Var, x xVar, a1<?, ?> a1Var, m<?> mVar, d0 d0Var) {
        return g0Var instanceof s0 ? Q((s0) g0Var, m0Var, xVar, a1Var, mVar, d0Var) : P((y0) g0Var, m0Var, xVar, a1Var, mVar, d0Var);
    }

    static <T> k0<T> P(y0 y0Var, m0 m0Var, x xVar, a1<?, ?> a1Var, m<?> mVar, d0 d0Var) {
        p[] pVarArrD = y0Var.d();
        if (pVarArrD.length != 0) {
            p pVar = pVarArrD[0];
            throw null;
        }
        int length = pVarArrD.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        if (pVarArrD.length > 0) {
            p pVar2 = pVarArrD[0];
            throw null;
        }
        int[] iArrC = y0Var.c();
        if (iArrC == null) {
            iArrC = r;
        }
        if (pVarArrD.length > 0) {
            p pVar3 = pVarArrD[0];
            throw null;
        }
        int[] iArr2 = r;
        int[] iArr3 = r;
        int[] iArr4 = new int[iArrC.length + iArr2.length + iArr3.length];
        System.arraycopy(iArrC, 0, iArr4, 0, iArrC.length);
        System.arraycopy(iArr2, 0, iArr4, iArrC.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, iArrC.length + iArr2.length, iArr3.length);
        return new k0<>(iArr, objArr, 0, 0, y0Var.b(), y0Var.getSyntax(), true, iArr4, iArrC.length, iArrC.length + iArr2.length, m0Var, xVar, a1Var, mVar, d0Var);
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0251  */
    /* JADX WARN: Code duplicated, block: B:122:0x0254  */
    /* JADX WARN: Code duplicated, block: B:125:0x026b  */
    /* JADX WARN: Code duplicated, block: B:126:0x026e  */
    /* JADX WARN: Code duplicated, block: B:163:0x0326  */
    /* JADX WARN: Code duplicated, block: B:180:0x0375  */
    /* JADX WARN: Code duplicated, block: B:183:0x0383  */
    static <T> k0<T> Q(s0 s0Var, m0 m0Var, x xVar, a1<?, ?> a1Var, m<?> mVar, d0 d0Var) {
        int i;
        int iCharAt;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr;
        int i6;
        int i7;
        int i8;
        char cCharAt;
        int i9;
        char cCharAt2;
        int i10;
        char cCharAt3;
        int i11;
        char cCharAt4;
        int i12;
        char cCharAt5;
        int i13;
        char cCharAt6;
        int i14;
        char cCharAt7;
        int i15;
        char cCharAt8;
        int i16;
        int i17;
        int i18;
        int i19;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i20;
        int i21;
        int iObjectFieldOffset3;
        int i22;
        Field fieldE0;
        char cCharAt9;
        int i23;
        int i24;
        int i25;
        Object obj;
        Field fieldE1;
        int i26;
        Object obj2;
        Field fieldE2;
        int i27;
        char cCharAt10;
        int i28;
        char cCharAt11;
        int i29;
        char cCharAt12;
        int i30;
        char cCharAt13;
        String strD = s0Var.d();
        int length = strD.length();
        char c = 55296;
        if (strD.charAt(0) >= 55296) {
            int i31 = 1;
            while (true) {
                i = i31 + 1;
                if (strD.charAt(i31) < 55296) {
                    break;
                }
                i31 = i;
            }
        } else {
            i = 1;
        }
        int i32 = i + 1;
        int iCharAt2 = strD.charAt(i);
        if (iCharAt2 >= 55296) {
            int i33 = iCharAt2 & 8191;
            int i34 = 13;
            while (true) {
                i30 = i32 + 1;
                cCharAt13 = strD.charAt(i32);
                if (cCharAt13 < 55296) {
                    break;
                }
                i33 |= (cCharAt13 & 8191) << i34;
                i34 += 13;
                i32 = i30;
            }
            iCharAt2 = i33 | (cCharAt13 << i34);
            i32 = i30;
        }
        if (iCharAt2 == 0) {
            i4 = 0;
            iCharAt = 0;
            i3 = 0;
            i7 = 0;
            i2 = 0;
            i6 = 0;
            iArr = r;
            i5 = 0;
        } else {
            int i35 = i32 + 1;
            int iCharAt3 = strD.charAt(i32);
            if (iCharAt3 >= 55296) {
                int i36 = iCharAt3 & 8191;
                int i37 = 13;
                while (true) {
                    i15 = i35 + 1;
                    cCharAt8 = strD.charAt(i35);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i36 |= (cCharAt8 & 8191) << i37;
                    i37 += 13;
                    i35 = i15;
                }
                iCharAt3 = i36 | (cCharAt8 << i37);
                i35 = i15;
            }
            int i38 = i35 + 1;
            int iCharAt4 = strD.charAt(i35);
            if (iCharAt4 >= 55296) {
                int i39 = iCharAt4 & 8191;
                int i40 = 13;
                while (true) {
                    i14 = i38 + 1;
                    cCharAt7 = strD.charAt(i38);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i39 |= (cCharAt7 & 8191) << i40;
                    i40 += 13;
                    i38 = i14;
                }
                iCharAt4 = i39 | (cCharAt7 << i40);
                i38 = i14;
            }
            int i41 = i38 + 1;
            int iCharAt5 = strD.charAt(i38);
            if (iCharAt5 >= 55296) {
                int i42 = iCharAt5 & 8191;
                int i43 = 13;
                while (true) {
                    i13 = i41 + 1;
                    cCharAt6 = strD.charAt(i41);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i42 |= (cCharAt6 & 8191) << i43;
                    i43 += 13;
                    i41 = i13;
                }
                iCharAt5 = i42 | (cCharAt6 << i43);
                i41 = i13;
            }
            int i44 = i41 + 1;
            int iCharAt6 = strD.charAt(i41);
            if (iCharAt6 >= 55296) {
                int i45 = iCharAt6 & 8191;
                int i46 = 13;
                while (true) {
                    i12 = i44 + 1;
                    cCharAt5 = strD.charAt(i44);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt5 & 8191) << i46;
                    i46 += 13;
                    i44 = i12;
                }
                iCharAt6 = i45 | (cCharAt5 << i46);
                i44 = i12;
            }
            int i47 = i44 + 1;
            iCharAt = strD.charAt(i44);
            if (iCharAt >= 55296) {
                int i48 = iCharAt & 8191;
                int i49 = 13;
                while (true) {
                    i11 = i47 + 1;
                    cCharAt4 = strD.charAt(i47);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt4 & 8191) << i49;
                    i49 += 13;
                    i47 = i11;
                }
                iCharAt = i48 | (cCharAt4 << i49);
                i47 = i11;
            }
            int i50 = i47 + 1;
            int iCharAt7 = strD.charAt(i47);
            if (iCharAt7 >= 55296) {
                int i51 = iCharAt7 & 8191;
                int i52 = 13;
                while (true) {
                    i10 = i50 + 1;
                    cCharAt3 = strD.charAt(i50);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt3 & 8191) << i52;
                    i52 += 13;
                    i50 = i10;
                }
                iCharAt7 = i51 | (cCharAt3 << i52);
                i50 = i10;
            }
            int i53 = i50 + 1;
            int iCharAt8 = strD.charAt(i50);
            if (iCharAt8 >= 55296) {
                int i54 = iCharAt8 & 8191;
                int i55 = 13;
                while (true) {
                    i9 = i53 + 1;
                    cCharAt2 = strD.charAt(i53);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt2 & 8191) << i55;
                    i55 += 13;
                    i53 = i9;
                }
                iCharAt8 = i54 | (cCharAt2 << i55);
                i53 = i9;
            }
            int i56 = i53 + 1;
            int iCharAt9 = strD.charAt(i53);
            if (iCharAt9 >= 55296) {
                int i57 = iCharAt9 & 8191;
                int i58 = 13;
                while (true) {
                    i8 = i56 + 1;
                    cCharAt = strD.charAt(i56);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i57 |= (cCharAt & 8191) << i58;
                    i58 += 13;
                    i56 = i8;
                }
                iCharAt9 = i57 | (cCharAt << i58);
                i56 = i8;
            }
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            i2 = (iCharAt3 * 2) + iCharAt4;
            int i59 = iCharAt7;
            i3 = iCharAt5;
            i4 = i59;
            i5 = iCharAt3;
            iArr = iArr2;
            i6 = iCharAt9;
            i32 = i56;
            i7 = iCharAt6;
        }
        Unsafe unsafe = s;
        Object[] objArrC = s0Var.c();
        Class<?> cls = s0Var.b().getClass();
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[iCharAt * 2];
        int i60 = i6 + i4;
        int i61 = i60;
        int i62 = i6;
        int i63 = 0;
        int i64 = 0;
        while (i32 < length) {
            int i65 = i32 + 1;
            int iCharAt10 = strD.charAt(i32);
            if (iCharAt10 >= c) {
                int i66 = iCharAt10 & 8191;
                int i67 = i65;
                int i68 = 13;
                while (true) {
                    i29 = i67 + 1;
                    cCharAt12 = strD.charAt(i67);
                    if (cCharAt12 < c) {
                        break;
                    }
                    i66 |= (cCharAt12 & 8191) << i68;
                    i68 += 13;
                    i67 = i29;
                }
                iCharAt10 = i66 | (cCharAt12 << i68);
                i16 = i29;
            } else {
                i16 = i65;
            }
            int i69 = i16 + 1;
            int iCharAt11 = strD.charAt(i16);
            if (iCharAt11 >= c) {
                int i70 = iCharAt11 & 8191;
                int i71 = i69;
                int i72 = 13;
                while (true) {
                    i28 = i71 + 1;
                    cCharAt11 = strD.charAt(i71);
                    if (cCharAt11 < c) {
                        break;
                    }
                    i70 |= (cCharAt11 & 8191) << i72;
                    i72 += 13;
                    i71 = i28;
                }
                iCharAt11 = i70 | (cCharAt11 << i72);
                i17 = i28;
            } else {
                i17 = i69;
            }
            int i73 = iCharAt11 & 255;
            int i74 = length;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i63] = i64;
                i63++;
            }
            int[] iArr4 = iArr3;
            if (i73 >= 51) {
                int i75 = i17 + 1;
                int iCharAt12 = strD.charAt(i17);
                char c2 = 55296;
                if (iCharAt12 >= 55296) {
                    int i76 = iCharAt12 & 8191;
                    int i77 = 13;
                    while (true) {
                        i27 = i75 + 1;
                        cCharAt10 = strD.charAt(i75);
                        if (cCharAt10 < c2) {
                            break;
                        }
                        i76 |= (cCharAt10 & 8191) << i77;
                        i77 += 13;
                        i75 = i27;
                        c2 = 55296;
                    }
                    iCharAt12 = i76 | (cCharAt10 << i77);
                    i75 = i27;
                }
                int i78 = i73 - 51;
                int i79 = i75;
                if (i78 == 9 || i78 == 17) {
                    i24 = i2 + 1;
                    objArr[((i64 / 3) * 2) + 1] = objArrC[i2];
                } else {
                    if (i78 == 12 && (s0Var.getSyntax().equals(ProtoSyntax.PROTO2) || (iCharAt11 & 2048) != 0)) {
                        i24 = i2 + 1;
                        objArr[((i64 / 3) * 2) + 1] = objArrC[i2];
                    }
                    i25 = iCharAt12 * 2;
                    obj = objArrC[i25];
                    if (obj instanceof Field) {
                        fieldE1 = (Field) obj;
                    } else {
                        fieldE1 = e0(cls, (String) obj);
                        objArrC[i25] = fieldE1;
                    }
                    int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldE1);
                    i26 = i25 + 1;
                    obj2 = objArrC[i26];
                    if (obj2 instanceof Field) {
                        fieldE2 = (Field) obj2;
                    } else {
                        fieldE2 = e0(cls, (String) obj2);
                        objArrC[i26] = fieldE2;
                    }
                    strD = strD;
                    iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldE2);
                    i22 = iObjectFieldOffset4;
                    i21 = 0;
                    i18 = iCharAt10;
                    i32 = i79;
                }
                i2 = i24;
                i25 = iCharAt12 * 2;
                obj = objArrC[i25];
                if (obj instanceof Field) {
                    fieldE1 = (Field) obj;
                } else {
                    fieldE1 = e0(cls, (String) obj);
                    objArrC[i25] = fieldE1;
                }
                int iObjectFieldOffset5 = (int) unsafe.objectFieldOffset(fieldE1);
                i26 = i25 + 1;
                obj2 = objArrC[i26];
                if (obj2 instanceof Field) {
                    fieldE2 = (Field) obj2;
                } else {
                    fieldE2 = e0(cls, (String) obj2);
                    objArrC[i26] = fieldE2;
                }
                strD = strD;
                iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldE2);
                i22 = iObjectFieldOffset5;
                i21 = 0;
                i18 = iCharAt10;
                i32 = i79;
            } else {
                int i80 = i2 + 1;
                Field fieldE3 = e0(cls, (String) objArrC[i2]);
                if (i73 == 9 || i73 == 17) {
                    i18 = iCharAt10;
                    objArr[((i64 / 3) * 2) + 1] = fieldE3.getType();
                } else {
                    if (i73 == 27 || i73 == 49) {
                        i18 = iCharAt10;
                        i23 = i2 + 2;
                        objArr[((i64 / 3) * 2) + 1] = objArrC[i80];
                    } else if (i73 == 12 || i73 == 30 || i73 == 44) {
                        i18 = iCharAt10;
                        if (s0Var.getSyntax() == ProtoSyntax.PROTO2 || (iCharAt11 & 2048) != 0) {
                            i23 = i2 + 2;
                            objArr[((i64 / 3) * 2) + 1] = objArrC[i80];
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldE3);
                        if ((iCharAt11 & 4096) != 0 || i73 > 17) {
                            iObjectFieldOffset2 = 1048575;
                            i20 = i17;
                            i21 = 0;
                        } else {
                            int i81 = i17 + 1;
                            int iCharAt13 = strD.charAt(i17);
                            if (iCharAt13 >= 55296) {
                                int i82 = iCharAt13 & 8191;
                                int i83 = 13;
                                while (true) {
                                    i20 = i81 + 1;
                                    cCharAt9 = strD.charAt(i81);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i82 |= (cCharAt9 & 8191) << i83;
                                    i83 += 13;
                                    i81 = i20;
                                }
                                iCharAt13 = i82 | (cCharAt9 << i83);
                            } else {
                                i20 = i81;
                            }
                            int i84 = (i5 * 2) + (iCharAt13 / 32);
                            Object obj3 = objArrC[i84];
                            if (obj3 instanceof Field) {
                                fieldE0 = (Field) obj3;
                            } else {
                                fieldE0 = e0(cls, (String) obj3);
                                objArrC[i84] = fieldE0;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldE0);
                            i21 = iCharAt13 % 32;
                        }
                        int i85 = iObjectFieldOffset2;
                        if (i73 >= 18 && i73 <= 49) {
                            iArr[i61] = iObjectFieldOffset;
                            i61++;
                        }
                        iObjectFieldOffset3 = i85;
                        i22 = iObjectFieldOffset;
                        i2 = i19;
                        i32 = i20;
                    } else {
                        if (i73 == 50) {
                            int i86 = i62 + 1;
                            iArr[i62] = i64;
                            int i87 = (i64 / 3) * 2;
                            int i88 = i2 + 2;
                            objArr[i87] = objArrC[i80];
                            if ((iCharAt11 & 2048) != 0) {
                                i19 = i2 + 3;
                                objArr[i87 + 1] = objArrC[i88];
                                i18 = iCharAt10;
                                i62 = i86;
                            } else {
                                i19 = i88;
                                i62 = i86;
                                i18 = iCharAt10;
                            }
                        } else {
                            i18 = iCharAt10;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldE3);
                        if ((iCharAt11 & 4096) != 0) {
                            iObjectFieldOffset2 = 1048575;
                            i20 = i17;
                            i21 = 0;
                        } else {
                            iObjectFieldOffset2 = 1048575;
                            i20 = i17;
                            i21 = 0;
                        }
                        int i89 = iObjectFieldOffset2;
                        if (i73 >= 18) {
                            iArr[i61] = iObjectFieldOffset;
                            i61++;
                        }
                        iObjectFieldOffset3 = i89;
                        i22 = iObjectFieldOffset;
                        i2 = i19;
                        i32 = i20;
                    }
                    i19 = i23;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldE3);
                    if ((iCharAt11 & 4096) != 0) {
                        iObjectFieldOffset2 = 1048575;
                        i20 = i17;
                        i21 = 0;
                    } else {
                        iObjectFieldOffset2 = 1048575;
                        i20 = i17;
                        i21 = 0;
                    }
                    int i810 = iObjectFieldOffset2;
                    if (i73 >= 18) {
                        iArr[i61] = iObjectFieldOffset;
                        i61++;
                    }
                    iObjectFieldOffset3 = i810;
                    i22 = iObjectFieldOffset;
                    i2 = i19;
                    i32 = i20;
                }
                i19 = i80;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldE3);
                if ((iCharAt11 & 4096) != 0) {
                    iObjectFieldOffset2 = 1048575;
                    i20 = i17;
                    i21 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i20 = i17;
                    i21 = 0;
                }
                int i811 = iObjectFieldOffset2;
                if (i73 >= 18) {
                    iArr[i61] = iObjectFieldOffset;
                    i61++;
                }
                iObjectFieldOffset3 = i811;
                i22 = iObjectFieldOffset;
                i2 = i19;
                i32 = i20;
            }
            int i90 = i64 + 1;
            iArr4[i64] = i18;
            int i91 = i64 + 2;
            int i92 = iObjectFieldOffset3;
            iArr4[i90] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 2048) != 0 ? t04.INVALID_ID : 0) | (i73 << 20) | i22;
            i64 += 3;
            iArr4[i91] = (i21 << 20) | i92;
            length = i74;
            iArr3 = iArr4;
            strD = strD;
            c = 55296;
        }
        return new k0<>(iArr3, objArr, i3, i7, s0Var.b(), s0Var.getSyntax(), false, iArr, i6, i60, m0Var, xVar, a1Var, mVar, d0Var);
    }

    private int R(int i) {
        return this.a[i];
    }

    private static long S(int i) {
        return i & 1048575;
    }

    private static <T> boolean T(T t, long j) {
        return ((Boolean) d1.z(t, j)).booleanValue();
    }

    private static <T> double U(T t, long j) {
        return ((Double) d1.z(t, j)).doubleValue();
    }

    private static <T> float V(T t, long j) {
        return ((Float) d1.z(t, j)).floatValue();
    }

    private static <T> int W(T t, long j) {
        return ((Integer) d1.z(t, j)).intValue();
    }

    private static <T> long X(T t, long j) {
        return ((Long) d1.z(t, j)).longValue();
    }

    private int Y(int i) {
        if (i < this.c || i > this.d) {
            return -1;
        }
        return h0(i, 0);
    }

    private int Z(int i) {
        return this.a[i + 2];
    }

    private <E> void a0(Object obj, long j, t0 t0Var, u0<E> u0Var, l lVar) throws IOException {
        t0Var.K(this.n.c(obj, j), u0Var, lVar);
    }

    private <E> void b0(Object obj, int i, t0 t0Var, u0<E> u0Var, l lVar) throws IOException {
        t0Var.G(this.n.c(obj, S(i)), u0Var, lVar);
    }

    private void c0(Object obj, int i, t0 t0Var) throws IOException {
        if (w(i)) {
            d1.O(obj, S(i), t0Var.D());
        } else if (this.g) {
            d1.O(obj, S(i), t0Var.readString());
        } else {
            d1.O(obj, S(i), t0Var.readBytes());
        }
    }

    private void d0(Object obj, int i, t0 t0Var) throws IOException {
        if (w(i)) {
            t0Var.x(this.n.c(obj, S(i)));
        } else {
            t0Var.m(this.n.c(obj, S(i)));
        }
    }

    private static Field e0(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private void f0(T t, int i) {
        int iZ = Z(i);
        long j = 1048575 & iZ;
        if (j == 1048575) {
            return;
        }
        d1.M(t, j, (1 << (iZ >>> 20)) | d1.w(t, j));
    }

    private void g0(T t, int i, int i2) {
        d1.M(t, Z(i2) & 1048575, i);
    }

    private int h0(int i, int i2) {
        int length = (this.a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int iR = R(i4);
            if (i == iR) {
                return i4;
            }
            if (i < iR) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private void i0(T t, int i, Object obj) {
        s.putObject(t, S(l0(i)), obj);
        f0(t, i);
    }

    private boolean j(T t, T t2, int i) {
        return x(t, i) == x(t2, i);
    }

    private void j0(T t, int i, int i2, Object obj) {
        s.putObject(t, S(l0(i2)), obj);
        g0(t, i, i2);
    }

    private static <T> boolean k(T t, long j) {
        return d1.p(t, j);
    }

    private static int k0(int i) {
        return (i & 267386880) >>> 20;
    }

    private static void l(Object obj) {
        if (C(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    private int l0(int i) {
        return this.a[i + 1];
    }

    private static <T> double m(T t, long j) {
        return d1.u(t, j);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0022  */
    private void m0(T t, Writer writer) throws IOException {
        Map.Entry<?, ?> entry;
        Iterator it;
        boolean z;
        int i;
        int i2;
        int i3;
        boolean z2;
        k0<T> k0Var = this;
        if (k0Var.f) {
            q<T> qVarC = k0Var.p.c(t);
            if (qVarC.n()) {
                entry = null;
                it = null;
            } else {
                Iterator itT = qVarC.t();
                entry = (Map.Entry) itT.next();
                it = itT;
            }
        } else {
            entry = null;
            it = null;
        }
        int length = k0Var.a.length;
        Unsafe unsafe = s;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            int iL0 = k0Var.l0(i5);
            int iR = k0Var.R(i5);
            int iK0 = k0(iL0);
            if (iK0 <= 17) {
                int i7 = k0Var.a[i5 + 2];
                z = true;
                int i8 = i7 & 1048575;
                if (i8 != i4) {
                    i6 = i8 == 1048575 ? 0 : unsafe.getInt(t, i8);
                    i4 = i8;
                }
                i = i4;
                i2 = i6;
                i3 = 1 << (i7 >>> 20);
            } else {
                z = true;
                i = i4;
                i2 = i6;
                i3 = 0;
            }
            while (entry != null && k0Var.p.a(entry) <= iR) {
                k0Var.p.j(writer, entry);
                entry = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            long jS = S(iL0);
            switch (iK0) {
                case 0:
                    if (k0Var.y(t, i5, i, i2, i3)) {
                        writer.z(iR, m(t, jS));
                    }
                    break;
                case 1:
                    if (k0Var.y(t, i5, i, i2, i3)) {
                        writer.F(iR, q(t, jS));
                    }
                    k0Var = this;
                    break;
                case 2:
                    if (k0Var.y(t, i5, i, i2, i3)) {
                        writer.C(iR, unsafe.getLong(t, jS));
                    }
                    k0Var = this;
                    break;
                case 3:
                    if (k0Var.y(t, i5, i, i2, i3)) {
                        writer.e(iR, unsafe.getLong(t, jS));
                    }
                    k0Var = this;
                    break;
                case 4:
                    if (k0Var.y(t, i5, i, i2, i3)) {
                        writer.g(iR, unsafe.getInt(t, jS));
                    }
                    k0Var = this;
                    break;
                case 5:
                    if (k0Var.y(t, i5, i, i2, i3)) {
                        writer.m(iR, unsafe.getLong(t, jS));
                    }
                    k0Var = this;
                    break;
                case 6:
                    if (k0Var.y(t, i5, i, i2, i3)) {
                        writer.c(iR, unsafe.getInt(t, jS));
                    }
                    k0Var = this;
                    break;
                case 7:
                    if (k0Var.y(t, i5, i, i2, i3)) {
                        writer.n(iR, k(t, jS));
                    }
                    k0Var = this;
                    break;
                case 8:
                    if (k0Var.y(t, i5, i, i2, i3)) {
                        k0Var.p0(iR, unsafe.getObject(t, jS), writer);
                    }
                    break;
                case lo6.HASACTION_FIELD_NUMBER /* 9 */:
                    if (k0Var.y(t, i5, i, i2, i3)) {
                        writer.K(iR, unsafe.getObject(t, jS), k0Var.t(i5));
                    }
                    break;
                case lo6.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                    if (k0Var.y(t, i5, i, i2, i3)) {
                        writer.J(iR, (ByteString) unsafe.getObject(t, jS));
                    }
                    k0Var = this;
                    break;
                case lo6.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                    if (k0Var.y(t, i5, i, i2, i3)) {
                        writer.k(iR, unsafe.getInt(t, jS));
                    }
                    k0Var = this;
                    break;
                case 12:
                    if (k0Var.y(t, i5, i, i2, i3)) {
                        writer.G(iR, unsafe.getInt(t, jS));
                    }
                    k0Var = this;
                    break;
                case 13:
                    if (k0Var.y(t, i5, i, i2, i3)) {
                        writer.o(iR, unsafe.getInt(t, jS));
                    }
                    k0Var = this;
                    break;
                case 14:
                    if (k0Var.y(t, i5, i, i2, i3)) {
                        writer.w(iR, unsafe.getLong(t, jS));
                    }
                    k0Var = this;
                    break;
                case 15:
                    if (k0Var.y(t, i5, i, i2, i3)) {
                        writer.I(iR, unsafe.getInt(t, jS));
                    }
                    k0Var = this;
                    break;
                case 16:
                    if (k0Var.y(t, i5, i, i2, i3)) {
                        writer.j(iR, unsafe.getLong(t, jS));
                    }
                    k0Var = this;
                    break;
                case 17:
                    if (k0Var.y(t, i5, i, i2, i3)) {
                        writer.N(iR, unsafe.getObject(t, jS), k0Var.t(i5));
                    }
                    break;
                case 18:
                    w0.O(k0Var.R(i5), (List) unsafe.getObject(t, jS), writer, false);
                    break;
                case 19:
                    w0.S(k0Var.R(i5), (List) unsafe.getObject(t, jS), writer, false);
                    break;
                case 20:
                    w0.V(k0Var.R(i5), (List) unsafe.getObject(t, jS), writer, false);
                    break;
                case 21:
                    w0.d0(k0Var.R(i5), (List) unsafe.getObject(t, jS), writer, false);
                    break;
                case 22:
                    w0.U(k0Var.R(i5), (List) unsafe.getObject(t, jS), writer, false);
                    break;
                case 23:
                    w0.R(k0Var.R(i5), (List) unsafe.getObject(t, jS), writer, false);
                    break;
                case 24:
                    w0.Q(k0Var.R(i5), (List) unsafe.getObject(t, jS), writer, false);
                    break;
                case 25:
                    w0.M(k0Var.R(i5), (List) unsafe.getObject(t, jS), writer, false);
                    break;
                case 26:
                    w0.b0(k0Var.R(i5), (List) unsafe.getObject(t, jS), writer);
                    break;
                case 27:
                    w0.W(k0Var.R(i5), (List) unsafe.getObject(t, jS), writer, k0Var.t(i5));
                    break;
                case 28:
                    w0.N(k0Var.R(i5), (List) unsafe.getObject(t, jS), writer);
                    break;
                case 29:
                    z2 = false;
                    w0.c0(k0Var.R(i5), (List) unsafe.getObject(t, jS), writer, false);
                    break;
                case 30:
                    z2 = false;
                    w0.P(k0Var.R(i5), (List) unsafe.getObject(t, jS), writer, false);
                    break;
                case 31:
                    z2 = false;
                    w0.X(k0Var.R(i5), (List) unsafe.getObject(t, jS), writer, false);
                    break;
                case 32:
                    z2 = false;
                    w0.Y(k0Var.R(i5), (List) unsafe.getObject(t, jS), writer, false);
                    break;
                case 33:
                    z2 = false;
                    w0.Z(k0Var.R(i5), (List) unsafe.getObject(t, jS), writer, false);
                    break;
                case 34:
                    z2 = false;
                    w0.a0(k0Var.R(i5), (List) unsafe.getObject(t, jS), writer, false);
                    break;
                case 35:
                    w0.O(k0Var.R(i5), (List) unsafe.getObject(t, jS), writer, z);
                    break;
                case 36:
                    w0.S(k0Var.R(i5), (List) unsafe.getObject(t, jS), writer, z);
                    break;
                case 37:
                    w0.V(k0Var.R(i5), (List) unsafe.getObject(t, jS), writer, z);
                    break;
                case 38:
                    w0.d0(k0Var.R(i5), (List) unsafe.getObject(t, jS), writer, z);
                    break;
                case 39:
                    w0.U(k0Var.R(i5), (List) unsafe.getObject(t, jS), writer, z);
                    break;
                case 40:
                    w0.R(k0Var.R(i5), (List) unsafe.getObject(t, jS), writer, z);
                    break;
                case 41:
                    w0.Q(k0Var.R(i5), (List) unsafe.getObject(t, jS), writer, z);
                    break;
                case 42:
                    w0.M(k0Var.R(i5), (List) unsafe.getObject(t, jS), writer, z);
                    break;
                case 43:
                    w0.c0(k0Var.R(i5), (List) unsafe.getObject(t, jS), writer, z);
                    break;
                case 44:
                    w0.P(k0Var.R(i5), (List) unsafe.getObject(t, jS), writer, z);
                    break;
                case 45:
                    w0.X(k0Var.R(i5), (List) unsafe.getObject(t, jS), writer, z);
                    break;
                case 46:
                    w0.Y(k0Var.R(i5), (List) unsafe.getObject(t, jS), writer, z);
                    break;
                case 47:
                    w0.Z(k0Var.R(i5), (List) unsafe.getObject(t, jS), writer, z);
                    break;
                case 48:
                    w0.a0(k0Var.R(i5), (List) unsafe.getObject(t, jS), writer, z);
                    break;
                case 49:
                    w0.T(k0Var.R(i5), (List) unsafe.getObject(t, jS), writer, k0Var.t(i5));
                    break;
                case 50:
                    k0Var.o0(writer, iR, unsafe.getObject(t, jS), i5);
                    break;
                case 51:
                    if (k0Var.E(t, iR, i5)) {
                        writer.z(iR, U(t, jS));
                    }
                    break;
                case 52:
                    if (k0Var.E(t, iR, i5)) {
                        writer.F(iR, V(t, jS));
                    }
                    break;
                case 53:
                    if (k0Var.E(t, iR, i5)) {
                        writer.C(iR, X(t, jS));
                    }
                    break;
                case 54:
                    if (k0Var.E(t, iR, i5)) {
                        writer.e(iR, X(t, jS));
                    }
                    break;
                case 55:
                    if (k0Var.E(t, iR, i5)) {
                        writer.g(iR, W(t, jS));
                    }
                    break;
                case 56:
                    if (k0Var.E(t, iR, i5)) {
                        writer.m(iR, X(t, jS));
                    }
                    break;
                case 57:
                    if (k0Var.E(t, iR, i5)) {
                        writer.c(iR, W(t, jS));
                    }
                    break;
                case 58:
                    if (k0Var.E(t, iR, i5)) {
                        writer.n(iR, T(t, jS));
                    }
                    break;
                case 59:
                    if (k0Var.E(t, iR, i5)) {
                        k0Var.p0(iR, unsafe.getObject(t, jS), writer);
                    }
                    break;
                case 60:
                    if (k0Var.E(t, iR, i5)) {
                        writer.K(iR, unsafe.getObject(t, jS), k0Var.t(i5));
                    }
                    break;
                case 61:
                    if (k0Var.E(t, iR, i5)) {
                        writer.J(iR, (ByteString) unsafe.getObject(t, jS));
                    }
                    break;
                case 62:
                    if (k0Var.E(t, iR, i5)) {
                        writer.k(iR, W(t, jS));
                    }
                    break;
                case 63:
                    if (k0Var.E(t, iR, i5)) {
                        writer.G(iR, W(t, jS));
                    }
                    break;
                case 64:
                    if (k0Var.E(t, iR, i5)) {
                        writer.o(iR, W(t, jS));
                    }
                    break;
                case 65:
                    if (k0Var.E(t, iR, i5)) {
                        writer.w(iR, X(t, jS));
                    }
                    break;
                case 66:
                    if (k0Var.E(t, iR, i5)) {
                        writer.I(iR, W(t, jS));
                    }
                    break;
                case 67:
                    if (k0Var.E(t, iR, i5)) {
                        writer.j(iR, X(t, jS));
                    }
                    break;
                case 68:
                    if (k0Var.E(t, iR, i5)) {
                        writer.N(iR, unsafe.getObject(t, jS), k0Var.t(i5));
                    }
                    break;
                default:
                    break;
            }
            i5 += 3;
            i6 = i2;
            i4 = i;
            entry = entry;
        }
        while (entry != null) {
            k0Var.p.j(writer, entry);
            entry = it.hasNext() ? (Map.Entry) it.next() : null;
        }
        k0Var.q0(k0Var.o, t, writer);
    }

    private boolean n(T t, T t2, int i) {
        int iL0 = l0(i);
        long jS = S(iL0);
        switch (k0(iL0)) {
            case 0:
                return j(t, t2, i) && Double.doubleToLongBits(d1.u(t, jS)) == Double.doubleToLongBits(d1.u(t2, jS));
            case 1:
                return j(t, t2, i) && Float.floatToIntBits(d1.v(t, jS)) == Float.floatToIntBits(d1.v(t2, jS));
            case 2:
                return j(t, t2, i) && d1.x(t, jS) == d1.x(t2, jS);
            case 3:
                return j(t, t2, i) && d1.x(t, jS) == d1.x(t2, jS);
            case 4:
                return j(t, t2, i) && d1.w(t, jS) == d1.w(t2, jS);
            case 5:
                return j(t, t2, i) && d1.x(t, jS) == d1.x(t2, jS);
            case 6:
                return j(t, t2, i) && d1.w(t, jS) == d1.w(t2, jS);
            case 7:
                return j(t, t2, i) && d1.p(t, jS) == d1.p(t2, jS);
            case 8:
                return j(t, t2, i) && w0.I(d1.z(t, jS), d1.z(t2, jS));
            case lo6.HASACTION_FIELD_NUMBER /* 9 */:
                return j(t, t2, i) && w0.I(d1.z(t, jS), d1.z(t2, jS));
            case lo6.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                return j(t, t2, i) && w0.I(d1.z(t, jS), d1.z(t2, jS));
            case lo6.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                return j(t, t2, i) && d1.w(t, jS) == d1.w(t2, jS);
            case 12:
                return j(t, t2, i) && d1.w(t, jS) == d1.w(t2, jS);
            case 13:
                return j(t, t2, i) && d1.w(t, jS) == d1.w(t2, jS);
            case 14:
                return j(t, t2, i) && d1.x(t, jS) == d1.x(t2, jS);
            case 15:
                return j(t, t2, i) && d1.w(t, jS) == d1.w(t2, jS);
            case 16:
                return j(t, t2, i) && d1.x(t, jS) == d1.x(t2, jS);
            case 17:
                return j(t, t2, i) && w0.I(d1.z(t, jS), d1.z(t2, jS));
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                return w0.I(d1.z(t, jS), d1.z(t2, jS));
            case 50:
                return w0.I(d1.z(t, jS), d1.z(t2, jS));
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                return D(t, t2, i) && w0.I(d1.z(t, jS), d1.z(t2, jS));
            default:
                return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    private void n0(T t, Writer writer) throws IOException {
        Iterator itG;
        Map.Entry<?, ?> entry;
        q0(this.o, t, writer);
        if (this.f) {
            q<T> qVarC = this.p.c(t);
            if (qVarC.n()) {
                itG = null;
                entry = null;
            } else {
                itG = qVarC.g();
                entry = (Map.Entry) itG.next();
            }
        } else {
            itG = null;
            entry = null;
        }
        for (int length = this.a.length - 3; length >= 0; length -= 3) {
            int iL0 = l0(length);
            int iR = R(length);
            while (entry != null && this.p.a(entry) > iR) {
                this.p.j(writer, entry);
                entry = itG.hasNext() ? (Map.Entry) itG.next() : null;
            }
            switch (k0(iL0)) {
                case 0:
                    if (x(t, length)) {
                        writer.z(iR, m(t, S(iL0)));
                    }
                    break;
                case 1:
                    if (x(t, length)) {
                        writer.F(iR, q(t, S(iL0)));
                    }
                    break;
                case 2:
                    if (x(t, length)) {
                        writer.C(iR, G(t, S(iL0)));
                    }
                    break;
                case 3:
                    if (x(t, length)) {
                        writer.e(iR, G(t, S(iL0)));
                    }
                    break;
                case 4:
                    if (x(t, length)) {
                        writer.g(iR, v(t, S(iL0)));
                    }
                    break;
                case 5:
                    if (x(t, length)) {
                        writer.m(iR, G(t, S(iL0)));
                    }
                    break;
                case 6:
                    if (x(t, length)) {
                        writer.c(iR, v(t, S(iL0)));
                    }
                    break;
                case 7:
                    if (x(t, length)) {
                        writer.n(iR, k(t, S(iL0)));
                    }
                    break;
                case 8:
                    if (x(t, length)) {
                        p0(iR, d1.z(t, S(iL0)), writer);
                    }
                    break;
                case lo6.HASACTION_FIELD_NUMBER /* 9 */:
                    if (x(t, length)) {
                        writer.K(iR, d1.z(t, S(iL0)), t(length));
                    }
                    break;
                case lo6.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                    if (x(t, length)) {
                        writer.J(iR, (ByteString) d1.z(t, S(iL0)));
                    }
                    break;
                case lo6.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                    if (x(t, length)) {
                        writer.k(iR, v(t, S(iL0)));
                    }
                    break;
                case 12:
                    if (x(t, length)) {
                        writer.G(iR, v(t, S(iL0)));
                    }
                    break;
                case 13:
                    if (x(t, length)) {
                        writer.o(iR, v(t, S(iL0)));
                    }
                    break;
                case 14:
                    if (x(t, length)) {
                        writer.w(iR, G(t, S(iL0)));
                    }
                    break;
                case 15:
                    if (x(t, length)) {
                        writer.I(iR, v(t, S(iL0)));
                    }
                    break;
                case 16:
                    if (x(t, length)) {
                        writer.j(iR, G(t, S(iL0)));
                    }
                    break;
                case 17:
                    if (x(t, length)) {
                        writer.N(iR, d1.z(t, S(iL0)), t(length));
                    }
                    break;
                case 18:
                    w0.O(R(length), (List) d1.z(t, S(iL0)), writer, false);
                    break;
                case 19:
                    w0.S(R(length), (List) d1.z(t, S(iL0)), writer, false);
                    break;
                case 20:
                    w0.V(R(length), (List) d1.z(t, S(iL0)), writer, false);
                    break;
                case 21:
                    w0.d0(R(length), (List) d1.z(t, S(iL0)), writer, false);
                    break;
                case 22:
                    w0.U(R(length), (List) d1.z(t, S(iL0)), writer, false);
                    break;
                case 23:
                    w0.R(R(length), (List) d1.z(t, S(iL0)), writer, false);
                    break;
                case 24:
                    w0.Q(R(length), (List) d1.z(t, S(iL0)), writer, false);
                    break;
                case 25:
                    w0.M(R(length), (List) d1.z(t, S(iL0)), writer, false);
                    break;
                case 26:
                    w0.b0(R(length), (List) d1.z(t, S(iL0)), writer);
                    break;
                case 27:
                    w0.W(R(length), (List) d1.z(t, S(iL0)), writer, t(length));
                    break;
                case 28:
                    w0.N(R(length), (List) d1.z(t, S(iL0)), writer);
                    break;
                case 29:
                    w0.c0(R(length), (List) d1.z(t, S(iL0)), writer, false);
                    break;
                case 30:
                    w0.P(R(length), (List) d1.z(t, S(iL0)), writer, false);
                    break;
                case 31:
                    w0.X(R(length), (List) d1.z(t, S(iL0)), writer, false);
                    break;
                case 32:
                    w0.Y(R(length), (List) d1.z(t, S(iL0)), writer, false);
                    break;
                case 33:
                    w0.Z(R(length), (List) d1.z(t, S(iL0)), writer, false);
                    break;
                case 34:
                    w0.a0(R(length), (List) d1.z(t, S(iL0)), writer, false);
                    break;
                case 35:
                    w0.O(R(length), (List) d1.z(t, S(iL0)), writer, true);
                    break;
                case 36:
                    w0.S(R(length), (List) d1.z(t, S(iL0)), writer, true);
                    break;
                case 37:
                    w0.V(R(length), (List) d1.z(t, S(iL0)), writer, true);
                    break;
                case 38:
                    w0.d0(R(length), (List) d1.z(t, S(iL0)), writer, true);
                    break;
                case 39:
                    w0.U(R(length), (List) d1.z(t, S(iL0)), writer, true);
                    break;
                case 40:
                    w0.R(R(length), (List) d1.z(t, S(iL0)), writer, true);
                    break;
                case 41:
                    w0.Q(R(length), (List) d1.z(t, S(iL0)), writer, true);
                    break;
                case 42:
                    w0.M(R(length), (List) d1.z(t, S(iL0)), writer, true);
                    break;
                case 43:
                    w0.c0(R(length), (List) d1.z(t, S(iL0)), writer, true);
                    break;
                case 44:
                    w0.P(R(length), (List) d1.z(t, S(iL0)), writer, true);
                    break;
                case 45:
                    w0.X(R(length), (List) d1.z(t, S(iL0)), writer, true);
                    break;
                case 46:
                    w0.Y(R(length), (List) d1.z(t, S(iL0)), writer, true);
                    break;
                case 47:
                    w0.Z(R(length), (List) d1.z(t, S(iL0)), writer, true);
                    break;
                case 48:
                    w0.a0(R(length), (List) d1.z(t, S(iL0)), writer, true);
                    break;
                case 49:
                    w0.T(R(length), (List) d1.z(t, S(iL0)), writer, t(length));
                    break;
                case 50:
                    o0(writer, iR, d1.z(t, S(iL0)), length);
                    break;
                case 51:
                    if (E(t, iR, length)) {
                        writer.z(iR, U(t, S(iL0)));
                    }
                    break;
                case 52:
                    if (E(t, iR, length)) {
                        writer.F(iR, V(t, S(iL0)));
                    }
                    break;
                case 53:
                    if (E(t, iR, length)) {
                        writer.C(iR, X(t, S(iL0)));
                    }
                    break;
                case 54:
                    if (E(t, iR, length)) {
                        writer.e(iR, X(t, S(iL0)));
                    }
                    break;
                case 55:
                    if (E(t, iR, length)) {
                        writer.g(iR, W(t, S(iL0)));
                    }
                    break;
                case 56:
                    if (E(t, iR, length)) {
                        writer.m(iR, X(t, S(iL0)));
                    }
                    break;
                case 57:
                    if (E(t, iR, length)) {
                        writer.c(iR, W(t, S(iL0)));
                    }
                    break;
                case 58:
                    if (E(t, iR, length)) {
                        writer.n(iR, T(t, S(iL0)));
                    }
                    break;
                case 59:
                    if (E(t, iR, length)) {
                        p0(iR, d1.z(t, S(iL0)), writer);
                    }
                    break;
                case 60:
                    if (E(t, iR, length)) {
                        writer.K(iR, d1.z(t, S(iL0)), t(length));
                    }
                    break;
                case 61:
                    if (E(t, iR, length)) {
                        writer.J(iR, (ByteString) d1.z(t, S(iL0)));
                    }
                    break;
                case 62:
                    if (E(t, iR, length)) {
                        writer.k(iR, W(t, S(iL0)));
                    }
                    break;
                case 63:
                    if (E(t, iR, length)) {
                        writer.G(iR, W(t, S(iL0)));
                    }
                    break;
                case 64:
                    if (E(t, iR, length)) {
                        writer.o(iR, W(t, S(iL0)));
                    }
                    break;
                case 65:
                    if (E(t, iR, length)) {
                        writer.w(iR, X(t, S(iL0)));
                    }
                    break;
                case 66:
                    if (E(t, iR, length)) {
                        writer.I(iR, W(t, S(iL0)));
                    }
                    break;
                case 67:
                    if (E(t, iR, length)) {
                        writer.j(iR, X(t, S(iL0)));
                    }
                    break;
                case 68:
                    if (E(t, iR, length)) {
                        writer.N(iR, d1.z(t, S(iL0)), t(length));
                    }
                    break;
            }
        }
        while (entry != null) {
            this.p.j(writer, entry);
            entry = itG.hasNext() ? (Map.Entry) itG.next() : null;
        }
    }

    private <UT, UB> UB o(Object obj, int i, UB ub, a1<UT, UB> a1Var, Object obj2) {
        u.c cVarR;
        int iR = R(i);
        Object objZ = d1.z(obj, S(l0(i)));
        return (objZ == null || (cVarR = r(i)) == null) ? ub : (UB) p(i, iR, this.q.e(objZ), cVarR, ub, a1Var, obj2);
    }

    private <K, V> void o0(Writer writer, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            writer.L(i, this.q.b(s(i2)), this.q.g(obj));
        }
    }

    private <K, V, UT, UB> UB p(int i, int i2, Map<K, V> map, u.c cVar, UB ub, a1<UT, UB> a1Var, Object obj) {
        c0.a<?, ?> aVarB = this.q.b(s(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!cVar.isInRange(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = a1Var.f(obj);
                }
                ByteString.g gVarR = ByteString.r(c0.b(aVarB, next.getKey(), next.getValue()));
                try {
                    c0.e(gVarR.b(), aVarB, next.getKey(), next.getValue());
                    a1Var.d(ub, i2, gVarR.a());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    private void p0(int i, Object obj, Writer writer) throws IOException {
        if (obj instanceof String) {
            writer.d(i, (String) obj);
        } else {
            writer.J(i, (ByteString) obj);
        }
    }

    private static <T> float q(T t, long j) {
        return d1.v(t, j);
    }

    private <UT, UB> void q0(a1<UT, UB> a1Var, T t, Writer writer) throws IOException {
        a1Var.t(a1Var.g(t), writer);
    }

    private u.c r(int i) {
        return (u.c) this.b[((i / 3) * 2) + 1];
    }

    private Object s(int i) {
        return this.b[(i / 3) * 2];
    }

    private u0 t(int i) {
        int i2 = (i / 3) * 2;
        u0 u0Var = (u0) this.b[i2];
        if (u0Var != null) {
            return u0Var;
        }
        u0<T> u0VarC = q0.a().c((Class) this.b[i2 + 1]);
        this.b[i2] = u0VarC;
        return u0VarC;
    }

    private <UT, UB> int u(a1<UT, UB> a1Var, T t) {
        return a1Var.h(a1Var.g(t));
    }

    private static <T> int v(T t, long j) {
        return d1.w(t, j);
    }

    private static boolean w(int i) {
        return (i & 536870912) != 0;
    }

    private boolean x(T t, int i) {
        boolean zEquals;
        int iZ = Z(i);
        long j = 1048575 & iZ;
        if (j != 1048575) {
            return (d1.w(t, j) & (1 << (iZ >>> 20))) != 0;
        }
        int iL0 = l0(i);
        long jS = S(iL0);
        switch (k0(iL0)) {
            case 0:
                return Double.doubleToRawLongBits(d1.u(t, jS)) != 0;
            case 1:
                return Float.floatToRawIntBits(d1.v(t, jS)) != 0;
            case 2:
                return d1.x(t, jS) != 0;
            case 3:
                return d1.x(t, jS) != 0;
            case 4:
                return d1.w(t, jS) != 0;
            case 5:
                return d1.x(t, jS) != 0;
            case 6:
                return d1.w(t, jS) != 0;
            case 7:
                return d1.p(t, jS);
            case 8:
                Object objZ = d1.z(t, jS);
                if (objZ instanceof String) {
                    zEquals = ((String) objZ).isEmpty();
                } else {
                    if (!(objZ instanceof ByteString)) {
                        throw new IllegalArgumentException();
                    }
                    zEquals = ByteString.a.equals(objZ);
                }
                break;
            case lo6.HASACTION_FIELD_NUMBER /* 9 */:
                return d1.z(t, jS) != null;
            case lo6.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                zEquals = ByteString.a.equals(d1.z(t, jS));
                break;
            case lo6.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                return d1.w(t, jS) != 0;
            case 12:
                return d1.w(t, jS) != 0;
            case 13:
                return d1.w(t, jS) != 0;
            case 14:
                return d1.x(t, jS) != 0;
            case 15:
                return d1.w(t, jS) != 0;
            case 16:
                return d1.x(t, jS) != 0;
            case 17:
                return d1.z(t, jS) != null;
            default:
                throw new IllegalArgumentException();
        }
        return !zEquals;
    }

    private boolean y(T t, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return x(t, i);
        }
        return (i3 & i4) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean z(Object obj, int i, u0 u0Var) {
        return u0Var.d(d1.z(obj, S(i)));
    }

    @Override // androidx.datastore.preferences.protobuf.u0
    public void a(T t, T t2) {
        l(t);
        t2.getClass();
        for (int i = 0; i < this.a.length; i += 3) {
            L(t, t2, i);
        }
        w0.G(this.o, t, t2);
        if (this.f) {
            w0.E(this.p, t, t2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.u0
    public boolean b(T t, T t2) {
        int length = this.a.length;
        for (int i = 0; i < length; i += 3) {
            if (!n(t, t2, i)) {
                return false;
            }
        }
        if (!this.o.g(t).equals(this.o.g(t2))) {
            return false;
        }
        if (this.f) {
            return this.p.c(t).equals(this.p.c(t2));
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.u0
    public int c(T t) {
        int i;
        int iF;
        int length = this.a.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int iL0 = l0(i3);
            int iR = R(i3);
            long jS = S(iL0);
            int iHashCode = 37;
            switch (k0(iL0)) {
                case 0:
                    i = i2 * 53;
                    iF = u.f(Double.doubleToLongBits(d1.u(t, jS)));
                    i2 = i + iF;
                    break;
                case 1:
                    i = i2 * 53;
                    iF = Float.floatToIntBits(d1.v(t, jS));
                    i2 = i + iF;
                    break;
                case 2:
                    i = i2 * 53;
                    iF = u.f(d1.x(t, jS));
                    i2 = i + iF;
                    break;
                case 3:
                    i = i2 * 53;
                    iF = u.f(d1.x(t, jS));
                    i2 = i + iF;
                    break;
                case 4:
                    i = i2 * 53;
                    iF = d1.w(t, jS);
                    i2 = i + iF;
                    break;
                case 5:
                    i = i2 * 53;
                    iF = u.f(d1.x(t, jS));
                    i2 = i + iF;
                    break;
                case 6:
                    i = i2 * 53;
                    iF = d1.w(t, jS);
                    i2 = i + iF;
                    break;
                case 7:
                    i = i2 * 53;
                    iF = u.c(d1.p(t, jS));
                    i2 = i + iF;
                    break;
                case 8:
                    i = i2 * 53;
                    iF = ((String) d1.z(t, jS)).hashCode();
                    i2 = i + iF;
                    break;
                case lo6.HASACTION_FIELD_NUMBER /* 9 */:
                    Object objZ = d1.z(t, jS);
                    if (objZ != null) {
                        iHashCode = objZ.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
                    break;
                case lo6.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                    i = i2 * 53;
                    iF = d1.z(t, jS).hashCode();
                    i2 = i + iF;
                    break;
                case lo6.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                    i = i2 * 53;
                    iF = d1.w(t, jS);
                    i2 = i + iF;
                    break;
                case 12:
                    i = i2 * 53;
                    iF = d1.w(t, jS);
                    i2 = i + iF;
                    break;
                case 13:
                    i = i2 * 53;
                    iF = d1.w(t, jS);
                    i2 = i + iF;
                    break;
                case 14:
                    i = i2 * 53;
                    iF = u.f(d1.x(t, jS));
                    i2 = i + iF;
                    break;
                case 15:
                    i = i2 * 53;
                    iF = d1.w(t, jS);
                    i2 = i + iF;
                    break;
                case 16:
                    i = i2 * 53;
                    iF = u.f(d1.x(t, jS));
                    i2 = i + iF;
                    break;
                case 17:
                    Object objZ2 = d1.z(t, jS);
                    if (objZ2 != null) {
                        iHashCode = objZ2.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i2 * 53;
                    iF = d1.z(t, jS).hashCode();
                    i2 = i + iF;
                    break;
                case 50:
                    i = i2 * 53;
                    iF = d1.z(t, jS).hashCode();
                    i2 = i + iF;
                    break;
                case 51:
                    if (E(t, iR, i3)) {
                        i = i2 * 53;
                        iF = u.f(Double.doubleToLongBits(U(t, jS)));
                        i2 = i + iF;
                    }
                    break;
                case 52:
                    if (E(t, iR, i3)) {
                        i = i2 * 53;
                        iF = Float.floatToIntBits(V(t, jS));
                        i2 = i + iF;
                    }
                    break;
                case 53:
                    if (E(t, iR, i3)) {
                        i = i2 * 53;
                        iF = u.f(X(t, jS));
                        i2 = i + iF;
                    }
                    break;
                case 54:
                    if (E(t, iR, i3)) {
                        i = i2 * 53;
                        iF = u.f(X(t, jS));
                        i2 = i + iF;
                    }
                    break;
                case 55:
                    if (E(t, iR, i3)) {
                        i = i2 * 53;
                        iF = W(t, jS);
                        i2 = i + iF;
                    }
                    break;
                case 56:
                    if (E(t, iR, i3)) {
                        i = i2 * 53;
                        iF = u.f(X(t, jS));
                        i2 = i + iF;
                    }
                    break;
                case 57:
                    if (E(t, iR, i3)) {
                        i = i2 * 53;
                        iF = W(t, jS);
                        i2 = i + iF;
                    }
                    break;
                case 58:
                    if (E(t, iR, i3)) {
                        i = i2 * 53;
                        iF = u.c(T(t, jS));
                        i2 = i + iF;
                    }
                    break;
                case 59:
                    if (E(t, iR, i3)) {
                        i = i2 * 53;
                        iF = ((String) d1.z(t, jS)).hashCode();
                        i2 = i + iF;
                    }
                    break;
                case 60:
                    if (E(t, iR, i3)) {
                        i = i2 * 53;
                        iF = d1.z(t, jS).hashCode();
                        i2 = i + iF;
                    }
                    break;
                case 61:
                    if (E(t, iR, i3)) {
                        i = i2 * 53;
                        iF = d1.z(t, jS).hashCode();
                        i2 = i + iF;
                    }
                    break;
                case 62:
                    if (E(t, iR, i3)) {
                        i = i2 * 53;
                        iF = W(t, jS);
                        i2 = i + iF;
                    }
                    break;
                case 63:
                    if (E(t, iR, i3)) {
                        i = i2 * 53;
                        iF = W(t, jS);
                        i2 = i + iF;
                    }
                    break;
                case 64:
                    if (E(t, iR, i3)) {
                        i = i2 * 53;
                        iF = W(t, jS);
                        i2 = i + iF;
                    }
                    break;
                case 65:
                    if (E(t, iR, i3)) {
                        i = i2 * 53;
                        iF = u.f(X(t, jS));
                        i2 = i + iF;
                    }
                    break;
                case 66:
                    if (E(t, iR, i3)) {
                        i = i2 * 53;
                        iF = W(t, jS);
                        i2 = i + iF;
                    }
                    break;
                case 67:
                    if (E(t, iR, i3)) {
                        i = i2 * 53;
                        iF = u.f(X(t, jS));
                        i2 = i + iF;
                    }
                    break;
                case 68:
                    if (E(t, iR, i3)) {
                        i = i2 * 53;
                        iF = d1.z(t, jS).hashCode();
                        i2 = i + iF;
                    }
                    break;
            }
        }
        int iHashCode2 = (i2 * 53) + this.o.g(t).hashCode();
        return this.f ? (iHashCode2 * 53) + this.p.c(t).hashCode() : iHashCode2;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x007c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0094 A[SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.u0
    public final boolean d(T t) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i4 < this.k) {
            int i6 = this.j[i4];
            int iR = R(i6);
            int iL0 = l0(i6);
            int i7 = this.a[i6 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i3) {
                if (i8 != 1048575) {
                    i5 = s.getInt(t, i8);
                }
                i2 = i5;
                i = i8;
            } else {
                i = i3;
                i2 = i5;
            }
            T t2 = t;
            if (F(iL0) && !y(t2, i6, i, i2, i9)) {
                return false;
            }
            int iK0 = k0(iL0);
            if (iK0 == 9 || iK0 == 17) {
                if (y(t2, i6, i, i2, i9) && !z(t2, iL0, t(i6))) {
                    return false;
                }
            } else if (iK0 == 27) {
                if (!A(t2, iL0, i6)) {
                    return false;
                }
            } else if (iK0 == 60 || iK0 == 68) {
                if (E(t2, iR, i6) && !z(t2, iL0, t(i6))) {
                    return false;
                }
            } else if (iK0 != 49) {
                if (iK0 == 50 && !B(t2, iL0, i6)) {
                    return false;
                }
            } else if (!A(t2, iL0, i6)) {
                return false;
            }
            i4++;
            t = t2;
            i3 = i;
            i5 = i2;
        }
        return !this.f || this.p.c(t).p();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x007d A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.u0
    public void e(T t) {
        if (C(t)) {
            if (t instanceof GeneratedMessageLite) {
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t;
                generatedMessageLite.l();
                generatedMessageLite.k();
                generatedMessageLite.C();
            }
            int length = this.a.length;
            for (int i = 0; i < length; i += 3) {
                int iL0 = l0(i);
                long jS = S(iL0);
                int iK0 = k0(iL0);
                if (iK0 != 9) {
                    if (iK0 != 60 && iK0 != 68) {
                        switch (iK0) {
                            case 17:
                                if (x(t, i)) {
                                    t(i).e(s.getObject(t, jS));
                                }
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.n.b(t, jS);
                                break;
                            case 50:
                                Unsafe unsafe = s;
                                Object object = unsafe.getObject(t, jS);
                                if (object != null) {
                                    unsafe.putObject(t, jS, this.q.c(object));
                                }
                                break;
                        }
                    } else if (E(t, R(i), i)) {
                        t(i).e(s.getObject(t, jS));
                    }
                } else if (x(t, i)) {
                    t(i).e(s.getObject(t, jS));
                }
            }
            this.o.j(t);
            if (this.f) {
                this.p.f(t);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:247:0x0552 A[PHI: r0 r1
  0x0552: PHI (r0v2 androidx.datastore.preferences.protobuf.k0<T>) = 
  (r0v1 androidx.datastore.preferences.protobuf.k0<T>)
  (r0v1 androidx.datastore.preferences.protobuf.k0<T>)
  (r0v1 androidx.datastore.preferences.protobuf.k0<T>)
  (r0v24 androidx.datastore.preferences.protobuf.k0<T>)
  (r0v30 androidx.datastore.preferences.protobuf.k0<T>)
  (r0v1 androidx.datastore.preferences.protobuf.k0<T>)
  (r0v1 androidx.datastore.preferences.protobuf.k0<T>)
  (r0v1 androidx.datastore.preferences.protobuf.k0<T>)
  (r0v1 androidx.datastore.preferences.protobuf.k0<T>)
  (r0v1 androidx.datastore.preferences.protobuf.k0<T>)
  (r0v1 androidx.datastore.preferences.protobuf.k0<T>)
  (r0v1 androidx.datastore.preferences.protobuf.k0<T>)
  (r0v1 androidx.datastore.preferences.protobuf.k0<T>)
  (r0v1 androidx.datastore.preferences.protobuf.k0<T>)
  (r0v1 androidx.datastore.preferences.protobuf.k0<T>)
  (r0v1 androidx.datastore.preferences.protobuf.k0<T>)
  (r0v1 androidx.datastore.preferences.protobuf.k0<T>)
  (r0v1 androidx.datastore.preferences.protobuf.k0<T>)
  (r0v1 androidx.datastore.preferences.protobuf.k0<T>)
  (r0v1 androidx.datastore.preferences.protobuf.k0<T>)
  (r0v1 androidx.datastore.preferences.protobuf.k0<T>)
  (r0v1 androidx.datastore.preferences.protobuf.k0<T>)
  (r0v1 androidx.datastore.preferences.protobuf.k0<T>)
  (r0v1 androidx.datastore.preferences.protobuf.k0<T>)
  (r0v1 androidx.datastore.preferences.protobuf.k0<T>)
  (r0v1 androidx.datastore.preferences.protobuf.k0<T>)
  (r0v1 androidx.datastore.preferences.protobuf.k0<T>)
  (r0v1 androidx.datastore.preferences.protobuf.k0<T>)
  (r0v1 androidx.datastore.preferences.protobuf.k0<T>)
  (r0v1 androidx.datastore.preferences.protobuf.k0<T>)
  (r0v1 androidx.datastore.preferences.protobuf.k0<T>)
  (r0v1 androidx.datastore.preferences.protobuf.k0<T>)
  (r0v1 androidx.datastore.preferences.protobuf.k0<T>)
  (r0v1 androidx.datastore.preferences.protobuf.k0<T>)
  (r0v1 androidx.datastore.preferences.protobuf.k0<T>)
  (r0v1 androidx.datastore.preferences.protobuf.k0<T>)
  (r0v1 androidx.datastore.preferences.protobuf.k0<T>)
  (r0v1 androidx.datastore.preferences.protobuf.k0<T>)
 binds: [B:22:0x005b, B:245:0x0548, B:215:0x04ab, B:201:0x0462, B:193:0x043b, B:187:0x0414, B:164:0x032b, B:158:0x030d, B:152:0x02ef, B:146:0x02d1, B:140:0x02b3, B:134:0x0295, B:128:0x0277, B:122:0x0259, B:116:0x023b, B:110:0x021e, B:104:0x0201, B:98:0x01e4, B:92:0x01c7, B:85:0x01a5, B:80:0x0171, B:77:0x0165, B:74:0x0155, B:71:0x0145, B:68:0x0135, B:65:0x0129, B:62:0x011d, B:59:0x0110, B:53:0x00f2, B:50:0x00df, B:47:0x00ce, B:44:0x00bf, B:41:0x00b0, B:38:0x00a5, B:35:0x009a, B:32:0x008b, B:29:0x007c, B:25:0x0064] A[DONT_GENERATE, DONT_INLINE]
  0x0552: PHI (r1v4 T) = 
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v5 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
 binds: [B:22:0x005b, B:245:0x0548, B:215:0x04ab, B:201:0x0462, B:193:0x043b, B:187:0x0414, B:164:0x032b, B:158:0x030d, B:152:0x02ef, B:146:0x02d1, B:140:0x02b3, B:134:0x0295, B:128:0x0277, B:122:0x0259, B:116:0x023b, B:110:0x021e, B:104:0x0201, B:98:0x01e4, B:92:0x01c7, B:85:0x01a5, B:80:0x0171, B:77:0x0165, B:74:0x0155, B:71:0x0145, B:68:0x0135, B:65:0x0129, B:62:0x011d, B:59:0x0110, B:53:0x00f2, B:50:0x00df, B:47:0x00ce, B:44:0x00bf, B:41:0x00b0, B:38:0x00a5, B:35:0x009a, B:32:0x008b, B:29:0x007c, B:25:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.datastore.preferences.protobuf.u0
    public int f(T t) {
        int i;
        int i2;
        int iQ;
        int iX;
        int i3;
        int iU;
        int iW;
        k0<T> k0Var = this;
        T t2 = t;
        Unsafe unsafe = s;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 1048575;
        while (i5 < k0Var.a.length) {
            int iL0 = k0Var.l0(i5);
            int iK0 = k0(iL0);
            int iR = k0Var.R(i5);
            int i9 = k0Var.a[i5 + 2];
            int i10 = i9 & i4;
            if (iK0 <= 17) {
                if (i10 != i8) {
                    i6 = i10 == i4 ? 0 : unsafe.getInt(t2, i10);
                    i8 = i10;
                }
                i = 1 << (i9 >>> 20);
            } else {
                i = 0;
            }
            int i11 = i7;
            long jS = S(iL0);
            if (iK0 < FieldType.J.a() || iK0 > FieldType.W.a()) {
                i10 = 0;
            }
            switch (iK0) {
                case 0:
                    if (!k0Var.y(t2, i5, i8, i6, i)) {
                        i7 = i11;
                    } else {
                        i2 = CodedOutputStream.i(iR, 0.0d);
                        i7 = i11 + i2;
                    }
                    break;
                case 1:
                    if (k0Var.y(t2, i5, i8, i6, i)) {
                        iQ = CodedOutputStream.q(iR, 0.0f);
                        i7 = i11 + iQ;
                        k0Var = this;
                        t2 = t;
                    }
                    k0Var = this;
                    t2 = t;
                    i7 = i11;
                    break;
                case 2:
                    if (k0Var.y(t2, i5, i8, i6, i)) {
                        iX = CodedOutputStream.x(iR, unsafe.getLong(t2, jS));
                        i7 = i11 + iX;
                        k0Var = this;
                    }
                    k0Var = this;
                    i7 = i11;
                    break;
                case 3:
                    if (k0Var.y(t2, i5, i8, i6, i)) {
                        iX = CodedOutputStream.X(iR, unsafe.getLong(t2, jS));
                        i7 = i11 + iX;
                        k0Var = this;
                    }
                    k0Var = this;
                    i7 = i11;
                    break;
                case 4:
                    if (k0Var.y(t2, i5, i8, i6, i)) {
                        iX = CodedOutputStream.v(iR, unsafe.getInt(t2, jS));
                        i7 = i11 + iX;
                        k0Var = this;
                    }
                    k0Var = this;
                    i7 = i11;
                    break;
                case 5:
                    if (k0Var.y(t2, i5, i8, i6, i)) {
                        iQ = CodedOutputStream.o(iR, 0L);
                        i7 = i11 + iQ;
                        k0Var = this;
                        t2 = t;
                    }
                    k0Var = this;
                    t2 = t;
                    i7 = i11;
                    break;
                case 6:
                    if (k0Var.y(t2, i5, i8, i6, i)) {
                        iQ = CodedOutputStream.m(iR, 0);
                        i7 = i11 + iQ;
                        k0Var = this;
                        t2 = t;
                    }
                    k0Var = this;
                    t2 = t;
                    i7 = i11;
                    break;
                case 7:
                    if (k0Var.y(t2, i5, i8, i6, i)) {
                        iQ = CodedOutputStream.d(iR, true);
                        i7 = i11 + iQ;
                        k0Var = this;
                        t2 = t;
                    }
                    k0Var = this;
                    t2 = t;
                    i7 = i11;
                    break;
                case 8:
                    if (k0Var.y(t2, i5, i8, i6, i)) {
                        Object object = unsafe.getObject(t2, jS);
                        iX = object instanceof ByteString ? CodedOutputStream.g(iR, (ByteString) object) : CodedOutputStream.S(iR, (String) object);
                        i7 = i11 + iX;
                        k0Var = this;
                    }
                    k0Var = this;
                    i7 = i11;
                    break;
                case lo6.HASACTION_FIELD_NUMBER /* 9 */:
                    if (!k0Var.y(t2, i5, i8, i6, i)) {
                        i7 = i11;
                    } else {
                        i2 = w0.o(iR, unsafe.getObject(t2, jS), k0Var.t(i5));
                        i7 = i11 + i2;
                    }
                    break;
                case lo6.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                    if (k0Var.y(t2, i5, i8, i6, i)) {
                        iX = CodedOutputStream.g(iR, (ByteString) unsafe.getObject(t2, jS));
                        i7 = i11 + iX;
                        k0Var = this;
                    }
                    k0Var = this;
                    i7 = i11;
                    break;
                case lo6.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                    if (k0Var.y(t2, i5, i8, i6, i)) {
                        iX = CodedOutputStream.V(iR, unsafe.getInt(t2, jS));
                        i7 = i11 + iX;
                        k0Var = this;
                    }
                    k0Var = this;
                    i7 = i11;
                    break;
                case 12:
                    if (k0Var.y(t2, i5, i8, i6, i)) {
                        iX = CodedOutputStream.k(iR, unsafe.getInt(t2, jS));
                        i7 = i11 + iX;
                        k0Var = this;
                    }
                    k0Var = this;
                    i7 = i11;
                    break;
                case 13:
                    if (k0Var.y(t2, i5, i8, i6, i)) {
                        iQ = CodedOutputStream.K(iR, 0);
                        i7 = i11 + iQ;
                        k0Var = this;
                        t2 = t;
                    }
                    k0Var = this;
                    t2 = t;
                    i7 = i11;
                    break;
                case 14:
                    if (k0Var.y(t2, i5, i8, i6, i)) {
                        iQ = CodedOutputStream.M(iR, 0L);
                        i7 = i11 + iQ;
                        k0Var = this;
                        t2 = t;
                    }
                    k0Var = this;
                    t2 = t;
                    i7 = i11;
                    break;
                case 15:
                    if (k0Var.y(t2, i5, i8, i6, i)) {
                        iX = CodedOutputStream.O(iR, unsafe.getInt(t2, jS));
                        i7 = i11 + iX;
                        k0Var = this;
                    }
                    k0Var = this;
                    i7 = i11;
                    break;
                case 16:
                    if (k0Var.y(t2, i5, i8, i6, i)) {
                        iX = CodedOutputStream.Q(iR, unsafe.getLong(t2, jS));
                        i7 = i11 + iX;
                        k0Var = this;
                    }
                    k0Var = this;
                    i7 = i11;
                    break;
                case 17:
                    if (!k0Var.y(t2, i5, i8, i6, i)) {
                        i7 = i11;
                    } else {
                        i2 = CodedOutputStream.s(iR, (i0) unsafe.getObject(t2, jS), k0Var.t(i5));
                        i7 = i11 + i2;
                    }
                    break;
                case 18:
                    i2 = w0.h(iR, (List) unsafe.getObject(t2, jS), false);
                    i7 = i11 + i2;
                    break;
                case 19:
                    i2 = w0.f(iR, (List) unsafe.getObject(t2, jS), false);
                    i7 = i11 + i2;
                    break;
                case 20:
                    i2 = w0.m(iR, (List) unsafe.getObject(t2, jS), false);
                    i7 = i11 + i2;
                    break;
                case 21:
                    i2 = w0.x(iR, (List) unsafe.getObject(t2, jS), false);
                    i7 = i11 + i2;
                    break;
                case 22:
                    i2 = w0.k(iR, (List) unsafe.getObject(t2, jS), false);
                    i7 = i11 + i2;
                    break;
                case 23:
                    i2 = w0.h(iR, (List) unsafe.getObject(t2, jS), false);
                    i7 = i11 + i2;
                    break;
                case 24:
                    i2 = w0.f(iR, (List) unsafe.getObject(t2, jS), false);
                    i7 = i11 + i2;
                    break;
                case 25:
                    i2 = w0.a(iR, (List) unsafe.getObject(t2, jS), false);
                    i7 = i11 + i2;
                    break;
                case 26:
                    i2 = w0.u(iR, (List) unsafe.getObject(t2, jS));
                    i7 = i11 + i2;
                    break;
                case 27:
                    i2 = w0.p(iR, (List) unsafe.getObject(t2, jS), k0Var.t(i5));
                    i7 = i11 + i2;
                    break;
                case 28:
                    i2 = w0.c(iR, (List) unsafe.getObject(t2, jS));
                    i7 = i11 + i2;
                    break;
                case 29:
                    i2 = w0.v(iR, (List) unsafe.getObject(t2, jS), false);
                    i7 = i11 + i2;
                    break;
                case 30:
                    i2 = w0.d(iR, (List) unsafe.getObject(t2, jS), false);
                    i7 = i11 + i2;
                    break;
                case 31:
                    i2 = w0.f(iR, (List) unsafe.getObject(t2, jS), false);
                    i7 = i11 + i2;
                    break;
                case 32:
                    i2 = w0.h(iR, (List) unsafe.getObject(t2, jS), false);
                    i7 = i11 + i2;
                    break;
                case 33:
                    i2 = w0.q(iR, (List) unsafe.getObject(t2, jS), false);
                    i7 = i11 + i2;
                    break;
                case 34:
                    i2 = w0.s(iR, (List) unsafe.getObject(t2, jS), false);
                    i7 = i11 + i2;
                    break;
                case 35:
                    i3 = w0.i((List) unsafe.getObject(t2, jS));
                    if (i3 <= 0) {
                        i7 = i11;
                    } else {
                        if (k0Var.i) {
                            unsafe.putInt(t2, i10, i3);
                        }
                        iU = CodedOutputStream.U(iR);
                        iW = CodedOutputStream.W(i3);
                        i7 = i11 + iU + iW + i3;
                    }
                    break;
                case 36:
                    i3 = w0.g((List) unsafe.getObject(t2, jS));
                    if (i3 <= 0) {
                        i7 = i11;
                    } else {
                        if (k0Var.i) {
                            unsafe.putInt(t2, i10, i3);
                        }
                        iU = CodedOutputStream.U(iR);
                        iW = CodedOutputStream.W(i3);
                        i7 = i11 + iU + iW + i3;
                    }
                    break;
                case 37:
                    i3 = w0.n((List) unsafe.getObject(t2, jS));
                    if (i3 <= 0) {
                        i7 = i11;
                    } else {
                        if (k0Var.i) {
                            unsafe.putInt(t2, i10, i3);
                        }
                        iU = CodedOutputStream.U(iR);
                        iW = CodedOutputStream.W(i3);
                        i7 = i11 + iU + iW + i3;
                    }
                    break;
                case 38:
                    i3 = w0.y((List) unsafe.getObject(t2, jS));
                    if (i3 <= 0) {
                        i7 = i11;
                    } else {
                        if (k0Var.i) {
                            unsafe.putInt(t2, i10, i3);
                        }
                        iU = CodedOutputStream.U(iR);
                        iW = CodedOutputStream.W(i3);
                        i7 = i11 + iU + iW + i3;
                    }
                    break;
                case 39:
                    i3 = w0.l((List) unsafe.getObject(t2, jS));
                    if (i3 <= 0) {
                        i7 = i11;
                    } else {
                        if (k0Var.i) {
                            unsafe.putInt(t2, i10, i3);
                        }
                        iU = CodedOutputStream.U(iR);
                        iW = CodedOutputStream.W(i3);
                        i7 = i11 + iU + iW + i3;
                    }
                    break;
                case 40:
                    i3 = w0.i((List) unsafe.getObject(t2, jS));
                    if (i3 <= 0) {
                        i7 = i11;
                    } else {
                        if (k0Var.i) {
                            unsafe.putInt(t2, i10, i3);
                        }
                        iU = CodedOutputStream.U(iR);
                        iW = CodedOutputStream.W(i3);
                        i7 = i11 + iU + iW + i3;
                    }
                    break;
                case 41:
                    i3 = w0.g((List) unsafe.getObject(t2, jS));
                    if (i3 <= 0) {
                        i7 = i11;
                    } else {
                        if (k0Var.i) {
                            unsafe.putInt(t2, i10, i3);
                        }
                        iU = CodedOutputStream.U(iR);
                        iW = CodedOutputStream.W(i3);
                        i7 = i11 + iU + iW + i3;
                    }
                    break;
                case 42:
                    i3 = w0.b((List) unsafe.getObject(t2, jS));
                    if (i3 <= 0) {
                        i7 = i11;
                    } else {
                        if (k0Var.i) {
                            unsafe.putInt(t2, i10, i3);
                        }
                        iU = CodedOutputStream.U(iR);
                        iW = CodedOutputStream.W(i3);
                        i7 = i11 + iU + iW + i3;
                    }
                    break;
                case 43:
                    i3 = w0.w((List) unsafe.getObject(t2, jS));
                    if (i3 <= 0) {
                        i7 = i11;
                    } else {
                        if (k0Var.i) {
                            unsafe.putInt(t2, i10, i3);
                        }
                        iU = CodedOutputStream.U(iR);
                        iW = CodedOutputStream.W(i3);
                        i7 = i11 + iU + iW + i3;
                    }
                    break;
                case 44:
                    i3 = w0.e((List) unsafe.getObject(t2, jS));
                    if (i3 <= 0) {
                        i7 = i11;
                    } else {
                        if (k0Var.i) {
                            unsafe.putInt(t2, i10, i3);
                        }
                        iU = CodedOutputStream.U(iR);
                        iW = CodedOutputStream.W(i3);
                        i7 = i11 + iU + iW + i3;
                    }
                    break;
                case 45:
                    i3 = w0.g((List) unsafe.getObject(t2, jS));
                    if (i3 <= 0) {
                        i7 = i11;
                    } else {
                        if (k0Var.i) {
                            unsafe.putInt(t2, i10, i3);
                        }
                        iU = CodedOutputStream.U(iR);
                        iW = CodedOutputStream.W(i3);
                        i7 = i11 + iU + iW + i3;
                    }
                    break;
                case 46:
                    i3 = w0.i((List) unsafe.getObject(t2, jS));
                    if (i3 <= 0) {
                        i7 = i11;
                    } else {
                        if (k0Var.i) {
                            unsafe.putInt(t2, i10, i3);
                        }
                        iU = CodedOutputStream.U(iR);
                        iW = CodedOutputStream.W(i3);
                        i7 = i11 + iU + iW + i3;
                    }
                    break;
                case 47:
                    i3 = w0.r((List) unsafe.getObject(t2, jS));
                    if (i3 <= 0) {
                        i7 = i11;
                    } else {
                        if (k0Var.i) {
                            unsafe.putInt(t2, i10, i3);
                        }
                        iU = CodedOutputStream.U(iR);
                        iW = CodedOutputStream.W(i3);
                        i7 = i11 + iU + iW + i3;
                    }
                    break;
                case 48:
                    i3 = w0.t((List) unsafe.getObject(t2, jS));
                    if (i3 <= 0) {
                        i7 = i11;
                    } else {
                        if (k0Var.i) {
                            unsafe.putInt(t2, i10, i3);
                        }
                        iU = CodedOutputStream.U(iR);
                        iW = CodedOutputStream.W(i3);
                        i7 = i11 + iU + iW + i3;
                    }
                    break;
                case 49:
                    i2 = w0.j(iR, (List) unsafe.getObject(t2, jS), k0Var.t(i5));
                    i7 = i11 + i2;
                    break;
                case 50:
                    i2 = k0Var.q.d(iR, unsafe.getObject(t2, jS), k0Var.s(i5));
                    i7 = i11 + i2;
                    break;
                case 51:
                    if (!k0Var.E(t2, iR, i5)) {
                        i7 = i11;
                    } else {
                        i2 = CodedOutputStream.i(iR, 0.0d);
                        i7 = i11 + i2;
                    }
                    break;
                case 52:
                    if (!k0Var.E(t2, iR, i5)) {
                        i7 = i11;
                    } else {
                        i2 = CodedOutputStream.q(iR, 0.0f);
                        i7 = i11 + i2;
                    }
                    break;
                case 53:
                    if (!k0Var.E(t2, iR, i5)) {
                        i7 = i11;
                    } else {
                        i2 = CodedOutputStream.x(iR, X(t2, jS));
                        i7 = i11 + i2;
                    }
                    break;
                case 54:
                    if (!k0Var.E(t2, iR, i5)) {
                        i7 = i11;
                    } else {
                        i2 = CodedOutputStream.X(iR, X(t2, jS));
                        i7 = i11 + i2;
                    }
                    break;
                case 55:
                    if (!k0Var.E(t2, iR, i5)) {
                        i7 = i11;
                    } else {
                        i2 = CodedOutputStream.v(iR, W(t2, jS));
                        i7 = i11 + i2;
                    }
                    break;
                case 56:
                    if (!k0Var.E(t2, iR, i5)) {
                        i7 = i11;
                    } else {
                        i2 = CodedOutputStream.o(iR, 0L);
                        i7 = i11 + i2;
                    }
                    break;
                case 57:
                    if (!k0Var.E(t2, iR, i5)) {
                        i7 = i11;
                    } else {
                        i2 = CodedOutputStream.m(iR, 0);
                        i7 = i11 + i2;
                    }
                    break;
                case 58:
                    if (!k0Var.E(t2, iR, i5)) {
                        i7 = i11;
                    } else {
                        i2 = CodedOutputStream.d(iR, true);
                        i7 = i11 + i2;
                    }
                    break;
                case 59:
                    if (!k0Var.E(t2, iR, i5)) {
                        i7 = i11;
                    } else {
                        Object object2 = unsafe.getObject(t2, jS);
                        i2 = object2 instanceof ByteString ? CodedOutputStream.g(iR, (ByteString) object2) : CodedOutputStream.S(iR, (String) object2);
                        i7 = i11 + i2;
                    }
                    break;
                case 60:
                    if (!k0Var.E(t2, iR, i5)) {
                        i7 = i11;
                    } else {
                        i2 = w0.o(iR, unsafe.getObject(t2, jS), k0Var.t(i5));
                        i7 = i11 + i2;
                    }
                    break;
                case 61:
                    if (!k0Var.E(t2, iR, i5)) {
                        i7 = i11;
                    } else {
                        i2 = CodedOutputStream.g(iR, (ByteString) unsafe.getObject(t2, jS));
                        i7 = i11 + i2;
                    }
                    break;
                case 62:
                    if (!k0Var.E(t2, iR, i5)) {
                        i7 = i11;
                    } else {
                        i2 = CodedOutputStream.V(iR, W(t2, jS));
                        i7 = i11 + i2;
                    }
                    break;
                case 63:
                    if (!k0Var.E(t2, iR, i5)) {
                        i7 = i11;
                    } else {
                        i2 = CodedOutputStream.k(iR, W(t2, jS));
                        i7 = i11 + i2;
                    }
                    break;
                case 64:
                    if (!k0Var.E(t2, iR, i5)) {
                        i7 = i11;
                    } else {
                        i2 = CodedOutputStream.K(iR, 0);
                        i7 = i11 + i2;
                    }
                    break;
                case 65:
                    if (!k0Var.E(t2, iR, i5)) {
                        i7 = i11;
                    } else {
                        i2 = CodedOutputStream.M(iR, 0L);
                        i7 = i11 + i2;
                    }
                    break;
                case 66:
                    if (!k0Var.E(t2, iR, i5)) {
                        i7 = i11;
                    } else {
                        i2 = CodedOutputStream.O(iR, W(t2, jS));
                        i7 = i11 + i2;
                    }
                    break;
                case 67:
                    if (!k0Var.E(t2, iR, i5)) {
                        i7 = i11;
                    } else {
                        i2 = CodedOutputStream.Q(iR, X(t2, jS));
                        i7 = i11 + i2;
                    }
                    break;
                case 68:
                    if (!k0Var.E(t2, iR, i5)) {
                        i7 = i11;
                    } else {
                        i2 = CodedOutputStream.s(iR, (i0) unsafe.getObject(t2, jS), k0Var.t(i5));
                        i7 = i11 + i2;
                    }
                    break;
                default:
                    i7 = i11;
                    break;
            }
            i5 += 3;
            i4 = 1048575;
        }
        int iU2 = i7 + k0Var.u(k0Var.o, t2);
        return k0Var.f ? iU2 + k0Var.p.c(t2).l() : iU2;
    }

    @Override // androidx.datastore.preferences.protobuf.u0
    public T g() {
        return (T) this.m.a(this.e);
    }

    @Override // androidx.datastore.preferences.protobuf.u0
    public void h(T t, Writer writer) throws IOException {
        if (writer.B() == Writer.FieldOrder.DESCENDING) {
            n0(t, writer);
        } else {
            m0(t, writer);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.u0
    public void i(T t, t0 t0Var, l lVar) throws IOException {
        lVar.getClass();
        l(t);
        H(this.o, this.p, t, t0Var, lVar);
    }
}
