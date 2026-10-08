package androidx.compose.p001foundation.text.contextmenu.modifier;

import androidx.compose.p001foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode;
import androidx.compose.p004runtime.p0;
import com.google.android.q22;
import com.google.android.rw0;
import com.google.inputmethod.TextContextMenuData;
import com.google.inputmethod.bs1;
import com.google.inputmethod.cs1;
import com.google.inputmethod.gba;
import com.google.inputmethod.grc;
import com.google.inputmethod.k33;
import com.google.inputmethod.kn6;
import com.google.inputmethod.mrc;
import com.google.inputmethod.p9d;
import com.google.inputmethod.prc;
import com.google.inputmethod.q6c;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.s;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003Be\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001e\u0010\n\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0006\u0012\u001e\u0010\u000b\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0006\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\r\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0015J\r\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0015J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\u0013R:\u0010\n\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R:\u0010\u000b\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010(\u001a\u0004\b.\u0010*\"\u0004\b/\u0010,R0\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010(\u001a\u0004\b1\u0010*\"\u0004\b2\u0010,R\u0018\u00106\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u001b\u0010:\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010!R\u0016\u0010=\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006>"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuToolbarHandlerNode;", "Lcom/google/android/k33;", "Lcom/google/android/bs1;", "Lcom/google/android/grc;", "Lcom/google/android/p9d;", "requester", "Lkotlin/Function1;", "Lcom/google/android/q22;", "", "", "onShow", "onHide", "Lcom/google/android/kn6;", "Lcom/google/android/gba;", "computeContentBounds", "<init>", "(Lcom/google/android/p9d;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "toolbarRequester", "C3", "(Lcom/google/android/p9d;)V", "V2", "()V", "W2", "B3", "x3", "destinationCoordinates", "Lcom/google/android/rn8;", "l2", "(Lcom/google/android/kn6;)J", "P1", "(Lcom/google/android/kn6;)Lcom/google/android/gba;", "Lcom/google/android/frc;", "a0", "()Lcom/google/android/frc;", "r", "Lcom/google/android/p9d;", "getRequester", "()Lcom/google/android/p9d;", "setRequester", "s", "Lkotlin/jvm/functions/Function1;", "w3", "()Lkotlin/jvm/functions/Function1;", "A3", "(Lkotlin/jvm/functions/Function1;)V", "t", "v3", "z3", "u", "getComputeContentBounds", "y3", "Lkotlinx/coroutines/s;", "v", "Lkotlinx/coroutines/s;", "textToolbarJob", "w", "Lcom/google/android/q6c;", "u3", "derivedData", "x", "Lcom/google/android/gba;", "previousContentBounds", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TextContextMenuToolbarHandlerNode extends k33 implements bs1, grc {

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private p9d requester;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private Function1<? super q22<? super Unit>, ? extends Object> onShow;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private Function1<? super q22<? super Unit>, ? extends Object> onHide;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private Function1<? super kn6, gba> computeContentBounds;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private s textToolbarJob;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final q6c derivedData = p0.e(new Function0() { // from class: com.google.android.vrc
        public final Object invoke() {
            return TextContextMenuToolbarHandlerNode.t3(this.a);
        }
    });

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private gba previousContentBounds = gba.INSTANCE.a();

    public TextContextMenuToolbarHandlerNode(p9d p9dVar, Function1<? super q22<? super Unit>, ? extends Object> function1, Function1<? super q22<? super Unit>, ? extends Object> function2, Function1<? super kn6, gba> function3) {
        this.requester = p9dVar;
        this.onShow = function1;
        this.onHide = function2;
        this.computeContentBounds = function3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextContextMenuData t3(TextContextMenuToolbarHandlerNode textContextMenuToolbarHandlerNode) {
        return textContextMenuToolbarHandlerNode.getIsAttached() ? TextContextMenuModifierKt.c(textContextMenuToolbarHandlerNode) : TextContextMenuData.INSTANCE.a();
    }

    private final TextContextMenuData u3() {
        return (TextContextMenuData) this.derivedData.getValue();
    }

    public final void A3(Function1<? super q22<? super Unit>, ? extends Object> function1) {
        this.onShow = function1;
    }

    public final void B3() {
        mrc mrcVar;
        if (getIsAttached()) {
            s sVar = this.textToolbarJob;
            if ((sVar == null || !sVar.b()) && (mrcVar = (mrc) cs1.a(this, prc.f())) != null) {
                this.textToolbarJob = rw0.d(L2(), (CoroutineContext) null, CoroutineStart.d, new TextContextMenuToolbarHandlerNode$show$1(this, mrcVar, null), 1, (Object) null);
            }
        }
    }

    public final void C3(p9d toolbarRequester) {
        this.requester.d(null);
        this.requester = toolbarRequester;
        toolbarRequester.d(this);
        this.requester.e(getIsAttached() ? ToolbarHandlerState.Attached : ToolbarHandlerState.Detached);
    }

    @Override // com.google.inputmethod.grc
    public gba P1(kn6 destinationCoordinates) {
        gba gbaVar;
        if (getIsAttached() && (gbaVar = (gba) this.computeContentBounds.invoke(destinationCoordinates)) != null) {
            this.previousContentBounds = gbaVar;
            return gbaVar;
        }
        return this.previousContentBounds;
    }

    @Override // androidx.compose.ui.b.c
    public void V2() {
        super.V2();
        this.requester.e(ToolbarHandlerState.Attached);
        this.requester.d(this);
    }

    @Override // androidx.compose.ui.b.c
    public void W2() {
        this.requester.e(ToolbarHandlerState.Detached);
        this.requester.d(null);
        super.W2();
    }

    @Override // com.google.inputmethod.grc
    public TextContextMenuData a0() {
        return u3();
    }

    @Override // com.google.inputmethod.grc
    public long l2(kn6 destinationCoordinates) {
        return P1(destinationCoordinates).m();
    }

    public final Function1<q22<? super Unit>, Object> v3() {
        return this.onHide;
    }

    public final Function1<q22<? super Unit>, Object> w3() {
        return this.onShow;
    }

    public final void x3() {
        s sVar = this.textToolbarJob;
        if (sVar == null) {
            return;
        }
        s.a.a(sVar, (CancellationException) null, 1, (Object) null);
        this.textToolbarJob = null;
    }

    public final void y3(Function1<? super kn6, gba> function1) {
        this.computeContentBounds = function1;
    }

    public final void z3(Function1<? super q22<? super Unit>, ? extends Object> function1) {
        this.onHide = function1;
    }
}
