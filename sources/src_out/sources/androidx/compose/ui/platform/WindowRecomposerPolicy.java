package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.p004runtime.Recomposer;
import com.google.android.fz4;
import com.google.android.n45;
import com.google.android.rw0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/platform/WindowRecomposerPolicy;", "", "<init>", "()V", "Landroid/view/View;", "rootView", "Landroidx/compose/runtime/Recomposer;", "a", "(Landroid/view/View;)Landroidx/compose/runtime/Recomposer;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/ui/platform/c0;", "b", "Ljava/util/concurrent/atomic/AtomicReference;", "factory", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WindowRecomposerPolicy {
    public static final WindowRecomposerPolicy a = new WindowRecomposerPolicy();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final AtomicReference<c0> factory = new AtomicReference<>(c0.INSTANCE.c());
    public static final int c = 8;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"androidx/compose/ui/platform/WindowRecomposerPolicy$a", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements View.OnAttachStateChangeListener {
        final /* synthetic */ kotlinx.coroutines.s a;

        a(kotlinx.coroutines.s sVar) {
            this.a = sVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v) {
            v.removeOnAttachStateChangeListener(this);
            kotlinx.coroutines.s.a.a(this.a, (CancellationException) null, 1, (Object) null);
        }
    }

    private WindowRecomposerPolicy() {
    }

    public final Recomposer a(View rootView) {
        Recomposer recomposerA = factory.get().a(rootView);
        WindowRecomposer_androidKt.k(rootView, recomposerA);
        rootView.addOnAttachStateChangeListener(new a(rw0.d(fz4.a, n45.b(rootView.getHandler(), "windowRecomposer cleanup").S0(), (CoroutineStart) null, new WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1(recomposerA, rootView, null), 2, (Object) null)));
        return recomposerA;
    }
}
