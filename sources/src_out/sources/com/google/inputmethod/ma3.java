package com.google.inputmethod;

import androidx.constraintlayout.compose.Dimension;
import androidx.constraintlayout.core.state.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00022\u00020\u0003B!\b\u0000\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u000b\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\f\u0010\rR$\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR-\u0010\u0016\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u001bR-\u0010\u001f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u0015R$\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0018\u001a\u0004\b\u000e\u0010\u0019\"\u0004\b!\u0010\u001b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Lcom/google/android/ma3;", "Landroidx/constraintlayout/compose/Dimension$a;", "", "Landroidx/constraintlayout/compose/Dimension;", "Lkotlin/Function1;", "Lcom/google/android/n6c;", "Landroidx/constraintlayout/core/state/b;", "Landroidx/constraintlayout/compose/SolverDimension;", "baseDimension", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "state", "e", "(Lcom/google/android/n6c;)Landroidx/constraintlayout/core/state/b;", "b", "Lkotlin/jvm/functions/Function1;", "Lcom/google/android/ff3;", "c", "Lcom/google/android/ff3;", "()Lcom/google/android/ff3;", "setMin-YLDhkOg", "(Lcom/google/android/ff3;)V", "min", "d", "Ljava/lang/Object;", "()Ljava/lang/Object;", "setMinSymbol", "(Ljava/lang/Object;)V", "minSymbol", "a", "setMax-YLDhkOg", "max", "f", "setMaxSymbol", "maxSymbol", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ma3 implements Dimension.a, Dimension {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Function1<n6c, b> baseDimension;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private ff3 min;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private Object minSymbol;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private ff3 max;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private Object maxSymbol;

    /* JADX WARN: Multi-variable type inference failed */
    public ma3(Function1<? super n6c, ? extends b> function1) {
        Intrinsics.checkNotNullParameter(function1, "baseDimension");
        this.baseDimension = function1;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ff3 getMax() {
        return this.max;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Object getMaxSymbol() {
        return this.maxSymbol;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final ff3 getMin() {
        return this.min;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Object getMinSymbol() {
        return this.minSymbol;
    }

    public final b e(n6c state) {
        Intrinsics.checkNotNullParameter(state, "state");
        b bVar = (b) this.baseDimension.invoke(state);
        if (getMinSymbol() != null) {
            bVar.p(getMinSymbol());
        } else if (getMin() != null) {
            ff3 min = getMin();
            Intrinsics.g(min);
            bVar.o(state.d(min));
        }
        if (getMaxSymbol() != null) {
            bVar.n(getMaxSymbol());
            return bVar;
        }
        if (getMax() != null) {
            ff3 max = getMax();
            Intrinsics.g(max);
            bVar.m(state.d(max));
        }
        return bVar;
    }
}
