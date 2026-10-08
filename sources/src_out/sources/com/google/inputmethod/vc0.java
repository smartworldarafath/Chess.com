package com.google.inputmethod;

import com.google.android.kd8;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\fR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/google/android/vc0;", "", "Lcom/google/android/kd8;", "navigationEventDispatcher", "Lcom/google/android/jq8;", "onBackPressedDispatcher", "<init>", "(Lcom/google/android/kd8;Lcom/google/android/jq8;)V", "Lcom/google/android/uc0;", "handler", "", "a", "(Lcom/google/android/uc0;)V", "b", "Lcom/google/android/kd8;", "Lcom/google/android/jq8;", "activity-compose"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class vc0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final kd8 navigationEventDispatcher;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final jq8 onBackPressedDispatcher;

    public vc0(kd8 kd8Var, jq8 jq8Var) {
        this.navigationEventDispatcher = kd8Var;
        this.onBackPressedDispatcher = jq8Var;
        if ((kd8Var == null ? jq8Var : kd8Var) == null) {
            throw new IllegalArgumentException("At least one dispatcher (NavigationEventDispatcher or OnBackPressedDispatcher) must be non-null.");
        }
    }

    public final void a(uc0 handler) {
        kd8 kd8Var = this.navigationEventDispatcher;
        if (kd8Var != null) {
            kd8.b(kd8Var, handler.a(), 0, 2, (Object) null);
            return;
        }
        jq8 jq8Var = this.onBackPressedDispatcher;
        if (jq8Var == null) {
            throw new IllegalStateException("Unreachable");
        }
        jq8Var.g(handler.getOnBackPressedCallback());
    }

    public final void b(uc0 handler) throws Exception {
        if (this.navigationEventDispatcher != null) {
            handler.a().x();
        } else {
            if (this.onBackPressedDispatcher == null) {
                throw new IllegalStateException("Unreachable");
            }
            handler.getOnBackPressedCallback().remove();
        }
    }
}
