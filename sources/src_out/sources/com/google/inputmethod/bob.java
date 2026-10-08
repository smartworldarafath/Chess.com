package com.google.inputmethod;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public abstract class bob<T> {

    public static class a extends bob<Void> {
        @Override // com.google.inputmethod.bob
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Void a(List<znb> list) {
            return null;
        }

        @Override // com.google.inputmethod.bob
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Void c() {
            return null;
        }

        @Override // com.google.inputmethod.bob
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Void d(List<String> list) {
            return null;
        }
    }

    public abstract T a(List<znb> list);

    public List<znb> b() throws Exception {
        return new ArrayList();
    }

    public abstract T c();

    public abstract T d(List<String> list);
}
