package androidx.compose.ui.graphics;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import com.google.inputmethod.bfb;
import com.google.inputmethod.bo6;
import com.google.inputmethod.dj7;
import com.google.inputmethod.ega;
import com.google.inputmethod.ei1;
import com.google.inputmethod.fj7;
import com.google.inputmethod.mq1;
import com.google.inputmethod.nfb;
import com.google.inputmethod.xkb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bE\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B©\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\r\u0010#\u001a\u00020\"¢\u0006\u0004\b#\u0010$J#\u0010+\u001a\u00020**\u00020%2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u0013\u00101\u001a\u00020\"*\u000200H\u0016¢\u0006\u0004\b1\u00102R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u00104\u001a\u0004\b:\u00106\"\u0004\b;\u00108R\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u00104\u001a\u0004\b=\u00106\"\u0004\b>\u00108R\"\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u00104\u001a\u0004\b@\u00106\"\u0004\bA\u00108R\"\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u00104\u001a\u0004\bC\u00106\"\u0004\bD\u00108R\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u00104\u001a\u0004\bF\u00106\"\u0004\b?\u00108R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u00104\u001a\u0004\bH\u00106\"\u0004\b3\u00108R\"\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u00104\u001a\u0004\bJ\u00106\"\u0004\b9\u00108R\"\u0010\r\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u00104\u001a\u0004\bK\u00106\"\u0004\bE\u00108R\"\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u00104\u001a\u0004\bL\u00106\"\u0004\bM\u00108R\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R$\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010`\u001a\u0004\ba\u0010b\"\u0004\bZ\u0010cR\"\u0010\u0018\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bd\u0010O\u001a\u0004\be\u0010Q\"\u0004\bf\u0010SR\"\u0010\u0019\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010O\u001a\u0004\bg\u0010Q\"\u0004\bh\u0010SR\"\u0010\u001b\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\"\u0010\u001d\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010h\u001a\u0004\bm\u0010j\"\u0004\bn\u0010lR$\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\u001a\u0010u\u001a\u00020\u00138\u0016X\u0096D¢\u0006\f\n\u0004\bh\u0010[\u001a\u0004\bt\u0010]R\"\u0010y\u001a\u000e\u0012\u0004\u0012\u00020w\u0012\u0004\u0012\u00020\"0v8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010xR\u0014\u0010{\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bz\u0010]¨\u0006|"}, d2 = {"Landroidx/compose/ui/graphics/SimpleGraphicsLayerModifier;", "Landroidx/compose/ui/node/c;", "Lcom/google/android/bfb;", "Landroidx/compose/ui/b$c;", "", "scaleX", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "Landroidx/compose/ui/graphics/t;", "transformOrigin", "Lcom/google/android/xkb;", "shape", "", "clip", "Lcom/google/android/ega;", "renderEffect", "Lcom/google/android/ei1;", "ambientShadowColor", "spotShadowColor", "Landroidx/compose/ui/graphics/j;", "compositingStrategy", "Landroidx/compose/ui/graphics/e;", "blendMode", "Landroidx/compose/ui/graphics/h;", "colorFilter", "<init>", "(FFFFFFFFFFJLcom/google/android/xkb;ZLcom/google/android/ega;JJIILandroidx/compose/ui/graphics/h;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "x3", "()V", "Landroidx/compose/ui/layout/j;", "Lcom/google/android/dj7;", "measurable", "Lcom/google/android/kx1;", "constraints", "Lcom/google/android/fj7;", "b", "(Landroidx/compose/ui/layout/j;Lcom/google/android/dj7;J)Lcom/google/android/fj7;", "", "toString", "()Ljava/lang/String;", "Lcom/google/android/nfb;", "H0", "(Lcom/google/android/nfb;)V", "p", "F", "K", "()F", "G", "(F)V", "q", "P", "M", "r", "n3", "c", "s", "y", "setTranslationX", "t", "x", "setTranslationY", "u", "u3", "v", "O", "w", "C", "g", "k", "o", "z", "J", "H", "()J", "i0", "(J)V", "A", "Lcom/google/android/xkb;", "v3", "()Lcom/google/android/xkb;", "R0", "(Lcom/google/android/xkb;)V", "B", "Z", "q3", "()Z", "l", "(Z)V", "Lcom/google/android/ega;", "t3", "()Lcom/google/android/ega;", "(Lcom/google/android/ega;)V", "D", "o3", "E", "w3", "I", "s3", "()I", "V", "(I)V", "p3", "e", "Landroidx/compose/ui/graphics/h;", "r3", "()Landroidx/compose/ui/graphics/h;", "h", "(Landroidx/compose/ui/graphics/h;)V", "o1", "isImportantForBounds", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/m;", "Lkotlin/jvm/functions/Function1;", "layerBlock", "Q2", "shouldAutoInvalidate", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class SimpleGraphicsLayerModifier extends androidx.compose.ui.b.c implements androidx.compose.ui.node.c, bfb {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata and from toString */
    private xkb shape;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata and from toString */
    private boolean clip;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata and from toString */
    private ega renderEffect;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata and from toString */
    private long ambientShadowColor;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata and from toString */
    private long spotShadowColor;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata and from toString */
    private int compositingStrategy;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata and from toString */
    private int blendMode;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata and from toString */
    private h colorFilter;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final boolean isImportantForBounds;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private Function1<? super m, Unit> layerBlock;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata and from toString */
    private float scaleX;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata and from toString */
    private float scaleY;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private float alpha;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata and from toString */
    private float translationX;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata and from toString */
    private float translationY;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata and from toString */
    private float shadowElevation;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata and from toString */
    private float rotationX;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata and from toString */
    private float rotationY;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata and from toString */
    private float rotationZ;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata and from toString */
    private float cameraDistance;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata and from toString */
    private long transformOrigin;

    public /* synthetic */ SimpleGraphicsLayerModifier(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, xkb xkbVar, boolean z, ega egaVar, long j2, long j3, int i, int i2, h hVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, j, xkbVar, z, egaVar, j2, j3, i, i2, hVar);
    }

    public final void B(ega egaVar) {
        this.renderEffect = egaVar;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final float getRotationY() {
        return this.rotationY;
    }

    public final void E(long j) {
        this.ambientShadowColor = j;
    }

    public final void G(float f) {
        this.scaleX = f;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final long getTransformOrigin() {
        return this.transformOrigin;
    }

    @Override // com.google.inputmethod.bfb
    public void H0(nfb nfbVar) {
        if (mq1.isGraphicsLayerShapeSemanticsEnabled && this.clip) {
            SemanticsPropertiesKt.t0(nfbVar, this.shape);
        }
    }

    public final void I(long j) {
        this.spotShadowColor = j;
    }

    /* JADX INFO: renamed from: K, reason: from getter */
    public final float getScaleX() {
        return this.scaleX;
    }

    public final void M(float f) {
        this.scaleY = f;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final float getRotationX() {
        return this.rotationX;
    }

    /* JADX INFO: renamed from: P, reason: from getter */
    public final float getScaleY() {
        return this.scaleY;
    }

    @Override // androidx.compose.ui.b.c
    /* JADX INFO: renamed from: Q2 */
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    public final void R0(xkb xkbVar) {
        this.shape = xkbVar;
    }

    public final void V(int i) {
        this.compositingStrategy = i;
    }

    @Override // androidx.compose.ui.node.c
    public fj7 b(androidx.compose.ui.layout.j jVar, dj7 dj7Var, long j) {
        final androidx.compose.ui.layout.o oVarR0 = dj7Var.r0(j);
        return androidx.compose.ui.layout.j.Q1(jVar, oVarR0.getWidth(), oVarR0.getHeight(), null, new Function1<androidx.compose.ui.layout.o.a, Unit>() { // from class: androidx.compose.ui.graphics.SimpleGraphicsLayerModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((androidx.compose.ui.layout.o.a) obj);
                return Unit.a;
            }

            public final void invoke(androidx.compose.ui.layout.o.a aVar) {
                androidx.compose.ui.layout.o.a.d0(aVar, oVarR0, 0, 0, 0.0f, this.layerBlock, 4, null);
            }
        }, 4, null);
    }

    public final void c(float f) {
        this.alpha = f;
    }

    public final void e(int i) {
        this.blendMode = i;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final float getRotationZ() {
        return this.rotationZ;
    }

    public final void h(h hVar) {
        this.colorFilter = hVar;
    }

    public final void i0(long j) {
        this.transformOrigin = j;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final float getCameraDistance() {
        return this.cameraDistance;
    }

    public final void l(boolean z) {
        this.clip = z;
    }

    /* JADX INFO: renamed from: n3, reason: from getter */
    public final float getAlpha() {
        return this.alpha;
    }

    public final void o(float f) {
        this.cameraDistance = f;
    }

    @Override // com.google.inputmethod.bfb
    /* JADX INFO: renamed from: o1, reason: from getter */
    public boolean getIsImportantForBounds() {
        return this.isImportantForBounds;
    }

    /* JADX INFO: renamed from: o3, reason: from getter */
    public final long getAmbientShadowColor() {
        return this.ambientShadowColor;
    }

    public final void p(float f) {
        this.rotationX = f;
    }

    /* JADX INFO: renamed from: p3, reason: from getter */
    public final int getBlendMode() {
        return this.blendMode;
    }

    public final void q(float f) {
        this.rotationY = f;
    }

    /* JADX INFO: renamed from: q3, reason: from getter */
    public final boolean getClip() {
        return this.clip;
    }

    /* JADX INFO: renamed from: r3, reason: from getter */
    public final h getColorFilter() {
        return this.colorFilter;
    }

    public final void s(float f) {
        this.shadowElevation = f;
    }

    /* JADX INFO: renamed from: s3, reason: from getter */
    public final int getCompositingStrategy() {
        return this.compositingStrategy;
    }

    public final void setTranslationX(float f) {
        this.translationX = f;
    }

    public final void setTranslationY(float f) {
        this.translationY = f;
    }

    /* JADX INFO: renamed from: t3, reason: from getter */
    public final ega getRenderEffect() {
        return this.renderEffect;
    }

    public String toString() {
        return "SimpleGraphicsLayerModifier(scaleX=" + this.scaleX + ", scaleY=" + this.scaleY + ", alpha = " + this.alpha + ", translationX=" + this.translationX + ", translationY=" + this.translationY + ", shadowElevation=" + this.shadowElevation + ", rotationX=" + this.rotationX + ", rotationY=" + this.rotationY + ", rotationZ=" + this.rotationZ + ", cameraDistance=" + this.cameraDistance + ", transformOrigin=" + ((Object) t.i(this.transformOrigin)) + ", shape=" + this.shape + ", clip=" + this.clip + ", renderEffect=" + this.renderEffect + ", ambientShadowColor=" + ((Object) ei1.y(this.ambientShadowColor)) + ", spotShadowColor=" + ((Object) ei1.y(this.spotShadowColor)) + ", compositingStrategy=" + ((Object) j.g(this.compositingStrategy)) + ", blendMode=" + ((Object) e.G(this.blendMode)) + ", colorFilter=" + this.colorFilter + ')';
    }

    public final void u(float f) {
        this.rotationZ = f;
    }

    /* JADX INFO: renamed from: u3, reason: from getter */
    public final float getShadowElevation() {
        return this.shadowElevation;
    }

    /* JADX INFO: renamed from: v3, reason: from getter */
    public final xkb getShape() {
        return this.shape;
    }

    /* JADX INFO: renamed from: w3, reason: from getter */
    public final long getSpotShadowColor() {
        return this.spotShadowColor;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final float getTranslationY() {
        return this.translationY;
    }

    public final void x3() {
        bo6.e(this, this.layerBlock);
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final float getTranslationX() {
        return this.translationX;
    }

    private SimpleGraphicsLayerModifier(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, xkb xkbVar, boolean z, ega egaVar, long j2, long j3, int i, int i2, h hVar) {
        this.scaleX = f;
        this.scaleY = f2;
        this.alpha = f3;
        this.translationX = f4;
        this.translationY = f5;
        this.shadowElevation = f6;
        this.rotationX = f7;
        this.rotationY = f8;
        this.rotationZ = f9;
        this.cameraDistance = f10;
        this.transformOrigin = j;
        this.shape = xkbVar;
        this.clip = z;
        this.renderEffect = egaVar;
        this.ambientShadowColor = j2;
        this.spotShadowColor = j3;
        this.compositingStrategy = i;
        this.blendMode = i2;
        this.colorFilter = hVar;
        this.layerBlock = new Function1<m, Unit>() { // from class: androidx.compose.ui.graphics.SimpleGraphicsLayerModifier$layerBlock$1
            {
                super(1);
            }

            public final void a(m mVar) {
                mVar.G(this.this$0.getScaleX());
                mVar.M(this.this$0.getScaleY());
                mVar.c(this.this$0.getAlpha());
                mVar.setTranslationX(this.this$0.getTranslationX());
                mVar.setTranslationY(this.this$0.getTranslationY());
                mVar.s(this.this$0.getShadowElevation());
                mVar.p(this.this$0.getRotationX());
                mVar.q(this.this$0.getRotationY());
                mVar.u(this.this$0.getRotationZ());
                mVar.o(this.this$0.getCameraDistance());
                mVar.i0(this.this$0.getTransformOrigin());
                mVar.R0(this.this$0.getShape());
                mVar.l(this.this$0.getClip());
                mVar.B(this.this$0.getRenderEffect());
                mVar.E(this.this$0.getAmbientShadowColor());
                mVar.I(this.this$0.getSpotShadowColor());
                mVar.V(this.this$0.getCompositingStrategy());
                mVar.e(this.this$0.getBlendMode());
                mVar.h(this.this$0.getColorFilter());
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((m) obj);
                return Unit.a;
            }
        };
    }
}
