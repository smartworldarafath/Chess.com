package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u0010\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u0019¨\u0006\""}, d2 = {"Lcom/google/android/jq7;", "", "Lcom/google/android/ei1;", "textColor", "leadingIconColor", "trailingIconColor", "disabledTextColor", "disabledLeadingIconColor", "disabledTrailingIconColor", "<init>", "(JJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "enabled", "b", "(Z)J", "a", "c", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getTextColor-0d7_KjU", "()J", "getLeadingIconColor-0d7_KjU", "getTrailingIconColor-0d7_KjU", "d", "getDisabledTextColor-0d7_KjU", "e", "getDisabledLeadingIconColor-0d7_KjU", "f", "getDisabledTrailingIconColor-0d7_KjU", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class jq7 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long textColor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long leadingIconColor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long trailingIconColor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long disabledTextColor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final long disabledLeadingIconColor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final long disabledTrailingIconColor;

    public /* synthetic */ jq7(long j, long j2, long j3, long j4, long j5, long j6, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6);
    }

    public final long a(boolean enabled) {
        return enabled ? this.leadingIconColor : this.disabledLeadingIconColor;
    }

    public final long b(boolean enabled) {
        return enabled ? this.textColor : this.disabledTextColor;
    }

    public final long c(boolean enabled) {
        return enabled ? this.trailingIconColor : this.disabledTrailingIconColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof jq7)) {
            return false;
        }
        jq7 jq7Var = (jq7) other;
        return ei1.r(this.textColor, jq7Var.textColor) && ei1.r(this.leadingIconColor, jq7Var.leadingIconColor) && ei1.r(this.trailingIconColor, jq7Var.trailingIconColor) && ei1.r(this.disabledTextColor, jq7Var.disabledTextColor) && ei1.r(this.disabledLeadingIconColor, jq7Var.disabledLeadingIconColor) && ei1.r(this.disabledTrailingIconColor, jq7Var.disabledTrailingIconColor);
    }

    public int hashCode() {
        return (((((((((ei1.x(this.textColor) * 31) + ei1.x(this.leadingIconColor)) * 31) + ei1.x(this.trailingIconColor)) * 31) + ei1.x(this.disabledTextColor)) * 31) + ei1.x(this.disabledLeadingIconColor)) * 31) + ei1.x(this.disabledTrailingIconColor);
    }

    private jq7(long j, long j2, long j3, long j4, long j5, long j6) {
        this.textColor = j;
        this.leadingIconColor = j2;
        this.trailingIconColor = j3;
        this.disabledTextColor = j4;
        this.disabledLeadingIconColor = j5;
        this.disabledTrailingIconColor = j6;
    }
}
