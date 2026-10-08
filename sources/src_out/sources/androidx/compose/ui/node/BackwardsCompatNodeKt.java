package androidx.compose.ui.node;

import com.google.inputmethod.emc;
import com.google.inputmethod.ty7;
import com.google.inputmethod.y23;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\" \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\" \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/node/BackwardsCompatNode;", "", "e", "(Landroidx/compose/ui/node/BackwardsCompatNode;)Z", "androidx/compose/ui/node/BackwardsCompatNodeKt$a", "a", "Landroidx/compose/ui/node/BackwardsCompatNodeKt$a;", "DetachedModifierLocalReadScope", "Lkotlin/Function1;", "", "b", "Lkotlin/jvm/functions/Function1;", "onDrawCacheReadsChanged", "c", "updateModifierLocalConsumer", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class BackwardsCompatNodeKt {
    private static final a a = new a();
    private static final Function1<BackwardsCompatNode, Unit> b = new Function1<BackwardsCompatNode, Unit>() { // from class: androidx.compose.ui.node.BackwardsCompatNodeKt$onDrawCacheReadsChanged$1
        public final void a(BackwardsCompatNode backwardsCompatNode) {
            backwardsCompatNode.q3();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((BackwardsCompatNode) obj);
            return Unit.a;
        }
    };
    private static final Function1<BackwardsCompatNode, Unit> c = new Function1<BackwardsCompatNode, Unit>() { // from class: androidx.compose.ui.node.BackwardsCompatNodeKt$updateModifierLocalConsumer$1
        public final void a(BackwardsCompatNode backwardsCompatNode) {
            backwardsCompatNode.u3();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((BackwardsCompatNode) obj);
            return Unit.a;
        }
    };

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/node/BackwardsCompatNodeKt$a", "Lcom/google/android/ty7;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements ty7 {
        a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(BackwardsCompatNode backwardsCompatNode) {
        androidx.compose.ui.b.c tail = y23.q(backwardsCompatNode).getNodes().getTail();
        Intrinsics.h(tail, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
        return ((emc) tail).getAttachHasBeenRun();
    }
}
