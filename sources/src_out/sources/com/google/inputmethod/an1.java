package com.google.inputmethod;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.f;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.ibe;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\b\u001a\u00020\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/activity/ComponentActivity;", "Landroidx/compose/runtime/f;", "parent", "Lkotlin/Function0;", "", "content", "a", "(Landroidx/activity/ComponentActivity;Landroidx/compose/runtime/f;Lkotlin/jvm/functions/Function2;)V", "c", "(Landroidx/activity/ComponentActivity;)V", "Landroid/view/ViewGroup$LayoutParams;", "Landroid/view/ViewGroup$LayoutParams;", "DefaultActivityContentLayoutParams", "activity-compose"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class an1 {
    private static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    public static final void a(ComponentActivity componentActivity, f fVar, Function2<? super d, ? super Integer, Unit> function2) {
        View childAt = ((ViewGroup) componentActivity.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        ComposeView composeView = childAt instanceof ComposeView ? (ComposeView) childAt : null;
        if (composeView != null) {
            composeView.setParentCompositionContext(fVar);
            composeView.setContent(function2);
            return;
        }
        ComposeView composeView2 = new ComposeView(componentActivity, null, 0, 6, null);
        composeView2.setParentCompositionContext(fVar);
        composeView2.setContent(function2);
        c(componentActivity);
        componentActivity.setContentView(composeView2, a);
    }

    public static /* synthetic */ void b(ComponentActivity componentActivity, f fVar, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            fVar = null;
        }
        a(componentActivity, fVar, function2);
    }

    private static final void c(ComponentActivity componentActivity) {
        View decorView = componentActivity.getWindow().getDecorView();
        if (fbe.a(decorView) == null) {
            fbe.b(decorView, componentActivity);
        }
        if (jbe.a(decorView) == null) {
            jbe.b(decorView, componentActivity);
        }
        if (ibe.a(decorView) == null) {
            ibe.b(decorView, componentActivity);
        }
    }
}
