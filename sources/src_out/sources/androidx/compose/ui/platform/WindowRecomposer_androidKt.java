package androidx.compose.ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import androidx.compose.p004runtime.PausableMonotonicFrameClock;
import androidx.compose.p004runtime.Recomposer;
import androidx.lifecycle.Lifecycle;
import com.google.android.h81;
import com.google.android.p81;
import com.google.android.r6c;
import com.google.android.rw0;
import com.google.android.ta2;
import com.google.inputmethod.cbe;
import com.google.inputmethod.fbe;
import com.google.inputmethod.h45;
import com.google.inputmethod.k4b;
import com.google.inputmethod.k58;
import com.google.inputmethod.n17;
import com.google.inputmethod.rz7;
import com.google.inputmethod.xy9;
import com.google.inputmethod.zw5;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\u0011\u001a\u00020\u0010*\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012\"&\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\",\u0010\u001b\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0003\"\u0004\b\u0019\u0010\u001a\"\u0018\u0010\u001e\u001a\u00020\u0000*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\"\u001e\u0010#\u001a\u00020\u0010*\u00020\u00008@X\u0080\u0004¢\u0006\f\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Landroid/view/View;", "Landroidx/compose/runtime/f;", "e", "(Landroid/view/View;)Landroidx/compose/runtime/f;", "Landroid/content/Context;", "", "j", "(Landroid/content/Context;)F", "applicationContext", "Lcom/google/android/r6c;", "f", "(Landroid/content/Context;)Lcom/google/android/r6c;", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Landroidx/compose/runtime/Recomposer;", "c", "(Landroid/view/View;Lkotlin/coroutines/CoroutineContext;Landroidx/lifecycle/Lifecycle;)Landroidx/compose/runtime/Recomposer;", "Lcom/google/android/k58;", "a", "Lcom/google/android/k58;", "animationScale", "value", "g", "k", "(Landroid/view/View;Landroidx/compose/runtime/f;)V", "compositionContext", "h", "(Landroid/view/View;)Landroid/view/View;", "contentChild", "i", "(Landroid/view/View;)Landroidx/compose/runtime/Recomposer;", "getWindowRecomposer$annotations", "(Landroid/view/View;)V", "windowRecomposer", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class WindowRecomposer_androidKt {
    private static final k58<Context, r6c<Float>> a = k4b.c();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"androidx/compose/ui/platform/WindowRecomposer_androidKt$a", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements View.OnAttachStateChangeListener {
        final /* synthetic */ View a;
        final /* synthetic */ Recomposer b;

        a(View view, Recomposer recomposer) {
            this.a = view;
            this.b = recomposer;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v) {
            this.a.removeOnAttachStateChangeListener(this);
            this.b.m0();
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/compose/ui/platform/WindowRecomposer_androidKt$b", "Landroid/database/ContentObserver;", "", "selfChange", "Landroid/net/Uri;", "uri", "", "onChange", "(ZLandroid/net/Uri;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends ContentObserver {
        final /* synthetic */ h81<Unit> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(h81<Unit> h81Var, Handler handler) {
            super(handler);
            this.a = h81Var;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean selfChange, Uri uri) {
            this.a.e(Unit.a);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public static final Recomposer c(View view, CoroutineContext coroutineContext, Lifecycle lifecycle) throws KotlinNothingValueException {
        final PausableMonotonicFrameClock pausableMonotonicFrameClock;
        if (coroutineContext.get(kotlin.coroutines.c.s2) == null || coroutineContext.get(androidx.compose.p004runtime.v.INSTANCE) == null) {
            coroutineContext = AndroidUiDispatcher.INSTANCE.a().plus(coroutineContext);
        }
        androidx.compose.p004runtime.v vVar = (androidx.compose.p004runtime.v) coroutineContext.get(androidx.compose.p004runtime.v.INSTANCE);
        if (vVar != null) {
            pausableMonotonicFrameClock = new PausableMonotonicFrameClock(vVar);
            pausableMonotonicFrameClock.c();
        } else {
            pausableMonotonicFrameClock = null;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        CoroutineContext motionDurationScaleImpl = (rz7) coroutineContext.get(rz7.INSTANCE);
        if (motionDurationScaleImpl == null) {
            motionDurationScaleImpl = new MotionDurationScaleImpl(view.getContext().getApplicationContext());
            objectRef.element = motionDurationScaleImpl;
        }
        CoroutineContext coroutineContextPlus = coroutineContext.plus(pausableMonotonicFrameClock != null ? pausableMonotonicFrameClock : EmptyCoroutineContext.a).plus(motionDurationScaleImpl);
        final Recomposer recomposer = new Recomposer(coroutineContextPlus);
        recomposer.G0();
        final ta2 ta2VarA = kotlinx.coroutines.j.a(coroutineContextPlus);
        if (lifecycle == null) {
            n17 n17VarA = fbe.a(view);
            lifecycle = n17VarA != null ? n17VarA.getLifecycleRegistry() : null;
        }
        if (lifecycle != null) {
            view.addOnAttachStateChangeListener(new a(view, recomposer));
            lifecycle.c(new androidx.lifecycle.i() { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public static final /* synthetic */ class a {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[Lifecycle.Event.values().length];
                        try {
                            iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_START.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_STOP.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 5;
                        } catch (NoSuchFieldError unused5) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 6;
                        } catch (NoSuchFieldError unused6) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_ANY.ordinal()] = 7;
                        } catch (NoSuchFieldError unused7) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                @Override // androidx.lifecycle.i
                public void d6(n17 source, Lifecycle.Event event) throws NoWhenBranchMatchedException {
                    switch (a.$EnumSwitchMapping$0[event.ordinal()]) {
                        case 1:
                            rw0.d(ta2VarA, (CoroutineContext) null, CoroutineStart.d, new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(objectRef, recomposer, source, this, null), 1, (Object) null);
                            return;
                        case 2:
                            PausableMonotonicFrameClock pausableMonotonicFrameClock2 = pausableMonotonicFrameClock;
                            if (pausableMonotonicFrameClock2 != null) {
                                pausableMonotonicFrameClock2.d();
                            }
                            recomposer.W0();
                            return;
                        case 3:
                            recomposer.G0();
                            return;
                        case 4:
                            recomposer.m0();
                            return;
                        case 5:
                        case 6:
                        case 7:
                            return;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                }
            });
            return recomposer;
        }
        zw5.d("ViewTreeLifecycleOwner not found from " + view);
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ Recomposer d(View view, CoroutineContext coroutineContext, Lifecycle lifecycle, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.a;
        }
        if ((i & 2) != 0) {
            lifecycle = null;
        }
        return c(view, coroutineContext, lifecycle);
    }

    public static final androidx.compose.p004runtime.f e(View view) {
        androidx.compose.p004runtime.f fVarG = g(view);
        if (fVarG != null) {
            return fVarG;
        }
        Object parent = view.getParent();
        while (fVarG == null && (parent instanceof View)) {
            View view2 = (View) parent;
            fVarG = g(view2);
            parent = cbe.a(view2);
        }
        return fVarG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r6c<Float> f(Context context) {
        r6c<Float> r6cVar;
        k58<Context, r6c<Float>> k58Var = a;
        synchronized (k58Var) {
            try {
                r6c<Float> r6cVarE = k58Var.e(context);
                if (r6cVarE == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    h81 h81VarB = p81.b(-1, (BufferOverflow) null, (Function1) null, 6, (Object) null);
                    r6cVarE = kotlinx.coroutines.flow.d.l0(kotlinx.coroutines.flow.d.O(new WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(contentResolver, uriFor, new b(h81VarB, h45.a(Looper.getMainLooper())), h81VarB, context, null)), kotlinx.coroutines.j.b(), kotlinx.coroutines.flow.n.a.b(kotlinx.coroutines.flow.n.a, 0L, 0L, 3, (Object) null), Float.valueOf(j(context)));
                    k58Var.x(context, r6cVarE);
                }
                r6cVar = r6cVarE;
            } catch (Throwable th) {
                throw th;
            }
        }
        return r6cVar;
    }

    public static final androidx.compose.p004runtime.f g(View view) {
        Object tag = view.getTag(xy9.H);
        if (tag instanceof androidx.compose.p004runtime.f) {
            return (androidx.compose.p004runtime.f) tag;
        }
        return null;
    }

    public static final View h(View view) {
        Object objA = cbe.a(view);
        while (objA instanceof View) {
            View view2 = (View) objA;
            if (view2.getId() == 16908290) {
                break;
            }
            objA = view2.getParent();
            view = view2;
        }
        return view;
    }

    public static final Recomposer i(View view) {
        if (!view.isAttachedToWindow()) {
            zw5.c("Cannot locate windowRecomposer; View " + view + " is not attached to a window");
        }
        View viewH = h(view);
        androidx.compose.p004runtime.f fVarG = g(viewH);
        if (fVarG == null) {
            return WindowRecomposerPolicy.a.a(viewH);
        }
        if (fVarG instanceof Recomposer) {
            return (Recomposer) fVarG;
        }
        throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float j(Context context) {
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    public static final void k(View view, androidx.compose.p004runtime.f fVar) {
        view.setTag(xy9.H, fVar);
    }
}
