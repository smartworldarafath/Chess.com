package com.google.inputmethod;

import androidx.p008glance.layout.Alignment;
import androidx.p008glance.p009appwidget.LayoutType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.google.android.wy1, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010R\u001f\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001f\u0010\t\u001a\u0004\u0018\u00010\b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006$"}, d2 = {"Lcom/google/android/wy1;", "", "Landroidx/glance/appwidget/LayoutType;", "type", "", "numChildren", "Landroidx/glance/layout/a$b;", "horizontalAlignment", "Landroidx/glance/layout/a$c;", "verticalAlignment", "<init>", "(Landroidx/glance/appwidget/LayoutType;ILandroidx/glance/layout/a$b;Landroidx/glance/layout/a$c;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/glance/appwidget/LayoutType;", "getType", "()Landroidx/glance/appwidget/LayoutType;", "b", "I", "getNumChildren", "c", "Landroidx/glance/layout/a$b;", "getHorizontalAlignment-Y9TK7ig", "()Landroidx/glance/layout/a$b;", "d", "Landroidx/glance/layout/a$c;", "getVerticalAlignment-TcxAxEM", "()Landroidx/glance/layout/a$c;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ContainerSelector {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final LayoutType type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int numChildren;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final Alignment.b horizontalAlignment;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final Alignment.c verticalAlignment;

    public /* synthetic */ ContainerSelector(LayoutType layoutType, int i, Alignment.b bVar, Alignment.c cVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(layoutType, i, bVar, cVar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContainerSelector)) {
            return false;
        }
        ContainerSelector containerSelector = (ContainerSelector) other;
        return this.type == containerSelector.type && this.numChildren == containerSelector.numChildren && Intrinsics.e(this.horizontalAlignment, containerSelector.horizontalAlignment) && Intrinsics.e(this.verticalAlignment, containerSelector.verticalAlignment);
    }

    public int hashCode() {
        int iHashCode = ((this.type.hashCode() * 31) + Integer.hashCode(this.numChildren)) * 31;
        Alignment.b bVar = this.horizontalAlignment;
        int iH = (iHashCode + (bVar == null ? 0 : Alignment.b.h(bVar.getValue()))) * 31;
        Alignment.c cVar = this.verticalAlignment;
        return iH + (cVar != null ? Alignment.c.h(cVar.getValue()) : 0);
    }

    public String toString() {
        return "ContainerSelector(type=" + this.type + ", numChildren=" + this.numChildren + ", horizontalAlignment=" + this.horizontalAlignment + ", verticalAlignment=" + this.verticalAlignment + ')';
    }

    private ContainerSelector(LayoutType layoutType, int i, Alignment.b bVar, Alignment.c cVar) {
        this.type = layoutType;
        this.numChildren = i;
        this.horizontalAlignment = bVar;
        this.verticalAlignment = cVar;
    }

    public /* synthetic */ ContainerSelector(LayoutType layoutType, int i, Alignment.b bVar, Alignment.c cVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(layoutType, i, (i2 & 4) != 0 ? null : bVar, (i2 & 8) != 0 ? null : cVar, null);
    }
}
