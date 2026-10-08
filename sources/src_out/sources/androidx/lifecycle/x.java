package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import com.google.android.e0b;
import com.google.android.hf6;
import com.google.android.rg6;
import com.google.android.zza;
import com.google.inputmethod.CreationExtras;
import com.google.inputmethod.g0b;
import com.google.inputmethod.rp;
import com.google.inputmethod.w8e;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B%\b\u0017\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0003\u0010\u000bJ/\u0010\u0012\u001a\u00028\u0000\"\b\b\u0000\u0010\r*\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0012\u001a\u00028\u0000\"\b\b\u0000\u0010\r*\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0015J-\u0010\u0018\u001a\u00028\u0000\"\b\b\u0000\u0010\r*\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u0012\u001a\u00028\u0000\"\b\b\u0000\u0010\r*\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0016¢\u0006\u0004\b\u0012\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\fH\u0017¢\u0006\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, d2 = {"Landroidx/lifecycle/x;", "Landroidx/lifecycle/b0$e;", "Landroidx/lifecycle/b0$c;", "<init>", "()V", "Landroid/app/Application;", "application", "Lcom/google/android/e0b;", "owner", "Landroid/os/Bundle;", "defaultArgs", "(Landroid/app/Application;Lcom/google/android/e0b;Landroid/os/Bundle;)V", "Lcom/google/android/w8e;", "T", "Lcom/google/android/rg6;", "modelClass", "Lcom/google/android/oe2;", "extras", "create", "(Lcom/google/android/rg6;Lcom/google/android/oe2;)Lcom/google/android/w8e;", "Ljava/lang/Class;", "(Ljava/lang/Class;Lcom/google/android/oe2;)Lcom/google/android/w8e;", "", "key", "b", "(Ljava/lang/String;Ljava/lang/Class;)Lcom/google/android/w8e;", "(Ljava/lang/Class;)Lcom/google/android/w8e;", "viewModel", "", "a", "(Lcom/google/android/w8e;)V", "Landroid/app/Application;", "c", "Landroidx/lifecycle/b0$c;", "factory", "d", "Landroid/os/Bundle;", "Landroidx/lifecycle/Lifecycle;", "e", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Lcom/google/android/zza;", "f", "Lcom/google/android/zza;", "savedStateRegistry", "lifecycle-viewmodel-savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class x extends b0.e implements b0.c {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private Application application;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final b0.c factory;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private Bundle defaultArgs;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private Lifecycle lifecycle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private zza savedStateRegistry;

    public x() {
        this.factory = new b0.a();
    }

    @Override // androidx.lifecycle.b0.e
    public void a(w8e viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        if (this.lifecycle != null) {
            zza zzaVar = this.savedStateRegistry;
            Intrinsics.g(zzaVar);
            Lifecycle lifecycle = this.lifecycle;
            Intrinsics.g(lifecycle);
            f.a(viewModel, zzaVar, lifecycle);
        }
    }

    public final <T extends w8e> T b(String key, Class<T> modelClass) {
        T t;
        Application application;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Lifecycle lifecycle = this.lifecycle;
        if (lifecycle == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = rp.class.isAssignableFrom(modelClass);
        Constructor constructorC = (!zIsAssignableFrom || this.application == null) ? g0b.c(modelClass, g0b.b) : g0b.c(modelClass, g0b.a);
        if (constructorC == null) {
            return this.application != null ? (T) this.factory.create(modelClass) : (T) b0.d.INSTANCE.a().create(modelClass);
        }
        zza zzaVar = this.savedStateRegistry;
        Intrinsics.g(zzaVar);
        v vVarB = f.b(zzaVar, lifecycle, key, this.defaultArgs);
        if (!zIsAssignableFrom || (application = this.application) == null) {
            t = (T) g0b.d(modelClass, constructorC, vVarB.getHandle());
        } else {
            Intrinsics.g(application);
            t = (T) g0b.d(modelClass, constructorC, application, vVarB.getHandle());
        }
        t.addCloseable("androidx.lifecycle.savedstate.vm.tag", vVarB);
        return t;
    }

    @Override // androidx.lifecycle.b0.c
    public <T extends w8e> T create(rg6<T> modelClass, CreationExtras extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return (T) create(hf6.b(modelClass), extras);
    }

    @Override // androidx.lifecycle.b0.c
    public <T extends w8e> T create(Class<T> modelClass, CreationExtras extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        String str = (String) extras.a(b0.c);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (extras.a(w.a) == null || extras.a(w.b) == null) {
            if (this.lifecycle != null) {
                return (T) b(str, modelClass);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) extras.a(b0.a.h);
        boolean zIsAssignableFrom = rp.class.isAssignableFrom(modelClass);
        Constructor constructorC = (!zIsAssignableFrom || application == null) ? g0b.c(modelClass, g0b.b) : g0b.c(modelClass, g0b.a);
        if (constructorC == null) {
            return (T) this.factory.create(modelClass, extras);
        }
        return (!zIsAssignableFrom || application == null) ? (T) g0b.d(modelClass, constructorC, w.a(extras)) : (T) g0b.d(modelClass, constructorC, application, w.a(extras));
    }

    public x(Application application, e0b e0bVar, Bundle bundle) {
        b0.a aVar;
        Intrinsics.checkNotNullParameter(e0bVar, "owner");
        this.savedStateRegistry = e0bVar.getSavedStateRegistry();
        this.lifecycle = e0bVar.getLifecycleRegistry();
        this.defaultArgs = bundle;
        this.application = application;
        if (application != null) {
            aVar = b0.a.INSTANCE.a(application);
        } else {
            aVar = new b0.a();
        }
        this.factory = aVar;
    }

    @Override // androidx.lifecycle.b0.c
    public <T extends w8e> T create(Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return (T) b(canonicalName, modelClass);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
