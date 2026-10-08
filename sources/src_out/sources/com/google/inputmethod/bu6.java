package com.google.inputmethod;

import androidx.compose.ui.layout.o;
import com.google.inputmethod.yt6;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b!\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\f\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f*\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/google/android/bu6;", "Lcom/google/android/yt6;", "T", "", "<init>", "()V", "", "index", "lane", "span", "Lcom/google/android/kx1;", "constraints", "a", "(IIIJ)Lcom/google/android/yt6;", "Lcom/google/android/wt6;", "", "Landroidx/compose/ui/layout/o;", "b", "(Lcom/google/android/wt6;IJ)Ljava/util/List;", "Lcom/google/android/o48;", "Lcom/google/android/o48;", "placeablesCache", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class bu6<T extends yt6> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final o48<List<o>> placeablesCache = f16.c();

    public abstract T a(int index, int lane, int span, long constraints);

    public final List<o> b(wt6 wt6Var, int i, long j) {
        List<o> listB = this.placeablesCache.b(i);
        if (listB != null) {
            return listB;
        }
        List<dj7> listC2 = wt6Var.C2(i);
        int size = listC2.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(listC2.get(i2).r0(j));
        }
        this.placeablesCache.r(i, arrayList);
        return arrayList;
    }
}
