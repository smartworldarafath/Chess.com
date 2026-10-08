package com.google.inputmethod;

import android.R;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.window.SplashScreenView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0004\u000e\u0011\u0007\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/google/android/r1c;", "", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;)V", "", "b", "()V", "Lcom/google/android/r1c$d;", "condition", "c", "(Lcom/google/android/r1c$d;)V", "Lcom/google/android/r1c$b;", "a", "Lcom/google/android/r1c$b;", "impl", "d", "core-splashscreen_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class r1c {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final b impl;

    /* JADX INFO: renamed from: com.google.android.r1c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/google/android/r1c$a;", "", "<init>", "()V", "Landroid/app/Activity;", "Lcom/google/android/r1c;", "a", "(Landroid/app/Activity;)Lcom/google/android/r1c;", "", "MASK_FACTOR", "F", "core-splashscreen_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final r1c a(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "<this>");
            r1c r1cVar = new r1c(activity, null);
            r1cVar.b();
            return r1cVar;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0012\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000e\u001a\u00020\u00062\n\u0010\u000b\u001a\u00060\tR\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010%\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010)\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\"\"\u0004\b(\u0010$R$\u00100\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00107\u001a\u0002018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010;\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u00108\u001a\u0004\b&\u00109\"\u0004\b:\u0010\u0013¨\u0006<"}, d2 = {"Lcom/google/android/r1c$b;", "", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;)V", "", "e", "()V", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "currentTheme", "Landroid/util/TypedValue;", "typedValue", "g", "(Landroid/content/res/Resources$Theme;Landroid/util/TypedValue;)V", "Lcom/google/android/r1c$d;", "keepOnScreenCondition", "f", "(Lcom/google/android/r1c$d;)V", "a", "Landroid/app/Activity;", "c", "()Landroid/app/Activity;", "", "b", "I", "getFinalThemeId", "()I", "setFinalThemeId", "(I)V", "finalThemeId", "Ljava/lang/Integer;", "getBackgroundResId", "()Ljava/lang/Integer;", "setBackgroundResId", "(Ljava/lang/Integer;)V", "backgroundResId", "d", "getBackgroundColor", "setBackgroundColor", "backgroundColor", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/Drawable;", "getIcon", "()Landroid/graphics/drawable/Drawable;", "setIcon", "(Landroid/graphics/drawable/Drawable;)V", "icon", "", "Z", "getHasBackground", "()Z", "setHasBackground", "(Z)V", "hasBackground", "Lcom/google/android/r1c$d;", "()Lcom/google/android/r1c$d;", "h", "splashScreenWaitPredicate", "core-splashscreen_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Activity activity;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private int finalThemeId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private Integer backgroundResId;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private Integer backgroundColor;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private Drawable icon;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private boolean hasBackground;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private d splashScreenWaitPredicate;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/google/android/r1c$b$a", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "", "onPreDraw", "()Z", "core-splashscreen_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a implements ViewTreeObserver.OnPreDrawListener {
            final /* synthetic */ View b;

            a(View view) {
                this.b = view;
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (b.this.getSplashScreenWaitPredicate().a()) {
                    return false;
                }
                this.b.getViewTreeObserver().removeOnPreDrawListener(this);
                b.b(b.this);
                return true;
            }
        }

        public b(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.activity = activity;
            this.splashScreenWaitPredicate = new d() { // from class: com.google.android.s1c
                @Override // com.google.android.r1c.d
                public final boolean a() {
                    return r1c.b.i();
                }
            };
        }

        public static final /* synthetic */ y1c b(b bVar) {
            bVar.getClass();
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean i() {
            return false;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Activity getActivity() {
            return this.activity;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final d getSplashScreenWaitPredicate() {
            return this.splashScreenWaitPredicate;
        }

        public void e() {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = this.activity.getTheme();
            if (theme.resolveAttribute(uw9.d, typedValue, true)) {
                this.backgroundResId = Integer.valueOf(typedValue.resourceId);
                this.backgroundColor = Integer.valueOf(typedValue.data);
            }
            if (theme.resolveAttribute(uw9.c, typedValue, true)) {
                this.icon = uv.b(this.activity, typedValue.resourceId);
            }
            if (theme.resolveAttribute(uw9.b, typedValue, true)) {
                this.hasBackground = typedValue.resourceId == mx9.a;
            }
            Intrinsics.g(theme);
            g(theme, typedValue);
        }

        public void f(d keepOnScreenCondition) {
            Intrinsics.checkNotNullParameter(keepOnScreenCondition, "keepOnScreenCondition");
            this.splashScreenWaitPredicate = keepOnScreenCondition;
            View viewFindViewById = this.activity.findViewById(R.id.content);
            viewFindViewById.getViewTreeObserver().addOnPreDrawListener(new a(viewFindViewById));
        }

        protected final void g(Resources.Theme currentTheme, TypedValue typedValue) {
            Intrinsics.checkNotNullParameter(currentTheme, "currentTheme");
            Intrinsics.checkNotNullParameter(typedValue, "typedValue");
            if (currentTheme.resolveAttribute(uw9.a, typedValue, true)) {
                int i = typedValue.resourceId;
                this.finalThemeId = i;
                if (i != 0) {
                    this.activity.setTheme(i);
                }
            }
        }

        public final void h(d dVar) {
            Intrinsics.checkNotNullParameter(dVar, "<set-?>");
            this.splashScreenWaitPredicate = dVar;
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0019\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010 \u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0017\u0010%\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lcom/google/android/r1c$c;", "Lcom/google/android/r1c$b;", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;)V", "Landroid/window/SplashScreenView;", "child", "", "j", "(Landroid/window/SplashScreenView;)Z", "", "e", "()V", "Lcom/google/android/r1c$d;", "keepOnScreenCondition", "f", "(Lcom/google/android/r1c$d;)V", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "h", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "getPreDrawListener", "()Landroid/view/ViewTreeObserver$OnPreDrawListener;", "setPreDrawListener", "(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V", "preDrawListener", "i", "Z", "getMDecorFitWindowInsets", "()Z", "k", "(Z)V", "mDecorFitWindowInsets", "Landroid/view/ViewGroup$OnHierarchyChangeListener;", "Landroid/view/ViewGroup$OnHierarchyChangeListener;", "getHierarchyListener", "()Landroid/view/ViewGroup$OnHierarchyChangeListener;", "hierarchyListener", "core-splashscreen_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class c extends b {

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private ViewTreeObserver.OnPreDrawListener preDrawListener;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private boolean mDecorFitWindowInsets;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final ViewGroup.OnHierarchyChangeListener hierarchyListener;

        @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\b\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"com/google/android/r1c$c$a", "Landroid/view/ViewGroup$OnHierarchyChangeListener;", "Landroid/view/View;", "parent", "child", "", "onChildViewAdded", "(Landroid/view/View;Landroid/view/View;)V", "onChildViewRemoved", "core-splashscreen_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a implements ViewGroup.OnHierarchyChangeListener {
            final /* synthetic */ Activity b;

            a(Activity activity) {
                this.b = activity;
            }

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewAdded(View parent, View child) {
                if (w1c.a(child)) {
                    c cVar = c.this;
                    cVar.k(cVar.j(x1c.a(child)));
                    View decorView = this.b.getWindow().getDecorView();
                    Intrinsics.h(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
                    ((ViewGroup) decorView).setOnHierarchyChangeListener(null);
                }
            }

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewRemoved(View parent, View child) {
            }
        }

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/google/android/r1c$c$b", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "", "onPreDraw", "()Z", "core-splashscreen_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class b implements ViewTreeObserver.OnPreDrawListener {
            final /* synthetic */ View b;

            b(View view) {
                this.b = view;
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (c.this.getSplashScreenWaitPredicate().a()) {
                    return false;
                }
                this.b.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Activity activity) {
            super(activity);
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.mDecorFitWindowInsets = true;
            this.hierarchyListener = new a(activity);
        }

        @Override // com.google.android.r1c.b
        public void e() {
            Resources.Theme theme = getActivity().getTheme();
            Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
            g(theme, new TypedValue());
            if (Build.VERSION.SDK_INT < 33) {
                View decorView = getActivity().getWindow().getDecorView();
                Intrinsics.h(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) decorView).setOnHierarchyChangeListener(this.hierarchyListener);
            }
        }

        @Override // com.google.android.r1c.b
        public void f(d keepOnScreenCondition) {
            Intrinsics.checkNotNullParameter(keepOnScreenCondition, "keepOnScreenCondition");
            h(keepOnScreenCondition);
            View viewFindViewById = getActivity().findViewById(R.id.content);
            ViewTreeObserver viewTreeObserver = viewFindViewById.getViewTreeObserver();
            if (this.preDrawListener != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.preDrawListener);
            }
            b bVar = new b(viewFindViewById);
            this.preDrawListener = bVar;
            viewTreeObserver.addOnPreDrawListener(bVar);
        }

        public final boolean j(SplashScreenView child) {
            Intrinsics.checkNotNullParameter(child, "child");
            WindowInsets windowInsetsBuild = t1c.a().build();
            Intrinsics.checkNotNullExpressionValue(windowInsetsBuild, "build(...)");
            Rect rect = new Rect(t04.INVALID_ID, t04.INVALID_ID, Integer.MAX_VALUE, Integer.MAX_VALUE);
            return (windowInsetsBuild == child.getRootView().computeSystemWindowInsets(windowInsetsBuild, rect) && rect.isEmpty()) ? false : true;
        }

        public final void k(boolean z) {
            this.mDecorFitWindowInsets = z;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lcom/google/android/r1c$d;", "", "", "a", "()Z", "core-splashscreen_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface d {
        boolean a();
    }

    public /* synthetic */ r1c(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        this.impl.e();
    }

    public final void c(d condition) {
        Intrinsics.checkNotNullParameter(condition, "condition");
        this.impl.f(condition);
    }

    private r1c(Activity activity) {
        this.impl = Build.VERSION.SDK_INT >= 31 ? new c(activity) : new b(activity);
    }
}
