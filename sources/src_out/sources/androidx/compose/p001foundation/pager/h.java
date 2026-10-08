package androidx.compose.p001foundation.pager;

import androidx.compose.p004runtime.d;
import com.google.android.rs4;
import com.google.inputmethod.ct6;
import com.google.inputmethod.d66;
import com.google.inputmethod.kz8;
import com.google.inputmethod.py8;
import com.google.inputmethod.t48;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B?\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rR)\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Landroidx/compose/foundation/pager/h;", "Lcom/google/android/ct6;", "Lcom/google/android/py8;", "Lkotlin/Function2;", "Lcom/google/android/kz8;", "", "", "pageContent", "Lkotlin/Function1;", "", "key", "pageCount", "<init>", "(Lcom/google/android/rs4;Lkotlin/jvm/functions/Function1;I)V", "a", "Lcom/google/android/rs4;", "getPageContent", "()Lcom/google/android/rs4;", "b", "Lkotlin/jvm/functions/Function1;", "getKey", "()Lkotlin/jvm/functions/Function1;", "c", "I", "getPageCount", "()I", "Lcom/google/android/d66;", "d", "Lcom/google/android/d66;", "o", "()Lcom/google/android/d66;", "intervals", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h extends ct6<py8> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final rs4<kz8, Integer, d, Integer, Unit> pageContent;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Function1<Integer, Object> key;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int pageCount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final d66<py8> intervals;

    /* JADX WARN: Multi-variable type inference failed */
    public h(rs4<? super kz8, ? super Integer, ? super d, ? super Integer, Unit> rs4Var, Function1<? super Integer, ? extends Object> function1, int i) {
        this.pageContent = rs4Var;
        this.key = function1;
        this.pageCount = i;
        t48 t48Var = new t48();
        t48Var.b(i, new py8(function1, rs4Var));
        this.intervals = t48Var;
    }

    @Override // com.google.inputmethod.ct6
    public d66<py8> o() {
        return this.intervals;
    }
}
