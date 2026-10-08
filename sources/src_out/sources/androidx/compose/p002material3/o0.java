package androidx.compose.p002material3;

import android.content.Context;
import android.view.Window;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.p004runtime.f;
import androidx.compose.p004runtime.s0;
import androidx.compose.ui.platform.AbstractComposeView;
import com.google.inputmethod.gp1;
import com.google.inputmethod.o58;
import com.google.inputmethod.s6b;
import com.google.inputmethod.saa;
import com.google.inputmethod.z93;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000e\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\fH\u0017¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R7\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010#\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8\u0014@RX\u0094\u000e¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Landroidx/compose/material3/o0;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Lcom/google/android/z93;", "Landroid/content/Context;", "context", "Landroid/view/Window;", "window", "<init>", "(Landroid/content/Context;Landroid/view/Window;)V", "Landroidx/compose/runtime/f;", "parent", "Lkotlin/Function0;", "", "content", "e", "(Landroidx/compose/runtime/f;Lkotlin/jvm/functions/Function2;)V", "Content", "(Landroidx/compose/runtime/d;I)V", "a", "Landroid/view/Window;", "getWindow", "()Landroid/view/Window;", "<set-?>", "b", "Lcom/google/android/o58;", "getContent", "()Lkotlin/jvm/functions/Function2;", "setContent", "(Lkotlin/jvm/functions/Function2;)V", "", "value", "c", "Z", "getShouldCreateCompositionOnAttachedToWindow", "()Z", "shouldCreateCompositionOnAttachedToWindow", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class o0 extends AbstractComposeView implements z93 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Window window;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final o58 content;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean shouldCreateCompositionOnAttachedToWindow;

    public o0(Context context, Window window) {
        super(context, null, 0, 6, null);
        this.window = window;
        this.content = s0.e(gp1.a.a(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(o0 o0Var, int i, d dVar, int i2) {
        o0Var.Content(dVar, saa.a(i | 1));
        return Unit.a;
    }

    private final Function2<d, Integer, Unit> getContent() {
        return (Function2) this.content.getValue();
    }

    private final void setContent(Function2<? super d, ? super Integer, Unit> function2) {
        this.content.setValue(function2);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void Content(d dVar, final int i) {
        int i2;
        d dVarF = dVar.F(576708319);
        if ((i & 6) == 0) {
            i2 = (dVarF.T(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (dVarF.g((i2 & 3) != 2, i2 & 1)) {
            if (e.k()) {
                e.o(576708319, i2, -1, "androidx.compose.material3.ModalBottomSheetDialogLayout.Content (ModalBottomSheet.android.kt:437)");
            }
            getContent().invoke(dVarF, 0);
            if (e.k()) {
                e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: androidx.compose.material3.n0
                public final Object invoke(Object obj, Object obj2) {
                    return o0.d(this.a, i, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public final void e(f parent, Function2<? super d, ? super Integer, Unit> content) {
        setParentCompositionContext(parent);
        setContent(content);
        this.shouldCreateCompositionOnAttachedToWindow = true;
        createComposition();
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    @Override // com.google.inputmethod.z93
    public Window getWindow() {
        return this.window;
    }
}
