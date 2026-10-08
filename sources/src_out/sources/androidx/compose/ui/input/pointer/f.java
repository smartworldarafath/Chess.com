package androidx.compose.ui.input.pointer;

import com.google.android.r43;
import com.google.inputmethod.rn8;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0003\u001a\u0011\u0010\u0007\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\u0003\u001a\u0011\u0010\b\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\b\u0010\u0003\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\f\u001a\u00020\t*\u00020\u0000¢\u0006\u0004\b\f\u0010\u000b\u001a\u001d\u0010\u000e\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0012\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a!\u0010\u0016\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/input/pointer/i;", "", "a", "(Landroidx/compose/ui/input/pointer/i;)Z", "b", "c", "d", "j", "k", "Lcom/google/android/rn8;", "g", "(Landroidx/compose/ui/input/pointer/i;)J", "h", "ignoreConsumed", "i", "(Landroidx/compose/ui/input/pointer/i;Z)J", "Lcom/google/android/q16;", "size", "e", "(Landroidx/compose/ui/input/pointer/i;J)Z", "Lcom/google/android/tsb;", "extendedTouchPadding", "f", "(Landroidx/compose/ui/input/pointer/i;JJ)Z", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class f {
    public static final boolean a(PointerInputChange pointerInputChange) {
        return (pointerInputChange.q() || pointerInputChange.getPreviousPressed() || !pointerInputChange.getPressed()) ? false : true;
    }

    public static final boolean b(PointerInputChange pointerInputChange) {
        return !pointerInputChange.getPreviousPressed() && pointerInputChange.getPressed();
    }

    public static final boolean c(PointerInputChange pointerInputChange) {
        return (pointerInputChange.q() || !pointerInputChange.getPreviousPressed() || pointerInputChange.getPressed()) ? false : true;
    }

    public static final boolean d(PointerInputChange pointerInputChange) {
        return pointerInputChange.getPreviousPressed() && !pointerInputChange.getPressed();
    }

    @r43
    public static final boolean e(PointerInputChange pointerInputChange, long j) {
        long position = pointerInputChange.getPosition();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (position >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (position & 4294967295L));
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return (fIntBitsToFloat > ((float) i)) | (fIntBitsToFloat < 0.0f) | (fIntBitsToFloat2 < 0.0f) | (fIntBitsToFloat2 > ((float) i2));
    }

    public static final boolean f(PointerInputChange pointerInputChange, long j, long j2) {
        boolean zI = j.i(pointerInputChange.getType(), j.INSTANCE.d());
        long position = pointerInputChange.getPosition();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (position >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (position & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32));
        float f = zI ? 1.0f : 0.0f;
        float f2 = fIntBitsToFloat3 * f;
        float f3 = ((int) (j >> 32)) + f2;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * f;
        return (fIntBitsToFloat > f3) | (fIntBitsToFloat < (-f2)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((int) (j & 4294967295L)) + fIntBitsToFloat4);
    }

    public static final long g(PointerInputChange pointerInputChange) {
        return i(pointerInputChange, false);
    }

    public static final long h(PointerInputChange pointerInputChange) {
        return i(pointerInputChange, true);
    }

    private static final long i(PointerInputChange pointerInputChange, boolean z) {
        return (z || !pointerInputChange.q()) ? rn8.p(pointerInputChange.getPosition(), pointerInputChange.getPreviousPosition()) : rn8.INSTANCE.c();
    }

    public static final boolean j(PointerInputChange pointerInputChange) {
        return !rn8.j(i(pointerInputChange, false), rn8.INSTANCE.c());
    }

    public static final boolean k(PointerInputChange pointerInputChange) {
        return !rn8.j(i(pointerInputChange, true), rn8.INSTANCE.c());
    }
}
