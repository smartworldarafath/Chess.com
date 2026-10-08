package com.google.inputmethod;

import androidx.compose.p004runtime.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.f;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001d\u0010\u0007\u001a\u00020\u0006*\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a9\u0010\u0012\u001a\u00060\u0000j\u0002`\u000e*\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\u00002\n\u0010\u000f\u001a\u00060\u0000j\u0002`\u000e2\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a#\u0010\u0017\u001a\u00020\u00002\n\u0010\u0015\u001a\u00060\u0000j\u0002`\u00142\u0006\u0010\u0016\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a7\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e*\u00020\u00192\n\u0010\u001a\u001a\u00060\u0000j\u0002`\u000e2\b\u0010\u001b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001d\u001a\u00020\u001cH\u0000¢\u0006\u0004\b \u0010!\"\u0014\u0010$\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#*\f\b\u0000\u0010%\"\u00020\u00002\u00020\u0000*\f\b\u0000\u0010&\"\u00020\u00002\u00020\u0000*\f\b\u0000\u0010'\"\u00020\u00002\u00020\u0000¨\u0006("}, d2 = {"", "capacity", "", "i", "(I)[I", "offset", "", "h", "([II)V", "", "", "j", "(I)[Ljava/lang/Object;", "key", "Landroidx/compose/runtime/composer/linkbuffer/GroupAddress;", "parent", "Landroidx/compose/runtime/composer/linkbuffer/GroupFlags;", "flags", "g", "([IIII)I", "Landroidx/compose/runtime/composer/linkbuffer/SlotAddress;", "address", "size", "k", "(II)I", "Lcom/google/android/hub;", "group", "child", "Lcom/google/android/gq1;", "traceBuilder", "", "Lcom/google/android/iq1;", "f", "(Lcom/google/android/hub;ILjava/lang/Object;Lcom/google/android/gq1;)Ljava/util/List;", "a", "Ljava/lang/Object;", "Unallocated", "GroupAddress", "SlotAddress", "SlotRange", "runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class gub {
    private static final Object a = new a();

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/google/android/gub$a", "", "", "toString", "()Ljava/lang/String;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        a() {
        }

        public String toString() {
            return "Unallocated";
        }
    }

    public static final List<ComposeStackTraceFrame> f(hub hubVar, int i, Object obj, gq1 gq1Var) {
        int[] iArrN = hubVar.n();
        int i2 = i;
        while (i2 > 0) {
            int i3 = hubVar.n()[i2 + 4];
            gq1Var.f(hubVar.n()[i2], (i3 & 16777216) == 16777216 ? hubVar.p()[(hubVar.n()[i2 + 5] >> 4) + Integer.bitCount(i3 & 8388608)] : null, hubVar.F(i2), obj);
            obj = hubVar.d(i2);
            i2 = iArrN[i2 + 2];
        }
        if (!(i2 != 0)) {
            e.b("Traversing parent of group not in the slot table: " + i);
        }
        return gq1Var.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int g(int[] iArr, int i, int i2, int i3) {
        if (iArr == null || iArr.length < 6) {
            return -1;
        }
        int i4 = iArr[3];
        if (i4 >= iArr.length) {
            i4 = iArr[1];
            if (i4 < 0) {
                return -1;
            }
            iArr[1] = iArr[i4 + 1];
        } else {
            iArr[3] = i4 + 6;
        }
        iArr[i4] = i;
        iArr[i4 + 2] = i2;
        iArr[i4 + 1] = -1;
        iArr[i4 + 3] = -1;
        iArr[i4 + 4] = i3;
        iArr[i4 + 5] = -1;
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(int[] iArr, int i) {
        if (iArr == null) {
            return;
        }
        iArr[1] = -1;
        iArr[3] = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int[] i(int i) {
        int[] iArr = new int[i];
        iArr[1] = -1;
        h(iArr, 6);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] j(int i) {
        Object[] objArr = new Object[i];
        f.G(objArr, a, 0, 0, 6, (Object) null);
        return objArr;
    }

    public static final int k(int i, int i2) {
        return (i << 4) | (i2 <= 15 ? i2 - 1 : 15);
    }
}
