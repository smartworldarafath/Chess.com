package com.google.inputmethod;

import android.view.MotionEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u001a\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/google/android/o56;", "", "Lcom/google/android/ha7;", "Landroidx/compose/ui/input/pointer/i;", "changes", "Lcom/google/android/ve9;", "pointerInputEvent", "<init>", "(Lcom/google/android/ha7;Lcom/google/android/ve9;)V", "Lcom/google/android/se9;", "pointerId", "", "a", "(J)Z", "Lcom/google/android/ha7;", "b", "()Lcom/google/android/ha7;", "Lcom/google/android/ve9;", "getPointerInputEvent", "()Lcom/google/android/ve9;", "c", "Z", "d", "()Z", "e", "(Z)V", "suppressMovementConsumption", "Landroid/view/MotionEvent;", "()Landroid/view/MotionEvent;", "motionEvent", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o56 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ha7<PointerInputChange> changes;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ve9 pointerInputEvent;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean suppressMovementConsumption;

    public o56(ha7<PointerInputChange> ha7Var, ve9 ve9Var) {
        this.changes = ha7Var;
        this.pointerInputEvent = ve9Var;
    }

    public final boolean a(long pointerId) {
        PointerInputEventData pointerInputEventData;
        List<PointerInputEventData> listB = this.pointerInputEvent.b();
        int size = listB.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                pointerInputEventData = null;
                break;
            }
            pointerInputEventData = listB.get(i);
            if (se9.b(pointerInputEventData.getId(), pointerId)) {
                break;
            }
            i++;
        }
        PointerInputEventData pointerInputEventData2 = pointerInputEventData;
        if (pointerInputEventData2 != null) {
            return pointerInputEventData2.getActiveHover();
        }
        return false;
    }

    public final ha7<PointerInputChange> b() {
        return this.changes;
    }

    public final MotionEvent c() {
        return this.pointerInputEvent.getMotionEvent();
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getSuppressMovementConsumption() {
        return this.suppressMovementConsumption;
    }

    public final void e(boolean z) {
        this.suppressMovementConsumption = z;
    }
}
