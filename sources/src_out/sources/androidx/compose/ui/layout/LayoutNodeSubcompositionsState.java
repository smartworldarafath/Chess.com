package androidx.compose.ui.layout;

import androidx.compose.p004runtime.s0;
import androidx.compose.ui.layout.LayoutNodeSubcompositionsState;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LookaheadPassDelegate;
import androidx.compose.ui.node.MeasurePassDelegate;
import androidx.compose.ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.inputmethod.aq1;
import com.google.inputmethod.bna;
import com.google.inputmethod.d49;
import com.google.inputmethod.dj7;
import com.google.inputmethod.ej7;
import com.google.inputmethod.f49;
import com.google.inputmethod.fhd;
import com.google.inputmethod.fj7;
import com.google.inputmethod.fo6;
import com.google.inputmethod.fob;
import com.google.inputmethod.ghd;
import com.google.inputmethod.iu8;
import com.google.inputmethod.k4b;
import com.google.inputmethod.k58;
import com.google.inputmethod.ki8;
import com.google.inputmethod.ko1;
import com.google.inputmethod.kx1;
import com.google.inputmethod.mra;
import com.google.inputmethod.n48;
import com.google.inputmethod.o58;
import com.google.inputmethod.p16;
import com.google.inputmethod.p48;
import com.google.inputmethod.q16;
import com.google.inputmethod.r58;
import com.google.inputmethod.scc;
import com.google.inputmethod.tcc;
import com.google.inputmethod.uc;
import com.google.inputmethod.zw5;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0003[DXB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u001a\u001a\u0004\u0018\u00010\t2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001e\u001a\u00020\u000e*\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000bH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u000eH\u0002¢\u0006\u0004\b#\u0010$J\u0013\u0010%\u001a\u00020\u000e*\u00020\u0002H\u0002¢\u0006\u0004\b%\u0010&J\u001b\u0010'\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u000eH\u0002¢\u0006\u0004\b)\u0010$J/\u0010*\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b*\u0010+J\u001b\u0010-\u001a\u00020\u000e*\u00020\u00122\u0006\u0010,\u001a\u00020\u000bH\u0002¢\u0006\u0004\b-\u0010.J\u0013\u0010/\u001a\u00020\u000e*\u00020\u0012H\u0002¢\u0006\u0004\b/\u00100J\u0019\u00101\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b1\u00102J\u0019\u00104\u001a\u0002032\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b6\u00107J)\u0010;\u001a\u00020\u000e2\u0006\u00108\u001a\u00020\u00182\u0006\u00109\u001a\u00020\u00182\b\b\u0002\u0010:\u001a\u00020\u0018H\u0002¢\u0006\u0004\b;\u0010<J\u001b\u0010>\u001a\u00020\u000e*\u00020\u00122\u0006\u0010=\u001a\u00020\u000bH\u0002¢\u0006\u0004\b>\u0010.J-\u0010@\u001a\b\u0012\u0004\u0012\u00020?0\u00162\b\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u000eH\u0016¢\u0006\u0004\bB\u0010$J\u000f\u0010C\u001a\u00020\u000eH\u0016¢\u0006\u0004\bC\u0010$J\u000f\u0010D\u001a\u00020\u000eH\u0016¢\u0006\u0004\bD\u0010$J+\u0010E\u001a\b\u0012\u0004\u0012\u00020?0\u00162\b\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\bE\u0010AJ\u0015\u0010G\u001a\u00020\u000e2\u0006\u0010F\u001a\u00020\u0018¢\u0006\u0004\bG\u0010HJ\r\u0010I\u001a\u00020\u000e¢\u0006\u0004\bI\u0010$J'\u0010P\u001a\u00020O2\u0018\u0010N\u001a\u0014\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u00020M0J¢\u0006\u0004\bP\u0010QJ%\u0010R\u001a\u0002032\b\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\bR\u0010SJ%\u0010U\u001a\u00020T2\b\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\bU\u0010VJ\r\u0010W\u001a\u00020\u000e¢\u0006\u0004\bW\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR$\u0010a\u001a\u0004\u0018\u00010Z8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R*\u0010\u0005\u001a\u00020\u00042\u0006\u0010b\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\u0016\u0010h\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010IR\u0016\u0010j\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010IR \u0010n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00120k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\"\u0010p\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010mR\u0018\u0010t\u001a\u00060qR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0018\u0010x\u001a\u00060uR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\"\u0010z\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010mR\u0014\u0010~\u001a\u00020{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}R#\u0010\u0080\u0001\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u0002030k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u007f\u0010mR \u0010\u0084\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0081\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0018\u0010\u0086\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010IR\u0018\u0010\u0088\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010IR\u0017\u0010\u008b\u0001\u001a\u00030\u0089\u00018\u0002X\u0082D¢\u0006\u0007\n\u0005\bB\u0010\u008a\u0001R\u0019\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u001c8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001¨\u0006\u008f\u0001"}, d2 = {"Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "Lcom/google/android/aq1;", "Landroidx/compose/ui/node/LayoutNode;", "root", "Landroidx/compose/ui/layout/w;", "slotReusePolicy", "<init>", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/layout/w;)V", "node", "", "slotId", "", "pausable", "Lkotlin/Function0;", "", "content", "V", "(Landroidx/compose/ui/node/LayoutNode;Ljava/lang/Object;ZLkotlin/jvm/functions/Function2;)V", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$b;", "nodeState", "U", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$b;Z)V", "", "foldedChildren", "", "index", "H", "(Ljava/util/List;I)Ljava/lang/Object;", "Lcom/google/android/iu8;", "executor", "A", "(Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$b;Lcom/google/android/iu8;)V", "deactivate", "J", "(Z)V", "B", "()V", "P", "(Landroidx/compose/ui/node/LayoutNode;)V", "W", "(Ljava/lang/Object;)Landroidx/compose/ui/node/LayoutNode;", "E", "N", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Z)V", "forceDeactivate", "Q", "(Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$b;Z)V", "w", "(Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$b;)V", "D", "(Ljava/lang/Object;)V", "Landroidx/compose/ui/layout/SubcomposeLayoutState$b;", "z", "(Ljava/lang/Object;)Landroidx/compose/ui/layout/SubcomposeLayoutState$b;", "y", "(I)Landroidx/compose/ui/node/LayoutNode;", "from", "to", "count", "K", "(III)V", "shouldComplete", "t", "Lcom/google/android/dj7;", "v", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "p", "d", "c", "T", "startIndex", "C", "(I)V", "I", "Lkotlin/Function2;", "Lcom/google/android/scc;", "Lcom/google/android/kx1;", "Lcom/google/android/fj7;", "block", "Lcom/google/android/ej7;", "x", "(Lkotlin/jvm/functions/Function2;)Lcom/google/android/ej7;", "M", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/layout/SubcomposeLayoutState$b;", "Landroidx/compose/ui/layout/SubcomposeLayoutState$a;", "O", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/layout/SubcomposeLayoutState$a;", "F", "a", "Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/runtime/f;", "b", "Landroidx/compose/runtime/f;", "getCompositionContext", "()Landroidx/compose/runtime/f;", "R", "(Landroidx/compose/runtime/f;)V", "compositionContext", "value", "Landroidx/compose/ui/layout/w;", "getSlotReusePolicy", "()Landroidx/compose/ui/layout/w;", "S", "(Landroidx/compose/ui/layout/w;)V", "currentIndex", "e", "currentApproachIndex", "Lcom/google/android/k58;", "f", "Lcom/google/android/k58;", "nodeToNodeState", "g", "slotIdToNode", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$c;", "h", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$c;", "scope", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$a;", "i", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$a;", "approachMeasureScope", "j", "precomposeMap", "Landroidx/compose/ui/layout/w$a;", "k", "Landroidx/compose/ui/layout/w$a;", "reusableSlotIdsSet", "l", "approachPrecomposeSlotHandleMap", "Lcom/google/android/r58;", "m", "Lcom/google/android/r58;", "slotIdsOfCompositionsNeededInApproach", "n", "reusableCount", "o", "precomposedCount", "", "Ljava/lang/String;", "NoIntrinsicsMessage", "G", "()Lcom/google/android/iu8;", "outOfFrameExecutor", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LayoutNodeSubcompositionsState implements aq1 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final LayoutNode root;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private androidx.compose.p004runtime.f compositionContext;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private w slotReusePolicy;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int currentIndex;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int currentApproachIndex;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private int reusableCount;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private int precomposedCount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final k58<LayoutNode, b> nodeToNodeState = k4b.c();

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final k58<Object, LayoutNode> slotIdToNode = k4b.c();

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final c scope = new c();

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final a approachMeasureScope = new a();

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final k58<Object, LayoutNode> precomposeMap = k4b.c();

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final w.a reusableSlotIdsSet = new w.a(null, 1, null);

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final k58<Object, SubcomposeLayoutState.b> approachPrecomposeSlotHandleMap = k4b.c();

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final r58<Object> slotIdsOfCompositionsNeededInApproach = new r58<>(new Object[16], 0);

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final String NoIntrinsicsMessage = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";

    @Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J-\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJH\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e0\u00112\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b0\u0014H\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0019J^\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e0\u00112\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\b\u0018\u00010\u00142\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b0\u0014H\u0096\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0014\u0010 \u001a\u00020\u001f*\u00020\u001eH\u0097\u0001¢\u0006\u0004\b \u0010!J\u0014\u0010#\u001a\u00020\u001f*\u00020\"H\u0097\u0001¢\u0006\u0004\b#\u0010$J\u0014\u0010%\u001a\u00020\u000e*\u00020\u001eH\u0097\u0001¢\u0006\u0004\b%\u0010&J\u0014\u0010'\u001a\u00020\u000e*\u00020\"H\u0097\u0001¢\u0006\u0004\b'\u0010(J\u0014\u0010)\u001a\u00020\u001e*\u00020\u000eH\u0097\u0001¢\u0006\u0004\b)\u0010*J\u0014\u0010+\u001a\u00020\u001e*\u00020\u001fH\u0097\u0001¢\u0006\u0004\b+\u0010!J\u0014\u0010,\u001a\u00020\u001e*\u00020\"H\u0097\u0001¢\u0006\u0004\b,\u0010$J\u0014\u0010-\u001a\u00020\"*\u00020\u000eH\u0097\u0001¢\u0006\u0004\b-\u0010.J\u0014\u0010/\u001a\u00020\"*\u00020\u001fH\u0097\u0001¢\u0006\u0004\b/\u00100J\u0014\u00101\u001a\u00020\"*\u00020\u001eH\u0097\u0001¢\u0006\u0004\b1\u00100J\u0014\u00104\u001a\u000203*\u000202H\u0097\u0001¢\u0006\u0004\b4\u00105J\u0014\u00106\u001a\u000202*\u000203H\u0097\u0001¢\u0006\u0004\b6\u00105R\u0014\u0010:\u001a\u0002078\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010A\u001a\u00020\u001f8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0014\u0010C\u001a\u00020\u001f8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bB\u0010@¨\u0006D"}, d2 = {"Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$a;", "Lcom/google/android/scc;", "Landroidx/compose/ui/layout/j;", "<init>", "(Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;)V", "", "slotId", "Lkotlin/Function0;", "", "content", "", "Lcom/google/android/dj7;", "q1", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "", "width", "height", "", "Lcom/google/android/uc;", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/o$a;", "placementBlock", "Lcom/google/android/fj7;", "h2", "(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Lcom/google/android/fj7;", "Lcom/google/android/mra;", "rulers", "B2", "(IILjava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/google/android/fj7;", "Lcom/google/android/ff3;", "", "x2", "(F)F", "Lcom/google/android/b0d;", "T1", "(J)F", "O1", "(F)I", "A2", "(J)I", "O0", "(I)F", "P0", "U", "X", "(I)J", "Y", "(F)J", "s1", "Lcom/google/android/jf3;", "Lcom/google/android/tsb;", "b1", "(J)J", "S", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "", "G1", "()Z", "isLookingAhead", "getDensity", "()F", "density", "w2", "fontScale", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class a implements scc, j {
        private final /* synthetic */ c a;

        public a() {
            this.a = LayoutNodeSubcompositionsState.this.scope;
        }

        @Override // com.google.inputmethod.f43
        public int A2(long j) {
            return this.a.A2(j);
        }

        @Override // androidx.compose.ui.layout.j
        public fj7 B2(int width, int height, Map<uc, Integer> alignmentLines, Function1<? super mra, Unit> rulers, Function1<? super o.a, Unit> placementBlock) {
            return this.a.B2(width, height, alignmentLines, rulers, placementBlock);
        }

        @Override // com.google.inputmethod.h66
        public boolean G1() {
            return this.a.G1();
        }

        @Override // com.google.inputmethod.f43
        public float O0(int i) {
            return this.a.O0(i);
        }

        @Override // com.google.inputmethod.f43
        public int O1(float f) {
            return this.a.O1(f);
        }

        @Override // com.google.inputmethod.f43
        public float P0(float f) {
            return this.a.P0(f);
        }

        @Override // com.google.inputmethod.f43
        public long S(long j) {
            return this.a.S(j);
        }

        @Override // com.google.inputmethod.f43
        public float T1(long j) {
            return this.a.T1(j);
        }

        @Override // com.google.inputmethod.hm4
        public float U(long j) {
            return this.a.U(j);
        }

        @Override // com.google.inputmethod.f43
        public long X(int i) {
            return this.a.X(i);
        }

        @Override // com.google.inputmethod.f43
        public long Y(float f) {
            return this.a.Y(f);
        }

        @Override // com.google.inputmethod.f43
        public long b1(long j) {
            return this.a.b1(j);
        }

        @Override // com.google.inputmethod.f43
        public float getDensity() {
            return this.a.getDensity();
        }

        @Override // com.google.inputmethod.h66
        public LayoutDirection getLayoutDirection() {
            return this.a.getLayoutDirection();
        }

        @Override // androidx.compose.ui.layout.j
        public fj7 h2(int width, int height, Map<uc, Integer> alignmentLines, Function1<? super o.a, Unit> placementBlock) {
            return this.a.h2(width, height, alignmentLines, placementBlock);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.inputmethod.scc
        public List<dj7> q1(Object slotId, Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> content) {
            LayoutNode layoutNode = (LayoutNode) LayoutNodeSubcompositionsState.this.slotIdToNode.e(slotId);
            return (layoutNode == null || LayoutNodeSubcompositionsState.this.root.W().indexOf(layoutNode) >= LayoutNodeSubcompositionsState.this.currentIndex) ? LayoutNodeSubcompositionsState.this.v(slotId, content) : layoutNode.Q();
        }

        @Override // com.google.inputmethod.hm4
        public long s1(float f) {
            return this.a.s1(f);
        }

        @Override // com.google.inputmethod.hm4
        /* JADX INFO: renamed from: w2 */
        public float getFontScale() {
            return this.a.getFontScale();
        }

        @Override // com.google.inputmethod.f43
        public float x2(float f) {
            return this.a.x2(f);
        }
    }

    @Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ]\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0\u00102\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00132\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00070\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\"\u001a\u00020\u001b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010)\u001a\u00020#8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b$\u0010(R\"\u0010-\u001a\u00020#8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b*\u0010%\u001a\u0004\b+\u0010'\"\u0004\b,\u0010(R\u0014\u00101\u001a\u00020.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$c;", "Lcom/google/android/scc;", "<init>", "(Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;)V", "", "slotId", "Lkotlin/Function0;", "", "content", "", "Lcom/google/android/dj7;", "q1", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "", "width", "height", "", "Lcom/google/android/uc;", "alignmentLines", "Lkotlin/Function1;", "Lcom/google/android/mra;", "rulers", "Landroidx/compose/ui/layout/o$a;", "placementBlock", "Lcom/google/android/fj7;", "B2", "(IILjava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/google/android/fj7;", "Landroidx/compose/ui/unit/LayoutDirection;", "a", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "i", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "layoutDirection", "", "b", "F", "getDensity", "()F", "(F)V", "density", "c", "w2", "f", "fontScale", "", "G1", "()Z", "isLookingAhead", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class c implements scc {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private LayoutDirection layoutDirection = LayoutDirection.Rtl;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private float density;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private float fontScale;

        @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"androidx/compose/ui/layout/LayoutNodeSubcompositionsState$c$a", "Lcom/google/android/fj7;", "", "l", "()V", "", "getWidth", "()I", "width", "getHeight", "height", "", "Lcom/google/android/uc;", "j", "()Ljava/util/Map;", "alignmentLines", "Lkotlin/Function1;", "Lcom/google/android/mra;", "k", "()Lkotlin/jvm/functions/Function1;", "rulers", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a implements fj7 {
            final /* synthetic */ int a;
            final /* synthetic */ int b;
            final /* synthetic */ Map<uc, Integer> c;
            final /* synthetic */ Function1<mra, Unit> d;
            final /* synthetic */ c e;
            final /* synthetic */ LayoutNodeSubcompositionsState f;
            final /* synthetic */ Function1<o.a, Unit> g;

            /* JADX WARN: Multi-variable type inference failed */
            a(int i, int i2, Map<uc, Integer> map, Function1<? super mra, Unit> function1, c cVar, LayoutNodeSubcompositionsState layoutNodeSubcompositionsState, Function1<? super o.a, Unit> function2) {
                this.a = i;
                this.b = i2;
                this.c = map;
                this.d = function1;
                this.e = cVar;
                this.f = layoutNodeSubcompositionsState;
                this.g = function2;
            }

            @Override // com.google.inputmethod.fj7
            public int getHeight() {
                return this.b;
            }

            @Override // com.google.inputmethod.fj7
            public int getWidth() {
                return this.a;
            }

            @Override // com.google.inputmethod.fj7
            public Map<uc, Integer> j() {
                return this.c;
            }

            @Override // com.google.inputmethod.fj7
            public Function1<mra, Unit> k() {
                return this.d;
            }

            @Override // com.google.inputmethod.fj7
            public void l() {
                androidx.compose.ui.node.i lookaheadDelegate;
                if (!this.e.G1() || (lookaheadDelegate = this.f.root.b0().getLookaheadDelegate()) == null) {
                    this.g.invoke(this.f.root.b0().getPlacementScope());
                } else {
                    this.g.invoke(lookaheadDelegate.getPlacementScope());
                }
            }
        }

        public c() {
        }

        @Override // androidx.compose.ui.layout.j
        public fj7 B2(int width, int height, Map<uc, Integer> alignmentLines, Function1<? super mra, Unit> rulers, Function1<? super o.a, Unit> placementBlock) {
            if (!((width & (-16777216)) == 0 && ((-16777216) & height) == 0)) {
                zw5.c("Size(" + width + " x " + height + ") is out of range. Each dimension must be between 0 and 16777215.");
            }
            return new a(width, height, alignmentLines, rulers, this, LayoutNodeSubcompositionsState.this, placementBlock);
        }

        @Override // com.google.inputmethod.h66
        public boolean G1() {
            return LayoutNodeSubcompositionsState.this.root.i0() == LayoutNode.LayoutState.LookaheadLayingOut || LayoutNodeSubcompositionsState.this.root.i0() == LayoutNode.LayoutState.LookaheadMeasuring;
        }

        public void b(float f) {
            this.density = f;
        }

        public void f(float f) {
            this.fontScale = f;
        }

        @Override // com.google.inputmethod.f43
        public float getDensity() {
            return this.density;
        }

        @Override // com.google.inputmethod.h66
        public LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        public void i(LayoutDirection layoutDirection) {
            this.layoutDirection = layoutDirection;
        }

        @Override // com.google.inputmethod.scc
        public List<dj7> q1(Object slotId, Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> content) {
            return LayoutNodeSubcompositionsState.this.T(slotId, content);
        }

        @Override // com.google.inputmethod.hm4
        /* JADX INFO: renamed from: w2, reason: from getter */
        public float getFontScale() {
            return this.fontScale;
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J)\u0010\u000b\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"androidx/compose/ui/layout/LayoutNodeSubcompositionsState$d", "Landroidx/compose/ui/node/LayoutNode$d;", "Landroidx/compose/ui/layout/j;", "", "Lcom/google/android/dj7;", "measurables", "Lcom/google/android/kx1;", "constraints", "Lcom/google/android/fj7;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/j;Ljava/util/List;J)Lcom/google/android/fj7;", "measure", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d extends LayoutNode.d {
        final /* synthetic */ Function2<scc, kx1, fj7> c;

        @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"androidx/compose/ui/layout/LayoutNodeSubcompositionsState$d$a", "Lcom/google/android/fj7;", "", "l", "()V", "", "getWidth", "()I", "width", "getHeight", "height", "", "Lcom/google/android/uc;", "j", "()Ljava/util/Map;", "alignmentLines", "Lkotlin/Function1;", "Lcom/google/android/mra;", "k", "()Lkotlin/jvm/functions/Function1;", "rulers", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a implements fj7 {
            private final /* synthetic */ fj7 a;
            final /* synthetic */ LayoutNodeSubcompositionsState b;
            final /* synthetic */ int c;
            final /* synthetic */ fj7 d;

            public a(fj7 fj7Var, LayoutNodeSubcompositionsState layoutNodeSubcompositionsState, int i, fj7 fj7Var2) {
                this.b = layoutNodeSubcompositionsState;
                this.c = i;
                this.d = fj7Var2;
                this.a = fj7Var;
            }

            @Override // com.google.inputmethod.fj7
            public int getHeight() {
                return this.a.getHeight();
            }

            @Override // com.google.inputmethod.fj7
            public int getWidth() {
                return this.a.getWidth();
            }

            @Override // com.google.inputmethod.fj7
            public Map<uc, Integer> j() {
                return this.a.j();
            }

            @Override // com.google.inputmethod.fj7
            public Function1<mra, Unit> k() {
                return this.a.k();
            }

            @Override // com.google.inputmethod.fj7
            public void l() {
                this.b.currentApproachIndex = this.c;
                this.d.l();
                this.b.E();
                LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.b;
                layoutNodeSubcompositionsState.C(layoutNodeSubcompositionsState.currentIndex);
            }
        }

        @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"androidx/compose/ui/layout/LayoutNodeSubcompositionsState$d$b", "Lcom/google/android/fj7;", "", "l", "()V", "", "getWidth", "()I", "width", "getHeight", "height", "", "Lcom/google/android/uc;", "j", "()Ljava/util/Map;", "alignmentLines", "Lkotlin/Function1;", "Lcom/google/android/mra;", "k", "()Lkotlin/jvm/functions/Function1;", "rulers", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b implements fj7 {
            private final /* synthetic */ fj7 a;
            final /* synthetic */ LayoutNodeSubcompositionsState b;
            final /* synthetic */ int c;
            final /* synthetic */ fj7 d;

            public b(fj7 fj7Var, LayoutNodeSubcompositionsState layoutNodeSubcompositionsState, int i, fj7 fj7Var2) {
                this.b = layoutNodeSubcompositionsState;
                this.c = i;
                this.d = fj7Var2;
                this.a = fj7Var;
            }

            @Override // com.google.inputmethod.fj7
            public int getHeight() {
                return this.a.getHeight();
            }

            @Override // com.google.inputmethod.fj7
            public int getWidth() {
                return this.a.getWidth();
            }

            @Override // com.google.inputmethod.fj7
            public Map<uc, Integer> j() {
                return this.a.j();
            }

            @Override // com.google.inputmethod.fj7
            public Function1<mra, Unit> k() {
                return this.a.k();
            }

            @Override // com.google.inputmethod.fj7
            public void l() {
                this.b.currentIndex = this.c;
                this.d.l();
                if (this.b.root.getLookaheadRoot() == null) {
                    LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.b;
                    layoutNodeSubcompositionsState.C(layoutNodeSubcompositionsState.currentIndex);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Function2<? super scc, ? super kx1, ? extends fj7> function2, String str) {
            super(str);
            this.c = function2;
        }

        @Override // com.google.inputmethod.ej7
        /* JADX INFO: renamed from: measure-3p2s80s */
        public fj7 mo0measure3p2s80s(j jVar, List<? extends dj7> list, long j) {
            LayoutNodeSubcompositionsState.this.scope.i(jVar.getLayoutDirection());
            LayoutNodeSubcompositionsState.this.scope.b(jVar.getDensity());
            LayoutNodeSubcompositionsState.this.scope.f(jVar.getFontScale());
            if (jVar.G1() || LayoutNodeSubcompositionsState.this.root.getLookaheadRoot() == null) {
                LayoutNodeSubcompositionsState.this.currentIndex = 0;
                fj7 fj7Var = (fj7) this.c.invoke(LayoutNodeSubcompositionsState.this.scope, kx1.a(j));
                return new b(fj7Var, LayoutNodeSubcompositionsState.this, LayoutNodeSubcompositionsState.this.currentIndex, fj7Var);
            }
            LayoutNodeSubcompositionsState.this.currentApproachIndex = 0;
            fj7 fj7Var2 = (fj7) this.c.invoke(LayoutNodeSubcompositionsState.this.approachMeasureScope, kx1.a(j));
            return new a(fj7Var2, LayoutNodeSubcompositionsState.this, LayoutNodeSubcompositionsState.this.currentApproachIndex, fj7Var2);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/layout/LayoutNodeSubcompositionsState$e", "Landroidx/compose/ui/layout/SubcomposeLayoutState$b;", "", "dispose", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e implements SubcomposeLayoutState.b {
        e() {
        }

        @Override // androidx.compose.ui.layout.SubcomposeLayoutState.b
        public void dispose() {
        }
    }

    @Metadata(d1 = {"\u0000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ-\u0010\u0011\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u001b\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"androidx/compose/ui/layout/LayoutNodeSubcompositionsState$f", "Landroidx/compose/ui/layout/SubcomposeLayoutState$b;", "", "dispose", "()V", "", "index", "Lcom/google/android/kx1;", "constraints", "e", "(IJ)V", "", "key", "Lkotlin/Function1;", "Lcom/google/android/fhd;", "Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;", "block", "d", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "Lcom/google/android/q16;", "c", "(I)J", "Lcom/google/android/p48;", "a", "Lcom/google/android/p48;", "getHasPremeasured", "()Lcom/google/android/p48;", "hasPremeasured", "b", "()I", "placeablesCount", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f implements SubcomposeLayoutState.b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final p48 hasPremeasured = p16.b();
        final /* synthetic */ Object c;

        f(Object obj) {
            this.c = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.compose.ui.layout.SubcomposeLayoutState.b
        public int b() {
            List<LayoutNode> listR;
            LayoutNode layoutNode = (LayoutNode) LayoutNodeSubcompositionsState.this.precomposeMap.e(this.c);
            if (layoutNode == null || (listR = layoutNode.R()) == null) {
                return 0;
            }
            return listR.size();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.compose.ui.layout.SubcomposeLayoutState.b
        public long c(int index) {
            LayoutNode layoutNode = (LayoutNode) LayoutNodeSubcompositionsState.this.precomposeMap.e(this.c);
            if (layoutNode != null && layoutNode.b()) {
                int size = layoutNode.R().size();
                if (index < 0 || index >= size) {
                    zw5.e("Index (" + index + ") is out of bound of [0, " + size + ')');
                }
                if (this.hasPremeasured.a(index)) {
                    return q16.c((((long) layoutNode.R().get(index).I0()) << 32) | (((long) layoutNode.R().get(index).a0()) & 4294967295L));
                }
            }
            return q16.INSTANCE.a();
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.compose.ui.layout.SubcomposeLayoutState.b
        public void d(Object key, Function1<? super fhd, ? extends TraversableNode$Companion$TraverseDescendantsAction> block) throws KotlinNothingValueException {
            ki8 nodes;
            LayoutNode layoutNode = (LayoutNode) LayoutNodeSubcompositionsState.this.precomposeMap.e(this.c);
            androidx.compose.ui.b.c head = (layoutNode == null || (nodes = layoutNode.getNodes()) == null) ? null : nodes.getHead();
            if (head == null || !head.getIsAttached()) {
                return;
            }
            ghd.e(head, key, block);
        }

        @Override // androidx.compose.ui.layout.SubcomposeLayoutState.b
        public void dispose() {
            LayoutNodeSubcompositionsState.this.D(this.c);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.compose.ui.layout.SubcomposeLayoutState.b
        public void e(int index, long constraints) {
            LayoutNode layoutNode = (LayoutNode) LayoutNodeSubcompositionsState.this.precomposeMap.e(this.c);
            if (layoutNode == null || !layoutNode.b()) {
                return;
            }
            int size = layoutNode.R().size();
            if (index < 0 || index >= size) {
                zw5.e("Index (" + index + ") is out of bound of [0, " + size + ')');
            }
            if (layoutNode.x()) {
                zw5.a("Pre-measure called on node that is not placed");
            }
            LayoutNode layoutNode2 = LayoutNodeSubcompositionsState.this.root;
            layoutNode2.ignoreRemeasureRequests = true;
            fo6.b(layoutNode).s(layoutNode.R().get(index), constraints);
            Unit unit = Unit.a;
            layoutNode2.ignoreRemeasureRequests = false;
            this.hasPremeasured.g(index);
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0011"}, d2 = {"androidx/compose/ui/layout/LayoutNodeSubcompositionsState$g", "", "Lcom/google/android/fob;", "shouldPause", "", "b", "(Lcom/google/android/fob;)Z", "Landroidx/compose/ui/layout/SubcomposeLayoutState$b;", "apply", "()Landroidx/compose/ui/layout/SubcomposeLayoutState$b;", "", "cancel", "()V", "a", "Z", "()Z", "isComplete", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class g implements SubcomposeLayoutState.a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean isComplete = true;
        final /* synthetic */ Object c;

        g(Object obj) {
            this.c = obj;
        }

        @Override // androidx.compose.ui.layout.SubcomposeLayoutState.a
        /* JADX INFO: renamed from: a, reason: from getter */
        public boolean getIsComplete() {
            return this.isComplete;
        }

        @Override // androidx.compose.ui.layout.SubcomposeLayoutState.a
        public SubcomposeLayoutState.b apply() {
            return LayoutNodeSubcompositionsState.this.z(this.c);
        }

        @Override // androidx.compose.ui.layout.SubcomposeLayoutState.a
        public boolean b(fob shouldPause) {
            return true;
        }

        @Override // androidx.compose.ui.layout.SubcomposeLayoutState.a
        public void cancel() {
        }
    }

    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"androidx/compose/ui/layout/LayoutNodeSubcompositionsState$h", "", "", "cancel", "()V", "Lcom/google/android/fob;", "shouldPause", "", "b", "(Lcom/google/android/fob;)Z", "Landroidx/compose/ui/layout/SubcomposeLayoutState$b;", "apply", "()Landroidx/compose/ui/layout/SubcomposeLayoutState$b;", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$b;", "c", "()Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$b;", "nodeState", "a", "()Z", "isComplete", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class h implements SubcomposeLayoutState.a {
        final /* synthetic */ Object b;

        h(Object obj) {
            this.b = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private final b c() {
            LayoutNode layoutNode = (LayoutNode) LayoutNodeSubcompositionsState.this.precomposeMap.e(this.b);
            if (layoutNode != null) {
                return (b) LayoutNodeSubcompositionsState.this.nodeToNodeState.e(layoutNode);
            }
            return null;
        }

        @Override // androidx.compose.ui.layout.SubcomposeLayoutState.a
        /* JADX INFO: renamed from: a */
        public boolean getIsComplete() {
            f49 pausedComposition;
            b bVarC = c();
            if (bVarC == null || (pausedComposition = bVarC.getPausedComposition()) == null) {
                return true;
            }
            return pausedComposition.a();
        }

        @Override // androidx.compose.ui.layout.SubcomposeLayoutState.a
        public SubcomposeLayoutState.b apply() {
            b bVarC = c();
            if (bVarC != null) {
                LayoutNodeSubcompositionsState.this.t(bVarC, false);
            }
            return LayoutNodeSubcompositionsState.this.z(this.b);
        }

        @Override // androidx.compose.ui.layout.SubcomposeLayoutState.a
        public boolean b(fob shouldPause) {
            b bVarC = c();
            f49 pausedComposition = bVarC != null ? bVarC.getPausedComposition() : null;
            if (pausedComposition == null || pausedComposition.a()) {
                return true;
            }
            androidx.compose.p004runtime.snapshots.g.Companion companion = androidx.compose.p004runtime.snapshots.g.INSTANCE;
            Object obj = this.b;
            androidx.compose.p004runtime.snapshots.g gVarD = companion.d();
            Function1<Object, Unit> function1G = gVarD != null ? gVarD.g() : null;
            androidx.compose.p004runtime.snapshots.g gVarE = companion.e(gVarD);
            try {
                boolean zB = pausedComposition.b(shouldPause);
                companion.l(gVarD, gVarE, function1G);
                return zB;
            } catch (Throwable th) {
                try {
                    if (bVarC.getOperations() != null) {
                        throw new SubcomposeLayoutPausableCompositionException(bVarC.getOperations(), obj, th);
                    }
                    throw th;
                } catch (Throwable th2) {
                    companion.l(gVarD, gVarE, function1G);
                    throw th2;
                }
            }
        }

        @Override // androidx.compose.ui.layout.SubcomposeLayoutState.a
        public void cancel() {
            b bVarC = c();
            if ((bVarC != null ? bVarC.getPausedComposition() : null) != null) {
                LayoutNodeSubcompositionsState.this.D(this.b);
            }
        }
    }

    public LayoutNodeSubcompositionsState(LayoutNode layoutNode, w wVar) {
        this.root = layoutNode;
        this.slotReusePolicy = wVar;
    }

    private final void A(final b bVar, iu8 iu8Var) {
        iu8Var.q(new Function0<Unit>() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$deactivateOutOfFrame$1
            {
                super(0);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                m16invoke();
                return Unit.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m16invoke() {
                bna composition;
                if (bVar.a() || (composition = bVar.getComposition()) == null) {
                    return;
                }
                composition.deactivate();
            }
        });
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Code duplicated, block: B:16:0x004e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0050 A[LOOP:0: B:5:0x0013->B:17:0x0050, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0053 A[EDGE_INSN: B:21:0x0053->B:18:0x0053 BREAK  A[LOOP:0: B:5:0x0013->B:17:0x0050], SYNTHETIC] */
    private final void B() throws KotlinNothingValueException {
        bna composition;
        LayoutNode layoutNode = this.root;
        layoutNode.ignoreRemeasureRequests = true;
        k58<LayoutNode, b> k58Var = this.nodeToNodeState;
        Object[] objArr = k58Var.values;
        long[] jArr = k58Var.metadata;
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
                        if ((255 & j) < 128 && (composition = ((b) objArr[(i << 3) + i3]).getComposition()) != null) {
                            composition.dispose();
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
        this.root.z1();
        Unit unit = Unit.a;
        layoutNode.ignoreRemeasureRequests = false;
        this.nodeToNodeState.k();
        this.slotIdToNode.k();
        this.precomposedCount = 0;
        this.reusableCount = 0;
        this.precomposeMap.k();
        I();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(Object slotId) {
        I();
        LayoutNode layoutNodeU = this.precomposeMap.u(slotId);
        if (layoutNodeU != null) {
            if (!(this.precomposedCount > 0)) {
                zw5.c("No pre-composed items to dispose");
            }
            int iIndexOf = this.root.W().indexOf(layoutNodeU);
            if (!(iIndexOf >= this.root.W().size() - this.precomposedCount)) {
                zw5.c("Item is not in pre-composed item range");
            }
            this.reusableCount++;
            this.precomposedCount--;
            b bVarE = this.nodeToNodeState.e(layoutNodeU);
            if (bVarE != null) {
                w(bVarE);
            }
            int size = (this.root.W().size() - this.precomposedCount) - this.reusableCount;
            K(iIndexOf, size, 1);
            C(size);
        }
        if (this.slotIdsOfCompositionsNeededInApproach.l(slotId)) {
            LayoutNode.K1(this.root, true, false, false, 6, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E() {
        k58<Object, SubcomposeLayoutState.b> k58Var = this.approachPrecomposeSlotHandleMap;
        long[] jArr = k58Var.metadata;
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
                        Object obj = k58Var.keys[i4];
                        SubcomposeLayoutState.b bVar = (SubcomposeLayoutState.b) k58Var.values[i4];
                        int iP = this.slotIdsOfCompositionsNeededInApproach.p(obj);
                        if (iP < 0 || iP >= this.currentApproachIndex) {
                            if (iP >= 0) {
                                this.slotIdsOfCompositionsNeededInApproach.y(iP, SubcomposeLayoutKt.b);
                            }
                            if (this.precomposeMap.b(obj)) {
                                bVar.dispose();
                            }
                            k58Var.v(i4);
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

    private final iu8 G() {
        return fo6.b(this.root).getOutOfFrameExecutor();
    }

    private final Object H(List<LayoutNode> foldedChildren, int index) {
        b bVarE = this.nodeToNodeState.e(foldedChildren.get(index));
        Intrinsics.g(bVarE);
        return bVarE.getSlotId();
    }

    private final void J(boolean deactivate) {
        this.precomposedCount = 0;
        this.precomposeMap.k();
        List<LayoutNode> listW = this.root.W();
        int size = listW.size();
        if (this.reusableCount != size) {
            this.reusableCount = size;
            androidx.compose.p004runtime.snapshots.g.Companion companion = androidx.compose.p004runtime.snapshots.g.INSTANCE;
            androidx.compose.p004runtime.snapshots.g gVarD = companion.d();
            Function1<Object, Unit> function1G = gVarD != null ? gVarD.g() : null;
            androidx.compose.p004runtime.snapshots.g gVarE = companion.e(gVarD);
            for (int i = 0; i < size; i++) {
                try {
                    LayoutNode layoutNode = listW.get(i);
                    b bVarE = this.nodeToNodeState.e(layoutNode);
                    if (bVarE != null && bVarE.a()) {
                        P(layoutNode);
                        Q(bVarE, deactivate);
                        bVarE.r(SubcomposeLayoutKt.a);
                    }
                } catch (Throwable th) {
                    companion.l(gVarD, gVarE, function1G);
                    throw th;
                }
            }
            Unit unit = Unit.a;
            companion.l(gVarD, gVarE, function1G);
            this.slotIdToNode.k();
        }
        I();
    }

    private final void K(int from, int to, int count) {
        LayoutNode layoutNode = this.root;
        layoutNode.ignoreRemeasureRequests = true;
        this.root.q1(from, to, count);
        Unit unit = Unit.a;
        layoutNode.ignoreRemeasureRequests = false;
    }

    static /* synthetic */ void L(LayoutNodeSubcompositionsState layoutNodeSubcompositionsState, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i3 = 1;
        }
        layoutNodeSubcompositionsState.K(i, i2, i3);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final void N(Object slotId, Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> content, boolean pausable) throws KotlinNothingValueException {
        if (this.root.b()) {
            I();
            if (this.slotIdToNode.c(slotId)) {
                return;
            }
            this.approachPrecomposeSlotHandleMap.u(slotId);
            k58<Object, LayoutNode> k58Var = this.precomposeMap;
            LayoutNode layoutNodeE = k58Var.e(slotId);
            if (layoutNodeE == null) {
                layoutNodeE = W(slotId);
                if (layoutNodeE != null) {
                    K(this.root.W().indexOf(layoutNodeE), this.root.W().size(), 1);
                    this.precomposedCount++;
                } else {
                    layoutNodeE = y(this.root.W().size());
                    this.precomposedCount++;
                }
                k58Var.x(slotId, layoutNodeE);
            }
            V(layoutNodeE, slotId, pausable, content);
        }
    }

    private final void P(LayoutNode layoutNode) {
        MeasurePassDelegate measurePassDelegateO0 = layoutNode.o0();
        LayoutNode.UsageByParent usageByParent = LayoutNode.UsageByParent.NotUsed;
        measurePassDelegateO0.K2(usageByParent);
        LookaheadPassDelegate lookaheadPassDelegateL0 = layoutNode.l0();
        if (lookaheadPassDelegateL0 != null) {
            lookaheadPassDelegateL0.L2(usageByParent);
        }
    }

    private final void Q(b bVar, boolean z) {
        bna composition;
        if (z || !bVar.getComposedWithReusableContentHost()) {
            bVar.k(s0.e(Boolean.FALSE, null, 2, null));
        } else {
            bVar.j(false);
        }
        if (bVar.getPausedComposition() != null) {
            w(bVar);
            return;
        }
        if (z) {
            bna composition2 = bVar.getComposition();
            if (composition2 != null) {
                composition2.deactivate();
                return;
            }
            return;
        }
        iu8 iu8VarG = G();
        if (iu8VarG != null) {
            A(bVar, iu8VarG);
        } else {
            if (bVar.getComposedWithReusableContentHost() || (composition = bVar.getComposition()) == null) {
                return;
            }
            composition.deactivate();
        }
    }

    private final void U(LayoutNode node, final b nodeState, boolean pausable) {
        if (!(nodeState.getPausedComposition() == null)) {
            zw5.a("new subcompose call while paused composition is still active");
        }
        androidx.compose.p004runtime.snapshots.g.Companion companion = androidx.compose.p004runtime.snapshots.g.INSTANCE;
        androidx.compose.p004runtime.snapshots.g gVarD = companion.d();
        Function1<Object, Unit> function1G = gVarD != null ? gVarD.g() : null;
        androidx.compose.p004runtime.snapshots.g gVarE = companion.e(gVarD);
        try {
            LayoutNode layoutNode = this.root;
            layoutNode.ignoreRemeasureRequests = true;
            bna composition = nodeState.getComposition();
            androidx.compose.p004runtime.f fVar = this.compositionContext;
            if (fVar == null) {
                zw5.d("parent composition reference not set");
                throw new KotlinNothingValueException();
            }
            if (composition == null || composition.isDisposed()) {
                composition = pausable ? tcc.a(node, fVar) : tcc.b(node, fVar);
            }
            nodeState.m(composition);
            final Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2D = nodeState.d();
            if (G() != null) {
                nodeState.l(false);
            } else {
                nodeState.l(true);
                function2D = ko1.c(1524156494, true, new Function2<androidx.compose.p004runtime.d, Integer, Unit>() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$subcompose$4$1$composable$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
                        return Unit.a;
                    }

                    public final void invoke(androidx.compose.p004runtime.d dVar, int i) {
                        if (!dVar.g((i & 3) != 2, i & 1)) {
                            dVar.q();
                            return;
                        }
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(1524156494, i, -1, "androidx.compose.ui.layout.LayoutNodeSubcompositionsState.subcompose.<anonymous>.<anonymous>.<anonymous> (SubcomposeLayout.kt:706)");
                        }
                        boolean zA = nodeState.a();
                        Function2<androidx.compose.p004runtime.d, Integer, Unit> function2 = function2D;
                        dVar.p(207, Boolean.valueOf(zA));
                        boolean zA2 = dVar.A(zA);
                        if (zA) {
                            function2.invoke(dVar, 0);
                        } else {
                            dVar.b(zA2);
                        }
                        dVar.P();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                    }
                });
            }
            if (pausable) {
                Intrinsics.h(composition, "null cannot be cast to non-null type androidx.compose.runtime.PausableComposition");
                if (nodeState.getForceReuse()) {
                    nodeState.q(((d49) composition).g(function2D));
                } else {
                    nodeState.q(((d49) composition).b(function2D));
                }
            } else if (nodeState.getForceReuse()) {
                composition.f(function2D);
            } else {
                composition.c(function2D);
            }
            nodeState.p(false);
            Unit unit = Unit.a;
            layoutNode.ignoreRemeasureRequests = false;
            companion.l(gVarD, gVarE, function1G);
        } catch (Throwable th) {
            companion.l(gVarD, gVarE, function1G);
            throw th;
        }
    }

    private final void V(LayoutNode node, Object slotId, boolean pausable, Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> content) {
        k58<LayoutNode, b> k58Var = this.nodeToNodeState;
        b bVarE = k58Var.e(node);
        if (bVarE == null) {
            b bVar = new b(slotId, ComposableSingletons$SubcomposeLayoutKt.a.a(), null, 4, null);
            k58Var.x(node, bVar);
            bVarE = bVar;
        }
        b bVar2 = bVarE;
        boolean z = bVar2.d() != content;
        if (bVar2.getPausedComposition() != null) {
            if (z) {
                w(bVar2);
            } else if (pausable) {
                return;
            } else {
                t(bVar2, true);
            }
        }
        bna composition = bVar2.getComposition();
        boolean zT = composition != null ? composition.t() : true;
        if (z || zT || bVar2.getForceRecompose()) {
            bVar2.n(content);
            U(node, bVar2, pausable);
            bVar2.o(false);
        }
    }

    private final LayoutNode W(Object slotId) {
        int i;
        if (this.reusableCount == 0) {
            return null;
        }
        List<LayoutNode> listW = this.root.W();
        int size = listW.size() - this.precomposedCount;
        int i2 = size - this.reusableCount;
        int i3 = size - 1;
        int i4 = i3;
        while (true) {
            if (i4 < i2) {
                i = -1;
                break;
            }
            if (Intrinsics.e(H(listW, i4), slotId)) {
                i = i4;
                break;
            }
            i4--;
        }
        if (i == -1) {
            while (true) {
                if (i3 < i2) {
                    i4 = i3;
                    break;
                }
                b bVarE = this.nodeToNodeState.e(listW.get(i3));
                Intrinsics.g(bVarE);
                b bVar = bVarE;
                if (bVar.getSlotId() == SubcomposeLayoutKt.a || this.slotReusePolicy.b(slotId, bVar.getSlotId())) {
                    bVar.r(slotId);
                    i4 = i3;
                    i = i4;
                    break;
                }
                i3--;
            }
        }
        if (i == -1) {
            return null;
        }
        if (i4 != i2) {
            K(i4, i2, 1);
        }
        this.reusableCount--;
        LayoutNode layoutNode = listW.get(i2);
        b bVarE2 = this.nodeToNodeState.e(layoutNode);
        Intrinsics.g(bVarE2);
        b bVar2 = bVarE2;
        bVar2.k(s0.e(Boolean.TRUE, null, 2, null));
        bVar2.p(true);
        bVar2.o(true);
        return layoutNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(b bVar, boolean z) {
        f49 pausedComposition = bVar.getPausedComposition();
        if (pausedComposition != null) {
            androidx.compose.p004runtime.snapshots.g.Companion companion = androidx.compose.p004runtime.snapshots.g.INSTANCE;
            androidx.compose.p004runtime.snapshots.g gVarD = companion.d();
            Function1<Object, Unit> function1G = gVarD != null ? gVarD.g() : null;
            androidx.compose.p004runtime.snapshots.g gVarE = companion.e(gVarD);
            try {
                LayoutNode layoutNode = this.root;
                layoutNode.ignoreRemeasureRequests = true;
                if (z) {
                    while (!pausedComposition.a()) {
                        try {
                            pausedComposition.b(new fob() { // from class: com.google.android.ho6
                                @Override // com.google.inputmethod.fob
                                public final boolean a() {
                                    return LayoutNodeSubcompositionsState.u();
                                }
                            });
                        } catch (Throwable th) {
                            n48 operations = bVar.getOperations();
                            if (operations == null) {
                                throw th;
                            }
                            throw new SubcomposeLayoutPausableCompositionException(operations, bVar.getSlotId(), th);
                        }
                    }
                }
                pausedComposition.apply();
                bVar.q(null);
                Unit unit = Unit.a;
                layoutNode.ignoreRemeasureRequests = false;
                companion.l(gVarD, gVarE, function1G);
            } catch (Throwable th2) {
                companion.l(gVarD, gVarE, function1G);
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean u() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<dj7> v(Object slotId, Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> content) {
        if (!(this.slotIdsOfCompositionsNeededInApproach.getSize() >= this.currentApproachIndex)) {
            zw5.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        LayoutNode layoutNodeE = this.slotIdToNode.e(slotId);
        int size = this.slotIdsOfCompositionsNeededInApproach.getSize();
        int i = this.currentApproachIndex;
        if (size == i) {
            this.slotIdsOfCompositionsNeededInApproach.c(slotId);
        } else {
            this.slotIdsOfCompositionsNeededInApproach.y(i, slotId);
        }
        this.currentApproachIndex++;
        boolean zB = this.precomposeMap.b(slotId);
        if (zB || layoutNodeE != null) {
            if (!zB && layoutNodeE != null) {
                K(this.root.W().indexOf(layoutNodeE), this.root.W().size(), 1);
                this.precomposedCount++;
                this.slotIdToNode.u(slotId);
                this.precomposeMap.x(slotId, layoutNodeE);
                this.approachPrecomposeSlotHandleMap.x(slotId, z(slotId));
                if (this.root.b()) {
                    I();
                }
            }
            LayoutNode layoutNodeE2 = this.precomposeMap.e(slotId);
            b bVarE = layoutNodeE2 != null ? this.nodeToNodeState.e(layoutNodeE2) : null;
            if (bVarE != null && bVarE.getForceRecompose()) {
                V(layoutNodeE2, slotId, false, content);
            }
            if ((bVarE != null ? bVarE.getPausedComposition() : null) != null) {
                t(bVarE, true);
            }
        } else {
            this.approachPrecomposeSlotHandleMap.x(slotId, M(slotId, content));
        }
        LayoutNode layoutNodeE3 = this.precomposeMap.e(slotId);
        if (layoutNodeE3 != null) {
            List<MeasurePassDelegate> listY1 = layoutNodeE3.o0().y1();
            int size2 = listY1.size();
            for (int i2 = 0; i2 < size2; i2++) {
                listY1.get(i2).g2();
            }
            if (listY1 != null) {
                return listY1;
            }
        }
        return kotlin.collections.m.p();
    }

    private final void w(b bVar) {
        f49 pausedComposition = bVar.getPausedComposition();
        if (pausedComposition != null) {
            pausedComposition.cancel();
            bVar.q(null);
            bna composition = bVar.getComposition();
            if (composition != null) {
                composition.dispose();
            }
            bVar.m(null);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final LayoutNode y(int index) throws KotlinNothingValueException {
        LayoutNode layoutNode = new LayoutNode(true, 0, 2, null);
        LayoutNode layoutNode2 = this.root;
        layoutNode2.ignoreRemeasureRequests = true;
        this.root.Q0(index, layoutNode);
        Unit unit = Unit.a;
        layoutNode2.ignoreRemeasureRequests = false;
        return layoutNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SubcomposeLayoutState.b z(Object slotId) {
        return !this.root.b() ? new e() : new f(slotId);
    }

    public final void C(int startIndex) {
        boolean z = false;
        this.reusableCount = 0;
        List<LayoutNode> listW = this.root.W();
        int size = (listW.size() - this.precomposedCount) - 1;
        if (startIndex <= size) {
            this.reusableSlotIdsSet.clear();
            if (startIndex <= size) {
                int i = startIndex;
                while (true) {
                    this.reusableSlotIdsSet.add(H(listW, i));
                    if (i == size) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            this.slotReusePolicy.a(this.reusableSlotIdsSet);
            androidx.compose.p004runtime.snapshots.g.Companion companion = androidx.compose.p004runtime.snapshots.g.INSTANCE;
            androidx.compose.p004runtime.snapshots.g gVarD = companion.d();
            Function1<Object, Unit> function1G = gVarD != null ? gVarD.g() : null;
            androidx.compose.p004runtime.snapshots.g gVarE = companion.e(gVarD);
            boolean z2 = false;
            while (size >= startIndex) {
                try {
                    LayoutNode layoutNode = listW.get(size);
                    b bVarE = this.nodeToNodeState.e(layoutNode);
                    Intrinsics.g(bVarE);
                    b bVar = bVarE;
                    Object slotId = bVar.getSlotId();
                    if (this.reusableSlotIdsSet.contains(slotId)) {
                        this.reusableCount++;
                        if (bVar.a()) {
                            P(layoutNode);
                            Q(bVar, false);
                            if (bVar.getComposedWithReusableContentHost()) {
                                z2 = true;
                            }
                        }
                    } else {
                        LayoutNode layoutNode2 = this.root;
                        layoutNode2.ignoreRemeasureRequests = true;
                        this.nodeToNodeState.u(layoutNode);
                        bna composition = bVar.getComposition();
                        if (composition != null) {
                            composition.dispose();
                        }
                        this.root.A1(size, 1);
                        Unit unit = Unit.a;
                        layoutNode2.ignoreRemeasureRequests = false;
                    }
                    this.slotIdToNode.u(slotId);
                    size--;
                } catch (Throwable th) {
                    companion.l(gVarD, gVarE, function1G);
                    throw th;
                }
            }
            Unit unit2 = Unit.a;
            companion.l(gVarD, gVarE, function1G);
            z = z2;
        }
        if (z) {
            androidx.compose.p004runtime.snapshots.g.INSTANCE.m();
        }
        I();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0053 A[LOOP:0: B:7:0x001b->B:17:0x0053, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0056 A[EDGE_INSN: B:28:0x0056->B:18:0x0056 BREAK  A[LOOP:0: B:7:0x001b->B:17:0x0053], SYNTHETIC] */
    public final void F() {
        if (this.reusableCount != this.root.W().size()) {
            k58<LayoutNode, b> k58Var = this.nodeToNodeState;
            Object[] objArr = k58Var.values;
            long[] jArr = k58Var.metadata;
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
                                ((b) objArr[(i << 3) + i3]).o(true);
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
            if (this.root.getLookaheadRoot() != null) {
                if (this.root.k0()) {
                    return;
                }
                LayoutNode.G1(this.root, false, false, false, 7, null);
            } else {
                if (this.root.p0()) {
                    return;
                }
                LayoutNode.K1(this.root, false, false, false, 7, null);
            }
        }
    }

    public final void I() {
        int size = this.root.W().size();
        if (!(this.nodeToNodeState.get_size() == size)) {
            zw5.a("Inconsistency between the count of nodes tracked by the state (" + this.nodeToNodeState.get_size() + ") and the children count on the SubcomposeLayout (" + size + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if (!((size - this.reusableCount) - this.precomposedCount >= 0)) {
            zw5.a("Incorrect state. Total children " + size + ". Reusable children " + this.reusableCount + ". Precomposed children " + this.precomposedCount);
        }
        if (this.precomposeMap.get_size() == this.precomposedCount) {
            return;
        }
        zw5.a("Incorrect state. Precomposed children " + this.precomposedCount + ". Map size " + this.precomposeMap.get_size());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final SubcomposeLayoutState.b M(Object slotId, Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> content) throws KotlinNothingValueException {
        N(slotId, content, false);
        return z(slotId);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final SubcomposeLayoutState.a O(Object slotId, Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> content) throws KotlinNothingValueException {
        if (!this.root.b()) {
            return new g(slotId);
        }
        N(slotId, content, true);
        return new h(slotId);
    }

    public final void R(androidx.compose.p004runtime.f fVar) {
        this.compositionContext = fVar;
    }

    public final void S(w wVar) {
        if (this.slotReusePolicy != wVar) {
            this.slotReusePolicy = wVar;
            J(false);
            LayoutNode.K1(this.root, false, false, false, 7, null);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Code duplicated, block: B:41:0x00ac  */
    public final List<dj7> T(Object slotId, Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> content) throws KotlinNothingValueException {
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState;
        I();
        LayoutNode.LayoutState layoutStateI0 = this.root.i0();
        LayoutNode.LayoutState layoutState = LayoutNode.LayoutState.Measuring;
        if (!(layoutStateI0 == layoutState || layoutStateI0 == LayoutNode.LayoutState.LayingOut || layoutStateI0 == LayoutNode.LayoutState.LookaheadMeasuring || layoutStateI0 == LayoutNode.LayoutState.LookaheadLayingOut)) {
            zw5.c("subcompose can only be used inside the measure or layout blocks");
        }
        k58<Object, LayoutNode> k58Var = this.slotIdToNode;
        LayoutNode layoutNodeE = k58Var.e(slotId);
        if (layoutNodeE == null) {
            layoutNodeE = this.precomposeMap.u(slotId);
            if (layoutNodeE != null) {
                this.nodeToNodeState.e(layoutNodeE);
                if (!(this.precomposedCount > 0)) {
                    zw5.c("Check failed.");
                }
                this.precomposedCount--;
            } else {
                layoutNodeE = W(slotId);
                if (layoutNodeE == null) {
                    layoutNodeE = y(this.currentIndex);
                }
            }
            k58Var.x(slotId, layoutNodeE);
        }
        LayoutNode layoutNode = layoutNodeE;
        if (kotlin.collections.m.C0(this.root.W(), this.currentIndex) == layoutNode) {
            layoutNodeSubcompositionsState = this;
        } else {
            int iIndexOf = this.root.W().indexOf(layoutNode);
            if (!(iIndexOf >= this.currentIndex)) {
                zw5.a("Key \"" + slotId + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i = this.currentIndex;
            if (i != iIndexOf) {
                layoutNodeSubcompositionsState = this;
                L(layoutNodeSubcompositionsState, iIndexOf, i, 0, 4, null);
            } else {
                layoutNodeSubcompositionsState = this;
            }
        }
        layoutNodeSubcompositionsState.currentIndex++;
        V(layoutNode, slotId, false, content);
        return (layoutStateI0 == layoutState || layoutStateI0 == LayoutNode.LayoutState.LayingOut) ? layoutNode.Q() : layoutNode.P();
    }

    @Override // com.google.inputmethod.aq1
    public void c() {
        B();
    }

    @Override // com.google.inputmethod.aq1
    public void d() {
        J(true);
    }

    @Override // com.google.inputmethod.aq1
    public void p() {
        J(false);
    }

    public final ej7 x(Function2<? super scc, ? super kx1, ? extends fj7> block) {
        return new d(block, this.NoIntrinsicsMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR$\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR(\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010!\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010$\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R$\u0010+\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R(\u00103\u001a\b\u0012\u0004\u0012\u00020\u001b0,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00105\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u001c\u001a\u0004\b\u0010\u0010\u001e\"\u0004\b4\u0010 R\u0019\u00109\u001a\u0004\u0018\u0001068\u0006¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\b-\u00108R$\u0010<\u001a\u00020\u001b2\u0006\u0010:\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u001e\"\u0004\b;\u0010 ¨\u0006="}, d2 = {"Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$b;", "", "slotId", "Lkotlin/Function0;", "", "content", "Lcom/google/android/bna;", "composition", "<init>", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lcom/google/android/bna;)V", "a", "Ljava/lang/Object;", "i", "()Ljava/lang/Object;", "r", "(Ljava/lang/Object;)V", "b", "Lkotlin/jvm/functions/Function2;", "d", "()Lkotlin/jvm/functions/Function2;", "n", "(Lkotlin/jvm/functions/Function2;)V", "c", "Lcom/google/android/bna;", "()Lcom/google/android/bna;", "m", "(Lcom/google/android/bna;)V", "", "Z", "e", "()Z", "o", "(Z)V", "forceRecompose", "f", "p", "forceReuse", "Lcom/google/android/f49;", "Lcom/google/android/f49;", "h", "()Lcom/google/android/f49;", "q", "(Lcom/google/android/f49;)V", "pausedComposition", "Lcom/google/android/o58;", "g", "Lcom/google/android/o58;", "getActiveState", "()Lcom/google/android/o58;", "k", "(Lcom/google/android/o58;)V", "activeState", "l", "composedWithReusableContentHost", "Lcom/google/android/n48;", "Lcom/google/android/n48;", "()Lcom/google/android/n48;", "operations", "value", "j", "active", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private Object slotId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> content;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private bna composition;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private boolean forceRecompose;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private boolean forceReuse;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private f49 pausedComposition;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private o58<Boolean> activeState;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private boolean composedWithReusableContentHost;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final n48 operations;

        public b(Object obj, Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2, bna bnaVar) {
            this.slotId = obj;
            this.content = function2;
            this.composition = bnaVar;
            this.activeState = s0.e(Boolean.TRUE, null, 2, null);
            this.operations = null;
        }

        public final boolean a() {
            return this.activeState.getValue().booleanValue();
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getComposedWithReusableContentHost() {
            return this.composedWithReusableContentHost;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final bna getComposition() {
            return this.composition;
        }

        public final Function2<androidx.compose.p004runtime.d, Integer, Unit> d() {
            return this.content;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getForceRecompose() {
            return this.forceRecompose;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getForceReuse() {
            return this.forceReuse;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final n48 getOperations() {
            return this.operations;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final f49 getPausedComposition() {
            return this.pausedComposition;
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final Object getSlotId() {
            return this.slotId;
        }

        public final void j(boolean z) {
            this.activeState.setValue(Boolean.valueOf(z));
        }

        public final void k(o58<Boolean> o58Var) {
            this.activeState = o58Var;
        }

        public final void l(boolean z) {
            this.composedWithReusableContentHost = z;
        }

        public final void m(bna bnaVar) {
            this.composition = bnaVar;
        }

        public final void n(Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2) {
            this.content = function2;
        }

        public final void o(boolean z) {
            this.forceRecompose = z;
        }

        public final void p(boolean z) {
            this.forceReuse = z;
        }

        public final void q(f49 f49Var) {
            this.pausedComposition = f49Var;
        }

        public final void r(Object obj) {
            this.slotId = obj;
        }

        public /* synthetic */ b(Object obj, Function2 function2, bna bnaVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, function2, (i & 4) != 0 ? null : bnaVar);
        }
    }
}
