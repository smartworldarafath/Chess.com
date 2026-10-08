package androidx.lifecycle;

import android.os.Bundle;
import com.google.android.e0b;
import com.google.android.oda;
import com.google.android.rg6;
import com.google.android.zza;
import com.google.inputmethod.CreationExtras;
import com.google.inputmethod.sza;
import com.google.inputmethod.tza;
import com.google.inputmethod.u9e;
import com.google.inputmethod.w8e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0004\u001a\u00020\u0003\"\f\b\u0000\u0010\u0002*\u00020\u0000*\u00020\u0001*\u00028\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0011\u001a\u00020\r*\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\"\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00000\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014\"\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014\"\u001e\u0010\u0017\u001a\f\u0012\b\u0012\u00060\nj\u0002`\u000b0\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014\"\u0018\u0010\u001b\u001a\u00020\u0018*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\"\u0018\u0010\u001f\u001a\u00020\u001c*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/google/android/e0b;", "Lcom/google/android/u9e;", "T", "", "c", "(Lcom/google/android/e0b;)V", "savedStateRegistryOwner", "viewModelStoreOwner", "", "key", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "defaultArgs", "Landroidx/lifecycle/t;", "b", "(Lcom/google/android/e0b;Lcom/google/android/u9e;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/lifecycle/t;", "Lcom/google/android/oe2;", "a", "(Lcom/google/android/oe2;)Landroidx/lifecycle/t;", "Lcom/google/android/oe2$c;", "Lcom/google/android/oe2$c;", "SAVED_STATE_REGISTRY_OWNER_KEY", "VIEW_MODEL_STORE_OWNER_KEY", "DEFAULT_ARGS_KEY", "Lcom/google/android/tza;", "e", "(Lcom/google/android/u9e;)Lcom/google/android/tza;", "savedStateHandlesVM", "Lcom/google/android/sza;", "d", "(Lcom/google/android/e0b;)Lcom/google/android/sza;", "savedStateHandlesProvider", "lifecycle-viewmodel-savedstate"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class w {
    public static final CreationExtras.c<e0b> a;
    public static final CreationExtras.c<u9e> b;
    public static final CreationExtras.c<Bundle> c;

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"androidx/lifecycle/w$a", "Landroidx/lifecycle/b0$c;", "Lcom/google/android/w8e;", "T", "Lcom/google/android/rg6;", "modelClass", "Lcom/google/android/oe2;", "extras", "create", "(Lcom/google/android/rg6;Lcom/google/android/oe2;)Lcom/google/android/w8e;", "lifecycle-viewmodel-savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements b0.c {
        a() {
        }

        @Override // androidx.lifecycle.b0.c
        public <T extends w8e> T create(rg6<T> modelClass, CreationExtras extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return new tza();
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"androidx/lifecycle/w$b", "Lcom/google/android/oe2$c;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements CreationExtras.c<e0b> {
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"androidx/lifecycle/w$c", "Lcom/google/android/oe2$c;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c implements CreationExtras.c<u9e> {
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"androidx/lifecycle/w$d", "Lcom/google/android/oe2$c;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d implements CreationExtras.c<Bundle> {
    }

    static {
        CreationExtras.Companion companion = CreationExtras.INSTANCE;
        a = new b();
        b = new c();
        c = new d();
    }

    public static final t a(CreationExtras creationExtras) {
        Intrinsics.checkNotNullParameter(creationExtras, "<this>");
        e0b e0bVar = (e0b) creationExtras.a(a);
        if (e0bVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        u9e u9eVar = (u9e) creationExtras.a(b);
        if (u9eVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) creationExtras.a(c);
        String str = (String) creationExtras.a(b0.c);
        if (str != null) {
            return b(e0bVar, u9eVar, str, bundle);
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
    }

    private static final t b(e0b e0bVar, u9e u9eVar, String str, Bundle bundle) {
        sza szaVarD = d(e0bVar);
        tza tzaVarE = e(u9eVar);
        t tVar = tzaVarE.C6().get(str);
        if (tVar != null) {
            return tVar;
        }
        t tVarA = t.INSTANCE.a(szaVarD.c(str), bundle);
        tzaVarE.C6().put(str, tVarA);
        return tVarA;
    }

    public static final <T extends e0b & u9e> void c(T t) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Lifecycle.State state = t.getLifecycleRegistry().getState();
        if (state != Lifecycle.State.INITIALIZED && state != Lifecycle.State.CREATED) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (t.getSavedStateRegistry().b("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            sza szaVar = new sza(t.getSavedStateRegistry(), t);
            t.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", szaVar);
            t.getLifecycleRegistry().c(new u(szaVar));
        }
    }

    public static final sza d(e0b e0bVar) {
        Intrinsics.checkNotNullParameter(e0bVar, "<this>");
        zza.b bVarB = e0bVar.getSavedStateRegistry().b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        sza szaVar = bVarB instanceof sza ? (sza) bVarB : null;
        if (szaVar != null) {
            return szaVar;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    public static final tza e(u9e u9eVar) {
        Intrinsics.checkNotNullParameter(u9eVar, "<this>");
        return (tza) b0.Companion.d(b0.INSTANCE, u9eVar, new a(), null, 4, null).c("androidx.lifecycle.internal.SavedStateHandlesVM", oda.b(tza.class));
    }
}
