package androidx.p008glance.p009appwidget.protobuf;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
final class f0 {
    private static final d0 a = c();
    private static final d0 b = new e0();

    static d0 a() {
        return a;
    }

    static d0 b() {
        return b;
    }

    private static d0 c() {
        if (q0.d) {
            return null;
        }
        try {
            return (d0) Class.forName("androidx.glance.appwidget.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
