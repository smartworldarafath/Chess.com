package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B+\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001bR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/google/android/apa;", "Lcom/google/android/av5;", "", "bounded", "Lcom/google/android/ff3;", "radius", "Lcom/google/android/ri1;", "colorProducer", "Lcom/google/android/ei1;", "color", "<init>", "(ZFLcom/google/android/ri1;J)V", "(ZFJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lcom/google/android/j26;", "interactionSource", "Lcom/google/android/x23;", "b", "(Lcom/google/android/j26;)Lcom/google/android/x23;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Z", "F", "c", "Lcom/google/android/ri1;", "d", "J", "material"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class apa implements av5 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean bounded;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float radius;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final ri1 colorProducer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long color;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements ri1 {
        a() {
        }

        @Override // com.google.inputmethod.ri1
        public final long a() {
            return apa.this.color;
        }
    }

    public /* synthetic */ apa(boolean z, float f, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, f, j);
    }

    @Override // com.google.inputmethod.av5
    public x23 b(j26 interactionSource) {
        ri1 aVar = this.colorProducer;
        if (aVar == null) {
            aVar = new a();
        }
        return new v33(interactionSource, this.bounded, this.radius, aVar, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof apa)) {
            return false;
        }
        apa apaVar = (apa) other;
        if (this.bounded == apaVar.bounded && ff3.k(this.radius, apaVar.radius) && Intrinsics.e(this.colorProducer, apaVar.colorProducer)) {
            return ei1.r(this.color, apaVar.color);
        }
        return false;
    }

    @Override // com.google.inputmethod.av5
    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.bounded) * 31) + ff3.l(this.radius)) * 31;
        ri1 ri1Var = this.colorProducer;
        return ((iHashCode + (ri1Var != null ? ri1Var.hashCode() : 0)) * 31) + ei1.x(this.color);
    }

    private apa(boolean z, float f, ri1 ri1Var, long j) {
        this.bounded = z;
        this.radius = f;
        this.colorProducer = ri1Var;
        this.color = j;
    }

    private apa(boolean z, float f, long j) {
        this(z, f, (ri1) null, j);
    }
}
