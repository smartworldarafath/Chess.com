package com.google.inputmethod;

import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R$\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0018\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u00138V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u001e\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\u00198V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR(\u0010$\u001a\u0004\u0018\u00010\u001f2\b\u0010\t\u001a\u0004\u0018\u00010\u001f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006%À\u0006\u0001"}, d2 = {"Lcom/google/android/vg3;", "", "Lcom/google/android/tsb;", "d", "()J", "c", "(J)V", "size", "Lcom/google/android/w41;", "_", "b", "()Lcom/google/android/w41;", "i", "(Lcom/google/android/w41;)V", "canvas", "Lcom/google/android/eh3;", "g", "()Lcom/google/android/eh3;", "transform", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "a", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "layoutDirection", "Lcom/google/android/f43;", "getDensity", "()Lcom/google/android/f43;", "e", "(Lcom/google/android/f43;)V", "density", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "f", "()Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "h", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "graphicsLayer", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface vg3 {
    default void a(LayoutDirection layoutDirection) {
    }

    default w41 b() {
        return gr3.a;
    }

    void c(long j);

    long d();

    default void e(f43 f43Var) {
    }

    /* JADX INFO: renamed from: f */
    default GraphicsLayer getGraphicsLayer() {
        return null;
    }

    /* JADX INFO: renamed from: g */
    eh3 getTransform();

    default f43 getDensity() {
        return wg3.a();
    }

    default LayoutDirection getLayoutDirection() {
        return LayoutDirection.Ltr;
    }

    default void h(GraphicsLayer graphicsLayer) {
    }

    default void i(w41 w41Var) {
    }
}
