package androidx.compose.ui.node;

import androidx.compose.ui.graphics.layer.GraphicsLayer;
import com.google.inputmethod.b08;
import com.google.inputmethod.dj7;
import com.google.inputmethod.fo6;
import com.google.inputmethod.g16;
import com.google.inputmethod.go6;
import com.google.inputmethod.kx1;
import com.google.inputmethod.nx1;
import com.google.inputmethod.q16;
import com.google.inputmethod.r58;
import com.google.inputmethod.t04;
import com.google.inputmethod.uc;
import com.google.inputmethod.wc;
import com.google.inputmethod.zw5;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\f\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002Ø\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ?\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\t\u0018\u00010\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001b\u0010\u000bJ\u000f\u0010\u001c\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001c\u0010\u000bJ\u000f\u0010\u001d\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001d\u0010\u000bJ\u000f\u0010\u001e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001e\u0010\u000bJ\u000f\u0010\u001f\u001a\u00020\tH\u0000¢\u0006\u0004\b\u001f\u0010\u000bJ\u000f\u0010 \u001a\u00020\tH\u0000¢\u0006\u0004\b \u0010\u000bJ\u000f\u0010!\u001a\u00020\tH\u0016¢\u0006\u0004\b!\u0010\u000bJ\u0017\u0010$\u001a\u00020\t2\u0006\u0010#\u001a\u00020\"H\u0000¢\u0006\u0004\b$\u0010%J\u001b\u0010)\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(0&H\u0016¢\u0006\u0004\b)\u0010*J#\u0010,\u001a\u00020\t2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0014H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\tH\u0016¢\u0006\u0004\b.\u0010\u000bJ\u000f\u0010/\u001a\u00020\tH\u0016¢\u0006\u0004\b/\u0010\u000bJ\r\u00100\u001a\u00020\t¢\u0006\u0004\b0\u0010\u000bJ\u0017\u00103\u001a\u00020\u00012\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\t2\u0006\u00102\u001a\u000201H\u0000¢\u0006\u0004\b5\u00106J\u0015\u00107\u001a\u00020\"2\u0006\u00102\u001a\u000201¢\u0006\u0004\b7\u00108J5\u00109\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\t\u0018\u00010\u0014H\u0014¢\u0006\u0004\b9\u0010:J'\u0010;\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b;\u0010<J\u0017\u0010>\u001a\u00020\t2\u0006\u0010=\u001a\u00020\"H\u0016¢\u0006\u0004\b>\u0010%J\u0018\u0010@\u001a\u00020(2\u0006\u0010?\u001a\u00020'H\u0096\u0002¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020(2\u0006\u0010B\u001a\u00020(H\u0016¢\u0006\u0004\bC\u0010DJ\u0017\u0010E\u001a\u00020(2\u0006\u0010B\u001a\u00020(H\u0016¢\u0006\u0004\bE\u0010DJ\u0017\u0010G\u001a\u00020(2\u0006\u0010F\u001a\u00020(H\u0016¢\u0006\u0004\bG\u0010DJ\u0017\u0010H\u001a\u00020(2\u0006\u0010F\u001a\u00020(H\u0016¢\u0006\u0004\bH\u0010DJ\u0015\u0010J\u001a\u00020\t2\u0006\u0010I\u001a\u00020\"¢\u0006\u0004\bJ\u0010%J\r\u0010K\u001a\u00020\t¢\u0006\u0004\bK\u0010\u000bJ\r\u0010L\u001a\u00020\"¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020\tH\u0000¢\u0006\u0004\bN\u0010\u000bJ\r\u0010O\u001a\u00020\t¢\u0006\u0004\bO\u0010\u000bJ\r\u0010P\u001a\u00020\t¢\u0006\u0004\bP\u0010\u000bJ\r\u0010Q\u001a\u00020\t¢\u0006\u0004\bQ\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010V\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010Y\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR*\u0010`\u001a\u00020(2\u0006\u0010Z\u001a\u00020(8\u0016@PX\u0096\u000e¢\u0006\u0012\n\u0004\b[\u0010X\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010h\u001a\u00020a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\u0016\u0010j\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010UR\"\u0010n\u001a\u00020\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bk\u0010U\u001a\u0004\bl\u0010M\"\u0004\bm\u0010%R\u0016\u0010p\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010UR\u0018\u0010s\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0016\u0010u\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010@R\u0016\u0010w\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010\\R$\u0010z\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\t\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010yR\u0018\u0010|\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010{R\u0017\u0010\u0080\u0001\u001a\u00020}8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u001f\u0010\u0085\u0001\u001a\u00030\u0081\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0005\bb\u0010\u0084\u0001R\u001e\u0010\u0089\u0001\u001a\t\u0012\u0004\u0012\u00020\u00000\u0086\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R&\u0010\u008d\u0001\u001a\u00020\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b\u008a\u0001\u0010U\u001a\u0005\b\u008b\u0001\u0010M\"\u0005\b\u008c\u0001\u0010%R'\u0010\u0090\u0001\u001a\u00020\"2\u0006\u0010Z\u001a\u00020\"8\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\b\u008e\u0001\u0010U\u001a\u0005\b\u008f\u0001\u0010MR\u001e\u0010\u0094\u0001\u001a\t\u0012\u0004\u0012\u00020\t0\u0091\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0018\u0010\u0096\u0001\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0095\u0001\u0010UR-\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u0097\u00012\t\u0010Z\u001a\u0005\u0018\u00010\u0097\u00018\u0016@RX\u0096\u000e¢\u0006\u000e\n\u0005\b>\u0010\u0098\u0001\u001a\u0005\bR\u0010\u0099\u0001R\u0018\u0010\u009c\u0001\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009b\u0001\u0010@R&\u0010 \u0001\u001a\t\u0012\u0004\u0012\u00020\t0\u0091\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u009d\u0001\u0010\u0093\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R&\u0010¢\u0001\u001a\u00020\"8\u0016@\u0016X\u0096\u000e¢\u0006\u0015\n\u0005\b¡\u0001\u0010U\u001a\u0005\b¢\u0001\u0010M\"\u0005\b£\u0001\u0010%R\u001e\u0010¥\u0001\u001a\t\u0012\u0004\u0012\u00020\t0\u0091\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¤\u0001\u0010\u0093\u0001R\u0018\u0010§\u0001\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¦\u0001\u0010UR'\u0010ª\u0001\u001a\u00020\"2\u0006\u0010Z\u001a\u00020\"8B@BX\u0082\u000e¢\u0006\u000e\u001a\u0005\b¨\u0001\u0010M\"\u0005\b©\u0001\u0010%R'\u0010\u00ad\u0001\u001a\u00020\"2\u0006\u0010Z\u001a\u00020\"8B@BX\u0082\u000e¢\u0006\u000e\u001a\u0005\b«\u0001\u0010M\"\u0005\b¬\u0001\u0010%R'\u0010°\u0001\u001a\u00020\"2\u0006\u0010Z\u001a\u00020\"8B@BX\u0082\u000e¢\u0006\u000e\u001a\u0005\b®\u0001\u0010M\"\u0005\b¯\u0001\u0010%R\u0017\u0010³\u0001\u001a\u00020\f8BX\u0082\u0004¢\u0006\b\u001a\u0006\b±\u0001\u0010²\u0001R\u0018\u0010·\u0001\u001a\u00030´\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bµ\u0001\u0010¶\u0001R+\u0010½\u0001\u001a\u00030¸\u00012\u0007\u0010Z\u001a\u00030¸\u00018B@BX\u0082\u000e¢\u0006\u0010\u001a\u0006\b¹\u0001\u0010º\u0001\"\u0006\b»\u0001\u0010¼\u0001R\u0016\u0010¿\u0001\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¾\u0001\u0010MR\u0018\u0010Ã\u0001\u001a\u00030À\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\bÁ\u0001\u0010Â\u0001R\u0016\u0010Æ\u0001\u001a\u0004\u0018\u0001018F¢\u0006\b\u001a\u0006\bÄ\u0001\u0010Å\u0001R\u0016\u0010È\u0001\u001a\u00020\"8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bÇ\u0001\u0010MR\u0018\u0010Ê\u0001\u001a\u00030´\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÉ\u0001\u0010¶\u0001R\u0013\u0010Ì\u0001\u001a\u00020\"8F¢\u0006\u0007\u001a\u0005\bË\u0001\u0010MR\u001e\u0010Ð\u0001\u001a\t\u0012\u0004\u0012\u00020\u00000Í\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\bÎ\u0001\u0010Ï\u0001R\u0019\u0010Ó\u0001\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\bÑ\u0001\u0010Ò\u0001R\u0016\u0010Õ\u0001\u001a\u00020(8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÔ\u0001\u0010]R\u0016\u0010×\u0001\u001a\u00020(8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÖ\u0001\u0010]¨\u0006Ù\u0001"}, d2 = {"Landroidx/compose/ui/node/LookaheadPassDelegate;", "Landroidx/compose/ui/layout/o;", "Lcom/google/android/dj7;", "Lcom/google/android/wc;", "Lcom/google/android/b08;", "Landroidx/compose/ui/node/f;", "layoutNodeLayoutDelegate", "<init>", "(Landroidx/compose/ui/node/f;)V", "", "r1", "()V", "Landroidx/compose/ui/node/LayoutNode;", "node", "O2", "(Landroidx/compose/ui/node/LayoutNode;)V", "Lcom/google/android/g16;", "position", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/m;", "layerBlock", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "z2", "(JFLkotlin/jvm/functions/Function1;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "p2", "t1", "g2", "n2", "d2", "l2", "c0", "", "inLookahead", "e2", "(Z)V", "", "Lcom/google/android/uc;", "", "r", "()Ljava/util/Map;", "block", "t0", "(Lkotlin/jvm/functions/Function1;)V", "requestLayout", "T", "i2", "Lcom/google/android/kx1;", "constraints", "r0", "(J)Landroidx/compose/ui/layout/o;", "v2", "(J)V", "D2", "(J)Z", "X0", "(JFLkotlin/jvm/functions/Function1;)V", "W0", "(JFLandroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "newMFR", "z", "alignmentLine", "J", "(Lcom/google/android/uc;)I", "height", "o0", "(I)I", "q0", "width", "d0", "W", "forceRequest", "X1", "Y1", "P2", "()Z", "s2", "E2", "q2", "m2", "f", "Landroidx/compose/ui/node/f;", "g", "Z", "relayoutWithoutParentInProgress", "h", "I", "previousPlaceOrder", "value", "i", "F", "()I", "M2", "(I)V", "placeOrder", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "j", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "M1", "()Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "L2", "(Landroidx/compose/ui/node/LayoutNode$UsageByParent;)V", "measuredByParent", "k", "duringAlignmentLinesQuery", "l", "U1", "setPlacedOnce$ui", "placedOnce", "m", "measuredOnce", "n", "Lcom/google/android/kx1;", "lookaheadConstraints", "o", "lastPosition", "p", "lastZIndex", "q", "Lkotlin/jvm/functions/Function1;", "lastLayerBlock", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "lastExplicitLayer", "Landroidx/compose/ui/node/LookaheadPassDelegate$PlacedState;", "s", "Landroidx/compose/ui/node/LookaheadPassDelegate$PlacedState;", "_placedState", "Landroidx/compose/ui/node/AlignmentLines;", "t", "Landroidx/compose/ui/node/AlignmentLines;", "()Landroidx/compose/ui/node/AlignmentLines;", "alignmentLines", "Lcom/google/android/r58;", "u", "Lcom/google/android/r58;", "_childDelegates", "v", "getChildDelegatesDirty$ui", "F2", "childDelegatesDirty", "w", "z1", "layingOutChildren", "Lkotlin/Function0;", "x", "Lkotlin/jvm/functions/Function0;", "layoutChildrenBlock", "y", "parentDataDirty", "", "Ljava/lang/Object;", "()Ljava/lang/Object;", "parentData", "A", "performMeasureConstraints", "B", "getPerformMeasureBlock$ui", "()Lkotlin/jvm/functions/Function0;", "performMeasureBlock", "C", "isPlacedUnderMotionFrameOfReference", "N2", "D", "layoutModifierBlock", "E", "onNodePlacedCalled", "getMeasurePending", "K2", "measurePending", "B1", "H2", "layoutPending", "C1", "I2", "layoutPendingForAlignment", "a1", "()Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/node/NodeCoordinator;", "P1", "()Landroidx/compose/ui/node/NodeCoordinator;", "outerCoordinator", "Landroidx/compose/ui/node/LayoutNode$LayoutState;", "F1", "()Landroidx/compose/ui/node/LayoutNode$LayoutState;", "J2", "(Landroidx/compose/ui/node/LayoutNode$LayoutState;)V", "layoutState", "x1", "detachedFromParentLookaheadPlacement", "Landroidx/compose/ui/node/MeasurePassDelegate;", "I1", "()Landroidx/compose/ui/node/MeasurePassDelegate;", "measurePassDelegate", "y1", "()Lcom/google/android/kx1;", "lastConstraints", "b2", "isPlaced", "h0", "innerCoordinator", "N1", "needsToBePlacedInApproach", "", "v1", "()Ljava/util/List;", "childDelegates", "a0", "()Lcom/google/android/wc;", "parentAlignmentLinesOwner", "J0", "measuredWidth", "G0", "measuredHeight", "PlacedState", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LookaheadPassDelegate extends androidx.compose.ui.layout.o implements dj7, wc, b08 {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private boolean isPlacedUnderMotionFrameOfReference;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private boolean onNodePlacedCalled;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final f layoutNodeLayoutDelegate;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean relayoutWithoutParentInProgress;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private boolean duringAlignmentLinesQuery;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private boolean placedOnce;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private boolean measuredOnce;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private kx1 lookaheadConstraints;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private float lastZIndex;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private Function1<? super androidx.compose.ui.graphics.m, Unit> lastLayerBlock;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private GraphicsLayer lastExplicitLayer;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private boolean layingOutChildren;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int previousPlaceOrder = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private int placeOrder = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private LayoutNode.UsageByParent measuredByParent = LayoutNode.UsageByParent.NotUsed;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private long lastPosition = g16.INSTANCE.b();

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private PlacedState _placedState = PlacedState.IsNotPlaced;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final AlignmentLines alignmentLines = new h(this);

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final r58<LookaheadPassDelegate> _childDelegates = new r58<>(new LookaheadPassDelegate[16], 0);

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private boolean childDelegatesDirty = true;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final Function0<Unit> layoutChildrenBlock = new Function0<Unit>() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$layoutChildrenBlock$1
        {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            m25invoke();
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m25invoke() {
            this.this$0.t1();
            this.this$0.t0(new Function1<wc, Unit>() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$layoutChildrenBlock$1.1
                public final void a(wc wcVar) {
                    wcVar.getAlignmentLines().t(false);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((wc) obj);
                    return Unit.a;
                }
            });
            i lookaheadDelegate = this.this$0.h0().getLookaheadDelegate();
            if (lookaheadDelegate != null) {
                boolean isPlacingForAlignment = lookaheadDelegate.getIsPlacingForAlignment();
                List<LayoutNode> listR = this.this$0.a1().R();
                int size = listR.size();
                for (int i = 0; i < size; i++) {
                    i lookaheadDelegate2 = listR.get(i).x0().getLookaheadDelegate();
                    if (lookaheadDelegate2 != null) {
                        lookaheadDelegate2.g2(isPlacingForAlignment);
                    }
                }
            }
            i lookaheadDelegate3 = this.this$0.h0().getLookaheadDelegate();
            Intrinsics.g(lookaheadDelegate3);
            lookaheadDelegate3.z1().l();
            i lookaheadDelegate4 = this.this$0.h0().getLookaheadDelegate();
            if (lookaheadDelegate4 != null) {
                lookaheadDelegate4.getIsPlacingForAlignment();
                List<LayoutNode> listR2 = this.this$0.a1().R();
                int size2 = listR2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    i lookaheadDelegate5 = listR2.get(i2).x0().getLookaheadDelegate();
                    if (lookaheadDelegate5 != null) {
                        lookaheadDelegate5.g2(false);
                    }
                }
            }
            this.this$0.r1();
            this.this$0.t0(new Function1<wc, Unit>() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$layoutChildrenBlock$1.4
                public final void a(wc wcVar) {
                    wcVar.getAlignmentLines().q(wcVar.getAlignmentLines().getUsedDuringParentLayout());
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((wc) obj);
                    return Unit.a;
                }
            });
        }
    };

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private boolean parentDataDirty = true;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private Object parentData = I1().getParentData();

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private long performMeasureConstraints = nx1.b(0, 0, 0, 0, 15, null);

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final Function0<Unit> performMeasureBlock = new Function0<Unit>() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$performMeasureBlock$1
        {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            m27invoke();
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m27invoke() {
            i lookaheadDelegate = this.this$0.P1().getLookaheadDelegate();
            Intrinsics.g(lookaheadDelegate);
            lookaheadDelegate.r0(this.this$0.performMeasureConstraints);
        }
    };

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final Function0<Unit> layoutModifierBlock = new Function0<Unit>() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$layoutModifierBlock$1
        {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            m26invoke();
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m26invoke() {
            i lookaheadDelegate;
            androidx.compose.ui.layout.o.a placementScope = null;
            if (go6.a(this.this$0.a1()) || this.this$0.layoutNodeLayoutDelegate.getDetachedFromParentLookaheadPlacement()) {
                NodeCoordinator wrappedBy = this.this$0.P1().getWrappedBy();
                if (wrappedBy != null) {
                    placementScope = wrappedBy.getPlacementScope();
                }
            } else {
                NodeCoordinator wrappedBy2 = this.this$0.P1().getWrappedBy();
                if (wrappedBy2 != null && (lookaheadDelegate = wrappedBy2.getLookaheadDelegate()) != null) {
                    placementScope = lookaheadDelegate.getPlacementScope();
                }
            }
            if (placementScope == null) {
                placementScope = fo6.b(this.this$0.a1()).getPlacementScope();
            }
            LookaheadPassDelegate lookaheadPassDelegate = this.this$0;
            i lookaheadDelegate2 = lookaheadPassDelegate.P1().getLookaheadDelegate();
            Intrinsics.g(lookaheadDelegate2);
            androidx.compose.ui.layout.o.a.F(placementScope, lookaheadDelegate2, lookaheadPassDelegate.lastPosition, 0.0f, 2, null);
        }
    };

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/node/LookaheadPassDelegate$PlacedState;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private enum PlacedState {
        IsPlacedInLookahead,
        IsPlacedInApproach,
        IsNotPlaced;

        private static final /* synthetic */ EnumEntries e = kotlin.enums.a.a(a());
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LayoutNode.LayoutState.values().length];
            try {
                iArr[LayoutNode.LayoutState.LookaheadMeasuring.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LayoutNode.LayoutState.LookaheadLayingOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[LayoutNode.UsageByParent.values().length];
            try {
                iArr2[LayoutNode.UsageByParent.InMeasureBlock.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[LayoutNode.UsageByParent.InLayoutBlock.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public LookaheadPassDelegate(f fVar) {
        this.layoutNodeLayoutDelegate = fVar;
    }

    private final boolean B1() {
        return this.layoutNodeLayoutDelegate.getLookaheadLayoutPending();
    }

    private final boolean C1() {
        return this.layoutNodeLayoutDelegate.getLookaheadLayoutPendingForAlignment();
    }

    private final LayoutNode.LayoutState F1() {
        return this.layoutNodeLayoutDelegate.getLayoutState();
    }

    private final void H2(boolean z) {
        this.layoutNodeLayoutDelegate.U(z);
    }

    private final void I2(boolean z) {
        this.layoutNodeLayoutDelegate.V(z);
    }

    private final void J2(LayoutNode.LayoutState layoutState) {
        this.layoutNodeLayoutDelegate.R(layoutState);
    }

    private final void K2(boolean z) {
        this.layoutNodeLayoutDelegate.W(z);
    }

    private final void O2(LayoutNode node) {
        LayoutNode.UsageByParent usageByParent;
        LayoutNode layoutNodeC0 = node.C0();
        if (layoutNodeC0 == null) {
            this.measuredByParent = LayoutNode.UsageByParent.NotUsed;
            return;
        }
        if (!(this.measuredByParent == LayoutNode.UsageByParent.NotUsed || node.getCanMultiMeasure())) {
            zw5.c("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
        }
        int i = a.$EnumSwitchMapping$0[layoutNodeC0.i0().ordinal()];
        if (i == 1 || i == 2) {
            usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
        } else {
            if (i != 3 && i != 4) {
                throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + layoutNodeC0.i0());
            }
            usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
        }
        this.measuredByParent = usageByParent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NodeCoordinator P1() {
        return this.layoutNodeLayoutDelegate.z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutNode a1() {
        return this.layoutNodeLayoutDelegate.getLayoutNode();
    }

    private final void g2() {
        PlacedState placedState = this._placedState;
        if (x1()) {
            this._placedState = PlacedState.IsPlacedInApproach;
        } else {
            this._placedState = PlacedState.IsPlacedInLookahead;
        }
        if (placedState != PlacedState.IsPlacedInLookahead && this.layoutNodeLayoutDelegate.getLookaheadMeasurePending()) {
            LayoutNode.G1(a1(), true, false, false, 6, null);
        }
        r58<LayoutNode> r58VarL0 = a1().L0();
        LayoutNode[] layoutNodeArr = r58VarL0.content;
        int size = r58VarL0.getSize();
        for (int i = 0; i < size; i++) {
            LayoutNode layoutNode = layoutNodeArr[i];
            LookaheadPassDelegate lookaheadPassDelegateL0 = layoutNode.l0();
            if (lookaheadPassDelegateL0 == null) {
                throw new IllegalArgumentException("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
            }
            if (lookaheadPassDelegateL0.getPlaceOrder() != Integer.MAX_VALUE) {
                lookaheadPassDelegateL0.g2();
                layoutNode.L1(layoutNode);
            }
        }
    }

    private final void n2() {
        r58<LayoutNode> r58VarL0 = a1().L0();
        LayoutNode[] layoutNodeArr = r58VarL0.content;
        int size = r58VarL0.getSize();
        for (int i = 0; i < size; i++) {
            LayoutNode layoutNode = layoutNodeArr[i];
            if (layoutNode.k0() && layoutNode.s0() == LayoutNode.UsageByParent.InMeasureBlock) {
                LookaheadPassDelegate lookaheadPassDelegate = layoutNode.getLayoutDelegate().getLookaheadPassDelegate();
                Intrinsics.g(lookaheadPassDelegate);
                kx1 kx1VarK = layoutNode.getLayoutDelegate().k();
                Intrinsics.g(kx1VarK);
                if (lookaheadPassDelegate.D2(kx1VarK.getValue())) {
                    LayoutNode.G1(a1(), false, false, false, 7, null);
                }
            }
        }
    }

    private final void p2() {
        LayoutNode.UsageByParent intrinsicsUsageByParent;
        LayoutNode.G1(a1(), false, false, false, 7, null);
        LayoutNode layoutNodeC0 = a1().C0();
        if (layoutNodeC0 == null || a1().getIntrinsicsUsageByParent() != LayoutNode.UsageByParent.NotUsed) {
            return;
        }
        LayoutNode layoutNodeA1 = a1();
        int i = a.$EnumSwitchMapping$0[layoutNodeC0.i0().ordinal()];
        if (i != 2) {
            intrinsicsUsageByParent = i != 3 ? layoutNodeC0.getIntrinsicsUsageByParent() : LayoutNode.UsageByParent.InLayoutBlock;
        } else {
            intrinsicsUsageByParent = LayoutNode.UsageByParent.InMeasureBlock;
        }
        layoutNodeA1.V1(intrinsicsUsageByParent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r1() {
        r58<LayoutNode> r58VarL0 = a1().L0();
        LayoutNode[] layoutNodeArr = r58VarL0.content;
        int size = r58VarL0.getSize();
        for (int i = 0; i < size; i++) {
            LookaheadPassDelegate lookaheadPassDelegate = layoutNodeArr[i].getLayoutDelegate().getLookaheadPassDelegate();
            Intrinsics.g(lookaheadPassDelegate);
            if (lookaheadPassDelegate.previousPlaceOrder != lookaheadPassDelegate.getPlaceOrder() && lookaheadPassDelegate.getPlaceOrder() == Integer.MAX_VALUE) {
                lookaheadPassDelegate.e2(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t1() {
        this.layoutNodeLayoutDelegate.X(0);
        r58<LayoutNode> r58VarL0 = a1().L0();
        LayoutNode[] layoutNodeArr = r58VarL0.content;
        int size = r58VarL0.getSize();
        for (int i = 0; i < size; i++) {
            LookaheadPassDelegate lookaheadPassDelegate = layoutNodeArr[i].getLayoutDelegate().getLookaheadPassDelegate();
            Intrinsics.g(lookaheadPassDelegate);
            lookaheadPassDelegate.previousPlaceOrder = lookaheadPassDelegate.getPlaceOrder();
            lookaheadPassDelegate.M2(Integer.MAX_VALUE);
            if (lookaheadPassDelegate.measuredByParent == LayoutNode.UsageByParent.InLayoutBlock) {
                lookaheadPassDelegate.measuredByParent = LayoutNode.UsageByParent.NotUsed;
            }
        }
    }

    private final boolean x1() {
        return this.layoutNodeLayoutDelegate.getDetachedFromParentLookaheadPlacement();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final void z2(long position, float zIndex, Function1<? super androidx.compose.ui.graphics.m, Unit> layerBlock, GraphicsLayer layer) throws Throwable {
        LayoutNode layoutNodeA1 = a1();
        try {
            LayoutNode layoutNodeC0 = a1().C0();
            LayoutNode.LayoutState layoutStateI0 = layoutNodeC0 != null ? layoutNodeC0.i0() : null;
            LayoutNode.LayoutState layoutState = LayoutNode.LayoutState.LookaheadLayingOut;
            if (layoutStateI0 == layoutState) {
                this.layoutNodeLayoutDelegate.Q(false);
            }
            if (a1().getIsDeactivated()) {
                zw5.a("place is called on a deactivated node");
            }
            J2(layoutState);
            this.placedOnce = true;
            this.onNodePlacedCalled = false;
            if (!g16.j(position, this.lastPosition)) {
                if (this.layoutNodeLayoutDelegate.getLookaheadCoordinatesAccessedDuringModifierPlacement() || this.layoutNodeLayoutDelegate.getLookaheadCoordinatesAccessedDuringPlacement()) {
                    H2(true);
                }
                i2();
            }
            m mVarB = fo6.b(a1());
            this.lastPosition = position;
            if (B1() || !b2()) {
                this.layoutNodeLayoutDelegate.S(false);
                getAlignmentLines().r(false);
                OwnerSnapshotObserver snapshotObserver = mVarB.getSnapshotObserver();
                snapshotObserver.observer.k(a1(), snapshotObserver.onCommitAffectingLayoutModifierInLookahead, this.layoutModifierBlock);
            } else {
                i lookaheadDelegate = P1().getLookaheadDelegate();
                Intrinsics.g(lookaheadDelegate);
                lookaheadDelegate.H2(position);
                s2();
            }
            this.lastZIndex = zIndex;
            this.lastLayerBlock = layerBlock;
            this.lastExplicitLayer = layer;
            J2(LayoutNode.LayoutState.Idle);
            Unit unit = Unit.a;
        } catch (Throwable th) {
            layoutNodeA1.O1(th);
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final boolean D2(long constraints) throws Throwable {
        long jC;
        LayoutNode layoutNodeA1 = a1();
        try {
            if (a1().getIsDeactivated()) {
                zw5.a("measure is called on a deactivated node");
            }
            LayoutNode layoutNodeC0 = a1().C0();
            a1().Q1(a1().getCanMultiMeasure() || (layoutNodeC0 != null && layoutNodeC0.getCanMultiMeasure()));
            if (!a1().k0()) {
                kx1 kx1Var = this.lookaheadConstraints;
                if (kx1Var == null ? false : kx1.f(kx1Var.getValue(), constraints)) {
                    m owner = a1().getOwner();
                    if (owner != null) {
                        owner.F(a1(), true);
                    }
                    a1().N1();
                    return false;
                }
            }
            this.lookaheadConstraints = kx1.a(constraints);
            Z0(constraints);
            getAlignmentLines().s(false);
            t0(new Function1<wc, Unit>() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$remeasure$1$2
                public final void a(wc wcVar) {
                    wcVar.getAlignmentLines().u(false);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((wc) obj);
                    return Unit.a;
                }
            });
            if (this.measuredOnce) {
                jC = getMeasuredSize();
            } else {
                long j = t04.INVALID_ID;
                jC = q16.c((j & 4294967295L) | (j << 32));
            }
            this.measuredOnce = true;
            i lookaheadDelegate = P1().getLookaheadDelegate();
            if (!(lookaheadDelegate != null)) {
                zw5.c("Lookahead result from lookaheadRemeasure cannot be null");
            }
            this.layoutNodeLayoutDelegate.J(constraints);
            Y0(q16.c((((long) lookaheadDelegate.getHeight()) & 4294967295L) | (((long) lookaheadDelegate.getWidth()) << 32)));
            return (((int) (jC >> 32)) == lookaheadDelegate.getWidth() && ((int) (jC & 4294967295L)) == lookaheadDelegate.getHeight()) ? false : true;
        } catch (Throwable th) {
            layoutNodeA1.O1(th);
            throw new KotlinNothingValueException();
        }
    }

    public final void E2() {
        LookaheadPassDelegate lookaheadPassDelegate;
        LayoutNode layoutNodeC0;
        try {
            this.relayoutWithoutParentInProgress = true;
            if (!this.placedOnce) {
                zw5.c("replace() called on item that was not placed");
            }
            this.onNodePlacedCalled = false;
            boolean zB2 = b2();
            lookaheadPassDelegate = this;
            try {
                lookaheadPassDelegate.z2(this.lastPosition, 0.0f, this.lastLayerBlock, this.lastExplicitLayer);
                if (zB2 && !lookaheadPassDelegate.onNodePlacedCalled && (layoutNodeC0 = a1().C0()) != null) {
                    LayoutNode.E1(layoutNodeC0, false, 1, null);
                }
                lookaheadPassDelegate.relayoutWithoutParentInProgress = false;
            } catch (Throwable th) {
                th = th;
                lookaheadPassDelegate.relayoutWithoutParentInProgress = false;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            lookaheadPassDelegate = this;
        }
    }

    @Override // com.google.inputmethod.wc
    /* JADX INFO: renamed from: F, reason: from getter */
    public int getPlaceOrder() {
        return this.placeOrder;
    }

    public final void F2(boolean z) {
        this.childDelegatesDirty = z;
    }

    @Override // androidx.compose.ui.layout.o
    public int G0() {
        i lookaheadDelegate = P1().getLookaheadDelegate();
        Intrinsics.g(lookaheadDelegate);
        return lookaheadDelegate.G0();
    }

    public final MeasurePassDelegate I1() {
        return this.layoutNodeLayoutDelegate.getMeasurePassDelegate();
    }

    @Override // com.google.inputmethod.ij7
    public int J(uc alignmentLine) {
        LayoutNode layoutNodeC0 = a1().C0();
        if ((layoutNodeC0 != null ? layoutNodeC0.i0() : null) == LayoutNode.LayoutState.LookaheadMeasuring) {
            getAlignmentLines().u(true);
        } else {
            LayoutNode layoutNodeC1 = a1().C0();
            if ((layoutNodeC1 != null ? layoutNodeC1.i0() : null) == LayoutNode.LayoutState.LookaheadLayingOut) {
                getAlignmentLines().t(true);
            }
        }
        this.duringAlignmentLinesQuery = true;
        i lookaheadDelegate = P1().getLookaheadDelegate();
        Intrinsics.g(lookaheadDelegate);
        int iJ = lookaheadDelegate.J(alignmentLine);
        this.duringAlignmentLinesQuery = false;
        return iJ;
    }

    @Override // androidx.compose.ui.layout.o
    public int J0() {
        i lookaheadDelegate = P1().getLookaheadDelegate();
        Intrinsics.g(lookaheadDelegate);
        return lookaheadDelegate.J0();
    }

    public final void L2(LayoutNode.UsageByParent usageByParent) {
        this.measuredByParent = usageByParent;
    }

    /* JADX INFO: renamed from: M1, reason: from getter */
    public final LayoutNode.UsageByParent getMeasuredByParent() {
        return this.measuredByParent;
    }

    public void M2(int i) {
        this.placeOrder = i;
    }

    public final boolean N1() {
        return go6.a(a1()) || x1();
    }

    public void N2(boolean z) {
        this.isPlacedUnderMotionFrameOfReference = z;
    }

    public final boolean P2() {
        if (getParentData() == null) {
            i lookaheadDelegate = P1().getLookaheadDelegate();
            Intrinsics.g(lookaheadDelegate);
            if (lookaheadDelegate.getParentData() == null) {
                return false;
            }
        }
        if (!this.parentDataDirty) {
            return false;
        }
        this.parentDataDirty = false;
        i lookaheadDelegate2 = P1().getLookaheadDelegate();
        Intrinsics.g(lookaheadDelegate2);
        this.parentData = lookaheadDelegate2.getParentData();
        return true;
    }

    @Override // com.google.inputmethod.wc
    public void T() {
        LayoutNode.G1(a1(), false, false, false, 7, null);
    }

    /* JADX INFO: renamed from: U1, reason: from getter */
    public final boolean getPlacedOnce() {
        return this.placedOnce;
    }

    @Override // com.google.inputmethod.f66
    public int W(int width) {
        p2();
        i lookaheadDelegate = P1().getLookaheadDelegate();
        Intrinsics.g(lookaheadDelegate);
        return lookaheadDelegate.W(width);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.o
    public void W0(long position, float zIndex, GraphicsLayer layer) throws Throwable {
        z2(position, zIndex, null, layer);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.o
    public void X0(long position, float zIndex, Function1<? super androidx.compose.ui.graphics.m, Unit> layerBlock) throws Throwable {
        z2(position, zIndex, layerBlock, null);
    }

    public final void X1(boolean forceRequest) {
        LayoutNode layoutNode;
        LayoutNode layoutNodeC0 = a1().C0();
        LayoutNode.UsageByParent intrinsicsUsageByParent = a1().getIntrinsicsUsageByParent();
        if (layoutNodeC0 == null || intrinsicsUsageByParent == LayoutNode.UsageByParent.NotUsed) {
            return;
        }
        do {
            layoutNode = layoutNodeC0;
            if (layoutNode.getIntrinsicsUsageByParent() != intrinsicsUsageByParent) {
                break;
            } else {
                layoutNodeC0 = layoutNode.C0();
            }
        } while (layoutNodeC0 != null);
        int i = a.$EnumSwitchMapping$1[intrinsicsUsageByParent.ordinal()];
        if (i == 1) {
            if (layoutNode.getLookaheadRoot() != null) {
                LayoutNode.G1(layoutNode, forceRequest, false, false, 6, null);
                return;
            } else {
                LayoutNode.K1(layoutNode, forceRequest, false, false, 6, null);
                return;
            }
        }
        if (i != 2) {
            throw new IllegalStateException("Intrinsics isn't used by the parent");
        }
        if (layoutNode.getLookaheadRoot() != null) {
            layoutNode.D1(forceRequest);
        } else {
            layoutNode.H1(forceRequest);
        }
    }

    public final void Y1() {
        this.parentDataDirty = true;
    }

    @Override // com.google.inputmethod.wc
    public wc a0() {
        f layoutDelegate;
        LayoutNode layoutNodeC0 = a1().C0();
        if (layoutNodeC0 == null || (layoutDelegate = layoutNodeC0.getLayoutDelegate()) == null) {
            return null;
        }
        return layoutDelegate.o();
    }

    public final boolean b2() {
        return this._placedState != PlacedState.IsNotPlaced;
    }

    @Override // com.google.inputmethod.wc
    public void c0() {
        this.layingOutChildren = true;
        getAlignmentLines().o();
        if (B1()) {
            n2();
        }
        i lookaheadDelegate = h0().getLookaheadDelegate();
        Intrinsics.g(lookaheadDelegate);
        if (C1() || (!this.duringAlignmentLinesQuery && !lookaheadDelegate.getIsPlacingForAlignment() && B1())) {
            H2(false);
            LayoutNode.LayoutState layoutStateF1 = F1();
            J2(LayoutNode.LayoutState.LookaheadLayingOut);
            this.layoutNodeLayoutDelegate.T(false);
            OwnerSnapshotObserver snapshotObserver = fo6.b(a1()).getSnapshotObserver();
            LayoutNode layoutNodeA1 = a1();
            Function0<Unit> function0 = this.layoutChildrenBlock;
            snapshotObserver.observer.k(layoutNodeA1, snapshotObserver.onCommitAffectingLookahead, function0);
            J2(layoutStateF1);
            if (this.layoutNodeLayoutDelegate.getLookaheadCoordinatesAccessedDuringPlacement() && lookaheadDelegate.getIsPlacingForAlignment()) {
                requestLayout();
            }
            I2(false);
        }
        if (getAlignmentLines().getUsedDuringParentLayout()) {
            getAlignmentLines().q(true);
        }
        if (getAlignmentLines().getDirty() && getAlignmentLines().k()) {
            getAlignmentLines().n();
        }
        this.layingOutChildren = false;
    }

    @Override // com.google.inputmethod.f66
    public int d0(int width) {
        p2();
        i lookaheadDelegate = P1().getLookaheadDelegate();
        Intrinsics.g(lookaheadDelegate);
        return lookaheadDelegate.d0(width);
    }

    public final void d2() {
        H2(true);
        I2(true);
    }

    public final void e2(boolean inLookahead) {
        if (inLookahead && N1()) {
            return;
        }
        if (inLookahead || N1()) {
            this._placedState = PlacedState.IsNotPlaced;
            r58<LayoutNode> r58VarL0 = a1().L0();
            LayoutNode[] layoutNodeArr = r58VarL0.content;
            int size = r58VarL0.getSize();
            for (int i = 0; i < size; i++) {
                LookaheadPassDelegate lookaheadPassDelegate = layoutNodeArr[i].getLayoutDelegate().getLookaheadPassDelegate();
                Intrinsics.g(lookaheadPassDelegate);
                lookaheadPassDelegate.e2(true);
            }
        }
    }

    @Override // com.google.inputmethod.ij7, com.google.inputmethod.f66
    /* JADX INFO: renamed from: f, reason: from getter */
    public Object getParentData() {
        return this.parentData;
    }

    @Override // com.google.inputmethod.wc
    public NodeCoordinator h0() {
        return a1().b0();
    }

    public final void i2() {
        if (this.layoutNodeLayoutDelegate.getChildrenAccessingLookaheadCoordinatesDuringPlacement() > 0) {
            r58<LayoutNode> r58VarL0 = a1().L0();
            LayoutNode[] layoutNodeArr = r58VarL0.content;
            int size = r58VarL0.getSize();
            for (int i = 0; i < size; i++) {
                LayoutNode layoutNode = layoutNodeArr[i];
                f layoutDelegate = layoutNode.getLayoutDelegate();
                if ((layoutDelegate.getLookaheadCoordinatesAccessedDuringPlacement() || layoutDelegate.getLookaheadCoordinatesAccessedDuringModifierPlacement()) && !layoutDelegate.getLookaheadLayoutPending()) {
                    LayoutNode.E1(layoutNode, false, 1, null);
                }
                LookaheadPassDelegate lookaheadPassDelegate = layoutDelegate.getLookaheadPassDelegate();
                if (lookaheadPassDelegate != null) {
                    lookaheadPassDelegate.i2();
                }
            }
        }
    }

    @Override // com.google.inputmethod.wc
    /* JADX INFO: renamed from: j, reason: from getter */
    public AlignmentLines getAlignmentLines() {
        return this.alignmentLines;
    }

    public final void l2() {
        if (this._placedState != PlacedState.IsNotPlaced || go6.a(a1())) {
            return;
        }
        this.layoutNodeLayoutDelegate.Q(true);
    }

    public final void m2() {
        this._placedState = PlacedState.IsPlacedInLookahead;
    }

    @Override // com.google.inputmethod.f66
    public int o0(int height) {
        p2();
        i lookaheadDelegate = P1().getLookaheadDelegate();
        Intrinsics.g(lookaheadDelegate);
        return lookaheadDelegate.o0(height);
    }

    @Override // com.google.inputmethod.f66
    public int q0(int height) {
        p2();
        i lookaheadDelegate = P1().getLookaheadDelegate();
        Intrinsics.g(lookaheadDelegate);
        return lookaheadDelegate.q0(height);
    }

    public final void q2() {
        M2(Integer.MAX_VALUE);
        this.previousPlaceOrder = Integer.MAX_VALUE;
        this._placedState = PlacedState.IsNotPlaced;
    }

    @Override // com.google.inputmethod.wc
    public Map<uc, Integer> r() {
        if (!this.duringAlignmentLinesQuery) {
            if (F1() == LayoutNode.LayoutState.LookaheadMeasuring) {
                getAlignmentLines().s(true);
                if (getAlignmentLines().getDirty()) {
                    this.layoutNodeLayoutDelegate.E();
                }
            } else {
                getAlignmentLines().r(true);
            }
        }
        i lookaheadDelegate = h0().getLookaheadDelegate();
        if (lookaheadDelegate != null) {
            lookaheadDelegate.g2(true);
        }
        c0();
        i lookaheadDelegate2 = h0().getLookaheadDelegate();
        if (lookaheadDelegate2 != null) {
            lookaheadDelegate2.g2(false);
        }
        return getAlignmentLines().h();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    @Override // com.google.inputmethod.dj7
    public androidx.compose.ui.layout.o r0(long constraints) throws Throwable {
        LayoutNode layoutNodeC0 = a1().C0();
        if ((layoutNodeC0 != null ? layoutNodeC0.i0() : null) == LayoutNode.LayoutState.LookaheadMeasuring) {
            this.layoutNodeLayoutDelegate.P(false);
        } else {
            LayoutNode layoutNodeC1 = a1().C0();
            if ((layoutNodeC1 != null ? layoutNodeC1.i0() : null) == LayoutNode.LayoutState.LookaheadLayingOut) {
                this.layoutNodeLayoutDelegate.P(false);
            }
        }
        O2(a1());
        if (a1().getIntrinsicsUsageByParent() == LayoutNode.UsageByParent.NotUsed) {
            a1().D();
        }
        D2(constraints);
        return this;
    }

    @Override // com.google.inputmethod.wc
    public void requestLayout() {
        LayoutNode.E1(a1(), false, 1, null);
    }

    public final void s2() {
        this.onNodePlacedCalled = true;
        LayoutNode layoutNodeC0 = a1().C0();
        if ((this._placedState != PlacedState.IsPlacedInLookahead && !x1()) || (this._placedState != PlacedState.IsPlacedInApproach && x1())) {
            g2();
            if (this.relayoutWithoutParentInProgress && layoutNodeC0 != null) {
                LayoutNode.E1(layoutNodeC0, false, 1, null);
            }
        }
        if (layoutNodeC0 == null) {
            M2(0);
        } else if (!this.relayoutWithoutParentInProgress && (layoutNodeC0.i0() == LayoutNode.LayoutState.LayingOut || layoutNodeC0.i0() == LayoutNode.LayoutState.LookaheadLayingOut)) {
            if (!(getPlaceOrder() == Integer.MAX_VALUE)) {
                zw5.c("Place was called on a node which was placed already");
            }
            M2(layoutNodeC0.getLayoutDelegate().getNextChildLookaheadPlaceOrder());
            f layoutDelegate = layoutNodeC0.getLayoutDelegate();
            layoutDelegate.X(layoutDelegate.getNextChildLookaheadPlaceOrder() + 1);
        }
        c0();
    }

    @Override // com.google.inputmethod.wc
    public void t0(Function1<? super wc, Unit> block) {
        r58<LayoutNode> r58VarL0 = a1().L0();
        LayoutNode[] layoutNodeArr = r58VarL0.content;
        int size = r58VarL0.getSize();
        for (int i = 0; i < size; i++) {
            wc wcVarO = layoutNodeArr[i].getLayoutDelegate().o();
            Intrinsics.g(wcVarO);
            block.invoke(wcVarO);
        }
    }

    public final List<LookaheadPassDelegate> v1() {
        a1().R();
        if (!this.childDelegatesDirty) {
            return this._childDelegates.i();
        }
        LayoutNode layoutNodeA1 = a1();
        r58<LookaheadPassDelegate> r58Var = this._childDelegates;
        r58<LayoutNode> r58VarL0 = layoutNodeA1.L0();
        LayoutNode[] layoutNodeArr = r58VarL0.content;
        int size = r58VarL0.getSize();
        for (int i = 0; i < size; i++) {
            LayoutNode layoutNode = layoutNodeArr[i];
            if (r58Var.getSize() <= i) {
                LookaheadPassDelegate lookaheadPassDelegate = layoutNode.getLayoutDelegate().getLookaheadPassDelegate();
                Intrinsics.g(lookaheadPassDelegate);
                r58Var.c(lookaheadPassDelegate);
            } else {
                LookaheadPassDelegate lookaheadPassDelegate2 = layoutNode.getLayoutDelegate().getLookaheadPassDelegate();
                Intrinsics.g(lookaheadPassDelegate2);
                r58Var.y(i, lookaheadPassDelegate2);
            }
        }
        r58Var.v(layoutNodeA1.R().size(), r58Var.getSize());
        this.childDelegatesDirty = false;
        return this._childDelegates.i();
    }

    public final void v2(long constraints) {
        J2(LayoutNode.LayoutState.LookaheadMeasuring);
        K2(false);
        this.performMeasureConstraints = constraints;
        OwnerSnapshotObserver snapshotObserver = fo6.b(a1()).getSnapshotObserver();
        LayoutNode layoutNodeA1 = a1();
        Function0<Unit> function0 = this.performMeasureBlock;
        snapshotObserver.observer.k(layoutNodeA1, snapshotObserver.onCommitAffectingLookaheadMeasure, function0);
        d2();
        if (go6.a(a1())) {
            I1().i2();
        } else {
            I1().l2();
        }
        J2(LayoutNode.LayoutState.Idle);
    }

    /* JADX INFO: renamed from: y1, reason: from getter */
    public final kx1 getLookaheadConstraints() {
        return this.lookaheadConstraints;
    }

    @Override // com.google.inputmethod.b08
    public void z(boolean newMFR) {
        i lookaheadDelegate;
        i lookaheadDelegate2 = P1().getLookaheadDelegate();
        if (!Intrinsics.e(Boolean.valueOf(newMFR), lookaheadDelegate2 != null ? Boolean.valueOf(lookaheadDelegate2.getIsPlacedUnderMotionFrameOfReference()) : null) && (lookaheadDelegate = P1().getLookaheadDelegate()) != null) {
            lookaheadDelegate.e2(newMFR);
        }
        N2(newMFR);
    }

    /* JADX INFO: renamed from: z1, reason: from getter */
    public final boolean getLayingOutChildren() {
        return this.layingOutChildren;
    }
}
