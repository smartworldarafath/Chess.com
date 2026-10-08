package androidx.p008glance.p009appwidget;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import androidx.compose.p004runtime.snapshots.b;
import androidx.compose.p004runtime.snapshots.g;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ut0;
import com.google.inputmethod.io9;
import com.google.inputmethod.jf3;
import com.google.inputmethod.o58;
import com.google.inputmethod.ry4;
import com.google.inputmethod.su1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/google/android/io9;", "", "", "<anonymous>", "(Lcom/google/android/io9;)V"}, k = 3, mv = {1, 8, 0})
@lq2(c = "androidx.glance.appwidget.AppWidgetSession$provideGlance$1$1$configIsReady$2$1", f = "AppWidgetSession.kt", l = {123}, m = "invokeSuspend")
final class AppWidgetSession$provideGlance$1$1$configIsReady$2$1 extends SuspendLambda implements Function2<io9<Boolean>, q22<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ o58<jf3> $minSize$delegate;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AppWidgetSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppWidgetSession$provideGlance$1$1$configIsReady$2$1(AppWidgetSession appWidgetSession, Context context, o58<jf3> o58Var, q22<? super AppWidgetSession$provideGlance$1$1$configIsReady$2$1> q22Var) {
        super(2, q22Var);
        this.this$0 = appWidgetSession;
        this.$context = context;
        this.$minSize$delegate = o58Var;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        AppWidgetSession$provideGlance$1$1$configIsReady$2$1 appWidgetSession$provideGlance$1$1$configIsReady$2$1 = new AppWidgetSession$provideGlance$1$1$configIsReady$2$1(this.this$0, this.$context, this.$minSize$delegate, q22Var);
        appWidgetSession$provideGlance$1$1$configIsReady$2$1.L$0 = obj;
        return appWidgetSession$provideGlance$1$1$configIsReady$2$1;
    }

    public final Object invoke(io9<Boolean> io9Var, q22<? super Unit> q22Var) {
        return create(io9Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        io9 io9Var;
        ry4<?> ry4VarE;
        Object objG = a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            io9 io9Var2 = (io9) this.L$0;
            if (this.this$0.v() != null || (ry4VarE = this.this$0.widget.e()) == null) {
                io9Var = io9Var2;
                obj = null;
            } else {
                AppWidgetSession appWidgetSession = this.this$0;
                Context context = this.$context;
                su1 su1Var = appWidgetSession.configManager;
                String key = appWidgetSession.getKey();
                this.L$0 = io9Var2;
                this.label = 1;
                Object objA = su1Var.a(context, ry4VarE, key, this);
                if (objA == objG) {
                    return objG;
                }
                io9Var = io9Var2;
                obj = objA;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            io9Var = (io9) this.L$0;
            f.b(obj);
        }
        g.Companion companion = g.INSTANCE;
        AppWidgetSession appWidgetSession2 = this.this$0;
        Context context2 = this.$context;
        o58<jf3> o58Var = this.$minSize$delegate;
        b bVarO = g.Companion.o(companion, null, null, 3, null);
        try {
            g gVarL = bVarO.l();
            try {
                if (AppWidgetUtilsKt.l(appWidgetSession2.id)) {
                    AppWidgetManager appWidgetManagerJ = AppWidgetUtilsKt.j(context2);
                    AppWidgetSession$provideGlance$1.AnonymousClass1.c(o58Var, AppWidgetUtilsKt.a(context2.getResources().getDisplayMetrics(), appWidgetManagerJ, appWidgetSession2.id.getAppWidgetId()));
                    if (appWidgetSession2.w() == null) {
                        appWidgetSession2.A(appWidgetManagerJ.getAppWidgetOptions(appWidgetSession2.id.getAppWidgetId()));
                    }
                }
                if (obj != null) {
                    appWidgetSession2.z(obj);
                }
                io9Var.setValue(ut0.a(true));
                Unit unit = Unit.a;
                bVarO.s(gVarL);
                bVarO.C().a();
                bVarO.d();
                return Unit.a;
            } catch (Throwable th) {
                bVarO.s(gVarL);
                throw th;
            }
        } catch (Throwable th2) {
            bVarO.d();
            throw th2;
        }
    }
}
