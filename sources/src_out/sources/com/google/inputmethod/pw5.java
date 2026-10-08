package com.google.inputmethod;

import androidx.lifecycle.b0;
import com.google.android.j9e;
import com.google.android.rg6;
import com.google.android.v41;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\f\u001a\u00020\u000b\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R(\u0010\u0014\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/google/android/pw5;", "", "<init>", "()V", "Lcom/google/android/w8e;", "T", "Lcom/google/android/rg6;", "clazz", "Lkotlin/Function1;", "Lcom/google/android/oe2;", "initializer", "", "a", "(Lcom/google/android/rg6;Lkotlin/jvm/functions/Function1;)V", "Landroidx/lifecycle/b0$c;", "b", "()Landroidx/lifecycle/b0$c;", "", "Lcom/google/android/a9e;", "Ljava/util/Map;", "initializers", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class pw5 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Map<rg6<?>, a9e<?>> initializers = new LinkedHashMap();

    public final <T extends w8e> void a(rg6<T> clazz, Function1<? super CreationExtras, ? extends T> initializer) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        if (!this.initializers.containsKey(clazz)) {
            this.initializers.put(clazz, new a9e<>(clazz, initializer));
            return;
        }
        throw new IllegalArgumentException(("A `initializer` with the same `clazz` has already been added: " + v41.a(clazz) + '.').toString());
    }

    public final b0.c b() {
        return j9e.a.a(this.initializers.values());
    }
}
