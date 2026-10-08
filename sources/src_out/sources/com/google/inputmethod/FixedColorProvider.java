package com.google.inputmethod;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.google.android.be4, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Lcom/google/android/be4;", "Lcom/google/android/ti1;", "Lcom/google/android/ei1;", "color", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroid/content/Context;", "context", "a", "(Landroid/content/Context;)J", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "b", "()J", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class FixedColorProvider implements ti1 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long color;

    public /* synthetic */ FixedColorProvider(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }

    @Override // com.google.inputmethod.ti1
    public long a(Context context) {
        return this.color;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getColor() {
        return this.color;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FixedColorProvider) && ei1.r(this.color, ((FixedColorProvider) other).color);
    }

    public int hashCode() {
        return ei1.x(this.color);
    }

    public String toString() {
        return "FixedColorProvider(color=" + ((Object) ei1.y(this.color)) + ')';
    }

    private FixedColorProvider(long j) {
        this.color = j;
    }
}
