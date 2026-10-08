package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/google/android/poa;", "", "<init>", "()V", "Lcom/google/android/ei1;", "contentColor", "", "lightTheme", "b", "(JZ)J", "Lcom/google/android/joa;", "a", "(JZ)Lcom/google/android/joa;", "material"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class poa {
    public static final poa a = new poa();

    private poa() {
    }

    public final RippleAlpha a(long contentColor, boolean lightTheme) {
        if (lightTheme) {
            return ((double) ki1.i(contentColor)) > 0.5d ? yoa.d : yoa.e;
        }
        return yoa.f;
    }

    public final long b(long contentColor, boolean lightTheme) {
        return (lightTheme || ((double) ki1.i(contentColor)) >= 0.5d) ? contentColor : ei1.INSTANCE.j();
    }
}
