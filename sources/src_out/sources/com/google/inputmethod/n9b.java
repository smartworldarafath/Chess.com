package com.google.inputmethod;

import androidx.compose.p001foundation.gestures.Orientation;
import androidx.compose.ui.b;
import androidx.compose.ui.layout.j;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.node.c;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0011\u001a\u00020\u0010*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0017\u001a\u00020\u0015*\u00020\u00132\u0006\u0010\r\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001a\u001a\u00020\u0015*\u00020\u00132\u0006\u0010\r\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u0018J#\u0010\u001b\u001a\u00020\u0015*\u00020\u00132\u0006\u0010\r\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u0018J#\u0010\u001c\u001a\u00020\u0015*\u00020\u00132\u0006\u0010\r\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u0018J\u0013\u0010\u001f\u001a\u00020\u001e*\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010(\u001a\u0004\b\b\u0010*\"\u0004\b.\u0010,¨\u0006/"}, d2 = {"Lcom/google/android/n9b;", "Landroidx/compose/ui/node/c;", "Lcom/google/android/bfb;", "Landroidx/compose/ui/b$c;", "Lcom/google/android/v9b;", "state", "", "reverseScrolling", "isVertical", "<init>", "(Lcom/google/android/v9b;ZZ)V", "Landroidx/compose/ui/layout/j;", "Lcom/google/android/dj7;", "measurable", "Lcom/google/android/kx1;", "constraints", "Lcom/google/android/fj7;", "b", "(Landroidx/compose/ui/layout/j;Lcom/google/android/dj7;J)Lcom/google/android/fj7;", "Lcom/google/android/h66;", "Lcom/google/android/f66;", "", "height", "z", "(Lcom/google/android/h66;Lcom/google/android/f66;I)I", "width", "m", "t", "i", "Lcom/google/android/nfb;", "", "H0", "(Lcom/google/android/nfb;)V", "p", "Lcom/google/android/v9b;", "getState", "()Lcom/google/android/v9b;", "v3", "(Lcom/google/android/v9b;)V", "q", "Z", "getReverseScrolling", "()Z", "u3", "(Z)V", "r", "w3", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n9b extends b.c implements c, bfb {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private v9b state;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private boolean reverseScrolling;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private boolean isVertical;

    public n9b(v9b v9bVar, boolean z, boolean z2) {
        this.state = v9bVar;
        this.reverseScrolling = z;
        this.isVertical = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float q3(n9b n9bVar) {
        return n9bVar.state.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float r3(n9b n9bVar) {
        return n9bVar.state.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s3(n9b n9bVar, int i, final o oVar, o.a aVar) {
        int iV = n9bVar.state.v();
        if (iV < 0) {
            iV = 0;
        }
        if (iV > i) {
            iV = i;
        }
        int i2 = n9bVar.reverseScrolling ? iV - i : -iV;
        boolean z = n9bVar.isVertical;
        final int i3 = z ? 0 : i2;
        final int i4 = z ? i2 : 0;
        aVar.k0(new Function1() { // from class: com.google.android.m9b
            public final Object invoke(Object obj) {
                return n9b.t3(oVar, i3, i4, (o.a) obj);
            }
        });
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t3(o oVar, int i, int i2, o.a aVar) {
        o.a.T(aVar, oVar, i, i2, 0.0f, null, 12, null);
        return Unit.a;
    }

    @Override // com.google.inputmethod.bfb
    public void H0(nfb nfbVar) {
        SemanticsPropertiesKt.F0(nfbVar, true);
        ScrollAxisRange scrollAxisRange = new ScrollAxisRange(new Function0() { // from class: com.google.android.k9b
            public final Object invoke() {
                return Float.valueOf(n9b.q3(this.a));
            }
        }, new Function0() { // from class: com.google.android.l9b
            public final Object invoke() {
                return Float.valueOf(n9b.r3(this.a));
            }
        }, this.reverseScrolling);
        if (this.isVertical) {
            SemanticsPropertiesKt.H0(nfbVar, scrollAxisRange);
        } else {
            SemanticsPropertiesKt.i0(nfbVar, scrollAxisRange);
        }
    }

    @Override // androidx.compose.ui.node.c
    public fj7 b(j jVar, dj7 dj7Var, long j) {
        fa1.a(j, this.isVertical ? Orientation.Vertical : Orientation.Horizontal);
        final o oVarR0 = dj7Var.r0(kx1.d(j, 0, this.isVertical ? kx1.l(j) : Integer.MAX_VALUE, 0, this.isVertical ? Integer.MAX_VALUE : kx1.k(j), 5, null));
        int iJ = g.j(oVarR0.getWidth(), kx1.l(j));
        int iJ2 = g.j(oVarR0.getHeight(), kx1.k(j));
        final int height = oVarR0.getHeight() - iJ2;
        int width = oVarR0.getWidth() - iJ;
        if (!this.isVertical) {
            height = width;
        }
        this.state.z(height);
        this.state.B(this.isVertical ? iJ2 : iJ);
        this.state.y(this.isVertical ? oVarR0.getHeight() : oVarR0.getWidth());
        return j.Q1(jVar, iJ, iJ2, null, new Function1() { // from class: com.google.android.j9b
            public final Object invoke(Object obj) {
                return n9b.s3(this.a, height, oVarR0, (o.a) obj);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.node.c
    public int i(h66 h66Var, f66 f66Var, int i) {
        if (!this.isVertical) {
            i = Integer.MAX_VALUE;
        }
        return f66Var.W(i);
    }

    @Override // androidx.compose.ui.node.c
    public int m(h66 h66Var, f66 f66Var, int i) {
        if (!this.isVertical) {
            i = Integer.MAX_VALUE;
        }
        return f66Var.d0(i);
    }

    @Override // androidx.compose.ui.node.c
    public int t(h66 h66Var, f66 f66Var, int i) {
        if (this.isVertical) {
            i = Integer.MAX_VALUE;
        }
        return f66Var.q0(i);
    }

    public final void u3(boolean z) {
        this.reverseScrolling = z;
    }

    public final void v3(v9b v9bVar) {
        this.state = v9bVar;
    }

    public final void w3(boolean z) {
        this.isVertical = z;
    }

    @Override // androidx.compose.ui.node.c
    public int z(h66 h66Var, f66 f66Var, int i) {
        if (this.isVertical) {
            i = Integer.MAX_VALUE;
        }
        return f66Var.o0(i);
    }
}
