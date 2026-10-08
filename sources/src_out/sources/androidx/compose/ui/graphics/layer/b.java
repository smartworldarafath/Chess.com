package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import android.view.View;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.inputmethod.cj;
import com.google.inputmethod.ega;
import com.google.inputmethod.ei1;
import com.google.inputmethod.f43;
import com.google.inputmethod.ki1;
import com.google.inputmethod.q16;
import com.google.inputmethod.q51;
import com.google.inputmethod.r16;
import com.google.inputmethod.rn8;
import com.google.inputmethod.vg3;
import com.google.inputmethod.w41;
import com.google.inputmethod.wi;
import com.google.inputmethod.xi;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 p2\u00020\u0001:\u0001bB+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010#\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J!\u0010(\u001a\u00020\u00112\b\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010'\u001a\u00020!H\u0016¢\u0006\u0004\b(\u0010)J;\u00103\u001a\u00020\u00112\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u001100H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u00020\u00112\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108J\u000f\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u0011H\u0016¢\u0006\u0004\b<\u0010\u0018J\u000f\u0010=\u001a\u00020\u0011H\u0000¢\u0006\u0004\b=\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010DR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010?R\u0018\u0010J\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010M\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010P\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010'\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010?R*\u0010\u0010\u001a\u00020\u000f2\u0006\u0010R\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010\u0013R*\u0010Z\u001a\u00020X2\u0006\u0010R\u001a\u00020X8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bY\u0010T\u001a\u0004\bG\u0010V\"\u0004\bE\u0010\u0013R.\u0010`\u001a\u0004\u0018\u00010[2\b\u0010R\u001a\u0004\u0018\u00010[8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b>\u0010^\"\u0004\bK\u0010_R*\u0010e\u001a\u00020a2\u0006\u0010R\u001a\u00020a8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b:\u0010#\u001a\u0004\bb\u0010c\"\u0004\bB\u0010dR\u0016\u0010g\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010OR*\u0010m\u001a\u00020h2\u0006\u0010R\u001a\u00020h8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bi\u0010?\u001a\u0004\bj\u0010A\"\u0004\bk\u0010lR*\u0010q\u001a\u00020a2\u0006\u0010R\u001a\u00020a8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bn\u0010#\u001a\u0004\bo\u0010c\"\u0004\bp\u0010dR*\u0010u\u001a\u00020a2\u0006\u0010R\u001a\u00020a8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\br\u0010#\u001a\u0004\bs\u0010c\"\u0004\bt\u0010dR*\u0010x\u001a\u00020a2\u0006\u0010R\u001a\u00020a8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bv\u0010#\u001a\u0004\b \u0010c\"\u0004\bw\u0010dR*\u0010z\u001a\u00020a2\u0006\u0010R\u001a\u00020a8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b(\u0010#\u001a\u0004\b\u001f\u0010c\"\u0004\by\u0010dR*\u0010}\u001a\u00020a2\u0006\u0010R\u001a\u00020a8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b{\u0010#\u001a\u0004\b|\u0010c\"\u0004\bv\u0010dR,\u0010\u0081\u0001\u001a\u00020~2\u0006\u0010R\u001a\u00020~8\u0016@VX\u0096\u000e¢\u0006\u0013\n\u0004\b3\u0010?\u001a\u0004\b\u007f\u0010A\"\u0005\b\u0080\u0001\u0010lR+\u0010\u0082\u0001\u001a\u00020~2\u0006\u0010R\u001a\u00020~8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b7\u0010?\u001a\u0004\b\\\u0010A\"\u0004\bT\u0010lR,\u0010\u0084\u0001\u001a\u00020a2\u0006\u0010R\u001a\u00020a8\u0016@VX\u0096\u000e¢\u0006\u0013\n\u0004\b\u001f\u0010#\u001a\u0005\b\u0083\u0001\u0010c\"\u0004\bi\u0010dR,\u0010\u0086\u0001\u001a\u00020a2\u0006\u0010R\u001a\u00020a8\u0016@VX\u0096\u000e¢\u0006\u0013\n\u0004\b \u0010#\u001a\u0005\b\u0085\u0001\u0010c\"\u0004\bn\u0010dR+\u0010\u0087\u0001\u001a\u00020a2\u0006\u0010R\u001a\u00020a8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b|\u0010#\u001a\u0004\bH\u0010c\"\u0004\b{\u0010dR+\u0010\u0088\u0001\u001a\u00020a2\u0006\u0010R\u001a\u00020a8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b<\u0010#\u001a\u0004\bS\u0010c\"\u0004\bf\u0010dR.\u0010\u008c\u0001\u001a\u00020\u00142\u0006\u0010R\u001a\u00020\u00148\u0016@VX\u0096\u000e¢\u0006\u0015\n\u0005\b\u0089\u0001\u0010O\u001a\u0005\b\u008a\u0001\u0010\u0016\"\u0005\bY\u0010\u008b\u0001R\u0018\u0010\u008d\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010OR\u0017\u0010\u008e\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010OR+\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u008f\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0017\n\u0006\b\u0080\u0001\u0010\u0090\u0001\u001a\u0005\bN\u0010\u0091\u0001\"\u0006\b\u0089\u0001\u0010\u0092\u0001R%\u0010\u0094\u0001\u001a\u00020\u00148\u0016@\u0016X\u0096\u000e¢\u0006\u0014\n\u0004\b#\u0010O\u001a\u0005\b\u0094\u0001\u0010\u0016\"\u0005\b?\u0010\u008b\u0001R\u0015\u0010\u0095\u0001\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010\u0016¨\u0006\u0096\u0001"}, d2 = {"Landroidx/compose/ui/graphics/layer/b;", "Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;", "Landroid/view/View;", "ownerView", "", "ownerId", "Lcom/google/android/q51;", "canvasHolder", "Landroidx/compose/ui/graphics/drawscope/a;", "canvasDrawScope", "<init>", "(Landroid/view/View;JLcom/google/android/q51;Landroidx/compose/ui/graphics/drawscope/a;)V", "Landroid/graphics/Paint;", "T", "()Landroid/graphics/Paint;", "Landroidx/compose/ui/graphics/layer/a;", "compositingStrategy", "", "Q", "(I)V", "", "U", "()Z", "V", "()V", "d", "Landroid/view/RenderNode;", "renderNode", "W", "(Landroid/view/RenderNode;)V", "", "x", "y", "Lcom/google/android/q16;", "size", "F", "(IIJ)V", "Landroid/graphics/Outline;", "outline", "outlineSize", "t", "(Landroid/graphics/Outline;J)V", "Lcom/google/android/f43;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "block", "v", "(Lcom/google/android/f43;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/layer/GraphicsLayer;Lkotlin/jvm/functions/Function1;)V", "Lcom/google/android/w41;", "canvas", "w", "(Lcom/google/android/w41;)V", "Landroid/graphics/Matrix;", "n", "()Landroid/graphics/Matrix;", "A", "R", "b", "J", "getOwnerId", "()J", "c", "Lcom/google/android/q51;", "Landroidx/compose/ui/graphics/drawscope/a;", "e", "Landroid/view/RenderNode;", "f", "g", "Landroid/graphics/Paint;", "layerPaint", "h", "Landroid/graphics/Matrix;", "matrix", "i", "Z", "outlineIsProvided", "j", "value", "k", "I", "D", "()I", "N", "Landroidx/compose/ui/graphics/e;", "l", "blendMode", "Landroidx/compose/ui/graphics/h;", "m", "Landroidx/compose/ui/graphics/h;", "()Landroidx/compose/ui/graphics/h;", "(Landroidx/compose/ui/graphics/h;)V", "colorFilter", "", "a", "()F", "(F)V", "alpha", "o", "shouldManuallySetCenterPivot", "Lcom/google/android/rn8;", "p", "getPivotOffset-F1C5BW0", "L", "(J)V", "pivotOffset", "q", "K", "G", "scaleX", "r", "P", "M", "scaleY", "s", "setTranslationX", "translationX", "setTranslationY", "translationY", "u", "z", "shadowElevation", "Lcom/google/android/ei1;", "H", "E", "ambientShadowColor", "spotShadowColor", "O", "rotationX", "C", "rotationY", "rotationZ", "cameraDistance", "B", "S", "(Z)V", "clip", "clipToBounds", "clipToOutline", "Lcom/google/android/ega;", "Lcom/google/android/ega;", "()Lcom/google/android/ega;", "(Lcom/google/android/ega;)V", "renderEffect", "isInvalidated", "hasDisplayList", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements GraphicsLayerImpl {
    private static boolean I;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private float cameraDistance;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private boolean clip;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private boolean clipToBounds;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private boolean clipToOutline;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private ega renderEffect;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
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
    private long outlineSize;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private int compositingStrategy;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private int blendMode;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private androidx.compose.ui.graphics.h colorFilter;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private float alpha;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private boolean shouldManuallySetCenterPivot;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private long pivotOffset;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private float scaleX;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private float scaleY;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private float translationX;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private float translationY;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private float shadowElevation;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private long ambientShadowColor;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private long spotShadowColor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private float rotationX;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private float rotationY;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private float rotationZ;
    public static final int H = 8;
    private static final AtomicBoolean J = new AtomicBoolean(true);

    public b(View view, long j, q51 q51Var, androidx.compose.ui.graphics.drawscope.a aVar) {
        this.ownerId = j;
        this.canvasHolder = q51Var;
        this.canvasDrawScope = aVar;
        RenderNode renderNodeCreate = RenderNode.create("Compose", view);
        this.renderNode = renderNodeCreate;
        q16.Companion companion = q16.INSTANCE;
        this.size = companion.a();
        this.outlineSize = companion.a();
        if (J.getAndSet(false)) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            W(renderNodeCreate);
            R();
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        if (I) {
            throw new NoClassDefFoundError();
        }
        renderNodeCreate.setClipToBounds(false);
        a.Companion companion2 = a.INSTANCE;
        Q(companion2.a());
        this.compositingStrategy = companion2.a();
        this.blendMode = androidx.compose.ui.graphics.e.INSTANCE.B();
        this.alpha = 1.0f;
        this.pivotOffset = rn8.INSTANCE.b();
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        ei1.Companion companion3 = ei1.INSTANCE;
        this.ambientShadowColor = companion3.a();
        this.spotShadowColor = companion3.a();
        this.cameraDistance = 8.0f;
        this.isInvalidated = true;
    }

    private final void Q(int compositingStrategy) {
        RenderNode renderNode = this.renderNode;
        a.Companion companion = a.INSTANCE;
        if (a.e(compositingStrategy, companion.c())) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.layerPaint);
            renderNode.setHasOverlappingRendering(true);
        } else if (a.e(compositingStrategy, companion.b())) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.layerPaint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.layerPaint);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    private final Paint T() {
        Paint paint = this.layerPaint;
        if (paint != null) {
            return paint;
        }
        Paint paint2 = new Paint();
        this.layerPaint = paint2;
        return paint2;
    }

    private final boolean U() {
        return (!a.e(getCompositingStrategy(), a.INSTANCE.c()) && androidx.compose.ui.graphics.e.E(getBlendMode(), androidx.compose.ui.graphics.e.INSTANCE.B()) && getColorFilter() == null) ? false : true;
    }

    private final void V() {
        if (U()) {
            Q(a.INSTANCE.c());
        } else {
            Q(getCompositingStrategy());
        }
    }

    private final void W(RenderNode renderNode) {
        g gVar = g.a;
        gVar.c(renderNode, gVar.a(renderNode));
        gVar.d(renderNode, gVar.b(renderNode));
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
        R();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void B(ega egaVar) {
        this.renderEffect = egaVar;
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
        g.a.c(this.renderNode, ki1.j(j));
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void F(int x, int y, long size) {
        int i = (int) (size >> 32);
        int i2 = (int) (4294967295L & size);
        this.renderNode.setLeftTopRightBottom(x, y, x + i, y + i2);
        if (q16.f(this.size, size)) {
            return;
        }
        if (this.shouldManuallySetCenterPivot) {
            this.renderNode.setPivotX(i / 2.0f);
            this.renderNode.setPivotY(i2 / 2.0f);
        }
        this.size = size;
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
        g.a.d(this.renderNode, ki1.j(j));
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
            this.shouldManuallySetCenterPivot = true;
            this.renderNode.setPivotX(((int) (this.size >> 32)) / 2.0f);
            this.renderNode.setPivotY(((int) (4294967295L & this.size)) / 2.0f);
        } else {
            this.shouldManuallySetCenterPivot = false;
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

    public final void R() {
        f.a.a(this.renderNode);
    }

    /* JADX INFO: renamed from: S, reason: from getter */
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
        if (androidx.compose.ui.graphics.e.E(this.blendMode, i)) {
            return;
        }
        this.blendMode = i;
        T().setXfermode(new PorterDuffXfermode(androidx.compose.ui.graphics.a.b(i)));
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
        if (hVar == null) {
            V();
            return;
        }
        Q(a.INSTANCE.c());
        RenderNode renderNode = this.renderNode;
        Paint paintT = T();
        paintT.setColorFilter(cj.d(hVar));
        renderNode.setLayerPaint(paintT);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: i, reason: from getter */
    public ega getRenderEffect() {
        return this.renderEffect;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public boolean j() {
        return this.renderNode.isValid();
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
        this.renderNode.setCameraDistance(-f);
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
        this.outlineSize = outlineSize;
        this.renderNode.setOutline(outline);
        this.outlineIsProvided = outline != null;
        d();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void u(float f) {
        this.rotationZ = f;
        this.renderNode.setRotation(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void v(f43 density, LayoutDirection layoutDirection, GraphicsLayer layer, Function1<? super DrawScope, Unit> block) {
        Canvas canvasStart = this.renderNode.start(Math.max((int) (this.size >> 32), (int) (this.outlineSize >> 32)), Math.max((int) (this.size & 4294967295L), (int) (this.outlineSize & 4294967295L)));
        try {
            q51 q51Var = this.canvasHolder;
            Canvas internalCanvas = q51Var.getAndroidCanvas().getInternalCanvas();
            q51Var.getAndroidCanvas().d(canvasStart);
            wi androidCanvas = q51Var.getAndroidCanvas();
            androidx.compose.ui.graphics.drawscope.a aVar = this.canvasDrawScope;
            long jE = r16.e(this.size);
            f43 density2 = aVar.getDrawContext().getDensity();
            LayoutDirection layoutDirection2 = aVar.getDrawContext().getLayoutDirection();
            w41 w41VarB = aVar.getDrawContext().b();
            long jD = aVar.getDrawContext().d();
            GraphicsLayer graphicsLayer = aVar.getDrawContext().getGraphicsLayer();
            vg3 drawContext = aVar.getDrawContext();
            drawContext.e(density);
            drawContext.a(layoutDirection);
            drawContext.i(androidCanvas);
            drawContext.c(jE);
            drawContext.h(layer);
            androidCanvas.v();
            try {
                block.invoke(aVar);
                androidCanvas.o();
                vg3 drawContext2 = aVar.getDrawContext();
                drawContext2.e(density2);
                drawContext2.a(layoutDirection2);
                drawContext2.i(w41VarB);
                drawContext2.c(jD);
                drawContext2.h(graphicsLayer);
                q51Var.getAndroidCanvas().d(internalCanvas);
                this.renderNode.end(canvasStart);
                J(false);
            } catch (Throwable th) {
                androidCanvas.o();
                vg3 drawContext3 = aVar.getDrawContext();
                drawContext3.e(density2);
                drawContext3.a(layoutDirection2);
                drawContext3.i(w41VarB);
                drawContext3.c(jD);
                drawContext3.h(graphicsLayer);
                throw th;
            }
        } catch (Throwable th2) {
            this.renderNode.end(canvasStart);
            throw th2;
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void w(w41 canvas) {
        DisplayListCanvas displayListCanvasD = xi.d(canvas);
        Intrinsics.h(displayListCanvasD, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        displayListCanvasD.drawRenderNode(this.renderNode);
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

    public /* synthetic */ b(View view, long j, q51 q51Var, androidx.compose.ui.graphics.drawscope.a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, j, (i & 4) != 0 ? new q51() : q51Var, (i & 8) != 0 ? new androidx.compose.ui.graphics.drawscope.a() : aVar);
    }
}
