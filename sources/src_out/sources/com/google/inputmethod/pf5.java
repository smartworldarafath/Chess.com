package com.google.inputmethod;

import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\u0010\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR \u0010\u0014\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u000b\u0012\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0012\u0010\rR \u0010\u0018\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u000b\u0012\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0016\u0010\rR \u0010\u001c\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u000b\u0012\u0004\b\u001b\u0010\u000f\u001a\u0004\b\u001a\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/google/android/pf5;", "", "id", "<init>", "(Ljava/lang/Object;)V", "a", "Ljava/lang/Object;", "getId$compose_release", "()Ljava/lang/Object;", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$c;", "b", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$c;", "getStart", "()Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$c;", "getStart$annotations", "()V", "start", "c", "getAbsoluteLeft", "getAbsoluteLeft$annotations", "absoluteLeft", "d", "getEnd", "getEnd$annotations", "end", "e", "getAbsoluteRight", "getAbsoluteRight$annotations", "absoluteRight", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class pf5 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Object id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ConstraintLayoutBaseScope.VerticalAnchor start;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final ConstraintLayoutBaseScope.VerticalAnchor absoluteLeft;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final ConstraintLayoutBaseScope.VerticalAnchor end;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final ConstraintLayoutBaseScope.VerticalAnchor absoluteRight;

    public pf5(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "id");
        this.id = obj;
        this.start = new ConstraintLayoutBaseScope.VerticalAnchor(obj, -2);
        this.absoluteLeft = new ConstraintLayoutBaseScope.VerticalAnchor(obj, 0);
        this.end = new ConstraintLayoutBaseScope.VerticalAnchor(obj, -1);
        this.absoluteRight = new ConstraintLayoutBaseScope.VerticalAnchor(obj, 1);
    }
}
