package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0011\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/google/android/g37;", "Lcom/google/android/zea;", "Lcom/google/android/yea;", "wrapped", "Lcom/google/android/t27;", "after", "<init>", "(Lcom/google/android/yea;Lcom/google/android/t27;)V", "a", "Lcom/google/android/yea;", "()Lcom/google/android/yea;", "setWrapped", "(Lcom/google/android/yea;)V", "b", "Lcom/google/android/t27;", "()Lcom/google/android/t27;", "c", "(Lcom/google/android/t27;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class g37 implements zea {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private yea wrapped;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private t27 after;

    public g37(yea yeaVar, t27 t27Var) {
        this.wrapped = yeaVar;
        this.after = t27Var;
    }

    @Override // com.google.inputmethod.zea
    /* JADX INFO: renamed from: a, reason: from getter */
    public yea getWrapped() {
        return this.wrapped;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final t27 getAfter() {
        return this.after;
    }

    public final void c(t27 t27Var) {
        this.after = t27Var;
    }
}
