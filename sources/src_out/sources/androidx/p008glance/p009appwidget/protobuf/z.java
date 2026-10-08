package androidx.p008glance.p009appwidget.protobuf;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
final class z {
    private static final x a = c();
    private static final x b = new y();

    static x a() {
        return a;
    }

    static x b() {
        return b;
    }

    private static x c() {
        if (q0.d) {
            return null;
        }
        try {
            return (x) Class.forName("androidx.glance.appwidget.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
