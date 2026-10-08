package androidx.compose.ui.graphics.layer;

import android.graphics.Matrix;
import android.graphics.Outline;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.inputmethod.ega;
import com.google.inputmethod.ei1;
import com.google.inputmethod.f43;
import com.google.inputmethod.w41;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b`\u0018\u0000 02\u00020\u0001:\u0001qJ'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u0005H&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J;\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00070\u0019H&¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0007H&¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H&¢\u0006\u0004\b!\u0010\"R\u001c\u0010(\u001a\u00020#8&@&X¦\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001c\u0010.\u001a\u00020)8&@&X¦\u000e¢\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u00104\u001a\u00020/8&@&X¦\u000e¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001c\u00108\u001a\u0002058&@&X¦\u000e¢\u0006\f\u001a\u0004\b6\u0010%\"\u0004\b7\u0010'R\u001e\u0010>\u001a\u0004\u0018\u0001098&@&X¦\u000e¢\u0006\f\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001c\u0010A\u001a\u00020/8&@&X¦\u000e¢\u0006\f\u001a\u0004\b?\u00101\"\u0004\b@\u00103R\u001c\u0010D\u001a\u00020/8&@&X¦\u000e¢\u0006\f\u001a\u0004\bB\u00101\"\u0004\bC\u00103R\u001c\u0010F\u001a\u00020/8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u00101\"\u0004\bE\u00103R\u001c\u0010H\u001a\u00020/8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u00101\"\u0004\bG\u00103R\u001c\u0010K\u001a\u00020/8&@&X¦\u000e¢\u0006\f\u001a\u0004\bI\u00101\"\u0004\bJ\u00103R\u001c\u0010O\u001a\u00020L8&@&X¦\u000e¢\u0006\f\u001a\u0004\bM\u0010+\"\u0004\bN\u0010-R\u001c\u0010R\u001a\u00020L8&@&X¦\u000e¢\u0006\f\u001a\u0004\bP\u0010+\"\u0004\bQ\u0010-R\u001c\u0010U\u001a\u00020/8&@&X¦\u000e¢\u0006\f\u001a\u0004\bS\u00101\"\u0004\bT\u00103R\u001c\u0010X\u001a\u00020/8&@&X¦\u000e¢\u0006\f\u001a\u0004\bV\u00101\"\u0004\bW\u00103R\u001c\u0010[\u001a\u00020/8&@&X¦\u000e¢\u0006\f\u001a\u0004\bY\u00101\"\u0004\bZ\u00103R\u001c\u0010^\u001a\u00020/8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\\\u00101\"\u0004\b]\u00103R\u001c\u0010d\u001a\u00020_8&@&X¦\u000e¢\u0006\f\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u001e\u0010j\u001a\u0004\u0018\u00010e8&@&X¦\u000e¢\u0006\f\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\u001c\u0010k\u001a\u00020_8&@&X¦\u000e¢\u0006\f\u001a\u0004\bk\u0010a\"\u0004\bl\u0010cR\u0014\u0010n\u001a\u00020_8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bm\u0010aR\u0014\u0010p\u001a\u00020_8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bo\u0010aø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006rÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;", "", "", "x", "y", "Lcom/google/android/q16;", "size", "", "F", "(IIJ)V", "Landroid/graphics/Outline;", "outline", "outlineSize", "t", "(Landroid/graphics/Outline;J)V", "Lcom/google/android/w41;", "canvas", "w", "(Lcom/google/android/w41;)V", "Lcom/google/android/f43;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "block", "v", "(Lcom/google/android/f43;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/layer/GraphicsLayer;Lkotlin/jvm/functions/Function1;)V", "A", "()V", "Landroid/graphics/Matrix;", "n", "()Landroid/graphics/Matrix;", "Landroidx/compose/ui/graphics/layer/a;", "D", "()I", "N", "(I)V", "compositingStrategy", "Lcom/google/android/rn8;", "getPivotOffset-F1C5BW0", "()J", "L", "(J)V", "pivotOffset", "", "a", "()F", "c", "(F)V", "alpha", "Landroidx/compose/ui/graphics/e;", "f", "e", "blendMode", "Landroidx/compose/ui/graphics/h;", "b", "()Landroidx/compose/ui/graphics/h;", "h", "(Landroidx/compose/ui/graphics/h;)V", "colorFilter", "K", "G", "scaleX", "P", "M", "scaleY", "setTranslationX", "translationX", "setTranslationY", "translationY", "z", "s", "shadowElevation", "Lcom/google/android/ei1;", "H", "E", "ambientShadowColor", "m", "I", "spotShadowColor", "O", "p", "rotationX", "C", "q", "rotationY", "g", "u", "rotationZ", "k", "o", "cameraDistance", "", "getClip", "()Z", "l", "(Z)V", "clip", "Lcom/google/android/ega;", "i", "()Lcom/google/android/ega;", "B", "(Lcom/google/android/ega;)V", "renderEffect", "isInvalidated", "J", "r", "supportsSoftwareRendering", "j", "hasDisplayList", "Companion", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface GraphicsLayerImpl {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.a;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "b", "Lkotlin/jvm/functions/Function1;", "a", "()Lkotlin/jvm/functions/Function1;", "DefaultDrawBlock", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion a = new Companion();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private static final Function1<DrawScope, Unit> DefaultDrawBlock = new Function1<DrawScope, Unit>() { // from class: androidx.compose.ui.graphics.layer.GraphicsLayerImpl$Companion$DefaultDrawBlock$1
            public final void a(DrawScope drawScope) {
                DrawScope.T0(drawScope, ei1.INSTANCE.h(), 0L, 0L, 0.0f, null, null, 0, 126, null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((DrawScope) obj);
                return Unit.a;
            }
        };

        private Companion() {
        }

        public final Function1<DrawScope, Unit> a() {
            return DefaultDrawBlock;
        }
    }

    void A();

    void B(ega egaVar);

    /* JADX INFO: renamed from: C */
    float getRotationY();

    /* JADX INFO: renamed from: D */
    int getCompositingStrategy();

    void E(long j);

    void F(int x, int y, long size);

    void G(float f);

    /* JADX INFO: renamed from: H */
    long getAmbientShadowColor();

    void I(long j);

    void J(boolean z);

    /* JADX INFO: renamed from: K */
    float getScaleX();

    void L(long j);

    void M(float f);

    void N(int i);

    /* JADX INFO: renamed from: O */
    float getRotationX();

    /* JADX INFO: renamed from: P */
    float getScaleY();

    /* JADX INFO: renamed from: a */
    float getAlpha();

    /* JADX INFO: renamed from: b */
    androidx.compose.ui.graphics.h getColorFilter();

    void c(float f);

    void e(int i);

    /* JADX INFO: renamed from: f */
    int getBlendMode();

    /* JADX INFO: renamed from: g */
    float getRotationZ();

    void h(androidx.compose.ui.graphics.h hVar);

    /* JADX INFO: renamed from: i */
    ega getRenderEffect();

    default boolean j() {
        return true;
    }

    /* JADX INFO: renamed from: k */
    float getCameraDistance();

    void l(boolean z);

    /* JADX INFO: renamed from: m */
    long getSpotShadowColor();

    Matrix n();

    void o(float f);

    void p(float f);

    void q(float f);

    /* JADX INFO: renamed from: r */
    default boolean getSupportsSoftwareRendering() {
        return false;
    }

    void s(float f);

    void setTranslationX(float f);

    void setTranslationY(float f);

    void t(Outline outline, long outlineSize);

    void u(float f);

    void v(f43 density, LayoutDirection layoutDirection, GraphicsLayer layer, Function1<? super DrawScope, Unit> block);

    void w(w41 canvas);

    /* JADX INFO: renamed from: x */
    float getTranslationY();

    /* JADX INFO: renamed from: y */
    float getTranslationX();

    /* JADX INFO: renamed from: z */
    float getShadowElevation();
}
