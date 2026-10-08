package androidx.p008glance.p009appwidget.protobuf;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
final class o0 {
    private static final m0 a = c();
    private static final m0 b = new n0();

    static m0 a() {
        return a;
    }

    static m0 b() {
        return b;
    }

    private static m0 c() {
        if (q0.d) {
            return null;
        }
        try {
            return (m0) Class.forName("androidx.glance.appwidget.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
