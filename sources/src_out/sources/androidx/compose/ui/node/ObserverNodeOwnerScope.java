package androidx.compose.ui.node;

import com.google.inputmethod.ew8;
import com.google.inputmethod.on8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u0000 \b2\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/node/ObserverNodeOwnerScope;", "Lcom/google/android/ew8;", "Lcom/google/android/on8;", "observerNode", "<init>", "(Lcom/google/android/on8;)V", "a", "Lcom/google/android/on8;", "b", "()Lcom/google/android/on8;", "", "z0", "()Z", "isValidOwnerScope", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ObserverNodeOwnerScope implements ew8 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int c = 8;
    private static final Function1<ObserverNodeOwnerScope, Unit> d = new Function1<ObserverNodeOwnerScope, Unit>() { // from class: androidx.compose.ui.node.ObserverNodeOwnerScope$Companion$OnObserveReadsChanged$1
        public final void a(ObserverNodeOwnerScope observerNodeOwnerScope) {
            if (observerNodeOwnerScope.z0()) {
                observerNodeOwnerScope.getObserverNode().M1();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((ObserverNodeOwnerScope) obj);
            return Unit.a;
        }
    };

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final on8 observerNode;

    /* JADX INFO: renamed from: androidx.compose.ui.node.ObserverNodeOwnerScope$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/node/ObserverNodeOwnerScope$a;", "", "<init>", "()V", "Lkotlin/Function1;", "Landroidx/compose/ui/node/ObserverNodeOwnerScope;", "", "OnObserveReadsChanged", "Lkotlin/jvm/functions/Function1;", "a", "()Lkotlin/jvm/functions/Function1;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Function1<ObserverNodeOwnerScope, Unit> a() {
            return ObserverNodeOwnerScope.d;
        }

        private Companion() {
        }
    }

    public ObserverNodeOwnerScope(on8 on8Var) {
        this.observerNode = on8Var;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final on8 getObserverNode() {
        return this.observerNode;
    }

    @Override // com.google.inputmethod.ew8
    public boolean z0() {
        return this.observerNode.getNode().getIsAttached();
    }
}
