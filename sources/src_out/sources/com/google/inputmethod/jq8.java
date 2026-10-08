package com.google.inputmethod;

import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.i;
import com.google.android.aq8;
import com.google.android.ee8;
import com.google.android.kd8;
import com.google.android.wp8;
import com.google.android.xp8;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0019B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB\u0015\b\u0017\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001f\u0010%\u001a\u00060 R\u00020\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lcom/google/android/jq8;", "", "Ljava/lang/Runnable;", "fallbackOnBackPressed", "Lcom/google/android/oy1;", "", "onHasEnabledCallbacksChanged", "<init>", "(Ljava/lang/Runnable;Lcom/google/android/oy1;)V", "(Ljava/lang/Runnable;)V", "Landroid/window/OnBackInvokedDispatcher;", "invoker", "", "m", "(Landroid/window/OnBackInvokedDispatcher;)V", "Lcom/google/android/eq8;", "onBackPressedCallback", "g", "(Lcom/google/android/eq8;)V", "Lcom/google/android/n17;", "owner", "f", "(Lcom/google/android/n17;Lcom/google/android/eq8;)V", "l", "()V", "a", "Ljava/lang/Runnable;", "b", "Lcom/google/android/oy1;", "c", "Z", "hasEnabledCallbacks", "Lcom/google/android/jq8$a;", "d", "Lkotlin/Lazy;", "k", "()Lcom/google/android/jq8$a;", "eventInput", "Lcom/google/android/kd8;", "j", "()Lcom/google/android/kd8;", "eventDispatcher", "activity"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class jq8 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Runnable fallbackOnBackPressed;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final oy1<Boolean> onHasEnabledCallbacksChanged;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean hasEnabledCallbacks;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy eventInput;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/google/android/jq8$a;", "Lcom/google/android/ee8;", "<init>", "(Lcom/google/android/jq8;)V", "", "hasEnabledHandlers", "", "j", "(Z)V", "n", "()V", "Lcom/google/android/kd8;", "c", "Lcom/google/android/kd8;", "p", "()Lcom/google/android/kd8;", "dispatcher", "activity"}, k = 1, mv = {2, 1, 0}, xi = 48)
    final class a extends ee8 {

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final kd8 dispatcher;

        public a() {
            kd8 kd8Var = new kd8(new wp8() { // from class: com.google.android.iq8
                public final void a() {
                    jq8.a.o(jq8Var);
                }
            });
            kd8Var.c(this);
            this.dispatcher = kd8Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void o(jq8 jq8Var) {
            Runnable runnable = jq8Var.fallbackOnBackPressed;
            if (runnable != null) {
                runnable.run();
            }
        }

        protected void j(boolean hasEnabledHandlers) {
            jq8.this.hasEnabledCallbacks = hasEnabledHandlers;
            oy1 oy1Var = jq8.this.onHasEnabledCallbacksChanged;
            if (oy1Var != null) {
                oy1Var.accept(Boolean.valueOf(hasEnabledHandlers));
            }
        }

        public final void n() {
            b();
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public final kd8 getDispatcher() {
            return this.dispatcher;
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/google/android/jq8$b", "Landroidx/lifecycle/i;", "Lcom/google/android/n17;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "", "d6", "(Lcom/google/android/n17;Landroidx/lifecycle/Lifecycle$Event;)V", "activity"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements i {
        final /* synthetic */ eq8.a a;
        final /* synthetic */ jq8 b;
        final /* synthetic */ Lifecycle c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Lifecycle.Event.values().length];
                try {
                    iArr[Lifecycle.Event.ON_START.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Lifecycle.Event.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        b(eq8.a aVar, jq8 jq8Var, Lifecycle lifecycle) {
            this.a = aVar;
            this.b = jq8Var;
            this.c = lifecycle;
        }

        @Override // androidx.lifecycle.i
        public void d6(n17 source, Lifecycle.Event event) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            int i = a.$EnumSwitchMapping$0[event.ordinal()];
            if (i == 1) {
                if (l8.isOnBackPressedLifecycleOrderMaintained) {
                    this.a.D(true);
                    return;
                } else {
                    kd8.b(this.b.j(), this.a, 0, 2, (Object) null);
                    return;
                }
            }
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.a.x();
                this.c.g(this);
                return;
            }
            if (l8.isOnBackPressedLifecycleOrderMaintained) {
                this.a.D(false);
            } else {
                this.a.x();
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public jq8() {
        Runnable runnable = null;
        this(runnable, 1, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(Lifecycle lifecycle, b bVar) {
        lifecycle.g(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a i(jq8 jq8Var) {
        return jq8Var.new a();
    }

    private final a k() {
        return (a) this.eventInput.getValue();
    }

    public final void f(n17 owner, eq8 onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        final Lifecycle lifecycle = owner.getLifecycleRegistry();
        if (lifecycle.getState() == Lifecycle.State.DESTROYED) {
            return;
        }
        eq8.a aVarCreateNavigationEventHandler$activity = onBackPressedCallback.createNavigationEventHandler$activity(new OnBackPressedCallbackInfo(onBackPressedCallback, owner));
        if (l8.isOnBackPressedLifecycleOrderMaintained) {
            aVarCreateNavigationEventHandler$activity.D(false);
            kd8.b(j(), aVarCreateNavigationEventHandler$activity, 0, 2, (Object) null);
        }
        final b bVar = new b(aVarCreateNavigationEventHandler$activity, this, lifecycle);
        lifecycle.c(bVar);
        onBackPressedCallback.addCloseable$activity(new AutoCloseable() { // from class: com.google.android.hq8
            @Override // java.lang.AutoCloseable
            public final void close() {
                jq8.h(lifecycle, bVar);
            }
        });
    }

    public final void g(eq8 onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        n17 n17Var = null;
        kd8.b(j(), onBackPressedCallback.createNavigationEventHandler$activity(new OnBackPressedCallbackInfo(onBackPressedCallback, n17Var, 2, n17Var)), 0, 2, (Object) null);
    }

    public final kd8 j() {
        return k().getDispatcher();
    }

    public final void l() {
        k().n();
    }

    public final void m(OnBackInvokedDispatcher invoker) {
        Intrinsics.checkNotNullParameter(invoker, "invoker");
        j().d(new xp8(invoker), 1);
        j().d(new aq8(invoker), 0);
    }

    public jq8(Runnable runnable, oy1<Boolean> oy1Var) {
        this.fallbackOnBackPressed = runnable;
        this.onHasEnabledCallbacksChanged = oy1Var;
        this.eventInput = c.b(new Function0() { // from class: com.google.android.gq8
            public final Object invoke() {
                return jq8.i(this.a);
            }
        });
    }

    public jq8(Runnable runnable) {
        this(runnable, null);
    }

    public /* synthetic */ jq8(Runnable runnable, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : runnable);
    }
}
