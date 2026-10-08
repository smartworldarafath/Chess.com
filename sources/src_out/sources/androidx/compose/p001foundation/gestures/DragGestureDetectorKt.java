package androidx.compose.p001foundation.gestures;

import androidx.compose.p001foundation.gestures.DragGestureDetectorKt;
import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.e;
import androidx.compose.ui.input.pointer.j;
import com.google.android.ps4;
import com.google.android.q22;
import com.google.inputmethod.cc0;
import com.google.inputmethod.df9;
import com.google.inputmethod.ff3;
import com.google.inputmethod.p7e;
import com.google.inputmethod.rn8;
import com.google.inputmethod.se9;
import com.google.inputmethod.t04;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001a8\u0010\b\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003H\u0086@¢\u0006\u0004\b\b\u0010\t\u001a0\u0010\r\u001a\u00020\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\nH\u0086@¢\u0006\u0004\b\r\u0010\u000e\u001a\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u000f\u0010\u0010\u001ad\u0010\u0016\u001a\u00020\u0006*\u00020\u00112\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\n2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00132\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00132\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003H\u0086@¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0090\u0001\u0010\u001c\u001a\u00020\u0006*\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182 \b\u0002\u0010\u0012\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u001a2\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\n2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00132\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u00132\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003H\u0086@¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0090\u0001\u0010\u001f\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u00042\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u001e\u0010\u0012\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u001a2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\nH\u0080@¢\u0006\u0004\b\u001f\u0010 \u001a8\u0010\"\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00060\u0003H\u0086@¢\u0006\u0004\b\"\u0010\t\u001a0\u0010#\u001a\u00020\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\nH\u0086@¢\u0006\u0004\b#\u0010\u000e\u001a\u001e\u0010$\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b$\u0010\u0010\u001a\u001b\u0010&\u001a\u00020\f*\u00020%2\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b&\u0010'\u001a\u001b\u0010+\u001a\u00020!*\u00020(2\u0006\u0010*\u001a\u00020)H\u0000¢\u0006\u0004\b+\u0010,\"\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/\"\u0014\u00102\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010/\"\u0014\u00104\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010/¨\u00065"}, d2 = {"Lcom/google/android/cc0;", "Lcom/google/android/se9;", "pointerId", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/i;", "Lcom/google/android/rn8;", "", "onTouchSlopReached", "j", "(Lcom/google/android/cc0;JLkotlin/jvm/functions/Function2;Lcom/google/android/q22;)Ljava/lang/Object;", "Lkotlin/Function1;", "onDrag", "", "u", "(Lcom/google/android/cc0;JLkotlin/jvm/functions/Function1;Lcom/google/android/q22;)Ljava/lang/Object;", "h", "(Lcom/google/android/cc0;JLcom/google/android/q22;)Ljava/lang/Object;", "Lcom/google/android/df9;", "onDragStart", "Lkotlin/Function0;", "onDragEnd", "onDragCancel", "m", "(Lcom/google/android/df9;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lcom/google/android/q22;)Ljava/lang/Object;", "Landroidx/compose/foundation/gestures/Orientation;", "orientationLock", "Lkotlin/Function3;", "shouldAwaitTouchSlop", "l", "(Lcom/google/android/df9;Landroidx/compose/foundation/gestures/Orientation;Lcom/google/android/ps4;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lcom/google/android/q22;)Ljava/lang/Object;", "initialDown", "x", "(Lcom/google/android/cc0;Landroidx/compose/ui/input/pointer/i;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/gestures/Orientation;Lcom/google/android/ps4;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/google/android/q22;)Ljava/lang/Object;", "", "k", "y", "i", "Landroidx/compose/ui/input/pointer/e;", "v", "(Landroidx/compose/ui/input/pointer/e;J)Z", "Lcom/google/android/p7e;", "Landroidx/compose/ui/input/pointer/j;", "pointerType", "w", "(Lcom/google/android/p7e;I)F", "Lcom/google/android/ff3;", "a", "F", "mouseSlop", "b", "defaultTouchSlop", "c", "mouseToTouchSlopRatio", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class DragGestureDetectorKt {
    private static final float a;
    private static final float b;
    private static final float c;

    static {
        float fI = ff3.i((float) 0.125d);
        a = fI;
        float fI2 = ff3.i(18);
        b = fI2;
        c = fI / fI2;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007a  */
    /* JADX WARN: Code duplicated, block: B:27:0x008e A[LOOP:0: B:23:0x0078->B:27:0x008e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x0092 A[EDGE_INSN: B:54:0x0092->B:29:0x0092 BREAK  A[LOOP:0: B:23:0x0078->B:27:0x008e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0067 -> B:22:0x006c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object h(com.google.inputmethod.cc0 r17, long r18, com.google.android.q22<? super androidx.compose.ui.input.pointer.PointerInputChange> r20) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p001foundation.gestures.DragGestureDetectorKt.h(com.google.android.cc0, long, com.google.android.q22):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    public static final Object i(cc0 cc0Var, long j, q22<? super PointerInputChange> q22Var) {
        DragGestureDetectorKt$awaitLongPressOrCancellation$1 dragGestureDetectorKt$awaitLongPressOrCancellation$1;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        Ref.BooleanRef booleanRef;
        if (q22Var instanceof DragGestureDetectorKt$awaitLongPressOrCancellation$1) {
            dragGestureDetectorKt$awaitLongPressOrCancellation$1 = (DragGestureDetectorKt$awaitLongPressOrCancellation$1) q22Var;
            int i = dragGestureDetectorKt$awaitLongPressOrCancellation$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                dragGestureDetectorKt$awaitLongPressOrCancellation$1.label = i - t04.INVALID_ID;
            } else {
                dragGestureDetectorKt$awaitLongPressOrCancellation$1 = new DragGestureDetectorKt$awaitLongPressOrCancellation$1(q22Var);
            }
        } else {
            dragGestureDetectorKt$awaitLongPressOrCancellation$1 = new DragGestureDetectorKt$awaitLongPressOrCancellation$1(q22Var);
        }
        Object obj = dragGestureDetectorKt$awaitLongPressOrCancellation$1.result;
        Object objG = a.g();
        int i2 = dragGestureDetectorKt$awaitLongPressOrCancellation$1.label;
        try {
            if (i2 == 0) {
                f.b(obj);
                if (v(cc0Var.a2(), j)) {
                    return null;
                }
                List<PointerInputChange> listC = cc0Var.a2().c();
                int size = listC.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        pointerInputChange = null;
                        break;
                    }
                    pointerInputChange = listC.get(i3);
                    if (se9.b(pointerInputChange.getId(), j)) {
                        break;
                    }
                    i3++;
                }
                pointerInputChange2 = pointerInputChange;
                if (pointerInputChange2 == null) {
                    return null;
                }
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                objectRef2.element = pointerInputChange2;
                long jF = cc0Var.getViewConfiguration().f();
                Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                DragGestureDetectorKt$awaitLongPressOrCancellation$2 dragGestureDetectorKt$awaitLongPressOrCancellation$2 = new DragGestureDetectorKt$awaitLongPressOrCancellation$2(booleanRef2, objectRef2, objectRef, null);
                dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$0 = pointerInputChange2;
                dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$1 = objectRef;
                dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$2 = booleanRef2;
                dragGestureDetectorKt$awaitLongPressOrCancellation$1.label = 1;
                if (cc0Var.r2(jF, dragGestureDetectorKt$awaitLongPressOrCancellation$2, dragGestureDetectorKt$awaitLongPressOrCancellation$1) == objG) {
                    return objG;
                }
                booleanRef = booleanRef2;
                j = objectRef;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                booleanRef = (Ref.BooleanRef) dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$2;
                Ref.ObjectRef objectRef3 = (Ref.ObjectRef) dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$1;
                pointerInputChange2 = (PointerInputChange) dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$0;
                f.b(obj);
                j = objectRef3;
            }
            if (!booleanRef.element) {
                return null;
            }
            PointerInputChange pointerInputChange3 = (PointerInputChange) ((Ref.ObjectRef) j).element;
            return pointerInputChange3 == null ? pointerInputChange2 : pointerInputChange3;
        } catch (PointerEventTimeoutCancellationException unused) {
            PointerInputChange pointerInputChange4 = (PointerInputChange) j.element;
            return pointerInputChange4 == null ? pointerInputChange2 : pointerInputChange4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e6 A[LOOP:0: B:25:0x00cd->B:29:0x00e6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x00ec A[EDGE_INSN: B:67:0x00ec->B:31:0x00ec BREAK  A[LOOP:0: B:25:0x00cd->B:29:0x00e6], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0178 -> B:61:0x017d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object j(com.google.inputmethod.cc0 r18, long r19, kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super com.google.inputmethod.rn8, kotlin.Unit> r21, com.google.android.q22<? super androidx.compose.ui.input.pointer.PointerInputChange> r22) {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p001foundation.gestures.DragGestureDetectorKt.j(com.google.android.cc0, long, kotlin.jvm.functions.Function2, com.google.android.q22):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ea A[LOOP:0: B:25:0x00cf->B:29:0x00ea, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x00f7 A[EDGE_INSN: B:67:0x00f7->B:31:0x00f7 BREAK  A[LOOP:0: B:25:0x00cf->B:29:0x00ea], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0192 -> B:61:0x0197). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object k(com.google.inputmethod.cc0 r20, long r21, kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> r23, com.google.android.q22<? super androidx.compose.ui.input.pointer.PointerInputChange> r24) {
        /*
            Method dump skipped, instruction units count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p001foundation.gestures.DragGestureDetectorKt.k(com.google.android.cc0, long, kotlin.jvm.functions.Function2, com.google.android.q22):java.lang.Object");
    }

    public static final Object l(df9 df9Var, Orientation orientation, ps4<? super PointerInputChange, ? super PointerInputChange, ? super rn8, Unit> ps4Var, Function1<? super PointerInputChange, Unit> function1, Function0<Unit> function0, Function0<Boolean> function2, Function2<? super PointerInputChange, ? super rn8, Unit> function3, q22<? super Unit> q22Var) {
        Object objD = ForEachGestureKt.d(df9Var, new DragGestureDetectorKt$detectDragGestures$13(function2, orientation, ps4Var, function3, function0, function1, null), q22Var);
        return objD == a.g() ? objD : Unit.a;
    }

    public static final Object m(df9 df9Var, final Function1<? super rn8, Unit> function1, final Function0<Unit> function0, Function0<Unit> function2, Function2<? super PointerInputChange, ? super rn8, Unit> function3, q22<? super Unit> q22Var) {
        Object objL = l(df9Var, null, new ps4() { // from class: com.google.android.uf3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return DragGestureDetectorKt.r(function1, (PointerInputChange) obj, (PointerInputChange) obj2, (rn8) obj3);
            }
        }, new Function1() { // from class: com.google.android.vf3
            public final Object invoke(Object obj) {
                return DragGestureDetectorKt.s(function0, (PointerInputChange) obj);
            }
        }, function2, new Function0() { // from class: com.google.android.wf3
            public final Object invoke() {
                return Boolean.valueOf(DragGestureDetectorKt.t());
            }
        }, function3, q22Var);
        return objL == a.g() ? objL : Unit.a;
    }

    public static /* synthetic */ Object n(df9 df9Var, Function1 function1, Function0 function0, Function0 function2, Function2 function3, q22 q22Var, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1() { // from class: com.google.android.rf3
                public final Object invoke(Object obj2) {
                    return DragGestureDetectorKt.o((rn8) obj2);
                }
            };
        }
        if ((i & 2) != 0) {
            function0 = new Function0() { // from class: com.google.android.sf3
                public final Object invoke() {
                    return DragGestureDetectorKt.p();
                }
            };
        }
        if ((i & 4) != 0) {
            function2 = new Function0() { // from class: com.google.android.tf3
                public final Object invoke() {
                    return DragGestureDetectorKt.q();
                }
            };
        }
        Function0 function4 = function2;
        return m(df9Var, function1, function0, function4, function3, q22Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(rn8 rn8Var) {
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p() {
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q() {
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(Function1 function1, PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2, rn8 rn8Var) {
        function1.invoke(rn8.d(pointerInputChange2.getPosition()));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(Function0 function0, PointerInputChange pointerInputChange) {
        function0.invoke();
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean t() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0055  */
    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0060  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0048 -> B:18:0x004b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object u(com.google.inputmethod.cc0 r4, long r5, kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit> r7, com.google.android.q22<? super java.lang.Boolean> r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.p001foundation.gestures.DragGestureDetectorKt$drag$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1 r0 = (androidx.compose.p001foundation.gestures.DragGestureDetectorKt$drag$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1 r0 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.L$1
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            java.lang.Object r5 = r0.L$0
            com.google.android.cc0 r5 = (com.google.inputmethod.cc0) r5
            kotlin.f.b(r8)
            r7 = r4
            r4 = r5
            goto L4b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            kotlin.f.b(r8)
        L3e:
            r0.L$0 = r4
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r8 = h(r4, r5, r0)
            if (r8 != r1) goto L4b
            return r1
        L4b:
            androidx.compose.ui.input.pointer.i r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
            if (r8 != 0) goto L55
            r4 = 0
            java.lang.Boolean r4 = com.google.android.ut0.a(r4)
            return r4
        L55:
            boolean r5 = androidx.compose.ui.input.pointer.f.d(r8)
            if (r5 == 0) goto L60
            java.lang.Boolean r4 = com.google.android.ut0.a(r3)
            return r4
        L60:
            r7.invoke(r8)
            long r5 = r8.getId()
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p001foundation.gestures.DragGestureDetectorKt.u(com.google.android.cc0, long, kotlin.jvm.functions.Function1, com.google.android.q22):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean v(e eVar, long j) {
        PointerInputChange pointerInputChange;
        List<PointerInputChange> listC = eVar.c();
        int size = listC.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                pointerInputChange = null;
                break;
            }
            pointerInputChange = listC.get(i);
            if (se9.b(pointerInputChange.getId(), j)) {
                break;
            }
            i++;
        }
        PointerInputChange pointerInputChange2 = pointerInputChange;
        if (pointerInputChange2 != null && pointerInputChange2.getPressed()) {
            z = true;
        }
        return true ^ z;
    }

    public static final float w(p7e p7eVar, int i) {
        return j.i(i, j.INSTANCE.b()) ? p7eVar.c() * c : p7eVar.c();
    }

    /* JADX WARN: Code duplicated, block: B:239:0x02d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:42:0x02d6 A[LOOP:8: B:38:0x02b5->B:42:0x02d6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x0437 -> B:91:0x03e3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:115:0x0488 -> B:116:0x0490). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:159:0x05e3 -> B:160:0x05eb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:166:0x060a -> B:85:0x03bd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:174:0x0670 -> B:176:0x0673). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0256 -> B:78:0x03a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x02e8 -> B:47:0x02ec). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x0352 -> B:78:0x03a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x0397 -> B:75:0x0399). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object x(com.google.inputmethod.cc0 r27, androidx.compose.ui.input.pointer.PointerInputChange r28, kotlin.jvm.functions.Function0<java.lang.Boolean> r29, androidx.compose.p001foundation.gestures.Orientation r30, com.google.android.ps4<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super androidx.compose.ui.input.pointer.PointerInputChange, ? super com.google.inputmethod.rn8, kotlin.Unit> r31, kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super com.google.inputmethod.rn8, kotlin.Unit> r32, kotlin.jvm.functions.Function0<kotlin.Unit> r33, kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit> r34, com.google.android.q22<? super kotlin.Unit> r35) {
        /*
            Method dump skipped, instruction units count: 1850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p001foundation.gestures.DragGestureDetectorKt.x(com.google.android.cc0, androidx.compose.ui.input.pointer.i, kotlin.jvm.functions.Function0, androidx.compose.foundation.gestures.Orientation, com.google.android.ps4, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, com.google.android.q22):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0096  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ac A[LOOP:0: B:24:0x0094->B:28:0x00ac, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x00b6 A[EDGE_INSN: B:75:0x00b6->B:30:0x00b6 BREAK  A[LOOP:0: B:24:0x0094->B:28:0x00ac], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0083 -> B:23:0x0089). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object y(com.google.inputmethod.cc0 r17, long r18, kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit> r20, com.google.android.q22<? super java.lang.Boolean> r21) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p001foundation.gestures.DragGestureDetectorKt.y(com.google.android.cc0, long, kotlin.jvm.functions.Function1, com.google.android.q22):java.lang.Object");
    }
}
