package androidx.p008glance.p009appwidget.protobuf;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
class s implements h0 {
    private static final s a = new s();

    private s() {
    }

    public static s c() {
        return a;
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.h0
    public g0 a(Class<?> cls) {
        if (!GeneratedMessageLite.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (g0) GeneratedMessageLite.t(cls.asSubclass(GeneratedMessageLite.class)).i();
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e);
        }
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.h0
    public boolean b(Class<?> cls) {
        return GeneratedMessageLite.class.isAssignableFrom(cls);
    }
}
