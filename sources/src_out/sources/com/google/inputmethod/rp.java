package com.google.inputmethod;

import android.app.Application;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0007\u001a\u00028\u0000\"\b\b\u0000\u0010\u0006*\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/google/android/rp;", "Lcom/google/android/w8e;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "T", "C6", "()Landroid/app/Application;", "a", "Landroid/app/Application;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class rp extends w8e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Application application;

    public rp(Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.application = application;
    }

    public <T extends Application> T C6() {
        T t = (T) this.application;
        Intrinsics.h(t, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
        return t;
    }
}
