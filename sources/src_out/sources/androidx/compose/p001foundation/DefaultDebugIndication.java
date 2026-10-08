package androidx.compose.p001foundation;

import androidx.compose.ui.b;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import com.google.android.rw0;
import com.google.inputmethod.av5;
import com.google.inputmethod.ei1;
import com.google.inputmethod.fz1;
import com.google.inputmethod.j26;
import com.google.inputmethod.x23;
import com.google.inputmethod.yg3;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/DefaultDebugIndication;", "Lcom/google/android/av5;", "<init>", "()V", "Lcom/google/android/j26;", "interactionSource", "Lcom/google/android/x23;", "b", "(Lcom/google/android/j26;)Lcom/google/android/x23;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "DefaultDebugIndicationInstance", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class DefaultDebugIndication implements av5 {
    public static final DefaultDebugIndication a = new DefaultDebugIndication();

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\u0007*\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/DefaultDebugIndication$DefaultDebugIndicationInstance;", "Landroidx/compose/ui/b$c;", "Lcom/google/android/yg3;", "Lcom/google/android/j26;", "interactionSource", "<init>", "(Lcom/google/android/j26;)V", "", "V2", "()V", "Lcom/google/android/fz1;", "j", "(Lcom/google/android/fz1;)V", "p", "Lcom/google/android/j26;", "", "q", "Z", "isPressed", "r", "isHovered", "s", "isFocused", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class DefaultDebugIndicationInstance extends b.c implements yg3 {

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        private final j26 interactionSource;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata */
        private boolean isPressed;

        /* JADX INFO: renamed from: r, reason: from kotlin metadata */
        private boolean isHovered;

        /* JADX INFO: renamed from: s, reason: from kotlin metadata */
        private boolean isFocused;

        public DefaultDebugIndicationInstance(j26 j26Var) {
            this.interactionSource = j26Var;
        }

        @Override // androidx.compose.ui.b.c
        public void V2() {
            rw0.d(L2(), (CoroutineContext) null, (CoroutineStart) null, new C0160DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1(this, null), 3, (Object) null);
        }

        @Override // com.google.inputmethod.yg3
        public void j(fz1 fz1Var) {
            fz1Var.j1();
            if (this.isPressed) {
                DrawScope.T0(fz1Var, ei1.p(ei1.INSTANCE.a(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), 0L, fz1Var.d(), 0.0f, null, null, 0, 122, null);
            } else if (this.isHovered || this.isFocused) {
                DrawScope.T0(fz1Var, ei1.p(ei1.INSTANCE.a(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), 0L, fz1Var.d(), 0.0f, null, null, 0, 122, null);
            }
        }
    }

    private DefaultDebugIndication() {
    }

    @Override // com.google.inputmethod.av5
    public x23 b(j26 interactionSource) {
        return new DefaultDebugIndicationInstance(interactionSource);
    }

    public boolean equals(Object other) {
        return other == this;
    }

    @Override // com.google.inputmethod.av5
    public int hashCode() {
        return -1;
    }
}
