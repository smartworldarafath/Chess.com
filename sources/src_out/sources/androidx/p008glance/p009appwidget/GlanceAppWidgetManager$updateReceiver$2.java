package androidx.p008glance.p009appwidget;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.inputmethod.h58;
import com.google.inputmethod.uk9;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.l0;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/glance/appwidget/GlanceAppWidgetReceiver;", "R", "Landroidx/glance/appwidget/GlanceAppWidget;", "P", "Lcom/google/android/uk9;", "pref", "<anonymous>", "(Lcom/google/android/uk9;)Lcom/google/android/uk9;"}, k = 3, mv = {1, 8, 0})
@lq2(c = "androidx.glance.appwidget.GlanceAppWidgetManager$updateReceiver$2", f = "GlanceAppWidgetManager.kt", l = {}, m = "invokeSuspend")
final class GlanceAppWidgetManager$updateReceiver$2 extends SuspendLambda implements Function2<uk9, q22<? super uk9>, Object> {
    final /* synthetic */ String $providerName;
    final /* synthetic */ String $receiverName;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GlanceAppWidgetManager$updateReceiver$2(String str, String str2, q22<? super GlanceAppWidgetManager$updateReceiver$2> q22Var) {
        super(2, q22Var);
        this.$receiverName = str;
        this.$providerName = str2;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(uk9 uk9Var, q22<? super uk9> q22Var) {
        return create(uk9Var, q22Var).invokeSuspend(Unit.a);
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        GlanceAppWidgetManager$updateReceiver$2 glanceAppWidgetManager$updateReceiver$2 = new GlanceAppWidgetManager$updateReceiver$2(this.$receiverName, this.$providerName, q22Var);
        glanceAppWidgetManager$updateReceiver$2.L$0 = obj;
        return glanceAppWidgetManager$updateReceiver$2;
    }

    public final Object invokeSuspend(Object obj) {
        a.g();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        uk9 uk9Var = (uk9) this.L$0;
        h58 h58VarD = uk9Var.d();
        String str = this.$receiverName;
        String str2 = this.$providerName;
        uk9.a aVar = GlanceAppWidgetManager.h;
        Set setE = (Set) uk9Var.c(GlanceAppWidgetManager.h);
        if (setE == null) {
            setE = l0.e();
        }
        h58VarD.l(aVar, l0.p(setE, str));
        h58VarD.l(GlanceAppWidgetManager.d.j(str), str2);
        return h58VarD.e();
    }
}
