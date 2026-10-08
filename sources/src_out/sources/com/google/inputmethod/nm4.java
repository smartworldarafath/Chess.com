package com.google.inputmethod;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class nm4 {

    public static class c {
        public void a(int i) {
            throw null;
        }

        public void b(Typeface typeface) {
            throw null;
        }
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, b[] bVarArr) {
        return znd.b(context, cancellationSignal, bVarArr, 0);
    }

    public static a b(Context context, CancellationSignal cancellationSignal, zl4 zl4Var) throws PackageManager.NameNotFoundException {
        return yl4.e(context, bm4.a(new Object[]{zl4Var}), cancellationSignal);
    }

    public static Typeface c(Context context, List<zl4> list, int i, boolean z, int i2, Handler handler, c cVar) {
        t21 t21Var = new t21(cVar, yia.b(handler));
        if (!z) {
            return cm4.d(context, list, i, null, t21Var);
        }
        if (list.size() <= 1) {
            return cm4.e(context, list.get(0), t21Var, i, i2);
        }
        throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
    }

    public static class a {
        private final int a;
        private final List<b[]> b;

        @Deprecated
        public a(int i, b[] bVarArr) {
            this.a = i;
            this.b = Collections.singletonList(bVarArr);
        }

        static a a(int i, List<b[]> list) {
            return new a(i, list);
        }

        static a b(int i, b[] bVarArr) {
            return new a(i, bVarArr);
        }

        public b[] c() {
            return this.b.get(0);
        }

        public List<b[]> d() {
            return this.b;
        }

        public int e() {
            return this.a;
        }

        boolean f() {
            return this.b.size() > 1;
        }

        a(int i, List<b[]> list) {
            this.a = i;
            this.b = list;
        }
    }

    public static class b {
        private final Uri a;
        private final int b;
        private final int c;
        private final boolean d;
        private final String e;
        private final int f;

        public b(Uri uri, int i, int i2, boolean z, String str, int i3) {
            this.a = (Uri) di9.g(uri);
            this.b = i;
            this.c = i2;
            this.d = z;
            this.e = str;
            this.f = i3;
        }

        public int a() {
            return this.f;
        }

        public String b() {
            if (h()) {
                return this.a.getAuthority();
            }
            return null;
        }

        public int c() {
            return this.b;
        }

        public Uri d() {
            return this.a;
        }

        public String e() {
            return this.e;
        }

        public int f() {
            return this.c;
        }

        public boolean g() {
            return this.d;
        }

        public boolean h() {
            return Objects.equals(this.a.getScheme(), "systemfont");
        }

        public b(String str, String str2) {
            this.a = new Uri.Builder().scheme("systemfont").authority(str).build();
            this.b = 0;
            this.c = 400;
            this.d = false;
            this.e = str2;
            this.f = 0;
        }
    }
}
