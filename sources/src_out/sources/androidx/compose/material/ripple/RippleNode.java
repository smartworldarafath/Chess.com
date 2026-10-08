package androidx.compose.material.ripple;

import androidx.compose.ui.b;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import com.google.android.rw0;
import com.google.android.ta2;
import com.google.inputmethod.RippleAlpha;
import com.google.inputmethod.bs1;
import com.google.inputmethod.e58;
import com.google.inputmethod.f43;
import com.google.inputmethod.fn6;
import com.google.inputmethod.fz1;
import com.google.inputmethod.i26;
import com.google.inputmethod.j26;
import com.google.inputmethod.koa;
import com.google.inputmethod.r16;
import com.google.inputmethod.ri1;
import com.google.inputmethod.tsb;
import com.google.inputmethod.y23;
import com.google.inputmethod.yg3;
import com.google.inputmethod.zg3;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b!\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B5\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0014H\u0016¢\u0006\u0004\b!\u0010\"J\u0013\u0010$\u001a\u00020\u0014*\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u0013\u0010'\u001a\u00020\u0014*\u00020&H&¢\u0006\u0004\b'\u0010(J'\u0010-\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020)2\u0006\u0010\u001e\u001a\u00020*2\u0006\u0010,\u001a\u00020+H&¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020)H&¢\u0006\u0004\b/\u00100R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u0010\b\u001a\u00020\u00078\u0004X\u0084\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010A\u001a\u00020\u00078\u0006X\u0086D¢\u0006\f\n\u0004\b?\u00104\u001a\u0004\b@\u00106R\u0018\u0010E\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\"\u0010,\u001a\u00020+8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bF\u00108\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR$\u0010P\u001a\u00020*2\u0006\u0010K\u001a\u00020*8\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0016\u0010R\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u00104R\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00120S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0011\u0010Y\u001a\u00020W8F¢\u0006\u0006\u001a\u0004\bX\u0010O¨\u0006Z"}, d2 = {"Landroidx/compose/material/ripple/RippleNode;", "Landroidx/compose/ui/b$c;", "Lcom/google/android/bs1;", "Lcom/google/android/yg3;", "Lcom/google/android/fn6;", "Lcom/google/android/j26;", "interactionSource", "", "bounded", "Lcom/google/android/ff3;", "radius", "Lcom/google/android/ri1;", "color", "Lkotlin/Function0;", "Lcom/google/android/joa;", "rippleAlpha", "<init>", "(Lcom/google/android/j26;ZFLcom/google/android/ri1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/foundation/interaction/a;", "pressInteraction", "", "y3", "(Landroidx/compose/foundation/interaction/a;)V", "Lcom/google/android/i26;", "interaction", "Lcom/google/android/ta2;", "scope", "A3", "(Lcom/google/android/i26;Lcom/google/android/ta2;)V", "Lcom/google/android/q16;", "size", "f", "(J)V", "V2", "()V", "Lcom/google/android/fz1;", "j", "(Lcom/google/android/fz1;)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "s3", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "Landroidx/compose/foundation/interaction/a$b;", "Lcom/google/android/tsb;", "", "targetRadius", "r3", "(Landroidx/compose/foundation/interaction/a$b;JF)V", "z3", "(Landroidx/compose/foundation/interaction/a$b;)V", "p", "Lcom/google/android/j26;", "q", "Z", "t3", "()Z", "r", "F", "s", "Lcom/google/android/ri1;", "t", "Lkotlin/jvm/functions/Function0;", "u3", "()Lkotlin/jvm/functions/Function0;", "u", "Q2", "shouldAutoInvalidate", "Landroidx/compose/material/ripple/StateLayer;", "v", "Landroidx/compose/material/ripple/StateLayer;", "stateLayer", "w", "x3", "()F", "setTargetRadius", "(F)V", "value", "x", "J", "w3", "()J", "rippleSize", "y", "hasValidSize", "Lcom/google/android/e58;", "z", "Lcom/google/android/e58;", "pendingInteractions", "Lcom/google/android/ei1;", "v3", "rippleColor", "material-ripple"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class RippleNode extends b.c implements bs1, yg3, fn6 {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final j26 interactionSource;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final boolean bounded;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final float radius;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final ri1 color;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final Function0<RippleAlpha> rippleAlpha;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private StateLayer stateLayer;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private float targetRadius;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private long rippleSize;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private boolean hasValidSize;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final e58<androidx.compose.p001foundation.interaction.a> pendingInteractions;

    public /* synthetic */ RippleNode(j26 j26Var, boolean z, float f, ri1 ri1Var, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(j26Var, z, f, ri1Var, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A3(i26 interaction, ta2 scope) {
        StateLayer stateLayer = this.stateLayer;
        if (stateLayer == null) {
            stateLayer = new StateLayer(this.bounded, this.rippleAlpha);
            zg3.a(this);
            this.stateLayer = stateLayer;
        }
        stateLayer.c(interaction, scope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y3(androidx.compose.p001foundation.interaction.a pressInteraction) {
        if (pressInteraction instanceof androidx.compose.foundation.interaction.a.b) {
            r3((androidx.compose.foundation.interaction.a.b) pressInteraction, this.rippleSize, this.targetRadius);
        } else if (pressInteraction instanceof androidx.compose.foundation.interaction.a.c) {
            z3(((androidx.compose.foundation.interaction.a.c) pressInteraction).getPress());
        } else if (pressInteraction instanceof androidx.compose.p001foundation.interaction.a.C0016a) {
            z3(((androidx.compose.p001foundation.interaction.a.C0016a) pressInteraction).getPress());
        }
    }

    @Override // androidx.compose.ui.b.c
    /* JADX INFO: renamed from: Q2, reason: from getter */
    public final boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.ui.b.c
    public void V2() {
        rw0.d(L2(), (CoroutineContext) null, (CoroutineStart) null, new RippleNode$onAttach$1(this, null), 3, (Object) null);
    }

    @Override // com.google.inputmethod.fn6, com.google.inputmethod.kj7
    public void f(long size) {
        this.hasValidSize = true;
        f43 f43VarM = y23.m(this);
        this.rippleSize = r16.e(size);
        this.targetRadius = Float.isNaN(this.radius) ? koa.a(f43VarM, this.bounded, this.rippleSize) : f43VarM.x2(this.radius);
        e58<androidx.compose.p001foundation.interaction.a> e58Var = this.pendingInteractions;
        Object[] objArr = e58Var.content;
        int i = e58Var._size;
        for (int i2 = 0; i2 < i; i2++) {
            y3((androidx.compose.p001foundation.interaction.a) objArr[i2]);
        }
        this.pendingInteractions.u();
    }

    @Override // com.google.inputmethod.yg3
    public void j(fz1 fz1Var) throws Throwable {
        fz1Var.j1();
        StateLayer stateLayer = this.stateLayer;
        if (stateLayer != null) {
            stateLayer.b(fz1Var, this.targetRadius, v3());
        }
        s3(fz1Var);
    }

    public abstract void r3(androidx.compose.foundation.interaction.a.b interaction, long size, float targetRadius);

    public abstract void s3(DrawScope drawScope);

    /* JADX INFO: renamed from: t3, reason: from getter */
    protected final boolean getBounded() {
        return this.bounded;
    }

    protected final Function0<RippleAlpha> u3() {
        return this.rippleAlpha;
    }

    public final long v3() {
        return this.color.a();
    }

    /* JADX INFO: renamed from: w3, reason: from getter */
    protected final long getRippleSize() {
        return this.rippleSize;
    }

    /* JADX INFO: renamed from: x3, reason: from getter */
    protected final float getTargetRadius() {
        return this.targetRadius;
    }

    public abstract void z3(androidx.compose.foundation.interaction.a.b interaction);

    private RippleNode(j26 j26Var, boolean z, float f, ri1 ri1Var, Function0<RippleAlpha> function0) {
        this.interactionSource = j26Var;
        this.bounded = z;
        this.radius = f;
        this.color = ri1Var;
        this.rippleAlpha = function0;
        this.rippleSize = tsb.INSTANCE.b();
        this.pendingInteractions = new e58<>(0, 1, null);
    }
}
