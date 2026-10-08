package com.google.inputmethod;

import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.d;
import androidx.compose.ui.graphics.drawscope.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.google.android.dr0, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/google/android/dr0;", "", "Lcom/google/android/ml5;", "imageBitmap", "Lcom/google/android/w41;", "canvas", "Landroidx/compose/ui/graphics/drawscope/a;", "canvasDrawScope", "Landroidx/compose/ui/graphics/Path;", "borderPath", "<init>", "(Lcom/google/android/ml5;Lcom/google/android/w41;Landroidx/compose/ui/graphics/drawscope/a;Landroidx/compose/ui/graphics/Path;)V", "g", "()Landroidx/compose/ui/graphics/Path;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/google/android/ml5;", "b", "Lcom/google/android/w41;", "c", "Landroidx/compose/ui/graphics/drawscope/a;", "d", "Landroidx/compose/ui/graphics/Path;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class BorderCache {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private ml5 imageBitmap;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private w41 canvas;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private a canvasDrawScope;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private Path borderPath;

    public BorderCache(ml5 ml5Var, w41 w41Var, a aVar, Path path) {
        this.imageBitmap = ml5Var;
        this.canvas = w41Var;
        this.canvasDrawScope = aVar;
        this.borderPath = path;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BorderCache)) {
            return false;
        }
        BorderCache borderCache = (BorderCache) other;
        return Intrinsics.e(this.imageBitmap, borderCache.imageBitmap) && Intrinsics.e(this.canvas, borderCache.canvas) && Intrinsics.e(this.canvasDrawScope, borderCache.canvasDrawScope) && Intrinsics.e(this.borderPath, borderCache.borderPath);
    }

    public final Path g() {
        Path path = this.borderPath;
        if (path != null) {
            return path;
        }
        Path pathA = d.a();
        this.borderPath = pathA;
        return pathA;
    }

    public int hashCode() {
        ml5 ml5Var = this.imageBitmap;
        int iHashCode = (ml5Var == null ? 0 : ml5Var.hashCode()) * 31;
        w41 w41Var = this.canvas;
        int iHashCode2 = (iHashCode + (w41Var == null ? 0 : w41Var.hashCode())) * 31;
        a aVar = this.canvasDrawScope;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Path path = this.borderPath;
        return iHashCode3 + (path != null ? path.hashCode() : 0);
    }

    public String toString() {
        return "BorderCache(imageBitmap=" + this.imageBitmap + ", canvas=" + this.canvas + ", canvasDrawScope=" + this.canvasDrawScope + ", borderPath=" + this.borderPath + ')';
    }

    public /* synthetic */ BorderCache(ml5 ml5Var, w41 w41Var, a aVar, Path path, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : ml5Var, (i & 2) != 0 ? null : w41Var, (i & 4) != 0 ? null : aVar, (i & 8) != 0 ? null : path);
    }
}
