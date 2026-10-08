package com.google.inputmethod;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class fp1 {
    public static final fp1 a = new fp1();
    private static Function2<d, Integer, Unit> b = ko1.c(1121996006, false, b.a);
    private static Function2<d, Integer, Unit> c = ko1.c(-655173438, false, a.a);
    private static Function2<d, Integer, Unit> d = ko1.c(1716959002, false, c.a);

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
                e.o(-655173438, i, -1, "androidx.compose.material3.ComposableSingletons$ModalBottomSheetKt.lambda$-655173438.<anonymous> (ModalBottomSheet.kt:232)");
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
                e.o(1121996006, i, -1, "androidx.compose.material3.ComposableSingletons$ModalBottomSheetKt.lambda$1121996006.<anonymous> (ModalBottomSheet.kt:133)");
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
    static final class c implements Function2<d, Integer, Unit> {
        public static final c a = new c();

        c() {
        }

        public final void a(d dVar, int i) {
            if (!dVar.g((i & 3) != 2, i & 1)) {
                dVar.q();
                return;
            }
            if (e.k()) {
                e.o(1716959002, i, -1, "androidx.compose.material3.ComposableSingletons$ModalBottomSheetKt.lambda$1716959002.<anonymous> (ModalBottomSheet.kt:269)");
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

    public final Function2<d, Integer, Unit> a() {
        return b;
    }

    public final Function2<d, Integer, Unit> b() {
        return d;
    }
}
