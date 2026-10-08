package androidx.compose.ui.graphics;

import com.google.inputmethod.ega;
import com.google.inputmethod.ei1;
import com.google.inputmethod.uy7;
import com.google.inputmethod.xkb;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.k, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b5\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B£\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0002H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\u0002H\u0016¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020\u00122\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b!\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b%\u00101\u001a\u0004\b4\u00103R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b5\u00101\u001a\u0004\b6\u00103R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b7\u00101\u001a\u0004\b8\u00103R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b9\u00101\u001a\u0004\b:\u00103R\u0017\u0010\t\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b;\u00101\u001a\u0004\b<\u00103R\u0017\u0010\n\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b=\u00101\u001a\u0004\b>\u00103R\u0017\u0010\u000b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b?\u00101\u001a\u0004\b@\u00103R\u0017\u0010\f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bA\u00101\u001a\u0004\bB\u00103R\u0017\u0010\r\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bC\u00101\u001a\u0004\bD\u00103R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bU\u0010F\u001a\u0004\bV\u0010HR\u0017\u0010\u0018\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bW\u0010F\u001a\u0004\bX\u0010HR\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010,R\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\\\u0010Z\u001a\u0004\b]\u0010,R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a¨\u0006b"}, d2 = {"Landroidx/compose/ui/graphics/k;", "Lcom/google/android/uy7;", "Landroidx/compose/ui/graphics/SimpleGraphicsLayerModifier;", "", "scaleX", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "Landroidx/compose/ui/graphics/t;", "transformOrigin", "Lcom/google/android/xkb;", "shape", "", "clip", "Lcom/google/android/ega;", "renderEffect", "Lcom/google/android/ei1;", "ambientShadowColor", "spotShadowColor", "Landroidx/compose/ui/graphics/j;", "compositingStrategy", "Landroidx/compose/ui/graphics/e;", "blendMode", "Landroidx/compose/ui/graphics/h;", "colorFilter", "<init>", "(FFFFFFFFFFJLcom/google/android/xkb;ZLcom/google/android/ega;JJIILandroidx/compose/ui/graphics/h;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "d", "()Landroidx/compose/ui/graphics/SimpleGraphicsLayerModifier;", "node", "", "e", "(Landroidx/compose/ui/graphics/SimpleGraphicsLayerModifier;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "F", "getScaleX", "()F", "getScaleY", "f", "getAlpha", "g", "getTranslationX", "h", "getTranslationY", "i", "getShadowElevation", "j", "getRotationX", "k", "getRotationY", "l", "getRotationZ", "m", "getCameraDistance", "n", "J", "getTransformOrigin-SzJe1aQ", "()J", "o", "Lcom/google/android/xkb;", "getShape", "()Lcom/google/android/xkb;", "p", "Z", "getClip", "()Z", "q", "Lcom/google/android/ega;", "getRenderEffect", "()Lcom/google/android/ega;", "r", "getAmbientShadowColor-0d7_KjU", "s", "getSpotShadowColor-0d7_KjU", "t", "I", "getCompositingStrategy--NrFUSI", "u", "getBlendMode-0nO6VwU", "v", "Landroidx/compose/ui/graphics/h;", "getColorFilter", "()Landroidx/compose/ui/graphics/h;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class GraphicsLayerElement extends uy7<SimpleGraphicsLayerModifier> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final float scaleX;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final float scaleY;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final float alpha;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private final float translationX;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    private final float translationY;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    private final float shadowElevation;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    private final float rotationX;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    private final float rotationY;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
    private final float rotationZ;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
    private final float cameraDistance;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata and from toString */
    private final long transformOrigin;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata and from toString */
    private final xkb shape;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata and from toString */
    private final boolean clip;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata and from toString */
    private final ega renderEffect;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata and from toString */
    private final long ambientShadowColor;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata and from toString */
    private final long spotShadowColor;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata and from toString */
    private final int compositingStrategy;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata and from toString */
    private final int blendMode;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata and from toString */
    private final h colorFilter;

    public /* synthetic */ GraphicsLayerElement(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, xkb xkbVar, boolean z, ega egaVar, long j2, long j3, int i, int i2, h hVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, j, xkbVar, z, egaVar, j2, j3, i, i2, hVar);
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public SimpleGraphicsLayerModifier a() {
        return new SimpleGraphicsLayerModifier(this.scaleX, this.scaleY, this.alpha, this.translationX, this.translationY, this.shadowElevation, this.rotationX, this.rotationY, this.rotationZ, this.cameraDistance, this.transformOrigin, this.shape, this.clip, this.renderEffect, this.ambientShadowColor, this.spotShadowColor, this.compositingStrategy, this.blendMode, this.colorFilter, null);
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(SimpleGraphicsLayerModifier node) {
        node.G(this.scaleX);
        node.M(this.scaleY);
        node.c(this.alpha);
        node.setTranslationX(this.translationX);
        node.setTranslationY(this.translationY);
        node.s(this.shadowElevation);
        node.p(this.rotationX);
        node.q(this.rotationY);
        node.u(this.rotationZ);
        node.o(this.cameraDistance);
        node.i0(this.transformOrigin);
        node.R0(this.shape);
        node.l(this.clip);
        node.B(this.renderEffect);
        node.E(this.ambientShadowColor);
        node.I(this.spotShadowColor);
        node.V(this.compositingStrategy);
        node.e(this.blendMode);
        node.h(this.colorFilter);
        node.x3();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) other;
        return Float.compare(this.scaleX, graphicsLayerElement.scaleX) == 0 && Float.compare(this.scaleY, graphicsLayerElement.scaleY) == 0 && Float.compare(this.alpha, graphicsLayerElement.alpha) == 0 && Float.compare(this.translationX, graphicsLayerElement.translationX) == 0 && Float.compare(this.translationY, graphicsLayerElement.translationY) == 0 && Float.compare(this.shadowElevation, graphicsLayerElement.shadowElevation) == 0 && Float.compare(this.rotationX, graphicsLayerElement.rotationX) == 0 && Float.compare(this.rotationY, graphicsLayerElement.rotationY) == 0 && Float.compare(this.rotationZ, graphicsLayerElement.rotationZ) == 0 && Float.compare(this.cameraDistance, graphicsLayerElement.cameraDistance) == 0 && t.e(this.transformOrigin, graphicsLayerElement.transformOrigin) && Intrinsics.e(this.shape, graphicsLayerElement.shape) && this.clip == graphicsLayerElement.clip && Intrinsics.e(this.renderEffect, graphicsLayerElement.renderEffect) && ei1.r(this.ambientShadowColor, graphicsLayerElement.ambientShadowColor) && ei1.r(this.spotShadowColor, graphicsLayerElement.spotShadowColor) && j.e(this.compositingStrategy, graphicsLayerElement.compositingStrategy) && e.E(this.blendMode, graphicsLayerElement.blendMode) && Intrinsics.e(this.colorFilter, graphicsLayerElement.colorFilter);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((Float.hashCode(this.scaleX) * 31) + Float.hashCode(this.scaleY)) * 31) + Float.hashCode(this.alpha)) * 31) + Float.hashCode(this.translationX)) * 31) + Float.hashCode(this.translationY)) * 31) + Float.hashCode(this.shadowElevation)) * 31) + Float.hashCode(this.rotationX)) * 31) + Float.hashCode(this.rotationY)) * 31) + Float.hashCode(this.rotationZ)) * 31) + Float.hashCode(this.cameraDistance)) * 31) + t.h(this.transformOrigin)) * 31) + this.shape.hashCode()) * 31) + Boolean.hashCode(this.clip)) * 31;
        ega egaVar = this.renderEffect;
        int iHashCode2 = (((((((((iHashCode + (egaVar == null ? 0 : egaVar.hashCode())) * 31) + ei1.x(this.ambientShadowColor)) * 31) + ei1.x(this.spotShadowColor)) * 31) + j.f(this.compositingStrategy)) * 31) + e.F(this.blendMode)) * 31;
        h hVar = this.colorFilter;
        return iHashCode2 + (hVar != null ? hVar.hashCode() : 0);
    }

    public String toString() {
        return "GraphicsLayerElement(scaleX=" + this.scaleX + ", scaleY=" + this.scaleY + ", alpha=" + this.alpha + ", translationX=" + this.translationX + ", translationY=" + this.translationY + ", shadowElevation=" + this.shadowElevation + ", rotationX=" + this.rotationX + ", rotationY=" + this.rotationY + ", rotationZ=" + this.rotationZ + ", cameraDistance=" + this.cameraDistance + ", transformOrigin=" + ((Object) t.i(this.transformOrigin)) + ", shape=" + this.shape + ", clip=" + this.clip + ", renderEffect=" + this.renderEffect + ", ambientShadowColor=" + ((Object) ei1.y(this.ambientShadowColor)) + ", spotShadowColor=" + ((Object) ei1.y(this.spotShadowColor)) + ", compositingStrategy=" + ((Object) j.g(this.compositingStrategy)) + ", blendMode=" + ((Object) e.G(this.blendMode)) + ", colorFilter=" + this.colorFilter + ')';
    }

    private GraphicsLayerElement(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, xkb xkbVar, boolean z, ega egaVar, long j2, long j3, int i, int i2, h hVar) {
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
    }
}
