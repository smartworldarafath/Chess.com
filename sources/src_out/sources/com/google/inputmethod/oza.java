package com.google.inputmethod;

import android.os.Bundle;
import com.google.android.h0b;
import com.google.android.p58;
import com.google.android.qjd;
import com.google.android.zza;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.p;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u000b\u0010\fJ \u0010\r\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u00020\u0003H\u0087\u0002¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u0011\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00018\u0000H\u0087\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0013\u0010\u000eJ\u001f\u0010\u0016\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017R%\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00140\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001aR(\u0010\u001f\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR+\u0010\"\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n0\u00188\u0006¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u001cR\u0017\u0010%\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0013\u0010#\u001a\u0004\b \u0010$¨\u0006&"}, d2 = {"Lcom/google/android/oza;", "", "", "", "initialState", "<init>", "(Ljava/util/Map;)V", "T", "key", "initialValue", "Lcom/google/android/p58;", "c", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/p58;", "b", "(Ljava/lang/String;)Ljava/lang/Object;", "value", "", "g", "(Ljava/lang/String;Ljava/lang/Object;)V", "e", "Lcom/google/android/zza$b;", "provider", "h", "(Ljava/lang/String;Lcom/google/android/zza$b;)V", "", "a", "Ljava/util/Map;", "getRegular", "()Ljava/util/Map;", "regular", "providers", "flows", "d", "getMutableFlows", "mutableFlows", "Lcom/google/android/zza$b;", "()Lcom/google/android/zza$b;", "savedStateProvider", "lifecycle-viewmodel-savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class oza {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Map<String, Object> regular;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Map<String, zza.b> providers;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Map<String, p58<Object>> flows;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Map<String, p58<Object>> mutableFlows;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final zza.b savedStateProvider;

    public oza(Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "initialState");
        this.regular = b0.C(map);
        this.providers = new LinkedHashMap();
        this.flows = new LinkedHashMap();
        this.mutableFlows = new LinkedHashMap();
        this.savedStateProvider = new zza.b() { // from class: com.google.android.nza
            public final Bundle b() {
                return oza.f(this.a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle f(oza ozaVar) {
        Pair[] pairArr;
        for (Map.Entry entry : b0.z(ozaVar.mutableFlows).entrySet()) {
            ozaVar.g((String) entry.getKey(), ((p58) entry.getValue()).getValue());
        }
        for (Map.Entry entry2 : b0.z(ozaVar.providers).entrySet()) {
            ozaVar.g((String) entry2.getKey(), ((zza.b) entry2.getValue()).b());
        }
        Map<String, Object> map = ozaVar.regular;
        if (map.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<String, Object> entry3 : map.entrySet()) {
                arrayList.add(qjd.a(entry3.getKey(), entry3.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleB = nx0.b((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        h0b.a(bundleB);
        return bundleB;
    }

    public final <T> T b(String key) {
        T t;
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            p58<Object> p58Var = this.mutableFlows.get(key);
            if (p58Var != null && (t = (T) p58Var.getValue()) != null) {
                return t;
            }
            return (T) this.regular.get(key);
        } catch (ClassCastException unused) {
            e(key);
            return null;
        }
    }

    public final <T> p58<T> c(String key, T initialValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Map<String, p58<Object>> map = this.mutableFlows;
        Object objA = map.get(key);
        if (objA == null) {
            if (!this.regular.containsKey(key)) {
                this.regular.put(key, initialValue);
            }
            objA = p.a(this.regular.get(key));
            map.put(key, (p58<Object>) objA);
        }
        p58<T> p58Var = (p58) objA;
        Intrinsics.h(p58Var, "null cannot be cast to non-null type kotlinx.coroutines.flow.MutableStateFlow<T of androidx.lifecycle.internal.SavedStateHandleImpl.getMutableStateFlow>");
        return p58Var;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final zza.b getSavedStateProvider() {
        return this.savedStateProvider;
    }

    public final <T> T e(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        T t = (T) this.regular.remove(key);
        this.flows.remove(key);
        this.mutableFlows.remove(key);
        return t;
    }

    public final <T> void g(String key, T value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.regular.put(key, value);
        p58<Object> p58Var = this.flows.get(key);
        if (p58Var != null) {
            p58Var.setValue(value);
        }
        p58<Object> p58Var2 = this.mutableFlows.get(key);
        if (p58Var2 != null) {
            p58Var2.setValue(value);
        }
    }

    public final void h(String key, zza.b provider) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.providers.put(key, provider);
    }

    public /* synthetic */ oza(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? b0.j() : map);
    }
}
