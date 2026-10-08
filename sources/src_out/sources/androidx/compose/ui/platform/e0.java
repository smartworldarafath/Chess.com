package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.node.LayoutNode;
import com.google.android.dt4;
import com.google.android.ws4;
import com.google.inputmethod.dsd;
import com.google.inputmethod.o41;
import com.google.inputmethod.pr1;
import com.google.inputmethod.xy9;
import com.google.inputmethod.yr1;
import com.google.inputmethod.z0;
import java.util.Collections;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a)\u0010\f\u001a\u00020\u000b*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0001¢\u0006\u0004\b\f\u0010\r\"\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "container", "Lcom/google/android/z0;", "a", "(Landroidx/compose/ui/node/LayoutNode;)Lcom/google/android/z0;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroidx/compose/ui/platform/ComposeViewContext;", "composeViewContext", "Lkotlin/Function0;", "", "content", "Lcom/google/android/pr1;", "b", "(Landroidx/compose/ui/platform/AbstractComposeView;Landroidx/compose/ui/platform/ComposeViewContext;Lkotlin/jvm/functions/Function2;)Lcom/google/android/pr1;", "Landroid/view/ViewGroup$LayoutParams;", "Landroid/view/ViewGroup$LayoutParams;", "DefaultLayoutParams", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e0 {
    private static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final /* synthetic */ class a implements LifecycleRetainedValuesStoreOwner.a, dt4 {
        final /* synthetic */ androidx.compose.p004runtime.f a;

        a(androidx.compose.p004runtime.f fVar) {
            this.a = fVar;
        }

        @Override // androidx.compose.ui.platform.LifecycleRetainedValuesStoreOwner.a
        public final o41 a(Function0<Unit> function0) {
            return this.a.w(function0);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof LifecycleRetainedValuesStoreOwner.a) && (obj instanceof dt4)) {
                return Intrinsics.e(getFunctionDelegate(), ((dt4) obj).getFunctionDelegate());
            }
            return false;
        }

        public final ws4<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, this.a, androidx.compose.p004runtime.f.class, "scheduleFrameEndCallback", "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public static final z0<LayoutNode> a(LayoutNode layoutNode) {
        return new dsd(layoutNode);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    /* JADX WARN: Code duplicated, block: B:16:0x0042  */
    /* JADX WARN: Code duplicated, block: B:24:0x006f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0074  */
    public static final pr1 b(AbstractComposeView abstractComposeView, ComposeViewContext composeViewContext, Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2) {
        AndroidComposeView androidComposeView;
        WrappedComposition wrappedComposition;
        GlobalSnapshotManager.a.b();
        if (abstractComposeView.getChildCount() > 0) {
            View childAt = abstractComposeView.getChildAt(0);
            androidComposeView = childAt instanceof AndroidComposeView ? (AndroidComposeView) childAt : null;
            if (androidComposeView != null) {
                androidComposeView.setComposeViewContext(composeViewContext);
            }
            if (androidComposeView == null) {
                androidComposeView = new AndroidComposeView(abstractComposeView.getContext(), composeViewContext);
                abstractComposeView.addView(androidComposeView.getView(), a);
            }
            androidComposeView.setComposeViewContext(composeViewContext);
            if (abstractComposeView.getComposeViewContext() != null) {
                composeViewContext.w();
                androidComposeView.setComposeViewContextIncrementedDuringInit$ui(true);
            }
            if (InspectableValueKt.b() && androidComposeView.getTag(xy9.M) == null) {
                androidComposeView.setTag(xy9.M, Collections.newSetFromMap(new WeakHashMap()));
            }
            Object tag = androidComposeView.getTag(xy9.N);
            wrappedComposition = tag instanceof WrappedComposition ? (WrappedComposition) tag : null;
            if (wrappedComposition == null) {
                wrappedComposition = new WrappedComposition(androidComposeView, yr1.a(new dsd(androidComposeView.getRoot()), composeViewContext.getCompositionContext()));
                androidComposeView.setTag(xy9.N, wrappedComposition);
            }
            wrappedComposition.c(function2);
            androidComposeView.setFrameEndScheduler$ui(new a(composeViewContext.getCompositionContext()));
            return wrappedComposition;
        }
        abstractComposeView.removeAllViews();
        androidComposeView = null;
        if (androidComposeView == null) {
            androidComposeView = new AndroidComposeView(abstractComposeView.getContext(), composeViewContext);
            abstractComposeView.addView(androidComposeView.getView(), a);
        }
        androidComposeView.setComposeViewContext(composeViewContext);
        if (abstractComposeView.getComposeViewContext() != null) {
            composeViewContext.w();
            androidComposeView.setComposeViewContextIncrementedDuringInit$ui(true);
        }
        if (InspectableValueKt.b()) {
            androidComposeView.setTag(xy9.M, Collections.newSetFromMap(new WeakHashMap()));
        }
        Object tag2 = androidComposeView.getTag(xy9.N);
        if (tag2 instanceof WrappedComposition) {
        }
        if (wrappedComposition == null) {
            wrappedComposition = new WrappedComposition(androidComposeView, yr1.a(new dsd(androidComposeView.getRoot()), composeViewContext.getCompositionContext()));
            androidComposeView.setTag(xy9.N, wrappedComposition);
        }
        wrappedComposition.c(function2);
        androidComposeView.setFrameEndScheduler$ui(new a(composeViewContext.getCompositionContext()));
        return wrappedComposition;
    }
}
