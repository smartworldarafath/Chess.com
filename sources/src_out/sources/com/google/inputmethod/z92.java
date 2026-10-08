package com.google.inputmethod;

import androidx.compose.ui.graphics.n;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\f\b'\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ%\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J?\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u0015\u0010\u0016J7\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003H&¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b¨\u0006 "}, d2 = {"Lcom/google/android/z92;", "Lcom/google/android/xkb;", "", "Lcom/google/android/ea2;", "topStart", "topEnd", "bottomEnd", "bottomStart", "<init>", "(Lcom/google/android/ea2;Lcom/google/android/ea2;Lcom/google/android/ea2;Lcom/google/android/ea2;)V", "Lcom/google/android/tsb;", "size", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Lcom/google/android/f43;", "density", "Landroidx/compose/ui/graphics/n;", "createOutline-Pq9zytI", "(JLandroidx/compose/ui/unit/LayoutDirection;Lcom/google/android/f43;)Landroidx/compose/ui/graphics/n;", "createOutline", "", "c", "(JFFFFLandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/graphics/n;", "a", "(Lcom/google/android/ea2;Lcom/google/android/ea2;Lcom/google/android/ea2;Lcom/google/android/ea2;)Lcom/google/android/z92;", "Lcom/google/android/ea2;", "g", "()Lcom/google/android/ea2;", "b", "f", "d", "e", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class z92 implements xkb {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ea2 topStart;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ea2 topEnd;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final ea2 bottomEnd;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final ea2 bottomStart;

    public z92(ea2 ea2Var, ea2 ea2Var2, ea2 ea2Var3, ea2 ea2Var4) {
        this.topStart = ea2Var;
        this.topEnd = ea2Var2;
        this.bottomEnd = ea2Var3;
        this.bottomStart = ea2Var4;
    }

    public static /* synthetic */ z92 b(z92 z92Var, ea2 ea2Var, ea2 ea2Var2, ea2 ea2Var3, ea2 ea2Var4, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        if ((i & 1) != 0) {
            ea2Var = z92Var.topStart;
        }
        if ((i & 2) != 0) {
            ea2Var2 = z92Var.topEnd;
        }
        if ((i & 4) != 0) {
            ea2Var3 = z92Var.bottomEnd;
        }
        if ((i & 8) != 0) {
            ea2Var4 = z92Var.bottomStart;
        }
        return z92Var.a(ea2Var, ea2Var2, ea2Var3, ea2Var4);
    }

    public abstract z92 a(ea2 topStart, ea2 topEnd, ea2 bottomEnd, ea2 bottomStart);

    public abstract n c(long size, float topStart, float topEnd, float bottomEnd, float bottomStart, LayoutDirection layoutDirection);

    @Override // com.google.inputmethod.xkb
    /* JADX INFO: renamed from: createOutline-Pq9zytI */
    public final n mo5createOutlinePq9zytI(long size, LayoutDirection layoutDirection, f43 density) {
        float fA = this.topStart.a(size, density);
        float fA2 = this.topEnd.a(size, density);
        float fA3 = this.bottomEnd.a(size, density);
        float fA4 = this.bottomStart.a(size, density);
        float fK = tsb.k(size);
        float f = fA + fA4;
        if (f > fK) {
            float f2 = fK / f;
            fA *= f2;
            fA4 *= f2;
        }
        float f3 = fA2 + fA3;
        if (f3 > fK) {
            float f4 = fK / f3;
            fA2 *= f4;
            fA3 *= f4;
        }
        if (!(fA >= 0.0f && fA2 >= 0.0f && fA3 >= 0.0f && fA4 >= 0.0f)) {
            cx5.a("Corner size in Px can't be negative(topStart = " + fA + ", topEnd = " + fA2 + ", bottomEnd = " + fA3 + ", bottomStart = " + fA4 + ")!");
        }
        return c(size, fA, fA2, fA3, fA4, layoutDirection);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final ea2 getBottomEnd() {
        return this.bottomEnd;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final ea2 getBottomStart() {
        return this.bottomStart;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final ea2 getTopEnd() {
        return this.topEnd;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final ea2 getTopStart() {
        return this.topStart;
    }
}
