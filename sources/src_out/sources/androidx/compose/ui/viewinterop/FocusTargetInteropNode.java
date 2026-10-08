package androidx.compose.ui.viewinterop;

import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.layout.PinnableContainerKt;
import androidx.compose.ui.node.l;
import com.google.inputmethod.bs1;
import com.google.inputmethod.cs1;
import com.google.inputmethod.dl4;
import com.google.inputmethod.k33;
import com.google.inputmethod.n99;
import com.google.inputmethod.on8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0005R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/viewinterop/FocusTargetInteropNode;", "Lcom/google/android/k33;", "Lcom/google/android/on8;", "Lcom/google/android/bs1;", "<init>", "()V", "Lcom/google/android/dl4;", "previousState", "currentState", "", "t3", "(Lcom/google/android/dl4;Lcom/google/android/dl4;)V", "Lcom/google/android/n99;", "u3", "()Lcom/google/android/n99;", "M1", "Landroidx/compose/ui/focus/FocusTargetNode;", "r", "Landroidx/compose/ui/focus/FocusTargetNode;", "focusTargetNode", "Lcom/google/android/n99$a;", "s", "Lcom/google/android/n99$a;", "pinnedHandle", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class FocusTargetInteropNode extends k33 implements on8, bs1 {

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final FocusTargetNode focusTargetNode = (FocusTargetNode) m3(new FocusTargetNode(0, true, new FocusTargetInteropNode$focusTargetNode$1(this), null, 9, null));

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private n99.a pinnedHandle;

    /* JADX INFO: Access modifiers changed from: private */
    public final void t3(dl4 previousState, dl4 currentState) {
        boolean zA;
        if (getIsAttached() && (zA = currentState.a()) != previousState.a()) {
            if (zA) {
                n99 n99VarU3 = u3();
                this.pinnedHandle = n99VarU3 != null ? n99VarU3.a() : null;
            } else {
                n99.a aVar = this.pinnedHandle;
                if (aVar != null) {
                    aVar.release();
                }
                this.pinnedHandle = null;
            }
        }
    }

    private final n99 u3() {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        l.a(this, new Function0<Unit>() { // from class: androidx.compose.ui.viewinterop.FocusTargetInteropNode$retrievePinnableContainer$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                m69invoke();
                return Unit.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m69invoke() {
                objectRef.element = cs1.a(this, PinnableContainerKt.a());
            }
        });
        return (n99) objectRef.element;
    }

    @Override // com.google.inputmethod.on8
    public void M1() {
        n99 n99VarU3 = u3();
        if (this.focusTargetNode.v1().a()) {
            n99.a aVar = this.pinnedHandle;
            if (aVar != null) {
                aVar.release();
            }
            this.pinnedHandle = n99VarU3 != null ? n99VarU3.a() : null;
        }
    }
}
