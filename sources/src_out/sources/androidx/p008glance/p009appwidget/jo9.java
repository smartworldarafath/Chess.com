package androidx.p008glance.p009appwidget;

import android.content.Context;
import androidx.compose.p004runtime.d;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.rw0;
import com.google.inputmethod.qy4;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: androidx.glance.appwidget.AppWidgetUtilsKt$runGlance$1, reason: from Kotlin metadata */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/google/android/jo9;", "Lkotlin/Function0;", "", "<anonymous>", "(Lcom/google/android/jo9;)V"}, k = 3, mv = {1, 8, 0})
@lq2(c = "androidx.glance.appwidget.AppWidgetUtilsKt$runGlance$1", f = "AppWidgetUtils.kt", l = {263}, m = "invokeSuspend")
final class jo9 extends SuspendLambda implements Function2<com.google.android.jo9<? super Function2<? super d, ? super Integer, ? extends Unit>>, q22<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ qy4 $id;
    final /* synthetic */ GlanceAppWidget $this_runGlance;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.glance.appwidget.AppWidgetUtilsKt$runGlance$1$1, reason: from Kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {1, 8, 0})
    @lq2(c = "androidx.glance.appwidget.AppWidgetUtilsKt$runGlance$1$1", f = "AppWidgetUtils.kt", l = {263}, m = "invokeSuspend")
    static final class ta2 extends SuspendLambda implements Function2<com.google.android.ta2, q22<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ qy4 $id;
        final /* synthetic */ GlanceAppWidget $this_runGlance;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ta2(GlanceAppWidget glanceAppWidget, Context context, qy4 qy4Var, q22<? super ta2> q22Var) {
            super(2, q22Var);
            this.$this_runGlance = glanceAppWidget;
            this.$context = context;
            this.$id = qy4Var;
        }

        public final q22<Unit> create(Object obj, q22<?> q22Var) {
            return new ta2(this.$this_runGlance, this.$context, this.$id, q22Var);
        }

        public final Object invoke(com.google.android.ta2 ta2Var, q22<? super Unit> q22Var) {
            return create(ta2Var, q22Var).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object objG = a.g();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                GlanceAppWidget glanceAppWidget = this.$this_runGlance;
                Context context = this.$context;
                qy4 qy4Var = this.$id;
                this.label = 1;
                if (glanceAppWidget.i(context, qy4Var, this) == objG) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    jo9(GlanceAppWidget glanceAppWidget, Context context, qy4 qy4Var, q22<? super jo9> q22Var) {
        super(2, q22Var);
        this.$this_runGlance = glanceAppWidget;
        this.$context = context;
        this.$id = qy4Var;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        jo9 jo9Var = new jo9(this.$this_runGlance, this.$context, this.$id, q22Var);
        jo9Var.L$0 = obj;
        return jo9Var;
    }

    public final Object invoke(com.google.android.jo9<? super Function2<? super d, ? super Integer, Unit>> jo9Var, q22<? super Unit> q22Var) {
        return create(jo9Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object objG = a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            AppWidgetUtilsKt$runGlance$1$receiver$1 appWidgetUtilsKt$runGlance$1$receiver$1 = new AppWidgetUtilsKt$runGlance$1$receiver$1(new AtomicReference(null), (com.google.android.jo9) this.L$0);
            ta2 ta2Var = new ta2(this.$this_runGlance, this.$context, this.$id, null);
            this.label = 1;
            if (rw0.g(appWidgetUtilsKt$runGlance$1$receiver$1, ta2Var, this) == objG) {
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
