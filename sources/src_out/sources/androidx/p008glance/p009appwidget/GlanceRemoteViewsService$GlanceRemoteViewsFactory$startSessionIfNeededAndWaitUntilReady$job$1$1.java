package androidx.p008glance.p009appwidget;

import android.content.Context;
import androidx.p008glance.p010session.Session;
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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.s;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/gjb;", "Lkotlinx/coroutines/s;", "<anonymous>", "(Lcom/google/android/gjb;)Lkotlinx/coroutines/s;"}, k = 3, mv = {1, 8, 0})
@lq2(c = "androidx.glance.appwidget.GlanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionIfNeededAndWaitUntilReady$job$1$1", f = "GlanceRemoteViewsService.kt", l = {133, 138, 140}, m = "invokeSuspend")
final class GlanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionIfNeededAndWaitUntilReady$job$1$1 extends SuspendLambda implements Function2<gjb, q22<? super s>, Object> {
    final /* synthetic */ AppWidgetId $glanceId;
    final /* synthetic */ GlanceAppWidget $widget;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GlanceRemoteViewsService.GlanceRemoteViewsFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GlanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionIfNeededAndWaitUntilReady$job$1$1(GlanceRemoteViewsService.GlanceRemoteViewsFactory glanceRemoteViewsFactory, AppWidgetId appWidgetId, GlanceAppWidget glanceAppWidget, q22<? super GlanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionIfNeededAndWaitUntilReady$job$1$1> q22Var) {
        super(2, q22Var);
        this.this$0 = glanceRemoteViewsFactory;
        this.$glanceId = appWidgetId;
        this.$widget = glanceAppWidget;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(gjb gjbVar, q22<? super s> q22Var) {
        return create(gjbVar, q22Var).invokeSuspend(Unit.a);
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        GlanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionIfNeededAndWaitUntilReady$job$1$1 glanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionIfNeededAndWaitUntilReady$job$1$1 = new GlanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionIfNeededAndWaitUntilReady$job$1$1(this.this$0, this.$glanceId, this.$widget, q22Var);
        glanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionIfNeededAndWaitUntilReady$job$1$1.L$0 = obj;
        return glanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionIfNeededAndWaitUntilReady$job$1$1;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0099 A[RETURN] */
    public final Object invokeSuspend(Object obj) {
        gjb gjbVar;
        Object objB;
        Object objD;
        Object objG = a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            gjbVar = (gjb) this.L$0;
            Context context = this.this$0.context;
            String strQ = AppWidgetUtilsKt.q(this.$glanceId);
            this.L$0 = gjbVar;
            this.label = 1;
            objB = gjbVar.b(context, strQ, this);
            if (objB != objG) {
            }
            return objG;
        }
        if (i == 1) {
            gjbVar = (gjb) this.L$0;
            f.b(obj);
            objB = obj;
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
                return obj;
            }
            gjbVar = (gjb) this.L$0;
            f.b(obj);
        }
        Session sessionD = gjbVar.d(AppWidgetUtilsKt.q(this.$glanceId));
        Intrinsics.h(sessionD, "null cannot be cast to non-null type androidx.glance.appwidget.AppWidgetSession");
        this.L$0 = null;
        this.label = 3;
        objD = ((AppWidgetSession) sessionD).D(this);
        if (objD != objG) {
            return objG;
        }
        return objD;
        if (((Boolean) objB).booleanValue()) {
            return null;
        }
        Context context2 = this.this$0.context;
        AppWidgetSession appWidgetSession = new AppWidgetSession(this.$widget, this.$glanceId, null, null, null, null, false, null, 252, null);
        this.L$0 = gjbVar;
        this.label = 2;
        if (gjbVar.c(context2, appWidgetSession, this) != objG) {
            Session sessionD2 = gjbVar.d(AppWidgetUtilsKt.q(this.$glanceId));
            Intrinsics.h(sessionD2, "null cannot be cast to non-null type androidx.glance.appwidget.AppWidgetSession");
            this.L$0 = null;
            this.label = 3;
            objD = ((AppWidgetSession) sessionD2).D(this);
            if (objD != objG) {
                return objD;
            }
        }
        return objG;
    }
}
