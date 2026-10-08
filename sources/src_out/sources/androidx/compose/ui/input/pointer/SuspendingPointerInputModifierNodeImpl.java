package androidx.compose.ui.input.pointer;

import com.google.android.g41;
import com.google.android.oq2;
import com.google.android.q22;
import com.google.android.rw0;
import com.google.android.u22;
import com.google.inputmethod.cc0;
import com.google.inputmethod.df9;
import com.google.inputmethod.f43;
import com.google.inputmethod.p7e;
import com.google.inputmethod.q16;
import com.google.inputmethod.r58;
import com.google.inputmethod.t04;
import com.google.inputmethod.tsb;
import com.google.inputmethod.ugc;
import com.google.inputmethod.wgc;
import com.google.inputmethod.y23;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.s;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001eB=\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0005\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u0016J?\u0010\u001a\u001a\u00020\u00122\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0012\u0010\t\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0005\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u001a\u0010\rJ'\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001f\u0010\u0016J:\u0010%\u001a\u00028\u0000\"\u0004\b\u0000\u0010 2\"\u0010$\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000#\u0012\u0006\u0012\u0004\u0018\u00010\u00050!H\u0096@¢\u0006\u0004\b%\u0010&R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010(R\"\u0010\t\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0005\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R4\u0010.\u001a \b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120#\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00101\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00105\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00108\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\"\u0010=\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u00030:R\u00020\u0000098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010@\u001a\u00060\u0005j\u0002`>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010(R\"\u0010B\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u00030:R\u00020\u0000098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010<R\u0018\u0010D\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u00107R\u0016\u0010G\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\"\u0010O\u001a\u00020H8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR$\u0010\u000b\u001a\u00020\n2\u0006\u0010P\u001a\u00020\n8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u0014\u0010X\u001a\u00020U8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0014\u0010Z\u001a\u00020U8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bY\u0010WR\u0014\u0010^\u001a\u00020[8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u0014\u0010a\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b_\u0010`R\u0014\u0010d\u001a\u00020b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bc\u0010`¨\u0006f"}, d2 = {"Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl;", "Landroidx/compose/ui/b$c;", "Lcom/google/android/wgc;", "Lcom/google/android/df9;", "Lcom/google/android/f43;", "", "key1", "key2", "", "keys", "Landroidx/compose/ui/input/pointer/PointerInputEventHandler;", "pointerInputEventHandler", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)V", "Landroidx/compose/ui/input/pointer/e;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "", "r3", "(Landroidx/compose/ui/input/pointer/e;Landroidx/compose/ui/input/pointer/PointerEventPass;)V", "W2", "()V", "N", "F2", "X1", "t3", "Lcom/google/android/q16;", "bounds", "x1", "(Landroidx/compose/ui/input/pointer/e;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "K0", "R", "Lkotlin/Function2;", "Lcom/google/android/cc0;", "Lcom/google/android/q22;", "block", "l0", "(Lkotlin/jvm/functions/Function2;Lcom/google/android/q22;)Ljava/lang/Object;", "p", "Ljava/lang/Object;", "q", "r", "[Ljava/lang/Object;", "s", "Lkotlin/jvm/functions/Function2;", "_deprecatedPointerInputHandler", "t", "Landroidx/compose/ui/input/pointer/PointerInputEventHandler;", "_pointerInputEventHandler", "Lkotlinx/coroutines/s;", "u", "Lkotlinx/coroutines/s;", "pointerInputJob", "v", "Landroidx/compose/ui/input/pointer/e;", "currentEvent", "Lcom/google/android/r58;", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine;", "w", "Lcom/google/android/r58;", "pointerHandlers", "Landroidx/compose/ui/platform/SynchronizedObject;", "x", "pointerHandlersLock", "y", "dispatchingPointerHandlers", "z", "lastPointerEvent", "A", "J", "boundsSize", "", "B", "Z", "getInterceptOutOfBoundsChildEvents", "()Z", "V1", "(Z)V", "interceptOutOfBoundsChildEvents", "value", "s3", "()Landroidx/compose/ui/input/pointer/PointerInputEventHandler;", "setPointerInputEventHandler", "(Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)V", "", "getDensity", "()F", "density", "w2", "fontScale", "Lcom/google/android/p7e;", "getViewConfiguration", "()Lcom/google/android/p7e;", "viewConfiguration", "a", "()J", "size", "Lcom/google/android/tsb;", "K1", "extendedTouchPadding", "PointerEventHandlerCoroutine", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SuspendingPointerInputModifierNodeImpl extends androidx.compose.ui.b.c implements wgc, df9, f43 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private long boundsSize;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private boolean interceptOutOfBoundsChildEvents;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private Object key1;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private Object key2;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private Object[] keys;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private Function2<? super df9, ? super q22<? super Unit>, ? extends Object> _deprecatedPointerInputHandler;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private PointerInputEventHandler _pointerInputEventHandler;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private s pointerInputJob;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private e currentEvent = ugc.a;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final r58<PointerEventHandlerCoroutine<?>> pointerHandlers;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final Object pointerHandlersLock;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final r58<PointerEventHandlerCoroutine<?>> dispatchingPointerHandlers;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private e lastPointerEvent;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u0017\u0010\u0018JD\u0010\u001f\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0001\u0010\u00192\u0006\u0010\u001b\u001a\u00020\u001a2\"\u0010\u001e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001cH\u0096@¢\u0006\u0004\b\u001f\u0010 JB\u0010!\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00192\u0006\u0010\u001b\u001a\u00020\u001a2\"\u0010\u001e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001cH\u0096@¢\u0006\u0004\b!\u0010 J\u0014\u0010$\u001a\u00020#*\u00020\"H\u0097\u0001¢\u0006\u0004\b$\u0010%J\u0014\u0010'\u001a\u00020#*\u00020&H\u0097\u0001¢\u0006\u0004\b'\u0010(J\u0014\u0010*\u001a\u00020)*\u00020\"H\u0097\u0001¢\u0006\u0004\b*\u0010+J\u0014\u0010,\u001a\u00020)*\u00020&H\u0097\u0001¢\u0006\u0004\b,\u0010-J\u0014\u0010.\u001a\u00020\"*\u00020)H\u0097\u0001¢\u0006\u0004\b.\u0010/J\u0014\u00100\u001a\u00020\"*\u00020#H\u0097\u0001¢\u0006\u0004\b0\u0010%J\u0014\u00101\u001a\u00020\"*\u00020&H\u0097\u0001¢\u0006\u0004\b1\u0010(J\u0014\u00102\u001a\u00020&*\u00020)H\u0097\u0001¢\u0006\u0004\b2\u00103J\u0014\u00104\u001a\u00020&*\u00020#H\u0097\u0001¢\u0006\u0004\b4\u00105J\u0014\u00106\u001a\u00020&*\u00020\"H\u0097\u0001¢\u0006\u0004\b6\u00105J\u0014\u00109\u001a\u000208*\u000207H\u0097\u0001¢\u0006\u0004\b9\u0010:J\u0014\u0010;\u001a\u000207*\u000208H\u0097\u0001¢\u0006\u0004\b;\u0010:R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001e\u0010A\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010D\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u001a\u0010J\u001a\u00020E8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0014\u0010M\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0014\u0010Q\u001a\u00020N8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0014\u0010U\u001a\u00020R8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0014\u0010W\u001a\u0002088VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bV\u0010PR\u0014\u0010Z\u001a\u00020#8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0014\u0010\\\u001a\u00020#8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b[\u0010Y¨\u0006]"}, d2 = {"Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine;", "R", "Lcom/google/android/cc0;", "Lcom/google/android/f43;", "Lcom/google/android/q22;", "completion", "<init>", "(Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl;Lcom/google/android/q22;)V", "Landroidx/compose/ui/input/pointer/e;", "event", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "", "N", "(Landroidx/compose/ui/input/pointer/e;Landroidx/compose/ui/input/pointer/PointerEventPass;)V", "", "cause", "L", "(Ljava/lang/Throwable;)V", "Lkotlin/Result;", "result", "resumeWith", "(Ljava/lang/Object;)V", "f2", "(Landroidx/compose/ui/input/pointer/PointerEventPass;Lcom/google/android/q22;)Ljava/lang/Object;", "T", "", "timeMillis", "Lkotlin/Function2;", "", "block", "m0", "(JLkotlin/jvm/functions/Function2;Lcom/google/android/q22;)Ljava/lang/Object;", "r2", "Lcom/google/android/ff3;", "", "x2", "(F)F", "Lcom/google/android/b0d;", "T1", "(J)F", "", "O1", "(F)I", "A2", "(J)I", "O0", "(I)F", "P0", "U", "X", "(I)J", "Y", "(F)J", "s1", "Lcom/google/android/jf3;", "Lcom/google/android/tsb;", "b1", "(J)J", "S", "b", "Lcom/google/android/q22;", "Lcom/google/android/g41;", "c", "Lcom/google/android/g41;", "pointerAwaiter", "d", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "awaitPass", "Lkotlin/coroutines/CoroutineContext;", "e", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "a2", "()Landroidx/compose/ui/input/pointer/e;", "currentEvent", "Lcom/google/android/q16;", "a", "()J", "size", "Lcom/google/android/p7e;", "getViewConfiguration", "()Lcom/google/android/p7e;", "viewConfiguration", "K1", "extendedTouchPadding", "getDensity", "()F", "density", "w2", "fontScale", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    final class PointerEventHandlerCoroutine<R> implements cc0, f43, q22<R> {
        private final /* synthetic */ SuspendingPointerInputModifierNodeImpl a;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final q22<R> completion;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private g41<? super e> pointerAwaiter;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private PointerEventPass awaitPass = PointerEventPass.Main;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final CoroutineContext context = EmptyCoroutineContext.a;

        /* JADX WARN: Multi-variable type inference failed */
        public PointerEventHandlerCoroutine(q22<? super R> q22Var) {
            this.a = SuspendingPointerInputModifierNodeImpl.this;
            this.completion = q22Var;
        }

        @Override // com.google.inputmethod.f43
        public int A2(long j) {
            return this.a.A2(j);
        }

        @Override // com.google.inputmethod.cc0
        public long K1() {
            return SuspendingPointerInputModifierNodeImpl.this.K1();
        }

        public final void L(Throwable cause) {
            g41<? super e> g41Var = this.pointerAwaiter;
            if (g41Var != null) {
                g41Var.i(cause);
            }
            this.pointerAwaiter = null;
        }

        public final void N(e event, PointerEventPass pass) {
            g41<? super e> g41Var;
            if (pass != this.awaitPass || (g41Var = this.pointerAwaiter) == null) {
                return;
            }
            this.pointerAwaiter = null;
            g41Var.resumeWith(Result.b(event));
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

        @Override // com.google.inputmethod.cc0
        public long a() {
            return SuspendingPointerInputModifierNodeImpl.this.boundsSize;
        }

        @Override // com.google.inputmethod.cc0
        public e a2() {
            return SuspendingPointerInputModifierNodeImpl.this.currentEvent;
        }

        @Override // com.google.inputmethod.f43
        public long b1(long j) {
            return this.a.b1(j);
        }

        @Override // com.google.inputmethod.cc0
        public Object f2(PointerEventPass pointerEventPass, q22<? super e> q22Var) {
            kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(kotlin.coroutines.intrinsics.a.d(q22Var), 1);
            eVar.G();
            this.awaitPass = pointerEventPass;
            this.pointerAwaiter = eVar;
            Object objY = eVar.y();
            if (objY == kotlin.coroutines.intrinsics.a.g()) {
                oq2.c(q22Var);
            }
            return objY;
        }

        public CoroutineContext getContext() {
            return this.context;
        }

        @Override // com.google.inputmethod.f43
        public float getDensity() {
            return this.a.getDensity();
        }

        @Override // com.google.inputmethod.cc0
        public p7e getViewConfiguration() {
            return SuspendingPointerInputModifierNodeImpl.this.getViewConfiguration();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // com.google.inputmethod.cc0
        public <T> Object m0(long j, Function2<? super cc0, ? super q22<? super T>, ? extends Object> function2, q22<? super T> q22Var) {
            SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1 suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1;
            if (q22Var instanceof SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1) {
                suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1 = (SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1) q22Var;
                int i = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1.label;
                if ((i & t04.INVALID_ID) != 0) {
                    suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1.label = i - t04.INVALID_ID;
                } else {
                    suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1 = new SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1(this, q22Var);
                }
            } else {
                suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1 = new SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1(this, q22Var);
            }
            Object obj = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1.result;
            Object objG = kotlin.coroutines.intrinsics.a.g();
            int i2 = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1.label;
            try {
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.f.b(obj);
                    return obj;
                }
                kotlin.f.b(obj);
                suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1.label = 1;
                Object objR2 = r2(j, function2, suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1);
                return objR2 == objG ? objG : objR2;
            } catch (PointerEventTimeoutCancellationException unused) {
                return null;
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v3, types: [kotlinx.coroutines.s] */
        /* JADX WARN: Type inference failed for: r11v7 */
        /* JADX WARN: Type inference failed for: r11v8 */
        @Override // com.google.inputmethod.cc0
        public <T> Object r2(long j, Function2<? super cc0, ? super q22<? super T>, ? extends Object> function2, q22<? super T> q22Var) {
            SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1 suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1;
            g41<? super e> g41Var;
            if (q22Var instanceof SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1) {
                suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1 = (SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1) q22Var;
                int i = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1.label;
                if ((i & t04.INVALID_ID) != 0) {
                    suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1.label = i - t04.INVALID_ID;
                } else {
                    suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1 = new SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1(this, q22Var);
                }
            } else {
                suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1 = new SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1(this, q22Var);
            }
            Object objInvoke = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1.result;
            Object objG = kotlin.coroutines.intrinsics.a.g();
            int i2 = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1.label;
            try {
                if (i2 == 0) {
                    kotlin.f.b(objInvoke);
                    if (j <= 0 && (g41Var = this.pointerAwaiter) != null) {
                        Result.a aVar = Result.a;
                        g41Var.resumeWith(Result.b(kotlin.f.a(new PointerEventTimeoutCancellationException(j))));
                    }
                    s sVarD = rw0.d(SuspendingPointerInputModifierNodeImpl.this.L2(), (CoroutineContext) null, (CoroutineStart) null, new SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1(j, this, null), 3, (Object) null);
                    suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1.L$0 = sVarD;
                    suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1.label = 1;
                    objInvoke = function2.invoke(this, suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1);
                    j = sVarD;
                    if (objInvoke == objG) {
                        return objG;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s sVar = (s) suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1.L$0;
                    kotlin.f.b(objInvoke);
                    j = sVar;
                }
                j.k(CancelTimeoutCancellationException.a);
                return objInvoke;
            } catch (Throwable th) {
                j.k(CancelTimeoutCancellationException.a);
                throw th;
            }
        }

        public void resumeWith(Object result) {
            Object obj = SuspendingPointerInputModifierNodeImpl.this.pointerHandlersLock;
            SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = SuspendingPointerInputModifierNodeImpl.this;
            synchronized (obj) {
                suspendingPointerInputModifierNodeImpl.pointerHandlers.s(this);
                Unit unit = Unit.a;
            }
            this.completion.resumeWith(result);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PointerEventPass.values().length];
            try {
                iArr[PointerEventPass.Initial.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PointerEventPass.Final.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PointerEventPass.Main.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SuspendingPointerInputModifierNodeImpl(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        this.key1 = obj;
        this.key2 = obj2;
        this.keys = objArr;
        this._pointerInputEventHandler = pointerInputEventHandler;
        r58<PointerEventHandlerCoroutine<?>> r58Var = new r58<>(new PointerEventHandlerCoroutine[16], 0);
        this.pointerHandlers = r58Var;
        this.pointerHandlersLock = r58Var;
        this.dispatchingPointerHandlers = new r58<>(new PointerEventHandlerCoroutine[16], 0);
        this.boundsSize = q16.INSTANCE.a();
    }

    private final void r3(e pointerEvent, PointerEventPass pass) {
        synchronized (this.pointerHandlersLock) {
            r58<PointerEventHandlerCoroutine<?>> r58Var = this.dispatchingPointerHandlers;
            r58Var.d(r58Var.getSize(), this.pointerHandlers);
        }
        try {
            int i = a.$EnumSwitchMapping$0[pass.ordinal()];
            if (i == 1 || i == 2) {
                r58<PointerEventHandlerCoroutine<?>> r58Var2 = this.dispatchingPointerHandlers;
                PointerEventHandlerCoroutine<?>[] pointerEventHandlerCoroutineArr = r58Var2.content;
                int size = r58Var2.getSize();
                for (int i2 = 0; i2 < size; i2++) {
                    pointerEventHandlerCoroutineArr[i2].N(pointerEvent, pass);
                }
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                r58<PointerEventHandlerCoroutine<?>> r58Var3 = this.dispatchingPointerHandlers;
                int size2 = r58Var3.getSize() - 1;
                PointerEventHandlerCoroutine<?>[] pointerEventHandlerCoroutineArr2 = r58Var3.content;
                if (size2 < pointerEventHandlerCoroutineArr2.length) {
                    while (size2 >= 0) {
                        pointerEventHandlerCoroutineArr2[size2].N(pointerEvent, pass);
                        size2--;
                    }
                }
            }
            this.dispatchingPointerHandlers.j();
        } catch (Throwable th) {
            this.dispatchingPointerHandlers.j();
            throw th;
        }
    }

    @Override // com.google.inputmethod.bf9
    public void F2() {
        X1();
    }

    @Override // com.google.inputmethod.bf9
    public void K0() {
        e eVar = this.lastPointerEvent;
        if (eVar == null) {
            return;
        }
        List<PointerInputChange> listC = eVar.c();
        int size = listC.size();
        for (int i = 0; i < size; i++) {
            if (listC.get(i).getPressed()) {
                List<PointerInputChange> listC2 = eVar.c();
                ArrayList arrayList = new ArrayList(listC2.size());
                int size2 = listC2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    PointerInputChange pointerInputChange = listC2.get(i2);
                    arrayList.add(new PointerInputChange(pointerInputChange.getId(), pointerInputChange.getUptimeMillis(), pointerInputChange.getPosition(), false, pointerInputChange.getPressure(), pointerInputChange.getUptimeMillis(), pointerInputChange.getPosition(), pointerInputChange.getPressed(), pointerInputChange.getPressed(), pointerInputChange.getType(), 0L, 0.0f, 0L, 7168, (DefaultConstructorMarker) null));
                }
                e eVar2 = new e(arrayList);
                this.currentEvent = eVar2;
                r3(eVar2, PointerEventPass.Initial);
                r3(eVar2, PointerEventPass.Main);
                r3(eVar2, PointerEventPass.Final);
                this.lastPointerEvent = null;
                return;
            }
        }
    }

    public long K1() {
        long jB1 = b1(getViewConfiguration().g());
        long boundsSize = getBoundsSize();
        return tsb.d((((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jB1 >> 32)) - ((int) (boundsSize >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jB1 & 4294967295L)) - ((int) (boundsSize & 4294967295L))) / 2.0f)) & 4294967295L));
    }

    @Override // com.google.inputmethod.x23, com.google.inputmethod.bf9
    public void N() {
        X1();
    }

    @Override // com.google.inputmethod.df9
    public void V1(boolean z) {
        this.interceptOutOfBoundsChildEvents = z;
    }

    @Override // androidx.compose.ui.b.c
    public void W2() {
        X1();
        super.W2();
    }

    @Override // com.google.inputmethod.wgc
    public void X1() {
        s sVar = this.pointerInputJob;
        if (sVar != null) {
            sVar.k(new PointerInputResetException());
            this.pointerInputJob = null;
        }
    }

    @Override // com.google.inputmethod.df9
    /* JADX INFO: renamed from: a, reason: from getter */
    public long getBoundsSize() {
        return this.boundsSize;
    }

    @Override // com.google.inputmethod.f43
    public float getDensity() {
        return y23.q(this).getDensity().getDensity();
    }

    @Override // com.google.inputmethod.df9
    public p7e getViewConfiguration() {
        return y23.q(this).getViewConfiguration();
    }

    @Override // com.google.inputmethod.df9
    public <R> Object l0(Function2<? super cc0, ? super q22<? super R>, ? extends Object> function2, q22<? super R> q22Var) {
        kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(kotlin.coroutines.intrinsics.a.d(q22Var), 1);
        eVar.G();
        final PointerEventHandlerCoroutine pointerEventHandlerCoroutine = new PointerEventHandlerCoroutine(eVar);
        synchronized (this.pointerHandlersLock) {
            this.pointerHandlers.c(pointerEventHandlerCoroutine);
            q22 q22VarA = u22.a(function2, pointerEventHandlerCoroutine, pointerEventHandlerCoroutine);
            Result.a aVar = Result.a;
            q22VarA.resumeWith(Result.b(Unit.a));
        }
        eVar.D(new Function1<Throwable, Unit>() { // from class: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$awaitPointerEventScope$2$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.a;
            }

            public final void invoke(Throwable th) {
                pointerEventHandlerCoroutine.L(th);
            }
        });
        Object objY = eVar.y();
        if (objY == kotlin.coroutines.intrinsics.a.g()) {
            oq2.c(q22Var);
        }
        return objY;
    }

    /* JADX INFO: renamed from: s3, reason: from getter */
    public PointerInputEventHandler get_pointerInputEventHandler() {
        return this._pointerInputEventHandler;
    }

    public final void t3(Object key1, Object key2, Object[] keys, PointerInputEventHandler pointerInputEventHandler) {
        boolean z = !Intrinsics.e(this.key1, key1);
        this.key1 = key1;
        if (!Intrinsics.e(this.key2, key2)) {
            z = true;
        }
        this.key2 = key2;
        Object[] objArr = this.keys;
        if (objArr != null && keys == null) {
            z = true;
        }
        if (objArr == null && keys != null) {
            z = true;
        }
        if (objArr != null && keys != null && !Arrays.equals(keys, objArr)) {
            z = true;
        }
        this.keys = keys;
        if (get_pointerInputEventHandler().getClass() == pointerInputEventHandler.getClass() ? z : true) {
            X1();
        }
        this._pointerInputEventHandler = pointerInputEventHandler;
    }

    @Override // com.google.inputmethod.hm4
    /* JADX INFO: renamed from: w2 */
    public float getFontScale() {
        return y23.q(this).getDensity().getFontScale();
    }

    @Override // com.google.inputmethod.bf9
    public void x1(e pointerEvent, PointerEventPass pass, long bounds) {
        this.boundsSize = bounds;
        if (pass == PointerEventPass.Initial) {
            this.currentEvent = pointerEvent;
        }
        if (this.pointerInputJob == null) {
            this.pointerInputJob = rw0.d(L2(), (CoroutineContext) null, CoroutineStart.d, new SuspendingPointerInputModifierNodeImpl$onPointerEvent$1(this, null), 1, (Object) null);
        }
        r3(pointerEvent, pass);
        List<PointerInputChange> listC = pointerEvent.c();
        int size = listC.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            } else if (!f.d(listC.get(i))) {
                break;
            } else {
                i++;
            }
        }
        if (z) {
            pointerEvent = null;
        }
        this.lastPointerEvent = pointerEvent;
    }
}
