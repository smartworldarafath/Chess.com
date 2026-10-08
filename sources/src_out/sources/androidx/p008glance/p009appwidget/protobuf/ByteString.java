package androidx.p008glance.p009appwidget.protobuf;

import com.google.inputmethod.jz0;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public abstract class ByteString implements Iterable<Byte>, Serializable {
    public static final ByteString a = new LiteralByteString(u.d);
    private static final e b;
    private static final Comparator<ByteString> c;
    private static final long serialVersionUID = 1;
    private int hash = 0;

    private static final class BoundedByteString extends LiteralByteString {
        private static final long serialVersionUID = 1;
        private final int bytesLength;
        private final int bytesOffset;

        BoundedByteString(byte[] bArr, int i, int i2) {
            super(bArr);
            ByteString.e(i, i + i2, bArr.length);
            this.bytesOffset = i;
            this.bytesLength = i2;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // androidx.glance.appwidget.protobuf.ByteString.LiteralByteString
        protected int D() {
            return this.bytesOffset;
        }

        @Override // androidx.glance.appwidget.protobuf.ByteString.LiteralByteString, androidx.p008glance.p009appwidget.protobuf.ByteString
        public byte c(int i) {
            ByteString.d(i, size());
            return this.bytes[this.bytesOffset + i];
        }

        @Override // androidx.glance.appwidget.protobuf.ByteString.LiteralByteString, androidx.p008glance.p009appwidget.protobuf.ByteString
        protected void n(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.bytes, D() + i, bArr, i2, i3);
        }

        @Override // androidx.glance.appwidget.protobuf.ByteString.LiteralByteString, androidx.p008glance.p009appwidget.protobuf.ByteString
        byte o(int i) {
            return this.bytes[this.bytesOffset + i];
        }

        @Override // androidx.glance.appwidget.protobuf.ByteString.LiteralByteString, androidx.p008glance.p009appwidget.protobuf.ByteString
        public int size() {
            return this.bytesLength;
        }

        Object writeReplace() {
            return ByteString.z(w());
        }
    }

    static abstract class LeafByteString extends ByteString {
        private static final long serialVersionUID = 1;

        /* synthetic */ LeafByteString(a aVar) {
            this();
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.ByteString, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
            return super.iterator();
        }

        private LeafByteString() {
        }
    }

    private static class LiteralByteString extends LeafByteString {
        private static final long serialVersionUID = 1;
        protected final byte[] bytes;

        LiteralByteString(byte[] bArr) {
            super(null);
            bArr.getClass();
            this.bytes = bArr;
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.ByteString
        final void B(jz0 jz0Var) throws IOException {
            jz0Var.a(this.bytes, D(), size());
        }

        final boolean C(ByteString byteString, int i, int i2) {
            if (i2 > byteString.size()) {
                throw new IllegalArgumentException("Length too large: " + i2 + size());
            }
            int i3 = i + i2;
            if (i3 > byteString.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + byteString.size());
            }
            if (!(byteString instanceof LiteralByteString)) {
                return byteString.v(i, i3).equals(v(0, i2));
            }
            LiteralByteString literalByteString = (LiteralByteString) byteString;
            byte[] bArr = this.bytes;
            byte[] bArr2 = literalByteString.bytes;
            int iD = D() + i2;
            int iD2 = D();
            int iD3 = literalByteString.D() + i;
            while (iD2 < iD) {
                if (bArr[iD2] != bArr2[iD3]) {
                    return false;
                }
                iD2++;
                iD3++;
            }
            return true;
        }

        protected int D() {
            return 0;
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.ByteString
        public byte c(int i) {
            return this.bytes[i];
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.ByteString
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ByteString) || size() != ((ByteString) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof LiteralByteString)) {
                return obj.equals(this);
            }
            LiteralByteString literalByteString = (LiteralByteString) obj;
            int iU = u();
            int iU2 = literalByteString.u();
            if (iU == 0 || iU2 == 0 || iU == iU2) {
                return C(literalByteString, 0, size());
            }
            return false;
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.ByteString
        protected void n(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.bytes, i, bArr, i2, i3);
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.ByteString
        byte o(int i) {
            return this.bytes[i];
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.ByteString
        public final androidx.p008glance.p009appwidget.protobuf.f s() {
            return androidx.p008glance.p009appwidget.protobuf.f.k(this.bytes, D(), size(), true);
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.ByteString
        public int size() {
            return this.bytes.length;
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.ByteString
        protected final int t(int i, int i2, int i3) {
            return u.h(i, this.bytes, D() + i2, i3);
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.ByteString
        public final ByteString v(int i, int i2) {
            int iE = ByteString.e(i, i2, size());
            return iE == 0 ? ByteString.a : new BoundedByteString(this.bytes, D() + i, iE);
        }
    }

    class a extends c {
        private int a = 0;
        private final int b;

        a() {
            this.b = ByteString.this.size();
        }

        @Override // androidx.glance.appwidget.protobuf.ByteString.f
        public byte c() {
            int i = this.a;
            if (i >= this.b) {
                throw new NoSuchElementException();
            }
            this.a = i + 1;
            return ByteString.this.o(i);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.a < this.b;
        }
    }

    class b implements Comparator<ByteString> {
        b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(ByteString byteString, ByteString byteString2) {
            f it = byteString.iterator();
            f it2 = byteString2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int iCompareTo = Integer.valueOf(ByteString.x(it.c())).compareTo(Integer.valueOf(ByteString.x(it2.c())));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            return Integer.valueOf(byteString.size()).compareTo(Integer.valueOf(byteString2.size()));
        }
    }

    static abstract class c implements f {
        c() {
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Byte next() {
            return Byte.valueOf(c());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private static final class d implements e {
        private d() {
        }

        @Override // androidx.glance.appwidget.protobuf.ByteString.e
        public byte[] a(byte[] bArr, int i, int i2) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    private interface e {
        byte[] a(byte[] bArr, int i, int i2);
    }

    public interface f extends Iterator<Byte> {
        byte c();
    }

    static final class g {
        private final CodedOutputStream a;
        private final byte[] b;

        /* synthetic */ g(int i, a aVar) {
            this(i);
        }

        public ByteString a() {
            this.a.c();
            return new LiteralByteString(this.b);
        }

        public CodedOutputStream b() {
            return this.a;
        }

        private g(int i) {
            byte[] bArr = new byte[i];
            this.b = bArr;
            this.a = CodedOutputStream.f0(bArr);
        }
    }

    private static final class h implements e {
        private h() {
        }

        @Override // androidx.glance.appwidget.protobuf.ByteString.e
        public byte[] a(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }

        /* synthetic */ h(a aVar) {
            this();
        }
    }

    static {
        a aVar = null;
        b = androidx.p008glance.p009appwidget.protobuf.d.c() ? new h(aVar) : new d(aVar);
        c = new b();
    }

    ByteString() {
    }

    static ByteString A(byte[] bArr, int i, int i2) {
        return new BoundedByteString(bArr, i, i2);
    }

    static void d(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
        }
    }

    static int e(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i + " < 0");
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i + ", " + i2);
        }
        throw new IndexOutOfBoundsException("End index: " + i2 + " >= " + i3);
    }

    public static ByteString f(byte[] bArr) {
        return i(bArr, 0, bArr.length);
    }

    public static ByteString i(byte[] bArr, int i, int i2) {
        e(i, i + i2, bArr.length);
        return new LiteralByteString(b.a(bArr, i, i2));
    }

    public static ByteString j(String str) {
        return new LiteralByteString(str.getBytes(u.b));
    }

    static g r(int i) {
        return new g(i, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int x(byte b2) {
        return b2 & 255;
    }

    private String y() {
        if (size() <= 50) {
            return z0.a(this);
        }
        return z0.a(v(0, 47)) + "...";
    }

    static ByteString z(byte[] bArr) {
        return new LiteralByteString(bArr);
    }

    abstract void B(jz0 jz0Var) throws IOException;

    public abstract byte c(int i);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iT = this.hash;
        if (iT == 0) {
            int size = size();
            iT = t(size, 0, size);
            if (iT == 0) {
                iT = 1;
            }
            this.hash = iT;
        }
        return iT;
    }

    protected abstract void n(byte[] bArr, int i, int i2, int i3);

    abstract byte o(int i);

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public f iterator() {
        return new a();
    }

    public abstract androidx.p008glance.p009appwidget.protobuf.f s();

    public abstract int size();

    protected abstract int t(int i, int i2, int i3);

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), y());
    }

    protected final int u() {
        return this.hash;
    }

    public abstract ByteString v(int i, int i2);

    public final byte[] w() {
        int size = size();
        if (size == 0) {
            return u.d;
        }
        byte[] bArr = new byte[size];
        n(bArr, 0, 0, size);
        return bArr;
    }
}
