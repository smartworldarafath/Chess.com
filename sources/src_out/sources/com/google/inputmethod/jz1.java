package com.google.inputmethod;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Objects;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public final class jz1 {
    private final f a;

    public static final class a {
        private final c a;

        public a(ClipData clipData, int i) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.a = new b(clipData, i);
            } else {
                this.a = new d(clipData, i);
            }
        }

        public jz1 a() {
            return this.a.build();
        }

        public a b(Bundle bundle) {
            this.a.setExtras(bundle);
            return this;
        }

        public a c(int i) {
            this.a.b(i);
            return this;
        }

        public a d(Uri uri) {
            this.a.a(uri);
            return this;
        }
    }

    private static final class b implements c {
        private final ContentInfo.Builder a;

        b(ClipData clipData, int i) {
            this.a = oz1.a(clipData, i);
        }

        @Override // com.google.android.jz1.c
        public void a(Uri uri) {
            this.a.setLinkUri(uri);
        }

        @Override // com.google.android.jz1.c
        public void b(int i) {
            this.a.setFlags(i);
        }

        @Override // com.google.android.jz1.c
        public jz1 build() {
            return new jz1(new e(this.a.build()));
        }

        @Override // com.google.android.jz1.c
        public void setExtras(Bundle bundle) {
            this.a.setExtras(bundle);
        }
    }

    private interface c {
        void a(Uri uri);

        void b(int i);

        jz1 build();

        void setExtras(Bundle bundle);
    }

    private static final class d implements c {
        ClipData a;
        int b;
        int c;
        Uri d;
        Bundle e;

        d(ClipData clipData, int i) {
            this.a = clipData;
            this.b = i;
        }

        @Override // com.google.android.jz1.c
        public void a(Uri uri) {
            this.d = uri;
        }

        @Override // com.google.android.jz1.c
        public void b(int i) {
            this.c = i;
        }

        @Override // com.google.android.jz1.c
        public jz1 build() {
            return new jz1(new g(this));
        }

        @Override // com.google.android.jz1.c
        public void setExtras(Bundle bundle) {
            this.e = bundle;
        }
    }

    private static final class e implements f {
        private final ContentInfo a;

        e(ContentInfo contentInfo) {
            this.a = iz1.a(di9.g(contentInfo));
        }

        @Override // com.google.android.jz1.f
        public ContentInfo a() {
            return this.a;
        }

        @Override // com.google.android.jz1.f
        public ClipData b() {
            return this.a.getClip();
        }

        @Override // com.google.android.jz1.f
        public int d() {
            return this.a.getSource();
        }

        @Override // com.google.android.jz1.f
        public int getFlags() {
            return this.a.getFlags();
        }

        public String toString() {
            return "ContentInfoCompat{" + this.a + "}";
        }
    }

    private interface f {
        ContentInfo a();

        ClipData b();

        int d();

        int getFlags();
    }

    private static final class g implements f {
        private final ClipData a;
        private final int b;
        private final int c;
        private final Uri d;
        private final Bundle e;

        g(d dVar) {
            this.a = (ClipData) di9.g(dVar.a);
            this.b = di9.c(dVar.b, 0, 5, "source");
            this.c = di9.f(dVar.c, 1);
            this.d = dVar.d;
            this.e = dVar.e;
        }

        @Override // com.google.android.jz1.f
        public ContentInfo a() {
            return null;
        }

        @Override // com.google.android.jz1.f
        public ClipData b() {
            return this.a;
        }

        @Override // com.google.android.jz1.f
        public int d() {
            return this.b;
        }

        @Override // com.google.android.jz1.f
        public int getFlags() {
            return this.c;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("ContentInfoCompat{clip=");
            sb.append(this.a.getDescription());
            sb.append(", source=");
            sb.append(jz1.e(this.b));
            sb.append(", flags=");
            sb.append(jz1.a(this.c));
            if (this.d == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.d.toString().length() + ")";
            }
            sb.append(str);
            sb.append(this.e != null ? ", hasExtras" : "");
            sb.append("}");
            return sb.toString();
        }
    }

    jz1(f fVar) {
        this.a = fVar;
    }

    static String a(int i) {
        return (i & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i);
    }

    static String e(int i) {
        if (i == 0) {
            return "SOURCE_APP";
        }
        if (i == 1) {
            return "SOURCE_CLIPBOARD";
        }
        if (i == 2) {
            return "SOURCE_INPUT_METHOD";
        }
        if (i == 3) {
            return "SOURCE_DRAG_AND_DROP";
        }
        if (i != 4) {
            return i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT";
        }
        return "SOURCE_AUTOFILL";
    }

    public static jz1 g(ContentInfo contentInfo) {
        return new jz1(new e(contentInfo));
    }

    public ClipData b() {
        return this.a.b();
    }

    public int c() {
        return this.a.getFlags();
    }

    public int d() {
        return this.a.d();
    }

    public ContentInfo f() {
        ContentInfo contentInfoA = this.a.a();
        Objects.requireNonNull(contentInfoA);
        return iz1.a(contentInfoA);
    }

    public String toString() {
        return this.a.toString();
    }
}
