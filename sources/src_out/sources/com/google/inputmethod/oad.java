package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJI\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u001a¨\u0006 "}, d2 = {"Lcom/google/android/oad;", "", "Lcom/google/android/ei1;", "containerColor", "scrolledContainerColor", "navigationIconContentColor", "titleContentColor", "actionIconContentColor", "subtitleContentColor", "<init>", "(JJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "b", "(JJJJJJ)Lcom/google/android/oad;", "", "colorTransitionFraction", "a", "(F)J", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getContainerColor-0d7_KjU", "()J", "getScrolledContainerColor-0d7_KjU", "c", "d", "f", "e", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class oad {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long containerColor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long scrolledContainerColor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long navigationIconContentColor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long titleContentColor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final long actionIconContentColor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final long subtitleContentColor;

    public /* synthetic */ oad(long j, long j2, long j3, long j4, long j5, long j6, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6);
    }

    public final long a(float colorTransitionFraction) {
        return ki1.h(this.containerColor, this.scrolledContainerColor, em3.c().a(colorTransitionFraction));
    }

    public final oad b(long containerColor, long scrolledContainerColor, long navigationIconContentColor, long titleContentColor, long actionIconContentColor, long subtitleContentColor) {
        return new oad(containerColor != 16 ? containerColor : this.containerColor, scrolledContainerColor != 16 ? scrolledContainerColor : this.scrolledContainerColor, navigationIconContentColor != 16 ? navigationIconContentColor : this.navigationIconContentColor, titleContentColor != 16 ? titleContentColor : this.titleContentColor, actionIconContentColor != 16 ? actionIconContentColor : this.actionIconContentColor, subtitleContentColor != 16 ? subtitleContentColor : this.subtitleContentColor, null);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getActionIconContentColor() {
        return this.actionIconContentColor;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getNavigationIconContentColor() {
        return this.navigationIconContentColor;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getSubtitleContentColor() {
        return this.subtitleContentColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof oad)) {
            return false;
        }
        oad oadVar = (oad) other;
        return ei1.r(this.containerColor, oadVar.containerColor) && ei1.r(this.scrolledContainerColor, oadVar.scrolledContainerColor) && ei1.r(this.navigationIconContentColor, oadVar.navigationIconContentColor) && ei1.r(this.titleContentColor, oadVar.titleContentColor) && ei1.r(this.actionIconContentColor, oadVar.actionIconContentColor) && ei1.r(this.subtitleContentColor, oadVar.subtitleContentColor);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getTitleContentColor() {
        return this.titleContentColor;
    }

    public int hashCode() {
        return (((((((((ei1.x(this.containerColor) * 31) + ei1.x(this.scrolledContainerColor)) * 31) + ei1.x(this.navigationIconContentColor)) * 31) + ei1.x(this.titleContentColor)) * 31) + ei1.x(this.actionIconContentColor)) * 31) + ei1.x(this.subtitleContentColor);
    }

    private oad(long j, long j2, long j3, long j4, long j5, long j6) {
        this.containerColor = j;
        this.scrolledContainerColor = j2;
        this.navigationIconContentColor = j3;
        this.titleContentColor = j4;
        this.actionIconContentColor = j5;
        this.subtitleContentColor = j6;
    }
}
