package com.google.inputmethod;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u000f\u001a\u00020\u0004*\u00020\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/google/android/thc;", "", "<init>", "()V", "Lcom/google/android/shc;", "a", "(Landroidx/compose/runtime/d;I)Lcom/google/android/shc;", "Lcom/google/android/ff3;", "b", "F", "getIconSize-D9Ej5fM", "()F", "IconSize", "Lcom/google/android/yi1;", "(Lcom/google/android/yi1;)Lcom/google/android/shc;", "defaultSwitchColors", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class thc {
    public static final thc a = new thc();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final float IconSize = ff3.i(16);

    private thc() {
    }

    public final shc a(d dVar, int i) {
        if (e.k()) {
            e.o(435552781, i, -1, "androidx.compose.material3.SwitchDefaults.colors (Switch.kt:306)");
        }
        shc shcVarB = b(kh7.a.a(dVar, 6));
        if (e.k()) {
            e.n();
        }
        return shcVarB;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final shc b(ColorScheme colorScheme) throws NoWhenBranchMatchedException {
        shc defaultSwitchColorsCached = colorScheme.getDefaultSwitchColorsCached();
        if (defaultSwitchColorsCached != null) {
            return defaultSwitchColorsCached;
        }
        whc whcVar = whc.a;
        long j = bj1.j(colorScheme, whcVar.o());
        long j2 = bj1.j(colorScheme, whcVar.r());
        ei1.Companion companion = ei1.INSTANCE;
        shc shcVar = new shc(j, j2, companion.h(), bj1.j(colorScheme, whcVar.q()), bj1.j(colorScheme, whcVar.y()), bj1.j(colorScheme, whcVar.B()), bj1.j(colorScheme, whcVar.x()), bj1.j(colorScheme, whcVar.A()), ki1.g(ei1.p(bj1.j(colorScheme, whcVar.a()), whcVar.b(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.getSurface()), ki1.g(ei1.p(bj1.j(colorScheme, whcVar.e()), whcVar.f(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.getSurface()), companion.h(), ki1.g(ei1.p(bj1.j(colorScheme, whcVar.c()), whcVar.d(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.getSurface()), ki1.g(ei1.p(bj1.j(colorScheme, whcVar.g()), whcVar.h(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.getSurface()), ki1.g(ei1.p(bj1.j(colorScheme, whcVar.k()), whcVar.f(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.getSurface()), ki1.g(ei1.p(bj1.j(colorScheme, whcVar.l()), whcVar.f(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.getSurface()), ki1.g(ei1.p(bj1.j(colorScheme, whcVar.i()), whcVar.j(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.getSurface()), null);
        colorScheme.v0(shcVar);
        return shcVar;
    }
}
