package com.google.inputmethod;

import androidx.compose.ui.b;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\u000e\u001a\u0004\u0018\u00010\r*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/google/android/d58;", "Lcom/google/android/uc;", "a", "", "", "b", "", "c", "(Lcom/google/android/d58;Ljava/util/Map;)Z", "Lcom/google/android/x23;", "Lcom/google/android/ni8;", "type", "stopType", "Landroidx/compose/ui/b$c;", "d", "(Lcom/google/android/x23;II)Landroidx/compose/ui/b$c;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class li8 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(d58<uc> d58Var, Map<uc, Integer> map) {
        if (d58Var == null || d58Var.get_size() != map.size()) {
            return false;
        }
        Object[] objArr = d58Var.keys;
        int[] iArr = d58Var.values;
        long[] jArr = d58Var.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        loop0: while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        int i5 = iArr[i4];
                        Integer num = map.get((uc) obj);
                        if (num == null || num.intValue() != i5) {
                            break loop0;
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b.c d(x23 x23Var, int i, int i2) {
        b.c child = x23Var.getNode().getChild();
        if (child == null || (child.getAggregateChildKindSet() & i) == 0) {
            return null;
        }
        while (child != null) {
            int kindSet = child.getKindSet();
            if ((kindSet & i2) != 0) {
                return null;
            }
            if ((kindSet & i) != 0) {
                return child;
            }
            child = child.getChild();
        }
        return null;
    }
}
