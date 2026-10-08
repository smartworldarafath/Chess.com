package androidx.p008glance.p009appwidget;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.inputmethod.AppWidgetId;
import com.google.inputmethod.gjb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/gjb;", "", "<anonymous>", "(Lcom/google/android/gjb;)V"}, k = 3, mv = {1, 8, 0})
@lq2(c = "androidx.glance.appwidget.GlanceAppWidget$deleted$2", f = "GlanceAppWidget.kt", l = {125}, m = "invokeSuspend")
final class GlanceAppWidget$deleted$2 extends SuspendLambda implements Function2<gjb, q22<? super Unit>, Object> {
    final /* synthetic */ AppWidgetId $glanceId;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GlanceAppWidget$deleted$2(AppWidgetId appWidgetId, q22<? super GlanceAppWidget$deleted$2> q22Var) {
        super(2, q22Var);
        this.$glanceId = appWidgetId;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(gjb gjbVar, q22<? super Unit> q22Var) {
        return create(gjbVar, q22Var).invokeSuspend(Unit.a);
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        GlanceAppWidget$deleted$2 glanceAppWidget$deleted$2 = new GlanceAppWidget$deleted$2(this.$glanceId, q22Var);
        glanceAppWidget$deleted$2.L$0 = obj;
        return glanceAppWidget$deleted$2;
    }

    public final Object invokeSuspend(Object obj) {
        Object objG = a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            gjb gjbVar = (gjb) this.L$0;
            String strQ = AppWidgetUtilsKt.q(this.$glanceId);
            this.label = 1;
            if (gjbVar.a(strQ, this) == objG) {
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
