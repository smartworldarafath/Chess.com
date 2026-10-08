package androidx.p008glance.p009appwidget.action;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.p008glance.p009appwidget.AppWidgetUtilsKt;
import androidx.p008glance.p009appwidget.CoroutineBroadcastReceiverKt;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.qjd;
import com.google.android.ta2;
import com.google.android.ut0;
import com.google.inputmethod.AppWidgetId;
import com.google.inputmethod.d9d;
import com.google.inputmethod.f48;
import com.google.inputmethod.nx0;
import com.google.inputmethod.q7;
import com.google.inputmethod.v7;
import com.google.inputmethod.w7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Landroidx/glance/appwidget/action/ActionCallbackBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "a", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ActionCallbackBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: androidx.glance.appwidget.action.ActionCallbackBroadcastReceiver$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\u0010\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u000e\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"Landroidx/glance/appwidget/action/ActionCallbackBroadcastReceiver$a;", "", "<init>", "()V", "Landroid/content/Intent;", "Lcom/google/android/v7;", "parameters", "b", "(Landroid/content/Intent;Lcom/google/android/v7;)Landroid/content/Intent;", "Landroid/content/Context;", "context", "Ljava/lang/Class;", "Lcom/google/android/q7;", "callbackClass", "", "appWidgetId", "a", "(Landroid/content/Context;Ljava/lang/Class;ILcom/google/android/v7;)Landroid/content/Intent;", "", "AppWidgetId", "Ljava/lang/String;", "ExtraCallbackClassName", "ExtraParameters", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Intent b(Intent intent, v7 v7Var) {
            Map<v7.a<? extends Object>, Object> mapA = v7Var.a();
            ArrayList arrayList = new ArrayList(mapA.size());
            for (Map.Entry<v7.a<? extends Object>, Object> entry : mapA.entrySet()) {
                v7.a<? extends Object> key = entry.getKey();
                arrayList.add(qjd.a(key.getName(), entry.getValue()));
            }
            Pair[] pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
            intent.putExtra("ActionCallbackBroadcastReceiver:parameters", nx0.b((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
            return intent;
        }

        public final Intent a(Context context, Class<? extends q7> callbackClass, int appWidgetId, v7 parameters) {
            return b(new Intent(context, (Class<?>) ActionCallbackBroadcastReceiver.class).setPackage(context.getPackageName()).putExtra("ActionCallbackBroadcastReceiver:callbackClass", callbackClass.getCanonicalName()).putExtra("ActionCallbackBroadcastReceiver:appWidgetId", appWidgetId), parameters);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: androidx.glance.appwidget.action.ActionCallbackBroadcastReceiver$onReceive$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {1, 8, 0})
    @lq2(c = "androidx.glance.appwidget.action.ActionCallbackBroadcastReceiver$onReceive$1", f = "ActionCallbackBroadcastReceiver.kt", l = {64}, m = "invokeSuspend")
    static final class AnonymousClass1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ Intent $intent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Intent intent, Context context, q22<? super AnonymousClass1> q22Var) {
            super(2, q22Var);
            this.$intent = intent;
            this.$context = context;
        }

        public final q22<Unit> create(Object obj, q22<?> q22Var) {
            return new AnonymousClass1(this.$intent, this.$context, q22Var);
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
                    Bundle extras = this.$intent.getExtras();
                    if (extras == null) {
                        throw new IllegalArgumentException("The intent must have action parameters extras.");
                    }
                    Bundle bundle = extras.getBundle("ActionCallbackBroadcastReceiver:parameters");
                    if (bundle == null) {
                        throw new IllegalArgumentException("The intent must contain a parameters bundle using extra: ActionCallbackBroadcastReceiver:parameters");
                    }
                    f48 f48VarB = w7.b(new v7.b[0]);
                    for (String str : bundle.keySet()) {
                        f48VarB.d(new v7.a(str), bundle.get(str));
                    }
                    if (extras.containsKey("android.widget.extra.CHECKED")) {
                        f48VarB.d(d9d.a(), ut0.a(extras.getBoolean("android.widget.extra.CHECKED")));
                    }
                    String string = extras.getString("ActionCallbackBroadcastReceiver:callbackClass");
                    if (string == null) {
                        throw new IllegalArgumentException("The intent must contain a work class name string using extra: ActionCallbackBroadcastReceiver:callbackClass");
                    }
                    if (!this.$intent.hasExtra("ActionCallbackBroadcastReceiver:appWidgetId")) {
                        throw new IllegalArgumentException("To update the widget, the intent must contain the AppWidgetId integer using extra: ActionCallbackBroadcastReceiver:appWidgetId");
                    }
                    AppWidgetId appWidgetId = new AppWidgetId(extras.getInt("ActionCallbackBroadcastReceiver:appWidgetId"));
                    d.Companion companion = d.INSTANCE;
                    Context context = this.$context;
                    this.label = 1;
                    if (companion.a(context, string, appWidgetId, f48VarB, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f.b(obj);
                }
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                AppWidgetUtilsKt.m(th);
            }
            return Unit.a;
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        CoroutineBroadcastReceiverKt.b(this, null, new AnonymousClass1(intent, context, null), 1, null);
    }
}
