package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR&\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/google/android/zy6;", "Lcom/google/android/zq6;", "Lkotlin/Function2;", "Lcom/google/android/f43;", "Lcom/google/android/kx1;", "Lcom/google/android/az6;", "calculation", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "density", "constraints", "a", "(Lcom/google/android/f43;J)Lcom/google/android/az6;", "Lkotlin/jvm/functions/Function2;", "b", "J", "cachedConstraints", "", "c", "F", "cachedDensity", "d", "Lcom/google/android/az6;", "cachedSizes", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class zy6 implements zq6 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Function2<f43, kx1, az6> calculation;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private long cachedConstraints = nx1.b(0, 0, 0, 0, 15, null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private float cachedDensity;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private az6 cachedSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public zy6(Function2<? super f43, ? super kx1, az6> function2) {
        this.calculation = function2;
    }

    @Override // com.google.inputmethod.zq6
    public az6 a(f43 density, long constraints) {
        if (this.cachedSizes != null && kx1.f(this.cachedConstraints, constraints) && this.cachedDensity == density.getDensity()) {
            az6 az6Var = this.cachedSizes;
            Intrinsics.g(az6Var);
            return az6Var;
        }
        this.cachedConstraints = constraints;
        this.cachedDensity = density.getDensity();
        az6 az6Var2 = (az6) this.calculation.invoke(density, kx1.a(constraints));
        this.cachedSizes = az6Var2;
        return az6Var2;
    }
}
