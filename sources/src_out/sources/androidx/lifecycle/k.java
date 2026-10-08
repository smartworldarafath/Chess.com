package androidx.lifecycle;

import com.google.android.p58;
import com.google.android.r6c;
import com.google.inputmethod.exa;
import com.google.inputmethod.m17;
import com.google.inputmethod.n17;
import com.google.inputmethod.q54;
import com.google.inputmethod.r17;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u00172\u00020\u0001:\u0002%FB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\rJ\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\bJ\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\bJ\u000f\u0010\u0019\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u0013J\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b$\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\"\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020(0'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010)R\u0016\u0010\u0014\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00103\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00104\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010&R\u0016\u00105\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010&R&\u00109\u001a\u0012\u0012\u0004\u0012\u00020\t06j\b\u0012\u0004\u0012\u00020\t`78\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u00108R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\t0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010;R\u0014\u0010?\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R$\u0010B\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b+\u0010@\"\u0004\bA\u0010\rR\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020\t0C8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010D¨\u0006G"}, d2 = {"Landroidx/lifecycle/k;", "Landroidx/lifecycle/Lifecycle;", "Lcom/google/android/n17;", "provider", "", "enforceMainThread", "<init>", "(Lcom/google/android/n17;Z)V", "(Lcom/google/android/n17;)V", "Landroidx/lifecycle/Lifecycle$State;", "next", "", "n", "(Landroidx/lifecycle/Lifecycle$State;)V", "Lcom/google/android/m17;", "observer", "i", "(Lcom/google/android/m17;)Landroidx/lifecycle/Lifecycle$State;", "o", "()V", "state", "p", "lifecycleOwner", "k", "h", "r", "", "methodName", "j", "(Ljava/lang/String;)V", "Landroidx/lifecycle/Lifecycle$Event;", "event", "l", "(Landroidx/lifecycle/Lifecycle$Event;)V", "c", "(Lcom/google/android/m17;)V", "g", "b", "Z", "Lcom/google/android/q54;", "Landroidx/lifecycle/k$b;", "Lcom/google/android/q54;", "observerMap", "d", "Landroidx/lifecycle/Lifecycle$State;", "Ljava/lang/ref/WeakReference;", "e", "Ljava/lang/ref/WeakReference;", "", "f", "I", "addingObserverCounter", "handlingEvent", "newEventOccurred", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "parentStates", "Lcom/google/android/p58;", "Lcom/google/android/p58;", "_currentStateFlow", "m", "()Z", "isSynced", "()Landroidx/lifecycle/Lifecycle$State;", "q", "currentState", "Lcom/google/android/r6c;", "()Lcom/google/android/r6c;", "currentStateFlow", "a", "lifecycle-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class k extends Lifecycle {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean enforceMainThread;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private q54<m17, b> observerMap;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private Lifecycle.State state;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final WeakReference<n17> lifecycleOwner;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int addingObserverCounter;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean handlingEvent;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean newEventOccurred;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private ArrayList<Lifecycle.State> parentStates;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final p58<Lifecycle.State> _currentStateFlow;

    /* JADX INFO: renamed from: androidx.lifecycle.k$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/lifecycle/k$a;", "", "<init>", "()V", "Lcom/google/android/n17;", "owner", "Landroidx/lifecycle/k;", "a", "(Lcom/google/android/n17;)Landroidx/lifecycle/k;", "Landroidx/lifecycle/Lifecycle$State;", "state1", "state2", "b", "(Landroidx/lifecycle/Lifecycle$State;Landroidx/lifecycle/Lifecycle$State;)Landroidx/lifecycle/Lifecycle$State;", "lifecycle-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k a(n17 owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            return new k(owner, false, null);
        }

        public final Lifecycle.State b(Lifecycle.State state1, Lifecycle.State state2) {
            Intrinsics.checkNotNullParameter(state1, "state1");
            return (state2 == null || state2.compareTo(state1) >= 0) ? state1 : state2;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0014\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001b\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroidx/lifecycle/k$b;", "", "Lcom/google/android/m17;", "observer", "Landroidx/lifecycle/Lifecycle$State;", "initialState", "<init>", "(Lcom/google/android/m17;Landroidx/lifecycle/Lifecycle$State;)V", "Lcom/google/android/n17;", "owner", "Landroidx/lifecycle/Lifecycle$Event;", "event", "", "a", "(Lcom/google/android/n17;Landroidx/lifecycle/Lifecycle$Event;)V", "Landroidx/lifecycle/Lifecycle$State;", "b", "()Landroidx/lifecycle/Lifecycle$State;", "setState", "(Landroidx/lifecycle/Lifecycle$State;)V", "state", "Landroidx/lifecycle/i;", "Landroidx/lifecycle/i;", "getLifecycleObserver", "()Landroidx/lifecycle/i;", "setLifecycleObserver", "(Landroidx/lifecycle/i;)V", "lifecycleObserver", "lifecycle-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private Lifecycle.State state;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private i lifecycleObserver;

        public b(m17 m17Var, Lifecycle.State state) {
            Intrinsics.checkNotNullParameter(state, "initialState");
            Intrinsics.g(m17Var);
            this.lifecycleObserver = m.f(m17Var);
            this.state = state;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final void a(n17 owner, Lifecycle.Event event) throws NoWhenBranchMatchedException {
            Intrinsics.checkNotNullParameter(event, "event");
            Lifecycle.State stateD = event.d();
            this.state = k.INSTANCE.b(this.state, stateD);
            i iVar = this.lifecycleObserver;
            Intrinsics.g(owner);
            iVar.d6(owner, event);
            this.state = stateD;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Lifecycle.State getState() {
            return this.state;
        }
    }

    public /* synthetic */ k(n17 n17Var, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(n17Var, z);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void h(n17 lifecycleOwner) throws NoWhenBranchMatchedException {
        Iterator<Map.Entry<m17, b>> itDescendingIterator = this.observerMap.descendingIterator();
        Intrinsics.checkNotNullExpressionValue(itDescendingIterator, "descendingIterator(...)");
        while (itDescendingIterator.hasNext() && !this.newEventOccurred) {
            Map.Entry<m17, b> next = itDescendingIterator.next();
            Intrinsics.g(next);
            m17 key = next.getKey();
            b value = next.getValue();
            while (value.getState().compareTo(this.state) > 0 && !this.newEventOccurred && this.observerMap.contains(key)) {
                Lifecycle.Event eventA = Lifecycle.Event.INSTANCE.a(value.getState());
                if (eventA == null) {
                    throw new IllegalStateException("no event down from " + value.getState());
                }
                p(eventA.d());
                value.a(lifecycleOwner, eventA);
                o();
            }
        }
    }

    private final Lifecycle.State i(m17 observer) {
        b value;
        Map.Entry<m17, b> entryN = this.observerMap.n(observer);
        Lifecycle.State state = null;
        Lifecycle.State state2 = (entryN == null || (value = entryN.getValue()) == null) ? null : value.getState();
        if (!this.parentStates.isEmpty()) {
            ArrayList<Lifecycle.State> arrayList = this.parentStates;
            state = arrayList.get(arrayList.size() - 1);
        }
        Companion companion = INSTANCE;
        return companion.b(companion.b(this.state, state2), state);
    }

    private final void j(String methodName) {
        if (!this.enforceMainThread || r17.a()) {
            return;
        }
        throw new IllegalStateException(("Method " + methodName + " must be called on the main thread").toString());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void k(n17 lifecycleOwner) throws NoWhenBranchMatchedException {
        exa<m17, b>.d dVarD = this.observerMap.d();
        Intrinsics.checkNotNullExpressionValue(dVarD, "iteratorWithAdditions(...)");
        while (dVarD.hasNext() && !this.newEventOccurred) {
            Map.Entry next = dVarD.next();
            m17 m17Var = (m17) next.getKey();
            b bVar = (b) next.getValue();
            while (bVar.getState().compareTo(this.state) < 0 && !this.newEventOccurred && this.observerMap.contains(m17Var)) {
                p(bVar.getState());
                Lifecycle.Event eventB = Lifecycle.Event.INSTANCE.b(bVar.getState());
                if (eventB == null) {
                    throw new IllegalStateException("no event up from " + bVar.getState());
                }
                bVar.a(lifecycleOwner, eventB);
                o();
            }
        }
    }

    private final boolean m() {
        if (this.observerMap.size() == 0) {
            return true;
        }
        Map.Entry<m17, b> entryB = this.observerMap.b();
        Intrinsics.g(entryB);
        Lifecycle.State state = entryB.getValue().getState();
        Map.Entry<m17, b> entryE = this.observerMap.e();
        Intrinsics.g(entryE);
        Lifecycle.State state2 = entryE.getValue().getState();
        return state == state2 && this.state == state2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void n(Lifecycle.State next) throws NoWhenBranchMatchedException {
        if (this.state == next) {
            return;
        }
        l.a(this.lifecycleOwner.get(), this.state, next);
        this.state = next;
        if (this.handlingEvent || this.addingObserverCounter != 0) {
            this.newEventOccurred = true;
            return;
        }
        this.handlingEvent = true;
        r();
        this.handlingEvent = false;
        if (this.state == Lifecycle.State.DESTROYED) {
            this.observerMap = new q54<>();
        }
    }

    private final void o() {
        ArrayList<Lifecycle.State> arrayList = this.parentStates;
        arrayList.remove(arrayList.size() - 1);
    }

    private final void p(Lifecycle.State state) {
        this.parentStates.add(state);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void r() throws NoWhenBranchMatchedException {
        n17 n17Var = this.lifecycleOwner.get();
        if (n17Var == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (!m()) {
            this.newEventOccurred = false;
            Lifecycle.State state = this.state;
            Map.Entry<m17, b> entryB = this.observerMap.b();
            Intrinsics.g(entryB);
            if (state.compareTo(entryB.getValue().getState()) < 0) {
                h(n17Var);
            }
            Map.Entry<m17, b> entryE = this.observerMap.e();
            if (!this.newEventOccurred && entryE != null && this.state.compareTo(entryE.getValue().getState()) > 0) {
                k(n17Var);
            }
        }
        this.newEventOccurred = false;
        this._currentStateFlow.setValue(getState());
    }

    @Override // androidx.lifecycle.Lifecycle
    public void c(m17 observer) {
        n17 n17Var;
        Intrinsics.checkNotNullParameter(observer, "observer");
        j("addObserver");
        Lifecycle.State state = this.state;
        Lifecycle.State state2 = Lifecycle.State.DESTROYED;
        if (state != state2) {
            state2 = Lifecycle.State.INITIALIZED;
        }
        b bVar = new b(observer, state2);
        if (this.observerMap.i(observer, bVar) == null && (n17Var = this.lifecycleOwner.get()) != null) {
            boolean z = this.addingObserverCounter != 0 || this.handlingEvent;
            Lifecycle.State stateI = i(observer);
            this.addingObserverCounter++;
            while (bVar.getState().compareTo(stateI) < 0 && this.observerMap.contains(observer)) {
                p(bVar.getState());
                Lifecycle.Event eventB = Lifecycle.Event.INSTANCE.b(bVar.getState());
                if (eventB == null) {
                    throw new IllegalStateException("no event up from " + bVar.getState());
                }
                bVar.a(n17Var, eventB);
                o();
                stateI = i(observer);
            }
            if (!z) {
                r();
            }
            this.addingObserverCounter--;
        }
    }

    @Override // androidx.lifecycle.Lifecycle
    /* JADX INFO: renamed from: d, reason: from getter */
    public Lifecycle.State getState() {
        return this.state;
    }

    @Override // androidx.lifecycle.Lifecycle
    public r6c<Lifecycle.State> e() {
        return kotlinx.coroutines.flow.d.d(this._currentStateFlow);
    }

    @Override // androidx.lifecycle.Lifecycle
    public void g(m17 observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        j("removeObserver");
        this.observerMap.j(observer);
    }

    public void l(Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(event, "event");
        j("handleLifecycleEvent");
        n(event.d());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public void q(Lifecycle.State state) throws NoWhenBranchMatchedException {
        Intrinsics.checkNotNullParameter(state, "state");
        j("setCurrentState");
        n(state);
    }

    private k(n17 n17Var, boolean z) {
        this.enforceMainThread = z;
        this.observerMap = new q54<>();
        Lifecycle.State state = Lifecycle.State.INITIALIZED;
        this.state = state;
        this.parentStates = new ArrayList<>();
        this.lifecycleOwner = new WeakReference<>(n17Var);
        this._currentStateFlow = kotlinx.coroutines.flow.p.a(state);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(n17 n17Var) {
        this(n17Var, true);
        Intrinsics.checkNotNullParameter(n17Var, "provider");
    }
}
