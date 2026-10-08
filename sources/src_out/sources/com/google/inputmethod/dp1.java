package com.google.inputmethod;

import androidx.compose.p001foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import com.google.android.ts4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class dp1 {
    public static final dp1 a = new dp1();
    private static ts4<rrc, grc, Function0<? extends kn6>, d, Integer, Unit> b = ko1.c(129995601, false, new ts4() { // from class: com.google.android.ap1
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            return dp1.f((rrc) obj, (grc) obj2, (Function0) obj3, (d) obj4, ((Integer) obj5).intValue());
        }
    });
    private static ts4<rrc, grc, Function0<? extends kn6>, d, Integer, Unit> c = ko1.c(636288403, false, new ts4() { // from class: com.google.android.bp1
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            return dp1.g((rrc) obj, (grc) obj2, (Function0) obj3, (d) obj4, ((Integer) obj5).intValue());
        }
    });
    private static ts4<rrc, grc, Function0<? extends kn6>, d, Integer, Unit> d = ko1.c(-1357803046, false, new ts4() { // from class: com.google.android.cp1
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            return dp1.h((rrc) obj, (grc) obj2, (Function0) obj3, (d) obj4, ((Integer) obj5).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(rrc rrcVar, grc grcVar, Function0 function0, d dVar, int i) {
        int i2;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? dVar.x(rrcVar) : dVar.T(rrcVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? dVar.x(grcVar) : dVar.T(grcVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dVar.T(function0) ? 256 : 128;
        }
        if (dVar.g((i2 & 1171) != 1170, i2 & 1)) {
            if (e.k()) {
                e.o(129995601, i2, -1, "androidx.compose.foundation.text.contextmenu.internal.ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt.lambda$129995601.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:75)");
            }
            DefaultTextContextMenuDropdownProvider_androidKt.t(rrcVar, grcVar, function0, dVar, i2 & 1022);
            if (e.k()) {
                e.n();
            }
        } else {
            dVar.q();
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(rrc rrcVar, grc grcVar, Function0 function0, d dVar, int i) {
        int i2;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? dVar.x(rrcVar) : dVar.T(rrcVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? dVar.x(grcVar) : dVar.T(grcVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dVar.T(function0) ? 256 : 128;
        }
        if (dVar.g((i2 & 1171) != 1170, i2 & 1)) {
            if (e.k()) {
                e.o(636288403, i2, -1, "androidx.compose.foundation.text.contextmenu.internal.ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt.lambda$636288403.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:90)");
            }
            DefaultTextContextMenuDropdownProvider_androidKt.t(rrcVar, grcVar, function0, dVar, i2 & 1022);
            if (e.k()) {
                e.n();
            }
        } else {
            dVar.q();
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(rrc rrcVar, grc grcVar, Function0 function0, d dVar, int i) {
        int i2;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? dVar.x(rrcVar) : dVar.T(rrcVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? dVar.x(grcVar) : dVar.T(grcVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dVar.T(function0) ? 256 : 128;
        }
        if (dVar.g((i2 & 1171) != 1170, i2 & 1)) {
            if (e.k()) {
                e.o(-1357803046, i2, -1, "androidx.compose.foundation.text.contextmenu.internal.ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt.lambda$-1357803046.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:99)");
            }
            DefaultTextContextMenuDropdownProvider_androidKt.t(rrcVar, grcVar, function0, dVar, i2 & 1022);
            if (e.k()) {
                e.n();
            }
        } else {
            dVar.q();
        }
        return Unit.a;
    }

    public final ts4<rrc, grc, Function0<? extends kn6>, d, Integer, Unit> d() {
        return d;
    }

    public final ts4<rrc, grc, Function0<? extends kn6>, d, Integer, Unit> e() {
        return c;
    }
}
