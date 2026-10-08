package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: renamed from: com.google.android.e59, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/google/android/e59;", "Lcom/google/android/ea2;", "", "", "percent", "<init>", "(F)V", "Lcom/google/android/tsb;", "shapeSize", "Lcom/google/android/f43;", "density", "a", "(JLcom/google/android/f43;)F", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class CornerSize implements ea2 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float percent;

    public CornerSize(float f) {
        this.percent = f;
        if (f < 0.0f || f > 100.0f) {
            cx5.a("The percent should be in the range of [0, 100]");
        }
    }

    @Override // com.google.inputmethod.ea2
    public float a(long shapeSize, f43 density) {
        return tsb.k(shapeSize) * (this.percent / 100.0f);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CornerSize) && Float.compare(this.percent, ((CornerSize) other).percent) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.percent);
    }

    public String toString() {
        return "CornerSize(size = " + this.percent + "%)";
    }
}
