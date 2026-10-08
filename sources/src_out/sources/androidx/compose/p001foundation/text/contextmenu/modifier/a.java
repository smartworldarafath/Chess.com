package androidx.compose.p001foundation.text.contextmenu.modifier;

import androidx.compose.ui.b;
import com.google.inputmethod.brc;
import com.google.inputmethod.fhd;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bR.\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\bR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/modifier/a;", "Landroidx/compose/ui/b$c;", "Lcom/google/android/fhd;", "Lkotlin/Function1;", "Lcom/google/android/brc;", "", "builder", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "p", "Lkotlin/jvm/functions/Function1;", "m3", "()Lkotlin/jvm/functions/Function1;", "setBuilder", "", "p1", "()Ljava/lang/Object;", "traverseKey", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a extends b.c implements fhd {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private Function1<? super brc, Unit> builder;

    public a(Function1<? super brc, Unit> function1) {
        this.builder = function1;
    }

    public final Function1<brc, Unit> m3() {
        return this.builder;
    }

    @Override // com.google.inputmethod.fhd
    /* JADX INFO: renamed from: p1 */
    public Object getTraverseKey() {
        return c.a;
    }
}
