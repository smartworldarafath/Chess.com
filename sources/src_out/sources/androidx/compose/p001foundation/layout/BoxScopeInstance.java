package androidx.compose.p001foundation.layout;

import androidx.compose.ui.b;
import androidx.compose.ui.platform.InspectableValueKt;
import com.google.inputmethod.jz5;
import com.google.inputmethod.mt0;
import com.google.inputmethod.tc;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0004*\u00020\u0004H\u0017¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/layout/BoxScopeInstance;", "Lcom/google/android/mt0;", "<init>", "()V", "Landroidx/compose/ui/b;", "Lcom/google/android/tc;", "alignment", "k", "(Landroidx/compose/ui/b;Lcom/google/android/tc;)Landroidx/compose/ui/b;", "j", "(Landroidx/compose/ui/b;)Landroidx/compose/ui/b;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BoxScopeInstance implements mt0 {
    public static final BoxScopeInstance a = new BoxScopeInstance();

    private BoxScopeInstance() {
    }

    @Override // com.google.inputmethod.mt0
    public b j(b bVar) {
        return bVar.then(new g(tc.INSTANCE.e(), true, InspectableValueKt.b() ? new Function1<jz5, Unit>() { // from class: androidx.compose.foundation.layout.BoxScopeInstance$matchParentSize$$inlined$debugInspectorInfo$1
            public final void a(jz5 jz5Var) {
                jz5Var.b("matchParentSize");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((jz5) obj);
                return Unit.a;
            }
        } : InspectableValueKt.a()));
    }

    @Override // com.google.inputmethod.mt0
    public b k(b bVar, final tc tcVar) {
        return bVar.then(new g(tcVar, false, InspectableValueKt.b() ? new Function1<jz5, Unit>() { // from class: androidx.compose.foundation.layout.BoxScopeInstance$align$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            public final void a(jz5 jz5Var) {
                jz5Var.b("align");
                jz5Var.c(tcVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((jz5) obj);
                return Unit.a;
            }
        } : InspectableValueKt.a()));
    }
}
