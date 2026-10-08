package com.google.inputmethod;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class s6 {
    private final Object a;

    static class a extends AccessibilityNodeProvider {
        final s6 a;

        a(s6 s6Var) {
            this.a = s6Var;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            r6 r6VarB = this.a.b(i);
            if (r6VarB == null) {
                return null;
            }
            return r6VarB.n1();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            List<r6> listC = this.a.c(str, i);
            if (listC == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = listC.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(listC.get(i2).n1());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i) {
            r6 r6VarD = this.a.d(i);
            if (r6VarD == null) {
                return null;
            }
            return r6VarD.n1();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.a.f(i, i2, bundle);
        }
    }

    static class b extends a {
        b(s6 s6Var) {
            super(s6Var);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.a.a(i, r6.o1(accessibilityNodeInfo), str, bundle);
        }
    }

    public s6() {
        this.a = new b(this);
    }

    public void a(int i, r6 r6Var, String str, Bundle bundle) {
    }

    public r6 b(int i) {
        return null;
    }

    public List<r6> c(String str, int i) {
        return null;
    }

    public r6 d(int i) {
        return null;
    }

    public Object e() {
        return this.a;
    }

    public boolean f(int i, int i2, Bundle bundle) {
        return false;
    }

    public s6(Object obj) {
        this.a = obj;
    }
}
