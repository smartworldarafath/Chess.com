package com.google.inputmethod;

import androidx.compose.ui.b;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0006R\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/google/android/ihd;", "Landroidx/compose/ui/b$c;", "Lcom/google/android/fhd;", "Lcom/google/android/nu6;", "prefetchState", "<init>", "(Lcom/google/android/nu6;)V", "p", "Lcom/google/android/nu6;", "m3", "()Lcom/google/android/nu6;", "o3", "", "q", "Ljava/lang/String;", "n3", "()Ljava/lang/String;", "traverseKey", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class ihd extends b.c implements fhd {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private nu6 prefetchState;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final String traverseKey = "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode";

    public ihd(nu6 nu6Var) {
        this.prefetchState = nu6Var;
    }

    /* JADX INFO: renamed from: m3, reason: from getter */
    public final nu6 getPrefetchState() {
        return this.prefetchState;
    }

    @Override // com.google.inputmethod.fhd
    /* JADX INFO: renamed from: n3, reason: from getter */
    public String getTraverseKey() {
        return this.traverseKey;
    }

    public final void o3(nu6 nu6Var) {
        this.prefetchState = nu6Var;
    }
}
