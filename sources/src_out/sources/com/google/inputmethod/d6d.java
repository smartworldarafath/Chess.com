package com.google.inputmethod;

import androidx.compose.p002material3.TimePickerKt;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tR\u0018\u0010\r\u001a\u00020\u0004*\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/google/android/d6d;", "", "<init>", "()V", "Lcom/google/android/c6d;", "a", "(Landroidx/compose/runtime/d;I)Lcom/google/android/c6d;", "Landroidx/compose/material3/l2;", "c", "(Landroidx/compose/runtime/d;I)I", "Lcom/google/android/yi1;", "b", "(Lcom/google/android/yi1;)Lcom/google/android/c6d;", "defaultTimePickerColors", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d6d {
    public static final d6d a = new d6d();

    private d6d() {
    }

    public final c6d a(d dVar, int i) {
        if (e.k()) {
            e.o(-2085808058, i, -1, "androidx.compose.material3.TimePickerDefaults.colors (TimePicker.kt:284)");
        }
        c6d c6dVarB = b(kh7.a.a(dVar, 6));
        if (e.k()) {
            e.n();
        }
        return c6dVarB;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final c6d b(ColorScheme colorScheme) throws NoWhenBranchMatchedException {
        c6d defaultTimePickerColorsCached = colorScheme.getDefaultTimePickerColorsCached();
        if (defaultTimePickerColorsCached != null) {
            return defaultTimePickerColorsCached;
        }
        l7d l7dVar = l7d.a;
        c6d c6dVar = new c6d(bj1.j(colorScheme, l7dVar.a()), bj1.j(colorScheme, l7dVar.f()), bj1.j(colorScheme, l7dVar.j()), bj1.j(colorScheme, l7dVar.n()), bj1.j(colorScheme, l7dVar.d()), bj1.j(colorScheme, l7dVar.i()), bj1.j(colorScheme, l7dVar.p()), ei1.INSTANCE.h(), bj1.j(colorScheme, l7dVar.q()), bj1.j(colorScheme, l7dVar.r()), bj1.j(colorScheme, l7dVar.y()), bj1.j(colorScheme, l7dVar.A()), bj1.j(colorScheme, l7dVar.z()), bj1.j(colorScheme, l7dVar.B()), null);
        colorScheme.y0(c6dVar);
        return c6dVar;
    }

    public final int c(d dVar, int i) {
        if (e.k()) {
            e.o(517161502, i, -1, "androidx.compose.material3.TimePickerDefaults.layoutType (TimePicker.kt:381)");
        }
        int iD1 = TimePickerKt.d1(dVar, 0);
        if (e.k()) {
            e.n();
        }
        return iD1;
    }
}
