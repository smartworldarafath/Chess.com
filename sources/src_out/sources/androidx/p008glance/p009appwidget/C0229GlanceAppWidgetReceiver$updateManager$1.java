package androidx.p008glance.p009appwidget;

import android.content.Context;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: androidx.glance.appwidget.GlanceAppWidgetReceiver$updateManager$1, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {1, 8, 0})
@lq2(c = "androidx.glance.appwidget.GlanceAppWidgetReceiver$updateManager$1", f = "GlanceAppWidgetReceiver.kt", l = {137}, m = "invokeSuspend")
final class C0229GlanceAppWidgetReceiver$updateManager$1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    int label;
    final /* synthetic */ GlanceAppWidgetReceiver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0229GlanceAppWidgetReceiver$updateManager$1(Context context, GlanceAppWidgetReceiver glanceAppWidgetReceiver, q22<? super C0229GlanceAppWidgetReceiver$updateManager$1> q22Var) {
        super(2, q22Var);
        this.$context = context;
        this.this$0 = glanceAppWidgetReceiver;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new C0229GlanceAppWidgetReceiver$updateManager$1(this.$context, this.this$0, q22Var);
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object objG = a.g();
        int i = this.label;
        try {
            if (i == 0) {
                f.b(obj);
                Context context = this.$context;
                GlanceAppWidgetReceiver glanceAppWidgetReceiver = this.this$0;
                GlanceAppWidgetManager glanceAppWidgetManager = new GlanceAppWidgetManager(context);
                GlanceAppWidget glanceAppWidgetC = glanceAppWidgetReceiver.c();
                this.label = 1;
                if (glanceAppWidgetManager.m(glanceAppWidgetReceiver, glanceAppWidgetC, this) == objG) {
                    return objG;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
        } catch (CancellationException unused) {
        } catch (Throwable th) {
            AppWidgetUtilsKt.m(th);
        }
        return Unit.a;
    }
}
