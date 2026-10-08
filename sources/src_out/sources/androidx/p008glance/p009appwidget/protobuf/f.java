package androidx.p008glance.p009appwidget.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public abstract class f {
    private static volatile int f = 100;
    int a;
    int b;
    int c;
    g d;
    private boolean e;

    private static final class b extends f {
        private final byte[] g;
        private final boolean h;
        private int i;
        private int j;
        private int k;
        private int l;
        private int m;
        private boolean n;
        private int o;

        private void O() {
            int i = this.i + this.j;
            this.i = i;
            int i2 = i - this.l;
            int i3 = this.o;
            if (i2 <= i3) {
                this.j = 0;
                return;
            }
            int i4 = i2 - i3;
            this.j = i4;
            this.i = i - i4;
        }

        private void Q() throws IOException {
            if (this.i - this.k >= 10) {
                R();
            } else {
                S();
            }
        }

        private void R() throws IOException {
            for (int i = 0; i < 10; i++) {
                byte[] bArr = this.g;
                int i2 = this.k;
                this.k = i2 + 1;
                if (bArr[i2] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        private void S() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (H() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.f
        public String A() throws IOException {
            int iL = L();
            if (iL > 0) {
                int i = this.i;
                int i2 = this.k;
                if (iL <= i - i2) {
                    String str = new String(this.g, i2, iL, u.b);
                    this.k += iL;
                    return str;
                }
            }
            if (iL == 0) {
                return "";
            }
            if (iL < 0) {
                throw InvalidProtocolBufferException.g();
            }
            throw InvalidProtocolBufferException.m();
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.f
        public String B() throws IOException {
            int iL = L();
            if (iL > 0) {
                int i = this.i;
                int i2 = this.k;
                if (iL <= i - i2) {
                    String strA = Utf8.a(this.g, i2, iL);
                    this.k += iL;
                    return strA;
                }
            }
            if (iL == 0) {
                return "";
            }
            if (iL <= 0) {
                throw InvalidProtocolBufferException.g();
            }
            throw InvalidProtocolBufferException.m();
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.f
        public int C() throws IOException {
            if (f()) {
                this.m = 0;
                return 0;
            }
            int iL = L();
            this.m = iL;
            if (WireFormat.a(iL) != 0) {
                return this.m;
            }
            throw InvalidProtocolBufferException.c();
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.f
        public int D() throws IOException {
            return L();
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.f
        public long E() throws IOException {
            return M();
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.f
        public boolean F(int i) throws IOException {
            int iB = WireFormat.b(i);
            if (iB == 0) {
                Q();
                return true;
            }
            if (iB == 1) {
                P(8);
                return true;
            }
            if (iB == 2) {
                P(L());
                return true;
            }
            if (iB == 3) {
                G();
                a(WireFormat.c(WireFormat.a(i), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.e();
            }
            P(4);
            return true;
        }

        public byte H() throws IOException {
            int i = this.k;
            if (i == this.i) {
                throw InvalidProtocolBufferException.m();
            }
            byte[] bArr = this.g;
            this.k = i + 1;
            return bArr[i];
        }

        public byte[] I(int i) throws IOException {
            if (i > 0) {
                int i2 = this.i;
                int i3 = this.k;
                if (i <= i2 - i3) {
                    int i4 = i + i3;
                    this.k = i4;
                    return Arrays.copyOfRange(this.g, i3, i4);
                }
            }
            if (i > 0) {
                throw InvalidProtocolBufferException.m();
            }
            if (i == 0) {
                return u.d;
            }
            throw InvalidProtocolBufferException.g();
        }

        public int J() throws IOException {
            int i = this.k;
            if (this.i - i < 4) {
                throw InvalidProtocolBufferException.m();
            }
            byte[] bArr = this.g;
            this.k = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        public long K() throws IOException {
            int i = this.k;
            if (this.i - i < 8) {
                throw InvalidProtocolBufferException.m();
            }
            byte[] bArr = this.g;
            this.k = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        public int L() throws IOException {
            int i;
            int i2 = this.k;
            int i3 = this.i;
            if (i3 != i2) {
                byte[] bArr = this.g;
                int i4 = i2 + 1;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.k = i4;
                    return b;
                }
                if (i3 - i4 >= 9) {
                    int i5 = i2 + 2;
                    int i6 = (bArr[i4] << 7) ^ b;
                    if (i6 < 0) {
                        i = i6 ^ (-128);
                    } else {
                        int i7 = i2 + 3;
                        int i8 = (bArr[i5] << 14) ^ i6;
                        if (i8 >= 0) {
                            i = i8 ^ 16256;
                        } else {
                            int i9 = i2 + 4;
                            int i10 = i8 ^ (bArr[i7] << 21);
                            if (i10 < 0) {
                                i = (-2080896) ^ i10;
                            } else {
                                i7 = i2 + 5;
                                byte b2 = bArr[i9];
                                int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                                if (b2 < 0) {
                                    i9 = i2 + 6;
                                    if (bArr[i7] < 0) {
                                        i7 = i2 + 7;
                                        if (bArr[i9] < 0) {
                                            i9 = i2 + 8;
                                            if (bArr[i7] < 0) {
                                                i7 = i2 + 9;
                                                if (bArr[i9] < 0) {
                                                    int i12 = i2 + 10;
                                                    if (bArr[i7] >= 0) {
                                                        i5 = i12;
                                                        i = i11;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i = i11;
                                }
                                i = i11;
                            }
                            i5 = i9;
                        }
                        i5 = i7;
                    }
                    this.k = i5;
                    return i;
                }
            }
            return (int) N();
        }

        public long M() throws IOException {
            long j;
            long j2;
            long j3;
            int i = this.k;
            int i2 = this.i;
            if (i2 != i) {
                byte[] bArr = this.g;
                int i3 = i + 1;
                byte b = bArr[i];
                if (b >= 0) {
                    this.k = i3;
                    return b;
                }
                if (i2 - i3 >= 9) {
                    int i4 = i + 2;
                    int i5 = (bArr[i3] << 7) ^ b;
                    if (i5 < 0) {
                        j = i5 ^ (-128);
                    } else {
                        int i6 = i + 3;
                        int i7 = (bArr[i4] << 14) ^ i5;
                        if (i7 >= 0) {
                            j = i7 ^ 16256;
                            i4 = i6;
                        } else {
                            int i8 = i + 4;
                            int i9 = i7 ^ (bArr[i6] << 21);
                            if (i9 < 0) {
                                long j4 = (-2080896) ^ i9;
                                i4 = i8;
                                j = j4;
                            } else {
                                long j5 = i9;
                                i4 = i + 5;
                                long j6 = j5 ^ (((long) bArr[i8]) << 28);
                                if (j6 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    int i10 = i + 6;
                                    long j7 = j6 ^ (((long) bArr[i4]) << 35);
                                    if (j7 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        i4 = i + 7;
                                        j6 = j7 ^ (((long) bArr[i10]) << 42);
                                        if (j6 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            i10 = i + 8;
                                            j7 = j6 ^ (((long) bArr[i4]) << 49);
                                            if (j7 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                i4 = i + 9;
                                                long j8 = (j7 ^ (((long) bArr[i10]) << 56)) ^ 71499008037633920L;
                                                if (j8 < 0) {
                                                    int i11 = i + 10;
                                                    if (bArr[i4] >= 0) {
                                                        i4 = i11;
                                                    }
                                                }
                                                j = j8;
                                            }
                                        }
                                    }
                                    j = j7 ^ j2;
                                    i4 = i10;
                                }
                                j = j6 ^ j3;
                            }
                        }
                    }
                    this.k = i4;
                    return j;
                }
            }
            return N();
        }

        long N() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte bH = H();
                j |= ((long) (bH & 127)) << i;
                if ((bH & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        public void P(int i) throws IOException {
            if (i >= 0) {
                int i2 = this.i;
                int i3 = this.k;
                if (i <= i2 - i3) {
                    this.k = i3 + i;
                    return;
                }
            }
            if (i >= 0) {
                throw InvalidProtocolBufferException.m();
            }
            throw InvalidProtocolBufferException.g();
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.f
        public void a(int i) throws InvalidProtocolBufferException {
            if (this.m != i) {
                throw InvalidProtocolBufferException.b();
            }
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.f
        public int e() {
            return this.k - this.l;
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.f
        public boolean f() throws IOException {
            return this.k == this.i;
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.f
        public void l(int i) {
            this.o = i;
            O();
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.f
        public int m(int i) throws InvalidProtocolBufferException {
            if (i < 0) {
                throw InvalidProtocolBufferException.g();
            }
            int iE = i + e();
            if (iE < 0) {
                throw InvalidProtocolBufferException.h();
            }
            int i2 = this.o;
            if (iE > i2) {
                throw InvalidProtocolBufferException.m();
            }
            this.o = iE;
            O();
            return i2;
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.f
        public boolean n() throws IOException {
            return M() != 0;
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.f
        public ByteString o() throws IOException {
            int iL = L();
            if (iL > 0) {
                int i = this.i;
                int i2 = this.k;
                if (iL <= i - i2) {
                    ByteString byteStringA = (this.h && this.n) ? ByteString.A(this.g, i2, iL) : ByteString.i(this.g, i2, iL);
                    this.k += iL;
                    return byteStringA;
                }
            }
            return iL == 0 ? ByteString.a : ByteString.z(I(iL));
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.f
        public double p() throws IOException {
            return Double.longBitsToDouble(K());
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.f
        public int q() throws IOException {
            return L();
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.f
        public int r() throws IOException {
            return J();
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.f
        public long s() throws IOException {
            return K();
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.f
        public float t() throws IOException {
            return Float.intBitsToFloat(J());
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.f
        public int u() throws IOException {
            return L();
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.f
        public long v() throws IOException {
            return M();
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.f
        public int w() throws IOException {
            return J();
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.f
        public long x() throws IOException {
            return K();
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.f
        public int y() throws IOException {
            return f.c(L());
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.f
        public long z() throws IOException {
            return f.d(M());
        }

        private b(byte[] bArr, int i, int i2, boolean z) {
            super();
            this.o = Integer.MAX_VALUE;
            this.g = bArr;
            this.i = i2 + i;
            this.k = i;
            this.l = i;
            this.h = z;
        }
    }

    private static final class c extends f {
        private final InputStream g;
        private final byte[] h;
        private int i;
        private int j;
        private int k;
        private int l;
        private int m;
        private int n;

        private static int H(InputStream inputStream) throws IOException {
            try {
                return inputStream.available();
            } catch (InvalidProtocolBufferException e) {
                e.j();
                throw e;
            }
        }

        private static int I(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
            try {
                return inputStream.read(bArr, i, i2);
            } catch (InvalidProtocolBufferException e) {
                e.j();
                throw e;
            }
        }

        private ByteString J(int i) throws IOException {
            byte[] bArrM = M(i);
            if (bArrM != null) {
                return ByteString.f(bArrM);
            }
            int i2 = this.k;
            int i3 = this.i;
            int length = i3 - i2;
            this.m += i3;
            this.k = 0;
            this.i = 0;
            List<byte[]> listN = N(i - length);
            byte[] bArr = new byte[i];
            System.arraycopy(this.h, i2, bArr, 0, length);
            for (byte[] bArr2 : listN) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return ByteString.z(bArr);
        }

        private byte[] L(int i, boolean z) throws IOException {
            byte[] bArrM = M(i);
            if (bArrM != null) {
                return z ? (byte[]) bArrM.clone() : bArrM;
            }
            int i2 = this.k;
            int i3 = this.i;
            int length = i3 - i2;
            this.m += i3;
            this.k = 0;
            this.i = 0;
            List<byte[]> listN = N(i - length);
            byte[] bArr = new byte[i];
            System.arraycopy(this.h, i2, bArr, 0, length);
            for (byte[] bArr2 : listN) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        private byte[] M(int i) throws IOException {
            if (i == 0) {
                return u.d;
            }
            if (i < 0) {
                throw InvalidProtocolBufferException.g();
            }
            int i2 = this.m;
            int i3 = this.k;
            int i4 = i2 + i3 + i;
            if (i4 - this.c > 0) {
                throw InvalidProtocolBufferException.l();
            }
            int i5 = this.n;
            if (i4 > i5) {
                W((i5 - i2) - i3);
                throw InvalidProtocolBufferException.m();
            }
            int i6 = this.i - i3;
            int i7 = i - i6;
            if (i7 >= 4096 && i7 > H(this.g)) {
                return null;
            }
            byte[] bArr = new byte[i];
            System.arraycopy(this.h, this.k, bArr, 0, i6);
            this.m += this.i;
            this.k = 0;
            this.i = 0;
            while (i6 < i) {
                int I = I(this.g, bArr, i6, i - i6);
                if (I == -1) {
                    throw InvalidProtocolBufferException.m();
                }
                this.m += I;
                i6 += I;
            }
            return bArr;
        }

        private List<byte[]> N(int i) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i > 0) {
                int iMin = Math.min(i, 4096);
                byte[] bArr = new byte[iMin];
                int i2 = 0;
                while (i2 < iMin) {
                    int i3 = this.g.read(bArr, i2, iMin - i2);
                    if (i3 == -1) {
                        throw InvalidProtocolBufferException.m();
                    }
                    this.m += i3;
                    i2 += i3;
                }
                i -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private void T() {
            int i = this.i + this.j;
            this.i = i;
            int i2 = this.m + i;
            int i3 = this.n;
            if (i2 <= i3) {
                this.j = 0;
                return;
            }
            int i4 = i2 - i3;
            this.j = i4;
            this.i = i - i4;
        }

        private void U(int i) throws IOException {
            if (b0(i)) {
                return;
            }
            if (i <= (this.c - this.m) - this.k) {
                throw InvalidProtocolBufferException.m();
            }
            throw InvalidProtocolBufferException.l();
        }

        private static long V(InputStream inputStream, long j) throws IOException {
            try {
                return inputStream.skip(j);
            } catch (InvalidProtocolBufferException e) {
                e.j();
                throw e;
            }
        }

        private void X(int i) throws IOException {
            if (i < 0) {
                throw InvalidProtocolBufferException.g();
            }
            int i2 = this.m;
            int i3 = this.k;
            int i4 = i2 + i3 + i;
            int i5 = this.n;
            if (i4 > i5) {
                W((i5 - i2) - i3);
                throw InvalidProtocolBufferException.m();
            }
            this.m = i2 + i3;
            int i6 = this.i - i3;
            this.i = 0;
            this.k = 0;
            while (i6 < i) {
                try {
                    long j = i - i6;
                    long jV = V(this.g, j);
                    if (jV < 0 || jV > j) {
                        throw new IllegalStateException(this.g.getClass() + "#skip returned invalid result: " + jV + "\nThe InputStream implementation is buggy.");
                    }
                    if (jV == 0) {
                        break;
                    } else {
                        i6 += (int) jV;
                    }
                } catch (Throwable th) {
                    this.m += i6;
                    T();
                    throw th;
                }
            }
            this.m += i6;
            T();
            if (i6 >= i) {
                return;
            }
            int i7 = this.i;
            int i8 = i7 - this.k;
            this.k = i7;
            U(1);
            while (true) {
                int i9 = i - i8;
                int i10 = this.i;
                if (i9 <= i10) {
                    this.k = i9;
                    return;
                } else {
                    i8 += i10;
                    this.k = i10;
                    U(1);
                }
            }
        }

        private void Y() throws IOException {
            if (this.i - this.k >= 10) {
                Z();
            } else {
                a0();
            }
        }

        private void Z() throws IOException {
            for (int i = 0; i < 10; i++) {
                byte[] bArr = this.h;
                int i2 = this.k;
                this.k = i2 + 1;
                if (bArr[i2] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        private void a0() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (K() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        private boolean b0(int i) throws IOException {
            int i2 = this.k;
            int i3 = i2 + i;
            int i4 = this.i;
            if (i3 <= i4) {
                throw new IllegalStateException("refillBuffer() called when " + i + " bytes were already available in buffer");
            }
            int i5 = this.c;
            int i6 = this.m;
            if (i > (i5 - i6) - i2 || i6 + i2 + i > this.n) {
                return false;
            }
            if (i2 > 0) {
                if (i4 > i2) {
                    byte[] bArr = this.h;
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.m += i2;
                this.i -= i2;
                this.k = 0;
            }
            InputStream inputStream = this.g;
            byte[] bArr2 = this.h;
            int i7 = this.i;
            int I = I(inputStream, bArr2, i7, Math.min(bArr2.length - i7, (this.c - this.m) - i7));
            if (I == 0 || I < -1 || I > this.h.length) {
                throw new IllegalStateException(this.g.getClass() + "#read(byte[]) returned invalid result: " + I + "\nThe InputStream implementation is buggy.");
            }
            if (I <= 0) {
                return false;
            }
            this.i += I;
            T();
            if (this.i >= i) {
                return true;
            }
            return b0(i);
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.f
        public String A() throws IOException {
            int iQ = Q();
            if (iQ > 0) {
                int i = this.i;
                int i2 = this.k;
                if (iQ <= i - i2) {
                    String str = new String(this.h, i2, iQ, u.b);
                    this.k += iQ;
                    return str;
                }
            }
            if (iQ == 0) {
                return "";
            }
            if (iQ < 0) {
                throw InvalidProtocolBufferException.g();
            }
            if (iQ > this.i) {
                return new String(L(iQ, false), u.b);
            }
            U(iQ);
            String str2 = new String(this.h, this.k, iQ, u.b);
            this.k += iQ;
            return str2;
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.f
        public String B() throws IOException {
            byte[] bArrL;
            int iQ = Q();
            int i = this.k;
            int i2 = this.i;
            if (iQ <= i2 - i && iQ > 0) {
                bArrL = this.h;
                this.k = i + iQ;
            } else {
                if (iQ == 0) {
                    return "";
                }
                if (iQ < 0) {
                    throw InvalidProtocolBufferException.g();
                }
                i = 0;
                if (iQ <= i2) {
                    U(iQ);
                    bArrL = this.h;
                    this.k = iQ;
                } else {
                    bArrL = L(iQ, false);
                }
            }
            return Utf8.a(bArrL, i, iQ);
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.f
        public int C() throws IOException {
            if (f()) {
                this.l = 0;
                return 0;
            }
            int iQ = Q();
            this.l = iQ;
            if (WireFormat.a(iQ) != 0) {
                return this.l;
            }
            throw InvalidProtocolBufferException.c();
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.f
        public int D() throws IOException {
            return Q();
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.f
        public long E() throws IOException {
            return R();
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.f
        public boolean F(int i) throws IOException {
            int iB = WireFormat.b(i);
            if (iB == 0) {
                Y();
                return true;
            }
            if (iB == 1) {
                W(8);
                return true;
            }
            if (iB == 2) {
                W(Q());
                return true;
            }
            if (iB == 3) {
                G();
                a(WireFormat.c(WireFormat.a(i), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.e();
            }
            W(4);
            return true;
        }

        public byte K() throws IOException {
            if (this.k == this.i) {
                U(1);
            }
            byte[] bArr = this.h;
            int i = this.k;
            this.k = i + 1;
            return bArr[i];
        }

        public int O() throws IOException {
            int i = this.k;
            if (this.i - i < 4) {
                U(4);
                i = this.k;
            }
            byte[] bArr = this.h;
            this.k = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        public long P() throws IOException {
            int i = this.k;
            if (this.i - i < 8) {
                U(8);
                i = this.k;
            }
            byte[] bArr = this.h;
            this.k = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        public int Q() throws IOException {
            int i;
            int i2 = this.k;
            int i3 = this.i;
            if (i3 != i2) {
                byte[] bArr = this.h;
                int i4 = i2 + 1;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.k = i4;
                    return b;
                }
                if (i3 - i4 >= 9) {
                    int i5 = i2 + 2;
                    int i6 = (bArr[i4] << 7) ^ b;
                    if (i6 < 0) {
                        i = i6 ^ (-128);
                    } else {
                        int i7 = i2 + 3;
                        int i8 = (bArr[i5] << 14) ^ i6;
                        if (i8 >= 0) {
                            i = i8 ^ 16256;
                        } else {
                            int i9 = i2 + 4;
                            int i10 = i8 ^ (bArr[i7] << 21);
                            if (i10 < 0) {
                                i = (-2080896) ^ i10;
                            } else {
                                i7 = i2 + 5;
                                byte b2 = bArr[i9];
                                int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                                if (b2 < 0) {
                                    i9 = i2 + 6;
                                    if (bArr[i7] < 0) {
                                        i7 = i2 + 7;
                                        if (bArr[i9] < 0) {
                                            i9 = i2 + 8;
                                            if (bArr[i7] < 0) {
                                                i7 = i2 + 9;
                                                if (bArr[i9] < 0) {
                                                    int i12 = i2 + 10;
                                                    if (bArr[i7] >= 0) {
                                                        i5 = i12;
                                                        i = i11;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i = i11;
                                }
                                i = i11;
                            }
                            i5 = i9;
                        }
                        i5 = i7;
                    }
                    this.k = i5;
                    return i;
                }
            }
            return (int) S();
        }

        public long R() throws IOException {
            long j;
            long j2;
            long j3;
            int i = this.k;
            int i2 = this.i;
            if (i2 != i) {
                byte[] bArr = this.h;
                int i3 = i + 1;
                byte b = bArr[i];
                if (b >= 0) {
                    this.k = i3;
                    return b;
                }
                if (i2 - i3 >= 9) {
                    int i4 = i + 2;
                    int i5 = (bArr[i3] << 7) ^ b;
                    if (i5 < 0) {
                        j = i5 ^ (-128);
                    } else {
                        int i6 = i + 3;
                        int i7 = (bArr[i4] << 14) ^ i5;
                        if (i7 >= 0) {
                            j = i7 ^ 16256;
                            i4 = i6;
                        } else {
                            int i8 = i + 4;
                            int i9 = i7 ^ (bArr[i6] << 21);
                            if (i9 < 0) {
                                long j4 = (-2080896) ^ i9;
                                i4 = i8;
                                j = j4;
                            } else {
                                long j5 = i9;
                                i4 = i + 5;
                                long j6 = j5 ^ (((long) bArr[i8]) << 28);
                                if (j6 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    int i10 = i + 6;
                                    long j7 = j6 ^ (((long) bArr[i4]) << 35);
                                    if (j7 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        i4 = i + 7;
                                        j6 = j7 ^ (((long) bArr[i10]) << 42);
                                        if (j6 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            i10 = i + 8;
                                            j7 = j6 ^ (((long) bArr[i4]) << 49);
                                            if (j7 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                i4 = i + 9;
                                                long j8 = (j7 ^ (((long) bArr[i10]) << 56)) ^ 71499008037633920L;
                                                if (j8 < 0) {
                                                    int i11 = i + 10;
                                                    if (bArr[i4] >= 0) {
                                                        i4 = i11;
                                                    }
                                                }
                                                j = j8;
                                            }
                                        }
                                    }
                                    j = j7 ^ j2;
                                    i4 = i10;
                                }
                                j = j6 ^ j3;
                            }
                        }
                    }
                    this.k = i4;
                    return j;
                }
            }
            return S();
        }

        long S() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte bK = K();
                j |= ((long) (bK & 127)) << i;
                if ((bK & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        public void W(int i) throws IOException {
            int i2 = this.i;
            int i3 = this.k;
            if (i > i2 - i3 || i < 0) {
                X(i);
            } else {
                this.k = i3 + i;
            }
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.f
        public void a(int i) throws InvalidProtocolBufferException {
            if (this.l != i) {
                throw InvalidProtocolBufferException.b();
            }
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.f
        public int e() {
            return this.m + this.k;
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.f
        public boolean f() throws IOException {
            return this.k == this.i && !b0(1);
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.f
        public void l(int i) {
            this.n = i;
            T();
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.f
        public int m(int i) throws InvalidProtocolBufferException {
            if (i < 0) {
                throw InvalidProtocolBufferException.g();
            }
            int i2 = i + this.m + this.k;
            if (i2 < 0) {
                throw InvalidProtocolBufferException.h();
            }
            int i3 = this.n;
            if (i2 > i3) {
                throw InvalidProtocolBufferException.m();
            }
            this.n = i2;
            T();
            return i3;
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.f
        public boolean n() throws IOException {
            return R() != 0;
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.f
        public ByteString o() throws IOException {
            int iQ = Q();
            int i = this.i;
            int i2 = this.k;
            if (iQ <= i - i2 && iQ > 0) {
                ByteString byteStringI = ByteString.i(this.h, i2, iQ);
                this.k += iQ;
                return byteStringI;
            }
            if (iQ == 0) {
                return ByteString.a;
            }
            if (iQ >= 0) {
                return J(iQ);
            }
            throw InvalidProtocolBufferException.g();
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.f
        public double p() throws IOException {
            return Double.longBitsToDouble(P());
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.f
        public int q() throws IOException {
            return Q();
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.f
        public int r() throws IOException {
            return O();
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.f
        public long s() throws IOException {
            return P();
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.f
        public float t() throws IOException {
            return Float.intBitsToFloat(O());
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.f
        public int u() throws IOException {
            return Q();
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.f
        public long v() throws IOException {
            return R();
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.f
        public int w() throws IOException {
            return O();
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.f
        public long x() throws IOException {
            return P();
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.f
        public int y() throws IOException {
            return f.c(Q());
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.f
        public long z() throws IOException {
            return f.d(R());
        }

        private c(InputStream inputStream, int i) {
            super();
            this.n = Integer.MAX_VALUE;
            u.b(inputStream, "input");
            this.g = inputStream;
            this.h = new byte[i];
            this.i = 0;
            this.k = 0;
            this.m = 0;
        }
    }

    public static int c(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long d(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static f g(InputStream inputStream) {
        return h(inputStream, 4096);
    }

    public static f h(InputStream inputStream, int i) {
        if (i > 0) {
            return inputStream == null ? i(u.d) : new c(inputStream, i);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static f i(byte[] bArr) {
        return j(bArr, 0, bArr.length);
    }

    public static f j(byte[] bArr, int i, int i2) {
        return k(bArr, i, i2, false);
    }

    static f k(byte[] bArr, int i, int i2, boolean z) {
        b bVar = new b(bArr, i, i2, z);
        try {
            bVar.m(i2);
            return bVar;
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public abstract String A() throws IOException;

    public abstract String B() throws IOException;

    public abstract int C() throws IOException;

    public abstract int D() throws IOException;

    public abstract long E() throws IOException;

    public abstract boolean F(int i) throws IOException;

    public void G() throws IOException {
        boolean zF;
        do {
            int iC = C();
            if (iC == 0) {
                return;
            }
            b();
            this.a++;
            zF = F(iC);
            this.a--;
        } while (zF);
    }

    public abstract void a(int i) throws InvalidProtocolBufferException;

    public void b() throws InvalidProtocolBufferException {
        if (this.a >= this.b) {
            throw InvalidProtocolBufferException.i();
        }
    }

    public abstract int e();

    public abstract boolean f() throws IOException;

    public abstract void l(int i);

    public abstract int m(int i) throws InvalidProtocolBufferException;

    public abstract boolean n() throws IOException;

    public abstract ByteString o() throws IOException;

    public abstract double p() throws IOException;

    public abstract int q() throws IOException;

    public abstract int r() throws IOException;

    public abstract long s() throws IOException;

    public abstract float t() throws IOException;

    public abstract int u() throws IOException;

    public abstract long v() throws IOException;

    public abstract int w() throws IOException;

    public abstract long x() throws IOException;

    public abstract int y() throws IOException;

    public abstract long z() throws IOException;

    private f() {
        this.b = f;
        this.c = Integer.MAX_VALUE;
        this.e = false;
    }
}
