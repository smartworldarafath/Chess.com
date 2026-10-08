package com.google.inputmethod;

import androidx.compose.p001foundation.e;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010JQ\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\r*\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/google/android/idb;", "Landroidx/compose/foundation/e;", "", "selected", "Lcom/google/android/r48;", "interactionSource", "Lcom/google/android/av5;", "indicationNodeFactory", "useLocalIndication", "enabled", "Lcom/google/android/hpa;", "role", "Lkotlin/Function0;", "", "onClick", "<init>", "(ZLcom/google/android/r48;Lcom/google/android/av5;ZZLcom/google/android/hpa;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "s4", "(ZLcom/google/android/r48;Lcom/google/android/av5;ZZLcom/google/android/hpa;Lkotlin/jvm/functions/Function0;)V", "Lcom/google/android/nfb;", "E3", "(Lcom/google/android/nfb;)V", "S", "Z", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class idb extends e {

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private boolean selected;

    public /* synthetic */ idb(boolean z, r48 r48Var, av5 av5Var, boolean z2, boolean z3, hpa hpaVar, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, r48Var, av5Var, z2, z3, hpaVar, function0);
    }

    @Override // androidx.compose.p001foundation.AbstractClickableNode
    public void E3(nfb nfbVar) {
        SemanticsPropertiesKt.q0(nfbVar, this.selected);
    }

    public final void s4(boolean selected, r48 interactionSource, av5 indicationNodeFactory, boolean useLocalIndication, boolean enabled, hpa role, Function0<Unit> onClick) {
        if (this.selected != selected) {
            this.selected = selected;
            cfb.d(this);
        }
        super.r4(interactionSource, indicationNodeFactory, useLocalIndication, enabled, null, role, onClick);
    }

    private idb(boolean z, r48 r48Var, av5 av5Var, boolean z2, boolean z3, hpa hpaVar, Function0<Unit> function0) {
        super(r48Var, av5Var, z2, z3, null, hpaVar, function0, null);
        this.selected = z;
    }
}
