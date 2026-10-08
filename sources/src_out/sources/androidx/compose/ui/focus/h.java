package androidx.compose.ui.focus;

import com.google.inputmethod.dl4;
import com.google.inputmethod.gba;
import com.google.inputmethod.y23;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u001c\b\u0002\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/ui/focus/j;", "focusability", "Lkotlin/Function2;", "Lcom/google/android/dl4;", "", "onFocusChange", "Landroidx/compose/ui/focus/g;", "a", "(ILkotlin/jvm/functions/Function2;)Landroidx/compose/ui/focus/g;", "Lcom/google/android/gba;", "c", "(Landroidx/compose/ui/focus/g;)Lcom/google/android/gba;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class h {
    public static final g a(int i, Function2<? super dl4, ? super dl4, Unit> function2) {
        return new FocusTargetNode(i, false, function2, null, 10, null);
    }

    public static /* synthetic */ g b(int i, Function2 function2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = j.INSTANCE.a();
        }
        if ((i2 & 2) != 0) {
            function2 = null;
        }
        return a(i, function2);
    }

    public static final gba c(g gVar) {
        if (!gVar.getNode().getIsAttached()) {
            return null;
        }
        dl4 dl4VarV1 = gVar.v1();
        if (!dl4VarV1.c()) {
            return null;
        }
        if (dl4VarV1.a()) {
            Intrinsics.h(gVar, "null cannot be cast to non-null type androidx.compose.ui.focus.FocusTargetNode");
            return FocusTargetNode.v3((FocusTargetNode) gVar, null, 1, null);
        }
        FocusTargetNode focusTargetNodeI = y23.r(gVar).getFocusOwner().i();
        if (focusTargetNodeI != null) {
            return focusTargetNodeI.u3(y23.o(gVar));
        }
        return null;
    }
}
