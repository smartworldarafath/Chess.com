package androidx.compose.p001foundation.layout;

import androidx.compose.ui.layout.j;
import androidx.compose.ui.layout.o;
import com.google.inputmethod.dj7;
import com.google.inputmethod.ej7;
import com.google.inputmethod.fj7;
import com.google.inputmethod.kx1;
import com.google.inputmethod.nx1;
import com.google.inputmethod.tc;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.n, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u0011\u001a\u00020\u000e*\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Landroidx/compose/foundation/layout/n;", "Lcom/google/android/ej7;", "Lcom/google/android/tc;", "alignment", "", "propagateMinConstraints", "<init>", "(Lcom/google/android/tc;Z)V", "Landroidx/compose/ui/layout/j;", "", "Lcom/google/android/dj7;", "measurables", "Lcom/google/android/kx1;", "constraints", "Lcom/google/android/fj7;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/j;Ljava/util/List;J)Lcom/google/android/fj7;", "measure", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/google/android/tc;", "b", "Z", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class BoxMeasurePolicy implements ej7 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final tc alignment;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final boolean propagateMinConstraints;

    public BoxMeasurePolicy(tc tcVar, boolean z) {
        this.alignment = tcVar;
        this.propagateMinConstraints = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(o.a aVar) {
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(o oVar, dj7 dj7Var, j jVar, int i, int i2, BoxMeasurePolicy boxMeasurePolicy, o.a aVar) {
        j.j(aVar, oVar, dj7Var, jVar.getLayoutDirection(), i, i2, boxMeasurePolicy.alignment);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(o[] oVarArr, List list, j jVar, Ref.IntRef intRef, Ref.IntRef intRef2, BoxMeasurePolicy boxMeasurePolicy, o.a aVar) {
        int length = oVarArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            o oVar = oVarArr[i];
            Intrinsics.h(oVar, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
            j.j(aVar, oVar, (dj7) list.get(i2), jVar.getLayoutDirection(), intRef.element, intRef2.element, boxMeasurePolicy.alignment);
            i++;
            i2++;
        }
        return Unit.a;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BoxMeasurePolicy)) {
            return false;
        }
        BoxMeasurePolicy boxMeasurePolicy = (BoxMeasurePolicy) other;
        return Intrinsics.e(this.alignment, boxMeasurePolicy.alignment) && this.propagateMinConstraints == boxMeasurePolicy.propagateMinConstraints;
    }

    public int hashCode() {
        return (this.alignment.hashCode() * 31) + Boolean.hashCode(this.propagateMinConstraints);
    }

    @Override // com.google.inputmethod.ej7
    /* JADX INFO: renamed from: measure-3p2s80s */
    public fj7 mo0measure3p2s80s(final j jVar, final List<? extends dj7> list, long j) {
        int iM;
        final int i;
        final o oVarR0;
        if (list.isEmpty()) {
            return j.Q1(jVar, kx1.n(j), kx1.m(j), null, new Function1() { // from class: androidx.compose.foundation.layout.k
                public final Object invoke(Object obj) {
                    return BoxMeasurePolicy.d((o.a) obj);
                }
            }, 4, null);
        }
        long jB = this.propagateMinConstraints ? j : kx1.b((-8589934589L) & j);
        if (list.size() == 1) {
            final dj7 dj7Var = list.get(0);
            if (j.h(dj7Var)) {
                int iN = kx1.n(j);
                iM = kx1.m(j);
                i = iN;
                oVarR0 = dj7Var.r0(kx1.INSTANCE.c(kx1.n(j), kx1.m(j)));
            } else {
                o oVarR1 = dj7Var.r0(jB);
                int iMax = Math.max(kx1.n(j), oVarR1.getWidth());
                iM = Math.max(kx1.m(j), oVarR1.getHeight());
                i = iMax;
                oVarR0 = oVarR1;
            }
            final int i2 = iM;
            return j.Q1(jVar, i, i2, null, new Function1() { // from class: androidx.compose.foundation.layout.l
                public final Object invoke(Object obj) {
                    return BoxMeasurePolicy.e(oVarR0, dj7Var, jVar, i, i2, this, (o.a) obj);
                }
            }, 4, null);
        }
        final o[] oVarArr = new o[list.size()];
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = kx1.n(j);
        final Ref.IntRef intRef2 = new Ref.IntRef();
        intRef2.element = kx1.m(j);
        int size = list.size();
        boolean z = false;
        for (int i3 = 0; i3 < size; i3++) {
            dj7 dj7Var2 = list.get(i3);
            if (j.h(dj7Var2)) {
                z = true;
            } else {
                o oVarR2 = dj7Var2.r0(jB);
                oVarArr[i3] = oVarR2;
                intRef.element = Math.max(intRef.element, oVarR2.getWidth());
                intRef2.element = Math.max(intRef2.element, oVarR2.getHeight());
            }
        }
        if (z) {
            int i4 = intRef.element;
            int i5 = i4 != Integer.MAX_VALUE ? i4 : 0;
            int i6 = intRef2.element;
            long jA = nx1.a(i5, i4, i6 != Integer.MAX_VALUE ? i6 : 0, i6);
            int size2 = list.size();
            for (int i7 = 0; i7 < size2; i7++) {
                dj7 dj7Var3 = list.get(i7);
                if (j.h(dj7Var3)) {
                    oVarArr[i7] = dj7Var3.r0(jA);
                }
            }
        }
        return j.Q1(jVar, intRef.element, intRef2.element, null, new Function1() { // from class: androidx.compose.foundation.layout.m
            public final Object invoke(Object obj) {
                return BoxMeasurePolicy.f(oVarArr, list, jVar, intRef, intRef2, this, (o.a) obj);
            }
        }, 4, null);
    }

    public String toString() {
        return "BoxMeasurePolicy(alignment=" + this.alignment + ", propagateMinConstraints=" + this.propagateMinConstraints + ')';
    }
}
