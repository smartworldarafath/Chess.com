package com.google.inputmethod;

import androidx.compose.ui.layout.IntrinsicMinMax;
import androidx.compose.ui.layout.IntrinsicWidthHeight;
import androidx.compose.ui.layout.o;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u0004\u0018\u00010\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/google/android/px2;", "Lcom/google/android/dj7;", "Lcom/google/android/f66;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMinMax;", "minMax", "Landroidx/compose/ui/layout/IntrinsicWidthHeight;", "widthHeight", "<init>", "(Lcom/google/android/f66;Landroidx/compose/ui/layout/IntrinsicMinMax;Landroidx/compose/ui/layout/IntrinsicWidthHeight;)V", "Lcom/google/android/kx1;", "constraints", "Landroidx/compose/ui/layout/o;", "r0", "(J)Landroidx/compose/ui/layout/o;", "", "height", "o0", "(I)I", "q0", "width", "d0", "W", "a", "Lcom/google/android/f66;", "getMeasurable", "()Lcom/google/android/f66;", "b", "Landroidx/compose/ui/layout/IntrinsicMinMax;", "c", "Landroidx/compose/ui/layout/IntrinsicWidthHeight;", "", "f", "()Ljava/lang/Object;", "parentData", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class px2 implements dj7 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final f66 measurable;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final IntrinsicMinMax minMax;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final IntrinsicWidthHeight widthHeight;

    public px2(f66 f66Var, IntrinsicMinMax intrinsicMinMax, IntrinsicWidthHeight intrinsicWidthHeight) {
        this.measurable = f66Var;
        this.minMax = intrinsicMinMax;
        this.widthHeight = intrinsicWidthHeight;
    }

    @Override // com.google.inputmethod.f66
    public int W(int width) {
        return this.measurable.W(width);
    }

    @Override // com.google.inputmethod.f66
    public int d0(int width) {
        return this.measurable.d0(width);
    }

    @Override // com.google.inputmethod.f66
    public Object f() {
        return this.measurable.f();
    }

    @Override // com.google.inputmethod.f66
    public int o0(int height) {
        return this.measurable.o0(height);
    }

    @Override // com.google.inputmethod.f66
    public int q0(int height) {
        return this.measurable.q0(height);
    }

    @Override // com.google.inputmethod.dj7
    public o r0(long constraints) {
        if (this.widthHeight == IntrinsicWidthHeight.Width) {
            return new le4(this.minMax == IntrinsicMinMax.Max ? this.measurable.q0(kx1.k(constraints)) : this.measurable.o0(kx1.k(constraints)), kx1.g(constraints) ? kx1.k(constraints) : 32767);
        }
        return new le4(kx1.h(constraints) ? kx1.l(constraints) : 32767, this.minMax == IntrinsicMinMax.Max ? this.measurable.W(kx1.l(constraints)) : this.measurable.d0(kx1.l(constraints)));
    }
}
