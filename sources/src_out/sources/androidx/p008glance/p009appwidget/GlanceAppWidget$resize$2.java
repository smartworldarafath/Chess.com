package androidx.p008glance.p009appwidget;

import android.os.Bundle;
import com.google.android.lq2;
import com.google.android.ps4;
import com.google.android.q22;
import com.google.inputmethod.gjb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/android/gjb;", "Landroidx/glance/appwidget/AppWidgetSession;", "session", "", "<anonymous>", "(Lcom/google/android/gjb;Landroidx/glance/appwidget/AppWidgetSession;)V"}, k = 3, mv = {1, 8, 0})
@lq2(c = "androidx.glance.appwidget.GlanceAppWidget$resize$2", f = "GlanceAppWidget.kt", l = {193}, m = "invokeSuspend")
final class GlanceAppWidget$resize$2 extends SuspendLambda implements ps4<gjb, AppWidgetSession, q22<? super Unit>, Object> {
    final /* synthetic */ Bundle $options;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GlanceAppWidget$resize$2(Bundle bundle, q22<? super GlanceAppWidget$resize$2> q22Var) {
        super(3, q22Var);
        this.$options = bundle;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(gjb gjbVar, AppWidgetSession appWidgetSession, q22<? super Unit> q22Var) {
        GlanceAppWidget$resize$2 glanceAppWidget$resize$2 = new GlanceAppWidget$resize$2(this.$options, q22Var);
        glanceAppWidget$resize$2.L$0 = appWidgetSession;
        return glanceAppWidget$resize$2.invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object objG = a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            AppWidgetSession appWidgetSession = (AppWidgetSession) this.L$0;
            Bundle bundle = this.$options;
            this.label = 1;
            if (appWidgetSession.B(bundle, this) == objG) {
                return objG;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return Unit.a;
    }
}
