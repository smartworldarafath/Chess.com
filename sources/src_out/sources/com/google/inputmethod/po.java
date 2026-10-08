package com.google.inputmethod;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import androidx.compose.p004runtime.p0;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.graphics.drawscope.b;
import androidx.compose.ui.graphics.drawscope.c;
import androidx.compose.ui.graphics.e;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u001c\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010&R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R(\u0010\u0010\u001a\u00020\u000f8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b+\u0010,\u0012\u0004\b0\u0010\n\u001a\u0004\b-\u0010.\"\u0004\b/\u0010\u0012R\u0018\u00103\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R*\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u001c\u00104\u0012\u0004\b9\u0010\n\u001a\u0004\b5\u00106\"\u0004\b7\u00108R2\u0010C\u001a\u0012\u0012\f\u0012\n\u0018\u00010;j\u0004\u0018\u0001`<\u0018\u00010:8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR*\u0010J\u001a\u0004\u0018\u00010\u00198\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0015\u0010D\u0012\u0004\bI\u0010\n\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010KR\u0014\u0010M\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010LR$\u0010Q\u001a\u00020'2\u0006\u0010N\u001a\u00020'8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010O\"\u0004\b1\u0010P¨\u0006R"}, d2 = {"Lcom/google/android/po;", "Landroid/text/TextPaint;", "", "flags", "", "density", "<init>", "(IF)V", "", "b", "()V", "Lcom/google/android/wrc;", "textDecoration", "k", "(Lcom/google/android/wrc;)V", "Lcom/google/android/nkb;", "shadow", "j", "(Lcom/google/android/nkb;)V", "Lcom/google/android/ei1;", "color", "h", "(J)V", "Lcom/google/android/qu0;", "brush", "Lcom/google/android/tsb;", "size", "alpha", "f", "(Lcom/google/android/qu0;JF)V", "Landroidx/compose/ui/graphics/drawscope/b;", "drawStyle", "i", "(Landroidx/compose/ui/graphics/drawscope/b;)V", "Lcom/google/android/q09;", "a", "Lcom/google/android/q09;", "backingComposePaint", "Lcom/google/android/wrc;", "Landroidx/compose/ui/graphics/e;", "c", "I", "backingBlendMode", "d", "Lcom/google/android/nkb;", "getShadow$ui_text", "()Lcom/google/android/nkb;", "setShadow$ui_text", "getShadow$ui_text$annotations", "e", "Lcom/google/android/ei1;", "lastColor", "Lcom/google/android/qu0;", "getBrush$ui_text", "()Lcom/google/android/qu0;", "setBrush$ui_text", "(Lcom/google/android/qu0;)V", "getBrush$ui_text$annotations", "Lcom/google/android/q6c;", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "g", "Lcom/google/android/q6c;", "getShaderState$ui_text", "()Lcom/google/android/q6c;", "setShaderState$ui_text", "(Lcom/google/android/q6c;)V", "shaderState", "Lcom/google/android/tsb;", "getBrushSize-VsRJwc0$ui_text", "()Lcom/google/android/tsb;", "setBrushSize-iaC8Vc4$ui_text", "(Lcom/google/android/tsb;)V", "getBrushSize-VsRJwc0$ui_text$annotations", "brushSize", "Landroidx/compose/ui/graphics/drawscope/b;", "()Lcom/google/android/q09;", "composePaint", "value", "()I", "(I)V", "blendMode", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class po extends TextPaint {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private q09 backingComposePaint;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private wrc textDecoration;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int backingBlendMode;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private Shadow shadow;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private ei1 lastColor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private qu0 brush;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private q6c<? extends Shader> shaderState;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private tsb brushSize;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private b drawStyle;

    public po(int i, float f) {
        super(i);
        ((TextPaint) this).density = f;
        this.textDecoration = wrc.INSTANCE.c();
        this.backingBlendMode = DrawScope.INSTANCE.a();
        this.shadow = Shadow.INSTANCE.a();
    }

    private final void b() {
        this.shaderState = null;
        this.brush = null;
        this.brushSize = null;
        setShader(null);
    }

    private final q09 d() {
        q09 q09Var = this.backingComposePaint;
        if (q09Var != null) {
            return q09Var;
        }
        q09 q09VarB = dm.b(this);
        this.backingComposePaint = q09VarB;
        return q09VarB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Shader g(qu0 qu0Var, long j) {
        return ((jkb) qu0Var).b(j);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getBackingBlendMode() {
        return this.backingBlendMode;
    }

    public final void e(int i) {
        if (e.E(i, this.backingBlendMode)) {
            return;
        }
        d().e(i);
        this.backingBlendMode = i;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0035  */
    /* JADX WARN: Code duplicated, block: B:20:0x003e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0041  */
    public final void f(final qu0 brush, final long size, float alpha) {
        if (brush == null) {
            b();
            return;
        }
        if (brush instanceof SolidColor) {
            h(hsc.c(((SolidColor) brush).getValue(), alpha));
            return;
        }
        if (!(brush instanceof jkb)) {
            throw new NoWhenBranchMatchedException();
        }
        if (Intrinsics.e(this.brush, brush)) {
            tsb tsbVar = this.brushSize;
            if (!(tsbVar == null ? false : tsb.h(tsbVar.getPackedValue(), size))) {
                if (size != 9205357640488583168L) {
                    this.brush = brush;
                    this.brushSize = tsb.c(size);
                    this.shaderState = p0.e(new Function0() { // from class: com.google.android.oo
                        public final Object invoke() {
                            return po.g(brush, size);
                        }
                    });
                }
            }
        } else {
            if (size != 9205357640488583168L) {
                this.brush = brush;
                this.brushSize = tsb.c(size);
                this.shaderState = p0.e(new Function0() { // from class: com.google.android.oo
                    public final Object invoke() {
                        return po.g(brush, size);
                    }
                });
            }
        }
        q09 q09VarD = d();
        q6c<? extends Shader> q6cVar = this.shaderState;
        q09VarD.D(q6cVar != null ? q6cVar.getValue() : null);
        this.lastColor = null;
        qo.a(this, alpha);
    }

    public final void h(long color) {
        ei1 ei1Var = this.lastColor;
        if (ei1Var == null ? false : ei1.r(ei1Var.getValue(), color)) {
            return;
        }
        if (color != 16) {
            this.lastColor = ei1.l(color);
            setColor(ki1.j(color));
            b();
        }
    }

    public final void i(b drawStyle) {
        if (drawStyle == null || Intrinsics.e(this.drawStyle, drawStyle)) {
            return;
        }
        this.drawStyle = drawStyle;
        if (Intrinsics.e(drawStyle, c.b)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(drawStyle instanceof Stroke)) {
            throw new NoWhenBranchMatchedException();
        }
        d().y(w09.INSTANCE.b());
        Stroke stroke = (Stroke) drawStyle;
        d().z(stroke.getWidth());
        d().x(stroke.getMiter());
        d().s(stroke.getJoin());
        d().p(stroke.getCap());
        d().B(stroke.getPathEffect());
    }

    public final void j(Shadow shadow) {
        if (shadow == null || Intrinsics.e(this.shadow, shadow)) {
            return;
        }
        this.shadow = shadow;
        if (Intrinsics.e(shadow, Shadow.INSTANCE.a())) {
            clearShadowLayer();
        } else {
            setShadowLayer(vyc.b(this.shadow.getBlurRadius()), Float.intBitsToFloat((int) (this.shadow.getOffset() >> 32)), Float.intBitsToFloat((int) (this.shadow.getOffset() & 4294967295L)), ki1.j(this.shadow.getColor()));
        }
    }

    public final void k(wrc textDecoration) {
        if (textDecoration == null || Intrinsics.e(this.textDecoration, textDecoration)) {
            return;
        }
        this.textDecoration = textDecoration;
        wrc.Companion companion = wrc.INSTANCE;
        setUnderlineText(textDecoration.d(companion.d()));
        setStrikeThruText(this.textDecoration.d(companion.b()));
    }
}
