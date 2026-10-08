package androidx.p008glance.p009appwidget.state;

import android.content.Context;
import androidx.p008glance.p009appwidget.AppWidgetUtilsKt;
import androidx.p008glance.state.GlanceState;
import androidx.p008glance.state.PreferencesGlanceStateDefinition;
import com.google.android.q22;
import com.google.inputmethod.AppWidgetId;
import com.google.inputmethod.h58;
import com.google.inputmethod.qy4;
import com.google.inputmethod.ry4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001aX\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0006\u001a\u00020\u00052\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007H\u0086@¢\u0006\u0004\b\u000b\u0010\f\u001aD\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007H\u0086@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"T", "Landroid/content/Context;", "context", "Lcom/google/android/ry4;", "definition", "Lcom/google/android/qy4;", "glanceId", "Lkotlin/Function2;", "Lcom/google/android/q22;", "", "updateState", "b", "(Landroid/content/Context;Lcom/google/android/ry4;Lcom/google/android/qy4;Lkotlin/jvm/functions/Function2;Lcom/google/android/q22;)Ljava/lang/Object;", "Lcom/google/android/h58;", "", "a", "(Landroid/content/Context;Lcom/google/android/qy4;Lkotlin/jvm/functions/Function2;Lcom/google/android/q22;)Ljava/lang/Object;", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class GlanceAppWidgetStateKt {
    public static final Object a(Context context, qy4 qy4Var, Function2<? super h58, ? super q22<? super Unit>, ? extends Object> function2, q22<? super Unit> q22Var) {
        Object objB = b(context, PreferencesGlanceStateDefinition.a, qy4Var, new GlanceAppWidgetStateKt$updateAppWidgetState$4(function2, null), q22Var);
        return objB == a.g() ? objB : Unit.a;
    }

    public static final <T> Object b(Context context, ry4<T> ry4Var, qy4 qy4Var, Function2<? super T, ? super q22<? super T>, ? extends Object> function2, q22<? super T> q22Var) {
        if (qy4Var instanceof AppWidgetId) {
            return GlanceState.a.e(context, ry4Var, AppWidgetUtilsKt.b(((AppWidgetId) qy4Var).getAppWidgetId()), function2, q22Var);
        }
        throw new IllegalArgumentException("The glance ID is not the one of an App Widget");
    }
}
