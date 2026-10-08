package androidx.p008glance.p009appwidget.action;

import android.content.Context;
import com.google.android.q22;
import com.google.inputmethod.l7;
import com.google.inputmethod.q7;
import com.google.inputmethod.qy4;
import com.google.inputmethod.v7;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rR\u001f\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Landroidx/glance/appwidget/action/d;", "Lcom/google/android/l7;", "Ljava/lang/Class;", "Lcom/google/android/q7;", "callbackClass", "Ljava/lang/Class;", "c", "()Ljava/lang/Class;", "Lcom/google/android/v7;", "parameters", "Lcom/google/android/v7;", "getParameters", "()Lcom/google/android/v7;", "a", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d implements l7 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int b = 8;

    /* JADX INFO: renamed from: androidx.glance.appwidget.action.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/glance/appwidget/action/d$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "className", "Lcom/google/android/qy4;", "glanceId", "Lcom/google/android/v7;", "parameters", "", "a", "(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/qy4;Lcom/google/android/v7;Lcom/google/android/q22;)Ljava/lang/Object;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Object a(Context context, String str, qy4 qy4Var, v7 v7Var, q22<? super Unit> q22Var) throws IllegalAccessException, InstantiationException, ClassNotFoundException, InvocationTargetException {
            Class<?> cls = Class.forName(str);
            if (!q7.class.isAssignableFrom(cls)) {
                throw new IllegalStateException("Provided class must implement ActionCallback.");
            }
            Object objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
            Intrinsics.h(objNewInstance, "null cannot be cast to non-null type androidx.glance.appwidget.action.ActionCallback");
            Object objA = ((q7) objNewInstance).a(context, qy4Var, v7Var, q22Var);
            return objA == a.g() ? objA : Unit.a;
        }

        private Companion() {
        }
    }

    public final Class<? extends q7> c() {
        throw null;
    }

    public final v7 getParameters() {
        throw null;
    }
}
