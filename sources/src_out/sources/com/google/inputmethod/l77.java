package com.google.inputmethod;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
final class l77 implements k77 {
    private final LocaleList a;

    l77(Object obj) {
        this.a = (LocaleList) obj;
    }

    @Override // com.google.inputmethod.k77
    public String a() {
        return this.a.toLanguageTags();
    }

    public boolean equals(Object obj) {
        return this.a.equals(((k77) obj).getLocaleList());
    }

    @Override // com.google.inputmethod.k77
    public Locale get(int i) {
        return this.a.get(i);
    }

    @Override // com.google.inputmethod.k77
    public Object getLocaleList() {
        return this.a;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // com.google.inputmethod.k77
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // com.google.inputmethod.k77
    public int size() {
        return this.a.size();
    }

    public String toString() {
        return this.a.toString();
    }
}
