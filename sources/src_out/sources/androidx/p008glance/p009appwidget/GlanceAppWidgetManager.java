package androidx.p008glance.p009appwidget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.content.Context;
import com.google.android.ai4;
import com.google.android.oda;
import com.google.android.ph6;
import com.google.android.q22;
import com.google.android.qjd;
import com.google.android.v8a;
import com.google.inputmethod.AppWidgetId;
import com.google.inputmethod.mk9;
import com.google.inputmethod.py4;
import com.google.inputmethod.qy4;
import com.google.inputmethod.t04;
import com.google.inputmethod.uk9;
import com.google.inputmethod.xk9;
import com.google.inputmethod.ym2;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.c;
import kotlin.collections.b0;
import kotlin.collections.m;
import kotlin.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference2Impl;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0002!%B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\u0010\u0010\u000fJ4\u0010\u0018\u001a\u00020\u0017\"\b\b\u0000\u0010\u0012*\u00020\u0011\"\b\b\u0001\u0010\u0014*\u00020\u00132\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u0001H\u0080@¢\u0006\u0004\b\u0018\u0010\u0019J.\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c\"\b\b\u0000\u0010\u001a*\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0086@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0017H\u0080@¢\u0006\u0004\b \u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001c\u0010'\u001a\n $*\u0004\u0018\u00010#0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R!\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\t¨\u0006-"}, d2 = {"Landroidx/glance/appwidget/GlanceAppWidgetManager;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/google/android/ym2;", "Lcom/google/android/uk9;", "k", "()Lcom/google/android/ym2;", "prefs", "Landroidx/glance/appwidget/GlanceAppWidgetManager$b;", "h", "(Lcom/google/android/uk9;)Landroidx/glance/appwidget/GlanceAppWidgetManager$b;", "l", "(Lcom/google/android/q22;)Ljava/lang/Object;", "f", "Landroidx/glance/appwidget/GlanceAppWidgetReceiver;", "R", "Landroidx/glance/appwidget/GlanceAppWidget;", "P", "receiver", "provider", "", "m", "(Landroidx/glance/appwidget/GlanceAppWidgetReceiver;Landroidx/glance/appwidget/GlanceAppWidget;Lcom/google/android/q22;)Ljava/lang/Object;", "T", "Ljava/lang/Class;", "", "Lcom/google/android/qy4;", "j", "(Ljava/lang/Class;Lcom/google/android/q22;)Ljava/lang/Object;", "g", "a", "Landroid/content/Context;", "Landroid/appwidget/AppWidgetManager;", "kotlin.jvm.PlatformType", "b", "Landroid/appwidget/AppWidgetManager;", "appWidgetManager", "c", "Lkotlin/Lazy;", "i", "dataStore", "d", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GlanceAppWidgetManager {
    private static ym2<uk9> g;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AppWidgetManager appWidgetManager;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Lazy dataStore = c.b(new Function0<ym2<uk9>>() { // from class: androidx.glance.appwidget.GlanceAppWidgetManager$dataStore$2
        {
            super(0);
        }

        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ym2<uk9> invoke() {
            return this.this$0.k();
        }
    });
    private static final a d = new a(null);
    public static final int e = 8;
    private static final v8a<Context, ym2<uk9>> f = mk9.c("GlanceAppWidgetManager", null, null, null, 14, null);
    private static final uk9.a<Set<String>> h = xk9.h("list::Providers");

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\u00020\u0004*\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\u0004*\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u0004\u0018\u00010\t*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R%\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013*\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001c0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Landroidx/glance/appwidget/GlanceAppWidgetManager$a;", "", "<init>", "()V", "", "provider", "Lcom/google/android/uk9$a;", "j", "(Ljava/lang/String;)Lcom/google/android/uk9$a;", "Landroidx/glance/appwidget/GlanceAppWidgetReceiver;", "g", "(Landroidx/glance/appwidget/GlanceAppWidgetReceiver;)Ljava/lang/String;", "Landroidx/glance/appwidget/GlanceAppWidget;", "f", "(Landroidx/glance/appwidget/GlanceAppWidget;)Ljava/lang/String;", "Landroid/appwidget/AppWidgetProviderInfo;", "i", "(Landroid/appwidget/AppWidgetProviderInfo;)Landroidx/glance/appwidget/GlanceAppWidgetReceiver;", "Landroid/content/Context;", "Lcom/google/android/ym2;", "Lcom/google/android/uk9;", "appManagerDataStore$delegate", "Lcom/google/android/v8a;", "h", "(Landroid/content/Context;)Lcom/google/android/ym2;", "appManagerDataStore", "dataStoreSingleton", "Lcom/google/android/ym2;", "", "providersKey", "Lcom/google/android/uk9$a;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class a {
        static final /* synthetic */ ph6<Object>[] a = {oda.l(new PropertyReference2Impl(a.class, "appManagerDataStore", "getAppManagerDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String f(GlanceAppWidget glanceAppWidget) {
            String canonicalName = glanceAppWidget.getClass().getCanonicalName();
            if (canonicalName != null) {
                return canonicalName;
            }
            throw new IllegalArgumentException("no provider name");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String g(GlanceAppWidgetReceiver glanceAppWidgetReceiver) {
            String canonicalName = glanceAppWidgetReceiver.getClass().getCanonicalName();
            if (canonicalName != null) {
                return canonicalName;
            }
            throw new IllegalArgumentException("no receiver name");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ym2<uk9> h(Context context) {
            return (ym2) GlanceAppWidgetManager.f.getValue(context, a[0]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final GlanceAppWidgetReceiver i(AppWidgetProviderInfo appWidgetProviderInfo) throws IllegalAccessException, InstantiationException, InvocationTargetException {
            Object objNewInstance = Class.forName(appWidgetProviderInfo.provider.getClassName()).getDeclaredConstructor(null).newInstance(null);
            if (objNewInstance instanceof GlanceAppWidgetReceiver) {
                return (GlanceAppWidgetReceiver) objNewInstance;
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final uk9.a<String> j(String provider) {
            return xk9.g("provider:" + provider);
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: androidx.glance.appwidget.GlanceAppWidgetManager$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B9\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00060\u0002¢\u0006\u0004\b\b\u0010\tB\u001d\b\u0016\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\b\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R)\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00060\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017¨\u0006\u0019"}, d2 = {"Landroidx/glance/appwidget/GlanceAppWidgetManager$b;", "", "", "Landroid/content/ComponentName;", "", "receiverToProviderName", "", "providerNameToReceivers", "<init>", "(Ljava/util/Map;Ljava/util/Map;)V", "(Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Map;", "getReceiverToProviderName", "()Ljava/util/Map;", "b", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final /* data */ class State {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        private final Map<ComponentName, String> receiverToProviderName;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        private final Map<String, List<ComponentName>> providerNameToReceivers;

        /* JADX WARN: Illegal instructions before constructor call */
        public State() {
            Map map = null;
            this(map, map, 3, map);
        }

        public final Map<String, List<ComponentName>> a() {
            return this.providerNameToReceivers;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            return Intrinsics.e(this.receiverToProviderName, state.receiverToProviderName) && Intrinsics.e(this.providerNameToReceivers, state.providerNameToReceivers);
        }

        public int hashCode() {
            return (this.receiverToProviderName.hashCode() * 31) + this.providerNameToReceivers.hashCode();
        }

        public String toString() {
            return "State(receiverToProviderName=" + this.receiverToProviderName + ", providerNameToReceivers=" + this.providerNameToReceivers + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public State(Map<ComponentName, String> map, Map<String, ? extends List<ComponentName>> map2) {
            this.receiverToProviderName = map;
            this.providerNameToReceivers = map2;
        }

        public /* synthetic */ State(Map map, Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? b0.j() : map, (i & 2) != 0 ? b0.j() : map2);
        }

        public State(Map<ComponentName, String> map) {
            this(map, py4.b(map));
        }
    }

    public GlanceAppWidgetManager(Context context) {
        this.context = context;
        this.appWidgetManager = AppWidgetManager.getInstance(context);
    }

    private final Object f(q22<? super uk9> q22Var) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        List<AppWidgetProviderInfo> installedProviders = this.appWidgetManager.getInstalledProviders();
        ArrayList arrayList = new ArrayList();
        for (Object obj : installedProviders) {
            if (Intrinsics.e(((AppWidgetProviderInfo) obj).provider.getPackageName(), this.context.getPackageName())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            GlanceAppWidgetReceiver glanceAppWidgetReceiverI = d.i((AppWidgetProviderInfo) it.next());
            if (glanceAppWidgetReceiverI != null) {
                arrayList2.add(glanceAppWidgetReceiverI);
            }
        }
        return i().a(new GlanceAppWidgetManager$addAllReceiversAndProvidersToPreferences$2(arrayList2, null), q22Var);
    }

    private final State h(uk9 prefs) {
        String packageName = this.context.getPackageName();
        Set<String> set = (Set) prefs.c(h);
        Map map = null;
        if (set == null) {
            return new State(map, map, 3, map);
        }
        ArrayList arrayList = new ArrayList();
        for (String str : set) {
            ComponentName componentName = new ComponentName(packageName, str);
            String str2 = (String) prefs.c(d.j(str));
            Pair pairA = str2 == null ? null : qjd.a(componentName, str2);
            if (pairA != null) {
                arrayList.add(pairA);
            }
        }
        return new State(b0.x(arrayList));
    }

    private final ym2<uk9> i() {
        return (ym2) this.dataStore.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ym2<uk9> k() {
        ym2<uk9> ym2VarH;
        a aVar = d;
        synchronized (aVar) {
            ym2VarH = g;
            if (ym2VarH == null) {
                ym2VarH = aVar.h(this.context);
                g = ym2VarH;
            }
        }
        return ym2VarH;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(q22<? super State> q22Var) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        GlanceAppWidgetManager$getState$1 glanceAppWidgetManager$getState$1;
        GlanceAppWidgetManager glanceAppWidgetManager;
        GlanceAppWidgetManager glanceAppWidgetManager2;
        uk9 uk9Var;
        GlanceAppWidgetManager glanceAppWidgetManager3;
        if (q22Var instanceof GlanceAppWidgetManager$getState$1) {
            glanceAppWidgetManager$getState$1 = (GlanceAppWidgetManager$getState$1) q22Var;
            int i = glanceAppWidgetManager$getState$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                glanceAppWidgetManager$getState$1.label = i - t04.INVALID_ID;
            } else {
                glanceAppWidgetManager$getState$1 = new GlanceAppWidgetManager$getState$1(this, q22Var);
            }
        } else {
            glanceAppWidgetManager$getState$1 = new GlanceAppWidgetManager$getState$1(this, q22Var);
        }
        Object objF = glanceAppWidgetManager$getState$1.result;
        Object objG = kotlin.coroutines.intrinsics.a.g();
        int i2 = glanceAppWidgetManager$getState$1.label;
        if (i2 == 0) {
            f.b(objF);
            ai4<uk9> data = i().getData();
            glanceAppWidgetManager$getState$1.L$0 = this;
            glanceAppWidgetManager$getState$1.L$1 = this;
            glanceAppWidgetManager$getState$1.label = 1;
            objF = d.F(data, glanceAppWidgetManager$getState$1);
            if (objF != objG) {
                glanceAppWidgetManager = this;
                glanceAppWidgetManager2 = glanceAppWidgetManager;
            }
            return objG;
        }
        if (i2 == 1) {
            glanceAppWidgetManager = (GlanceAppWidgetManager) glanceAppWidgetManager$getState$1.L$1;
            glanceAppWidgetManager2 = (GlanceAppWidgetManager) glanceAppWidgetManager$getState$1.L$0;
            f.b(objF);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            glanceAppWidgetManager3 = (GlanceAppWidgetManager) glanceAppWidgetManager$getState$1.L$0;
            f.b(objF);
        }
        uk9Var = (uk9) objF;
        glanceAppWidgetManager = glanceAppWidgetManager3;
        return glanceAppWidgetManager.h(uk9Var);
        if (((uk9) objF).c(h) == null) {
            objF = null;
        }
        uk9Var = (uk9) objF;
        if (uk9Var == null) {
            glanceAppWidgetManager$getState$1.L$0 = glanceAppWidgetManager;
            glanceAppWidgetManager$getState$1.L$1 = null;
            glanceAppWidgetManager$getState$1.label = 2;
            objF = glanceAppWidgetManager2.f(glanceAppWidgetManager$getState$1);
            if (objF != objG) {
                glanceAppWidgetManager3 = glanceAppWidgetManager;
                uk9Var = (uk9) objF;
                glanceAppWidgetManager = glanceAppWidgetManager3;
            }
            return objG;
        }
        return glanceAppWidgetManager.h(uk9Var);
    }

    public final Object g(q22<? super Unit> q22Var) {
        String packageName = this.context.getPackageName();
        List<AppWidgetProviderInfo> installedProviders = this.appWidgetManager.getInstalledProviders();
        ArrayList arrayList = new ArrayList();
        for (Object obj : installedProviders) {
            if (Intrinsics.e(((AppWidgetProviderInfo) obj).provider.getPackageName(), packageName)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(m.A(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((AppWidgetProviderInfo) it.next()).provider.getClassName());
        }
        Object objA = i().a(new GlanceAppWidgetManager$cleanReceivers$2(m.D1(arrayList2), null), q22Var);
        return objA == kotlin.coroutines.intrinsics.a.g() ? objA : Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final <T extends GlanceAppWidget> Object j(Class<T> cls, q22<? super List<? extends qy4>> q22Var) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        GlanceAppWidgetManager$getGlanceIds$1 glanceAppWidgetManager$getGlanceIds$1;
        GlanceAppWidgetManager glanceAppWidgetManager;
        if (q22Var instanceof GlanceAppWidgetManager$getGlanceIds$1) {
            glanceAppWidgetManager$getGlanceIds$1 = (GlanceAppWidgetManager$getGlanceIds$1) q22Var;
            int i = glanceAppWidgetManager$getGlanceIds$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                glanceAppWidgetManager$getGlanceIds$1.label = i - t04.INVALID_ID;
            } else {
                glanceAppWidgetManager$getGlanceIds$1 = new GlanceAppWidgetManager$getGlanceIds$1(this, q22Var);
            }
        } else {
            glanceAppWidgetManager$getGlanceIds$1 = new GlanceAppWidgetManager$getGlanceIds$1(this, q22Var);
        }
        Object objL = glanceAppWidgetManager$getGlanceIds$1.result;
        Object objG = kotlin.coroutines.intrinsics.a.g();
        int i2 = glanceAppWidgetManager$getGlanceIds$1.label;
        if (i2 == 0) {
            f.b(objL);
            glanceAppWidgetManager$getGlanceIds$1.L$0 = this;
            glanceAppWidgetManager$getGlanceIds$1.L$1 = cls;
            glanceAppWidgetManager$getGlanceIds$1.label = 1;
            objL = l(glanceAppWidgetManager$getGlanceIds$1);
            if (objL == objG) {
                return objG;
            }
            glanceAppWidgetManager = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cls = (Class) glanceAppWidgetManager$getGlanceIds$1.L$1;
            glanceAppWidgetManager = (GlanceAppWidgetManager) glanceAppWidgetManager$getGlanceIds$1.L$0;
            f.b(objL);
        }
        State state = (State) objL;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("no canonical provider name");
        }
        List<ComponentName> list = state.a().get(canonicalName);
        if (list == null) {
            return m.p();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            int[] appWidgetIds = glanceAppWidgetManager.appWidgetManager.getAppWidgetIds((ComponentName) it.next());
            ArrayList arrayList2 = new ArrayList(appWidgetIds.length);
            for (int i3 : appWidgetIds) {
                arrayList2.add(new AppWidgetId(i3));
            }
            m.G(arrayList, arrayList2);
        }
        return arrayList;
    }

    public final <R extends GlanceAppWidgetReceiver, P extends GlanceAppWidget> Object m(R r, P p, q22<? super Unit> q22Var) {
        a aVar = d;
        Object objA = i().a(new GlanceAppWidgetManager$updateReceiver$2(aVar.g(r), aVar.f(p), null), q22Var);
        return objA == kotlin.coroutines.intrinsics.a.g() ? objA : Unit.a;
    }
}
