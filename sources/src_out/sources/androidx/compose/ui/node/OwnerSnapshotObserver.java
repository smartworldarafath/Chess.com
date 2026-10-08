package androidx.compose.ui.node;

import com.google.inputmethod.ew8;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\r\u0010\tJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000e\u0010\tR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0015R \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0015R \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0015R \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0015¨\u0006#"}, d2 = {"Landroidx/compose/ui/node/OwnerSnapshotObserver;", "", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "onChangedExecutor", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "j", "()V", "target", "i", "(Ljava/lang/Object;)V", "k", "l", "Landroidx/compose/runtime/snapshots/j;", "a", "Landroidx/compose/runtime/snapshots/j;", "observer", "Landroidx/compose/ui/node/LayoutNode;", "b", "Lkotlin/jvm/functions/Function1;", "onCommitAffectingLookaheadMeasure", "c", "onCommitAffectingMeasure", "d", "onCommitAffectingSemantics", "e", "onCommitAffectingLayout", "f", "onCommitAffectingLayoutModifier", "g", "onCommitAffectingLayoutModifierInLookahead", "h", "onCommitAffectingLookahead", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OwnerSnapshotObserver {
    public static final int i = androidx.compose.p004runtime.snapshots.j.l;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final androidx.compose.p004runtime.snapshots.j observer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Function1<LayoutNode, Unit> onCommitAffectingLookaheadMeasure = new Function1<LayoutNode, Unit>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLookaheadMeasure$1
        public final void a(LayoutNode layoutNode) {
            if (layoutNode.z0()) {
                LayoutNode.G1(layoutNode, false, false, false, 7, null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((LayoutNode) obj);
            return Unit.a;
        }
    };

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Function1<LayoutNode, Unit> onCommitAffectingMeasure = new Function1<LayoutNode, Unit>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingMeasure$1
        public final void a(LayoutNode layoutNode) {
            if (layoutNode.z0()) {
                LayoutNode.K1(layoutNode, false, false, false, 7, null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((LayoutNode) obj);
            return Unit.a;
        }
    };

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Function1<LayoutNode, Unit> onCommitAffectingSemantics = new Function1<LayoutNode, Unit>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingSemantics$1
        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final void a(LayoutNode layoutNode) throws KotlinNothingValueException {
            if (layoutNode.z0()) {
                layoutNode.W0();
            }
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws KotlinNothingValueException {
            a((LayoutNode) obj);
            return Unit.a;
        }
    };

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Function1<LayoutNode, Unit> onCommitAffectingLayout = new Function1<LayoutNode, Unit>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1
        public final void a(LayoutNode layoutNode) {
            if (layoutNode.z0()) {
                LayoutNode.I1(layoutNode, false, 1, null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((LayoutNode) obj);
            return Unit.a;
        }
    };

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Function1<LayoutNode, Unit> onCommitAffectingLayoutModifier = new Function1<LayoutNode, Unit>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayoutModifier$1
        public final void a(LayoutNode layoutNode) {
            if (layoutNode.z0()) {
                LayoutNode.I1(layoutNode, false, 1, null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((LayoutNode) obj);
            return Unit.a;
        }
    };

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Function1<LayoutNode, Unit> onCommitAffectingLayoutModifierInLookahead = new Function1<LayoutNode, Unit>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayoutModifierInLookahead$1
        public final void a(LayoutNode layoutNode) {
            if (layoutNode.z0()) {
                LayoutNode.E1(layoutNode, false, 1, null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((LayoutNode) obj);
            return Unit.a;
        }
    };

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final Function1<LayoutNode, Unit> onCommitAffectingLookahead = new Function1<LayoutNode, Unit>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLookahead$1
        public final void a(LayoutNode layoutNode) {
            if (layoutNode.z0()) {
                LayoutNode.E1(layoutNode, false, 1, null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((LayoutNode) obj);
            return Unit.a;
        }
    };

    public OwnerSnapshotObserver(Function1<? super Function0<Unit>, Unit> function1) {
        this.observer = new androidx.compose.p004runtime.snapshots.j(function1);
    }

    public final void i(Object target) {
        this.observer.g(target);
    }

    public final void j() {
        this.observer.h(new Function1<Object, Boolean>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$clearInvalidObservations$1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Object obj) {
                Intrinsics.h(obj, "null cannot be cast to non-null type androidx.compose.ui.node.OwnerScope");
                return Boolean.valueOf(!((ew8) obj).z0());
            }
        });
    }

    public final void k() {
        this.observer.q();
    }

    public final void l() {
        this.observer.r();
        this.observer.f();
    }
}
