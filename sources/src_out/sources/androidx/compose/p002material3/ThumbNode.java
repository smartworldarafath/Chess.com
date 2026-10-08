package androidx.compose.p002material3;

import androidx.compose.p000animation.core.Animatable;
import androidx.compose.ui.b;
import androidx.compose.ui.layout.j;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.node.c;
import com.google.android.rw0;
import com.google.inputmethod.aq;
import com.google.inputmethod.dj7;
import com.google.inputmethod.ff3;
import com.google.inputmethod.fj7;
import com.google.inputmethod.j26;
import com.google.inputmethod.kx1;
import com.google.inputmethod.qr;
import com.google.inputmethod.whc;
import com.google.inputmethod.xa4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0015\u001a\u00020\u0014*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u000eR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010\u001fR$\u00100\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020-\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R$\u00102\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020-\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010/R\u0016\u00105\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00107\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00104R\u0014\u00109\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u0010!¨\u0006:"}, d2 = {"Landroidx/compose/material3/ThumbNode;", "Landroidx/compose/ui/b$c;", "Landroidx/compose/ui/node/c;", "Lcom/google/android/j26;", "interactionSource", "", "checked", "Lcom/google/android/xa4;", "", "animationSpec", "<init>", "(Lcom/google/android/j26;ZLcom/google/android/xa4;)V", "", "V2", "()V", "Landroidx/compose/ui/layout/j;", "Lcom/google/android/dj7;", "measurable", "Lcom/google/android/kx1;", "constraints", "Lcom/google/android/fj7;", "b", "(Landroidx/compose/ui/layout/j;Lcom/google/android/dj7;J)Lcom/google/android/fj7;", "y3", "p", "Lcom/google/android/j26;", "t3", "()Lcom/google/android/j26;", "x3", "(Lcom/google/android/j26;)V", "q", "Z", "s3", "()Z", "w3", "(Z)V", "r", "Lcom/google/android/xa4;", "r3", "()Lcom/google/android/xa4;", "v3", "(Lcom/google/android/xa4;)V", "s", "isPressed", "Landroidx/compose/animation/core/Animatable;", "Lcom/google/android/qr;", "t", "Landroidx/compose/animation/core/Animatable;", "offsetAnim", "u", "sizeAnim", "v", "F", "initialOffset", "w", "initialSize", "Q2", "shouldAutoInvalidate", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class ThumbNode extends b.c implements c {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private j26 interactionSource;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private boolean checked;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private xa4<Float> animationSpec;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private boolean isPressed;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private Animatable<Float, qr> offsetAnim;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private Animatable<Float, qr> sizeAnim;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private float initialOffset = Float.NaN;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private float initialSize = Float.NaN;

    public ThumbNode(j26 j26Var, boolean z, xa4<Float> xa4Var) {
        this.interactionSource = j26Var;
        this.checked = z;
        this.animationSpec = xa4Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u3(o oVar, ThumbNode thumbNode, float f, o.a aVar) {
        Animatable<Float, qr> animatable = thumbNode.offsetAnim;
        o.a.L(aVar, oVar, animatable != null ? (int) animatable.m().floatValue() : (int) f, 0, 0.0f, 4, null);
        return Unit.a;
    }

    @Override // androidx.compose.ui.b.c
    /* JADX INFO: renamed from: Q2 */
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.b.c
    public void V2() {
        rw0.d(L2(), (CoroutineContext) null, (CoroutineStart) null, new C0208ThumbNode$onAttach$1(this, null), 3, (Object) null);
    }

    @Override // androidx.compose.ui.node.c
    public fj7 b(j jVar, dj7 dj7Var, long j) {
        float fK;
        boolean z = (dj7Var.W(kx1.l(j)) == 0 || dj7Var.q0(kx1.k(j)) == 0) ? false : true;
        if (this.isPressed) {
            fK = whc.a.n();
        } else {
            fK = (z || this.checked) ? t1.k() : t1.l();
        }
        float fX2 = jVar.x2(fK);
        Animatable<Float, qr> animatable = this.sizeAnim;
        int iFloatValue = (int) (animatable != null ? animatable.m().floatValue() : fX2);
        final o oVarR0 = dj7Var.r0(kx1.INSTANCE.c(iFloatValue, iFloatValue));
        final float fX3 = jVar.x2(ff3.i(ff3.i(t1.d - jVar.P0(fX2)) / 2.0f));
        float fX4 = jVar.x2(ff3.i(ff3.i(t1.c - t1.k()) - t1.e));
        boolean z2 = this.isPressed;
        if (z2 && this.checked) {
            fX3 = fX4 - jVar.x2(whc.a.u());
        } else if (z2 && !this.checked) {
            fX3 = jVar.x2(whc.a.u());
        } else if (this.checked) {
            fX3 = fX4;
        }
        Animatable<Float, qr> animatable2 = this.sizeAnim;
        if (!Intrinsics.c(animatable2 != null ? animatable2.k() : null, fX2)) {
            rw0.d(L2(), (CoroutineContext) null, (CoroutineStart) null, new C0206ThumbNode$measure$1(this, fX2, null), 3, (Object) null);
        }
        Animatable<Float, qr> animatable3 = this.offsetAnim;
        if (!Intrinsics.c(animatable3 != null ? animatable3.k() : null, fX3)) {
            rw0.d(L2(), (CoroutineContext) null, (CoroutineStart) null, new C0207ThumbNode$measure$2(this, fX3, null), 3, (Object) null);
        }
        if (Float.isNaN(this.initialSize) && Float.isNaN(this.initialOffset)) {
            this.initialSize = fX2;
            this.initialOffset = fX3;
        }
        return j.Q1(jVar, iFloatValue, iFloatValue, null, new Function1() { // from class: androidx.compose.material3.d2
            public final Object invoke(Object obj) {
                return ThumbNode.u3(oVarR0, this, fX3, (o.a) obj);
            }
        }, 4, null);
    }

    public final xa4<Float> r3() {
        return this.animationSpec;
    }

    /* JADX INFO: renamed from: s3, reason: from getter */
    public final boolean getChecked() {
        return this.checked;
    }

    /* JADX INFO: renamed from: t3, reason: from getter */
    public final j26 getInteractionSource() {
        return this.interactionSource;
    }

    public final void v3(xa4<Float> xa4Var) {
        this.animationSpec = xa4Var;
    }

    public final void w3(boolean z) {
        this.checked = z;
    }

    public final void x3(j26 j26Var) {
        this.interactionSource = j26Var;
    }

    public final void y3() {
        if (this.sizeAnim == null && !Float.isNaN(this.initialSize)) {
            this.sizeAnim = aq.b(this.initialSize, 0.0f, 2, null);
        }
        if (this.offsetAnim != null || Float.isNaN(this.initialOffset)) {
            return;
        }
        this.offsetAnim = aq.b(this.initialOffset, 0.0f, 2, null);
    }
}
