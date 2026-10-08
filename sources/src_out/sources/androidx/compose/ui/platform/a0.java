package androidx.compose.ui.platform;

import com.google.inputmethod.q16;
import com.google.inputmethod.t04;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/a0;", "", "", "b", "()Z", "isWindowFocused", "Lcom/google/android/q16;", "a", "()J", "containerSize", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface a0 {
    default long a() {
        long j = t04.INVALID_ID;
        return q16.c((j & 4294967295L) | (j << 32));
    }

    boolean b();
}
