package androidx.p008glance.p009appwidget;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.p004runtime.p0;
import androidx.compose.p004runtime.s0;
import androidx.compose.p004runtime.snapshots.g;
import androidx.p008glance.CompositionLocalsKt;
import androidx.p008glance.p010session.Session;
import androidx.p008glance.state.GlanceState;
import com.google.android.ai4;
import com.google.android.p58;
import com.google.android.q22;
import com.google.android.sl1;
import com.google.android.ut0;
import com.google.inputmethod.AppWidgetId;
import com.google.inputmethod.LambdaAction;
import com.google.inputmethod.RemoteViewsRoot;
import com.google.inputmethod.fs1;
import com.google.inputmethod.jf3;
import com.google.inputmethod.ko1;
import com.google.inputmethod.ks9;
import com.google.inputmethod.o58;
import com.google.inputmethod.os9;
import com.google.inputmethod.q6c;
import com.google.inputmethod.qy4;
import com.google.inputmethod.ry4;
import com.google.inputmethod.su1;
import com.google.inputmethod.t04;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.b0;
import kotlin.f;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.p;
import kotlinx.coroutines.s;
import kotlinx.coroutines.u;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 ]2\u00020\u0001:\u0005^_`7*BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00180\u001e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001f\u0010 J \u0010#\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020!H\u0096@¢\u0006\u0004\b#\u0010$J \u0010%\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b%\u0010&J \u0010(\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010'\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0018H\u0016¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0018H\u0086@¢\u0006\u0004\b,\u0010-J\u0018\u0010/\u001a\u00020\u00182\u0006\u0010.\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b/\u00100J\u0018\u00103\u001a\u00020\u00182\u0006\u00102\u001a\u000201H\u0086@¢\u0006\u0004\b3\u00104J\u0010\u00106\u001a\u000205H\u0086@¢\u0006\u0004\b6\u0010-R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u00109R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010:R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010=R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010>R/\u0010E\u001a\u0004\u0018\u00010\u00102\b\u0010?\u001a\u0004\u0018\u00010\u00108B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR/\u0010K\u001a\u0004\u0018\u00010\u00062\b\u0010?\u001a\u0004\u0018\u00010\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bF\u0010@\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR(\u0010Q\u001a\u0014\u0012\u0004\u0012\u000201\u0012\n\u0012\b\u0012\u0004\u0012\u00020N0M0L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010U\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\"\u0010\\\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010W0V8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[¨\u0006d²\u0006\u000e\u0010b\u001a\u00020a8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010c\u001a\u00020\u000e8\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/glance/appwidget/AppWidgetSession;", "Landroidx/glance/session/Session;", "Landroidx/glance/appwidget/GlanceAppWidget;", "widget", "Lcom/google/android/my;", "id", "Landroid/os/Bundle;", "initialOptions", "Lcom/google/android/su1;", "configManager", "Landroid/content/ComponentName;", "lambdaReceiver", "Landroidx/glance/appwidget/m;", "sizeMode", "", "shouldPublish", "", "initialGlanceState", "<init>", "(Landroidx/glance/appwidget/GlanceAppWidget;Lcom/google/android/my;Landroid/os/Bundle;Lcom/google/android/su1;Landroid/content/ComponentName;Landroidx/glance/appwidget/m;ZLjava/lang/Object;)V", "Landroid/content/Context;", "context", "", "throwable", "", "x", "(Landroid/content/Context;Ljava/lang/Throwable;)V", "Lcom/google/android/bga;", "u", "()Lcom/google/android/bga;", "Lkotlin/Function0;", "j", "(Landroid/content/Context;)Lkotlin/jvm/functions/Function2;", "Lcom/google/android/jq3;", "root", "h", "(Landroid/content/Context;Lcom/google/android/jq3;Lcom/google/android/q22;)Ljava/lang/Object;", "f", "(Landroid/content/Context;Ljava/lang/Throwable;Lcom/google/android/q22;)Ljava/lang/Object;", "event", "i", "(Landroid/content/Context;Ljava/lang/Object;Lcom/google/android/q22;)Ljava/lang/Object;", "e", "()V", "C", "(Lcom/google/android/q22;)Ljava/lang/Object;", "newOptions", "B", "(Landroid/os/Bundle;Lcom/google/android/q22;)Ljava/lang/Object;", "", "key", "y", "(Ljava/lang/String;Lcom/google/android/q22;)Ljava/lang/Object;", "Lkotlinx/coroutines/s;", "D", "d", "Landroidx/glance/appwidget/GlanceAppWidget;", "Lcom/google/android/my;", "Lcom/google/android/su1;", "g", "Landroid/content/ComponentName;", "Landroidx/glance/appwidget/m;", "Z", "<set-?>", "Lcom/google/android/o58;", "v", "()Ljava/lang/Object;", "z", "(Ljava/lang/Object;)V", "glanceState", "k", "w", "()Landroid/os/Bundle;", "A", "(Landroid/os/Bundle;)V", "options", "", "", "Lcom/google/android/tm6;", "l", "Ljava/util/Map;", "lambdas", "Lcom/google/android/sl1;", "m", "Lcom/google/android/sl1;", "parentJob", "Lcom/google/android/p58;", "Landroid/widget/RemoteViews;", "n", "Lcom/google/android/p58;", "getLastRemoteViews$glance_appwidget_release", "()Lcom/google/android/p58;", "lastRemoteViews", "o", "a", "b", "c", "Lcom/google/android/jf3;", "minSize", "configIsReady", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AppWidgetSession extends Session {
    private static final a o = new a(null);
    public static final int p = 8;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final GlanceAppWidget widget;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AppWidgetId id;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final su1 configManager;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final ComponentName lambdaReceiver;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final m sizeMode;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean shouldPublish;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final o58 glanceState;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final o58 options;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private Map<String, ? extends List<LambdaAction>> lambdas;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final sl1 parentJob;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final p58<RemoteViews> lastRemoteViews;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/glance/appwidget/AppWidgetSession$a;", "", "<init>", "()V", "", "DEBUG", "Z", "", "TAG", "Ljava/lang/String;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Landroidx/glance/appwidget/AppWidgetSession$b;", "", "", "key", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String key;

        public b(String str) {
            this.key = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getKey() {
            return this.key;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Landroidx/glance/appwidget/AppWidgetSession$c;", "", "Landroid/os/Bundle;", "newOptions", "<init>", "(Landroid/os/Bundle;)V", "a", "Landroid/os/Bundle;", "()Landroid/os/Bundle;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Bundle newOptions;

        public c(Bundle bundle) {
            this.newOptions = bundle;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Bundle getNewOptions() {
            return this.newOptions;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/glance/appwidget/AppWidgetSession$d;", "", "<init>", "()V", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d {
        public static final d a = new d();

        private d() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Landroidx/glance/appwidget/AppWidgetSession$e;", "", "Lcom/google/android/sl1;", "job", "<init>", "(Lcom/google/android/sl1;)V", "a", "Lcom/google/android/sl1;", "()Lcom/google/android/sl1;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final sl1 job;

        public e(sl1 sl1Var) {
            this.job = sl1Var;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final sl1 getJob() {
            return this.job;
        }
    }

    public /* synthetic */ AppWidgetSession(GlanceAppWidget glanceAppWidget, AppWidgetId appWidgetId, Bundle bundle, su1 su1Var, ComponentName componentName, m mVar, boolean z, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(glanceAppWidget, appWidgetId, (i & 4) != 0 ? null : bundle, (i & 8) != 0 ? GlanceState.a : su1Var, (i & 16) != 0 ? null : componentName, (i & 32) != 0 ? glanceAppWidget.getSizeMode() : mVar, (i & 64) != 0 ? true : z, (i & 128) != 0 ? null : obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(Bundle bundle) {
        this.options.setValue(bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object v() {
        return this.glanceState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final Bundle w() {
        return (Bundle) this.options.getValue();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void x(Context context, Throwable throwable) throws Throwable {
        AppWidgetUtilsKt.m(throwable);
        if (!this.shouldPublish) {
            throw throwable;
        }
        GlanceAppWidget glanceAppWidget = this.widget;
        AppWidgetId appWidgetId = this.id;
        glanceAppWidget.f(context, appWidgetId, appWidgetId.getAppWidgetId(), throwable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(Object obj) {
        this.glanceState.setValue(obj);
    }

    public final Object B(Bundle bundle, q22<? super Unit> q22Var) {
        Object objL = l(new c(bundle), q22Var);
        return objL == kotlin.coroutines.intrinsics.a.g() ? objL : Unit.a;
    }

    public final Object C(q22<? super Unit> q22Var) {
        Object objL = l(d.a, q22Var);
        return objL == kotlin.coroutines.intrinsics.a.g() ? objL : Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object D(q22<? super s> q22Var) {
        AppWidgetSession$waitForReady$1 appWidgetSession$waitForReady$1;
        e eVar;
        if (q22Var instanceof AppWidgetSession$waitForReady$1) {
            appWidgetSession$waitForReady$1 = (AppWidgetSession$waitForReady$1) q22Var;
            int i = appWidgetSession$waitForReady$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                appWidgetSession$waitForReady$1.label = i - t04.INVALID_ID;
            } else {
                appWidgetSession$waitForReady$1 = new AppWidgetSession$waitForReady$1(this, q22Var);
            }
        } else {
            appWidgetSession$waitForReady$1 = new AppWidgetSession$waitForReady$1(this, q22Var);
        }
        Object obj = appWidgetSession$waitForReady$1.result;
        Object objG = kotlin.coroutines.intrinsics.a.g();
        int i2 = appWidgetSession$waitForReady$1.label;
        if (i2 == 0) {
            f.b(obj);
            e eVar2 = new e(u.a(this.parentJob));
            appWidgetSession$waitForReady$1.L$0 = eVar2;
            appWidgetSession$waitForReady$1.label = 1;
            if (l(eVar2, appWidgetSession$waitForReady$1) == objG) {
                return objG;
            }
            eVar = eVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eVar = (e) appWidgetSession$waitForReady$1.L$0;
            f.b(obj);
        }
        return eVar.getJob();
    }

    @Override // androidx.p008glance.p010session.Session
    public void e() {
        s.a.a(this.parentJob, (CancellationException) null, 1, (Object) null);
    }

    @Override // androidx.p008glance.p010session.Session
    public Object f(Context context, Throwable th, q22<? super Unit> q22Var) throws Throwable {
        x(context, th);
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0113, code lost:
    
        if (r15.d(r4) == r5) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x012b, code lost:
    
        if (r15.d(r4) == r5) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x013b, code lost:
    
        if (r15.d(r4) == r5) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0150, code lost:
    
        if (r15.d(r4) == r5) goto L59;
     */
    @Override // androidx.p008glance.p010session.Session
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(android.content.Context r21, com.google.inputmethod.jq3 r22, com.google.android.q22<? super java.lang.Boolean> r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.p008glance.p009appwidget.AppWidgetSession.h(android.content.Context, com.google.android.jq3, com.google.android.q22):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.p008glance.p010session.Session
    public Object i(Context context, Object obj, q22<? super Unit> q22Var) {
        AppWidgetSession$processEvent$1 appWidgetSession$processEvent$1;
        AppWidgetSession appWidgetSession;
        androidx.compose.p004runtime.snapshots.b bVarO;
        g gVarL;
        if (q22Var instanceof AppWidgetSession$processEvent$1) {
            appWidgetSession$processEvent$1 = (AppWidgetSession$processEvent$1) q22Var;
            int i = appWidgetSession$processEvent$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                appWidgetSession$processEvent$1.label = i - t04.INVALID_ID;
            } else {
                appWidgetSession$processEvent$1 = new AppWidgetSession$processEvent$1(this, q22Var);
            }
        } else {
            appWidgetSession$processEvent$1 = new AppWidgetSession$processEvent$1(this, q22Var);
        }
        Object objA = appWidgetSession$processEvent$1.result;
        Object objG = kotlin.coroutines.intrinsics.a.g();
        int i2 = appWidgetSession$processEvent$1.label;
        Unit unit = null;
        try {
            try {
                if (i2 == 0) {
                    f.b(objA);
                    if (obj instanceof d) {
                        ry4<?> ry4VarE = this.widget.e();
                        if (ry4VarE != null) {
                            su1 su1Var = this.configManager;
                            String key = getKey();
                            appWidgetSession$processEvent$1.L$0 = this;
                            appWidgetSession$processEvent$1.label = 1;
                            objA = su1Var.a(context, ry4VarE, key, appWidgetSession$processEvent$1);
                            if (objA == objG) {
                                return objG;
                            }
                            appWidgetSession = this;
                        } else {
                            appWidgetSession = this;
                            objA = null;
                        }
                    } else if (obj instanceof c) {
                        androidx.compose.p004runtime.snapshots.b bVarO2 = g.Companion.o(g.INSTANCE, null, null, 3, null);
                        try {
                            g gVarL2 = bVarO2.l();
                            try {
                                A(((c) obj).getNewOptions());
                                Unit unit2 = Unit.a;
                                bVarO2.s(gVarL2);
                                bVarO2.C().a();
                                bVarO2.d();
                            } catch (Throwable th) {
                                bVarO2.s(gVarL2);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            bVarO2.d();
                            throw th2;
                        }
                    } else if (obj instanceof b) {
                        androidx.compose.p004runtime.snapshots.b bVarO3 = g.Companion.o(g.INSTANCE, null, null, 3, null);
                        try {
                            g gVarL3 = bVarO3.l();
                            try {
                                List<LambdaAction> list = this.lambdas.get(((b) obj).getKey());
                                if (list != null) {
                                    Iterator<T> it = list.iterator();
                                    while (it.hasNext()) {
                                        ((LambdaAction) it.next()).c().invoke();
                                    }
                                    unit = Unit.a;
                                }
                                bVarO3.s(gVarL3);
                                bVarO3.C().a();
                                bVarO3.d();
                                if (unit == null) {
                                    ut0.e(Log.w("AppWidgetSession", "Triggering Action(" + ((b) obj).getKey() + ") for session(" + getKey() + ") failed"));
                                }
                            } catch (Throwable th3) {
                                bVarO3.s(gVarL3);
                                throw th3;
                            }
                        } catch (Throwable th4) {
                            bVarO3.d();
                            throw th4;
                        }
                    } else {
                        if (!(obj instanceof e)) {
                            throw new IllegalArgumentException("Sent unrecognized event type " + obj.getClass() + " to AppWidgetSession");
                        }
                        sl1 job = ((e) obj).getJob();
                        if (job.b()) {
                            job.complete();
                        }
                    }
                    return Unit.a;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                appWidgetSession = (AppWidgetSession) appWidgetSession$processEvent$1.L$0;
                f.b(objA);
                appWidgetSession.z(objA);
                Unit unit3 = Unit.a;
                bVarO.s(gVarL);
                bVarO.C().a();
                bVarO.d();
                return Unit.a;
            } catch (Throwable th5) {
                bVarO.s(gVarL);
                throw th5;
            }
            gVarL = bVarO.l();
        } catch (Throwable th6) {
            bVarO.d();
            throw th6;
        }
        bVarO = g.Companion.o(g.INSTANCE, null, null, 3, null);
    }

    @Override // androidx.p008glance.p010session.Session
    public Function2<androidx.compose.p004runtime.d, Integer, Unit> j(final Context context) {
        return ko1.c(-1784282257, true, new Function2<androidx.compose.p004runtime.d, Integer, Unit>() { // from class: androidx.glance.appwidget.AppWidgetSession$provideGlance$1

            /* JADX INFO: renamed from: androidx.glance.appwidget.AppWidgetSession$provideGlance$1$1, reason: invalid class name */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(Landroidx/compose/runtime/d;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            static final class AnonymousClass1 extends Lambda implements Function2<d, Integer, Unit> {
                final /* synthetic */ Context $context;
                final /* synthetic */ AppWidgetSession this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(AppWidgetSession appWidgetSession, Context context) {
                    super(2);
                    this.this$0 = appWidgetSession;
                    this.$context = context;
                }

                private static final long b(o58<jf3> o58Var) {
                    return o58Var.getValue().getPackedValue();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void c(o58<jf3> o58Var, long j) {
                    o58Var.setValue(jf3.c(j));
                }

                private static final boolean d(q6c<Boolean> q6cVar) {
                    return q6cVar.getValue().booleanValue();
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((d) obj, ((Number) obj2).intValue());
                    return Unit.a;
                }

                public final void invoke(d dVar, int i) {
                    d dVar2;
                    if ((i & 3) == 2 && dVar.c()) {
                        dVar.q();
                        return;
                    }
                    if (e.k()) {
                        e.o(1688971311, i, -1, "androidx.glance.appwidget.AppWidgetSession.provideGlance.<anonymous>.<anonymous> (AppWidgetSession.kt:116)");
                    }
                    dVar.Q(1881995740);
                    Object objR = dVar.R();
                    d.Companion companion = d.INSTANCE;
                    Unit unit = null;
                    if (objR == companion.a()) {
                        objR = s0.e(jf3.c(jf3.INSTANCE.b()), null, 2, null);
                        dVar.L(objR);
                    }
                    o58 o58Var = (o58) objR;
                    dVar.a0();
                    Boolean bool = Boolean.FALSE;
                    dVar.Q(1881999935);
                    boolean zX = dVar.x(this.this$0) | dVar.x(this.$context) | dVar.x(o58Var);
                    AppWidgetSession appWidgetSession = this.this$0;
                    Context context = this.$context;
                    Object objR2 = dVar.R();
                    if (zX || objR2 == companion.a()) {
                        objR2 = new AppWidgetSession$provideGlance$1$1$configIsReady$2$1(appWidgetSession, context, o58Var, null);
                        dVar.L(objR2);
                    }
                    dVar.a0();
                    if (d(p0.o(bool, (Function2) objR2, dVar, 6))) {
                        dVar.Q(-1786326291);
                        dVar.Q(1882039614);
                        AppWidgetSession appWidgetSession2 = this.this$0;
                        Context context2 = this.$context;
                        Object objR3 = dVar.R();
                        if (objR3 == companion.a()) {
                            objR3 = AppWidgetUtilsKt.n(appWidgetSession2.widget, context2, appWidgetSession2.id);
                            dVar.L(objR3);
                        }
                        dVar.a0();
                        dVar2 = dVar;
                        Function2 function2 = (Function2) p0.a((ai4) objR3, null, null, dVar, 48, 2).getValue();
                        dVar2.Q(1882043230);
                        if (function2 != null) {
                            SizeBoxKt.a(this.this$0.sizeMode, b(o58Var), function2, dVar2, 0);
                            unit = Unit.a;
                        }
                        dVar2.a0();
                        if (unit == null) {
                            IgnoreResultKt.a(dVar2, 0);
                        }
                        dVar2.a0();
                    } else {
                        dVar2 = dVar;
                        dVar2.Q(-1786102688);
                        IgnoreResultKt.a(dVar2, 0);
                        dVar2.a0();
                    }
                    dVar2.Q(1882053955);
                    boolean zX2 = dVar2.x(this.this$0);
                    final AppWidgetSession appWidgetSession3 = this.this$0;
                    Object objR4 = dVar2.R();
                    if (zX2 || objR4 == companion.a()) {
                        objR4 = 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x011a: CONSTRUCTOR (r1v5 'objR4' java.lang.Object) = (r14v5 'appWidgetSession3' androidx.glance.appwidget.AppWidgetSession A[DONT_INLINE]) A[MD:(androidx.glance.appwidget.AppWidgetSession):void (m)] (LINE:33) call: androidx.glance.appwidget.AppWidgetSession$provideGlance$1$1$3$1.<init>(androidx.glance.appwidget.AppWidgetSession):void type: CONSTRUCTOR in method: androidx.glance.appwidget.AppWidgetSession$provideGlance$1.1.invoke(androidx.compose.runtime.d, int):void, file: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: androidx.glance.appwidget.AppWidgetSession$provideGlance$1$1$3$1, state: NOT_LOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                            	... 25 more
                            */
                        /*
                            Method dump skipped, instruction units count: 306
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.p008glance.p009appwidget.AppWidgetSession$provideGlance$1.AnonymousClass1.invoke(androidx.compose.runtime.d, int):void");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((d) obj, ((Number) obj2).intValue());
                    return Unit.a;
                }

                public final void invoke(d dVar, int i) {
                    if ((i & 3) == 2 && dVar.c()) {
                        dVar.q();
                        return;
                    }
                    if (e.k()) {
                        e.o(-1784282257, i, -1, "androidx.glance.appwidget.AppWidgetSession.provideGlance.<anonymous> (AppWidgetSession.kt:110)");
                    }
                    os9<Context> os9VarD = CompositionLocalsKt.a().d(context);
                    os9<qy4> os9VarD2 = CompositionLocalsKt.b().d(this.id);
                    ks9<Bundle> ks9VarA = CompositionLocalsKt.a();
                    Bundle bundleW = this.w();
                    if (bundleW == null) {
                        bundleW = Bundle.EMPTY;
                    }
                    fs1.d(new os9[]{os9VarD, os9VarD2, ks9VarA.d(bundleW), CompositionLocalsKt.d().d(this.v())}, ko1.b(dVar, 1688971311, true, new AnonymousClass1(this, context)), dVar, 48);
                    if (e.k()) {
                        e.n();
                    }
                }
            });
        }

        @Override // androidx.p008glance.p010session.Session
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public RemoteViewsRoot b() {
            return new RemoteViewsRoot(50);
        }

        public final Object y(String str, q22<? super Unit> q22Var) {
            Object objL = l(new b(str), q22Var);
            return objL == kotlin.coroutines.intrinsics.a.g() ? objL : Unit.a;
        }

        public AppWidgetSession(GlanceAppWidget glanceAppWidget, AppWidgetId appWidgetId, Bundle bundle, su1 su1Var, ComponentName componentName, m mVar, boolean z, Object obj) {
            super(AppWidgetUtilsKt.q(appWidgetId));
            this.widget = glanceAppWidget;
            this.id = appWidgetId;
            this.configManager = su1Var;
            this.lambdaReceiver = componentName;
            this.sizeMode = mVar;
            this.shouldPublish = z;
            if (AppWidgetUtilsKt.k(appWidgetId)) {
                if (componentName == null) {
                    throw new IllegalArgumentException("If the AppWidgetSession is not created for a bound widget, you must provide a lambda action receiver");
                }
                if (z) {
                    throw new IllegalArgumentException("Cannot publish RemoteViews to AppWidgetManager since we are not running for a bound widget");
                }
            }
            this.glanceState = p0.i(obj, p0.k());
            this.options = p0.i(bundle, p0.k());
            this.lambdas = b0.j();
            this.parentJob = u.b((s) null, 1, (Object) null);
            this.lastRemoteViews = p.a((Object) null);
        }
    }
