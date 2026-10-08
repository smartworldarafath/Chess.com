package com.google.inputmethod;

import androidx.p008glance.layout.Alignment;
import androidx.p008glance.p009appwidget.LayoutType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.google.android.jt0, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000fR\u001d\u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, d2 = {"Lcom/google/android/jt0;", "", "Landroidx/glance/appwidget/LayoutType;", "type", "Landroidx/glance/layout/a$b;", "horizontalAlignment", "Landroidx/glance/layout/a$c;", "verticalAlignment", "<init>", "(Landroidx/glance/appwidget/LayoutType;IILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/glance/appwidget/LayoutType;", "getType", "()Landroidx/glance/appwidget/LayoutType;", "b", "I", "getHorizontalAlignment-PGIyAqw", "c", "getVerticalAlignment-mnfRV0w", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class BoxChildSelector {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final LayoutType type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int horizontalAlignment;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int verticalAlignment;

    public /* synthetic */ BoxChildSelector(LayoutType layoutType, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(layoutType, i, i2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BoxChildSelector)) {
            return false;
        }
        BoxChildSelector boxChildSelector = (BoxChildSelector) other;
        return this.type == boxChildSelector.type && Alignment.b.g(this.horizontalAlignment, boxChildSelector.horizontalAlignment) && Alignment.c.g(this.verticalAlignment, boxChildSelector.verticalAlignment);
    }

    public int hashCode() {
        return (((this.type.hashCode() * 31) + Alignment.b.h(this.horizontalAlignment)) * 31) + Alignment.c.h(this.verticalAlignment);
    }

    public String toString() {
        return "BoxChildSelector(type=" + this.type + ", horizontalAlignment=" + ((Object) Alignment.b.i(this.horizontalAlignment)) + ", verticalAlignment=" + ((Object) Alignment.c.i(this.verticalAlignment)) + ')';
    }

    private BoxChildSelector(LayoutType layoutType, int i, int i2) {
        this.type = layoutType;
        this.horizontalAlignment = i;
        this.verticalAlignment = i2;
    }
}
