package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.inputmethod.f43;
import com.google.inputmethod.q51;
import com.google.inputmethod.tsb;
import com.google.inputmethod.vg3;
import com.google.inputmethod.w41;
import com.google.inputmethod.wg3;
import com.google.inputmethod.wi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b%\b\u0001\u0018\u0000 G2\u00020\u0001:\u0001'B#\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ;\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001eH\u0014¢\u0006\u0004\b \u0010!J7\u0010(\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020#H\u0014¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0016H\u0016¢\u0006\u0004\b*\u0010\u001bR\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b'\u0010/\u001a\u0004\b0\u00101R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00102R\"\u00106\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u00103\u001a\u0004\b'\u0010\u001d\"\u0004\b4\u00105R\u0018\u00109\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R*\u0010>\u001a\u00020\u000b2\u0006\u0010:\u001a\u00020\u000b8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b;\u00103\u001a\u0004\b<\u0010\u001d\"\u0004\b=\u00105R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\"\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006H"}, d2 = {"Landroidx/compose/ui/graphics/layer/h;", "Landroid/view/View;", "ownerView", "Lcom/google/android/q51;", "canvasHolder", "Landroidx/compose/ui/graphics/drawscope/a;", "canvasDrawScope", "<init>", "(Landroid/view/View;Lcom/google/android/q51;Landroidx/compose/ui/graphics/drawscope/a;)V", "Landroid/graphics/Outline;", "outline", "", "d", "(Landroid/graphics/Outline;)Z", "Lcom/google/android/f43;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "parentLayer", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "drawBlock", "c", "(Lcom/google/android/f43;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/layer/GraphicsLayer;Lkotlin/jvm/functions/Function1;)V", "invalidate", "()V", "hasOverlappingRendering", "()Z", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "changed", "", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "forceLayout", "a", "Landroid/view/View;", "getOwnerView", "()Landroid/view/View;", "Lcom/google/android/q51;", "getCanvasHolder", "()Lcom/google/android/q51;", "Landroidx/compose/ui/graphics/drawscope/a;", "Z", "setInvalidated", "(Z)V", "isInvalidated", "e", "Landroid/graphics/Outline;", "layerOutline", "value", "f", "getCanUseCompositingLayer$ui_graphics", "setCanUseCompositingLayer$ui_graphics", "canUseCompositingLayer", "g", "Lcom/google/android/f43;", "h", "Landroidx/compose/ui/unit/LayoutDirection;", "i", "Lkotlin/jvm/functions/Function1;", "j", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "k", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h extends View {
    public static final int l = 8;
    private static final ViewOutlineProvider m = new a();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final View ownerView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final q51 canvasHolder;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final androidx.compose.ui.graphics.drawscope.a canvasDrawScope;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean isInvalidated;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private Outline layerOutline;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean canUseCompositingLayer;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private f43 density;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private LayoutDirection layoutDirection;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private Function1<? super DrawScope, Unit> drawBlock;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private GraphicsLayer parentLayer;

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/compose/ui/graphics/layer/h$a", "Landroid/view/ViewOutlineProvider;", "Landroid/view/View;", "view", "Landroid/graphics/Outline;", "outline", "", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            Outline outline2;
            if (!(view instanceof h) || (outline2 = ((h) view).layerOutline) == null) {
                return;
            }
            outline.set(outline2);
        }
    }

    public h(View view, q51 q51Var, androidx.compose.ui.graphics.drawscope.a aVar) {
        super(view.getContext());
        this.ownerView = view;
        this.canvasHolder = q51Var;
        this.canvasDrawScope = aVar;
        setOutlineProvider(m);
        this.canUseCompositingLayer = true;
        this.density = wg3.a();
        this.layoutDirection = LayoutDirection.Ltr;
        this.drawBlock = GraphicsLayerImpl.INSTANCE.a();
        setWillNotDraw(false);
        setClipBounds(null);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsInvalidated() {
        return this.isInvalidated;
    }

    public final void c(f43 density, LayoutDirection layoutDirection, GraphicsLayer parentLayer, Function1<? super DrawScope, Unit> drawBlock) {
        this.density = density;
        this.layoutDirection = layoutDirection;
        this.drawBlock = drawBlock;
        this.parentLayer = parentLayer;
    }

    public final boolean d(Outline outline) {
        this.layerOutline = outline;
        return e.a.a(this);
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
        q51 q51Var = this.canvasHolder;
        Canvas canvasA = q51Var.getAndroidCanvas().getInternalCanvas();
        q51Var.getAndroidCanvas().d(canvas);
        wi wiVarA = q51Var.getAndroidCanvas();
        androidx.compose.ui.graphics.drawscope.a aVar = this.canvasDrawScope;
        f43 f43Var = this.density;
        LayoutDirection layoutDirection = this.layoutDirection;
        float width = getWidth();
        long jD = tsb.d((((long) Float.floatToRawIntBits(getHeight())) & 4294967295L) | (Float.floatToRawIntBits(width) << 32));
        GraphicsLayer graphicsLayer = this.parentLayer;
        Function1<? super DrawScope, Unit> function1 = this.drawBlock;
        f43 density = aVar.getDrawContext().getDensity();
        LayoutDirection layoutDirection2 = aVar.getDrawContext().getLayoutDirection();
        w41 w41VarB = aVar.getDrawContext().b();
        long jD2 = aVar.getDrawContext().d();
        GraphicsLayer graphicsLayerF = aVar.getDrawContext().getGraphicsLayer();
        vg3 vg3VarV0 = aVar.getDrawContext();
        vg3VarV0.e(f43Var);
        vg3VarV0.a(layoutDirection);
        vg3VarV0.i(wiVarA);
        vg3VarV0.c(jD);
        vg3VarV0.h(graphicsLayer);
        wiVarA.v();
        try {
            function1.invoke(aVar);
            wiVarA.o();
            vg3 vg3VarV1 = aVar.getDrawContext();
            vg3VarV1.e(density);
            vg3VarV1.a(layoutDirection2);
            vg3VarV1.i(w41VarB);
            vg3VarV1.c(jD2);
            vg3VarV1.h(graphicsLayerF);
            q51Var.getAndroidCanvas().d(canvasA);
            this.isInvalidated = false;
        } catch (Throwable th) {
            wiVarA.o();
            vg3 vg3VarV2 = aVar.getDrawContext();
            vg3VarV2.e(density);
            vg3VarV2.a(layoutDirection2);
            vg3VarV2.i(w41VarB);
            vg3VarV2.c(jD2);
            vg3VarV2.h(graphicsLayerF);
            throw th;
        }
    }

    @Override // android.view.View
    public void forceLayout() {
    }

    /* JADX INFO: renamed from: getCanUseCompositingLayer$ui_graphics, reason: from getter */
    public final boolean getCanUseCompositingLayer() {
        return this.canUseCompositingLayer;
    }

    public final q51 getCanvasHolder() {
        return this.canvasHolder;
    }

    public final View getOwnerView() {
        return this.ownerView;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.canUseCompositingLayer;
    }

    @Override // android.view.View
    public void invalidate() {
        if (this.isInvalidated) {
            return;
        }
        this.isInvalidated = true;
        super.invalidate();
    }

    @Override // android.view.View
    protected void onLayout(boolean changed, int l2, int t, int r, int b) {
    }

    public final void setCanUseCompositingLayer$ui_graphics(boolean z) {
        if (this.canUseCompositingLayer != z) {
            this.canUseCompositingLayer = z;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z) {
        this.isInvalidated = z;
    }
}
