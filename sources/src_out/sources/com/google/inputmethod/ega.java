package com.google.inputmethod;

import android.graphics.RenderEffect;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H%¢\u0006\u0004\b\u0007\u0010\u0006R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\b\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lcom/google/android/ega;", "", "<init>", "()V", "Landroid/graphics/RenderEffect;", "a", "()Landroid/graphics/RenderEffect;", "b", "Landroid/graphics/RenderEffect;", "internalRenderEffect", "Lcom/google/android/vm;", "Lcom/google/android/sp0;", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class ega {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private RenderEffect internalRenderEffect;

    public /* synthetic */ ega(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final RenderEffect a() {
        RenderEffect renderEffect = this.internalRenderEffect;
        if (renderEffect != null) {
            return renderEffect;
        }
        RenderEffect renderEffectB = b();
        this.internalRenderEffect = renderEffectB;
        return renderEffectB;
    }

    protected abstract RenderEffect b();

    private ega() {
    }
}
