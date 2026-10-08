package com.google.inputmethod;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/google/android/as1;", "Lcom/google/android/aw8;", "b", "(Lcom/google/android/as1;)Lcom/google/android/aw8;", "Lcom/google/android/we8;", "source", "", "c", "(I)F", "Lcom/google/android/ei1;", "a", "J", "DefaultGlowColor", "Lcom/google/android/rx8;", "Lcom/google/android/rx8;", "DefaultGlowPaddingValues", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class cm {
    private static final long a = ki1.d(4284900966L);
    private static final rx8 b = nx8.g(0.0f, 0.0f, 3, null);

    public static final aw8 b(as1 as1Var) {
        Context context = (Context) as1Var.L(AndroidCompositionLocals_androidKt.c());
        f43 f43Var = (f43) as1Var.L(CompositionLocalsKt.g());
        OverscrollConfiguration wv8Var = (OverscrollConfiguration) as1Var.L(yv8.c());
        if (wv8Var == null) {
            return null;
        }
        return new qk(context, f43Var, wv8Var.getGlowColor(), wv8Var.getDrawPadding(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float c(int i) {
        return we8.d(i, we8.INSTANCE.a()) ? 4.0f : 1.0f;
    }
}
