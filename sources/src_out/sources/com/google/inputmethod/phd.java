package com.google.inputmethod;

import androidx.compose.p001foundation.e;
import androidx.compose.ui.autofill.c;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.state.ToggleableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011JQ\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u000e*\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/google/android/phd;", "Landroidx/compose/foundation/e;", "Landroidx/compose/ui/state/ToggleableState;", "state", "Lcom/google/android/r48;", "interactionSource", "Lcom/google/android/av5;", "indicationNodeFactory", "", "useLocalIndication", "enabled", "Lcom/google/android/hpa;", "role", "Lkotlin/Function0;", "", "onClick", "<init>", "(Landroidx/compose/ui/state/ToggleableState;Lcom/google/android/r48;Lcom/google/android/av5;ZZLcom/google/android/hpa;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "u4", "(Landroidx/compose/ui/state/ToggleableState;Lcom/google/android/r48;Lcom/google/android/av5;ZZLcom/google/android/hpa;Lkotlin/jvm/functions/Function0;)V", "Lcom/google/android/nfb;", "E3", "(Lcom/google/android/nfb;)V", "S", "Landroidx/compose/ui/state/ToggleableState;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class phd extends e {

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private ToggleableState state;

    public /* synthetic */ phd(ToggleableState toggleableState, r48 r48Var, av5 av5Var, boolean z, boolean z2, hpa hpaVar, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(toggleableState, r48Var, av5Var, z, z2, hpaVar, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean t4(nfb nfbVar, t94 t94Var) {
        Boolean booleanValue = t94Var.getBooleanValue();
        if (booleanValue == null) {
            return false;
        }
        SemanticsPropertiesKt.E0(nfbVar, i9d.a(booleanValue.booleanValue()));
        return true;
    }

    @Override // androidx.compose.p001foundation.AbstractClickableNode
    public void E3(final nfb nfbVar) {
        SemanticsPropertiesKt.E0(nfbVar, this.state);
        SemanticsPropertiesKt.a0(nfbVar, c.INSTANCE.b());
        t94 t94VarA = u94.a(t94.INSTANCE, this.state != ToggleableState.Indeterminate);
        if (t94VarA != null) {
            SemanticsPropertiesKt.g0(nfbVar, t94VarA);
        }
        SemanticsPropertiesKt.z(nfbVar, null, new Function1() { // from class: com.google.android.ohd
            public final Object invoke(Object obj) {
                return Boolean.valueOf(phd.t4(nfbVar, (t94) obj));
            }
        }, 1, null);
    }

    public final void u4(ToggleableState state, r48 interactionSource, av5 indicationNodeFactory, boolean useLocalIndication, boolean enabled, hpa role, Function0<Unit> onClick) {
        if (this.state != state) {
            this.state = state;
            cfb.d(this);
        }
        super.r4(interactionSource, indicationNodeFactory, useLocalIndication, enabled, null, role, onClick);
    }

    private phd(ToggleableState toggleableState, r48 r48Var, av5 av5Var, boolean z, boolean z2, hpa hpaVar, Function0<Unit> function0) {
        super(r48Var, av5Var, z, z2, null, hpaVar, function0, null);
        this.state = toggleableState;
    }
}
