package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.google.android.ra7, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b\u0017\u0010\u0016¨\u0006 "}, d2 = {"Lcom/google/android/ra7;", "", "", "isEnabled", "Lcom/google/android/ei1;", "overlayColor", "multipleMatchesColor", "unmatchedElementColor", "isShowKeyLabelEnabled", "<init>", "(ZJJJZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Z", "()Z", "b", "J", "getOverlayColor-0d7_KjU", "()J", "c", "getMultipleMatchesColor-0d7_KjU", "d", "getUnmatchedElementColor-0d7_KjU", "e", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LookaheadAnimationVisualDebugConfig {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final boolean isEnabled;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final long overlayColor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final long multipleMatchesColor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final long unmatchedElementColor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final boolean isShowKeyLabelEnabled;

    public /* synthetic */ LookaheadAnimationVisualDebugConfig(boolean z, long j, long j2, long j3, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, j, j2, j3, z2);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsShowKeyLabelEnabled() {
        return this.isShowKeyLabelEnabled;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LookaheadAnimationVisualDebugConfig)) {
            return false;
        }
        LookaheadAnimationVisualDebugConfig lookaheadAnimationVisualDebugConfig = (LookaheadAnimationVisualDebugConfig) other;
        return this.isEnabled == lookaheadAnimationVisualDebugConfig.isEnabled && ei1.r(this.overlayColor, lookaheadAnimationVisualDebugConfig.overlayColor) && ei1.r(this.multipleMatchesColor, lookaheadAnimationVisualDebugConfig.multipleMatchesColor) && ei1.r(this.unmatchedElementColor, lookaheadAnimationVisualDebugConfig.unmatchedElementColor) && this.isShowKeyLabelEnabled == lookaheadAnimationVisualDebugConfig.isShowKeyLabelEnabled;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.isEnabled) * 31) + ei1.x(this.overlayColor)) * 31) + ei1.x(this.multipleMatchesColor)) * 31) + ei1.x(this.unmatchedElementColor)) * 31) + Boolean.hashCode(this.isShowKeyLabelEnabled);
    }

    public String toString() {
        return "LookaheadAnimationVisualDebugConfig(isEnabled=" + this.isEnabled + ", overlayColor=" + ((Object) ei1.y(this.overlayColor)) + ", multipleMatchesColor=" + ((Object) ei1.y(this.multipleMatchesColor)) + ", unmatchedElementColor=" + ((Object) ei1.y(this.unmatchedElementColor)) + ", isShowKeyLabelEnabled=" + this.isShowKeyLabelEnabled + ')';
    }

    private LookaheadAnimationVisualDebugConfig(boolean z, long j, long j2, long j3, boolean z2) {
        this.isEnabled = z;
        this.overlayColor = j;
        this.multipleMatchesColor = j2;
        this.unmatchedElementColor = j3;
        this.isShowKeyLabelEnabled = z2;
    }

    public /* synthetic */ LookaheadAnimationVisualDebugConfig(boolean z, long j, long j2, long j3, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? ki1.d(2150934611L) : j, (i & 4) != 0 ? ki1.d(4293542709L) : j2, (i & 8) != 0 ? ki1.d(4288323750L) : j3, (i & 16) != 0 ? false : z2, null);
    }
}
