package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.WindowCallbackWrapper;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.appcompat.widget.k0;
import androidx.appcompat.widget.m0;
import androidx.appcompat.widget.n0;
import androidx.lifecycle.Lifecycle;
import com.google.inputmethod.a8;
import com.google.inputmethod.as2;
import com.google.inputmethod.ax9;
import com.google.inputmethod.d1a;
import com.google.inputmethod.dd8;
import com.google.inputmethod.eae;
import com.google.inputmethod.h77;
import com.google.inputmethod.hae;
import com.google.inputmethod.iec;
import com.google.inputmethod.iv;
import com.google.inputmethod.j22;
import com.google.inputmethod.k7e;
import com.google.inputmethod.kec;
import com.google.inputmethod.kie;
import com.google.inputmethod.kx9;
import com.google.inputmethod.lv;
import com.google.inputmethod.m0a;
import com.google.inputmethod.mla;
import com.google.inputmethod.mv;
import com.google.inputmethod.n17;
import com.google.inputmethod.o7;
import com.google.inputmethod.oy9;
import com.google.inputmethod.pi6;
import com.google.inputmethod.qpb;
import com.google.inputmethod.rv;
import com.google.inputmethod.rz9;
import com.google.inputmethod.s02;
import com.google.inputmethod.sn6;
import com.google.inputmethod.t7;
import com.google.inputmethod.tg9;
import com.google.inputmethod.uv;
import com.google.inputmethod.vp8;
import com.google.inputmethod.x4c;
import com.google.inputmethod.xv;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
class e extends androidx.appcompat.app.c implements androidx.appcompat.view.menu.e.a, LayoutInflater.Factory2 {
    private static final qpb<String, Integer> j0 = new qpb<>();
    private static final boolean k0 = false;
    private static final int[] l0 = {R.attr.windowBackground};
    private static final boolean m0 = !"robolectric".equals(Build.FINGERPRINT);
    private boolean A;
    ViewGroup B;
    private TextView C;
    private View D;
    private boolean E;
    private boolean F;
    boolean G;
    boolean H;
    boolean I;
    boolean J;
    boolean K;
    private boolean L;
    private s[] M;
    private s N;
    private boolean O;
    private boolean P;
    private boolean Q;
    boolean R;
    private Configuration S;
    private int T;
    private int U;
    private int V;
    private boolean W;
    private p X;
    private p Y;
    boolean Z;
    int a0;
    private final Runnable b0;
    private boolean c0;
    private Rect d0;
    private Rect e0;
    private xv f0;
    private androidx.appcompat.app.g g0;
    private OnBackInvokedDispatcher h0;
    private OnBackInvokedCallback i0;
    final Object j;
    final Context k;
    Window l;
    private n m;
    final iv n;
    androidx.appcompat.app.a o;
    MenuInflater p;
    private CharSequence q;
    private as2 r;
    private h s;
    private t t;
    t7 u;
    ActionBarContextView v;
    PopupWindow w;
    Runnable x;
    eae y;
    private boolean z;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar = e.this;
            if ((eVar.a0 & 1) != 0) {
                eVar.q0(0);
            }
            e eVar2 = e.this;
            if ((eVar2.a0 & 4096) != 0) {
                eVar2.q0(108);
            }
            e eVar3 = e.this;
            eVar3.Z = false;
            eVar3.a0 = 0;
        }
    }

    class b implements vp8 {
        b() {
        }

        @Override // com.google.inputmethod.vp8
        public kie a(View view, kie kieVar) {
            int iN = kieVar.n();
            int iM1 = e.this.m1(kieVar, null);
            if (iN != iM1) {
                kieVar = kieVar.v(kieVar.l(), iM1, kieVar.m(), kieVar.k());
            }
            return k7e.W(view, kieVar);
        }
    }

    class c implements ContentFrameLayout.a {
        c() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            e.this.o0();
        }
    }

    class d implements Runnable {

        class a extends hae {
            a() {
            }

            @Override // com.google.inputmethod.gae
            public void b(View view) {
                e.this.v.setAlpha(1.0f);
                e.this.y.g(null);
                e.this.y = null;
            }

            @Override // com.google.inputmethod.hae, com.google.inputmethod.gae
            public void c(View view) {
                e.this.v.setVisibility(0);
            }
        }

        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar = e.this;
            eVar.w.showAtLocation(eVar.v, 55, 0, 0);
            e.this.r0();
            if (!e.this.c1()) {
                e.this.v.setAlpha(1.0f);
                e.this.v.setVisibility(0);
            } else {
                e.this.v.setAlpha(0.0f);
                e eVar2 = e.this;
                eVar2.y = k7e.f(eVar2.v).b(1.0f);
                e.this.y.g(new a());
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.e$e, reason: collision with other inner class name */
    class C0008e extends hae {
        C0008e() {
        }

        @Override // com.google.inputmethod.gae
        public void b(View view) {
            e.this.v.setAlpha(1.0f);
            e.this.y.g(null);
            e.this.y = null;
        }

        @Override // com.google.inputmethod.hae, com.google.inputmethod.gae
        public void c(View view) {
            e.this.v.setVisibility(0);
            if (e.this.v.getParent() instanceof View) {
                k7e.i0((View) e.this.v.getParent());
            }
        }
    }

    private class f implements o7 {
        f() {
        }
    }

    interface g {
        boolean a(int i);

        View onCreatePanelView(int i);
    }

    private final class h implements androidx.appcompat.view.menu.j.a {
        h() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void a(androidx.appcompat.view.menu.e eVar, boolean z) {
            e.this.h0(eVar);
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean b(androidx.appcompat.view.menu.e eVar) {
            Window.Callback callbackD0 = e.this.D0();
            if (callbackD0 == null) {
                return true;
            }
            callbackD0.onMenuOpened(108, eVar);
            return true;
        }
    }

    class i implements t7.a {
        private t7.a a;

        class a extends hae {
            a() {
            }

            @Override // com.google.inputmethod.gae
            public void b(View view) {
                e.this.v.setVisibility(8);
                e eVar = e.this;
                PopupWindow popupWindow = eVar.w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (eVar.v.getParent() instanceof View) {
                    k7e.i0((View) e.this.v.getParent());
                }
                e.this.v.k();
                e.this.y.g(null);
                e eVar2 = e.this;
                eVar2.y = null;
                k7e.i0(eVar2.B);
            }
        }

        public i(t7.a aVar) {
            this.a = aVar;
        }

        @Override // com.google.android.t7.a
        public boolean a(t7 t7Var, Menu menu) {
            k7e.i0(e.this.B);
            return this.a.a(t7Var, menu);
        }

        @Override // com.google.android.t7.a
        public boolean b(t7 t7Var, Menu menu) {
            return this.a.b(t7Var, menu);
        }

        @Override // com.google.android.t7.a
        public boolean c(t7 t7Var, MenuItem menuItem) {
            return this.a.c(t7Var, menuItem);
        }

        @Override // com.google.android.t7.a
        public void d(t7 t7Var) {
            this.a.d(t7Var);
            e eVar = e.this;
            if (eVar.w != null) {
                eVar.l.getDecorView().removeCallbacks(e.this.x);
            }
            e eVar2 = e.this;
            if (eVar2.v != null) {
                eVar2.r0();
                e eVar3 = e.this;
                eVar3.y = k7e.f(eVar3.v).b(0.0f);
                e.this.y.g(new a());
            }
            e eVar4 = e.this;
            iv ivVar = eVar4.n;
            if (ivVar != null) {
                ivVar.onSupportActionModeFinished(eVar4.u);
            }
            e eVar5 = e.this;
            eVar5.u = null;
            k7e.i0(eVar5.B);
            e.this.k1();
        }
    }

    static class j {
        static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        static String b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    static class k {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        static h77 b(Configuration configuration) {
            return h77.b(configuration.getLocales().toLanguageTags());
        }

        public static void c(h77 h77Var) {
            LocaleList.setDefault(LocaleList.forLanguageTags(h77Var.h()));
        }

        static void d(Configuration configuration, h77 h77Var) {
            configuration.setLocales(LocaleList.forLanguageTags(h77Var.h()));
        }
    }

    static class l {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i = configuration.colorMode & 3;
            int i2 = configuration2.colorMode;
            if (i != (i2 & 3)) {
                configuration3.colorMode |= i2 & 3;
            }
            int i3 = configuration.colorMode & 12;
            int i4 = configuration2.colorMode;
            if (i3 != (i4 & 12)) {
                configuration3.colorMode |= i4 & 12;
            }
        }
    }

    static class m {
        static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        static OnBackInvokedCallback b(Object obj, final e eVar) {
            Objects.requireNonNull(eVar);
            OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: androidx.appcompat.app.f
                public final void onBackInvoked() {
                    eVar.L0();
                }
            };
            mv.a(obj).registerOnBackInvokedCallback(1000000, onBackInvokedCallback);
            return onBackInvokedCallback;
        }

        static void c(Object obj, Object obj2) {
            mv.a(obj).unregisterOnBackInvokedCallback(lv.a(obj2));
        }
    }

    class n extends WindowCallbackWrapper {
        private g a;
        private boolean b;
        private boolean c;
        private boolean d;

        n(Window.Callback callback) {
            super(callback);
        }

        public boolean b(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.c = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.c = false;
            }
        }

        public void c(Window.Callback callback) {
            try {
                this.b = true;
                callback.onContentChanged();
            } finally {
                this.b = false;
            }
        }

        public void d(Window.Callback callback, int i, Menu menu) {
            try {
                this.d = true;
                callback.onPanelClosed(i, menu);
            } finally {
                this.d = false;
            }
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (this.c) {
                return a().dispatchKeyEvent(keyEvent);
            }
            return e.this.p0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || e.this.O0(keyEvent.getKeyCode(), keyEvent);
        }

        void e(g gVar) {
            this.a = gVar;
        }

        final ActionMode f(ActionMode.Callback callback) {
            iec.a aVar = new iec.a(e.this.k, callback);
            t7 t7VarX = e.this.X(aVar);
            if (t7VarX != null) {
                return aVar.e(t7VarX);
            }
            return null;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public void onContentChanged() {
            if (this.b) {
                a().onContentChanged();
            }
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof androidx.appcompat.view.menu.e)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public View onCreatePanelView(int i) {
            View viewOnCreatePanelView;
            g gVar = this.a;
            return (gVar == null || (viewOnCreatePanelView = gVar.onCreatePanelView(i)) == null) ? super.onCreatePanelView(i) : viewOnCreatePanelView;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            e.this.R0(i);
            return true;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public void onPanelClosed(int i, Menu menu) {
            if (this.d) {
                a().onPanelClosed(i, menu);
            } else {
                super.onPanelClosed(i, menu);
                e.this.S0(i);
            }
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            androidx.appcompat.view.menu.e eVar = menu instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) menu : null;
            if (i == 0 && eVar == null) {
                return false;
            }
            if (eVar != null) {
                eVar.f0(true);
            }
            g gVar = this.a;
            boolean zOnPreparePanel = gVar != null && gVar.a(i);
            if (!zOnPreparePanel) {
                zOnPreparePanel = super.onPreparePanel(i, view, menu);
            }
            if (eVar != null) {
                eVar.f0(false);
            }
            return zOnPreparePanel;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            androidx.appcompat.view.menu.e eVar;
            s sVarB0 = e.this.B0(0, true);
            if (sVarB0 == null || (eVar = sVarB0.j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, eVar, i);
            }
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            return (e.this.J0() && i == 0) ? f(callback) : super.onWindowStartingActionMode(callback, i);
        }
    }

    private class o extends p {
        private final PowerManager c;

        o(Context context) {
            super();
            this.c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.e.p
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.e.p
        public int c() {
            return j.a(this.c) ? 2 : 1;
        }

        @Override // androidx.appcompat.app.e.p
        public void d() {
            e.this.h();
        }
    }

    abstract class p {
        private BroadcastReceiver a;

        class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                p.this.d();
            }
        }

        p() {
        }

        void a() {
            BroadcastReceiver broadcastReceiver = this.a;
            if (broadcastReceiver != null) {
                try {
                    e.this.k.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.a = null;
            }
        }

        abstract IntentFilter b();

        abstract int c();

        abstract void d();

        void e() {
            a();
            IntentFilter intentFilterB = b();
            if (intentFilterB == null || intentFilterB.countActions() == 0) {
                return;
            }
            if (this.a == null) {
                this.a = new a();
            }
            e.this.k.registerReceiver(this.a, intentFilterB);
        }
    }

    private class q extends p {
        private final androidx.appcompat.app.k c;

        q(androidx.appcompat.app.k kVar) {
            super();
            this.c = kVar;
        }

        @Override // androidx.appcompat.app.e.p
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.e.p
        public int c() {
            return this.c.d() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.e.p
        public void d() {
            e.this.h();
        }
    }

    private class r extends ContentFrameLayout {
        public r(Context context) {
            super(context);
        }

        private boolean b(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return e.this.p0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !b((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            e.this.j0(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i) {
            setBackgroundDrawable(uv.b(getContext(), i));
        }
    }

    protected static final class s {
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
        ViewGroup g;
        View h;
        View i;
        androidx.appcompat.view.menu.e j;
        androidx.appcompat.view.menu.c k;
        Context l;
        boolean m;
        boolean n;
        boolean o;
        public boolean p;
        boolean q = false;
        boolean r;
        Bundle s;

        s(int i) {
            this.a = i;
        }

        androidx.appcompat.view.menu.k a(androidx.appcompat.view.menu.j.a aVar) {
            if (this.j == null) {
                return null;
            }
            if (this.k == null) {
                androidx.appcompat.view.menu.c cVar = new androidx.appcompat.view.menu.c(this.l, rz9.j);
                this.k = cVar;
                cVar.h(aVar);
                this.j.b(this.k);
            }
            return this.k.l(this.g);
        }

        public boolean b() {
            if (this.h == null) {
                return false;
            }
            return this.i != null || this.k.i().getCount() > 0;
        }

        void c(androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.c cVar;
            androidx.appcompat.view.menu.e eVar2 = this.j;
            if (eVar == eVar2) {
                return;
            }
            if (eVar2 != null) {
                eVar2.R(this.k);
            }
            this.j = eVar;
            if (eVar == null || (cVar = this.k) == null) {
                return;
            }
            eVar.b(cVar);
        }

        void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(ax9.a, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                themeNewTheme.applyStyle(i, true);
            }
            themeNewTheme.resolveAttribute(ax9.H, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                themeNewTheme.applyStyle(i2, true);
            } else {
                themeNewTheme.applyStyle(m0a.e, true);
            }
            j22 j22Var = new j22(context, 0);
            j22Var.getTheme().setTo(themeNewTheme);
            this.l = j22Var;
            TypedArray typedArrayObtainStyledAttributes = j22Var.obtainStyledAttributes(d1a.y0);
            this.b = typedArrayObtainStyledAttributes.getResourceId(d1a.B0, 0);
            this.f = typedArrayObtainStyledAttributes.getResourceId(d1a.A0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private final class t implements androidx.appcompat.view.menu.j.a {
        t() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void a(androidx.appcompat.view.menu.e eVar, boolean z) {
            androidx.appcompat.view.menu.e eVarF = eVar.F();
            boolean z2 = eVarF != eVar;
            e eVar2 = e.this;
            if (z2) {
                eVar = eVarF;
            }
            s sVarU0 = eVar2.u0(eVar);
            if (sVarU0 != null) {
                if (!z2) {
                    e.this.k0(sVarU0, z);
                } else {
                    e.this.g0(sVarU0.a, sVarU0, eVarF);
                    e.this.k0(sVarU0, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean b(androidx.appcompat.view.menu.e eVar) {
            Window.Callback callbackD0;
            if (eVar != eVar.F()) {
                return true;
            }
            e eVar2 = e.this;
            if (!eVar2.G || (callbackD0 = eVar2.D0()) == null || e.this.R) {
                return true;
            }
            callbackD0.onMenuOpened(108, eVar);
            return true;
        }
    }

    e(Activity activity, iv ivVar) {
        this(activity, null, ivVar, activity);
    }

    private void E0() {
        s0();
        if (this.G && this.o == null) {
            Object obj = this.j;
            if (obj instanceof Activity) {
                this.o = new androidx.appcompat.app.l((Activity) this.j, this.H);
            } else if (obj instanceof Dialog) {
                this.o = new androidx.appcompat.app.l((Dialog) this.j);
            }
            androidx.appcompat.app.a aVar = this.o;
            if (aVar != null) {
                aVar.q(this.c0);
            }
        }
    }

    private boolean F0(s sVar) {
        View view = sVar.i;
        if (view != null) {
            sVar.h = view;
            return true;
        }
        if (sVar.j == null) {
            return false;
        }
        if (this.t == null) {
            this.t = new t();
        }
        View view2 = (View) sVar.a(this.t);
        sVar.h = view2;
        return view2 != null;
    }

    private boolean G0(s sVar) {
        sVar.d(w0());
        sVar.g = new r(sVar.l);
        sVar.c = 81;
        return true;
    }

    private boolean H0(s sVar) {
        Resources.Theme themeNewTheme;
        Context context = this.k;
        int i2 = sVar.a;
        if ((i2 == 0 || i2 == 108) && this.r != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(ax9.f, typedValue, true);
            if (typedValue.resourceId != 0) {
                themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(theme);
                themeNewTheme.applyStyle(typedValue.resourceId, true);
                themeNewTheme.resolveAttribute(ax9.g, typedValue, true);
            } else {
                theme.resolveAttribute(ax9.g, typedValue, true);
                themeNewTheme = null;
            }
            if (typedValue.resourceId != 0) {
                if (themeNewTheme == null) {
                    themeNewTheme = context.getResources().newTheme();
                    themeNewTheme.setTo(theme);
                }
                themeNewTheme.applyStyle(typedValue.resourceId, true);
            }
            if (themeNewTheme != null) {
                j22 j22Var = new j22(context, 0);
                j22Var.getTheme().setTo(themeNewTheme);
                context = j22Var;
            }
        }
        androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
        eVar.W(this);
        sVar.c(eVar);
        return true;
    }

    private void I0(int i2) {
        this.a0 = (1 << i2) | this.a0;
        if (this.Z) {
            return;
        }
        k7e.d0(this.l.getDecorView(), this.b0);
        this.Z = true;
    }

    private boolean N0(int i2, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        s sVarB0 = B0(i2, true);
        if (sVarB0.o) {
            return false;
        }
        return X0(sVarB0, keyEvent);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    private boolean Q0(int i2, KeyEvent keyEvent) {
        boolean zX0;
        AudioManager audioManager;
        as2 as2Var;
        if (this.u != null) {
            return false;
        }
        boolean zD = true;
        s sVarB0 = B0(i2, true);
        if (i2 != 0 || (as2Var = this.r) == null || !as2Var.a() || ViewConfiguration.get(this.k).hasPermanentMenuKey()) {
            boolean z = sVarB0.o;
            if (z || sVarB0.n) {
                k0(sVarB0, true);
                zD = z;
            } else if (sVarB0.m) {
                if (sVarB0.r) {
                    sVarB0.m = false;
                    zX0 = X0(sVarB0, keyEvent);
                } else {
                    zX0 = true;
                }
                if (zX0) {
                    U0(sVarB0, keyEvent);
                } else {
                    zD = false;
                }
            } else {
                zD = false;
            }
        } else if (this.r.c()) {
            zD = this.r.d();
        } else if (this.R || !X0(sVarB0, keyEvent)) {
            zD = false;
        } else {
            zD = this.r.b();
        }
        if (zD && (audioManager = (AudioManager) this.k.getApplicationContext().getSystemService("audio")) != null) {
            audioManager.playSoundEffect(0);
        }
        return zD;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    private void U0(s sVar, KeyEvent keyEvent) {
        int i2;
        ViewGroup.LayoutParams layoutParams;
        if (sVar.o || this.R) {
            return;
        }
        if (sVar.a == 0 && (this.k.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callbackD0 = D0();
        if (callbackD0 != null && !callbackD0.onMenuOpened(sVar.a, sVar.j)) {
            k0(sVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.k.getSystemService("window");
        if (windowManager != null && X0(sVar, keyEvent)) {
            ViewGroup viewGroup = sVar.g;
            if (viewGroup != null && !sVar.q) {
                View view = sVar.i;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i2 = -1;
                }
                sVar.n = false;
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i2, -2, sVar.d, sVar.e, 1002, 8519680, -3);
                layoutParams2.gravity = sVar.c;
                layoutParams2.windowAnimations = sVar.f;
                windowManager.addView(sVar.g, layoutParams2);
                sVar.o = true;
                if (sVar.a == 0) {
                    k1();
                }
            }
            if (viewGroup == null) {
                if (!G0(sVar) || sVar.g == null) {
                    return;
                }
            } else if (sVar.q && viewGroup.getChildCount() > 0) {
                sVar.g.removeAllViews();
            }
            if (!F0(sVar) || !sVar.b()) {
                sVar.q = true;
                return;
            }
            ViewGroup.LayoutParams layoutParams3 = sVar.h.getLayoutParams();
            if (layoutParams3 == null) {
                layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
            }
            sVar.g.setBackgroundResource(sVar.b);
            ViewParent parent = sVar.h.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(sVar.h);
            }
            sVar.g.addView(sVar.h, layoutParams3);
            if (!sVar.h.hasFocus()) {
                sVar.h.requestFocus();
            }
            i2 = -2;
            sVar.n = false;
            WindowManager.LayoutParams layoutParams4 = new WindowManager.LayoutParams(i2, -2, sVar.d, sVar.e, 1002, 8519680, -3);
            layoutParams4.gravity = sVar.c;
            layoutParams4.windowAnimations = sVar.f;
            windowManager.addView(sVar.g, layoutParams4);
            sVar.o = true;
            if (sVar.a == 0) {
                k1();
            }
        }
    }

    private boolean W0(s sVar, int i2, KeyEvent keyEvent, int i3) {
        androidx.appcompat.view.menu.e eVar;
        boolean zPerformShortcut = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((sVar.m || X0(sVar, keyEvent)) && (eVar = sVar.j) != null) {
            zPerformShortcut = eVar.performShortcut(i2, keyEvent, i3);
        }
        if (zPerformShortcut && (i3 & 1) == 0 && this.r == null) {
            k0(sVar, true);
        }
        return zPerformShortcut;
    }

    private boolean X0(s sVar, KeyEvent keyEvent) {
        as2 as2Var;
        as2 as2Var2;
        as2 as2Var3;
        if (this.R) {
            return false;
        }
        if (sVar.m) {
            return true;
        }
        s sVar2 = this.N;
        if (sVar2 != null && sVar2 != sVar) {
            k0(sVar2, false);
        }
        Window.Callback callbackD0 = D0();
        if (callbackD0 != null) {
            sVar.i = callbackD0.onCreatePanelView(sVar.a);
        }
        int i2 = sVar.a;
        boolean z = i2 == 0 || i2 == 108;
        if (z && (as2Var3 = this.r) != null) {
            as2Var3.f();
        }
        if (sVar.i == null && (!z || !(V0() instanceof androidx.appcompat.app.i))) {
            androidx.appcompat.view.menu.e eVar = sVar.j;
            if (eVar == null || sVar.r) {
                if (eVar == null && (!H0(sVar) || sVar.j == null)) {
                    return false;
                }
                if (z && this.r != null) {
                    if (this.s == null) {
                        this.s = new h();
                    }
                    this.r.e(sVar.j, this.s);
                }
                sVar.j.i0();
                if (!callbackD0.onCreatePanelMenu(sVar.a, sVar.j)) {
                    sVar.c(null);
                    if (z && (as2Var = this.r) != null) {
                        as2Var.e(null, this.s);
                    }
                    return false;
                }
                sVar.r = false;
            }
            sVar.j.i0();
            Bundle bundle = sVar.s;
            if (bundle != null) {
                sVar.j.S(bundle);
                sVar.s = null;
            }
            if (!callbackD0.onPreparePanel(0, sVar.i, sVar.j)) {
                if (z && (as2Var2 = this.r) != null) {
                    as2Var2.e(null, this.s);
                }
                sVar.j.h0();
                return false;
            }
            boolean z2 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            sVar.p = z2;
            sVar.j.setQwertyMode(z2);
            sVar.j.h0();
        }
        sVar.m = true;
        sVar.n = false;
        this.N = sVar;
        return true;
    }

    private void Y0(boolean z) {
        as2 as2Var = this.r;
        if (as2Var == null || !as2Var.a() || (ViewConfiguration.get(this.k).hasPermanentMenuKey() && !this.r.g())) {
            s sVarB0 = B0(0, true);
            sVarB0.q = true;
            k0(sVarB0, false);
            U0(sVarB0, null);
            return;
        }
        Window.Callback callbackD0 = D0();
        if (this.r.c() && z) {
            this.r.d();
            if (this.R) {
                return;
            }
            callbackD0.onPanelClosed(108, B0(0, true).j);
            return;
        }
        if (callbackD0 == null || this.R) {
            return;
        }
        if (this.Z && (this.a0 & 1) != 0) {
            this.l.getDecorView().removeCallbacks(this.b0);
            this.b0.run();
        }
        s sVarB1 = B0(0, true);
        androidx.appcompat.view.menu.e eVar = sVarB1.j;
        if (eVar == null || sVarB1.r || !callbackD0.onPreparePanel(0, sVarB1.i, eVar)) {
            return;
        }
        callbackD0.onMenuOpened(108, sVarB1.j);
        this.r.b();
    }

    private int Z0(int i2) {
        if (i2 == 8) {
            return 108;
        }
        if (i2 == 9) {
            return 109;
        }
        return i2;
    }

    private boolean a0(boolean z) {
        return b0(z, true);
    }

    private boolean b0(boolean z, boolean z2) {
        if (this.R) {
            return false;
        }
        int iF0 = f0();
        int iK0 = K0(this.k, iF0);
        h77 h77VarE0 = Build.VERSION.SDK_INT < 33 ? e0(this.k) : null;
        if (!z2 && h77VarE0 != null) {
            h77VarE0 = A0(this.k.getResources().getConfiguration());
        }
        boolean zJ1 = j1(iK0, h77VarE0, z);
        if (iF0 == 0) {
            z0(this.k).e();
        } else {
            p pVar = this.X;
            if (pVar != null) {
                pVar.a();
            }
        }
        if (iF0 == 3) {
            y0(this.k).e();
            return zJ1;
        }
        p pVar2 = this.Y;
        if (pVar2 != null) {
            pVar2.a();
        }
        return zJ1;
    }

    private void c0() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.B.findViewById(R.id.content);
        View decorView = this.l.getDecorView();
        contentFrameLayout.a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes = this.k.obtainStyledAttributes(d1a.y0);
        typedArrayObtainStyledAttributes.getValue(d1a.K0, contentFrameLayout.getMinWidthMajor());
        typedArrayObtainStyledAttributes.getValue(d1a.L0, contentFrameLayout.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes.hasValue(d1a.I0)) {
            typedArrayObtainStyledAttributes.getValue(d1a.I0, contentFrameLayout.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(d1a.J0)) {
            typedArrayObtainStyledAttributes.getValue(d1a.J0, contentFrameLayout.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(d1a.G0)) {
            typedArrayObtainStyledAttributes.getValue(d1a.G0, contentFrameLayout.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(d1a.H0)) {
            typedArrayObtainStyledAttributes.getValue(d1a.H0, contentFrameLayout.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private void d0(Window window) {
        if (this.l != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof n) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        n nVar = new n(callback);
        this.m = nVar;
        window.setCallback(nVar);
        k0 k0VarU = k0.u(this.k, null, l0);
        Drawable drawableH = k0VarU.h(0);
        if (drawableH != null) {
            window.setBackgroundDrawable(drawableH);
        }
        k0VarU.x();
        this.l = window;
        if (Build.VERSION.SDK_INT < 33 || this.h0 != null) {
            return;
        }
        T(null);
    }

    private boolean d1(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.l.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || ((View) viewParent).isAttachedToWindow()) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private int f0() {
        int i2 = this.T;
        return i2 != -100 ? i2 : androidx.appcompat.app.c.s();
    }

    private void g1() {
        if (this.A) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private AppCompatActivity h1() {
        for (Context baseContext = this.k; baseContext != null; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof AppCompatActivity) {
                return (AppCompatActivity) baseContext;
            }
            if (!(baseContext instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    private void i0() {
        p pVar = this.X;
        if (pVar != null) {
            pVar.a();
        }
        p pVar2 = this.Y;
        if (pVar2 != null) {
            pVar2.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void i1(Configuration configuration) {
        Activity activity = (Activity) this.j;
        if (activity instanceof n17) {
            if (((n17) activity).getLifecycle().getState().c(Lifecycle.State.CREATED)) {
                activity.onConfigurationChanged(configuration);
            }
        } else {
            if (!this.Q || this.R) {
                return;
            }
            activity.onConfigurationChanged(configuration);
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008c  */
    private boolean j1(int i2, h77 h77Var, boolean z) {
        boolean z2;
        Configuration configurationL0 = l0(this.k, i2, h77Var, null, false);
        int iX0 = x0(this.k);
        Configuration configuration = this.S;
        if (configuration == null) {
            configuration = this.k.getResources().getConfiguration();
        }
        int i3 = configuration.uiMode & 48;
        int i4 = configurationL0.uiMode & 48;
        h77 h77VarA0 = A0(configuration);
        h77 h77VarA1 = h77Var == null ? null : A0(configurationL0);
        int i5 = i3 != i4 ? 512 : 0;
        if (h77VarA1 != null && !h77VarA0.equals(h77VarA1)) {
            i5 |= 8196;
        }
        boolean z3 = true;
        if (((~iX0) & i5) != 0 && z && this.P && (m0 || this.Q)) {
            Object obj = this.j;
            if (!(obj instanceof Activity) || ((Activity) obj).isChild()) {
                z2 = false;
            } else {
                if (Build.VERSION.SDK_INT >= 31 && (i5 & 8192) != 0) {
                    ((Activity) this.j).getWindow().getDecorView().setLayoutDirection(configurationL0.getLayoutDirection());
                }
                a8.t((Activity) this.j);
                z2 = true;
            }
        } else {
            z2 = false;
        }
        if (z2 || i5 == 0) {
            z3 = z2;
        } else {
            l1(i4, h77VarA1, (i5 & iX0) == i5, null);
        }
        if (z3) {
            Object obj2 = this.j;
            if (obj2 instanceof AppCompatActivity) {
                if ((i5 & 512) != 0) {
                    ((AppCompatActivity) obj2).onNightModeChanged(i2);
                }
                if ((i5 & 4) != 0) {
                    ((AppCompatActivity) this.j).onLocalesChanged(h77Var);
                }
            }
        }
        if (h77VarA1 != null) {
            b1(A0(this.k.getResources().getConfiguration()));
        }
        return z3;
    }

    private Configuration l0(Context context, int i2, h77 h77Var, Configuration configuration, boolean z) {
        int i3;
        if (i2 == 1) {
            i3 = 16;
        } else if (i2 != 2) {
            i3 = z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i3 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
        if (h77Var != null) {
            a1(configuration2, h77Var);
        }
        return configuration2;
    }

    private void l1(int i2, h77 h77Var, boolean z, Configuration configuration) {
        Resources resources = this.k.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i2 | (resources.getConfiguration().uiMode & (-49));
        if (h77Var != null) {
            a1(configuration2, h77Var);
        }
        resources.updateConfiguration(configuration2, null);
        int i3 = this.U;
        if (i3 != 0) {
            this.k.setTheme(i3);
            this.k.getTheme().applyStyle(this.U, true);
        }
        if (z && (this.j instanceof Activity)) {
            i1(configuration2);
        }
    }

    private ViewGroup m0() {
        ViewGroup viewGroup;
        TypedArray typedArrayObtainStyledAttributes = this.k.obtainStyledAttributes(d1a.y0);
        if (!typedArrayObtainStyledAttributes.hasValue(d1a.D0)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(d1a.M0, false)) {
            N(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(d1a.D0, false)) {
            N(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(d1a.E0, false)) {
            N(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(d1a.F0, false)) {
            N(10);
        }
        this.J = typedArrayObtainStyledAttributes.getBoolean(d1a.z0, false);
        typedArrayObtainStyledAttributes.recycle();
        t0();
        this.l.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.k);
        if (this.K) {
            viewGroup = this.I ? (ViewGroup) layoutInflaterFrom.inflate(rz9.o, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(rz9.n, (ViewGroup) null);
        } else if (this.J) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(rz9.f, (ViewGroup) null);
            this.H = false;
            this.G = false;
        } else if (this.G) {
            TypedValue typedValue = new TypedValue();
            this.k.getTheme().resolveAttribute(ax9.f, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new j22(this.k, typedValue.resourceId) : this.k).inflate(rz9.p, (ViewGroup) null);
            as2 as2Var = (as2) viewGroup.findViewById(oy9.p);
            this.r = as2Var;
            as2Var.setWindowCallback(D0());
            if (this.H) {
                this.r.h(109);
            }
            if (this.E) {
                this.r.h(2);
            }
            if (this.F) {
                this.r.h(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.G + ", windowActionBarOverlay: " + this.H + ", android:windowIsFloating: " + this.J + ", windowActionModeOverlay: " + this.I + ", windowNoTitle: " + this.K + " }");
        }
        k7e.z0(viewGroup, new b());
        if (this.r == null) {
            this.C = (TextView) viewGroup.findViewById(oy9.L);
        }
        n0.c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(oy9.b);
        ViewGroup viewGroup2 = (ViewGroup) this.l.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new c());
        return viewGroup;
    }

    private void n1(View view) {
        view.setBackgroundColor((k7e.K(view) & 8192) != 0 ? s02.d(this.k, kx9.b) : s02.d(this.k, kx9.a));
    }

    private void s0() {
        if (this.A) {
            return;
        }
        this.B = m0();
        CharSequence charSequenceC0 = C0();
        if (!TextUtils.isEmpty(charSequenceC0)) {
            as2 as2Var = this.r;
            if (as2Var != null) {
                as2Var.setWindowTitle(charSequenceC0);
            } else if (V0() != null) {
                V0().v(charSequenceC0);
            } else {
                TextView textView = this.C;
                if (textView != null) {
                    textView.setText(charSequenceC0);
                }
            }
        }
        c0();
        T0(this.B);
        this.A = true;
        s sVarB0 = B0(0, false);
        if (this.R) {
            return;
        }
        if (sVarB0 == null || sVarB0.j == null) {
            I0(108);
        }
    }

    private void t0() {
        if (this.l == null) {
            Object obj = this.j;
            if (obj instanceof Activity) {
                d0(((Activity) obj).getWindow());
            }
        }
        if (this.l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private static Configuration v0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f2 = configuration.fontScale;
            float f3 = configuration2.fontScale;
            if (f2 != f3) {
                configuration3.fontScale = f3;
            }
            int i2 = configuration.mcc;
            int i3 = configuration2.mcc;
            if (i2 != i3) {
                configuration3.mcc = i3;
            }
            int i4 = configuration.mnc;
            int i5 = configuration2.mnc;
            if (i4 != i5) {
                configuration3.mnc = i5;
            }
            k.a(configuration, configuration2, configuration3);
            int i6 = configuration.touchscreen;
            int i7 = configuration2.touchscreen;
            if (i6 != i7) {
                configuration3.touchscreen = i7;
            }
            int i8 = configuration.keyboard;
            int i9 = configuration2.keyboard;
            if (i8 != i9) {
                configuration3.keyboard = i9;
            }
            int i10 = configuration.keyboardHidden;
            int i11 = configuration2.keyboardHidden;
            if (i10 != i11) {
                configuration3.keyboardHidden = i11;
            }
            int i12 = configuration.navigation;
            int i13 = configuration2.navigation;
            if (i12 != i13) {
                configuration3.navigation = i13;
            }
            int i14 = configuration.navigationHidden;
            int i15 = configuration2.navigationHidden;
            if (i14 != i15) {
                configuration3.navigationHidden = i15;
            }
            int i16 = configuration.orientation;
            int i17 = configuration2.orientation;
            if (i16 != i17) {
                configuration3.orientation = i17;
            }
            int i18 = configuration.screenLayout & 15;
            int i19 = configuration2.screenLayout;
            if (i18 != (i19 & 15)) {
                configuration3.screenLayout |= i19 & 15;
            }
            int i20 = configuration.screenLayout & 192;
            int i21 = configuration2.screenLayout;
            if (i20 != (i21 & 192)) {
                configuration3.screenLayout |= i21 & 192;
            }
            int i22 = configuration.screenLayout & 48;
            int i23 = configuration2.screenLayout;
            if (i22 != (i23 & 48)) {
                configuration3.screenLayout |= i23 & 48;
            }
            int i24 = configuration.screenLayout & 768;
            int i25 = configuration2.screenLayout;
            if (i24 != (i25 & 768)) {
                configuration3.screenLayout |= i25 & 768;
            }
            l.a(configuration, configuration2, configuration3);
            int i26 = configuration.uiMode & 15;
            int i27 = configuration2.uiMode;
            if (i26 != (i27 & 15)) {
                configuration3.uiMode |= i27 & 15;
            }
            int i28 = configuration.uiMode & 48;
            int i29 = configuration2.uiMode;
            if (i28 != (i29 & 48)) {
                configuration3.uiMode |= i29 & 48;
            }
            int i30 = configuration.screenWidthDp;
            int i31 = configuration2.screenWidthDp;
            if (i30 != i31) {
                configuration3.screenWidthDp = i31;
            }
            int i32 = configuration.screenHeightDp;
            int i33 = configuration2.screenHeightDp;
            if (i32 != i33) {
                configuration3.screenHeightDp = i33;
            }
            int i34 = configuration.smallestScreenWidthDp;
            int i35 = configuration2.smallestScreenWidthDp;
            if (i34 != i35) {
                configuration3.smallestScreenWidthDp = i35;
            }
            int i36 = configuration.densityDpi;
            int i37 = configuration2.densityDpi;
            if (i36 != i37) {
                configuration3.densityDpi = i37;
            }
        }
        return configuration3;
    }

    private int x0(Context context) {
        if (!this.W && (this.j instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.j.getClass()), Build.VERSION.SDK_INT >= 29 ? 269221888 : 786432);
                if (activityInfo != null) {
                    this.V = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                this.V = 0;
            }
        }
        this.W = true;
        return this.V;
    }

    private p y0(Context context) {
        if (this.Y == null) {
            this.Y = new o(context);
        }
        return this.Y;
    }

    private p z0(Context context) {
        if (this.X == null) {
            this.X = new q(androidx.appcompat.app.k.a(context));
        }
        return this.X;
    }

    @Override // androidx.appcompat.app.c
    public void A() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.k);
        if (layoutInflaterFrom.getFactory() == null) {
            sn6.a(layoutInflaterFrom, this);
        } else {
            layoutInflaterFrom.getFactory2();
        }
    }

    h77 A0(Configuration configuration) {
        return k.b(configuration);
    }

    @Override // androidx.appcompat.app.c
    public void B() {
        if (V0() == null || z().k()) {
            return;
        }
        I0(0);
    }

    protected s B0(int i2, boolean z) {
        s[] sVarArr = this.M;
        if (sVarArr == null || sVarArr.length <= i2) {
            s[] sVarArr2 = new s[i2 + 1];
            if (sVarArr != null) {
                System.arraycopy(sVarArr, 0, sVarArr2, 0, sVarArr.length);
            }
            this.M = sVarArr2;
            sVarArr = sVarArr2;
        }
        s sVar = sVarArr[i2];
        if (sVar != null) {
            return sVar;
        }
        s sVar2 = new s(i2);
        sVarArr[i2] = sVar2;
        return sVar2;
    }

    final CharSequence C0() {
        Object obj = this.j;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.q;
    }

    @Override // androidx.appcompat.app.c
    public void D(Configuration configuration) {
        androidx.appcompat.app.a aVarZ;
        if (this.G && this.A && (aVarZ = z()) != null) {
            aVarZ.l(configuration);
        }
        androidx.appcompat.widget.j.b().g(this.k);
        this.S = new Configuration(this.k.getResources().getConfiguration());
        b0(false, false);
    }

    final Window.Callback D0() {
        return this.l.getCallback();
    }

    @Override // androidx.appcompat.app.c
    public void E(Bundle bundle) {
        String strC;
        this.P = true;
        a0(false);
        t0();
        Object obj = this.j;
        if (obj instanceof Activity) {
            try {
                strC = dd8.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
                strC = null;
            }
            if (strC != null) {
                androidx.appcompat.app.a aVarV0 = V0();
                if (aVarV0 == null) {
                    this.c0 = true;
                } else {
                    aVarV0.q(true);
                }
            }
            androidx.appcompat.app.c.e(this);
        }
        this.S = new Configuration(this.k.getResources().getConfiguration());
        this.Q = true;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0045  */
    @Override // androidx.appcompat.app.c
    public void F() {
        if (this.j instanceof Activity) {
            androidx.appcompat.app.c.L(this);
        }
        if (this.Z) {
            this.l.getDecorView().removeCallbacks(this.b0);
        }
        this.R = true;
        if (this.T != -100) {
            Object obj = this.j;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                j0.put(this.j.getClass().getName(), Integer.valueOf(this.T));
            } else {
                j0.remove(this.j.getClass().getName());
            }
        } else {
            j0.remove(this.j.getClass().getName());
        }
        androidx.appcompat.app.a aVar = this.o;
        if (aVar != null) {
            aVar.m();
        }
        i0();
    }

    @Override // androidx.appcompat.app.c
    public void G(Bundle bundle) {
        s0();
    }

    @Override // androidx.appcompat.app.c
    public void H() {
        androidx.appcompat.app.a aVarZ = z();
        if (aVarZ != null) {
            aVarZ.t(true);
        }
    }

    @Override // androidx.appcompat.app.c
    public void I(Bundle bundle) {
    }

    @Override // androidx.appcompat.app.c
    public void J() {
        b0(true, false);
    }

    public boolean J0() {
        return this.z;
    }

    @Override // androidx.appcompat.app.c
    public void K() {
        androidx.appcompat.app.a aVarZ = z();
        if (aVarZ != null) {
            aVarZ.t(false);
        }
    }

    int K0(Context context, int i2) {
        if (i2 == -100) {
            return -1;
        }
        if (i2 != -1) {
            if (i2 == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return z0(context).c();
            }
            if (i2 != 1 && i2 != 2) {
                if (i2 == 3) {
                    return y0(context).c();
                }
                throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
            }
        }
        return i2;
    }

    boolean L0() {
        boolean z = this.O;
        this.O = false;
        s sVarB0 = B0(0, false);
        if (sVarB0 != null && sVarB0.o) {
            if (!z) {
                k0(sVarB0, true);
            }
            return true;
        }
        t7 t7Var = this.u;
        if (t7Var != null) {
            t7Var.c();
            return true;
        }
        androidx.appcompat.app.a aVarZ = z();
        return aVarZ != null && aVarZ.g();
    }

    boolean M0(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            this.O = (keyEvent.getFlags() & 128) != 0;
        } else if (i2 == 82) {
            N0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.c
    public boolean N(int i2) {
        int iZ0 = Z0(i2);
        if (this.K && iZ0 == 108) {
            return false;
        }
        if (this.G && iZ0 == 1) {
            this.G = false;
        }
        if (iZ0 == 1) {
            g1();
            this.K = true;
            return true;
        }
        if (iZ0 == 2) {
            g1();
            this.E = true;
            return true;
        }
        if (iZ0 == 5) {
            g1();
            this.F = true;
            return true;
        }
        if (iZ0 == 10) {
            g1();
            this.I = true;
            return true;
        }
        if (iZ0 == 108) {
            g1();
            this.G = true;
            return true;
        }
        if (iZ0 != 109) {
            return this.l.requestFeature(iZ0);
        }
        g1();
        this.H = true;
        return true;
    }

    boolean O0(int i2, KeyEvent keyEvent) {
        androidx.appcompat.app.a aVarZ = z();
        if (aVarZ != null && aVarZ.n(i2, keyEvent)) {
            return true;
        }
        s sVar = this.N;
        if (sVar != null && W0(sVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            s sVar2 = this.N;
            if (sVar2 != null) {
                sVar2.n = true;
            }
            return true;
        }
        if (this.N == null) {
            s sVarB0 = B0(0, true);
            X0(sVarB0, keyEvent);
            boolean zW0 = W0(sVarB0, keyEvent.getKeyCode(), keyEvent, 1);
            sVarB0.m = false;
            if (zW0) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.app.c
    public void P(int i2) {
        s0();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.k).inflate(i2, viewGroup);
        this.m.c(this.l.getCallback());
    }

    boolean P0(int i2, KeyEvent keyEvent) {
        if (i2 != 4) {
            if (i2 == 82) {
                Q0(0, keyEvent);
                return true;
            }
        } else if (L0()) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.c
    public void Q(View view) {
        s0();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.m.c(this.l.getCallback());
    }

    @Override // androidx.appcompat.app.c
    public void R(View view, ViewGroup.LayoutParams layoutParams) {
        s0();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.m.c(this.l.getCallback());
    }

    void R0(int i2) {
        androidx.appcompat.app.a aVarZ;
        if (i2 != 108 || (aVarZ = z()) == null) {
            return;
        }
        aVarZ.h(true);
    }

    void S0(int i2) {
        if (i2 == 108) {
            androidx.appcompat.app.a aVarZ = z();
            if (aVarZ != null) {
                aVarZ.h(false);
                return;
            }
            return;
        }
        if (i2 == 0) {
            s sVarB0 = B0(i2, true);
            if (sVarB0.o) {
                k0(sVarB0, false);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    @Override // androidx.appcompat.app.c
    public void T(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        OnBackInvokedCallback onBackInvokedCallback;
        super.T(onBackInvokedDispatcher);
        OnBackInvokedDispatcher onBackInvokedDispatcher2 = this.h0;
        if (onBackInvokedDispatcher2 != null && (onBackInvokedCallback = this.i0) != null) {
            m.c(onBackInvokedDispatcher2, onBackInvokedCallback);
            this.i0 = null;
        }
        if (onBackInvokedDispatcher == null) {
            Object obj = this.j;
            if (!(obj instanceof Activity) || ((Activity) obj).getWindow() == null) {
                this.h0 = onBackInvokedDispatcher;
            } else {
                this.h0 = m.a((Activity) this.j);
            }
        } else {
            this.h0 = onBackInvokedDispatcher;
        }
        k1();
    }

    void T0(ViewGroup viewGroup) {
    }

    @Override // androidx.appcompat.app.c
    public void U(Toolbar toolbar) {
        if (this.j instanceof Activity) {
            androidx.appcompat.app.a aVarZ = z();
            if (aVarZ instanceof androidx.appcompat.app.l) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.p = null;
            if (aVarZ != null) {
                aVarZ.m();
            }
            this.o = null;
            if (toolbar != null) {
                androidx.appcompat.app.i iVar = new androidx.appcompat.app.i(toolbar, C0(), this.m);
                this.o = iVar;
                this.m.e(iVar.c);
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.m.e(null);
            }
            B();
        }
    }

    @Override // androidx.appcompat.app.c
    public void V(int i2) {
        this.U = i2;
    }

    final androidx.appcompat.app.a V0() {
        return this.o;
    }

    @Override // androidx.appcompat.app.c
    public final void W(CharSequence charSequence) {
        this.q = charSequence;
        as2 as2Var = this.r;
        if (as2Var != null) {
            as2Var.setWindowTitle(charSequence);
            return;
        }
        if (V0() != null) {
            V0().v(charSequence);
            return;
        }
        TextView textView = this.C;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // androidx.appcompat.app.c
    public t7 X(t7.a aVar) {
        iv ivVar;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        t7 t7Var = this.u;
        if (t7Var != null) {
            t7Var.c();
        }
        i iVar = new i(aVar);
        androidx.appcompat.app.a aVarZ = z();
        if (aVarZ != null) {
            t7 t7VarW = aVarZ.w(iVar);
            this.u = t7VarW;
            if (t7VarW != null && (ivVar = this.n) != null) {
                ivVar.onSupportActionModeStarted(t7VarW);
            }
        }
        if (this.u == null) {
            this.u = f1(iVar);
        }
        k1();
        return this.u;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        s sVarU0;
        Window.Callback callbackD0 = D0();
        if (callbackD0 == null || this.R || (sVarU0 = u0(eVar.F())) == null) {
            return false;
        }
        return callbackD0.onMenuItemSelected(sVarU0.a, menuItem);
    }

    void a1(Configuration configuration, h77 h77Var) {
        k.d(configuration, h77Var);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
        Y0(true);
    }

    void b1(h77 h77Var) {
        k.c(h77Var);
    }

    final boolean c1() {
        ViewGroup viewGroup;
        return this.A && (viewGroup = this.B) != null && viewGroup.isLaidOut();
    }

    h77 e0(Context context) {
        h77 h77VarX;
        if (Build.VERSION.SDK_INT >= 33 || (h77VarX = androidx.appcompat.app.c.x()) == null) {
            return null;
        }
        h77 h77VarA0 = A0(context.getApplicationContext().getResources().getConfiguration());
        h77 h77VarB = androidx.appcompat.app.h.b(h77VarX, h77VarA0);
        return h77VarB.f() ? h77VarA0 : h77VarB;
    }

    boolean e1() {
        if (this.h0 == null) {
            return false;
        }
        s sVarB0 = B0(0, false);
        return (sVarB0 != null && sVarB0.o) || this.u != null;
    }

    @Override // androidx.appcompat.app.c
    public void f(View view, ViewGroup.LayoutParams layoutParams) {
        s0();
        ((ViewGroup) this.B.findViewById(R.id.content)).addView(view, layoutParams);
        this.m.c(this.l.getCallback());
    }

    t7 f1(t7.a aVar) {
        t7 t7VarOnWindowStartingSupportActionMode;
        Context j22Var;
        iv ivVar;
        r0();
        t7 t7Var = this.u;
        if (t7Var != null) {
            t7Var.c();
        }
        if (!(aVar instanceof i)) {
            aVar = new i(aVar);
        }
        iv ivVar2 = this.n;
        if (ivVar2 == null || this.R) {
            t7VarOnWindowStartingSupportActionMode = null;
        } else {
            try {
                t7VarOnWindowStartingSupportActionMode = ivVar2.onWindowStartingSupportActionMode(aVar);
            } catch (AbstractMethodError unused) {
                t7VarOnWindowStartingSupportActionMode = null;
            }
        }
        if (t7VarOnWindowStartingSupportActionMode != null) {
            this.u = t7VarOnWindowStartingSupportActionMode;
        } else {
            if (this.v == null) {
                if (this.J) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = this.k.getTheme();
                    theme.resolveAttribute(ax9.f, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = this.k.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        j22Var = new j22(this.k, 0);
                        j22Var.getTheme().setTo(themeNewTheme);
                    } else {
                        j22Var = this.k;
                    }
                    this.v = new ActionBarContextView(j22Var);
                    PopupWindow popupWindow = new PopupWindow(j22Var, (AttributeSet) null, ax9.i);
                    this.w = popupWindow;
                    tg9.b(popupWindow, 2);
                    this.w.setContentView(this.v);
                    this.w.setWidth(-1);
                    j22Var.getTheme().resolveAttribute(ax9.b, typedValue, true);
                    this.v.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, j22Var.getResources().getDisplayMetrics()));
                    this.w.setHeight(-2);
                    this.x = new d();
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.B.findViewById(oy9.h);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(w0()));
                        this.v = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (this.v != null) {
                r0();
                this.v.k();
                x4c x4cVar = new x4c(this.v.getContext(), this.v, aVar, this.w == null);
                if (aVar.b(x4cVar, x4cVar.e())) {
                    x4cVar.k();
                    this.v.h(x4cVar);
                    this.u = x4cVar;
                    if (c1()) {
                        this.v.setAlpha(0.0f);
                        eae eaeVarB = k7e.f(this.v).b(1.0f);
                        this.y = eaeVarB;
                        eaeVarB.g(new C0008e());
                    } else {
                        this.v.setAlpha(1.0f);
                        this.v.setVisibility(0);
                        if (this.v.getParent() instanceof View) {
                            k7e.i0((View) this.v.getParent());
                        }
                    }
                    if (this.w != null) {
                        this.l.getDecorView().post(this.x);
                    }
                } else {
                    this.u = null;
                }
            }
        }
        t7 t7Var2 = this.u;
        if (t7Var2 != null && (ivVar = this.n) != null) {
            ivVar.onSupportActionModeStarted(t7Var2);
        }
        k1();
        return this.u;
    }

    @Override // androidx.appcompat.app.c
    boolean g() {
        if (androidx.appcompat.app.c.C(this.k) && androidx.appcompat.app.c.x() != null && !androidx.appcompat.app.c.x().equals(androidx.appcompat.app.c.y())) {
            k(this.k);
        }
        return a0(true);
    }

    void g0(int i2, s sVar, Menu menu) {
        if (menu == null) {
            if (sVar == null && i2 >= 0) {
                s[] sVarArr = this.M;
                if (i2 < sVarArr.length) {
                    sVar = sVarArr[i2];
                }
            }
            if (sVar != null) {
                menu = sVar.j;
            }
        }
        if ((sVar == null || sVar.o) && !this.R) {
            this.m.d(this.l.getCallback(), i2, menu);
        }
    }

    @Override // androidx.appcompat.app.c
    public boolean h() {
        return a0(true);
    }

    void h0(androidx.appcompat.view.menu.e eVar) {
        if (this.L) {
            return;
        }
        this.L = true;
        this.r.i();
        Window.Callback callbackD0 = D0();
        if (callbackD0 != null && !this.R) {
            callbackD0.onPanelClosed(108, eVar);
        }
        this.L = false;
    }

    void j0(int i2) {
        k0(B0(i2, true), true);
    }

    void k0(s sVar, boolean z) {
        ViewGroup viewGroup;
        as2 as2Var;
        if (z && sVar.a == 0 && (as2Var = this.r) != null && as2Var.c()) {
            h0(sVar.j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.k.getSystemService("window");
        if (windowManager != null && sVar.o && (viewGroup = sVar.g) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                g0(sVar.a, sVar, null);
            }
        }
        sVar.m = false;
        sVar.n = false;
        sVar.o = false;
        sVar.h = null;
        sVar.q = true;
        if (this.N == sVar) {
            this.N = null;
        }
        if (sVar.a == 0) {
            k1();
        }
    }

    void k1() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean zE1 = e1();
            if (zE1 && this.i0 == null) {
                this.i0 = m.b(this.h0, this);
            } else {
                if (zE1 || (onBackInvokedCallback = this.i0) == null) {
                    return;
                }
                m.c(this.h0, onBackInvokedCallback);
                this.i0 = null;
            }
        }
    }

    @Override // androidx.appcompat.app.c
    public Context m(Context context) {
        Context context2;
        this.P = true;
        int iK0 = K0(context, f0());
        if (androidx.appcompat.app.c.C(context)) {
            androidx.appcompat.app.c.Z(context);
        }
        h77 h77VarE0 = e0(context);
        if (context instanceof ContextThemeWrapper) {
            context2 = context;
            try {
                ((ContextThemeWrapper) context2).applyOverrideConfiguration(l0(context2, iK0, h77VarE0, null, false));
                return context2;
            } catch (IllegalStateException unused) {
            }
        } else {
            context2 = context;
        }
        if (context2 instanceof j22) {
            try {
                ((j22) context2).a(l0(context2, iK0, h77VarE0, null, false));
                return context2;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!m0) {
            return super.m(context2);
        }
        Configuration configuration = new Configuration();
        configuration.uiMode = -1;
        configuration.fontScale = 0.0f;
        Configuration configuration2 = context2.createConfigurationContext(configuration).getResources().getConfiguration();
        Configuration configuration3 = context2.getResources().getConfiguration();
        configuration2.uiMode = configuration3.uiMode;
        Configuration configurationL0 = l0(context2, iK0, h77VarE0, !configuration2.equals(configuration3) ? v0(configuration2, configuration3) : null, true);
        j22 j22Var = new j22(context2, m0a.f);
        j22Var.a(configurationL0);
        try {
            if (context2.getTheme() != null) {
                mla.d.a(j22Var.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return super.m(j22Var);
    }

    final int m1(kie kieVar, Rect rect) {
        int iN;
        boolean z;
        boolean z2;
        if (kieVar != null) {
            iN = kieVar.n();
        } else {
            iN = rect != null ? rect.top : 0;
        }
        ActionBarContextView actionBarContextView = this.v;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.v.getLayoutParams();
            boolean z3 = true;
            if (this.v.isShown()) {
                if (this.d0 == null) {
                    this.d0 = new Rect();
                    this.e0 = new Rect();
                }
                Rect rect2 = this.d0;
                Rect rect3 = this.e0;
                if (kieVar == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(kieVar.l(), kieVar.n(), kieVar.m(), kieVar.k());
                }
                n0.a(this.B, rect2, rect3);
                int i2 = rect2.top;
                int i3 = rect2.left;
                int i4 = rect2.right;
                kie kieVarF = k7e.F(this.B);
                int iL = kieVarF == null ? 0 : kieVarF.l();
                int iM = kieVarF == null ? 0 : kieVarF.m();
                if (marginLayoutParams.topMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i2;
                    marginLayoutParams.leftMargin = i3;
                    marginLayoutParams.rightMargin = i4;
                    z2 = true;
                }
                if (i2 <= 0 || this.D != null) {
                    View view = this.D;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i5 = marginLayoutParams2.height;
                        int i6 = marginLayoutParams.topMargin;
                        if (i5 != i6 || marginLayoutParams2.leftMargin != iL || marginLayoutParams2.rightMargin != iM) {
                            marginLayoutParams2.height = i6;
                            marginLayoutParams2.leftMargin = iL;
                            marginLayoutParams2.rightMargin = iM;
                            this.D.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.k);
                    this.D = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iL;
                    layoutParams.rightMargin = iM;
                    this.B.addView(this.D, -1, layoutParams);
                }
                View view3 = this.D;
                z3 = view3 != null;
                if (z3 && view3.getVisibility() != 0) {
                    n1(this.D);
                }
                if (!this.I && z3) {
                    iN = 0;
                }
                z = z3;
                z3 = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                z3 = false;
            }
            if (z3) {
                this.v.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.D;
        if (view4 != null) {
            view4.setVisibility(z ? 0 : 8);
        }
        return iN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View n0(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        if (this.f0 == null) {
            TypedArray typedArrayObtainStyledAttributes = this.k.obtainStyledAttributes(d1a.y0);
            String string = typedArrayObtainStyledAttributes.getString(d1a.C0);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.f0 = new xv();
            } else {
                try {
                    this.f0 = (xv) this.k.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable unused) {
                    this.f0 = new xv();
                }
            }
        }
        boolean z2 = k0;
        boolean zD1 = false;
        if (z2) {
            if (this.g0 == null) {
                this.g0 = new androidx.appcompat.app.g();
            }
            if (this.g0.a(attributeSet)) {
                z = true;
            } else {
                if (!(attributeSet instanceof XmlPullParser)) {
                    zD1 = d1((ViewParent) view);
                } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                    zD1 = true;
                }
                z = zD1;
            }
        } else {
            z = zD1;
        }
        return this.f0.r(view, str, context, attributeSet, z, z2, true, m0.c());
    }

    void o0() {
        androidx.appcompat.view.menu.e eVar;
        as2 as2Var = this.r;
        if (as2Var != null) {
            as2Var.i();
        }
        if (this.w != null) {
            this.l.getDecorView().removeCallbacks(this.x);
            if (this.w.isShowing()) {
                try {
                    this.w.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.w = null;
        }
        r0();
        s sVarB0 = B0(0, false);
        if (sVarB0 == null || (eVar = sVarB0.j) == null) {
            return;
        }
        eVar.close();
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return n0(view, str, context, attributeSet);
    }

    @Override // androidx.appcompat.app.c
    public <T extends View> T p(int i2) {
        s0();
        return (T) this.l.findViewById(i2);
    }

    boolean p0(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.j;
        if (((obj instanceof pi6.a) || (obj instanceof rv)) && (decorView = this.l.getDecorView()) != null && pi6.a(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.m.b(this.l.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? M0(keyCode, keyEvent) : P0(keyCode, keyEvent);
    }

    void q0(int i2) {
        s sVarB0;
        s sVarB1 = B0(i2, true);
        if (sVarB1.j != null) {
            Bundle bundle = new Bundle();
            sVarB1.j.U(bundle);
            if (bundle.size() > 0) {
                sVarB1.s = bundle;
            }
            sVarB1.j.i0();
            sVarB1.j.clear();
        }
        sVarB1.r = true;
        sVarB1.q = true;
        if ((i2 != 108 && i2 != 0) || this.r == null || (sVarB0 = B0(0, false)) == null) {
            return;
        }
        sVarB0.m = false;
        X0(sVarB0, null);
    }

    @Override // androidx.appcompat.app.c
    public Context r() {
        return this.k;
    }

    void r0() {
        eae eaeVar = this.y;
        if (eaeVar != null) {
            eaeVar.c();
        }
    }

    @Override // androidx.appcompat.app.c
    public final o7 t() {
        return new f();
    }

    @Override // androidx.appcompat.app.c
    public int u() {
        return this.T;
    }

    s u0(Menu menu) {
        s[] sVarArr = this.M;
        int length = sVarArr != null ? sVarArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            s sVar = sVarArr[i2];
            if (sVar != null && sVar.j == menu) {
                return sVar;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.app.c
    public MenuInflater w() {
        if (this.p == null) {
            E0();
            androidx.appcompat.app.a aVar = this.o;
            this.p = new kec(aVar != null ? aVar.j() : this.k);
        }
        return this.p;
    }

    final Context w0() {
        androidx.appcompat.app.a aVarZ = z();
        Context contextJ = aVarZ != null ? aVarZ.j() : null;
        return contextJ == null ? this.k : contextJ;
    }

    @Override // androidx.appcompat.app.c
    public androidx.appcompat.app.a z() {
        E0();
        return this.o;
    }

    e(Dialog dialog, iv ivVar) {
        this(dialog.getContext(), dialog.getWindow(), ivVar, dialog);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    private e(Context context, Window window, iv ivVar, Object obj) {
        qpb<String, Integer> qpbVar;
        Integer num;
        AppCompatActivity appCompatActivityH1;
        this.y = null;
        this.z = true;
        this.T = -100;
        this.b0 = new a();
        this.k = context;
        this.n = ivVar;
        this.j = obj;
        if (this.T == -100 && (obj instanceof Dialog) && (appCompatActivityH1 = h1()) != null) {
            this.T = appCompatActivityH1.getDelegate().u();
        }
        if (this.T == -100 && (num = (qpbVar = j0).get(obj.getClass().getName())) != null) {
            this.T = num.intValue();
            qpbVar.remove(obj.getClass().getName());
        }
        if (window != null) {
            d0(window);
        }
        androidx.appcompat.widget.j.h();
    }
}
