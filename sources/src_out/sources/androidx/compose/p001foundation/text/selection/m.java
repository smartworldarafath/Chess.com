package androidx.compose.p001foundation.text.selection;

import com.google.inputmethod.gba;
import com.google.inputmethod.kba;
import com.google.inputmethod.kn6;
import com.google.inputmethod.ln6;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\n\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/google/android/kn6;", "Lcom/google/android/gba;", "b", "(Lcom/google/android/kn6;)Lcom/google/android/gba;", "Lcom/google/android/rn8;", "offset", "", "a", "(Lcom/google/android/gba;J)Z", "Lcom/google/android/gba;", "invertedInfiniteRect", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class m {
    private static final gba a = new gba(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public static final boolean a(gba gbaVar, long j) {
        float left = gbaVar.getLeft();
        float right = gbaVar.getRight();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        if (left > fIntBitsToFloat || fIntBitsToFloat > right) {
            return false;
        }
        float top = gbaVar.getTop();
        float bottom = gbaVar.getBottom();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return top <= fIntBitsToFloat2 && fIntBitsToFloat2 <= bottom;
    }

    public static final gba b(kn6 kn6Var) {
        gba gbaVarE = ln6.e(kn6Var, false, 1, null);
        return kba.a(kn6Var.b0(gbaVarE.m()), kn6Var.b0(gbaVarE.g()));
    }
}
