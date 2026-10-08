package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/google/android/un3;", "Lcom/google/android/gq1;", "Lcom/google/android/kub;", "editor", "<init>", "(Lcom/google/android/kub;)V", "Lcom/google/android/mg;", "anchor", "Lcom/google/android/a25;", "g", "(Lcom/google/android/mg;)Lcom/google/android/a25;", "", "d", "(Lcom/google/android/mg;)I", "b", "Lcom/google/android/kub;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class un3 extends gq1 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final kub editor;

    public un3(kub kubVar) {
        this.editor = kubVar;
    }

    @Override // com.google.inputmethod.gq1
    public int d(mg anchor) {
        return this.editor.l(u27.c(anchor).getAddress());
    }

    @Override // com.google.inputmethod.gq1
    public a25 g(mg anchor) {
        return this.editor.getTable().getAddressSpace().F(u27.c(anchor).getAddress());
    }
}
