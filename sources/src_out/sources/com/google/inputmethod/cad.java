package com.google.inputmethod;

import androidx.compose.p000animation.core.e;
import androidx.compose.p001foundation.MutatePriority;
import com.google.android.q22;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Lcom/google/android/cad;", "", "Landroidx/compose/foundation/MutatePriority;", "mutatePriority", "", "c", "(Landroidx/compose/foundation/MutatePriority;Lcom/google/android/q22;)Ljava/lang/Object;", "dismiss", "()V", "b", "Landroidx/compose/animation/core/e;", "", "a", "()Landroidx/compose/animation/core/e;", "transition", "isVisible", "()Z", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface cad {
    static /* synthetic */ Object d(cad cadVar, MutatePriority mutatePriority, q22 q22Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: show");
        }
        if ((i & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return cadVar.c(mutatePriority, q22Var);
    }

    e<Boolean> a();

    void b();

    Object c(MutatePriority mutatePriority, q22<? super Unit> q22Var);

    void dismiss();

    boolean isVisible();
}
