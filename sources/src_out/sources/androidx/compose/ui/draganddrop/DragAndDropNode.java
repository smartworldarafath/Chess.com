package androidx.compose.ui.draganddrop;

import androidx.compose.ui.b;
import androidx.compose.ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import com.google.inputmethod.fhd;
import com.google.inputmethod.fn6;
import com.google.inputmethod.ghd;
import com.google.inputmethod.lf3;
import com.google.inputmethod.mf3;
import com.google.inputmethod.nf3;
import com.google.inputmethod.of3;
import com.google.inputmethod.q16;
import com.google.inputmethod.qf3;
import com.google.inputmethod.rn8;
import com.google.inputmethod.x23;
import com.google.inputmethod.y23;
import com.google.inputmethod.zw5;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 82\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00032\u00020\u00032\u00020\u0004:\u00019B?\u0012\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012\u0018\b\u0002\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001d\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001e\u0010\u0017J\u0017\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001f\u0010\u001aR*\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R$\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010(\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0018\u0010+\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010.\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\"\u0010\u0011\u001a\u00020\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u0010\u0013R\u0014\u00107\u001a\u0002048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u0006:"}, d2 = {"Landroidx/compose/ui/draganddrop/DragAndDropNode;", "Landroidx/compose/ui/b$c;", "Lcom/google/android/fhd;", "", "Lcom/google/android/of3;", "Lkotlin/Function2;", "Lcom/google/android/rn8;", "", "onStartTransfer", "Lkotlin/Function1;", "Lcom/google/android/lf3;", "onDropTargetValidate", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "W2", "()V", "Lcom/google/android/q16;", "size", "f", "(J)V", "startEvent", "", "m3", "(Lcom/google/android/lf3;)Z", "event", "d0", "(Lcom/google/android/lf3;)V", "f1", "F1", "d1", "N1", "v0", "p", "Lkotlin/jvm/functions/Function2;", "q", "Lkotlin/jvm/functions/Function1;", "r", "Ljava/lang/Object;", "p1", "()Ljava/lang/Object;", "traverseKey", "s", "Landroidx/compose/ui/draganddrop/DragAndDropNode;", "lastChildDragAndDropModifierNode", "t", "Lcom/google/android/of3;", "thisDragAndDropTarget", "u", "J", "t3", "()J", "setSize-ozmzZPI$ui", "Lcom/google/android/mf3;", "s3", "()Lcom/google/android/mf3;", "dragAndDropManager", "v", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DragAndDropNode extends b.c implements fhd, x23, of3, fn6 {
    private static final a v = new a(null);
    public static final int w = 8;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private Function2<Object, ? super rn8, Unit> onStartTransfer;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final Function1<lf3, of3> onDropTargetValidate;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final Object traverseKey;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private DragAndDropNode lastChildDragAndDropModifierNode;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private of3 thisDragAndDropTarget;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private long size;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/draganddrop/DragAndDropNode$a;", "", "<init>", "()V", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {

        /* JADX INFO: renamed from: androidx.compose.ui.draganddrop.DragAndDropNode$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/draganddrop/DragAndDropNode$a$a;", "", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
        private static final class C0051a {
            public static final C0051a a = new C0051a();

            private C0051a() {
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DragAndDropNode() {
        Function2 function2 = null;
        this(function2, function2, 3, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final mf3 s3() {
        return y23.r(this).getDragAndDropManager();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // com.google.inputmethod.of3
    public void F1(final lf3 event) throws KotlinNothingValueException {
        fhd fhdVar;
        DragAndDropNode dragAndDropNode;
        DragAndDropNode dragAndDropNode2 = this.lastChildDragAndDropModifierNode;
        if (dragAndDropNode2 == null || !nf3.d(dragAndDropNode2, qf3.a(event))) {
            if (getNode().getIsAttached()) {
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                ghd.f(this, new Function1<DragAndDropNode, TraversableNode$Companion$TraverseDescendantsAction>() { // from class: androidx.compose.ui.draganddrop.DragAndDropNode$onMoved$$inlined$firstDescendantOrNull$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final TraversableNode$Companion$TraverseDescendantsAction invoke(DragAndDropNode dragAndDropNode3) {
                        DragAndDropNode dragAndDropNode4 = dragAndDropNode3;
                        if (!this.s3().a(dragAndDropNode4) || !nf3.d(dragAndDropNode4, qf3.a(event))) {
                            return TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal;
                        }
                        objectRef.element = dragAndDropNode3;
                        return TraversableNode$Companion$TraverseDescendantsAction.CancelTraversal;
                    }
                });
                fhdVar = (fhd) objectRef.element;
            } else {
                fhdVar = null;
            }
            dragAndDropNode = (DragAndDropNode) fhdVar;
        } else {
            dragAndDropNode = dragAndDropNode2;
        }
        if (dragAndDropNode != null && dragAndDropNode2 == null) {
            nf3.e(dragAndDropNode, event);
            of3 of3Var = this.thisDragAndDropTarget;
            if (of3Var != null) {
                of3Var.d1(event);
            }
        } else if (dragAndDropNode == null && dragAndDropNode2 != null) {
            of3 of3Var2 = this.thisDragAndDropTarget;
            if (of3Var2 != null) {
                nf3.e(of3Var2, event);
            }
            dragAndDropNode2.d1(event);
        } else if (!Intrinsics.e(dragAndDropNode, dragAndDropNode2)) {
            if (dragAndDropNode != null) {
                nf3.e(dragAndDropNode, event);
            }
            if (dragAndDropNode2 != null) {
                dragAndDropNode2.d1(event);
            }
        } else if (dragAndDropNode != null) {
            dragAndDropNode.F1(event);
        } else {
            of3 of3Var3 = this.thisDragAndDropTarget;
            if (of3Var3 != null) {
                of3Var3.F1(event);
            }
        }
        this.lastChildDragAndDropModifierNode = dragAndDropNode;
    }

    @Override // com.google.inputmethod.of3
    public boolean N1(lf3 event) {
        DragAndDropNode dragAndDropNode = this.lastChildDragAndDropModifierNode;
        if (dragAndDropNode != null) {
            return dragAndDropNode.N1(event);
        }
        of3 of3Var = this.thisDragAndDropTarget;
        if (of3Var != null) {
            return of3Var.N1(event);
        }
        return false;
    }

    @Override // androidx.compose.ui.b.c
    public void W2() {
        this.thisDragAndDropTarget = null;
        this.lastChildDragAndDropModifierNode = null;
    }

    @Override // com.google.inputmethod.of3
    public void d0(lf3 event) {
        of3 of3Var = this.thisDragAndDropTarget;
        if (of3Var != null) {
            of3Var.d0(event);
            return;
        }
        DragAndDropNode dragAndDropNode = this.lastChildDragAndDropModifierNode;
        if (dragAndDropNode != null) {
            dragAndDropNode.d0(event);
        }
    }

    @Override // com.google.inputmethod.of3
    public void d1(lf3 event) {
        of3 of3Var = this.thisDragAndDropTarget;
        if (of3Var != null) {
            of3Var.d1(event);
        }
        DragAndDropNode dragAndDropNode = this.lastChildDragAndDropModifierNode;
        if (dragAndDropNode != null) {
            dragAndDropNode.d1(event);
        }
        this.lastChildDragAndDropModifierNode = null;
    }

    @Override // com.google.inputmethod.fn6, com.google.inputmethod.kj7
    public void f(long size) {
        this.size = size;
    }

    @Override // com.google.inputmethod.of3
    public void f1(lf3 event) {
        of3 of3Var = this.thisDragAndDropTarget;
        if (of3Var != null) {
            of3Var.f1(event);
            return;
        }
        DragAndDropNode dragAndDropNode = this.lastChildDragAndDropModifierNode;
        if (dragAndDropNode != null) {
            dragAndDropNode.f1(event);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public boolean m3(final lf3 startEvent) throws KotlinNothingValueException {
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        nf3.f(this, new Function1<DragAndDropNode, TraversableNode$Companion$TraverseDescendantsAction>() { // from class: androidx.compose.ui.draganddrop.DragAndDropNode$acceptDragAndDropTransfer$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TraversableNode$Companion$TraverseDescendantsAction invoke(DragAndDropNode dragAndDropNode) {
                if (!dragAndDropNode.getIsAttached()) {
                    return TraversableNode$Companion$TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
                }
                if (!(dragAndDropNode.thisDragAndDropTarget == null)) {
                    zw5.c("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                }
                Function1 function1 = dragAndDropNode.onDropTargetValidate;
                dragAndDropNode.thisDragAndDropTarget = function1 != null ? (of3) function1.invoke(startEvent) : null;
                boolean z = dragAndDropNode.thisDragAndDropTarget != null;
                if (z) {
                    this.s3().b(dragAndDropNode);
                }
                Ref.BooleanRef booleanRef2 = booleanRef;
                booleanRef2.element = booleanRef2.element || z;
                return TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal;
            }
        });
        return booleanRef.element;
    }

    @Override // com.google.inputmethod.fhd
    /* JADX INFO: renamed from: p1, reason: from getter */
    public Object getTraverseKey() {
        return this.traverseKey;
    }

    /* JADX INFO: renamed from: t3, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // com.google.inputmethod.of3
    public void v0(final lf3 event) throws KotlinNothingValueException {
        nf3.f(this, new Function1<DragAndDropNode, TraversableNode$Companion$TraverseDescendantsAction>() { // from class: androidx.compose.ui.draganddrop.DragAndDropNode$onEnded$1
            {
                super(1);
            }

            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TraversableNode$Companion$TraverseDescendantsAction invoke(DragAndDropNode dragAndDropNode) {
                if (!dragAndDropNode.getNode().getIsAttached()) {
                    return TraversableNode$Companion$TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
                }
                of3 of3Var = dragAndDropNode.thisDragAndDropTarget;
                if (of3Var != null) {
                    of3Var.v0(event);
                }
                dragAndDropNode.thisDragAndDropTarget = null;
                dragAndDropNode.lastChildDragAndDropModifierNode = null;
                return TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DragAndDropNode(Function2<Object, ? super rn8, Unit> function2, Function1<? super lf3, ? extends of3> function1) {
        this.onStartTransfer = function2;
        this.onDropTargetValidate = function1;
        this.traverseKey = a.C0051a.a;
        this.size = q16.INSTANCE.a();
    }

    public /* synthetic */ DragAndDropNode(Function2 function2, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function2, (i & 2) != 0 ? null : function1);
    }
}
