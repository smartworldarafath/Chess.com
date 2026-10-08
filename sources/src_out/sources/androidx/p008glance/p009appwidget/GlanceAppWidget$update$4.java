package androidx.p008glance.p009appwidget;

import android.content.Context;
import android.os.Bundle;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.inputmethod.AppWidgetId;
import com.google.inputmethod.gjb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/gjb;", "", "<anonymous>", "(Lcom/google/android/gjb;)V"}, k = 3, mv = {1, 8, 0})
@lq2(c = "androidx.glance.appwidget.GlanceAppWidget$update$4", f = "GlanceAppWidget.kt", l = {151, 152, 156}, m = "invokeSuspend")
final class GlanceAppWidget$update$4 extends SuspendLambda implements Function2<gjb, q22<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ AppWidgetId $glanceId;
    final /* synthetic */ Bundle $options;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GlanceAppWidget this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GlanceAppWidget$update$4(Context context, AppWidgetId appWidgetId, GlanceAppWidget glanceAppWidget, Bundle bundle, q22<? super GlanceAppWidget$update$4> q22Var) {
        super(2, q22Var);
        this.$context = context;
        this.$glanceId = appWidgetId;
        this.this$0 = glanceAppWidget;
        this.$options = bundle;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(gjb gjbVar, q22<? super Unit> q22Var) {
        return create(gjbVar, q22Var).invokeSuspend(Unit.a);
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        GlanceAppWidget$update$4 glanceAppWidget$update$4 = new GlanceAppWidget$update$4(this.$context, this.$glanceId, this.this$0, this.$options, q22Var);
        glanceAppWidget$update$4.L$0 = obj;
        return glanceAppWidget$update$4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006f, code lost:
    
        if (r2.c(r3, r7, r18) == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008e, code lost:
    
        if (((androidx.p008glance.p009appwidget.AppWidgetSession) r2).C(r18) == r1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.g()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L2e
            if (r2 == r5) goto L24
            if (r2 == r4) goto L20
            if (r2 != r3) goto L18
            kotlin.f.b(r19)
            goto L91
        L18:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L20:
            kotlin.f.b(r19)
            goto L72
        L24:
            java.lang.Object r2 = r0.L$0
            com.google.android.gjb r2 = (com.google.inputmethod.gjb) r2
            kotlin.f.b(r19)
            r5 = r19
            goto L48
        L2e:
            kotlin.f.b(r19)
            java.lang.Object r2 = r0.L$0
            com.google.android.gjb r2 = (com.google.inputmethod.gjb) r2
            android.content.Context r6 = r0.$context
            com.google.android.my r7 = r0.$glanceId
            java.lang.String r7 = androidx.p008glance.p009appwidget.AppWidgetUtilsKt.q(r7)
            r0.L$0 = r2
            r0.label = r5
            java.lang.Object r5 = r2.b(r6, r7, r0)
            if (r5 != r1) goto L48
            goto L90
        L48:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r6 = 0
            if (r5 != 0) goto L75
            android.content.Context r3 = r0.$context
            androidx.glance.appwidget.AppWidgetSession r7 = new androidx.glance.appwidget.AppWidgetSession
            androidx.glance.appwidget.GlanceAppWidget r8 = r0.this$0
            com.google.android.my r9 = r0.$glanceId
            android.os.Bundle r10 = r0.$options
            r16 = 248(0xf8, float:3.48E-43)
            r17 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r2 = r2.c(r3, r7, r0)
            if (r2 != r1) goto L72
            goto L90
        L72:
            kotlin.Unit r1 = kotlin.Unit.a
            return r1
        L75:
            com.google.android.my r4 = r0.$glanceId
            java.lang.String r4 = androidx.p008glance.p009appwidget.AppWidgetUtilsKt.q(r4)
            androidx.glance.session.Session r2 = r2.d(r4)
            java.lang.String r4 = "null cannot be cast to non-null type androidx.glance.appwidget.AppWidgetSession"
            kotlin.jvm.internal.Intrinsics.h(r2, r4)
            androidx.glance.appwidget.AppWidgetSession r2 = (androidx.p008glance.p009appwidget.AppWidgetSession) r2
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r2 = r2.C(r0)
            if (r2 != r1) goto L91
        L90:
            return r1
        L91:
            kotlin.Unit r1 = kotlin.Unit.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.p008glance.p009appwidget.GlanceAppWidget$update$4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
