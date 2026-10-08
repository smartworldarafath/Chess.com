package androidx.compose.p002material3;

import android.content.res.Configuration;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.compose.p002material3.i0;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import com.google.inputmethod.b7;
import com.google.inputmethod.f43;
import com.google.inputmethod.jba;
import com.google.inputmethod.jd3;
import com.google.inputmethod.k16;
import com.google.inputmethod.kd3;
import com.google.inputmethod.q6c;
import com.google.inputmethod.rhe;
import com.google.inputmethod.s6b;
import com.google.inputmethod.saa;
import com.google.inputmethod.sg9;
import com.google.inputmethod.vn3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001d\u0010\u0006\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a-\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001a²\u0006\f\u0010\u0019\u001a\u00020\n8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/google/android/rhe;", "k", "(Landroidx/compose/runtime/d;I)Lcom/google/android/rhe;", "Lkotlin/Function0;", "", "block", "d", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/d;I)V", "Landroidx/compose/material3/f0;", "anchorType", "", "alwaysFocusable", "Lcom/google/android/sg9;", "l", "(Ljava/lang/String;ZLandroidx/compose/runtime/d;I)Lcom/google/android/sg9;", "Landroid/view/View;", "view", "Lcom/google/android/f43;", "density", "onKeyboardVisibilityChange", "f", "(Landroid/view/View;Lcom/google/android/f43;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/d;I)V", "Lcom/google/android/k16;", "j", "(Landroid/view/View;)Lcom/google/android/k16;", "a11yServicesEnabled", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class i0 {

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\u0005J\r\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u0005R\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000f¨\u0006\u0011"}, d2 = {"androidx/compose/material3/i0$a", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "", "b", "()V", "c", "Landroid/view/View;", "p0", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "onGlobalLayout", "a", "", "Z", "isListeningToGlobalLayout", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private boolean isListeningToGlobalLayout;
        final /* synthetic */ View b;
        final /* synthetic */ Function0<Unit> c;

        a(View view, Function0<Unit> function0) {
            this.b = view;
            this.c = function0;
            view.addOnAttachStateChangeListener(this);
            b();
        }

        private final void b() {
            if (this.isListeningToGlobalLayout || !this.b.isAttachedToWindow()) {
                return;
            }
            this.b.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.isListeningToGlobalLayout = true;
        }

        private final void c() {
            if (this.isListeningToGlobalLayout) {
                this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                this.isListeningToGlobalLayout = false;
            }
        }

        public final void a() {
            c();
            this.b.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.c.invoke();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View p0) {
            b();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View p0) {
            c();
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/material3/i0$b", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements jd3 {
        final /* synthetic */ a a;

        public b(a aVar) {
            this.a = aVar;
        }

        @Override // com.google.inputmethod.jd3
        public void dispose() {
            this.a.a();
        }
    }

    public static final void d(final Function0<Unit> function0, d dVar, final int i) {
        int i2;
        d dVarF = dVar.F(-1646555525);
        if ((i & 6) == 0) {
            i2 = (dVarF.T(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (dVarF.g((i2 & 3) != 2, i2 & 1)) {
            if (e.k()) {
                e.o(-1646555525, i2, -1, "androidx.compose.material3.OnPlatformWindowBoundsChange (ExposedDropdownMenu.android.kt:47)");
            }
            f((View) dVarF.v(AndroidCompositionLocals_androidKt.g()), (f43) dVarF.v(CompositionLocalsKt.g()), function0, dVarF, (i2 << 6) & 896);
            if (e.k()) {
                e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.k14
                public final Object invoke(Object obj, Object obj2) {
                    return i0.e(function0, i, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(Function0 function0, int i, d dVar, int i2) {
        d(function0, dVar, saa.a(i | 1));
        return Unit.a;
    }

    private static final void f(final View view, final f43 f43Var, final Function0<Unit> function0, d dVar, final int i) {
        int i2;
        d dVarF = dVar.F(-1319522472);
        if ((i & 6) == 0) {
            i2 = (dVarF.T(view) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dVarF.x(f43Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dVarF.T(function0) ? 256 : 128;
        }
        if (dVarF.g((i2 & 147) != 146, i2 & 1)) {
            if (e.k()) {
                e.o(-1319522472, i2, -1, "androidx.compose.material3.SoftKeyboardListener (ExposedDropdownMenu.android.kt:85)");
            }
            boolean zT = dVarF.T(view) | ((i2 & 896) == 256);
            Object objR = dVarF.R();
            if (zT || objR == d.INSTANCE.a()) {
                objR = new Function1() { // from class: com.google.android.l14
                    public final Object invoke(Object obj) {
                        return i0.g(view, function0, (kd3) obj);
                    }
                };
                dVarF.L(objR);
            }
            vn3.b(view, f43Var, (Function1) objR, dVarF, i2 & 126);
            if (e.k()) {
                e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.m14
                public final Object invoke(Object obj, Object obj2) {
                    return i0.h(view, f43Var, function0, i, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jd3 g(View view, Function0 function0, kd3 kd3Var) {
        return new b(new a(view, function0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(View view, f43 f43Var, Function0 function0, int i, d dVar, int i2) {
        f(view, f43Var, function0, dVar, saa.a(i | 1));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k16 j(View view) {
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        return jba.d(rect);
    }

    public static final rhe k(d dVar, int i) {
        if (e.k()) {
            e.o(703324275, i, -1, "androidx.compose.material3.platformWindowBoundsCalculator (ExposedDropdownMenu.android.kt:40)");
        }
        Object obj = (Configuration) dVar.v(AndroidCompositionLocals_androidKt.b());
        View view = (View) dVar.v(AndroidCompositionLocals_androidKt.g());
        boolean zX = dVar.x(obj) | dVar.x(view);
        Object objR = dVar.R();
        if (zX || objR == d.INSTANCE.a()) {
            objR = new rhe(view);
            dVar.L(objR);
        }
        rhe rheVar = (rhe) objR;
        if (e.k()) {
            e.n();
        }
        return rheVar;
    }

    public static final sg9 l(String str, boolean z, d dVar, int i) {
        if (e.k()) {
            e.o(895018515, i, -1, "androidx.compose.material3.popupPropertiesForAnchorType (ExposedDropdownMenu.android.kt:57)");
        }
        q6c<Boolean> q6cVarN = b7.n(false, false, false, dVar, 0, 7);
        int i2 = !m(q6cVarN) ? 393248 : 393216;
        f0.Companion companion = f0.INSTANCE;
        if ((f0.g(str, companion.a()) || (f0.g(str, companion.c()) && !m(q6cVarN))) && !z) {
            i2 |= 8;
        }
        sg9 sg9Var = new sg9(i2, false, false, false, false, false, 62, (DefaultConstructorMarker) null);
        if (e.k()) {
            e.n();
        }
        return sg9Var;
    }

    private static final boolean m(q6c<Boolean> q6cVar) {
        return q6cVar.getValue().booleanValue();
    }
}
