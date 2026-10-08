package androidx.lifecycle;

import com.google.inputmethod.bv7;
import com.google.inputmethod.n17;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/lifecycle/b;", "Landroidx/lifecycle/i;", "", "Landroidx/lifecycle/d;", "generatedAdapters", "<init>", "([Landroidx/lifecycle/d;)V", "Lcom/google/android/n17;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "", "d6", "(Lcom/google/android/n17;Landroidx/lifecycle/Lifecycle$Event;)V", "a", "[Landroidx/lifecycle/d;", "lifecycle-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b implements i {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final d[] generatedAdapters;

    public b(d[] dVarArr) {
        Intrinsics.checkNotNullParameter(dVarArr, "generatedAdapters");
        this.generatedAdapters = dVarArr;
    }

    @Override // androidx.lifecycle.i
    public void d6(n17 source, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        bv7 bv7Var = new bv7();
        for (d dVar : this.generatedAdapters) {
            dVar.a(source, event, false, bv7Var);
        }
        for (d dVar2 : this.generatedAdapters) {
            dVar2.a(source, event, true, bv7Var);
        }
    }
}
