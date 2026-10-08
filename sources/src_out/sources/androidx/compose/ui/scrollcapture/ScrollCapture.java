package androidx.compose.ui.scrollcapture;

import android.graphics.Point;
import android.view.ScrollCaptureTarget;
import android.view.View;
import androidx.compose.p004runtime.s0;
import com.google.android.zk1;
import com.google.inputmethod.b9b;
import com.google.inputmethod.d9b;
import com.google.inputmethod.g16;
import com.google.inputmethod.gba;
import com.google.inputmethod.hfb;
import com.google.inputmethod.jba;
import com.google.inputmethod.l16;
import com.google.inputmethod.ln6;
import com.google.inputmethod.o58;
import com.google.inputmethod.r58;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.j;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0003R+\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/scrollcapture/ScrollCapture;", "Landroidx/compose/ui/scrollcapture/ComposeScrollCaptureCallback$a;", "<init>", "()V", "Landroid/view/View;", "view", "Lcom/google/android/hfb;", "semanticsOwner", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Ljava/util/function/Consumer;", "Landroid/view/ScrollCaptureTarget;", "targets", "", "d", "(Landroid/view/View;Lcom/google/android/hfb;Lkotlin/coroutines/CoroutineContext;Ljava/util/function/Consumer;)V", "b", "a", "", "<set-?>", "Lcom/google/android/o58;", "c", "()Z", "e", "(Z)V", "scrollCaptureInProgress", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScrollCapture implements ComposeScrollCaptureCallback.a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final o58 scrollCaptureInProgress = s0.e(Boolean.FALSE, null, 2, null);

    private final void e(boolean z) {
        this.scrollCaptureInProgress.setValue(Boolean.valueOf(z));
    }

    @Override // androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback.a
    public void a() {
        e(false);
    }

    @Override // androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback.a
    public void b() {
        e(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c() {
        return ((Boolean) this.scrollCaptureInProgress.getValue()).booleanValue();
    }

    public final void d(View view, hfb semanticsOwner, CoroutineContext coroutineContext, Consumer<ScrollCaptureTarget> targets) {
        r58 r58Var = new r58(new ScrollCaptureCandidate[16], 0);
        c.e(semanticsOwner.d(), 0, new ScrollCapture$onScrollCaptureSearch$1(r58Var), 2, null);
        r58Var.A(zk1.c(new Function1[]{new Function1<ScrollCaptureCandidate, Comparable<?>>() { // from class: androidx.compose.ui.scrollcapture.ScrollCapture$onScrollCaptureSearch$2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Comparable<?> invoke(ScrollCaptureCandidate scrollCaptureCandidate) {
                return Integer.valueOf(scrollCaptureCandidate.getDepth());
            }
        }, new Function1<ScrollCaptureCandidate, Comparable<?>>() { // from class: androidx.compose.ui.scrollcapture.ScrollCapture$onScrollCaptureSearch$3
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Comparable<?> invoke(ScrollCaptureCandidate scrollCaptureCandidate) {
                return Integer.valueOf(scrollCaptureCandidate.getViewportBoundsInWindow().j());
            }
        }}));
        ScrollCaptureCandidate scrollCaptureCandidate = (ScrollCaptureCandidate) (r58Var.getSize() != 0 ? r58Var.content[r58Var.getSize() - 1] : null);
        if (scrollCaptureCandidate == null) {
            return;
        }
        ComposeScrollCaptureCallback composeScrollCaptureCallback = new ComposeScrollCaptureCallback(scrollCaptureCandidate.getNode(), scrollCaptureCandidate.getViewportBoundsInWindow(), j.a(coroutineContext), this, view);
        gba gbaVarB = ln6.b(scrollCaptureCandidate.getCoordinates());
        long jP = scrollCaptureCandidate.getViewportBoundsInWindow().p();
        ScrollCaptureTarget scrollCaptureTargetA = d9b.a(view, jba.a(l16.c(gbaVarB)), new Point(g16.k(jP), g16.l(jP)), b9b.a(composeScrollCaptureCallback));
        scrollCaptureTargetA.setScrollBounds(jba.a(scrollCaptureCandidate.getViewportBoundsInWindow()));
        targets.accept(scrollCaptureTargetA);
    }
}
