package androidx.lifecycle;

import android.os.Bundle;
import com.google.android.p58;
import com.google.android.vza;
import com.google.android.zza;
import com.google.inputmethod.oza;
import com.google.inputmethod.pza;
import com.google.inputmethod.qza;
import com.google.inputmethod.u48;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0001\u0011B\u001f\b\u0017\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0017¢\u0006\u0004\b\u0005\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0011\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0087\u0002¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0015\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\f\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00018\u0000H\u0087\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0018\u0010\u0019R$\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001e¨\u0006 "}, d2 = {"Landroidx/lifecycle/t;", "", "", "", "initialState", "<init>", "(Ljava/util/Map;)V", "()V", "Lcom/google/android/zza$b;", "c", "()Lcom/google/android/zza$b;", "T", "key", "initialValue", "Lcom/google/android/p58;", "b", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/p58;", "a", "(Ljava/lang/String;)Ljava/lang/Object;", "value", "", "d", "(Ljava/lang/String;Ljava/lang/Object;)V", "provider", "e", "(Ljava/lang/String;Lcom/google/android/zza$b;)V", "", "Ljava/util/Map;", "liveDatas", "Lcom/google/android/oza;", "Lcom/google/android/oza;", "impl", "lifecycle-viewmodel-savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class t {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Map<String, Object> liveDatas;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private oza impl;

    /* JADX INFO: renamed from: androidx.lifecycle.t$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\t\u001a\u00020\b2\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00052\u000e\u0010\u0007\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/lifecycle/t$a;", "", "<init>", "()V", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "restoredState", "defaultState", "Landroidx/lifecycle/t;", "a", "(Landroid/os/Bundle;Landroid/os/Bundle;)Landroidx/lifecycle/t;", "value", "", "b", "(Ljava/lang/Object;)Z", "lifecycle-viewmodel-savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final t a(Bundle restoredState, Bundle defaultState) {
            if (restoredState == null) {
                restoredState = defaultState;
            }
            if (restoredState == null) {
                return new t();
            }
            ClassLoader classLoader = t.class.getClassLoader();
            Intrinsics.g(classLoader);
            restoredState.setClassLoader(classLoader);
            return new t(vza.P(vza.a(restoredState)));
        }

        public final boolean b(Object value) {
            return pza.a(value);
        }

        private Companion() {
        }
    }

    public t(Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "initialState");
        this.liveDatas = new LinkedHashMap();
        this.impl = new oza(map);
    }

    public final <T> T a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) this.impl.b(key);
    }

    public final <T> p58<T> b(String key, T initialValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.liveDatas.containsKey(key)) {
            throw new IllegalArgumentException(qza.b(key).toString());
        }
        return this.impl.c(key, initialValue);
    }

    public final zza.b c() {
        return this.impl.getSavedStateProvider();
    }

    public final <T> void d(String key, T value) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (INSTANCE.b(value)) {
            Object obj = this.liveDatas.get(key);
            u48 u48Var = obj instanceof u48 ? (u48) obj : null;
            if (u48Var != null) {
                u48Var.o(value);
            }
            this.impl.g(key, value);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't put value with type ");
        Intrinsics.g(value);
        sb.append(value.getClass());
        sb.append(" into saved state");
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public final void e(String key, zza.b provider) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.impl.h(key, provider);
    }

    public t() {
        this.liveDatas = new LinkedHashMap();
        this.impl = new oza(null, 1, null);
    }
}
