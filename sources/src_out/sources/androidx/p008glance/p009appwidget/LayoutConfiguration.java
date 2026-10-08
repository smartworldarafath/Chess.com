package androidx.p008glance.p009appwidget;

import android.content.Context;
import androidx.datastore.p007core.CorruptionException;
import androidx.p008glance.state.GlanceState;
import com.google.android.q22;
import com.google.android.qjd;
import com.google.android.ut0;
import com.google.inputmethod.jo6;
import com.google.inputmethod.ko6;
import com.google.inputmethod.lo6;
import com.google.inputmethod.rp3;
import com.google.inputmethod.t04;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.b0;
import kotlin.collections.m;
import kotlin.coroutines.intrinsics.a;
import kotlin.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fBU\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H\u0086@¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\b\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001aR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001aR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001c¨\u0006 "}, d2 = {"Landroidx/glance/appwidget/LayoutConfiguration;", "", "Landroid/content/Context;", "context", "", "Lcom/google/android/lo6;", "", "layoutConfig", "nextIndex", "appWidgetId", "", "usedLayoutIds", "existingLayoutIds", "<init>", "(Landroid/content/Context;Ljava/util/Map;IILjava/util/Set;Ljava/util/Set;)V", "Lcom/google/android/rp3;", "layoutRoot", "c", "(Lcom/google/android/rp3;)I", "", "d", "(Lcom/google/android/q22;)Ljava/lang/Object;", "a", "Landroid/content/Context;", "b", "Ljava/util/Map;", "I", "e", "Ljava/util/Set;", "f", "g", "Companion", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LayoutConfiguration {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int h = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Map<lo6, Integer> layoutConfig;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int nextIndex;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int appWidgetId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Set<Integer> usedLayoutIds;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Set<Integer> existingLayoutIds;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0080@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/glance/appwidget/LayoutConfiguration$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "appWidgetId", "Landroidx/glance/appwidget/LayoutConfiguration;", "a", "(Landroid/content/Context;ILcom/google/android/q22;)Ljava/lang/Object;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public final Object a(Context context, int i, q22<? super LayoutConfiguration> q22Var) {
            LayoutConfiguration$Companion$load$1 layoutConfiguration$Companion$load$1;
            jo6 jo6VarS;
            if (q22Var instanceof LayoutConfiguration$Companion$load$1) {
                layoutConfiguration$Companion$load$1 = (LayoutConfiguration$Companion$load$1) q22Var;
                int i2 = layoutConfiguration$Companion$load$1.label;
                if ((i2 & t04.INVALID_ID) != 0) {
                    layoutConfiguration$Companion$load$1.label = i2 - t04.INVALID_ID;
                } else {
                    layoutConfiguration$Companion$load$1 = new LayoutConfiguration$Companion$load$1(this, q22Var);
                }
            } else {
                layoutConfiguration$Companion$load$1 = new LayoutConfiguration$Companion$load$1(this, q22Var);
            }
            Object objA = layoutConfiguration$Companion$load$1.result;
            Object objG = a.g();
            int i3 = layoutConfiguration$Companion$load$1.label;
            try {
                if (i3 == 0) {
                    f.b(objA);
                    GlanceState glanceState = GlanceState.a;
                    LayoutStateDefinition layoutStateDefinition = LayoutStateDefinition.a;
                    String strF = WidgetLayoutKt.f(i);
                    layoutConfiguration$Companion$load$1.L$0 = context;
                    layoutConfiguration$Companion$load$1.I$0 = i;
                    layoutConfiguration$Companion$load$1.label = 1;
                    objA = glanceState.a(context, layoutStateDefinition, strF, layoutConfiguration$Companion$load$1);
                    if (objA == objG) {
                        return objG;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = layoutConfiguration$Companion$load$1.I$0;
                    context = (Context) layoutConfiguration$Companion$load$1.L$0;
                    f.b(objA);
                }
                jo6VarS = (jo6) objA;
            } catch (CorruptionException unused) {
                jo6VarS = jo6.S();
            } catch (IOException unused2) {
                jo6VarS = jo6.S();
            }
            Context context2 = context;
            int i4 = i;
            List<ko6> listT = jo6VarS.T();
            LinkedHashMap linkedHashMap = new LinkedHashMap(g.e(b0.e(m.A(listT, 10)), 16));
            for (ko6 ko6Var : listT) {
                Pair pairA = qjd.a(ko6Var.O(), ut0.e(ko6Var.P()));
                linkedHashMap.put(pairA.c(), pairA.d());
            }
            Map mapC = b0.C(linkedHashMap);
            return new LayoutConfiguration(context2, mapC, jo6VarS.U(), i4, null, m.C1(mapC.values()), 16, null);
        }

        private Companion() {
        }
    }

    private LayoutConfiguration(Context context, Map<lo6, Integer> map, int i, int i2, Set<Integer> set, Set<Integer> set2) {
        this.context = context;
        this.layoutConfig = map;
        this.nextIndex = i;
        this.appWidgetId = i2;
        this.usedLayoutIds = set;
        this.existingLayoutIds = set2;
    }

    public final int c(rp3 layoutRoot) {
        lo6 lo6VarB = WidgetLayoutKt.b(this.context, layoutRoot);
        synchronized (this) {
            Integer num = this.layoutConfig.get(lo6VarB);
            if (num != null) {
                int iIntValue = num.intValue();
                this.usedLayoutIds.add(Integer.valueOf(iIntValue));
                return iIntValue;
            }
            int iB = this.nextIndex;
            while (this.existingLayoutIds.contains(Integer.valueOf(iB))) {
                iB = (iB + 1) % LayoutSelectionKt.b();
                if (iB == this.nextIndex) {
                    throw new IllegalArgumentException("Cannot assign a valid layout index to the new layout: no free index left.");
                }
            }
            this.nextIndex = (iB + 1) % LayoutSelectionKt.b();
            this.usedLayoutIds.add(Integer.valueOf(iB));
            this.existingLayoutIds.add(Integer.valueOf(iB));
            this.layoutConfig.put(lo6VarB, Integer.valueOf(iB));
            return iB;
        }
    }

    public final Object d(q22<? super Unit> q22Var) {
        Object objE = GlanceState.a.e(this.context, LayoutStateDefinition.a, WidgetLayoutKt.f(this.appWidgetId), new LayoutConfiguration$save$2(this, null), q22Var);
        return objE == a.g() ? objE : Unit.a;
    }

    /* synthetic */ LayoutConfiguration(Context context, Map map, int i, int i2, Set set, Set set2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, map, i, i2, (i3 & 16) != 0 ? new LinkedHashSet() : set, (i3 & 32) != 0 ? new LinkedHashSet() : set2);
    }
}
