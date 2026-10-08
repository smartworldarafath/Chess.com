package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
final class k {
    static final Class<?> a = c();

    public static l a() {
        l lVarB = b("getEmptyRegistry");
        return lVarB != null ? lVarB : l.c;
    }

    private static final l b(String str) {
        Class<?> cls = a;
        if (cls == null) {
            return null;
        }
        try {
            return (l) cls.getDeclaredMethod(str, null).invoke(null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    static Class<?> c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
