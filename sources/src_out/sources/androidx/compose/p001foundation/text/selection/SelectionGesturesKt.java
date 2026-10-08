package androidx.compose.p001foundation.text.selection;

import androidx.compose.p001foundation.gestures.DragGestureDetectorKt;
import androidx.compose.p001foundation.gestures.ForEachGestureKt;
import androidx.compose.p001foundation.text.selection.SelectionGesturesKt;
import androidx.compose.ui.b;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.e;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.inputmethod.cc0;
import com.google.inputmethod.df9;
import com.google.inputmethod.gsc;
import com.google.inputmethod.j08;
import com.google.inputmethod.ke9;
import com.google.inputmethod.me1;
import com.google.inputmethod.p7e;
import com.google.inputmethod.rn8;
import com.google.inputmethod.t04;
import com.google.inputmethod.ugc;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a'\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a$\u0010\f\u001a\u00020\u0003*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0080@¢\u0006\u0004\b\f\u0010\r\u001a$\u0010\u0012\u001a\u00020\u0003*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0080@¢\u0006\u0004\b\u0012\u0010\u0013\u001a,\u0010\u0016\u001a\u00020\u0003*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017\u001a,\u0010\u001b\u001a\u00020\u0003*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0010H\u0080@¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0014\u0010\u001d\u001a\u00020\u0010*\u00020\u000eH\u0082@¢\u0006\u0004\b\u001d\u0010\u001e\u001a'\u0010$\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!H\u0002¢\u0006\u0004\b$\u0010%¨\u0006&"}, d2 = {"Landroidx/compose/ui/b;", "Lkotlin/Function1;", "", "", "updateTouchMode", "r", "(Landroidx/compose/ui/b;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/b;", "Lcom/google/android/df9;", "Lcom/google/android/j08;", "mouseSelectionObserver", "Lcom/google/android/gsc;", "textDragObserver", "i", "(Lcom/google/android/df9;Lcom/google/android/j08;Lcom/google/android/gsc;Lcom/google/android/q22;)Ljava/lang/Object;", "Lcom/google/android/cc0;", "observer", "Landroidx/compose/ui/input/pointer/e;", "downEvent", "n", "(Lcom/google/android/cc0;Lcom/google/android/gsc;Landroidx/compose/ui/input/pointer/e;Lcom/google/android/q22;)Ljava/lang/Object;", "", "clicks", "p", "(Lcom/google/android/cc0;Lcom/google/android/gsc;Landroidx/compose/ui/input/pointer/e;ILcom/google/android/q22;)Ljava/lang/Object;", "Lcom/google/android/me1;", "clicksCounter", "down", "k", "(Lcom/google/android/cc0;Lcom/google/android/j08;Lcom/google/android/me1;Landroidx/compose/ui/input/pointer/e;Lcom/google/android/q22;)Ljava/lang/Object;", "h", "(Lcom/google/android/cc0;Lcom/google/android/q22;)Ljava/lang/Object;", "Lcom/google/android/p7e;", "viewConfiguration", "Landroidx/compose/ui/input/pointer/i;", "change1", "change2", "j", "(Lcom/google/android/p7e;Landroidx/compose/ui/input/pointer/i;Landroidx/compose/ui/input/pointer/i;)Z", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class SelectionGesturesKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x0044 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0052  */
    /* JADX WARN: Code duplicated, block: B:23:0x005f A[LOOP:0: B:19:0x0050->B:23:0x005f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0038 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0042 -> B:18:0x0045). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object h(com.google.inputmethod.cc0 r7, com.google.android.q22<? super androidx.compose.ui.input.pointer.e> r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.p001foundation.text.selection.SelectionGesturesKt$awaitDown$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1 r0 = (androidx.compose.p001foundation.text.selection.SelectionGesturesKt$awaitDown$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1 r0 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r7 = r0.L$0
            com.google.android.cc0 r7 = (com.google.inputmethod.cc0) r7
            kotlin.f.b(r8)
            goto L45
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            kotlin.f.b(r8)
        L38:
            androidx.compose.ui.input.pointer.PointerEventPass r8 = androidx.compose.ui.input.pointer.PointerEventPass.Main
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r8 = r7.f2(r8, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            androidx.compose.ui.input.pointer.e r8 = (androidx.compose.ui.input.pointer.e) r8
            java.util.List r2 = r8.c()
            int r4 = r2.size()
            r5 = 0
        L50:
            if (r5 >= r4) goto L62
            java.lang.Object r6 = r2.get(r5)
            androidx.compose.ui.input.pointer.i r6 = (androidx.compose.ui.input.pointer.PointerInputChange) r6
            boolean r6 = androidx.compose.ui.input.pointer.f.a(r6)
            if (r6 != 0) goto L5f
            goto L38
        L5f:
            int r5 = r5 + 1
            goto L50
        L62:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p001foundation.text.selection.SelectionGesturesKt.h(com.google.android.cc0, com.google.android.q22):java.lang.Object");
    }

    public static final Object i(df9 df9Var, j08 j08Var, gsc gscVar, q22<? super Unit> q22Var) {
        Object objD = ForEachGestureKt.d(df9Var, new SelectionGesturesKt$awaitSelectionGestures$2(new me1(df9Var.getViewConfiguration()), j08Var, gscVar, null), q22Var);
        return objD == a.g() ? objD : Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(p7e p7eVar, PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2) {
        return rn8.k(rn8.p(pointerInputChange.getPosition(), pointerInputChange2.getPosition())) < DragGestureDetectorKt.w(p7eVar, pointerInputChange.getType());
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0097 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:20:0x004e, B:31:0x008f, B:33:0x0097, B:35:0x00a5, B:37:0x00b1, B:28:0x0075), top: B:69:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a5 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:20:0x004e, B:31:0x008f, B:33:0x0097, B:35:0x00a5, B:37:0x00b1, B:28:0x0075), top: B:69:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b1 A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:20:0x004e, B:31:0x008f, B:33:0x0097, B:35:0x00a5, B:37:0x00b1, B:28:0x0075), top: B:69:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0131 A[Catch: all -> 0x003a, TryCatch #1 {all -> 0x003a, blocks: (B:13:0x0035, B:54:0x0117, B:56:0x011f, B:58:0x0123, B:60:0x0131, B:62:0x013d, B:50:0x00ea), top: B:69:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x013d A[Catch: all -> 0x003a, TRY_LEAVE, TryCatch #1 {all -> 0x003a, blocks: (B:13:0x0035, B:54:0x0117, B:56:0x011f, B:58:0x0123, B:60:0x0131, B:62:0x013d, B:50:0x00ea), top: B:69:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0140 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object k(cc0 cc0Var, final j08 j08Var, me1 me1Var, e eVar, q22<? super Unit> q22Var) {
        SelectionGesturesKt$mouseSelection$1 selectionGesturesKt$mouseSelection$1;
        final f fVarL;
        cc0 cc0Var2;
        Ref.BooleanRef booleanRef;
        List<PointerInputChange> listC;
        int size;
        PointerInputChange pointerInputChange;
        List<PointerInputChange> listC2;
        int size2;
        PointerInputChange pointerInputChange2;
        if (q22Var instanceof SelectionGesturesKt$mouseSelection$1) {
            selectionGesturesKt$mouseSelection$1 = (SelectionGesturesKt$mouseSelection$1) q22Var;
            int i = selectionGesturesKt$mouseSelection$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                selectionGesturesKt$mouseSelection$1.label = i - t04.INVALID_ID;
            } else {
                selectionGesturesKt$mouseSelection$1 = new SelectionGesturesKt$mouseSelection$1(q22Var);
            }
        } else {
            selectionGesturesKt$mouseSelection$1 = new SelectionGesturesKt$mouseSelection$1(q22Var);
        }
        Object objU = selectionGesturesKt$mouseSelection$1.result;
        Object objG = a.g();
        int i2 = selectionGesturesKt$mouseSelection$1.label;
        int i3 = 0;
        try {
            try {
                if (i2 == 0) {
                    f.b(objU);
                    PointerInputChange pointerInputChange3 = eVar.c().get(0);
                    if (!ke9.e(eVar.getKeyboardModifiers())) {
                        int iA = me1Var.a();
                        if (iA != 1) {
                            fVarL = iA != 2 ? f.INSTANCE.m() : f.INSTANCE.n();
                        } else {
                            fVarL = f.INSTANCE.l();
                        }
                        if (j08Var.b(pointerInputChange3.getPosition(), fVarL, me1Var.a())) {
                            final Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                            booleanRef2.element = !Intrinsics.e(fVarL, f.INSTANCE.l());
                            long id = pointerInputChange3.getId();
                            Function1 function1 = new Function1() { // from class: com.google.android.beb
                                public final Object invoke(Object obj) {
                                    return SelectionGesturesKt.m(j08Var, fVarL, booleanRef2, (PointerInputChange) obj);
                                }
                            };
                            selectionGesturesKt$mouseSelection$1.L$0 = cc0Var;
                            selectionGesturesKt$mouseSelection$1.L$1 = j08Var;
                            selectionGesturesKt$mouseSelection$1.L$2 = booleanRef2;
                            selectionGesturesKt$mouseSelection$1.label = 2;
                            objU = DragGestureDetectorKt.u(cc0Var, id, function1, selectionGesturesKt$mouseSelection$1);
                            if (objU != objG) {
                                cc0Var2 = cc0Var;
                                booleanRef = booleanRef2;
                                if (((Boolean) objU).booleanValue()) {
                                    listC2 = cc0Var2.a2().c();
                                    size2 = listC2.size();
                                    while (i3 < size2) {
                                        pointerInputChange2 = listC2.get(i3);
                                        if (androidx.compose.ui.input.pointer.f.c(pointerInputChange2)) {
                                            pointerInputChange2.a();
                                        }
                                        i3++;
                                    }
                                }
                                j08Var.c();
                            }
                            return objG;
                        }
                    } else if (j08Var.e(pointerInputChange3.getPosition())) {
                        pointerInputChange3.a();
                        long id2 = pointerInputChange3.getId();
                        Function1 function2 = new Function1() { // from class: com.google.android.aeb
                            public final Object invoke(Object obj) {
                                return SelectionGesturesKt.l(j08Var, (PointerInputChange) obj);
                            }
                        };
                        selectionGesturesKt$mouseSelection$1.L$0 = cc0Var;
                        selectionGesturesKt$mouseSelection$1.L$1 = j08Var;
                        selectionGesturesKt$mouseSelection$1.label = 1;
                        objU = DragGestureDetectorKt.u(cc0Var, id2, function2, selectionGesturesKt$mouseSelection$1);
                        if (objU == objG) {
                            return objG;
                        }
                        if (((Boolean) objU).booleanValue()) {
                            listC = cc0Var.a2().c();
                            size = listC.size();
                            while (i3 < size) {
                                pointerInputChange = listC.get(i3);
                                if (androidx.compose.ui.input.pointer.f.c(pointerInputChange)) {
                                    pointerInputChange.a();
                                }
                                i3++;
                            }
                        }
                        j08Var.c();
                    }
                } else if (i2 == 1) {
                    j08Var = (j08) selectionGesturesKt$mouseSelection$1.L$1;
                    cc0Var = (cc0) selectionGesturesKt$mouseSelection$1.L$0;
                    f.b(objU);
                    if (((Boolean) objU).booleanValue()) {
                        listC = cc0Var.a2().c();
                        size = listC.size();
                        while (i3 < size) {
                            pointerInputChange = listC.get(i3);
                            if (androidx.compose.ui.input.pointer.f.c(pointerInputChange)) {
                                pointerInputChange.a();
                            }
                            i3++;
                        }
                    }
                    j08Var.c();
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    booleanRef = (Ref.BooleanRef) selectionGesturesKt$mouseSelection$1.L$2;
                    j08Var = (j08) selectionGesturesKt$mouseSelection$1.L$1;
                    cc0Var2 = (cc0) selectionGesturesKt$mouseSelection$1.L$0;
                    f.b(objU);
                    if (((Boolean) objU).booleanValue() && booleanRef.element) {
                        listC2 = cc0Var2.a2().c();
                        size2 = listC2.size();
                        while (i3 < size2) {
                            pointerInputChange2 = listC2.get(i3);
                            if (androidx.compose.ui.input.pointer.f.c(pointerInputChange2)) {
                                pointerInputChange2.a();
                            }
                            i3++;
                        }
                    }
                    j08Var.c();
                }
                return Unit.a;
            } catch (Throwable th) {
                j08Var.c();
                throw th;
            }
        } catch (Throwable th2) {
            j08Var.c();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(j08 j08Var, PointerInputChange pointerInputChange) {
        if (j08Var.d(pointerInputChange.getPosition())) {
            pointerInputChange.a();
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(j08 j08Var, f fVar, Ref.BooleanRef booleanRef, PointerInputChange pointerInputChange) {
        if (j08Var.a(pointerInputChange.getPosition(), fVar)) {
            pointerInputChange.a();
            booleanRef.element = true;
        }
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a3, code lost:
    
        if (r11 == r1) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object n(com.google.inputmethod.cc0 r8, final com.google.inputmethod.gsc r9, androidx.compose.ui.input.pointer.e r10, com.google.android.q22<? super kotlin.Unit> r11) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p001foundation.text.selection.SelectionGesturesKt.n(com.google.android.cc0, com.google.android.gsc, androidx.compose.ui.input.pointer.e, com.google.android.q22):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(gsc gscVar, PointerInputChange pointerInputChange) {
        gscVar.b(androidx.compose.ui.input.pointer.f.g(pointerInputChange));
        pointerInputChange.a();
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e1, code lost:
    
        if (r14 == r1) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object p(com.google.inputmethod.cc0 r10, final com.google.inputmethod.gsc r11, androidx.compose.ui.input.pointer.e r12, int r13, com.google.android.q22<? super kotlin.Unit> r14) {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p001foundation.text.selection.SelectionGesturesKt.p(com.google.android.cc0, com.google.android.gsc, androidx.compose.ui.input.pointer.e, int, com.google.android.q22):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(gsc gscVar, PointerInputChange pointerInputChange) {
        gscVar.b(androidx.compose.ui.input.pointer.f.g(pointerInputChange));
        pointerInputChange.a();
        return Unit.a;
    }

    public static final b r(b bVar, final Function1<? super Boolean, Unit> function1) {
        return ugc.c(bVar, 8675309, new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1

            /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1$1, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/cc0;", "", "<anonymous>", "(Lcom/google/android/cc0;)V"}, k = 3, mv = {2, 1, 0})
            @lq2(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1$1", f = "SelectionGestures.kt", l = {94}, m = "invokeSuspend", v = 1)
            static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<cc0, q22<? super Unit>, Object> {
                final /* synthetic */ Function1<Boolean, Unit> $updateTouchMode;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(Function1<? super Boolean, Unit> function1, q22<? super AnonymousClass1> q22Var) {
                    super(2, q22Var);
                    this.$updateTouchMode = function1;
                }

                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(cc0 cc0Var, q22<? super Unit> q22Var) {
                    return create(cc0Var, q22Var).invokeSuspend(Unit.a);
                }

                public final q22<Unit> create(Object obj, q22<?> q22Var) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$updateTouchMode, q22Var);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                /* JADX WARN: Code duplicated, block: B:11:0x002f A[RETURN] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002d -> B:12:0x0030). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x002f
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                    /*
                        r4 = this;
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.a.g()
                        int r1 = r4.label
                        r2 = 1
                        if (r1 == 0) goto L1b
                        if (r1 != r2) goto L13
                        java.lang.Object r1 = r4.L$0
                        com.google.android.cc0 r1 = (com.google.inputmethod.cc0) r1
                        kotlin.f.b(r5)
                        goto L30
                    L13:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r0)
                        throw r5
                    L1b:
                        kotlin.f.b(r5)
                        java.lang.Object r5 = r4.L$0
                        com.google.android.cc0 r5 = (com.google.inputmethod.cc0) r5
                        r1 = r5
                    L23:
                        androidx.compose.ui.input.pointer.PointerEventPass r5 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                        r4.L$0 = r1
                        r4.label = r2
                        java.lang.Object r5 = r1.f2(r5, r4)
                        if (r5 != r0) goto L30
                        return r0
                    L30:
                        androidx.compose.ui.input.pointer.e r5 = (androidx.compose.ui.input.pointer.e) r5
                        kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> r3 = r4.$updateTouchMode
                        boolean r5 = androidx.compose.p001foundation.text.selection.j.b(r5)
                        r5 = r5 ^ r2
                        java.lang.Boolean r5 = com.google.android.ut0.a(r5)
                        r3.invoke(r5)
                        goto L23
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p001foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(df9 df9Var, q22<? super Unit> q22Var) {
                Object objL0 = df9Var.l0(new AnonymousClass1(function1, null), q22Var);
                return objL0 == a.g() ? objL0 : Unit.a;
            }
        });
    }
}
