package com.google.inputmethod;

import androidx.compose.p004runtime.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.m;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a+\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/google/android/uub;", "", "Lcom/google/android/iq1;", "a", "(Lcom/google/android/uub;)Ljava/util/List;", "", "group", "", "child", "b", "(Lcom/google/android/uub;ILjava/lang/Object;)Ljava/util/List;", "runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class vub {
    public static final List<ComposeStackTraceFrame> a(uub uubVar) {
        return (uubVar.getIsClosed() || uubVar.M()) ? m.p() : gub.f(uubVar.getTable().getAddressSpace(), uubVar.getParent(), Integer.valueOf(uubVar.C()), new k9a(uubVar));
    }

    public static final List<ComposeStackTraceFrame> b(uub uubVar, int i, Object obj) {
        k9a k9aVar = new k9a(uubVar);
        hub addressSpace = uubVar.getTable().getAddressSpace();
        int[] groups = addressSpace.getGroups();
        int i2 = i;
        while (i2 > 0) {
            k9aVar.f(uubVar.F(i2), uubVar.H(i2), addressSpace.F(i2), obj);
            obj = addressSpace.d(i2);
            i2 = groups[i2 + 2];
        }
        if (!(i2 != 0)) {
            e.b("Traversing parent of group not in the slot table: " + i);
        }
        return k9aVar.i();
    }
}
