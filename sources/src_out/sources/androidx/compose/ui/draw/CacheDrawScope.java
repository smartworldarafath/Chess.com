package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.inputmethod.ah3;
import com.google.inputmethod.f43;
import com.google.inputmethod.fz1;
import com.google.inputmethod.i05;
import com.google.inputmethod.lw0;
import com.google.inputmethod.r16;
import com.google.inputmethod.vg3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006JC\u0010\u0010\u001a\u00020\u000e*\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0016\u001a\u00020\u00132\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u0016\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010$\u001a\u0004\u0018\u00010\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!\"\u0004\b\"\u0010#R$\u0010+\u001a\u0004\u0018\u00010\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R*\u00104\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0011\u0010\u000b\u001a\u0002058F¢\u0006\u0006\u001a\u0004\b.\u00106R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010\u0007\u001a\u0002098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0014\u0010=\u001a\u0002098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010;¨\u0006>"}, d2 = {"Landroidx/compose/ui/draw/CacheDrawScope;", "Lcom/google/android/f43;", "<init>", "()V", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "f", "()Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Lcom/google/android/q16;", "size", "Lkotlin/Function1;", "Lcom/google/android/fz1;", "", "block", "m", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;Lcom/google/android/f43;Landroidx/compose/ui/unit/LayoutDirection;JLkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lcom/google/android/ah3;", "i", "(Lkotlin/jvm/functions/Function1;)Lcom/google/android/ah3;", "j", "Lcom/google/android/lw0;", "a", "Lcom/google/android/lw0;", "getCacheParams$ui", "()Lcom/google/android/lw0;", "t", "(Lcom/google/android/lw0;)V", "cacheParams", "b", "Lcom/google/android/ah3;", "()Lcom/google/android/ah3;", "z", "(Lcom/google/android/ah3;)V", "drawResult", "c", "Lcom/google/android/fz1;", "getContentDrawScope$ui", "()Lcom/google/android/fz1;", "w", "(Lcom/google/android/fz1;)V", "contentDrawScope", "Lkotlin/Function0;", "Lcom/google/android/i05;", "d", "Lkotlin/jvm/functions/Function0;", "getGraphicsContextProvider$ui", "()Lkotlin/jvm/functions/Function0;", "D", "(Lkotlin/jvm/functions/Function0;)V", "graphicsContextProvider", "Lcom/google/android/tsb;", "()J", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "", "getDensity", "()F", "w2", "fontScale", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CacheDrawScope implements f43 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private lw0 cacheParams = g.a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private ah3 drawResult;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private fz1 contentDrawScope;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private Function0<? extends i05> graphicsContextProvider;

    public static /* synthetic */ void r(CacheDrawScope cacheDrawScope, GraphicsLayer graphicsLayer, f43 f43Var, LayoutDirection layoutDirection, long j, Function1 function1, int i, Object obj) {
        f43 f43Var2 = f43Var;
        if ((i & 1) != 0) {
            f43Var2 = cacheDrawScope;
        }
        if ((i & 2) != 0) {
            layoutDirection = cacheDrawScope.getLayoutDirection();
        }
        if ((i & 4) != 0) {
            j = r16.d(cacheDrawScope.d());
        }
        cacheDrawScope.m(graphicsLayer, f43Var2, layoutDirection, j, function1);
    }

    public final void D(Function0<? extends i05> function0) {
        this.graphicsContextProvider = function0;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ah3 getDrawResult() {
        return this.drawResult;
    }

    public final long d() {
        return this.cacheParams.d();
    }

    public final GraphicsLayer f() {
        Function0<? extends i05> function0 = this.graphicsContextProvider;
        Intrinsics.g(function0);
        return ((i05) function0.invoke()).b();
    }

    @Override // com.google.inputmethod.f43
    public float getDensity() {
        return this.cacheParams.getDensity().getDensity();
    }

    public final LayoutDirection getLayoutDirection() {
        return this.cacheParams.getLayoutDirection();
    }

    public final ah3 i(final Function1<? super DrawScope, Unit> block) {
        return j(new Function1<fz1, Unit>() { // from class: androidx.compose.ui.draw.CacheDrawScope$onDrawBehind$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final void a(fz1 fz1Var) {
                block.invoke(fz1Var);
                fz1Var.j1();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((fz1) obj);
                return Unit.a;
            }
        });
    }

    public final ah3 j(Function1<? super fz1, Unit> block) {
        ah3 ah3Var = new ah3(block);
        this.drawResult = ah3Var;
        return ah3Var;
    }

    public final void m(GraphicsLayer graphicsLayer, final f43 f43Var, final LayoutDirection layoutDirection, long j, final Function1<? super fz1, Unit> function1) {
        final fz1 fz1Var = this.contentDrawScope;
        Intrinsics.g(fz1Var);
        final f43 density = fz1Var.getDrawContext().getDensity();
        final LayoutDirection layoutDirection2 = fz1Var.getDrawContext().getLayoutDirection();
        fz1Var.Q0(graphicsLayer, j, new Function1<DrawScope, Unit>() { // from class: androidx.compose.ui.draw.CacheDrawScope$record$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final void a(DrawScope drawScope) {
                vg3 drawContext = drawScope.getDrawContext();
                f43 f43Var2 = f43Var;
                LayoutDirection layoutDirection3 = layoutDirection;
                drawContext.e(f43Var2);
                drawContext.a(layoutDirection3);
                try {
                    function1.invoke(fz1Var);
                } finally {
                    vg3 drawContext2 = drawScope.getDrawContext();
                    f43 f43Var3 = density;
                    LayoutDirection layoutDirection4 = layoutDirection2;
                    drawContext2.e(f43Var3);
                    drawContext2.a(layoutDirection4);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((DrawScope) obj);
                return Unit.a;
            }
        });
    }

    public final void t(lw0 lw0Var) {
        this.cacheParams = lw0Var;
    }

    public final void w(fz1 fz1Var) {
        this.contentDrawScope = fz1Var;
    }

    @Override // com.google.inputmethod.hm4
    /* JADX INFO: renamed from: w2 */
    public float getFontScale() {
        return this.cacheParams.getDensity().getFontScale();
    }

    public final void z(ah3 ah3Var) {
        this.drawResult = ah3Var;
    }
}
