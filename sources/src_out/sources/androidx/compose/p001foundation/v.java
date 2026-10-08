package androidx.compose.p001foundation;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.widget.EdgeEffect;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.sh7;
import com.google.inputmethod.f43;
import com.google.inputmethod.fz1;
import com.google.inputmethod.hf1;
import com.google.inputmethod.k33;
import com.google.inputmethod.km3;
import com.google.inputmethod.nac;
import com.google.inputmethod.tsb;
import com.google.inputmethod.vg3;
import com.google.inputmethod.w41;
import com.google.inputmethod.x23;
import com.google.inputmethod.xi;
import com.google.inputmethod.yg3;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0014J\u001f\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u0014J'\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010\"\u001a\u00020!*\u00020 H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Landroidx/compose/foundation/v;", "Lcom/google/android/k33;", "Lcom/google/android/yg3;", "Lcom/google/android/x23;", "pointerInputNode", "Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;", "overscrollEffect", "Landroidx/compose/foundation/k;", "edgeEffectWrapper", "<init>", "(Lcom/google/android/x23;Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;Landroidx/compose/foundation/k;)V", "", "z3", "()Z", "y3", "Landroid/widget/EdgeEffect;", "left", "Landroid/graphics/Canvas;", "canvas", "t3", "(Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z", "top", "v3", "right", "u3", "bottom", "s3", "", "rotationDegrees", "edgeEffect", "w3", "(FLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z", "Lcom/google/android/fz1;", "", "j", "(Lcom/google/android/fz1;)V", "r", "Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;", "s", "Landroidx/compose/foundation/k;", "Landroid/graphics/RenderNode;", "t", "Landroid/graphics/RenderNode;", "_renderNode", "x3", "()Landroid/graphics/RenderNode;", "renderNode", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class v extends k33 implements yg3 {

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final AndroidEdgeEffectOverscrollEffect overscrollEffect;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final k edgeEffectWrapper;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private RenderNode _renderNode;

    public v(x23 x23Var, AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, k kVar) {
        this.overscrollEffect = androidEdgeEffectOverscrollEffect;
        this.edgeEffectWrapper = kVar;
        m3(x23Var);
    }

    private final boolean s3(EdgeEffect bottom, Canvas canvas) {
        return w3(180.0f, bottom, canvas);
    }

    private final boolean t3(EdgeEffect left, Canvas canvas) {
        return w3(270.0f, left, canvas);
    }

    private final boolean u3(EdgeEffect right, Canvas canvas) {
        return w3(90.0f, right, canvas);
    }

    private final boolean v3(EdgeEffect top, Canvas canvas) {
        return w3(0.0f, top, canvas);
    }

    private final boolean w3(float rotationDegrees, EdgeEffect edgeEffect, Canvas canvas) {
        if (rotationDegrees == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(rotationDegrees);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    private final RenderNode x3() {
        RenderNode renderNode = this._renderNode;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNodeA = nac.a("AndroidEdgeEffectOverscrollEffect");
        this._renderNode = renderNodeA;
        return renderNodeA;
    }

    private final boolean y3() {
        k kVar = this.edgeEffectWrapper;
        return kVar.s() || kVar.t() || kVar.v() || kVar.w();
    }

    private final boolean z3() {
        k kVar = this.edgeEffectWrapper;
        return kVar.z() || kVar.A() || kVar.p() || kVar.q();
    }

    @Override // com.google.inputmethod.yg3
    public void j(fz1 fz1Var) {
        boolean zT3;
        this.overscrollEffect.p(fz1Var.d());
        Canvas canvasD = xi.d(fz1Var.getDrawContext().b());
        this.overscrollEffect.i().getValue();
        if (tsb.n(fz1Var.d())) {
            fz1Var.j1();
            return;
        }
        if (!canvasD.isHardwareAccelerated()) {
            this.edgeEffectWrapper.f();
            fz1Var.j1();
            return;
        }
        float fX2 = fz1Var.x2(hf1.b());
        k kVar = this.edgeEffectWrapper;
        boolean zZ3 = z3();
        boolean zY3 = y3();
        if (zZ3 && zY3) {
            x3().setPosition(0, 0, canvasD.getWidth(), canvasD.getHeight());
        } else if (zZ3) {
            x3().setPosition(0, 0, canvasD.getWidth() + (sh7.d(fX2) * 2), canvasD.getHeight());
        } else {
            if (!zY3) {
                fz1Var.j1();
                return;
            }
            x3().setPosition(0, 0, canvasD.getWidth(), canvasD.getHeight() + (sh7.d(fX2) * 2));
        }
        RecordingCanvas recordingCanvasBeginRecording = x3().beginRecording();
        if (kVar.t()) {
            EdgeEffect edgeEffectJ = kVar.j();
            u3(edgeEffectJ, recordingCanvasBeginRecording);
            edgeEffectJ.finish();
        }
        if (kVar.s()) {
            EdgeEffect edgeEffectI = kVar.i();
            zT3 = t3(edgeEffectI, recordingCanvasBeginRecording);
            if (kVar.u()) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (this.overscrollEffect.h() & 4294967295L));
                km3 km3Var = km3.a;
                km3Var.e(kVar.j(), km3Var.c(edgeEffectI), 1 - fIntBitsToFloat);
            }
        } else {
            zT3 = false;
        }
        if (kVar.A()) {
            EdgeEffect edgeEffectN = kVar.n();
            s3(edgeEffectN, recordingCanvasBeginRecording);
            edgeEffectN.finish();
        }
        if (kVar.z()) {
            EdgeEffect edgeEffectM = kVar.m();
            zT3 = v3(edgeEffectM, recordingCanvasBeginRecording) || zT3;
            if (kVar.B()) {
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.overscrollEffect.h() >> 32));
                km3 km3Var2 = km3.a;
                km3Var2.e(kVar.n(), km3Var2.c(edgeEffectM), fIntBitsToFloat2);
            }
        }
        if (kVar.w()) {
            EdgeEffect edgeEffectL = kVar.l();
            t3(edgeEffectL, recordingCanvasBeginRecording);
            edgeEffectL.finish();
        }
        if (kVar.v()) {
            EdgeEffect edgeEffectK = kVar.k();
            zT3 = u3(edgeEffectK, recordingCanvasBeginRecording) || zT3;
            if (kVar.x()) {
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (this.overscrollEffect.h() & 4294967295L));
                km3 km3Var3 = km3.a;
                km3Var3.e(kVar.l(), km3Var3.c(edgeEffectK), fIntBitsToFloat3);
            }
        }
        if (kVar.q()) {
            EdgeEffect edgeEffectH = kVar.h();
            v3(edgeEffectH, recordingCanvasBeginRecording);
            edgeEffectH.finish();
        }
        if (kVar.p()) {
            EdgeEffect edgeEffectG = kVar.g();
            boolean z = s3(edgeEffectG, recordingCanvasBeginRecording) || zT3;
            if (kVar.r()) {
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (this.overscrollEffect.h() >> 32));
                km3 km3Var4 = km3.a;
                km3Var4.e(kVar.h(), km3Var4.c(edgeEffectG), 1 - fIntBitsToFloat4);
            }
            zT3 = z;
        }
        if (zT3) {
            this.overscrollEffect.j();
        }
        float f = zY3 ? 0.0f : fX2;
        if (zZ3) {
            fX2 = 0.0f;
        }
        LayoutDirection layoutDirection = fz1Var.getLayoutDirection();
        w41 w41VarB = xi.b(recordingCanvasBeginRecording);
        long jD = fz1Var.d();
        f43 density = fz1Var.getDrawContext().getDensity();
        LayoutDirection layoutDirection2 = fz1Var.getDrawContext().getLayoutDirection();
        w41 w41VarB2 = fz1Var.getDrawContext().b();
        long jD2 = fz1Var.getDrawContext().d();
        GraphicsLayer graphicsLayer = fz1Var.getDrawContext().getGraphicsLayer();
        vg3 drawContext = fz1Var.getDrawContext();
        drawContext.e(fz1Var);
        drawContext.a(layoutDirection);
        drawContext.i(w41VarB);
        drawContext.c(jD);
        drawContext.h(null);
        w41VarB.v();
        try {
            fz1Var.getDrawContext().getTransform().c(f, fX2);
            try {
                fz1Var.j1();
                float f2 = -f;
                float f3 = -fX2;
                fz1Var.getDrawContext().getTransform().c(f2, f3);
                w41VarB.o();
                vg3 drawContext2 = fz1Var.getDrawContext();
                drawContext2.e(density);
                drawContext2.a(layoutDirection2);
                drawContext2.i(w41VarB2);
                drawContext2.c(jD2);
                drawContext2.h(graphicsLayer);
                x3().endRecording();
                int iSave = canvasD.save();
                canvasD.translate(f2, f3);
                canvasD.drawRenderNode(x3());
                canvasD.restoreToCount(iSave);
            } catch (Throwable th) {
                fz1Var.getDrawContext().getTransform().c(-f, -fX2);
                throw th;
            }
        } catch (Throwable th2) {
            w41VarB.o();
            vg3 drawContext3 = fz1Var.getDrawContext();
            drawContext3.e(density);
            drawContext3.a(layoutDirection2);
            drawContext3.i(w41VarB2);
            drawContext3.c(jD2);
            drawContext3.h(graphicsLayer);
            throw th2;
        }
    }
}
