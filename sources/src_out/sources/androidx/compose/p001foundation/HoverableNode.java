package androidx.compose.p001foundation;

import androidx.compose.ui.b;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.e;
import androidx.compose.ui.input.pointer.g;
import com.google.android.q22;
import com.google.android.rw0;
import com.google.inputmethod.bf9;
import com.google.inputmethod.r48;
import com.google.inputmethod.t04;
import com.google.inputmethod.yf5;
import com.google.inputmethod.zf5;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.f;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u0006J'\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\fJ\u000f\u0010\u0017\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/HoverableNode;", "Lcom/google/android/bf9;", "Landroidx/compose/ui/b$c;", "Lcom/google/android/r48;", "interactionSource", "<init>", "(Lcom/google/android/r48;)V", "", "o3", "(Lcom/google/android/q22;)Ljava/lang/Object;", "p3", "q3", "()V", "r3", "Landroidx/compose/ui/input/pointer/e;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Lcom/google/android/q16;", "bounds", "x1", "(Landroidx/compose/ui/input/pointer/e;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "K0", "W2", "p", "Lcom/google/android/r48;", "Lcom/google/android/yf5;", "q", "Lcom/google/android/yf5;", "hoverInteraction", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class HoverableNode extends b.c implements bf9 {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private r48 interactionSource;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private yf5 hoverInteraction;

    public HoverableNode(r48 r48Var) {
        this.interactionSource = r48Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object o3(q22<? super Unit> q22Var) {
        HoverableNode$emitEnter$1 hoverableNode$emitEnter$1;
        yf5 yf5Var;
        if (q22Var instanceof HoverableNode$emitEnter$1) {
            hoverableNode$emitEnter$1 = (HoverableNode$emitEnter$1) q22Var;
            int i = hoverableNode$emitEnter$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                hoverableNode$emitEnter$1.label = i - t04.INVALID_ID;
            } else {
                hoverableNode$emitEnter$1 = new HoverableNode$emitEnter$1(this, q22Var);
            }
        } else {
            hoverableNode$emitEnter$1 = new HoverableNode$emitEnter$1(this, q22Var);
        }
        Object obj = hoverableNode$emitEnter$1.result;
        Object objG = a.g();
        int i2 = hoverableNode$emitEnter$1.label;
        if (i2 == 0) {
            f.b(obj);
            if (this.hoverInteraction == null) {
                yf5 yf5Var2 = new yf5();
                r48 r48Var = this.interactionSource;
                hoverableNode$emitEnter$1.L$0 = yf5Var2;
                hoverableNode$emitEnter$1.label = 1;
                if (r48Var.a(yf5Var2, hoverableNode$emitEnter$1) == objG) {
                    return objG;
                }
                yf5Var = yf5Var2;
            }
            return Unit.a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        yf5Var = (yf5) hoverableNode$emitEnter$1.L$0;
        f.b(obj);
        this.hoverInteraction = yf5Var;
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object p3(q22<? super Unit> q22Var) {
        HoverableNode$emitExit$1 hoverableNode$emitExit$1;
        if (q22Var instanceof HoverableNode$emitExit$1) {
            hoverableNode$emitExit$1 = (HoverableNode$emitExit$1) q22Var;
            int i = hoverableNode$emitExit$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                hoverableNode$emitExit$1.label = i - t04.INVALID_ID;
            } else {
                hoverableNode$emitExit$1 = new HoverableNode$emitExit$1(this, q22Var);
            }
        } else {
            hoverableNode$emitExit$1 = new HoverableNode$emitExit$1(this, q22Var);
        }
        Object obj = hoverableNode$emitExit$1.result;
        Object objG = a.g();
        int i2 = hoverableNode$emitExit$1.label;
        if (i2 == 0) {
            f.b(obj);
            yf5 yf5Var = this.hoverInteraction;
            if (yf5Var != null) {
                zf5 zf5Var = new zf5(yf5Var);
                r48 r48Var = this.interactionSource;
                hoverableNode$emitExit$1.label = 1;
                if (r48Var.a(zf5Var, hoverableNode$emitExit$1) == objG) {
                    return objG;
                }
            }
            return Unit.a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        this.hoverInteraction = null;
        return Unit.a;
    }

    private final void q3() {
        yf5 yf5Var = this.hoverInteraction;
        if (yf5Var != null) {
            this.interactionSource.b(new zf5(yf5Var));
            this.hoverInteraction = null;
        }
    }

    @Override // com.google.inputmethod.bf9
    public void K0() {
        q3();
    }

    @Override // androidx.compose.ui.b.c
    public void W2() {
        q3();
    }

    public final void r3(r48 interactionSource) {
        if (Intrinsics.e(this.interactionSource, interactionSource)) {
            return;
        }
        q3();
        this.interactionSource = interactionSource;
    }

    @Override // com.google.inputmethod.bf9
    public void x1(e pointerEvent, PointerEventPass pass, long bounds) {
        if (pass == PointerEventPass.Main) {
            int type = pointerEvent.getType();
            g.Companion companion = g.INSTANCE;
            if (g.o(type, companion.a())) {
                rw0.d(L2(), (CoroutineContext) null, (CoroutineStart) null, new C0163HoverableNode$onPointerEvent$1(this, null), 3, (Object) null);
            } else if (g.o(type, companion.b())) {
                rw0.d(L2(), (CoroutineContext) null, (CoroutineStart) null, new C0164HoverableNode$onPointerEvent$2(this, null), 3, (Object) null);
            }
        }
    }
}
