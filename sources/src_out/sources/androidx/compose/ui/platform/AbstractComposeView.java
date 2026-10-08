package androidx.compose.ui.platform;

import android.content.Context;
import android.os.IBinder;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p004runtime.Recomposer;
import com.google.android.e0b;
import com.google.android.ibe;
import com.google.inputmethod.fbe;
import com.google.inputmethod.jbe;
import com.google.inputmethod.ko1;
import com.google.inputmethod.n17;
import com.google.inputmethod.pr1;
import com.google.inputmethod.u9e;
import com.google.inputmethod.xy9;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\fJ\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\fJ\u0017\u0010\u001d\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\nH'¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\n¢\u0006\u0004\b%\u0010\fJ\u0017\u0010%\u001a\u00020\n2\u0006\u0010&\u001a\u00020\u0013H\u0007¢\u0006\u0004\b%\u0010'J\r\u0010(\u001a\u00020\n¢\u0006\u0004\b(\u0010\fJ\u000f\u0010)\u001a\u00020\nH\u0014¢\u0006\u0004\b)\u0010\fJ\u001f\u0010,\u001a\u00020\n2\u0006\u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u0006H\u0004¢\u0006\u0004\b,\u0010-J\u001f\u0010/\u001a\u00020\n2\u0006\u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u0006H\u0010¢\u0006\u0004\b.\u0010-J7\u00106\u001a\u00020\n2\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020\u00062\u0006\u00103\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u0006H\u0004¢\u0006\u0004\b6\u00107J7\u00109\u001a\u00020\n2\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020\u00062\u0006\u00103\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u0006H\u0010¢\u0006\u0004\b8\u00107J\u0017\u0010;\u001a\u00020\n2\u0006\u0010:\u001a\u00020\u0006H\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u000200H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020\n2\u0006\u0010=\u001a\u000200H\u0016¢\u0006\u0004\b?\u0010@J\u0019\u0010B\u001a\u00020\n2\b\u0010A\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\bB\u0010CJ!\u0010B\u001a\u00020\n2\b\u0010A\u001a\u0004\u0018\u00010\u00162\u0006\u0010D\u001a\u00020\u0006H\u0016¢\u0006\u0004\bB\u0010EJ)\u0010B\u001a\u00020\n2\b\u0010A\u001a\u0004\u0018\u00010\u00162\u0006\u0010F\u001a\u00020\u00062\u0006\u0010G\u001a\u00020\u0006H\u0016¢\u0006\u0004\bB\u0010HJ#\u0010B\u001a\u00020\n2\b\u0010A\u001a\u0004\u0018\u00010\u00162\b\u0010J\u001a\u0004\u0018\u00010IH\u0016¢\u0006\u0004\bB\u0010KJ+\u0010B\u001a\u00020\n2\b\u0010A\u001a\u0004\u0018\u00010\u00162\u0006\u0010D\u001a\u00020\u00062\b\u0010J\u001a\u0004\u0018\u00010IH\u0016¢\u0006\u0004\bB\u0010LJ+\u0010M\u001a\u0002002\b\u0010A\u001a\u0004\u0018\u00010\u00162\u0006\u0010D\u001a\u00020\u00062\b\u0010J\u001a\u0004\u0018\u00010IH\u0014¢\u0006\u0004\bM\u0010NJ3\u0010M\u001a\u0002002\b\u0010A\u001a\u0004\u0018\u00010\u00162\u0006\u0010D\u001a\u00020\u00062\b\u0010J\u001a\u0004\u0018\u00010I2\u0006\u0010O\u001a\u000200H\u0014¢\u0006\u0004\bM\u0010PJ\u000f\u0010Q\u001a\u000200H\u0016¢\u0006\u0004\bQ\u0010>R\u001e\u0010S\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR(\u0010W\u001a\u0004\u0018\u00010U2\b\u0010V\u001a\u0004\u0018\u00010U8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u0018\u0010\\\u001a\u0004\u0018\u00010[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R(\u0010^\u001a\u0004\u0018\u00010\r2\b\u0010V\u001a\u0004\u0018\u00010\r8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b^\u0010_\"\u0004\b`\u0010\u001eR4\u0010&\u001a\u0004\u0018\u00010\u00132\b\u0010V\u001a\u0004\u0018\u00010\u00138\u0000@@X\u0081\u000e¢\u0006\u0018\n\u0004\b&\u0010a\u0012\u0004\bd\u0010\f\u001a\u0004\bb\u0010\u0015\"\u0004\bc\u0010'R$\u0010f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bf\u0010g\u0012\u0004\bh\u0010\fR0\u0010i\u001a\u0002002\u0006\u0010V\u001a\u0002008\u0006@FX\u0087\u000e¢\u0006\u0018\n\u0004\bi\u0010j\u0012\u0004\bm\u0010\f\u001a\u0004\bk\u0010>\"\u0004\bl\u0010@R\u0016\u0010n\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010jR\u0016\u0010o\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010jR\u0018\u0010p\u001a\u000200*\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bp\u0010qR\u0014\u0010s\u001a\u0002008TX\u0094\u0004¢\u0006\u0006\u001a\u0004\br\u0010>R$\u0010x\u001a\u00020t2\u0006\u0010V\u001a\u00020t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bu\u0010v\"\u0004\bw\u0010<R\u0011\u0010z\u001a\u0002008F¢\u0006\u0006\u001a\u0004\by\u0010>¨\u0006{"}, d2 = {"Landroidx/compose/ui/platform/AbstractComposeView;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "checkAddView", "()V", "Landroidx/compose/runtime/f;", "cacheIfAlive", "(Landroidx/compose/runtime/f;)Landroidx/compose/runtime/f;", "resolveParentCompositionContext", "()Landroidx/compose/runtime/f;", "ensureCompositionCreated", "Landroidx/compose/ui/platform/ComposeViewContext;", "resolveComposeViewContext", "()Landroidx/compose/ui/platform/ComposeViewContext;", "Landroid/view/View;", "contextView", "existingContext", "updateAutoCreatedComposeViewContext", "(Landroid/view/View;Landroidx/compose/ui/platform/ComposeViewContext;)Landroidx/compose/ui/platform/ComposeViewContext;", "attachedToWindow", "parent", "setParentCompositionContext", "(Landroidx/compose/runtime/f;)V", "Landroidx/compose/ui/platform/ViewCompositionStrategy;", "strategy", "setViewCompositionStrategy", "(Landroidx/compose/ui/platform/ViewCompositionStrategy;)V", "Content", "(Landroidx/compose/runtime/d;I)V", "createComposition", "composeViewContext", "(Landroidx/compose/ui/platform/ComposeViewContext;)V", "disposeComposition", "onAttachedToWindow", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "internalOnMeasure$ui", "internalOnMeasure", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "internalOnLayout$ui", "internalOnLayout", "layoutDirection", "onRtlPropertiesChanged", "(I)V", "isTransitionGroup", "()Z", "setTransitionGroup", "(Z)V", "child", "addView", "(Landroid/view/View;)V", "index", "(Landroid/view/View;I)V", "width", "height", "(Landroid/view/View;II)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V", "addViewInLayout", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)Z", "preventRequestLayout", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)Z", "shouldDelayChildPressedState", "Ljava/lang/ref/WeakReference;", "cachedViewTreeCompositionContext", "Ljava/lang/ref/WeakReference;", "Landroid/os/IBinder;", "value", "previousAttachedWindowToken", "Landroid/os/IBinder;", "setPreviousAttachedWindowToken", "(Landroid/os/IBinder;)V", "Lcom/google/android/pr1;", "composition", "Lcom/google/android/pr1;", "parentContext", "Landroidx/compose/runtime/f;", "setParentContext", "Landroidx/compose/ui/platform/ComposeViewContext;", "getComposeViewContext$ui", "setComposeViewContext$ui", "getComposeViewContext$ui$annotations", "Lkotlin/Function0;", "disposeViewCompositionStrategy", "Lkotlin/jvm/functions/Function0;", "getDisposeViewCompositionStrategy$annotations", "showLayoutBounds", "Z", "getShowLayoutBounds", "setShowLayoutBounds", "getShowLayoutBounds$annotations", "creatingComposition", "isTransitionGroupSet", "isAlive", "(Landroidx/compose/runtime/f;)Z", "getShouldCreateCompositionOnAttachedToWindow", "shouldCreateCompositionOnAttachedToWindow", "Landroidx/compose/ui/platform/o;", "getAutoClearFocusBehavior-4UtRPd4", "()I", "setAutoClearFocusBehavior-17tfJxM", "autoClearFocusBehavior", "getHasComposition", "hasComposition", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class AbstractComposeView extends ViewGroup {
    public static final int $stable = 8;
    private WeakReference<androidx.compose.p004runtime.f> cachedViewTreeCompositionContext;
    private ComposeViewContext composeViewContext;
    private pr1 composition;
    private boolean creatingComposition;
    private Function0<Unit> disposeViewCompositionStrategy;
    private boolean isTransitionGroupSet;
    private androidx.compose.p004runtime.f parentContext;
    private IBinder previousAttachedWindowToken;
    private boolean showLayoutBounds;

    public AbstractComposeView(Context context) {
        this(context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void attachedToWindow() {
        if (isAttachedToWindow()) {
            setPreviousAttachedWindowToken(getWindowToken());
            if (this.composeViewContext == null) {
                AndroidComposeView androidComposeView = null;
                if (getChildCount() != 0) {
                    View childAt = getChildAt(0);
                    if (childAt instanceof AndroidComposeView) {
                        androidComposeView = (AndroidComposeView) childAt;
                    }
                }
                if (androidComposeView != null) {
                    androidComposeView.setComposeViewContext(updateAutoCreatedComposeViewContext(s.d(this), androidComposeView.getComposeViewContext()));
                }
            }
            if (getShouldCreateCompositionOnAttachedToWindow()) {
                ensureCompositionCreated();
            }
        }
    }

    private final androidx.compose.p004runtime.f cacheIfAlive(androidx.compose.p004runtime.f fVar) {
        androidx.compose.p004runtime.f fVar2 = isAlive(fVar) ? fVar : null;
        if (fVar2 != null) {
            this.cachedViewTreeCompositionContext = new WeakReference<>(fVar2);
        }
        return fVar;
    }

    private final void checkAddView() {
        if (this.creatingComposition) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    private final void ensureCompositionCreated() {
        if (this.composition == null) {
            try {
                this.creatingComposition = true;
                Trace.beginSection("Compose:initializeView");
                try {
                    ComposeViewContext composeViewContextResolveComposeViewContext = this.composeViewContext;
                    if (composeViewContextResolveComposeViewContext == null) {
                        composeViewContextResolveComposeViewContext = resolveComposeViewContext();
                    }
                    this.composition = e0.b(this, composeViewContextResolveComposeViewContext, ko1.c(1003123809, true, new Function2<androidx.compose.p004runtime.d, Integer, Unit>() { // from class: androidx.compose.ui.platform.AbstractComposeView$ensureCompositionCreated$1$1
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
                                androidx.compose.p004runtime.e.o(1003123809, i, -1, "androidx.compose.ui.platform.AbstractComposeView.ensureCompositionCreated.<anonymous>.<anonymous> (ComposeView.android.kt:340)");
                            }
                            this.this$0.Content(dVar, 0);
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.n();
                            }
                        }
                    }));
                    Unit unit = Unit.a;
                    Trace.endSection();
                    this.creatingComposition = false;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } catch (Throwable th2) {
                this.creatingComposition = false;
                throw th2;
            }
        }
    }

    public static /* synthetic */ void getComposeViewContext$ui$annotations() {
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final boolean isAlive(androidx.compose.p004runtime.f fVar) {
        return !(fVar instanceof Recomposer) || ((Recomposer.State) ((Recomposer) fVar).u0().getValue()).compareTo(Recomposer.State.ShuttingDown) > 0;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0007  */
    private final ComposeViewContext resolveComposeViewContext() {
        ComposeViewContext composeViewContext;
        u9e viewModelStoreOwner;
        if (getChildCount() == 0) {
            composeViewContext = null;
        } else {
            View childAt = getChildAt(0);
            AndroidComposeView androidComposeView = childAt instanceof AndroidComposeView ? (AndroidComposeView) childAt : null;
            if (androidComposeView != null) {
                composeViewContext = androidComposeView.getComposeViewContext();
            } else {
                composeViewContext = null;
            }
        }
        View viewD = s.d(this);
        ComposeViewContext composeViewContextF = s.f(viewD);
        if (composeViewContextF != null) {
            return updateAutoCreatedComposeViewContext(viewD, composeViewContextF);
        }
        androidx.compose.p004runtime.f fVarResolveParentCompositionContext = resolveParentCompositionContext();
        n17 n17VarA = fbe.a(viewD);
        if (n17VarA == null) {
            n17VarA = composeViewContext != null ? composeViewContext.getLifecycleOwner() : null;
            if (n17VarA == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
        }
        n17 n17Var = n17VarA;
        e0b e0bVarA = ibe.a(viewD);
        if (e0bVarA == null) {
            e0bVarA = composeViewContext != null ? composeViewContext.getSavedStateRegistryOwner() : null;
            if (e0bVarA == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
            }
        }
        e0b e0bVar = e0bVarA;
        u9e u9eVarA = jbe.a(viewD);
        if (u9eVarA == null) {
            viewModelStoreOwner = composeViewContext != null ? composeViewContext.getViewModelStoreOwner() : null;
        } else {
            viewModelStoreOwner = u9eVarA;
        }
        ComposeViewContext composeViewContext2 = new ComposeViewContext(viewD, fVarResolveParentCompositionContext, n17Var, e0bVar, viewModelStoreOwner);
        s.g(viewD, composeViewContext2);
        return composeViewContext2;
    }

    private final androidx.compose.p004runtime.f resolveParentCompositionContext() {
        androidx.compose.p004runtime.f fVar;
        androidx.compose.p004runtime.f fVarCacheIfAlive = this.parentContext;
        if (fVarCacheIfAlive == null) {
            androidx.compose.p004runtime.f fVarE = WindowRecomposer_androidKt.e(this);
            androidx.compose.p004runtime.f fVar2 = null;
            fVarCacheIfAlive = fVarE != null ? cacheIfAlive(fVarE) : null;
            if (fVarCacheIfAlive == null) {
                WeakReference<androidx.compose.p004runtime.f> weakReference = this.cachedViewTreeCompositionContext;
                if (weakReference != null && (fVar = weakReference.get()) != null && isAlive(fVar)) {
                    fVar2 = fVar;
                }
                return fVar2 == null ? cacheIfAlive(WindowRecomposer_androidKt.i(this)) : fVar2;
            }
        }
        return fVarCacheIfAlive;
    }

    private final void setParentContext(androidx.compose.p004runtime.f fVar) {
        if (this.parentContext != fVar) {
            this.parentContext = fVar;
            if (fVar != null) {
                this.cachedViewTreeCompositionContext = null;
            }
            pr1 pr1Var = this.composition;
            if (pr1Var != null) {
                pr1Var.dispose();
                this.composition = null;
                if (isAttachedToWindow()) {
                    ensureCompositionCreated();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.previousAttachedWindowToken != iBinder) {
            this.previousAttachedWindowToken = iBinder;
            this.cachedViewTreeCompositionContext = null;
        }
    }

    private final ComposeViewContext updateAutoCreatedComposeViewContext(View contextView, ComposeViewContext existingContext) {
        androidx.compose.p004runtime.f fVarResolveParentCompositionContext = resolveParentCompositionContext();
        n17 n17VarA = fbe.a(contextView);
        u9e u9eVarA = jbe.a(contextView);
        e0b e0bVarA = ibe.a(contextView);
        if (fVarResolveParentCompositionContext == existingContext.getCompositionContext() && n17VarA == existingContext.getLifecycleOwner() && u9eVarA == existingContext.getViewModelStoreOwner() && e0bVarA == existingContext.getSavedStateRegistryOwner()) {
            return existingContext;
        }
        if (fVarResolveParentCompositionContext.getEffectCoroutineContext() != existingContext.getCompositionContext().getEffectCoroutineContext()) {
            disposeComposition();
        }
        if (n17VarA == null) {
            n17VarA = existingContext.getLifecycleOwner();
        }
        n17 n17Var = n17VarA;
        if (e0bVarA == null) {
            e0bVarA = existingContext.getSavedStateRegistryOwner();
        }
        ComposeViewContext composeViewContextB = existingContext.b(contextView, fVarResolveParentCompositionContext, n17Var, e0bVarA, u9eVarA);
        s.g(contextView, composeViewContextB);
        return composeViewContextB;
    }

    public abstract void Content(androidx.compose.p004runtime.d dVar, int i);

    @Override // android.view.ViewGroup
    public void addView(View child) {
        checkAddView();
        super.addView(child);
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(View child, int index, ViewGroup.LayoutParams params) {
        checkAddView();
        return super.addViewInLayout(child, index, params);
    }

    public final void createComposition() {
        ComposeViewContext composeViewContext;
        View view;
        if (this.parentContext == null && !isAttachedToWindow() && ((composeViewContext = this.composeViewContext) == null || composeViewContext == null || (view = composeViewContext.getView()) == null || !view.isAttachedToWindow())) {
            throw new IllegalStateException("createComposition requires a previous call to createComposition(ComposeViewContext), a parent reference, or the View to be attached to a window. Attach the View or call setParentCompositionReference.");
        }
        ensureCompositionCreated();
    }

    public final void disposeComposition() {
        View childAt = getChildAt(0);
        AndroidComposeView androidComposeView = childAt instanceof AndroidComposeView ? (AndroidComposeView) childAt : null;
        if (androidComposeView != null) {
            androidComposeView.i1();
        }
        pr1 pr1Var = this.composition;
        if (pr1Var != null) {
            pr1Var.dispose();
        }
        this.composition = null;
        requestLayout();
    }

    /* JADX INFO: renamed from: getAutoClearFocusBehavior-4UtRPd4, reason: not valid java name */
    public final int m36getAutoClearFocusBehavior4UtRPd4() {
        Object tag = getTag(xy9.I);
        o oVar = tag instanceof o ? (o) tag : null;
        return oVar != null ? oVar.getValue() : o.INSTANCE.b();
    }

    /* JADX INFO: renamed from: getComposeViewContext$ui, reason: from getter */
    public final ComposeViewContext getComposeViewContext() {
        return this.composeViewContext;
    }

    public final boolean getHasComposition() {
        return this.composition != null;
    }

    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    public void internalOnLayout$ui(boolean changed, int left, int top, int right, int bottom) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (right - left) - getPaddingRight(), (bottom - top) - getPaddingBottom());
        }
    }

    public void internalOnMeasure$ui(int widthMeasureSpec, int heightMeasureSpec) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(widthMeasureSpec) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(widthMeasureSpec)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(heightMeasureSpec) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(heightMeasureSpec)));
        setMeasuredDimension(childAt.getMeasuredWidth() + getPaddingLeft() + getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.ViewGroup
    public boolean isTransitionGroup() {
        return !this.isTransitionGroupSet || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (WindowRecomposer_androidKt.h(this).getParent() == null) {
            getHandler().postAtFrontOfQueue(new Runnable() { // from class: com.google.android.p1
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.attachedToWindow();
                }
            });
        } else {
            attachedToWindow();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean changed, int left, int top, int right, int bottom) {
        internalOnLayout$ui(changed, left, top, right, bottom);
    }

    @Override // android.view.View
    protected final void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        ensureCompositionCreated();
        internalOnMeasure$ui(widthMeasureSpec, heightMeasureSpec);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int layoutDirection) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(layoutDirection);
        }
    }

    /* JADX INFO: renamed from: setAutoClearFocusBehavior-17tfJxM, reason: not valid java name */
    public final void m37setAutoClearFocusBehavior17tfJxM(int i) {
        setTag(xy9.I, o.b(i));
    }

    public final void setComposeViewContext$ui(ComposeViewContext composeViewContext) {
        if (this.composeViewContext != composeViewContext) {
            if (composeViewContext == null) {
                disposeComposition();
            } else if (getChildCount() != 0) {
                View childAt = getChildAt(0);
                AndroidComposeView androidComposeView = childAt instanceof AndroidComposeView ? (AndroidComposeView) childAt : null;
                if (androidComposeView != null) {
                    if (androidComposeView.getCoroutineContext() != composeViewContext.getCompositionContext().getEffectCoroutineContext()) {
                        disposeComposition();
                    }
                    androidComposeView.setComposeViewContext(composeViewContext);
                }
            }
            this.composeViewContext = composeViewContext;
        }
    }

    public final void setParentCompositionContext(androidx.compose.p004runtime.f parent) {
        setParentContext(parent);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.showLayoutBounds = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((androidx.compose.ui.node.m) childAt).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean isTransitionGroup) {
        super.setTransitionGroup(isTransitionGroup);
        this.isTransitionGroupSet = true;
    }

    public final void setViewCompositionStrategy(ViewCompositionStrategy strategy) {
        Function0<Unit> function0 = this.disposeViewCompositionStrategy;
        if (function0 != null) {
            function0.invoke();
        }
        this.disposeViewCompositionStrategy = strategy.a(this);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public AbstractComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public AbstractComposeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        this.disposeViewCompositionStrategy = ViewCompositionStrategy.INSTANCE.a().a(this);
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index) {
        checkAddView();
        super.addView(child, index);
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(View child, int index, ViewGroup.LayoutParams params, boolean preventRequestLayout) {
        checkAddView();
        return super.addViewInLayout(child, index, params, preventRequestLayout);
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int width, int height) {
        checkAddView();
        super.addView(child, width, height);
    }

    public final void createComposition(ComposeViewContext composeViewContext) {
        if (composeViewContext.getView().isAttachedToWindow()) {
            setComposeViewContext$ui(composeViewContext);
            ensureCompositionCreated();
            return;
        }
        throw new IllegalStateException("createComposition requires the ComposeViewContext's view to be attached to a window.");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View child, ViewGroup.LayoutParams params) {
        checkAddView();
        super.addView(child, params);
    }

    public /* synthetic */ AbstractComposeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        checkAddView();
        super.addView(child, index, params);
    }
}
