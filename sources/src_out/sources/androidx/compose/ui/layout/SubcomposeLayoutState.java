package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import com.google.inputmethod.fhd;
import com.google.inputmethod.fj7;
import com.google.inputmethod.fob;
import com.google.inputmethod.kx1;
import com.google.inputmethod.q16;
import com.google.inputmethod.scc;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0012\u0015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J%\u0010\f\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R,\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR,\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\t0\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b \u0010\u001dR>\u0010&\u001a&\u0012\u0004\u0012\u00020\u0019\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\u0018\u0012\u0004\u0012\u00020\t0\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b%\u0010\u001dR\u0014\u0010)\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Landroidx/compose/ui/layout/SubcomposeLayoutState;", "", "Landroidx/compose/ui/layout/w;", "slotReusePolicy", "<init>", "(Landroidx/compose/ui/layout/w;)V", "()V", "slotId", "Lkotlin/Function0;", "", "content", "Landroidx/compose/ui/layout/SubcomposeLayoutState$b;", "j", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/layout/SubcomposeLayoutState$b;", "Landroidx/compose/ui/layout/SubcomposeLayoutState$a;", "d", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/layout/SubcomposeLayoutState$a;", "e", "a", "Landroidx/compose/ui/layout/w;", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "b", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "_state", "Lkotlin/Function2;", "Landroidx/compose/ui/node/LayoutNode;", "c", "Lkotlin/jvm/functions/Function2;", "h", "()Lkotlin/jvm/functions/Function2;", "setRoot", "Landroidx/compose/runtime/f;", "f", "setCompositionContext", "Lcom/google/android/scc;", "Lcom/google/android/kx1;", "Lcom/google/android/fj7;", "g", "setMeasurePolicy", "i", "()Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "state", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SubcomposeLayoutState {
    public static final int f = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final w slotReusePolicy;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private LayoutNodeSubcompositionsState _state;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Function2<LayoutNode, SubcomposeLayoutState, Unit> setRoot;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Function2<LayoutNode, androidx.compose.p004runtime.f, Unit> setCompositionContext;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Function2<LayoutNode, Function2<? super scc, ? super kx1, ? extends fj7>, Unit> setMeasurePolicy;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\bv\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/SubcomposeLayoutState$a;", "", "Lcom/google/android/fob;", "shouldPause", "", "b", "(Lcom/google/android/fob;)Z", "Landroidx/compose/ui/layout/SubcomposeLayoutState$b;", "apply", "()Landroidx/compose/ui/layout/SubcomposeLayoutState$b;", "", "cancel", "()V", "a", "()Z", "isComplete", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface a {
        /* JADX INFO: renamed from: a */
        boolean getIsComplete();

        b apply();

        boolean b(fob shouldPause);

        void cancel();
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ-\u0010\u0010\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/SubcomposeLayoutState$b;", "", "", "dispose", "()V", "", "index", "Lcom/google/android/kx1;", "constraints", "e", "(IJ)V", "key", "Lkotlin/Function1;", "Lcom/google/android/fhd;", "Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;", "block", "d", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "Lcom/google/android/q16;", "c", "(I)J", "b", "()I", "placeablesCount", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface b {
        default int b() {
            return 0;
        }

        default long c(int index) {
            return q16.INSTANCE.a();
        }

        default void d(Object key, Function1<? super fhd, ? extends TraversableNode$Companion$TraverseDescendantsAction> block) {
        }

        void dispose();

        default void e(int index, long constraints) {
        }
    }

    public SubcomposeLayoutState(w wVar) {
        this.slotReusePolicy = wVar;
        this.setRoot = new Function2<LayoutNode, SubcomposeLayoutState, Unit>() { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$setRoot$1
            {
                super(2);
            }

            public final void a(LayoutNode layoutNode, SubcomposeLayoutState subcomposeLayoutState) {
                SubcomposeLayoutState subcomposeLayoutState2 = this.this$0;
                LayoutNodeSubcompositionsState subcompositionsState = layoutNode.getSubcompositionsState();
                if (subcompositionsState == null) {
                    subcompositionsState = new LayoutNodeSubcompositionsState(layoutNode, this.this$0.slotReusePolicy);
                    layoutNode.f2(subcompositionsState);
                }
                subcomposeLayoutState2._state = subcompositionsState;
                this.this$0.i().I();
                this.this$0.i().S(this.this$0.slotReusePolicy);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((LayoutNode) obj, (SubcomposeLayoutState) obj2);
                return Unit.a;
            }
        };
        this.setCompositionContext = new Function2<LayoutNode, androidx.compose.p004runtime.f, Unit>() { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$setCompositionContext$1
            {
                super(2);
            }

            public final void a(LayoutNode layoutNode, androidx.compose.p004runtime.f fVar) {
                this.this$0.i().R(fVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((LayoutNode) obj, (androidx.compose.p004runtime.f) obj2);
                return Unit.a;
            }
        };
        this.setMeasurePolicy = new Function2<LayoutNode, Function2<? super scc, ? super kx1, ? extends fj7>, Unit>() { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$setMeasurePolicy$1
            {
                super(2);
            }

            public final void a(LayoutNode layoutNode, Function2<? super scc, ? super kx1, ? extends fj7> function2) {
                layoutNode.m(this.this$0.i().x(function2));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((LayoutNode) obj, (Function2) obj2);
                return Unit.a;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutNodeSubcompositionsState i() {
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this._state;
        if (layoutNodeSubcompositionsState != null) {
            return layoutNodeSubcompositionsState;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }

    public final a d(Object slotId, Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> content) {
        return i().O(slotId, content);
    }

    public final void e() {
        i().F();
    }

    public final Function2<LayoutNode, androidx.compose.p004runtime.f, Unit> f() {
        return this.setCompositionContext;
    }

    public final Function2<LayoutNode, Function2<? super scc, ? super kx1, ? extends fj7>, Unit> g() {
        return this.setMeasurePolicy;
    }

    public final Function2<LayoutNode, SubcomposeLayoutState, Unit> h() {
        return this.setRoot;
    }

    public final b j(Object slotId, Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> content) {
        return i().M(slotId, content);
    }

    public SubcomposeLayoutState() {
        this(k.a);
    }
}
