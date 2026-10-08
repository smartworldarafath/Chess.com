package com.google.inputmethod;

import android.graphics.RenderNode;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/google/android/eha;", "", "<init>", "()V", "Landroid/graphics/RenderNode;", "renderNode", "Lcom/google/android/ega;", "target", "", "a", "(Landroid/graphics/RenderNode;Lcom/google/android/ega;)V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class eha {
    public static final eha a = new eha();

    private eha() {
    }

    public final void a(RenderNode renderNode, ega target) {
        renderNode.setRenderEffect(target != null ? target.a() : null);
    }
}
