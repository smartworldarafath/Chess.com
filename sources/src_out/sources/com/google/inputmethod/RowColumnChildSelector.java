package com.google.inputmethod;

import androidx.p008glance.p009appwidget.LayoutType;
import kotlin.Metadata;

/* JADX INFO: renamed from: com.google.android.bra, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/google/android/bra;", "", "Landroidx/glance/appwidget/LayoutType;", "type", "", "expandWidth", "expandHeight", "<init>", "(Landroidx/glance/appwidget/LayoutType;ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/glance/appwidget/LayoutType;", "getType", "()Landroidx/glance/appwidget/LayoutType;", "b", "Z", "getExpandWidth", "()Z", "c", "getExpandHeight", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class RowColumnChildSelector {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final LayoutType type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final boolean expandWidth;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final boolean expandHeight;

    public RowColumnChildSelector(LayoutType layoutType, boolean z, boolean z2) {
        this.type = layoutType;
        this.expandWidth = z;
        this.expandHeight = z2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RowColumnChildSelector)) {
            return false;
        }
        RowColumnChildSelector rowColumnChildSelector = (RowColumnChildSelector) other;
        return this.type == rowColumnChildSelector.type && this.expandWidth == rowColumnChildSelector.expandWidth && this.expandHeight == rowColumnChildSelector.expandHeight;
    }

    public int hashCode() {
        return (((this.type.hashCode() * 31) + Boolean.hashCode(this.expandWidth)) * 31) + Boolean.hashCode(this.expandHeight);
    }

    public String toString() {
        return "RowColumnChildSelector(type=" + this.type + ", expandWidth=" + this.expandWidth + ", expandHeight=" + this.expandHeight + ')';
    }
}
