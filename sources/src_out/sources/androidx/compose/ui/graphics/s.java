package androidx.compose.ui.graphics;

import androidx.compose.ui.unit.LayoutDirection;
import com.google.inputmethod.ega;
import com.google.inputmethod.ei1;
import com.google.inputmethod.f43;
import com.google.inputmethod.k43;
import com.google.inputmethod.l05;
import com.google.inputmethod.tsb;
import com.google.inputmethod.xkb;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0003R\"\u0010\u000e\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR*\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R*\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R*\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014\"\u0004\b\u0018\u0010\u0016R*\u0010!\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0012\u001a\u0004\b\u001f\u0010\u0014\"\u0004\b \u0010\u0016R*\u0010%\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0012\u001a\u0004\b#\u0010\u0014\"\u0004\b$\u0010\u0016R*\u0010)\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b&\u0010\u0012\u001a\u0004\b'\u0010\u0014\"\u0004\b(\u0010\u0016R*\u0010/\u001a\u00020*2\u0006\u0010\u0010\u001a\u00020*8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b+\u0010'\u001a\u0004\b\"\u0010,\"\u0004\b-\u0010.R*\u00102\u001a\u00020*2\u0006\u0010\u0010\u001a\u00020*8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b0\u0010'\u001a\u0004\b1\u0010,\"\u0004\b\t\u0010.R*\u00106\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b3\u0010\u0012\u001a\u0004\b4\u0010\u0014\"\u0004\b5\u0010\u0016R*\u0010:\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b7\u0010\u0012\u001a\u0004\b8\u0010\u0014\"\u0004\b9\u0010\u0016R*\u0010=\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b;\u0010\u0012\u001a\u0004\b&\u0010\u0014\"\u0004\b<\u0010\u0016R*\u0010@\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b>\u0010\u0012\u001a\u0004\b7\u0010\u0014\"\u0004\b?\u0010\u0016R*\u0010E\u001a\u00020A2\u0006\u0010\u0010\u001a\u00020A8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bB\u0010'\u001a\u0004\bC\u0010,\"\u0004\bD\u0010.R*\u0010L\u001a\u00020F2\u0006\u0010\u0010\u001a\u00020F8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b?\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR*\u0010P\u001a\u00020M2\u0006\u0010\u0010\u001a\u00020M8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b5\u0010\u0006\u001a\u0004\b3\u0010N\"\u0004\b;\u0010OR*\u0010T\u001a\u00020Q2\u0006\u0010\u0010\u001a\u00020Q8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b9\u0010\t\u001a\u0004\bR\u0010\u000b\"\u0004\bS\u0010\rR\"\u0010W\u001a\u00020U8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bR\u0010'\u001a\u0004\b\u001c\u0010,\"\u0004\bV\u0010.R\"\u0010^\u001a\u00020X8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\"\u0010e\u001a\u00020_8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bZ\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR.\u0010k\u001a\u0004\u0018\u00010f2\b\u0010\u0010\u001a\u0004\u0018\u00010f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b<\u0010g\u001a\u0004\b\u0012\u0010h\"\u0004\bi\u0010jR.\u0010q\u001a\u0004\u0018\u00010l2\b\u0010\u0010\u001a\u0004\u0018\u00010l8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bm\u0010n\u001a\u0004\b>\u0010o\"\u0004\b+\u0010pR*\u0010s\u001a\u00020r2\u0006\u0010\u0010\u001a\u00020r8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\ba\u0010\t\u001a\u0004\b0\u0010\u000b\"\u0004\b\u001e\u0010\rR$\u0010z\u001a\u0004\u0018\u00010t8\u0000@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR\u0014\u0010|\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b{\u0010\u0014R\u0014\u0010~\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b}\u0010\u0014¨\u0006\u007f"}, d2 = {"Landroidx/compose/ui/graphics/s;", "Landroidx/compose/ui/graphics/m;", "<init>", "()V", "", "Q", "Z", "", "a", "I", "z", "()I", "setMutatedFields$ui", "(I)V", "mutatedFields", "", "value", "b", "F", "K", "()F", "G", "(F)V", "scaleX", "c", "P", "M", "scaleY", "d", "alpha", "e", "y", "setTranslationX", "translationX", "f", "x", "setTranslationY", "translationY", "g", "J", "s", "shadowElevation", "Lcom/google/android/ei1;", "h", "()J", "E", "(J)V", "ambientShadowColor", "i", "N", "spotShadowColor", "j", "O", "p", "rotationX", "k", "C", "q", "rotationY", "l", "u", "rotationZ", "m", "o", "cameraDistance", "Landroidx/compose/ui/graphics/t;", "n", "H", "i0", "transformOrigin", "Lcom/google/android/xkb;", "Lcom/google/android/xkb;", "L", "()Lcom/google/android/xkb;", "R0", "(Lcom/google/android/xkb;)V", "shape", "", "()Z", "(Z)V", "clip", "Landroidx/compose/ui/graphics/j;", "r", "V", "compositingStrategy", "Lcom/google/android/tsb;", "W", "size", "Lcom/google/android/f43;", "Lcom/google/android/f43;", "t", "()Lcom/google/android/f43;", "R", "(Lcom/google/android/f43;)V", "graphicsDensity", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/LayoutDirection;", "w", "()Landroidx/compose/ui/unit/LayoutDirection;", "T", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "layoutDirection", "Lcom/google/android/ega;", "Lcom/google/android/ega;", "()Lcom/google/android/ega;", "B", "(Lcom/google/android/ega;)V", "renderEffect", "Landroidx/compose/ui/graphics/h;", "v", "Landroidx/compose/ui/graphics/h;", "()Landroidx/compose/ui/graphics/h;", "(Landroidx/compose/ui/graphics/h;)V", "colorFilter", "Landroidx/compose/ui/graphics/e;", "blendMode", "Landroidx/compose/ui/graphics/n;", "Landroidx/compose/ui/graphics/n;", "D", "()Landroidx/compose/ui/graphics/n;", "setOutline$ui", "(Landroidx/compose/ui/graphics/n;)V", "outline", "getDensity", "density", "w2", "fontScale", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s implements m {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int mutatedFields;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private float translationX;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private float translationY;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private float shadowElevation;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private float rotationX;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private float rotationY;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private float rotationZ;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private boolean clip;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private ega renderEffect;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private h colorFilter;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private n outline;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private float scaleX = 1.0f;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private float scaleY = 1.0f;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private float alpha = 1.0f;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private long ambientShadowColor = l05.a();

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private long spotShadowColor = l05.a();

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private float cameraDistance = 8.0f;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private long transformOrigin = t.INSTANCE.a();

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private xkb shape = r.a();

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private int compositingStrategy = j.INSTANCE.a();

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private long size = tsb.INSTANCE.a();

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private f43 graphicsDensity = k43.b(1.0f, 0.0f, 2, null);

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private LayoutDirection layoutDirection = LayoutDirection.Ltr;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private int blendMode = e.INSTANCE.B();

    @Override // androidx.compose.ui.graphics.m
    public void B(ega egaVar) {
        if (Intrinsics.e(this.renderEffect, egaVar)) {
            return;
        }
        this.mutatedFields |= 131072;
        this.renderEffect = egaVar;
    }

    @Override // androidx.compose.ui.graphics.m
    /* JADX INFO: renamed from: C, reason: from getter */
    public float getRotationY() {
        return this.rotationY;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final n getOutline() {
        return this.outline;
    }

    @Override // androidx.compose.ui.graphics.m
    public void E(long j) {
        if (ei1.r(this.ambientShadowColor, j)) {
            return;
        }
        this.mutatedFields |= 64;
        this.ambientShadowColor = j;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public ega getRenderEffect() {
        return this.renderEffect;
    }

    @Override // androidx.compose.ui.graphics.m
    public void G(float f) {
        if (this.scaleX == f) {
            return;
        }
        this.mutatedFields |= 1;
        this.scaleX = f;
    }

    @Override // androidx.compose.ui.graphics.m
    /* JADX INFO: renamed from: H, reason: from getter */
    public long getTransformOrigin() {
        return this.transformOrigin;
    }

    @Override // androidx.compose.ui.graphics.m
    public void I(long j) {
        if (ei1.r(this.spotShadowColor, j)) {
            return;
        }
        this.mutatedFields |= 128;
        this.spotShadowColor = j;
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public float getShadowElevation() {
        return this.shadowElevation;
    }

    @Override // androidx.compose.ui.graphics.m
    /* JADX INFO: renamed from: K, reason: from getter */
    public float getScaleX() {
        return this.scaleX;
    }

    /* JADX INFO: renamed from: L, reason: from getter */
    public xkb getShape() {
        return this.shape;
    }

    @Override // androidx.compose.ui.graphics.m
    public void M(float f) {
        if (this.scaleY == f) {
            return;
        }
        this.mutatedFields |= 2;
        this.scaleY = f;
    }

    /* JADX INFO: renamed from: N, reason: from getter */
    public long getSpotShadowColor() {
        return this.spotShadowColor;
    }

    @Override // androidx.compose.ui.graphics.m
    /* JADX INFO: renamed from: O, reason: from getter */
    public float getRotationX() {
        return this.rotationX;
    }

    @Override // androidx.compose.ui.graphics.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public float getScaleY() {
        return this.scaleY;
    }

    public final void Q() {
        G(1.0f);
        M(1.0f);
        c(1.0f);
        setTranslationX(0.0f);
        setTranslationY(0.0f);
        s(0.0f);
        E(l05.a());
        I(l05.a());
        p(0.0f);
        q(0.0f);
        u(0.0f);
        o(8.0f);
        i0(t.INSTANCE.a());
        R0(r.a());
        l(false);
        B(null);
        h(null);
        e(e.INSTANCE.B());
        V(j.INSTANCE.a());
        W(tsb.INSTANCE.a());
        this.outline = null;
        this.mutatedFields = 0;
    }

    public final void R(f43 f43Var) {
        this.graphicsDensity = f43Var;
    }

    @Override // androidx.compose.ui.graphics.m
    public void R0(xkb xkbVar) {
        if (Intrinsics.e(this.shape, xkbVar)) {
            return;
        }
        this.mutatedFields |= 8192;
        this.shape = xkbVar;
    }

    public final void T(LayoutDirection layoutDirection) {
        this.layoutDirection = layoutDirection;
    }

    @Override // androidx.compose.ui.graphics.m
    public void V(int i) {
        if (j.e(this.compositingStrategy, i)) {
            return;
        }
        this.mutatedFields |= 32768;
        this.compositingStrategy = i;
    }

    public void W(long j) {
        this.size = j;
    }

    public final void Z() {
        this.outline = getShape().mo5createOutlinePq9zytI(getSize(), this.layoutDirection, this.graphicsDensity);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public float getAlpha() {
        return this.alpha;
    }

    @Override // androidx.compose.ui.graphics.m
    public void c(float f) {
        if (this.alpha == f) {
            return;
        }
        this.mutatedFields |= 4;
        this.alpha = f;
    }

    @Override // androidx.compose.ui.graphics.m
    /* JADX INFO: renamed from: d, reason: from getter */
    public long getSize() {
        return this.size;
    }

    @Override // androidx.compose.ui.graphics.m
    public void e(int i) {
        if (e.E(this.blendMode, i)) {
            return;
        }
        this.mutatedFields |= 524288;
        this.blendMode = i;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public long getAmbientShadowColor() {
        return this.ambientShadowColor;
    }

    @Override // androidx.compose.ui.graphics.m
    /* JADX INFO: renamed from: g, reason: from getter */
    public float getRotationZ() {
        return this.rotationZ;
    }

    @Override // com.google.inputmethod.f43
    public float getDensity() {
        return this.graphicsDensity.getDensity();
    }

    @Override // androidx.compose.ui.graphics.m
    public void h(h hVar) {
        if (Intrinsics.e(this.colorFilter, hVar)) {
            return;
        }
        this.mutatedFields |= 262144;
        this.colorFilter = hVar;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public int getBlendMode() {
        return this.blendMode;
    }

    @Override // androidx.compose.ui.graphics.m
    public void i0(long j) {
        if (t.e(this.transformOrigin, j)) {
            return;
        }
        this.mutatedFields |= 4096;
        this.transformOrigin = j;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public boolean getClip() {
        return this.clip;
    }

    @Override // androidx.compose.ui.graphics.m
    /* JADX INFO: renamed from: k, reason: from getter */
    public float getCameraDistance() {
        return this.cameraDistance;
    }

    @Override // androidx.compose.ui.graphics.m
    public void l(boolean z) {
        if (this.clip != z) {
            this.mutatedFields |= 16384;
            this.clip = z;
        }
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public h getColorFilter() {
        return this.colorFilter;
    }

    @Override // androidx.compose.ui.graphics.m
    public void o(float f) {
        if (this.cameraDistance == f) {
            return;
        }
        this.mutatedFields |= 2048;
        this.cameraDistance = f;
    }

    @Override // androidx.compose.ui.graphics.m
    public void p(float f) {
        if (this.rotationX == f) {
            return;
        }
        this.mutatedFields |= 256;
        this.rotationX = f;
    }

    @Override // androidx.compose.ui.graphics.m
    public void q(float f) {
        if (this.rotationY == f) {
            return;
        }
        this.mutatedFields |= 512;
        this.rotationY = f;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public int getCompositingStrategy() {
        return this.compositingStrategy;
    }

    @Override // androidx.compose.ui.graphics.m
    public void s(float f) {
        if (this.shadowElevation == f) {
            return;
        }
        this.mutatedFields |= 32;
        this.shadowElevation = f;
    }

    @Override // androidx.compose.ui.graphics.m
    public void setTranslationX(float f) {
        if (this.translationX == f) {
            return;
        }
        this.mutatedFields |= 8;
        this.translationX = f;
    }

    @Override // androidx.compose.ui.graphics.m
    public void setTranslationY(float f) {
        if (this.translationY == f) {
            return;
        }
        this.mutatedFields |= 16;
        this.translationY = f;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final f43 getGraphicsDensity() {
        return this.graphicsDensity;
    }

    @Override // androidx.compose.ui.graphics.m
    public void u(float f) {
        if (this.rotationZ == f) {
            return;
        }
        this.mutatedFields |= 1024;
        this.rotationZ = f;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    @Override // com.google.inputmethod.hm4
    /* JADX INFO: renamed from: w2 */
    public float getFontScale() {
        return this.graphicsDensity.getFontScale();
    }

    @Override // androidx.compose.ui.graphics.m
    /* JADX INFO: renamed from: x, reason: from getter */
    public float getTranslationY() {
        return this.translationY;
    }

    @Override // androidx.compose.ui.graphics.m
    /* JADX INFO: renamed from: y, reason: from getter */
    public float getTranslationX() {
        return this.translationX;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final int getMutatedFields() {
        return this.mutatedFields;
    }
}
