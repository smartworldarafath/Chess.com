package com.google.inputmethod;

import androidx.compose.p002material3.TimePickerKt;
import androidx.compose.ui.layout.g;
import androidx.compose.ui.layout.j;
import androidx.compose.ui.layout.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/google/android/zf1;", "Landroidx/compose/ui/layout/g;", "<init>", "()V", "Landroidx/compose/ui/layout/j;", "Lcom/google/android/dj7;", "measurable", "Lcom/google/android/kx1;", "constraints", "Lcom/google/android/fj7;", "b", "(Landroidx/compose/ui/layout/j;Lcom/google/android/dj7;J)Lcom/google/android/fj7;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class zf1 implements g {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(o oVar, o.a aVar) {
        o.a.z(aVar, oVar, 0, 0, 0.0f, 4, null);
        return Unit.a;
    }

    @Override // androidx.compose.ui.layout.g
    public fj7 b(j jVar, dj7 dj7Var, long j) {
        float fC1;
        float fO0 = jVar.O0(kx1.k(j));
        if (ff3.h(fO0, TimePickerKt.n) >= 0) {
            fC1 = l7d.a.b();
        } else {
            fC1 = ff3.h(fO0, TimePickerKt.o) >= 0 ? TimePickerKt.p : TimePickerKt.c1();
        }
        int iO1 = jVar.O1(fC1);
        final o oVarR0 = dj7Var.r0(kx1.INSTANCE.c(iO1, iO1));
        return j.Q1(jVar, oVarR0.getWidth(), oVarR0.getHeight(), null, new Function1() { // from class: com.google.android.yf1
            public final Object invoke(Object obj) {
                return zf1.c(oVarR0, (o.a) obj);
            }
        }, 4, null);
    }
}
