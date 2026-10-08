package androidx.compose.p002material3;

import android.R;
import android.graphics.Outline;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.Window;
import androidx.compose.p000animation.core.Animatable;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.f;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.SecureFlagPolicy;
import com.google.android.ibe;
import com.google.android.rw0;
import com.google.android.ta2;
import com.google.inputmethod.BackEventCompat;
import com.google.inputmethod.ch0;
import com.google.inputmethod.eq8;
import com.google.inputmethod.f43;
import com.google.inputmethod.fbe;
import com.google.inputmethod.ff3;
import com.google.inputmethod.g0a;
import com.google.inputmethod.hn1;
import com.google.inputmethod.jbe;
import com.google.inputmethod.kae;
import com.google.inputmethod.kje;
import com.google.inputmethod.qr;
import com.google.inputmethod.she;
import com.google.inputmethod.vx7;
import com.google.inputmethod.xy9;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0001?Ba\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010#\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b#\u0010$J3\u0010%\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\u0004¢\u0006\u0004\b'\u0010(J\u0017\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0004H\u0016¢\u0006\u0004\b.\u0010(R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006@"}, d2 = {"Landroidx/compose/material3/ModalBottomSheetDialogWrapper;", "Lcom/google/android/hn1;", "Lcom/google/android/kae;", "Lkotlin/Function0;", "", "onDismissRequest", "Lcom/google/android/vx7;", "properties", "Lcom/google/android/ei1;", "contentColor", "Landroid/view/View;", "composeView", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Lcom/google/android/f43;", "density", "Ljava/util/UUID;", "dialogId", "Landroidx/compose/animation/core/Animatable;", "", "Lcom/google/android/qr;", "predictiveBackProgress", "Lcom/google/android/ta2;", "scope", "<init>", "(Lkotlin/jvm/functions/Function0;Lcom/google/android/vx7;JLandroid/view/View;Landroidx/compose/ui/unit/LayoutDirection;Lcom/google/android/f43;Ljava/util/UUID;Landroidx/compose/animation/core/Animatable;Lcom/google/android/ta2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "n", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "Landroidx/compose/ui/window/SecureFlagPolicy;", "securePolicy", "o", "(Landroidx/compose/ui/window/SecureFlagPolicy;)V", "Landroidx/compose/runtime/f;", "parentComposition", "children", "m", "(Landroidx/compose/runtime/f;Lkotlin/jvm/functions/Function2;)V", "p", "(Lkotlin/jvm/functions/Function0;Lcom/google/android/vx7;JLandroidx/compose/ui/unit/LayoutDirection;)V", "l", "()V", "Landroid/view/MotionEvent;", "event", "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "cancel", "e", "Lkotlin/jvm/functions/Function0;", "f", "Lcom/google/android/vx7;", "g", "J", "h", "Landroid/view/View;", "Landroidx/compose/material3/o0;", "i", "Landroidx/compose/material3/o0;", "dialogLayout", "Lcom/google/android/ff3;", "j", "F", "maxSupportedElevation", "PredictiveBackOnBackPressedCallback", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class ModalBottomSheetDialogWrapper extends hn1 implements kae {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private Function0<Unit> onDismissRequest;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private vx7 properties;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private long contentColor;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final View composeView;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final o0 dialogLayout;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final float maxSupportedElevation;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0002\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Landroidx/compose/material3/ModalBottomSheetDialogWrapper$PredictiveBackOnBackPressedCallback;", "Lcom/google/android/eq8;", "", "isEnabled", "Lcom/google/android/ta2;", "scope", "Landroidx/compose/animation/core/Animatable;", "", "Lcom/google/android/qr;", "predictiveBackProgress", "Lkotlin/Function0;", "", "onDismissRequest", "<init>", "(ZLcom/google/android/ta2;Landroidx/compose/animation/core/Animatable;Lkotlin/jvm/functions/Function0;)V", "Lcom/google/android/tc0;", "backEvent", "handleOnBackStarted", "(Lcom/google/android/tc0;)V", "handleOnBackProgressed", "handleOnBackPressed", "()V", "handleOnBackCancelled", "a", "Lcom/google/android/ta2;", "getScope", "()Lcom/google/android/ta2;", "b", "Landroidx/compose/animation/core/Animatable;", "()Landroidx/compose/animation/core/Animatable;", "c", "Lkotlin/jvm/functions/Function0;", "getOnDismissRequest", "()Lkotlin/jvm/functions/Function0;", "setOnDismissRequest", "(Lkotlin/jvm/functions/Function0;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class PredictiveBackOnBackPressedCallback extends eq8 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final ta2 scope;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Animatable<Float, qr> predictiveBackProgress;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private Function0<Unit> onDismissRequest;

        public PredictiveBackOnBackPressedCallback(boolean z, ta2 ta2Var, Animatable<Float, qr> animatable, Function0<Unit> function0) {
            super(z);
            this.scope = ta2Var;
            this.predictiveBackProgress = animatable;
            this.onDismissRequest = function0;
        }

        public final Animatable<Float, qr> b() {
            return this.predictiveBackProgress;
        }

        @Override // com.google.inputmethod.eq8
        public void handleOnBackCancelled() {
            rw0.d(this.scope, (CoroutineContext) null, (CoroutineStart) null, new C0186xc448d5e7(this, null), 3, (Object) null);
        }

        @Override // com.google.inputmethod.eq8
        public void handleOnBackPressed() {
            this.onDismissRequest.invoke();
        }

        @Override // com.google.inputmethod.eq8
        public void handleOnBackProgressed(BackEventCompat backEvent) {
            rw0.d(this.scope, (CoroutineContext) null, (CoroutineStart) null, new C0187x323e99f0(this, backEvent, null), 3, (Object) null);
        }

        @Override // com.google.inputmethod.eq8
        public void handleOnBackStarted(BackEventCompat backEvent) {
            rw0.d(this.scope, (CoroutineContext) null, (CoroutineStart) null, new C0188x6bd65f57(this, backEvent, null), 3, (Object) null);
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/compose/material3/ModalBottomSheetDialogWrapper$a", "Landroid/view/ViewOutlineProvider;", "Landroid/view/View;", "view", "Landroid/graphics/Outline;", "result", "", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline result) {
            result.setRect(0, 0, view.getWidth(), view.getHeight());
            result.setAlpha(0.0f);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ ModalBottomSheetDialogWrapper(Function0 function0, vx7 vx7Var, long j, View view, LayoutDirection layoutDirection, f43 f43Var, UUID uuid, Animatable animatable, ta2 ta2Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, vx7Var, j, view, layoutDirection, f43Var, uuid, animatable, ta2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(ModalBottomSheetDialogWrapper modalBottomSheetDialogWrapper) {
        modalBottomSheetDialogWrapper.onDismissRequest.invoke();
        return Unit.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void n(LayoutDirection layoutDirection) throws NoWhenBranchMatchedException {
        o0 o0Var = this.dialogLayout;
        int i = b.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        o0Var.setLayoutDirection(i2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void o(SecureFlagPolicy securePolicy) throws NoWhenBranchMatchedException {
        boolean zA = ch0.a(securePolicy, b1.m(this.composeView));
        Window window = getWindow();
        Intrinsics.g(window);
        window.setFlags(zA ? 8192 : -8193, 8192);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
    }

    public final void l() {
        this.dialogLayout.disposeComposition();
    }

    public final void m(f parentComposition, Function2<? super d, ? super Integer, Unit> children) {
        this.dialogLayout.e(parentComposition, children);
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(MotionEvent event) {
        boolean zOnTouchEvent = super.onTouchEvent(event);
        if (zOnTouchEvent) {
            this.onDismissRequest.invoke();
        }
        return zOnTouchEvent;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void p(Function0<Unit> onDismissRequest, vx7 properties, long contentColor, LayoutDirection layoutDirection) throws NoWhenBranchMatchedException {
        this.onDismissRequest = onDismissRequest;
        this.properties = properties;
        this.contentColor = contentColor;
        o(properties.getSecurePolicy());
        n(layoutDirection);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(Build.VERSION.SDK_INT >= 30 ? 48 : 16);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private ModalBottomSheetDialogWrapper(Function0<Unit> function0, vx7 vx7Var, long j, View view, LayoutDirection layoutDirection, f43 f43Var, UUID uuid, Animatable<Float, qr> animatable, ta2 ta2Var) throws NoWhenBranchMatchedException {
        super(new ContextThemeWrapper(view.getContext(), g0a.a), 0, 2, null);
        this.onDismissRequest = function0;
        this.properties = vx7Var;
        this.contentColor = j;
        this.composeView = view;
        float fI = ff3.i(8);
        this.maxSupportedElevation = fI;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(R.color.transparent);
        she.b(window, false);
        o0 o0Var = new o0(getContext(), window);
        o0Var.setTag(xy9.J, "Dialog:" + uuid);
        o0Var.setClipChildren(false);
        o0Var.setElevation(f43Var.x2(fI));
        o0Var.setOutlineProvider(new a());
        this.dialogLayout = o0Var;
        setContentView(o0Var);
        fbe.b(o0Var, fbe.a(view));
        jbe.b(o0Var, jbe.a(view));
        ibe.b(o0Var, ibe.a(view));
        p(this.onDismissRequest, this.properties, this.contentColor, layoutDirection);
        kje kjeVarA = she.a(window, window.getDecorView());
        Boolean isAppearanceLightStatusBars = this.properties.getIsAppearanceLightStatusBars();
        kjeVarA.d(isAppearanceLightStatusBars != null ? isAppearanceLightStatusBars.booleanValue() : b1.l(this.contentColor));
        Boolean isAppearanceLightNavigationBars = this.properties.getIsAppearanceLightNavigationBars();
        kjeVarA.c(isAppearanceLightNavigationBars != null ? isAppearanceLightNavigationBars.booleanValue() : b1.l(this.contentColor));
        getOnBackPressedDispatcher().f(this, new PredictiveBackOnBackPressedCallback(this.properties.getShouldDismissOnBackPress(), ta2Var, animatable, new Function0() { // from class: androidx.compose.material3.p0
            public final Object invoke() {
                return ModalBottomSheetDialogWrapper.k(this.a);
            }
        }));
    }
}
