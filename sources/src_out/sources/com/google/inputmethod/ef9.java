package com.google.inputmethod;

import android.view.MotionEvent;
import androidx.compose.ui.input.pointer.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a/\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a/\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0000¢\u0006\u0004\b\t\u0010\b\u001a-\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0000¢\u0006\u0004\b\f\u0010\r\u001a7\u0010\u0010\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/input/pointer/e;", "Lcom/google/android/rn8;", "offset", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "", "block", "c", "(Landroidx/compose/ui/input/pointer/e;JLkotlin/jvm/functions/Function1;)V", "b", "", "nowMillis", "a", "(JLkotlin/jvm/functions/Function1;)V", "", "cancel", "d", "(Landroidx/compose/ui/input/pointer/e;JLkotlin/jvm/functions/Function1;Z)V", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ef9 {
    public static final void a(long j, Function1<? super MotionEvent, Unit> function1) {
        MotionEvent motionEventObtain = MotionEvent.obtain(j, j, 3, 0.0f, 0.0f, 0);
        motionEventObtain.setSource(0);
        function1.invoke(motionEventObtain);
        motionEventObtain.recycle();
    }

    public static final void b(e eVar, long j, Function1<? super MotionEvent, Unit> function1) {
        d(eVar, j, function1, true);
    }

    public static final void c(e eVar, long j, Function1<? super MotionEvent, Unit> function1) {
        d(eVar, j, function1, false);
    }

    private static final void d(e eVar, long j, Function1<? super MotionEvent, Unit> function1, boolean z) {
        MotionEvent motionEventG = eVar.g();
        if (motionEventG == null) {
            throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
        }
        int action = motionEventG.getAction();
        if (z) {
            motionEventG.setAction(3);
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        motionEventG.offsetLocation(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
        function1.invoke(motionEventG);
        motionEventG.offsetLocation(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        motionEventG.setAction(action);
    }
}
