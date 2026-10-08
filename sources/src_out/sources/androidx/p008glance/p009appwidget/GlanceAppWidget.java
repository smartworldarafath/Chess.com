package androidx.p008glance.p009appwidget;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.p008glance.state.PreferencesGlanceStateDefinition;
import com.google.android.ps4;
import com.google.android.q22;
import com.google.inputmethod.AppWidgetId;
import com.google.inputmethod.acd;
import com.google.inputmethod.ejb;
import com.google.inputmethod.fjb;
import com.google.inputmethod.gjb;
import com.google.inputmethod.jz9;
import com.google.inputmethod.qy4;
import com.google.inputmethod.ry4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JZ\u0010\u0013\u001a\u00020\u0011*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2(\u0010\u0012\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rH\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0017\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H¦@¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u0019\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b\u0019\u0010\u0018J \u0010\u001a\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0086@¢\u0006\u0004\b\u001a\u0010\u0018J \u0010\u001c\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0002H\u0080@¢\u0006\u0004\b\u001c\u0010\u001dJ,\u0010\u001e\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0080@¢\u0006\u0004\b\u001e\u0010\u001fJ4\u0010\"\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0080@¢\u0006\u0004\b\"\u0010#J(\u0010$\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0080@¢\u0006\u0004\b$\u0010\u001fJ/\u0010'\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001c\u0010)\u001a\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010,R\u001a\u00102\u001a\u00020.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010/\u001a\u0004\b0\u00101R \u00107\u001a\b\u0012\u0002\b\u0003\u0018\u0001038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00104\u001a\u0004\b5\u00106¨\u00068"}, d2 = {"Landroidx/glance/appwidget/GlanceAppWidget;", "", "", "errorUiLayout", "<init>", "(I)V", "Lcom/google/android/ejb;", "Landroid/content/Context;", "context", "Lcom/google/android/my;", "glanceId", "Landroid/os/Bundle;", "options", "Lkotlin/Function3;", "Lcom/google/android/gjb;", "Landroidx/glance/appwidget/AppWidgetSession;", "Lcom/google/android/q22;", "", "block", "c", "(Lcom/google/android/ejb;Landroid/content/Context;Lcom/google/android/my;Landroid/os/Bundle;Lcom/google/android/ps4;Lcom/google/android/q22;)Ljava/lang/Object;", "Lcom/google/android/qy4;", "id", "i", "(Landroid/content/Context;Lcom/google/android/qy4;Lcom/google/android/q22;)Ljava/lang/Object;", "g", "m", "appWidgetId", "a", "(Landroid/content/Context;ILcom/google/android/q22;)Ljava/lang/Object;", "n", "(Landroid/content/Context;ILandroid/os/Bundle;Lcom/google/android/q22;)Ljava/lang/Object;", "", "actionKey", "k", "(Landroid/content/Context;ILjava/lang/String;Landroid/os/Bundle;Lcom/google/android/q22;)Ljava/lang/Object;", "j", "", "throwable", "f", "(Landroid/content/Context;Lcom/google/android/qy4;ILjava/lang/Throwable;)V", "I", "b", "()I", "Lcom/google/android/ejb;", "sessionManager", "Landroidx/glance/appwidget/m;", "Landroidx/glance/appwidget/m;", "d", "()Landroidx/glance/appwidget/m;", "sizeMode", "Lcom/google/android/ry4;", "Lcom/google/android/ry4;", "e", "()Lcom/google/android/ry4;", "stateDefinition", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class GlanceAppWidget {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int errorUiLayout;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ejb sessionManager;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final m sizeMode;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final ry4<?> stateDefinition;

    public GlanceAppWidget() {
        this(0, 1, null);
    }

    private final Object c(ejb ejbVar, Context context, AppWidgetId appWidgetId, Bundle bundle, ps4<? super gjb, ? super AppWidgetSession, ? super q22<? super Unit>, ? extends Object> ps4Var, q22<? super Unit> q22Var) {
        Object objB = ejbVar.b(new GlanceAppWidget$getOrCreateAppWidgetSession$2(context, appWidgetId, this, bundle, ps4Var, null), q22Var);
        return objB == a.g() ? objB : Unit.a;
    }

    static /* synthetic */ Object h(GlanceAppWidget glanceAppWidget, Context context, qy4 qy4Var, q22<? super Unit> q22Var) {
        return Unit.a;
    }

    public static /* synthetic */ Object l(GlanceAppWidget glanceAppWidget, Context context, int i, String str, Bundle bundle, q22 q22Var, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: triggerAction");
        }
        if ((i2 & 8) != 0) {
            bundle = null;
        }
        return glanceAppWidget.k(context, i, str, bundle, q22Var);
    }

    public static /* synthetic */ Object o(GlanceAppWidget glanceAppWidget, Context context, int i, Bundle bundle, q22 q22Var, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: update");
        }
        if ((i2 & 4) != 0) {
            bundle = null;
        }
        return glanceAppWidget.n(context, i, bundle, q22Var);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0091  */
    /* JADX WARN: Code duplicated, block: B:29:0x009a  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ab, code lost:
    
        if (r2.c(r9, r10, r8, r0) == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cf, code lost:
    
        if (r2.c(r9, r10, r8, r0) == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00eb, code lost:
    
        if (r2.c(r9, r10, r8, r0) == r1) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.content.Context r8, int r9, com.google.android.q22<? super kotlin.Unit> r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.p008glance.p009appwidget.GlanceAppWidget.a(android.content.Context, int, com.google.android.q22):java.lang.Object");
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public int getErrorUiLayout() {
        return this.errorUiLayout;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public m getSizeMode() {
        return this.sizeMode;
    }

    public ry4<?> e() {
        return this.stateDefinition;
    }

    public void f(Context context, qy4 glanceId, int appWidgetId, Throwable throwable) throws Throwable {
        if (getErrorUiLayout() == 0) {
            throw throwable;
        }
        AppWidgetManager.getInstance(context).updateAppWidget(appWidgetId, new RemoteViews(context.getPackageName(), getErrorUiLayout()));
    }

    public Object g(Context context, qy4 qy4Var, q22<? super Unit> q22Var) {
        return h(this, context, qy4Var, q22Var);
    }

    public abstract Object i(Context context, qy4 qy4Var, q22<? super Unit> q22Var);

    public final Object j(Context context, int i, Bundle bundle, q22<? super Unit> q22Var) {
        if ((getSizeMode() instanceof m.c) || (Build.VERSION.SDK_INT > 31 && (getSizeMode() instanceof m.b))) {
            return Unit.a;
        }
        Object objC = c(this.sessionManager, context, new AppWidgetId(i), bundle, new GlanceAppWidget$resize$2(bundle, null), q22Var);
        return objC == a.g() ? objC : Unit.a;
    }

    public final Object k(Context context, int i, String str, Bundle bundle, q22<? super Unit> q22Var) {
        Object objC = c(this.sessionManager, context, new AppWidgetId(i), bundle, new GlanceAppWidget$triggerAction$2(str, null), q22Var);
        return objC == a.g() ? objC : Unit.a;
    }

    public final Object m(Context context, qy4 qy4Var, q22<? super Unit> q22Var) {
        if (!(qy4Var instanceof AppWidgetId) || !AppWidgetUtilsKt.l((AppWidgetId) qy4Var)) {
            throw new IllegalArgumentException("Invalid Glance ID");
        }
        Object objO = o(this, context, ((AppWidgetId) qy4Var).getAppWidgetId(), null, q22Var, 4, null);
        return objO == a.g() ? objO : Unit.a;
    }

    public final Object n(Context context, int i, Bundle bundle, q22<? super Unit> q22Var) {
        acd.a.a();
        Object objB = this.sessionManager.b(new GlanceAppWidget$update$4(context, new AppWidgetId(i), this, bundle, null), q22Var);
        return objB == a.g() ? objB : Unit.a;
    }

    public GlanceAppWidget(int i) {
        this.errorUiLayout = i;
        this.sessionManager = fjb.a();
        this.sizeMode = m.c.a;
        this.stateDefinition = PreferencesGlanceStateDefinition.a;
    }

    public /* synthetic */ GlanceAppWidget(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? jz9.l3 : i);
    }
}
