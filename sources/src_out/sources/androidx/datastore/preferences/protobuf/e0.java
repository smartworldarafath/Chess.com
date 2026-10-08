package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
final class e0 implements d0 {
    e0() {
    }

    private static <K, V> int i(int i, Object obj, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        c0 c0Var = (c0) obj2;
        int iA = 0;
        if (mapFieldLite.isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : mapFieldLite.entrySet()) {
            iA += c0Var.a(i, entry.getKey(), entry.getValue());
        }
        return iA;
    }

    private static <K, V> MapFieldLite<K, V> j(Object obj, Object obj2) {
        MapFieldLite<K, V> mapFieldLiteK = (MapFieldLite) obj;
        MapFieldLite<K, V> mapFieldLite = (MapFieldLite) obj2;
        if (!mapFieldLite.isEmpty()) {
            if (!mapFieldLiteK.h()) {
                mapFieldLiteK = mapFieldLiteK.k();
            }
            mapFieldLiteK.j(mapFieldLite);
        }
        return mapFieldLiteK;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public c0.a<?, ?> b(Object obj) {
        return ((c0) obj).c();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public Object c(Object obj) {
        ((MapFieldLite) obj).i();
        return obj;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public int d(int i, Object obj, Object obj2) {
        return i(i, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public Map<?, ?> e(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public Object f(Object obj) {
        return MapFieldLite.d().k();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public Map<?, ?> g(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public boolean h(Object obj) {
        return !((MapFieldLite) obj).h();
    }
}
