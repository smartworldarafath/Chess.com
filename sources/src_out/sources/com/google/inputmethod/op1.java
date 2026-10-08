package com.google.inputmethod;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import com.google.android.ps4;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class op1 {
    public static final op1 a = new op1();
    private static ps4<hra, d, Integer, Unit> b = ko1.c(1425358052, false, b.a);
    private static ps4<hra, d, Integer, Unit> c = ko1.c(-1179219109, false, a.a);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a implements ps4<hra, d, Integer, Unit> {
        public static final a a = new a();

        a() {
        }

        public final void a(hra hraVar, d dVar, int i) {
            if (!dVar.g((i & 17) != 16, i & 1)) {
                dVar.q();
                return;
            }
            if (e.k()) {
                e.o(-1179219109, i, -1, "androidx.compose.material3.ComposableSingletons$TimePickerKt.lambda$-1179219109.<anonymous> (TimePicker.kt:1346)");
            }
            rbc.Companion companion = rbc.INSTANCE;
            qxc.j(vbc.b(rbc.a(wz9.Q), dVar, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, dVar, 0, 0, 262142);
            if (e.k()) {
                e.n();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((hra) obj, (d) obj2, ((Number) obj3).intValue());
            return Unit.a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class b implements ps4<hra, d, Integer, Unit> {
        public static final b a = new b();

        b() {
        }

        public final void a(hra hraVar, d dVar, int i) {
            if (!dVar.g((i & 17) != 16, i & 1)) {
                dVar.q();
                return;
            }
            if (e.k()) {
                e.o(1425358052, i, -1, "androidx.compose.material3.ComposableSingletons$TimePickerKt.lambda$1425358052.<anonymous> (TimePicker.kt:1328)");
            }
            rbc.Companion companion = rbc.INSTANCE;
            qxc.j(vbc.b(rbc.a(wz9.J), dVar, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, dVar, 0, 0, 262142);
            if (e.k()) {
                e.n();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((hra) obj, (d) obj2, ((Number) obj3).intValue());
            return Unit.a;
        }
    }

    public final ps4<hra, d, Integer, Unit> a() {
        return c;
    }

    public final ps4<hra, d, Integer, Unit> b() {
        return b;
    }
}
