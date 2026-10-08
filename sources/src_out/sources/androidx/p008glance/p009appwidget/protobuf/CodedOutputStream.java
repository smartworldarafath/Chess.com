package androidx.p008glance.p009appwidget.protobuf;

import com.google.inputmethod.jz0;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public abstract class CodedOutputStream extends jz0 {
    private static final Logger c = Logger.getLogger(CodedOutputStream.class.getName());
    private static final boolean d = d1.B();
    h a;
    private boolean b;

    public static class OutOfSpaceException extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        OutOfSpaceException(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        OutOfSpaceException(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }
    }

    private static abstract class b extends CodedOutputStream {
        final byte[] e;
        final int f;
        int g;
        int h;

        b(int i) {
            super();
            if (i < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i, 20)];
            this.e = bArr;
            this.f = bArr.length;
        }

        final void T0(byte b) {
            byte[] bArr = this.e;
            int i = this.g;
            this.g = i + 1;
            bArr[i] = b;
            this.h++;
        }

        final void U0(int i) {
            byte[] bArr = this.e;
            int i2 = this.g;
            int i3 = i2 + 1;
            this.g = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.g = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.g = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.g = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
            this.h += 4;
        }

        final void V0(long j) {
            byte[] bArr = this.e;
            int i = this.g;
            int i2 = i + 1;
            this.g = i2;
            bArr[i] = (byte) (j & 255);
            int i3 = i + 2;
            this.g = i3;
            bArr[i2] = (byte) ((j >> 8) & 255);
            int i4 = i + 3;
            this.g = i4;
            bArr[i3] = (byte) ((j >> 16) & 255);
            int i5 = i + 4;
            this.g = i5;
            bArr[i4] = (byte) (255 & (j >> 24));
            int i6 = i + 5;
            this.g = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i + 6;
            this.g = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i + 7;
            this.g = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.g = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            this.h += 8;
        }

        final void W0(int i) {
            if (i >= 0) {
                Y0(i);
            } else {
                Z0(i);
            }
        }

        final void X0(int i, int i2) {
            Y0(WireFormat.c(i, i2));
        }

        final void Y0(int i) {
            if (!CodedOutputStream.d) {
                while ((i & (-128)) != 0) {
                    byte[] bArr = this.e;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    bArr[i2] = (byte) ((i | 128) & 255);
                    this.h++;
                    i >>>= 7;
                }
                byte[] bArr2 = this.e;
                int i3 = this.g;
                this.g = i3 + 1;
                bArr2[i3] = (byte) i;
                this.h++;
                return;
            }
            long j = this.g;
            while ((i & (-128)) != 0) {
                byte[] bArr3 = this.e;
                int i4 = this.g;
                this.g = i4 + 1;
                d1.H(bArr3, i4, (byte) ((i | 128) & 255));
                i >>>= 7;
            }
            byte[] bArr4 = this.e;
            int i5 = this.g;
            this.g = i5 + 1;
            d1.H(bArr4, i5, (byte) i);
            this.h += (int) (((long) this.g) - j);
        }

        final void Z0(long j) {
            if (!CodedOutputStream.d) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.e;
                    int i = this.g;
                    this.g = i + 1;
                    bArr[i] = (byte) ((((int) j) | 128) & 255);
                    this.h++;
                    j >>>= 7;
                }
                byte[] bArr2 = this.e;
                int i2 = this.g;
                this.g = i2 + 1;
                bArr2[i2] = (byte) j;
                this.h++;
                return;
            }
            long j2 = this.g;
            while ((j & (-128)) != 0) {
                byte[] bArr3 = this.e;
                int i3 = this.g;
                this.g = i3 + 1;
                d1.H(bArr3, i3, (byte) ((((int) j) | 128) & 255));
                j >>>= 7;
            }
            byte[] bArr4 = this.e;
            int i4 = this.g;
            this.g = i4 + 1;
            d1.H(bArr4, i4, (byte) j);
            this.h += (int) (((long) this.g) - j2);
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.CodedOutputStream
        public final int h0() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    private static class c extends CodedOutputStream {
        private final byte[] e;
        private final int f;
        private final int g;
        private int h;

        c(byte[] bArr, int i, int i2) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i3 = i + i2;
            if ((i | i2 | (bArr.length - i3)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            this.e = bArr;
            this.f = i;
            this.h = i;
            this.g = i3;
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.CodedOutputStream
        final void C0(int i, i0 i0Var, u0 u0Var) throws IOException {
            O0(i, 2);
            Q0(((androidx.p008glance.p009appwidget.protobuf.a) i0Var).d(u0Var));
            u0Var.h(i0Var, this.a);
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.CodedOutputStream
        public final void D0(int i, i0 i0Var) throws IOException {
            O0(1, 3);
            P0(2, i);
            V0(3, i0Var);
            O0(1, 4);
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.CodedOutputStream
        public final void E0(int i, ByteString byteString) throws IOException {
            O0(1, 3);
            P0(2, i);
            l0(3, byteString);
            O0(1, 4);
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.CodedOutputStream
        public final void N0(int i, String str) throws IOException {
            O0(i, 2);
            X0(str);
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.CodedOutputStream
        public final void O0(int i, int i2) throws IOException {
            Q0(WireFormat.c(i, i2));
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.CodedOutputStream
        public final void P0(int i, int i2) throws IOException {
            O0(i, 0);
            Q0(i2);
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.CodedOutputStream
        public final void Q0(int i) throws IOException {
            while ((i & (-128)) != 0) {
                try {
                    byte[] bArr = this.e;
                    int i2 = this.h;
                    this.h = i2 + 1;
                    bArr[i2] = (byte) ((i | 128) & 255);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.g), 1), e);
                }
            }
            byte[] bArr2 = this.e;
            int i3 = this.h;
            this.h = i3 + 1;
            bArr2[i3] = (byte) i;
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.CodedOutputStream
        public final void R0(int i, long j) throws IOException {
            O0(i, 0);
            S0(j);
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.CodedOutputStream
        public final void S0(long j) throws IOException {
            if (CodedOutputStream.d && h0() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.e;
                    int i = this.h;
                    this.h = i + 1;
                    d1.H(bArr, i, (byte) ((((int) j) | 128) & 255));
                    j >>>= 7;
                }
                byte[] bArr2 = this.e;
                int i2 = this.h;
                this.h = i2 + 1;
                d1.H(bArr2, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.e;
                    int i3 = this.h;
                    this.h = i3 + 1;
                    bArr3[i3] = (byte) ((((int) j) | 128) & 255);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.g), 1), e);
                }
            }
            byte[] bArr4 = this.e;
            int i4 = this.h;
            this.h = i4 + 1;
            bArr4[i4] = (byte) j;
        }

        public final void T0(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.e, this.h, i2);
                this.h += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.g), Integer.valueOf(i2)), e);
            }
        }

        public final void U0(ByteString byteString) throws IOException {
            Q0(byteString.size());
            byteString.B(this);
        }

        public final void V0(int i, i0 i0Var) throws IOException {
            O0(i, 2);
            W0(i0Var);
        }

        public final void W0(i0 i0Var) throws IOException {
            Q0(i0Var.getSerializedSize());
            i0Var.a(this);
        }

        public final void X0(String str) throws IOException {
            int i = this.h;
            try {
                int iW = CodedOutputStream.W(str.length() * 3);
                int iW2 = CodedOutputStream.W(str.length());
                if (iW2 != iW) {
                    Q0(Utf8.c(str));
                    this.h = Utf8.b(str, this.e, this.h, h0());
                    return;
                }
                int i2 = i + iW2;
                this.h = i2;
                int iB = Utf8.b(str, this.e, i2, h0());
                this.h = i;
                Q0((iB - i) - iW2);
                this.h = iB;
            } catch (Utf8.UnpairedSurrogateException e) {
                this.h = i;
                c0(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(e2);
            }
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.CodedOutputStream, com.google.inputmethod.jz0
        public final void a(byte[] bArr, int i, int i2) throws IOException {
            T0(bArr, i, i2);
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.CodedOutputStream
        public void b0() {
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.CodedOutputStream
        public final int h0() {
            return this.g - this.h;
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.CodedOutputStream
        public final void i0(byte b) throws IOException {
            try {
                byte[] bArr = this.e;
                int i = this.h;
                this.h = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.g), 1), e);
            }
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.CodedOutputStream
        public final void j0(int i, boolean z) throws IOException {
            O0(i, 0);
            i0(z ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.CodedOutputStream
        public final void l0(int i, ByteString byteString) throws IOException {
            O0(i, 2);
            U0(byteString);
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.CodedOutputStream
        public final void q0(int i, int i2) throws IOException {
            O0(i, 5);
            r0(i2);
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.CodedOutputStream
        public final void r0(int i) throws IOException {
            try {
                byte[] bArr = this.e;
                int i2 = this.h;
                int i3 = i2 + 1;
                this.h = i3;
                bArr[i2] = (byte) (i & 255);
                int i4 = i2 + 2;
                this.h = i4;
                bArr[i3] = (byte) ((i >> 8) & 255);
                int i5 = i2 + 3;
                this.h = i5;
                bArr[i4] = (byte) ((i >> 16) & 255);
                this.h = i2 + 4;
                bArr[i5] = (byte) ((i >> 24) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.g), 1), e);
            }
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.CodedOutputStream
        public final void s0(int i, long j) throws IOException {
            O0(i, 1);
            t0(j);
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.CodedOutputStream
        public final void t0(long j) throws IOException {
            try {
                byte[] bArr = this.e;
                int i = this.h;
                int i2 = i + 1;
                this.h = i2;
                bArr[i] = (byte) (((int) j) & 255);
                int i3 = i + 2;
                this.h = i3;
                bArr[i2] = (byte) (((int) (j >> 8)) & 255);
                int i4 = i + 3;
                this.h = i4;
                bArr[i3] = (byte) (((int) (j >> 16)) & 255);
                int i5 = i + 4;
                this.h = i5;
                bArr[i4] = (byte) (((int) (j >> 24)) & 255);
                int i6 = i + 5;
                this.h = i6;
                bArr[i5] = (byte) (((int) (j >> 32)) & 255);
                int i7 = i + 6;
                this.h = i7;
                bArr[i6] = (byte) (((int) (j >> 40)) & 255);
                int i8 = i + 7;
                this.h = i8;
                bArr[i7] = (byte) (((int) (j >> 48)) & 255);
                this.h = i + 8;
                bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.g), 1), e);
            }
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.CodedOutputStream
        public final void y0(int i, int i2) throws IOException {
            O0(i, 0);
            z0(i2);
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.CodedOutputStream
        public final void z0(int i) throws IOException {
            if (i >= 0) {
                Q0(i);
            } else {
                S0(i);
            }
        }
    }

    private static final class d extends b {
        private final OutputStream i;

        d(OutputStream outputStream, int i) {
            super(i);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.i = outputStream;
        }

        private void a1() throws IOException {
            this.i.write(this.e, 0, this.g);
            this.g = 0;
        }

        private void b1(int i) throws IOException {
            if (this.f - this.g < i) {
                a1();
            }
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.CodedOutputStream
        void C0(int i, i0 i0Var, u0 u0Var) throws IOException {
            O0(i, 2);
            g1(i0Var, u0Var);
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.CodedOutputStream
        public void D0(int i, i0 i0Var) throws IOException {
            O0(1, 3);
            P0(2, i);
            e1(3, i0Var);
            O0(1, 4);
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.CodedOutputStream
        public void E0(int i, ByteString byteString) throws IOException {
            O0(1, 3);
            P0(2, i);
            l0(3, byteString);
            O0(1, 4);
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.CodedOutputStream
        public void N0(int i, String str) throws IOException {
            O0(i, 2);
            h1(str);
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.CodedOutputStream
        public void O0(int i, int i2) throws IOException {
            Q0(WireFormat.c(i, i2));
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.CodedOutputStream
        public void P0(int i, int i2) throws IOException {
            b1(20);
            X0(i, 0);
            Y0(i2);
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.CodedOutputStream
        public void Q0(int i) throws IOException {
            b1(5);
            Y0(i);
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.CodedOutputStream
        public void R0(int i, long j) throws IOException {
            b1(20);
            X0(i, 0);
            Z0(j);
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.CodedOutputStream
        public void S0(long j) throws IOException {
            b1(10);
            Z0(j);
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.CodedOutputStream, com.google.inputmethod.jz0
        public void a(byte[] bArr, int i, int i2) throws IOException {
            c1(bArr, i, i2);
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.CodedOutputStream
        public void b0() throws IOException {
            if (this.g > 0) {
                a1();
            }
        }

        public void c1(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.f;
            int i4 = this.g;
            if (i3 - i4 >= i2) {
                System.arraycopy(bArr, i, this.e, i4, i2);
                this.g += i2;
                this.h += i2;
                return;
            }
            int i5 = i3 - i4;
            System.arraycopy(bArr, i, this.e, i4, i5);
            int i6 = i + i5;
            int i7 = i2 - i5;
            this.g = this.f;
            this.h += i5;
            a1();
            if (i7 <= this.f) {
                System.arraycopy(bArr, i6, this.e, 0, i7);
                this.g = i7;
            } else {
                this.i.write(bArr, i6, i7);
            }
            this.h += i7;
        }

        public void d1(ByteString byteString) throws IOException {
            Q0(byteString.size());
            byteString.B(this);
        }

        public void e1(int i, i0 i0Var) throws IOException {
            O0(i, 2);
            f1(i0Var);
        }

        public void f1(i0 i0Var) throws IOException {
            Q0(i0Var.getSerializedSize());
            i0Var.a(this);
        }

        void g1(i0 i0Var, u0 u0Var) throws IOException {
            Q0(((androidx.p008glance.p009appwidget.protobuf.a) i0Var).d(u0Var));
            u0Var.h(i0Var, this.a);
        }

        public void h1(String str) throws IOException {
            int iC;
            try {
                int length = str.length() * 3;
                int iW = CodedOutputStream.W(length);
                int i = iW + length;
                int i2 = this.f;
                if (i > i2) {
                    byte[] bArr = new byte[length];
                    int iB = Utf8.b(str, bArr, 0, length);
                    Q0(iB);
                    a(bArr, 0, iB);
                    return;
                }
                if (i > i2 - this.g) {
                    a1();
                }
                int iW2 = CodedOutputStream.W(str.length());
                int i3 = this.g;
                try {
                    if (iW2 == iW) {
                        int i4 = i3 + iW2;
                        this.g = i4;
                        int iB2 = Utf8.b(str, this.e, i4, this.f - i4);
                        this.g = i3;
                        iC = (iB2 - i3) - iW2;
                        Y0(iC);
                        this.g = iB2;
                    } else {
                        iC = Utf8.c(str);
                        Y0(iC);
                        this.g = Utf8.b(str, this.e, this.g, iC);
                    }
                    this.h += iC;
                } catch (Utf8.UnpairedSurrogateException e) {
                    this.h -= this.g - i3;
                    this.g = i3;
                    throw e;
                } catch (ArrayIndexOutOfBoundsException e2) {
                    throw new OutOfSpaceException(e2);
                }
            } catch (Utf8.UnpairedSurrogateException e3) {
                c0(str, e3);
            }
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.CodedOutputStream
        public void i0(byte b) throws IOException {
            if (this.g == this.f) {
                a1();
            }
            T0(b);
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.CodedOutputStream
        public void j0(int i, boolean z) throws IOException {
            b1(11);
            X0(i, 0);
            T0(z ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.CodedOutputStream
        public void l0(int i, ByteString byteString) throws IOException {
            O0(i, 2);
            d1(byteString);
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.CodedOutputStream
        public void q0(int i, int i2) throws IOException {
            b1(14);
            X0(i, 5);
            U0(i2);
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.CodedOutputStream
        public void r0(int i) throws IOException {
            b1(4);
            U0(i);
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.CodedOutputStream
        public void s0(int i, long j) throws IOException {
            b1(18);
            X0(i, 1);
            V0(j);
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.CodedOutputStream
        public void t0(long j) throws IOException {
            b1(8);
            V0(j);
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.CodedOutputStream
        public void y0(int i, int i2) throws IOException {
            b1(20);
            X0(i, 0);
            W0(i2);
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.CodedOutputStream
        public void z0(int i) throws IOException {
            if (i >= 0) {
                Q0(i);
            } else {
                S0(i);
            }
        }
    }

    public static int A(int i, w wVar) {
        return U(i) + B(wVar);
    }

    public static int B(w wVar) {
        return C(wVar.b());
    }

    static int C(int i) {
        return W(i) + i;
    }

    public static int D(int i, i0 i0Var) {
        return (U(1) * 2) + V(2, i) + E(3, i0Var);
    }

    public static int E(int i, i0 i0Var) {
        return U(i) + G(i0Var);
    }

    static int F(int i, i0 i0Var, u0 u0Var) {
        return U(i) + H(i0Var, u0Var);
    }

    public static int G(i0 i0Var) {
        return C(i0Var.getSerializedSize());
    }

    static int H(i0 i0Var, u0 u0Var) {
        return C(((androidx.p008glance.p009appwidget.protobuf.a) i0Var).d(u0Var));
    }

    static int I(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    public static int J(int i, ByteString byteString) {
        return (U(1) * 2) + V(2, i) + g(3, byteString);
    }

    public static int K(int i, int i2) {
        return U(i) + L(i2);
    }

    public static int L(int i) {
        return 4;
    }

    public static int M(int i, long j) {
        return U(i) + N(j);
    }

    public static int N(long j) {
        return 8;
    }

    public static int O(int i, int i2) {
        return U(i) + P(i2);
    }

    public static int P(int i) {
        return W(Z(i));
    }

    public static int Q(int i, long j) {
        return U(i) + R(j);
    }

    public static int R(long j) {
        return Y(a0(j));
    }

    public static int S(int i, String str) {
        return U(i) + T(str);
    }

    public static int T(String str) {
        int length;
        try {
            length = Utf8.c(str);
        } catch (Utf8.UnpairedSurrogateException unused) {
            length = str.getBytes(u.b).length;
        }
        return C(length);
    }

    public static int U(int i) {
        return W(WireFormat.c(i, 0));
    }

    public static int V(int i, int i2) {
        return U(i) + W(i2);
    }

    public static int W(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int X(int i, long j) {
        return U(i) + Y(j);
    }

    public static int Y(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int Z(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static long a0(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int d(int i, boolean z) {
        return U(i) + e(z);
    }

    public static int e(boolean z) {
        return 1;
    }

    public static CodedOutputStream e0(OutputStream outputStream, int i) {
        return new d(outputStream, i);
    }

    public static int f(byte[] bArr) {
        return C(bArr.length);
    }

    public static CodedOutputStream f0(byte[] bArr) {
        return g0(bArr, 0, bArr.length);
    }

    public static int g(int i, ByteString byteString) {
        return U(i) + h(byteString);
    }

    public static CodedOutputStream g0(byte[] bArr, int i, int i2) {
        return new c(bArr, i, i2);
    }

    public static int h(ByteString byteString) {
        return C(byteString.size());
    }

    public static int i(int i, double d2) {
        return U(i) + j(d2);
    }

    public static int j(double d2) {
        return 8;
    }

    public static int k(int i, int i2) {
        return U(i) + l(i2);
    }

    public static int l(int i) {
        return w(i);
    }

    public static int m(int i, int i2) {
        return U(i) + n(i2);
    }

    public static int n(int i) {
        return 4;
    }

    public static int o(int i, long j) {
        return U(i) + p(j);
    }

    public static int p(long j) {
        return 8;
    }

    public static int q(int i, float f) {
        return U(i) + r(f);
    }

    public static int r(float f) {
        return 4;
    }

    @Deprecated
    static int s(int i, i0 i0Var, u0 u0Var) {
        return (U(i) * 2) + u(i0Var, u0Var);
    }

    @Deprecated
    public static int t(i0 i0Var) {
        return i0Var.getSerializedSize();
    }

    @Deprecated
    static int u(i0 i0Var, u0 u0Var) {
        return ((androidx.p008glance.p009appwidget.protobuf.a) i0Var).d(u0Var);
    }

    public static int v(int i, int i2) {
        return U(i) + w(i2);
    }

    public static int w(int i) {
        return Y(i);
    }

    public static int x(int i, long j) {
        return U(i) + y(j);
    }

    public static int y(long j) {
        return Y(j);
    }

    public static int z(int i, w wVar) {
        return (U(1) * 2) + V(2, i) + A(3, wVar);
    }

    public final void A0(int i, long j) throws IOException {
        R0(i, j);
    }

    public final void B0(long j) throws IOException {
        S0(j);
    }

    abstract void C0(int i, i0 i0Var, u0 u0Var) throws IOException;

    public abstract void D0(int i, i0 i0Var) throws IOException;

    public abstract void E0(int i, ByteString byteString) throws IOException;

    public final void F0(int i, int i2) throws IOException {
        q0(i, i2);
    }

    public final void G0(int i) throws IOException {
        r0(i);
    }

    public final void H0(int i, long j) throws IOException {
        s0(i, j);
    }

    public final void I0(long j) throws IOException {
        t0(j);
    }

    public final void J0(int i, int i2) throws IOException {
        P0(i, Z(i2));
    }

    public final void K0(int i) throws IOException {
        Q0(Z(i));
    }

    public final void L0(int i, long j) throws IOException {
        R0(i, a0(j));
    }

    public final void M0(long j) throws IOException {
        S0(a0(j));
    }

    public abstract void N0(int i, String str) throws IOException;

    public abstract void O0(int i, int i2) throws IOException;

    public abstract void P0(int i, int i2) throws IOException;

    public abstract void Q0(int i) throws IOException;

    public abstract void R0(int i, long j) throws IOException;

    public abstract void S0(long j) throws IOException;

    @Override // com.google.inputmethod.jz0
    public abstract void a(byte[] bArr, int i, int i2) throws IOException;

    public abstract void b0() throws IOException;

    public final void c() {
        if (h0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void c0(String str, Utf8.UnpairedSurrogateException unpairedSurrogateException) throws IOException {
        c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) unpairedSurrogateException);
        byte[] bytes = str.getBytes(u.b);
        try {
            Q0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new OutOfSpaceException(e);
        }
    }

    boolean d0() {
        return this.b;
    }

    public abstract int h0();

    public abstract void i0(byte b2) throws IOException;

    public abstract void j0(int i, boolean z) throws IOException;

    public final void k0(boolean z) throws IOException {
        i0(z ? (byte) 1 : (byte) 0);
    }

    public abstract void l0(int i, ByteString byteString) throws IOException;

    public final void m0(int i, double d2) throws IOException {
        s0(i, Double.doubleToRawLongBits(d2));
    }

    public final void n0(double d2) throws IOException {
        t0(Double.doubleToRawLongBits(d2));
    }

    public final void o0(int i, int i2) throws IOException {
        y0(i, i2);
    }

    public final void p0(int i) throws IOException {
        z0(i);
    }

    public abstract void q0(int i, int i2) throws IOException;

    public abstract void r0(int i) throws IOException;

    public abstract void s0(int i, long j) throws IOException;

    public abstract void t0(long j) throws IOException;

    public final void u0(int i, float f) throws IOException {
        q0(i, Float.floatToRawIntBits(f));
    }

    public final void v0(float f) throws IOException {
        r0(Float.floatToRawIntBits(f));
    }

    @Deprecated
    final void w0(int i, i0 i0Var, u0 u0Var) throws IOException {
        O0(i, 3);
        x0(i0Var, u0Var);
        O0(i, 4);
    }

    @Deprecated
    final void x0(i0 i0Var, u0 u0Var) throws IOException {
        u0Var.h(i0Var, this.a);
    }

    public abstract void y0(int i, int i2) throws IOException;

    public abstract void z0(int i) throws IOException;

    private CodedOutputStream() {
    }
}
