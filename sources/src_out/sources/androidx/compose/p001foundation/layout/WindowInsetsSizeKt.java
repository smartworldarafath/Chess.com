package androidx.compose.p001foundation.layout;

import androidx.compose.p001foundation.layout.WindowInsetsSizeKt;
import androidx.compose.p001foundation.layout.g1;
import androidx.compose.ui.b;
import androidx.compose.ui.platform.InspectableValueKt;
import com.google.inputmethod.f43;
import com.google.inputmethod.jke;
import com.google.inputmethod.jz5;
import com.google.inputmethod.pje;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0004\"\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b\"\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\b\"\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"\u0014\u0010\u0011\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/b;", "Landroidx/compose/foundation/layout/g1;", "insets", "f", "(Landroidx/compose/ui/b;Landroidx/compose/foundation/layout/g1;)Landroidx/compose/ui/b;", "e", "Lcom/google/android/jke;", "a", "Lcom/google/android/jke;", "startCalc", "b", "endCalc", "Lcom/google/android/pje;", "c", "Lcom/google/android/pje;", "topCalc", "d", "bottomCalc", "foundation-layout"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class WindowInsetsSizeKt {
    private static final jke a = new jke() { // from class: com.google.android.gke
    };
    private static final jke b = new jke() { // from class: com.google.android.gke
    };
    private static final pje c = new pje() { // from class: com.google.android.hke
        @Override // com.google.inputmethod.pje
        public final int a(g1 g1Var, f43 f43Var) {
            return WindowInsetsSizeKt.d(g1Var, f43Var);
        }
    };
    private static final pje d = new pje() { // from class: com.google.android.ike
        @Override // com.google.inputmethod.pje
        public final int a(g1 g1Var, f43 f43Var) {
            return WindowInsetsSizeKt.c(g1Var, f43Var);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(g1 g1Var, f43 f43Var) {
        return g1Var.c(f43Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(g1 g1Var, f43 f43Var) {
        return g1Var.a(f43Var);
    }

    public static final b e(b bVar, final g1 g1Var) {
        return bVar.then(new t(g1Var, InspectableValueKt.b() ? new Function1<jz5, Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt$windowInsetsBottomHeight$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            public final void a(jz5 jz5Var) {
                jz5Var.b("insetsBottomHeight");
                jz5Var.getProperties().c("insets", g1Var);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((jz5) obj);
                return Unit.a;
            }
        } : InspectableValueKt.a(), d));
    }

    public static final b f(b bVar, final g1 g1Var) {
        return bVar.then(new t(g1Var, InspectableValueKt.b() ? new Function1<jz5, Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt$windowInsetsTopHeight$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            public final void a(jz5 jz5Var) {
                jz5Var.b("insetsTopHeight");
                jz5Var.getProperties().c("insets", g1Var);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((jz5) obj);
                return Unit.a;
            }
        } : InspectableValueKt.a(), c));
    }
}
