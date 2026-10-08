package com.google.inputmethod;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0018\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u0017\u0010\u001d\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R \u0010!\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u0010\u0012\u0004\b \u0010\u0003\u001a\u0004\b\u001f\u0010\u0012R \u0010$\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0010\u0012\u0004\b#\u0010\u0003\u001a\u0004\b\"\u0010\u0012R \u0010'\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010\u0010\u0012\u0004\b&\u0010\u0003\u001a\u0004\b\u001e\u0010\u0012R\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020)0(8\u0006¢\u0006\f\n\u0004\b\"\u0010*\u001a\u0004\b+\u0010,R\u0011\u0010/\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b%\u0010.R\u0011\u00100\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u0014\u0010.R\u0011\u00102\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b1\u0010.R\u0011\u00103\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u001c\u0010.¨\u00064"}, d2 = {"Lcom/google/android/wp9;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "drawScope", "Lcom/google/android/ff3;", "stopSize", "Lcom/google/android/ei1;", "color", "Lcom/google/android/wbc;", "strokeCap", "", "a", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FJI)V", "b", "F", "g", "()F", "CircularStrokeWidth", "c", "I", "j", "()I", "LinearStrokeCap", "d", "getCircularDeterminateStrokeCap-KaPHkGw", "CircularDeterminateStrokeCap", "e", "CircularIndeterminateStrokeCap", "f", "l", "getLinearTrackStopIndicatorSize-D9Ej5fM$annotations", "LinearTrackStopIndicatorSize", "i", "getLinearIndicatorTrackGapSize-D9Ej5fM$annotations", "LinearIndicatorTrackGapSize", "h", "getCircularIndicatorTrackGapSize-D9Ej5fM$annotations", "CircularIndicatorTrackGapSize", "Lcom/google/android/w2c;", "", "Lcom/google/android/w2c;", "getProgressAnimationSpec", "()Lcom/google/android/w2c;", "ProgressAnimationSpec", "(Landroidx/compose/runtime/d;I)J", "linearColor", "circularColor", "k", "linearTrackColor", "circularIndeterminateTrackColor", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class wp9 {
    public static final wp9 a = new wp9();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final float CircularStrokeWidth;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final int LinearStrokeCap;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final int CircularDeterminateStrokeCap;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final int CircularIndeterminateStrokeCap;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final float LinearTrackStopIndicatorSize;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final float LinearIndicatorTrackGapSize;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private static final float CircularIndicatorTrackGapSize;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private static final w2c<Float> ProgressAnimationSpec;

    static {
        ec1 ec1Var = ec1.a;
        CircularStrokeWidth = ec1Var.c();
        wbc.Companion companion = wbc.INSTANCE;
        LinearStrokeCap = companion.b();
        CircularDeterminateStrokeCap = companion.b();
        CircularIndeterminateStrokeCap = companion.b();
        p27 p27Var = p27.a;
        LinearTrackStopIndicatorSize = p27Var.b();
        LinearIndicatorTrackGapSize = p27Var.c();
        CircularIndicatorTrackGapSize = ec1Var.b();
        ProgressAnimationSpec = new w2c<>(1.0f, 50.0f, Float.valueOf(0.001f));
    }

    private wp9() {
    }

    private static final void b(DrawScope drawScope, int i, long j, float f, float f2) {
        if (wbc.e(i, wbc.INSTANCE.b())) {
            float f3 = f / 2.0f;
            float fIntBitsToFloat = (Float.intBitsToFloat((int) (drawScope.d() >> 32)) - f3) - f2;
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.d() & 4294967295L)) / 2.0f;
            DrawScope.i1(drawScope, j, f3, rn8.e((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)))), 0.0f, null, null, 0, 120, null);
            return;
        }
        float fIntBitsToFloat3 = (Float.intBitsToFloat((int) (drawScope.d() >> 32)) - f) - f2;
        float fIntBitsToFloat4 = (Float.intBitsToFloat((int) (drawScope.d() & 4294967295L)) - f) / 2.0f;
        DrawScope.T0(drawScope, j, rn8.e((((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L)), tsb.d((((long) Float.floatToRawIntBits(f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f)))), 0.0f, null, null, 0, 120, null);
    }

    public final void a(DrawScope drawScope, float stopSize, long color, int strokeCap) {
        float fMin = Math.min(drawScope.x2(stopSize), Float.intBitsToFloat((int) (drawScope.d() & 4294967295L)));
        float fX2 = drawScope.x2(gq9.A());
        float fIntBitsToFloat = (Float.intBitsToFloat((int) (drawScope.d() & 4294967295L)) - fMin) / 2;
        float f = fIntBitsToFloat > fX2 ? fX2 : fIntBitsToFloat;
        if (drawScope.getLayoutDirection() != LayoutDirection.Rtl) {
            b(drawScope, strokeCap, color, fMin, f);
            return;
        }
        long jA = drawScope.A();
        vg3 drawContext = drawScope.getDrawContext();
        long jD = drawContext.d();
        drawContext.b().v();
        try {
            drawContext.getTransform().g(-1.0f, 1.0f, jA);
            b(drawScope, strokeCap, color, fMin, f);
        } finally {
            drawContext.b().o();
            drawContext.c(jD);
        }
    }

    public final long c(d dVar, int i) {
        if (e.k()) {
            e.o(1803349725, i, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-circularColor> (ProgressIndicator.kt:817)");
        }
        long jL = bj1.l(hq9.a.a(), dVar, 6);
        if (e.k()) {
            e.n();
        }
        return jL;
    }

    public final int d() {
        return CircularIndeterminateStrokeCap;
    }

    public final long e(d dVar, int i) {
        if (e.k()) {
            e.o(-1947901123, i, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-circularIndeterminateTrackColor> (ProgressIndicator.kt:838)");
        }
        long jH = ei1.INSTANCE.h();
        if (e.k()) {
            e.n();
        }
        return jH;
    }

    public final float f() {
        return CircularIndicatorTrackGapSize;
    }

    public final float g() {
        return CircularStrokeWidth;
    }

    public final long h(d dVar, int i) {
        if (e.k()) {
            e.o(-914312983, i, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-linearColor> (ProgressIndicator.kt:813)");
        }
        long jL = bj1.l(hq9.a.a(), dVar, 6);
        if (e.k()) {
            e.n();
        }
        return jL;
    }

    public final float i() {
        return LinearIndicatorTrackGapSize;
    }

    public final int j() {
        return LinearStrokeCap;
    }

    public final long k(d dVar, int i) {
        if (e.k()) {
            e.o(1677541593, i, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-linearTrackColor> (ProgressIndicator.kt:821)");
        }
        long jL = bj1.l(hq9.a.b(), dVar, 6);
        if (e.k()) {
            e.n();
        }
        return jL;
    }

    public final float l() {
        return LinearTrackStopIndicatorSize;
    }
}
