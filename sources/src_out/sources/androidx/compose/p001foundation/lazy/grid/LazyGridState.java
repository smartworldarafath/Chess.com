package androidx.compose.p001foundation.lazy.grid;

import androidx.compose.p001foundation.gestures.Orientation;
import androidx.compose.p001foundation.gestures.u;
import androidx.compose.p001foundation.lazy.grid.LazyGridState;
import androidx.compose.p001foundation.lazy.layout.LazyLayoutScrollDeltaBetweenPasses;
import androidx.compose.p004runtime.p0;
import androidx.compose.p004runtime.s0;
import androidx.compose.p004runtime.snapshots.g;
import com.google.android.q22;
import com.google.android.sh7;
import com.google.inputmethod.bc0;
import com.google.inputmethod.cq6;
import com.google.inputmethod.cx5;
import com.google.inputmethod.gn8;
import com.google.inputmethod.h11;
import com.google.inputmethod.hab;
import com.google.inputmethod.jq6;
import com.google.inputmethod.k0b;
import com.google.inputmethod.k26;
import com.google.inputmethod.k47;
import com.google.inputmethod.kq6;
import com.google.inputmethod.kx1;
import com.google.inputmethod.mq6;
import com.google.inputmethod.mu6;
import com.google.inputmethod.nu6;
import com.google.inputmethod.o0b;
import com.google.inputmethod.o58;
import com.google.inputmethod.oq6;
import com.google.inputmethod.pea;
import com.google.inputmethod.pq6;
import com.google.inputmethod.qe8;
import com.google.inputmethod.qea;
import com.google.inputmethod.qq6;
import com.google.inputmethod.r48;
import com.google.inputmethod.rp6;
import com.google.inputmethod.rq6;
import com.google.inputmethod.tq6;
import com.google.inputmethod.us6;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.f;
import kotlin.collections.m;
import kotlin.coroutines.intrinsics.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b*\u0002\u0089\u0001\b\u0007\u0018\u0000 v2\u00020\u0001:\u0001 B'\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001d\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0013\u001a\u00020\u000e2\b\b\u0001\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J<\u0010 \u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\"\u0010\u001f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001bH\u0096@¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\n2\u0006\u0010$\u001a\u00020\nH\u0000¢\u0006\u0004\b%\u0010#J)\u0010*\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u00152\b\b\u0002\u0010)\u001a\u00020\u0015H\u0000¢\u0006\u0004\b*\u0010+J\u001f\u0010/\u001a\u00020\u00022\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\u0002H\u0000¢\u0006\u0004\b/\u00100R\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u00101\u001a\u0004\b2\u00103R$\u00109\u001a\u00020\u00152\u0006\u00104\u001a\u00020\u00158\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R(\u0010>\u001a\u0004\u0018\u00010&2\b\u00104\u001a\u0004\u0018\u00010&8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0016\u0010?\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u00106R\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020&0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u001a\u0010M\u001a\u00020H8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR$\u0010R\u001a\u00020\n2\u0006\u00104\u001a\u00020\n8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u0014\u0010U\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR$\u0010Z\u001a\u00020\u00022\u0006\u00104\u001a\u00020\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\"\u0010_\u001a\u00020\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b[\u00106\u001a\u0004\b\\\u00108\"\u0004\b]\u0010^R(\u0010e\u001a\u0004\u0018\u00010`2\b\u00104\u001a\u0004\u0018\u00010`8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR\u001a\u0010k\u001a\u00020f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR\u001a\u0010q\u001a\u00020l8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010pR \u0010x\u001a\b\u0012\u0004\u0012\u00020s0r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bt\u0010u\u001a\u0004\bv\u0010wR\u001a\u0010~\u001a\u00020y8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}R%\u0010\u0084\u0001\u001a\u00020\u007f8\u0000X\u0080\u0004¢\u0006\u0016\n\u0005\b*\u0010\u0080\u0001\u0012\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0005\bO\u0010\u0081\u0001R\u0018\u0010\u0088\u0001\u001a\u00030\u0085\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0017\u0010\u008b\u0001\u001a\u00030\u0089\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b<\u0010\u008a\u0001R\u001f\u0010\u0090\u0001\u001a\u00030\u008c\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\bo\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001e\u0010\u0094\u0001\u001a\u00030\u0091\u00018\u0000X\u0080\u0004¢\u0006\u000e\n\u0004\b|\u0010F\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R\u001f\u0010\u0097\u0001\u001a\u00030\u0091\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b\u0095\u0001\u0010F\u001a\u0006\b\u0096\u0001\u0010\u0093\u0001R/\u0010\u009b\u0001\u001a\u00020\u00152\u0007\u0010\u0098\u0001\u001a\u00020\u00158V@RX\u0096\u008e\u0002¢\u0006\u0014\n\u0005\b\u0099\u0001\u0010F\u001a\u0004\b:\u00108\"\u0005\b\u009a\u0001\u0010^R.\u0010\u009d\u0001\u001a\u00020\u00152\u0007\u0010\u0098\u0001\u001a\u00020\u00158V@RX\u0096\u008e\u0002¢\u0006\u0013\n\u0004\b7\u0010F\u001a\u0004\bE\u00108\"\u0005\b\u009c\u0001\u0010^R\u0017\u0010 \u0001\u001a\u00030\u009e\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bK\u0010\u009f\u0001R\u0012\u0010\u0003\u001a\u00020\u00028G¢\u0006\u0007\u001a\u0005\b\u0095\u0001\u0010YR\u0012\u0010\u0004\u001a\u00020\u00028G¢\u0006\u0007\u001a\u0005\b\u0099\u0001\u0010YR\u0013\u0010\r\u001a\u00020\f8G¢\u0006\b\u001a\u0006\b¡\u0001\u0010¢\u0001R!\u0010¨\u0001\u001a\u00030£\u00018@X\u0080\u0084\u0002¢\u0006\u0010\u001a\u0006\b¤\u0001\u0010¥\u0001*\u0006\b¦\u0001\u0010§\u0001R\u0015\u0010©\u0001\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00108R\u0015\u0010ª\u0001\u001a\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bW\u0010Q¨\u0006«\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridState;", "Lcom/google/android/hab;", "", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "Lcom/google/android/qq6;", "prefetchStrategy", "<init>", "(IILcom/google/android/qq6;)V", "(II)V", "", "delta", "Lcom/google/android/cq6;", "layoutInfo", "", "K", "(FLcom/google/android/cq6;)V", "index", "scrollOffset", "N", "(IILcom/google/android/q22;)Ljava/lang/Object;", "", "forceRemeasure", "S", "(IIZ)V", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Lcom/google/android/p9b;", "Lcom/google/android/q22;", "", "block", "a", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lcom/google/android/q22;)Ljava/lang/Object;", "d", "(F)F", "distance", "L", "Lcom/google/android/jq6;", "result", "isLookingAhead", "visibleItemsStayedTheSame", "q", "(Lcom/google/android/jq6;ZZ)V", "Lcom/google/android/rp6;", "itemProvider", "firstItemIndex", "T", "(Lcom/google/android/rp6;I)I", "Lcom/google/android/qq6;", "G", "()Lcom/google/android/qq6;", "value", "b", "Z", "x", "()Z", "hasLookaheadOccurred", "c", "Lcom/google/android/jq6;", "s", "()Lcom/google/android/jq6;", "approachLayoutInfo", "executeRequestsInHighPriorityMode", "Lcom/google/android/tq6;", "e", "Lcom/google/android/tq6;", "scrollPosition", "Lcom/google/android/o58;", "f", "Lcom/google/android/o58;", "layoutInfoState", "Lcom/google/android/r48;", "g", "Lcom/google/android/r48;", "y", "()Lcom/google/android/r48;", "internalInteractionSource", "h", "F", "J", "()F", "scrollToBeConsumed", "i", "Lcom/google/android/hab;", "scrollableState", "j", "I", "getNumMeasurePasses$foundation", "()I", "numMeasurePasses", "k", "getPrefetchingEnabled$foundation", "setPrefetchingEnabled$foundation", "(Z)V", "prefetchingEnabled", "Lcom/google/android/pea;", "l", "Lcom/google/android/pea;", "getRemeasurement$foundation", "()Lcom/google/android/pea;", "remeasurement", "Lcom/google/android/qea;", "m", "Lcom/google/android/qea;", "H", "()Lcom/google/android/qea;", "remeasurementModifier", "Lcom/google/android/bc0;", "n", "Lcom/google/android/bc0;", "t", "()Lcom/google/android/bc0;", "awaitLayoutModifier", "Landroidx/compose/foundation/lazy/layout/d;", "Lcom/google/android/kq6;", "o", "Landroidx/compose/foundation/lazy/layout/d;", "z", "()Landroidx/compose/foundation/lazy/layout/d;", "itemAnimator", "Lcom/google/android/us6;", "p", "Lcom/google/android/us6;", "u", "()Lcom/google/android/us6;", "beyondBoundsInfo", "Lcom/google/android/nu6;", "Lcom/google/android/nu6;", "()Lcom/google/android/nu6;", "getPrefetchState$foundation$annotations", "()V", "prefetchState", "Lcom/google/android/pq6;", "r", "Lcom/google/android/pq6;", "prefetchScope", "androidx/compose/foundation/lazy/grid/LazyGridState$b", "Landroidx/compose/foundation/lazy/grid/LazyGridState$b;", "_scrollIndicatorState", "Lcom/google/android/mu6;", "Lcom/google/android/mu6;", "D", "()Lcom/google/android/mu6;", "pinnedItems", "Lcom/google/android/gn8;", "E", "()Lcom/google/android/o58;", "placementScopeInvalidator", "v", "B", "measurementScopeInvalidator", "<set-?>", "w", "R", "canScrollForward", "Q", "canScrollBackward", "Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollDeltaBetweenPasses;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollDeltaBetweenPasses;", "_lazyLayoutScrollDeltaBetweenPasses", "A", "()Lcom/google/android/cq6;", "Lkotlin/ranges/IntRange;", "C", "()Lkotlin/ranges/IntRange;", "getNearestRange$foundation$delegate", "(Landroidx/compose/foundation/lazy/grid/LazyGridState;)Ljava/lang/Object;", "nearestRange", "isScrollInProgress", "scrollDeltaBetweenPasses", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LazyGridState implements hab {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final qq6 prefetchStrategy;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean hasLookaheadOccurred;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private jq6 approachLayoutInfo;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean executeRequestsInHighPriorityMode;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final tq6 scrollPosition;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final o58<jq6> layoutInfoState;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final r48 internalInteractionSource;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private float scrollToBeConsumed;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final hab scrollableState;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private int numMeasurePasses;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private boolean prefetchingEnabled;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private pea remeasurement;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final qea remeasurementModifier;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final bc0 awaitLayoutModifier;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final androidx.compose.p001foundation.lazy.layout.d<kq6> itemAnimator;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final us6 beyondBoundsInfo;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final nu6 prefetchState;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final pq6 prefetchScope;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final b _scrollIndicatorState;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final mu6 pinnedItems;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final o58<Unit> placementScopeInvalidator;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final o58<Unit> measurementScopeInvalidator;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final o58 canScrollForward;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final o58 canScrollBackward;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final LazyLayoutScrollDeltaBetweenPasses _lazyLayoutScrollDeltaBetweenPasses;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final k0b<LazyGridState, ?> A = k47.b(new Function2() { // from class: com.google.android.cr6
        public final Object invoke(Object obj, Object obj2) {
            return LazyGridState.k((o0b) obj, (LazyGridState) obj2);
        }
    }, new Function1() { // from class: com.google.android.dr6
        public final Object invoke(Object obj) {
            return LazyGridState.l((List) obj);
        }
    });

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridState$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridState$a;", "", "<init>", "()V", "Lcom/google/android/k0b;", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "Saver", "Lcom/google/android/k0b;", "a", "()Lcom/google/android/k0b;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k0b<LazyGridState, ?> a() {
            return LazyGridState.A;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/foundation/lazy/grid/LazyGridState$b", "", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        b() {
        }
    }

    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J3\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"androidx/compose/foundation/lazy/grid/LazyGridState$c", "Lcom/google/android/pq6;", "", "lineIndex", "", "Lcom/google/android/nu6$b;", "a", "(I)Ljava/util/List;", "Lkotlin/Function1;", "", "", "onPrefetchFinished", "c", "(ILkotlin/jvm/functions/Function1;)Ljava/util/List;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements pq6 {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d(List list, Ref.IntRef intRef, List list2, Function1 function1, int i, jq6 jq6Var, nu6.c cVar) {
            int iB = cVar.b();
            int iC = 0;
            for (int i2 = 0; i2 < iB; i2++) {
                iC += (int) (jq6Var.getOrientation() == Orientation.Vertical ? cVar.c(i2) & 4294967295L : cVar.c(i2) >> 32);
            }
            if (list != null) {
                list.add(Integer.valueOf(iC));
            }
            if (intRef.element != list2.size()) {
                intRef.element++;
            } else if (function1 != null && list != null) {
                function1.invoke(new oq6(i, list));
            }
            return Unit.a;
        }

        @Override // com.google.inputmethod.pq6
        public List<nu6.b> a(int lineIndex) {
            return c(lineIndex, null);
        }

        public List<nu6.b> c(final int lineIndex, final Function1<Object, Unit> onPrefetchFinished) {
            ArrayList arrayList = new ArrayList();
            final ArrayList arrayList2 = onPrefetchFinished == null ? null : new ArrayList();
            g.Companion companion = g.INSTANCE;
            LazyGridState lazyGridState = LazyGridState.this;
            g gVarD = companion.d();
            Function1<Object, Unit> function1G = gVarD != null ? gVarD.g() : null;
            g gVarE = companion.e(gVarD);
            try {
                final jq6 approachLayoutInfo = lazyGridState.getHasLookaheadOccurred() ? lazyGridState.getApproachLayoutInfo() : (jq6) lazyGridState.layoutInfoState.getValue();
                if (approachLayoutInfo != null) {
                    final Ref.IntRef intRef = new Ref.IntRef();
                    intRef.element = 1;
                    final List list = (List) approachLayoutInfo.u().invoke(Integer.valueOf(lineIndex));
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        Pair pair = (Pair) list.get(i);
                        arrayList.add(lazyGridState.getPrefetchState().i(((Number) pair.c()).intValue(), ((kx1) pair.d()).getValue(), lazyGridState.executeRequestsInHighPriorityMode, new Function1() { // from class: com.google.android.er6
                            public final Object invoke(Object obj) {
                                return LazyGridState.c.d(arrayList2, intRef, list, onPrefetchFinished, lineIndex, approachLayoutInfo, (nu6.c) obj);
                            }
                        }));
                    }
                    Unit unit = Unit.a;
                }
                return arrayList;
            } finally {
                companion.l(gVarD, gVarE, function1G);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/compose/foundation/lazy/grid/LazyGridState$d", "Lcom/google/android/qea;", "Lcom/google/android/pea;", "remeasurement", "", "q", "(Lcom/google/android/pea;)V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d implements qea {
        d() {
        }

        @Override // com.google.inputmethod.qea
        public void q(pea remeasurement) {
            LazyGridState.this.remeasurement = remeasurement;
        }
    }

    public LazyGridState() {
        this(0, 0, null, 7, null);
    }

    private final void K(float delta, cq6 layoutInfo) {
        if (this.prefetchingEnabled) {
            this.prefetchStrategy.c(this.prefetchScope, delta, layoutInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M(LazyGridState lazyGridState, int i, qe8 qe8Var) {
        qq6 qq6Var = lazyGridState.prefetchStrategy;
        g.Companion companion = g.INSTANCE;
        g gVarD = companion.d();
        companion.l(gVarD, companion.e(gVarD), gVarD != null ? gVarD.g() : null);
        qq6Var.a(qe8Var, i);
        return Unit.a;
    }

    public static /* synthetic */ Object O(LazyGridState lazyGridState, int i, int i2, q22 q22Var, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return lazyGridState.N(i, i2, q22Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float P(LazyGridState lazyGridState, float f) {
        return -lazyGridState.L(-f);
    }

    private void Q(boolean z) {
        this.canScrollBackward.setValue(Boolean.valueOf(z));
    }

    private void R(boolean z) {
        this.canScrollForward.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List k(o0b o0bVar, LazyGridState lazyGridState) {
        return m.s(new Integer[]{Integer.valueOf(lazyGridState.v()), Integer.valueOf(lazyGridState.w())});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyGridState l(List list) {
        return new LazyGridState(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
    }

    public static /* synthetic */ void r(LazyGridState lazyGridState, jq6 jq6Var, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z2 = false;
        }
        lazyGridState.q(jq6Var, z, z2);
    }

    public final cq6 A() {
        return this.layoutInfoState.getValue();
    }

    public final o58<Unit> B() {
        return this.measurementScopeInvalidator;
    }

    public final IntRange C() {
        return this.scrollPosition.getNearestRangeState().getValue();
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final mu6 getPinnedItems() {
        return this.pinnedItems;
    }

    public final o58<Unit> E() {
        return this.placementScopeInvalidator;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final nu6 getPrefetchState() {
        return this.prefetchState;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final qq6 getPrefetchStrategy() {
        return this.prefetchStrategy;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final qea getRemeasurementModifier() {
        return this.remeasurementModifier;
    }

    public final float I() {
        return this._lazyLayoutScrollDeltaBetweenPasses.b();
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final float getScrollToBeConsumed() {
        return this.scrollToBeConsumed;
    }

    public final float L(float distance) {
        jq6 jq6Var;
        if ((distance < 0.0f && !c()) || (distance > 0.0f && !f())) {
            return 0.0f;
        }
        if (!(Math.abs(this.scrollToBeConsumed) <= 0.5f)) {
            cx5.c("entered drag with non-zero pending scroll");
        }
        float f = this.scrollToBeConsumed + distance;
        this.scrollToBeConsumed = f;
        if (Math.abs(f) > 0.5f) {
            float f2 = this.scrollToBeConsumed;
            int iD = sh7.d(f2);
            jq6 jq6VarM = this.layoutInfoState.getValue().m(iD, !this.hasLookaheadOccurred);
            if (jq6VarM != null && (jq6Var = this.approachLayoutInfo) != null) {
                jq6 jq6VarM2 = jq6Var != null ? jq6Var.m(iD, true) : null;
                if (jq6VarM2 != null) {
                    this.approachLayoutInfo = jq6VarM2;
                } else {
                    jq6VarM = null;
                }
            }
            if (jq6VarM != null) {
                q(jq6VarM, this.hasLookaheadOccurred, true);
                gn8.d(this.placementScopeInvalidator);
                K(f2 - this.scrollToBeConsumed, jq6VarM);
            } else {
                pea peaVar = this.remeasurement;
                if (peaVar != null) {
                    peaVar.h();
                }
                K(f2 - this.scrollToBeConsumed, A());
            }
        }
        if (Math.abs(this.scrollToBeConsumed) <= 0.5f) {
            return distance;
        }
        float f3 = distance - this.scrollToBeConsumed;
        this.scrollToBeConsumed = 0.0f;
        return f3;
    }

    public final Object N(int i, int i2, q22<? super Unit> q22Var) {
        Object objE = hab.e(this, null, new LazyGridState$scrollToItem$2(this, i, i2, null), q22Var, 1, null);
        return objE == a.g() ? objE : Unit.a;
    }

    public final void S(int index, int scrollOffset, boolean forceRemeasure) {
        if (this.scrollPosition.a() != index || this.scrollPosition.c() != scrollOffset) {
            this.itemAnimator.p();
            Object obj = this.prefetchStrategy;
            h11 h11Var = obj instanceof h11 ? (h11) obj : null;
            if (h11Var != null) {
                h11Var.x();
            }
        }
        this.scrollPosition.d(index, scrollOffset);
        if (!forceRemeasure) {
            gn8.d(this.measurementScopeInvalidator);
            return;
        }
        pea peaVar = this.remeasurement;
        if (peaVar != null) {
            peaVar.h();
        }
    }

    public final int T(rp6 itemProvider, int firstItemIndex) {
        return this.scrollPosition.j(itemProvider, firstItemIndex);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
    
        if (r8.a(r6, r7, r0) == r1) goto L23;
     */
    @Override // com.google.inputmethod.hab
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(androidx.compose.p001foundation.MutatePriority r6, kotlin.jvm.functions.Function2<? super com.google.inputmethod.p9b, ? super com.google.android.q22<? super kotlin.Unit>, ? extends java.lang.Object> r7, com.google.android.q22<? super kotlin.Unit> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.compose.p001foundation.lazy.grid.LazyGridState$scroll$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1 r0 = (androidx.compose.p001foundation.lazy.grid.LazyGridState$scroll$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1 r0 = new androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.g()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r8)
            goto L6f
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.L$1
            r7 = r6
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            java.lang.Object r6 = r0.L$0
            androidx.compose.foundation.MutatePriority r6 = (androidx.compose.p001foundation.MutatePriority) r6
            kotlin.f.b(r8)
            goto L5f
        L41:
            kotlin.f.b(r8)
            com.google.android.o58<com.google.android.jq6> r8 = r5.layoutInfoState
            java.lang.Object r8 = r8.getValue()
            com.google.android.jq6 r2 = androidx.compose.p001foundation.lazy.grid.d.f()
            if (r8 != r2) goto L5f
            com.google.android.bc0 r8 = r5.awaitLayoutModifier
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r4
            java.lang.Object r8 = r8.A(r0)
            if (r8 != r1) goto L5f
            goto L6e
        L5f:
            com.google.android.hab r8 = r5.scrollableState
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r6 = r8.a(r6, r7, r0)
            if (r6 != r1) goto L6f
        L6e:
            return r1
        L6f:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p001foundation.lazy.grid.LazyGridState.a(androidx.compose.foundation.MutatePriority, kotlin.jvm.functions.Function2, com.google.android.q22):java.lang.Object");
    }

    @Override // com.google.inputmethod.hab
    public boolean b() {
        return this.scrollableState.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.inputmethod.hab
    public boolean c() {
        return ((Boolean) this.canScrollForward.getValue()).booleanValue();
    }

    @Override // com.google.inputmethod.hab
    public float d(float delta) {
        return this.scrollableState.d(delta);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.inputmethod.hab
    public boolean f() {
        return ((Boolean) this.canScrollBackward.getValue()).booleanValue();
    }

    public final void q(jq6 result, boolean isLookingAhead, boolean visibleItemsStayedTheSame) {
        mq6 mq6VarS;
        kq6[] items;
        kq6 kq6Var;
        this.prefetchState.j(result.h().size());
        if (isLookingAhead || !this.hasLookaheadOccurred) {
            if (isLookingAhead) {
                this.hasLookaheadOccurred = true;
            }
            this.scrollToBeConsumed -= result.getConsumedScroll();
            this.layoutInfoState.setValue(result);
            Q(result.n());
            R(result.getCanScrollForward());
            if (visibleItemsStayedTheSame) {
                this.scrollPosition.i(result.getFirstVisibleLineScrollOffset());
            } else {
                this.scrollPosition.h(result);
                if (this.prefetchingEnabled) {
                    this.prefetchStrategy.d(this.prefetchScope, result);
                }
            }
            if (isLookingAhead) {
                this._lazyLayoutScrollDeltaBetweenPasses.e(result.getScrollBackAmount(), result.getDensity(), result.getCoroutineScope());
            }
            this.numMeasurePasses++;
            return;
        }
        this.approachLayoutInfo = result;
        g.Companion companion = g.INSTANCE;
        g gVarD = companion.d();
        Function1<Object, Unit> function1G = gVarD != null ? gVarD.g() : null;
        g gVarE = companion.e(gVarD);
        try {
            if (this._lazyLayoutScrollDeltaBetweenPasses.c() && result.getFirstVisibleLineScrollOffset() == this.scrollPosition.c() && (mq6VarS = result.getFirstVisibleLine()) != null && (items = mq6VarS.getItems()) != null && (kq6Var = (kq6) f.p0(items)) != null && kq6Var.getIndex() == this.scrollPosition.a()) {
                this._lazyLayoutScrollDeltaBetweenPasses.d();
            }
            Unit unit = Unit.a;
        } finally {
            companion.l(gVarD, gVarE, function1G);
        }
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final jq6 getApproachLayoutInfo() {
        return this.approachLayoutInfo;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final bc0 getAwaitLayoutModifier() {
        return this.awaitLayoutModifier;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final us6 getBeyondBoundsInfo() {
        return this.beyondBoundsInfo;
    }

    public final int v() {
        return this.scrollPosition.a();
    }

    public final int w() {
        return this.scrollPosition.c();
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final boolean getHasLookaheadOccurred() {
        return this.hasLookaheadOccurred;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final r48 getInternalInteractionSource() {
        return this.internalInteractionSource;
    }

    public final androidx.compose.p001foundation.lazy.layout.d<kq6> z() {
        return this.itemAnimator;
    }

    public LazyGridState(final int i, int i2, qq6 qq6Var) {
        this.prefetchStrategy = qq6Var;
        tq6 tq6Var = new tq6(i, i2);
        this.scrollPosition = tq6Var;
        this.layoutInfoState = p0.i(androidx.compose.p001foundation.lazy.grid.d.a, p0.k());
        this.internalInteractionSource = k26.a();
        this.scrollableState = u.b(new Function1() { // from class: com.google.android.ar6
            public final Object invoke(Object obj) {
                return Float.valueOf(LazyGridState.P(this.a, ((Float) obj).floatValue()));
            }
        });
        this.prefetchingEnabled = true;
        this.remeasurementModifier = new d();
        this.awaitLayoutModifier = new bc0();
        this.itemAnimator = new androidx.compose.p001foundation.lazy.layout.d<>();
        this.beyondBoundsInfo = new us6();
        this.prefetchState = new nu6(qq6Var.b(), new Function1() { // from class: com.google.android.br6
            public final Object invoke(Object obj) {
                return LazyGridState.M(this.a, i, (qe8) obj);
            }
        });
        this.prefetchScope = new c();
        this._scrollIndicatorState = new b();
        this.pinnedItems = new mu6();
        tq6Var.getNearestRangeState();
        this.placementScopeInvalidator = gn8.c(null, 1, null);
        this.measurementScopeInvalidator = gn8.c(null, 1, null);
        Boolean bool = Boolean.FALSE;
        this.canScrollForward = s0.e(bool, null, 2, null);
        this.canScrollBackward = s0.e(bool, null, 2, null);
        this._lazyLayoutScrollDeltaBetweenPasses = new LazyLayoutScrollDeltaBetweenPasses();
    }

    public /* synthetic */ LazyGridState(int i, int i2, qq6 qq6Var, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? rq6.b(0, 1, null) : qq6Var);
    }

    public LazyGridState(int i, int i2) {
        this(i, i2, rq6.b(0, 1, null));
    }
}
