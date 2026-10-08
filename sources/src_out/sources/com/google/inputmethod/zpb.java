package com.google.inputmethod;

import androidx.compose.ui.b;
import androidx.compose.ui.graphics.painter.Painter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\tJ\u0013\u0010\u0010\u001a\u00020\r*\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010\"\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/google/android/zpb;", "Lcom/google/android/yg3;", "Landroidx/compose/ui/b$c;", "Lcom/google/android/on8;", "Lcom/google/android/xkb;", "shape", "Lcom/google/android/okb;", "shadow", "<init>", "(Lcom/google/android/xkb;Lcom/google/android/okb;)V", "Lcom/google/android/qx5;", "m3", "()Lcom/google/android/qx5;", "", "n3", "Lcom/google/android/fz1;", "j", "(Lcom/google/android/fz1;)V", "M1", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "p", "Lcom/google/android/xkb;", "q", "Lcom/google/android/okb;", "r", "Lcom/google/android/qx5;", "innerShadowPainter", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class zpb extends b.c implements yg3, on8 {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private xkb shape;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private Shadow shadow;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private qx5 innerShadowPainter;

    public zpb(xkb xkbVar, Shadow shadow) {
        this.shape = xkbVar;
        this.shadow = shadow;
    }

    private final qx5 m3() {
        qx5 qx5Var = this.innerShadowPainter;
        if (qx5Var != null) {
            return qx5Var;
        }
        qx5 qx5VarA = y23.n(this).a().a(this.shape, this.shadow);
        this.innerShadowPainter = qx5VarA;
        return qx5VarA;
    }

    @Override // com.google.inputmethod.on8
    public void M1() {
        this.innerShadowPainter = null;
        zg3.a(this);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || zpb.class != other.getClass()) {
            return false;
        }
        zpb zpbVar = (zpb) other;
        return Intrinsics.e(this.shape, zpbVar.shape) && Intrinsics.e(this.shadow, zpbVar.shadow);
    }

    public int hashCode() {
        return (this.shape.hashCode() * 31) + this.shadow.hashCode();
    }

    @Override // com.google.inputmethod.yg3
    public void j(fz1 fz1Var) {
        Painter.k(m3(), fz1Var, fz1Var.d(), 0.0f, null, 6, null);
        fz1Var.j1();
    }

    public final void n3(xkb shape, Shadow shadow) {
        if (!Intrinsics.e(this.shape, shape) || !Intrinsics.e(this.shadow, shadow)) {
            this.innerShadowPainter = null;
        }
        this.shape = shape;
        this.shadow = shadow;
    }
}
