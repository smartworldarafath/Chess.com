package androidx.compose.ui.layout;

import com.google.inputmethod.ko1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class ComposableSingletons$SubcomposeLayoutKt {
    public static final ComposableSingletons$SubcomposeLayoutKt a = new ComposableSingletons$SubcomposeLayoutKt();
    private static Function2<androidx.compose.p004runtime.d, Integer, Unit> b = ko1.c(641200809, false, new Function2<androidx.compose.p004runtime.d, Integer, Unit>() { // from class: androidx.compose.ui.layout.ComposableSingletons$SubcomposeLayoutKt$lambda$641200809$1
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
            return Unit.a;
        }

        public final void invoke(androidx.compose.p004runtime.d dVar, int i2) {
            if (!dVar.g((i2 & 3) != 2, i2 & 1)) {
                dVar.q();
                return;
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(641200809, i2, -1, "androidx.compose.ui.layout.ComposableSingletons$SubcomposeLayoutKt.lambda$641200809.<anonymous> (SubcomposeLayout.kt:640)");
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        }
    });

    public final Function2<androidx.compose.p004runtime.d, Integer, Unit> a() {
        return b;
    }
}
