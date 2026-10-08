package com.google.inputmethod;

import androidx.compose.p001foundation.interaction.a;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/google/android/do3;", "", "<init>", "()V", "Lcom/google/android/i26;", "interaction", "Lcom/google/android/kr;", "Lcom/google/android/ff3;", "a", "(Lcom/google/android/i26;)Lcom/google/android/kr;", "b", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class do3 {
    public static final do3 a = new do3();

    private do3() {
    }

    public final kr<ff3> a(i26 interaction) {
        if ((interaction instanceof a.b) || (interaction instanceof zf3) || (interaction instanceof yf5) || (interaction instanceof lk4)) {
            return eo3.b;
        }
        return null;
    }

    public final kr<ff3> b(i26 interaction) {
        if (!(interaction instanceof a.b) && !(interaction instanceof zf3)) {
            if (interaction instanceof yf5) {
                return eo3.d;
            }
            if (interaction instanceof lk4) {
                return eo3.c;
            }
            return null;
        }
        return eo3.c;
    }
}
