package androidx.compose.p001foundation.gestures;

import androidx.compose.p001foundation.gestures.DraggableKt;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.p004runtime.p0;
import androidx.compose.ui.b;
import com.google.android.ps4;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.inputmethod.mg3;
import com.google.inputmethod.og3;
import com.google.inputmethod.q6c;
import com.google.inputmethod.r48;
import com.google.inputmethod.rn8;
import com.google.inputmethod.t3e;
import com.google.inputmethod.u3e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u001a!\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a¥\u0001\u0010\u001a\u001a\u00020\t*\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\r2*\b\u0002\u0010\u0017\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00122*\b\u0002\u0010\u0018\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00122\b\b\u0002\u0010\u0019\u001a\u00020\rH\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001b\u0010\u001c\u001a\u00020\u0001*\u00020\u00142\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001b\u0010\u001f\u001a\u00020\u0001*\u00020\u001e2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001f\u0010\u001d\u001a\u0013\u0010 \u001a\u00020\u001e*\u00020\u001eH\u0000¢\u0006\u0004\b \u0010!\"6\u0010$\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#\"6\u0010%\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#¨\u0006&"}, d2 = {"Lkotlin/Function1;", "", "", "onDelta", "Lcom/google/android/og3;", "b", "(Lkotlin/jvm/functions/Function1;)Lcom/google/android/og3;", "h", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/d;I)Lcom/google/android/og3;", "Landroidx/compose/ui/b;", "state", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "enabled", "Lcom/google/android/r48;", "interactionSource", "startDragImmediately", "Lkotlin/Function3;", "Lcom/google/android/ta2;", "Lcom/google/android/rn8;", "Lcom/google/android/q22;", "", "onDragStarted", "onDragStopped", "reverseDirection", "f", "(Landroidx/compose/ui/b;Lcom/google/android/og3;Landroidx/compose/foundation/gestures/Orientation;ZLcom/google/android/r48;ZLcom/google/android/ps4;Lcom/google/android/ps4;Z)Landroidx/compose/ui/b;", "j", "(JLandroidx/compose/foundation/gestures/Orientation;)F", "Lcom/google/android/t3e;", "k", "l", "(J)J", "a", "Lcom/google/android/ps4;", "NoOpOnDragStarted", "NoOpOnDragStopped", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class DraggableKt {
    private static final ps4<ta2, rn8, q22<? super Unit>, Object> a = new DraggableKt$NoOpOnDragStarted$1(null);
    private static final ps4<ta2, Float, q22<? super Unit>, Object> b = new DraggableKt$NoOpOnDragStopped$1(null);

    public static final og3 b(Function1<? super Float, Unit> function1) {
        return new DefaultDraggableState(function1);
    }

    public static final b f(b bVar, og3 og3Var, Orientation orientation, boolean z, r48 r48Var, boolean z2, ps4<? super ta2, ? super rn8, ? super q22<? super Unit>, ? extends Object> ps4Var, ps4<? super ta2, ? super Float, ? super q22<? super Unit>, ? extends Object> ps4Var2, boolean z3) {
        return bVar.then(new mg3(og3Var, orientation, z, r48Var, z2, ps4Var, ps4Var2, z3));
    }

    public static /* synthetic */ b g(b bVar, og3 og3Var, Orientation orientation, boolean z, r48 r48Var, boolean z2, ps4 ps4Var, ps4 ps4Var2, boolean z3, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z4 = z;
        if ((i & 8) != 0) {
            r48Var = null;
        }
        return f(bVar, og3Var, orientation, z4, r48Var, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? a : ps4Var, (i & 64) != 0 ? b : ps4Var2, (i & 128) != 0 ? false : z3);
    }

    public static final og3 h(Function1<? super Float, Unit> function1, d dVar, int i) {
        if (e.k()) {
            e.o(-183245213, i, -1, "androidx.compose.foundation.gestures.rememberDraggableState (Draggable.kt:150)");
        }
        final q6c q6cVarR = p0.r(function1, dVar, i & 14);
        Object objR = dVar.R();
        if (objR == d.INSTANCE.a()) {
            objR = b(new Function1() { // from class: com.google.android.ng3
                public final Object invoke(Object obj) {
                    return DraggableKt.i(q6cVarR, ((Float) obj).floatValue());
                }
            });
            dVar.L(objR);
        }
        og3 og3Var = (og3) objR;
        if (e.k()) {
            e.n();
        }
        return og3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(q6c q6cVar, float f) {
        ((Function1) q6cVar.getValue()).invoke(Float.valueOf(f));
        return Unit.a;
    }

    public static final float j(long j, Orientation orientation) {
        return Float.intBitsToFloat((int) (orientation == Orientation.Vertical ? j & 4294967295L : j >> 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float k(long j, Orientation orientation) {
        return orientation == Orientation.Vertical ? t3e.i(j) : t3e.h(j);
    }

    public static final long l(long j) {
        return u3e.a(Float.isNaN(t3e.h(j)) ? 0.0f : t3e.h(j), Float.isNaN(t3e.i(j)) ? 0.0f : t3e.i(j));
    }
}
