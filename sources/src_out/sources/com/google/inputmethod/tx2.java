package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.collections.m;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u0002*\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000f\u001a\u00020\u0006*\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0015\u001a\u00020\u0006*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0017\u001a\u00020\u0006*\u00020\u00112\u0006\u0010\u0014\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001b\u001a\u00020\u0006*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0018\u0010\"\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010!R\u0016\u0010$\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010#R\u0016\u0010%\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001dR\u0016\u0010'\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010&¨\u0006("}, d2 = {"Lcom/google/android/tx2;", "Lcom/google/android/zv6;", "", "initialNestedPrefetchItemCount", "<init>", "(I)V", "", "g", "()V", "Lcom/google/android/nv6;", "", "scrollingForward", "e", "(Lcom/google/android/nv6;Z)I", "currentPrefetchingIndex", "f", "(Lcom/google/android/nv6;IZ)V", "Lcom/google/android/yv6;", "", "delta", "layoutInfo", "c", "(Lcom/google/android/yv6;FLcom/google/android/nv6;)V", "d", "(Lcom/google/android/yv6;Lcom/google/android/nv6;)V", "Lcom/google/android/qe8;", "firstVisibleItemIndex", "a", "(Lcom/google/android/qe8;I)V", "I", "b", "indexToPrefetch", "Lcom/google/android/nu6$b;", "Lcom/google/android/nu6$b;", "currentPrefetchHandle", "Z", "wasScrollingForward", "previousPassItemCount", "F", "previousPassDelta", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class tx2 implements zv6 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int initialNestedPrefetchItemCount;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private nu6.b currentPrefetchHandle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean wasScrollingForward;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private float previousPassDelta;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int indexToPrefetch = -1;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int previousPassItemCount = -1;

    public tx2(int i) {
        this.initialNestedPrefetchItemCount = i;
    }

    private final int e(nv6 nv6Var, boolean z) {
        return z ? ((gv6) m.L0(nv6Var.h())).getIndex() + 1 : ((gv6) m.z0(nv6Var.h())).getIndex() - 1;
    }

    private final void f(nv6 nv6Var, int i, boolean z) {
        if (i == -1 || nv6Var.h().isEmpty() || i == e(nv6Var, z)) {
            return;
        }
        g();
    }

    private final void g() {
        this.indexToPrefetch = -1;
        nu6.b bVar = this.currentPrefetchHandle;
        if (bVar != null) {
            bVar.cancel();
        }
        this.currentPrefetchHandle = null;
    }

    @Override // com.google.inputmethod.zv6
    public void a(qe8 qe8Var, int i) {
        int nestedPrefetchItemCount = qe8Var.getNestedPrefetchItemCount() == -1 ? this.initialNestedPrefetchItemCount : qe8Var.getNestedPrefetchItemCount();
        for (int i2 = 0; i2 < nestedPrefetchItemCount; i2++) {
            qe8Var.a(i + i2);
        }
    }

    @Override // com.google.inputmethod.zv6
    public void c(yv6 yv6Var, float f, nv6 nv6Var) {
        nu6.b bVar;
        nu6.b bVar2;
        if (!nv6Var.h().isEmpty()) {
            boolean z = f < 0.0f;
            int iE = e(nv6Var, z);
            if (iE >= 0 && iE < nv6Var.d()) {
                if (iE != this.indexToPrefetch) {
                    if (this.wasScrollingForward != z) {
                        g();
                    }
                    this.wasScrollingForward = z;
                    this.indexToPrefetch = iE;
                    this.currentPrefetchHandle = yv6.b(yv6Var, iE, null, 2, null);
                }
                if (z) {
                    gv6 gv6Var = (gv6) m.L0(nv6Var.h());
                    if (((gv6Var.getOffset() + gv6Var.getSize()) + nv6Var.f()) - nv6Var.i() < (-f) && (bVar2 = this.currentPrefetchHandle) != null) {
                        bVar2.d();
                    }
                } else if (nv6Var.g() - ((gv6) m.z0(nv6Var.h())).getOffset() < f && (bVar = this.currentPrefetchHandle) != null) {
                    bVar.d();
                }
            }
        }
        this.previousPassDelta = f;
    }

    @Override // com.google.inputmethod.zv6
    public void d(yv6 yv6Var, nv6 nv6Var) {
        f(nv6Var, this.indexToPrefetch, this.wasScrollingForward);
        int iD = nv6Var.d();
        int i = this.previousPassItemCount;
        if (i != -1 && this.previousPassDelta != 0.0f && i != iD && !nv6Var.h().isEmpty()) {
            int iE = e(nv6Var, this.previousPassDelta < 0.0f);
            if (iE >= 0 && iE < iD) {
                this.indexToPrefetch = iE;
                this.currentPrefetchHandle = yv6.b(yv6Var, iE, null, 2, null);
            }
        }
        this.previousPassItemCount = iD;
    }
}
