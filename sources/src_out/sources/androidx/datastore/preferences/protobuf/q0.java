package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
final class q0 {
    private static final q0 c = new q0();
    static boolean d = false;
    private final ConcurrentMap<Class<?>, u0<?>> b = new ConcurrentHashMap();
    private final v0 a = new b0();

    private q0() {
    }

    public static q0 a() {
        return c;
    }

    public u0<?> b(Class<?> cls, u0<?> u0Var) {
        u.b(cls, "messageType");
        u.b(u0Var, "schema");
        return this.b.putIfAbsent(cls, u0Var);
    }

    public <T> u0<T> c(Class<T> cls) {
        u.b(cls, "messageType");
        u0<T> u0VarA = (u0) this.b.get(cls);
        if (u0VarA == null) {
            u0VarA = this.a.a(cls);
            u0<T> u0Var = (u0<T>) b(cls, u0VarA);
            if (u0Var != null) {
                return u0Var;
            }
        }
        return u0VarA;
    }

    public <T> u0<T> d(T t) {
        return c(t.getClass());
    }
}
