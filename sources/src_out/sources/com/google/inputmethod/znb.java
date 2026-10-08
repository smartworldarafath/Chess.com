package com.google.inputmethod;

import android.app.Person;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import android.os.UserHandle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class znb {
    Context a;
    String b;
    String c;
    Intent[] d;
    ComponentName e;
    CharSequence f;
    CharSequence g;
    CharSequence h;
    IconCompat i;
    p89[] j;
    Set<String> k;
    x77 l;
    boolean m;
    int n;
    PersistableBundle o;
    long p;
    UserHandle q;
    boolean r;
    boolean s;
    boolean t;
    boolean u;
    boolean v;
    boolean w = true;
    boolean x;
    int y;
    int z;

    private static class a {
        static void a(ShortcutInfo.Builder builder, int i) {
            builder.setExcludedFromSurfaces(i);
        }
    }

    znb() {
    }

    private PersistableBundle a() {
        if (this.o == null) {
            this.o = new PersistableBundle();
        }
        p89[] p89VarArr = this.j;
        if (p89VarArr != null && p89VarArr.length > 0) {
            this.o.putInt("extraPersonCount", p89VarArr.length);
            int i = 0;
            while (i < this.j.length) {
                PersistableBundle persistableBundle = this.o;
                StringBuilder sb = new StringBuilder();
                sb.append("extraPerson_");
                int i2 = i + 1;
                sb.append(i2);
                persistableBundle.putPersistableBundle(sb.toString(), this.j[i].j());
                i = i2;
            }
        }
        x77 x77Var = this.l;
        if (x77Var != null) {
            this.o.putString("extraLocusId", x77Var.a());
        }
        this.o.putBoolean("extraLongLived", this.m);
        return this.o;
    }

    static List<znb> b(Context context, List<ShortcutInfo> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<ShortcutInfo> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new b(context, it.next()).a());
        }
        return arrayList;
    }

    static x77 e(ShortcutInfo shortcutInfo) {
        if (Build.VERSION.SDK_INT < 29) {
            return f(shortcutInfo.getExtras());
        }
        if (shortcutInfo.getLocusId() == null) {
            return null;
        }
        return x77.d(shortcutInfo.getLocusId());
    }

    private static x77 f(PersistableBundle persistableBundle) {
        String string;
        if (persistableBundle == null || (string = persistableBundle.getString("extraLocusId")) == null) {
            return null;
        }
        return new x77(string);
    }

    static p89[] g(PersistableBundle persistableBundle) {
        if (persistableBundle == null || !persistableBundle.containsKey("extraPersonCount")) {
            return null;
        }
        int i = persistableBundle.getInt("extraPersonCount");
        p89[] p89VarArr = new p89[i];
        int i2 = 0;
        while (i2 < i) {
            StringBuilder sb = new StringBuilder();
            sb.append("extraPerson_");
            int i3 = i2 + 1;
            sb.append(i3);
            p89VarArr[i2] = p89.a(persistableBundle.getPersistableBundle(sb.toString()));
            i2 = i3;
        }
        return p89VarArr;
    }

    public String c() {
        return this.b;
    }

    public x77 d() {
        return this.l;
    }

    public int h() {
        return this.n;
    }

    public CharSequence i() {
        return this.f;
    }

    public boolean j(int i) {
        return (i & this.z) != 0;
    }

    public ShortcutInfo k() {
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.a, this.b).setShortLabel(this.f).setIntents(this.d);
        IconCompat iconCompat = this.i;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.q(this.a));
        }
        if (!TextUtils.isEmpty(this.g)) {
            intents.setLongLabel(this.g);
        }
        if (!TextUtils.isEmpty(this.h)) {
            intents.setDisabledMessage(this.h);
        }
        ComponentName componentName = this.e;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.k;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.n);
        PersistableBundle persistableBundle = this.o;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            p89[] p89VarArr = this.j;
            if (p89VarArr != null && p89VarArr.length > 0) {
                int length = p89VarArr.length;
                Person[] personArr = new Person[length];
                for (int i = 0; i < length; i++) {
                    personArr[i] = this.j[i].h();
                }
                intents.setPersons(personArr);
            }
            x77 x77Var = this.l;
            if (x77Var != null) {
                intents.setLocusId(x77Var.c());
            }
            intents.setLongLived(this.m);
        } else {
            intents.setExtras(a());
        }
        if (Build.VERSION.SDK_INT >= 33) {
            a.a(intents, this.z);
        }
        return intents.build();
    }

    public static class b {
        private final znb a;
        private boolean b;
        private Set<String> c;
        private Map<String, Map<String, List<String>>> d;
        private Uri e;

        public b(Context context, String str) {
            znb znbVar = new znb();
            this.a = znbVar;
            znbVar.a = context;
            znbVar.b = str;
        }

        public znb a() {
            if (TextUtils.isEmpty(this.a.f)) {
                throw new IllegalArgumentException("Shortcut must have a non-empty label");
            }
            znb znbVar = this.a;
            Intent[] intentArr = znbVar.d;
            if (intentArr == null || intentArr.length == 0) {
                throw new IllegalArgumentException("Shortcut must have an intent");
            }
            if (this.b) {
                if (znbVar.l == null) {
                    znbVar.l = new x77(znbVar.b);
                }
                this.a.m = true;
            }
            if (this.c != null) {
                znb znbVar2 = this.a;
                if (znbVar2.k == null) {
                    znbVar2.k = new HashSet();
                }
                this.a.k.addAll(this.c);
            }
            if (this.d != null) {
                znb znbVar3 = this.a;
                if (znbVar3.o == null) {
                    znbVar3.o = new PersistableBundle();
                }
                for (String str : this.d.keySet()) {
                    Map<String, List<String>> map = this.d.get(str);
                    this.a.o.putStringArray(str, (String[]) map.keySet().toArray(new String[0]));
                    for (String str2 : map.keySet()) {
                        List<String> list = map.get(str2);
                        this.a.o.putStringArray(str + "/" + str2, list == null ? new String[0] : (String[]) list.toArray(new String[0]));
                    }
                }
            }
            if (this.e != null) {
                znb znbVar4 = this.a;
                if (znbVar4.o == null) {
                    znbVar4.o = new PersistableBundle();
                }
                this.a.o.putString("extraSliceUri", bvd.a(this.e));
            }
            return this.a;
        }

        public b b(IconCompat iconCompat) {
            this.a.i = iconCompat;
            return this;
        }

        public b c(Intent intent) {
            return d(new Intent[]{intent});
        }

        public b d(Intent[] intentArr) {
            this.a.d = intentArr;
            return this;
        }

        public b e() {
            this.b = true;
            return this;
        }

        public b f(boolean z) {
            this.a.m = z;
            return this;
        }

        public b g(int i) {
            this.a.n = i;
            return this;
        }

        public b h(CharSequence charSequence) {
            this.a.f = charSequence;
            return this;
        }

        public b(Context context, ShortcutInfo shortcutInfo) {
            znb znbVar = new znb();
            this.a = znbVar;
            znbVar.a = context;
            znbVar.b = shortcutInfo.getId();
            znbVar.c = shortcutInfo.getPackage();
            Intent[] intents = shortcutInfo.getIntents();
            znbVar.d = (Intent[]) Arrays.copyOf(intents, intents.length);
            znbVar.e = shortcutInfo.getActivity();
            znbVar.f = shortcutInfo.getShortLabel();
            znbVar.g = shortcutInfo.getLongLabel();
            znbVar.h = shortcutInfo.getDisabledMessage();
            int i = Build.VERSION.SDK_INT;
            znbVar.y = shortcutInfo.getDisabledReason();
            znbVar.k = shortcutInfo.getCategories();
            znbVar.j = znb.g(shortcutInfo.getExtras());
            znbVar.q = shortcutInfo.getUserHandle();
            znbVar.p = shortcutInfo.getLastChangedTimestamp();
            if (i >= 30) {
                znbVar.r = shortcutInfo.isCached();
            }
            znbVar.s = shortcutInfo.isDynamic();
            znbVar.t = shortcutInfo.isPinned();
            znbVar.u = shortcutInfo.isDeclaredInManifest();
            znbVar.v = shortcutInfo.isImmutable();
            znbVar.w = shortcutInfo.isEnabled();
            znbVar.x = shortcutInfo.hasKeyFieldsOnly();
            znbVar.l = znb.e(shortcutInfo);
            znbVar.n = shortcutInfo.getRank();
            znbVar.o = shortcutInfo.getExtras();
        }
    }
}
