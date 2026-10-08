package androidx.compose.p001foundation.text.selection;

import android.view.MotionEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.e;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u001a\u0010\b\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/compose/ui/input/pointer/e;", "", "b", "(Landroidx/compose/ui/input/pointer/e;)Z", "Landroidx/compose/foundation/text/selection/f;", "a", "Landroidx/compose/foundation/text/selection/f;", "()Landroidx/compose/foundation/text/selection/f;", "FirstLongPressSelectionAdjustment", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class j {
    private static final f a = f.INSTANCE.n();

    public static final f a() {
        return a;
    }

    public static final boolean b(e eVar) {
        MotionEvent motionEventG;
        List<PointerInputChange> listC = eVar.c();
        int size = listC.size();
        for (int i = 0; i < size; i++) {
            if (!androidx.compose.ui.input.pointer.j.i(listC.get(i).getType(), androidx.compose.ui.input.pointer.j.INSTANCE.b())) {
                MotionEvent motionEventG2 = eVar.g();
                if ((motionEventG2 == null || !motionEventG2.isFromSource(8194)) && ((motionEventG = eVar.g()) == null || !motionEventG.isFromSource(1048584))) {
                    return false;
                }
            }
        }
        return true;
    }
}
