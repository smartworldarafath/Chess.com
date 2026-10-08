package androidx.compose.p001foundation.gestures;

import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import com.google.android.q22;
import com.google.inputmethod.cc0;
import com.google.inputmethod.df9;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001e\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0080@¢\u0006\u0004\b\u0007\u0010\b\u001a8\u0010\u000e\u001a\u00020\u0006*\u00020\t2\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\nH\u0086@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/google/android/cc0;", "", "a", "(Lcom/google/android/cc0;)Z", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "", "b", "(Lcom/google/android/cc0;Landroidx/compose/ui/input/pointer/PointerEventPass;Lcom/google/android/q22;)Ljava/lang/Object;", "Lcom/google/android/df9;", "Lkotlin/Function2;", "Lcom/google/android/q22;", "", "block", "d", "(Lcom/google/android/df9;Lkotlin/jvm/functions/Function2;Lcom/google/android/q22;)Ljava/lang/Object;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ForEachGestureKt {
    public static final boolean a(cc0 cc0Var) {
        List<PointerInputChange> listC = cc0Var.a2().c();
        int size = listC.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            if (listC.get(i).getPressed()) {
                z = true;
                break;
            }
        }
        return !z;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005f  */
    /* JADX WARN: Code duplicated, block: B:24:0x006c A[LOOP:0: B:20:0x005d->B:24:0x006c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x006f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x0045 A[EDGE_INSN: B:28:0x0045->B:16:0x0045 BREAK  A[LOOP:0: B:20:0x005d->B:24:0x006c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004f -> B:19:0x0052). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(com.google.inputmethod.cc0 r7, androidx.compose.ui.input.pointer.PointerEventPass r8, com.google.android.q22<? super kotlin.Unit> r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.p001foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3 r0 = (androidx.compose.p001foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3 r0 = new androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r7 = r0.L$1
            androidx.compose.ui.input.pointer.PointerEventPass r7 = (androidx.compose.ui.input.pointer.PointerEventPass) r7
            java.lang.Object r8 = r0.L$0
            com.google.android.cc0 r8 = (com.google.inputmethod.cc0) r8
            kotlin.f.b(r9)
            r6 = r8
            r8 = r7
            r7 = r6
            goto L52
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            kotlin.f.b(r9)
            boolean r9 = a(r7)
            if (r9 != 0) goto L6f
        L45:
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r3
            java.lang.Object r9 = r7.f2(r8, r0)
            if (r9 != r1) goto L52
            return r1
        L52:
            androidx.compose.ui.input.pointer.e r9 = (androidx.compose.ui.input.pointer.e) r9
            java.util.List r9 = r9.c()
            int r2 = r9.size()
            r4 = 0
        L5d:
            if (r4 >= r2) goto L6f
            java.lang.Object r5 = r9.get(r4)
            androidx.compose.ui.input.pointer.i r5 = (androidx.compose.ui.input.pointer.PointerInputChange) r5
            boolean r5 = r5.getPressed()
            if (r5 == 0) goto L6c
            goto L45
        L6c:
            int r4 = r4 + 1
            goto L5d
        L6f:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p001foundation.gestures.ForEachGestureKt.b(com.google.android.cc0, androidx.compose.ui.input.pointer.PointerEventPass, com.google.android.q22):java.lang.Object");
    }

    public static /* synthetic */ Object c(cc0 cc0Var, PointerEventPass pointerEventPass, q22 q22Var, int i, Object obj) {
        if ((i & 1) != 0) {
            pointerEventPass = PointerEventPass.Final;
        }
        return b(cc0Var, pointerEventPass, q22Var);
    }

    public static final Object d(df9 df9Var, Function2<? super cc0, ? super q22<? super Unit>, ? extends Object> function2, q22<? super Unit> q22Var) {
        Object objL0 = df9Var.l0(new ForEachGestureKt$awaitEachGesture$2(q22Var.getContext(), function2, null), q22Var);
        return objL0 == a.g() ? objL0 : Unit.a;
    }
}
