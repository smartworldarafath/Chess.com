package com.google.inputmethod;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.ComponentActivity;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\" \u0010\u000e\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\" \u0010\u0012\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\t\u0012\u0004\b\u0011\u0010\r\u001a\u0004\b\u0010\u0010\u000b\"\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/activity/ComponentActivity;", "Lcom/google/android/tic;", "statusBarStyle", "navigationBarStyle", "", "c", "(Landroidx/activity/ComponentActivity;Lcom/google/android/tic;Lcom/google/android/tic;)V", "", "a", "I", "getDefaultLightScrim", "()I", "getDefaultLightScrim$annotations", "()V", "DefaultLightScrim", "b", "getDefaultDarkScrim", "getDefaultDarkScrim$annotations", "DefaultDarkScrim", "Lcom/google/android/ym3;", "Lcom/google/android/ym3;", "Impl", "activity"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class pm3 {
    private static final int a = Color.argb(230, 255, 255, 255);
    private static final int b = Color.argb(128, 27, 27, 27);
    private static ym3 c;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/google/android/pm3$a", "Landroid/view/View;", "Landroid/content/res/Configuration;", "newConfig", "", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "activity"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends View {
        final /* synthetic */ Runnable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Runnable runnable, Context context) {
            super(context);
            this.a = runnable;
        }

        @Override // android.view.View
        protected void onConfigurationChanged(Configuration newConfig) {
            Intrinsics.checkNotNullParameter(newConfig, "newConfig");
            this.a.run();
        }
    }

    public static final void b(ComponentActivity componentActivity) {
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        d(componentActivity, null, null, 3, null);
    }

    public static final void c(final ComponentActivity componentActivity, final tic ticVar, final tic ticVar2) {
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        Intrinsics.checkNotNullParameter(ticVar, "statusBarStyle");
        Intrinsics.checkNotNullParameter(ticVar2, "navigationBarStyle");
        final View decorView = componentActivity.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        ym3 um3Var = c;
        if (um3Var == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 35) {
                um3Var = new wm3();
            } else if (i >= 30) {
                um3Var = new vm3();
            } else {
                um3Var = i >= 29 ? new um3() : new rm3();
            }
            c = um3Var;
        }
        final ym3 ym3Var = um3Var;
        Runnable runnable = new Runnable() { // from class: com.google.android.om3
            @Override // java.lang.Runnable
            public final void run() {
                pm3.e(ym3Var, ticVar, ticVar2, componentActivity, decorView);
            }
        };
        ViewGroup viewGroup = (ViewGroup) decorView;
        Iterator it = c8e.a(viewGroup).iterator();
        while (it.hasNext()) {
            if (((View) it.next()).getTag() instanceof ym3) {
                runnable.run();
                Window window = componentActivity.getWindow();
                Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
                ym3Var.a(window);
            }
        }
        a aVar = new a(runnable, viewGroup.getContext());
        aVar.setTag(ym3Var);
        aVar.setVisibility(8);
        aVar.setWillNotDraw(true);
        viewGroup.addView(aVar);
        runnable.run();
        Window window2 = componentActivity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window2, "getWindow(...)");
        ym3Var.a(window2);
    }

    public static /* synthetic */ void d(ComponentActivity componentActivity, tic ticVar, tic ticVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            ticVar = tic.Companion.e(tic.INSTANCE, 0, 0, null, 4, null);
        }
        if ((i & 2) != 0) {
            ticVar2 = tic.Companion.e(tic.INSTANCE, a, b, null, 4, null);
        }
        c(componentActivity, ticVar, ticVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(ym3 ym3Var, tic ticVar, tic ticVar2, ComponentActivity componentActivity, View view) {
        Window window = componentActivity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        Function1<Resources, Boolean> function1B = ticVar.b();
        Resources resources = view.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        boolean zBooleanValue = ((Boolean) function1B.invoke(resources)).booleanValue();
        Function1<Resources, Boolean> function1B2 = ticVar2.b();
        Resources resources2 = view.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        ym3Var.b(ticVar, ticVar2, window, view, zBooleanValue, ((Boolean) function1B2.invoke(resources2)).booleanValue());
    }
}
