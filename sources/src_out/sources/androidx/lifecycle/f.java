package androidx.lifecycle;

import android.os.Bundle;
import com.google.android.e0b;
import com.google.android.zza;
import com.google.inputmethod.k9e;
import com.google.inputmethod.n17;
import com.google.inputmethod.u9e;
import com.google.inputmethod.w8e;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/lifecycle/f;", "", "<init>", "()V", "Lcom/google/android/zza;", "registry", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "", "key", "Landroid/os/Bundle;", "defaultArgs", "Landroidx/lifecycle/v;", "b", "(Lcom/google/android/zza;Landroidx/lifecycle/Lifecycle;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/lifecycle/v;", "Lcom/google/android/w8e;", "viewModel", "", "a", "(Lcom/google/android/w8e;Lcom/google/android/zza;Landroidx/lifecycle/Lifecycle;)V", "c", "(Lcom/google/android/zza;Landroidx/lifecycle/Lifecycle;)V", "lifecycle-viewmodel-savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f {
    public static final f a = new f();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/lifecycle/f$a;", "Lcom/google/android/zza$a;", "<init>", "()V", "Lcom/google/android/e0b;", "owner", "", "a", "(Lcom/google/android/e0b;)V", "lifecycle-viewmodel-savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements zza.a {
        public void a(e0b owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            if (!(owner instanceof u9e)) {
                throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + owner).toString());
            }
            k9e viewModelStore = ((u9e) owner).getViewModelStore();
            zza savedStateRegistry = owner.getSavedStateRegistry();
            Iterator<String> it = viewModelStore.c().iterator();
            while (it.hasNext()) {
                w8e w8eVarB = viewModelStore.b(it.next());
                if (w8eVarB != null) {
                    f.a(w8eVarB, savedStateRegistry, owner.getLifecycleRegistry());
                }
            }
            if (viewModelStore.c().isEmpty()) {
                return;
            }
            savedStateRegistry.d(a.class);
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/lifecycle/f$b", "Landroidx/lifecycle/i;", "Lcom/google/android/n17;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "", "d6", "(Lcom/google/android/n17;Landroidx/lifecycle/Lifecycle$Event;)V", "lifecycle-viewmodel-savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements i {
        final /* synthetic */ Lifecycle a;
        final /* synthetic */ zza b;

        b(Lifecycle lifecycle, zza zzaVar) {
            this.a = lifecycle;
            this.b = zzaVar;
        }

        @Override // androidx.lifecycle.i
        public void d6(n17 source, Lifecycle.Event event) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            if (event == Lifecycle.Event.ON_START) {
                this.a.g(this);
                this.b.d(a.class);
            }
        }
    }

    private f() {
    }

    public static final void a(w8e viewModel, zza registry, Lifecycle lifecycle) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        v vVar = (v) viewModel.getCloseable("androidx.lifecycle.savedstate.vm.tag");
        if (vVar == null || vVar.getIsAttached()) {
            return;
        }
        vVar.a(registry, lifecycle);
        a.c(registry, lifecycle);
    }

    public static final v b(zza registry, Lifecycle lifecycle, String key, Bundle defaultArgs) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.g(key);
        v vVar = new v(key, t.INSTANCE.a(registry.a(key), defaultArgs));
        vVar.a(registry, lifecycle);
        a.c(registry, lifecycle);
        return vVar;
    }

    private final void c(zza registry, Lifecycle lifecycle) {
        Lifecycle.State state = lifecycle.getState();
        if (state == Lifecycle.State.INITIALIZED || state.c(Lifecycle.State.STARTED)) {
            registry.d(a.class);
        } else {
            lifecycle.c(new b(lifecycle, registry));
        }
    }
}
