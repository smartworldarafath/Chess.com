package com.google.inputmethod;

import androidx.compose.ui.layout.j;
import androidx.compose.ui.node.k;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.google.android.s28, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\u000f\u001a\u00020\f*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0014\u001a\u00020\u0012*\u00020\u00102\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00110\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0017\u001a\u00020\u0012*\u00020\u00102\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00110\u00072\u0006\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0015J)\u0010\u0018\u001a\u00020\u0012*\u00020\u00102\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00110\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0015J)\u0010\u0019\u001a\u00020\u0012*\u00020\u00102\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00110\u00072\u0006\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lcom/google/android/s28;", "Lcom/google/android/ej7;", "Lcom/google/android/r28;", "measurePolicy", "<init>", "(Lcom/google/android/r28;)V", "Landroidx/compose/ui/layout/j;", "", "Lcom/google/android/dj7;", "measurables", "Lcom/google/android/kx1;", "constraints", "Lcom/google/android/fj7;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/j;Ljava/util/List;J)Lcom/google/android/fj7;", "measure", "Lcom/google/android/h66;", "Lcom/google/android/f66;", "", "height", "minIntrinsicWidth", "(Lcom/google/android/h66;Ljava/util/List;I)I", "width", "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/google/android/r28;", "getMeasurePolicy", "()Lcom/google/android/r28;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MultiContentMeasurePolicyImpl implements ej7 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final r28 measurePolicy;

    public MultiContentMeasurePolicyImpl(r28 r28Var) {
        this.measurePolicy = r28Var;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MultiContentMeasurePolicyImpl) && Intrinsics.e(this.measurePolicy, ((MultiContentMeasurePolicyImpl) other).measurePolicy);
    }

    public int hashCode() {
        return this.measurePolicy.hashCode();
    }

    @Override // com.google.inputmethod.ej7
    public int maxIntrinsicHeight(h66 h66Var, List<? extends f66> list, int i) {
        return this.measurePolicy.maxIntrinsicHeight(h66Var, k.a(h66Var), i);
    }

    @Override // com.google.inputmethod.ej7
    public int maxIntrinsicWidth(h66 h66Var, List<? extends f66> list, int i) {
        return this.measurePolicy.maxIntrinsicWidth(h66Var, k.a(h66Var), i);
    }

    @Override // com.google.inputmethod.ej7
    /* JADX INFO: renamed from: measure-3p2s80s */
    public fj7 mo0measure3p2s80s(j jVar, List<? extends dj7> list, long j) {
        return this.measurePolicy.mo4measure3p2s80s(jVar, k.a(jVar), j);
    }

    @Override // com.google.inputmethod.ej7
    public int minIntrinsicHeight(h66 h66Var, List<? extends f66> list, int i) {
        return this.measurePolicy.minIntrinsicHeight(h66Var, k.a(h66Var), i);
    }

    @Override // com.google.inputmethod.ej7
    public int minIntrinsicWidth(h66 h66Var, List<? extends f66> list, int i) {
        return this.measurePolicy.minIntrinsicWidth(h66Var, k.a(h66Var), i);
    }

    public String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.measurePolicy + ')';
    }
}
