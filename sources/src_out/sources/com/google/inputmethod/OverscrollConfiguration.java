package com.google.inputmethod;

import com.google.android.r43;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.google.android.wv8, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@r43
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/google/android/wv8;", "", "Lcom/google/android/ei1;", "glowColor", "Lcom/google/android/rx8;", "drawPadding", "<init>", "(JLcom/google/android/rx8;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "J", "b", "()J", "Lcom/google/android/rx8;", "()Lcom/google/android/rx8;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OverscrollConfiguration {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long glowColor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final rx8 drawPadding;

    public /* synthetic */ OverscrollConfiguration(long j, rx8 rx8Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, rx8Var);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final rx8 getDrawPadding() {
        return this.drawPadding;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getGlowColor() {
        return this.glowColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.e(OverscrollConfiguration.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.h(other, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        OverscrollConfiguration overscrollConfiguration = (OverscrollConfiguration) other;
        return ei1.r(this.glowColor, overscrollConfiguration.glowColor) && Intrinsics.e(this.drawPadding, overscrollConfiguration.drawPadding);
    }

    public int hashCode() {
        return (ei1.x(this.glowColor) * 31) + this.drawPadding.hashCode();
    }

    public String toString() {
        return "OverscrollConfiguration(glowColor=" + ((Object) ei1.y(this.glowColor)) + ", drawPadding=" + this.drawPadding + ')';
    }

    private OverscrollConfiguration(long j, rx8 rx8Var) {
        this.glowColor = j;
        this.drawPadding = rx8Var;
    }

    public /* synthetic */ OverscrollConfiguration(long j, rx8 rx8Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ki1.d(4284900966L) : j, (i & 2) != 0 ? nx8.g(0.0f, 0.0f, 3, null) : rx8Var, null);
    }
}
