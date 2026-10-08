package com.google.inputmethod;

import androidx.compose.p001foundation.e;
import androidx.compose.ui.autofill.c;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010JW\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\r*\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\"\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\r0\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/google/android/h9d;", "Landroidx/compose/foundation/e;", "", "value", "Lcom/google/android/r48;", "interactionSource", "Lcom/google/android/av5;", "indicationNodeFactory", "useLocalIndication", "enabled", "Lcom/google/android/hpa;", "role", "Lkotlin/Function1;", "", "onValueChange", "<init>", "(ZLcom/google/android/r48;Lcom/google/android/av5;ZZLcom/google/android/hpa;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "y4", "(ZLcom/google/android/r48;Lcom/google/android/av5;ZZLcom/google/android/hpa;Lkotlin/jvm/functions/Function1;)V", "Lcom/google/android/nfb;", "E3", "(Lcom/google/android/nfb;)V", "S", "Z", "T", "Lkotlin/jvm/functions/Function1;", "Lkotlin/Function0;", "U", "Lkotlin/jvm/functions/Function0;", "get_onClick", "()Lkotlin/jvm/functions/Function0;", "_onClick", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class h9d extends e {

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private boolean value;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private Function1<? super Boolean, Unit> onValueChange;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private final Function0<Unit> _onClick;

    public /* synthetic */ h9d(boolean z, r48 r48Var, av5 av5Var, boolean z2, boolean z3, hpa hpaVar, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, r48Var, av5Var, z2, z3, hpaVar, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v4(Function1 function1, boolean z) {
        function1.invoke(Boolean.valueOf(!z));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w4(h9d h9dVar) {
        h9dVar.onValueChange.invoke(Boolean.valueOf(!h9dVar.value));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean x4(nfb nfbVar, t94 t94Var) {
        Boolean booleanValue = t94Var.getBooleanValue();
        if (booleanValue == null) {
            return false;
        }
        SemanticsPropertiesKt.E0(nfbVar, i9d.a(booleanValue.booleanValue()));
        return true;
    }

    @Override // androidx.compose.p001foundation.AbstractClickableNode
    public void E3(final nfb nfbVar) {
        SemanticsPropertiesKt.E0(nfbVar, i9d.a(this.value));
        SemanticsPropertiesKt.a0(nfbVar, c.INSTANCE.b());
        t94 t94VarA = u94.a(t94.INSTANCE, this.value);
        if (t94VarA != null) {
            SemanticsPropertiesKt.g0(nfbVar, t94VarA);
        }
        SemanticsPropertiesKt.z(nfbVar, null, new Function1() { // from class: com.google.android.e9d
            public final Object invoke(Object obj) {
                return Boolean.valueOf(h9d.x4(nfbVar, (t94) obj));
            }
        }, 1, null);
    }

    public final void y4(boolean value, r48 interactionSource, av5 indicationNodeFactory, boolean useLocalIndication, boolean enabled, hpa role, Function1<? super Boolean, Unit> onValueChange) {
        if (this.value != value) {
            this.value = value;
            cfb.d(this);
        }
        this.onValueChange = onValueChange;
        super.r4(interactionSource, indicationNodeFactory, useLocalIndication, enabled, null, role, this._onClick);
    }

    private h9d(final boolean z, r48 r48Var, av5 av5Var, boolean z2, boolean z3, hpa hpaVar, final Function1<? super Boolean, Unit> function1) {
        super(r48Var, av5Var, z2, z3, null, hpaVar, new Function0() { // from class: com.google.android.f9d
            public final Object invoke() {
                return h9d.v4(function1, z);
            }
        }, null);
        this.value = z;
        this.onValueChange = function1;
        this._onClick = new Function0() { // from class: com.google.android.g9d
            public final Object invoke() {
                return h9d.w4(this.a);
            }
        };
    }
}
