package androidx.compose.p001foundation.lazy.staggeredgrid;

import androidx.compose.p001foundation.gestures.Orientation;
import androidx.compose.p001foundation.gestures.u;
import androidx.compose.p001foundation.lazy.layout.LazyLayoutScrollDeltaBetweenPasses;
import androidx.compose.p001foundation.lazy.layout.d;
import androidx.compose.p001foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import androidx.compose.p004runtime.p0;
import androidx.compose.p004runtime.s0;
import androidx.compose.p004runtime.snapshots.g;
import com.google.android.q22;
import com.google.android.sh7;
import com.google.inputmethod.az6;
import com.google.inputmethod.bc0;
import com.google.inputmethod.by6;
import com.google.inputmethod.cx5;
import com.google.inputmethod.f16;
import com.google.inputmethod.fl9;
import com.google.inputmethod.g16;
import com.google.inputmethod.gn8;
import com.google.inputmethod.hab;
import com.google.inputmethod.jy6;
import com.google.inputmethod.k0b;
import com.google.inputmethod.k26;
import com.google.inputmethod.k47;
import com.google.inputmethod.kx1;
import com.google.inputmethod.ky6;
import com.google.inputmethod.lt6;
import com.google.inputmethod.mu6;
import com.google.inputmethod.nu6;
import com.google.inputmethod.o0b;
import com.google.inputmethod.o16;
import com.google.inputmethod.o48;
import com.google.inputmethod.o58;
import com.google.inputmethod.p16;
import com.google.inputmethod.p48;
import com.google.inputmethod.pea;
import com.google.inputmethod.qea;
import com.google.inputmethod.r48;
import com.google.inputmethod.sy6;
import com.google.inputmethod.us6;
import com.google.inputmethod.uy6;
import com.google.inputmethod.vy6;
import com.google.inputmethod.xy6;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.f;
import kotlin.collections.m;
import kotlin.coroutines.intrinsics.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000÷\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n*\u0001S\b\u0007\u0018\u0000 ¢\u00012\u00020\u0001:\u0001-B#\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001d\b\u0016\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\fJ\u0017\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\tH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\r2\u0006\u0010#\u001a\u00020\"H\u0000¢\u0006\u0004\b$\u0010%J<\u0010-\u001a\u00020\u00142\u0006\u0010'\u001a\u00020&2\"\u0010,\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020)\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140*\u0012\u0006\u0012\u0004\u0018\u00010+0(H\u0096@¢\u0006\u0004\b-\u0010.J\"\u00101\u001a\u00020\u00142\u0006\u0010/\u001a\u00020\t2\b\b\u0002\u00100\u001a\u00020\tH\u0086@¢\u0006\u0004\b1\u00102J'\u00104\u001a\u00020\u00142\u0006\u0010/\u001a\u00020\t2\u0006\u00100\u001a\u00020\t2\u0006\u00103\u001a\u00020\"H\u0000¢\u0006\u0004\b4\u00105J\u001f\u00109\u001a\u00020\u00022\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u00020\u0002H\u0000¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b;\u0010\u0010J)\u0010>\u001a\u00020\u00142\u0006\u0010<\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\"2\b\b\u0002\u0010=\u001a\u00020\"H\u0000¢\u0006\u0004\b>\u0010?R$\u0010D\u001a\u00020\"2\u0006\u0010@\u001a\u00020\"8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b-\u0010A\u001a\u0004\bB\u0010CR(\u0010I\u001a\u0004\u0018\u00010\u00122\b\u0010@\u001a\u0004\u0018\u00010\u00128\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u001a\u0010O\u001a\u00020J8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00120P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010QR\u0014\u0010V\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u001a\u0010\\\u001a\u00020W8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R+\u0010a\u001a\u00020\"2\u0006\u0010]\u001a\u00020\"8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b^\u0010Q\u001a\u0004\bK\u0010C\"\u0004\b_\u0010`R+\u0010d\u001a\u00020\"2\u0006\u0010]\u001a\u00020\"8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bb\u0010Q\u001a\u0004\bX\u0010C\"\u0004\bc\u0010`R(\u0010j\u001a\u0004\u0018\u00010e2\b\u0010@\u001a\u0004\u0018\u00010e8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR\u001a\u0010p\u001a\u00020k8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bn\u0010oR\u001a\u0010v\u001a\u00020q8\u0000X\u0080\u0004¢\u0006\f\n\u0004\br\u0010s\u001a\u0004\bt\u0010uR\u001a\u0010|\u001a\u00020w8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{R#\u0010\u0080\u0001\u001a\u00020\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b}\u0010A\u001a\u0004\b~\u0010C\"\u0004\b\u007f\u0010`R \u0010\u0086\u0001\u001a\u00030\u0081\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0016\u0010\u0088\u0001\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b>\u0010\u0087\u0001R\u0019\u0010\u008b\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R'\u0010\u0090\u0001\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0004\b\u001c\u0010n\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0017\u0010\u0091\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010nR\u001e\u0010\u0095\u0001\u001a\n\u0012\u0005\u0012\u00030\u0093\u00010\u0092\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b \u0010\u0094\u0001R\u001f\u0010\u009a\u0001\u001a\u00030\u0096\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\bG\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R\u001f\u0010\u009e\u0001\u001a\u00030\u009b\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\bt\u0010\u009c\u0001\u001a\u0006\b\u008a\u0001\u0010\u009d\u0001R&\u0010¤\u0001\u001a\n\u0012\u0005\u0012\u00030 \u00010\u009f\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\bz\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001R\u001f\u0010©\u0001\u001a\u00030¥\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b¦\u0001\u0010Q\u001a\u0006\b§\u0001\u0010¨\u0001R\u001f\u0010¬\u0001\u001a\u00030¥\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\bª\u0001\u0010Q\u001a\u0006\b«\u0001\u0010¨\u0001R\u0017\u0010¯\u0001\u001a\u00030\u00ad\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bB\u0010®\u0001R\u0014\u0010°\u0001\u001a\u00020\t8F¢\u0006\b\u001a\u0006\b¦\u0001\u0010\u008d\u0001R\u0014\u0010±\u0001\u001a\u00020\t8F¢\u0006\b\u001a\u0006\bª\u0001\u0010\u008d\u0001R\u0014\u0010´\u0001\u001a\u00020\u001b8F¢\u0006\b\u001a\u0006\b²\u0001\u0010³\u0001R!\u0010º\u0001\u001a\u00030µ\u00018@X\u0080\u0084\u0002¢\u0006\u0010\u001a\u0006\b¶\u0001\u0010·\u0001*\u0006\b¸\u0001\u0010¹\u0001R\u0015\u0010»\u0001\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010CR\u0017\u0010¾\u0001\u001a\u00020\r8@X\u0080\u0004¢\u0006\b\u001a\u0006\b¼\u0001\u0010½\u0001¨\u0006¿\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "Lcom/google/android/hab;", "", "initialFirstVisibleItems", "initialFirstVisibleOffsets", "Lcom/google/android/fl9;", "prefetchScheduler", "<init>", "([I[ILcom/google/android/fl9;)V", "", "initialFirstVisibleItemIndex", "initialFirstVisibleItemOffset", "(II)V", "", "distance", "N", "(F)F", "delta", "Lcom/google/android/sy6;", "info", "", "L", "(FLcom/google/android/sy6;)V", "Lcom/google/android/o16;", "prefetchHandlesUsed", "r", "(Lcom/google/android/o16;)V", "Lcom/google/android/ky6;", "q", "(Lcom/google/android/ky6;)V", "itemIndex", "laneCount", "s", "(II)[I", "", "isLookingAhead", "O", "(Z)F", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Lcom/google/android/p9b;", "Lcom/google/android/q22;", "", "block", "a", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lcom/google/android/q22;)Ljava/lang/Object;", "index", "scrollOffset", "P", "(IILcom/google/android/q22;)Ljava/lang/Object;", "forceRemeasure", "U", "(IIZ)V", "Lcom/google/android/lt6;", "itemProvider", "firstItemIndex", "V", "(Lcom/google/android/lt6;[I)[I", "d", "result", "visibleItemsStayedTheSame", "o", "(Lcom/google/android/sy6;ZZ)V", "value", "Z", "y", "()Z", "hasLookaheadOccurred", "b", "Lcom/google/android/sy6;", "t", "()Lcom/google/android/sy6;", "approachLayoutInfo", "Lcom/google/android/xy6;", "c", "Lcom/google/android/xy6;", "K", "()Lcom/google/android/xy6;", "scrollPosition", "Lcom/google/android/o58;", "Lcom/google/android/o58;", "layoutInfoState", "androidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$b", "e", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$b;", "_scrollIndicatorState", "Lcom/google/android/jy6;", "f", "Lcom/google/android/jy6;", "A", "()Lcom/google/android/jy6;", "laneInfo", "<set-?>", "g", "T", "(Z)V", "canScrollForward", "h", "S", "canScrollBackward", "Lcom/google/android/pea;", "i", "Lcom/google/android/pea;", "getRemeasurement$foundation", "()Lcom/google/android/pea;", "remeasurement", "Lcom/google/android/qea;", "j", "Lcom/google/android/qea;", "I", "()Lcom/google/android/qea;", "remeasurementModifier", "Lcom/google/android/bc0;", "k", "Lcom/google/android/bc0;", "u", "()Lcom/google/android/bc0;", "awaitLayoutModifier", "Lcom/google/android/us6;", "l", "Lcom/google/android/us6;", "v", "()Lcom/google/android/us6;", "beyondBoundsInfo", "m", "getPrefetchingEnabled$foundation", "setPrefetchingEnabled$foundation", "prefetchingEnabled", "Lcom/google/android/nu6;", "n", "Lcom/google/android/nu6;", "H", "()Lcom/google/android/nu6;", "prefetchState", "Lcom/google/android/hab;", "scrollableState", "p", "F", "scrollToBeConsumed", "getMeasurePassCount$foundation", "()I", "setMeasurePassCount$foundation", "(I)V", "measurePassCount", "prefetchBaseIndex", "Lcom/google/android/o48;", "Lcom/google/android/nu6$b;", "Lcom/google/android/o48;", "currentItemPrefetchHandles", "Lcom/google/android/r48;", "Lcom/google/android/r48;", "D", "()Lcom/google/android/r48;", "mutableInteractionSource", "Lcom/google/android/mu6;", "Lcom/google/android/mu6;", "()Lcom/google/android/mu6;", "pinnedItems", "Landroidx/compose/foundation/lazy/layout/d;", "Lcom/google/android/vy6;", "Landroidx/compose/foundation/lazy/layout/d;", "z", "()Landroidx/compose/foundation/lazy/layout/d;", "itemAnimator", "Lcom/google/android/gn8;", "w", "G", "()Lcom/google/android/o58;", "placementScopeInvalidator", "x", "C", "measurementScopeInvalidator", "Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollDeltaBetweenPasses;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollDeltaBetweenPasses;", "_lazyLayoutScrollDeltaBetweenPasses", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "B", "()Lcom/google/android/ky6;", "layoutInfo", "Lkotlin/ranges/IntRange;", "E", "()Lkotlin/ranges/IntRange;", "getNearestRange$foundation$delegate", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;)Ljava/lang/Object;", "nearestRange", "isScrollInProgress", "J", "()F", "scrollDeltaBetweenPasses", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LazyStaggeredGridState implements hab {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean hasLookaheadOccurred;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private sy6 approachLayoutInfo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final xy6 scrollPosition;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final o58<sy6> layoutInfoState;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final b _scrollIndicatorState;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final jy6 laneInfo;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final o58 canScrollForward;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final o58 canScrollBackward;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private pea remeasurement;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final qea remeasurementModifier;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final bc0 awaitLayoutModifier;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final us6 beyondBoundsInfo;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private boolean prefetchingEnabled;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final nu6 prefetchState;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final hab scrollableState;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private float scrollToBeConsumed;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private int measurePassCount;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private int prefetchBaseIndex;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final o48<nu6.b> currentItemPrefetchHandles;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final r48 mutableInteractionSource;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final mu6 pinnedItems;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final d<vy6> itemAnimator;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final o58<Unit> placementScopeInvalidator;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final o58<Unit> measurementScopeInvalidator;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final LazyLayoutScrollDeltaBetweenPasses _lazyLayoutScrollDeltaBetweenPasses;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final k0b<LazyStaggeredGridState, Object> A = k47.b(new Function2() { // from class: com.google.android.cz6
        public final Object invoke(Object obj, Object obj2) {
            return LazyStaggeredGridState.j((o0b) obj, (LazyStaggeredGridState) obj2);
        }
    }, new Function1() { // from class: com.google.android.dz6
        public final Object invoke(Object obj) {
            return LazyStaggeredGridState.k((List) obj);
        }
    });

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$a;", "", "<init>", "()V", "Lcom/google/android/k0b;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "Saver", "Lcom/google/android/k0b;", "a", "()Lcom/google/android/k0b;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k0b<LazyStaggeredGridState, Object> a() {
            return LazyStaggeredGridState.A;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$b", "", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$c", "Lcom/google/android/qea;", "Lcom/google/android/pea;", "remeasurement", "", "q", "(Lcom/google/android/pea;)V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements qea {
        c() {
        }

        @Override // com.google.inputmethod.qea
        public void q(pea remeasurement) {
            LazyStaggeredGridState.this.remeasurement = remeasurement;
        }
    }

    public LazyStaggeredGridState(int[] iArr, int[] iArr2, fl9 fl9Var) {
        xy6 xy6Var = new xy6(iArr, iArr2, new LazyStaggeredGridState$scrollPosition$1(this));
        this.scrollPosition = xy6Var;
        this.layoutInfoState = p0.i(uy6.d(), p0.k());
        this._scrollIndicatorState = new b();
        this.laneInfo = new jy6();
        Boolean bool = Boolean.FALSE;
        this.canScrollForward = s0.e(bool, null, 2, null);
        this.canScrollBackward = s0.e(bool, null, 2, null);
        this.remeasurementModifier = new c();
        this.awaitLayoutModifier = new bc0();
        this.beyondBoundsInfo = new us6();
        this.prefetchingEnabled = true;
        this.prefetchState = new nu6(fl9Var, null, 2, null);
        this.scrollableState = u.b(new Function1() { // from class: com.google.android.ez6
            public final Object invoke(Object obj) {
                return Float.valueOf(LazyStaggeredGridState.R(this.a, ((Float) obj).floatValue()));
            }
        });
        this.prefetchBaseIndex = -1;
        this.currentItemPrefetchHandles = f16.c();
        this.mutableInteractionSource = k26.a();
        this.pinnedItems = new mu6();
        this.itemAnimator = new d<>();
        xy6Var.getNearestRangeState();
        this.placementScopeInvalidator = gn8.c(null, 1, null);
        this.measurementScopeInvalidator = gn8.c(null, 1, null);
        this._lazyLayoutScrollDeltaBetweenPasses = new LazyLayoutScrollDeltaBetweenPasses();
    }

    private final void L(float delta, sy6 info) {
        int i;
        if (!this.prefetchingEnabled || info.h().isEmpty()) {
            return;
        }
        boolean z = delta < 0.0f;
        int index = z ? ((vy6) m.L0(info.h())).getIndex() : ((vy6) m.z0(info.h())).getIndex();
        if (index == this.prefetchBaseIndex) {
            return;
        }
        this.prefetchBaseIndex = index;
        p48 p48VarB = p16.b();
        az6 slots = info.getSlots();
        int length = slots.getSizes().length;
        int i2 = 0;
        while (i2 < length) {
            int iE = z ? this.laneInfo.e(index, i2) : this.laneInfo.f(index, i2);
            if (iE < 0 || iE >= info.getTotalItemsCount() || p48VarB.a(iE)) {
                break;
            }
            p48VarB.r(iE);
            if (!this.currentItemPrefetchHandles.a(iE)) {
                boolean zA = info.getSpanProvider().a(iE);
                int i3 = zA ? 0 : i2;
                int i4 = zA ? length : 1;
                if (i4 == 1) {
                    i = slots.getSizes()[i3];
                } else {
                    int i5 = slots.getPositions()[i3];
                    int i6 = (i3 + i4) - 1;
                    i = (slots.getPositions()[i6] + slots.getSizes()[i6]) - i5;
                }
                this.currentItemPrefetchHandles.r(iE, nu6.h(this.prefetchState, iE, info.getOrientation() == Orientation.Vertical ? kx1.INSTANCE.e(i) : kx1.INSTANCE.d(i), null, 4, null));
            }
            i2++;
            index = iE;
        }
        r(p48VarB);
    }

    static /* synthetic */ void M(LazyStaggeredGridState lazyStaggeredGridState, float f, sy6 sy6Var, int i, Object obj) {
        if ((i & 2) != 0) {
            sy6Var = lazyStaggeredGridState.layoutInfoState.getValue();
        }
        lazyStaggeredGridState.L(f, sy6Var);
    }

    private final float N(float distance) {
        sy6 sy6Var;
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
            sy6 sy6VarG = this.layoutInfoState.getValue().g(iD, !this.hasLookaheadOccurred);
            if (sy6VarG != null && (sy6Var = this.approachLayoutInfo) != null) {
                sy6 sy6VarG2 = sy6Var != null ? sy6Var.g(iD, true) : null;
                if (sy6VarG2 != null) {
                    this.approachLayoutInfo = sy6VarG2;
                } else {
                    sy6VarG = null;
                }
            }
            if (sy6VarG != null) {
                o(sy6VarG, this.hasLookaheadOccurred, true);
                gn8.d(this.placementScopeInvalidator);
                L(f2 - this.scrollToBeConsumed, sy6VarG);
            } else {
                pea peaVar = this.remeasurement;
                if (peaVar != null) {
                    peaVar.h();
                }
                M(this, f2 - this.scrollToBeConsumed, null, 2, null);
            }
        }
        if (Math.abs(this.scrollToBeConsumed) <= 0.5f) {
            return distance;
        }
        float f3 = distance - this.scrollToBeConsumed;
        this.scrollToBeConsumed = 0.0f;
        return f3;
    }

    public static /* synthetic */ Object Q(LazyStaggeredGridState lazyStaggeredGridState, int i, int i2, q22 q22Var, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return lazyStaggeredGridState.P(i, i2, q22Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float R(LazyStaggeredGridState lazyStaggeredGridState, float f) {
        return -lazyStaggeredGridState.N(-f);
    }

    private void S(boolean z) {
        this.canScrollBackward.setValue(Boolean.valueOf(z));
    }

    private void T(boolean z) {
        this.canScrollForward.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List j(o0b o0bVar, LazyStaggeredGridState lazyStaggeredGridState) {
        return m.s(new int[][]{lazyStaggeredGridState.scrollPosition.getIndices(), lazyStaggeredGridState.scrollPosition.getScrollOffsets()});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyStaggeredGridState k(List list) {
        return new LazyStaggeredGridState((int[]) list.get(0), (int[]) list.get(1), null);
    }

    public static /* synthetic */ void p(LazyStaggeredGridState lazyStaggeredGridState, sy6 sy6Var, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z2 = false;
        }
        lazyStaggeredGridState.o(sy6Var, z, z2);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0070 A[LOOP:0: B:13:0x0039->B:23:0x0070, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x0073 A[EDGE_INSN: B:27:0x0073->B:24:0x0073 BREAK  A[LOOP:0: B:13:0x0039->B:23:0x0070], SYNTHETIC] */
    private final void q(ky6 info) {
        List<by6> listH = info.h();
        if (this.prefetchBaseIndex == -1 || listH.isEmpty()) {
            return;
        }
        int index = ((by6) m.z0(listH)).getIndex();
        int index2 = ((by6) m.L0(listH)).getIndex();
        int i = this.prefetchBaseIndex;
        if (index > i || i > index2) {
            this.prefetchBaseIndex = -1;
            o48<nu6.b> o48Var = this.currentItemPrefetchHandles;
            Object[] objArr = o48Var.values;
            long[] jArr = o48Var.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i2 != length) {
                            break;
                            break;
                        }
                        i2++;
                    } else {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j) < 128) {
                                ((nu6.b) objArr[(i2 << 3) + i4]).cancel();
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        } else if (i2 != length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
            this.currentItemPrefetchHandles.g();
        }
    }

    private final void r(o16 prefetchHandlesUsed) {
        o48<nu6.b> o48Var = this.currentItemPrefetchHandles;
        long[] jArr = o48Var.metadata;
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
                        int i5 = o48Var.keys[i4];
                        nu6.b bVar = (nu6.b) o48Var.values[i4];
                        boolean zA = prefetchHandlesUsed.a(i5);
                        if (!zA) {
                            bVar.cancel();
                        }
                        if (!zA) {
                            o48Var.p(i4);
                        }
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

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] s(int itemIndex, int laneCount) {
        int[] iArr = new int[laneCount];
        if (this.layoutInfoState.getValue().getSpanProvider().a(itemIndex)) {
            f.E(iArr, itemIndex, 0, 0, 6, (Object) null);
            return iArr;
        }
        this.laneInfo.d(itemIndex + laneCount);
        int iH = this.laneInfo.h(itemIndex);
        int iMin = 0;
        if (iH != -2 && iH != -1) {
            if ((iH >= 0 ? 1 : 0) == 0) {
                cx5.a("Expected positive lane number, got " + iH + " instead.");
            }
            iMin = Math.min(iH, laneCount);
        }
        int i = iMin;
        int iF = itemIndex;
        for (int i2 = i - 1; -1 < i2; i2--) {
            iF = this.laneInfo.f(iF, i2);
            iArr[i2] = iF;
            if (iF == -1) {
                f.E(iArr, -1, 0, i2, 2, (Object) null);
                break;
            }
        }
        iArr[i] = itemIndex;
        for (int i3 = i + 1; i3 < laneCount; i3++) {
            itemIndex = this.laneInfo.e(itemIndex, i3);
            iArr[i3] = itemIndex;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final jy6 getLaneInfo() {
        return this.laneInfo;
    }

    public final ky6 B() {
        return this.layoutInfoState.getValue();
    }

    public final o58<Unit> C() {
        return this.measurementScopeInvalidator;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final r48 getMutableInteractionSource() {
        return this.mutableInteractionSource;
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
    public final qea getRemeasurementModifier() {
        return this.remeasurementModifier;
    }

    public final float J() {
        return this._lazyLayoutScrollDeltaBetweenPasses.b();
    }

    /* JADX INFO: renamed from: K, reason: from getter */
    public final xy6 getScrollPosition() {
        return this.scrollPosition;
    }

    public final float O(boolean isLookingAhead) {
        return (isLookingAhead || !this.hasLookaheadOccurred) ? this.scrollToBeConsumed : J();
    }

    public final Object P(int i, int i2, q22<? super Unit> q22Var) {
        Object objE = hab.e(this, null, new LazyStaggeredGridState$scrollToItem$2(this, i, i2, null), q22Var, 1, null);
        return objE == a.g() ? objE : Unit.a;
    }

    public final void U(int index, int scrollOffset, boolean forceRemeasure) {
        boolean z = (this.scrollPosition.c() == index && this.scrollPosition.f() == scrollOffset) ? false : true;
        if (z) {
            this.itemAnimator.p();
        }
        sy6 value = this.layoutInfoState.getValue();
        by6 by6VarB = uy6.b(value, index);
        if (by6VarB == null || !z) {
            this.scrollPosition.h(index, scrollOffset);
        } else {
            int iL = (value.getOrientation() == Orientation.Vertical ? g16.l(by6VarB.getOffset()) : g16.k(by6VarB.getOffset())) + scrollOffset;
            int length = value.getFirstVisibleItemScrollOffsets().length;
            int[] iArr = new int[length];
            for (int i = 0; i < length; i++) {
                iArr[i] = value.getFirstVisibleItemScrollOffsets()[i] + iL;
            }
            this.scrollPosition.m(iArr);
        }
        if (!forceRemeasure) {
            gn8.d(this.measurementScopeInvalidator);
            return;
        }
        pea peaVar = this.remeasurement;
        if (peaVar != null) {
            peaVar.h();
        }
    }

    public final int[] V(lt6 itemProvider, int[] firstItemIndex) {
        return this.scrollPosition.n(itemProvider, firstItemIndex);
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
            boolean r0 = r8 instanceof androidx.compose.p001foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1 r0 = (androidx.compose.p001foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1 r0 = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1
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
            com.google.android.o58<com.google.android.sy6> r8 = r5.layoutInfoState
            java.lang.Object r8 = r8.getValue()
            com.google.android.sy6 r2 = com.google.inputmethod.uy6.d()
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p001foundation.lazy.staggeredgrid.LazyStaggeredGridState.a(androidx.compose.foundation.MutatePriority, kotlin.jvm.functions.Function2, com.google.android.q22):java.lang.Object");
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

    public final void o(sy6 result, boolean isLookingAhead, boolean visibleItemsStayedTheSame) {
        if (!isLookingAhead && this.hasLookaheadOccurred) {
            this.approachLayoutInfo = result;
            g.Companion companion = g.INSTANCE;
            g gVarD = companion.d();
            Function1<Object, Unit> function1G = gVarD != null ? gVarD.g() : null;
            g gVarE = companion.e(gVarD);
            try {
                if (this._lazyLayoutScrollDeltaBetweenPasses.c() && Arrays.equals(result.getFirstVisibleItemIndices(), this.scrollPosition.getIndices()) && Arrays.equals(result.getFirstVisibleItemScrollOffsets(), this.scrollPosition.getScrollOffsets())) {
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
        this.scrollToBeConsumed -= result.getConsumedScroll();
        this.layoutInfoState.setValue(result);
        if (visibleItemsStayedTheSame) {
            this.scrollPosition.m(result.getFirstVisibleItemScrollOffsets());
        } else {
            this.scrollPosition.l(result);
            q(result);
        }
        S(result.i());
        T(result.getCanScrollForward());
        if (isLookingAhead) {
            this._lazyLayoutScrollDeltaBetweenPasses.e(result.getScrollBackAmount(), result.getDensity(), result.getCoroutineScope());
        }
        this.measurePassCount++;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final sy6 getApproachLayoutInfo() {
        return this.approachLayoutInfo;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final bc0 getAwaitLayoutModifier() {
        return this.awaitLayoutModifier;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final us6 getBeyondBoundsInfo() {
        return this.beyondBoundsInfo;
    }

    public final int w() {
        return this.scrollPosition.c();
    }

    public final int x() {
        return this.scrollPosition.f();
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final boolean getHasLookaheadOccurred() {
        return this.hasLookaheadOccurred;
    }

    public final d<vy6> z() {
        return this.itemAnimator;
    }

    public LazyStaggeredGridState(int i, int i2) {
        this(new int[]{i}, new int[]{i2}, null);
    }
}
