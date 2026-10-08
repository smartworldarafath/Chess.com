package com.google.inputmethod;

import androidx.collection.d;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\nR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0016\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/google/android/ta1;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "graphicsLayer", "", "i", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;)Z", "a", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "dependency", "b", "oldDependency", "Landroidx/collection/d;", "c", "Landroidx/collection/d;", "dependenciesSet", "d", "oldDependenciesSet", "e", "Z", "trackingInProgress", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ta1 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private GraphicsLayer dependency;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private GraphicsLayer oldDependency;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private d<GraphicsLayer> dependenciesSet;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private d<GraphicsLayer> oldDependenciesSet;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean trackingInProgress;

    public final boolean i(GraphicsLayer graphicsLayer) {
        if (!this.trackingInProgress) {
            yw5.a("Only add dependencies during a tracking");
        }
        d<GraphicsLayer> dVar = this.dependenciesSet;
        if (dVar != null) {
            Intrinsics.g(dVar);
            dVar.h(graphicsLayer);
        } else if (this.dependency != null) {
            d<GraphicsLayer> dVarB = l4b.b();
            GraphicsLayer graphicsLayer2 = this.dependency;
            Intrinsics.g(graphicsLayer2);
            dVarB.h(graphicsLayer2);
            dVarB.h(graphicsLayer);
            this.dependenciesSet = dVarB;
            this.dependency = null;
        } else {
            this.dependency = graphicsLayer;
        }
        d<GraphicsLayer> dVar2 = this.oldDependenciesSet;
        if (dVar2 != null) {
            Intrinsics.g(dVar2);
            return !dVar2.y(graphicsLayer);
        }
        if (this.oldDependency != graphicsLayer) {
            return true;
        }
        this.oldDependency = null;
        return false;
    }
}
