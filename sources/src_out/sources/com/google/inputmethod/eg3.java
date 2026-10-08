package com.google.inputmethod;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0005\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\b\u001a\u00020\u0007*\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\u0004¢\u0006\u0004\b\b\u0010\tR&\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/google/android/eg3;", "T", "", "<init>", "()V", "", "position", "", "a", "(Ljava/lang/Object;F)V", "", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "anchors", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class eg3<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Map<T, Float> anchors = new LinkedHashMap();

    public final void a(T t, float f) {
        this.anchors.put(t, Float.valueOf(f));
    }

    public final Map<T, Float> b() {
        return this.anchors;
    }
}
