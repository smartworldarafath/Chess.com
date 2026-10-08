package com.google.inputmethod;

import com.google.android.jg1;
import com.google.android.kg1;
import com.google.android.ta2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.google.android.c9e, reason: from Kotlin metadata */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0005*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/google/android/dic;", "a", "Lcom/google/android/dic;", "VIEW_MODEL_SCOPE_LOCK", "Lcom/google/android/w8e;", "Lcom/google/android/ta2;", "(Lcom/google/android/w8e;)Lcom/google/android/ta2;", "viewModelScope", "lifecycle-viewmodel"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class dic {
    private static final com.google.android.dic a = new com.google.android.dic();

    public static final ta2 a(w8e w8eVar) {
        jg1 closeable;
        Intrinsics.checkNotNullParameter(w8eVar, "<this>");
        synchronized (a) {
            closeable = w8eVar.getCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (closeable == null) {
                closeable = kg1.b();
                w8eVar.addCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", closeable);
            }
        }
        return closeable;
    }
}
