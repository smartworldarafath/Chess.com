package androidx.compose.ui.platform;

import androidx.lifecycle.Lifecycle;
import com.google.inputmethod.n17;
import com.google.inputmethod.pr1;
import com.google.inputmethod.xy9;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0017¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001fR\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u001c\u0010'\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"Landroidx/compose/ui/platform/WrappedComposition;", "Lcom/google/android/pr1;", "Landroidx/lifecycle/i;", "", "Landroidx/compose/ui/platform/AndroidComposeView;", "owner", "original", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;Lcom/google/android/pr1;)V", "Lkotlin/Function0;", "", "content", "c", "(Lkotlin/jvm/functions/Function2;)V", "dispose", "()V", "Lcom/google/android/n17;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "d6", "(Lcom/google/android/n17;Landroidx/lifecycle/Lifecycle$Event;)V", "a", "Landroidx/compose/ui/platform/AndroidComposeView;", "C", "()Landroidx/compose/ui/platform/AndroidComposeView;", "b", "Lcom/google/android/pr1;", "B", "()Lcom/google/android/pr1;", "", "Z", "disposed", "Landroidx/lifecycle/Lifecycle;", "d", "Landroidx/lifecycle/Lifecycle;", "addedToLifecycle", "e", "Lkotlin/jvm/functions/Function2;", "lastContent", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class WrappedComposition implements pr1, androidx.lifecycle.i {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AndroidComposeView owner;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final pr1 original;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean disposed;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private Lifecycle addedToLifecycle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> lastContent = ComposableSingletons$Wrapper_androidKt.a.a();

    public WrappedComposition(AndroidComposeView androidComposeView, pr1 pr1Var) {
        this.owner = androidComposeView;
        this.original = pr1Var;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final pr1 getOriginal() {
        return this.original;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final AndroidComposeView getOwner() {
        return this.owner;
    }

    @Override // com.google.inputmethod.pr1
    public void c(Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> content) {
        this.owner.setOnReadyForComposition(new WrappedComposition$setContent$1(this, content));
    }

    @Override // androidx.lifecycle.i
    public void d6(n17 source, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            dispose();
        } else {
            if (event != Lifecycle.Event.ON_CREATE || this.disposed) {
                return;
            }
            c(this.lastContent);
        }
    }

    @Override // com.google.inputmethod.pr1
    public void dispose() {
        if (!this.disposed) {
            this.disposed = true;
            this.owner.getView().setTag(xy9.N, null);
            Lifecycle lifecycle = this.addedToLifecycle;
            if (lifecycle != null) {
                lifecycle.g(this);
            }
            this.addedToLifecycle = null;
        }
        this.original.dispose();
    }
}
