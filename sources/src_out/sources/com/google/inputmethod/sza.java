package com.google.inputmethod;

import android.os.Bundle;
import androidx.lifecycle.t;
import androidx.lifecycle.w;
import com.google.android.h0b;
import com.google.android.qjd;
import com.google.android.vza;
import com.google.android.zza;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.c;
import kotlin.collections.b0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0016R\u001e\u0010\u0019\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/google/android/sza;", "Lcom/google/android/zza$b;", "Lcom/google/android/zza;", "savedStateRegistry", "Lcom/google/android/u9e;", "viewModelStoreOwner", "<init>", "(Lcom/google/android/zza;Lcom/google/android/u9e;)V", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "b", "()Landroid/os/Bundle;", "", "e", "()V", "", "key", "c", "(Ljava/lang/String;)Landroid/os/Bundle;", "a", "Lcom/google/android/zza;", "", "Z", "restored", "Landroid/os/Bundle;", "restoredState", "Lcom/google/android/tza;", "d", "Lkotlin/Lazy;", "()Lcom/google/android/tza;", "viewModel", "lifecycle-viewmodel-savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class sza implements zza.b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final zza savedStateRegistry;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean restored;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private Bundle restoredState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy viewModel;

    public sza(zza zzaVar, final u9e u9eVar) {
        Intrinsics.checkNotNullParameter(zzaVar, "savedStateRegistry");
        Intrinsics.checkNotNullParameter(u9eVar, "viewModelStoreOwner");
        this.savedStateRegistry = zzaVar;
        this.viewModel = c.b(new Function0() { // from class: com.google.android.rza
            public final Object invoke() {
                return sza.f(u9eVar);
            }
        });
    }

    private final tza d() {
        return (tza) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tza f(u9e u9eVar) {
        return w.e(u9eVar);
    }

    public Bundle b() {
        Pair[] pairArr;
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
        Bundle bundleA = h0b.a(bundleB);
        Bundle bundle = this.restoredState;
        if (bundle != null) {
            h0b.b(bundleA, bundle);
        }
        for (Map.Entry<String, t> entry2 : d().C6().entrySet()) {
            String key = entry2.getKey();
            Bundle bundleB2 = entry2.getValue().c().b();
            if (!vza.M(vza.a(bundleB2))) {
                h0b.y(bundleA, key, bundleB2);
            }
        }
        this.restored = false;
        return bundleB;
    }

    public final Bundle c(String key) {
        Pair[] pairArr;
        Intrinsics.checkNotNullParameter(key, "key");
        e();
        Bundle bundle = this.restoredState;
        if (bundle == null || !vza.b(vza.a(bundle), key)) {
            return null;
        }
        Bundle bundleD = vza.D(vza.a(bundle), key);
        if (bundleD == null) {
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
            bundleD = nx0.b((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
            h0b.a(bundleD);
        }
        h0b.G(h0b.a(bundle), key);
        if (vza.M(vza.a(bundle))) {
            this.restoredState = null;
        }
        return bundleD;
    }

    public final void e() {
        Pair[] pairArr;
        if (this.restored) {
            return;
        }
        Bundle bundleA = this.savedStateRegistry.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
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
        Bundle bundleA2 = h0b.a(bundleB);
        Bundle bundle = this.restoredState;
        if (bundle != null) {
            h0b.b(bundleA2, bundle);
        }
        if (bundleA != null) {
            h0b.b(bundleA2, bundleA);
        }
        this.restoredState = bundleB;
        this.restored = true;
        d();
    }
}
