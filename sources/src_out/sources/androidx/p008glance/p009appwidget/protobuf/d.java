package androidx.p008glance.p009appwidget.protobuf;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
final class d {
    private static boolean a;
    private static final Class<?> b = a("libcore.io.Memory");
    private static final boolean c;

    static {
        c = (a || a("org.robolectric.Robolectric") == null) ? false : true;
    }

    private static <T> Class<T> a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static Class<?> b() {
        return b;
    }

    static boolean c() {
        if (a) {
            return true;
        }
        return (b == null || c) ? false : true;
    }
}
