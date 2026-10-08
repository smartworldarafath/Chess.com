package com.google.inputmethod;

import android.graphics.RenderEffect;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/google/android/sga;", "", "<init>", "()V", "Lcom/google/android/ega;", "inputRenderEffect", "", "radiusX", "radiusY", "Lcom/google/android/i5d;", "edgeTreatment", "Landroid/graphics/RenderEffect;", "a", "(Lcom/google/android/ega;FFI)Landroid/graphics/RenderEffect;", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class sga {
    public static final sga a = new sga();

    private sga() {
    }

    public final RenderEffect a(ega inputRenderEffect, float radiusX, float radiusY, int edgeTreatment) {
        if (radiusX == 0.0f && radiusY == 0.0f) {
            return RenderEffect.createOffsetEffect(0.0f, 0.0f);
        }
        return inputRenderEffect == null ? RenderEffect.createBlurEffect(radiusX, radiusY, so.a(edgeTreatment)) : RenderEffect.createBlurEffect(radiusX, radiusY, inputRenderEffect.a(), so.a(edgeTreatment));
    }
}
