package com.google.inputmethod;

import android.os.Bundle;
import androidx.lifecycle.k;
import com.google.android.b0b;
import com.google.android.e0b;
import com.google.android.h0b;
import com.google.android.qjd;
import com.google.android.vza;
import com.google.android.zza;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.b0;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u000e\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0014H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0011H\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ$\u0010\u001f\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u001e0\u001dH\u0096\u0001¢\u0006\u0004\b\u001f\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010!R\u0018\u0010$\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010#R\u0014\u0010'\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\bR\u0014\u0010-\u001a\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lcom/google/android/vya;", "Lcom/google/android/qya;", "Lcom/google/android/e0b;", "base", "<init>", "(Lcom/google/android/qya;)V", "Landroidx/lifecycle/k;", "i", "()Landroidx/lifecycle/k;", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "savedState", "Lcom/google/android/b0b;", "h", "(Landroid/os/Bundle;)Lcom/google/android/b0b;", "", "key", "", "f", "(Ljava/lang/String;)Ljava/lang/Object;", "Lkotlin/Function0;", "valueProvider", "Lcom/google/android/qya$a;", "b", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Lcom/google/android/qya$a;", "value", "", "a", "(Ljava/lang/Object;)Z", "", "", "c", "()Ljava/util/Map;", "Landroidx/lifecycle/k;", "_lifecycle", "Lcom/google/android/b0b;", "_controller", "g", "()Lcom/google/android/b0b;", "controller", "getLifecycle", "lifecycle", "Lcom/google/android/zza;", "getSavedStateRegistry", "()Lcom/google/android/zza;", "savedStateRegistry", "runtime-saveable"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class vya implements qya, e0b {
    private final /* synthetic */ qya a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private k _lifecycle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private b0b _controller;

    public vya(qya qyaVar) {
        this.a = qyaVar;
        Object objF = f("androidx.savedstate.SavedStateRegistry");
        Bundle bundle = objF instanceof Bundle ? (Bundle) objF : null;
        if (bundle != null) {
            h(bundle);
        }
        b("androidx.savedstate.SavedStateRegistry", new Function0() { // from class: com.google.android.uya
            public final Object invoke() {
                return vya.e(this.a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object e(vya vyaVar) {
        Pair[] pairArr;
        b0b b0bVar = vyaVar._controller;
        if (b0bVar == null) {
            return null;
        }
        Map mapJ = b0.j();
        if (mapJ.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapJ.size());
            for (Map.Entry entry : mapJ.entrySet()) {
                arrayList.add(qjd.a((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleB = nx0.b((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        h0b.a(bundleB);
        b0bVar.e(bundleB);
        if (vza.M(vza.a(bundleB))) {
            return null;
        }
        return bundleB;
    }

    private final b0b g() {
        return h(null);
    }

    private final b0b h(Bundle savedState) {
        b0b b0bVar = this._controller;
        if (b0bVar != null) {
            return b0bVar;
        }
        b0b b0bVarB = b0b.c.b(this);
        this._controller = b0bVarB;
        b0bVarB.d(savedState);
        return b0bVarB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final k i() {
        k kVar = this._lifecycle;
        if (kVar != null) {
            return kVar;
        }
        k kVarA = k.INSTANCE.a(this);
        this._lifecycle = kVarA;
        return kVarA;
    }

    @Override // com.google.inputmethod.qya
    public boolean a(Object value) {
        return this.a.a(value);
    }

    @Override // com.google.inputmethod.qya
    public qya.a b(String key, Function0<? extends Object> valueProvider) {
        return this.a.b(key, valueProvider);
    }

    @Override // com.google.inputmethod.qya
    public Map<String, List<Object>> c() {
        return this.a.c();
    }

    @Override // com.google.inputmethod.qya
    public Object f(String key) {
        return this.a.f(key);
    }

    public zza getSavedStateRegistry() {
        return g().b();
    }

    public k getLifecycle() {
        return i();
    }
}
