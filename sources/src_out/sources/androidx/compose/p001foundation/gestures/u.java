package androidx.compose.p001foundation.gestures;

import androidx.compose.p001foundation.gestures.u;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.p004runtime.p0;
import com.google.inputmethod.hab;
import com.google.inputmethod.q6c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a!\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlin/Function1;", "", "consumeScrollDelta", "Lcom/google/android/hab;", "b", "(Lkotlin/jvm/functions/Function1;)Lcom/google/android/hab;", "c", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/d;I)Lcom/google/android/hab;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class u {
    public static final hab b(Function1<? super Float, Float> function1) {
        return new DefaultScrollableState(function1);
    }

    public static final hab c(Function1<? super Float, Float> function1, d dVar, int i) {
        if (e.k()) {
            e.o(-180460798, i, -1, "androidx.compose.foundation.gestures.rememberScrollableState (ScrollableState.kt:169)");
        }
        final q6c q6cVarR = p0.r(function1, dVar, i & 14);
        Object objR = dVar.R();
        if (objR == d.INSTANCE.a()) {
            objR = b(new Function1() { // from class: com.google.android.iab
                public final Object invoke(Object obj) {
                    return Float.valueOf(u.d(q6cVarR, ((Float) obj).floatValue()));
                }
            });
            dVar.L(objR);
        }
        hab habVar = (hab) objR;
        if (e.k()) {
            e.n();
        }
        return habVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float d(q6c q6cVar, float f) {
        return ((Number) ((Function1) q6cVar.getValue()).invoke(Float.valueOf(f))).floatValue();
    }
}
