package androidx.compose.p001foundation;

import androidx.compose.ui.b;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.n;
import androidx.compose.ui.graphics.o;
import androidx.compose.ui.graphics.r;
import androidx.compose.ui.node.l;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.inputmethod.bfb;
import com.google.inputmethod.ei1;
import com.google.inputmethod.fz1;
import com.google.inputmethod.nfb;
import com.google.inputmethod.on8;
import com.google.inputmethod.qu0;
import com.google.inputmethod.tsb;
import com.google.inputmethod.xkb;
import com.google.inputmethod.yg3;
import com.google.inputmethod.zg3;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B)\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u0010*\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0012J\u000f\u0010\u0018\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001b\u001a\u00020\u0010*\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001a\u0010:\u001a\u0002058\u0016X\u0096D¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001a\u0010=\u001a\u0002058\u0016X\u0096D¢\u0006\f\n\u0004\b;\u00107\u001a\u0004\b<\u00109R\u0016\u0010@\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010\u001eR\u0018\u0010D\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010G\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010I\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u00100R\u0018\u0010K\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010F¨\u0006L"}, d2 = {"Landroidx/compose/foundation/c;", "Lcom/google/android/yg3;", "Landroidx/compose/ui/b$c;", "Lcom/google/android/on8;", "Lcom/google/android/bfb;", "Lcom/google/android/ei1;", "color", "Lcom/google/android/qu0;", "brush", "", "alpha", "Lcom/google/android/xkb;", "shape", "<init>", "(JLcom/google/android/qu0;FLcom/google/android/xkb;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lcom/google/android/fz1;", "", "o3", "(Lcom/google/android/fz1;)V", "n3", "Landroidx/compose/ui/graphics/n;", "p3", "(Lcom/google/android/fz1;)Landroidx/compose/ui/graphics/n;", "j", "M1", "()V", "Lcom/google/android/nfb;", "H0", "(Lcom/google/android/nfb;)V", "p", "J", "getColor-0d7_KjU", "()J", "n", "(J)V", "q", "Lcom/google/android/qu0;", "getBrush", "()Lcom/google/android/qu0;", "Z1", "(Lcom/google/android/qu0;)V", "r", "F", "getAlpha", "()F", "c", "(F)V", "s", "Lcom/google/android/xkb;", "r3", "()Lcom/google/android/xkb;", "R0", "(Lcom/google/android/xkb;)V", "", "t", "Z", "Q2", "()Z", "shouldAutoInvalidate", "u", "o1", "isImportantForBounds", "Lcom/google/android/tsb;", "v", "lastSize", "Landroidx/compose/ui/unit/LayoutDirection;", "w", "Landroidx/compose/ui/unit/LayoutDirection;", "lastLayoutDirection", "x", "Landroidx/compose/ui/graphics/n;", "lastOutline", "y", "lastShape", "z", "tmpOutline", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class c extends b.c implements yg3, on8, bfb {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private long color;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private qu0 brush;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private float alpha;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private xkb shape;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final boolean isImportantForBounds;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private long lastSize;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private LayoutDirection lastLayoutDirection;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private n lastOutline;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private xkb lastShape;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private n tmpOutline;

    public /* synthetic */ c(long j, qu0 qu0Var, float f, xkb xkbVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, qu0Var, f, xkbVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void n3(fz1 fz1Var) throws NoWhenBranchMatchedException {
        fz1 fz1Var2;
        n nVarP3 = p3(fz1Var);
        if (ei1.r(this.color, ei1.INSTANCE.i())) {
            fz1Var2 = fz1Var;
        } else {
            fz1Var2 = fz1Var;
            o.e(fz1Var2, nVarP3, this.color, 0.0f, null, null, 0, 60, null);
        }
        qu0 qu0Var = this.brush;
        if (qu0Var != null) {
            o.c(fz1Var2, nVarP3, qu0Var, this.alpha, null, null, 0, 56, null);
        }
    }

    private final void o3(fz1 fz1Var) {
        if (!ei1.r(this.color, ei1.INSTANCE.i())) {
            DrawScope.T0(fz1Var, this.color, 0L, 0L, 0.0f, null, null, 0, 126, null);
        }
        qu0 qu0Var = this.brush;
        if (qu0Var != null) {
            DrawScope.U0(fz1Var, qu0Var, 0L, 0L, this.alpha, null, null, 0, 118, null);
        }
    }

    private final n p3(final fz1 fz1Var) {
        n nVar;
        if (tsb.h(fz1Var.d(), this.lastSize) && fz1Var.getLayoutDirection() == this.lastLayoutDirection && Intrinsics.e(this.lastShape, this.shape)) {
            nVar = this.lastOutline;
            Intrinsics.g(nVar);
        } else {
            l.a(this, new Function0() { // from class: androidx.compose.foundation.b
                public final Object invoke() {
                    return c.q3(this.a, fz1Var);
                }
            });
            nVar = this.tmpOutline;
            this.tmpOutline = null;
        }
        this.lastOutline = nVar;
        this.lastSize = fz1Var.d();
        this.lastLayoutDirection = fz1Var.getLayoutDirection();
        this.lastShape = this.shape;
        Intrinsics.g(nVar);
        return nVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q3(c cVar, fz1 fz1Var) {
        cVar.tmpOutline = cVar.shape.mo5createOutlinePq9zytI(fz1Var.d(), fz1Var.getLayoutDirection(), fz1Var);
        return Unit.a;
    }

    @Override // com.google.inputmethod.bfb
    public void H0(nfb nfbVar) {
        SemanticsPropertiesKt.t0(nfbVar, this.shape);
    }

    @Override // com.google.inputmethod.on8
    public void M1() {
        this.lastSize = tsb.INSTANCE.a();
        this.lastLayoutDirection = null;
        this.lastOutline = null;
        this.lastShape = null;
        zg3.a(this);
    }

    @Override // androidx.compose.ui.b.c
    /* JADX INFO: renamed from: Q2, reason: from getter */
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    public final void R0(xkb xkbVar) {
        this.shape = xkbVar;
    }

    public final void Z1(qu0 qu0Var) {
        this.brush = qu0Var;
    }

    public final void c(float f) {
        this.alpha = f;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // com.google.inputmethod.yg3
    public void j(fz1 fz1Var) throws NoWhenBranchMatchedException {
        if (this.shape == r.a()) {
            o3(fz1Var);
        } else {
            n3(fz1Var);
        }
        fz1Var.j1();
    }

    public final void n(long j) {
        this.color = j;
    }

    @Override // com.google.inputmethod.bfb
    /* JADX INFO: renamed from: o1, reason: from getter */
    public boolean getIsImportantForBounds() {
        return this.isImportantForBounds;
    }

    /* JADX INFO: renamed from: r3, reason: from getter */
    public final xkb getShape() {
        return this.shape;
    }

    private c(long j, qu0 qu0Var, float f, xkb xkbVar) {
        this.color = j;
        this.brush = qu0Var;
        this.alpha = f;
        this.shape = xkbVar;
        this.lastSize = tsb.INSTANCE.a();
    }
}
