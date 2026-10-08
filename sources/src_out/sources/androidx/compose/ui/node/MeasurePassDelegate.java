package androidx.compose.ui.node;

import android.os.Trace;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import com.google.inputmethod.b08;
import com.google.inputmethod.dj7;
import com.google.inputmethod.fo6;
import com.google.inputmethod.g16;
import com.google.inputmethod.go6;
import com.google.inputmethod.kx1;
import com.google.inputmethod.lq1;
import com.google.inputmethod.nx1;
import com.google.inputmethod.q16;
import com.google.inputmethod.r58;
import com.google.inputmethod.uc;
import com.google.inputmethod.wc;
import com.google.inputmethod.zw5;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010$\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000bJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J?\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\t\u0018\u00010\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ?\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\t\u0018\u00010\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001f\u0010\u000bJ\u000f\u0010 \u001a\u00020\tH\u0002¢\u0006\u0004\b \u0010\u000bJ\u000f\u0010!\u001a\u00020\tH\u0000¢\u0006\u0004\b!\u0010\u000bJ\u000f\u0010\"\u001a\u00020\tH\u0016¢\u0006\u0004\b\"\u0010\u000bJ\u000f\u0010#\u001a\u00020\tH\u0000¢\u0006\u0004\b#\u0010\u000bJ\u0017\u0010&\u001a\u00020\u00022\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\u00020(2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b)\u0010*J\u0018\u0010.\u001a\u00020-2\u0006\u0010,\u001a\u00020+H\u0096\u0002¢\u0006\u0004\b.\u0010/J5\u00100\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\t\u0018\u00010\u0017H\u0014¢\u0006\u0004\b0\u00101J'\u00102\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u00020\t2\u0006\u00104\u001a\u00020(H\u0016¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\t¢\u0006\u0004\b7\u0010\u000bJ\u0017\u00109\u001a\u00020-2\u0006\u00108\u001a\u00020-H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020-2\u0006\u00108\u001a\u00020-H\u0016¢\u0006\u0004\b;\u0010:J\u0017\u0010=\u001a\u00020-2\u0006\u0010<\u001a\u00020-H\u0016¢\u0006\u0004\b=\u0010:J\u0017\u0010>\u001a\u00020-2\u0006\u0010<\u001a\u00020-H\u0016¢\u0006\u0004\b>\u0010:J\r\u0010?\u001a\u00020\t¢\u0006\u0004\b?\u0010\u000bJ\r\u0010@\u001a\u00020(¢\u0006\u0004\b@\u0010AJ\u001b\u0010C\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020-0BH\u0016¢\u0006\u0004\bC\u0010DJ#\u0010F\u001a\u00020\t2\u0012\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0017H\u0016¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\tH\u0016¢\u0006\u0004\bH\u0010\u000bJ\u000f\u0010I\u001a\u00020\tH\u0016¢\u0006\u0004\bI\u0010\u000bJ\r\u0010J\u001a\u00020\t¢\u0006\u0004\bJ\u0010\u000bJ\u0015\u0010L\u001a\u00020\t2\u0006\u0010K\u001a\u00020(¢\u0006\u0004\bL\u00106J\r\u0010M\u001a\u00020\t¢\u0006\u0004\bM\u0010\u000bJ\r\u0010N\u001a\u00020\t¢\u0006\u0004\bN\u0010\u000bJ\u000f\u0010O\u001a\u00020\tH\u0000¢\u0006\u0004\bO\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010T\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR$\u0010Z\u001a\u00020-2\u0006\u0010U\u001a\u00020-8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR$\u0010]\u001a\u00020-2\u0006\u0010U\u001a\u00020-8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b[\u0010W\u001a\u0004\b\\\u0010YR\u0016\u0010_\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010SR$\u0010b\u001a\u00020(2\u0006\u0010U\u001a\u00020(8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b`\u0010S\u001a\u0004\ba\u0010AR\"\u0010j\u001a\u00020c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\"\u0010n\u001a\u00020(8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bk\u0010S\u001a\u0004\bl\u0010A\"\u0004\bm\u00106R$\u0010r\u001a\u00020\u00132\u0006\u0010U\u001a\u00020\u00138\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bo\u0010.\u001a\u0004\bp\u0010qR$\u0010u\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\t\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR\u0018\u0010x\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u0016\u0010z\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010\\R\u0016\u0010{\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010SR)\u0010\u0080\u0001\u001a\u0004\u0018\u00010|2\b\u0010U\u001a\u0004\u0018\u00010|8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b}\u0010~\u001a\u0004\bP\u0010\u007fR&\u0010\u0084\u0001\u001a\u00020(8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b\u0081\u0001\u0010S\u001a\u0005\b\u0082\u0001\u0010A\"\u0005\b\u0083\u0001\u00106R.\u0010\u0088\u0001\u001a\u00020(2\u0006\u0010U\u001a\u00020(8\u0006@@X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0085\u0001\u0010S\u001a\u0005\b\u0086\u0001\u0010A\"\u0005\b\u0087\u0001\u00106R'\u0010\u008b\u0001\u001a\u00020(2\u0006\u0010U\u001a\u00020(8\u0000@BX\u0080\u000e¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010S\u001a\u0005\b\u008a\u0001\u0010AR'\u0010\u008e\u0001\u001a\u00020(2\u0006\u0010U\u001a\u00020(8\u0000@BX\u0080\u000e¢\u0006\u000e\n\u0005\b\u008c\u0001\u0010S\u001a\u0005\b\u008d\u0001\u0010AR\u0018\u0010\u0090\u0001\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008f\u0001\u0010SR\u001f\u0010\u0095\u0001\u001a\u00030\u0091\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0005\b^\u0010\u0094\u0001R\u001d\u0010\u0098\u0001\u001a\t\u0012\u0004\u0012\u00020\u00000\u0096\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b5\u0010\u0097\u0001R&\u0010\u009c\u0001\u001a\u00020(8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b\u0099\u0001\u0010S\u001a\u0005\b\u009a\u0001\u0010A\"\u0005\b\u009b\u0001\u00106R'\u0010\u009f\u0001\u001a\u00020(2\u0006\u0010U\u001a\u00020(8\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\b\u009d\u0001\u0010S\u001a\u0005\b\u009e\u0001\u0010AR\u0018\u0010¡\u0001\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b \u0001\u0010.R&\u0010§\u0001\u001a\t\u0012\u0004\u0012\u00020\t0¢\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b£\u0001\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001R\u001e\u0010©\u0001\u001a\t\u0012\u0004\u0012\u00020\t0¢\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0001\u0010¤\u0001R&\u0010\u0016\u001a\u00020\u00152\u0006\u0010U\u001a\u00020\u00158\u0000@BX\u0080\u000e¢\u0006\u000e\n\u0004\b\\\u0010\\\u001a\u0006\bª\u0001\u0010«\u0001R\u0018\u0010\u00ad\u0001\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¬\u0001\u0010SR&\u0010¯\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\t\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b®\u0001\u0010tR\u0019\u0010°\u0001\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010wR\u0017\u0010±\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010.R\u0018\u0010³\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b²\u0001\u0010\\R\u001e\u0010µ\u0001\u001a\t\u0012\u0004\u0012\u00020\t0¢\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b´\u0001\u0010¤\u0001R\u0018\u0010·\u0001\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¶\u0001\u0010SR&\u0010¹\u0001\u001a\u00020(8\u0016@\u0016X\u0096\u000e¢\u0006\u0015\n\u0005\b¸\u0001\u0010S\u001a\u0005\b¹\u0001\u0010A\"\u0005\bº\u0001\u00106R\u001a\u0010¾\u0001\u001a\u0005\u0018\u00010»\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b¼\u0001\u0010½\u0001R\u0016\u0010Á\u0001\u001a\u0004\u0018\u00010$8F¢\u0006\b\u001a\u0006\b¿\u0001\u0010À\u0001R\u0014\u0010Ä\u0001\u001a\u00020\u000f8F¢\u0006\b\u001a\u0006\bÂ\u0001\u0010Ã\u0001R+\u0010Ê\u0001\u001a\u00030Å\u00012\u0007\u0010U\u001a\u00030Å\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bÆ\u0001\u0010Ç\u0001\"\u0006\bÈ\u0001\u0010É\u0001R\u0015\u0010Î\u0001\u001a\u00030Ë\u00018F¢\u0006\b\u001a\u0006\bÌ\u0001\u0010Í\u0001R\u0018\u0010Ð\u0001\u001a\u00030Ë\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÏ\u0001\u0010Í\u0001R\u001e\u0010Ô\u0001\u001a\t\u0012\u0004\u0012\u00020\u00000Ñ\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\bÒ\u0001\u0010Ó\u0001R\u0016\u0010Ö\u0001\u001a\u00020-8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÕ\u0001\u0010YR\u0016\u0010Ø\u0001\u001a\u00020-8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b×\u0001\u0010YR\u0019\u0010Û\u0001\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\bÙ\u0001\u0010Ú\u0001¨\u0006Ü\u0001"}, d2 = {"Landroidx/compose/ui/node/MeasurePassDelegate;", "Lcom/google/android/dj7;", "Landroidx/compose/ui/layout/o;", "Lcom/google/android/wc;", "Lcom/google/android/b08;", "Landroidx/compose/ui/node/f;", "layoutNodeLayoutDelegate", "<init>", "(Landroidx/compose/ui/node/f;)V", "", "v1", "()V", "n2", "m2", "x1", "Landroidx/compose/ui/node/LayoutNode;", "node", "N2", "(Landroidx/compose/ui/node/LayoutNode;)V", "Lcom/google/android/g16;", "position", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/m;", "layerBlock", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "D2", "(JFLkotlin/jvm/functions/Function1;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "z2", "q2", "p2", "g2", "c0", "v2", "Lcom/google/android/kx1;", "constraints", "r0", "(J)Landroidx/compose/ui/layout/o;", "", "E2", "(J)Z", "Lcom/google/android/uc;", "alignmentLine", "", "J", "(Lcom/google/android/uc;)I", "X0", "(JFLkotlin/jvm/functions/Function1;)V", "W0", "(JFLandroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "newMFR", "z", "(Z)V", "F2", "height", "o0", "(I)I", "q0", "width", "d0", "W", "b2", "O2", "()Z", "", "r", "()Ljava/util/Map;", "block", "t0", "(Lkotlin/jvm/functions/Function1;)V", "requestLayout", "T", "H2", "forceRequest", "Y1", "s2", "i2", "l2", "f", "Landroidx/compose/ui/node/f;", "g", "Z", "relayoutWithoutParentInProgress", "value", "h", "I", "getPreviousPlaceOrder$ui", "()I", "previousPlaceOrder", "i", "F", "placeOrder", "j", "measuredOnce", "k", "getPlacedOnce", "placedOnce", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "l", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "N1", "()Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "K2", "(Landroidx/compose/ui/node/LayoutNode$UsageByParent;)V", "measuredByParent", "m", "getDuringAlignmentLinesQuery$ui", "setDuringAlignmentLinesQuery$ui", "duringAlignmentLinesQuery", "n", "getLastPosition-nOcc-ac$ui", "()J", "lastPosition", "o", "Lkotlin/jvm/functions/Function1;", "lastLayerBlock", "p", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "lastExplicitLayer", "q", "lastZIndex", "parentDataDirty", "", "s", "Ljava/lang/Object;", "()Ljava/lang/Object;", "parentData", "t", "d2", "L2", "isPlaced", "u", "e2", "setPlacedByParent$ui", "isPlacedByParent", "v", "M1", "measurePending", "w", "C1", "layoutPending", "x", "layoutPendingForAlignment", "Landroidx/compose/ui/node/AlignmentLines;", "y", "Landroidx/compose/ui/node/AlignmentLines;", "()Landroidx/compose/ui/node/AlignmentLines;", "alignmentLines", "Lcom/google/android/r58;", "Lcom/google/android/r58;", "_childDelegates", "A", "getChildDelegatesDirty$ui", "I2", "childDelegatesDirty", "B", "B1", "layingOutChildren", "C", "performMeasureConstraints", "Lkotlin/Function0;", "D", "Lkotlin/jvm/functions/Function0;", "U1", "()Lkotlin/jvm/functions/Function0;", "performMeasureBlock", "E", "layoutChildrenBlock", "X1", "()F", "G", "onNodePlacedCalled", "H", "placeOuterCoordinatorLayerBlock", "placeOuterCoordinatorLayer", "placeOuterCoordinatorPosition", "K", "placeOuterCoordinatorZIndex", "L", "placeOuterCoordinatorBlock", "M", "needsCoordinatesUpdate", "N", "isPlacedUnderMotionFrameOfReference", "M2", "Landroidx/compose/ui/node/LookaheadPassDelegate;", "I1", "()Landroidx/compose/ui/node/LookaheadPassDelegate;", "lookaheadPassDelegate", "z1", "()Lcom/google/android/kx1;", "lastConstraints", "a1", "()Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/node/LayoutNode$LayoutState;", "F1", "()Landroidx/compose/ui/node/LayoutNode$LayoutState;", "J2", "(Landroidx/compose/ui/node/LayoutNode$LayoutState;)V", "layoutState", "Landroidx/compose/ui/node/NodeCoordinator;", "P1", "()Landroidx/compose/ui/node/NodeCoordinator;", "outerCoordinator", "h0", "innerCoordinator", "", "y1", "()Ljava/util/List;", "childDelegates", "J0", "measuredWidth", "G0", "measuredHeight", "a0", "()Lcom/google/android/wc;", "parentAlignmentLinesOwner", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MeasurePassDelegate extends androidx.compose.ui.layout.o implements dj7, wc, b08 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private boolean childDelegatesDirty;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private boolean layingOutChildren;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private long performMeasureConstraints;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final Function0<Unit> performMeasureBlock;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final Function0<Unit> layoutChildrenBlock;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private float zIndex;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private boolean onNodePlacedCalled;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private Function1<? super androidx.compose.ui.graphics.m, Unit> placeOuterCoordinatorLayerBlock;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private GraphicsLayer placeOuterCoordinatorLayer;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private long placeOuterCoordinatorPosition;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private float placeOuterCoordinatorZIndex;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final Function0<Unit> placeOuterCoordinatorBlock;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private boolean needsCoordinatesUpdate;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private boolean isPlacedUnderMotionFrameOfReference;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final f layoutNodeLayoutDelegate;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean relayoutWithoutParentInProgress;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private boolean measuredOnce;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private boolean placedOnce;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private boolean duringAlignmentLinesQuery;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private long lastPosition;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private Function1<? super androidx.compose.ui.graphics.m, Unit> lastLayerBlock;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private GraphicsLayer lastExplicitLayer;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private float lastZIndex;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private boolean parentDataDirty;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private Object parentData;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private boolean isPlaced;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private boolean isPlacedByParent;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private boolean measurePending;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private boolean layoutPending;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private boolean layoutPendingForAlignment;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final AlignmentLines alignmentLines;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final r58<MeasurePassDelegate> _childDelegates;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int previousPlaceOrder = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private int placeOrder = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private LayoutNode.UsageByParent measuredByParent = LayoutNode.UsageByParent.NotUsed;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LayoutNode.LayoutState.values().length];
            try {
                iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[LayoutNode.UsageByParent.values().length];
            try {
                iArr2[LayoutNode.UsageByParent.InMeasureBlock.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[LayoutNode.UsageByParent.InLayoutBlock.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public MeasurePassDelegate(f fVar) {
        this.layoutNodeLayoutDelegate = fVar;
        g16.Companion companion = g16.INSTANCE;
        this.lastPosition = companion.b();
        this.parentDataDirty = true;
        this.alignmentLines = new e(this);
        this._childDelegates = new r58<>(new MeasurePassDelegate[16], 0);
        this.childDelegatesDirty = true;
        this.performMeasureConstraints = nx1.b(0, 0, 0, 0, 15, null);
        this.performMeasureBlock = new Function0<Unit>() { // from class: androidx.compose.ui.node.MeasurePassDelegate$performMeasureBlock$1
            {
                super(0);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                m29invoke();
                return Unit.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m29invoke() {
                this.this$0.P1().r0(this.this$0.performMeasureConstraints);
            }
        };
        this.layoutChildrenBlock = new Function0<Unit>() { // from class: androidx.compose.ui.node.MeasurePassDelegate$layoutChildrenBlock$1
            {
                super(0);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
            public /* bridge */ /* synthetic */ Object invoke() throws KotlinNothingValueException {
                m28invoke();
                return Unit.a;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m28invoke() throws KotlinNothingValueException {
                this.this$0.x1();
                this.this$0.t0(new Function1<wc, Unit>() { // from class: androidx.compose.ui.node.MeasurePassDelegate$layoutChildrenBlock$1.1
                    public final void a(wc wcVar) {
                        wcVar.getAlignmentLines().t(false);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        a((wc) obj);
                        return Unit.a;
                    }
                });
                if (this.this$0.h0().getIsPlacingForAlignment()) {
                    List<LayoutNode> listR = this.this$0.a1().R();
                    int size = listR.size();
                    for (int i = 0; i < size; i++) {
                        listR.get(i).x0().g2(true);
                    }
                }
                this.this$0.h0().z1().l();
                if (this.this$0.h0().getIsPlacingForAlignment()) {
                    List<LayoutNode> listR2 = this.this$0.a1().R();
                    int size2 = listR2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        listR2.get(i2).x0().g2(false);
                    }
                }
                this.this$0.v1();
                this.this$0.t0(new Function1<wc, Unit>() { // from class: androidx.compose.ui.node.MeasurePassDelegate$layoutChildrenBlock$1.4
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
        this.placeOuterCoordinatorPosition = companion.b();
        this.placeOuterCoordinatorBlock = new Function0<Unit>() { // from class: androidx.compose.ui.node.MeasurePassDelegate$placeOuterCoordinatorBlock$1
            {
                super(0);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                m30invoke();
                return Unit.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m30invoke() {
                androidx.compose.ui.layout.o.a placementScope;
                NodeCoordinator wrappedBy = this.this$0.P1().getWrappedBy();
                if (wrappedBy == null || (placementScope = wrappedBy.getPlacementScope()) == null) {
                    placementScope = fo6.b(this.this$0.a1()).getPlacementScope();
                }
                androidx.compose.ui.layout.o.a aVar = placementScope;
                MeasurePassDelegate measurePassDelegate = this.this$0;
                Function1<? super androidx.compose.ui.graphics.m, Unit> function1 = measurePassDelegate.placeOuterCoordinatorLayerBlock;
                GraphicsLayer graphicsLayer = measurePassDelegate.placeOuterCoordinatorLayer;
                if (graphicsLayer != null) {
                    aVar.f0(measurePassDelegate.P1(), measurePassDelegate.placeOuterCoordinatorPosition, graphicsLayer, measurePassDelegate.placeOuterCoordinatorZIndex);
                } else if (function1 == null) {
                    aVar.D(measurePassDelegate.P1(), measurePassDelegate.placeOuterCoordinatorPosition, measurePassDelegate.placeOuterCoordinatorZIndex);
                } else {
                    aVar.e0(measurePassDelegate.P1(), measurePassDelegate.placeOuterCoordinatorPosition, measurePassDelegate.placeOuterCoordinatorZIndex, function1);
                }
            }
        };
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final void D2(long position, float zIndex, Function1<? super androidx.compose.ui.graphics.m, Unit> layerBlock, GraphicsLayer layer) throws Throwable {
        androidx.compose.ui.layout.o.a placementScope;
        LayoutNode layoutNodeA1 = a1();
        boolean z = true;
        try {
            this.isPlacedByParent = true;
            if (!g16.j(position, this.lastPosition) || layerBlock != this.lastLayerBlock || this.needsCoordinatesUpdate) {
                if (this.layoutNodeLayoutDelegate.getCoordinatesAccessedDuringModifierPlacement() || this.layoutNodeLayoutDelegate.getCoordinatesAccessedDuringPlacement() || this.needsCoordinatesUpdate) {
                    this.layoutPending = true;
                    this.needsCoordinatesUpdate = false;
                }
            }
            LookaheadPassDelegate lookaheadPassDelegateI1 = I1();
            if (lookaheadPassDelegateI1 != null) {
                lookaheadPassDelegateI1.l2();
            }
            LookaheadPassDelegate lookaheadPassDelegateI2 = I1();
            if (lookaheadPassDelegateI2 != null && lookaheadPassDelegateI2.N1()) {
                NodeCoordinator wrappedBy = P1().getWrappedBy();
                if (wrappedBy == null || (placementScope = wrappedBy.getPlacementScope()) == null) {
                    placementScope = fo6.b(a1()).getPlacementScope();
                }
                androidx.compose.ui.layout.o.a aVar = placementScope;
                LookaheadPassDelegate lookaheadPassDelegateI3 = I1();
                Intrinsics.g(lookaheadPassDelegateI3);
                LayoutNode layoutNodeC0 = a1().C0();
                if (layoutNodeC0 != null) {
                    layoutNodeC0.getLayoutDelegate().X(0);
                }
                lookaheadPassDelegateI3.M2(Integer.MAX_VALUE);
                androidx.compose.ui.layout.o.a.z(aVar, lookaheadPassDelegateI3, g16.k(position), g16.l(position), 0.0f, 4, null);
            }
            LookaheadPassDelegate lookaheadPassDelegateI4 = I1();
            if (lookaheadPassDelegateI4 == null || lookaheadPassDelegateI4.getPlacedOnce()) {
                z = false;
            }
            if (z) {
                zw5.c("Error: Placement happened before lookahead.");
            }
            z2(position, zIndex, layerBlock, layer);
            Unit unit = Unit.a;
        } catch (Throwable th) {
            layoutNodeA1.O1(th);
            throw new KotlinNothingValueException();
        }
    }

    private final LookaheadPassDelegate I1() {
        return this.layoutNodeLayoutDelegate.getLookaheadPassDelegate();
    }

    private final void N2(LayoutNode node) {
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
        if (i == 1) {
            usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
        } else {
            if (i != 2) {
                throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + layoutNodeC0.i0());
            }
            usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
        }
        this.measuredByParent = usageByParent;
    }

    private final void m2() {
        boolean z = this.isPlaced;
        this.isPlaced = true;
        LayoutNode layoutNodeA1 = a1();
        if (!z) {
            layoutNodeA1.b0().F3();
            fo6.b(layoutNodeA1).getRectManager().l(a1());
            if (layoutNodeA1.p0()) {
                LayoutNode.K1(layoutNodeA1, true, false, false, 6, null);
            } else if (layoutNodeA1.k0()) {
                LayoutNode.G1(layoutNodeA1, true, false, false, 6, null);
            }
        }
        NodeCoordinator wrapped = layoutNodeA1.b0().getWrapped();
        for (NodeCoordinator nodeCoordinatorX0 = layoutNodeA1.x0(); !Intrinsics.e(nodeCoordinatorX0, wrapped) && nodeCoordinatorX0 != null; nodeCoordinatorX0 = nodeCoordinatorX0.getWrapped()) {
            if (nodeCoordinatorX0.getLastLayerDrawingWasSkipped()) {
                nodeCoordinatorX0.v3();
            }
        }
        r58<LayoutNode> r58VarL0 = layoutNodeA1.L0();
        LayoutNode[] layoutNodeArr = r58VarL0.content;
        int size = r58VarL0.getSize();
        for (int i = 0; i < size; i++) {
            LayoutNode layoutNode = layoutNodeArr[i];
            if (layoutNode.D0() != Integer.MAX_VALUE) {
                layoutNode.o0().m2();
                layoutNodeA1.L1(layoutNode);
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final void n2() throws KotlinNothingValueException {
        if (this.isPlaced) {
            this.isPlaced = false;
            fo6.b(a1()).getRectManager().n(a1());
            LayoutNode layoutNodeA1 = a1();
            NodeCoordinator wrapped = layoutNodeA1.b0().getWrapped();
            for (NodeCoordinator nodeCoordinatorX0 = layoutNodeA1.x0(); !Intrinsics.e(nodeCoordinatorX0, wrapped) && nodeCoordinatorX0 != null; nodeCoordinatorX0 = nodeCoordinatorX0.getWrapped()) {
                nodeCoordinatorX0.H3();
                nodeCoordinatorX0.O3();
            }
            r58<LayoutNode> r58VarL0 = a1().L0();
            LayoutNode[] layoutNodeArr = r58VarL0.content;
            int size = r58VarL0.getSize();
            for (int i = 0; i < size; i++) {
                layoutNodeArr[i].o0().n2();
            }
        }
    }

    private final void p2() {
        r58<LayoutNode> r58VarL0 = a1().L0();
        LayoutNode[] layoutNodeArr = r58VarL0.content;
        int size = r58VarL0.getSize();
        for (int i = 0; i < size; i++) {
            LayoutNode layoutNode = layoutNodeArr[i];
            if (layoutNode.p0() && layoutNode.r0() == LayoutNode.UsageByParent.InMeasureBlock && LayoutNode.y1(layoutNode, null, 1, null)) {
                LayoutNode.K1(a1(), false, false, false, 7, null);
            }
        }
    }

    private final void q2() {
        LayoutNode.UsageByParent intrinsicsUsageByParent;
        LayoutNode.K1(a1(), false, false, false, 7, null);
        LayoutNode layoutNodeC0 = a1().C0();
        if (layoutNodeC0 == null || a1().getIntrinsicsUsageByParent() != LayoutNode.UsageByParent.NotUsed) {
            return;
        }
        LayoutNode layoutNodeA1 = a1();
        int i = a.$EnumSwitchMapping$0[layoutNodeC0.i0().ordinal()];
        if (i != 1) {
            intrinsicsUsageByParent = i != 2 ? layoutNodeC0.getIntrinsicsUsageByParent() : LayoutNode.UsageByParent.InLayoutBlock;
        } else {
            intrinsicsUsageByParent = LayoutNode.UsageByParent.InMeasureBlock;
        }
        layoutNodeA1.V1(intrinsicsUsageByParent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void v1() throws KotlinNothingValueException {
        LayoutNode layoutNodeA1 = a1();
        r58<LayoutNode> r58VarL0 = layoutNodeA1.L0();
        LayoutNode[] layoutNodeArr = r58VarL0.content;
        int size = r58VarL0.getSize();
        for (int i = 0; i < size; i++) {
            LayoutNode layoutNode = layoutNodeArr[i];
            if (layoutNode.o0().previousPlaceOrder != layoutNode.D0()) {
                layoutNodeA1.u1();
                layoutNodeA1.R0();
                if (layoutNode.D0() == Integer.MAX_VALUE) {
                    if (layoutNode.getLayoutDelegate().getDetachedFromParentLookaheadPlacement() || go6.a(layoutNode)) {
                        LookaheadPassDelegate lookaheadPassDelegateL0 = layoutNode.l0();
                        Intrinsics.g(lookaheadPassDelegateL0);
                        lookaheadPassDelegateL0.e2(false);
                    }
                    layoutNode.o0().n2();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x1() {
        this.layoutNodeLayoutDelegate.Y(0);
        r58<LayoutNode> r58VarL0 = a1().L0();
        LayoutNode[] layoutNodeArr = r58VarL0.content;
        int size = r58VarL0.getSize();
        for (int i = 0; i < size; i++) {
            MeasurePassDelegate measurePassDelegateO0 = layoutNodeArr[i].o0();
            measurePassDelegateO0.previousPlaceOrder = measurePassDelegateO0.getPlaceOrder();
            measurePassDelegateO0.placeOrder = Integer.MAX_VALUE;
            measurePassDelegateO0.isPlacedByParent = false;
            if (measurePassDelegateO0.measuredByParent == LayoutNode.UsageByParent.InLayoutBlock) {
                measurePassDelegateO0.measuredByParent = LayoutNode.UsageByParent.NotUsed;
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final void z2(long position, float zIndex, Function1<? super androidx.compose.ui.graphics.m, Unit> layerBlock, GraphicsLayer layer) throws KotlinNothingValueException {
        if (a1().getIsDeactivated()) {
            zw5.a("place is called on a deactivated node");
        }
        J2(LayoutNode.LayoutState.LayingOut);
        this.lastPosition = position;
        this.lastZIndex = zIndex;
        this.lastLayerBlock = layerBlock;
        this.lastExplicitLayer = layer;
        this.onNodePlacedCalled = false;
        m mVarB = fo6.b(a1());
        if (this.layoutPending || !this.isPlaced) {
            getAlignmentLines().r(false);
            this.layoutNodeLayoutDelegate.N(false);
            this.placeOuterCoordinatorLayerBlock = layerBlock;
            this.placeOuterCoordinatorPosition = position;
            this.placeOuterCoordinatorZIndex = zIndex;
            this.placeOuterCoordinatorLayer = layer;
            OwnerSnapshotObserver snapshotObserver = mVarB.getSnapshotObserver();
            LayoutNode layoutNodeA1 = a1();
            Function0<Unit> function0 = this.placeOuterCoordinatorBlock;
            snapshotObserver.observer.k(layoutNodeA1, snapshotObserver.onCommitAffectingLayoutModifier, function0);
        } else {
            P1().L3(position, zIndex, layerBlock, layer);
            v2();
        }
        J2(LayoutNode.LayoutState.Idle);
        if (P1().getIsPlacingForAlignment() && (this.layoutNodeLayoutDelegate.getCoordinatesAccessedDuringModifierPlacement() || this.layoutNodeLayoutDelegate.getCoordinatesAccessedDuringPlacement())) {
            requestLayout();
        }
        this.placedOnce = true;
    }

    /* JADX INFO: renamed from: B1, reason: from getter */
    public final boolean getLayingOutChildren() {
        return this.layingOutChildren;
    }

    /* JADX INFO: renamed from: C1, reason: from getter */
    public final boolean getLayoutPending() {
        return this.layoutPending;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final boolean E2(long constraints) throws Throwable {
        LayoutNode layoutNodeA1 = a1();
        try {
            if (a1().getIsDeactivated()) {
                zw5.a("measure is called on a deactivated node");
            }
            m mVarB = fo6.b(a1());
            LayoutNode layoutNodeC0 = a1().C0();
            boolean z = true;
            a1().Q1(a1().getCanMultiMeasure() || (layoutNodeC0 != null && layoutNodeC0.getCanMultiMeasure()));
            if (!a1().p0() && kx1.f(getMeasurementConstraints(), constraints)) {
                m.l(mVarB, a1(), false, 2, null);
                a1().N1();
                return false;
            }
            getAlignmentLines().s(false);
            t0(new Function1<wc, Unit>() { // from class: androidx.compose.ui.node.MeasurePassDelegate$remeasure$1$2
                public final void a(wc wcVar) {
                    wcVar.getAlignmentLines().u(false);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((wc) obj);
                    return Unit.a;
                }
            });
            this.measuredOnce = true;
            long jA = P1().a();
            Z0(constraints);
            LayoutNode.LayoutState layoutStateF1 = F1();
            LayoutNode.LayoutState layoutState = LayoutNode.LayoutState.Idle;
            if (!(layoutStateF1 == layoutState)) {
                zw5.c("layout state is not idle before measure starts");
            }
            this.performMeasureConstraints = constraints;
            LayoutNode.LayoutState layoutState2 = LayoutNode.LayoutState.Measuring;
            J2(layoutState2);
            this.measurePending = false;
            OwnerSnapshotObserver snapshotObserver = fo6.b(a1()).getSnapshotObserver();
            snapshotObserver.observer.k(a1(), snapshotObserver.onCommitAffectingMeasure, U1());
            if (F1() == layoutState2) {
                i2();
                J2(layoutState);
            }
            if (q16.f(P1().a(), jA) && P1().getWidth() == getWidth() && P1().getHeight() == getHeight()) {
                z = false;
            }
            Y0(q16.c((((long) P1().getHeight()) & 4294967295L) | (((long) P1().getWidth()) << 32)));
            return z;
        } catch (Throwable th) {
            layoutNodeA1.O1(th);
            throw new KotlinNothingValueException();
        }
    }

    @Override // com.google.inputmethod.wc
    /* JADX INFO: renamed from: F, reason: from getter */
    public int getPlaceOrder() {
        return this.placeOrder;
    }

    public final LayoutNode.LayoutState F1() {
        return this.layoutNodeLayoutDelegate.getLayoutState();
    }

    public final void F2() {
        MeasurePassDelegate measurePassDelegate;
        LayoutNode layoutNodeC0;
        try {
            this.relayoutWithoutParentInProgress = true;
            if (!this.placedOnce) {
                zw5.c("replace called on unplaced item");
            }
            boolean z = this.isPlaced;
            measurePassDelegate = this;
            try {
                measurePassDelegate.z2(this.lastPosition, this.lastZIndex, this.lastLayerBlock, this.lastExplicitLayer);
                if (z && !measurePassDelegate.onNodePlacedCalled && (layoutNodeC0 = a1().C0()) != null) {
                    LayoutNode.I1(layoutNodeC0, false, 1, null);
                }
                measurePassDelegate.relayoutWithoutParentInProgress = false;
            } catch (Throwable th) {
                th = th;
                try {
                    a1().O1(th);
                    throw new KotlinNothingValueException();
                } catch (Throwable th2) {
                    measurePassDelegate.relayoutWithoutParentInProgress = false;
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            measurePassDelegate = this;
        }
    }

    @Override // androidx.compose.ui.layout.o
    public int G0() {
        return P1().G0();
    }

    public final void H2() {
        if (!a1().x() || this.layoutNodeLayoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() <= 0) {
            return;
        }
        f layoutDelegate = a1().getLayoutDelegate();
        if ((layoutDelegate.getCoordinatesAccessedDuringPlacement() || layoutDelegate.getCoordinatesAccessedDuringModifierPlacement()) && !layoutDelegate.m()) {
            LayoutNode.I1(a1(), false, 1, null);
        }
        r58<LayoutNode> r58VarL0 = a1().L0();
        LayoutNode[] layoutNodeArr = r58VarL0.content;
        int size = r58VarL0.getSize();
        for (int i = 0; i < size; i++) {
            layoutNodeArr[i].o0().H2();
        }
    }

    public final void I2(boolean z) {
        this.childDelegatesDirty = z;
    }

    @Override // com.google.inputmethod.ij7
    public int J(uc alignmentLine) {
        LayoutNode layoutNodeC0 = a1().C0();
        if ((layoutNodeC0 != null ? layoutNodeC0.i0() : null) == LayoutNode.LayoutState.Measuring) {
            getAlignmentLines().u(true);
        } else {
            LayoutNode layoutNodeC1 = a1().C0();
            if ((layoutNodeC1 != null ? layoutNodeC1.i0() : null) == LayoutNode.LayoutState.LayingOut) {
                getAlignmentLines().t(true);
            }
        }
        this.duringAlignmentLinesQuery = true;
        int iJ = P1().J(alignmentLine);
        this.duringAlignmentLinesQuery = false;
        return iJ;
    }

    @Override // androidx.compose.ui.layout.o
    public int J0() {
        return P1().J0();
    }

    public final void J2(LayoutNode.LayoutState layoutState) {
        this.layoutNodeLayoutDelegate.R(layoutState);
    }

    public final void K2(LayoutNode.UsageByParent usageByParent) {
        this.measuredByParent = usageByParent;
    }

    public final void L2(boolean z) {
        this.isPlaced = z;
    }

    /* JADX INFO: renamed from: M1, reason: from getter */
    public final boolean getMeasurePending() {
        return this.measurePending;
    }

    public void M2(boolean z) {
        this.isPlacedUnderMotionFrameOfReference = z;
    }

    /* JADX INFO: renamed from: N1, reason: from getter */
    public final LayoutNode.UsageByParent getMeasuredByParent() {
        return this.measuredByParent;
    }

    public final boolean O2() {
        if ((getParentData() == null && P1().getParentData() == null) || !this.parentDataDirty) {
            return false;
        }
        this.parentDataDirty = false;
        this.parentData = P1().getParentData();
        return true;
    }

    public final NodeCoordinator P1() {
        return this.layoutNodeLayoutDelegate.z();
    }

    @Override // com.google.inputmethod.wc
    public void T() {
        LayoutNode.K1(a1(), false, false, false, 7, null);
    }

    public final Function0<Unit> U1() {
        return this.performMeasureBlock;
    }

    @Override // com.google.inputmethod.f66
    public int W(int width) {
        if (!go6.a(a1())) {
            q2();
            return P1().W(width);
        }
        LookaheadPassDelegate lookaheadPassDelegateI1 = I1();
        Intrinsics.g(lookaheadPassDelegateI1);
        return lookaheadPassDelegateI1.W(width);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.o
    public void W0(long position, float zIndex, GraphicsLayer layer) throws Throwable {
        D2(position, zIndex, null, layer);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.o
    public void X0(long position, float zIndex, Function1<? super androidx.compose.ui.graphics.m, Unit> layerBlock) throws Throwable {
        D2(position, zIndex, layerBlock, null);
    }

    /* JADX INFO: renamed from: X1, reason: from getter */
    public final float getZIndex() {
        return this.zIndex;
    }

    public final void Y1(boolean forceRequest) {
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
            LayoutNode.K1(layoutNode, forceRequest, false, false, 6, null);
        } else {
            if (i != 2) {
                throw new IllegalStateException("Intrinsics isn't used by the parent");
            }
            layoutNode.H1(forceRequest);
        }
    }

    @Override // com.google.inputmethod.wc
    public wc a0() {
        f layoutDelegate;
        LayoutNode layoutNodeC0 = a1().C0();
        if (layoutNodeC0 == null || (layoutDelegate = layoutNodeC0.getLayoutDelegate()) == null) {
            return null;
        }
        return layoutDelegate.b();
    }

    public final LayoutNode a1() {
        return this.layoutNodeLayoutDelegate.getLayoutNode();
    }

    public final void b2() {
        this.parentDataDirty = true;
    }

    @Override // com.google.inputmethod.wc
    public void c0() {
        this.layingOutChildren = true;
        getAlignmentLines().o();
        if (this.layoutPending) {
            p2();
        }
        if (this.layoutPendingForAlignment || (!this.duringAlignmentLinesQuery && !h0().getIsPlacingForAlignment() && this.layoutPending)) {
            this.layoutPending = false;
            LayoutNode.LayoutState layoutStateF1 = F1();
            J2(LayoutNode.LayoutState.LayingOut);
            this.layoutNodeLayoutDelegate.O(false);
            LayoutNode layoutNodeA1 = a1();
            OwnerSnapshotObserver snapshotObserver = fo6.b(layoutNodeA1).getSnapshotObserver();
            Function0<Unit> function0 = this.layoutChildrenBlock;
            snapshotObserver.observer.k(layoutNodeA1, snapshotObserver.onCommitAffectingLayout, function0);
            J2(layoutStateF1);
            this.layoutPendingForAlignment = false;
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
        if (!go6.a(a1())) {
            q2();
            return P1().d0(width);
        }
        LookaheadPassDelegate lookaheadPassDelegateI1 = I1();
        Intrinsics.g(lookaheadPassDelegateI1);
        return lookaheadPassDelegateI1.d0(width);
    }

    /* JADX INFO: renamed from: d2, reason: from getter */
    public final boolean getIsPlaced() {
        return this.isPlaced;
    }

    /* JADX INFO: renamed from: e2, reason: from getter */
    public final boolean getIsPlacedByParent() {
        return this.isPlacedByParent;
    }

    @Override // com.google.inputmethod.ij7, com.google.inputmethod.f66
    /* JADX INFO: renamed from: f, reason: from getter */
    public Object getParentData() {
        return this.parentData;
    }

    public final void g2() {
        this.layoutNodeLayoutDelegate.P(true);
    }

    @Override // com.google.inputmethod.wc
    public NodeCoordinator h0() {
        return a1().b0();
    }

    public final void i2() {
        this.layoutPending = true;
        this.layoutPendingForAlignment = true;
    }

    @Override // com.google.inputmethod.wc
    /* JADX INFO: renamed from: j, reason: from getter */
    public AlignmentLines getAlignmentLines() {
        return this.alignmentLines;
    }

    public final void l2() {
        this.measurePending = true;
    }

    @Override // com.google.inputmethod.f66
    public int o0(int height) {
        if (!go6.a(a1())) {
            q2();
            return P1().o0(height);
        }
        LookaheadPassDelegate lookaheadPassDelegateI1 = I1();
        Intrinsics.g(lookaheadPassDelegateI1);
        return lookaheadPassDelegateI1.o0(height);
    }

    @Override // com.google.inputmethod.f66
    public int q0(int height) {
        if (!go6.a(a1())) {
            q2();
            return P1().q0(height);
        }
        LookaheadPassDelegate lookaheadPassDelegateI1 = I1();
        Intrinsics.g(lookaheadPassDelegateI1);
        return lookaheadPassDelegateI1.q0(height);
    }

    @Override // com.google.inputmethod.wc
    public Map<uc, Integer> r() {
        if (!this.duringAlignmentLinesQuery) {
            if (F1() == LayoutNode.LayoutState.Measuring) {
                getAlignmentLines().s(true);
                if (getAlignmentLines().getDirty()) {
                    i2();
                }
            } else {
                getAlignmentLines().r(true);
            }
        }
        NodeCoordinator nodeCoordinatorH0 = h0();
        boolean isPlacingForAlignment = nodeCoordinatorH0.getIsPlacingForAlignment();
        nodeCoordinatorH0.g2(true);
        c0();
        nodeCoordinatorH0.g2(isPlacingForAlignment);
        return getAlignmentLines().h();
    }

    @Override // com.google.inputmethod.dj7
    public androidx.compose.ui.layout.o r0(long constraints) throws Throwable {
        LayoutNode.UsageByParent intrinsicsUsageByParent = a1().getIntrinsicsUsageByParent();
        LayoutNode.UsageByParent usageByParent = LayoutNode.UsageByParent.NotUsed;
        if (intrinsicsUsageByParent == usageByParent) {
            a1().D();
        }
        if (go6.a(a1())) {
            LookaheadPassDelegate lookaheadPassDelegateI1 = I1();
            Intrinsics.g(lookaheadPassDelegateI1);
            lookaheadPassDelegateI1.L2(usageByParent);
            if (lq1.isVerboseTracingEnabled) {
                Trace.beginSection("Compose:lookaheadMeasure");
                try {
                    lookaheadPassDelegateI1.r0(constraints);
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } else {
                lookaheadPassDelegateI1.r0(constraints);
            }
        }
        N2(a1());
        E2(constraints);
        return this;
    }

    @Override // com.google.inputmethod.wc
    public void requestLayout() {
        LayoutNode.I1(a1(), false, 1, null);
    }

    public final void s2() {
        this.placeOrder = Integer.MAX_VALUE;
        this.previousPlaceOrder = Integer.MAX_VALUE;
        this.isPlaced = false;
    }

    @Override // com.google.inputmethod.wc
    public void t0(Function1<? super wc, Unit> block) {
        r58<LayoutNode> r58VarL0 = a1().L0();
        LayoutNode[] layoutNodeArr = r58VarL0.content;
        int size = r58VarL0.getSize();
        for (int i = 0; i < size; i++) {
            block.invoke(layoutNodeArr[i].getLayoutDelegate().b());
        }
    }

    public final void v2() {
        this.onNodePlacedCalled = true;
        LayoutNode layoutNodeC0 = a1().C0();
        float zIndex = h0().getZIndex();
        LayoutNode layoutNodeA1 = a1();
        NodeCoordinator nodeCoordinatorX0 = layoutNodeA1.x0();
        NodeCoordinator nodeCoordinatorB0 = layoutNodeA1.b0();
        while (nodeCoordinatorX0 != nodeCoordinatorB0) {
            Intrinsics.h(nodeCoordinatorX0, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            d dVar = (d) nodeCoordinatorX0;
            zIndex += dVar.getZIndex();
            nodeCoordinatorX0 = dVar.getWrapped();
        }
        if (zIndex != this.zIndex) {
            this.zIndex = zIndex;
            if (layoutNodeC0 != null) {
                layoutNodeC0.u1();
            }
            if (layoutNodeC0 != null) {
                layoutNodeC0.R0();
            }
        }
        if (!h0().getIsPlacingForAlignment()) {
            boolean z = this.isPlaced;
            if (!z || getAlignmentLines().j()) {
                m2();
            }
            if (z) {
                a1().b0().F3();
            } else {
                if (layoutNodeC0 != null) {
                    layoutNodeC0.R0();
                }
                if (this.relayoutWithoutParentInProgress && layoutNodeC0 != null) {
                    LayoutNode.I1(layoutNodeC0, false, 1, null);
                }
            }
        }
        if (layoutNodeC0 == null) {
            this.placeOrder = 0;
        } else if (!this.relayoutWithoutParentInProgress && layoutNodeC0.i0() == LayoutNode.LayoutState.LayingOut) {
            if (!(getPlaceOrder() == Integer.MAX_VALUE)) {
                zw5.c("Place was called on a node which was placed already");
            }
            this.placeOrder = layoutNodeC0.getLayoutDelegate().getNextChildPlaceOrder();
            f layoutDelegate = layoutNodeC0.getLayoutDelegate();
            layoutDelegate.Y(layoutDelegate.getNextChildPlaceOrder() + 1);
        }
        c0();
    }

    public final List<MeasurePassDelegate> y1() {
        a1().h2();
        if (!this.childDelegatesDirty) {
            return this._childDelegates.i();
        }
        LayoutNode layoutNodeA1 = a1();
        r58<MeasurePassDelegate> r58Var = this._childDelegates;
        r58<LayoutNode> r58VarL0 = layoutNodeA1.L0();
        LayoutNode[] layoutNodeArr = r58VarL0.content;
        int size = r58VarL0.getSize();
        for (int i = 0; i < size; i++) {
            LayoutNode layoutNode = layoutNodeArr[i];
            if (r58Var.getSize() <= i) {
                r58Var.c(layoutNode.getLayoutDelegate().getMeasurePassDelegate());
            } else {
                r58Var.y(i, layoutNode.getLayoutDelegate().getMeasurePassDelegate());
            }
        }
        r58Var.v(layoutNodeA1.R().size(), r58Var.getSize());
        this.childDelegatesDirty = false;
        return this._childDelegates.i();
    }

    @Override // com.google.inputmethod.b08
    public void z(boolean newMFR) {
        if (newMFR != P1().getIsPlacedUnderMotionFrameOfReference()) {
            P1().e2(newMFR);
            this.needsCoordinatesUpdate = true;
        }
        M2(newMFR);
    }

    public final kx1 z1() {
        if (this.measuredOnce) {
            return kx1.a(getMeasurementConstraints());
        }
        return null;
    }
}
