package androidx.compose.ui.layout;

import androidx.compose.ui.node.LookaheadCapablePlaceable;
import com.google.inputmethod.nx1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\" \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\f\"\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "lookaheadCapablePlaceable", "Landroidx/compose/ui/layout/o$a;", "a", "(Landroidx/compose/ui/node/LookaheadCapablePlaceable;)Landroidx/compose/ui/layout/o$a;", "Landroidx/compose/ui/node/m;", "owner", "b", "(Landroidx/compose/ui/node/m;)Landroidx/compose/ui/layout/o$a;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/m;", "", "Lkotlin/jvm/functions/Function1;", "DefaultLayerBlock", "Lcom/google/android/kx1;", "J", "DefaultConstraints", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class PlaceableKt {
    private static final Function1<androidx.compose.ui.graphics.m, Unit> a = new Function1<androidx.compose.ui.graphics.m, Unit>() { // from class: androidx.compose.ui.layout.PlaceableKt$DefaultLayerBlock$1
        public final void a(androidx.compose.ui.graphics.m mVar) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((androidx.compose.ui.graphics.m) obj);
            return Unit.a;
        }
    };
    private static final long b = nx1.b(0, 0, 0, 0, 15, null);

    public static final o.a a(LookaheadCapablePlaceable lookaheadCapablePlaceable) {
        return new h(lookaheadCapablePlaceable);
    }

    public static final o.a b(androidx.compose.ui.node.m mVar) {
        return new n(mVar);
    }
}
