package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
class u {
    private final ArrayList<Fragment> a = new ArrayList<>();
    private final HashMap<String, t> b = new HashMap<>();
    private final HashMap<String, Bundle> c = new HashMap<>();
    private s d;

    u() {
    }

    void A(s sVar) {
        this.d = sVar;
    }

    Bundle B(String str, Bundle bundle) {
        return bundle != null ? this.c.put(str, bundle) : this.c.remove(str);
    }

    void a(Fragment fragment) {
        if (this.a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.a) {
            this.a.add(fragment);
        }
        fragment.mAdded = true;
    }

    void b() {
        this.b.values().removeAll(Collections.singleton(null));
    }

    boolean c(String str) {
        return this.b.get(str) != null;
    }

    void d(int i) {
        for (t tVar : this.b.values()) {
            if (tVar != null) {
                tVar.t(i);
            }
        }
    }

    void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (t tVar : this.b.values()) {
                printWriter.print(str);
                if (tVar != null) {
                    Fragment fragmentK = tVar.k();
                    printWriter.println(fragmentK);
                    fragmentK.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size; i++) {
                Fragment fragment = this.a.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
    }

    Fragment f(String str) {
        t tVar = this.b.get(str);
        if (tVar != null) {
            return tVar.k();
        }
        return null;
    }

    Fragment g(int i) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.a.get(size);
            if (fragment != null && fragment.mFragmentId == i) {
                return fragment;
            }
        }
        for (t tVar : this.b.values()) {
            if (tVar != null) {
                Fragment fragmentK = tVar.k();
                if (fragmentK.mFragmentId == i) {
                    return fragmentK;
                }
            }
        }
        return null;
    }

    Fragment h(String str) {
        if (str != null) {
            for (int size = this.a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.a.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (t tVar : this.b.values()) {
            if (tVar != null) {
                Fragment fragmentK = tVar.k();
                if (str.equals(fragmentK.mTag)) {
                    return fragmentK;
                }
            }
        }
        return null;
    }

    Fragment i(String str) {
        Fragment fragmentFindFragmentByWho;
        for (t tVar : this.b.values()) {
            if (tVar != null && (fragmentFindFragmentByWho = tVar.k().findFragmentByWho(str)) != null) {
                return fragmentFindFragmentByWho;
            }
        }
        return null;
    }

    int j(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int iIndexOf = this.a.indexOf(fragment);
        for (int i = iIndexOf - 1; i >= 0; i--) {
            Fragment fragment2 = this.a.get(i);
            if (fragment2.mContainer == viewGroup && (view2 = fragment2.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            iIndexOf++;
            if (iIndexOf >= this.a.size()) {
                return -1;
            }
            Fragment fragment3 = this.a.get(iIndexOf);
            if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    List<t> k() {
        ArrayList arrayList = new ArrayList();
        for (t tVar : this.b.values()) {
            if (tVar != null) {
                arrayList.add(tVar);
            }
        }
        return arrayList;
    }

    List<Fragment> l() {
        ArrayList arrayList = new ArrayList();
        for (t tVar : this.b.values()) {
            if (tVar != null) {
                arrayList.add(tVar.k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    HashMap<String, Bundle> m() {
        return this.c;
    }

    t n(String str) {
        return this.b.get(str);
    }

    List<Fragment> o() {
        ArrayList arrayList;
        if (this.a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.a) {
            arrayList = new ArrayList(this.a);
        }
        return arrayList;
    }

    s p() {
        return this.d;
    }

    Bundle q(String str) {
        return this.c.get(str);
    }

    void r(t tVar) {
        Fragment fragmentK = tVar.k();
        if (c(fragmentK.mWho)) {
            return;
        }
        this.b.put(fragmentK.mWho, tVar);
        if (fragmentK.mRetainInstanceChangedWhileDetached) {
            if (fragmentK.mRetainInstance) {
                this.d.C6(fragmentK);
            } else {
                this.d.M6(fragmentK);
            }
            fragmentK.mRetainInstanceChangedWhileDetached = false;
        }
        if (FragmentManager.R0(2)) {
            fragmentK.toString();
        }
    }

    void s(t tVar) {
        Fragment fragmentK = tVar.k();
        if (fragmentK.mRetainInstance) {
            this.d.M6(fragmentK);
        }
        if (this.b.get(fragmentK.mWho) == tVar && this.b.put(fragmentK.mWho, null) != null && FragmentManager.R0(2)) {
            fragmentK.toString();
        }
    }

    void t() {
        Iterator<Fragment> it = this.a.iterator();
        while (it.hasNext()) {
            t tVar = this.b.get(it.next().mWho);
            if (tVar != null) {
                tVar.m();
            }
        }
        for (t tVar2 : this.b.values()) {
            if (tVar2 != null) {
                tVar2.m();
                Fragment fragmentK = tVar2.k();
                if (fragmentK.mRemoving && !fragmentK.isInBackStack()) {
                    if (fragmentK.mBeingSaved && !this.c.containsKey(fragmentK.mWho)) {
                        B(fragmentK.mWho, tVar2.r());
                    }
                    s(tVar2);
                }
            }
        }
    }

    void u(Fragment fragment) {
        synchronized (this.a) {
            this.a.remove(fragment);
        }
        fragment.mAdded = false;
    }

    void v() {
        this.b.clear();
    }

    void w(List<String> list) {
        this.a.clear();
        if (list != null) {
            for (String str : list) {
                Fragment fragmentF = f(str);
                if (fragmentF == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (FragmentManager.R0(2)) {
                    fragmentF.toString();
                }
                a(fragmentF);
            }
        }
    }

    void x(HashMap<String, Bundle> map) {
        this.c.clear();
        this.c.putAll(map);
    }

    ArrayList<String> y() {
        ArrayList<String> arrayList = new ArrayList<>(this.b.size());
        for (t tVar : this.b.values()) {
            if (tVar != null) {
                Fragment fragmentK = tVar.k();
                B(fragmentK.mWho, tVar.r());
                arrayList.add(fragmentK.mWho);
                if (FragmentManager.R0(2)) {
                    fragmentK.toString();
                    Objects.toString(fragmentK.mSavedFragmentState);
                }
            }
        }
        return arrayList;
    }

    ArrayList<String> z() {
        synchronized (this.a) {
            try {
                if (this.a.isEmpty()) {
                    return null;
                }
                ArrayList<String> arrayList = new ArrayList<>(this.a.size());
                for (Fragment fragment : this.a) {
                    arrayList.add(fragment.mWho);
                    if (FragmentManager.R0(2)) {
                        fragment.toString();
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
