package androidx.compose.ui.graphics;

import com.google.inputmethod.ega;
import com.google.inputmethod.f43;
import com.google.inputmethod.tsb;
import com.google.inputmethod.xkb;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\b\u0010\u0004\"\u0004\b\t\u0010\u0006R\u001c\u0010\r\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\u0004\"\u0004\b\f\u0010\u0006R\u001c\u0010\u0010\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u0004\"\u0004\b\u000f\u0010\u0006R\u001c\u0010\u0013\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0004\"\u0004\b\u0012\u0010\u0006R\u001c\u0010\u0016\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0004\"\u0004\b\u0015\u0010\u0006R$\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00178V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\u001c\u0010\"\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b \u0010\u0004\"\u0004\b!\u0010\u0006R\u001c\u0010%\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b#\u0010\u0004\"\u0004\b$\u0010\u0006R\u001c\u0010(\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b&\u0010\u0004\"\u0004\b'\u0010\u0006R\u001c\u0010+\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b)\u0010\u0004\"\u0004\b*\u0010\u0006R\u001c\u0010/\u001a\u00020,8&@&X¦\u000e¢\u0006\f\u001a\u0004\b-\u0010\u001a\"\u0004\b.\u0010\u001cR\u001c\u00105\u001a\u0002008&@&X¦\u000e¢\u0006\f\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010=\u001a\u0002068&@&X¦\u000e¢\u0006\u0012\u0012\u0004\b;\u0010<\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R(\u0010D\u001a\u0004\u0018\u00010>2\b\u0010?\u001a\u0004\u0018\u00010>8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR$\u0010J\u001a\u00020E2\u0006\u0010?\u001a\u00020E8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR(\u0010P\u001a\u0004\u0018\u00010K2\b\u0010?\u001a\u0004\u0018\u00010K8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR$\u0010R\u001a\u00020Q2\u0006\u0010R\u001a\u00020Q8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bS\u0010G\"\u0004\bT\u0010IR\u0014\u0010W\u001a\u00020U8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bV\u0010\u001aø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006XÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/m;", "Lcom/google/android/f43;", "", "K", "()F", "G", "(F)V", "scaleX", "P", "M", "scaleY", "getAlpha", "c", "alpha", "y", "setTranslationX", "translationX", "x", "setTranslationY", "translationY", "getShadowElevation", "s", "shadowElevation", "Lcom/google/android/ei1;", "ambientShadowColor", "getAmbientShadowColor-0d7_KjU", "()J", "E", "(J)V", "spotShadowColor", "getSpotShadowColor-0d7_KjU", "I", "O", "p", "rotationX", "C", "q", "rotationY", "g", "u", "rotationZ", "k", "o", "cameraDistance", "Landroidx/compose/ui/graphics/t;", "H", "i0", "transformOrigin", "Lcom/google/android/xkb;", "getShape", "()Lcom/google/android/xkb;", "R0", "(Lcom/google/android/xkb;)V", "shape", "", "getClip", "()Z", "l", "(Z)V", "getClip$annotations", "()V", "clip", "Lcom/google/android/ega;", "_", "getRenderEffect", "()Lcom/google/android/ega;", "B", "(Lcom/google/android/ega;)V", "renderEffect", "Landroidx/compose/ui/graphics/e;", "getBlendMode-0nO6VwU", "()I", "e", "(I)V", "blendMode", "Landroidx/compose/ui/graphics/h;", "getColorFilter", "()Landroidx/compose/ui/graphics/h;", "h", "(Landroidx/compose/ui/graphics/h;)V", "colorFilter", "Landroidx/compose/ui/graphics/j;", "compositingStrategy", "getCompositingStrategy--NrFUSI", "V", "Lcom/google/android/tsb;", "d", "size", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface m extends f43 {
    default void B(ega egaVar) {
    }

    float C();

    default void E(long j) {
    }

    void G(float f);

    long H();

    default void I(long j) {
    }

    float K();

    void M(float f);

    float O();

    float P();

    void R0(xkb xkbVar);

    default void V(int i) {
    }

    void c(float f);

    default long d() {
        return tsb.INSTANCE.a();
    }

    default void e(int i) {
    }

    float g();

    default void h(h hVar) {
    }

    void i0(long j);

    float k();

    void l(boolean z);

    void o(float f);

    void p(float f);

    void q(float f);

    void s(float f);

    void setTranslationX(float f);

    void setTranslationY(float f);

    void u(float f);

    float x();

    float y();
}
