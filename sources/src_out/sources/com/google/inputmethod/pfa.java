package com.google.inputmethod;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public final class pfa {
    private final String a;
    private final CharSequence b;
    private final CharSequence[] c;
    private final boolean d;
    private final int e;
    private final Bundle f;
    private final Set<String> g;

    static class a {
        public static RemoteInput a(pfa pfaVar) {
            RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(pfaVar.i()).setLabel(pfaVar.h()).setChoices(pfaVar.e()).setAllowFreeFormInput(pfaVar.c()).addExtras(pfaVar.g());
            Set<String> setD = pfaVar.d();
            if (setD != null) {
                Iterator<String> it = setD.iterator();
                while (it.hasNext()) {
                    b.a(builderAddExtras, it.next(), true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                c.a(builderAddExtras, pfaVar.f());
            }
            return builderAddExtras.build();
        }
    }

    static class b {
        static RemoteInput.Builder a(RemoteInput.Builder builder, String str, boolean z) {
            return builder.setAllowDataType(str, z);
        }
    }

    static class c {
        static RemoteInput.Builder a(RemoteInput.Builder builder, int i) {
            return builder.setEditChoicesBeforeSending(i);
        }
    }

    static RemoteInput a(pfa pfaVar) {
        return a.a(pfaVar);
    }

    static RemoteInput[] b(pfa[] pfaVarArr) {
        if (pfaVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[pfaVarArr.length];
        for (int i = 0; i < pfaVarArr.length; i++) {
            remoteInputArr[i] = a(pfaVarArr[i]);
        }
        return remoteInputArr;
    }

    public boolean c() {
        return this.d;
    }

    public Set<String> d() {
        return this.g;
    }

    public CharSequence[] e() {
        return this.c;
    }

    public int f() {
        return this.e;
    }

    public Bundle g() {
        return this.f;
    }

    public CharSequence h() {
        return this.b;
    }

    public String i() {
        return this.a;
    }

    public boolean j() {
        if (c()) {
            return false;
        }
        return ((e() != null && e().length != 0) || d() == null || d().isEmpty()) ? false : true;
    }
}
