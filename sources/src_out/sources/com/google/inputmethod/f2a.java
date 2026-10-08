package com.google.inputmethod;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\n\u001a\u00020\u0004*\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/google/android/f2a;", "", "<init>", "()V", "Lcom/google/android/e2a;", "a", "(Landroidx/compose/runtime/d;I)Lcom/google/android/e2a;", "Lcom/google/android/yi1;", "b", "(Lcom/google/android/yi1;)Lcom/google/android/e2a;", "defaultRadioButtonColors", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f2a {
    public static final f2a a = new f2a();

    private f2a() {
    }

    public final e2a a(d dVar, int i) {
        if (e.k()) {
            e.o(-1191566130, i, -1, "androidx.compose.material3.RadioButtonDefaults.colors (RadioButton.kt:135)");
        }
        e2a e2aVarB = b(kh7.a.a(dVar, 6));
        if (e.k()) {
            e.n();
        }
        return e2aVarB;
    }

    public final e2a b(ColorScheme colorScheme) {
        e2a defaultRadioButtonColorsCached = colorScheme.getDefaultRadioButtonColorsCached();
        if (defaultRadioButtonColorsCached != null) {
            return defaultRadioButtonColorsCached;
        }
        j2a j2aVar = j2a.a;
        e2a e2aVar = new e2a(bj1.j(colorScheme, j2aVar.d()), bj1.j(colorScheme, j2aVar.f()), ei1.p(bj1.j(colorScheme, j2aVar.a()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ei1.p(bj1.j(colorScheme, j2aVar.b()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.u0(e2aVar);
        return e2aVar;
    }
}
