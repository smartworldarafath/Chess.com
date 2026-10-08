package androidx.compose.p004runtime.snapshots;

import androidx.collection.ScatterSet;
import androidx.collection.d;
import androidx.compose.p004runtime.collection.ScatterSetWrapper;
import androidx.compose.p004runtime.e;
import androidx.compose.p004runtime.p0;
import androidx.compose.p004runtime.snapshots.g;
import androidx.compose.p004runtime.snapshots.j;
import com.google.inputmethod.a7c;
import com.google.inputmethod.b7c;
import com.google.inputmethod.bxb;
import com.google.inputmethod.d58;
import com.google.inputmethod.ei9;
import com.google.inputmethod.k58;
import com.google.inputmethod.nn8;
import com.google.inputmethod.q1d;
import com.google.inputmethod.r58;
import com.google.inputmethod.r6b;
import com.google.inputmethod.w58;
import com.google.inputmethod.wl8;
import com.google.inputmethod.x43;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.f;
import kotlin.collections.m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001'B!\u0012\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u0019\u001a\u00020\u0018\"\b\b\u0000\u0010\u0016*\u00020\u00012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJA\u0010\u001e\u001a\u00020\u0004\"\b\b\u0000\u0010\u0016*\u00020\u00012\u0006\u0010\u001b\u001a\u00028\u00002\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0001¢\u0006\u0004\b \u0010!J!\u0010#\u001a\u00020\u00042\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b0\u0002¢\u0006\u0004\b#\u0010\u0007J\r\u0010$\u001a\u00020\u0004¢\u0006\u0004\b$\u0010\fJ\r\u0010%\u001a\u00020\u0004¢\u0006\u0004\b%\u0010\fJ\r\u0010&\u001a\u00020\u0004¢\u0006\u0004\b&\u0010\fR&\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R(\u0010-\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010)j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001`*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00100\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R,\u00104\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\r\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u0004018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00103R \u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010(R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u0018078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u00108R\u0018\u0010<\u001a\u00060\u0001j\u0002`:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010;R\u0018\u0010?\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010>R\u0016\u0010@\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010/R\u0018\u0010B\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010AR\u0016\u0010E\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010D¨\u0006F"}, d2 = {"Landroidx/compose/runtime/snapshots/j;", "", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "onChangedExecutor", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "i", "()Z", "o", "()V", "", "set", "d", "(Ljava/util/Set;)V", "m", "()Ljava/util/Set;", "", "n", "()Ljava/lang/Void;", "T", "onChanged", "Landroidx/compose/runtime/snapshots/j$a;", "j", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/j$a;", "scope", "onValueChangedForScope", "block", "k", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "g", "(Ljava/lang/Object;)V", "predicate", "h", "q", "r", "f", "a", "Lkotlin/jvm/functions/Function1;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/internal/AtomicReference;", "b", "Ljava/util/concurrent/atomic/AtomicReference;", "pendingChanges", "c", "Z", "sendingNotifications", "Lkotlin/Function2;", "Landroidx/compose/runtime/snapshots/g;", "Lkotlin/jvm/functions/Function2;", "applyObserver", "e", "readObserver", "Lcom/google/android/r58;", "Lcom/google/android/r58;", "observedScopeMaps", "Landroidx/compose/runtime/platform/SynchronizedObject;", "Ljava/lang/Object;", "observedScopeMapsLock", "Lcom/google/android/nn8;", "Lcom/google/android/nn8;", "applyUnsubscribe", "isPaused", "Landroidx/compose/runtime/snapshots/j$a;", "currentMap", "", "J", "currentMapThreadId", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j {
    public static final int l = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Function1<Function0<Unit>, Unit> onChangedExecutor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean sendingNotifications;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private nn8 applyUnsubscribe;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private boolean isPaused;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private a currentMap;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AtomicReference<Object> pendingChanges = new AtomicReference<>(null);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Function2<Set<? extends Object>, g, Unit> applyObserver = new Function2() { // from class: com.google.android.mxb
        public final Object invoke(Object obj, Object obj2) {
            return j.e(this.a, (Set) obj, (g) obj2);
        }
    };

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Function1<Object, Unit> readObserver = new Function1() { // from class: com.google.android.nxb
        public final Object invoke(Object obj) {
            return j.l(this.a, obj);
        }
    };

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final r58<a> observedScopeMaps = new r58<>(new a[16], 0);

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Object observedScopeMapsLock = new Object();

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private long currentMapThreadId = -1;

    @Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J5\u0010\r\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\u0014\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b\u0015\u0010\u0011J!\u0010\u0018\u001a\u00020\u00032\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00160\u0002¢\u0006\u0004\b\u0018\u0010\u0006J\r\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001f\u001a\u00020\u00162\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010#\u001a\u00020\u00032\n\u0010\"\u001a\u0006\u0012\u0002\b\u00030!¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u0003¢\u0006\u0004\b%\u0010\u001cR#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u001e\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R \u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R&\u00107\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000b058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00103R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\u0001088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001e\u0010?\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030!0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0017\u0010E\u001a\u00020@8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\"\u0010K\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010\u001a\"\u0004\bI\u0010JR\u0016\u0010L\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u00100R$\u0010M\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030!018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00103R<\u0010Q\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030!\u0012\u0006\u0012\u0004\u0018\u00010\u00010Nj\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030!\u0012\u0006\u0012\u0004\u0018\u00010\u0001`O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010P¨\u0006R"}, d2 = {"Landroidx/compose/runtime/snapshots/j$a;", "", "Lkotlin/Function1;", "", "onChanged", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "value", "", "currentToken", "currentScope", "Lcom/google/android/d58;", "recordedValues", "t", "(Ljava/lang/Object;ILjava/lang/Object;Lcom/google/android/d58;)V", "scope", "l", "(Ljava/lang/Object;)V", "u", "(Ljava/lang/Object;Ljava/lang/Object;)V", "s", "m", "", "predicate", "v", "p", "()Z", "k", "()V", "", "changes", "r", "(Ljava/util/Set;)Z", "Landroidx/compose/runtime/j;", "derivedState", "w", "(Landroidx/compose/runtime/j;)V", "q", "a", "Lkotlin/jvm/functions/Function1;", "o", "()Lkotlin/jvm/functions/Function1;", "b", "Ljava/lang/Object;", "c", "Lcom/google/android/d58;", "currentScopeReads", "d", "I", "Lcom/google/android/r6b;", "e", "Lcom/google/android/k58;", "valueToScopes", "Lcom/google/android/k58;", "f", "scopeToValues", "Landroidx/collection/d;", "g", "Landroidx/collection/d;", "invalidated", "Lcom/google/android/r58;", "h", "Lcom/google/android/r58;", "statesToReread", "Lcom/google/android/x43;", "i", "Lcom/google/android/x43;", "n", "()Lcom/google/android/x43;", "derivedStateObserver", "j", "Z", "getReadingDerivedStates", "setReadingDerivedStates", "(Z)V", "readingDerivedStates", "deriveStateScopeCount", "dependencyToDerivedStates", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "recordedDerivedStateValues", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Function1<Object, Unit> onChanged;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private Object currentScope;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private d58<Object> currentScopeReads;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private boolean readingDerivedStates;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private int deriveStateScopeCount;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private int currentToken = -1;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final k58<Object, Object> valueToScopes = r6b.e(null, 1, null);

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final k58<Object, d58<Object>> scopeToValues = new k58<>(0, 1, null);

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final d<Object> invalidated = new d<>(0, 1, null);

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final r58<androidx.compose.p004runtime.j<?>> statesToReread = new r58<>(new androidx.compose.p004runtime.j[16], 0);

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final x43 derivedStateObserver = new C0049a();

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        private final k58<Object, Object> dependencyToDerivedStates = r6b.e(null, 1, null);

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        private final HashMap<androidx.compose.p004runtime.j<?>, Object> recordedDerivedStateValues = new HashMap<>();

        /* JADX INFO: renamed from: androidx.compose.runtime.snapshots.j$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"androidx/compose/runtime/snapshots/j$a$a", "Lcom/google/android/x43;", "Landroidx/compose/runtime/j;", "derivedState", "", "b", "(Landroidx/compose/runtime/j;)V", "a", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C0049a implements x43 {
            C0049a() {
            }

            @Override // com.google.inputmethod.x43
            public void a(androidx.compose.p004runtime.j<?> derivedState) {
                a.this.deriveStateScopeCount--;
            }

            @Override // com.google.inputmethod.x43
            public void b(androidx.compose.p004runtime.j<?> derivedState) {
                a.this.deriveStateScopeCount++;
            }
        }

        public a(Function1<Object, Unit> function1) {
            this.onChanged = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void l(Object scope) {
            int i = this.currentToken;
            d58<Object> d58Var = this.currentScopeReads;
            if (d58Var == null) {
                return;
            }
            long[] jArr = d58Var.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            Object obj = d58Var.keys[i5];
                            boolean z = d58Var.values[i5] != i;
                            if (z) {
                                u(scope, obj);
                            }
                            if (z) {
                                d58Var.s(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        return;
                    }
                }
                if (i2 == length) {
                    return;
                } else {
                    i2++;
                }
            }
        }

        private final void t(Object value, int currentToken, Object currentScope, d58<Object> recordedValues) {
            int i;
            int i2;
            int i3;
            if (this.deriveStateScopeCount > 0) {
                return;
            }
            int iQ = recordedValues.q(value, currentToken, -1);
            int i4 = 2;
            if (!(value instanceof androidx.compose.p004runtime.j) || iQ == currentToken) {
                i = 2;
                i2 = -1;
            } else {
                androidx.compose.runtime.j.a aVarE = ((androidx.compose.p004runtime.j) value).E();
                this.recordedDerivedStateValues.put(value, aVarE.a());
                wl8<a7c> wl8VarB = aVarE.b();
                k58<Object, Object> k58Var = this.dependencyToDerivedStates;
                r6b.n(k58Var, value);
                Object[] objArr = wl8VarB.keys;
                long[] jArr = wl8VarB.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j = jArr[i5];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i6 = 8 - ((~(i5 - length)) >>> 31);
                            int i7 = 0;
                            while (i7 < i6) {
                                if ((j & 255) < 128) {
                                    i3 = i4;
                                    a7c a7cVar = (a7c) objArr[(i5 << 3) + i7];
                                    if (a7cVar instanceof b7c) {
                                        ((b7c) a7cVar).m(e.a(i3));
                                    }
                                    r6b.a(k58Var, a7cVar, value);
                                } else {
                                    i3 = i4;
                                }
                                j >>= 8;
                                i7++;
                                i4 = i3;
                            }
                            i = i4;
                            if (i6 != 8) {
                                break;
                            }
                        } else {
                            i = i4;
                        }
                        if (i5 == length) {
                            break;
                        }
                        i5++;
                        i4 = i;
                    }
                } else {
                    i = 2;
                }
                i2 = -1;
            }
            if (iQ == i2) {
                if (value instanceof b7c) {
                    ((b7c) value).m(e.a(i));
                }
                r6b.a(this.valueToScopes, value, currentScope);
            }
        }

        private final void u(Object scope, Object value) {
            r6b.m(this.valueToScopes, value, scope);
            if (!(value instanceof androidx.compose.p004runtime.j) || r6b.f(this.valueToScopes, value)) {
                return;
            }
            r6b.n(this.dependencyToDerivedStates, value);
            this.recordedDerivedStateValues.remove(value);
        }

        public final void k() {
            r6b.c(this.valueToScopes);
            this.scopeToValues.k();
            r6b.c(this.dependencyToDerivedStates);
            this.recordedDerivedStateValues.clear();
        }

        public final void m(Object scope) {
            d58<Object> d58VarU = this.scopeToValues.u(scope);
            if (d58VarU == null) {
                return;
            }
            Object[] objArr = d58VarU.keys;
            int[] iArr = d58VarU.values;
            long[] jArr = d58VarU.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            int i5 = iArr[i4];
                            u(scope, obj);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i == length) {
                    return;
                } else {
                    i++;
                }
            }
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final x43 getDerivedStateObserver() {
            return this.derivedStateObserver;
        }

        public final Function1<Object, Unit> o() {
            return this.onChanged;
        }

        public final boolean p() {
            return this.scopeToValues.i();
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0044 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:15:0x0046 A[LOOP:0: B:5:0x0011->B:15:0x0046, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:19:0x0049 A[EDGE_INSN: B:19:0x0049->B:16:0x0049 BREAK  A[LOOP:0: B:5:0x0011->B:15:0x0046], SYNTHETIC] */
        public final void q() {
            d<Object> dVar = this.invalidated;
            Function1<Object, Unit> function1 = this.onChanged;
            Object[] objArr = dVar.elements;
            long[] jArr = dVar.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                function1.invoke(objArr[(i << 3) + i3]);
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i != length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            dVar.m();
        }

        /* JADX WARN: Code duplicated, block: B:101:0x0229 A[DONT_INVERT, PHI: r21
  0x0229: PHI (r21v42 boolean) = (r21v41 boolean), (r21v43 boolean) binds: [B:92:0x0201, B:100:0x0227] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:102:0x022b A[Catch: all -> 0x00e3, LOOP:8: B:91:0x01f4->B:102:0x022b, LOOP_END, TryCatch #0 {all -> 0x00e3, blocks: (B:23:0x0085, B:25:0x008b, B:27:0x008f, B:30:0x00a3, B:32:0x00b1, B:34:0x00bb, B:36:0x00c1, B:38:0x00da, B:42:0x00e7, B:44:0x00f7, B:46:0x00fd, B:48:0x0101, B:51:0x0111, B:53:0x0121, B:55:0x012b, B:57:0x0131, B:59:0x0141, B:67:0x0164, B:71:0x0180, B:63:0x014c, B:64:0x0155, B:68:0x0169, B:77:0x01a1, B:79:0x01b2, B:81:0x01cc, B:82:0x01d0, B:84:0x01de, B:86:0x01e4, B:88:0x01e8, B:91:0x01f4, B:93:0x0203, B:95:0x020f, B:97:0x0215, B:98:0x021f, B:105:0x023b, B:102:0x022b, B:103:0x0231, B:106:0x023f), top: B:285:0x0085 }] */
        /* JADX WARN: Code duplicated, block: B:104:0x0239  */
        /* JADX WARN: Code duplicated, block: B:131:0x02b1 A[DONT_INVERT, PHI: r21
  0x02b1: PHI (r21v34 boolean) = (r21v33 boolean), (r21v35 boolean) binds: [B:122:0x0289, B:130:0x02af] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:132:0x02b3 A[LOOP:6: B:121:0x027e->B:132:0x02b3, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:198:0x0417 A[DONT_INVERT, PHI: r26
  0x0417: PHI (r26v19 boolean) = (r26v18 boolean), (r26v20 boolean) binds: [B:187:0x03e6, B:197:0x0415] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:199:0x0419 A[Catch: all -> 0x03ac, LOOP:14: B:186:0x03d8->B:199:0x0419, LOOP_END, TryCatch #1 {all -> 0x03ac, blocks: (B:158:0x0351, B:160:0x0357, B:162:0x035b, B:165:0x0367, B:167:0x0374, B:169:0x0380, B:171:0x0386, B:173:0x03a3, B:177:0x03b0, B:179:0x03c0, B:181:0x03c6, B:183:0x03ca, B:186:0x03d8, B:188:0x03e8, B:190:0x03f4, B:192:0x03fa, B:195:0x040d, B:202:0x042e, B:206:0x044c, B:199:0x0419, B:200:0x0420, B:203:0x0431, B:212:0x047d, B:214:0x0492, B:216:0x04a8, B:217:0x04ac, B:219:0x04ba, B:221:0x04c0, B:223:0x04c4, B:226:0x04d0, B:228:0x04dc, B:230:0x04e8, B:232:0x04ee, B:233:0x04f8, B:237:0x0504, B:238:0x0507, B:240:0x050e, B:241:0x0514), top: B:287:0x0351 }] */
        /* JADX WARN: Code duplicated, block: B:201:0x042a  */
        /* JADX WARN: Code duplicated, block: B:236:0x0502 A[DONT_INVERT, PHI: r26
  0x0502: PHI (r26v8 boolean) = (r26v7 boolean), (r26v9 boolean) binds: [B:227:0x04da, B:235:0x0500] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:237:0x0504 A[Catch: all -> 0x03ac, LOOP:18: B:226:0x04d0->B:237:0x0504, LOOP_END, TryCatch #1 {all -> 0x03ac, blocks: (B:158:0x0351, B:160:0x0357, B:162:0x035b, B:165:0x0367, B:167:0x0374, B:169:0x0380, B:171:0x0386, B:173:0x03a3, B:177:0x03b0, B:179:0x03c0, B:181:0x03c6, B:183:0x03ca, B:186:0x03d8, B:188:0x03e8, B:190:0x03f4, B:192:0x03fa, B:195:0x040d, B:202:0x042e, B:206:0x044c, B:199:0x0419, B:200:0x0420, B:203:0x0431, B:212:0x047d, B:214:0x0492, B:216:0x04a8, B:217:0x04ac, B:219:0x04ba, B:221:0x04c0, B:223:0x04c4, B:226:0x04d0, B:228:0x04dc, B:230:0x04e8, B:232:0x04ee, B:233:0x04f8, B:237:0x0504, B:238:0x0507, B:240:0x050e, B:241:0x0514), top: B:287:0x0351 }] */
        /* JADX WARN: Code duplicated, block: B:243:0x051b  */
        /* JADX WARN: Code duplicated, block: B:272:0x0593  */
        /* JADX WARN: Code duplicated, block: B:298:0x0162 A[EDGE_INSN: B:298:0x0162->B:66:0x0162 BREAK  A[LOOP:4: B:51:0x0111->B:63:0x014c], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:303:0x02bc A[EDGE_INSN: B:303:0x02bc->B:134:0x02bc BREAK  A[LOOP:6: B:121:0x027e->B:132:0x02b3], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:308:0x023b A[EDGE_INSN: B:308:0x023b->B:105:0x023b BREAK  A[LOOP:8: B:91:0x01f4->B:102:0x022b], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:320:0x042e A[EDGE_INSN: B:320:0x042e->B:202:0x042e BREAK  A[LOOP:14: B:186:0x03d8->B:199:0x0419], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:328:0x050c A[EDGE_INSN: B:328:0x050c->B:239:0x050c BREAK  A[LOOP:18: B:226:0x04d0->B:237:0x0504], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:62:0x014a A[DONT_INVERT, PHI: r21
  0x014a: PHI (r21v53 boolean) = (r21v52 boolean), (r21v54 boolean) binds: [B:52:0x011f, B:61:0x0148] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:63:0x014c A[Catch: all -> 0x00e3, LOOP:4: B:51:0x0111->B:63:0x014c, LOOP_END, TryCatch #0 {all -> 0x00e3, blocks: (B:23:0x0085, B:25:0x008b, B:27:0x008f, B:30:0x00a3, B:32:0x00b1, B:34:0x00bb, B:36:0x00c1, B:38:0x00da, B:42:0x00e7, B:44:0x00f7, B:46:0x00fd, B:48:0x0101, B:51:0x0111, B:53:0x0121, B:55:0x012b, B:57:0x0131, B:59:0x0141, B:67:0x0164, B:71:0x0180, B:63:0x014c, B:64:0x0155, B:68:0x0169, B:77:0x01a1, B:79:0x01b2, B:81:0x01cc, B:82:0x01d0, B:84:0x01de, B:86:0x01e4, B:88:0x01e8, B:91:0x01f4, B:93:0x0203, B:95:0x020f, B:97:0x0215, B:98:0x021f, B:105:0x023b, B:102:0x022b, B:103:0x0231, B:106:0x023f), top: B:285:0x0085 }] */
        /* JADX WARN: Code duplicated, block: B:65:0x015e  */
        public final boolean r(Set<? extends Object> changes) {
            boolean z;
            Iterator it;
            Object obj;
            String str;
            HashMap<androidx.compose.p004runtime.j<?>, Object> map;
            int i;
            boolean z2;
            long[] jArr;
            Iterator it2;
            Object obj2;
            k58<Object, Object> k58Var;
            long[] jArr2;
            String str2;
            long j;
            HashMap<androidx.compose.p004runtime.j<?>, Object> map2;
            long[] jArr3;
            k58<Object, Object> k58Var2;
            HashMap<androidx.compose.p004runtime.j<?>, Object> map3;
            Object[] objArr;
            long[] jArr4;
            k58<Object, Object> k58Var3;
            HashMap<androidx.compose.p004runtime.j<?>, Object> map4;
            Object[] objArr2;
            int i2;
            long j2;
            int i3;
            k58<Object, Object> k58Var4;
            HashMap<androidx.compose.p004runtime.j<?>, Object> map5;
            long j3;
            int i4;
            int i5;
            boolean z3;
            k58<Object, Object> k58Var5 = this.dependencyToDerivedStates;
            HashMap<androidx.compose.p004runtime.j<?>, Object> map6 = this.recordedDerivedStateValues;
            k58<Object, Object> k58Var6 = this.valueToScopes;
            d<Object> dVar = this.invalidated;
            String str3 = "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>";
            int i6 = 8;
            if (changes instanceof ScatterSetWrapper) {
                ScatterSet scatterSetB = ((ScatterSetWrapper) changes).b();
                Object[] objArr3 = scatterSetB.elements;
                long[] jArr5 = scatterSetB.metadata;
                int length = jArr5.length - 2;
                if (length >= 0) {
                    int i7 = 0;
                    z = false;
                    while (true) {
                        long j4 = jArr5[i7];
                        int i8 = length;
                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i9 = 8 - ((~(i7 - i8)) >>> 31);
                            int i10 = 0;
                            while (i10 < i9) {
                                if ((j4 & 255) < 128) {
                                    Object obj3 = objArr3[(i7 << 3) + i10];
                                    int i11 = i6;
                                    if (!(obj3 instanceof b7c) || ((b7c) obj3).g(e.a(2))) {
                                        if (this.readingDerivedStates || !r6b.f(k58Var5, obj3)) {
                                            jArr4 = jArr5;
                                            k58Var3 = k58Var5;
                                            map4 = map6;
                                            objArr2 = objArr3;
                                            i2 = i10;
                                            j2 = j4;
                                        } else {
                                            this.readingDerivedStates = true;
                                            try {
                                                Object objE = k58Var5.e(obj3);
                                                if (objE != null) {
                                                    if (objE instanceof d) {
                                                        d dVar2 = (d) objE;
                                                        Object[] objArr4 = dVar2.elements;
                                                        long[] jArr6 = dVar2.metadata;
                                                        jArr4 = jArr5;
                                                        int length2 = jArr6.length - 2;
                                                        if (length2 >= 0) {
                                                            objArr2 = objArr3;
                                                            int i12 = 0;
                                                            while (true) {
                                                                long j5 = jArr6[i12];
                                                                j2 = j4;
                                                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                    int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                                                    int i14 = 0;
                                                                    while (i14 < i13) {
                                                                        if ((j5 & 255) < 128) {
                                                                            j3 = j5;
                                                                            androidx.compose.p004runtime.j<?> jVar = (androidx.compose.p004runtime.j) objArr4[(i12 << 3) + i14];
                                                                            Intrinsics.h(jVar, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
                                                                            Object obj4 = map6.get(jVar);
                                                                            bxb<?> policy = jVar.getPolicy();
                                                                            if (policy == null) {
                                                                                policy = p0.t();
                                                                            }
                                                                            i4 = i10;
                                                                            i5 = i14;
                                                                            if (policy.a(jVar.E().a(), obj4)) {
                                                                                k58Var4 = k58Var5;
                                                                                map5 = map6;
                                                                                this.statesToReread.c(jVar);
                                                                            } else {
                                                                                Object objE2 = k58Var6.e(jVar);
                                                                                if (objE2 == null) {
                                                                                    k58Var4 = k58Var5;
                                                                                    map5 = map6;
                                                                                    z3 = z;
                                                                                } else if (objE2 instanceof d) {
                                                                                    d dVar3 = (d) objE2;
                                                                                    Object[] objArr5 = dVar3.elements;
                                                                                    long[] jArr7 = dVar3.metadata;
                                                                                    int length3 = jArr7.length - 2;
                                                                                    if (length3 >= 0) {
                                                                                        int i15 = 0;
                                                                                        while (true) {
                                                                                            long j6 = jArr7[i15];
                                                                                            k58Var4 = k58Var5;
                                                                                            map5 = map6;
                                                                                            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                                                                if (i15 != length3) {
                                                                                                    break;
                                                                                                    break;
                                                                                                }
                                                                                                i15++;
                                                                                                k58Var5 = k58Var4;
                                                                                                map6 = map5;
                                                                                                i11 = 8;
                                                                                            } else {
                                                                                                int i16 = 8 - ((~(i15 - length3)) >>> 31);
                                                                                                for (int i17 = 0; i17 < i16; i17++) {
                                                                                                    if ((j6 & 255) < 128) {
                                                                                                        dVar.h(objArr5[(i15 << 3) + i17]);
                                                                                                        z = true;
                                                                                                    }
                                                                                                    j6 >>= i11;
                                                                                                }
                                                                                                if (i16 != i11) {
                                                                                                    break;
                                                                                                }
                                                                                                if (i15 != length3) {
                                                                                                    break;
                                                                                                }
                                                                                                i15++;
                                                                                                k58Var5 = k58Var4;
                                                                                                map6 = map5;
                                                                                                i11 = 8;
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        k58Var4 = k58Var5;
                                                                                        map5 = map6;
                                                                                    }
                                                                                    z3 = z;
                                                                                } else {
                                                                                    k58Var4 = k58Var5;
                                                                                    map5 = map6;
                                                                                    dVar.h(objE2);
                                                                                    z3 = true;
                                                                                }
                                                                                Unit unit = Unit.a;
                                                                                z = z3;
                                                                            }
                                                                        } else {
                                                                            k58Var4 = k58Var5;
                                                                            map5 = map6;
                                                                            j3 = j5;
                                                                            i4 = i10;
                                                                            i5 = i14;
                                                                        }
                                                                        j5 = j3 >> 8;
                                                                        i14 = i5 + 1;
                                                                        i11 = 8;
                                                                        i10 = i4;
                                                                        k58Var5 = k58Var4;
                                                                        map6 = map5;
                                                                    }
                                                                    k58Var3 = k58Var5;
                                                                    map4 = map6;
                                                                    i2 = i10;
                                                                    if (i13 != i11) {
                                                                        break;
                                                                    }
                                                                } else {
                                                                    k58Var3 = k58Var5;
                                                                    map4 = map6;
                                                                    i2 = i10;
                                                                }
                                                                if (i12 == length2) {
                                                                    break;
                                                                }
                                                                i12++;
                                                                j4 = j2;
                                                                i10 = i2;
                                                                k58Var5 = k58Var3;
                                                                map6 = map4;
                                                                i11 = 8;
                                                            }
                                                        }
                                                    } else {
                                                        jArr4 = jArr5;
                                                        k58Var3 = k58Var5;
                                                        objArr2 = objArr3;
                                                        i2 = i10;
                                                        j2 = j4;
                                                        androidx.compose.p004runtime.j<?> jVar2 = (androidx.compose.p004runtime.j) objE;
                                                        HashMap<androidx.compose.p004runtime.j<?>, Object> map7 = map6;
                                                        Object obj5 = map7.get(jVar2);
                                                        bxb<?> policy2 = jVar2.getPolicy();
                                                        if (policy2 == null) {
                                                            policy2 = p0.t();
                                                        }
                                                        if (policy2.a(jVar2.E().a(), obj5)) {
                                                            map4 = map7;
                                                            this.statesToReread.c(jVar2);
                                                        } else {
                                                            Object objE3 = k58Var6.e(jVar2);
                                                            if (objE3 == null) {
                                                                map4 = map7;
                                                            } else if (objE3 instanceof d) {
                                                                d dVar4 = (d) objE3;
                                                                Object[] objArr6 = dVar4.elements;
                                                                long[] jArr8 = dVar4.metadata;
                                                                int length4 = jArr8.length - 2;
                                                                if (length4 >= 0) {
                                                                    int i18 = 0;
                                                                    while (true) {
                                                                        long j7 = jArr8[i18];
                                                                        map4 = map7;
                                                                        Object[] objArr7 = objArr6;
                                                                        if ((((~j7) << 7) & j7 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                                            if (i18 != length4) {
                                                                                break;
                                                                                break;
                                                                            }
                                                                            i18++;
                                                                            objArr6 = objArr7;
                                                                            map7 = map4;
                                                                        } else {
                                                                            int i19 = 8 - ((~(i18 - length4)) >>> 31);
                                                                            for (int i20 = 0; i20 < i19; i20++) {
                                                                                if ((j7 & 255) < 128) {
                                                                                    dVar.h(objArr7[(i18 << 3) + i20]);
                                                                                    z = true;
                                                                                }
                                                                                j7 >>= 8;
                                                                            }
                                                                            if (i19 != 8) {
                                                                                break;
                                                                            }
                                                                            if (i18 != length4) {
                                                                                break;
                                                                            }
                                                                            i18++;
                                                                            objArr6 = objArr7;
                                                                            map7 = map4;
                                                                        }
                                                                    }
                                                                } else {
                                                                    map4 = map7;
                                                                }
                                                            } else {
                                                                map4 = map7;
                                                                dVar.h(objE3);
                                                                z = true;
                                                            }
                                                            Unit unit2 = Unit.a;
                                                        }
                                                    }
                                                    this.readingDerivedStates = false;
                                                } else {
                                                    jArr4 = jArr5;
                                                }
                                                k58Var3 = k58Var5;
                                                map4 = map6;
                                                objArr2 = objArr3;
                                                i2 = i10;
                                                j2 = j4;
                                                this.readingDerivedStates = false;
                                            } catch (Throwable th) {
                                                this.readingDerivedStates = false;
                                                throw th;
                                            }
                                        }
                                        Object objE4 = k58Var6.e(obj3);
                                        if (objE4 != null) {
                                            if (objE4 instanceof d) {
                                                d dVar5 = (d) objE4;
                                                Object[] objArr8 = dVar5.elements;
                                                long[] jArr9 = dVar5.metadata;
                                                int length5 = jArr9.length - 2;
                                                if (length5 >= 0) {
                                                    int i21 = 0;
                                                    while (true) {
                                                        long j8 = jArr9[i21];
                                                        Object[] objArr9 = objArr8;
                                                        if ((((~j8) << 7) & j8 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                            if (i21 != length5) {
                                                                break;
                                                                break;
                                                            }
                                                            i21++;
                                                            objArr8 = objArr9;
                                                        } else {
                                                            int i22 = 8 - ((~(i21 - length5)) >>> 31);
                                                            for (int i23 = 0; i23 < i22; i23++) {
                                                                if ((j8 & 255) < 128) {
                                                                    dVar.h(objArr9[(i21 << 3) + i23]);
                                                                    z = true;
                                                                }
                                                                j8 >>= 8;
                                                            }
                                                            if (i22 != 8) {
                                                                break;
                                                            }
                                                            if (i21 != length5) {
                                                                break;
                                                            }
                                                            i21++;
                                                            objArr8 = objArr9;
                                                        }
                                                    }
                                                }
                                            } else {
                                                dVar.h(objE4);
                                                z = true;
                                            }
                                        }
                                    } else {
                                        jArr4 = jArr5;
                                        k58Var3 = k58Var5;
                                        map4 = map6;
                                        objArr2 = objArr3;
                                        i2 = i10;
                                        j2 = j4;
                                    }
                                    i3 = 8;
                                } else {
                                    jArr4 = jArr5;
                                    k58Var3 = k58Var5;
                                    map4 = map6;
                                    objArr2 = objArr3;
                                    i2 = i10;
                                    j2 = j4;
                                    i3 = i6;
                                }
                                j4 = j2 >> i3;
                                i10 = i2 + 1;
                                i6 = i3;
                                jArr5 = jArr4;
                                objArr3 = objArr2;
                                k58Var5 = k58Var3;
                                map6 = map4;
                            }
                            jArr3 = jArr5;
                            k58Var2 = k58Var5;
                            map3 = map6;
                            objArr = objArr3;
                            if (i9 != i6) {
                                break;
                            }
                        } else {
                            jArr3 = jArr5;
                            k58Var2 = k58Var5;
                            map3 = map6;
                            objArr = objArr3;
                        }
                        length = i8;
                        if (i7 == length) {
                            break;
                        }
                        i7++;
                        jArr5 = jArr3;
                        objArr3 = objArr;
                        k58Var5 = k58Var2;
                        map6 = map3;
                        i6 = 8;
                    }
                } else {
                    z = false;
                }
            } else {
                k58<Object, Object> k58Var7 = k58Var5;
                HashMap<androidx.compose.p004runtime.j<?>, Object> map8 = map6;
                Iterator it3 = changes.iterator();
                boolean z4 = false;
                while (it3.hasNext()) {
                    Object next = it3.next();
                    if (!(next instanceof b7c) || ((b7c) next).g(e.a(2))) {
                        if (this.readingDerivedStates) {
                            it = it3;
                            obj = next;
                            str = str3;
                            map = map8;
                            i = 0;
                        } else {
                            k58<Object, Object> k58Var8 = k58Var7;
                            if (r6b.f(k58Var8, next)) {
                                this.readingDerivedStates = true;
                                try {
                                    Object objE5 = k58Var8.e(next);
                                    if (objE5 == null) {
                                        it = it3;
                                        obj = next;
                                        k58Var7 = k58Var8;
                                        str = str3;
                                        map = map8;
                                    } else if (objE5 instanceof d) {
                                        d dVar6 = (d) objE5;
                                        Object[] objArr10 = dVar6.elements;
                                        long[] jArr10 = dVar6.metadata;
                                        int length6 = jArr10.length - 2;
                                        if (length6 >= 0) {
                                            int i24 = 0;
                                            while (true) {
                                                long j9 = jArr10[i24];
                                                Object[] objArr11 = objArr10;
                                                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i25 = 8 - ((~(i24 - length6)) >>> 31);
                                                    int i26 = 0;
                                                    while (i26 < i25) {
                                                        if ((j9 & 255) < 128) {
                                                            androidx.compose.p004runtime.j<?> jVar3 = (androidx.compose.p004runtime.j) objArr11[(i24 << 3) + i26];
                                                            Intrinsics.h(jVar3, str3);
                                                            it2 = it3;
                                                            k58Var = k58Var8;
                                                            map2 = map8;
                                                            Object obj6 = map2.get(jVar3);
                                                            bxb<?> policy3 = jVar3.getPolicy();
                                                            if (policy3 == null) {
                                                                policy3 = p0.t();
                                                            }
                                                            jArr2 = jArr10;
                                                            str2 = str3;
                                                            if (policy3.a(jVar3.E().a(), obj6)) {
                                                                obj2 = next;
                                                                j = j9;
                                                                this.statesToReread.c(jVar3);
                                                            } else {
                                                                Object objE6 = k58Var6.e(jVar3);
                                                                if (objE6 == null) {
                                                                    obj2 = next;
                                                                    j = j9;
                                                                } else if (objE6 instanceof d) {
                                                                    d dVar7 = (d) objE6;
                                                                    Object[] objArr12 = dVar7.elements;
                                                                    long[] jArr11 = dVar7.metadata;
                                                                    int length7 = jArr11.length - 2;
                                                                    if (length7 >= 0) {
                                                                        j = j9;
                                                                        int i27 = 0;
                                                                        while (true) {
                                                                            long j10 = jArr11[i27];
                                                                            obj2 = next;
                                                                            long[] jArr12 = jArr11;
                                                                            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                                                if (i27 != length7) {
                                                                                    break;
                                                                                    break;
                                                                                }
                                                                                i27++;
                                                                                next = obj2;
                                                                                jArr11 = jArr12;
                                                                            } else {
                                                                                int i28 = 8 - ((~(i27 - length7)) >>> 31);
                                                                                for (int i29 = 0; i29 < i28; i29++) {
                                                                                    if ((j10 & 255) < 128) {
                                                                                        dVar.h(objArr12[(i27 << 3) + i29]);
                                                                                        z4 = true;
                                                                                    }
                                                                                    j10 >>= 8;
                                                                                }
                                                                                if (i28 != 8) {
                                                                                    break;
                                                                                }
                                                                                if (i27 != length7) {
                                                                                    break;
                                                                                }
                                                                                i27++;
                                                                                next = obj2;
                                                                                jArr11 = jArr12;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        obj2 = next;
                                                                        j = j9;
                                                                    }
                                                                } else {
                                                                    obj2 = next;
                                                                    j = j9;
                                                                    dVar.h(objE6);
                                                                    z4 = true;
                                                                }
                                                                Unit unit3 = Unit.a;
                                                            }
                                                        } else {
                                                            it2 = it3;
                                                            obj2 = next;
                                                            k58Var = k58Var8;
                                                            jArr2 = jArr10;
                                                            str2 = str3;
                                                            j = j9;
                                                            map2 = map8;
                                                        }
                                                        j9 = j >> 8;
                                                        i26++;
                                                        map8 = map2;
                                                        next = obj2;
                                                        jArr10 = jArr2;
                                                        str3 = str2;
                                                        k58Var8 = k58Var;
                                                        it3 = it2;
                                                    }
                                                    it = it3;
                                                    obj = next;
                                                    k58Var7 = k58Var8;
                                                    jArr = jArr10;
                                                    str = str3;
                                                    map = map8;
                                                    if (i25 != 8) {
                                                        break;
                                                    }
                                                } else {
                                                    it = it3;
                                                    obj = next;
                                                    k58Var7 = k58Var8;
                                                    jArr = jArr10;
                                                    str = str3;
                                                    map = map8;
                                                }
                                                if (i24 == length6) {
                                                    break;
                                                }
                                                i24++;
                                                map8 = map;
                                                objArr10 = objArr11;
                                                next = obj;
                                                jArr10 = jArr;
                                                str3 = str;
                                                k58Var8 = k58Var7;
                                                it3 = it;
                                            }
                                        } else {
                                            it = it3;
                                            obj = next;
                                            k58Var7 = k58Var8;
                                            str = str3;
                                            map = map8;
                                        }
                                    } else {
                                        it = it3;
                                        obj = next;
                                        k58Var7 = k58Var8;
                                        str = str3;
                                        map = map8;
                                        androidx.compose.p004runtime.j<?> jVar4 = (androidx.compose.p004runtime.j) objE5;
                                        Object obj7 = map.get(jVar4);
                                        bxb<?> policy4 = jVar4.getPolicy();
                                        if (policy4 == null) {
                                            policy4 = p0.t();
                                        }
                                        if (policy4.a(jVar4.E().a(), obj7)) {
                                            this.statesToReread.c(jVar4);
                                        } else {
                                            Object objE7 = k58Var6.e(jVar4);
                                            if (objE7 == null) {
                                                z2 = z4;
                                            } else if (objE7 instanceof d) {
                                                d dVar8 = (d) objE7;
                                                Object[] objArr13 = dVar8.elements;
                                                long[] jArr13 = dVar8.metadata;
                                                int length8 = jArr13.length - 2;
                                                if (length8 >= 0) {
                                                    int i30 = 0;
                                                    while (true) {
                                                        long j11 = jArr13[i30];
                                                        if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                            if (i30 != length8) {
                                                                break;
                                                                break;
                                                            }
                                                            i30++;
                                                        } else {
                                                            int i31 = 8 - ((~(i30 - length8)) >>> 31);
                                                            for (int i32 = 0; i32 < i31; i32++) {
                                                                if ((j11 & 255) < 128) {
                                                                    dVar.h(objArr13[(i30 << 3) + i32]);
                                                                    z4 = true;
                                                                }
                                                                j11 >>= 8;
                                                            }
                                                            if (i31 != 8) {
                                                                break;
                                                            }
                                                            if (i30 != length8) {
                                                                break;
                                                            }
                                                            i30++;
                                                        }
                                                    }
                                                }
                                                z2 = z4;
                                            } else {
                                                dVar.h(objE7);
                                                z2 = true;
                                            }
                                            Unit unit4 = Unit.a;
                                            z4 = z2;
                                        }
                                    }
                                    i = 0;
                                    this.readingDerivedStates = false;
                                } catch (Throwable th2) {
                                    this.readingDerivedStates = false;
                                    throw th2;
                                }
                            } else {
                                k58Var7 = k58Var8;
                                it = it3;
                                obj = next;
                                str = str3;
                                map = map8;
                                i = 0;
                            }
                        }
                        boolean z5 = z4;
                        Object objE8 = k58Var6.e(obj);
                        if (objE8 != null) {
                            if (objE8 instanceof d) {
                                d dVar9 = (d) objE8;
                                Object[] objArr14 = dVar9.elements;
                                long[] jArr14 = dVar9.metadata;
                                int length9 = jArr14.length - 2;
                                if (length9 >= 0) {
                                    int i33 = i;
                                    while (true) {
                                        long j12 = jArr14[i33];
                                        if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i34 = 8 - ((~(i33 - length9)) >>> 31);
                                            for (int i35 = i; i35 < i34; i35++) {
                                                if ((j12 & 255) < 128) {
                                                    dVar.h(objArr14[(i33 << 3) + i35]);
                                                    z5 = true;
                                                }
                                                j12 >>= 8;
                                            }
                                            if (i34 != 8) {
                                                break;
                                            }
                                        }
                                        if (i33 == length9) {
                                            break;
                                        }
                                        i33++;
                                    }
                                }
                            } else {
                                dVar.h(objE8);
                                z5 = true;
                            }
                        }
                        z4 = z5;
                    } else {
                        it = it3;
                        str = str3;
                        map = map8;
                    }
                    map8 = map;
                    str3 = str;
                    it3 = it;
                }
                z = z4;
            }
            if (!this.readingDerivedStates && this.statesToReread.getSize() != 0) {
                r58<androidx.compose.p004runtime.j<?>> r58Var = this.statesToReread;
                androidx.compose.p004runtime.j<?>[] jVarArr = r58Var.content;
                int size = r58Var.getSize();
                for (int i36 = 0; i36 < size; i36++) {
                    w(jVarArr[i36]);
                }
                this.statesToReread.j();
            }
            return z;
        }

        public final void s(Object value) {
            Object obj = this.currentScope;
            Intrinsics.g(obj);
            int i = this.currentToken;
            d58<Object> d58Var = this.currentScopeReads;
            if (d58Var == null) {
                d58Var = new d58<>(0, 1, null);
                this.currentScopeReads = d58Var;
                this.scopeToValues.x(obj, d58Var);
                Unit unit = Unit.a;
            }
            t(value, i, obj, d58Var);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x009d A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:28:0x009f A[LOOP:2: B:16:0x0066->B:28:0x009f, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:29:0x00a8  */
        /* JADX WARN: Code duplicated, block: B:49:0x00ac A[EDGE_INSN: B:49:0x00ac->B:30:0x00ac BREAK  A[LOOP:2: B:16:0x0066->B:28:0x009f], SYNTHETIC] */
        public final void v(Function1<Object, Boolean> predicate) {
            long[] jArr;
            long[] jArr2;
            long j;
            char c;
            long j2;
            int i;
            k58<Object, d58<Object>> k58Var = this.scopeToValues;
            long[] jArr3 = k58Var.metadata;
            int length = jArr3.length - 2;
            if (length < 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                long j3 = jArr3[i2];
                char c2 = 7;
                long j4 = -9187201950435737472L;
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j3 & 255) < 128) {
                            int i6 = (i2 << 3) + i5;
                            c = c2;
                            Object obj = k58Var.keys[i6];
                            j2 = j4;
                            d58 d58Var = (d58) k58Var.values[i6];
                            Boolean bool = (Boolean) predicate.invoke(obj);
                            if (bool.booleanValue()) {
                                Object[] objArr = d58Var.keys;
                                int[] iArr = d58Var.values;
                                long[] jArr4 = d58Var.metadata;
                                int i7 = i3;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    jArr2 = jArr3;
                                    j = j3;
                                    int i8 = 0;
                                    while (true) {
                                        long j5 = jArr4[i8];
                                        long[] jArr5 = jArr4;
                                        if ((((~j5) << c) & j5 & j2) != j2) {
                                            int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                            for (int i10 = 0; i10 < i9; i10++) {
                                                if ((j5 & 255) < 128) {
                                                    int i11 = (i8 << 3) + i10;
                                                    Object obj2 = objArr[i11];
                                                    int i12 = iArr[i11];
                                                    u(obj, obj2);
                                                }
                                                j5 >>= i7;
                                            }
                                            if (i9 != i7) {
                                                break;
                                            }
                                            if (i8 != length2) {
                                                break;
                                            }
                                            i8++;
                                            jArr4 = jArr5;
                                            i7 = 8;
                                        } else if (i8 != length2) {
                                            break;
                                            break;
                                        } else {
                                            i8++;
                                            jArr4 = jArr5;
                                            i7 = 8;
                                        }
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j = j3;
                                }
                            } else {
                                jArr2 = jArr3;
                                j = j3;
                            }
                            if (bool.booleanValue()) {
                                k58Var.v(i6);
                            }
                            i = 8;
                        } else {
                            jArr2 = jArr3;
                            j = j3;
                            c = c2;
                            j2 = j4;
                            i = i3;
                        }
                        i5++;
                        i3 = i;
                        j3 = j >> i;
                        c2 = c;
                        j4 = j2;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    if (i4 != i3) {
                        return;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i2 == length) {
                    return;
                }
                i2++;
                jArr3 = jArr;
            }
        }

        public final void w(androidx.compose.p004runtime.j<?> derivedState) {
            long[] jArr;
            d58<Object> d58Var;
            k58<Object, d58<Object>> k58Var = this.scopeToValues;
            int iHashCode = Long.hashCode(i.K().getSnapshotId());
            Object objE = this.valueToScopes.e(derivedState);
            if (objE == null) {
                return;
            }
            if (!(objE instanceof d)) {
                d58<Object> d58VarE = k58Var.e(objE);
                if (d58VarE == null) {
                    d58VarE = new d58<>(0, 1, null);
                    k58Var.x(objE, d58VarE);
                    Unit unit = Unit.a;
                }
                t(derivedState, iHashCode, objE, d58VarE);
                return;
            }
            d dVar = (d) objE;
            Object[] objArr = dVar.elements;
            long[] jArr2 = dVar.metadata;
            int length = jArr2.length - 2;
            if (length < 0) {
                return;
            }
            int i = 0;
            while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8;
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    int i4 = 0;
                    while (i4 < i3) {
                        if ((j & 255) < 128) {
                            Object obj = objArr[(i << 3) + i4];
                            d58<Object> d58VarE2 = k58Var.e(obj);
                            if (d58VarE2 == null) {
                                d58Var = new d58<>(0, 1, null);
                                k58Var.x(obj, d58Var);
                                Unit unit2 = Unit.a;
                            } else {
                                d58Var = d58VarE2;
                            }
                            t(derivedState, iHashCode, obj, d58Var);
                        }
                        j >>= i2;
                        i4++;
                        i2 = i2;
                        jArr2 = jArr2;
                    }
                    jArr = jArr2;
                    if (i3 != i2) {
                        return;
                    }
                } else {
                    jArr = jArr2;
                }
                if (i == length) {
                    return;
                }
                i++;
                jArr2 = jArr;
            }
        }
    }

    public j(Function1<? super Function0<Unit>, Unit> function1) {
        this.onChangedExecutor = function1;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Multi-variable type inference failed */
    private final void d(Set<? extends Object> set) throws KotlinNothingValueException {
        Object obj;
        Set<? extends Object> setA1;
        do {
            obj = this.pendingChanges.get();
            if (obj == null) {
                setA1 = set;
            } else if (obj instanceof Set) {
                setA1 = m.s(new Set[]{obj, set});
            } else {
                if (!(obj instanceof List)) {
                    n();
                    throw new KotlinNothingValueException();
                }
                setA1 = m.a1((Collection) obj, m.e(set));
            }
        } while (!w58.a(this.pendingChanges, obj, setA1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public static final Unit e(j jVar, Set set, g gVar) throws KotlinNothingValueException {
        jVar.d(set);
        if (jVar.i()) {
            jVar.o();
        }
        return Unit.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final boolean i() throws KotlinNothingValueException {
        boolean z;
        synchronized (this.observedScopeMapsLock) {
            z = this.sendingNotifications;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            Set<? extends Object> setM = m();
            if (setM == null) {
                return z2;
            }
            synchronized (this.observedScopeMapsLock) {
                try {
                    r58<a> r58Var = this.observedScopeMaps;
                    a[] aVarArr = r58Var.content;
                    int size = r58Var.getSize();
                    for (int i = 0; i < size; i++) {
                        z2 = aVarArr[i].r(setM) || z2;
                    }
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private final <T> a j(Function1<? super T, Unit> onChanged) {
        a aVar;
        r58<a> r58Var = this.observedScopeMaps;
        a[] aVarArr = r58Var.content;
        int size = r58Var.getSize();
        int i = 0;
        while (true) {
            if (i >= size) {
                aVar = null;
                break;
            }
            aVar = aVarArr[i];
            if (aVar.o() == onChanged) {
                break;
            }
            i++;
        }
        a aVar2 = aVar;
        if (aVar2 != null) {
            return aVar2;
        }
        Intrinsics.h(onChanged, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
        a aVar3 = new a((Function1) kotlin.jvm.internal.a.f(onChanged, 1));
        this.observedScopeMaps.c(aVar3);
        return aVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(j jVar, Object obj) {
        if (!jVar.isPaused) {
            synchronized (jVar.observedScopeMapsLock) {
                a aVar = jVar.currentMap;
                Intrinsics.g(aVar);
                aVar.s(obj);
                Unit unit = Unit.a;
            }
        }
        return Unit.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final Set<Object> m() throws KotlinNothingValueException {
        Object obj;
        Object objSubList;
        Set<Object> set;
        do {
            obj = this.pendingChanges.get();
            objSubList = null;
            if (obj == null) {
                return null;
            }
            if (obj instanceof Set) {
                set = (Set) obj;
            } else {
                if (!(obj instanceof List)) {
                    n();
                    throw new KotlinNothingValueException();
                }
                List list = (List) obj;
                Set<Object> set2 = (Set) list.get(0);
                if (list.size() == 2) {
                    objSubList = list.get(1);
                } else if (list.size() > 2) {
                    objSubList = list.subList(1, list.size());
                }
                set = set2;
            }
        } while (!w58.a(this.pendingChanges, obj, objSubList));
        return set;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final Void n() throws KotlinNothingValueException {
        e.c("Unexpected notification");
        throw new KotlinNothingValueException();
    }

    private final void o() {
        this.onChangedExecutor.invoke(new Function0() { // from class: com.google.android.oxb
            public final Object invoke() {
                return j.p(this.a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(j jVar) {
        do {
            synchronized (jVar.observedScopeMapsLock) {
                try {
                    if (!jVar.sendingNotifications) {
                        jVar.sendingNotifications = true;
                        try {
                            r58<a> r58Var = jVar.observedScopeMaps;
                            a[] aVarArr = r58Var.content;
                            int size = r58Var.getSize();
                            for (int i = 0; i < size; i++) {
                                aVarArr[i].q();
                            }
                            jVar.sendingNotifications = false;
                        } catch (Throwable th) {
                            jVar.sendingNotifications = false;
                            throw th;
                        }
                    }
                    Unit unit = Unit.a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } while (jVar.i());
        return Unit.a;
    }

    public final void f() {
        synchronized (this.observedScopeMapsLock) {
            try {
                r58<a> r58Var = this.observedScopeMaps;
                a[] aVarArr = r58Var.content;
                int size = r58Var.getSize();
                for (int i = 0; i < size; i++) {
                    aVarArr[i].k();
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(Object scope) {
        synchronized (this.observedScopeMapsLock) {
            try {
                r58<a> r58Var = this.observedScopeMaps;
                int size = r58Var.getSize();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    a aVar = r58Var.content[i2];
                    aVar.m(scope);
                    if (!aVar.p()) {
                        i++;
                    } else if (i > 0) {
                        a[] aVarArr = r58Var.content;
                        aVarArr[i2 - i] = aVarArr[i2];
                    }
                }
                int i3 = size - i;
                f.A(r58Var.content, (Object) null, i3, size);
                r58Var.z(i3);
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(Function1<Object, Boolean> predicate) {
        synchronized (this.observedScopeMapsLock) {
            try {
                r58<a> r58Var = this.observedScopeMaps;
                int size = r58Var.getSize();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    a aVar = r58Var.content[i2];
                    aVar.v(predicate);
                    if (!aVar.p()) {
                        i++;
                    } else if (i > 0) {
                        a[] aVarArr = r58Var.content;
                        aVarArr[i2 - i] = aVarArr[i2];
                    }
                }
                int i3 = size - i;
                f.A(r58Var.content, (Object) null, i3, size);
                r58Var.z(i3);
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0135  */
    /* JADX WARN: Code duplicated, block: B:57:0x0149 A[Catch: all -> 0x0115, TryCatch #8 {all -> 0x0115, blocks: (B:39:0x0107, B:47:0x0123, B:48:0x012e, B:53:0x013c, B:56:0x0141, B:57:0x0149, B:59:0x014f), top: B:123:0x00ca }] */
    /* JADX WARN: Code duplicated, block: B:59:0x014f A[Catch: all -> 0x0115, TRY_LEAVE, TryCatch #8 {all -> 0x0115, blocks: (B:39:0x0107, B:47:0x0123, B:48:0x012e, B:53:0x013c, B:56:0x0141, B:57:0x0149, B:59:0x014f), top: B:123:0x00ca }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    public final <T> void k(T scope, Function1<? super T, Unit> onValueChangedForScope, Function0<Unit> block) {
        a aVarJ;
        boolean z;
        a aVar;
        long j;
        r58<x43> r58Var;
        long j2;
        g kVar;
        g gVarL;
        long jA = q1d.a();
        synchronized (this.observedScopeMapsLock) {
            aVarJ = j(onValueChangedForScope);
            z = this.isPaused;
            aVar = this.currentMap;
            j = this.currentMapThreadId;
            Unit unit = Unit.a;
        }
        long j3 = 0;
        if (j != -1) {
            if (!(j == jA)) {
                ei9.a("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j + "), currentThread={id=" + jA + ", name=" + q1d.b() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
            }
        }
        try {
            synchronized (this.observedScopeMapsLock) {
                try {
                    this.isPaused = false;
                    this.currentMap = aVarJ;
                    this.currentMapThreadId = jA;
                } catch (Throwable th) {
                    th = th;
                }
            }
            Function1<Object, Unit> function1 = this.readObserver;
            Object obj = aVarJ.currentScope;
            d58 d58Var = aVarJ.currentScopeReads;
            int i = aVarJ.currentToken;
            aVarJ.currentScope = scope;
            aVarJ.currentScopeReads = (d58) aVarJ.scopeToValues.e(scope);
            if (aVarJ.currentToken == -1) {
                aVarJ.currentToken = Long.hashCode(i.K().getSnapshotId());
            }
            x43 derivedStateObserver = aVarJ.getDerivedStateObserver();
            r58<x43> r58VarC = p0.c();
            try {
                r58VarC.c(derivedStateObserver);
                g.Companion companion = g.INSTANCE;
                if (function1 == null) {
                    block.invoke();
                    j2 = j;
                    r58Var = r58VarC;
                } else {
                    g gVar = (g) i.c.a();
                    try {
                        if (!(gVar instanceof k)) {
                            j2 = j;
                            if (gVar != null) {
                                r58Var = r58VarC;
                                kVar = new k(gVar instanceof b ? (b) gVar : null, function1, null, true, false);
                                gVarL = kVar.l();
                                block.invoke();
                                kVar.s(gVarL);
                                kVar.d();
                            } else {
                                r58Var = r58VarC;
                                kVar = new k(gVar instanceof b ? (b) gVar : null, function1, null, true, false);
                                gVarL = kVar.l();
                                block.invoke();
                                kVar.s(gVarL);
                                kVar.d();
                            }
                            synchronized (this.observedScopeMapsLock) {
                                this.currentMap = aVar;
                                this.isPaused = z;
                                this.currentMapThreadId = j3;
                                Unit unit2 = Unit.a;
                            }
                            throw th;
                        }
                        try {
                            if (((k) gVar).getThreadId() == q1d.a()) {
                                Function1<Object, Unit> function1H = ((k) gVar).g();
                                Function1<Object, Unit> function1K = ((k) gVar).k();
                                try {
                                    j2 = j;
                                    try {
                                        ((k) gVar).Y(i.O(function1, function1H, false, 4, null));
                                        ((k) gVar).Z(i.Q(null, function1K));
                                        block.invoke();
                                        ((k) gVar).Y(function1H);
                                        ((k) gVar).Z(function1K);
                                        r58Var = r58VarC;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        ((k) gVar).Y(function1H);
                                        ((k) gVar).Z(function1K);
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            } else {
                                j2 = j;
                                if (gVar != null || (gVar instanceof b)) {
                                    r58Var = r58VarC;
                                    try {
                                        kVar = new k(gVar instanceof b ? (b) gVar : null, function1, null, true, false);
                                    } catch (Throwable th4) {
                                        th = th4;
                                        r58Var.u(r58Var.getSize() - 1);
                                        throw th;
                                    }
                                } else {
                                    kVar = gVar.x(function1);
                                    r58Var = r58VarC;
                                }
                                try {
                                    gVarL = kVar.l();
                                    try {
                                        block.invoke();
                                        kVar.s(gVarL);
                                        kVar.d();
                                    } catch (Throwable th5) {
                                        try {
                                            kVar.s(gVarL);
                                            throw th5;
                                        } catch (Throwable th6) {
                                            th = th6;
                                            try {
                                                kVar.d();
                                                throw th;
                                            } catch (Throwable th7) {
                                                th = th7;
                                                r58Var.u(r58Var.getSize() - 1);
                                                throw th;
                                            }
                                        }
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                }
                            }
                        } catch (Throwable th9) {
                            th = th9;
                            j2 = j;
                            r58Var = r58VarC;
                            r58Var.u(r58Var.getSize() - 1);
                            throw th;
                        }
                    } catch (Throwable th10) {
                        th = th10;
                    }
                }
                try {
                    r58Var.u(r58Var.getSize() - 1);
                    Object obj2 = aVarJ.currentScope;
                    Intrinsics.g(obj2);
                    aVarJ.l(obj2);
                    aVarJ.currentScope = obj;
                    aVarJ.currentScopeReads = d58Var;
                    aVarJ.currentToken = i;
                    synchronized (this.observedScopeMapsLock) {
                        this.currentMap = aVar;
                        this.isPaused = z;
                        this.currentMapThreadId = j2;
                    }
                } catch (Throwable th11) {
                    th = th11;
                    j3 = j2;
                }
            } catch (Throwable th12) {
                th = th12;
                r58Var = r58VarC;
            }
        } catch (Throwable th13) {
            th = th13;
            j3 = j;
        }
    }

    public final void q() {
        this.applyUnsubscribe = g.INSTANCE.h(this.applyObserver);
    }

    public final void r() {
        nn8 nn8Var = this.applyUnsubscribe;
        if (nn8Var != null) {
            nn8Var.dispose();
        }
    }
}
