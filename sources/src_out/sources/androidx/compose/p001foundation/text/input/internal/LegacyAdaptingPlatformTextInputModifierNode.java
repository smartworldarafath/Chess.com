package androidx.compose.p001foundation.text.input.internal;

import androidx.compose.p001foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.p004runtime.s0;
import androidx.compose.ui.b;
import androidx.compose.ui.platform.CompositionLocalsKt;
import com.google.android.q22;
import com.google.android.rw0;
import com.google.inputmethod.ac9;
import com.google.inputmethod.bs1;
import com.google.inputmethod.cs1;
import com.google.inputmethod.dz4;
import com.google.inputmethod.hyb;
import com.google.inputmethod.k07;
import com.google.inputmethod.kn6;
import com.google.inputmethod.o58;
import com.google.inputmethod.p7e;
import com.google.inputmethod.yb9;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.s;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J5\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\"\u0010\u001d\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u0018H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\"\u0010\t\u001a\u00020\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010\u000b\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R/\u00105\u001a\u0004\u0018\u00010\u00142\b\u0010/\u001a\u0004\u0018\u00010\u00148V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u0010\u0017R\u0016\u00109\u001a\u0004\u0018\u0001068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<¨\u0006>"}, d2 = {"Landroidx/compose/foundation/text/input/internal/LegacyAdaptingPlatformTextInputModifierNode;", "Landroidx/compose/ui/b$c;", "Lcom/google/android/yb9;", "Lcom/google/android/bs1;", "Lcom/google/android/dz4;", "Landroidx/compose/foundation/text/input/internal/b$a;", "Landroidx/compose/foundation/text/input/internal/b;", "serviceAdapter", "Lcom/google/android/k07;", "legacyTextFieldState", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "textFieldSelectionManager", "<init>", "(Landroidx/compose/foundation/text/input/internal/b;Lcom/google/android/k07;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)V", "", "o3", "(Landroidx/compose/foundation/text/input/internal/b;)V", "V2", "()V", "W2", "Lcom/google/android/kn6;", "coordinates", "D", "(Lcom/google/android/kn6;)V", "Lkotlin/Function2;", "Lcom/google/android/ac9;", "Lcom/google/android/q22;", "", "", "block", "Lkotlinx/coroutines/s;", "i2", "(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/s;", "p", "Landroidx/compose/foundation/text/input/internal/b;", "q", "Lcom/google/android/k07;", "g1", "()Lcom/google/android/k07;", "n3", "(Lcom/google/android/k07;)V", "r", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "J0", "()Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "p3", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)V", "<set-?>", "s", "Lcom/google/android/o58;", "h0", "()Lcom/google/android/kn6;", "m3", "layoutCoordinates", "Lcom/google/android/hyb;", "getSoftwareKeyboardController", "()Lcom/google/android/hyb;", "softwareKeyboardController", "Lcom/google/android/p7e;", "getViewConfiguration", "()Lcom/google/android/p7e;", "viewConfiguration", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LegacyAdaptingPlatformTextInputModifierNode extends b.c implements yb9, bs1, dz4, b.a {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private b serviceAdapter;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private k07 legacyTextFieldState;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private TextFieldSelectionManager textFieldSelectionManager;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final o58 layoutCoordinates = s0.e(null, null, 2, null);

    public LegacyAdaptingPlatformTextInputModifierNode(b bVar, k07 k07Var, TextFieldSelectionManager textFieldSelectionManager) {
        this.serviceAdapter = bVar;
        this.legacyTextFieldState = k07Var;
        this.textFieldSelectionManager = textFieldSelectionManager;
    }

    private void m3(kn6 kn6Var) {
        this.layoutCoordinates.setValue(kn6Var);
    }

    @Override // com.google.inputmethod.dz4
    public void D(kn6 coordinates) {
        m3(coordinates);
    }

    @Override // androidx.compose.foundation.text.input.internal.b.a
    /* JADX INFO: renamed from: J0, reason: from getter */
    public TextFieldSelectionManager getTextFieldSelectionManager() {
        return this.textFieldSelectionManager;
    }

    @Override // androidx.compose.ui.b.c
    public void V2() {
        this.serviceAdapter.j(this);
    }

    @Override // androidx.compose.ui.b.c
    public void W2() {
        this.serviceAdapter.l(this);
    }

    @Override // androidx.compose.foundation.text.input.internal.b.a
    /* JADX INFO: renamed from: g1, reason: from getter */
    public k07 getLegacyTextFieldState() {
        return this.legacyTextFieldState;
    }

    @Override // androidx.compose.foundation.text.input.internal.b.a
    public hyb getSoftwareKeyboardController() {
        return (hyb) cs1.a(this, CompositionLocalsKt.r());
    }

    @Override // androidx.compose.foundation.text.input.internal.b.a
    public p7e getViewConfiguration() {
        return (p7e) cs1.a(this, CompositionLocalsKt.u());
    }

    @Override // androidx.compose.foundation.text.input.internal.b.a
    public kn6 h0() {
        return (kn6) this.layoutCoordinates.getValue();
    }

    @Override // androidx.compose.foundation.text.input.internal.b.a
    public s i2(Function2<? super ac9, ? super q22<?>, ? extends Object> block) {
        if (getIsAttached()) {
            return rw0.d(L2(), (CoroutineContext) null, CoroutineStart.d, new LegacyAdaptingPlatformTextInputModifierNode$launchTextInputSession$1(this, block, null), 1, (Object) null);
        }
        return null;
    }

    public void n3(k07 k07Var) {
        this.legacyTextFieldState = k07Var;
    }

    public final void o3(b serviceAdapter) {
        if (getIsAttached()) {
            this.serviceAdapter.a();
            this.serviceAdapter.l(this);
        }
        this.serviceAdapter = serviceAdapter;
        if (getIsAttached()) {
            this.serviceAdapter.j(this);
        }
    }

    public void p3(TextFieldSelectionManager textFieldSelectionManager) {
        this.textFieldSelectionManager = textFieldSelectionManager;
    }
}
