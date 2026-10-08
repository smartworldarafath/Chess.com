package androidx.p008glance.p009appwidget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.SizeF;
import androidx.compose.p004runtime.d;
import com.google.android.ai4;
import com.google.android.qjd;
import com.google.android.zk1;
import com.google.inputmethod.AppWidgetId;
import com.google.inputmethod.ff3;
import com.google.inputmethod.gyd;
import com.google.inputmethod.hf3;
import com.google.inputmethod.jf3;
import com.google.inputmethod.qy4;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a)\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f*\u00020\t2\u000e\b\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a)\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\f*\u00020\t2\u000e\b\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0003¢\u0006\u0004\b\u000f\u0010\u000e\u001a\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0006*\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0006*\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0011\u001a\u0019\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\f*\u00020\tH\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001f\u0010\u0017\u001a\u00020\u0016*\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0082\u0004ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0016\u0010\u001a\u001a\u00020\u0019*\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\"\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a*\u0010#\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001c\u001a\u00020\u00062\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060!H\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a\u001f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060\f*\b\u0012\u0004\u0012\u00020\u00060!H\u0001¢\u0006\u0004\b%\u0010&\u001a\u0017\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020'H\u0000¢\u0006\u0004\b*\u0010+\u001a\u0017\u0010-\u001a\u00020,2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b-\u0010.\u001a\u0013\u00100\u001a\u00020,*\u00020/H\u0000¢\u0006\u0004\b0\u00101\u001a1\u00108\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020)\u0018\u00010\n07*\u0002022\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u000205H\u0000¢\u0006\u0004\b8\u00109\"\u0018\u0010\u0003\u001a\u00020\u0002*\u0002038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;\"\u0018\u0010>\u001a\u00020\u0016*\u00020/8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=\"\u0018\u0010@\u001a\u00020\u0016*\u00020/8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b?\u0010=\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006A"}, d2 = {"Landroid/util/DisplayMetrics;", "displayMetrics", "Landroid/appwidget/AppWidgetManager;", "appWidgetManager", "", "appWidgetId", "Lcom/google/android/jf3;", "a", "(Landroid/util/DisplayMetrics;Landroid/appwidget/AppWidgetManager;I)J", "Landroid/os/Bundle;", "Lkotlin/Function0;", "minSize", "", "d", "(Landroid/os/Bundle;Lkotlin/jvm/functions/Function0;)Ljava/util/List;", "c", "e", "(Landroid/os/Bundle;)Lcom/google/android/jf3;", "g", "f", "(Landroid/os/Bundle;)Ljava/util/List;", "other", "", "i", "(JJ)Z", "Landroid/util/SizeF;", "r", "(J)Landroid/util/SizeF;", "widgetSize", "layoutSize", "", "p", "(JJ)F", "", "layoutSizes", "h", "(JLjava/util/Collection;)Lcom/google/android/jf3;", "o", "(Ljava/util/Collection;)Ljava/util/List;", "", "throwable", "", "m", "(Ljava/lang/Throwable;)V", "", "b", "(I)Ljava/lang/String;", "Lcom/google/android/my;", "q", "(Lcom/google/android/my;)Ljava/lang/String;", "Landroidx/glance/appwidget/GlanceAppWidget;", "Landroid/content/Context;", "context", "Lcom/google/android/qy4;", "id", "Lcom/google/android/ai4;", "n", "(Landroidx/glance/appwidget/GlanceAppWidget;Landroid/content/Context;Lcom/google/android/qy4;)Lcom/google/android/ai4;", "j", "(Landroid/content/Context;)Landroid/appwidget/AppWidgetManager;", "k", "(Lcom/google/android/my;)Z", "isFakeId", "l", "isRealId", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AppWidgetUtilsKt {
    public static final long a(DisplayMetrics displayMetrics, AppWidgetManager appWidgetManager, int i) {
        AppWidgetProviderInfo appWidgetInfo = appWidgetManager.getAppWidgetInfo(i);
        if (appWidgetInfo == null) {
            return jf3.INSTANCE.b();
        }
        return hf3.a(gyd.c(Math.min(appWidgetInfo.minWidth, (appWidgetInfo.resizeMode & 1) != 0 ? appWidgetInfo.minResizeWidth : Integer.MAX_VALUE), displayMetrics), gyd.c(Math.min(appWidgetInfo.minHeight, (appWidgetInfo.resizeMode & 2) != 0 ? appWidgetInfo.minResizeHeight : Integer.MAX_VALUE), displayMetrics));
    }

    public static final String b(int i) {
        return "appWidget-" + i;
    }

    private static final List<jf3> c(Bundle bundle, Function0<jf3> function0) {
        int i = bundle.getInt("appWidgetMinHeight", 0);
        int i2 = bundle.getInt("appWidgetMaxHeight", 0);
        int i3 = bundle.getInt("appWidgetMinWidth", 0);
        int i4 = bundle.getInt("appWidgetMaxWidth", 0);
        return (i == 0 || i2 == 0 || i3 == 0 || i4 == 0) ? m.e(function0.invoke()) : m.s(new jf3[]{jf3.c(hf3.a(ff3.i(i3), ff3.i(i2))), jf3.c(hf3.a(ff3.i(i4), ff3.i(i)))});
    }

    public static final List<jf3> d(Bundle bundle, Function0<jf3> function0) {
        ArrayList<SizeF> parcelableArrayList = bundle.getParcelableArrayList("appWidgetSizes");
        if (parcelableArrayList == null || parcelableArrayList.isEmpty()) {
            return c(bundle, function0);
        }
        ArrayList arrayList = new ArrayList(m.A(parcelableArrayList, 10));
        for (SizeF sizeF : parcelableArrayList) {
            arrayList.add(jf3.c(hf3.a(ff3.i(sizeF.getWidth()), ff3.i(sizeF.getHeight()))));
        }
        return arrayList;
    }

    private static final jf3 e(Bundle bundle) {
        int i = bundle.getInt("appWidgetMinHeight", 0);
        int i2 = bundle.getInt("appWidgetMaxWidth", 0);
        if (i == 0 || i2 == 0) {
            return null;
        }
        return jf3.c(hf3.a(ff3.i(i2), ff3.i(i)));
    }

    public static final List<jf3> f(Bundle bundle) {
        return m.u(new jf3[]{e(bundle), g(bundle)});
    }

    private static final jf3 g(Bundle bundle) {
        int i = bundle.getInt("appWidgetMaxHeight", 0);
        int i2 = bundle.getInt("appWidgetMinWidth", 0);
        if (i == 0 || i2 == 0) {
            return null;
        }
        return jf3.c(hf3.a(ff3.i(i2), ff3.i(i)));
    }

    public static final jf3 h(long j, Collection<jf3> collection) {
        Object next;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            long packedValue = ((jf3) it.next()).getPackedValue();
            Pair pairA = i(packedValue, j) ? qjd.a(jf3.c(packedValue), Float.valueOf(p(j, packedValue))) : null;
            if (pairA != null) {
                arrayList.add(pairA);
            }
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                float fFloatValue = ((Number) ((Pair) next).d()).floatValue();
                do {
                    Object next2 = it2.next();
                    float fFloatValue2 = ((Number) ((Pair) next2).d()).floatValue();
                    if (Float.compare(fFloatValue, fFloatValue2) > 0) {
                        next = next2;
                        fFloatValue = fFloatValue2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = null;
        }
        Pair pair = (Pair) next;
        if (pair != null) {
            return (jf3) pair.c();
        }
        return null;
    }

    private static final boolean i(long j, long j2) {
        float f = 1;
        return ((float) Math.ceil((double) jf3.h(j2))) + f > jf3.h(j) && ((float) Math.ceil((double) jf3.g(j2))) + f > jf3.g(j);
    }

    public static final AppWidgetManager j(Context context) {
        Object systemService = context.getSystemService("appwidget");
        Intrinsics.h(systemService, "null cannot be cast to non-null type android.appwidget.AppWidgetManager");
        return (AppWidgetManager) systemService;
    }

    public static final boolean k(AppWidgetId appWidgetId) {
        int appWidgetId2 = appWidgetId.getAppWidgetId();
        return Integer.MIN_VALUE <= appWidgetId2 && appWidgetId2 < -1;
    }

    public static final boolean l(AppWidgetId appWidgetId) {
        return !k(appWidgetId);
    }

    public static final void m(Throwable th) {
    }

    public static final ai4<Function2<d, Integer, Unit>> n(GlanceAppWidget glanceAppWidget, Context context, qy4 qy4Var) {
        return kotlinx.coroutines.flow.d.j(new jo9(glanceAppWidget, context, qy4Var, null));
    }

    public static final List<jf3> o(Collection<jf3> collection) {
        return m.m1(collection, zk1.c(new Function1[]{new Function1<jf3, Comparable<?>>() { // from class: androidx.glance.appwidget.AppWidgetUtilsKt$sortedBySize$1
            public final Comparable<?> a(long j) {
                return Float.valueOf(jf3.h(j) * jf3.g(j));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return a(((jf3) obj).getPackedValue());
            }
        }, new Function1<jf3, Comparable<?>>() { // from class: androidx.glance.appwidget.AppWidgetUtilsKt$sortedBySize$2
            public final Comparable<?> a(long j) {
                return Float.valueOf(jf3.h(j));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return a(((jf3) obj).getPackedValue());
            }
        }}));
    }

    private static final float p(long j, long j2) {
        float fH = jf3.h(j) - jf3.h(j2);
        float fG = jf3.g(j) - jf3.g(j2);
        return (fH * fH) + (fG * fG);
    }

    public static final String q(AppWidgetId appWidgetId) {
        return b(appWidgetId.getAppWidgetId());
    }

    public static final SizeF r(long j) {
        return new SizeF(jf3.h(j), jf3.g(j));
    }
}
