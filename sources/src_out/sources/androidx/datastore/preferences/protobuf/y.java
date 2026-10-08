package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
final class y implements x {
    y() {
    }

    static <E> u.f<E> d(Object obj, long j) {
        return (u.f) d1.z(obj, j);
    }

    @Override // androidx.datastore.preferences.protobuf.x
    public <E> void a(Object obj, Object obj2, long j) {
        u.f fVarD = d(obj, j);
        u.f fVarD2 = d(obj2, j);
        int size = fVarD.size();
        int size2 = fVarD2.size();
        if (size > 0 && size2 > 0) {
            if (!fVarD.k()) {
                fVarD = fVarD.a(size2 + size);
            }
            fVarD.addAll(fVarD2);
        }
        if (size > 0) {
            fVarD2 = fVarD;
        }
        d1.O(obj, j, fVarD2);
    }

    @Override // androidx.datastore.preferences.protobuf.x
    public void b(Object obj, long j) {
        d(obj, j).h();
    }

    @Override // androidx.datastore.preferences.protobuf.x
    public <L> List<L> c(Object obj, long j) {
        u.f fVarD = d(obj, j);
        if (fVarD.k()) {
            return fVarD;
        }
        int size = fVarD.size();
        u.f fVarA = fVarD.a(size == 0 ? 10 : size * 2);
        d1.O(obj, j, fVarA);
        return fVarA;
    }
}
