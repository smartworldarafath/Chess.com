package androidx.compose.p001foundation.gestures;

import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.e;
import androidx.compose.ui.input.pointer.f;
import com.google.android.ps4;
import com.google.android.q22;
import com.google.android.rw0;
import com.google.android.ta2;
import com.google.inputmethod.cc0;
import com.google.inputmethod.df9;
import com.google.inputmethod.gmc;
import com.google.inputmethod.ke9;
import com.google.inputmethod.ml9;
import com.google.inputmethod.rn8;
import com.google.inputmethod.t04;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.j;
import kotlinx.coroutines.s;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0088\u0001\u0010\f\u001a\u00020\u0003*\u00020\u00002\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012*\b\u0002\u0010\n\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00062\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\u0086@¢\u0006\u0004\b\f\u0010\r\u001a\u0090\u0001\u0010\u0013\u001a\u00020\u0003*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012(\u0010\n\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00062\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\u0080@¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0014\u0010\u0015\u001a\u00020\u0003*\u00020\u000eH\u0082@¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u0017*\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0017H\u0082@¢\u0006\u0004\b\u0019\u0010\u001a\u001aX\u0010\u001b\u001a\u00020\u0003*\u00020\u00002*\b\u0002\u0010\n\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00062\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\u0080@¢\u0006\u0004\b\u001b\u0010\u001c\u001a(\u0010!\u001a\u00020\u0017*\u00020\u000e2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0086@¢\u0006\u0004\b!\u0010\"\u001a%\u0010%\u001a\u00020\u001d*\u00020#2\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010$\u001a\u00020\u001dH\u0000¢\u0006\u0004\b%\u0010&\u001a \u0010'\u001a\u0004\u0018\u00010\u0017*\u00020\u000e2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0086@¢\u0006\u0004\b'\u0010(\u001a\u001e\u0010*\u001a\u00020)*\u00020\u000e2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0080@¢\u0006\u0004\b*\u0010(\u001aI\u00101\u001a\u00020+*\u00020\u000f2\u0006\u0010,\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020-2\"\u00100\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0/H\u0002¢\u0006\u0004\b1\u00102\"6\u00105\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00066"}, d2 = {"Lcom/google/android/df9;", "Lkotlin/Function1;", "Lcom/google/android/rn8;", "", "onDoubleTap", "onLongPress", "Lkotlin/Function3;", "Lcom/google/android/ml9;", "Lcom/google/android/q22;", "", "onPress", "onTap", "h", "(Lcom/google/android/df9;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/google/android/ps4;Lkotlin/jvm/functions/Function1;Lcom/google/android/q22;)Ljava/lang/Object;", "Lcom/google/android/cc0;", "Lcom/google/android/ta2;", "scope", "Landroidx/compose/foundation/gestures/PressGestureScopeImpl;", "pressScope", "n", "(Lcom/google/android/cc0;Lcom/google/android/ta2;Landroidx/compose/foundation/gestures/PressGestureScopeImpl;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/google/android/ps4;Lkotlin/jvm/functions/Function1;Lcom/google/android/q22;)Ljava/lang/Object;", "f", "(Lcom/google/android/cc0;Lcom/google/android/q22;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/i;", "firstUp", "e", "(Lcom/google/android/cc0;Landroidx/compose/ui/input/pointer/i;Lcom/google/android/q22;)Ljava/lang/Object;", "g", "(Lcom/google/android/df9;Lcom/google/android/ps4;Lkotlin/jvm/functions/Function1;Lcom/google/android/q22;)Ljava/lang/Object;", "", "requireUnconsumed", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "c", "(Lcom/google/android/cc0;ZLandroidx/compose/ui/input/pointer/PointerEventPass;Lcom/google/android/q22;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/e;", "onlyPrimaryMouseButton", "j", "(Landroidx/compose/ui/input/pointer/e;ZZ)Z", "q", "(Lcom/google/android/cc0;Landroidx/compose/ui/input/pointer/PointerEventPass;Lcom/google/android/q22;)Ljava/lang/Object;", "Landroidx/compose/foundation/gestures/n;", "o", "Lkotlinx/coroutines/s;", "resetJob", "Lkotlinx/coroutines/CoroutineStart;", "start", "Lkotlin/Function2;", "block", "l", "(Lcom/google/android/ta2;Lkotlinx/coroutines/s;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/s;", "a", "Lcom/google/android/ps4;", "NoPressGesture", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class TapGestureDetectorKt {
    private static final ps4<ml9, rn8, q22<? super Unit>, Object> a = new TapGestureDetectorKt$NoPressGesture$1(null);

    /* JADX WARN: Code duplicated, block: B:17:0x0050 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x005c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004e -> B:18:0x0051). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object c(com.google.inputmethod.cc0 r7, boolean r8, androidx.compose.ui.input.pointer.PointerEventPass r9, com.google.android.q22<? super androidx.compose.ui.input.pointer.PointerInputChange> r10) {
        /*
            boolean r0 = r10 instanceof androidx.compose.p001foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2 r0 = (androidx.compose.p001foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            boolean r7 = r0.Z$0
            java.lang.Object r8 = r0.L$1
            androidx.compose.ui.input.pointer.PointerEventPass r8 = (androidx.compose.ui.input.pointer.PointerEventPass) r8
            java.lang.Object r9 = r0.L$0
            com.google.android.cc0 r9 = (com.google.inputmethod.cc0) r9
            kotlin.f.b(r10)
            r6 = r8
            r8 = r7
            r7 = r9
            r9 = r6
            goto L51
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3f:
            kotlin.f.b(r10)
        L42:
            r0.L$0 = r7
            r0.L$1 = r9
            r0.Z$0 = r8
            r0.label = r3
            java.lang.Object r10 = r7.f2(r9, r0)
            if (r10 != r1) goto L51
            return r1
        L51:
            androidx.compose.ui.input.pointer.e r10 = (androidx.compose.ui.input.pointer.e) r10
            r2 = 2
            r4 = 0
            r5 = 0
            boolean r2 = k(r10, r8, r5, r2, r4)
            if (r2 == 0) goto L42
            java.util.List r7 = r10.c()
            java.lang.Object r7 = r7.get(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p001foundation.gestures.TapGestureDetectorKt.c(com.google.android.cc0, boolean, androidx.compose.ui.input.pointer.PointerEventPass, com.google.android.q22):java.lang.Object");
    }

    public static /* synthetic */ Object d(cc0 cc0Var, boolean z, PointerEventPass pointerEventPass, q22 q22Var, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return c(cc0Var, z, pointerEventPass, q22Var);
    }

    private static final Object e(cc0 cc0Var, PointerInputChange pointerInputChange, q22<? super PointerInputChange> q22Var) {
        return cc0Var.m0(cc0Var.getViewConfiguration().e(), new TapGestureDetectorKt$awaitSecondDown$2(pointerInputChange, null), q22Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x0043 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0052 A[LOOP:0: B:19:0x0050->B:20:0x0052, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x0068  */
    /* JADX WARN: Code duplicated, block: B:26:0x0075 A[LOOP:1: B:22:0x0066->B:26:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0038 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:18:0x0044). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public static final java.lang.Object f(com.google.inputmethod.cc0 r8, com.google.android.q22<? super kotlin.Unit> r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.p001foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1 r0 = (androidx.compose.p001foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r8 = r0.L$0
            com.google.android.cc0 r8 = (com.google.inputmethod.cc0) r8
            kotlin.f.b(r9)
            goto L44
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            kotlin.f.b(r9)
        L38:
            r0.L$0 = r8
            r0.label = r3
            r9 = 0
            java.lang.Object r9 = com.google.inputmethod.cc0.E1(r8, r9, r0, r3, r9)
            if (r9 != r1) goto L44
            return r1
        L44:
            androidx.compose.ui.input.pointer.e r9 = (androidx.compose.ui.input.pointer.e) r9
            java.util.List r2 = r9.c()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L50:
            if (r6 >= r4) goto L5e
            java.lang.Object r7 = r2.get(r6)
            androidx.compose.ui.input.pointer.i r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
            r7.a()
            int r6 = r6 + 1
            goto L50
        L5e:
            java.util.List r9 = r9.c()
            int r2 = r9.size()
        L66:
            if (r5 >= r2) goto L78
            java.lang.Object r4 = r9.get(r5)
            androidx.compose.ui.input.pointer.i r4 = (androidx.compose.ui.input.pointer.PointerInputChange) r4
            boolean r4 = r4.getPressed()
            if (r4 == 0) goto L75
            goto L38
        L75:
            int r5 = r5 + 1
            goto L66
        L78:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p001foundation.gestures.TapGestureDetectorKt.f(com.google.android.cc0, com.google.android.q22):java.lang.Object");
    }

    public static final Object g(df9 df9Var, ps4<? super ml9, ? super rn8, ? super q22<? super Unit>, ? extends Object> ps4Var, Function1<? super rn8, Unit> function1, q22<? super Unit> q22Var) {
        Object objG = j.g(new TapGestureDetectorKt$detectTapAndPress$2(df9Var, ps4Var, function1, new PressGestureScopeImpl(df9Var), null), q22Var);
        return objG == a.g() ? objG : Unit.a;
    }

    public static final Object h(df9 df9Var, Function1<? super rn8, Unit> function1, Function1<? super rn8, Unit> function2, ps4<? super ml9, ? super rn8, ? super q22<? super Unit>, ? extends Object> ps4Var, Function1<? super rn8, Unit> function3, q22<? super Unit> q22Var) {
        Object objG = j.g(new TapGestureDetectorKt$detectTapGestures$2(df9Var, function1, function2, ps4Var, function3, null), q22Var);
        return objG == a.g() ? objG : Unit.a;
    }

    public static /* synthetic */ Object i(df9 df9Var, Function1 function1, Function1 function2, ps4 ps4Var, Function1 function3, q22 q22Var, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        if ((i & 2) != 0) {
            function2 = null;
        }
        if ((i & 4) != 0) {
            ps4Var = a;
        }
        if ((i & 8) != 0) {
            function3 = null;
        }
        return h(df9Var, function1, function2, ps4Var, function3, q22Var);
    }

    public static final boolean j(e eVar, boolean z, boolean z2) {
        if (z2) {
            List<PointerInputChange> listC = eVar.c();
            int size = listC.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    if (ke9.c(eVar.getButtons())) {
                        break;
                    }
                    return false;
                }
                if (!androidx.compose.ui.input.pointer.j.i(listC.get(i).getType(), androidx.compose.ui.input.pointer.j.INSTANCE.b())) {
                    break;
                }
                i++;
            }
        }
        List<PointerInputChange> listC2 = eVar.c();
        int size2 = listC2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            PointerInputChange pointerInputChange = listC2.get(i2);
            if (!(z ? f.a(pointerInputChange) : f.b(pointerInputChange))) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean k(e eVar, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = gmc.a();
        }
        return j(eVar, z, z2);
    }

    private static final s l(ta2 ta2Var, s sVar, CoroutineStart coroutineStart, Function2<? super ta2, ? super q22<? super Unit>, ? extends Object> function2) {
        return rw0.d(ta2Var, (CoroutineContext) null, coroutineStart, new TapGestureDetectorKt$launchAwaitingReset$1(sVar, function2, null), 1, (Object) null);
    }

    static /* synthetic */ s m(ta2 ta2Var, s sVar, CoroutineStart coroutineStart, Function2 function2, int i, Object obj) {
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.d;
        }
        return l(ta2Var, sVar, coroutineStart, function2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:101:0x0427  */
    /* JADX WARN: Code duplicated, block: B:102:0x0433  */
    /* JADX WARN: Code duplicated, block: B:106:0x043c  */
    /* JADX WARN: Code duplicated, block: B:27:0x019e  */
    /* JADX WARN: Code duplicated, block: B:28:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:30:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:33:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:35:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:38:0x0200  */
    /* JADX WARN: Code duplicated, block: B:41:0x0211  */
    /* JADX WARN: Code duplicated, block: B:44:0x0239  */
    /* JADX WARN: Code duplicated, block: B:47:0x0256  */
    /* JADX WARN: Code duplicated, block: B:49:0x025a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0261  */
    /* JADX WARN: Code duplicated, block: B:52:0x0265  */
    /* JADX WARN: Code duplicated, block: B:55:0x0270  */
    /* JADX WARN: Code duplicated, block: B:56:0x028a  */
    /* JADX WARN: Code duplicated, block: B:58:0x02a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x02aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:61:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:64:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:67:0x02e8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:69:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:71:0x0317  */
    /* JADX WARN: Code duplicated, block: B:73:0x0331  */
    /* JADX WARN: Code duplicated, block: B:76:0x034e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0356  */
    /* JADX WARN: Code duplicated, block: B:81:0x0372  */
    /* JADX WARN: Code duplicated, block: B:84:0x0387  */
    /* JADX WARN: Code duplicated, block: B:87:0x03af  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code duplicated, block: B:90:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:92:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:94:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:96:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:98:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:99:0x040d  */
    public static final Object n(cc0 cc0Var, ta2 ta2Var, PressGestureScopeImpl pressGestureScopeImpl, Function1<? super rn8, Unit> function1, Function1<? super rn8, Unit> function2, ps4<? super ml9, ? super rn8, ? super q22<? super Unit>, ? extends Object> ps4Var, Function1<? super rn8, Unit> function3, q22<? super Unit> q22Var) throws NoWhenBranchMatchedException {
        TapGestureDetectorKt$processTapGesture$1 tapGestureDetectorKt$processTapGesture$1;
        Function1<? super rn8, Unit> function4;
        ps4<? super ml9, ? super rn8, ? super q22<? super Unit>, ? extends Object> ps4Var2;
        Function1<? super rn8, Unit> function5;
        PressGestureScopeImpl pressGestureScopeImpl2;
        Function1<? super rn8, Unit> function6;
        cc0 cc0Var2;
        ta2 ta2Var2;
        PointerInputChange pointerInputChange;
        s sVarD;
        s sVar;
        Function1<? super rn8, Unit> function7;
        ps4<? super ml9, ? super rn8, ? super q22<? super Unit>, ? extends Object> ps4Var3;
        cc0 cc0Var3;
        PressGestureScopeImpl pressGestureScopeImpl3;
        Function1<? super rn8, Unit> function8;
        Function1<? super rn8, Unit> function9;
        Function1<? super rn8, Unit> function10;
        Function1<? super rn8, Unit> function11;
        cc0 cc0Var4;
        ta2 ta2Var3;
        PressGestureScopeImpl pressGestureScopeImpl4;
        ps4<? super ml9, ? super rn8, ? super q22<? super Unit>, ? extends Object> ps4Var4;
        Function1<? super rn8, Unit> function12;
        PointerInputChange finalUpChange;
        s sVarM;
        Object objE;
        PointerInputChange pointerInputChange2;
        cc0 cc0Var5;
        ta2 ta2Var4;
        Function1<? super rn8, Unit> function13;
        Function1<? super rn8, Unit> function14;
        Function1<? super rn8, Unit> function15;
        PressGestureScopeImpl pressGestureScopeImpl5;
        n nVar;
        s sVar2;
        ta2 ta2Var5;
        PressGestureScopeImpl pressGestureScopeImpl6;
        PointerInputChange pointerInputChange3;
        s sVarD2;
        Object objP;
        PointerInputChange pointerInputChange4;
        PointerInputChange pointerInputChange5;
        PressGestureScopeImpl pressGestureScopeImpl7;
        Function1<? super rn8, Unit> function16;
        Function1<? super rn8, Unit> function17;
        Function1<? super rn8, Unit> function18;
        ta2 ta2Var6;
        cc0 cc0Var6;
        ta2 ta2Var7;
        PointerInputChange finalUpChange2;
        n nVar2;
        s sVar3;
        PressGestureScopeImpl pressGestureScopeImpl8;
        ta2 ta2Var8;
        if (q22Var instanceof TapGestureDetectorKt$processTapGesture$1) {
            tapGestureDetectorKt$processTapGesture$1 = (TapGestureDetectorKt$processTapGesture$1) q22Var;
            int i = tapGestureDetectorKt$processTapGesture$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                tapGestureDetectorKt$processTapGesture$1.label = i - t04.INVALID_ID;
            } else {
                tapGestureDetectorKt$processTapGesture$1 = new TapGestureDetectorKt$processTapGesture$1(q22Var);
            }
        } else {
            tapGestureDetectorKt$processTapGesture$1 = new TapGestureDetectorKt$processTapGesture$1(q22Var);
        }
        TapGestureDetectorKt$processTapGesture$1 tapGestureDetectorKt$processTapGesture$2 = tapGestureDetectorKt$processTapGesture$1;
        Object objP2 = tapGestureDetectorKt$processTapGesture$2.result;
        Object objG = a.g();
        switch (tapGestureDetectorKt$processTapGesture$2.label) {
            case 0:
                kotlin.f.b(objP2);
                tapGestureDetectorKt$processTapGesture$2.L$0 = cc0Var;
                tapGestureDetectorKt$processTapGesture$2.L$1 = ta2Var;
                tapGestureDetectorKt$processTapGesture$2.L$2 = pressGestureScopeImpl;
                tapGestureDetectorKt$processTapGesture$2.L$3 = function1;
                function4 = function2;
                tapGestureDetectorKt$processTapGesture$2.L$4 = function4;
                ps4Var2 = ps4Var;
                tapGestureDetectorKt$processTapGesture$2.L$5 = ps4Var2;
                function5 = function3;
                tapGestureDetectorKt$processTapGesture$2.L$6 = function5;
                tapGestureDetectorKt$processTapGesture$2.label = 1;
                Object objD = d(cc0Var, false, null, tapGestureDetectorKt$processTapGesture$2, 3, null);
                if (objD != objG) {
                    pressGestureScopeImpl2 = pressGestureScopeImpl;
                    function6 = function1;
                    cc0Var2 = cc0Var;
                    ta2Var2 = ta2Var;
                    objP2 = objD;
                    pointerInputChange = (PointerInputChange) objP2;
                    pointerInputChange.a();
                    sVarD = rw0.d(ta2Var2, (CoroutineContext) null, CoroutineStart.d, new TapGestureDetectorKt$processTapGesture$resetJob$1(pressGestureScopeImpl2, null), 1, (Object) null);
                    if (ps4Var2 != a) {
                        m(ta2Var2, sVarD, null, new TapGestureDetectorKt$processTapGesture$2(ps4Var2, pressGestureScopeImpl2, pointerInputChange, null), 2, null);
                        sVar = sVarD;
                    } else {
                        sVar = sVarD;
                    }
                    if (function4 == null) {
                        tapGestureDetectorKt$processTapGesture$2.L$0 = cc0Var2;
                        tapGestureDetectorKt$processTapGesture$2.L$1 = ta2Var2;
                        tapGestureDetectorKt$processTapGesture$2.L$2 = pressGestureScopeImpl2;
                        tapGestureDetectorKt$processTapGesture$2.L$3 = function6;
                        tapGestureDetectorKt$processTapGesture$2.L$4 = function4;
                        tapGestureDetectorKt$processTapGesture$2.L$5 = ps4Var2;
                        tapGestureDetectorKt$processTapGesture$2.L$6 = function5;
                        tapGestureDetectorKt$processTapGesture$2.L$7 = sVar;
                        tapGestureDetectorKt$processTapGesture$2.label = 2;
                        objP2 = r(cc0Var2, null, tapGestureDetectorKt$processTapGesture$2, 1, null);
                        if (objP2 != objG) {
                            PressGestureScopeImpl pressGestureScopeImpl9 = pressGestureScopeImpl2;
                            function10 = function6;
                            function11 = function4;
                            cc0Var4 = cc0Var2;
                            ta2Var3 = ta2Var2;
                            pressGestureScopeImpl4 = pressGestureScopeImpl9;
                            ps4Var4 = ps4Var2;
                            function12 = function5;
                            finalUpChange = (PointerInputChange) objP2;
                            if (finalUpChange == null) {
                                sVarM = m(ta2Var3, sVar, null, new TapGestureDetectorKt$processTapGesture$4(pressGestureScopeImpl4, null), 2, null);
                            } else {
                                finalUpChange.a();
                                sVarM = m(ta2Var3, sVar, null, new TapGestureDetectorKt$processTapGesture$5(pressGestureScopeImpl4, null), 2, null);
                            }
                            if (finalUpChange != null) {
                                if (function10 == null) {
                                    tapGestureDetectorKt$processTapGesture$2.L$0 = cc0Var4;
                                    tapGestureDetectorKt$processTapGesture$2.L$1 = ta2Var3;
                                    tapGestureDetectorKt$processTapGesture$2.L$2 = pressGestureScopeImpl4;
                                    tapGestureDetectorKt$processTapGesture$2.L$3 = function10;
                                    tapGestureDetectorKt$processTapGesture$2.L$4 = function11;
                                    tapGestureDetectorKt$processTapGesture$2.L$5 = ps4Var4;
                                    tapGestureDetectorKt$processTapGesture$2.L$6 = function12;
                                    tapGestureDetectorKt$processTapGesture$2.L$7 = finalUpChange;
                                    tapGestureDetectorKt$processTapGesture$2.L$8 = sVarM;
                                    tapGestureDetectorKt$processTapGesture$2.label = 5;
                                    objE = e(cc0Var4, finalUpChange, tapGestureDetectorKt$processTapGesture$2);
                                    if (objE != objG) {
                                        Function1<? super rn8, Unit> function19 = function12;
                                        pointerInputChange2 = finalUpChange;
                                        objP2 = objE;
                                        cc0Var5 = cc0Var4;
                                        ta2Var4 = ta2Var3;
                                        function13 = function10;
                                        function14 = function19;
                                        PressGestureScopeImpl pressGestureScopeImpl10 = pressGestureScopeImpl4;
                                        function15 = function11;
                                        pressGestureScopeImpl5 = pressGestureScopeImpl10;
                                        pointerInputChange3 = (PointerInputChange) objP2;
                                        if (pointerInputChange3 != null) {
                                            sVarD2 = rw0.d(ta2Var4, (CoroutineContext) null, CoroutineStart.d, new TapGestureDetectorKt$processTapGesture$6(sVarM, pressGestureScopeImpl5, null), 1, (Object) null);
                                            if (ps4Var4 != a) {
                                                m(ta2Var4, sVarD2, null, new TapGestureDetectorKt$processTapGesture$7(ps4Var4, pressGestureScopeImpl5, pointerInputChange3, null), 2, null);
                                            }
                                            if (function15 == null) {
                                                tapGestureDetectorKt$processTapGesture$2.L$0 = ta2Var4;
                                                tapGestureDetectorKt$processTapGesture$2.L$1 = pressGestureScopeImpl5;
                                                tapGestureDetectorKt$processTapGesture$2.L$2 = function13;
                                                tapGestureDetectorKt$processTapGesture$2.L$3 = function14;
                                                tapGestureDetectorKt$processTapGesture$2.L$4 = sVarD2;
                                                tapGestureDetectorKt$processTapGesture$2.L$5 = pointerInputChange2;
                                                tapGestureDetectorKt$processTapGesture$2.L$6 = null;
                                                tapGestureDetectorKt$processTapGesture$2.L$7 = null;
                                                tapGestureDetectorKt$processTapGesture$2.L$8 = null;
                                                tapGestureDetectorKt$processTapGesture$2.label = 6;
                                                objP2 = r(cc0Var5, null, tapGestureDetectorKt$processTapGesture$2, 1, null);
                                                if (objP2 != objG) {
                                                    pointerInputChange5 = pointerInputChange2;
                                                    function16 = function14;
                                                    function18 = function13;
                                                    ta2Var7 = ta2Var4;
                                                    finalUpChange2 = (PointerInputChange) objP2;
                                                    if (finalUpChange2 != null) {
                                                        finalUpChange2.a();
                                                        m(ta2Var7, sVarD2, null, new TapGestureDetectorKt$processTapGesture$8(pressGestureScopeImpl5, null), 2, null);
                                                        function18.invoke(rn8.d(finalUpChange2.getPosition()));
                                                    } else {
                                                        m(ta2Var7, sVarD2, null, new TapGestureDetectorKt$processTapGesture$9(pressGestureScopeImpl5, null), 2, null);
                                                        if (function16 != null) {
                                                            function16.invoke(rn8.d(pointerInputChange5.getPosition()));
                                                        }
                                                    }
                                                }
                                            } else {
                                                tapGestureDetectorKt$processTapGesture$2.L$0 = cc0Var5;
                                                tapGestureDetectorKt$processTapGesture$2.L$1 = ta2Var4;
                                                tapGestureDetectorKt$processTapGesture$2.L$2 = pressGestureScopeImpl5;
                                                tapGestureDetectorKt$processTapGesture$2.L$3 = function13;
                                                tapGestureDetectorKt$processTapGesture$2.L$4 = function15;
                                                tapGestureDetectorKt$processTapGesture$2.L$5 = function14;
                                                tapGestureDetectorKt$processTapGesture$2.L$6 = sVarD2;
                                                tapGestureDetectorKt$processTapGesture$2.L$7 = pointerInputChange2;
                                                tapGestureDetectorKt$processTapGesture$2.L$8 = pointerInputChange3;
                                                tapGestureDetectorKt$processTapGesture$2.label = 7;
                                                objP = p(cc0Var5, null, tapGestureDetectorKt$processTapGesture$2, 1, null);
                                                if (objP != objG) {
                                                    PointerInputChange pointerInputChange6 = pointerInputChange2;
                                                    pointerInputChange4 = pointerInputChange3;
                                                    objP2 = objP;
                                                    pointerInputChange5 = pointerInputChange6;
                                                    Function1<? super rn8, Unit> function20 = function15;
                                                    pressGestureScopeImpl7 = pressGestureScopeImpl5;
                                                    function16 = function14;
                                                    function17 = function20;
                                                    function18 = function13;
                                                    ta2Var6 = ta2Var4;
                                                    cc0Var6 = cc0Var5;
                                                    nVar2 = (n) objP2;
                                                    if (!Intrinsics.e(nVar2, n.c.a)) {
                                                        function17.invoke(rn8.d(pointerInputChange4.getPosition()));
                                                        tapGestureDetectorKt$processTapGesture$2.L$0 = ta2Var6;
                                                        tapGestureDetectorKt$processTapGesture$2.L$1 = pressGestureScopeImpl7;
                                                        tapGestureDetectorKt$processTapGesture$2.L$2 = sVarD2;
                                                        tapGestureDetectorKt$processTapGesture$2.L$3 = null;
                                                        tapGestureDetectorKt$processTapGesture$2.L$4 = null;
                                                        tapGestureDetectorKt$processTapGesture$2.L$5 = null;
                                                        tapGestureDetectorKt$processTapGesture$2.L$6 = null;
                                                        tapGestureDetectorKt$processTapGesture$2.L$7 = null;
                                                        tapGestureDetectorKt$processTapGesture$2.L$8 = null;
                                                        tapGestureDetectorKt$processTapGesture$2.label = 8;
                                                        if (f(cc0Var6, tapGestureDetectorKt$processTapGesture$2) != objG) {
                                                            sVar3 = sVarD2;
                                                            pressGestureScopeImpl8 = pressGestureScopeImpl7;
                                                            ta2Var8 = ta2Var6;
                                                            m(ta2Var8, sVar3, null, new TapGestureDetectorKt$processTapGesture$secondUp$1(pressGestureScopeImpl8, null), 2, null);
                                                            return Unit.a;
                                                        }
                                                    } else {
                                                        if (nVar2 instanceof n.b) {
                                                            finalUpChange2 = ((n.b) nVar2).getFinalUpChange();
                                                        } else {
                                                            if (nVar2 instanceof n.a) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            finalUpChange2 = null;
                                                        }
                                                        pressGestureScopeImpl5 = pressGestureScopeImpl7;
                                                        ta2Var7 = ta2Var6;
                                                        if (finalUpChange2 != null) {
                                                            finalUpChange2.a();
                                                            m(ta2Var7, sVarD2, null, new TapGestureDetectorKt$processTapGesture$8(pressGestureScopeImpl5, null), 2, null);
                                                            function18.invoke(rn8.d(finalUpChange2.getPosition()));
                                                        } else {
                                                            m(ta2Var7, sVarD2, null, new TapGestureDetectorKt$processTapGesture$9(pressGestureScopeImpl5, null), 2, null);
                                                            if (function16 != null) {
                                                                function16.invoke(rn8.d(pointerInputChange5.getPosition()));
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (function14 != null) {
                                            function14.invoke(rn8.d(pointerInputChange2.getPosition()));
                                        }
                                    }
                                } else if (function12 != null) {
                                    function12.invoke(rn8.d(finalUpChange.getPosition()));
                                }
                            }
                            return Unit.a;
                        }
                    } else {
                        tapGestureDetectorKt$processTapGesture$2.L$0 = cc0Var2;
                        tapGestureDetectorKt$processTapGesture$2.L$1 = ta2Var2;
                        tapGestureDetectorKt$processTapGesture$2.L$2 = pressGestureScopeImpl2;
                        tapGestureDetectorKt$processTapGesture$2.L$3 = function6;
                        tapGestureDetectorKt$processTapGesture$2.L$4 = function4;
                        tapGestureDetectorKt$processTapGesture$2.L$5 = ps4Var2;
                        tapGestureDetectorKt$processTapGesture$2.L$6 = function5;
                        tapGestureDetectorKt$processTapGesture$2.L$7 = pointerInputChange;
                        tapGestureDetectorKt$processTapGesture$2.L$8 = sVar;
                        tapGestureDetectorKt$processTapGesture$2.label = 3;
                        objP2 = p(cc0Var2, null, tapGestureDetectorKt$processTapGesture$2, 1, null);
                        if (objP2 != objG) {
                            Function1<? super rn8, Unit> function21 = function4;
                            function7 = function6;
                            ps4Var3 = ps4Var2;
                            cc0Var3 = cc0Var2;
                            pressGestureScopeImpl3 = pressGestureScopeImpl2;
                            function8 = function21;
                            function9 = function5;
                            nVar = (n) objP2;
                            if (!Intrinsics.e(nVar, n.c.a)) {
                                if (nVar instanceof n.b) {
                                    finalUpChange = ((n.b) nVar).getFinalUpChange();
                                } else {
                                    if (!(nVar instanceof n.a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    finalUpChange = null;
                                }
                                PressGestureScopeImpl pressGestureScopeImpl11 = pressGestureScopeImpl3;
                                ta2Var3 = ta2Var2;
                                pressGestureScopeImpl4 = pressGestureScopeImpl11;
                                function12 = function9;
                                ps4Var4 = ps4Var3;
                                function11 = function8;
                                function10 = function7;
                                cc0Var4 = cc0Var3;
                                if (finalUpChange == null) {
                                    sVarM = m(ta2Var3, sVar, null, new TapGestureDetectorKt$processTapGesture$4(pressGestureScopeImpl4, null), 2, null);
                                } else {
                                    finalUpChange.a();
                                    sVarM = m(ta2Var3, sVar, null, new TapGestureDetectorKt$processTapGesture$5(pressGestureScopeImpl4, null), 2, null);
                                }
                                if (finalUpChange != null) {
                                    if (function10 == null) {
                                        tapGestureDetectorKt$processTapGesture$2.L$0 = cc0Var4;
                                        tapGestureDetectorKt$processTapGesture$2.L$1 = ta2Var3;
                                        tapGestureDetectorKt$processTapGesture$2.L$2 = pressGestureScopeImpl4;
                                        tapGestureDetectorKt$processTapGesture$2.L$3 = function10;
                                        tapGestureDetectorKt$processTapGesture$2.L$4 = function11;
                                        tapGestureDetectorKt$processTapGesture$2.L$5 = ps4Var4;
                                        tapGestureDetectorKt$processTapGesture$2.L$6 = function12;
                                        tapGestureDetectorKt$processTapGesture$2.L$7 = finalUpChange;
                                        tapGestureDetectorKt$processTapGesture$2.L$8 = sVarM;
                                        tapGestureDetectorKt$processTapGesture$2.label = 5;
                                        objE = e(cc0Var4, finalUpChange, tapGestureDetectorKt$processTapGesture$2);
                                        if (objE != objG) {
                                            Function1<? super rn8, Unit> function110 = function12;
                                            pointerInputChange2 = finalUpChange;
                                            objP2 = objE;
                                            cc0Var5 = cc0Var4;
                                            ta2Var4 = ta2Var3;
                                            function13 = function10;
                                            function14 = function110;
                                            PressGestureScopeImpl pressGestureScopeImpl12 = pressGestureScopeImpl4;
                                            function15 = function11;
                                            pressGestureScopeImpl5 = pressGestureScopeImpl12;
                                            pointerInputChange3 = (PointerInputChange) objP2;
                                            if (pointerInputChange3 != null) {
                                                sVarD2 = rw0.d(ta2Var4, (CoroutineContext) null, CoroutineStart.d, new TapGestureDetectorKt$processTapGesture$6(sVarM, pressGestureScopeImpl5, null), 1, (Object) null);
                                                if (ps4Var4 != a) {
                                                    m(ta2Var4, sVarD2, null, new TapGestureDetectorKt$processTapGesture$7(ps4Var4, pressGestureScopeImpl5, pointerInputChange3, null), 2, null);
                                                }
                                                if (function15 == null) {
                                                    tapGestureDetectorKt$processTapGesture$2.L$0 = ta2Var4;
                                                    tapGestureDetectorKt$processTapGesture$2.L$1 = pressGestureScopeImpl5;
                                                    tapGestureDetectorKt$processTapGesture$2.L$2 = function13;
                                                    tapGestureDetectorKt$processTapGesture$2.L$3 = function14;
                                                    tapGestureDetectorKt$processTapGesture$2.L$4 = sVarD2;
                                                    tapGestureDetectorKt$processTapGesture$2.L$5 = pointerInputChange2;
                                                    tapGestureDetectorKt$processTapGesture$2.L$6 = null;
                                                    tapGestureDetectorKt$processTapGesture$2.L$7 = null;
                                                    tapGestureDetectorKt$processTapGesture$2.L$8 = null;
                                                    tapGestureDetectorKt$processTapGesture$2.label = 6;
                                                    objP2 = r(cc0Var5, null, tapGestureDetectorKt$processTapGesture$2, 1, null);
                                                    if (objP2 != objG) {
                                                        pointerInputChange5 = pointerInputChange2;
                                                        function16 = function14;
                                                        function18 = function13;
                                                        ta2Var7 = ta2Var4;
                                                        finalUpChange2 = (PointerInputChange) objP2;
                                                        if (finalUpChange2 != null) {
                                                            finalUpChange2.a();
                                                            m(ta2Var7, sVarD2, null, new TapGestureDetectorKt$processTapGesture$8(pressGestureScopeImpl5, null), 2, null);
                                                            function18.invoke(rn8.d(finalUpChange2.getPosition()));
                                                        } else {
                                                            m(ta2Var7, sVarD2, null, new TapGestureDetectorKt$processTapGesture$9(pressGestureScopeImpl5, null), 2, null);
                                                            if (function16 != null) {
                                                                function16.invoke(rn8.d(pointerInputChange5.getPosition()));
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    tapGestureDetectorKt$processTapGesture$2.L$0 = cc0Var5;
                                                    tapGestureDetectorKt$processTapGesture$2.L$1 = ta2Var4;
                                                    tapGestureDetectorKt$processTapGesture$2.L$2 = pressGestureScopeImpl5;
                                                    tapGestureDetectorKt$processTapGesture$2.L$3 = function13;
                                                    tapGestureDetectorKt$processTapGesture$2.L$4 = function15;
                                                    tapGestureDetectorKt$processTapGesture$2.L$5 = function14;
                                                    tapGestureDetectorKt$processTapGesture$2.L$6 = sVarD2;
                                                    tapGestureDetectorKt$processTapGesture$2.L$7 = pointerInputChange2;
                                                    tapGestureDetectorKt$processTapGesture$2.L$8 = pointerInputChange3;
                                                    tapGestureDetectorKt$processTapGesture$2.label = 7;
                                                    objP = p(cc0Var5, null, tapGestureDetectorKt$processTapGesture$2, 1, null);
                                                    if (objP != objG) {
                                                        PointerInputChange pointerInputChange7 = pointerInputChange2;
                                                        pointerInputChange4 = pointerInputChange3;
                                                        objP2 = objP;
                                                        pointerInputChange5 = pointerInputChange7;
                                                        Function1<? super rn8, Unit> function22 = function15;
                                                        pressGestureScopeImpl7 = pressGestureScopeImpl5;
                                                        function16 = function14;
                                                        function17 = function22;
                                                        function18 = function13;
                                                        ta2Var6 = ta2Var4;
                                                        cc0Var6 = cc0Var5;
                                                        nVar2 = (n) objP2;
                                                        if (!Intrinsics.e(nVar2, n.c.a)) {
                                                            function17.invoke(rn8.d(pointerInputChange4.getPosition()));
                                                            tapGestureDetectorKt$processTapGesture$2.L$0 = ta2Var6;
                                                            tapGestureDetectorKt$processTapGesture$2.L$1 = pressGestureScopeImpl7;
                                                            tapGestureDetectorKt$processTapGesture$2.L$2 = sVarD2;
                                                            tapGestureDetectorKt$processTapGesture$2.L$3 = null;
                                                            tapGestureDetectorKt$processTapGesture$2.L$4 = null;
                                                            tapGestureDetectorKt$processTapGesture$2.L$5 = null;
                                                            tapGestureDetectorKt$processTapGesture$2.L$6 = null;
                                                            tapGestureDetectorKt$processTapGesture$2.L$7 = null;
                                                            tapGestureDetectorKt$processTapGesture$2.L$8 = null;
                                                            tapGestureDetectorKt$processTapGesture$2.label = 8;
                                                            if (f(cc0Var6, tapGestureDetectorKt$processTapGesture$2) != objG) {
                                                                sVar3 = sVarD2;
                                                                pressGestureScopeImpl8 = pressGestureScopeImpl7;
                                                                ta2Var8 = ta2Var6;
                                                                m(ta2Var8, sVar3, null, new TapGestureDetectorKt$processTapGesture$secondUp$1(pressGestureScopeImpl8, null), 2, null);
                                                                return Unit.a;
                                                            }
                                                        } else {
                                                            if (nVar2 instanceof n.b) {
                                                                finalUpChange2 = ((n.b) nVar2).getFinalUpChange();
                                                            } else {
                                                                if (nVar2 instanceof n.a) {
                                                                    throw new NoWhenBranchMatchedException();
                                                                }
                                                                finalUpChange2 = null;
                                                            }
                                                            pressGestureScopeImpl5 = pressGestureScopeImpl7;
                                                            ta2Var7 = ta2Var6;
                                                            if (finalUpChange2 != null) {
                                                                finalUpChange2.a();
                                                                m(ta2Var7, sVarD2, null, new TapGestureDetectorKt$processTapGesture$8(pressGestureScopeImpl5, null), 2, null);
                                                                function18.invoke(rn8.d(finalUpChange2.getPosition()));
                                                            } else {
                                                                m(ta2Var7, sVarD2, null, new TapGestureDetectorKt$processTapGesture$9(pressGestureScopeImpl5, null), 2, null);
                                                                if (function16 != null) {
                                                                    function16.invoke(rn8.d(pointerInputChange5.getPosition()));
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if (function14 != null) {
                                                function14.invoke(rn8.d(pointerInputChange2.getPosition()));
                                            }
                                        }
                                    } else if (function12 != null) {
                                        function12.invoke(rn8.d(finalUpChange.getPosition()));
                                    }
                                }
                                return Unit.a;
                            }
                            function8.invoke(rn8.d(pointerInputChange.getPosition()));
                            tapGestureDetectorKt$processTapGesture$2.L$0 = ta2Var2;
                            tapGestureDetectorKt$processTapGesture$2.L$1 = pressGestureScopeImpl3;
                            tapGestureDetectorKt$processTapGesture$2.L$2 = sVar;
                            tapGestureDetectorKt$processTapGesture$2.L$3 = null;
                            tapGestureDetectorKt$processTapGesture$2.L$4 = null;
                            tapGestureDetectorKt$processTapGesture$2.L$5 = null;
                            tapGestureDetectorKt$processTapGesture$2.L$6 = null;
                            tapGestureDetectorKt$processTapGesture$2.L$7 = null;
                            tapGestureDetectorKt$processTapGesture$2.L$8 = null;
                            tapGestureDetectorKt$processTapGesture$2.label = 4;
                            if (f(cc0Var3, tapGestureDetectorKt$processTapGesture$2) != objG) {
                                sVar2 = sVar;
                                ta2Var5 = ta2Var2;
                                pressGestureScopeImpl6 = pressGestureScopeImpl3;
                                m(ta2Var5, sVar2, null, new TapGestureDetectorKt$processTapGesture$3(pressGestureScopeImpl6, null), 2, null);
                                return Unit.a;
                            }
                        }
                    }
                }
                return objG;
            case 1:
                Function1<? super rn8, Unit> function23 = (Function1) tapGestureDetectorKt$processTapGesture$2.L$6;
                ps4<? super ml9, ? super rn8, ? super q22<? super Unit>, ? extends Object> ps4Var5 = (ps4) tapGestureDetectorKt$processTapGesture$2.L$5;
                Function1<? super rn8, Unit> function24 = (Function1) tapGestureDetectorKt$processTapGesture$2.L$4;
                function6 = (Function1) tapGestureDetectorKt$processTapGesture$2.L$3;
                pressGestureScopeImpl2 = (PressGestureScopeImpl) tapGestureDetectorKt$processTapGesture$2.L$2;
                ta2Var2 = (ta2) tapGestureDetectorKt$processTapGesture$2.L$1;
                cc0Var2 = (cc0) tapGestureDetectorKt$processTapGesture$2.L$0;
                kotlin.f.b(objP2);
                function5 = function23;
                ps4Var2 = ps4Var5;
                function4 = function24;
                pointerInputChange = (PointerInputChange) objP2;
                pointerInputChange.a();
                sVarD = rw0.d(ta2Var2, (CoroutineContext) null, CoroutineStart.d, new TapGestureDetectorKt$processTapGesture$resetJob$1(pressGestureScopeImpl2, null), 1, (Object) null);
                if (ps4Var2 != a) {
                    m(ta2Var2, sVarD, null, new TapGestureDetectorKt$processTapGesture$2(ps4Var2, pressGestureScopeImpl2, pointerInputChange, null), 2, null);
                    sVar = sVarD;
                } else {
                    sVar = sVarD;
                }
                if (function4 == null) {
                    tapGestureDetectorKt$processTapGesture$2.L$0 = cc0Var2;
                    tapGestureDetectorKt$processTapGesture$2.L$1 = ta2Var2;
                    tapGestureDetectorKt$processTapGesture$2.L$2 = pressGestureScopeImpl2;
                    tapGestureDetectorKt$processTapGesture$2.L$3 = function6;
                    tapGestureDetectorKt$processTapGesture$2.L$4 = function4;
                    tapGestureDetectorKt$processTapGesture$2.L$5 = ps4Var2;
                    tapGestureDetectorKt$processTapGesture$2.L$6 = function5;
                    tapGestureDetectorKt$processTapGesture$2.L$7 = sVar;
                    tapGestureDetectorKt$processTapGesture$2.label = 2;
                    objP2 = r(cc0Var2, null, tapGestureDetectorKt$processTapGesture$2, 1, null);
                    if (objP2 != objG) {
                        PressGestureScopeImpl pressGestureScopeImpl13 = pressGestureScopeImpl2;
                        function10 = function6;
                        function11 = function4;
                        cc0Var4 = cc0Var2;
                        ta2Var3 = ta2Var2;
                        pressGestureScopeImpl4 = pressGestureScopeImpl13;
                        ps4Var4 = ps4Var2;
                        function12 = function5;
                        finalUpChange = (PointerInputChange) objP2;
                        if (finalUpChange == null) {
                            sVarM = m(ta2Var3, sVar, null, new TapGestureDetectorKt$processTapGesture$4(pressGestureScopeImpl4, null), 2, null);
                        } else {
                            finalUpChange.a();
                            sVarM = m(ta2Var3, sVar, null, new TapGestureDetectorKt$processTapGesture$5(pressGestureScopeImpl4, null), 2, null);
                        }
                        if (finalUpChange != null) {
                            if (function10 == null) {
                                tapGestureDetectorKt$processTapGesture$2.L$0 = cc0Var4;
                                tapGestureDetectorKt$processTapGesture$2.L$1 = ta2Var3;
                                tapGestureDetectorKt$processTapGesture$2.L$2 = pressGestureScopeImpl4;
                                tapGestureDetectorKt$processTapGesture$2.L$3 = function10;
                                tapGestureDetectorKt$processTapGesture$2.L$4 = function11;
                                tapGestureDetectorKt$processTapGesture$2.L$5 = ps4Var4;
                                tapGestureDetectorKt$processTapGesture$2.L$6 = function12;
                                tapGestureDetectorKt$processTapGesture$2.L$7 = finalUpChange;
                                tapGestureDetectorKt$processTapGesture$2.L$8 = sVarM;
                                tapGestureDetectorKt$processTapGesture$2.label = 5;
                                objE = e(cc0Var4, finalUpChange, tapGestureDetectorKt$processTapGesture$2);
                                if (objE != objG) {
                                    Function1<? super rn8, Unit> function111 = function12;
                                    pointerInputChange2 = finalUpChange;
                                    objP2 = objE;
                                    cc0Var5 = cc0Var4;
                                    ta2Var4 = ta2Var3;
                                    function13 = function10;
                                    function14 = function111;
                                    PressGestureScopeImpl pressGestureScopeImpl14 = pressGestureScopeImpl4;
                                    function15 = function11;
                                    pressGestureScopeImpl5 = pressGestureScopeImpl14;
                                    pointerInputChange3 = (PointerInputChange) objP2;
                                    if (pointerInputChange3 != null) {
                                        sVarD2 = rw0.d(ta2Var4, (CoroutineContext) null, CoroutineStart.d, new TapGestureDetectorKt$processTapGesture$6(sVarM, pressGestureScopeImpl5, null), 1, (Object) null);
                                        if (ps4Var4 != a) {
                                            m(ta2Var4, sVarD2, null, new TapGestureDetectorKt$processTapGesture$7(ps4Var4, pressGestureScopeImpl5, pointerInputChange3, null), 2, null);
                                        }
                                        if (function15 == null) {
                                            tapGestureDetectorKt$processTapGesture$2.L$0 = ta2Var4;
                                            tapGestureDetectorKt$processTapGesture$2.L$1 = pressGestureScopeImpl5;
                                            tapGestureDetectorKt$processTapGesture$2.L$2 = function13;
                                            tapGestureDetectorKt$processTapGesture$2.L$3 = function14;
                                            tapGestureDetectorKt$processTapGesture$2.L$4 = sVarD2;
                                            tapGestureDetectorKt$processTapGesture$2.L$5 = pointerInputChange2;
                                            tapGestureDetectorKt$processTapGesture$2.L$6 = null;
                                            tapGestureDetectorKt$processTapGesture$2.L$7 = null;
                                            tapGestureDetectorKt$processTapGesture$2.L$8 = null;
                                            tapGestureDetectorKt$processTapGesture$2.label = 6;
                                            objP2 = r(cc0Var5, null, tapGestureDetectorKt$processTapGesture$2, 1, null);
                                            if (objP2 != objG) {
                                                pointerInputChange5 = pointerInputChange2;
                                                function16 = function14;
                                                function18 = function13;
                                                ta2Var7 = ta2Var4;
                                                finalUpChange2 = (PointerInputChange) objP2;
                                                if (finalUpChange2 != null) {
                                                    finalUpChange2.a();
                                                    m(ta2Var7, sVarD2, null, new TapGestureDetectorKt$processTapGesture$8(pressGestureScopeImpl5, null), 2, null);
                                                    function18.invoke(rn8.d(finalUpChange2.getPosition()));
                                                } else {
                                                    m(ta2Var7, sVarD2, null, new TapGestureDetectorKt$processTapGesture$9(pressGestureScopeImpl5, null), 2, null);
                                                    if (function16 != null) {
                                                        function16.invoke(rn8.d(pointerInputChange5.getPosition()));
                                                    }
                                                }
                                            }
                                        } else {
                                            tapGestureDetectorKt$processTapGesture$2.L$0 = cc0Var5;
                                            tapGestureDetectorKt$processTapGesture$2.L$1 = ta2Var4;
                                            tapGestureDetectorKt$processTapGesture$2.L$2 = pressGestureScopeImpl5;
                                            tapGestureDetectorKt$processTapGesture$2.L$3 = function13;
                                            tapGestureDetectorKt$processTapGesture$2.L$4 = function15;
                                            tapGestureDetectorKt$processTapGesture$2.L$5 = function14;
                                            tapGestureDetectorKt$processTapGesture$2.L$6 = sVarD2;
                                            tapGestureDetectorKt$processTapGesture$2.L$7 = pointerInputChange2;
                                            tapGestureDetectorKt$processTapGesture$2.L$8 = pointerInputChange3;
                                            tapGestureDetectorKt$processTapGesture$2.label = 7;
                                            objP = p(cc0Var5, null, tapGestureDetectorKt$processTapGesture$2, 1, null);
                                            if (objP != objG) {
                                                PointerInputChange pointerInputChange8 = pointerInputChange2;
                                                pointerInputChange4 = pointerInputChange3;
                                                objP2 = objP;
                                                pointerInputChange5 = pointerInputChange8;
                                                Function1<? super rn8, Unit> function25 = function15;
                                                pressGestureScopeImpl7 = pressGestureScopeImpl5;
                                                function16 = function14;
                                                function17 = function25;
                                                function18 = function13;
                                                ta2Var6 = ta2Var4;
                                                cc0Var6 = cc0Var5;
                                                nVar2 = (n) objP2;
                                                if (!Intrinsics.e(nVar2, n.c.a)) {
                                                    function17.invoke(rn8.d(pointerInputChange4.getPosition()));
                                                    tapGestureDetectorKt$processTapGesture$2.L$0 = ta2Var6;
                                                    tapGestureDetectorKt$processTapGesture$2.L$1 = pressGestureScopeImpl7;
                                                    tapGestureDetectorKt$processTapGesture$2.L$2 = sVarD2;
                                                    tapGestureDetectorKt$processTapGesture$2.L$3 = null;
                                                    tapGestureDetectorKt$processTapGesture$2.L$4 = null;
                                                    tapGestureDetectorKt$processTapGesture$2.L$5 = null;
                                                    tapGestureDetectorKt$processTapGesture$2.L$6 = null;
                                                    tapGestureDetectorKt$processTapGesture$2.L$7 = null;
                                                    tapGestureDetectorKt$processTapGesture$2.L$8 = null;
                                                    tapGestureDetectorKt$processTapGesture$2.label = 8;
                                                    if (f(cc0Var6, tapGestureDetectorKt$processTapGesture$2) != objG) {
                                                        sVar3 = sVarD2;
                                                        pressGestureScopeImpl8 = pressGestureScopeImpl7;
                                                        ta2Var8 = ta2Var6;
                                                        m(ta2Var8, sVar3, null, new TapGestureDetectorKt$processTapGesture$secondUp$1(pressGestureScopeImpl8, null), 2, null);
                                                        return Unit.a;
                                                    }
                                                } else {
                                                    if (nVar2 instanceof n.b) {
                                                        finalUpChange2 = ((n.b) nVar2).getFinalUpChange();
                                                    } else {
                                                        if (nVar2 instanceof n.a) {
                                                            throw new NoWhenBranchMatchedException();
                                                        }
                                                        finalUpChange2 = null;
                                                    }
                                                    pressGestureScopeImpl5 = pressGestureScopeImpl7;
                                                    ta2Var7 = ta2Var6;
                                                    if (finalUpChange2 != null) {
                                                        finalUpChange2.a();
                                                        m(ta2Var7, sVarD2, null, new TapGestureDetectorKt$processTapGesture$8(pressGestureScopeImpl5, null), 2, null);
                                                        function18.invoke(rn8.d(finalUpChange2.getPosition()));
                                                    } else {
                                                        m(ta2Var7, sVarD2, null, new TapGestureDetectorKt$processTapGesture$9(pressGestureScopeImpl5, null), 2, null);
                                                        if (function16 != null) {
                                                            function16.invoke(rn8.d(pointerInputChange5.getPosition()));
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else if (function14 != null) {
                                        function14.invoke(rn8.d(pointerInputChange2.getPosition()));
                                    }
                                }
                            } else if (function12 != null) {
                                function12.invoke(rn8.d(finalUpChange.getPosition()));
                            }
                        }
                        return Unit.a;
                    }
                } else {
                    tapGestureDetectorKt$processTapGesture$2.L$0 = cc0Var2;
                    tapGestureDetectorKt$processTapGesture$2.L$1 = ta2Var2;
                    tapGestureDetectorKt$processTapGesture$2.L$2 = pressGestureScopeImpl2;
                    tapGestureDetectorKt$processTapGesture$2.L$3 = function6;
                    tapGestureDetectorKt$processTapGesture$2.L$4 = function4;
                    tapGestureDetectorKt$processTapGesture$2.L$5 = ps4Var2;
                    tapGestureDetectorKt$processTapGesture$2.L$6 = function5;
                    tapGestureDetectorKt$processTapGesture$2.L$7 = pointerInputChange;
                    tapGestureDetectorKt$processTapGesture$2.L$8 = sVar;
                    tapGestureDetectorKt$processTapGesture$2.label = 3;
                    objP2 = p(cc0Var2, null, tapGestureDetectorKt$processTapGesture$2, 1, null);
                    if (objP2 != objG) {
                        Function1<? super rn8, Unit> function26 = function4;
                        function7 = function6;
                        ps4Var3 = ps4Var2;
                        cc0Var3 = cc0Var2;
                        pressGestureScopeImpl3 = pressGestureScopeImpl2;
                        function8 = function26;
                        function9 = function5;
                        nVar = (n) objP2;
                        if (!Intrinsics.e(nVar, n.c.a)) {
                            if (nVar instanceof n.b) {
                                finalUpChange = ((n.b) nVar).getFinalUpChange();
                            } else {
                                if (!(nVar instanceof n.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                finalUpChange = null;
                            }
                            PressGestureScopeImpl pressGestureScopeImpl15 = pressGestureScopeImpl3;
                            ta2Var3 = ta2Var2;
                            pressGestureScopeImpl4 = pressGestureScopeImpl15;
                            function12 = function9;
                            ps4Var4 = ps4Var3;
                            function11 = function8;
                            function10 = function7;
                            cc0Var4 = cc0Var3;
                            if (finalUpChange == null) {
                                sVarM = m(ta2Var3, sVar, null, new TapGestureDetectorKt$processTapGesture$4(pressGestureScopeImpl4, null), 2, null);
                            } else {
                                finalUpChange.a();
                                sVarM = m(ta2Var3, sVar, null, new TapGestureDetectorKt$processTapGesture$5(pressGestureScopeImpl4, null), 2, null);
                            }
                            if (finalUpChange != null) {
                                if (function10 == null) {
                                    tapGestureDetectorKt$processTapGesture$2.L$0 = cc0Var4;
                                    tapGestureDetectorKt$processTapGesture$2.L$1 = ta2Var3;
                                    tapGestureDetectorKt$processTapGesture$2.L$2 = pressGestureScopeImpl4;
                                    tapGestureDetectorKt$processTapGesture$2.L$3 = function10;
                                    tapGestureDetectorKt$processTapGesture$2.L$4 = function11;
                                    tapGestureDetectorKt$processTapGesture$2.L$5 = ps4Var4;
                                    tapGestureDetectorKt$processTapGesture$2.L$6 = function12;
                                    tapGestureDetectorKt$processTapGesture$2.L$7 = finalUpChange;
                                    tapGestureDetectorKt$processTapGesture$2.L$8 = sVarM;
                                    tapGestureDetectorKt$processTapGesture$2.label = 5;
                                    objE = e(cc0Var4, finalUpChange, tapGestureDetectorKt$processTapGesture$2);
                                    if (objE != objG) {
                                        Function1<? super rn8, Unit> function112 = function12;
                                        pointerInputChange2 = finalUpChange;
                                        objP2 = objE;
                                        cc0Var5 = cc0Var4;
                                        ta2Var4 = ta2Var3;
                                        function13 = function10;
                                        function14 = function112;
                                        PressGestureScopeImpl pressGestureScopeImpl16 = pressGestureScopeImpl4;
                                        function15 = function11;
                                        pressGestureScopeImpl5 = pressGestureScopeImpl16;
                                        pointerInputChange3 = (PointerInputChange) objP2;
                                        if (pointerInputChange3 != null) {
                                            sVarD2 = rw0.d(ta2Var4, (CoroutineContext) null, CoroutineStart.d, new TapGestureDetectorKt$processTapGesture$6(sVarM, pressGestureScopeImpl5, null), 1, (Object) null);
                                            if (ps4Var4 != a) {
                                                m(ta2Var4, sVarD2, null, new TapGestureDetectorKt$processTapGesture$7(ps4Var4, pressGestureScopeImpl5, pointerInputChange3, null), 2, null);
                                            }
                                            if (function15 == null) {
                                                tapGestureDetectorKt$processTapGesture$2.L$0 = ta2Var4;
                                                tapGestureDetectorKt$processTapGesture$2.L$1 = pressGestureScopeImpl5;
                                                tapGestureDetectorKt$processTapGesture$2.L$2 = function13;
                                                tapGestureDetectorKt$processTapGesture$2.L$3 = function14;
                                                tapGestureDetectorKt$processTapGesture$2.L$4 = sVarD2;
                                                tapGestureDetectorKt$processTapGesture$2.L$5 = pointerInputChange2;
                                                tapGestureDetectorKt$processTapGesture$2.L$6 = null;
                                                tapGestureDetectorKt$processTapGesture$2.L$7 = null;
                                                tapGestureDetectorKt$processTapGesture$2.L$8 = null;
                                                tapGestureDetectorKt$processTapGesture$2.label = 6;
                                                objP2 = r(cc0Var5, null, tapGestureDetectorKt$processTapGesture$2, 1, null);
                                                if (objP2 != objG) {
                                                    pointerInputChange5 = pointerInputChange2;
                                                    function16 = function14;
                                                    function18 = function13;
                                                    ta2Var7 = ta2Var4;
                                                    finalUpChange2 = (PointerInputChange) objP2;
                                                    if (finalUpChange2 != null) {
                                                        finalUpChange2.a();
                                                        m(ta2Var7, sVarD2, null, new TapGestureDetectorKt$processTapGesture$8(pressGestureScopeImpl5, null), 2, null);
                                                        function18.invoke(rn8.d(finalUpChange2.getPosition()));
                                                    } else {
                                                        m(ta2Var7, sVarD2, null, new TapGestureDetectorKt$processTapGesture$9(pressGestureScopeImpl5, null), 2, null);
                                                        if (function16 != null) {
                                                            function16.invoke(rn8.d(pointerInputChange5.getPosition()));
                                                        }
                                                    }
                                                }
                                            } else {
                                                tapGestureDetectorKt$processTapGesture$2.L$0 = cc0Var5;
                                                tapGestureDetectorKt$processTapGesture$2.L$1 = ta2Var4;
                                                tapGestureDetectorKt$processTapGesture$2.L$2 = pressGestureScopeImpl5;
                                                tapGestureDetectorKt$processTapGesture$2.L$3 = function13;
                                                tapGestureDetectorKt$processTapGesture$2.L$4 = function15;
                                                tapGestureDetectorKt$processTapGesture$2.L$5 = function14;
                                                tapGestureDetectorKt$processTapGesture$2.L$6 = sVarD2;
                                                tapGestureDetectorKt$processTapGesture$2.L$7 = pointerInputChange2;
                                                tapGestureDetectorKt$processTapGesture$2.L$8 = pointerInputChange3;
                                                tapGestureDetectorKt$processTapGesture$2.label = 7;
                                                objP = p(cc0Var5, null, tapGestureDetectorKt$processTapGesture$2, 1, null);
                                                if (objP != objG) {
                                                    PointerInputChange pointerInputChange9 = pointerInputChange2;
                                                    pointerInputChange4 = pointerInputChange3;
                                                    objP2 = objP;
                                                    pointerInputChange5 = pointerInputChange9;
                                                    Function1<? super rn8, Unit> function27 = function15;
                                                    pressGestureScopeImpl7 = pressGestureScopeImpl5;
                                                    function16 = function14;
                                                    function17 = function27;
                                                    function18 = function13;
                                                    ta2Var6 = ta2Var4;
                                                    cc0Var6 = cc0Var5;
                                                    nVar2 = (n) objP2;
                                                    if (!Intrinsics.e(nVar2, n.c.a)) {
                                                        function17.invoke(rn8.d(pointerInputChange4.getPosition()));
                                                        tapGestureDetectorKt$processTapGesture$2.L$0 = ta2Var6;
                                                        tapGestureDetectorKt$processTapGesture$2.L$1 = pressGestureScopeImpl7;
                                                        tapGestureDetectorKt$processTapGesture$2.L$2 = sVarD2;
                                                        tapGestureDetectorKt$processTapGesture$2.L$3 = null;
                                                        tapGestureDetectorKt$processTapGesture$2.L$4 = null;
                                                        tapGestureDetectorKt$processTapGesture$2.L$5 = null;
                                                        tapGestureDetectorKt$processTapGesture$2.L$6 = null;
                                                        tapGestureDetectorKt$processTapGesture$2.L$7 = null;
                                                        tapGestureDetectorKt$processTapGesture$2.L$8 = null;
                                                        tapGestureDetectorKt$processTapGesture$2.label = 8;
                                                        if (f(cc0Var6, tapGestureDetectorKt$processTapGesture$2) != objG) {
                                                            sVar3 = sVarD2;
                                                            pressGestureScopeImpl8 = pressGestureScopeImpl7;
                                                            ta2Var8 = ta2Var6;
                                                            m(ta2Var8, sVar3, null, new TapGestureDetectorKt$processTapGesture$secondUp$1(pressGestureScopeImpl8, null), 2, null);
                                                            return Unit.a;
                                                        }
                                                    } else {
                                                        if (nVar2 instanceof n.b) {
                                                            finalUpChange2 = ((n.b) nVar2).getFinalUpChange();
                                                        } else {
                                                            if (nVar2 instanceof n.a) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            finalUpChange2 = null;
                                                        }
                                                        pressGestureScopeImpl5 = pressGestureScopeImpl7;
                                                        ta2Var7 = ta2Var6;
                                                        if (finalUpChange2 != null) {
                                                            finalUpChange2.a();
                                                            m(ta2Var7, sVarD2, null, new TapGestureDetectorKt$processTapGesture$8(pressGestureScopeImpl5, null), 2, null);
                                                            function18.invoke(rn8.d(finalUpChange2.getPosition()));
                                                        } else {
                                                            m(ta2Var7, sVarD2, null, new TapGestureDetectorKt$processTapGesture$9(pressGestureScopeImpl5, null), 2, null);
                                                            if (function16 != null) {
                                                                function16.invoke(rn8.d(pointerInputChange5.getPosition()));
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (function14 != null) {
                                            function14.invoke(rn8.d(pointerInputChange2.getPosition()));
                                        }
                                    }
                                } else if (function12 != null) {
                                    function12.invoke(rn8.d(finalUpChange.getPosition()));
                                }
                            }
                            return Unit.a;
                        }
                        function8.invoke(rn8.d(pointerInputChange.getPosition()));
                        tapGestureDetectorKt$processTapGesture$2.L$0 = ta2Var2;
                        tapGestureDetectorKt$processTapGesture$2.L$1 = pressGestureScopeImpl3;
                        tapGestureDetectorKt$processTapGesture$2.L$2 = sVar;
                        tapGestureDetectorKt$processTapGesture$2.L$3 = null;
                        tapGestureDetectorKt$processTapGesture$2.L$4 = null;
                        tapGestureDetectorKt$processTapGesture$2.L$5 = null;
                        tapGestureDetectorKt$processTapGesture$2.L$6 = null;
                        tapGestureDetectorKt$processTapGesture$2.L$7 = null;
                        tapGestureDetectorKt$processTapGesture$2.L$8 = null;
                        tapGestureDetectorKt$processTapGesture$2.label = 4;
                        if (f(cc0Var3, tapGestureDetectorKt$processTapGesture$2) != objG) {
                            sVar2 = sVar;
                            ta2Var5 = ta2Var2;
                            pressGestureScopeImpl6 = pressGestureScopeImpl3;
                            m(ta2Var5, sVar2, null, new TapGestureDetectorKt$processTapGesture$3(pressGestureScopeImpl6, null), 2, null);
                            return Unit.a;
                        }
                    }
                }
                return objG;
            case 2:
                sVar = (s) tapGestureDetectorKt$processTapGesture$2.L$7;
                function12 = (Function1) tapGestureDetectorKt$processTapGesture$2.L$6;
                ps4Var4 = (ps4) tapGestureDetectorKt$processTapGesture$2.L$5;
                function11 = (Function1) tapGestureDetectorKt$processTapGesture$2.L$4;
                function10 = (Function1) tapGestureDetectorKt$processTapGesture$2.L$3;
                pressGestureScopeImpl4 = (PressGestureScopeImpl) tapGestureDetectorKt$processTapGesture$2.L$2;
                ta2Var3 = (ta2) tapGestureDetectorKt$processTapGesture$2.L$1;
                cc0Var4 = (cc0) tapGestureDetectorKt$processTapGesture$2.L$0;
                kotlin.f.b(objP2);
                finalUpChange = (PointerInputChange) objP2;
                if (finalUpChange == null) {
                    sVarM = m(ta2Var3, sVar, null, new TapGestureDetectorKt$processTapGesture$4(pressGestureScopeImpl4, null), 2, null);
                } else {
                    finalUpChange.a();
                    sVarM = m(ta2Var3, sVar, null, new TapGestureDetectorKt$processTapGesture$5(pressGestureScopeImpl4, null), 2, null);
                }
                if (finalUpChange != null) {
                    if (function10 == null) {
                        tapGestureDetectorKt$processTapGesture$2.L$0 = cc0Var4;
                        tapGestureDetectorKt$processTapGesture$2.L$1 = ta2Var3;
                        tapGestureDetectorKt$processTapGesture$2.L$2 = pressGestureScopeImpl4;
                        tapGestureDetectorKt$processTapGesture$2.L$3 = function10;
                        tapGestureDetectorKt$processTapGesture$2.L$4 = function11;
                        tapGestureDetectorKt$processTapGesture$2.L$5 = ps4Var4;
                        tapGestureDetectorKt$processTapGesture$2.L$6 = function12;
                        tapGestureDetectorKt$processTapGesture$2.L$7 = finalUpChange;
                        tapGestureDetectorKt$processTapGesture$2.L$8 = sVarM;
                        tapGestureDetectorKt$processTapGesture$2.label = 5;
                        objE = e(cc0Var4, finalUpChange, tapGestureDetectorKt$processTapGesture$2);
                        if (objE != objG) {
                            Function1<? super rn8, Unit> function113 = function12;
                            pointerInputChange2 = finalUpChange;
                            objP2 = objE;
                            cc0Var5 = cc0Var4;
                            ta2Var4 = ta2Var3;
                            function13 = function10;
                            function14 = function113;
                            PressGestureScopeImpl pressGestureScopeImpl17 = pressGestureScopeImpl4;
                            function15 = function11;
                            pressGestureScopeImpl5 = pressGestureScopeImpl17;
                            pointerInputChange3 = (PointerInputChange) objP2;
                            if (pointerInputChange3 != null) {
                                sVarD2 = rw0.d(ta2Var4, (CoroutineContext) null, CoroutineStart.d, new TapGestureDetectorKt$processTapGesture$6(sVarM, pressGestureScopeImpl5, null), 1, (Object) null);
                                if (ps4Var4 != a) {
                                    m(ta2Var4, sVarD2, null, new TapGestureDetectorKt$processTapGesture$7(ps4Var4, pressGestureScopeImpl5, pointerInputChange3, null), 2, null);
                                }
                                if (function15 == null) {
                                    tapGestureDetectorKt$processTapGesture$2.L$0 = ta2Var4;
                                    tapGestureDetectorKt$processTapGesture$2.L$1 = pressGestureScopeImpl5;
                                    tapGestureDetectorKt$processTapGesture$2.L$2 = function13;
                                    tapGestureDetectorKt$processTapGesture$2.L$3 = function14;
                                    tapGestureDetectorKt$processTapGesture$2.L$4 = sVarD2;
                                    tapGestureDetectorKt$processTapGesture$2.L$5 = pointerInputChange2;
                                    tapGestureDetectorKt$processTapGesture$2.L$6 = null;
                                    tapGestureDetectorKt$processTapGesture$2.L$7 = null;
                                    tapGestureDetectorKt$processTapGesture$2.L$8 = null;
                                    tapGestureDetectorKt$processTapGesture$2.label = 6;
                                    objP2 = r(cc0Var5, null, tapGestureDetectorKt$processTapGesture$2, 1, null);
                                    if (objP2 != objG) {
                                        pointerInputChange5 = pointerInputChange2;
                                        function16 = function14;
                                        function18 = function13;
                                        ta2Var7 = ta2Var4;
                                        finalUpChange2 = (PointerInputChange) objP2;
                                        if (finalUpChange2 != null) {
                                            finalUpChange2.a();
                                            m(ta2Var7, sVarD2, null, new TapGestureDetectorKt$processTapGesture$8(pressGestureScopeImpl5, null), 2, null);
                                            function18.invoke(rn8.d(finalUpChange2.getPosition()));
                                        } else {
                                            m(ta2Var7, sVarD2, null, new TapGestureDetectorKt$processTapGesture$9(pressGestureScopeImpl5, null), 2, null);
                                            if (function16 != null) {
                                                function16.invoke(rn8.d(pointerInputChange5.getPosition()));
                                            }
                                        }
                                    }
                                } else {
                                    tapGestureDetectorKt$processTapGesture$2.L$0 = cc0Var5;
                                    tapGestureDetectorKt$processTapGesture$2.L$1 = ta2Var4;
                                    tapGestureDetectorKt$processTapGesture$2.L$2 = pressGestureScopeImpl5;
                                    tapGestureDetectorKt$processTapGesture$2.L$3 = function13;
                                    tapGestureDetectorKt$processTapGesture$2.L$4 = function15;
                                    tapGestureDetectorKt$processTapGesture$2.L$5 = function14;
                                    tapGestureDetectorKt$processTapGesture$2.L$6 = sVarD2;
                                    tapGestureDetectorKt$processTapGesture$2.L$7 = pointerInputChange2;
                                    tapGestureDetectorKt$processTapGesture$2.L$8 = pointerInputChange3;
                                    tapGestureDetectorKt$processTapGesture$2.label = 7;
                                    objP = p(cc0Var5, null, tapGestureDetectorKt$processTapGesture$2, 1, null);
                                    if (objP != objG) {
                                        PointerInputChange pointerInputChange10 = pointerInputChange2;
                                        pointerInputChange4 = pointerInputChange3;
                                        objP2 = objP;
                                        pointerInputChange5 = pointerInputChange10;
                                        Function1<? super rn8, Unit> function28 = function15;
                                        pressGestureScopeImpl7 = pressGestureScopeImpl5;
                                        function16 = function14;
                                        function17 = function28;
                                        function18 = function13;
                                        ta2Var6 = ta2Var4;
                                        cc0Var6 = cc0Var5;
                                        nVar2 = (n) objP2;
                                        if (!Intrinsics.e(nVar2, n.c.a)) {
                                            function17.invoke(rn8.d(pointerInputChange4.getPosition()));
                                            tapGestureDetectorKt$processTapGesture$2.L$0 = ta2Var6;
                                            tapGestureDetectorKt$processTapGesture$2.L$1 = pressGestureScopeImpl7;
                                            tapGestureDetectorKt$processTapGesture$2.L$2 = sVarD2;
                                            tapGestureDetectorKt$processTapGesture$2.L$3 = null;
                                            tapGestureDetectorKt$processTapGesture$2.L$4 = null;
                                            tapGestureDetectorKt$processTapGesture$2.L$5 = null;
                                            tapGestureDetectorKt$processTapGesture$2.L$6 = null;
                                            tapGestureDetectorKt$processTapGesture$2.L$7 = null;
                                            tapGestureDetectorKt$processTapGesture$2.L$8 = null;
                                            tapGestureDetectorKt$processTapGesture$2.label = 8;
                                            if (f(cc0Var6, tapGestureDetectorKt$processTapGesture$2) != objG) {
                                                sVar3 = sVarD2;
                                                pressGestureScopeImpl8 = pressGestureScopeImpl7;
                                                ta2Var8 = ta2Var6;
                                                m(ta2Var8, sVar3, null, new TapGestureDetectorKt$processTapGesture$secondUp$1(pressGestureScopeImpl8, null), 2, null);
                                                return Unit.a;
                                            }
                                        } else {
                                            if (nVar2 instanceof n.b) {
                                                finalUpChange2 = ((n.b) nVar2).getFinalUpChange();
                                            } else {
                                                if (nVar2 instanceof n.a) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                finalUpChange2 = null;
                                            }
                                            pressGestureScopeImpl5 = pressGestureScopeImpl7;
                                            ta2Var7 = ta2Var6;
                                            if (finalUpChange2 != null) {
                                                finalUpChange2.a();
                                                m(ta2Var7, sVarD2, null, new TapGestureDetectorKt$processTapGesture$8(pressGestureScopeImpl5, null), 2, null);
                                                function18.invoke(rn8.d(finalUpChange2.getPosition()));
                                            } else {
                                                m(ta2Var7, sVarD2, null, new TapGestureDetectorKt$processTapGesture$9(pressGestureScopeImpl5, null), 2, null);
                                                if (function16 != null) {
                                                    function16.invoke(rn8.d(pointerInputChange5.getPosition()));
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (function14 != null) {
                                function14.invoke(rn8.d(pointerInputChange2.getPosition()));
                            }
                        }
                        return objG;
                    }
                    if (function12 != null) {
                        function12.invoke(rn8.d(finalUpChange.getPosition()));
                    }
                }
                return Unit.a;
            case 3:
                sVar = (s) tapGestureDetectorKt$processTapGesture$2.L$8;
                pointerInputChange = (PointerInputChange) tapGestureDetectorKt$processTapGesture$2.L$7;
                function9 = (Function1) tapGestureDetectorKt$processTapGesture$2.L$6;
                ps4Var3 = (ps4) tapGestureDetectorKt$processTapGesture$2.L$5;
                function8 = (Function1) tapGestureDetectorKt$processTapGesture$2.L$4;
                Function1<? super rn8, Unit> function29 = (Function1) tapGestureDetectorKt$processTapGesture$2.L$3;
                pressGestureScopeImpl3 = (PressGestureScopeImpl) tapGestureDetectorKt$processTapGesture$2.L$2;
                ta2 ta2Var9 = (ta2) tapGestureDetectorKt$processTapGesture$2.L$1;
                cc0Var3 = (cc0) tapGestureDetectorKt$processTapGesture$2.L$0;
                kotlin.f.b(objP2);
                function7 = function29;
                ta2Var2 = ta2Var9;
                nVar = (n) objP2;
                if (!Intrinsics.e(nVar, n.c.a)) {
                    if (nVar instanceof n.b) {
                        finalUpChange = ((n.b) nVar).getFinalUpChange();
                    } else {
                        if (!(nVar instanceof n.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        finalUpChange = null;
                    }
                    PressGestureScopeImpl pressGestureScopeImpl18 = pressGestureScopeImpl3;
                    ta2Var3 = ta2Var2;
                    pressGestureScopeImpl4 = pressGestureScopeImpl18;
                    function12 = function9;
                    ps4Var4 = ps4Var3;
                    function11 = function8;
                    function10 = function7;
                    cc0Var4 = cc0Var3;
                    if (finalUpChange == null) {
                        sVarM = m(ta2Var3, sVar, null, new TapGestureDetectorKt$processTapGesture$4(pressGestureScopeImpl4, null), 2, null);
                    } else {
                        finalUpChange.a();
                        sVarM = m(ta2Var3, sVar, null, new TapGestureDetectorKt$processTapGesture$5(pressGestureScopeImpl4, null), 2, null);
                    }
                    if (finalUpChange != null) {
                        if (function10 == null) {
                            tapGestureDetectorKt$processTapGesture$2.L$0 = cc0Var4;
                            tapGestureDetectorKt$processTapGesture$2.L$1 = ta2Var3;
                            tapGestureDetectorKt$processTapGesture$2.L$2 = pressGestureScopeImpl4;
                            tapGestureDetectorKt$processTapGesture$2.L$3 = function10;
                            tapGestureDetectorKt$processTapGesture$2.L$4 = function11;
                            tapGestureDetectorKt$processTapGesture$2.L$5 = ps4Var4;
                            tapGestureDetectorKt$processTapGesture$2.L$6 = function12;
                            tapGestureDetectorKt$processTapGesture$2.L$7 = finalUpChange;
                            tapGestureDetectorKt$processTapGesture$2.L$8 = sVarM;
                            tapGestureDetectorKt$processTapGesture$2.label = 5;
                            objE = e(cc0Var4, finalUpChange, tapGestureDetectorKt$processTapGesture$2);
                            if (objE != objG) {
                                Function1<? super rn8, Unit> function114 = function12;
                                pointerInputChange2 = finalUpChange;
                                objP2 = objE;
                                cc0Var5 = cc0Var4;
                                ta2Var4 = ta2Var3;
                                function13 = function10;
                                function14 = function114;
                                PressGestureScopeImpl pressGestureScopeImpl19 = pressGestureScopeImpl4;
                                function15 = function11;
                                pressGestureScopeImpl5 = pressGestureScopeImpl19;
                                pointerInputChange3 = (PointerInputChange) objP2;
                                if (pointerInputChange3 != null) {
                                    sVarD2 = rw0.d(ta2Var4, (CoroutineContext) null, CoroutineStart.d, new TapGestureDetectorKt$processTapGesture$6(sVarM, pressGestureScopeImpl5, null), 1, (Object) null);
                                    if (ps4Var4 != a) {
                                        m(ta2Var4, sVarD2, null, new TapGestureDetectorKt$processTapGesture$7(ps4Var4, pressGestureScopeImpl5, pointerInputChange3, null), 2, null);
                                    }
                                    if (function15 == null) {
                                        tapGestureDetectorKt$processTapGesture$2.L$0 = ta2Var4;
                                        tapGestureDetectorKt$processTapGesture$2.L$1 = pressGestureScopeImpl5;
                                        tapGestureDetectorKt$processTapGesture$2.L$2 = function13;
                                        tapGestureDetectorKt$processTapGesture$2.L$3 = function14;
                                        tapGestureDetectorKt$processTapGesture$2.L$4 = sVarD2;
                                        tapGestureDetectorKt$processTapGesture$2.L$5 = pointerInputChange2;
                                        tapGestureDetectorKt$processTapGesture$2.L$6 = null;
                                        tapGestureDetectorKt$processTapGesture$2.L$7 = null;
                                        tapGestureDetectorKt$processTapGesture$2.L$8 = null;
                                        tapGestureDetectorKt$processTapGesture$2.label = 6;
                                        objP2 = r(cc0Var5, null, tapGestureDetectorKt$processTapGesture$2, 1, null);
                                        if (objP2 != objG) {
                                            pointerInputChange5 = pointerInputChange2;
                                            function16 = function14;
                                            function18 = function13;
                                            ta2Var7 = ta2Var4;
                                            finalUpChange2 = (PointerInputChange) objP2;
                                            if (finalUpChange2 != null) {
                                                finalUpChange2.a();
                                                m(ta2Var7, sVarD2, null, new TapGestureDetectorKt$processTapGesture$8(pressGestureScopeImpl5, null), 2, null);
                                                function18.invoke(rn8.d(finalUpChange2.getPosition()));
                                            } else {
                                                m(ta2Var7, sVarD2, null, new TapGestureDetectorKt$processTapGesture$9(pressGestureScopeImpl5, null), 2, null);
                                                if (function16 != null) {
                                                    function16.invoke(rn8.d(pointerInputChange5.getPosition()));
                                                }
                                            }
                                        }
                                    } else {
                                        tapGestureDetectorKt$processTapGesture$2.L$0 = cc0Var5;
                                        tapGestureDetectorKt$processTapGesture$2.L$1 = ta2Var4;
                                        tapGestureDetectorKt$processTapGesture$2.L$2 = pressGestureScopeImpl5;
                                        tapGestureDetectorKt$processTapGesture$2.L$3 = function13;
                                        tapGestureDetectorKt$processTapGesture$2.L$4 = function15;
                                        tapGestureDetectorKt$processTapGesture$2.L$5 = function14;
                                        tapGestureDetectorKt$processTapGesture$2.L$6 = sVarD2;
                                        tapGestureDetectorKt$processTapGesture$2.L$7 = pointerInputChange2;
                                        tapGestureDetectorKt$processTapGesture$2.L$8 = pointerInputChange3;
                                        tapGestureDetectorKt$processTapGesture$2.label = 7;
                                        objP = p(cc0Var5, null, tapGestureDetectorKt$processTapGesture$2, 1, null);
                                        if (objP != objG) {
                                            PointerInputChange pointerInputChange11 = pointerInputChange2;
                                            pointerInputChange4 = pointerInputChange3;
                                            objP2 = objP;
                                            pointerInputChange5 = pointerInputChange11;
                                            Function1<? super rn8, Unit> function210 = function15;
                                            pressGestureScopeImpl7 = pressGestureScopeImpl5;
                                            function16 = function14;
                                            function17 = function210;
                                            function18 = function13;
                                            ta2Var6 = ta2Var4;
                                            cc0Var6 = cc0Var5;
                                            nVar2 = (n) objP2;
                                            if (!Intrinsics.e(nVar2, n.c.a)) {
                                                function17.invoke(rn8.d(pointerInputChange4.getPosition()));
                                                tapGestureDetectorKt$processTapGesture$2.L$0 = ta2Var6;
                                                tapGestureDetectorKt$processTapGesture$2.L$1 = pressGestureScopeImpl7;
                                                tapGestureDetectorKt$processTapGesture$2.L$2 = sVarD2;
                                                tapGestureDetectorKt$processTapGesture$2.L$3 = null;
                                                tapGestureDetectorKt$processTapGesture$2.L$4 = null;
                                                tapGestureDetectorKt$processTapGesture$2.L$5 = null;
                                                tapGestureDetectorKt$processTapGesture$2.L$6 = null;
                                                tapGestureDetectorKt$processTapGesture$2.L$7 = null;
                                                tapGestureDetectorKt$processTapGesture$2.L$8 = null;
                                                tapGestureDetectorKt$processTapGesture$2.label = 8;
                                                if (f(cc0Var6, tapGestureDetectorKt$processTapGesture$2) != objG) {
                                                    sVar3 = sVarD2;
                                                    pressGestureScopeImpl8 = pressGestureScopeImpl7;
                                                    ta2Var8 = ta2Var6;
                                                    m(ta2Var8, sVar3, null, new TapGestureDetectorKt$processTapGesture$secondUp$1(pressGestureScopeImpl8, null), 2, null);
                                                    return Unit.a;
                                                }
                                            } else {
                                                if (nVar2 instanceof n.b) {
                                                    finalUpChange2 = ((n.b) nVar2).getFinalUpChange();
                                                } else {
                                                    if (nVar2 instanceof n.a) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    finalUpChange2 = null;
                                                }
                                                pressGestureScopeImpl5 = pressGestureScopeImpl7;
                                                ta2Var7 = ta2Var6;
                                                if (finalUpChange2 != null) {
                                                    finalUpChange2.a();
                                                    m(ta2Var7, sVarD2, null, new TapGestureDetectorKt$processTapGesture$8(pressGestureScopeImpl5, null), 2, null);
                                                    function18.invoke(rn8.d(finalUpChange2.getPosition()));
                                                } else {
                                                    m(ta2Var7, sVarD2, null, new TapGestureDetectorKt$processTapGesture$9(pressGestureScopeImpl5, null), 2, null);
                                                    if (function16 != null) {
                                                        function16.invoke(rn8.d(pointerInputChange5.getPosition()));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else if (function14 != null) {
                                    function14.invoke(rn8.d(pointerInputChange2.getPosition()));
                                }
                            }
                        } else if (function12 != null) {
                            function12.invoke(rn8.d(finalUpChange.getPosition()));
                        }
                    }
                    return Unit.a;
                }
                function8.invoke(rn8.d(pointerInputChange.getPosition()));
                tapGestureDetectorKt$processTapGesture$2.L$0 = ta2Var2;
                tapGestureDetectorKt$processTapGesture$2.L$1 = pressGestureScopeImpl3;
                tapGestureDetectorKt$processTapGesture$2.L$2 = sVar;
                tapGestureDetectorKt$processTapGesture$2.L$3 = null;
                tapGestureDetectorKt$processTapGesture$2.L$4 = null;
                tapGestureDetectorKt$processTapGesture$2.L$5 = null;
                tapGestureDetectorKt$processTapGesture$2.L$6 = null;
                tapGestureDetectorKt$processTapGesture$2.L$7 = null;
                tapGestureDetectorKt$processTapGesture$2.L$8 = null;
                tapGestureDetectorKt$processTapGesture$2.label = 4;
                if (f(cc0Var3, tapGestureDetectorKt$processTapGesture$2) != objG) {
                    sVar2 = sVar;
                    ta2Var5 = ta2Var2;
                    pressGestureScopeImpl6 = pressGestureScopeImpl3;
                    m(ta2Var5, sVar2, null, new TapGestureDetectorKt$processTapGesture$3(pressGestureScopeImpl6, null), 2, null);
                    return Unit.a;
                }
                return objG;
            case 4:
                sVar2 = (s) tapGestureDetectorKt$processTapGesture$2.L$2;
                pressGestureScopeImpl6 = (PressGestureScopeImpl) tapGestureDetectorKt$processTapGesture$2.L$1;
                ta2Var5 = (ta2) tapGestureDetectorKt$processTapGesture$2.L$0;
                kotlin.f.b(objP2);
                m(ta2Var5, sVar2, null, new TapGestureDetectorKt$processTapGesture$3(pressGestureScopeImpl6, null), 2, null);
                return Unit.a;
            case 5:
                sVarM = (s) tapGestureDetectorKt$processTapGesture$2.L$8;
                pointerInputChange2 = (PointerInputChange) tapGestureDetectorKt$processTapGesture$2.L$7;
                Function1<? super rn8, Unit> function30 = (Function1) tapGestureDetectorKt$processTapGesture$2.L$6;
                ps4<? super ml9, ? super rn8, ? super q22<? super Unit>, ? extends Object> ps4Var6 = (ps4) tapGestureDetectorKt$processTapGesture$2.L$5;
                Function1<? super rn8, Unit> function31 = (Function1) tapGestureDetectorKt$processTapGesture$2.L$4;
                Function1<? super rn8, Unit> function32 = (Function1) tapGestureDetectorKt$processTapGesture$2.L$3;
                PressGestureScopeImpl pressGestureScopeImpl20 = (PressGestureScopeImpl) tapGestureDetectorKt$processTapGesture$2.L$2;
                ta2Var4 = (ta2) tapGestureDetectorKt$processTapGesture$2.L$1;
                cc0Var5 = (cc0) tapGestureDetectorKt$processTapGesture$2.L$0;
                kotlin.f.b(objP2);
                function14 = function30;
                ps4Var4 = ps4Var6;
                pressGestureScopeImpl5 = pressGestureScopeImpl20;
                function13 = function32;
                function15 = function31;
                pointerInputChange3 = (PointerInputChange) objP2;
                if (pointerInputChange3 != null) {
                    sVarD2 = rw0.d(ta2Var4, (CoroutineContext) null, CoroutineStart.d, new TapGestureDetectorKt$processTapGesture$6(sVarM, pressGestureScopeImpl5, null), 1, (Object) null);
                    if (ps4Var4 != a) {
                        m(ta2Var4, sVarD2, null, new TapGestureDetectorKt$processTapGesture$7(ps4Var4, pressGestureScopeImpl5, pointerInputChange3, null), 2, null);
                    }
                    if (function15 == null) {
                        tapGestureDetectorKt$processTapGesture$2.L$0 = ta2Var4;
                        tapGestureDetectorKt$processTapGesture$2.L$1 = pressGestureScopeImpl5;
                        tapGestureDetectorKt$processTapGesture$2.L$2 = function13;
                        tapGestureDetectorKt$processTapGesture$2.L$3 = function14;
                        tapGestureDetectorKt$processTapGesture$2.L$4 = sVarD2;
                        tapGestureDetectorKt$processTapGesture$2.L$5 = pointerInputChange2;
                        tapGestureDetectorKt$processTapGesture$2.L$6 = null;
                        tapGestureDetectorKt$processTapGesture$2.L$7 = null;
                        tapGestureDetectorKt$processTapGesture$2.L$8 = null;
                        tapGestureDetectorKt$processTapGesture$2.label = 6;
                        objP2 = r(cc0Var5, null, tapGestureDetectorKt$processTapGesture$2, 1, null);
                        if (objP2 != objG) {
                            pointerInputChange5 = pointerInputChange2;
                            function16 = function14;
                            function18 = function13;
                            ta2Var7 = ta2Var4;
                            finalUpChange2 = (PointerInputChange) objP2;
                            if (finalUpChange2 != null) {
                                finalUpChange2.a();
                                m(ta2Var7, sVarD2, null, new TapGestureDetectorKt$processTapGesture$8(pressGestureScopeImpl5, null), 2, null);
                                function18.invoke(rn8.d(finalUpChange2.getPosition()));
                            } else {
                                m(ta2Var7, sVarD2, null, new TapGestureDetectorKt$processTapGesture$9(pressGestureScopeImpl5, null), 2, null);
                                if (function16 != null) {
                                    function16.invoke(rn8.d(pointerInputChange5.getPosition()));
                                }
                            }
                        }
                    } else {
                        tapGestureDetectorKt$processTapGesture$2.L$0 = cc0Var5;
                        tapGestureDetectorKt$processTapGesture$2.L$1 = ta2Var4;
                        tapGestureDetectorKt$processTapGesture$2.L$2 = pressGestureScopeImpl5;
                        tapGestureDetectorKt$processTapGesture$2.L$3 = function13;
                        tapGestureDetectorKt$processTapGesture$2.L$4 = function15;
                        tapGestureDetectorKt$processTapGesture$2.L$5 = function14;
                        tapGestureDetectorKt$processTapGesture$2.L$6 = sVarD2;
                        tapGestureDetectorKt$processTapGesture$2.L$7 = pointerInputChange2;
                        tapGestureDetectorKt$processTapGesture$2.L$8 = pointerInputChange3;
                        tapGestureDetectorKt$processTapGesture$2.label = 7;
                        objP = p(cc0Var5, null, tapGestureDetectorKt$processTapGesture$2, 1, null);
                        if (objP != objG) {
                            PointerInputChange pointerInputChange12 = pointerInputChange2;
                            pointerInputChange4 = pointerInputChange3;
                            objP2 = objP;
                            pointerInputChange5 = pointerInputChange12;
                            Function1<? super rn8, Unit> function211 = function15;
                            pressGestureScopeImpl7 = pressGestureScopeImpl5;
                            function16 = function14;
                            function17 = function211;
                            function18 = function13;
                            ta2Var6 = ta2Var4;
                            cc0Var6 = cc0Var5;
                            nVar2 = (n) objP2;
                            if (!Intrinsics.e(nVar2, n.c.a)) {
                                function17.invoke(rn8.d(pointerInputChange4.getPosition()));
                                tapGestureDetectorKt$processTapGesture$2.L$0 = ta2Var6;
                                tapGestureDetectorKt$processTapGesture$2.L$1 = pressGestureScopeImpl7;
                                tapGestureDetectorKt$processTapGesture$2.L$2 = sVarD2;
                                tapGestureDetectorKt$processTapGesture$2.L$3 = null;
                                tapGestureDetectorKt$processTapGesture$2.L$4 = null;
                                tapGestureDetectorKt$processTapGesture$2.L$5 = null;
                                tapGestureDetectorKt$processTapGesture$2.L$6 = null;
                                tapGestureDetectorKt$processTapGesture$2.L$7 = null;
                                tapGestureDetectorKt$processTapGesture$2.L$8 = null;
                                tapGestureDetectorKt$processTapGesture$2.label = 8;
                                if (f(cc0Var6, tapGestureDetectorKt$processTapGesture$2) != objG) {
                                    sVar3 = sVarD2;
                                    pressGestureScopeImpl8 = pressGestureScopeImpl7;
                                    ta2Var8 = ta2Var6;
                                    m(ta2Var8, sVar3, null, new TapGestureDetectorKt$processTapGesture$secondUp$1(pressGestureScopeImpl8, null), 2, null);
                                    return Unit.a;
                                }
                            } else {
                                if (nVar2 instanceof n.b) {
                                    finalUpChange2 = ((n.b) nVar2).getFinalUpChange();
                                } else {
                                    if (nVar2 instanceof n.a) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    finalUpChange2 = null;
                                }
                                pressGestureScopeImpl5 = pressGestureScopeImpl7;
                                ta2Var7 = ta2Var6;
                                if (finalUpChange2 != null) {
                                    finalUpChange2.a();
                                    m(ta2Var7, sVarD2, null, new TapGestureDetectorKt$processTapGesture$8(pressGestureScopeImpl5, null), 2, null);
                                    function18.invoke(rn8.d(finalUpChange2.getPosition()));
                                } else {
                                    m(ta2Var7, sVarD2, null, new TapGestureDetectorKt$processTapGesture$9(pressGestureScopeImpl5, null), 2, null);
                                    if (function16 != null) {
                                        function16.invoke(rn8.d(pointerInputChange5.getPosition()));
                                    }
                                }
                            }
                        }
                    }
                    return objG;
                }
                if (function14 != null) {
                    function14.invoke(rn8.d(pointerInputChange2.getPosition()));
                }
                return Unit.a;
            case 6:
                pointerInputChange5 = (PointerInputChange) tapGestureDetectorKt$processTapGesture$2.L$5;
                sVarD2 = (s) tapGestureDetectorKt$processTapGesture$2.L$4;
                function16 = (Function1) tapGestureDetectorKt$processTapGesture$2.L$3;
                function18 = (Function1) tapGestureDetectorKt$processTapGesture$2.L$2;
                pressGestureScopeImpl5 = (PressGestureScopeImpl) tapGestureDetectorKt$processTapGesture$2.L$1;
                ta2Var7 = (ta2) tapGestureDetectorKt$processTapGesture$2.L$0;
                kotlin.f.b(objP2);
                finalUpChange2 = (PointerInputChange) objP2;
                if (finalUpChange2 != null) {
                    finalUpChange2.a();
                    m(ta2Var7, sVarD2, null, new TapGestureDetectorKt$processTapGesture$8(pressGestureScopeImpl5, null), 2, null);
                    function18.invoke(rn8.d(finalUpChange2.getPosition()));
                } else {
                    m(ta2Var7, sVarD2, null, new TapGestureDetectorKt$processTapGesture$9(pressGestureScopeImpl5, null), 2, null);
                    if (function16 != null) {
                        function16.invoke(rn8.d(pointerInputChange5.getPosition()));
                    }
                }
                return Unit.a;
            case 7:
                PointerInputChange pointerInputChange13 = (PointerInputChange) tapGestureDetectorKt$processTapGesture$2.L$8;
                PointerInputChange pointerInputChange14 = (PointerInputChange) tapGestureDetectorKt$processTapGesture$2.L$7;
                s sVar4 = (s) tapGestureDetectorKt$processTapGesture$2.L$6;
                function16 = (Function1) tapGestureDetectorKt$processTapGesture$2.L$5;
                function17 = (Function1) tapGestureDetectorKt$processTapGesture$2.L$4;
                function18 = (Function1) tapGestureDetectorKt$processTapGesture$2.L$3;
                pressGestureScopeImpl7 = (PressGestureScopeImpl) tapGestureDetectorKt$processTapGesture$2.L$2;
                ta2Var6 = (ta2) tapGestureDetectorKt$processTapGesture$2.L$1;
                cc0Var6 = (cc0) tapGestureDetectorKt$processTapGesture$2.L$0;
                kotlin.f.b(objP2);
                pointerInputChange4 = pointerInputChange13;
                sVarD2 = sVar4;
                pointerInputChange5 = pointerInputChange14;
                nVar2 = (n) objP2;
                if (!Intrinsics.e(nVar2, n.c.a)) {
                    if (nVar2 instanceof n.b) {
                        finalUpChange2 = ((n.b) nVar2).getFinalUpChange();
                    } else {
                        if (nVar2 instanceof n.a) {
                            throw new NoWhenBranchMatchedException();
                        }
                        finalUpChange2 = null;
                    }
                    pressGestureScopeImpl5 = pressGestureScopeImpl7;
                    ta2Var7 = ta2Var6;
                    if (finalUpChange2 != null) {
                        finalUpChange2.a();
                        m(ta2Var7, sVarD2, null, new TapGestureDetectorKt$processTapGesture$8(pressGestureScopeImpl5, null), 2, null);
                        function18.invoke(rn8.d(finalUpChange2.getPosition()));
                    } else {
                        m(ta2Var7, sVarD2, null, new TapGestureDetectorKt$processTapGesture$9(pressGestureScopeImpl5, null), 2, null);
                        if (function16 != null) {
                            function16.invoke(rn8.d(pointerInputChange5.getPosition()));
                        }
                    }
                    return Unit.a;
                }
                function17.invoke(rn8.d(pointerInputChange4.getPosition()));
                tapGestureDetectorKt$processTapGesture$2.L$0 = ta2Var6;
                tapGestureDetectorKt$processTapGesture$2.L$1 = pressGestureScopeImpl7;
                tapGestureDetectorKt$processTapGesture$2.L$2 = sVarD2;
                tapGestureDetectorKt$processTapGesture$2.L$3 = null;
                tapGestureDetectorKt$processTapGesture$2.L$4 = null;
                tapGestureDetectorKt$processTapGesture$2.L$5 = null;
                tapGestureDetectorKt$processTapGesture$2.L$6 = null;
                tapGestureDetectorKt$processTapGesture$2.L$7 = null;
                tapGestureDetectorKt$processTapGesture$2.L$8 = null;
                tapGestureDetectorKt$processTapGesture$2.label = 8;
                if (f(cc0Var6, tapGestureDetectorKt$processTapGesture$2) != objG) {
                    sVar3 = sVarD2;
                    pressGestureScopeImpl8 = pressGestureScopeImpl7;
                    ta2Var8 = ta2Var6;
                    m(ta2Var8, sVar3, null, new TapGestureDetectorKt$processTapGesture$secondUp$1(pressGestureScopeImpl8, null), 2, null);
                    return Unit.a;
                }
                return objG;
            case 8:
                sVar3 = (s) tapGestureDetectorKt$processTapGesture$2.L$2;
                pressGestureScopeImpl8 = (PressGestureScopeImpl) tapGestureDetectorKt$processTapGesture$2.L$1;
                ta2Var8 = (ta2) tapGestureDetectorKt$processTapGesture$2.L$0;
                kotlin.f.b(objP2);
                m(ta2Var8, sVar3, null, new TapGestureDetectorKt$processTapGesture$secondUp$1(pressGestureScopeImpl8, null), 2, null);
                return Unit.a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object o(cc0 cc0Var, PointerEventPass pointerEventPass, q22<? super n> q22Var) {
        TapGestureDetectorKt$waitForLongPress$1 tapGestureDetectorKt$waitForLongPress$1;
        Ref.ObjectRef objectRef;
        if (q22Var instanceof TapGestureDetectorKt$waitForLongPress$1) {
            tapGestureDetectorKt$waitForLongPress$1 = (TapGestureDetectorKt$waitForLongPress$1) q22Var;
            int i = tapGestureDetectorKt$waitForLongPress$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                tapGestureDetectorKt$waitForLongPress$1.label = i - t04.INVALID_ID;
            } else {
                tapGestureDetectorKt$waitForLongPress$1 = new TapGestureDetectorKt$waitForLongPress$1(q22Var);
            }
        } else {
            tapGestureDetectorKt$waitForLongPress$1 = new TapGestureDetectorKt$waitForLongPress$1(q22Var);
        }
        Object obj = tapGestureDetectorKt$waitForLongPress$1.result;
        Object objG = a.g();
        int i2 = tapGestureDetectorKt$waitForLongPress$1.label;
        try {
            if (i2 == 0) {
                kotlin.f.b(obj);
                Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                objectRef2.element = n.a.a;
                long jF = cc0Var.getViewConfiguration().f();
                TapGestureDetectorKt$waitForLongPress$2 tapGestureDetectorKt$waitForLongPress$2 = new TapGestureDetectorKt$waitForLongPress$2(pointerEventPass, objectRef2, null);
                tapGestureDetectorKt$waitForLongPress$1.L$0 = objectRef2;
                tapGestureDetectorKt$waitForLongPress$1.label = 1;
                if (cc0Var.r2(jF, tapGestureDetectorKt$waitForLongPress$2, tapGestureDetectorKt$waitForLongPress$1) == objG) {
                    return objG;
                }
                objectRef = objectRef2;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef = (Ref.ObjectRef) tapGestureDetectorKt$waitForLongPress$1.L$0;
                kotlin.f.b(obj);
            }
            return objectRef.element;
        } catch (PointerEventTimeoutCancellationException unused) {
            return n.c.a;
        }
    }

    public static /* synthetic */ Object p(cc0 cc0Var, PointerEventPass pointerEventPass, q22 q22Var, int i, Object obj) {
        if ((i & 1) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return o(cc0Var, pointerEventPass, q22Var);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0095  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e3 A[LOOP:1: B:23:0x007c->B:45:0x00e3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x008a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00b3 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00c0 -> B:13:0x0037). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public static final java.lang.Object q(com.google.inputmethod.cc0 r17, androidx.compose.ui.input.pointer.PointerEventPass r18, com.google.android.q22<? super androidx.compose.ui.input.pointer.PointerInputChange> r19) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p001foundation.gestures.TapGestureDetectorKt.q(com.google.android.cc0, androidx.compose.ui.input.pointer.PointerEventPass, com.google.android.q22):java.lang.Object");
    }

    public static /* synthetic */ Object r(cc0 cc0Var, PointerEventPass pointerEventPass, q22 q22Var, int i, Object obj) {
        if ((i & 1) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return q(cc0Var, pointerEventPass, q22Var);
    }
}
