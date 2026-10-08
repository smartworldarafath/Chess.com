package com.google.inputmethod;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import com.google.android.ps4;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class kp1 {
    public static final kp1 a = new kp1();
    private static ps4<jvb, d, Integer, Unit> b = ko1.c(-1548712596, false, a.a);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a implements ps4<jvb, d, Integer, Unit> {
        public static final a a = new a();

        a() {
        }

        public final void a(jvb jvbVar, d dVar, int i) {
            jvb jvbVar2;
            int i2;
            if ((i & 6) == 0) {
                jvbVar2 = jvbVar;
                i2 = i | (dVar.x(jvbVar2) ? 4 : 2);
            } else {
                jvbVar2 = jvbVar;
                i2 = i;
            }
            if (!dVar.g((i2 & 19) != 18, i2 & 1)) {
                dVar.q();
                return;
            }
            if (e.k()) {
                e.o(-1548712596, i2, -1, "androidx.compose.material3.ComposableSingletons$SnackbarHostKt.lambda$-1548712596.<anonymous> (SnackbarHost.kt:219)");
            }
            tvb.j(jvbVar2, null, false, null, 0L, 0L, 0L, 0L, 0L, dVar, i2 & 14, 510);
            if (e.k()) {
                e.n();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((jvb) obj, (d) obj2, ((Number) obj3).intValue());
            return Unit.a;
        }
    }

    public final ps4<jvb, d, Integer, Unit> a() {
        return b;
    }
}
