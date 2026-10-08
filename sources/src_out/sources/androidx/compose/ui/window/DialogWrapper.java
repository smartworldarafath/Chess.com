package androidx.compose.ui.window;

import android.R;
import android.graphics.Outline;
import android.os.Build;
import android.os.IBinder;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.ibe;
import com.google.inputmethod.eq8;
import com.google.inputmethod.f43;
import com.google.inputmethod.fbe;
import com.google.inputmethod.ff3;
import com.google.inputmethod.h0a;
import com.google.inputmethod.hn1;
import com.google.inputmethod.jbe;
import com.google.inputmethod.kae;
import com.google.inputmethod.kq8;
import com.google.inputmethod.she;
import com.google.inputmethod.wbb;
import com.google.inputmethod.x93;
import com.google.inputmethod.xy9;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B=\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J#\u0010$\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b$\u0010%J+\u0010&\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u0004¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0004H\u0016¢\u0006\u0004\b-\u0010)R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010>\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006?"}, d2 = {"Landroidx/compose/ui/window/DialogWrapper;", "Lcom/google/android/hn1;", "Lcom/google/android/kae;", "Lkotlin/Function0;", "", "onDismissRequest", "Lcom/google/android/x93;", "properties", "Landroid/view/View;", "composeView", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Lcom/google/android/f43;", "density", "Ljava/util/UUID;", "dialogId", "<init>", "(Lkotlin/jvm/functions/Function0;Lcom/google/android/x93;Landroid/view/View;Landroidx/compose/ui/unit/LayoutDirection;Lcom/google/android/f43;Ljava/util/UUID;)V", "m", "(Lcom/google/android/x93;)V", "p", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "Landroidx/compose/ui/window/SecureFlagPolicy;", "securePolicy", "q", "(Landroidx/compose/ui/window/SecureFlagPolicy;)V", "", "keyCode", "Landroid/view/KeyEvent;", "event", "", "onKeyUp", "(ILandroid/view/KeyEvent;)Z", "Landroidx/compose/runtime/f;", "parentComposition", "children", "o", "(Landroidx/compose/runtime/f;Lkotlin/jvm/functions/Function2;)V", "r", "(Lkotlin/jvm/functions/Function0;Lcom/google/android/x93;Landroidx/compose/ui/unit/LayoutDirection;)V", "n", "()V", "Landroid/view/MotionEvent;", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "cancel", "e", "Lkotlin/jvm/functions/Function0;", "f", "Lcom/google/android/x93;", "g", "Landroid/view/View;", "Landroidx/compose/ui/window/DialogLayout;", "h", "Landroidx/compose/ui/window/DialogLayout;", "dialogLayout", "Lcom/google/android/ff3;", "i", "F", "maxSupportedElevation", "j", "Z", "isPressOutside", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class DialogWrapper extends hn1 implements kae {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private Function0<Unit> onDismissRequest;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private x93 properties;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final View composeView;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final DialogLayout dialogLayout;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final float maxSupportedElevation;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private boolean isPressOutside;

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/compose/ui/window/DialogWrapper$a", "Landroid/view/ViewOutlineProvider;", "Landroid/view/View;", "view", "Landroid/graphics/Outline;", "result", "", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline result) {
            result.setRect(0, 0, view.getWidth(), view.getHeight());
            result.setAlpha(0.0f);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class b {
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

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public DialogWrapper(Function0<Unit> function0, x93 x93Var, View view, LayoutDirection layoutDirection, f43 f43Var, UUID uuid) throws NoWhenBranchMatchedException {
        super(new ContextThemeWrapper(view.getContext(), x93Var.getDecorFitsSystemWindows() ? h0a.a : h0a.b), 0, 2, null);
        this.onDismissRequest = function0;
        this.properties = x93Var;
        this.composeView = view;
        float fI = ff3.i(8);
        this.maxSupportedElevation = fI;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        m(this.properties);
        window.requestFeature(1);
        window.setBackgroundDrawableResource(R.color.transparent);
        she.b(window, this.properties.getDecorFitsSystemWindows());
        window.setGravity(17);
        if (!this.properties.getDecorFitsSystemWindows()) {
            window.addFlags(65792);
            WindowManager.LayoutParams attributes = window.getAttributes();
            int i = Build.VERSION.SDK_INT;
            androidx.compose.ui.window.b.a.a(attributes);
            if (i >= 30) {
                c cVar = c.a;
                cVar.b(attributes, 0);
                cVar.c(attributes, 0);
            }
            window.setAttributes(attributes);
        }
        DialogLayout dialogLayout = new DialogLayout(getContext(), window);
        setTitle(this.properties.getWindowTitle());
        dialogLayout.setTag(xy9.J, "Dialog:" + uuid);
        dialogLayout.setClipChildren(false);
        dialogLayout.setElevation(f43Var.x2(fI));
        dialogLayout.setOutlineProvider(new a());
        this.dialogLayout = dialogLayout;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            j(viewGroup);
        }
        setContentView(dialogLayout);
        fbe.b(dialogLayout, fbe.a(view));
        jbe.b(dialogLayout, jbe.a(view));
        ibe.b(dialogLayout, ibe.a(view));
        r(this.onDismissRequest, this.properties, layoutDirection);
        kq8.b(getOnBackPressedDispatcher(), this, false, new Function1<eq8, Unit>() { // from class: androidx.compose.ui.window.DialogWrapper.2
            {
                super(1);
            }

            public final void a(eq8 eq8Var) {
                if (DialogWrapper.this.properties.getDismissOnBackPress()) {
                    DialogWrapper.this.onDismissRequest.invoke();
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((eq8) obj);
                return Unit.a;
            }
        }, 2, null);
    }

    private static final void j(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof DialogLayout) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                j(viewGroup2);
            }
        }
    }

    private final void m(x93 properties) {
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.type = properties.getWindowType();
            IBinder windowToken = properties.getWindowToken();
            if (windowToken != null) {
                attributes.token = windowToken;
            }
            window.setAttributes(attributes);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void p(LayoutDirection layoutDirection) throws NoWhenBranchMatchedException {
        DialogLayout dialogLayout = this.dialogLayout;
        int i = b.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        dialogLayout.setLayoutDirection(i2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void q(SecureFlagPolicy securePolicy) throws NoWhenBranchMatchedException {
        boolean zA = wbb.a(securePolicy, AndroidPopup_androidKt.j(this.composeView));
        Window window = getWindow();
        Intrinsics.g(window);
        window.setFlags(zA ? 8192 : -8193, 8192);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
    }

    public final void n() {
        this.dialogLayout.disposeComposition();
    }

    public final void o(androidx.compose.p004runtime.f parentComposition, Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> children) {
        this.dialogLayout.f(parentComposition, children);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        if (!this.properties.getDismissOnBackPress() || !event.isTracking() || event.isCanceled() || keyCode != 111) {
            return super.onKeyUp(keyCode, event);
        }
        this.onDismissRequest.invoke();
        return true;
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(MotionEvent event) {
        boolean zOnTouchEvent = super.onTouchEvent(event);
        if (!this.properties.getDismissOnClickOutside() || this.dialogLayout.e(event)) {
            int actionMasked = event.getActionMasked();
            if (actionMasked == 0 || actionMasked == 1 || actionMasked == 3) {
                this.isPressOutside = false;
                return zOnTouchEvent;
            }
        } else {
            int actionMasked2 = event.getActionMasked();
            if (actionMasked2 == 0) {
                this.isPressOutside = true;
                return true;
            }
            if (actionMasked2 != 1) {
                if (actionMasked2 == 3) {
                    this.isPressOutside = false;
                    return zOnTouchEvent;
                }
            } else if (this.isPressOutside) {
                this.onDismissRequest.invoke();
                this.isPressOutside = false;
                return true;
            }
        }
        return zOnTouchEvent;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void r(Function0<Unit> onDismissRequest, x93 properties, LayoutDirection layoutDirection) throws NoWhenBranchMatchedException {
        int i;
        this.onDismissRequest = onDismissRequest;
        this.properties = properties;
        q(properties.getSecurePolicy());
        p(layoutDirection);
        boolean decorFitsSystemWindows = properties.getDecorFitsSystemWindows();
        this.dialogLayout.g(properties.getUsePlatformDefaultWidth(), decorFitsSystemWindows);
        setCanceledOnTouchOutside(properties.getDismissOnClickOutside());
        Window window = getWindow();
        if (window != null) {
            if (decorFitsSystemWindows) {
                i = 0;
            } else {
                i = Build.VERSION.SDK_INT < 31 ? 16 : 48;
            }
            window.setSoftInputMode(i);
        }
    }
}
