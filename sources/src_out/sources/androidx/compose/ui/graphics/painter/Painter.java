package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.h;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.inputmethod.dm;
import com.google.inputmethod.gba;
import com.google.inputmethod.kba;
import com.google.inputmethod.q09;
import com.google.inputmethod.rn8;
import com.google.inputmethod.tsb;
import com.google.inputmethod.w41;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\t*\u00020\u0014H$¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u00172\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010!\u001a\u00020\t*\u00020\u00142\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010#R\u0016\u0010&\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010%R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010'R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010\u001c\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R \u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00102\u001a\u00020\u001f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"Landroidx/compose/ui/graphics/painter/Painter;", "", "<init>", "()V", "Lcom/google/android/q09;", "m", "()Lcom/google/android/q09;", "Landroidx/compose/ui/graphics/h;", "colorFilter", "", "h", "(Landroidx/compose/ui/graphics/h;)V", "", "alpha", "g", "(F)V", "Landroidx/compose/ui/unit/LayoutDirection;", "rtl", "i", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "n", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "", "a", "(F)Z", "b", "(Landroidx/compose/ui/graphics/h;)Z", "layoutDirection", "c", "(Landroidx/compose/ui/unit/LayoutDirection;)Z", "Lcom/google/android/tsb;", "size", "j", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFLandroidx/compose/ui/graphics/h;)V", "Lcom/google/android/q09;", "layerPaint", "Z", "useLayer", "Landroidx/compose/ui/graphics/h;", "d", "F", "e", "Landroidx/compose/ui/unit/LayoutDirection;", "Lkotlin/Function1;", "f", "Lkotlin/jvm/functions/Function1;", "drawLambda", "l", "()J", "intrinsicSize", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class Painter {
    public static final int g = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private q09 layerPaint;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean useLayer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private h colorFilter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private float alpha = 1.0f;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private LayoutDirection layoutDirection = LayoutDirection.Ltr;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Function1<DrawScope, Unit> drawLambda = new Function1<DrawScope, Unit>() { // from class: androidx.compose.ui.graphics.painter.Painter$drawLambda$1
        {
            super(1);
        }

        public final void a(DrawScope drawScope) {
            this.this$0.n(drawScope);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((DrawScope) obj);
            return Unit.a;
        }
    };

    private final void g(float alpha) {
        if (this.alpha == alpha) {
            return;
        }
        if (!a(alpha)) {
            if (alpha == 1.0f) {
                q09 q09Var = this.layerPaint;
                if (q09Var != null) {
                    q09Var.c(alpha);
                }
                this.useLayer = false;
            } else {
                m().c(alpha);
                this.useLayer = true;
            }
        }
        this.alpha = alpha;
    }

    private final void h(h colorFilter) {
        if (Intrinsics.e(this.colorFilter, colorFilter)) {
            return;
        }
        if (!b(colorFilter)) {
            if (colorFilter == null) {
                q09 q09Var = this.layerPaint;
                if (q09Var != null) {
                    q09Var.h(null);
                }
                this.useLayer = false;
            } else {
                m().h(colorFilter);
                this.useLayer = true;
            }
        }
        this.colorFilter = colorFilter;
    }

    private final void i(LayoutDirection rtl) {
        if (this.layoutDirection != rtl) {
            c(rtl);
            this.layoutDirection = rtl;
        }
    }

    public static /* synthetic */ void k(Painter painter, DrawScope drawScope, long j, float f, h hVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: draw-x_KDEd0");
        }
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i & 4) != 0) {
            hVar = null;
        }
        painter.j(drawScope, j, f2, hVar);
    }

    private final q09 m() {
        q09 q09Var = this.layerPaint;
        if (q09Var != null) {
            return q09Var;
        }
        q09 q09VarA = dm.a();
        this.layerPaint = q09VarA;
        return q09VarA;
    }

    protected boolean a(float alpha) {
        return false;
    }

    protected boolean b(h colorFilter) {
        return false;
    }

    protected boolean c(LayoutDirection layoutDirection) {
        return false;
    }

    public final void j(DrawScope drawScope, long j, float f, h hVar) {
        g(f);
        h(hVar);
        i(drawScope.getLayoutDirection());
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.d() >> 32)) - Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.d() & 4294967295L)) - Float.intBitsToFloat(i2);
        drawScope.getDrawContext().getTransform().k(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2);
        if (f > 0.0f) {
            try {
                if (Float.intBitsToFloat(i) > 0.0f && Float.intBitsToFloat(i2) > 0.0f) {
                    if (this.useLayer) {
                        long jC = rn8.INSTANCE.c();
                        float fIntBitsToFloat3 = Float.intBitsToFloat(i);
                        gba gbaVarC = kba.c(jC, tsb.d((((long) Float.floatToRawIntBits(Float.intBitsToFloat(i2))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat3) << 32)));
                        w41 w41VarB = drawScope.getDrawContext().b();
                        try {
                            w41VarB.u(gbaVarC, m());
                            n(drawScope);
                            w41VarB.o();
                        } catch (Throwable th) {
                            w41VarB.o();
                            throw th;
                        }
                    } else {
                        n(drawScope);
                    }
                }
            } catch (Throwable th2) {
                drawScope.getDrawContext().getTransform().k(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
                throw th2;
            }
        }
        drawScope.getDrawContext().getTransform().k(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
    }

    public abstract long l();

    protected abstract void n(DrawScope drawScope);
}
