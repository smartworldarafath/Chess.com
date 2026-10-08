package com.google.inputmethod;

import android.graphics.RenderEffect;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\b\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/google/android/vm;", "Lcom/google/android/ega;", "Landroid/graphics/RenderEffect;", "androidRenderEffect", "<init>", "(Landroid/graphics/RenderEffect;)V", "b", "()Landroid/graphics/RenderEffect;", "Landroid/graphics/RenderEffect;", "getAndroidRenderEffect", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class vm extends ega {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final RenderEffect androidRenderEffect;

    public vm(RenderEffect renderEffect) {
        super(null);
        this.androidRenderEffect = renderEffect;
    }

    @Override // com.google.inputmethod.ega
    /* JADX INFO: renamed from: b, reason: from getter */
    protected RenderEffect getAndroidRenderEffect() {
        return this.androidRenderEffect;
    }
}
