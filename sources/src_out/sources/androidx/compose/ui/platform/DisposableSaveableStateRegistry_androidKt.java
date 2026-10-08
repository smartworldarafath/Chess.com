package androidx.compose.ui.platform;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.p004runtime.p0;
import androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt;
import com.google.android.e0b;
import com.google.android.ws4;
import com.google.android.zza;
import com.google.inputmethod.axb;
import com.google.inputmethod.od3;
import com.google.inputmethod.qya;
import com.google.inputmethod.tya;
import com.google.inputmethod.xy9;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00130\u0012*\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a'\u0010\u0016\u001a\u00020\u0011*\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00130\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\"\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Landroid/view/View;", "view", "Lcom/google/android/e0b;", "owner", "Lcom/google/android/od3;", "b", "(Landroid/view/View;Lcom/google/android/e0b;)Lcom/google/android/od3;", "", "id", "savedStateRegistryOwner", "c", "(Ljava/lang/String;Lcom/google/android/e0b;)Lcom/google/android/od3;", "", "value", "", "f", "(Ljava/lang/Object;)Z", "Landroid/os/Bundle;", "", "", "h", "(Landroid/os/Bundle;)Ljava/util/Map;", "g", "(Ljava/util/Map;)Landroid/os/Bundle;", "", "Ljava/lang/Class;", "a", "[Ljava/lang/Class;", "AcceptableClasses", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class DisposableSaveableStateRegistry_androidKt {
    private static final Class<? extends Object>[] a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    public static final od3 b(View view, e0b e0bVar) {
        Object parent = view.getParent();
        Intrinsics.h(parent, "null cannot be cast to non-null type android.view.View");
        View view2 = (View) parent;
        Object tag = view2.getTag(xy9.J);
        String strValueOf = tag instanceof String ? (String) tag : null;
        if (strValueOf == null) {
            strValueOf = String.valueOf(view2.getId());
        }
        return c(strValueOf, e0bVar);
    }

    public static final od3 c(String str, e0b e0bVar) {
        final String str2 = "SaveableStateRegistry:" + str;
        final zza savedStateRegistry = e0bVar.getSavedStateRegistry();
        Bundle bundleA = savedStateRegistry.a(str2);
        final qya qyaVarC = tya.c(bundleA != null ? h(bundleA) : null, new Function1<Object, Boolean>() { // from class: androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$saveableStateRegistry$1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(DisposableSaveableStateRegistry_androidKt.f(obj));
            }
        });
        final boolean z = false;
        if (savedStateRegistry.b(str2) == null) {
            try {
                savedStateRegistry.c(str2, new zza.b() { // from class: com.google.android.pd3
                    public final Bundle b() {
                        return DisposableSaveableStateRegistry_androidKt.d(qyaVarC);
                    }
                });
                z = true;
            } catch (IllegalArgumentException unused) {
            }
        }
        return new od3(qyaVarC, new Function0<Unit>() { // from class: androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                m51invoke();
                return Unit.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m51invoke() {
                if (z) {
                    savedStateRegistry.e(str2);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle d(qya qyaVar) {
        return g(qyaVar.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(Object obj) {
        if (obj instanceof axb) {
            axb axbVar = (axb) obj;
            if (axbVar.getPolicy() != p0.k() && axbVar.getPolicy() != p0.t() && axbVar.getPolicy() != p0.q()) {
                return false;
            }
            T value = axbVar.getValue();
            if (value == 0) {
                return true;
            }
            return f(value);
        }
        if ((obj instanceof ws4) && (obj instanceof Serializable)) {
            return false;
        }
        for (Class<? extends Object> cls : a) {
            if (cls.isInstance(obj)) {
                return true;
            }
        }
        return false;
    }

    private static final Bundle g(Map<String, ? extends List<? extends Object>> map) {
        Bundle bundle = new Bundle();
        for (Map.Entry<String, ? extends List<? extends Object>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<? extends Object> value = entry.getValue();
            bundle.putParcelableArrayList(key, value instanceof ArrayList ? (ArrayList) value : new ArrayList<>(value));
        }
        return bundle;
    }

    private static final Map<String, List<Object>> h(Bundle bundle) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : bundle.keySet()) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(str);
            Intrinsics.h(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>");
            linkedHashMap.put(str, parcelableArrayList);
        }
        return linkedHashMap;
    }
}
