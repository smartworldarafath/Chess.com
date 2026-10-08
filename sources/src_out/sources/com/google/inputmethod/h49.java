package com.google.inputmethod;

import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/google/android/h49;", "Lcom/google/android/yea;", "", "abandoning", "<init>", "(Ljava/util/Set;)V", "", "d", "()V", "f", "e", "a", "Ljava/util/Set;", "Lcom/google/android/r58;", "Lcom/google/android/zea;", "b", "Lcom/google/android/r58;", "()Lcom/google/android/r58;", "pausedRemembers", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h49 implements yea {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Set<yea> abandoning;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final r58<zea> pausedRemembers = new r58<>(new zea[16], 0);

    public h49(Set<yea> set) {
        this.abandoning = set;
    }

    public final r58<zea> a() {
        return this.pausedRemembers;
    }

    @Override // com.google.inputmethod.yea
    public void d() {
        r58<zea> r58Var = this.pausedRemembers;
        zea[] zeaVarArr = r58Var.content;
        int size = r58Var.getSize();
        for (int i = 0; i < size; i++) {
            yea wrapped = zeaVarArr[i].getWrapped();
            this.abandoning.remove(wrapped);
            wrapped.d();
        }
    }

    @Override // com.google.inputmethod.yea
    public void e() {
    }

    @Override // com.google.inputmethod.yea
    public void f() {
    }
}
