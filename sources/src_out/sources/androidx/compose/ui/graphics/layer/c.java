package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.inputmethod.cj;
import com.google.inputmethod.ega;
import com.google.inputmethod.eha;
import com.google.inputmethod.ei1;
import com.google.inputmethod.f43;
import com.google.inputmethod.ki1;
import com.google.inputmethod.nac;
import com.google.inputmethod.q51;
import com.google.inputmethod.r16;
import com.google.inputmethod.rn8;
import com.google.inputmethod.tsb;
import com.google.inputmethod.vg3;
import com.google.inputmethod.w41;
import com.google.inputmethod.wi;
import com.google.inputmethod.xi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0010\u001a\u00020\n*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\fJ\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J'\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J!\u0010$\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010#\u001a\u00020\u001dH\u0016¢\u0006\u0004\b$\u0010%J;\u0010/\u001a\u00020\n2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\n0,H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\n2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00106\u001a\u000205H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\nH\u0016¢\u0006\u0004\b8\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010?R\u0014\u0010B\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010\u001e\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010:R\u0018\u0010G\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010J\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010M\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR*\u0010T\u001a\u00020N2\u0006\u0010O\u001a\u00020N8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bP\u0010\u001f\u001a\u0004\bQ\u0010R\"\u0004\b=\u0010SR*\u0010Z\u001a\u00020U2\u0006\u0010O\u001a\u00020U8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bD\u0010X\"\u0004\b@\u0010YR.\u0010`\u001a\u0004\u0018\u00010[2\b\u0010O\u001a\u0004\u0018\u00010[8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b9\u0010^\"\u0004\bH\u0010_R*\u0010f\u001a\u00020a2\u0006\u0010O\u001a\u00020a8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bb\u0010:\u001a\u0004\bc\u0010<\"\u0004\bd\u0010eR*\u0010i\u001a\u00020N2\u0006\u0010O\u001a\u00020N8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b6\u0010\u001f\u001a\u0004\bg\u0010R\"\u0004\bh\u0010SR*\u0010m\u001a\u00020N2\u0006\u0010O\u001a\u00020N8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bj\u0010\u001f\u001a\u0004\bk\u0010R\"\u0004\bl\u0010SR*\u0010p\u001a\u00020N2\u0006\u0010O\u001a\u00020N8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bn\u0010\u001f\u001a\u0004\b\u001c\u0010R\"\u0004\bo\u0010SR*\u0010s\u001a\u00020N2\u0006\u0010O\u001a\u00020N8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bq\u0010\u001f\u001a\u0004\b\u001b\u0010R\"\u0004\br\u0010SR*\u0010w\u001a\u00020N2\u0006\u0010O\u001a\u00020N8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bt\u0010\u001f\u001a\u0004\bu\u0010R\"\u0004\bv\u0010SR*\u0010{\u001a\u00020x2\u0006\u0010O\u001a\u00020x8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bv\u0010:\u001a\u0004\by\u0010<\"\u0004\bz\u0010eR*\u0010|\u001a\u00020x2\u0006\u0010O\u001a\u00020x8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b$\u0010:\u001a\u0004\bb\u0010<\"\u0004\bW\u0010eR*\u0010\u007f\u001a\u00020N2\u0006\u0010O\u001a\u00020N8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b}\u0010\u001f\u001a\u0004\b~\u0010R\"\u0004\bn\u0010SR,\u0010\u0081\u0001\u001a\u00020N2\u0006\u0010O\u001a\u00020N8\u0016@VX\u0096\u000e¢\u0006\u0013\n\u0004\b/\u0010\u001f\u001a\u0005\b\u0080\u0001\u0010R\"\u0004\bq\u0010SR+\u0010\u0082\u0001\u001a\u00020N2\u0006\u0010O\u001a\u00020N8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b3\u0010\u001f\u001a\u0004\bE\u0010R\"\u0004\b}\u0010SR+\u0010\u0083\u0001\u001a\u00020N2\u0006\u0010O\u001a\u00020N8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001f\u001a\u0004\bV\u0010R\"\u0004\bj\u0010SR-\u0010\u0086\u0001\u001a\u00020\u00162\u0006\u0010O\u001a\u00020\u00168\u0016@VX\u0096\u000e¢\u0006\u0014\n\u0004\b\u001c\u0010L\u001a\u0005\b\u0084\u0001\u0010\u0018\"\u0005\b\\\u0010\u0085\u0001R\u0017\u0010\u0087\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010LR\u0017\u0010\u0088\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010LR6\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u0089\u00012\t\u0010O\u001a\u0005\u0018\u00010\u0089\u00018\u0016@VX\u0096\u000e¢\u0006\u0017\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0005\bK\u0010\u008c\u0001\"\u0006\b\u008a\u0001\u0010\u008d\u0001R-\u0010\u000f\u001a\u00020\u000e2\u0006\u0010O\u001a\u00020\u000e8\u0016@VX\u0096\u000e¢\u0006\u0015\n\u0005\b\u0080\u0001\u0010W\u001a\u0005\b\u008f\u0001\u0010X\"\u0005\b\u0090\u0001\u0010YR&\u0010\u0091\u0001\u001a\u00020\u00168\u0016@\u0016X\u0096\u000e¢\u0006\u0015\n\u0005\b\u008f\u0001\u0010L\u001a\u0005\b\u0091\u0001\u0010\u0018\"\u0005\b:\u0010\u0085\u0001R\u0015\u0010\u0092\u0001\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010\u0018¨\u0006\u0093\u0001"}, d2 = {"Landroidx/compose/ui/graphics/layer/c;", "Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;", "", "ownerId", "Lcom/google/android/q51;", "canvasHolder", "Landroidx/compose/ui/graphics/drawscope/a;", "canvasDrawScope", "<init>", "(JLcom/google/android/q51;Landroidx/compose/ui/graphics/drawscope/a;)V", "", "d", "()V", "Landroid/graphics/RenderNode;", "Landroidx/compose/ui/graphics/layer/a;", "compositingStrategy", "Q", "(Landroid/graphics/RenderNode;I)V", "V", "Landroid/graphics/Paint;", "S", "()Landroid/graphics/Paint;", "", "T", "()Z", "U", "", "x", "y", "Lcom/google/android/q16;", "size", "F", "(IIJ)V", "Landroid/graphics/Outline;", "outline", "outlineSize", "t", "(Landroid/graphics/Outline;J)V", "Lcom/google/android/f43;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "block", "v", "(Lcom/google/android/f43;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/layer/GraphicsLayer;Lkotlin/jvm/functions/Function1;)V", "Lcom/google/android/w41;", "canvas", "w", "(Lcom/google/android/w41;)V", "Landroid/graphics/Matrix;", "n", "()Landroid/graphics/Matrix;", "A", "b", "J", "getOwnerId", "()J", "c", "Lcom/google/android/q51;", "Landroidx/compose/ui/graphics/drawscope/a;", "e", "Landroid/graphics/RenderNode;", "renderNode", "Lcom/google/android/tsb;", "f", "g", "Landroid/graphics/Paint;", "layerPaint", "h", "Landroid/graphics/Matrix;", "matrix", "i", "Z", "outlineIsProvided", "", "value", "j", "a", "()F", "(F)V", "alpha", "Landroidx/compose/ui/graphics/e;", "k", "I", "()I", "(I)V", "blendMode", "Landroidx/compose/ui/graphics/h;", "l", "Landroidx/compose/ui/graphics/h;", "()Landroidx/compose/ui/graphics/h;", "(Landroidx/compose/ui/graphics/h;)V", "colorFilter", "Lcom/google/android/rn8;", "m", "getPivotOffset-F1C5BW0", "L", "(J)V", "pivotOffset", "K", "G", "scaleX", "o", "P", "M", "scaleY", "p", "setTranslationX", "translationX", "q", "setTranslationY", "translationY", "r", "z", "s", "shadowElevation", "Lcom/google/android/ei1;", "H", "E", "ambientShadowColor", "spotShadowColor", "u", "O", "rotationX", "C", "rotationY", "rotationZ", "cameraDistance", "R", "(Z)V", "clip", "clipToBounds", "clipToOutline", "Lcom/google/android/ega;", "B", "Lcom/google/android/ega;", "()Lcom/google/android/ega;", "(Lcom/google/android/ega;)V", "renderEffect", "D", "N", "isInvalidated", "hasDisplayList", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements GraphicsLayerImpl {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private boolean clipToOutline;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private ega renderEffect;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private int compositingStrategy;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private boolean isInvalidated;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long ownerId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final q51 canvasHolder;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final androidx.compose.ui.graphics.drawscope.a canvasDrawScope;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final RenderNode renderNode;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private long size;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private Paint layerPaint;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private Matrix matrix;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private boolean outlineIsProvided;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private float alpha;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private int blendMode;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private androidx.compose.ui.graphics.h colorFilter;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private long pivotOffset;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private float scaleX;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private float scaleY;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private float translationX;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private float translationY;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private float shadowElevation;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private long ambientShadowColor;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private long spotShadowColor;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private float rotationX;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private float rotationY;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private float rotationZ;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private float cameraDistance;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private boolean clip;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private boolean clipToBounds;

    public c(long j, q51 q51Var, androidx.compose.ui.graphics.drawscope.a aVar) {
        this.ownerId = j;
        this.canvasHolder = q51Var;
        this.canvasDrawScope = aVar;
        RenderNode renderNodeA = nac.a("graphicsLayer");
        this.renderNode = renderNodeA;
        this.size = tsb.INSTANCE.b();
        renderNodeA.setClipToBounds(false);
        a.Companion companion = a.INSTANCE;
        Q(renderNodeA, companion.a());
        this.alpha = 1.0f;
        this.blendMode = androidx.compose.ui.graphics.e.INSTANCE.B();
        this.pivotOffset = rn8.INSTANCE.b();
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        ei1.Companion companion2 = ei1.INSTANCE;
        this.ambientShadowColor = companion2.a();
        this.spotShadowColor = companion2.a();
        this.cameraDistance = 8.0f;
        this.compositingStrategy = companion.a();
        this.isInvalidated = true;
    }

    private final void Q(RenderNode renderNode, int i) {
        a.Companion companion = a.INSTANCE;
        if (a.e(i, companion.c())) {
            renderNode.setUseCompositingLayer(true, this.layerPaint);
            renderNode.setHasOverlappingRendering(true);
        } else if (a.e(i, companion.b())) {
            renderNode.setUseCompositingLayer(false, this.layerPaint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, this.layerPaint);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    private final Paint S() {
        Paint paint = this.layerPaint;
        if (paint != null) {
            return paint;
        }
        Paint paint2 = new Paint();
        this.layerPaint = paint2;
        return paint2;
    }

    private final boolean T() {
        return a.e(getCompositingStrategy(), a.INSTANCE.c()) || U() || getRenderEffect() != null;
    }

    private final boolean U() {
        return (androidx.compose.ui.graphics.e.E(getBlendMode(), androidx.compose.ui.graphics.e.INSTANCE.B()) && getColorFilter() == null) ? false : true;
    }

    private final void V() {
        if (T()) {
            Q(this.renderNode, a.INSTANCE.c());
        } else {
            Q(this.renderNode, getCompositingStrategy());
        }
    }

    private final void d() {
        boolean z = false;
        boolean z2 = getClip() && !this.outlineIsProvided;
        if (getClip() && this.outlineIsProvided) {
            z = true;
        }
        if (z2 != this.clipToBounds) {
            this.clipToBounds = z2;
            this.renderNode.setClipToBounds(z2);
        }
        if (z != this.clipToOutline) {
            this.clipToOutline = z;
            this.renderNode.setClipToOutline(z);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void A() {
        this.renderNode.discardDisplayList();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void B(ega egaVar) {
        this.renderEffect = egaVar;
        if (Build.VERSION.SDK_INT >= 31) {
            eha.a.a(this.renderNode, egaVar);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: C, reason: from getter */
    public float getRotationY() {
        return this.rotationY;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: D, reason: from getter */
    public int getCompositingStrategy() {
        return this.compositingStrategy;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void E(long j) {
        this.ambientShadowColor = j;
        this.renderNode.setAmbientShadowColor(ki1.j(j));
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void F(int x, int y, long size) {
        this.renderNode.setPosition(x, y, ((int) (size >> 32)) + x, ((int) (4294967295L & size)) + y);
        this.size = r16.e(size);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void G(float f) {
        this.scaleX = f;
        this.renderNode.setScaleX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: H, reason: from getter */
    public long getAmbientShadowColor() {
        return this.ambientShadowColor;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void I(long j) {
        this.spotShadowColor = j;
        this.renderNode.setSpotShadowColor(ki1.j(j));
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void J(boolean z) {
        this.isInvalidated = z;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: K, reason: from getter */
    public float getScaleX() {
        return this.scaleX;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void L(long j) {
        this.pivotOffset = j;
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.renderNode.resetPivot();
        } else {
            this.renderNode.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.renderNode.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void M(float f) {
        this.scaleY = f;
        this.renderNode.setScaleY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void N(int i) {
        this.compositingStrategy = i;
        V();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: O, reason: from getter */
    public float getRotationX() {
        return this.rotationX;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: P, reason: from getter */
    public float getScaleY() {
        return this.scaleY;
    }

    /* JADX INFO: renamed from: R, reason: from getter */
    public boolean getClip() {
        return this.clip;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: a, reason: from getter */
    public float getAlpha() {
        return this.alpha;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: b, reason: from getter */
    public androidx.compose.ui.graphics.h getColorFilter() {
        return this.colorFilter;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void c(float f) {
        this.alpha = f;
        this.renderNode.setAlpha(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void e(int i) {
        this.blendMode = i;
        S().setBlendMode(androidx.compose.ui.graphics.a.a(i));
        V();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: f, reason: from getter */
    public int getBlendMode() {
        return this.blendMode;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: g, reason: from getter */
    public float getRotationZ() {
        return this.rotationZ;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void h(androidx.compose.ui.graphics.h hVar) {
        this.colorFilter = hVar;
        S().setColorFilter(hVar != null ? cj.d(hVar) : null);
        V();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: i, reason: from getter */
    public ega getRenderEffect() {
        return this.renderEffect;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public boolean j() {
        return this.renderNode.hasDisplayList();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: k, reason: from getter */
    public float getCameraDistance() {
        return this.cameraDistance;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void l(boolean z) {
        this.clip = z;
        d();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: m, reason: from getter */
    public long getSpotShadowColor() {
        return this.spotShadowColor;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public Matrix n() {
        Matrix matrix = this.matrix;
        if (matrix == null) {
            matrix = new Matrix();
            this.matrix = matrix;
        }
        this.renderNode.getMatrix(matrix);
        return matrix;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void o(float f) {
        this.cameraDistance = f;
        this.renderNode.setCameraDistance(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void p(float f) {
        this.rotationX = f;
        this.renderNode.setRotationX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void q(float f) {
        this.rotationY = f;
        this.renderNode.setRotationY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void s(float f) {
        this.shadowElevation = f;
        this.renderNode.setElevation(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setTranslationX(float f) {
        this.translationX = f;
        this.renderNode.setTranslationX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setTranslationY(float f) {
        this.translationY = f;
        this.renderNode.setTranslationY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void t(Outline outline, long outlineSize) {
        this.renderNode.setOutline(outline);
        this.outlineIsProvided = outline != null;
        d();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void u(float f) {
        this.rotationZ = f;
        this.renderNode.setRotationZ(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void v(f43 density, LayoutDirection layoutDirection, GraphicsLayer layer, Function1<? super DrawScope, Unit> block) {
        RecordingCanvas recordingCanvasBeginRecording = this.renderNode.beginRecording();
        try {
            q51 q51Var = this.canvasHolder;
            Canvas internalCanvas = q51Var.getAndroidCanvas().getInternalCanvas();
            q51Var.getAndroidCanvas().d(recordingCanvasBeginRecording);
            wi androidCanvas = q51Var.getAndroidCanvas();
            vg3 drawContext = this.canvasDrawScope.getDrawContext();
            drawContext.e(density);
            drawContext.a(layoutDirection);
            drawContext.h(layer);
            drawContext.c(this.size);
            drawContext.i(androidCanvas);
            block.invoke(this.canvasDrawScope);
            q51Var.getAndroidCanvas().d(internalCanvas);
            this.renderNode.endRecording();
            J(false);
        } catch (Throwable th) {
            this.renderNode.endRecording();
            throw th;
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void w(w41 canvas) {
        xi.d(canvas).drawRenderNode(this.renderNode);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: x, reason: from getter */
    public float getTranslationY() {
        return this.translationY;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: y, reason: from getter */
    public float getTranslationX() {
        return this.translationX;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: z, reason: from getter */
    public float getShadowElevation() {
        return this.shadowElevation;
    }

    public /* synthetic */ c(long j, q51 q51Var, androidx.compose.ui.graphics.drawscope.a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? new q51() : q51Var, (i & 4) != 0 ? new androidx.compose.ui.graphics.drawscope.a() : aVar);
    }
}
