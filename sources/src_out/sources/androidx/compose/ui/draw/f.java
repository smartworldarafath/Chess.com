package androidx.compose.ui.draw;

import com.google.inputmethod.fz1;
import com.google.inputmethod.yg3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0005*\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nR.\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\b¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/draw/f;", "Landroidx/compose/ui/b$c;", "Lcom/google/android/yg3;", "Lkotlin/Function1;", "Lcom/google/android/fz1;", "", "onDraw", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "j", "(Lcom/google/android/fz1;)V", "p", "Lkotlin/jvm/functions/Function1;", "getOnDraw", "()Lkotlin/jvm/functions/Function1;", "m3", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class f extends androidx.compose.ui.b.c implements yg3 {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private Function1<? super fz1, Unit> onDraw;

    public f(Function1<? super fz1, Unit> function1) {
        this.onDraw = function1;
    }

    @Override // com.google.inputmethod.yg3
    public void j(fz1 fz1Var) {
        this.onDraw.invoke(fz1Var);
    }

    public final void m3(Function1<? super fz1, Unit> function1) {
        this.onDraw = function1;
    }
}
