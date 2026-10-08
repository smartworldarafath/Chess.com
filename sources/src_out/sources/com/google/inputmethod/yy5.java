package com.google.inputmethod;

import androidx.compose.p001foundation.layout.g1;
import androidx.compose.ui.b;
import androidx.compose.ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\b!\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0004R$\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/google/android/yy5;", "Landroidx/compose/ui/b$c;", "Lcom/google/android/fhd;", "<init>", "()V", "Landroidx/compose/foundation/layout/g1;", "ancestorConsumedInsets", "", "v3", "(Landroidx/compose/foundation/layout/g1;)V", "s3", "o3", "(Landroidx/compose/foundation/layout/g1;)Landroidx/compose/foundation/layout/g1;", "V2", "W2", "X2", "r3", "value", "p", "Landroidx/compose/foundation/layout/g1;", "p3", "()Landroidx/compose/foundation/layout/g1;", "q", "q3", "consumedInsets", "", "p1", "()Ljava/lang/Object;", "traverseKey", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class yy5 extends b.c implements fhd {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private g1 ancestorConsumedInsets = rje.a();

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private g1 consumedInsets = rje.a();

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final void s3() throws KotlinNothingValueException {
        ghd.e(this, getTraverseKey(), new Function1() { // from class: com.google.android.wy5
            public final Object invoke(Object obj) {
                return yy5.t3(this.a, (fhd) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public static final TraversableNode$Companion$TraverseDescendantsAction t3(yy5 yy5Var, fhd fhdVar) throws KotlinNothingValueException {
        Intrinsics.h(fhdVar, "null cannot be cast to non-null type androidx.compose.foundation.layout.InsetsConsumingModifierNode");
        ((yy5) fhdVar).v3(yy5Var.consumedInsets);
        return TraversableNode$Companion$TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean u3(yy5 yy5Var, fhd fhdVar) {
        Intrinsics.h(fhdVar, "null cannot be cast to non-null type androidx.compose.foundation.layout.InsetsConsumingModifierNode");
        yy5Var.ancestorConsumedInsets = ((yy5) fhdVar).consumedInsets;
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final void v3(g1 ancestorConsumedInsets) throws KotlinNothingValueException {
        if (Intrinsics.e(this.ancestorConsumedInsets, ancestorConsumedInsets)) {
            return;
        }
        this.ancestorConsumedInsets = ancestorConsumedInsets;
        r3();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.ui.b.c
    public void V2() throws KotlinNothingValueException {
        ghd.c(this, getTraverseKey(), new Function1() { // from class: com.google.android.xy5
            public final Object invoke(Object obj) {
                return Boolean.valueOf(yy5.u3(this.a, (fhd) obj));
            }
        });
        r3();
        super.V2();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.ui.b.c
    public void W2() throws KotlinNothingValueException {
        this.consumedInsets = this.ancestorConsumedInsets;
        s3();
        super.W2();
    }

    @Override // androidx.compose.ui.b.c
    public void X2() {
        super.X2();
        this.ancestorConsumedInsets = rje.a();
    }

    public abstract g1 o3(g1 ancestorConsumedInsets);

    @Override // com.google.inputmethod.fhd
    /* JADX INFO: renamed from: p1 */
    public Object getTraverseKey() {
        return "androidx.compose.foundation.layout.ConsumedInsetsProvider";
    }

    /* JADX INFO: renamed from: p3, reason: from getter */
    public final g1 getAncestorConsumedInsets() {
        return this.ancestorConsumedInsets;
    }

    /* JADX INFO: renamed from: q3, reason: from getter */
    public final g1 getConsumedInsets() {
        return this.consumedInsets;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public void r3() throws KotlinNothingValueException {
        this.consumedInsets = o3(this.ancestorConsumedInsets);
        s3();
    }
}
