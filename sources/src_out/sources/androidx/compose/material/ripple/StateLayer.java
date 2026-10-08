package androidx.compose.material.ripple;

import androidx.compose.p000animation.core.Animatable;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import com.google.android.rw0;
import com.google.android.ta2;
import com.google.inputmethod.RippleAlpha;
import com.google.inputmethod.ag3;
import com.google.inputmethod.aq;
import com.google.inputmethod.ei1;
import com.google.inputmethod.gf1;
import com.google.inputmethod.i26;
import com.google.inputmethod.lk4;
import com.google.inputmethod.mk4;
import com.google.inputmethod.qr;
import com.google.inputmethod.tsb;
import com.google.inputmethod.vg3;
import com.google.inputmethod.woa;
import com.google.inputmethod.yf3;
import com.google.inputmethod.yf5;
import com.google.inputmethod.zf3;
import com.google.inputmethod.zf5;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.m;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0015\u001a\u00020\r*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019R \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001cR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010$\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Landroidx/compose/material/ripple/StateLayer;", "", "", "bounded", "Lkotlin/Function0;", "Lcom/google/android/joa;", "rippleAlpha", "<init>", "(ZLkotlin/jvm/functions/Function0;)V", "Lcom/google/android/i26;", "interaction", "Lcom/google/android/ta2;", "scope", "", "c", "(Lcom/google/android/i26;Lcom/google/android/ta2;)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "radius", "Lcom/google/android/ei1;", "color", "b", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FJ)V", "a", "Z", "Lkotlin/jvm/functions/Function0;", "Landroidx/compose/animation/core/Animatable;", "Lcom/google/android/qr;", "Landroidx/compose/animation/core/Animatable;", "animatedAlpha", "", "d", "Ljava/util/List;", "interactions", "e", "Lcom/google/android/i26;", "currentInteraction", "material-ripple"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class StateLayer {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean bounded;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Function0<RippleAlpha> rippleAlpha;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Animatable<Float, qr> animatedAlpha = aq.b(0.0f, 0.0f, 2, null);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<i26> interactions = new ArrayList();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private i26 currentInteraction;

    public StateLayer(boolean z, Function0<RippleAlpha> function0) {
        this.bounded = z;
        this.rippleAlpha = function0;
    }

    public final void b(DrawScope drawScope, float f, long j) throws Throwable {
        long j2;
        float fFloatValue = this.animatedAlpha.m().floatValue();
        if (fFloatValue <= 0.0f) {
            return;
        }
        long jP = ei1.p(j, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
        if (!this.bounded) {
            DrawScope.i1(drawScope, jP, f, 0L, 0.0f, null, null, 0, 124, null);
            return;
        }
        float fL = tsb.l(drawScope.d());
        float fI = tsb.i(drawScope.d());
        int iB = gf1.INSTANCE.b();
        vg3 drawContext = drawScope.getDrawContext();
        long jD = drawContext.d();
        drawContext.b().v();
        try {
            drawContext.getTransform().b(0.0f, 0.0f, fL, fI, iB);
            j2 = jD;
            try {
                DrawScope.i1(drawScope, jP, f, 0L, 0.0f, null, null, 0, 124, null);
                drawContext.b().o();
                drawContext.c(j2);
            } catch (Throwable th) {
                th = th;
                drawContext.b().o();
                drawContext.c(j2);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            j2 = jD;
        }
    }

    public final void c(i26 interaction, ta2 scope) {
        float draggedAlpha;
        if (interaction instanceof yf5) {
            this.interactions.add(interaction);
        } else if (interaction instanceof zf5) {
            this.interactions.remove(((zf5) interaction).getEnter());
        } else if (interaction instanceof lk4) {
            this.interactions.add(interaction);
        } else if (interaction instanceof mk4) {
            this.interactions.remove(((mk4) interaction).getFocus());
        } else if (interaction instanceof zf3) {
            this.interactions.add(interaction);
        } else if (interaction instanceof ag3) {
            this.interactions.remove(((ag3) interaction).getStart());
        } else if (!(interaction instanceof yf3)) {
            return;
        } else {
            this.interactions.remove(((yf3) interaction).getStart());
        }
        i26 i26Var = (i26) m.N0(this.interactions);
        if (Intrinsics.e(this.currentInteraction, i26Var)) {
            return;
        }
        if (i26Var != null) {
            RippleAlpha rippleAlpha = (RippleAlpha) this.rippleAlpha.invoke();
            if (i26Var instanceof yf5) {
                draggedAlpha = rippleAlpha.getHoveredAlpha();
            } else if (i26Var instanceof lk4) {
                draggedAlpha = rippleAlpha.getFocusedAlpha();
            } else {
                draggedAlpha = i26Var instanceof zf3 ? rippleAlpha.getDraggedAlpha() : 0.0f;
            }
            rw0.d(scope, (CoroutineContext) null, (CoroutineStart) null, new StateLayer$handleInteraction$1(this, draggedAlpha, woa.d(i26Var), null), 3, (Object) null);
        } else {
            rw0.d(scope, (CoroutineContext) null, (CoroutineStart) null, new StateLayer$handleInteraction$2(this, woa.e(this.currentInteraction), null), 3, (Object) null);
        }
        this.currentInteraction = i26Var;
    }
}
