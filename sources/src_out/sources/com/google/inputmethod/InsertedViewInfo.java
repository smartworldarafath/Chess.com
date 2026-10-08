package com.google.inputmethod;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.google.android.sy5, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012 \b\u0002\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u00050\u0005¢\u0006\u0004\b\b\u0010\tJF\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022 \b\u0002\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u00050\u0005HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u0010R/\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u00050\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/google/android/sy5;", "", "", "mainViewId", "complexViewId", "", "Lcom/google/android/htb;", "children", "<init>", "(IILjava/util/Map;)V", "a", "(IILjava/util/Map;)Lcom/google/android/sy5;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "e", "b", "d", "c", "Ljava/util/Map;", "()Ljava/util/Map;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class InsertedViewInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int mainViewId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int complexViewId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final Map<Integer, Map<SizeSelector, Integer>> children;

    /* JADX WARN: Multi-variable type inference failed */
    public InsertedViewInfo(int i, int i2, Map<Integer, ? extends Map<SizeSelector, Integer>> map) {
        this.mainViewId = i;
        this.complexViewId = i2;
        this.children = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InsertedViewInfo b(InsertedViewInfo insertedViewInfo, int i, int i2, Map map, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = insertedViewInfo.mainViewId;
        }
        if ((i3 & 2) != 0) {
            i2 = insertedViewInfo.complexViewId;
        }
        if ((i3 & 4) != 0) {
            map = insertedViewInfo.children;
        }
        return insertedViewInfo.a(i, i2, map);
    }

    public final InsertedViewInfo a(int mainViewId, int complexViewId, Map<Integer, ? extends Map<SizeSelector, Integer>> children) {
        return new InsertedViewInfo(mainViewId, complexViewId, children);
    }

    public final Map<Integer, Map<SizeSelector, Integer>> c() {
        return this.children;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getComplexViewId() {
        return this.complexViewId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getMainViewId() {
        return this.mainViewId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InsertedViewInfo)) {
            return false;
        }
        InsertedViewInfo insertedViewInfo = (InsertedViewInfo) other;
        return this.mainViewId == insertedViewInfo.mainViewId && this.complexViewId == insertedViewInfo.complexViewId && Intrinsics.e(this.children, insertedViewInfo.children);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.mainViewId) * 31) + Integer.hashCode(this.complexViewId)) * 31) + this.children.hashCode();
    }

    public String toString() {
        return "InsertedViewInfo(mainViewId=" + this.mainViewId + ", complexViewId=" + this.complexViewId + ", children=" + this.children + ')';
    }

    public /* synthetic */ InsertedViewInfo(int i, int i2, Map map, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? -1 : i2, (i3 & 4) != 0 ? b0.j() : map);
    }
}
