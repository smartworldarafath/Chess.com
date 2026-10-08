package androidx.p008glance.p009appwidget.protobuf;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public final class b1 {
    private static final b1 f = new b1(0, new int[0], new Object[0], false);
    private int a;
    private int[] b;
    private Object[] c;
    private int d;
    private boolean e;

    private b1() {
        this(0, new int[8], new Object[8], true);
    }

    private void b(int i) {
        int[] iArr = this.b;
        if (i > iArr.length) {
            int i2 = this.a;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.b = Arrays.copyOf(iArr, i);
            this.c = Arrays.copyOf(this.c, i);
        }
    }

    public static b1 c() {
        return f;
    }

    private static int f(int[] iArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        return i2;
    }

    private static int g(Object[] objArr, int i) {
        int iHashCode = 17;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode = (iHashCode * 31) + objArr[i2].hashCode();
        }
        return iHashCode;
    }

    static b1 j(b1 b1Var, b1 b1Var2) {
        int i = b1Var.a + b1Var2.a;
        int[] iArrCopyOf = Arrays.copyOf(b1Var.b, i);
        System.arraycopy(b1Var2.b, 0, iArrCopyOf, b1Var.a, b1Var2.a);
        Object[] objArrCopyOf = Arrays.copyOf(b1Var.c, i);
        System.arraycopy(b1Var2.c, 0, objArrCopyOf, b1Var.a, b1Var2.a);
        return new b1(i, iArrCopyOf, objArrCopyOf, true);
    }

    static b1 k() {
        return new b1();
    }

    private static boolean l(Object[] objArr, Object[] objArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (!objArr[i2].equals(objArr2[i2])) {
                return false;
            }
        }
        return true;
    }

    private static boolean o(int[] iArr, int[] iArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    private static void q(int i, Object obj, Writer writer) throws IOException {
        int iA = WireFormat.a(i);
        int iB = WireFormat.b(i);
        if (iB == 0) {
            writer.C(iA, ((Long) obj).longValue());
            return;
        }
        if (iB == 1) {
            writer.m(iA, ((Long) obj).longValue());
            return;
        }
        if (iB == 2) {
            writer.K(iA, (ByteString) obj);
            return;
        }
        if (iB != 3) {
            if (iB != 5) {
                throw new RuntimeException(InvalidProtocolBufferException.e());
            }
            writer.c(iA, ((Integer) obj).intValue());
        } else if (writer.B() == Writer.FieldOrder.ASCENDING) {
            writer.p(iA);
            ((b1) obj).r(writer);
            writer.r(iA);
        } else {
            writer.r(iA);
            ((b1) obj).r(writer);
            writer.p(iA);
        }
    }

    void a() {
        if (!this.e) {
            throw new UnsupportedOperationException();
        }
    }

    public int d() {
        int iX;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = this.b[i3];
            int iA = WireFormat.a(i4);
            int iB = WireFormat.b(i4);
            if (iB == 0) {
                iX = CodedOutputStream.X(iA, ((Long) this.c[i3]).longValue());
            } else if (iB == 1) {
                iX = CodedOutputStream.o(iA, ((Long) this.c[i3]).longValue());
            } else if (iB == 2) {
                iX = CodedOutputStream.g(iA, (ByteString) this.c[i3]);
            } else if (iB == 3) {
                iX = (CodedOutputStream.U(iA) * 2) + ((b1) this.c[i3]).d();
            } else {
                if (iB != 5) {
                    throw new IllegalStateException(InvalidProtocolBufferException.e());
                }
                iX = CodedOutputStream.m(iA, ((Integer) this.c[i3]).intValue());
            }
            i2 += iX;
        }
        this.d = i2;
        return i2;
    }

    public int e() {
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int iJ = 0;
        for (int i2 = 0; i2 < this.a; i2++) {
            iJ += CodedOutputStream.J(WireFormat.a(this.b[i2]), (ByteString) this.c[i2]);
        }
        this.d = iJ;
        return iJ;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        int i = this.a;
        return i == b1Var.a && o(this.b, b1Var.b, i) && l(this.c, b1Var.c, this.a);
    }

    public void h() {
        if (this.e) {
            this.e = false;
        }
    }

    public int hashCode() {
        int i = this.a;
        return ((((527 + i) * 31) + f(this.b, i)) * 31) + g(this.c, this.a);
    }

    b1 i(b1 b1Var) {
        if (b1Var.equals(c())) {
            return this;
        }
        a();
        int i = this.a + b1Var.a;
        b(i);
        System.arraycopy(b1Var.b, 0, this.b, this.a, b1Var.a);
        System.arraycopy(b1Var.c, 0, this.c, this.a, b1Var.a);
        this.a = i;
        return this;
    }

    final void m(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.a; i2++) {
            j0.d(sb, i, String.valueOf(WireFormat.a(this.b[i2])), this.c[i2]);
        }
    }

    void n(int i, Object obj) {
        a();
        b(this.a + 1);
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.a = i2 + 1;
    }

    void p(Writer writer) throws IOException {
        if (writer.B() == Writer.FieldOrder.DESCENDING) {
            for (int i = this.a - 1; i >= 0; i--) {
                writer.b(WireFormat.a(this.b[i]), this.c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.a; i2++) {
            writer.b(WireFormat.a(this.b[i2]), this.c[i2]);
        }
    }

    public void r(Writer writer) throws IOException {
        if (this.a == 0) {
            return;
        }
        if (writer.B() == Writer.FieldOrder.ASCENDING) {
            for (int i = 0; i < this.a; i++) {
                q(this.b[i], this.c[i], writer);
            }
            return;
        }
        for (int i2 = this.a - 1; i2 >= 0; i2--) {
            q(this.b[i2], this.c[i2], writer);
        }
    }

    private b1(int i, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }
}
