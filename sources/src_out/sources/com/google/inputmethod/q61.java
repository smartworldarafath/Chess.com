package com.google.inputmethod;

import androidx.compose.p002material3.CardElevation;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JK\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0016\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001b\u001a\u00020\u00188G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001f\u001a\u00020\u000e*\u00020\u001c8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/google/android/q61;", "", "<init>", "()V", "Lcom/google/android/ff3;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "Landroidx/compose/material3/CardElevation;", "c", "(FFFFFFLandroidx/compose/runtime/d;II)Landroidx/compose/material3/CardElevation;", "Lcom/google/android/p61;", "a", "(Landroidx/compose/runtime/d;I)Lcom/google/android/p61;", "Lcom/google/android/ei1;", "containerColor", "contentColor", "disabledContainerColor", "disabledContentColor", "b", "(JJJJLandroidx/compose/runtime/d;II)Lcom/google/android/p61;", "Lcom/google/android/xkb;", "e", "(Landroidx/compose/runtime/d;I)Lcom/google/android/xkb;", "shape", "Lcom/google/android/yi1;", "d", "(Lcom/google/android/yi1;)Lcom/google/android/p61;", "defaultCardColors", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class q61 {
    public static final q61 a = new q61();
    public static final int b = 0;

    private q61() {
    }

    public final p61 a(d dVar, int i) {
        if (e.k()) {
            e.o(-1876034303, i, -1, "androidx.compose.material3.CardDefaults.cardColors (Card.kt:472)");
        }
        p61 p61VarD = d(kh7.a.a(dVar, 6));
        if (e.k()) {
            e.n();
        }
        return p61VarD;
    }

    public final p61 b(long j, long j2, long j3, long j4, d dVar, int i, int i2) {
        long j5;
        long jP;
        long jI = (i2 & 1) != 0 ? ei1.INSTANCE.i() : j;
        long jG = (i2 & 2) != 0 ? bj1.g(jI, dVar, i & 14) : j2;
        long jI2 = (i2 & 4) != 0 ? ei1.INSTANCE.i() : j3;
        if ((i2 & 8) != 0) {
            long j6 = jG;
            jP = ei1.p(j6, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
            j5 = j6;
        } else {
            j5 = jG;
            jP = j4;
        }
        if (e.k()) {
            e.o(-1589582123, i, -1, "androidx.compose.material3.CardDefaults.cardColors (Card.kt:490)");
        }
        p61 p61VarC = d(kh7.a.a(dVar, 6)).c(jI, j5, jI2, jP);
        if (e.k()) {
            e.n();
        }
        return p61VarC;
    }

    public final CardElevation c(float f, float f2, float f3, float f4, float f5, float f6, d dVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            f = w94.a.b();
        }
        if ((i2 & 2) != 0) {
            f2 = w94.a.j();
        }
        if ((i2 & 4) != 0) {
            f3 = w94.a.h();
        }
        if ((i2 & 8) != 0) {
            f4 = w94.a.i();
        }
        if ((i2 & 16) != 0) {
            f5 = w94.a.g();
        }
        float f7 = f5;
        if ((i2 & 32) != 0) {
            f6 = w94.a.e();
        }
        if (e.k()) {
            e.o(-574898487, i, -1, "androidx.compose.material3.CardDefaults.cardElevation (Card.kt:400)");
        }
        float f8 = f6;
        float f9 = f3;
        float f10 = f;
        CardElevation cardElevation = new CardElevation(f10, f2, f9, f4, f7, f8, null);
        if (e.k()) {
            e.n();
        }
        return cardElevation;
    }

    public final p61 d(ColorScheme colorScheme) {
        p61 defaultCardColorsCached = colorScheme.getDefaultCardColorsCached();
        if (defaultCardColorsCached != null) {
            return defaultCardColorsCached;
        }
        w94 w94Var = w94.a;
        p61 p61Var = new p61(bj1.j(colorScheme, w94Var.a()), bj1.f(colorScheme, bj1.j(colorScheme, w94Var.a())), ki1.g(ei1.p(bj1.j(colorScheme, w94Var.d()), w94Var.f(), 0.0f, 0.0f, 0.0f, 14, null), bj1.j(colorScheme, w94Var.a())), ei1.p(bj1.f(colorScheme, bj1.j(colorScheme, w94Var.a())), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.m0(p61Var);
        return p61Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final xkb e(d dVar, int i) throws NoWhenBranchMatchedException {
        if (e.k()) {
            e.o(1266660211, i, -1, "androidx.compose.material3.CardDefaults.<get-shape> (Card.kt:370)");
        }
        xkb xkbVarI = ulb.i(w94.a.c(), dVar, 6);
        if (e.k()) {
            e.n();
        }
        return xkbVarI;
    }
}
