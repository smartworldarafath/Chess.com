package com.google.inputmethod;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public final class xx5 {
    private final b a;

    private static final class a implements b {
        final InputContentInfo a;

        a(Object obj) {
            this.a = (InputContentInfo) obj;
        }

        @Override // com.google.android.xx5.b
        public Object a() {
            return this.a;
        }

        @Override // com.google.android.xx5.b
        public Uri b() {
            return this.a.getContentUri();
        }

        @Override // com.google.android.xx5.b
        public void c() {
            this.a.requestPermission();
        }

        @Override // com.google.android.xx5.b
        public Uri d() {
            return this.a.getLinkUri();
        }

        @Override // com.google.android.xx5.b
        public ClipDescription getDescription() {
            return this.a.getDescription();
        }
    }

    private interface b {
        Object a();

        Uri b();

        void c();

        Uri d();

        ClipDescription getDescription();
    }

    private xx5(b bVar) {
        this.a = bVar;
    }

    public static xx5 f(Object obj) {
        if (obj == null) {
            return null;
        }
        return new xx5(new a(obj));
    }

    public Uri a() {
        return this.a.b();
    }

    public ClipDescription b() {
        return this.a.getDescription();
    }

    public Uri c() {
        return this.a.d();
    }

    public void d() {
        this.a.c();
    }

    public Object e() {
        return this.a.a();
    }
}
