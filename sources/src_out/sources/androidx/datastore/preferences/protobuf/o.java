package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
final class o {
    private static final m<?> a = new n();
    private static final m<?> b = c();

    static m<?> a() {
        m<?> mVar = b;
        if (mVar != null) {
            return mVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static m<?> b() {
        return a;
    }

    private static m<?> c() {
        if (q0.d) {
            return null;
        }
        try {
            return (m) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
