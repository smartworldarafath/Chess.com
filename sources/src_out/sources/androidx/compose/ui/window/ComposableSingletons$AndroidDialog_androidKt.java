package androidx.compose.ui.window;

import com.google.inputmethod.ko1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class ComposableSingletons$AndroidDialog_androidKt {
    public static final ComposableSingletons$AndroidDialog_androidKt a = new ComposableSingletons$AndroidDialog_androidKt();
    private static Function2<androidx.compose.p004runtime.d, Integer, Unit> b = ko1.c(210148896, false, new Function2<androidx.compose.p004runtime.d, Integer, Unit>() { // from class: androidx.compose.ui.window.ComposableSingletons$AndroidDialog_androidKt$lambda$210148896$1
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
                androidx.compose.p004runtime.e.o(210148896, i2, -1, "androidx.compose.ui.window.ComposableSingletons$AndroidDialog_androidKt.lambda$210148896.<anonymous> (AndroidDialog.android.kt:301)");
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
