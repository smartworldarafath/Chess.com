package com.google.inputmethod;

import android.graphics.PathMeasure;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u00020\u00112\b\u0010\u000f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/google/android/nm;", "Lcom/google/android/s39;", "Landroid/graphics/PathMeasure;", "internalPathMeasure", "<init>", "(Landroid/graphics/PathMeasure;)V", "", "startDistance", "stopDistance", "Landroidx/compose/ui/graphics/Path;", "destination", "", "startWithMoveTo", "a", "(FFLandroidx/compose/ui/graphics/Path;Z)Z", "path", "forceClosed", "", "b", "(Landroidx/compose/ui/graphics/Path;Z)V", "Landroid/graphics/PathMeasure;", "getLength", "()F", "length", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class nm implements s39 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final PathMeasure internalPathMeasure;

    public nm(PathMeasure pathMeasure) {
        this.internalPathMeasure = pathMeasure;
    }

    @Override // com.google.inputmethod.s39
    public boolean a(float startDistance, float stopDistance, Path destination, boolean startWithMoveTo) {
        PathMeasure pathMeasure = this.internalPathMeasure;
        if (destination instanceof c) {
            return pathMeasure.getSegment(startDistance, stopDistance, ((c) destination).getInternalPath(), startWithMoveTo);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // com.google.inputmethod.s39
    public void b(Path path, boolean forceClosed) {
        android.graphics.Path internalPath;
        PathMeasure pathMeasure = this.internalPathMeasure;
        if (path == null) {
            internalPath = null;
        } else {
            if (!(path instanceof c)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            internalPath = ((c) path).getInternalPath();
        }
        pathMeasure.setPath(internalPath, forceClosed);
    }

    @Override // com.google.inputmethod.s39
    public float getLength() {
        return this.internalPathMeasure.getLength();
    }
}
