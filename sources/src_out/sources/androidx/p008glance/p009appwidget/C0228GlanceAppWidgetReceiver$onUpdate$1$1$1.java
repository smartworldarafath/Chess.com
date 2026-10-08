package androidx.p008glance.p009appwidget;

import android.content.Context;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: androidx.glance.appwidget.GlanceAppWidgetReceiver$onUpdate$1$1$1, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {1, 8, 0})
@lq2(c = "androidx.glance.appwidget.GlanceAppWidgetReceiver$onUpdate$1$1$1", f = "GlanceAppWidgetReceiver.kt", l = {107}, m = "invokeSuspend")
final class C0228GlanceAppWidgetReceiver$onUpdate$1$1$1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ int $it;
    int label;
    final /* synthetic */ GlanceAppWidgetReceiver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0228GlanceAppWidgetReceiver$onUpdate$1$1$1(GlanceAppWidgetReceiver glanceAppWidgetReceiver, Context context, int i, q22<? super C0228GlanceAppWidgetReceiver$onUpdate$1$1$1> q22Var) {
        super(2, q22Var);
        this.this$0 = glanceAppWidgetReceiver;
        this.$context = context;
        this.$it = i;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new C0228GlanceAppWidgetReceiver$onUpdate$1$1$1(this.this$0, this.$context, this.$it, q22Var);
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object objG = a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            GlanceAppWidget glanceAppWidgetC = this.this$0.c();
            Context context = this.$context;
            int i2 = this.$it;
            this.label = 1;
            if (GlanceAppWidget.o(glanceAppWidgetC, context, i2, null, this, 4, null) == objG) {
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
