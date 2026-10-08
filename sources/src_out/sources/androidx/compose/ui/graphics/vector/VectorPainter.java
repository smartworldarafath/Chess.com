package androidx.compose.ui.graphics.vector;

import androidx.compose.p004runtime.p0;
import androidx.compose.p004runtime.s0;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.h;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.inputmethod.o58;
import com.google.inputmethod.tsb;
import com.google.inputmethod.vg3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012R+\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR+\u0010!\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010'\u001a\u00020\"8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R+\u0010-\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00078B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010\u0016\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0016\u00100\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00103\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R(\u00109\u001a\u0004\u0018\u00010\u000f2\b\u00104\u001a\u0004\u0018\u00010\u000f8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b5\u00106\"\u0004\b7\u00108R$\u0010<\u001a\u00020\u00132\u0006\u00104\u001a\u00020\u00138@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b:\u0010\u0018\"\u0004\b;\u0010\u001aR$\u0010B\u001a\u00020=2\u0006\u00104\u001a\u00020=8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u0018¨\u0006D"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorPainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "Landroidx/compose/ui/graphics/vector/GroupComponent;", "root", "<init>", "(Landroidx/compose/ui/graphics/vector/GroupComponent;)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "n", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "", "alpha", "", "a", "(F)Z", "Landroidx/compose/ui/graphics/h;", "colorFilter", "b", "(Landroidx/compose/ui/graphics/h;)Z", "Lcom/google/android/tsb;", "<set-?>", "h", "Lcom/google/android/o58;", "r", "()J", "w", "(J)V", "size", "i", "p", "()Z", "s", "(Z)V", "autoMirror", "Landroidx/compose/ui/graphics/vector/VectorComponent;", "j", "Landroidx/compose/ui/graphics/vector/VectorComponent;", "getVector$ui", "()Landroidx/compose/ui/graphics/vector/VectorComponent;", "vector", "k", "q", "()Lkotlin/Unit;", "t", "(Lkotlin/Unit;)V", "drawInvalidation", "l", "F", "currentAlpha", "m", "Landroidx/compose/ui/graphics/h;", "currentColorFilter", "value", "getIntrinsicColorFilter$ui", "()Landroidx/compose/ui/graphics/h;", "u", "(Landroidx/compose/ui/graphics/h;)V", "intrinsicColorFilter", "getViewportSize-NH-jbRc$ui", "x", "viewportSize", "", "getName$ui", "()Ljava/lang/String;", "v", "(Ljava/lang/String;)V", "name", "intrinsicSize", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VectorPainter extends Painter {
    public static final int n = 8;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final o58 size;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final o58 autoMirror;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final VectorComponent vector;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final o58 drawInvalidation;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private float currentAlpha;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private h currentColorFilter;

    /* JADX WARN: Illegal instructions before constructor call */
    public VectorPainter() {
        GroupComponent groupComponent = null;
        this(groupComponent, 1, groupComponent);
    }

    private final Unit q() {
        this.drawInvalidation.getValue();
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(Unit unit) {
        this.drawInvalidation.setValue(unit);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean a(float alpha) {
        this.currentAlpha = alpha;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean b(h colorFilter) {
        this.currentColorFilter = colorFilter;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* JADX INFO: renamed from: l */
    public long getIntrinsicSize() {
        return r();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected void n(DrawScope drawScope) {
        VectorComponent vectorComponent = this.vector;
        h hVarK = this.currentColorFilter;
        if (hVarK == null) {
            hVarK = vectorComponent.k();
        }
        if (p() && drawScope.getLayoutDirection() == LayoutDirection.Rtl) {
            long jA = drawScope.A();
            vg3 drawContext = drawScope.getDrawContext();
            long jD = drawContext.d();
            drawContext.b().v();
            try {
                drawContext.getTransform().g(-1.0f, 1.0f, jA);
                vectorComponent.i(drawScope, this.currentAlpha, hVarK);
                drawContext.b().o();
                drawContext.c(jD);
            } catch (Throwable th) {
                drawContext.b().o();
                drawContext.c(jD);
                throw th;
            }
        } else {
            vectorComponent.i(drawScope, this.currentAlpha, hVarK);
        }
        q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean p() {
        return ((Boolean) this.autoMirror.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long r() {
        return ((tsb) this.size.getValue()).getPackedValue();
    }

    public final void s(boolean z) {
        this.autoMirror.setValue(Boolean.valueOf(z));
    }

    public final void u(h hVar) {
        this.vector.n(hVar);
    }

    public final void v(String str) {
        this.vector.p(str);
    }

    public final void w(long j) {
        this.size.setValue(tsb.c(j));
    }

    public final void x(long j) {
        this.vector.q(j);
    }

    public VectorPainter(GroupComponent groupComponent) {
        this.size = s0.e(tsb.c(tsb.INSTANCE.b()), null, 2, null);
        this.autoMirror = s0.e(Boolean.FALSE, null, 2, null);
        VectorComponent vectorComponent = new VectorComponent(groupComponent);
        vectorComponent.o(new Function0<Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorPainter$vector$1$1
            {
                super(0);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                m13invoke();
                return Unit.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m13invoke() {
                this.this$0.t(Unit.a);
            }
        });
        this.vector = vectorComponent;
        this.drawInvalidation = p0.i(Unit.a, p0.k());
        this.currentAlpha = 1.0f;
    }

    public /* synthetic */ VectorPainter(GroupComponent groupComponent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new GroupComponent() : groupComponent);
    }
}
