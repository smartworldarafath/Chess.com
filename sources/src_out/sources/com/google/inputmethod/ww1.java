package com.google.inputmethod;

import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\u0010\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR \u0010\u0013\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u000b\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0011\u0010\rR \u0010\u0019\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0015\u0012\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0016\u0010\u0017R \u0010\u001b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u000b\u0012\u0004\b\u001a\u0010\u000f\u001a\u0004\b\n\u0010\rR \u0010\u001f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u000b\u0012\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001d\u0010\rR \u0010\"\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010\u0015\u0012\u0004\b!\u0010\u000f\u001a\u0004\b\u0005\u0010\u0017R \u0010)\u001a\u00020#8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b(\u0010\u000f\u001a\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lcom/google/android/ww1;", "", "id", "<init>", "(Ljava/lang/Object;)V", "a", "Ljava/lang/Object;", "c", "()Ljava/lang/Object;", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$c;", "b", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$c;", "d", "()Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$c;", "getStart$annotations", "()V", "start", "getAbsoluteLeft", "getAbsoluteLeft$annotations", "absoluteLeft", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$b;", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$b;", "e", "()Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$b;", "getTop$annotations", "top", "getEnd$annotations", "end", "f", "getAbsoluteRight", "getAbsoluteRight$annotations", "absoluteRight", "g", "getBottom$annotations", "bottom", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$a;", "h", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$a;", "getBaseline", "()Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$a;", "getBaseline$annotations", "baseline", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ww1 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Object id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ConstraintLayoutBaseScope.VerticalAnchor start;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final ConstraintLayoutBaseScope.VerticalAnchor absoluteLeft;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final ConstraintLayoutBaseScope.HorizontalAnchor top;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final ConstraintLayoutBaseScope.VerticalAnchor end;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final ConstraintLayoutBaseScope.VerticalAnchor absoluteRight;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final ConstraintLayoutBaseScope.HorizontalAnchor bottom;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final ConstraintLayoutBaseScope.BaselineAnchor baseline;

    public ww1(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "id");
        this.id = obj;
        this.start = new ConstraintLayoutBaseScope.VerticalAnchor(obj, -2);
        this.absoluteLeft = new ConstraintLayoutBaseScope.VerticalAnchor(obj, 0);
        this.top = new ConstraintLayoutBaseScope.HorizontalAnchor(obj, 0);
        this.end = new ConstraintLayoutBaseScope.VerticalAnchor(obj, -1);
        this.absoluteRight = new ConstraintLayoutBaseScope.VerticalAnchor(obj, 1);
        this.bottom = new ConstraintLayoutBaseScope.HorizontalAnchor(obj, 1);
        this.baseline = new ConstraintLayoutBaseScope.BaselineAnchor(obj);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ConstraintLayoutBaseScope.HorizontalAnchor getBottom() {
        return this.bottom;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ConstraintLayoutBaseScope.VerticalAnchor getEnd() {
        return this.end;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Object getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final ConstraintLayoutBaseScope.VerticalAnchor getStart() {
        return this.start;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final ConstraintLayoutBaseScope.HorizontalAnchor getTop() {
        return this.top;
    }
}
