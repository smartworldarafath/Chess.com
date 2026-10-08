package androidx.compose.ui.platform;

import android.os.Looper;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import com.google.inputmethod.ko1;
import com.google.inputmethod.pr1;
import com.google.inputmethod.vn3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/platform/ComposeViewContext;", "composeViewContext", "", "b", "(Landroidx/compose/ui/platform/ComposeViewContext;)V"}, k = 3, mv = {2, 1, 0})
final class WrappedComposition$setContent$1 extends Lambda implements Function1<ComposeViewContext, Unit> {
    final /* synthetic */ Function2<androidx.compose.p004runtime.d, Integer, Unit> $content;
    final /* synthetic */ WrappedComposition this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    WrappedComposition$setContent$1(WrappedComposition wrappedComposition, Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2) {
        super(1);
        this.this$0 = wrappedComposition;
        this.$content = function2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(WrappedComposition wrappedComposition, Lifecycle lifecycle) {
        if (wrappedComposition.disposed) {
            return;
        }
        wrappedComposition.addedToLifecycle = lifecycle;
        lifecycle.c(wrappedComposition);
    }

    public final void b(final ComposeViewContext composeViewContext) {
        if (this.this$0.disposed) {
            return;
        }
        final Lifecycle lifecycle = composeViewContext.getLifecycleOwner().getLifecycle();
        this.this$0.lastContent = this.$content;
        if (this.this$0.addedToLifecycle != null) {
            if (lifecycle.getState().c(Lifecycle.State.CREATED)) {
                pr1 original = this.this$0.getOriginal();
                final WrappedComposition wrappedComposition = this.this$0;
                final Function2<androidx.compose.p004runtime.d, Integer, Unit> function2 = this.$content;
                original.c(ko1.c(-1723985096, true, new Function2<androidx.compose.p004runtime.d, Integer, Unit>() { // from class: androidx.compose.ui.platform.WrappedComposition$setContent$1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
                        return Unit.a;
                    }

                    public final void invoke(androidx.compose.p004runtime.d dVar, int i) {
                        if (!dVar.g((i & 3) != 2, i & 1)) {
                            dVar.q();
                            return;
                        }
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-1723985096, i, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous> (Wrapper.android.kt:126)");
                        }
                        AndroidComposeView owner = wrappedComposition.getOwner();
                        boolean zT = dVar.T(wrappedComposition);
                        WrappedComposition wrappedComposition2 = wrappedComposition;
                        Object objR = dVar.R();
                        if (zT || objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                            objR = new WrappedComposition$setContent$1$2$1$1(wrappedComposition2, null);
                            dVar.L(objR);
                        }
                        vn3.g(owner, (Function2) objR, dVar, 0);
                        AndroidComposeView owner2 = wrappedComposition.getOwner();
                        boolean zT2 = dVar.T(wrappedComposition);
                        WrappedComposition wrappedComposition3 = wrappedComposition;
                        Object objR2 = dVar.R();
                        if (zT2 || objR2 == androidx.compose.p004runtime.d.INSTANCE.a()) {
                            objR2 = new WrappedComposition$setContent$1$2$2$1(wrappedComposition3, null);
                            dVar.L(objR2);
                        }
                        vn3.g(owner2, (Function2) objR2, dVar, 0);
                        composeViewContext.a(wrappedComposition.getOwner(), function2, dVar, 0);
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                    }
                }));
                return;
            }
            return;
        }
        if (Intrinsics.e(Looper.myLooper(), composeViewContext.getView().getHandler().getLooper())) {
            this.this$0.addedToLifecycle = lifecycle;
            lifecycle.c(this.this$0);
        } else {
            View view = composeViewContext.getView();
            final WrappedComposition wrappedComposition2 = this.this$0;
            view.post(new Runnable() { // from class: androidx.compose.ui.platform.d0
                @Override // java.lang.Runnable
                public final void run() {
                    WrappedComposition$setContent$1.c(wrappedComposition2, lifecycle);
                }
            });
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((ComposeViewContext) obj);
        return Unit.a;
    }
}
