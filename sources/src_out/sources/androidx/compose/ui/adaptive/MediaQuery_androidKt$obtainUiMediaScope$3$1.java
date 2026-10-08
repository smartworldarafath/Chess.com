package androidx.compose.ui.adaptive;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.inputmethod.gsd;
import com.google.inputmethod.jd3;
import com.google.inputmethod.k7e;
import com.google.inputmethod.kd3;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/kd3;", "Lcom/google/android/jd3;", "invoke", "(Lcom/google/android/kd3;)Lcom/google/android/jd3;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
final class MediaQuery_androidKt$obtainUiMediaScope$3$1 extends Lambda implements Function1<kd3, jd3> {
    final /* synthetic */ gsd $scope;
    final /* synthetic */ View $view;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/adaptive/MediaQuery_androidKt$obtainUiMediaScope$3$1$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements jd3 {
        final /* synthetic */ View a;
        final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener b;

        public a(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            this.a = view;
            this.b = onGlobalLayoutListener;
        }

        @Override // com.google.inputmethod.jd3
        public void dispose() {
            this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this.b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MediaQuery_androidKt$obtainUiMediaScope$3$1(View view, gsd gsdVar) {
        super(1);
        this.$view = view;
        this.$scope = gsdVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(gsd gsdVar, View view) {
        gsdVar.c(MediaQuery_androidKt.j(k7e.F(view)));
    }

    public final jd3 invoke(kd3 kd3Var) {
        final gsd gsdVar = this.$scope;
        final View view = this.$view;
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.compose.ui.adaptive.a
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                MediaQuery_androidKt$obtainUiMediaScope$3$1.b(gsdVar, view);
            }
        };
        this.$view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        return new a(this.$view, onGlobalLayoutListener);
    }
}
