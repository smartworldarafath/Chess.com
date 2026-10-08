package androidx.p008glance.p009appwidget;

import android.util.Log;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.android.ut0;
import com.google.inputmethod.AppWidgetId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ClosedSendChannelException;

/* JADX INFO: renamed from: androidx.glance.appwidget.GlanceRemoteViewsService$GlanceRemoteViewsFactory$loadData$1, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
@lq2(c = "androidx.glance.appwidget.GlanceRemoteViewsService$GlanceRemoteViewsFactory$loadData$1", f = "GlanceRemoteViewsService.kt", l = {114}, m = "invokeSuspend")
final class C0230GlanceRemoteViewsService$GlanceRemoteViewsFactory$loadData$1 extends SuspendLambda implements Function2<ta2, q22<? super Object>, Object> {
    int label;
    final /* synthetic */ GlanceRemoteViewsService.GlanceRemoteViewsFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0230GlanceRemoteViewsService$GlanceRemoteViewsFactory$loadData$1(GlanceRemoteViewsService.GlanceRemoteViewsFactory glanceRemoteViewsFactory, q22<? super C0230GlanceRemoteViewsService$GlanceRemoteViewsFactory$loadData$1> q22Var) {
        super(2, q22Var);
        this.this$0 = glanceRemoteViewsFactory;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new C0230GlanceRemoteViewsService$GlanceRemoteViewsFactory$loadData$1(this.this$0, q22Var);
    }

    public final Object invoke(ta2 ta2Var, q22<Object> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object objG = a.g();
        int i = this.label;
        try {
            if (i == 0) {
                f.b(obj);
                AppWidgetId appWidgetId = new AppWidgetId(this.this$0.appWidgetId);
                GlanceRemoteViewsService.GlanceRemoteViewsFactory glanceRemoteViewsFactory = this.this$0;
                this.label = 1;
                if (glanceRemoteViewsFactory.h(appWidgetId, this) == objG) {
                    return objG;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
            return Unit.a;
        } catch (ClosedSendChannelException e) {
            return ut0.e(Log.e("GlanceRemoteViewService", "Error when trying to start session for list items", e));
        }
    }
}
