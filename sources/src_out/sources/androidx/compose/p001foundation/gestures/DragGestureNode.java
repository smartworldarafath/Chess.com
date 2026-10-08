package androidx.compose.p001foundation.gestures;

import androidx.compose.p001foundation.gestures.DragGestureNode;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.e;
import androidx.compose.ui.input.pointer.f;
import androidx.compose.ui.input.pointer.j;
import androidx.compose.ui.platform.CompositionLocalsKt;
import com.google.android.h81;
import com.google.android.p81;
import com.google.android.q22;
import com.google.android.rw0;
import com.google.inputmethod.IndirectPointerInputChange;
import com.google.inputmethod.ag3;
import com.google.inputmethod.bf9;
import com.google.inputmethod.bs1;
import com.google.inputmethod.cs1;
import com.google.inputmethod.cw4;
import com.google.inputmethod.ev5;
import com.google.inputmethod.iv5;
import com.google.inputmethod.k33;
import com.google.inputmethod.ln6;
import com.google.inputmethod.mv5;
import com.google.inputmethod.p7e;
import com.google.inputmethod.r48;
import com.google.inputmethod.rbd;
import com.google.inputmethod.rn8;
import com.google.inputmethod.se9;
import com.google.inputmethod.t04;
import com.google.inputmethod.t3e;
import com.google.inputmethod.u3e;
import com.google.inputmethod.up1;
import com.google.inputmethod.w3e;
import com.google.inputmethod.x23;
import com.google.inputmethod.y23;
import com.google.inputmethod.yf3;
import com.google.inputmethod.z3e;
import com.google.inputmethod.zf3;
import com.google.inputmethod.zv4;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.m;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0011\b!\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B7\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010 \u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0082@¢\u0006\u0004\b \u0010!J\u0018\u0010#\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\"H\u0082@¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u001bH\u0082@¢\u0006\u0004\b%\u0010&J\u001f\u0010+\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u001bH\u0002¢\u0006\u0004\b-\u0010\u001dJ3\u00105\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u0002002\b\b\u0002\u00103\u001a\u0002022\b\b\u0002\u00104\u001a\u00020\bH\u0002¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\u001b2\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u001bH\u0002¢\u0006\u0004\b9\u0010\u001dJ'\u0010;\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u0002002\u0006\u0010:\u001a\u00020\u0018H\u0002¢\u0006\u0004\b;\u0010<J'\u0010?\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\b?\u0010@J'\u0010B\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010>\u001a\u00020AH\u0002¢\u0006\u0004\bB\u0010CJ'\u0010E\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010>\u001a\u00020DH\u0002¢\u0006\u0004\bE\u0010FJ'\u0010H\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010>\u001a\u00020GH\u0002¢\u0006\u0004\bH\u0010IJ'\u0010M\u001a\u00020\u001b2\u0006\u0010J\u001a\u00020.2\u0006\u0010K\u001a\u00020.2\u0006\u0010L\u001a\u000202H\u0002¢\u0006\u0004\bM\u0010NJ\u001f\u0010Q\u001a\u00020\u001b2\u0006\u0010O\u001a\u00020.2\u0006\u0010P\u001a\u000202H\u0002¢\u0006\u0004\bQ\u0010RJ\u0017\u0010S\u001a\u00020\u001b2\u0006\u0010O\u001a\u00020.H\u0002¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020\u001bH\u0002¢\u0006\u0004\bU\u0010\u001dJ@\u0010[\u001a\u00020\u001b2.\u0010Z\u001a*\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020W\u0012\u0004\u0012\u00020\u001b0\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0X\u0012\u0006\u0012\u0004\u0018\u00010Y0VH¦@¢\u0006\u0004\b[\u0010\\J\u0017\u0010^\u001a\u00020\u001b2\u0006\u0010]\u001a\u000202H&¢\u0006\u0004\b^\u00108J\u0017\u0010_\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\"H&¢\u0006\u0004\b_\u0010`J\u000f\u0010a\u001a\u00020\bH&¢\u0006\u0004\ba\u0010bJ\u000f\u0010c\u001a\u00020\u001bH\u0016¢\u0006\u0004\bc\u0010\u001dJ\u000f\u0010d\u001a\u00020\u001bH\u0004¢\u0006\u0004\bd\u0010\u001dJ\u0017\u0010f\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020eH\u0016¢\u0006\u0004\bf\u0010gJ'\u0010j\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010i\u001a\u00020hH\u0016¢\u0006\u0004\bj\u0010kJ\u001f\u0010m\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020l2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\bm\u0010nJ\u000f\u0010o\u001a\u00020\u001bH\u0016¢\u0006\u0004\bo\u0010\u001dJ\u0017\u0010p\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020.H\u0016¢\u0006\u0004\bp\u0010qJ\u000f\u0010r\u001a\u00020\u001bH\u0016¢\u0006\u0004\br\u0010\u001dJ\r\u0010s\u001a\u00020\u001b¢\u0006\u0004\bs\u0010\u001dJO\u0010u\u001a\u00020\u001b2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010t\u001a\u00020\b¢\u0006\u0004\bu\u0010vJ\u0015\u0010w\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u0015¢\u0006\u0004\bw\u0010xR$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\by\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R@\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\u007f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R'\u0010\n\u001a\u00020\b2\u0006\u0010\u007f\u001a\u00020\b8\u0004@BX\u0084\u000e¢\u0006\u000f\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0005\b\u0086\u0001\u0010bR,\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u007f\u001a\u0004\u0018\u00010\u000b8\u0004@BX\u0084\u000e¢\u0006\u0010\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001c\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R#\u0010\u0090\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0081\u0001R!\u0010\u0093\u0001\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u001c\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0094\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R(\u0010\u009c\u0001\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u0098\u0001\u0010\u0085\u0001\u001a\u0005\b\u0099\u0001\u0010b\"\u0006\b\u009a\u0001\u0010\u009b\u0001R(\u0010 \u0001\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u009d\u0001\u0010\u0085\u0001\u001a\u0005\b\u009e\u0001\u0010b\"\u0006\b\u009f\u0001\u0010\u009b\u0001R\u001b\u0010£\u0001\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u001b\u0010¦\u0001\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R\u001b\u0010©\u0001\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R\u001b\u0010¬\u0001\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001R\u001c\u0010°\u0001\u001a\u0005\u0018\u00010\u00ad\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R\u001b\u0010³\u0001\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R\u0019\u0010¶\u0001\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b´\u0001\u0010µ\u0001R\u001a\u0010:\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b·\u0001\u0010¸\u0001R\u001c\u0010»\u0001\u001a\u0005\u0018\u00010¹\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010º\u0001R\u0019\u0010½\u0001\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¼\u0001\u0010µ\u0001R\u0017\u0010À\u0001\u001a\u00020=8BX\u0082\u0004¢\u0006\b\u001a\u0006\b¾\u0001\u0010¿\u0001R\u0017\u0010Ã\u0001\u001a\u00020G8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÁ\u0001\u0010Â\u0001R\u0017\u0010Æ\u0001\u001a\u00020A8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÄ\u0001\u0010Å\u0001R\u0017\u0010É\u0001\u001a\u00020D8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÇ\u0001\u0010È\u0001¨\u0006Ê\u0001"}, d2 = {"Landroidx/compose/foundation/gestures/DragGestureNode;", "Lcom/google/android/k33;", "Lcom/google/android/bf9;", "Lcom/google/android/mv5;", "Lcom/google/android/bs1;", "Lcom/google/android/zv4;", "Lkotlin/Function1;", "Landroidx/compose/ui/input/pointer/j;", "", "canDrag", "enabled", "Lcom/google/android/r48;", "interactionSource", "Landroidx/compose/foundation/gestures/Orientation;", "orientationLock", "<init>", "(Lkotlin/jvm/functions/Function1;ZLcom/google/android/r48;Landroidx/compose/foundation/gestures/Orientation;)V", "Lcom/google/android/w3e;", "b4", "()Lcom/google/android/w3e;", "Lcom/google/android/h81;", "Landroidx/compose/foundation/gestures/l;", "Z3", "()Lcom/google/android/h81;", "Lcom/google/android/rbd;", "a4", "()Lcom/google/android/rbd;", "", "i4", "()V", "Landroidx/compose/foundation/gestures/l$c;", "event", "U3", "(Landroidx/compose/foundation/gestures/l$c;Lcom/google/android/q22;)Ljava/lang/Object;", "Landroidx/compose/foundation/gestures/l$d;", "V3", "(Landroidx/compose/foundation/gestures/l$d;Lcom/google/android/q22;)Ljava/lang/Object;", "T3", "(Lcom/google/android/q22;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/e;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Y3", "(Landroidx/compose/ui/input/pointer/e;Landroidx/compose/ui/input/pointer/PointerEventPass;)V", "c4", "Landroidx/compose/ui/input/pointer/i;", "initialDown", "Lcom/google/android/se9;", "pointerId", "Lcom/google/android/rn8;", "initialTouchSlopPositionChange", "verifyConsumptionInFinalPass", "L3", "(Landroidx/compose/ui/input/pointer/i;JJZ)V", "N3", "(J)V", "J3", "touchSlopDetector", "K3", "(Landroidx/compose/ui/input/pointer/i;JLcom/google/android/rbd;)V", "Landroidx/compose/foundation/gestures/DragDetectionState$AwaitDown;", "state", "X3", "(Landroidx/compose/ui/input/pointer/e;Landroidx/compose/ui/input/pointer/PointerEventPass;Landroidx/compose/foundation/gestures/DragDetectionState$AwaitDown;)V", "Landroidx/compose/foundation/gestures/DragDetectionState$b;", "S3", "(Landroidx/compose/ui/input/pointer/e;Landroidx/compose/ui/input/pointer/PointerEventPass;Landroidx/compose/foundation/gestures/DragDetectionState$b;)V", "Landroidx/compose/foundation/gestures/DragDetectionState$a;", "R3", "(Landroidx/compose/ui/input/pointer/e;Landroidx/compose/ui/input/pointer/PointerEventPass;Landroidx/compose/foundation/gestures/DragDetectionState$a;)V", "Landroidx/compose/foundation/gestures/DragDetectionState$c;", "W3", "(Landroidx/compose/ui/input/pointer/e;Landroidx/compose/ui/input/pointer/PointerEventPass;Landroidx/compose/foundation/gestures/DragDetectionState$c;)V", "down", "slopTriggerChange", "overSlopOffset", "f4", "(Landroidx/compose/ui/input/pointer/i;Landroidx/compose/ui/input/pointer/i;J)V", "change", "dragAmount", "e4", "(Landroidx/compose/ui/input/pointer/i;J)V", "g4", "(Landroidx/compose/ui/input/pointer/i;)V", "d4", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/l$b;", "Lcom/google/android/q22;", "", "forEachDelta", "z3", "(Lkotlin/jvm/functions/Function2;Lcom/google/android/q22;)Ljava/lang/Object;", "startedPosition", "P3", "Q3", "(Landroidx/compose/foundation/gestures/l$d;)V", "h4", "()Z", "W2", "H3", "Lcom/google/android/hv5;", "D2", "(Lcom/google/android/hv5;)Z", "Lcom/google/android/q16;", "bounds", "x1", "(Landroidx/compose/ui/input/pointer/e;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "Lcom/google/android/ev5;", "p2", "(Lcom/google/android/ev5;Landroidx/compose/ui/input/pointer/PointerEventPass;)V", "z2", "B1", "(Landroidx/compose/ui/input/pointer/i;)Z", "K0", "y3", "shouldResetPointerInputHandling", "j4", "(Lkotlin/jvm/functions/Function1;ZLcom/google/android/r48;Landroidx/compose/foundation/gestures/Orientation;Z)V", "O3", "(Landroidx/compose/foundation/gestures/l;)V", "r", "Landroidx/compose/foundation/gestures/Orientation;", "G3", "()Landroidx/compose/foundation/gestures/Orientation;", "setOrientationLock", "(Landroidx/compose/foundation/gestures/Orientation;)V", "value", "s", "Lkotlin/jvm/functions/Function1;", "D3", "()Lkotlin/jvm/functions/Function1;", "t", "Z", "F3", "u", "Lcom/google/android/r48;", "getInteractionSource", "()Lcom/google/android/r48;", "Lcom/google/android/x23;", "v", "Lcom/google/android/x23;", "gestureNode", "w", "_canDrag", "x", "Lcom/google/android/h81;", "channel", "Lcom/google/android/zf3;", "y", "Lcom/google/android/zf3;", "dragInteraction", "z", "I3", "setListeningForEvents$foundation", "(Z)V", "isListeningForEvents", "A", "isListeningForPointerInputEvents$foundation", "setListeningForPointerInputEvents$foundation", "isListeningForPointerInputEvents", "B", "Landroidx/compose/foundation/gestures/DragDetectionState$AwaitDown;", "_awaitDownState", "C", "Landroidx/compose/foundation/gestures/DragDetectionState$c;", "_draggingState", "D", "Landroidx/compose/foundation/gestures/DragDetectionState$b;", "_awaitTouchSlopState", "E", "Landroidx/compose/foundation/gestures/DragDetectionState$a;", "_awaitGesturePickupState", "Landroidx/compose/foundation/gestures/DragDetectionState;", "F", "Landroidx/compose/foundation/gestures/DragDetectionState;", "currentDragState", "G", "Lcom/google/android/w3e;", "velocityTracker", "H", "J", "previousPositionOnScreen", "I", "Lcom/google/android/rbd;", "Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector;", "Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector;", "indirectPointerInputDragCycleDetector", "K", "nodeOffset", "A3", "()Landroidx/compose/foundation/gestures/DragDetectionState$AwaitDown;", "awaitDownState", "E3", "()Landroidx/compose/foundation/gestures/DragDetectionState$c;", "draggingState", "C3", "()Landroidx/compose/foundation/gestures/DragDetectionState$b;", "awaitTouchSlopState", "B3", "()Landroidx/compose/foundation/gestures/DragDetectionState$a;", "awaitGesturePickupState", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class DragGestureNode extends k33 implements bf9, mv5, bs1, zv4 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private boolean isListeningForPointerInputEvents;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private DragDetectionState.AwaitDown _awaitDownState;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private DragDetectionState.c _draggingState;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private DragDetectionState.b _awaitTouchSlopState;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private DragDetectionState.a _awaitGesturePickupState;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private DragDetectionState currentDragState;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private w3e velocityTracker;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private long previousPositionOnScreen;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private rbd touchSlopDetector;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private IndirectPointerInputDragCycleDetector indirectPointerInputDragCycleDetector;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private long nodeOffset;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private Orientation orientationLock;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private Function1<? super j, Boolean> canDrag;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private boolean enabled;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private r48 interactionSource;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private x23 gestureNode;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final Function1<j, Boolean> _canDrag = new Function1() { // from class: com.google.android.xf3
        public final Object invoke(Object obj) {
            return Boolean.valueOf(DragGestureNode.t3(this.a, (j) obj));
        }
    };

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private h81<l> channel;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private zf3 dragInteraction;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private boolean isListeningForEvents;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DragDetectionState.AwaitDown.AwaitTouchSlop.values().length];
            try {
                iArr[DragDetectionState.AwaitDown.AwaitTouchSlop.NotInitialized.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DragGestureNode(Function1<? super j, Boolean> function1, boolean z, r48 r48Var, Orientation orientation) {
        this.orientationLock = orientation;
        this.canDrag = function1;
        this.enabled = z;
        this.interactionSource = r48Var;
        rn8.Companion companion = rn8.INSTANCE;
        this.previousPositionOnScreen = companion.b();
        this.nodeOffset = companion.c();
    }

    private final DragDetectionState.AwaitDown A3() {
        DragDetectionState.AwaitDown awaitDown = this._awaitDownState;
        if (awaitDown != null) {
            return awaitDown;
        }
        DragDetectionState.AwaitDown awaitDown2 = new DragDetectionState.AwaitDown(null, false, 3, null);
        this._awaitDownState = awaitDown2;
        return awaitDown2;
    }

    private final DragDetectionState.a B3() {
        DragDetectionState.a aVar = this._awaitGesturePickupState;
        if (aVar != null) {
            return aVar;
        }
        DragDetectionState.a aVar2 = new DragDetectionState.a(null, 0L, null, 7, null);
        this._awaitGesturePickupState = aVar2;
        return aVar2;
    }

    private final DragDetectionState.b C3() {
        DragDetectionState.b bVar = this._awaitTouchSlopState;
        if (bVar != null) {
            return bVar;
        }
        DragDetectionState.b bVar2 = new DragDetectionState.b(null, 0L, false, 7, null);
        this._awaitTouchSlopState = bVar2;
        return bVar2;
    }

    private final DragDetectionState.c E3() {
        DragDetectionState.c cVar = this._draggingState;
        if (cVar != null) {
            return cVar;
        }
        DragDetectionState.c cVar2 = new DragDetectionState.c(0L, 1, null);
        this._draggingState = cVar2;
        return cVar2;
    }

    private final void J3() {
        DragDetectionState.AwaitDown awaitDownA3 = A3();
        awaitDownA3.c(DragDetectionState.AwaitDown.AwaitTouchSlop.NotInitialized);
        awaitDownA3.d(false);
        this.currentDragState = awaitDownA3;
    }

    private final void K3(PointerInputChange initialDown, long pointerId, rbd touchSlopDetector) {
        DragDetectionState.a aVarB3 = B3();
        aVarB3.c(initialDown);
        aVarB3.d(pointerId);
        rbd.h(touchSlopDetector, 0L, 1, null);
        aVarB3.e(touchSlopDetector);
        this.currentDragState = aVarB3;
    }

    private final void L3(PointerInputChange initialDown, long pointerId, long initialTouchSlopPositionChange, boolean verifyConsumptionInFinalPass) {
        DragDetectionState.b bVarC3 = C3();
        bVarC3.d(initialDown);
        bVarC3.e(pointerId);
        rbd rbdVar = this.touchSlopDetector;
        if (rbdVar == null) {
            this.touchSlopDetector = new rbd(this.orientationLock, 0L, 2, null);
        } else {
            if (rbdVar != null) {
                rbdVar.i(this.orientationLock);
            }
            rbd rbdVar2 = this.touchSlopDetector;
            if (rbdVar2 != null) {
                rbdVar2.g(initialTouchSlopPositionChange);
            }
        }
        bVarC3.f(verifyConsumptionInFinalPass);
        this.currentDragState = bVarC3;
    }

    static /* synthetic */ void M3(DragGestureNode dragGestureNode, PointerInputChange pointerInputChange, long j, long j2, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: moveToAwaitTouchSlopState-aWI9W7U");
        }
        if ((i & 4) != 0) {
            j2 = rn8.INSTANCE.c();
        }
        long j3 = j2;
        if ((i & 8) != 0) {
            z = false;
        }
        dragGestureNode.L3(pointerInputChange, j, j3, z);
    }

    private final void N3(long pointerId) {
        DragDetectionState.c cVarE3 = E3();
        cVarE3.b(pointerId);
        this.currentDragState = cVarE3;
    }

    private final void R3(e pointerEvent, PointerEventPass pass, DragDetectionState.a state) {
        boolean z;
        if (pass != PointerEventPass.Final) {
            return;
        }
        List<PointerInputChange> listC = pointerEvent.c();
        int size = listC.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            } else {
                if (listC.get(i).q()) {
                    z = false;
                    break;
                }
                i++;
            }
        }
        List<PointerInputChange> listC2 = pointerEvent.c();
        int size2 = listC2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (listC2.get(i2).getPressed()) {
                if (pointerEvent.c().isEmpty()) {
                    break;
                }
                if (z) {
                    long position = ((PointerInputChange) m.z0(pointerEvent.c())).getPosition();
                    PointerInputChange initialDown = state.getInitialDown();
                    Intrinsics.g(initialDown);
                    long jP = rn8.p(position, initialDown.getPosition());
                    PointerInputChange initialDown2 = state.getInitialDown();
                    if (initialDown2 == null) {
                        throw new IllegalArgumentException("AwaitGesturePickup.initialDown was not initialized.");
                    }
                    M3(this, initialDown2, state.getPointerId(), jP, false, 8, null);
                    return;
                }
                return;
            }
        }
        J3();
    }

    private final void S3(e pointerEvent, PointerEventPass pass, DragDetectionState.b state) {
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        PointerInputChange pointerInputChange3;
        if (pass == PointerEventPass.Initial) {
            return;
        }
        List<PointerInputChange> listC = pointerEvent.c();
        int size = listC.size();
        int i = 0;
        while (true) {
            pointerInputChange = null;
            if (i >= size) {
                pointerInputChange2 = null;
                break;
            }
            pointerInputChange2 = listC.get(i);
            if (se9.b(pointerInputChange2.getId(), state.getPointerId())) {
                break;
            } else {
                i++;
            }
        }
        PointerInputChange pointerInputChange4 = pointerInputChange2;
        if (pointerInputChange4 == null) {
            List<PointerInputChange> listC2 = pointerEvent.c();
            int size2 = listC2.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size2) {
                    pointerInputChange3 = null;
                    break;
                }
                pointerInputChange3 = listC2.get(i2);
                if (pointerInputChange3.getPressed()) {
                    break;
                } else {
                    i2++;
                }
            }
            pointerInputChange4 = pointerInputChange3;
            if (pointerInputChange4 == null) {
                J3();
                return;
            }
            state.e(pointerInputChange4.getId());
        }
        if (pass == PointerEventPass.Main) {
            if (pointerInputChange4.q()) {
                PointerInputChange initialDown = state.getInitialDown();
                if (initialDown == null) {
                    throw new IllegalArgumentException("AwaitTouchSlop.initialDown was not initialized");
                }
                long pointerId = state.getPointerId();
                rbd rbdVar = this.touchSlopDetector;
                if (rbdVar == null) {
                    throw new IllegalArgumentException("AwaitTouchSlop.touchSlopDetector was not initialized");
                }
                K3(initialDown, pointerId, rbdVar);
            } else if (f.d(pointerInputChange4)) {
                List<PointerInputChange> listC3 = pointerEvent.c();
                int size3 = listC3.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    PointerInputChange pointerInputChange5 = listC3.get(i3);
                    if (pointerInputChange5.getPressed()) {
                        pointerInputChange = pointerInputChange5;
                        break;
                    }
                }
                PointerInputChange pointerInputChange6 = pointerInputChange;
                if (pointerInputChange6 == null) {
                    J3();
                } else {
                    state.e(pointerInputChange6.getId());
                }
            } else {
                long jD = rbd.d(a4(), f.h(pointerInputChange4), DragGestureDetectorKt.w((p7e) cs1.a(this, CompositionLocalsKt.u()), pointerInputChange4.getType()), false, 4, null);
                if (up1.isNestedDraggablesTouchConflictFixEnabled) {
                    if ((9223372034707292159L & jD) != 9205357640488583168L) {
                        boolean zB1 = B1(pointerInputChange4);
                        zv4 zv4VarC = cw4.c(this);
                        boolean z = zv4VarC != null && zv4VarC.B1(pointerInputChange4);
                        if (zB1 || !z) {
                            pointerInputChange4.a();
                            PointerInputChange initialDown2 = state.getInitialDown();
                            Intrinsics.g(initialDown2);
                            f4(initialDown2, pointerInputChange4, jD);
                            e4(pointerInputChange4, jD);
                            N3(pointerInputChange4.getId());
                        } else {
                            state.f(true);
                        }
                    } else {
                        state.f(true);
                    }
                } else if ((9223372034707292159L & jD) != 9205357640488583168L) {
                    pointerInputChange4.a();
                    PointerInputChange initialDown3 = state.getInitialDown();
                    Intrinsics.g(initialDown3);
                    f4(initialDown3, pointerInputChange4, jD);
                    e4(pointerInputChange4, jD);
                    N3(pointerInputChange4.getId());
                } else {
                    state.f(true);
                }
            }
        }
        if (pass == PointerEventPass.Final && state.getVerifyConsumptionInFinalPass()) {
            if (!pointerInputChange4.q()) {
                state.f(false);
                return;
            }
            PointerInputChange initialDown4 = state.getInitialDown();
            if (initialDown4 == null) {
                throw new IllegalArgumentException("AwaitTouchSlop.initialDown was not initialized");
            }
            long pointerId2 = state.getPointerId();
            rbd rbdVar2 = this.touchSlopDetector;
            if (rbdVar2 == null) {
                throw new IllegalArgumentException("AwaitTouchSlop.touchSlopDetector was not initialized");
            }
            K3(initialDown4, pointerId2, rbdVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object T3(q22<? super Unit> q22Var) {
        DragGestureNode$processDragCancel$1 dragGestureNode$processDragCancel$1;
        if (q22Var instanceof DragGestureNode$processDragCancel$1) {
            dragGestureNode$processDragCancel$1 = (DragGestureNode$processDragCancel$1) q22Var;
            int i = dragGestureNode$processDragCancel$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                dragGestureNode$processDragCancel$1.label = i - t04.INVALID_ID;
            } else {
                dragGestureNode$processDragCancel$1 = new DragGestureNode$processDragCancel$1(this, q22Var);
            }
        } else {
            dragGestureNode$processDragCancel$1 = new DragGestureNode$processDragCancel$1(this, q22Var);
        }
        Object obj = dragGestureNode$processDragCancel$1.result;
        Object objG = kotlin.coroutines.intrinsics.a.g();
        int i2 = dragGestureNode$processDragCancel$1.label;
        if (i2 == 0) {
            kotlin.f.b(obj);
            zf3 zf3Var = this.dragInteraction;
            if (zf3Var != null) {
                r48 r48Var = this.interactionSource;
                if (r48Var != null) {
                    yf3 yf3Var = new yf3(zf3Var);
                    dragGestureNode$processDragCancel$1.label = 1;
                    if (r48Var.a(yf3Var, dragGestureNode$processDragCancel$1) == objG) {
                        return objG;
                    }
                }
            }
            Q3(new l.d(t3e.INSTANCE.a(), false, null));
            return Unit.a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.f.b(obj);
        this.dragInteraction = null;
        Q3(new l.d(t3e.INSTANCE.a(), false, null));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object U3(l.c cVar, q22<? super Unit> q22Var) {
        DragGestureNode$processDragStart$1 dragGestureNode$processDragStart$1;
        r48 r48Var;
        zf3 zf3Var;
        l.c cVar2;
        zf3 zf3Var2;
        if (q22Var instanceof DragGestureNode$processDragStart$1) {
            dragGestureNode$processDragStart$1 = (DragGestureNode$processDragStart$1) q22Var;
            int i = dragGestureNode$processDragStart$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                dragGestureNode$processDragStart$1.label = i - t04.INVALID_ID;
            } else {
                dragGestureNode$processDragStart$1 = new DragGestureNode$processDragStart$1(this, q22Var);
            }
        } else {
            dragGestureNode$processDragStart$1 = new DragGestureNode$processDragStart$1(this, q22Var);
        }
        Object obj = dragGestureNode$processDragStart$1.result;
        Object objG = kotlin.coroutines.intrinsics.a.g();
        int i2 = dragGestureNode$processDragStart$1.label;
        if (i2 == 0) {
            kotlin.f.b(obj);
            zf3 zf3Var3 = this.dragInteraction;
            if (zf3Var3 != null && (r48Var = this.interactionSource) != null) {
                yf3 yf3Var = new yf3(zf3Var3);
                dragGestureNode$processDragStart$1.L$0 = cVar;
                dragGestureNode$processDragStart$1.label = 1;
                if (r48Var.a(yf3Var, dragGestureNode$processDragStart$1) != objG) {
                }
                return objG;
            }
            this.dragInteraction = zf3Var;
            P3(cVar.getStartPoint());
            return Unit.a;
        }
        if (i2 == 1) {
            cVar = (l.c) dragGestureNode$processDragStart$1.L$0;
            kotlin.f.b(obj);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zf3Var2 = (zf3) dragGestureNode$processDragStart$1.L$1;
            cVar2 = (l.c) dragGestureNode$processDragStart$1.L$0;
            kotlin.f.b(obj);
        }
        zf3Var = zf3Var2;
        cVar = cVar2;
        this.dragInteraction = zf3Var;
        P3(cVar.getStartPoint());
        return Unit.a;
        zf3Var = new zf3();
        r48 r48Var2 = this.interactionSource;
        if (r48Var2 != null) {
            dragGestureNode$processDragStart$1.L$0 = cVar;
            dragGestureNode$processDragStart$1.L$1 = zf3Var;
            dragGestureNode$processDragStart$1.label = 2;
            if (r48Var2.a(zf3Var, dragGestureNode$processDragStart$1) != objG) {
                cVar2 = cVar;
                zf3Var2 = zf3Var;
                zf3Var = zf3Var2;
                cVar = cVar2;
            }
            return objG;
        }
        this.dragInteraction = zf3Var;
        P3(cVar.getStartPoint());
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object V3(l.d dVar, q22<? super Unit> q22Var) {
        DragGestureNode$processDragStop$1 dragGestureNode$processDragStop$1;
        if (q22Var instanceof DragGestureNode$processDragStop$1) {
            dragGestureNode$processDragStop$1 = (DragGestureNode$processDragStop$1) q22Var;
            int i = dragGestureNode$processDragStop$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                dragGestureNode$processDragStop$1.label = i - t04.INVALID_ID;
            } else {
                dragGestureNode$processDragStop$1 = new DragGestureNode$processDragStop$1(this, q22Var);
            }
        } else {
            dragGestureNode$processDragStop$1 = new DragGestureNode$processDragStop$1(this, q22Var);
        }
        Object obj = dragGestureNode$processDragStop$1.result;
        Object objG = kotlin.coroutines.intrinsics.a.g();
        int i2 = dragGestureNode$processDragStop$1.label;
        if (i2 == 0) {
            kotlin.f.b(obj);
            zf3 zf3Var = this.dragInteraction;
            if (zf3Var != null) {
                r48 r48Var = this.interactionSource;
                if (r48Var != null) {
                    ag3 ag3Var = new ag3(zf3Var);
                    dragGestureNode$processDragStop$1.L$0 = dVar;
                    dragGestureNode$processDragStop$1.label = 1;
                    if (r48Var.a(ag3Var, dragGestureNode$processDragStop$1) == objG) {
                        return objG;
                    }
                }
            }
            Q3(dVar);
            return Unit.a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        dVar = (l.d) dragGestureNode$processDragStop$1.L$0;
        kotlin.f.b(obj);
        this.dragInteraction = null;
        Q3(dVar);
        return Unit.a;
    }

    private final void W3(e pointerEvent, PointerEventPass pass, DragDetectionState.c state) {
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        if (pass != PointerEventPass.Main) {
            return;
        }
        long pointerId = state.getPointerId();
        List<PointerInputChange> listC = pointerEvent.c();
        int size = listC.size();
        int i = 0;
        while (true) {
            pointerInputChange = null;
            if (i >= size) {
                pointerInputChange2 = null;
                break;
            }
            pointerInputChange2 = listC.get(i);
            if (se9.b(pointerInputChange2.getId(), pointerId)) {
                break;
            } else {
                i++;
            }
        }
        PointerInputChange pointerInputChange3 = pointerInputChange2;
        if (pointerInputChange3 == null) {
            return;
        }
        if (!f.d(pointerInputChange3)) {
            if (pointerInputChange3.q()) {
                d4();
                return;
            } else {
                if (rn8.k(f.h(pointerInputChange3)) == 0.0f) {
                    return;
                }
                e4(pointerInputChange3, f.g(pointerInputChange3));
                pointerInputChange3.a();
                return;
            }
        }
        List<PointerInputChange> listC2 = pointerEvent.c();
        int size2 = listC2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            PointerInputChange pointerInputChange4 = listC2.get(i2);
            if (pointerInputChange4.getPressed()) {
                pointerInputChange = pointerInputChange4;
                break;
            }
        }
        PointerInputChange pointerInputChange5 = pointerInputChange;
        if (pointerInputChange5 != null) {
            state.b(pointerInputChange5.getId());
            return;
        }
        if (pointerInputChange3.q() || !f.d(pointerInputChange3)) {
            d4();
        } else {
            g4(pointerInputChange3);
        }
        J3();
    }

    private final void X3(e pointerEvent, PointerEventPass pass, DragDetectionState.AwaitDown state) {
        DragDetectionState.AwaitDown.AwaitTouchSlop awaitTouchSlop;
        if (!pointerEvent.c().isEmpty() && TapGestureDetectorKt.k(pointerEvent, false, false, 2, null)) {
            PointerInputChange pointerInputChange = (PointerInputChange) m.z0(pointerEvent.c());
            if (a.$EnumSwitchMapping$0[state.getAwaitTouchSlop().ordinal()] == 1) {
                awaitTouchSlop = !getStartDragImmediately() ? DragDetectionState.AwaitDown.AwaitTouchSlop.Yes : DragDetectionState.AwaitDown.AwaitTouchSlop.No;
            } else {
                awaitTouchSlop = state.getAwaitTouchSlop();
            }
            state.c(awaitTouchSlop);
            if (pass == PointerEventPass.Initial && awaitTouchSlop == DragDetectionState.AwaitDown.AwaitTouchSlop.No) {
                pointerInputChange.a();
                state.d(true);
            }
            if (pass == PointerEventPass.Main) {
                if (awaitTouchSlop == DragDetectionState.AwaitDown.AwaitTouchSlop.Yes) {
                    M3(this, pointerInputChange, pointerInputChange.getId(), 0L, false, 12, null);
                } else if (state.getConsumedOnInitial()) {
                    rn8.Companion companion = rn8.INSTANCE;
                    f4(pointerInputChange, pointerInputChange, companion.c());
                    e4(pointerInputChange, companion.c());
                    N3(pointerInputChange.getId());
                }
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void Y3(e pointerEvent, PointerEventPass pass) throws NoWhenBranchMatchedException {
        DragDetectionState dragDetectionState = this.currentDragState;
        if (dragDetectionState == null) {
            throw new IllegalArgumentException("currentDragState should not be null");
        }
        if (dragDetectionState instanceof DragDetectionState.AwaitDown) {
            X3(pointerEvent, pass, (DragDetectionState.AwaitDown) dragDetectionState);
            return;
        }
        if (dragDetectionState instanceof DragDetectionState.b) {
            S3(pointerEvent, pass, (DragDetectionState.b) dragDetectionState);
        } else if (dragDetectionState instanceof DragDetectionState.a) {
            R3(pointerEvent, pass, (DragDetectionState.a) dragDetectionState);
        } else {
            if (!(dragDetectionState instanceof DragDetectionState.c)) {
                throw new NoWhenBranchMatchedException();
            }
            W3(pointerEvent, pass, (DragDetectionState.c) dragDetectionState);
        }
    }

    private final h81<l> Z3() {
        h81<l> h81Var = this.channel;
        if (h81Var != null) {
            return h81Var;
        }
        throw new IllegalArgumentException("Events channel not initialized.");
    }

    private final rbd a4() {
        rbd rbdVar = this.touchSlopDetector;
        if (rbdVar != null) {
            return rbdVar;
        }
        throw new IllegalArgumentException("Touch slop detector not initialized.");
    }

    private final w3e b4() {
        w3e w3eVar = this.velocityTracker;
        if (w3eVar != null) {
            return w3eVar;
        }
        throw new IllegalArgumentException("Velocity Tracker not initialized.");
    }

    private final void c4() {
        J3();
        if (this.isListeningForEvents) {
            d4();
        }
        this.velocityTracker = null;
    }

    private final void d4() {
        Z3().e(l.a.a);
    }

    private final void e4(PointerInputChange change, long dragAmount) {
        long j = ln6.j(y23.o(getNode()));
        if (!rn8.j(this.previousPositionOnScreen, rn8.INSTANCE.b()) && !rn8.j(j, this.previousPositionOnScreen)) {
            this.nodeOffset = rn8.q(this.nodeOffset, rn8.p(j, this.previousPositionOnScreen));
        }
        this.previousPositionOnScreen = j;
        z3e.d(b4(), change, this.nodeOffset);
        Z3().e(new l.b(dragAmount, false, null));
    }

    private final void f4(PointerInputChange down, PointerInputChange slopTriggerChange, long overSlopOffset) {
        if (this.velocityTracker == null) {
            this.velocityTracker = new w3e();
        }
        z3e.c(b4(), down);
        long jP = rn8.p(slopTriggerChange.getPosition(), overSlopOffset);
        this.nodeOffset = rn8.INSTANCE.c();
        if (((Boolean) this.canDrag.invoke(j.f(down.getType()))).booleanValue()) {
            if (!this.isListeningForEvents) {
                if (this.channel == null) {
                    this.channel = p81.b(Integer.MAX_VALUE, (BufferOverflow) null, (Function1) null, 6, (Object) null);
                }
                i4();
            }
            this.previousPositionOnScreen = ln6.j(y23.o(this));
            Z3().e(new l.c(jP, null));
        }
    }

    private final void g4(PointerInputChange change) {
        z3e.c(b4(), change);
        float fH = ((p7e) cs1.a(this, CompositionLocalsKt.u())).h();
        long jB = b4().b(u3e.a(fH, fH));
        b4().d();
        Z3().e(new l.d(DraggableKt.l(jB), false, null));
        this.isListeningForPointerInputEvents = false;
    }

    private final void i4() {
        this.isListeningForEvents = true;
        if (this.channel == null) {
            this.channel = p81.b(Integer.MAX_VALUE, (BufferOverflow) null, (Function1) null, 6, (Object) null);
        }
        rw0.d(L2(), (CoroutineContext) null, (CoroutineStart) null, new DragGestureNode$startListeningForEvents$1(this, null), 3, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void k4(DragGestureNode dragGestureNode, Function1 function1, boolean z, r48 r48Var, Orientation orientation, boolean z2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: update");
        }
        if ((i & 1) != 0) {
            function1 = dragGestureNode.canDrag;
        }
        if ((i & 2) != 0) {
            z = dragGestureNode.enabled;
        }
        if ((i & 4) != 0) {
            r48Var = dragGestureNode.interactionSource;
        }
        if ((i & 8) != 0) {
            orientation = dragGestureNode.orientationLock;
        }
        if ((i & 16) != 0) {
            z2 = false;
        }
        boolean z3 = z2;
        r48 r48Var2 = r48Var;
        Function1 function2 = function1;
        dragGestureNode.j4(function2, z, r48Var2, orientation, z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean t3(DragGestureNode dragGestureNode, j jVar) {
        return ((Boolean) dragGestureNode.canDrag.invoke(jVar)).booleanValue();
    }

    @Override // com.google.inputmethod.zv4
    public boolean B1(PointerInputChange event) {
        if (f.b(event)) {
            return this.enabled;
        }
        if (!up1.isNestedDraggablesTouchConflictFixEnabled || f.d(event)) {
            return false;
        }
        if (this.touchSlopDetector == null) {
            this.touchSlopDetector = new rbd(this.orientationLock, 0L, 2, null);
        }
        float fC = ((p7e) cs1.a(this, CompositionLocalsKt.u())).c();
        long jG = f.g(event);
        rbd rbdVarA4 = a4();
        return !rn8.j(rbdVarA4.c(jG, fC, false), rn8.INSTANCE.b()) && rbdVarA4.e(jG);
    }

    @Override // com.google.inputmethod.zv4
    public boolean D2(IndirectPointerInputChange event) {
        return iv5.g(event) && this.enabled;
    }

    public final Function1<j, Boolean> D3() {
        return this.canDrag;
    }

    /* JADX INFO: renamed from: F3, reason: from getter */
    protected final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: G3, reason: from getter */
    public final Orientation getOrientationLock() {
        return this.orientationLock;
    }

    protected final void H3() {
        if (up1.isDelayPressesUsingGestureConsumptionEnabled && this.gestureNode == null) {
            this.gestureNode = m3(cw4.b(this));
        }
    }

    /* JADX INFO: renamed from: I3, reason: from getter */
    public final boolean getIsListeningForEvents() {
        return this.isListeningForEvents;
    }

    @Override // com.google.inputmethod.bf9
    public void K0() {
        if (this.isListeningForPointerInputEvents) {
            c4();
        }
        this.isListeningForPointerInputEvents = false;
    }

    public final void O3(l event) {
        if ((event instanceof l.c) && !this.isListeningForEvents) {
            this.isListeningForEvents = true;
            i4();
        }
        Z3().e(event);
    }

    public abstract void P3(long startedPosition);

    public abstract void Q3(l.d event);

    @Override // androidx.compose.ui.b.c
    public void W2() {
        this.isListeningForEvents = false;
        y3();
        this.nodeOffset = rn8.INSTANCE.c();
        x23 x23Var = this.gestureNode;
        if (x23Var != null) {
            p3(x23Var);
        }
        this.gestureNode = null;
    }

    /* JADX INFO: renamed from: h4 */
    public abstract boolean getStartDragImmediately();

    public final void j4(Function1<? super j, Boolean> canDrag, boolean enabled, r48 interactionSource, Orientation orientationLock, boolean shouldResetPointerInputHandling) {
        this.canDrag = canDrag;
        boolean z = true;
        if (this.enabled != enabled) {
            this.enabled = enabled;
            if (!enabled) {
                y3();
                this.indirectPointerInputDragCycleDetector = null;
            }
            shouldResetPointerInputHandling = true;
        }
        if (!Intrinsics.e(this.interactionSource, interactionSource)) {
            y3();
            this.interactionSource = interactionSource;
        }
        if (this.orientationLock != orientationLock) {
            this.orientationLock = orientationLock;
        } else {
            z = shouldResetPointerInputHandling;
        }
        if (z) {
            if (this.isListeningForPointerInputEvents) {
                c4();
            }
            IndirectPointerInputDragCycleDetector indirectPointerInputDragCycleDetector = this.indirectPointerInputDragCycleDetector;
            if (indirectPointerInputDragCycleDetector != null) {
                indirectPointerInputDragCycleDetector.q();
            }
        }
    }

    @Override // com.google.inputmethod.mv5
    public void p2(ev5 event, PointerEventPass pass) {
        H3();
        if (this.enabled) {
            if (this.indirectPointerInputDragCycleDetector == null) {
                this.indirectPointerInputDragCycleDetector = new IndirectPointerInputDragCycleDetector(this);
            }
            IndirectPointerInputDragCycleDetector indirectPointerInputDragCycleDetector = this.indirectPointerInputDragCycleDetector;
            if (indirectPointerInputDragCycleDetector != null) {
                indirectPointerInputDragCycleDetector.m(event, pass);
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // com.google.inputmethod.bf9
    public void x1(e pointerEvent, PointerEventPass pass, long bounds) throws NoWhenBranchMatchedException {
        this.isListeningForPointerInputEvents = true;
        H3();
        if (this.enabled) {
            if (this.currentDragState == null) {
                this.currentDragState = A3();
            }
            Y3(pointerEvent, pass);
        }
    }

    public final void y3() {
        zf3 zf3Var = this.dragInteraction;
        if (zf3Var != null) {
            r48 r48Var = this.interactionSource;
            if (r48Var != null) {
                r48Var.b(new yf3(zf3Var));
            }
            this.dragInteraction = null;
        }
    }

    @Override // com.google.inputmethod.mv5
    public void z2() {
        IndirectPointerInputDragCycleDetector indirectPointerInputDragCycleDetector = this.indirectPointerInputDragCycleDetector;
        if (indirectPointerInputDragCycleDetector != null) {
            indirectPointerInputDragCycleDetector.q();
        }
    }

    public abstract Object z3(Function2<? super Function1<? super l.b, Unit>, ? super q22<? super Unit>, ? extends Object> function2, q22<? super Unit> q22Var);
}
