package com.google.inputmethod;

import android.view.ViewConfiguration;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.e;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0001¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0007*\u00020\u0006H\u0001¢\u0006\u0004\b\n\u0010\tJ#\u0010\u0010\u001a\u00020\u000f*\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/google/android/uj;", "Lcom/google/android/e9b;", "Landroid/view/ViewConfiguration;", "viewConfiguration", "<init>", "(Landroid/view/ViewConfiguration;)V", "Lcom/google/android/f43;", "", "e", "(Lcom/google/android/f43;)F", "d", "Landroidx/compose/ui/input/pointer/e;", "event", "Lcom/google/android/q16;", "bounds", "Lcom/google/android/rn8;", "b", "(Lcom/google/android/f43;Landroidx/compose/ui/input/pointer/e;J)J", "a", "Landroid/view/ViewConfiguration;", "getViewConfiguration", "()Landroid/view/ViewConfiguration;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class uj implements e9b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ViewConfiguration viewConfiguration;

    public uj(ViewConfiguration viewConfiguration) {
        this.viewConfiguration = viewConfiguration;
    }

    @Override // com.google.inputmethod.e9b
    public long b(f43 f43Var, e eVar, long j) {
        float f = -e(f43Var);
        float f2 = -d(f43Var);
        List<PointerInputChange> listC = eVar.c();
        rn8 rn8VarD = rn8.d(rn8.INSTANCE.c());
        int size = listC.size();
        for (int i = 0; i < size; i++) {
            rn8VarD = rn8.d(rn8.q(rn8VarD.getPackedValue(), listC.get(i).getScrollDelta()));
        }
        long packedValue = rn8VarD.getPackedValue();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (packedValue >> 32)) * f2;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (packedValue & 4294967295L)) * f;
        return rn8.e((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    public final float d(f43 f43Var) {
        return q7e.a.a(this.viewConfiguration);
    }

    public final float e(f43 f43Var) {
        return q7e.a.b(this.viewConfiguration);
    }
}
