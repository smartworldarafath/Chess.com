package com.google.inputmethod;

import android.app.Person;
import android.os.Bundle;
import android.os.PersistableBundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class p89 {
    CharSequence a;
    IconCompat b;
    String c;
    String d;
    boolean e;
    boolean f;

    static class a {
        static p89 a(PersistableBundle persistableBundle) {
            return new c().f(persistableBundle.getString("name")).g(persistableBundle.getString("uri")).e(persistableBundle.getString("key")).b(persistableBundle.getBoolean("isBot")).d(persistableBundle.getBoolean("isImportant")).a();
        }

        static PersistableBundle b(p89 p89Var) {
            PersistableBundle persistableBundle = new PersistableBundle();
            CharSequence charSequence = p89Var.a;
            persistableBundle.putString("name", charSequence != null ? charSequence.toString() : null);
            persistableBundle.putString("uri", p89Var.c);
            persistableBundle.putString("key", p89Var.d);
            persistableBundle.putBoolean("isBot", p89Var.e);
            persistableBundle.putBoolean("isImportant", p89Var.f);
            return persistableBundle;
        }
    }

    static class b {
        static Person a(p89 p89Var) {
            return new Person.Builder().setName(p89Var.d()).setIcon(p89Var.b() != null ? p89Var.b().p() : null).setUri(p89Var.e()).setKey(p89Var.c()).setBot(p89Var.f()).setImportant(p89Var.g()).build();
        }
    }

    public static class c {
        CharSequence a;
        IconCompat b;
        String c;
        String d;
        boolean e;
        boolean f;

        public p89 a() {
            return new p89(this);
        }

        public c b(boolean z) {
            this.e = z;
            return this;
        }

        public c c(IconCompat iconCompat) {
            this.b = iconCompat;
            return this;
        }

        public c d(boolean z) {
            this.f = z;
            return this;
        }

        public c e(String str) {
            this.d = str;
            return this;
        }

        public c f(CharSequence charSequence) {
            this.a = charSequence;
            return this;
        }

        public c g(String str) {
            this.c = str;
            return this;
        }
    }

    p89(c cVar) {
        this.a = cVar.a;
        this.b = cVar.b;
        this.c = cVar.c;
        this.d = cVar.d;
        this.e = cVar.e;
        this.f = cVar.f;
    }

    public static p89 a(PersistableBundle persistableBundle) {
        return a.a(persistableBundle);
    }

    public IconCompat b() {
        return this.b;
    }

    public String c() {
        return this.d;
    }

    public CharSequence d() {
        return this.a;
    }

    public String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof p89)) {
            return false;
        }
        p89 p89Var = (p89) obj;
        String strC = c();
        String strC2 = p89Var.c();
        if (strC == null && strC2 == null) {
            return Objects.equals(Objects.toString(d()), Objects.toString(p89Var.d())) && Objects.equals(e(), p89Var.e()) && Boolean.valueOf(f()).equals(Boolean.valueOf(p89Var.f())) && Boolean.valueOf(g()).equals(Boolean.valueOf(p89Var.g()));
        }
        return Objects.equals(strC, strC2);
    }

    public boolean f() {
        return this.e;
    }

    public boolean g() {
        return this.f;
    }

    public Person h() {
        return b.a(this);
    }

    public int hashCode() {
        String strC = c();
        return strC != null ? strC.hashCode() : Objects.hash(d(), e(), Boolean.valueOf(f()), Boolean.valueOf(g()));
    }

    public Bundle i() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.a);
        IconCompat iconCompat = this.b;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.o() : null);
        bundle.putString("uri", this.c);
        bundle.putString("key", this.d);
        bundle.putBoolean("isBot", this.e);
        bundle.putBoolean("isImportant", this.f);
        return bundle;
    }

    public PersistableBundle j() {
        return a.b(this);
    }
}
