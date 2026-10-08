package androidx.compose.p001foundation;

import androidx.compose.p001foundation.FocusableNode;
import androidx.compose.ui.focus.g;
import androidx.compose.ui.focus.h;
import androidx.compose.ui.focus.j;
import androidx.compose.ui.layout.PinnableContainerKt;
import androidx.compose.ui.node.l;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import com.google.android.rw0;
import com.google.inputmethod.bfb;
import com.google.inputmethod.bs1;
import com.google.inputmethod.cfb;
import com.google.inputmethod.cs1;
import com.google.inputmethod.dl4;
import com.google.inputmethod.dz4;
import com.google.inputmethod.fhd;
import com.google.inputmethod.ghd;
import com.google.inputmethod.i26;
import com.google.inputmethod.k33;
import com.google.inputmethod.kn6;
import com.google.inputmethod.lk4;
import com.google.inputmethod.mk4;
import com.google.inputmethod.n99;
import com.google.inputmethod.nfb;
import com.google.inputmethod.on8;
import com.google.inputmethod.r48;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.s;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0001\u0018\u0000 O2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001PB3\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001e\u0010\u001aJ\u001b\u0010!\u001a\u00020\r*\u00020\u00072\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\f¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\r2\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b%\u0010&J\u0013\u0010(\u001a\u00020\r*\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\rH\u0016¢\u0006\u0004\b*\u0010\u001aJ\u000f\u0010+\u001a\u00020\rH\u0016¢\u0006\u0004\b+\u0010\u001aJ\u0017\u0010.\u001a\u00020\r2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\"\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001a\u00107\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u0010$R\u0018\u0010;\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010?\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010B\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010J\u001a\u0004\u0018\u00010G8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0014\u0010N\u001a\u00020K8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010M¨\u0006Q"}, d2 = {"Landroidx/compose/foundation/FocusableNode;", "Lcom/google/android/k33;", "Lcom/google/android/bfb;", "Lcom/google/android/dz4;", "Lcom/google/android/bs1;", "Lcom/google/android/on8;", "Lcom/google/android/fhd;", "Lcom/google/android/r48;", "interactionSource", "Landroidx/compose/ui/focus/j;", "focusability", "Lkotlin/Function1;", "", "", "onFocusChange", "<init>", "(Lcom/google/android/r48;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lcom/google/android/dl4;", "previousState", "currentState", "B3", "(Lcom/google/android/dl4;Lcom/google/android/dl4;)V", "Lcom/google/android/n99;", "D3", "()Lcom/google/android/n99;", "A3", "()V", "isFocused", "w3", "(Z)V", "v3", "Lcom/google/android/i26;", "interaction", "x3", "(Lcom/google/android/r48;Lcom/google/android/i26;)V", "C3", "()Z", "F3", "(Lcom/google/android/r48;)V", "Lcom/google/android/nfb;", "H0", "(Lcom/google/android/nfb;)V", "X2", "M1", "Lcom/google/android/kn6;", "coordinates", "D", "(Lcom/google/android/kn6;)V", "r", "Lcom/google/android/r48;", "s", "Lkotlin/jvm/functions/Function1;", "t", "Z", "Q2", "shouldAutoInvalidate", "Lcom/google/android/lk4;", "u", "Lcom/google/android/lk4;", "focusedInteraction", "Lcom/google/android/n99$a;", "v", "Lcom/google/android/n99$a;", "pinnedHandle", "w", "Lcom/google/android/kn6;", "globalLayoutCoordinates", "Landroidx/compose/ui/focus/g;", "x", "Landroidx/compose/ui/focus/g;", "focusTargetNode", "Landroidx/compose/foundation/l;", "z3", "()Landroidx/compose/foundation/l;", "focusedBoundsObserver", "", "p1", "()Ljava/lang/Object;", "traverseKey", "y", "a", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FocusableNode extends k33 implements bfb, dz4, bs1, on8, fhd {
    private static final a y = new a(null);
    public static final int z = 8;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private r48 interactionSource;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final Function1<Boolean, Unit> onFocusChange;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private lk4 focusedInteraction;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private n99.a pinnedHandle;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private kn6 globalLayoutCoordinates;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final g focusTargetNode;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/FocusableNode$a;", "", "<init>", "()V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ FocusableNode(r48 r48Var, int i, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(r48Var, i, function1);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final void A3() throws KotlinNothingValueException {
        kn6 kn6Var = this.globalLayoutCoordinates;
        if (kn6Var != null) {
            Intrinsics.g(kn6Var);
            if (kn6Var.b()) {
                z3();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void B3(dl4 previousState, dl4 currentState) throws KotlinNothingValueException {
        boolean zA;
        if (getIsAttached() && (zA = currentState.a()) != previousState.a()) {
            Function1<Boolean, Unit> function1 = this.onFocusChange;
            if (function1 != null) {
                function1.invoke(Boolean.valueOf(zA));
            }
            if (zA) {
                rw0.d(L2(), (CoroutineContext) null, (CoroutineStart) null, new C0162FocusableNode$onFocusStateChange$1(this, null), 3, (Object) null);
                n99 n99VarD3 = D3();
                this.pinnedHandle = n99VarD3 != null ? n99VarD3.a() : null;
                A3();
            } else {
                n99.a aVar = this.pinnedHandle;
                if (aVar != null) {
                    aVar.release();
                }
                this.pinnedHandle = null;
                z3();
            }
            cfb.d(this);
            w3(zA);
        }
    }

    private final n99 D3() {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        l.a(this, new Function0() { // from class: com.google.android.jl4
            public final Object invoke() {
                return FocusableNode.E3(objectRef, this);
            }
        });
        return (n99) objectRef.element;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E3(Ref.ObjectRef objectRef, FocusableNode focusableNode) {
        objectRef.element = cs1.a(focusableNode, PinnableContainerKt.a());
        return Unit.a;
    }

    private final void v3() {
        lk4 lk4Var;
        r48 r48Var = this.interactionSource;
        if (r48Var != null && (lk4Var = this.focusedInteraction) != null) {
            r48Var.b(new mk4(lk4Var));
        }
        this.focusedInteraction = null;
    }

    private final void w3(boolean isFocused) {
        r48 r48Var = this.interactionSource;
        if (r48Var != null) {
            if (!isFocused) {
                lk4 lk4Var = this.focusedInteraction;
                if (lk4Var != null) {
                    x3(r48Var, new mk4(lk4Var));
                    this.focusedInteraction = null;
                    return;
                }
                return;
            }
            lk4 lk4Var2 = this.focusedInteraction;
            if (lk4Var2 != null) {
                x3(r48Var, new mk4(lk4Var2));
                this.focusedInteraction = null;
            }
            lk4 lk4Var3 = new lk4();
            x3(r48Var, lk4Var3);
            this.focusedInteraction = lk4Var3;
        }
    }

    private final void x3(final r48 r48Var, final i26 i26Var) {
        if (!getIsAttached()) {
            r48Var.b(i26Var);
        } else {
            s sVar = L2().getCoroutineContext().get(s.u2);
            rw0.d(L2(), (CoroutineContext) null, (CoroutineStart) null, new C0161FocusableNode$emitWithFallback$1(r48Var, i26Var, sVar != null ? sVar.A(new Function1() { // from class: com.google.android.il4
                public final Object invoke(Object obj) {
                    return FocusableNode.y3(r48Var, i26Var, (Throwable) obj);
                }
            }) : null, null), 3, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y3(r48 r48Var, i26 i26Var, Throwable th) {
        r48Var.b(i26Var);
        return Unit.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final l z3() throws KotlinNothingValueException {
        if (getIsAttached()) {
            fhd fhdVarA = ghd.a(this, l.INSTANCE);
            if (fhdVarA instanceof l) {
                return (l) fhdVarA;
            }
        }
        return null;
    }

    public final boolean C3() {
        return g.e0(this.focusTargetNode, 0, 1, null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // com.google.inputmethod.dz4
    public void D(kn6 coordinates) throws KotlinNothingValueException {
        this.globalLayoutCoordinates = coordinates;
        if (this.focusTargetNode.v1().a()) {
            if (coordinates.b()) {
                A3();
            } else {
                z3();
            }
        }
    }

    public final void F3(r48 interactionSource) {
        if (Intrinsics.e(this.interactionSource, interactionSource)) {
            return;
        }
        v3();
        this.interactionSource = interactionSource;
    }

    @Override // com.google.inputmethod.bfb
    public void H0(nfb nfbVar) {
        SemanticsPropertiesKt.h0(nfbVar, this.focusTargetNode.v1().a());
        SemanticsPropertiesKt.R(nfbVar, null, new FocusableNode$applySemantics$1(this), 1, null);
    }

    @Override // com.google.inputmethod.on8
    public void M1() {
        n99 n99VarD3 = D3();
        if (this.focusTargetNode.v1().a()) {
            n99.a aVar = this.pinnedHandle;
            if (aVar != null) {
                aVar.release();
            }
            this.pinnedHandle = n99VarD3 != null ? n99VarD3.a() : null;
        }
    }

    @Override // androidx.compose.ui.b.c
    /* JADX INFO: renamed from: Q2, reason: from getter */
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.ui.b.c
    public void X2() {
        n99.a aVar = this.pinnedHandle;
        if (aVar != null) {
            aVar.release();
        }
        this.pinnedHandle = null;
    }

    @Override // com.google.inputmethod.fhd
    /* JADX INFO: renamed from: p1 */
    public Object getTraverseKey() {
        return y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private FocusableNode(r48 r48Var, int i, Function1<? super Boolean, Unit> function1) {
        this.interactionSource = r48Var;
        this.onFocusChange = function1;
        this.focusTargetNode = (g) m3(h.a(i, new FocusableNode$focusTargetNode$1(this)));
    }

    public /* synthetic */ FocusableNode(r48 r48Var, int i, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(r48Var, (i2 & 2) != 0 ? j.INSTANCE.a() : i, (i2 & 4) != 0 ? null : function1, null);
    }
}
