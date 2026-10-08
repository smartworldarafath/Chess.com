package androidx.p008glance.p009appwidget;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.inputmethod.h58;
import com.google.inputmethod.uk9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.l0;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/uk9;", "prefs", "<anonymous>", "(Lcom/google/android/uk9;)Lcom/google/android/uk9;"}, k = 3, mv = {1, 8, 0})
@lq2(c = "androidx.glance.appwidget.GlanceAppWidgetManager$cleanReceivers$2", f = "GlanceAppWidgetManager.kt", l = {}, m = "invokeSuspend")
final class GlanceAppWidgetManager$cleanReceivers$2 extends SuspendLambda implements Function2<uk9, q22<? super uk9>, Object> {
    final /* synthetic */ Set<String> $receivers;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GlanceAppWidgetManager$cleanReceivers$2(Set<String> set, q22<? super GlanceAppWidgetManager$cleanReceivers$2> q22Var) {
        super(2, q22Var);
        this.$receivers = set;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(uk9 uk9Var, q22<? super uk9> q22Var) {
        return create(uk9Var, q22Var).invokeSuspend(Unit.a);
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        GlanceAppWidgetManager$cleanReceivers$2 glanceAppWidgetManager$cleanReceivers$2 = new GlanceAppWidgetManager$cleanReceivers$2(this.$receivers, q22Var);
        glanceAppWidgetManager$cleanReceivers$2.L$0 = obj;
        return glanceAppWidgetManager$cleanReceivers$2;
    }

    public final Object invokeSuspend(Object obj) {
        a.g();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        uk9 uk9Var = (uk9) this.L$0;
        Set set = (Set) uk9Var.c(GlanceAppWidgetManager.h);
        if (set != null) {
            Set<String> set2 = this.$receivers;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : set) {
                if (!set2.contains((String) obj2)) {
                    arrayList.add(obj2);
                }
            }
            if (!arrayList.isEmpty()) {
                h58 h58VarD = uk9Var.d();
                h58VarD.l(GlanceAppWidgetManager.h, l0.m(set, arrayList));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    h58VarD.k(GlanceAppWidgetManager.d.j((String) it.next()));
                }
                return h58VarD.e();
            }
        }
        return uk9Var;
    }
}
