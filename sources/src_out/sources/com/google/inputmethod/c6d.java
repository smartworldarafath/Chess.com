package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0019\b\u0007\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0018\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0019\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u001a\u0010\u001c\u001a\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b$\u0010#R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010#R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010!\u001a\u0004\b'\u0010#R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010!\u001a\u0004\b(\u0010#R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010!\u001a\u0004\b)\u0010#R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010!\u001a\u0004\b*\u0010#R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010!\u001a\u0004\b,\u0010#R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010!\u001a\u0004\b.\u0010#R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010!\u001a\u0004\b0\u0010#R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010!\u001a\u0004\b2\u0010#R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010!\u001a\u0004\b4\u0010#R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u0010!\u001a\u0004\b6\u0010#¨\u00067"}, d2 = {"Lcom/google/android/c6d;", "", "Lcom/google/android/ei1;", "clockDialColor", "selectorColor", "containerColor", "periodSelectorBorderColor", "clockDialSelectedContentColor", "clockDialUnselectedContentColor", "periodSelectorSelectedContainerColor", "periodSelectorUnselectedContainerColor", "periodSelectorSelectedContentColor", "periodSelectorUnselectedContentColor", "timeSelectorSelectedContainerColor", "timeSelectorUnselectedContainerColor", "timeSelectorSelectedContentColor", "timeSelectorUnselectedContentColor", "<init>", "(JJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "selected", "e", "(Z)J", "f", "g", "h", "a", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "b", "()J", "d", "c", "getContainerColor-0d7_KjU", "getClockDialSelectedContentColor-0d7_KjU", "getClockDialUnselectedContentColor-0d7_KjU", "getPeriodSelectorSelectedContainerColor-0d7_KjU", "getPeriodSelectorUnselectedContainerColor-0d7_KjU", "i", "getPeriodSelectorSelectedContentColor-0d7_KjU", "j", "getPeriodSelectorUnselectedContentColor-0d7_KjU", "k", "getTimeSelectorSelectedContainerColor-0d7_KjU", "l", "getTimeSelectorUnselectedContainerColor-0d7_KjU", "m", "getTimeSelectorSelectedContentColor-0d7_KjU", "n", "getTimeSelectorUnselectedContentColor-0d7_KjU", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c6d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long clockDialColor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long selectorColor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long containerColor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long periodSelectorBorderColor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final long clockDialSelectedContentColor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final long clockDialUnselectedContentColor;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final long periodSelectorSelectedContainerColor;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final long periodSelectorUnselectedContainerColor;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final long periodSelectorSelectedContentColor;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final long periodSelectorUnselectedContentColor;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final long timeSelectorSelectedContainerColor;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final long timeSelectorUnselectedContainerColor;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final long timeSelectorSelectedContentColor;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final long timeSelectorUnselectedContentColor;

    public /* synthetic */ c6d(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14);
    }

    public final long a(boolean selected) {
        return selected ? this.clockDialSelectedContentColor : this.clockDialUnselectedContentColor;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getClockDialColor() {
        return this.clockDialColor;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getPeriodSelectorBorderColor() {
        return this.periodSelectorBorderColor;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getSelectorColor() {
        return this.selectorColor;
    }

    public final long e(boolean selected) {
        return selected ? this.periodSelectorSelectedContainerColor : this.periodSelectorUnselectedContainerColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || c6d.class != other.getClass()) {
            return false;
        }
        c6d c6dVar = (c6d) other;
        return ei1.r(this.clockDialColor, c6dVar.clockDialColor) && ei1.r(this.selectorColor, c6dVar.selectorColor) && ei1.r(this.containerColor, c6dVar.containerColor) && ei1.r(this.periodSelectorBorderColor, c6dVar.periodSelectorBorderColor) && ei1.r(this.periodSelectorSelectedContainerColor, c6dVar.periodSelectorSelectedContainerColor) && ei1.r(this.periodSelectorUnselectedContainerColor, c6dVar.periodSelectorUnselectedContainerColor) && ei1.r(this.periodSelectorSelectedContentColor, c6dVar.periodSelectorSelectedContentColor) && ei1.r(this.periodSelectorUnselectedContentColor, c6dVar.periodSelectorUnselectedContentColor) && ei1.r(this.timeSelectorSelectedContainerColor, c6dVar.timeSelectorSelectedContainerColor) && ei1.r(this.timeSelectorUnselectedContainerColor, c6dVar.timeSelectorUnselectedContainerColor) && ei1.r(this.timeSelectorSelectedContentColor, c6dVar.timeSelectorSelectedContentColor) && ei1.r(this.timeSelectorUnselectedContentColor, c6dVar.timeSelectorUnselectedContentColor);
    }

    public final long f(boolean selected) {
        return selected ? this.periodSelectorSelectedContentColor : this.periodSelectorUnselectedContentColor;
    }

    public final long g(boolean selected) {
        return selected ? this.timeSelectorSelectedContainerColor : this.timeSelectorUnselectedContainerColor;
    }

    public final long h(boolean selected) {
        return selected ? this.timeSelectorSelectedContentColor : this.timeSelectorUnselectedContentColor;
    }

    public int hashCode() {
        return (((((((((((((((((((((ei1.x(this.clockDialColor) * 31) + ei1.x(this.selectorColor)) * 31) + ei1.x(this.containerColor)) * 31) + ei1.x(this.periodSelectorBorderColor)) * 31) + ei1.x(this.periodSelectorSelectedContainerColor)) * 31) + ei1.x(this.periodSelectorUnselectedContainerColor)) * 31) + ei1.x(this.periodSelectorSelectedContentColor)) * 31) + ei1.x(this.periodSelectorUnselectedContentColor)) * 31) + ei1.x(this.timeSelectorSelectedContainerColor)) * 31) + ei1.x(this.timeSelectorUnselectedContainerColor)) * 31) + ei1.x(this.timeSelectorSelectedContentColor)) * 31) + ei1.x(this.timeSelectorUnselectedContentColor);
    }

    private c6d(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14) {
        this.clockDialColor = j;
        this.selectorColor = j2;
        this.containerColor = j3;
        this.periodSelectorBorderColor = j4;
        this.clockDialSelectedContentColor = j5;
        this.clockDialUnselectedContentColor = j6;
        this.periodSelectorSelectedContainerColor = j7;
        this.periodSelectorUnselectedContainerColor = j8;
        this.periodSelectorSelectedContentColor = j9;
        this.periodSelectorUnselectedContentColor = j10;
        this.timeSelectorSelectedContainerColor = j11;
        this.timeSelectorUnselectedContainerColor = j12;
        this.timeSelectorSelectedContentColor = j13;
        this.timeSelectorUnselectedContentColor = j14;
    }
}
