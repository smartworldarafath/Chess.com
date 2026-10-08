package androidx.p008glance.p009appwidget.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public final class u {
    static final Charset a = Charset.forName("US-ASCII");
    static final Charset b = Charset.forName("UTF-8");
    static final Charset c = Charset.forName("ISO-8859-1");
    public static final byte[] d;
    public static final ByteBuffer e;
    public static final androidx.p008glance.p009appwidget.protobuf.f f;

    public interface a {
        int getNumber();
    }

    public interface b<T extends a> {
        T findValueByNumber(int i);
    }

    public interface c {
        boolean isInRange(int i);
    }

    public interface d extends f<Integer> {
    }

    public interface e extends f<Long> {
    }

    public interface f<E> extends List<E>, RandomAccess {
        f<E> a(int i);

        void h();

        boolean k();
    }

    static {
        byte[] bArr = new byte[0];
        d = bArr;
        e = ByteBuffer.wrap(bArr);
        f = androidx.p008glance.p009appwidget.protobuf.f.i(bArr);
    }

    static <T> T a(T t) {
        t.getClass();
        return t;
    }

    static <T> T b(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static int c(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    static int e(byte[] bArr, int i, int i2) {
        int iH = h(i2, bArr, i, i2);
        if (iH == 0) {
            return 1;
        }
        return iH;
    }

    public static int f(long j) {
        return (int) (j ^ (j >>> 32));
    }

    static Object g(Object obj, Object obj2) {
        return ((i0) obj).toBuilder().G0((i0) obj2).buildPartial();
    }

    static int h(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }
}
