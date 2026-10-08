package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import androidx.compose.ui.platform.CompositionLocalsKt;
import com.google.inputmethod.DpTouchBoundsExpansion;
import com.google.inputmethod.bf9;
import com.google.inputmethod.bs1;
import com.google.inputmethod.cs1;
import com.google.inputmethod.fhd;
import com.google.inputmethod.ghd;
import com.google.inputmethod.ne9;
import com.google.inputmethod.pbd;
import com.google.inputmethod.qe9;
import com.google.inputmethod.y23;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B%\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u000fJ\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u000fJ\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u000fJ'\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\rH\u0016¢\u0006\u0004\b \u0010\u000fJ\u000f\u0010!\u001a\u00020\rH\u0016¢\u0006\u0004\b!\u0010\u000fJ\u0017\u0010$\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\"H&¢\u0006\u0004\b$\u0010%J\u0019\u0010&\u001a\u00020\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b&\u0010'R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R*\u0010\u0006\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u00058\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u0010'R*\u0010\b\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0016\u0010;\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00105R\u0016\u0010?\u001a\u0004\u0018\u00010<8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006D"}, d2 = {"Landroidx/compose/ui/input/pointer/HoverIconModifierNode;", "Landroidx/compose/ui/b$c;", "Lcom/google/android/fhd;", "Lcom/google/android/bf9;", "Lcom/google/android/bs1;", "Lcom/google/android/ne9;", "icon", "", "overrideDescendants", "Lcom/google/android/kf3;", "dpTouchBoundsExpansion", "<init>", "(Lcom/google/android/ne9;ZLcom/google/android/kf3;)V", "", "x3", "()V", "y3", "n3", "r3", "s3", "()Landroidx/compose/ui/input/pointer/HoverIconModifierNode;", "q3", "t3", "p3", "Landroidx/compose/ui/input/pointer/e;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Lcom/google/android/q16;", "bounds", "x1", "(Landroidx/compose/ui/input/pointer/e;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "K0", "W2", "Landroidx/compose/ui/input/pointer/j;", "pointerType", "w3", "(I)Z", "o3", "(Lcom/google/android/ne9;)V", "p", "Lcom/google/android/kf3;", "getDpTouchBoundsExpansion", "()Lcom/google/android/kf3;", "z3", "(Lcom/google/android/kf3;)V", "value", "q", "Lcom/google/android/ne9;", "getIcon", "()Lcom/google/android/ne9;", "A3", "r", "Z", "u3", "()Z", "B3", "(Z)V", "s", "cursorInBoundsOfNode", "Lcom/google/android/qe9;", "v3", "()Lcom/google/android/qe9;", "pointerIconService", "Lcom/google/android/pbd;", "w0", "()J", "touchBoundsExpansion", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class HoverIconModifierNode extends androidx.compose.ui.b.c implements fhd, bf9, bs1 {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private DpTouchBoundsExpansion dpTouchBoundsExpansion;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private ne9 icon;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private boolean overrideDescendants;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private boolean cursorInBoundsOfNode;

    public HoverIconModifierNode(ne9 ne9Var, boolean z, DpTouchBoundsExpansion dpTouchBoundsExpansion) {
        this.dpTouchBoundsExpansion = dpTouchBoundsExpansion;
        this.icon = ne9Var;
        this.overrideDescendants = z;
    }

    private final void n3() {
        ne9 ne9Var;
        HoverIconModifierNode hoverIconModifierNodeT3 = t3();
        if (hoverIconModifierNodeT3 == null || (ne9Var = hoverIconModifierNodeT3.icon) == null) {
            ne9Var = this.icon;
        }
        o3(ne9Var);
    }

    private final void p3() {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ghd.d(this, new Function1<HoverIconModifierNode, Boolean>() { // from class: androidx.compose.ui.input.pointer.HoverIconModifierNode$displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(HoverIconModifierNode hoverIconModifierNode) {
                if (objectRef.element == null && hoverIconModifierNode.cursorInBoundsOfNode) {
                    objectRef.element = hoverIconModifierNode;
                } else if (objectRef.element != null && hoverIconModifierNode.getOverrideDescendants() && hoverIconModifierNode.cursorInBoundsOfNode) {
                    objectRef.element = hoverIconModifierNode;
                }
                return Boolean.TRUE;
            }
        });
        HoverIconModifierNode hoverIconModifierNode = (HoverIconModifierNode) objectRef.element;
        if (hoverIconModifierNode != null) {
            hoverIconModifierNode.n3();
        } else {
            o3(null);
        }
    }

    private final void q3() {
        HoverIconModifierNode hoverIconModifierNodeS3;
        if (this.cursorInBoundsOfNode) {
            if (this.overrideDescendants || (hoverIconModifierNodeS3 = s3()) == null) {
                hoverIconModifierNodeS3 = this;
            }
            hoverIconModifierNodeS3.n3();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final void r3() throws KotlinNothingValueException {
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        if (!this.overrideDescendants) {
            ghd.f(this, new Function1<HoverIconModifierNode, TraversableNode$Companion$TraverseDescendantsAction>() { // from class: androidx.compose.ui.input.pointer.HoverIconModifierNode$displayIconIfDescendantsDoNotHavePriority$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final TraversableNode$Companion$TraverseDescendantsAction invoke(HoverIconModifierNode hoverIconModifierNode) {
                    if (!hoverIconModifierNode.cursorInBoundsOfNode) {
                        return TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal;
                    }
                    booleanRef.element = false;
                    return TraversableNode$Companion$TraverseDescendantsAction.CancelTraversal;
                }
            });
        }
        if (booleanRef.element) {
            n3();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final HoverIconModifierNode s3() throws KotlinNothingValueException {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ghd.f(this, new Function1<HoverIconModifierNode, TraversableNode$Companion$TraverseDescendantsAction>() { // from class: androidx.compose.ui.input.pointer.HoverIconModifierNode$findDescendantNodeWithCursorInBounds$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TraversableNode$Companion$TraverseDescendantsAction invoke(HoverIconModifierNode hoverIconModifierNode) {
                TraversableNode$Companion$TraverseDescendantsAction traversableNode$Companion$TraverseDescendantsAction = TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal;
                if (hoverIconModifierNode.cursorInBoundsOfNode) {
                    objectRef.element = hoverIconModifierNode;
                    if (hoverIconModifierNode.getOverrideDescendants()) {
                        return TraversableNode$Companion$TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
                    }
                }
                return traversableNode$Companion$TraverseDescendantsAction;
            }
        });
        return (HoverIconModifierNode) objectRef.element;
    }

    private final HoverIconModifierNode t3() {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ghd.d(this, new Function1<HoverIconModifierNode, Boolean>() { // from class: androidx.compose.ui.input.pointer.HoverIconModifierNode$findOverridingAncestorNode$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(HoverIconModifierNode hoverIconModifierNode) {
                if (hoverIconModifierNode.getOverrideDescendants() && hoverIconModifierNode.cursorInBoundsOfNode) {
                    objectRef.element = hoverIconModifierNode;
                }
                return Boolean.TRUE;
            }
        });
        return (HoverIconModifierNode) objectRef.element;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final void x3() throws KotlinNothingValueException {
        this.cursorInBoundsOfNode = true;
        r3();
    }

    private final void y3() {
        if (this.cursorInBoundsOfNode) {
            this.cursorInBoundsOfNode = false;
            if (getIsAttached()) {
                p3();
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void A3(ne9 ne9Var) throws KotlinNothingValueException {
        if (Intrinsics.e(this.icon, ne9Var)) {
            return;
        }
        this.icon = ne9Var;
        if (this.cursorInBoundsOfNode) {
            r3();
        }
    }

    public final void B3(boolean z) {
        if (this.overrideDescendants != z) {
            this.overrideDescendants = z;
            if (z) {
                if (this.cursorInBoundsOfNode) {
                    n3();
                }
            } else if (this.cursorInBoundsOfNode) {
                q3();
            }
        }
    }

    @Override // com.google.inputmethod.bf9
    public void K0() {
        y3();
    }

    @Override // androidx.compose.ui.b.c
    public void W2() {
        y3();
        super.W2();
    }

    public abstract void o3(ne9 icon);

    /* JADX INFO: renamed from: u3, reason: from getter */
    public final boolean getOverrideDescendants() {
        return this.overrideDescendants;
    }

    protected final qe9 v3() {
        return (qe9) cs1.a(this, CompositionLocalsKt.o());
    }

    @Override // com.google.inputmethod.bf9
    public long w0() {
        DpTouchBoundsExpansion dpTouchBoundsExpansion = this.dpTouchBoundsExpansion;
        return dpTouchBoundsExpansion != null ? dpTouchBoundsExpansion.a(y23.m(this)) : pbd.INSTANCE.b();
    }

    public abstract boolean w3(int pointerType);

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // com.google.inputmethod.bf9
    public void x1(e pointerEvent, PointerEventPass pass, long bounds) throws KotlinNothingValueException {
        if (pass == PointerEventPass.Main) {
            List<PointerInputChange> listC = pointerEvent.c();
            int size = listC.size();
            for (int i = 0; i < size; i++) {
                if (w3(listC.get(i).getType())) {
                    int type = pointerEvent.getType();
                    g.Companion companion = g.INSTANCE;
                    if (g.o(type, companion.a())) {
                        x3();
                        return;
                    } else {
                        if (g.o(pointerEvent.getType(), companion.b())) {
                            y3();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    public final void z3(DpTouchBoundsExpansion dpTouchBoundsExpansion) {
        this.dpTouchBoundsExpansion = dpTouchBoundsExpansion;
    }

    public /* synthetic */ HoverIconModifierNode(ne9 ne9Var, boolean z, DpTouchBoundsExpansion dpTouchBoundsExpansion, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(ne9Var, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : dpTouchBoundsExpansion);
    }
}
