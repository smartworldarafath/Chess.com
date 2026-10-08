package androidx.compose.ui.node;

import androidx.compose.ui.CombinedModifier;
import com.google.inputmethod.ja;
import com.google.inputmethod.r58;
import com.google.inputmethod.uy7;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a+\u0010\u000b\u001a\u00020\n\"\b\b\u0000\u0010\u0007*\u00020\u0006*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a5\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00000\u000e*\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00000\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/b$b;", "prev", "next", "", "c", "(Landroidx/compose/ui/b$b;Landroidx/compose/ui/b$b;)I", "Landroidx/compose/ui/b$c;", "T", "Lcom/google/android/uy7;", "node", "", "e", "(Lcom/google/android/uy7;Landroidx/compose/ui/b$c;)V", "Landroidx/compose/ui/b;", "Lcom/google/android/r58;", "result", "stack", "d", "(Landroidx/compose/ui/b;Lcom/google/android/r58;Lcom/google/android/r58;)Lcom/google/android/r58;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class NodeChainKt {
    public static final int c(androidx.compose.ui.b.InterfaceC0050b interfaceC0050b, androidx.compose.ui.b.InterfaceC0050b interfaceC0050b2) {
        if (Intrinsics.e(interfaceC0050b, interfaceC0050b2)) {
            return 2;
        }
        return ja.a(interfaceC0050b, interfaceC0050b2) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final r58<androidx.compose.ui.b.InterfaceC0050b> d(androidx.compose.ui.b bVar, final r58<androidx.compose.ui.b.InterfaceC0050b> r58Var, r58<androidx.compose.ui.b> r58Var2) {
        r58Var2.c(bVar);
        Function1<androidx.compose.ui.b.InterfaceC0050b, Boolean> function1 = null;
        while (r58Var2.getSize() != 0) {
            androidx.compose.ui.b bVarU = r58Var2.u(r58Var2.getSize() - 1);
            if (bVarU instanceof CombinedModifier) {
                CombinedModifier combinedModifier = (CombinedModifier) bVarU;
                r58Var2.c(combinedModifier.getInner());
                r58Var2.c(combinedModifier.getOuter());
            } else if (bVarU instanceof androidx.compose.ui.b.InterfaceC0050b) {
                r58Var.c(bVarU);
            } else {
                if (function1 == null) {
                    function1 = new Function1<androidx.compose.ui.b.InterfaceC0050b, Boolean>() { // from class: androidx.compose.ui.node.NodeChainKt$fillVector$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final Boolean invoke(androidx.compose.ui.b.InterfaceC0050b interfaceC0050b) {
                            r58Var.c(interfaceC0050b);
                            return Boolean.TRUE;
                        }
                    };
                }
                bVarU.all(function1);
                function1 = function1;
            }
        }
        return r58Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends androidx.compose.ui.b.c> void e(uy7<T> uy7Var, androidx.compose.ui.b.c cVar) {
        Intrinsics.h(cVar, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
        uy7Var.c(cVar);
    }
}
