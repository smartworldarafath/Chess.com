package androidx.compose.p001foundation;

import android.view.KeyEvent;
import androidx.compose.p001foundation.AbstractClickableNode;
import androidx.compose.p001foundation.interaction.a;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.e;
import androidx.compose.ui.input.pointer.g;
import androidx.compose.ui.node.l;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import com.google.android.q22;
import com.google.android.rw0;
import com.google.inputmethod.IndirectPointerInputChange;
import com.google.inputmethod.av5;
import com.google.inputmethod.bf9;
import com.google.inputmethod.bfb;
import com.google.inputmethod.bs1;
import com.google.inputmethod.cfb;
import com.google.inputmethod.cs1;
import com.google.inputmethod.cw4;
import com.google.inputmethod.cx5;
import com.google.inputmethod.ev5;
import com.google.inputmethod.fhd;
import com.google.inputmethod.g16;
import com.google.inputmethod.hpa;
import com.google.inputmethod.k26;
import com.google.inputmethod.k33;
import com.google.inputmethod.le1;
import com.google.inputmethod.ml9;
import com.google.inputmethod.mv5;
import com.google.inputmethod.nfb;
import com.google.inputmethod.on8;
import com.google.inputmethod.p7e;
import com.google.inputmethod.r16;
import com.google.inputmethod.r48;
import com.google.inputmethod.rn8;
import com.google.inputmethod.si6;
import com.google.inputmethod.tsb;
import com.google.inputmethod.up1;
import com.google.inputmethod.w48;
import com.google.inputmethod.wgc;
import com.google.inputmethod.wu5;
import com.google.inputmethod.x23;
import com.google.inputmethod.xi6;
import com.google.inputmethod.y23;
import com.google.inputmethod.y97;
import com.google.inputmethod.yf5;
import com.google.inputmethod.zf5;
import com.google.inputmethod.zv4;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.j;
import kotlinx.coroutines.s;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\n\b!\u0018\u0000 §\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t:\u0002¨\u0001BM\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0016H\u0002¢\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\"\u0010 J\u000f\u0010#\u001a\u00020\u000eH\u0002¢\u0006\u0004\b#\u0010\u001bJ\u0019\u0010&\u001a\u00020\u000e2\b\u0010%\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020(H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0016H\u0002¢\u0006\u0004\b+\u0010 J\u000f\u0010,\u001a\u00020\u0016H\u0002¢\u0006\u0004\b,\u0010 J\u0011\u0010.\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b.\u0010/J\u0013\u00101\u001a\u00020\u0016*\u000200H\u0016¢\u0006\u0004\b1\u00102JU\u00103\u001a\u00020\u00162\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0004¢\u0006\u0004\b3\u00104J\u0017\u00108\u001a\u0002072\u0006\u00106\u001a\u000205H\u0004¢\u0006\u0004\b8\u00109J\u001f\u0010=\u001a\u00020\u00162\u0006\u0010%\u001a\u00020:2\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b=\u0010>J\r\u0010?\u001a\u00020\u0016¢\u0006\u0004\b?\u0010 J\u000f\u0010@\u001a\u00020\u0016H\u0016¢\u0006\u0004\b@\u0010 J\r\u0010A\u001a\u00020\u0016¢\u0006\u0004\bA\u0010 J\u000f\u0010B\u001a\u00020\u0016H\u0004¢\u0006\u0004\bB\u0010 J'\u0010F\u001a\u00020\u00162\u0006\u0010D\u001a\u00020C2\u0006\u0010<\u001a\u00020;2\u0006\u0010E\u001a\u000205H\u0016¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u0016H\u0016¢\u0006\u0004\bH\u0010 J\u0015\u0010J\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020I¢\u0006\u0004\bJ\u0010KJ\u0017\u0010L\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020IH$¢\u0006\u0004\bL\u0010KJ\u0017\u0010M\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020IH$¢\u0006\u0004\bM\u0010KJ\u000f\u0010N\u001a\u00020\u0016H\u0014¢\u0006\u0004\bN\u0010 J\u0015\u0010O\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020I¢\u0006\u0004\bO\u0010KJ\u0011\u0010P\u001a\u00020\u0016*\u000200¢\u0006\u0004\bP\u00102J\u0011\u0010Q\u001a\u0004\u0018\u00010\u0016H\u0004¢\u0006\u0004\bQ\u0010RJ\u0017\u0010S\u001a\u00020\u00162\u0006\u0010%\u001a\u00020(H\u0004¢\u0006\u0004\bS\u0010TJ\u0017\u0010U\u001a\u00020\u00162\u0006\u0010%\u001a\u00020$H\u0004¢\u0006\u0004\bU\u0010VJ\u001f\u0010Z\u001a\u00020\u00162\u0006\u0010X\u001a\u00020W2\u0006\u0010Y\u001a\u00020\u000eH\u0004¢\u0006\u0004\bZ\u0010[J\u001f\u0010\\\u001a\u00020\u00162\u0006\u0010X\u001a\u00020W2\u0006\u0010Y\u001a\u00020\u000eH\u0004¢\u0006\u0004\b\\\u0010[J\u0017\u0010]\u001a\u00020\u00162\u0006\u0010Y\u001a\u00020\u000eH\u0004¢\u0006\u0004\b]\u0010\u001eJ\u001c\u0010_\u001a\u00020\u0016*\u00020^2\u0006\u0010X\u001a\u00020WH\u0084@¢\u0006\u0004\b_\u0010`R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR$\u0010\u0010\u001a\u00020\u000e2\u0006\u0010k\u001a\u00020\u000e8\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\bl\u0010f\u001a\u0004\bm\u0010\u001bR0\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\f\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010qR\u001a\u0010t\u001a\u00020\u000e8\u0006X\u0086D¢\u0006\f\n\u0004\br\u0010f\u001a\u0004\bs\u0010\u001bR\u0014\u0010x\u001a\u00020u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u0018\u0010z\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010dR\u0018\u0010}\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|R\u001a\u0010\u0081\u0001\u001a\u0004\u0018\u00010~8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u001b\u0010\u0083\u0001\u001a\u0004\u0018\u00010~8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0080\u0001R\u001c\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001c\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u0088\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001f\u0010\u008f\u0001\u001a\n\u0012\u0005\u0012\u00030\u0084\u00010\u008c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0019\u0010\u0092\u0001\u001a\u00020W8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001c\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0086\u0001R\u001b\u0010\u0096\u0001\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0095\u0001R\u001a\u0010\u0098\u0001\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0097\u0001\u0010bR\u0018\u0010\u009a\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0099\u0001\u0010fR\u001c\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u009b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R \u0010¤\u0001\u001a\u00030\u009f\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b \u0001\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001R\u0013\u0010¦\u0001\u001a\u00020\u000e8F¢\u0006\u0007\u001a\u0005\b¥\u0001\u0010\u001b¨\u0006©\u0001"}, d2 = {"Landroidx/compose/foundation/AbstractClickableNode;", "Lcom/google/android/k33;", "Lcom/google/android/bf9;", "Lcom/google/android/xi6;", "Lcom/google/android/bfb;", "Lcom/google/android/fhd;", "Lcom/google/android/bs1;", "Lcom/google/android/on8;", "Lcom/google/android/mv5;", "Lcom/google/android/zv4;", "Lcom/google/android/r48;", "interactionSource", "Lcom/google/android/av5;", "indicationNodeFactory", "", "useLocalIndication", "enabled", "", "onClickLabel", "Lcom/google/android/hpa;", "role", "Lkotlin/Function0;", "", "onClick", "<init>", "(Lcom/google/android/r48;Lcom/google/android/av5;ZZLjava/lang/String;Lcom/google/android/hpa;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "g4", "()Z", "isFocused", "c4", "(Z)V", "e4", "()V", "Y3", "X3", "H3", "Landroidx/compose/ui/input/pointer/i;", "event", "I3", "(Landroidx/compose/ui/input/pointer/i;)Z", "Lcom/google/android/hv5;", "J3", "(Lcom/google/android/hv5;)Z", "L3", "M3", "Lcom/google/android/wgc;", "G3", "()Lcom/google/android/wgc;", "Lcom/google/android/nfb;", "E3", "(Lcom/google/android/nfb;)V", "h4", "(Lcom/google/android/r48;Lcom/google/android/av5;ZZLjava/lang/String;Lcom/google/android/hpa;Lkotlin/jvm/functions/Function0;)V", "Lcom/google/android/q16;", "size", "Lcom/google/android/tsb;", "O3", "(J)J", "Lcom/google/android/ev5;", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "p2", "(Lcom/google/android/ev5;Landroidx/compose/ui/input/pointer/PointerEventPass;)V", "V2", "M1", "W2", "K3", "Landroidx/compose/ui/input/pointer/e;", "pointerEvent", "bounds", "x1", "(Landroidx/compose/ui/input/pointer/e;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "K0", "Lcom/google/android/oi6;", "n2", "(Landroid/view/KeyEvent;)Z", "a4", "b4", "Z3", "t0", "H0", "f4", "()Lkotlin/Unit;", "V3", "(Lcom/google/android/hv5;)V", "U3", "(Landroidx/compose/ui/input/pointer/i;)V", "Lcom/google/android/rn8;", "offset", "indirectPointer", "W3", "(JZ)V", "T3", "R3", "Lcom/google/android/ml9;", "Q3", "(Lcom/google/android/ml9;JLcom/google/android/q22;)Ljava/lang/Object;", "r", "Lcom/google/android/r48;", "s", "Lcom/google/android/av5;", "t", "Z", "u", "Ljava/lang/String;", "v", "Lcom/google/android/hpa;", "value", "w", "N3", "x", "Lkotlin/jvm/functions/Function0;", "P3", "()Lkotlin/jvm/functions/Function0;", "y", "Q2", "shouldAutoInvalidate", "Landroidx/compose/foundation/FocusableNode;", "z", "Landroidx/compose/foundation/FocusableNode;", "focusableNode", "A", "localIndicationNodeFactory", "B", "Lcom/google/android/wgc;", "pointerInputNode", "Lcom/google/android/x23;", "C", "Lcom/google/android/x23;", "gestureNode", "D", "indicationNode", "Landroidx/compose/foundation/interaction/a$b;", "E", "Landroidx/compose/foundation/interaction/a$b;", "pressInteraction", "Lcom/google/android/yf5;", "F", "Lcom/google/android/yf5;", "hoverInteraction", "Lcom/google/android/w48;", "G", "Lcom/google/android/w48;", "currentKeyPressInteractions", "H", "J", "centerOffset", "I", "indirectPointerPressInteraction", "Lcom/google/android/rn8;", "indirectPointerEventPressPosition", "K", "userProvidedInteractionSource", "L", "lazilyCreateIndication", "Lkotlinx/coroutines/s;", "M", "Lkotlinx/coroutines/s;", "delayJob", "", "N", "Ljava/lang/Object;", "p1", "()Ljava/lang/Object;", "traverseKey", "h1", "shouldMergeDescendantSemantics", "O", "a", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class AbstractClickableNode extends k33 implements bf9, xi6, bfb, fhd, bs1, on8, mv5, zv4 {

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int P = 8;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private av5 localIndicationNodeFactory;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private wgc pointerInputNode;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private x23 gestureNode;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private x23 indicationNode;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private a.b pressInteraction;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private yf5 hoverInteraction;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final w48<a.b> currentKeyPressInteractions;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private long centerOffset;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private a.b indirectPointerPressInteraction;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private rn8 indirectPointerEventPressPosition;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private r48 userProvidedInteractionSource;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private boolean lazilyCreateIndication;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private s delayJob;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final Object traverseKey;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private r48 interactionSource;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private av5 indicationNodeFactory;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private boolean useLocalIndication;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private String onClickLabel;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private hpa role;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private boolean enabled;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private Function0<Unit> onClick;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final FocusableNode focusableNode;

    /* JADX INFO: renamed from: androidx.compose.foundation.AbstractClickableNode$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/AbstractClickableNode$a;", "", "<init>", "()V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ AbstractClickableNode(r48 r48Var, av5 av5Var, boolean z, boolean z2, String str, hpa hpaVar, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(r48Var, av5Var, z, z2, str, hpaVar, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean F3(AbstractClickableNode abstractClickableNode) {
        abstractClickableNode.onClick.invoke();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean H3() {
        return ClickableKt.A(this) || le1.b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final boolean I3(PointerInputChange event) throws KotlinNothingValueException {
        boolean zW;
        if (event == null) {
            zW = cw4.c(this) != null;
        } else {
            zW = ClickableKt.w(this, event);
        }
        return zW || le1.b(this);
    }

    private final boolean J3(IndirectPointerInputChange event) {
        return ClickableKt.x(this, event) || le1.b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L3() {
        if (this.hoverInteraction == null) {
            yf5 yf5Var = new yf5();
            r48 r48Var = this.interactionSource;
            if (r48Var != null) {
                rw0.d(L2(), (CoroutineContext) null, (CoroutineStart) null, new ta2(r48Var, yf5Var, null), 3, (Object) null);
            }
            this.hoverInteraction = yf5Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M3() {
        yf5 yf5Var = this.hoverInteraction;
        if (yf5Var != null) {
            zf5 zf5Var = new zf5(yf5Var);
            r48 r48Var = this.interactionSource;
            if (r48Var != null) {
                rw0.d(L2(), (CoroutineContext) null, (CoroutineStart) null, new C0136AbstractClickableNode$emitHoverExit$1$1$1(r48Var, zf5Var, null), 3, (Object) null);
            }
            this.hoverInteraction = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S3(r48 r48Var, a.C0016a c0016a, Throwable th) {
        r48Var.b(c0016a);
        return Unit.a;
    }

    private final void X3() {
        if (up1.isDelayPressesUsingGestureConsumptionEnabled && this.gestureNode == null) {
            this.gestureNode = m3(cw4.b(this));
        }
    }

    private final void Y3() {
        if (this.indicationNode != null) {
            return;
        }
        av5 av5Var = this.useLocalIndication ? this.localIndicationNodeFactory : this.indicationNodeFactory;
        if (av5Var != null) {
            if (this.interactionSource == null) {
                this.interactionSource = k26.a();
            }
            this.focusableNode.F3(this.interactionSource);
            r48 r48Var = this.interactionSource;
            Intrinsics.g(r48Var);
            x23 x23VarB = av5Var.b(r48Var);
            m3(x23VarB);
            this.indicationNode = x23VarB;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:20:0x0060 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0062 A[LOOP:0: B:11:0x001a->B:21:0x0062, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0065 A[EDGE_INSN: B:28:0x0065->B:22:0x0065 BREAK  A[LOOP:0: B:11:0x001a->B:21:0x0062], SYNTHETIC] */
    public final void c4(boolean isFocused) {
        if (isFocused) {
            Y3();
            return;
        }
        if (this.interactionSource != null) {
            w48<a.b> w48Var = this.currentKeyPressInteractions;
            Object[] objArr = w48Var.values;
            long[] jArr = w48Var.metadata;
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
                                rw0.d(L2(), (CoroutineContext) null, (CoroutineStart) null, new C0148AbstractClickableNode$onFocusChange$1$1(this, (a.b) objArr[(i << 3) + i3], null), 3, (Object) null);
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
            a.b bVar = this.indirectPointerPressInteraction;
            if (bVar != null) {
                rw0.d(L2(), (CoroutineContext) null, (CoroutineStart) null, new C0149AbstractClickableNode$onFocusChange$2$1(this, bVar, null), 3, (Object) null);
            }
        }
        this.currentKeyPressInteractions.g();
        this.indirectPointerPressInteraction = null;
        Z3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d4(AbstractClickableNode abstractClickableNode) {
        wu5 wu5Var = (wu5) cs1.a(abstractClickableNode, IndicationKt.d());
        if (!(wu5Var instanceof av5)) {
            cx5.a(ClickableKt.F(wu5Var));
        }
        av5 av5Var = abstractClickableNode.localIndicationNodeFactory;
        av5 av5Var2 = (av5) wu5Var;
        abstractClickableNode.localIndicationNodeFactory = av5Var2;
        if (av5Var != null && !Intrinsics.e(av5Var2, av5Var)) {
            abstractClickableNode.e4();
        }
        return Unit.a;
    }

    private final void e4() {
        x23 x23Var = this.indicationNode;
        if (x23Var == null && this.lazilyCreateIndication) {
            return;
        }
        if (x23Var != null) {
            p3(x23Var);
        }
        this.indicationNode = null;
        Y3();
    }

    private final boolean g4() {
        return this.userProvidedInteractionSource == null;
    }

    public void E3(nfb nfbVar) {
    }

    public wgc G3() {
        return null;
    }

    @Override // com.google.inputmethod.bfb
    public final void H0(nfb nfbVar) {
        hpa hpaVar = this.role;
        if (hpaVar != null) {
            Intrinsics.g(hpaVar);
            SemanticsPropertiesKt.p0(nfbVar, hpaVar.getValue());
        }
        SemanticsPropertiesKt.w(nfbVar, this.onClickLabel, new Function0() { // from class: com.google.android.g1
            public final Object invoke() {
                return Boolean.valueOf(AbstractClickableNode.F3(this.a));
            }
        });
        if (this.enabled) {
            this.focusableNode.H0(nfbVar);
        } else {
            SemanticsPropertiesKt.i(nfbVar);
        }
        E3(nfbVar);
    }

    @Override // com.google.inputmethod.bf9
    public void K0() {
        yf5 yf5Var;
        r48 r48Var = this.interactionSource;
        if (r48Var != null && (yf5Var = this.hoverInteraction) != null) {
            r48Var.b(new zf5(yf5Var));
        }
        this.hoverInteraction = null;
        wgc wgcVar = this.pointerInputNode;
        if (wgcVar != null) {
            wgcVar.K0();
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0071 A[LOOP:0: B:16:0x0035->B:26:0x0071, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0074 A[EDGE_INSN: B:30:0x0074->B:27:0x0074 BREAK  A[LOOP:0: B:16:0x0035->B:26:0x0071], SYNTHETIC] */
    protected final void K3() {
        r48 r48Var = this.interactionSource;
        if (r48Var != null) {
            a.b bVar = this.pressInteraction;
            if (bVar != null) {
                r48Var.b(new a.C0016a(bVar));
            }
            a.b bVar2 = this.indirectPointerPressInteraction;
            if (bVar2 != null) {
                r48Var.b(new a.C0016a(bVar2));
            }
            yf5 yf5Var = this.hoverInteraction;
            if (yf5Var != null) {
                r48Var.b(new zf5(yf5Var));
            }
            w48<a.b> w48Var = this.currentKeyPressInteractions;
            Object[] objArr = w48Var.values;
            long[] jArr = w48Var.metadata;
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
                                r48Var.b(new a.C0016a((a.b) objArr[(i << 3) + i3]));
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
        }
        this.pressInteraction = null;
        this.indirectPointerPressInteraction = null;
        this.indirectPointerEventPressPosition = null;
        this.hoverInteraction = null;
        this.currentKeyPressInteractions.g();
    }

    @Override // com.google.inputmethod.on8
    public void M1() {
        if (this.useLocalIndication) {
            l.a(this, new Function0() { // from class: com.google.android.e1
                public final Object invoke() {
                    return AbstractClickableNode.d4(this.a);
                }
            });
        }
    }

    /* JADX INFO: renamed from: N3, reason: from getter */
    protected final boolean getEnabled() {
        return this.enabled;
    }

    protected final long O3(long size) {
        long jB1 = y23.m(this).b1(((p7e) cs1.a(this, CompositionLocalsKt.u())).g());
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (jB1 >> 32)) - ((int) (size >> 32))) / 2.0f;
        return tsb.d((((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jB1 & 4294967295L)) - ((int) (size & 4294967295L))) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32));
    }

    protected final Function0<Unit> P3() {
        return this.onClick;
    }

    @Override // androidx.compose.ui.b.c
    /* JADX INFO: renamed from: Q2, reason: from getter */
    public final boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    protected final Object Q3(ml9 ml9Var, long j, q22<? super Unit> q22Var) {
        Object objG;
        r48 r48Var = this.interactionSource;
        return (r48Var == null || (objG = j.g(new C0137AbstractClickableNode$handlePressInteraction$2$1(ml9Var, j, r48Var, this, null), q22Var)) != kotlin.coroutines.intrinsics.a.g()) ? Unit.a : objG;
    }

    protected final void R3(boolean indirectPointer) {
        final r48 r48Var = this.interactionSource;
        if (r48Var != null) {
            s sVar = this.delayJob;
            if (sVar == null || !sVar.b()) {
                a.b bVar = indirectPointer ? this.indirectPointerPressInteraction : this.pressInteraction;
                if (bVar != null) {
                    final a.C0016a c0016a = new a.C0016a(bVar);
                    s sVar2 = L2().getCoroutineContext().get(s.u2);
                    rw0.d(L2(), (CoroutineContext) null, (CoroutineStart) null, new C0139AbstractClickableNode$handlePressInteractionCancel$1$1$1(r48Var, c0016a, sVar2 != null ? sVar2.A(new Function1() { // from class: com.google.android.f1
                        public final Object invoke(Object obj) {
                            return AbstractClickableNode.S3(r48Var, c0016a, (Throwable) obj);
                        }
                    }) : null, null), 3, (Object) null);
                }
            } else {
                s sVar3 = this.delayJob;
                if (sVar3 != null) {
                    s.a.a(sVar3, (CancellationException) null, 1, (Object) null);
                }
            }
            if (indirectPointer) {
                this.indirectPointerPressInteraction = null;
            } else {
                this.pressInteraction = null;
            }
        }
    }

    protected final void T3(long offset, boolean indirectPointer) {
        r48 r48Var = this.interactionSource;
        if (r48Var != null) {
            s sVar = this.delayJob;
            if (sVar == null || !sVar.b()) {
                a.b bVar = indirectPointer ? this.indirectPointerPressInteraction : this.pressInteraction;
                if (bVar != null) {
                    rw0.d(L2(), (CoroutineContext) null, (CoroutineStart) null, new C0141AbstractClickableNode$handlePressInteractionRelease$1$2$1(bVar, r48Var, null), 3, (Object) null);
                }
            } else {
                s.a.a(sVar, (CancellationException) null, 1, (Object) null);
                rw0.d(L2(), (CoroutineContext) null, (CoroutineStart) null, new C0140AbstractClickableNode$handlePressInteractionRelease$1$1(sVar, offset, r48Var, null), 3, (Object) null);
            }
            if (indirectPointer) {
                this.indirectPointerPressInteraction = null;
            } else {
                this.pressInteraction = null;
            }
        }
    }

    protected final void U3(PointerInputChange event) {
        r48 r48Var = this.interactionSource;
        if (r48Var != null) {
            a.b bVar = new a.b(event.getPosition(), null);
            if (I3(event)) {
                this.delayJob = rw0.d(L2(), (CoroutineContext) null, (CoroutineStart) null, new C0144AbstractClickableNode$handlePressInteractionStart$2$1(r48Var, bVar, this, null), 3, (Object) null);
            } else {
                this.pressInteraction = bVar;
                rw0.d(L2(), (CoroutineContext) null, (CoroutineStart) null, new C0145AbstractClickableNode$handlePressInteractionStart$2$2(r48Var, bVar, null), 3, (Object) null);
            }
        }
    }

    @Override // androidx.compose.ui.b.c
    public final void V2() {
        M1();
        if (!this.lazilyCreateIndication) {
            Y3();
        }
        if (this.enabled) {
            m3(this.focusableNode);
        }
    }

    protected final void V3(IndirectPointerInputChange event) {
        r48 r48Var = this.interactionSource;
        if (r48Var != null) {
            a.b bVar = new a.b(event.getPosition(), null);
            if (J3(event)) {
                this.delayJob = rw0.d(L2(), (CoroutineContext) null, (CoroutineStart) null, new C0142AbstractClickableNode$handlePressInteractionStart$1$1(r48Var, bVar, this, null), 3, (Object) null);
            } else {
                this.indirectPointerPressInteraction = bVar;
                rw0.d(L2(), (CoroutineContext) null, (CoroutineStart) null, new C0143AbstractClickableNode$handlePressInteractionStart$1$2(r48Var, bVar, null), 3, (Object) null);
            }
        }
    }

    @Override // androidx.compose.ui.b.c
    public final void W2() {
        K3();
        if (this.userProvidedInteractionSource == null) {
            this.interactionSource = null;
        }
        x23 x23Var = this.indicationNode;
        if (x23Var != null) {
            p3(x23Var);
        }
        this.indicationNode = null;
        x23 x23Var2 = this.gestureNode;
        if (x23Var2 != null) {
            p3(x23Var2);
        }
        this.gestureNode = null;
    }

    protected final void W3(long offset, boolean indirectPointer) {
        r48 r48Var = this.interactionSource;
        if (r48Var != null) {
            a.b bVar = new a.b(offset, null);
            if (up1.isDelayPressesUsingGestureConsumptionEnabled ? I3(null) : H3()) {
                this.delayJob = rw0.d(L2(), (CoroutineContext) null, (CoroutineStart) null, new C0146AbstractClickableNode$handlePressInteractionStart$3$1(r48Var, bVar, indirectPointer, this, null), 3, (Object) null);
                return;
            }
            if (indirectPointer) {
                this.indirectPointerPressInteraction = bVar;
            } else {
                this.pressInteraction = bVar;
            }
            rw0.d(L2(), (CoroutineContext) null, (CoroutineStart) null, new C0147AbstractClickableNode$handlePressInteractionStart$3$2(r48Var, bVar, null), 3, (Object) null);
        }
    }

    protected void Z3() {
    }

    protected abstract boolean a4(KeyEvent event);

    protected abstract boolean b4(KeyEvent event);

    protected final Unit f4() {
        wgc wgcVar = this.pointerInputNode;
        if (wgcVar == null) {
            return null;
        }
        wgcVar.X1();
        return Unit.a;
    }

    @Override // com.google.inputmethod.bfb
    /* JADX INFO: renamed from: h1 */
    public final boolean getMergeDescendants() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0074  */
    protected final void h4(r48 interactionSource, av5 indicationNodeFactory, boolean useLocalIndication, boolean enabled, String onClickLabel, hpa role, Function0<Unit> onClick) {
        boolean z;
        boolean z2;
        if (Intrinsics.e(this.userProvidedInteractionSource, interactionSource)) {
            z = false;
        } else {
            K3();
            this.userProvidedInteractionSource = interactionSource;
            this.interactionSource = interactionSource;
            z = true;
        }
        if (!Intrinsics.e(this.indicationNodeFactory, indicationNodeFactory)) {
            this.indicationNodeFactory = indicationNodeFactory;
            z = true;
        }
        if (this.useLocalIndication != useLocalIndication) {
            this.useLocalIndication = useLocalIndication;
            if (useLocalIndication) {
                M1();
            }
            z = true;
        }
        if (this.enabled != enabled) {
            if (enabled) {
                m3(this.focusableNode);
            } else {
                p3(this.focusableNode);
                K3();
            }
            cfb.d(this);
            this.enabled = enabled;
        }
        if (!Intrinsics.e(this.onClickLabel, onClickLabel)) {
            this.onClickLabel = onClickLabel;
            cfb.d(this);
        }
        if (!Intrinsics.e(this.role, role)) {
            this.role = role;
            cfb.d(this);
        }
        this.onClick = onClick;
        if (this.lazilyCreateIndication != g4()) {
            boolean zG4 = g4();
            this.lazilyCreateIndication = zG4;
            z2 = (zG4 || this.indicationNode != null) ? z : true;
        }
        if (z2) {
            e4();
        }
        this.focusableNode.F3(this.interactionSource);
    }

    @Override // com.google.inputmethod.xi6
    public final boolean n2(KeyEvent event) {
        boolean z;
        Y3();
        long jA = si6.a(event);
        if (this.enabled && ClickableKt.E(event)) {
            if (this.currentKeyPressInteractions.a(jA)) {
                z = false;
            } else {
                a.b bVar = new a.b(this.centerOffset, null);
                this.currentKeyPressInteractions.q(jA, bVar);
                if (this.interactionSource != null) {
                    rw0.d(L2(), (CoroutineContext) null, (CoroutineStart) null, new C0150AbstractClickableNode$onKeyEvent$1(this, bVar, null), 3, (Object) null);
                }
                z = true;
            }
            return a4(event) || z;
        }
        if (this.enabled && ClickableKt.C(event)) {
            a.b bVarN = this.currentKeyPressInteractions.n(jA);
            if (bVarN != null) {
                if (this.interactionSource != null) {
                    rw0.d(L2(), (CoroutineContext) null, (CoroutineStart) null, new C0151AbstractClickableNode$onKeyEvent$2(this, bVarN, null), 3, (Object) null);
                }
                b4(event);
            }
            if (bVarN != null) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.inputmethod.fhd
    /* JADX INFO: renamed from: p1, reason: from getter */
    public Object getTraverseKey() {
        return this.traverseKey;
    }

    @Override // com.google.inputmethod.mv5
    public void p2(ev5 event, PointerEventPass pass) {
        Y3();
        if (this.enabled) {
            X3();
        }
    }

    @Override // com.google.inputmethod.xi6
    public final boolean t0(KeyEvent event) {
        return false;
    }

    @Override // com.google.inputmethod.bf9
    public void x1(e pointerEvent, PointerEventPass pass, long bounds) {
        wgc wgcVarG3;
        long jB = r16.b(bounds);
        this.centerOffset = rn8.e((((long) Float.floatToRawIntBits(g16.k(jB))) << 32) | (((long) Float.floatToRawIntBits(g16.l(jB))) & 4294967295L));
        Y3();
        if (this.enabled) {
            X3();
            if (pass == PointerEventPass.Main) {
                int type = pointerEvent.getType();
                g.Companion companion = g.INSTANCE;
                if (g.o(type, companion.a())) {
                    rw0.d(L2(), (CoroutineContext) null, (CoroutineStart) null, new C0152AbstractClickableNode$onPointerEvent$1(this, null), 3, (Object) null);
                } else if (g.o(type, companion.b())) {
                    rw0.d(L2(), (CoroutineContext) null, (CoroutineStart) null, new C0153AbstractClickableNode$onPointerEvent$2(this, null), 3, (Object) null);
                }
            }
        }
        if (this.pointerInputNode == null && (wgcVarG3 = G3()) != null) {
            this.pointerInputNode = (wgc) m3(wgcVarG3);
        }
        wgc wgcVar = this.pointerInputNode;
        if (wgcVar != null) {
            wgcVar.x1(pointerEvent, pass, bounds);
        }
    }

    private AbstractClickableNode(r48 r48Var, av5 av5Var, boolean z, boolean z2, String str, hpa hpaVar, Function0<Unit> function0) {
        this.interactionSource = r48Var;
        this.indicationNodeFactory = av5Var;
        this.useLocalIndication = z;
        this.onClickLabel = str;
        this.role = hpaVar;
        this.enabled = z2;
        this.onClick = function0;
        this.focusableNode = new FocusableNode(this.interactionSource, androidx.compose.ui.focus.j.INSTANCE.c(), new AbstractClickableNode$focusableNode$1(this), null);
        this.currentKeyPressInteractions = y97.a();
        this.centerOffset = rn8.INSTANCE.c();
        this.userProvidedInteractionSource = this.interactionSource;
        this.lazilyCreateIndication = g4();
        this.traverseKey = INSTANCE;
    }
}
