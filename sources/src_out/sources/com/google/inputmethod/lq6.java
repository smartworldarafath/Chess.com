package com.google.inputmethod;

import androidx.compose.ui.layout.o;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J5\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J_\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H&¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010 R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010!R\u0011\u0010%\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010)\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lcom/google/android/lq6;", "Lcom/google/android/bu6;", "Lcom/google/android/kq6;", "Lcom/google/android/rp6;", "itemProvider", "Lcom/google/android/wt6;", "measureScope", "", "defaultMainAxisSpacing", "<init>", "(Lcom/google/android/rp6;Lcom/google/android/wt6;I)V", "index", "lane", "span", "Lcom/google/android/kx1;", "constraints", "d", "(IIIJ)Lcom/google/android/kq6;", "mainAxisSpacing", "e", "(IJIII)Lcom/google/android/kq6;", "", "key", "contentType", "crossAxisSize", "", "Landroidx/compose/ui/layout/o;", "placeables", "c", "(ILjava/lang/Object;Ljava/lang/Object;IILjava/util/List;JII)Lcom/google/android/kq6;", "b", "Lcom/google/android/rp6;", "Lcom/google/android/wt6;", "I", "Lcom/google/android/ot6;", "g", "()Lcom/google/android/ot6;", "keyIndexMap", "Lcom/google/android/x06;", "f", "()Lcom/google/android/x06;", "headerIndices", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class lq6 extends bu6<kq6> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final rp6 itemProvider;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final wt6 measureScope;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int defaultMainAxisSpacing;

    public lq6(rp6 rp6Var, wt6 wt6Var, int i) {
        this.itemProvider = rp6Var;
        this.measureScope = wt6Var;
        this.defaultMainAxisSpacing = i;
    }

    public abstract kq6 c(int index, Object key, Object contentType, int crossAxisSize, int mainAxisSpacing, List<? extends o> placeables, long constraints, int lane, int span);

    @Override // com.google.inputmethod.bu6
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public kq6 a(int index, int lane, int span, long constraints) {
        return e(index, constraints, lane, span, this.defaultMainAxisSpacing);
    }

    public final kq6 e(int index, long constraints, int lane, int span, int mainAxisSpacing) {
        int iM;
        Object objD = this.itemProvider.d(index);
        Object objF = this.itemProvider.f(index);
        List<o> listB = b(this.measureScope, index, constraints);
        if (kx1.j(constraints)) {
            iM = kx1.n(constraints);
        } else {
            if (!kx1.i(constraints)) {
                cx5.a("does not have fixed height");
            }
            iM = kx1.m(constraints);
        }
        return c(index, objD, objF, iM, mainAxisSpacing, listB, constraints, lane, span);
    }

    public final x06 f() {
        return this.itemProvider.e();
    }

    public final ot6 g() {
        return this.itemProvider.b();
    }
}
