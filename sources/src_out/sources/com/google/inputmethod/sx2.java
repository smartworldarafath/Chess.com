package com.google.inputmethod;

import androidx.compose.p001foundation.gestures.Orientation;
import androidx.compose.p001foundation.gestures.snapping.e;
import kotlin.Metadata;
import kotlin.collections.m;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u00020\n*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\u00020\u0002*\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u00020\u0002*\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0016\u001a\u00020\n*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0018\u001a\u00020\n*\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001c\u001a\u00020\n*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001eR\u0016\u0010 \u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010#R\u0016\u0010&\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010%R\u0016\u0010'\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001eR\u0016\u0010)\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010(¨\u0006*"}, d2 = {"Lcom/google/android/sx2;", "Lcom/google/android/qq6;", "", "initialNestedPrefetchItemCount", "<init>", "(I)V", "Lcom/google/android/cq6;", "currentPrefetchingLineIndex", "", "scrollingForward", "", "g", "(Lcom/google/android/cq6;IZ)V", "f", "(Lcom/google/android/cq6;Z)I", "e", "h", "()V", "Lcom/google/android/pq6;", "", "delta", "layoutInfo", "c", "(Lcom/google/android/pq6;FLcom/google/android/cq6;)V", "d", "(Lcom/google/android/pq6;Lcom/google/android/cq6;)V", "Lcom/google/android/qe8;", "firstVisibleItemIndex", "a", "(Lcom/google/android/qe8;I)V", "I", "b", "lineToPrefetch", "Lcom/google/android/r58;", "Lcom/google/android/nu6$b;", "Lcom/google/android/r58;", "currentLinePrefetchHandles", "Z", "wasScrollingForward", "previousPassItemCount", "F", "previousPassDelta", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class sx2 implements qq6 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int initialNestedPrefetchItemCount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean wasScrollingForward;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private float previousPassDelta;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int lineToPrefetch = -1;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final r58<nu6.b> currentLinePrefetchHandles = new r58<>(new nu6.b[16], 0);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int previousPassItemCount = -1;

    public sx2(int i) {
        this.initialNestedPrefetchItemCount = i;
    }

    private final int e(cq6 cq6Var, boolean z) {
        return z ? ((pp6) m.L0(cq6Var.h())).getIndex() + 1 : ((pp6) m.z0(cq6Var.h())).getIndex() - 1;
    }

    private final int f(cq6 cq6Var, boolean z) {
        if (z) {
            pp6 pp6Var = (pp6) m.L0(cq6Var.h());
            return (cq6Var.a() == Orientation.Vertical ? pp6Var.getRow() : pp6Var.getColumn()) + 1;
        }
        pp6 pp6Var2 = (pp6) m.z0(cq6Var.h());
        return (cq6Var.a() == Orientation.Vertical ? pp6Var2.getRow() : pp6Var2.getColumn()) - 1;
    }

    private final void g(cq6 cq6Var, int i, boolean z) {
        if (i == -1 || cq6Var.h().isEmpty() || i == f(cq6Var, z)) {
            return;
        }
        h();
    }

    private final void h() {
        this.lineToPrefetch = -1;
        r58<nu6.b> r58Var = this.currentLinePrefetchHandles;
        nu6.b[] bVarArr = r58Var.content;
        int size = r58Var.getSize();
        for (int i = 0; i < size; i++) {
            bVarArr[i].cancel();
        }
        this.currentLinePrefetchHandles.j();
    }

    @Override // com.google.inputmethod.qq6
    public void a(qe8 qe8Var, int i) {
        int nestedPrefetchItemCount = qe8Var.getNestedPrefetchItemCount() == -1 ? this.initialNestedPrefetchItemCount : qe8Var.getNestedPrefetchItemCount();
        for (int i2 = 0; i2 < nestedPrefetchItemCount; i2++) {
            qe8Var.a(i + i2);
        }
    }

    @Override // com.google.inputmethod.qq6
    public void c(pq6 pq6Var, float f, cq6 cq6Var) {
        if (!cq6Var.h().isEmpty()) {
            int i = 0;
            boolean z = f < 0.0f;
            int iF = f(cq6Var, z);
            int iE = e(cq6Var, z);
            if (iE >= 0 && iE < cq6Var.d()) {
                if (iF != this.lineToPrefetch && iF >= 0) {
                    if (this.wasScrollingForward != z) {
                        r58<nu6.b> r58Var = this.currentLinePrefetchHandles;
                        nu6.b[] bVarArr = r58Var.content;
                        int size = r58Var.getSize();
                        for (int i2 = 0; i2 < size; i2++) {
                            bVarArr[i2].cancel();
                        }
                    }
                    this.wasScrollingForward = z;
                    this.lineToPrefetch = iF;
                    this.currentLinePrefetchHandles.j();
                    r58<nu6.b> r58Var2 = this.currentLinePrefetchHandles;
                    r58Var2.f(r58Var2.getSize(), pq6Var.a(iF));
                }
                if (z) {
                    pp6 pp6Var = (pp6) m.L0(cq6Var.h());
                    if (((e.b(pp6Var, cq6Var.a()) + e.c(pp6Var, cq6Var.a())) + cq6Var.f()) - cq6Var.i() < (-f)) {
                        r58<nu6.b> r58Var3 = this.currentLinePrefetchHandles;
                        nu6.b[] bVarArr2 = r58Var3.content;
                        int size2 = r58Var3.getSize();
                        while (i < size2) {
                            bVarArr2[i].d();
                            i++;
                        }
                    }
                } else if (cq6Var.g() - e.b((pp6) m.z0(cq6Var.h()), cq6Var.a()) < f) {
                    r58<nu6.b> r58Var4 = this.currentLinePrefetchHandles;
                    nu6.b[] bVarArr3 = r58Var4.content;
                    int size3 = r58Var4.getSize();
                    while (i < size3) {
                        bVarArr3[i].d();
                        i++;
                    }
                }
            }
        }
        this.previousPassDelta = f;
    }

    @Override // com.google.inputmethod.qq6
    public void d(pq6 pq6Var, cq6 cq6Var) {
        g(cq6Var, this.lineToPrefetch, this.wasScrollingForward);
        int iD = cq6Var.d();
        int i = this.previousPassItemCount;
        if (i != -1 && this.previousPassDelta != 0.0f && i != iD && !cq6Var.h().isEmpty()) {
            int iF = f(cq6Var, this.previousPassDelta < 0.0f);
            int iE = e(cq6Var, this.previousPassDelta < 0.0f);
            if (iE >= 0 && iE < cq6Var.d() && iF != this.lineToPrefetch && iF >= 0) {
                this.lineToPrefetch = iF;
                this.currentLinePrefetchHandles.j();
                r58<nu6.b> r58Var = this.currentLinePrefetchHandles;
                r58Var.f(r58Var.getSize(), pq6Var.a(iF));
            }
        }
        this.previousPassItemCount = iD;
    }
}
