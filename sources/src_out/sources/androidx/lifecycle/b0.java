package androidx.lifecycle;

import android.app.Application;
import com.google.android.e23;
import com.google.android.h9e;
import com.google.android.hf6;
import com.google.android.j9e;
import com.google.android.lg6;
import com.google.android.rg6;
import com.google.inputmethod.CreationExtras;
import com.google.inputmethod.k9e;
import com.google.inputmethod.rp;
import com.google.inputmethod.u9e;
import com.google.inputmethod.w8e;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0016\u0018\u0000 \u00172\u00020\u0001:\u0005\u001b\u001e\u001f\u0014\u0017B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\fB\u0019\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\u000fJ(\u0010\u0014\u001a\u00028\u0000\"\b\b\u0000\u0010\u0011*\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0087\u0002¢\u0006\u0004\b\u0014\u0010\u0015J(\u0010\u0017\u001a\u00028\u0000\"\b\b\u0000\u0010\u0011*\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J0\u0010\u001b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0011*\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0087\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001d¨\u0006 "}, d2 = {"Landroidx/lifecycle/b0;", "", "Lcom/google/android/h9e;", "impl", "<init>", "(Lcom/google/android/h9e;)V", "Lcom/google/android/k9e;", "store", "Landroidx/lifecycle/b0$c;", "factory", "Lcom/google/android/oe2;", "defaultCreationExtras", "(Lcom/google/android/k9e;Landroidx/lifecycle/b0$c;Lcom/google/android/oe2;)V", "Lcom/google/android/u9e;", "owner", "(Lcom/google/android/u9e;Landroidx/lifecycle/b0$c;)V", "Lcom/google/android/w8e;", "T", "Lcom/google/android/rg6;", "modelClass", "a", "(Lcom/google/android/rg6;)Lcom/google/android/w8e;", "Ljava/lang/Class;", "b", "(Ljava/lang/Class;)Lcom/google/android/w8e;", "", "key", "c", "(Ljava/lang/String;Lcom/google/android/rg6;)Lcom/google/android/w8e;", "Lcom/google/android/h9e;", "e", "d", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class b0 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final CreationExtras.c<String> c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final h9e impl;

    /* JADX INFO: renamed from: androidx.lifecycle.b0$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/lifecycle/b0$b;", "", "<init>", "()V", "Lcom/google/android/u9e;", "owner", "Landroidx/lifecycle/b0$c;", "factory", "Lcom/google/android/oe2;", "extras", "Landroidx/lifecycle/b0;", "b", "(Lcom/google/android/u9e;Landroidx/lifecycle/b0$c;Lcom/google/android/oe2;)Landroidx/lifecycle/b0;", "Lcom/google/android/k9e;", "store", "a", "(Lcom/google/android/k9e;Landroidx/lifecycle/b0$c;Lcom/google/android/oe2;)Landroidx/lifecycle/b0;", "Lcom/google/android/oe2$c;", "", "VIEW_MODEL_KEY", "Lcom/google/android/oe2$c;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ b0 c(Companion companion, k9e k9eVar, c cVar, CreationExtras creationExtras, int i, Object obj) {
            if ((i & 2) != 0) {
                cVar = e23.b;
            }
            if ((i & 4) != 0) {
                creationExtras = CreationExtras.b.c;
            }
            return companion.a(k9eVar, cVar, creationExtras);
        }

        public static /* synthetic */ b0 d(Companion companion, u9e u9eVar, c cVar, CreationExtras creationExtras, int i, Object obj) {
            if ((i & 2) != 0) {
                cVar = j9e.a.d(u9eVar);
            }
            if ((i & 4) != 0) {
                creationExtras = j9e.a.c(u9eVar);
            }
            return companion.b(u9eVar, cVar, creationExtras);
        }

        public final b0 a(k9e store, c factory, CreationExtras extras) {
            Intrinsics.checkNotNullParameter(store, "store");
            Intrinsics.checkNotNullParameter(factory, "factory");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return new b0(store, factory, extras);
        }

        public final b0 b(u9e owner, c factory, CreationExtras extras) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(factory, "factory");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return new b0(owner.getViewModelStore(), factory, extras);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \r2\u00020\u0001:\u0001\rJ'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0006\u0010\nJ/\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0006\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Landroidx/lifecycle/b0$c;", "", "Lcom/google/android/w8e;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Lcom/google/android/w8e;", "Lcom/google/android/oe2;", "extras", "(Ljava/lang/Class;Lcom/google/android/oe2;)Lcom/google/android/w8e;", "Lcom/google/android/rg6;", "(Lcom/google/android/rg6;Lcom/google/android/oe2;)Lcom/google/android/w8e;", "a", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public static final Companion INSTANCE = Companion.a;

        /* JADX INFO: renamed from: androidx.lifecycle.b0$c$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/b0$c$a;", "", "<init>", "()V", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion a = new Companion();

            private Companion() {
            }
        }

        default <T extends w8e> T create(Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            return (T) j9e.a.f();
        }

        default <T extends w8e> T create(Class<T> modelClass, CreationExtras extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return (T) create(modelClass);
        }

        default <T extends w8e> T create(rg6<T> modelClass, CreationExtras extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return (T) create(hf6.b(modelClass), extras);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ/\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\b\u0010\fJ/\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\b\u0010\u000e¨\u0006\u0011"}, d2 = {"Landroidx/lifecycle/b0$d;", "Landroidx/lifecycle/b0$c;", "<init>", "()V", "Lcom/google/android/w8e;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Lcom/google/android/w8e;", "Lcom/google/android/oe2;", "extras", "(Ljava/lang/Class;Lcom/google/android/oe2;)Lcom/google/android/w8e;", "Lcom/google/android/rg6;", "(Lcom/google/android/rg6;Lcom/google/android/oe2;)Lcom/google/android/w8e;", "b", "a", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class d implements c {
        private static d c;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final CreationExtras.c<String> d = b0.c;

        /* JADX INFO: renamed from: androidx.lifecycle.b0$d$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\u00020\u00048GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\u0003\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/lifecycle/b0$d$a;", "", "<init>", "()V", "Landroidx/lifecycle/b0$d;", "a", "()Landroidx/lifecycle/b0$d;", "getInstance$annotations", "instance", "_instance", "Landroidx/lifecycle/b0$d;", "Lcom/google/android/oe2$c;", "", "VIEW_MODEL_KEY", "Lcom/google/android/oe2$c;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final d a() {
                if (d.c == null) {
                    d.c = new d();
                }
                d dVar = d.c;
                Intrinsics.g(dVar);
                return dVar;
            }

            private Companion() {
            }
        }

        @Override // androidx.lifecycle.b0.c
        public <T extends w8e> T create(Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            return (T) lg6.a.a(modelClass);
        }

        @Override // androidx.lifecycle.b0.c
        public <T extends w8e> T create(Class<T> modelClass, CreationExtras extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return (T) create(modelClass);
        }

        @Override // androidx.lifecycle.b0.c
        public <T extends w8e> T create(rg6<T> modelClass, CreationExtras extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return (T) create(hf6.b(modelClass), extras);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/lifecycle/b0$e;", "", "<init>", "()V", "Lcom/google/android/w8e;", "viewModel", "", "a", "(Lcom/google/android/w8e;)V", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class e {
        public void a(w8e viewModel) {
            Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"androidx/lifecycle/b0$f", "Lcom/google/android/oe2$c;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class f implements CreationExtras.c<String> {
    }

    static {
        CreationExtras.Companion companion = CreationExtras.INSTANCE;
        c = new f();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b0(k9e k9eVar, c cVar) {
        this(k9eVar, cVar, null, 4, null);
        Intrinsics.checkNotNullParameter(k9eVar, "store");
        Intrinsics.checkNotNullParameter(cVar, "factory");
    }

    public final <T extends w8e> T a(rg6<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return (T) h9e.e(this.impl, modelClass, (String) null, 2, (Object) null);
    }

    public <T extends w8e> T b(Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return (T) a(hf6.e(modelClass));
    }

    public final <T extends w8e> T c(String key, rg6<T> modelClass) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return (T) this.impl.d(modelClass, key);
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u001b\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\tJ/\u0010\u000f\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0013\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0013\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0015R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016¨\u0006\u0019"}, d2 = {"Landroidx/lifecycle/b0$a;", "Landroidx/lifecycle/b0$d;", "Landroid/app/Application;", "application", "", "unused", "<init>", "(Landroid/app/Application;I)V", "()V", "(Landroid/app/Application;)V", "Lcom/google/android/w8e;", "T", "Ljava/lang/Class;", "modelClass", "app", "e", "(Ljava/lang/Class;Landroid/app/Application;)Lcom/google/android/w8e;", "Lcom/google/android/oe2;", "extras", "create", "(Ljava/lang/Class;Lcom/google/android/oe2;)Lcom/google/android/w8e;", "(Ljava/lang/Class;)Lcom/google/android/w8e;", "Landroid/app/Application;", "f", "a", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class a extends d {

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static a g;
        public static final CreationExtras.c<Application> h;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final Application application;

        /* JADX INFO: renamed from: androidx.lifecycle.b0$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/lifecycle/b0$a$a;", "", "<init>", "()V", "Landroid/app/Application;", "application", "Landroidx/lifecycle/b0$a;", "a", "(Landroid/app/Application;)Landroidx/lifecycle/b0$a;", "_instance", "Landroidx/lifecycle/b0$a;", "Lcom/google/android/oe2$c;", "APPLICATION_KEY", "Lcom/google/android/oe2$c;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(Application application) {
                Intrinsics.checkNotNullParameter(application, "application");
                if (a.g == null) {
                    a.g = new a(application);
                }
                a aVar = a.g;
                Intrinsics.g(aVar);
                return aVar;
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"androidx/lifecycle/b0$a$b", "Lcom/google/android/oe2$c;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class b implements CreationExtras.c<Application> {
        }

        static {
            CreationExtras.Companion companion = CreationExtras.INSTANCE;
            h = new b();
        }

        private a(Application application, int i) {
            this.application = application;
        }

        private final <T extends w8e> T e(Class<T> modelClass, Application app) {
            if (!rp.class.isAssignableFrom(modelClass)) {
                return (T) super.create(modelClass);
            }
            try {
                T tNewInstance = modelClass.getConstructor(Application.class).newInstance(app);
                Intrinsics.g(tNewInstance);
                return tNewInstance;
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e4);
            }
        }

        @Override // androidx.lifecycle.b0.d, androidx.lifecycle.b0.c
        public <T extends w8e> T create(Class<T> modelClass, CreationExtras extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            if (this.application != null) {
                return (T) create(modelClass);
            }
            Application application = (Application) extras.a(h);
            if (application != null) {
                return (T) e(modelClass, application);
            }
            if (rp.class.isAssignableFrom(modelClass)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return (T) super.create(modelClass);
        }

        public a() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(Application application) {
            this(application, 0);
            Intrinsics.checkNotNullParameter(application, "application");
        }

        @Override // androidx.lifecycle.b0.d, androidx.lifecycle.b0.c
        public <T extends w8e> T create(Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Application application = this.application;
            if (application != null) {
                return (T) e(modelClass, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }
    }

    private b0(h9e h9eVar) {
        this.impl = h9eVar;
    }

    public /* synthetic */ b0(k9e k9eVar, c cVar, CreationExtras creationExtras, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(k9eVar, cVar, (i & 4) != 0 ? CreationExtras.b.c : creationExtras);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b0(k9e k9eVar, c cVar, CreationExtras creationExtras) {
        this(new h9e(k9eVar, cVar, creationExtras));
        Intrinsics.checkNotNullParameter(k9eVar, "store");
        Intrinsics.checkNotNullParameter(cVar, "factory");
        Intrinsics.checkNotNullParameter(creationExtras, "defaultCreationExtras");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b0(u9e u9eVar, c cVar) {
        this(u9eVar.getViewModelStore(), cVar, j9e.a.c(u9eVar));
        Intrinsics.checkNotNullParameter(u9eVar, "owner");
        Intrinsics.checkNotNullParameter(cVar, "factory");
    }
}
