package com.google.inputmethod;

import androidx.compose.p004runtime.s0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR+\u0010\u000f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00028V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\b\u0010\r\"\u0004\b\u000b\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/google/android/ky5;", "Lcom/google/android/jy5;", "Lcom/google/android/hy5;", "initialInputMode", "Lcom/google/android/iy5;", "onRequestInputModeChange", "<init>", "(ILcom/google/android/iy5;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "Lcom/google/android/iy5;", "<set-?>", "b", "Lcom/google/android/o58;", "()I", "(I)V", "inputMode", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ky5 implements jy5 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final iy5 onRequestInputModeChange;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final o58 inputMode;

    public /* synthetic */ ky5(int i, iy5 iy5Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, iy5Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.inputmethod.jy5
    public int a() {
        return ((hy5) this.inputMode.getValue()).getValue();
    }

    public void b(int i) {
        this.inputMode.setValue(hy5.c(i));
    }

    private ky5(int i, iy5 iy5Var) {
        this.onRequestInputModeChange = iy5Var;
        this.inputMode = s0.e(hy5.c(i), null, 2, null);
    }
}
