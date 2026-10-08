package androidx.compose.p001foundation.lazy;

import androidx.compose.p001foundation.gestures.Orientation;
import androidx.compose.p001foundation.gestures.u;
import androidx.compose.p001foundation.lazy.LazyListState;
import androidx.compose.p001foundation.lazy.layout.LazyLayoutScrollDeltaBetweenPasses;
import androidx.compose.p004runtime.p0;
import androidx.compose.p004runtime.s0;
import androidx.compose.p004runtime.snapshots.g;
import com.google.android.q22;
import com.google.android.rw0;
import com.google.inputmethod.aw6;
import com.google.inputmethod.bc0;
import com.google.inputmethod.cx5;
import com.google.inputmethod.dw6;
import com.google.inputmethod.f43;
import com.google.inputmethod.gn8;
import com.google.inputmethod.h11;
import com.google.inputmethod.hab;
import com.google.inputmethod.hv6;
import com.google.inputmethod.k0b;
import com.google.inputmethod.k26;
import com.google.inputmethod.k47;
import com.google.inputmethod.mu6;
import com.google.inputmethod.nu6;
import com.google.inputmethod.nv6;
import com.google.inputmethod.o0b;
import com.google.inputmethod.o58;
import com.google.inputmethod.pea;
import com.google.inputmethod.qe8;
import com.google.inputmethod.qea;
import com.google.inputmethod.r48;
import com.google.inputmethod.t04;
import com.google.inputmethod.uo;
import com.google.inputmethod.us6;
import com.google.inputmethod.uv6;
import com.google.inputmethod.vv6;
import com.google.inputmethod.xv6;
import com.google.inputmethod.yv6;
import com.google.inputmethod.zv6;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.m;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t*\u0002\u0091\u0001\b\u0007\u0018\u0000 P2\u00020\u0001:\u0001%B'\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001d\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0017\u001a\u00020\u000e2\b\b\u0001\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0019\u001a\u00020\u000e2\b\b\u0001\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\tJ'\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ<\u0010%\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001e2\"\u0010$\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\"\u0012\u0006\u0012\u0004\u0018\u00010#0 H\u0096@¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\n2\u0006\u0010)\u001a\u00020\nH\u0000¢\u0006\u0004\b*\u0010(J$\u0010+\u001a\u00020\u000e2\b\b\u0001\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b+\u0010\u0018J)\u0010/\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\u001a2\b\b\u0002\u0010.\u001a\u00020\u001aH\u0000¢\u0006\u0004\b/\u00100J\u001f\u00104\u001a\u00020\u00022\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u00020\u0002H\u0000¢\u0006\u0004\b4\u00105R\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u00106\u001a\u0004\b7\u00108R$\u0010>\u001a\u00020\u001a2\u0006\u00109\u001a\u00020\u001a8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R(\u0010C\u001a\u0004\u0018\u00010\u00112\b\u00109\u001a\u0004\u0018\u00010\u00118\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0016\u0010D\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010;R\u0014\u0010H\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00110I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u001a\u0010R\u001a\u00020M8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR$\u0010W\u001a\u00020\n2\u0006\u00109\u001a\u00020\n8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\"\u0010\\\u001a\u00020\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bX\u0010;\u001a\u0004\bY\u0010=\"\u0004\bZ\u0010[R\u0014\u0010_\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R$\u0010c\u001a\u00020\u00022\u0006\u00109\u001a\u00020\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b`\u00107\u001a\u0004\ba\u0010bR\"\u0010g\u001a\u00020\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bd\u0010;\u001a\u0004\be\u0010=\"\u0004\bf\u0010[R(\u0010m\u001a\u0004\u0018\u00010h2\b\u00109\u001a\u0004\u0018\u00010h8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR\u001a\u0010s\u001a\u00020n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010rR\u001a\u0010y\u001a\u00020t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bw\u0010xR!\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020{0z8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007fR\u001f\u0010\u0085\u0001\u001a\u00030\u0081\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b+\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R(\u0010\u008d\u0001\u001a\u00030\u0086\u00018\u0000X\u0080\u0004¢\u0006\u0018\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u0012\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0017\u0010\u0090\u0001\u001a\u00030\u008e\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b/\u0010\u008f\u0001R\u0018\u0010\u0094\u0001\u001a\u00030\u0091\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u001e\u0010\u0098\u0001\u001a\u00030\u0095\u00018\u0000X\u0080\u0004¢\u0006\u000e\n\u0005\bw\u0010\u0096\u0001\u001a\u0005\bT\u0010\u0097\u0001R\u001f\u0010\u009c\u0001\u001a\u00030\u0099\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b\u0083\u0001\u0010K\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R/\u0010 \u0001\u001a\u00020\u001a2\u0007\u0010\u009d\u0001\u001a\u00020\u001a8V@RX\u0096\u008e\u0002¢\u0006\u0014\n\u0005\b\u009e\u0001\u0010K\u001a\u0004\b?\u0010=\"\u0005\b\u009f\u0001\u0010[R/\u0010£\u0001\u001a\u00020\u001a2\u0007\u0010\u009d\u0001\u001a\u00020\u001a8V@RX\u0096\u008e\u0002¢\u0006\u0014\n\u0005\b¡\u0001\u0010K\u001a\u0004\bJ\u0010=\"\u0005\b¢\u0001\u0010[R\u001f\u0010¦\u0001\u001a\u00030\u0099\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b¤\u0001\u0010K\u001a\u0006\b¥\u0001\u0010\u009b\u0001R\u0017\u0010©\u0001\u001a\u00030§\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b<\u0010¨\u0001R\u0012\u0010\u0003\u001a\u00020\u00028G¢\u0006\u0007\u001a\u0005\b¡\u0001\u0010bR\u0012\u0010\u0004\u001a\u00020\u00028G¢\u0006\u0007\u001a\u0005\b¤\u0001\u0010bR\u0013\u0010\r\u001a\u00020\f8G¢\u0006\b\u001a\u0006\bª\u0001\u0010«\u0001R\u0018\u0010®\u0001\u001a\u00030¬\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u009e\u0001\u0010\u00ad\u0001R!\u0010´\u0001\u001a\u00030¯\u00018@X\u0080\u0084\u0002¢\u0006\u0010\u001a\u0006\b°\u0001\u0010±\u0001*\u0006\b²\u0001\u0010³\u0001R\u0015\u0010µ\u0001\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010=R\u0016\u0010·\u0001\u001a\u00020\n8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b¶\u0001\u0010V¨\u0006¸\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListState;", "Lcom/google/android/hab;", "", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "Lcom/google/android/zv6;", "prefetchStrategy", "<init>", "(IILcom/google/android/zv6;)V", "(II)V", "", "delta", "Lcom/google/android/nv6;", "layoutInfo", "", "N", "(FLcom/google/android/nv6;)V", "Lcom/google/android/uv6;", "measureResult", "X", "(Lcom/google/android/uv6;)V", "index", "scrollOffset", "R", "(IILcom/google/android/q22;)Ljava/lang/Object;", "Q", "", "forceRemeasure", "W", "(IIZ)V", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Lcom/google/android/p9b;", "Lcom/google/android/q22;", "", "block", "a", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lcom/google/android/q22;)Ljava/lang/Object;", "d", "(F)F", "distance", "O", "q", "result", "isLookingAhead", "visibleItemsStayedTheSame", "s", "(Lcom/google/android/uv6;ZZ)V", "Lcom/google/android/hv6;", "itemProvider", "firstItemIndex", "Y", "(Lcom/google/android/hv6;I)I", "Lcom/google/android/zv6;", "I", "()Lcom/google/android/zv6;", "value", "b", "Z", "z", "()Z", "hasLookaheadOccurred", "c", "Lcom/google/android/uv6;", "getApproachLayoutInfo$foundation", "()Lcom/google/android/uv6;", "approachLayoutInfo", "executeRequestsInHighPriorityMode", "Lcom/google/android/dw6;", "e", "Lcom/google/android/dw6;", "scrollPosition", "Lcom/google/android/o58;", "f", "Lcom/google/android/o58;", "layoutInfoState", "Lcom/google/android/r48;", "g", "Lcom/google/android/r48;", "A", "()Lcom/google/android/r48;", "internalInteractionSource", "h", "F", "L", "()F", "scrollToBeConsumed", "i", "M", "setSkipItemPlacementAnimation$foundation", "(Z)V", "skipItemPlacementAnimation", "j", "Lcom/google/android/hab;", "scrollableState", "k", "getNumMeasurePasses$foundation", "()I", "numMeasurePasses", "l", "getPrefetchingEnabled$foundation", "setPrefetchingEnabled$foundation", "prefetchingEnabled", "Lcom/google/android/pea;", "m", "Lcom/google/android/pea;", "getRemeasurement$foundation", "()Lcom/google/android/pea;", "remeasurement", "Lcom/google/android/qea;", "n", "Lcom/google/android/qea;", "J", "()Lcom/google/android/qea;", "remeasurementModifier", "Lcom/google/android/bc0;", "o", "Lcom/google/android/bc0;", "u", "()Lcom/google/android/bc0;", "awaitLayoutModifier", "Landroidx/compose/foundation/lazy/layout/d;", "Lcom/google/android/vv6;", "p", "Landroidx/compose/foundation/lazy/layout/d;", "B", "()Landroidx/compose/foundation/lazy/layout/d;", "itemAnimator", "Lcom/google/android/us6;", "Lcom/google/android/us6;", "v", "()Lcom/google/android/us6;", "beyondBoundsInfo", "Lcom/google/android/nu6;", "r", "Lcom/google/android/nu6;", "H", "()Lcom/google/android/nu6;", "getPrefetchState$foundation$annotations", "()V", "prefetchState", "Lcom/google/android/yv6;", "Lcom/google/android/yv6;", "prefetchScope", "androidx/compose/foundation/lazy/LazyListState$b", "t", "Landroidx/compose/foundation/lazy/LazyListState$b;", "_scrollIndicatorState", "Lcom/google/android/mu6;", "Lcom/google/android/mu6;", "()Lcom/google/android/mu6;", "pinnedItems", "Lcom/google/android/gn8;", "D", "()Lcom/google/android/o58;", "measurementScopeInvalidator", "<set-?>", "w", "V", "canScrollForward", "x", "U", "canScrollBackward", "y", "G", "placementScopeInvalidator", "Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollDeltaBetweenPasses;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollDeltaBetweenPasses;", "_lazyLayoutScrollDeltaBetweenPasses", "C", "()Lcom/google/android/nv6;", "Lcom/google/android/f43;", "()Lcom/google/android/f43;", "density", "Lkotlin/ranges/IntRange;", "E", "()Lkotlin/ranges/IntRange;", "getNearestRange$foundation$delegate", "(Landroidx/compose/foundation/lazy/LazyListState;)Ljava/lang/Object;", "nearestRange", "isScrollInProgress", "K", "scrollDeltaBetweenPasses", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LazyListState implements hab {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final k0b<LazyListState, ?> B = k47.b(new Function2() { // from class: com.google.android.gw6
        public final Object invoke(Object obj, Object obj2) {
            return LazyListState.k((o0b) obj, (LazyListState) obj2);
        }
    }, new Function1() { // from class: com.google.android.hw6
        public final Object invoke(Object obj) {
            return LazyListState.l((List) obj);
        }
    });

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final zv6 prefetchStrategy;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean hasLookaheadOccurred;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private uv6 approachLayoutInfo;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean executeRequestsInHighPriorityMode;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final dw6 scrollPosition;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final o58<uv6> layoutInfoState;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final r48 internalInteractionSource;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private float scrollToBeConsumed;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private boolean skipItemPlacementAnimation;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final hab scrollableState;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private int numMeasurePasses;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private boolean prefetchingEnabled;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private pea remeasurement;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final qea remeasurementModifier;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final bc0 awaitLayoutModifier;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final androidx.compose.p001foundation.lazy.layout.d<vv6> itemAnimator;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final us6 beyondBoundsInfo;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final nu6 prefetchState;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final yv6 prefetchScope;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final b _scrollIndicatorState;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final mu6 pinnedItems;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final o58<Unit> measurementScopeInvalidator;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final o58 canScrollForward;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final o58 canScrollBackward;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final o58<Unit> placementScopeInvalidator;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final LazyLayoutScrollDeltaBetweenPasses _lazyLayoutScrollDeltaBetweenPasses;

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyListState$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListState$a;", "", "<init>", "()V", "Lcom/google/android/k0b;", "Landroidx/compose/foundation/lazy/LazyListState;", "Saver", "Lcom/google/android/k0b;", "a", "()Lcom/google/android/k0b;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k0b<LazyListState, ?> a() {
            return LazyListState.B;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/foundation/lazy/LazyListState$b", "", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        b() {
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J-\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"androidx/compose/foundation/lazy/LazyListState$c", "Lcom/google/android/yv6;", "", "index", "Lkotlin/Function1;", "", "", "onPrefetchFinished", "Lcom/google/android/nu6$b;", "a", "(ILkotlin/jvm/functions/Function1;)Lcom/google/android/nu6$b;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements yv6 {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d(Function1 function1, int i, uv6 uv6Var, nu6.c cVar) {
            if (function1 != null) {
                int iB = cVar.b();
                int iC = 0;
                for (int i2 = 0; i2 < iB; i2++) {
                    iC += (int) (uv6Var.getOrientation() == Orientation.Vertical ? cVar.c(i2) & 4294967295L : cVar.c(i2) >> 32);
                }
                function1.invoke(new xv6(i, iC));
            }
            return Unit.a;
        }

        @Override // com.google.inputmethod.yv6
        public nu6.b a(final int index, final Function1<Object, Unit> onPrefetchFinished) {
            g.Companion companion = g.INSTANCE;
            LazyListState lazyListState = LazyListState.this;
            g gVarD = companion.d();
            Function1<Object, Unit> function1G = gVarD != null ? gVarD.g() : null;
            g gVarE = companion.e(gVarD);
            try {
                final uv6 uv6Var = (uv6) lazyListState.layoutInfoState.getValue();
                return LazyListState.this.getPrefetchState().i(index, uv6Var.getChildConstraints(), LazyListState.this.executeRequestsInHighPriorityMode, new Function1() { // from class: com.google.android.kw6
                    public final Object invoke(Object obj) {
                        return LazyListState.c.d(onPrefetchFinished, index, uv6Var, (nu6.c) obj);
                    }
                });
            } finally {
                companion.l(gVarD, gVarE, function1G);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/compose/foundation/lazy/LazyListState$d", "Lcom/google/android/qea;", "Lcom/google/android/pea;", "remeasurement", "", "q", "(Lcom/google/android/pea;)V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d implements qea {
        d() {
        }

        @Override // com.google.inputmethod.qea
        public void q(pea remeasurement) {
            LazyListState.this.remeasurement = remeasurement;
        }
    }

    public LazyListState() {
        this(0, 0, null, 7, null);
    }

    private final void N(float delta, nv6 layoutInfo) {
        if (this.prefetchingEnabled) {
            this.prefetchStrategy.c(this.prefetchScope, delta, layoutInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P(LazyListState lazyListState, int i, qe8 qe8Var) {
        zv6 zv6Var = lazyListState.prefetchStrategy;
        g.Companion companion = g.INSTANCE;
        g gVarD = companion.d();
        companion.l(gVarD, companion.e(gVarD), gVarD != null ? gVarD.g() : null);
        zv6Var.a(qe8Var, i);
        return Unit.a;
    }

    public static /* synthetic */ Object S(LazyListState lazyListState, int i, int i2, q22 q22Var, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return lazyListState.R(i, i2, q22Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float T(LazyListState lazyListState, float f) {
        return -lazyListState.O(-f);
    }

    private void U(boolean z) {
        this.canScrollBackward.setValue(Boolean.valueOf(z));
    }

    private void V(boolean z) {
        this.canScrollForward.setValue(Boolean.valueOf(z));
    }

    private final void X(uv6 measureResult) {
        vv6 vv6Var = (vv6) m.B0(measureResult.h());
        vv6 vv6Var2 = (vv6) m.N0(measureResult.h());
        uo.a("firstVisibleItem:index", vv6Var != null ? vv6Var.getIndex() : -1L);
        uo.a("lastVisibleItem:index", vv6Var2 != null ? vv6Var2.getIndex() : -1L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List k(o0b o0bVar, LazyListState lazyListState) {
        return m.s(new Integer[]{Integer.valueOf(lazyListState.x()), Integer.valueOf(lazyListState.y())});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyListState l(List list) {
        return new LazyListState(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
    }

    public static /* synthetic */ Object r(LazyListState lazyListState, int i, int i2, q22 q22Var, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return lazyListState.q(i, i2, q22Var);
    }

    public static /* synthetic */ void t(LazyListState lazyListState, uv6 uv6Var, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z2 = false;
        }
        lazyListState.s(uv6Var, z, z2);
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final r48 getInternalInteractionSource() {
        return this.internalInteractionSource;
    }

    public final androidx.compose.p001foundation.lazy.layout.d<vv6> B() {
        return this.itemAnimator;
    }

    public final nv6 C() {
        return this.layoutInfoState.getValue();
    }

    public final o58<Unit> D() {
        return this.measurementScopeInvalidator;
    }

    public final IntRange E() {
        return this.scrollPosition.getNearestRangeState().getValue();
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final mu6 getPinnedItems() {
        return this.pinnedItems;
    }

    public final o58<Unit> G() {
        return this.placementScopeInvalidator;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final nu6 getPrefetchState() {
        return this.prefetchState;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final zv6 getPrefetchStrategy() {
        return this.prefetchStrategy;
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final qea getRemeasurementModifier() {
        return this.remeasurementModifier;
    }

    public final float K() {
        return this._lazyLayoutScrollDeltaBetweenPasses.b();
    }

    /* JADX INFO: renamed from: L, reason: from getter */
    public final float getScrollToBeConsumed() {
        return this.scrollToBeConsumed;
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final boolean getSkipItemPlacementAnimation() {
        return this.skipItemPlacementAnimation;
    }

    public final float O(float distance) {
        uv6 uv6Var;
        if ((distance < 0.0f && !c()) || (distance > 0.0f && !f())) {
            return 0.0f;
        }
        if (!(Math.abs(this.scrollToBeConsumed) <= 0.5f)) {
            cx5.c("entered drag with non-zero pending scroll");
        }
        this.executeRequestsInHighPriorityMode = true;
        float f = this.scrollToBeConsumed + distance;
        this.scrollToBeConsumed = f;
        if (Math.abs(f) > 0.5f) {
            float f2 = this.scrollToBeConsumed;
            int iRound = Math.round(f2);
            uv6 uv6VarM = this.layoutInfoState.getValue().m(iRound, !this.hasLookaheadOccurred);
            if (uv6VarM != null && (uv6Var = this.approachLayoutInfo) != null) {
                uv6 uv6VarM2 = uv6Var != null ? uv6Var.m(iRound, true) : null;
                if (uv6VarM2 != null) {
                    this.approachLayoutInfo = uv6VarM2;
                } else {
                    uv6VarM = null;
                }
            }
            if (uv6VarM != null) {
                s(uv6VarM, this.hasLookaheadOccurred, true);
                gn8.d(this.placementScopeInvalidator);
                N(f2 - this.scrollToBeConsumed, uv6VarM);
            } else {
                pea peaVar = this.remeasurement;
                if (peaVar != null) {
                    peaVar.h();
                }
                N(f2 - this.scrollToBeConsumed, C());
            }
        }
        if (Math.abs(this.scrollToBeConsumed) <= 0.5f) {
            return distance;
        }
        float f3 = distance - this.scrollToBeConsumed;
        this.scrollToBeConsumed = 0.0f;
        return f3;
    }

    public final void Q(int index, int scrollOffset) {
        if (b()) {
            rw0.d(this.layoutInfoState.getValue().getCoroutineScope(), (CoroutineContext) null, (CoroutineStart) null, new LazyListState$requestScrollToItem$1(this, null), 3, (Object) null);
        }
        W(index, scrollOffset, false);
    }

    public final Object R(int i, int i2, q22<? super Unit> q22Var) {
        Object objE = hab.e(this, null, new LazyListState$scrollToItem$2(this, i, i2, null), q22Var, 1, null);
        return objE == a.g() ? objE : Unit.a;
    }

    public final void W(int index, int scrollOffset, boolean forceRemeasure) {
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

    public final int Y(hv6 itemProvider, int firstItemIndex) {
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
            boolean r0 = r8 instanceof androidx.compose.p001foundation.lazy.LazyListState$scroll$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.lazy.LazyListState$scroll$1 r0 = (androidx.compose.p001foundation.lazy.LazyListState$scroll$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.lazy.LazyListState$scroll$1 r0 = new androidx.compose.foundation.lazy.LazyListState$scroll$1
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
            com.google.android.o58<com.google.android.uv6> r8 = r5.layoutInfoState
            java.lang.Object r8 = r8.getValue()
            com.google.android.uv6 r2 = androidx.compose.p001foundation.lazy.d.b()
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p001foundation.lazy.LazyListState.a(androidx.compose.foundation.MutatePriority, kotlin.jvm.functions.Function2, com.google.android.q22):java.lang.Object");
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

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object q(int i, int i2, q22<? super Unit> q22Var) throws Throwable {
        LazyListState$animateScrollToItem$1 lazyListState$animateScrollToItem$1;
        LazyListState lazyListState;
        Throwable th;
        if (q22Var instanceof LazyListState$animateScrollToItem$1) {
            lazyListState$animateScrollToItem$1 = (LazyListState$animateScrollToItem$1) q22Var;
            int i3 = lazyListState$animateScrollToItem$1.label;
            if ((i3 & t04.INVALID_ID) != 0) {
                lazyListState$animateScrollToItem$1.label = i3 - t04.INVALID_ID;
            } else {
                lazyListState$animateScrollToItem$1 = new LazyListState$animateScrollToItem$1(this, q22Var);
            }
        } else {
            lazyListState$animateScrollToItem$1 = new LazyListState$animateScrollToItem$1(this, q22Var);
        }
        LazyListState$animateScrollToItem$1 lazyListState$animateScrollToItem$2 = lazyListState$animateScrollToItem$1;
        Object obj = lazyListState$animateScrollToItem$2.result;
        Object objG = a.g();
        int i4 = lazyListState$animateScrollToItem$2.label;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                f.b(obj);
                lazyListState = this;
                lazyListState.skipItemPlacementAnimation = false;
                return Unit.a;
            } catch (Throwable th2) {
                th = th2;
                lazyListState = this;
                lazyListState.skipItemPlacementAnimation = false;
                throw th;
            }
        }
        f.b(obj);
        try {
            this.skipItemPlacementAnimation = true;
            LazyListState$animateScrollToItem$2 lazyListState$animateScrollToItem$3 = new LazyListState$animateScrollToItem$2(this, i, i2, null);
            lazyListState$animateScrollToItem$2.label = 1;
            lazyListState = this;
            try {
                if (hab.e(lazyListState, null, lazyListState$animateScrollToItem$3, lazyListState$animateScrollToItem$2, 1, null) == objG) {
                    return objG;
                }
                lazyListState.skipItemPlacementAnimation = false;
                return Unit.a;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                lazyListState.skipItemPlacementAnimation = false;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            lazyListState = this;
        }
    }

    public final void s(uv6 result, boolean isLookingAhead, boolean visibleItemsStayedTheSame) {
        vv6 firstVisibleItem;
        this.prefetchState.j(result.h().size());
        if (!isLookingAhead && this.hasLookaheadOccurred) {
            this.approachLayoutInfo = result;
            g.Companion companion = g.INSTANCE;
            g gVarD = companion.d();
            Function1<Object, Unit> function1G = gVarD != null ? gVarD.g() : null;
            g gVarE = companion.e(gVarD);
            try {
                if (this._lazyLayoutScrollDeltaBetweenPasses.c() && (firstVisibleItem = result.getFirstVisibleItem()) != null && firstVisibleItem.getIndex() == this.scrollPosition.a() && result.getFirstVisibleItemScrollOffset() == this.scrollPosition.c()) {
                    this._lazyLayoutScrollDeltaBetweenPasses.d();
                }
                Unit unit = Unit.a;
                return;
            } finally {
                companion.l(gVarD, gVarE, function1G);
            }
        }
        if (isLookingAhead) {
            this.hasLookaheadOccurred = true;
        }
        U(result.n());
        V(result.getCanScrollForward());
        this.scrollToBeConsumed -= result.getConsumedScroll();
        this.layoutInfoState.setValue(result);
        if (visibleItemsStayedTheSame) {
            this.scrollPosition.i(result.getFirstVisibleItemScrollOffset());
        } else {
            X(result);
            this.scrollPosition.h(result);
            if (this.prefetchingEnabled) {
                this.prefetchStrategy.d(this.prefetchScope, result);
            }
        }
        if (isLookingAhead) {
            this._lazyLayoutScrollDeltaBetweenPasses.e(result.getScrollBackAmount(), result.getDensity(), result.getCoroutineScope());
        }
        this.numMeasurePasses++;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final bc0 getAwaitLayoutModifier() {
        return this.awaitLayoutModifier;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final us6 getBeyondBoundsInfo() {
        return this.beyondBoundsInfo;
    }

    public final f43 w() {
        return this.layoutInfoState.getValue().getDensity();
    }

    public final int x() {
        return this.scrollPosition.a();
    }

    public final int y() {
        return this.scrollPosition.c();
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final boolean getHasLookaheadOccurred() {
        return this.hasLookaheadOccurred;
    }

    public LazyListState(final int i, int i2, zv6 zv6Var) {
        this.prefetchStrategy = zv6Var;
        dw6 dw6Var = new dw6(i, i2);
        this.scrollPosition = dw6Var;
        this.layoutInfoState = p0.i(androidx.compose.p001foundation.lazy.d.a, p0.k());
        this.internalInteractionSource = k26.a();
        this.scrollableState = u.b(new Function1() { // from class: com.google.android.iw6
            public final Object invoke(Object obj) {
                return Float.valueOf(LazyListState.T(this.a, ((Float) obj).floatValue()));
            }
        });
        this.prefetchingEnabled = true;
        this.remeasurementModifier = new d();
        this.awaitLayoutModifier = new bc0();
        this.itemAnimator = new androidx.compose.p001foundation.lazy.layout.d<>();
        this.beyondBoundsInfo = new us6();
        this.prefetchState = new nu6(zv6Var.b(), new Function1() { // from class: com.google.android.jw6
            public final Object invoke(Object obj) {
                return LazyListState.P(this.a, i, (qe8) obj);
            }
        });
        this.prefetchScope = new c();
        this._scrollIndicatorState = new b();
        this.pinnedItems = new mu6();
        dw6Var.getNearestRangeState();
        this.measurementScopeInvalidator = gn8.c(null, 1, null);
        Boolean bool = Boolean.FALSE;
        this.canScrollForward = s0.e(bool, null, 2, null);
        this.canScrollBackward = s0.e(bool, null, 2, null);
        this.placementScopeInvalidator = gn8.c(null, 1, null);
        this._lazyLayoutScrollDeltaBetweenPasses = new LazyLayoutScrollDeltaBetweenPasses();
    }

    public /* synthetic */ LazyListState(int i, int i2, zv6 zv6Var, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? aw6.b(0, 1, null) : zv6Var);
    }

    public LazyListState(int i, int i2) {
        this(i, i2, aw6.b(0, 1, null));
    }
}
