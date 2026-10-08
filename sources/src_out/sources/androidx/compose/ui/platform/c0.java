package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.p004runtime.Recomposer;
import androidx.compose.ui.platform.c0;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bç\u0080\u0001\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/c0;", "", "Landroid/view/View;", "windowRootView", "Landroidx/compose/runtime/Recomposer;", "a", "(Landroid/view/View;)Landroidx/compose/runtime/Recomposer;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface c0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.a;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.c0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/c0$a;", "", "<init>", "()V", "Landroidx/compose/ui/platform/c0;", "b", "Landroidx/compose/ui/platform/c0;", "c", "()Landroidx/compose/ui/platform/c0;", "LifecycleAware", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion a = new Companion();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private static final c0 LifecycleAware = new c0() { // from class: com.google.android.tke
            @Override // androidx.compose.ui.platform.c0
            public final Recomposer a(View view) {
                return c0.Companion.b(view);
            }
        };

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Recomposer b(View view) {
            return WindowRecomposer_androidKt.d(view, null, null, 3, null);
        }

        public final c0 c() {
            return LifecycleAware;
        }
    }

    Recomposer a(View windowRootView);
}
