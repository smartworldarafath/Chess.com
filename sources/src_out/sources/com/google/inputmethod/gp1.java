package com.google.inputmethod;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class gp1 {
    public static final gp1 a = new gp1();
    private static Function2<d, Integer, Unit> b = ko1.c(-1294623166, false, a.a);
    private static Function2<d, Integer, Unit> c = ko1.c(-91331245, false, b.a);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a implements Function2<d, Integer, Unit> {
        public static final a a = new a();

        a() {
        }

        public final void a(d dVar, int i) {
            if (!dVar.g((i & 3) != 2, i & 1)) {
                dVar.q();
                return;
            }
            if (e.k()) {
                e.o(-1294623166, i, -1, "androidx.compose.material3.ComposableSingletons$ModalBottomSheet_androidKt.lambda$-1294623166.<anonymous> (ModalBottomSheet.android.kt:338)");
            }
            ss0.a.c(null, 0.0f, 0.0f, null, 0L, dVar, 196608, 31);
            if (e.k()) {
                e.n();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((d) obj, ((Number) obj2).intValue());
            return Unit.a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class b implements Function2<d, Integer, Unit> {
        public static final b a = new b();

        b() {
        }

        public final void a(d dVar, int i) {
            if (!dVar.g((i & 3) != 2, i & 1)) {
                dVar.q();
                return;
            }
            if (e.k()) {
                e.o(-91331245, i, -1, "androidx.compose.material3.ComposableSingletons$ModalBottomSheet_androidKt.lambda$-91331245.<anonymous> (ModalBottomSheet.android.kt:422)");
            }
            if (e.k()) {
                e.n();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((d) obj, ((Number) obj2).intValue());
            return Unit.a;
        }
    }

    public final Function2<d, Integer, Unit> a() {
        return c;
    }
}
