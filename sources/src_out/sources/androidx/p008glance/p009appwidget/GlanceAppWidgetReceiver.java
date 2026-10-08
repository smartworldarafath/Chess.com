package androidx.p008glance.p009appwidget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.fc3;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.rw0;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\"\u001a\u00020\u001c8WX\u0097\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b!\u0010\u0003\u001a\u0004\b\u001f\u0010 R\u0014\u0010&\u001a\u00020#8&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Landroidx/glance/appwidget/GlanceAppWidgetReceiver;", "Landroid/appwidget/AppWidgetProvider;", "<init>", "()V", "Lcom/google/android/ta2;", "Landroid/content/Context;", "context", "", "d", "(Lcom/google/android/ta2;Landroid/content/Context;)V", "Landroid/appwidget/AppWidgetManager;", "appWidgetManager", "", "appWidgetIds", "onUpdate", "(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;[I)V", "", "appWidgetId", "Landroid/os/Bundle;", "newOptions", "onAppWidgetOptionsChanged", "(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;ILandroid/os/Bundle;)V", "onDeleted", "(Landroid/content/Context;[I)V", "Landroid/content/Intent;", "intent", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Lkotlin/coroutines/CoroutineContext;", "a", "Lkotlin/coroutines/CoroutineContext;", "b", "()Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext$annotations", "coroutineContext", "Landroidx/glance/appwidget/GlanceAppWidget;", "c", "()Landroidx/glance/appwidget/GlanceAppWidget;", "glanceAppWidget", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class GlanceAppWidgetReceiver extends AppWidgetProvider {
    public static final int c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final CoroutineContext coroutineContext = fc3.a();

    /* JADX INFO: renamed from: androidx.glance.appwidget.GlanceAppWidgetReceiver$onAppWidgetOptionsChanged$1, reason: from Kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {1, 8, 0})
    @lq2(c = "androidx.glance.appwidget.GlanceAppWidgetReceiver$onAppWidgetOptionsChanged$1", f = "GlanceAppWidgetReceiver.kt", l = {121}, m = "invokeSuspend")
    static final class ta2 extends SuspendLambda implements Function2<com.google.android.ta2, q22<? super Unit>, Object> {
        final /* synthetic */ int $appWidgetId;
        final /* synthetic */ Context $context;
        final /* synthetic */ Bundle $newOptions;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ta2(Context context, int i, Bundle bundle, q22<? super ta2> q22Var) {
            super(2, q22Var);
            this.$context = context;
            this.$appWidgetId = i;
            this.$newOptions = bundle;
        }

        public final q22<Unit> create(Object obj, q22<?> q22Var) {
            ta2 ta2Var = GlanceAppWidgetReceiver.this.new ta2(this.$context, this.$appWidgetId, this.$newOptions, q22Var);
            ta2Var.L$0 = obj;
            return ta2Var;
        }

        public final Object invoke(com.google.android.ta2 ta2Var, q22<? super Unit> q22Var) {
            return create(ta2Var, q22Var).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object objG = a.g();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                GlanceAppWidgetReceiver.this.d((com.google.android.ta2) this.L$0, this.$context);
                GlanceAppWidget glanceAppWidgetC = GlanceAppWidgetReceiver.this.c();
                Context context = this.$context;
                int i2 = this.$appWidgetId;
                Bundle bundle = this.$newOptions;
                this.label = 1;
                if (glanceAppWidgetC.j(context, i2, bundle, this) == objG) {
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

    /* JADX INFO: renamed from: androidx.glance.appwidget.GlanceAppWidgetReceiver$onDeleted$1, reason: from Kotlin metadata and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {1, 8, 0})
    @lq2(c = "androidx.glance.appwidget.GlanceAppWidgetReceiver$onDeleted$1", f = "GlanceAppWidgetReceiver.kt", l = {129}, m = "invokeSuspend")
    static final class C02251 extends SuspendLambda implements Function2<com.google.android.ta2, q22<? super Unit>, Object> {
        final /* synthetic */ int[] $appWidgetIds;
        final /* synthetic */ Context $context;
        int I$0;
        int I$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02251(Context context, int[] iArr, q22<? super C02251> q22Var) {
            super(2, q22Var);
            this.$context = context;
            this.$appWidgetIds = iArr;
        }

        public final q22<Unit> create(Object obj, q22<?> q22Var) {
            C02251 c02251 = GlanceAppWidgetReceiver.this.new C02251(this.$context, this.$appWidgetIds, q22Var);
            c02251.L$0 = obj;
            return c02251;
        }

        public final Object invoke(com.google.android.ta2 ta2Var, q22<? super Unit> q22Var) {
            return create(ta2Var, q22Var).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0045  */
        /* JADX WARN: Code duplicated, block: B:12:0x005d A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x005b -> B:13:0x005e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.g()
                int r1 = r8.label
                r2 = 1
                if (r1 == 0) goto L27
                if (r1 != r2) goto L1f
                int r1 = r8.I$1
                int r3 = r8.I$0
                java.lang.Object r4 = r8.L$2
                android.content.Context r4 = (android.content.Context) r4
                java.lang.Object r5 = r8.L$1
                androidx.glance.appwidget.GlanceAppWidgetReceiver r5 = (androidx.p008glance.p009appwidget.GlanceAppWidgetReceiver) r5
                java.lang.Object r6 = r8.L$0
                int[] r6 = (int[]) r6
                kotlin.f.b(r9)
                goto L5e
            L1f:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L27:
                kotlin.f.b(r9)
                java.lang.Object r9 = r8.L$0
                com.google.android.ta2 r9 = (com.google.android.ta2) r9
                androidx.glance.appwidget.GlanceAppWidgetReceiver r1 = androidx.p008glance.p009appwidget.GlanceAppWidgetReceiver.this
                android.content.Context r3 = r8.$context
                androidx.p008glance.p009appwidget.GlanceAppWidgetReceiver.a(r1, r9, r3)
                int[] r9 = r8.$appWidgetIds
                androidx.glance.appwidget.GlanceAppWidgetReceiver r1 = androidx.p008glance.p009appwidget.GlanceAppWidgetReceiver.this
                android.content.Context r3 = r8.$context
                int r4 = r9.length
                r5 = 0
                r6 = r5
                r5 = r1
                r1 = r4
                r4 = r3
                r3 = r6
                r6 = r9
            L43:
                if (r3 >= r1) goto L60
                r9 = r6[r3]
                androidx.glance.appwidget.GlanceAppWidget r7 = r5.c()
                r8.L$0 = r6
                r8.L$1 = r5
                r8.L$2 = r4
                r8.I$0 = r3
                r8.I$1 = r1
                r8.label = r2
                java.lang.Object r9 = r7.a(r4, r9, r8)
                if (r9 != r0) goto L5e
                return r0
            L5e:
                int r3 = r3 + r2
                goto L43
            L60:
                kotlin.Unit r9 = kotlin.Unit.a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.p008glance.p009appwidget.GlanceAppWidgetReceiver.C02251.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: androidx.glance.appwidget.GlanceAppWidgetReceiver$onUpdate$1, reason: from Kotlin metadata and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {1, 8, 0})
    @lq2(c = "androidx.glance.appwidget.GlanceAppWidgetReceiver$onUpdate$1", f = "GlanceAppWidgetReceiver.kt", l = {108}, m = "invokeSuspend")
    static final class C02271 extends SuspendLambda implements Function2<com.google.android.ta2, q22<? super Unit>, Object> {
        final /* synthetic */ int[] $appWidgetIds;
        final /* synthetic */ Context $context;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02271(Context context, int[] iArr, q22<? super C02271> q22Var) {
            super(2, q22Var);
            this.$context = context;
            this.$appWidgetIds = iArr;
        }

        public final q22<Unit> create(Object obj, q22<?> q22Var) {
            C02271 c02271 = GlanceAppWidgetReceiver.this.new C02271(this.$context, this.$appWidgetIds, q22Var);
            c02271.L$0 = obj;
            return c02271;
        }

        public final Object invoke(com.google.android.ta2 ta2Var, q22<? super Unit> q22Var) {
            return create(ta2Var, q22Var).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object objG = a.g();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                com.google.android.ta2 ta2Var = (com.google.android.ta2) this.L$0;
                GlanceAppWidgetReceiver.this.d(ta2Var, this.$context);
                int[] iArr = this.$appWidgetIds;
                GlanceAppWidgetReceiver glanceAppWidgetReceiver = GlanceAppWidgetReceiver.this;
                Context context = this.$context;
                ArrayList arrayList = new ArrayList(iArr.length);
                for (int i2 : iArr) {
                    arrayList.add(rw0.b(ta2Var, (CoroutineContext) null, (CoroutineStart) null, new C0228GlanceAppWidgetReceiver$onUpdate$1$1$1(glanceAppWidgetReceiver, context, i2, null), 3, (Object) null));
                }
                this.label = 1;
                if (AwaitKt.a(arrayList, this) == objG) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(com.google.android.ta2 ta2Var, Context context) {
        rw0.d(ta2Var, (CoroutineContext) null, (CoroutineStart) null, new C0229GlanceAppWidgetReceiver$updateManager$1(context, this, null), 3, (Object) null);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    public abstract GlanceAppWidget c();

    @Override // android.appwidget.AppWidgetProvider
    public void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int appWidgetId, Bundle newOptions) {
        CoroutineBroadcastReceiverKt.a(this, getCoroutineContext(), new ta2(context, appWidgetId, newOptions, null));
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onDeleted(Context context, int[] appWidgetIds) {
        CoroutineBroadcastReceiverKt.a(this, getCoroutineContext(), new C02251(context, appWidgetIds, null));
    }

    /* JADX WARN: Code duplicated, block: B:40:0x008c A[Catch: all -> 0x0049, CancellationException -> 0x00b6, TryCatch #3 {CancellationException -> 0x00b6, all -> 0x0049, blocks: (B:21:0x0042, B:28:0x0052, B:29:0x005a, B:30:0x005b, B:31:0x0063, B:32:0x0064, B:48:0x00af, B:38:0x007a, B:40:0x008c, B:42:0x0097, B:44:0x00a3, B:43:0x009f, B:46:0x00a7, B:47:0x00ae, B:35:0x006f), top: B:55:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0097 A[Catch: all -> 0x0049, CancellationException -> 0x00b6, TryCatch #3 {CancellationException -> 0x00b6, all -> 0x0049, blocks: (B:21:0x0042, B:28:0x0052, B:29:0x005a, B:30:0x005b, B:31:0x0063, B:32:0x0064, B:48:0x00af, B:38:0x007a, B:40:0x008c, B:42:0x0097, B:44:0x00a3, B:43:0x009f, B:46:0x00a7, B:47:0x00ae, B:35:0x006f), top: B:55:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x009f A[Catch: all -> 0x0049, CancellationException -> 0x00b6, TryCatch #3 {CancellationException -> 0x00b6, all -> 0x0049, blocks: (B:21:0x0042, B:28:0x0052, B:29:0x005a, B:30:0x005b, B:31:0x0063, B:32:0x0064, B:48:0x00af, B:38:0x007a, B:40:0x008c, B:42:0x0097, B:44:0x00a3, B:43:0x009f, B:46:0x00a7, B:47:0x00ae, B:35:0x006f), top: B:55:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00a7 A[Catch: all -> 0x0049, CancellationException -> 0x00b6, TryCatch #3 {CancellationException -> 0x00b6, all -> 0x0049, blocks: (B:21:0x0042, B:28:0x0052, B:29:0x005a, B:30:0x005b, B:31:0x0063, B:32:0x0064, B:48:0x00af, B:38:0x007a, B:40:0x008c, B:42:0x0097, B:44:0x00a3, B:43:0x009f, B:46:0x00a7, B:47:0x00ae, B:35:0x006f), top: B:55:0x0006 }] */
    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Context context2;
        AppWidgetManager appWidgetManager;
        String packageName;
        String canonicalName;
        ComponentName componentName;
        int[] appWidgetIds;
        try {
            String action = intent.getAction();
            try {
                if (action == null) {
                    context2 = context;
                } else {
                    int iHashCode = action.hashCode();
                    if (iHashCode == -19011148) {
                        context2 = context;
                        if (!action.equals("android.intent.action.LOCALE_CHANGED")) {
                        }
                        appWidgetManager = AppWidgetManager.getInstance(context2);
                        packageName = context2.getPackageName();
                        canonicalName = getClass().getCanonicalName();
                        if (canonicalName != null) {
                            throw new IllegalStateException("no canonical name");
                        }
                        componentName = new ComponentName(packageName, canonicalName);
                        if (intent.hasExtra("appWidgetIds")) {
                            appWidgetIds = intent.getIntArrayExtra("appWidgetIds");
                            Intrinsics.g(appWidgetIds);
                        } else {
                            appWidgetIds = appWidgetManager.getAppWidgetIds(componentName);
                        }
                        onUpdate(context2, appWidgetManager, appWidgetIds);
                        return;
                    }
                    if (iHashCode == 649033583) {
                        context2 = context;
                        if (!action.equals("androidx.glance.appwidget.action.DEBUG_UPDATE")) {
                        }
                        appWidgetManager = AppWidgetManager.getInstance(context2);
                        packageName = context2.getPackageName();
                        canonicalName = getClass().getCanonicalName();
                        if (canonicalName != null) {
                            throw new IllegalStateException("no canonical name");
                        }
                        componentName = new ComponentName(packageName, canonicalName);
                        if (intent.hasExtra("appWidgetIds")) {
                            appWidgetIds = intent.getIntArrayExtra("appWidgetIds");
                            Intrinsics.g(appWidgetIds);
                        } else {
                            appWidgetIds = appWidgetManager.getAppWidgetIds(componentName);
                        }
                        onUpdate(context2, appWidgetManager, appWidgetIds);
                        return;
                    }
                    if (iHashCode == 1989767543 && action.equals("ACTION_TRIGGER_LAMBDA")) {
                        String stringExtra = intent.getStringExtra("EXTRA_ACTION_KEY");
                        if (stringExtra == null) {
                            throw new IllegalStateException("Intent is missing ActionKey extra");
                        }
                        int intExtra = intent.getIntExtra("EXTRA_APPWIDGET_ID", -1);
                        if (intExtra == -1) {
                            throw new IllegalStateException("Intent is missing AppWidgetId extra");
                        }
                        CoroutineBroadcastReceiverKt.a(this, getCoroutineContext(), new C0226GlanceAppWidgetReceiver$onReceive$1$1(this, context, intExtra, stringExtra, null));
                        return;
                    }
                    context2 = context;
                }
                super.onReceive(context2, intent);
            } catch (CancellationException unused) {
            } catch (Throwable th) {
                th = th;
                AppWidgetUtilsKt.m(th);
            }
        } catch (CancellationException unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        CoroutineBroadcastReceiverKt.a(this, getCoroutineContext(), new C02271(context, appWidgetIds, null));
    }
}
