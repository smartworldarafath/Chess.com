package androidx.compose.ui.window;

import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.p004runtime.s0;
import androidx.compose.ui.platform.AbstractComposeView;
import com.google.android.sh7;
import com.google.inputmethod.k7e;
import com.google.inputmethod.kie;
import com.google.inputmethod.o58;
import com.google.inputmethod.s6b;
import com.google.inputmethod.saa;
import com.google.inputmethod.t04;
import com.google.inputmethod.uy5;
import com.google.inputmethod.vp8;
import com.google.inputmethod.whe;
import com.google.inputmethod.z93;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\nH\u0010¢\u0006\u0004\b\u0016\u0010\u0017J7\u0010 \u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\nH\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010%\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020!2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00110#¢\u0006\u0004\b%\u0010&J\u001f\u0010+\u001a\u00020)2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u0015\u0010/\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0011H\u0017¢\u0006\u0004\b1\u00102R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u00103\u001a\u0004\b4\u00105R7\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00110#2\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00110#8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010>R\u0016\u0010?\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010>R$\u0010C\u001a\u00020\u000e2\u0006\u0010@\u001a\u00020\u000e8\u0014@RX\u0094\u000e¢\u0006\f\n\u0004\b%\u0010>\u001a\u0004\bA\u0010B¨\u0006D"}, d2 = {"Landroidx/compose/ui/window/DialogLayout;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Lcom/google/android/z93;", "Lcom/google/android/vp8;", "Landroid/content/Context;", "context", "Landroid/view/Window;", "window", "<init>", "(Landroid/content/Context;Landroid/view/Window;)V", "", "height", "d", "(Landroid/view/Window;I)I", "", "usePlatformDefaultWidth", "decorFitsSystemWindows", "", "g", "(ZZ)V", "widthMeasureSpec", "heightMeasureSpec", "internalOnMeasure$ui", "(II)V", "internalOnMeasure", "changed", "left", "top", "right", "bottom", "internalOnLayout$ui", "(ZIIII)V", "internalOnLayout", "Landroidx/compose/runtime/f;", "parent", "Lkotlin/Function0;", "content", "f", "(Landroidx/compose/runtime/f;Lkotlin/jvm/functions/Function2;)V", "Landroid/view/View;", "v", "Lcom/google/android/kie;", "insets", "a", "(Landroid/view/View;Lcom/google/android/kie;)Lcom/google/android/kie;", "Landroid/view/MotionEvent;", "event", "e", "(Landroid/view/MotionEvent;)Z", "Content", "(Landroidx/compose/runtime/d;I)V", "Landroid/view/Window;", "getWindow", "()Landroid/view/Window;", "<set-?>", "b", "Lcom/google/android/o58;", "getContent", "()Lkotlin/jvm/functions/Function2;", "setContent", "(Lkotlin/jvm/functions/Function2;)V", "c", "Z", "hasCalledSetLayout", "value", "getShouldCreateCompositionOnAttachedToWindow", "()Z", "shouldCreateCompositionOnAttachedToWindow", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class DialogLayout extends AbstractComposeView implements z93, vp8 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Window window;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final o58 content;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean usePlatformDefaultWidth;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean decorFitsSystemWindows;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean hasCalledSetLayout;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean shouldCreateCompositionOnAttachedToWindow;

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"androidx/compose/ui/window/DialogLayout$a", "Lcom/google/android/whe$b;", "Lcom/google/android/whe;", "animation", "Lcom/google/android/whe$a;", "bounds", "f", "(Lcom/google/android/whe;Lcom/google/android/whe$a;)Lcom/google/android/whe$a;", "Lcom/google/android/kie;", "insets", "", "runningAnimations", "e", "(Lcom/google/android/kie;Ljava/util/List;)Lcom/google/android/kie;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends whe.b {
        a() {
            super(1);
        }

        @Override // com.google.android.whe.b
        public kie e(kie insets, List<whe> runningAnimations) {
            DialogLayout dialogLayout = DialogLayout.this;
            if (!dialogLayout.decorFitsSystemWindows) {
                View childAt = dialogLayout.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, dialogLayout.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, dialogLayout.getHeight() - childAt.getBottom());
                if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                    return insets.q(iMax, iMax2, iMax3, iMax4);
                }
            }
            return insets;
        }

        @Override // com.google.android.whe.b
        public whe.a f(whe animation, whe.a bounds) {
            DialogLayout dialogLayout = DialogLayout.this;
            if (!dialogLayout.decorFitsSystemWindows) {
                View childAt = dialogLayout.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, dialogLayout.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, dialogLayout.getHeight() - childAt.getBottom());
                if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                    return bounds.c(uy5.d(iMax, iMax2, iMax3, iMax4));
                }
            }
            return bounds;
        }
    }

    public DialogLayout(Context context, Window window) {
        super(context, null, 0, 6, null);
        this.window = window;
        this.content = s0.e(ComposableSingletons$AndroidDialog_androidKt.a.a(), null, 2, null);
        k7e.z0(this, this);
        k7e.G0(this, new a());
    }

    private final int d(Window window, int height) {
        int i = Build.VERSION.SDK_INT;
        if (i < 30) {
            return androidx.compose.ui.window.a.a.a(window);
        }
        return i < 32 ? c.a.a(window) : height;
    }

    private final Function2<androidx.compose.p004runtime.d, Integer, Unit> getContent() {
        return (Function2) this.content.getValue();
    }

    private final void setContent(Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2) {
        this.content.setValue(function2);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void Content(androidx.compose.p004runtime.d dVar, final int i) {
        int i2;
        androidx.compose.p004runtime.d dVarF = dVar.F(1735448596);
        if ((i & 6) == 0) {
            i2 = (dVarF.T(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (dVarF.g((i2 & 3) != 2, i2 & 1)) {
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(1735448596, i2, -1, "androidx.compose.ui.window.DialogLayout.Content (AndroidDialog.android.kt:506)");
            }
            getContent().invoke(dVarF, 0);
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2<androidx.compose.p004runtime.d, Integer, Unit>() { // from class: androidx.compose.ui.window.DialogLayout.Content.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
                    return Unit.a;
                }

                public final void invoke(androidx.compose.p004runtime.d dVar2, int i3) {
                    DialogLayout.this.Content(dVar2, saa.a(i | 1));
                }
            });
        }
    }

    @Override // com.google.inputmethod.vp8
    public kie a(View v, kie insets) {
        if (!this.decorFitsSystemWindows) {
            View childAt = getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                return insets.q(iMax, iMax2, iMax3, iMax4);
            }
        }
        return insets;
    }

    public final boolean e(MotionEvent event) {
        View childAt;
        int iD;
        if (Math.abs(event.getX()) > Float.MAX_VALUE || Math.abs(event.getY()) > Float.MAX_VALUE || (childAt = getChildAt(0)) == null) {
            return false;
        }
        int left = getLeft() + childAt.getLeft();
        int width = childAt.getWidth() + left;
        int top = getTop() + childAt.getTop();
        int height = childAt.getHeight() + top;
        int iD2 = sh7.d(event.getX());
        return left <= iD2 && iD2 <= width && top <= (iD = sh7.d(event.getY())) && iD <= height;
    }

    public final void f(androidx.compose.p004runtime.f parent, Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> content) {
        setParentCompositionContext(parent);
        setContent(content);
        this.shouldCreateCompositionOnAttachedToWindow = true;
        createComposition();
    }

    public final void g(boolean usePlatformDefaultWidth, boolean decorFitsSystemWindows) {
        boolean z = (this.hasCalledSetLayout && usePlatformDefaultWidth == this.usePlatformDefaultWidth && decorFitsSystemWindows == this.decorFitsSystemWindows) ? false : true;
        this.usePlatformDefaultWidth = usePlatformDefaultWidth;
        this.decorFitsSystemWindows = decorFitsSystemWindows;
        if (z) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            int i = usePlatformDefaultWidth ? -2 : -1;
            if (i == attributes.width && this.hasCalledSetLayout) {
                return;
            }
            getWindow().setLayout(i, -2);
            this.hasCalledSetLayout = true;
        }
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    @Override // com.google.inputmethod.z93
    public Window getWindow() {
        return this.window;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void internalOnLayout$ui(boolean changed, int left, int top, int right, int bottom) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int i = right - left;
        int i2 = bottom - top;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft2 = getPaddingLeft() + (((i - measuredWidth) - paddingLeft) / 2);
        int paddingTop2 = getPaddingTop() + (((i2 - measuredHeight) - paddingTop) / 2);
        childAt.layout(paddingLeft2, paddingTop2, measuredWidth + paddingLeft2, measuredHeight + paddingTop2);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void internalOnMeasure$ui(int widthMeasureSpec, int heightMeasureSpec) {
        int iD;
        int iMin;
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.internalOnMeasure$ui(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        int mode = View.MeasureSpec.getMode(heightMeasureSpec);
        if (mode == Integer.MIN_VALUE && !this.usePlatformDefaultWidth && getWindow().getAttributes().height == -2) {
            iD = this.decorFitsSystemWindows ? d(getWindow(), size2) : size2 + 1;
        } else {
            iD = size2;
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int i = size - paddingLeft;
        if (i < 0) {
            i = 0;
        }
        int i2 = iD - paddingTop;
        int i3 = i2 >= 0 ? i2 : 0;
        int mode2 = View.MeasureSpec.getMode(widthMeasureSpec);
        if (mode2 != 0) {
            widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, t04.INVALID_ID);
        }
        if (mode != 0) {
            heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, t04.INVALID_ID);
        }
        childAt.measure(widthMeasureSpec, heightMeasureSpec);
        if (mode2 == Integer.MIN_VALUE) {
            size = Math.min(size, childAt.getMeasuredWidth() + paddingLeft);
        } else if (mode2 != 1073741824) {
            size = childAt.getMeasuredWidth() + paddingLeft;
        }
        if (mode != Integer.MIN_VALUE) {
            iMin = mode != 1073741824 ? childAt.getMeasuredHeight() + paddingTop : size2;
        } else {
            iMin = Math.min(size2, childAt.getMeasuredHeight() + paddingTop);
        }
        setMeasuredDimension(size, iMin);
        if (this.decorFitsSystemWindows || childAt.getMeasuredHeight() + paddingTop <= size2 || getWindow().getAttributes().height != -2) {
            return;
        }
        getWindow().addFlags(t04.INVALID_ID);
        if (this.usePlatformDefaultWidth) {
            return;
        }
        getWindow().setLayout(-1, -1);
    }
}
