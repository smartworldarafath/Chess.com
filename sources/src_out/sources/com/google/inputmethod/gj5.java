package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ5\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u000f\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/google/android/gj5;", "", "Lcom/google/android/ei1;", "containerColor", "contentColor", "disabledContainerColor", "disabledContentColor", "<init>", "(JJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "c", "(JJJJ)Lcom/google/android/gj5;", "", "enabled", "a", "(Z)J", "b", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getContainerColor-0d7_KjU", "()J", "e", "getDisabledContainerColor-0d7_KjU", "d", "getDisabledContentColor-0d7_KjU", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class gj5 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long containerColor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long contentColor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long disabledContainerColor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long disabledContentColor;

    public /* synthetic */ gj5(long j, long j2, long j3, long j4, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4);
    }

    public static /* synthetic */ gj5 d(gj5 gj5Var, long j, long j2, long j3, long j4, int i, Object obj) {
        if ((i & 1) != 0) {
            j = gj5Var.containerColor;
        }
        long j5 = j;
        if ((i & 2) != 0) {
            j2 = gj5Var.contentColor;
        }
        long j6 = j2;
        if ((i & 4) != 0) {
            j3 = gj5Var.disabledContainerColor;
        }
        return gj5Var.c(j5, j6, j3, (i & 8) != 0 ? gj5Var.disabledContentColor : j4);
    }

    public final long a(boolean enabled) {
        return enabled ? this.containerColor : this.disabledContainerColor;
    }

    public final long b(boolean enabled) {
        return enabled ? this.contentColor : this.disabledContentColor;
    }

    public final gj5 c(long containerColor, long contentColor, long disabledContainerColor, long disabledContentColor) {
        return new gj5(containerColor != 16 ? containerColor : this.containerColor, contentColor != 16 ? contentColor : this.contentColor, disabledContainerColor != 16 ? disabledContainerColor : this.disabledContainerColor, disabledContentColor != 16 ? disabledContentColor : this.disabledContentColor, null);
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getContentColor() {
        return this.contentColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof gj5)) {
            return false;
        }
        gj5 gj5Var = (gj5) other;
        return ei1.r(this.containerColor, gj5Var.containerColor) && ei1.r(this.contentColor, gj5Var.contentColor) && ei1.r(this.disabledContainerColor, gj5Var.disabledContainerColor) && ei1.r(this.disabledContentColor, gj5Var.disabledContentColor);
    }

    public int hashCode() {
        return (((((ei1.x(this.containerColor) * 31) + ei1.x(this.contentColor)) * 31) + ei1.x(this.disabledContainerColor)) * 31) + ei1.x(this.disabledContentColor);
    }

    private gj5(long j, long j2, long j3, long j4) {
        this.containerColor = j;
        this.contentColor = j2;
        this.disabledContainerColor = j3;
        this.disabledContentColor = j4;
    }
}
