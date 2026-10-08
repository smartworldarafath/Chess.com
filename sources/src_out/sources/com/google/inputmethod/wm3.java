package com.google.inputmethod;

import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/google/android/wm3;", "Lcom/google/android/vm3;", "<init>", "()V", "Lcom/google/android/tic;", "statusBarStyle", "navigationBarStyle", "Landroid/view/Window;", "window", "Landroid/view/View;", "view", "", "statusBarIsDark", "navigationBarIsDark", "", "b", "(Lcom/google/android/tic;Lcom/google/android/tic;Landroid/view/Window;Landroid/view/View;ZZ)V", "activity"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class wm3 extends vm3 {
    @Override // com.google.inputmethod.um3, com.google.inputmethod.qm3, com.google.inputmethod.ym3
    public void b(tic statusBarStyle, tic navigationBarStyle, Window window, View view, boolean statusBarIsDark, boolean navigationBarIsDark) {
        Intrinsics.checkNotNullParameter(statusBarStyle, "statusBarStyle");
        Intrinsics.checkNotNullParameter(navigationBarStyle, "navigationBarStyle");
        Intrinsics.checkNotNullParameter(window, "window");
        Intrinsics.checkNotNullParameter(view, "view");
        she.b(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        int iE = statusBarStyle.e(statusBarIsDark);
        int iE2 = navigationBarStyle.e(navigationBarIsDark);
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            Iterator it = c8e.a(viewGroup).iterator();
            while (true) {
                if (!it.hasNext()) {
                    if (iE != 0 || iE2 != 0) {
                        List listS = m.s(new si1[]{new si1(2, iE), new si1(1, iE2), new si1(4, iE2), new si1(8, iE2)});
                        nr9 nr9Var = new nr9(((ViewGroup) view).getContext(), listS);
                        nr9Var.setTag(listS);
                        viewGroup.addView(nr9Var);
                        break;
                    }
                    break;
                }
                Object tag = ((View) it.next()).getTag();
                if (tag instanceof List) {
                    List list = (List) tag;
                    if (list.size() == 4 && (list.get(0) instanceof si1)) {
                        for (Object obj : (Iterable) tag) {
                            if ((obj instanceof si1 ? (si1) obj : null) != null) {
                                si1 si1Var = (si1) obj;
                                int iE3 = si1Var.e();
                                if (iE3 == 1) {
                                    si1Var.p(iE2);
                                } else if (iE3 == 2) {
                                    si1Var.p(iE);
                                } else if (iE3 == 4) {
                                    si1Var.p(iE2);
                                } else if (iE3 == 8) {
                                    si1Var.p(iE2);
                                }
                            }
                        }
                        break;
                    }
                }
            }
        }
        window.setNavigationBarContrastEnforced(navigationBarStyle.getNightMode() == 0);
        kje kjeVar = new kje(window, view);
        kjeVar.d(!statusBarIsDark);
        kjeVar.c(!navigationBarIsDark);
    }
}
