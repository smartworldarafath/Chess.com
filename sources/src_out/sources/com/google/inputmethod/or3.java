package com.google.inputmethod;

import androidx.compose.ui.layout.j;
import androidx.compose.ui.layout.o;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\r\u001a\u00020\n*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/google/android/or3;", "Lcom/google/android/ej7;", "<init>", "()V", "Landroidx/compose/ui/layout/j;", "", "Lcom/google/android/dj7;", "measurables", "Lcom/google/android/kx1;", "constraints", "Lcom/google/android/fj7;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/j;Ljava/util/List;J)Lcom/google/android/fj7;", "measure", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/o$a;", "", "b", "Lkotlin/jvm/functions/Function1;", "placementBlock", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class or3 implements ej7 {
    public static final or3 a = new or3();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final Function1<o.a, Unit> placementBlock = new Function1() { // from class: com.google.android.nr3
        public final Object invoke(Object obj) {
            return or3.b((o.a) obj);
        }
    };

    private or3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(o.a aVar) {
        return Unit.a;
    }

    @Override // com.google.inputmethod.ej7
    /* JADX INFO: renamed from: measure-3p2s80s */
    public fj7 mo0measure3p2s80s(j jVar, List<? extends dj7> list, long j) {
        return j.Q1(jVar, kx1.l(j), kx1.k(j), null, placementBlock, 4, null);
    }
}
