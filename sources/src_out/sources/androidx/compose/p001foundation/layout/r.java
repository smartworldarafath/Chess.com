package androidx.compose.p001foundation.layout;

import com.google.inputmethod.yy5;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000b\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u000b\u0010\u0007R\"\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/foundation/layout/r;", "Lcom/google/android/yy5;", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/g1;", "", "block", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "ancestorConsumedInsets", "o3", "(Landroidx/compose/foundation/layout/g1;)Landroidx/compose/foundation/layout/g1;", "w3", "r", "Lkotlin/jvm/functions/Function1;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class r extends yy5 {

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private Function1<? super g1, Unit> block;

    public r(Function1<? super g1, Unit> function1) {
        this.block = function1;
    }

    @Override // com.google.inputmethod.yy5
    public g1 o3(g1 ancestorConsumedInsets) {
        this.block.invoke(ancestorConsumedInsets);
        return ancestorConsumedInsets;
    }

    public final void w3(Function1<? super g1, Unit> block) {
        if (block != this.block) {
            this.block = block;
        }
    }
}
