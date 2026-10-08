package com.google.inputmethod;

import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0003\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/google/android/da1;", "", "Landroidx/compose/ui/graphics/Path;", "checkPath", "Lcom/google/android/s39;", "pathMeasure", "pathToDraw", "<init>", "(Landroidx/compose/ui/graphics/Path;Lcom/google/android/s39;Landroidx/compose/ui/graphics/Path;)V", "a", "Landroidx/compose/ui/graphics/Path;", "()Landroidx/compose/ui/graphics/Path;", "b", "Lcom/google/android/s39;", "()Lcom/google/android/s39;", "c", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class da1 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Path checkPath;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final s39 pathMeasure;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Path pathToDraw;

    public da1() {
        this(null, null, null, 7, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Path getCheckPath() {
        return this.checkPath;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final s39 getPathMeasure() {
        return this.pathMeasure;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Path getPathToDraw() {
        return this.pathToDraw;
    }

    public da1(Path path, s39 s39Var, Path path2) {
        this.checkPath = path;
        this.pathMeasure = s39Var;
        this.pathToDraw = path2;
    }

    public /* synthetic */ da1(Path path, s39 s39Var, Path path2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? d.a() : path, (i & 2) != 0 ? om.a() : s39Var, (i & 4) != 0 ? d.a() : path2);
    }
}
