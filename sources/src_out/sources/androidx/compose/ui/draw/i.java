package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.painter.Painter;
import com.google.inputmethod.d02;
import com.google.inputmethod.tc;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aM\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/b;", "Landroidx/compose/ui/graphics/painter/Painter;", "painter", "", "sizeToIntrinsics", "Lcom/google/android/tc;", "alignment", "Lcom/google/android/d02;", "contentScale", "", "alpha", "Landroidx/compose/ui/graphics/h;", "colorFilter", "a", "(Landroidx/compose/ui/b;Landroidx/compose/ui/graphics/painter/Painter;ZLcom/google/android/tc;Lcom/google/android/d02;FLandroidx/compose/ui/graphics/h;)Landroidx/compose/ui/b;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class i {
    public static final androidx.compose.ui.b a(androidx.compose.ui.b bVar, Painter painter, boolean z, tc tcVar, d02 d02Var, float f, androidx.compose.ui.graphics.h hVar) {
        return bVar.then(new PainterElement(painter, z, tcVar, d02Var, f, hVar));
    }

    public static /* synthetic */ androidx.compose.ui.b b(androidx.compose.ui.b bVar, Painter painter, boolean z, tc tcVar, d02 d02Var, float f, androidx.compose.ui.graphics.h hVar, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            tcVar = tc.INSTANCE.e();
        }
        tc tcVar2 = tcVar;
        if ((i & 8) != 0) {
            d02Var = d02.INSTANCE.f();
        }
        d02 d02Var2 = d02Var;
        if ((i & 16) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i & 32) != 0) {
            hVar = null;
        }
        return a(bVar, painter, z2, tcVar2, d02Var2, f2, hVar);
    }
}
