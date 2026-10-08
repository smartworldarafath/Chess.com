package androidx.compose.material.ripple;

import android.view.View;
import androidx.compose.material.ripple.a;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.sh7;
import com.google.inputmethod.RippleAlpha;
import com.google.inputmethod.cpa;
import com.google.inputmethod.cs1;
import com.google.inputmethod.j26;
import com.google.inputmethod.noa;
import com.google.inputmethod.qoa;
import com.google.inputmethod.ri1;
import com.google.inputmethod.toa;
import com.google.inputmethod.w41;
import com.google.inputmethod.xi;
import com.google.inputmethod.zg3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0014H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0014H\u0016¢\u0006\u0004\b#\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R(\u0010-\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010'8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006."}, d2 = {"Landroidx/compose/material/ripple/a;", "Landroidx/compose/material/ripple/RippleNode;", "Lcom/google/android/qoa;", "Lcom/google/android/j26;", "interactionSource", "", "bounded", "Lcom/google/android/ff3;", "radius", "Lcom/google/android/ri1;", "color", "Lkotlin/Function0;", "Lcom/google/android/joa;", "rippleAlpha", "<init>", "(Lcom/google/android/j26;ZFLcom/google/android/ri1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lcom/google/android/noa;", "D3", "()Lcom/google/android/noa;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "s3", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "Landroidx/compose/foundation/interaction/a$b;", "interaction", "Lcom/google/android/tsb;", "size", "", "targetRadius", "r3", "(Landroidx/compose/foundation/interaction/a$b;JF)V", "z3", "(Landroidx/compose/foundation/interaction/a$b;)V", "W2", "()V", "q2", "A", "Lcom/google/android/noa;", "rippleContainer", "Lcom/google/android/toa;", "value", "B", "Lcom/google/android/toa;", "E3", "(Lcom/google/android/toa;)V", "rippleHostView", "material-ripple"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a extends RippleNode implements qoa {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private noa rippleContainer;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private toa rippleHostView;

    public /* synthetic */ a(j26 j26Var, boolean z, float f, ri1 ri1Var, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(j26Var, z, f, ri1Var, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C3(a aVar) {
        zg3.a(aVar);
        return Unit.a;
    }

    private final noa D3() {
        noa noaVar = this.rippleContainer;
        if (noaVar != null) {
            Intrinsics.g(noaVar);
            return noaVar;
        }
        noa noaVarC = cpa.c(cpa.e((View) cs1.a(this, AndroidCompositionLocals_androidKt.g())));
        this.rippleContainer = noaVarC;
        Intrinsics.g(noaVarC);
        return noaVarC;
    }

    private final void E3(toa toaVar) {
        this.rippleHostView = toaVar;
        zg3.a(this);
    }

    @Override // androidx.compose.ui.b.c
    public void W2() {
        noa noaVar = this.rippleContainer;
        if (noaVar != null) {
            noaVar.a(this);
        }
    }

    @Override // com.google.inputmethod.qoa
    public void q2() {
        E3(null);
    }

    @Override // androidx.compose.material.ripple.RippleNode
    public void r3(androidx.compose.foundation.interaction.a.b interaction, long size, float targetRadius) {
        toa toaVarB = D3().b(this);
        toaVarB.b(interaction, getBounded(), size, sh7.d(targetRadius), v3(), ((RippleAlpha) u3().invoke()).getPressedAlpha(), new Function0() { // from class: com.google.android.bn
            public final Object invoke() {
                return a.C3(this.a);
            }
        });
        E3(toaVarB);
    }

    @Override // androidx.compose.material.ripple.RippleNode
    public void s3(DrawScope drawScope) {
        w41 w41VarB = drawScope.getDrawContext().b();
        toa toaVar = this.rippleHostView;
        if (toaVar != null) {
            toaVar.f(getRippleSize(), sh7.d(getTargetRadius()), v3(), ((RippleAlpha) u3().invoke()).getPressedAlpha());
            toaVar.draw(xi.d(w41VarB));
        }
    }

    @Override // androidx.compose.material.ripple.RippleNode
    public void z3(androidx.compose.foundation.interaction.a.b interaction) {
        toa toaVar = this.rippleHostView;
        if (toaVar != null) {
            toaVar.e();
        }
    }

    private a(j26 j26Var, boolean z, float f, ri1 ri1Var, Function0<RippleAlpha> function0) {
        super(j26Var, z, f, ri1Var, function0, null);
    }
}
