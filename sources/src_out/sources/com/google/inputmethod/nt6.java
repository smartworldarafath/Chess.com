package com.google.inputmethod;

import androidx.collection.c;
import androidx.compose.ui.layout.w;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00020\u000e2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/google/android/nt6;", "Landroidx/compose/ui/layout/w;", "Lcom/google/android/ht6;", "factory", "<init>", "(Lcom/google/android/ht6;)V", "Landroidx/compose/ui/layout/w$a;", "slotIds", "", "a", "(Landroidx/compose/ui/layout/w$a;)V", "", "slotId", "reusableSlotId", "", "b", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "Lcom/google/android/ht6;", "Lcom/google/android/d58;", "Lcom/google/android/d58;", "countPerType", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class nt6 implements w {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ht6 factory;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final d58<Object> countPerType = xl8.b();

    public nt6(ht6 ht6Var) {
        this.factory = ht6Var;
    }

    @Override // androidx.compose.ui.layout.w
    public void a(w.a slotIds) {
        this.countPerType.j();
        c<Object> cVarC = slotIds.c();
        Object[] objArr = cVarC.elements;
        long[] jArr = cVarC.nodes;
        int i = cVarC.tail;
        while (i != Integer.MAX_VALUE) {
            int i2 = (int) ((jArr[i] >> 31) & 2147483647L);
            Object obj = objArr[i];
            Object objC = this.factory.c(obj);
            int iE = this.countPerType.e(objC, 0);
            if (iE == 7) {
                slotIds.remove(obj);
            } else {
                this.countPerType.u(objC, iE + 1);
            }
            i = i2;
        }
    }

    @Override // androidx.compose.ui.layout.w
    public boolean b(Object slotId, Object reusableSlotId) {
        return Intrinsics.e(this.factory.c(slotId), this.factory.c(reusableSlotId));
    }
}
