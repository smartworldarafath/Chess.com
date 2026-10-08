package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.google.android.rj1, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/google/android/rj1;", "Lcom/google/android/gwc;", "Lcom/google/android/ei1;", "value", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "J", "getValue-0d7_KjU", "()J", "d", "color", "Lcom/google/android/qu0;", "h", "()Lcom/google/android/qu0;", "brush", "", "a", "()F", "alpha", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class ColorStyle implements gwc {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final long value;

    public /* synthetic */ ColorStyle(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }

    @Override // com.google.inputmethod.gwc
    public float a() {
        return ei1.s(getValue());
    }

    @Override // com.google.inputmethod.gwc
    /* JADX INFO: renamed from: d, reason: from getter */
    public long getValue() {
        return this.value;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ColorStyle) && ei1.r(this.value, ((ColorStyle) other).value);
    }

    @Override // com.google.inputmethod.gwc
    public qu0 h() {
        return null;
    }

    public int hashCode() {
        return ei1.x(this.value);
    }

    public String toString() {
        return "ColorStyle(value=" + ((Object) ei1.y(this.value)) + ')';
    }

    private ColorStyle(long j) {
        this.value = j;
        if (j != 16) {
            return;
        }
        ax5.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }
}
