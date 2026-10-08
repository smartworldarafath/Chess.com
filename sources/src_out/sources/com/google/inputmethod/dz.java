package com.google.inputmethod;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010!\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ'\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/google/android/dz;", "Lcom/google/android/z0;", "Lcom/google/android/rp3;", "Lcom/google/android/jq3;", "root", "<init>", "(Lcom/google/android/jq3;)V", "", "n", "()V", "", "index", "instance", "r", "(ILcom/google/android/rp3;)V", "s", "from", "to", "count", "f", "(III)V", "b", "(II)V", "e", "I", "newRootMaxDepth", "", "q", "()Ljava/util/List;", "currentChildren", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class dz extends z0<rp3> {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int newRootMaxDepth;

    public dz(jq3 jq3Var) {
        super(jq3Var);
        this.newRootMaxDepth = jq3Var.getMaxDepth();
    }

    private final List<rp3> q() {
        rp3 rp3VarA = a();
        if (rp3VarA instanceof jq3) {
            return ((jq3) rp3VarA).d();
        }
        throw new IllegalStateException("Current node cannot accept children");
    }

    @Override // com.google.inputmethod.ez
    public void b(int index, int count) {
        o(q(), index, count);
    }

    @Override // com.google.inputmethod.ez
    public void f(int from, int to, int count) {
        m(q(), from, to, count);
    }

    @Override // com.google.inputmethod.z0
    protected void n() {
        rp3 rp3VarL = l();
        Intrinsics.h(rp3VarL, "null cannot be cast to non-null type androidx.glance.EmittableWithChildren");
        ((jq3) rp3VarL).d().clear();
    }

    @Override // com.google.inputmethod.ez
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void i(int index, rp3 instance) {
    }

    @Override // com.google.inputmethod.ez
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void h(int index, rp3 instance) {
        rp3 rp3VarA = a();
        Intrinsics.h(rp3VarA, "null cannot be cast to non-null type androidx.glance.EmittableWithChildren");
        jq3 jq3Var = (jq3) rp3VarA;
        if (jq3Var.getMaxDepth() > 0) {
            if (instance instanceof jq3) {
                jq3 jq3Var2 = (jq3) instance;
                jq3Var2.g(jq3Var2.getResetsDepthForChildren() ? this.newRootMaxDepth : jq3Var.getMaxDepth() - 1);
            }
            q().add(index, instance);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Too many embedded views for the current surface. The maximum depth is: ");
        rp3 rp3VarL = l();
        Intrinsics.h(rp3VarL, "null cannot be cast to non-null type androidx.glance.EmittableWithChildren");
        sb.append(((jq3) rp3VarL).getMaxDepth());
        throw new IllegalArgumentException(sb.toString().toString());
    }
}
