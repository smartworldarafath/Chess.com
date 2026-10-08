package androidx.compose.p001foundation.layout;

import androidx.compose.ui.b;
import androidx.compose.ui.platform.InspectableValueKt;
import com.google.inputmethod.jz5;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/b;", "Landroidx/compose/foundation/layout/IntrinsicSize;", "intrinsicSize", "b", "(Landroidx/compose/ui/b;Landroidx/compose/foundation/layout/IntrinsicSize;)Landroidx/compose/ui/b;", "a", "foundation-layout"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class IntrinsicKt {
    public static final b a(b bVar, final IntrinsicSize intrinsicSize) {
        return bVar.then(new l0(intrinsicSize, true, InspectableValueKt.b() ? new Function1<jz5, Unit>() { // from class: androidx.compose.foundation.layout.IntrinsicKt$height$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            public final void a(jz5 jz5Var) {
                jz5Var.b("height");
                jz5Var.getProperties().c("intrinsicSize", intrinsicSize);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((jz5) obj);
                return Unit.a;
            }
        } : InspectableValueKt.a()));
    }

    public static final b b(b bVar, final IntrinsicSize intrinsicSize) {
        return bVar.then(new p0(intrinsicSize, true, InspectableValueKt.b() ? new Function1<jz5, Unit>() { // from class: androidx.compose.foundation.layout.IntrinsicKt$width$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            public final void a(jz5 jz5Var) {
                jz5Var.b("width");
                jz5Var.getProperties().c("intrinsicSize", intrinsicSize);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((jz5) obj);
                return Unit.a;
            }
        } : InspectableValueKt.a()));
    }
}
