package androidx.compose.ui;

import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.ObserverNodeOwnerScope;
import com.google.android.ta2;
import com.google.inputmethod.x23;
import com.google.inputmethod.y23;
import com.google.inputmethod.zw5;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.j;
import kotlinx.coroutines.s;
import kotlinx.coroutines.u;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\bg\u0018\u0000 \u00112\u00020\u0001:\u0003\u0012\u0013\u0011J7\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\f\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\tH&¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0096\u0004¢\u0006\u0004\b\u000f\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/b;", "", "R", "initial", "Lkotlin/Function2;", "Landroidx/compose/ui/b$b;", "operation", "foldIn", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "predicate", "all", "(Lkotlin/jvm/functions/Function1;)Z", "other", "then", "(Landroidx/compose/ui/b;)Landroidx/compose/ui/b;", "a", "b", "c", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.d;

    /* JADX INFO: renamed from: androidx.compose.ui.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u00028\u00002\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000e\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0001H\u0096\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/b$a;", "Landroidx/compose/ui/b;", "<init>", "()V", "R", "initial", "Lkotlin/Function2;", "Landroidx/compose/ui/b$b;", "operation", "foldIn", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "predicate", "all", "(Lkotlin/jvm/functions/Function1;)Z", "other", "then", "(Landroidx/compose/ui/b;)Landroidx/compose/ui/b;", "", "toString", "()Ljava/lang/String;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements b {
        static final /* synthetic */ Companion d = new Companion();

        private Companion() {
        }

        @Override // androidx.compose.ui.b
        public boolean all(Function1<? super InterfaceC0050b, Boolean> predicate) {
            return true;
        }

        @Override // androidx.compose.ui.b
        public <R> R foldIn(R initial, Function2<? super R, ? super InterfaceC0050b, ? extends R> operation) {
            return initial;
        }

        @Override // androidx.compose.ui.b
        public b then(b other) {
            return other;
        }

        public String toString() {
            return "Modifier";
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J7\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0007J#\u0010\f\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000e\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\u000e\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/b$b;", "Landroidx/compose/ui/b;", "R", "initial", "Lkotlin/Function2;", "operation", "foldIn", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foldOut", "Lkotlin/Function1;", "", "predicate", "any", "(Lkotlin/jvm/functions/Function1;)Z", "all", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface InterfaceC0050b extends b {
        @Override // androidx.compose.ui.b
        default boolean all(Function1<? super InterfaceC0050b, Boolean> predicate) {
            return ((Boolean) predicate.invoke(this)).booleanValue();
        }

        default boolean any(Function1<? super InterfaceC0050b, Boolean> predicate) {
            return ((Boolean) predicate.invoke(this)).booleanValue();
        }

        @Override // androidx.compose.ui.b
        default <R> R foldIn(R initial, Function2<? super R, ? super InterfaceC0050b, ? extends R> operation) {
            return (R) operation.invoke(initial, this);
        }

        default <R> R foldOut(R initial, Function2<? super InterfaceC0050b, ? super R, ? extends R> operation) {
            return (R) operation.invoke(this, initial);
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u001f\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0003J\u001b\u0010\u0013\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\u0016\u0010\u0017R*\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00008\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001d\u0010\u0003\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\"\u0010*\u001a\u00020#8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010.\u001a\u00020#8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u0010%\u001a\u0004\b,\u0010'\"\u0004\b-\u0010)R$\u00102\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b/\u0010\u001a\u001a\u0004\b0\u0010\u001c\"\u0004\b1\u0010\u0017R$\u00106\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b3\u0010\u001a\u001a\u0004\b4\u0010\u001c\"\u0004\b5\u0010\u0017R$\u0010>\u001a\u0004\u0018\u0001078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R(\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\"\u0010J\u001a\u00020C8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010N\u001a\u00020C8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bK\u0010E\u001a\u0004\bL\u0010G\"\u0004\bM\u0010IR\u0016\u0010P\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010ER\u0016\u0010R\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010ER*\u0010X\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010\u0014R$\u0010[\u001a\u00020C2\u0006\u0010\u0018\u001a\u00020C8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bY\u0010E\u001a\u0004\bZ\u0010GR\u0011\u0010^\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u001a\u0010a\u001a\u00020C8VX\u0096\u0004¢\u0006\f\u0012\u0004\b`\u0010\u0003\u001a\u0004\b_\u0010G¨\u0006b"}, d2 = {"Landroidx/compose/ui/b$c;", "Lcom/google/android/x23;", "<init>", "()V", "Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "", "l3", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "T2", "Z2", "a3", "U2", "Y2", "V2", "W2", "X2", "Lkotlin/Function0;", "effect", "k3", "(Lkotlin/jvm/functions/Function0;)V", "owner", "c3", "(Landroidx/compose/ui/b$c;)V", "value", "a", "Landroidx/compose/ui/b$c;", "F", "()Landroidx/compose/ui/b$c;", "getNode$annotations", "node", "Lcom/google/android/ta2;", "b", "Lcom/google/android/ta2;", "scope", "", "c", "I", "N2", "()I", "g3", "(I)V", "kindSet", "d", "I2", "b3", "aggregateChildKindSet", "e", "P2", "i3", "parent", "f", "J2", "d3", "child", "Landroidx/compose/ui/node/ObserverNodeOwnerScope;", "g", "Landroidx/compose/ui/node/ObserverNodeOwnerScope;", "O2", "()Landroidx/compose/ui/node/ObserverNodeOwnerScope;", "h3", "(Landroidx/compose/ui/node/ObserverNodeOwnerScope;)V", "ownerScope", "h", "Landroidx/compose/ui/node/NodeCoordinator;", "K2", "()Landroidx/compose/ui/node/NodeCoordinator;", "", "i", "Z", "M2", "()Z", "f3", "(Z)V", "insertedNodeAwaitingAttachForInvalidation", "j", "R2", "j3", "updatedNodeAwaitingAttachForInvalidation", "k", "onAttachRunExpected", "l", "onDetachRunExpected", "m", "Lkotlin/jvm/functions/Function0;", "getDetachedListener$ui", "()Lkotlin/jvm/functions/Function0;", "e3", "detachedListener", "n", "S2", "isAttached", "L2", "()Lcom/google/android/ta2;", "coroutineScope", "Q2", "getShouldAutoInvalidate$annotations", "shouldAutoInvalidate", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class c implements x23 {
        public static final int o = 8;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private ta2 scope;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private int kindSet;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private c parent;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private c child;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private ObserverNodeOwnerScope ownerScope;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private NodeCoordinator coordinator;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private boolean insertedNodeAwaitingAttachForInvalidation;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private boolean updatedNodeAwaitingAttachForInvalidation;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private boolean onAttachRunExpected;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        private boolean onDetachRunExpected;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        private Function0<Unit> detachedListener;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        private boolean isAttached;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private c node = this;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private int aggregateChildKindSet = -1;

        @Override // com.google.inputmethod.x23
        /* JADX INFO: renamed from: F, reason: from getter */
        public final c getNode() {
            return this.node;
        }

        /* JADX INFO: renamed from: I2, reason: from getter */
        public final int getAggregateChildKindSet() {
            return this.aggregateChildKindSet;
        }

        /* JADX INFO: renamed from: J2, reason: from getter */
        public final c getChild() {
            return this.child;
        }

        /* JADX INFO: renamed from: K2, reason: from getter */
        public final NodeCoordinator getCoordinator() {
            return this.coordinator;
        }

        public final ta2 L2() {
            ta2 ta2Var = this.scope;
            if (ta2Var != null) {
                return ta2Var;
            }
            ta2 ta2VarA = j.a(y23.r(this).getCoroutineContext().plus(u.a(y23.r(this).getCoroutineContext().get(s.u2))));
            this.scope = ta2VarA;
            return ta2VarA;
        }

        /* JADX INFO: renamed from: M2, reason: from getter */
        public final boolean getInsertedNodeAwaitingAttachForInvalidation() {
            return this.insertedNodeAwaitingAttachForInvalidation;
        }

        /* JADX INFO: renamed from: N2, reason: from getter */
        public final int getKindSet() {
            return this.kindSet;
        }

        /* JADX INFO: renamed from: O2, reason: from getter */
        public final ObserverNodeOwnerScope getOwnerScope() {
            return this.ownerScope;
        }

        /* JADX INFO: renamed from: P2, reason: from getter */
        public final c getParent() {
            return this.parent;
        }

        public boolean Q2() {
            return true;
        }

        /* JADX INFO: renamed from: R2, reason: from getter */
        public final boolean getUpdatedNodeAwaitingAttachForInvalidation() {
            return this.updatedNodeAwaitingAttachForInvalidation;
        }

        /* JADX INFO: renamed from: S2, reason: from getter */
        public final boolean getIsAttached() {
            return this.isAttached;
        }

        public void T2() {
            if (this.isAttached) {
                zw5.c("node attached multiple times");
            }
            if (!(this.coordinator != null)) {
                zw5.c("attach invoked on a node without a coordinator");
            }
            this.isAttached = true;
            this.onAttachRunExpected = true;
        }

        public void U2() {
            if (!this.isAttached) {
                zw5.c("Cannot detach a node that is not attached");
            }
            if (this.onAttachRunExpected) {
                zw5.c("Must run runAttachLifecycle() before markAsDetached()");
            }
            if (this.onDetachRunExpected) {
                zw5.c("Must run runDetachLifecycle() before markAsDetached()");
            }
            this.isAttached = false;
            ta2 ta2Var = this.scope;
            if (ta2Var != null) {
                j.d(ta2Var, new ModifierNodeDetachedCancellationException());
                this.scope = null;
            }
        }

        public void V2() {
        }

        public void W2() {
        }

        public void X2() {
        }

        public void Y2() {
            if (!this.isAttached) {
                zw5.c("reset() called on an unattached node");
            }
            X2();
        }

        public void Z2() {
            if (!this.isAttached) {
                zw5.c("Must run markAsAttached() prior to runAttachLifecycle");
            }
            if (!this.onAttachRunExpected) {
                zw5.c("Must run runAttachLifecycle() only once after markAsAttached()");
            }
            this.onAttachRunExpected = false;
            V2();
            this.onDetachRunExpected = true;
        }

        public void a3() {
            if (!this.isAttached) {
                zw5.c("node detached multiple times");
            }
            if (!(this.coordinator != null)) {
                zw5.c("detach invoked on a node without a coordinator");
            }
            if (!this.onDetachRunExpected) {
                zw5.c("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
            }
            this.onDetachRunExpected = false;
            Function0<Unit> function0 = this.detachedListener;
            if (function0 != null) {
                function0.invoke();
            }
            W2();
        }

        public final void b3(int i) {
            this.aggregateChildKindSet = i;
        }

        public void c3(c owner) {
            this.node = owner;
        }

        public final void d3(c cVar) {
            this.child = cVar;
        }

        public final void e3(Function0<Unit> function0) {
            this.detachedListener = function0;
        }

        public final void f3(boolean z) {
            this.insertedNodeAwaitingAttachForInvalidation = z;
        }

        public final void g3(int i) {
            this.kindSet = i;
        }

        public final void h3(ObserverNodeOwnerScope observerNodeOwnerScope) {
            this.ownerScope = observerNodeOwnerScope;
        }

        public final void i3(c cVar) {
            this.parent = cVar;
        }

        public final void j3(boolean z) {
            this.updatedNodeAwaitingAttachForInvalidation = z;
        }

        public final void k3(Function0<Unit> effect) {
            y23.r(this).M(effect);
        }

        public void l3(NodeCoordinator coordinator) {
            this.coordinator = coordinator;
        }
    }

    boolean all(Function1<? super InterfaceC0050b, Boolean> predicate);

    <R> R foldIn(R initial, Function2<? super R, ? super InterfaceC0050b, ? extends R> operation);

    default b then(b other) {
        return other == INSTANCE ? this : new CombinedModifier(this, other);
    }
}
