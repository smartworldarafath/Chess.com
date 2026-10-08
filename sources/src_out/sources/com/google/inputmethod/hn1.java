package com.google.inputmethod;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.k;
import com.google.android.b0b;
import com.google.android.e0b;
import com.google.android.gbe;
import com.google.android.ibe;
import com.google.android.kd8;
import com.google.android.ld8;
import com.google.android.r43;
import com.google.android.za3;
import com.google.android.zza;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u001b\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0015¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0015¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0015¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u0018\u0010\u001cJ!\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u0018\u0010\u001fJ!\u0010 \u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b \u0010\u001fJ\u000f\u0010!\u001a\u00020\u0010H\u0017¢\u0006\u0004\b!\u0010\u0014R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001b\u0010/\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R!\u00105\u001a\u0002008FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b1\u0010,\u0012\u0004\b4\u0010\u0014\u001a\u0004\b2\u00103R\u0014\u00107\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u00106R\u0014\u0010;\u001a\u0002088VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0014\u0010?\u001a\u00020<8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006D"}, d2 = {"Lcom/google/android/hn1;", "Landroid/app/Dialog;", "Lcom/google/android/n17;", "Lcom/google/android/lq8;", "Lcom/google/android/ld8;", "Lcom/google/android/e0b;", "Landroid/content/Context;", "context", "", "themeResId", "<init>", "(Landroid/content/Context;I)V", "Landroid/os/Bundle;", "onSaveInstanceState", "()Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "()V", "onStop", "onBackPressed", "layoutResID", "setContentView", "(I)V", "Landroid/view/View;", "view", "(Landroid/view/View;)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "addContentView", "f", "Landroidx/lifecycle/k;", "a", "Landroidx/lifecycle/k;", "_lifecycleRegistry", "Lcom/google/android/b0b;", "b", "Lcom/google/android/b0b;", "savedStateRegistryController", "Lcom/google/android/za3;", "c", "Lkotlin/Lazy;", "e", "()Lcom/google/android/za3;", "onBackPressedInput", "Lcom/google/android/jq8;", "d", "getOnBackPressedDispatcher", "()Lcom/google/android/jq8;", "getOnBackPressedDispatcher$annotations", "onBackPressedDispatcher", "()Landroidx/lifecycle/k;", "lifecycleRegistry", "Lcom/google/android/zza;", "getSavedStateRegistry", "()Lcom/google/android/zza;", "savedStateRegistry", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "Lcom/google/android/kd8;", "getNavigationEventDispatcher", "()Lcom/google/android/kd8;", "navigationEventDispatcher", "activity"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class hn1 extends Dialog implements n17, lq8, ld8, e0b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private k _lifecycleRegistry;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final b0b savedStateRegistryController;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Lazy onBackPressedInput;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy onBackPressedDispatcher;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hn1(Context context, int i) {
        super(context, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.savedStateRegistryController = b0b.c.b(this);
        this.onBackPressedInput = c.b(new Function0() { // from class: com.google.android.en1
            public final Object invoke() {
                return hn1.i(this.a);
            }
        });
        this.onBackPressedDispatcher = c.b(new Function0() { // from class: com.google.android.fn1
            public final Object invoke() {
                return hn1.g(this.a);
            }
        });
    }

    private final k d() {
        k kVar = this._lifecycleRegistry;
        if (kVar != null) {
            return kVar;
        }
        k kVar2 = new k(this);
        this._lifecycleRegistry = kVar2;
        return kVar2;
    }

    private final za3 e() {
        return (za3) this.onBackPressedInput.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jq8 g(final hn1 hn1Var) {
        return new jq8(new Runnable() { // from class: com.google.android.gn1
            @Override // java.lang.Runnable
            public final void run() {
                hn1.h(this.a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(hn1 hn1Var) {
        super.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final za3 i(hn1 hn1Var) {
        za3 za3Var = new za3();
        hn1Var.getNavigationEventDispatcher().c(za3Var);
        return za3Var;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams params) {
        Intrinsics.checkNotNullParameter(view, "view");
        f();
        super.addContentView(view, params);
    }

    public void f() {
        Window window = getWindow();
        Intrinsics.g(window);
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        fbe.b(decorView, this);
        Window window2 = getWindow();
        Intrinsics.g(window2);
        View decorView2 = window2.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView2, "getDecorView(...)");
        hbe.b(decorView2, this);
        Window window3 = getWindow();
        Intrinsics.g(window3);
        View decorView3 = window3.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView3, "getDecorView(...)");
        ibe.b(decorView3, this);
        Window window4 = getWindow();
        Intrinsics.g(window4);
        View decorView4 = window4.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView4, "getDecorView(...)");
        gbe.b(decorView4, this);
    }

    @Override // com.google.inputmethod.n17
    /* JADX INFO: renamed from: getLifecycle */
    public Lifecycle getLifecycleRegistry() {
        return d();
    }

    public kd8 getNavigationEventDispatcher() {
        return getOnBackPressedDispatcher().j();
    }

    @Override // com.google.inputmethod.lq8
    public final jq8 getOnBackPressedDispatcher() {
        return (jq8) this.onBackPressedDispatcher.getValue();
    }

    public zza getSavedStateRegistry() {
        return this.savedStateRegistryController.b();
    }

    @Override // android.app.Dialog
    @r43
    public void onBackPressed() {
        e().m();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= 33) {
            jq8 onBackPressedDispatcher = getOnBackPressedDispatcher();
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            Intrinsics.checkNotNullExpressionValue(onBackInvokedDispatcher, "getOnBackInvokedDispatcher(...)");
            onBackPressedDispatcher.m(onBackInvokedDispatcher);
        }
        this.savedStateRegistryController.d(savedInstanceState);
        d().l(Lifecycle.Event.ON_CREATE);
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        Intrinsics.checkNotNullExpressionValue(bundleOnSaveInstanceState, "onSaveInstanceState(...)");
        this.savedStateRegistryController.e(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        d().l(Lifecycle.Event.ON_RESUME);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        d().l(Lifecycle.Event.ON_DESTROY);
        this._lifecycleRegistry = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int layoutResID) {
        f();
        super.setContentView(layoutResID);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        f();
        super.setContentView(view);
    }

    public /* synthetic */ hn1(Context context, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? 0 : i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        Intrinsics.checkNotNullParameter(view, "view");
        f();
        super.setContentView(view, params);
    }
}
