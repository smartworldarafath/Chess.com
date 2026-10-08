package androidx.compose.ui.platform;

import androidx.compose.p004runtime.s0;
import com.google.inputmethod.ff9;
import com.google.inputmethod.o58;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tR\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR+\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\r\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u001f¨\u0006!"}, d2 = {"Landroidx/compose/ui/platform/v;", "Landroidx/compose/ui/platform/a0;", "<init>", "()V", "Lkotlin/Function0;", "Landroidx/compose/ui/platform/t;", "onInitializeContainerSize", "", "e", "(Lkotlin/jvm/functions/Function0;)V", "a", "Lkotlin/jvm/functions/Function0;", "Lcom/google/android/o58;", "b", "Lcom/google/android/o58;", "_containerSize", "", "<set-?>", "c", "()Z", "f", "(Z)V", "isWindowFocused", "Lcom/google/android/ff9;", "value", "getKeyboardModifiers-k7X9c1A", "()I", "d", "(I)V", "keyboardModifiers", "Lcom/google/android/q16;", "()J", "containerSize", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v implements a0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private Function0<t> onInitializeContainerSize;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private o58<t> _containerSize;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final o58 isWindowFocused = s0.e(Boolean.FALSE, null, 2, null);

    @Override // androidx.compose.ui.platform.a0
    public long a() {
        t tVarC;
        if (this._containerSize == null) {
            Function0<t> function0 = this.onInitializeContainerSize;
            if (function0 == null || (tVarC = (t) function0.invoke()) == null) {
                tVarC = t.INSTANCE.c();
            }
            this._containerSize = s0.e(tVarC, null, 2, null);
            this.onInitializeContainerSize = null;
        }
        o58<t> o58Var = this._containerSize;
        Intrinsics.g(o58Var);
        return o58Var.getValue().getPxSize();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.platform.a0
    public boolean b() {
        return ((Boolean) this.isWindowFocused.getValue()).booleanValue();
    }

    public void d(int i) {
        b0.INSTANCE.a().setValue(ff9.a(i));
    }

    public final void e(Function0<t> onInitializeContainerSize) {
        if (this._containerSize == null) {
            this.onInitializeContainerSize = onInitializeContainerSize;
        }
    }

    public void f(boolean z) {
        this.isWindowFocused.setValue(Boolean.valueOf(z));
    }
}
