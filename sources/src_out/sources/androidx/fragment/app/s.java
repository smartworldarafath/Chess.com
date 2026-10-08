package androidx.fragment.app;

import com.google.inputmethod.k9e;
import com.google.inputmethod.w8e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
final class s extends w8e {
    private static final androidx.lifecycle.b0.c h = new a();
    private final boolean d;
    private final HashMap<String, Fragment> a = new HashMap<>();
    private final HashMap<String, s> b = new HashMap<>();
    private final HashMap<String, k9e> c = new HashMap<>();
    private boolean e = false;
    private boolean f = false;
    private boolean g = false;

    class a implements androidx.lifecycle.b0.c {
        a() {
        }

        @Override // androidx.lifecycle.b0.c
        public <T extends w8e> T create(Class<T> cls) {
            return new s(true);
        }
    }

    s(boolean z) {
        this.d = z;
    }

    private void F6(String str, boolean z) {
        s sVar = this.b.get(str);
        if (sVar != null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(sVar.b.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    sVar.E6((String) it.next(), true);
                }
            }
            sVar.onCleared();
            this.b.remove(str);
        }
        k9e k9eVar = this.c.get(str);
        if (k9eVar != null) {
            k9eVar.a();
            this.c.remove(str);
        }
    }

    static s I6(k9e k9eVar) {
        return (s) new androidx.lifecycle.b0(k9eVar, h).b(s.class);
    }

    void C6(Fragment fragment) {
        if (this.g) {
            FragmentManager.R0(2);
        } else {
            if (this.a.containsKey(fragment.mWho)) {
                return;
            }
            this.a.put(fragment.mWho, fragment);
            if (FragmentManager.R0(2)) {
                fragment.toString();
            }
        }
    }

    void D6(Fragment fragment, boolean z) {
        if (FragmentManager.R0(3)) {
            Objects.toString(fragment);
        }
        F6(fragment.mWho, z);
    }

    void E6(String str, boolean z) {
        FragmentManager.R0(3);
        F6(str, z);
    }

    Fragment G6(String str) {
        return this.a.get(str);
    }

    s H6(Fragment fragment) {
        s sVar = this.b.get(fragment.mWho);
        if (sVar != null) {
            return sVar;
        }
        s sVar2 = new s(this.d);
        this.b.put(fragment.mWho, sVar2);
        return sVar2;
    }

    Collection<Fragment> J6() {
        return new ArrayList(this.a.values());
    }

    k9e K6(Fragment fragment) {
        k9e k9eVar = this.c.get(fragment.mWho);
        if (k9eVar != null) {
            return k9eVar;
        }
        k9e k9eVar2 = new k9e();
        this.c.put(fragment.mWho, k9eVar2);
        return k9eVar2;
    }

    boolean L6() {
        return this.e;
    }

    void M6(Fragment fragment) {
        if (this.g) {
            FragmentManager.R0(2);
        } else {
            if (this.a.remove(fragment.mWho) == null || !FragmentManager.R0(2)) {
                return;
            }
            fragment.toString();
        }
    }

    void N6(boolean z) {
        this.g = z;
    }

    boolean O6(Fragment fragment) {
        if (this.a.containsKey(fragment.mWho)) {
            return this.d ? this.e : !this.f;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s.class == obj.getClass()) {
            s sVar = (s) obj;
            if (this.a.equals(sVar.a) && this.b.equals(sVar.b) && this.c.equals(sVar.c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    @Override // com.google.inputmethod.w8e
    protected void onCleared() {
        if (FragmentManager.R0(3)) {
            toString();
        }
        this.e = true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.a.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.b.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.c.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
