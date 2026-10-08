package com.google.inputmethod;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class k7e {
    private static WeakHashMap<View, eae> a = null;
    private static Field b = null;
    private static boolean c = false;
    private static final int[] d = {bz9.b, bz9.c, bz9.n, bz9.y, bz9.B, bz9.C, bz9.D, bz9.E, bz9.F, bz9.G, bz9.d, bz9.e, bz9.f, bz9.g, bz9.h, bz9.i, bz9.j, bz9.k, bz9.l, bz9.m, bz9.o, bz9.p, bz9.q, bz9.r, bz9.s, bz9.t, bz9.u, bz9.v, bz9.w, bz9.x, bz9.z, bz9.A};
    private static final or8 e = new or8() { // from class: com.google.android.j7e
        @Override // com.google.inputmethod.or8
        public final jz1 onReceiveContent(jz1 jz1Var) {
            return k7e.a(jz1Var);
        }
    };
    private static final e f = new e();

    class a extends f<Boolean> {
        a(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.k7e.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(l.c(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.k7e.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, Boolean bool) {
            l.f(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.k7e.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    class b extends f<CharSequence> {
        b(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.k7e.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return l.a(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.k7e.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, CharSequence charSequence) {
            l.e(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.k7e.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    class c extends f<CharSequence> {
        c(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.k7e.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return n.b(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.k7e.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, CharSequence charSequence) {
            n.d(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.k7e.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    class d extends f<Boolean> {
        d(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.k7e.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(l.b(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.k7e.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, Boolean bool) {
            l.d(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.k7e.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
        private final WeakHashMap<View, Boolean> a = new WeakHashMap<>();

        e() {
        }

        private void b(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        private void d(View view) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        void a(View view) {
            this.a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (view.isAttachedToWindow()) {
                b(view);
            }
        }

        void c(View view) {
            this.a.remove(view);
            view.removeOnAttachStateChangeListener(this);
            d(view);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            b(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    static abstract class f<T> {
        private final int a;
        private final Class<T> b;
        private final int c;
        private final int d;

        f(int i, Class<T> cls, int i2) {
            this(i, cls, 0, i2);
        }

        private boolean b() {
            return Build.VERSION.SDK_INT >= this.c;
        }

        boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        abstract T c(View view);

        abstract void d(View view, T t);

        T e(View view) {
            if (b()) {
                return c(view);
            }
            T t = (T) view.getTag(this.a);
            if (this.b.isInstance(t)) {
                return t;
            }
            return null;
        }

        void f(View view, T t) {
            if (b()) {
                d(view, t);
            } else if (g(e(view), t)) {
                k7e.j(view);
                view.setTag(this.a, t);
                k7e.T(view, this.d);
            }
        }

        abstract boolean g(T t, T t2);

        f(int i, Class<T> cls, int i2, int i3) {
            this.a = i;
            this.b = cls;
            this.d = i2;
            this.c = i3;
        }
    }

    static class g {
        static WindowInsets a(View view, WindowInsets windowInsets) {
            return z7e.b ? z7e.b(view, windowInsets) : view.dispatchApplyWindowInsets(windowInsets);
        }
    }

    private static class h {

        class a implements View.OnApplyWindowInsetsListener {
            kie a = null;
            final /* synthetic */ View b;
            final /* synthetic */ vp8 c;

            a(View view, vp8 vp8Var) {
                this.b = view;
                this.c = vp8Var;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                kie kieVarG = kie.G(windowInsets, view);
                int i = Build.VERSION.SDK_INT;
                if (i < 30) {
                    h.a(windowInsets, this.b);
                    if (kieVarG.equals(this.a)) {
                        return this.c.a(view, kieVarG).E();
                    }
                }
                this.a = kieVarG;
                kie kieVarA = this.c.a(view, kieVarG);
                if (i >= 30) {
                    return kieVarA.E();
                }
                k7e.i0(view);
                return kieVarA.E();
            }
        }

        static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(bz9.S);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        static kie b(View view, kie kieVar, Rect rect) {
            WindowInsets windowInsetsE = kieVar.E();
            if (windowInsetsE != null) {
                return kie.G(view.computeSystemWindowInsets(windowInsetsE, rect), view);
            }
            rect.setEmpty();
            return kieVar;
        }

        static void c(View view, vp8 vp8Var) {
            a aVar = vp8Var != null ? new a(view, vp8Var) : null;
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(bz9.M, aVar);
            }
            if (view.getTag(bz9.L) != null) {
                return;
            }
            if (aVar != null) {
                view.setOnApplyWindowInsetsListener(aVar);
            } else {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(bz9.S));
            }
        }
    }

    private static class i {
        public static kie a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            kie kieVarF = kie.F(rootWindowInsets);
            kieVarF.z(kieVarF);
            kieVarF.p(view.getRootView());
            return kieVarF;
        }
    }

    static class j {
        static void a(View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }
    }

    static class k {
        static int a(View view) {
            return view.getImportantForAutofill();
        }

        static void b(View view, int i) {
            view.setImportantForAutofill(i);
        }
    }

    static class l {
        static CharSequence a(View view) {
            return view.getAccessibilityPaneTitle();
        }

        static boolean b(View view) {
            return view.isAccessibilityHeading();
        }

        static boolean c(View view) {
            return view.isScreenReaderFocusable();
        }

        static void d(View view, boolean z) {
            view.setAccessibilityHeading(z);
        }

        static void e(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        static void f(View view, boolean z) {
            view.setScreenReaderFocusable(z);
        }
    }

    private static class m {
        static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        static void b(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    private static class n {
        static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        static CharSequence b(View view) {
            return view.getStateDescription();
        }

        public static kje c(View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return kje.g(windowInsetsController);
            }
            return null;
        }

        static void d(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    private static final class o {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static jz1 b(View view, jz1 jz1Var) {
            ContentInfo contentInfoF = jz1Var.f();
            ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoF);
            if (contentInfoPerformReceiveContent == null) {
                return null;
            }
            return contentInfoPerformReceiveContent == contentInfoF ? jz1Var : jz1.g(contentInfoPerformReceiveContent);
        }
    }

    @Deprecated
    public static int A(View view) {
        return view.getMinimumWidth();
    }

    public static void A0(View view, oe9 oe9Var) {
        j.a(view, (PointerIcon) (oe9Var != null ? oe9Var.a() : null));
    }

    public static String[] B(View view) {
        return Build.VERSION.SDK_INT >= 31 ? o.a(view) : (String[]) view.getTag(bz9.O);
    }

    public static void B0(View view, boolean z) {
        k0().f(view, Boolean.valueOf(z));
    }

    @Deprecated
    public static int C(View view) {
        return view.getPaddingEnd();
    }

    public static void C0(View view, int i2, int i3) {
        view.setScrollIndicators(i2, i3);
    }

    @Deprecated
    public static int D(View view) {
        return view.getPaddingStart();
    }

    public static void D0(View view, CharSequence charSequence) {
        I0().f(view, charSequence);
    }

    @Deprecated
    public static ViewParent E(View view) {
        return view.getParentForAccessibility();
    }

    public static void E0(View view, String str) {
        view.setTransitionName(str);
    }

    public static kie F(View view) {
        return i.a(view);
    }

    public static void F0(View view, float f2) {
        view.setTranslationZ(f2);
    }

    public static CharSequence G(View view) {
        return I0().e(view);
    }

    public static void G0(View view, whe.b bVar) {
        whe.e(view, bVar);
    }

    public static String H(View view) {
        return view.getTransitionName();
    }

    public static void H0(View view, float f2) {
        view.setZ(f2);
    }

    public static float I(View view) {
        return view.getTranslationZ();
    }

    private static f<CharSequence> I0() {
        return new c(bz9.Q, CharSequence.class, 64, 30);
    }

    @Deprecated
    public static kje J(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return n.c(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return she.a(window, view);
                }
                return null;
            }
        }
        return null;
    }

    public static void J0(View view) {
        view.stopNestedScroll();
    }

    @Deprecated
    public static int K(View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static float L(View view) {
        return view.getZ();
    }

    public static boolean M(View view) {
        return l(view) != null;
    }

    @Deprecated
    public static boolean N(View view) {
        return view.hasTransientState();
    }

    public static boolean O(View view) {
        Boolean boolE = b().e(view);
        return boolE != null && boolE.booleanValue();
    }

    @Deprecated
    public static boolean P(View view) {
        return view.isAttachedToWindow();
    }

    @Deprecated
    public static boolean Q(View view) {
        return view.isLaidOut();
    }

    public static boolean R(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static boolean S(View view) {
        Boolean boolE = k0().e(view);
        return boolE != null && boolE.booleanValue();
    }

    static void T(View view, int i2) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = n(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i2);
                if (z) {
                    accessibilityEventObtain.getText().add(n(view));
                    u0(view);
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i2 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i2);
                        return;
                    } catch (AbstractMethodError unused) {
                        view.getParent().getClass();
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i2);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(n(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    public static void U(View view, int i2) {
        view.offsetLeftAndRight(i2);
    }

    public static void V(View view, int i2) {
        view.offsetTopAndBottom(i2);
    }

    public static kie W(View view, kie kieVar) {
        WindowInsets windowInsetsE = kieVar.E();
        if (windowInsetsE != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = view.onApplyWindowInsets(windowInsetsE);
            if (!windowInsetsOnApplyWindowInsets.equals(windowInsetsE)) {
                return kie.G(windowInsetsOnApplyWindowInsets, view);
            }
        }
        return kieVar;
    }

    @Deprecated
    public static void X(View view, r6 r6Var) {
        view.onInitializeAccessibilityNodeInfo(r6Var.n1());
    }

    private static f<CharSequence> Y() {
        return new b(bz9.K, CharSequence.class, 8, 28);
    }

    @Deprecated
    public static boolean Z(View view, int i2, Bundle bundle) {
        return view.performAccessibilityAction(i2, bundle);
    }

    public static /* synthetic */ jz1 a(jz1 jz1Var) {
        return jz1Var;
    }

    public static boolean a0(View view, int i2) {
        int iA = d65.a(i2);
        if (iA == -1) {
            return false;
        }
        return view.performHapticFeedback(iA);
    }

    private static f<Boolean> b() {
        return new d(bz9.J, Boolean.class, 28);
    }

    public static jz1 b0(View view, jz1 jz1Var) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Objects.toString(jz1Var);
            view.getClass();
            view.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return o.b(view, jz1Var);
        }
        nr8 nr8Var = (nr8) view.getTag(bz9.N);
        if (nr8Var == null) {
            return u(view).onReceiveContent(jz1Var);
        }
        jz1 jz1VarA = nr8Var.a(view, jz1Var);
        if (jz1VarA == null) {
            return null;
        }
        return u(view).onReceiveContent(jz1VarA);
    }

    public static int c(View view, CharSequence charSequence, j7 j7Var) {
        int iP = p(view, charSequence);
        if (iP != -1) {
            d(view, new r6.a(iP, charSequence, j7Var));
        }
        return iP;
    }

    @Deprecated
    public static void c0(View view) {
        view.postInvalidateOnAnimation();
    }

    private static void d(View view, r6.a aVar) {
        j(view);
        g0(aVar.b(), view);
        o(view).add(aVar);
        T(view, 0);
    }

    @Deprecated
    public static void d0(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static void e(ViewGroup viewGroup, View view) {
        viewGroup.getOverlay().add(view);
        cbe.b((View) view.getParent(), viewGroup);
    }

    @Deprecated
    public static void e0(View view, Runnable runnable, long j2) {
        view.postOnAnimationDelayed(runnable, j2);
    }

    @Deprecated
    public static eae f(View view) {
        if (a == null) {
            a = new WeakHashMap<>();
        }
        eae eaeVar = a.get(view);
        if (eaeVar != null) {
            return eaeVar;
        }
        eae eaeVar2 = new eae(view);
        a.put(view, eaeVar2);
        return eaeVar2;
    }

    public static void f0(View view, int i2) {
        g0(i2, view);
        T(view, 0);
    }

    public static kie g(View view, kie kieVar, Rect rect) {
        return h.b(view, kieVar, rect);
    }

    private static void g0(int i2, View view) {
        List<r6.a> listO = o(view);
        for (int i3 = 0; i3 < listO.size(); i3++) {
            if (listO.get(i3).b() == i2) {
                listO.remove(i3);
                return;
            }
        }
    }

    public static kie h(View view, kie kieVar) {
        WindowInsets windowInsetsE = kieVar.E();
        if (windowInsetsE != null) {
            WindowInsets windowInsetsA = Build.VERSION.SDK_INT >= 30 ? n.a(view, windowInsetsE) : g.a(view, windowInsetsE);
            if (!windowInsetsA.equals(windowInsetsE)) {
                return kie.G(windowInsetsA, view);
            }
        }
        return kieVar;
    }

    public static void h0(View view, r6.a aVar, CharSequence charSequence, j7 j7Var) {
        if (j7Var == null && charSequence == null) {
            f0(view, aVar.b());
        } else {
            d(view, aVar.a(charSequence, j7Var));
        }
    }

    static boolean i(View view, KeyEvent keyEvent) {
        return false;
    }

    public static void i0(View view) {
        view.requestApplyInsets();
    }

    static void j(View view) {
        a6 a6VarK = k(view);
        if (a6VarK == null) {
            a6VarK = new a6();
        }
        l0(view, a6VarK);
    }

    public static void j0(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 29) {
            m.b(view, context, iArr, attributeSet, typedArray, i2, i3);
        }
    }

    public static a6 k(View view) {
        View.AccessibilityDelegate accessibilityDelegateL = l(view);
        if (accessibilityDelegateL == null) {
            return null;
        }
        return accessibilityDelegateL instanceof a6.a ? ((a6.a) accessibilityDelegateL).a : new a6(accessibilityDelegateL);
    }

    private static f<Boolean> k0() {
        return new a(bz9.P, Boolean.class, 28);
    }

    private static View.AccessibilityDelegate l(View view) {
        return Build.VERSION.SDK_INT >= 29 ? m.a(view) : m(view);
    }

    public static void l0(View view, a6 a6Var) {
        if (a6Var == null && (l(view) instanceof a6.a)) {
            a6Var = new a6();
        }
        u0(view);
        view.setAccessibilityDelegate(a6Var == null ? null : a6Var.getBridge());
    }

    private static View.AccessibilityDelegate m(View view) {
        if (c) {
            return null;
        }
        if (b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                c = true;
                return null;
            }
        }
        try {
            Object obj = b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            c = true;
            return null;
        }
    }

    public static void m0(View view, boolean z) {
        b().f(view, Boolean.valueOf(z));
    }

    public static CharSequence n(View view) {
        return Y().e(view);
    }

    @Deprecated
    public static void n0(View view, int i2) {
        view.setAccessibilityLiveRegion(i2);
    }

    private static List<r6.a> o(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(bz9.H);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(bz9.H, arrayList2);
        return arrayList2;
    }

    public static void o0(View view, CharSequence charSequence) {
        Y().f(view, charSequence);
        if (charSequence != null) {
            f.a(view);
        } else {
            f.c(view);
        }
    }

    private static int p(View view, CharSequence charSequence) {
        List<r6.a> listO = o(view);
        for (int i2 = 0; i2 < listO.size(); i2++) {
            if (TextUtils.equals(charSequence, listO.get(i2).c())) {
                return listO.get(i2).b();
            }
        }
        int i3 = -1;
        int i4 = 0;
        while (true) {
            int[] iArr = d;
            if (i4 >= iArr.length || i3 != -1) {
                break;
            }
            int i5 = iArr[i4];
            boolean z = true;
            for (int i6 = 0; i6 < listO.size(); i6++) {
                z &= listO.get(i6).b() != i5;
            }
            if (z) {
                i3 = i5;
            }
            i4++;
        }
        return i3;
    }

    @Deprecated
    public static void p0(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static ColorStateList q(View view) {
        return view.getBackgroundTintList();
    }

    public static void q0(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static PorterDuff.Mode r(View view) {
        return view.getBackgroundTintMode();
    }

    public static void r0(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    @Deprecated
    public static Display s(View view) {
        return view.getDisplay();
    }

    public static void s0(View view, float f2) {
        view.setElevation(f2);
    }

    public static float t(View view) {
        return view.getElevation();
    }

    @Deprecated
    public static void t0(View view, int i2) {
        view.setImportantForAccessibility(i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static or8 u(View view) {
        return view instanceof or8 ? (or8) view : e;
    }

    private static void u0(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    @Deprecated
    public static boolean v(View view) {
        return view.getFitsSystemWindows();
    }

    public static void v0(View view, int i2) {
        k.b(view, i2);
    }

    @Deprecated
    public static int w(View view) {
        return view.getImportantForAccessibility();
    }

    @Deprecated
    public static void w0(View view, int i2) {
        view.setLabelFor(i2);
    }

    public static int x(View view) {
        return k.a(view);
    }

    @Deprecated
    public static void x0(View view, int i2) {
        view.setLayoutDirection(i2);
    }

    @Deprecated
    public static int y(View view) {
        return view.getLayoutDirection();
    }

    public static void y0(View view, boolean z) {
        view.setNestedScrollingEnabled(z);
    }

    @Deprecated
    public static int z(View view) {
        return view.getMinimumHeight();
    }

    public static void z0(View view, vp8 vp8Var) {
        h.c(view, vp8Var);
    }
}
