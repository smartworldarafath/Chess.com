package com.google.inputmethod;

import androidx.p008glance.p010session.SessionManagerImpl;
import androidx.p008glance.p010session.SessionWorker;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0017\u0010\u0004\u001a\u00020\u00008G¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/google/android/ejb;", "a", "Lcom/google/android/ejb;", "()Lcom/google/android/ejb;", "GlanceSessionManager", "glance_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class fjb {
    private static final ejb a = new SessionManagerImpl(SessionWorker.class);

    public static final ejb a() {
        return a;
    }
}
