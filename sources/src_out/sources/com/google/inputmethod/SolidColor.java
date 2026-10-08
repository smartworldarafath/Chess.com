package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.google.android.ryb, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/google/android/ryb;", "Lcom/google/android/qu0;", "", "Lcom/google/android/ei1;", "value", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lcom/google/android/tsb;", "size", "Lcom/google/android/q09;", "p", "", "alpha", "", "a", "(JLcom/google/android/q09;F)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "c", "J", "b", "()J", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SolidColor extends qu0 {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final long value;

    public /* synthetic */ SolidColor(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }

    @Override // com.google.inputmethod.qu0
    public void a(long size, q09 p, float alpha) {
        long jP;
        p.c(1.0f);
        if (alpha == 1.0f) {
            jP = this.value;
        } else {
            long j = this.value;
            jP = ei1.p(j, ei1.s(j) * alpha, 0.0f, 0.0f, 0.0f, 14, null);
        }
        p.n(jP);
        if (p.w() != null) {
            p.D(null);
        }
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getValue() {
        return this.value;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SolidColor) && ei1.r(this.value, ((SolidColor) other).value);
    }

    public int hashCode() {
        return ei1.x(this.value);
    }

    public String toString() {
        return "SolidColor(value=" + ((Object) ei1.y(this.value)) + ')';
    }

    private SolidColor(long j) {
        super(null);
        this.value = j;
    }
}
