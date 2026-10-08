package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import com.google.inputmethod.rn8;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/input/pointer/b;", "", "<init>", "()V", "Landroid/view/MotionEvent;", "motionEvent", "", "index", "Lcom/google/android/rn8;", "a", "(Landroid/view/MotionEvent;I)J", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class b {
    public static final b a = new b();

    private b() {
    }

    public final long a(MotionEvent motionEvent, int index) {
        float rawX = motionEvent.getRawX(index);
        return rn8.e((((long) Float.floatToRawIntBits(motionEvent.getRawY(index))) & 4294967295L) | (Float.floatToRawIntBits(rawX) << 32));
    }
}
