package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/google/android/f9$g;", "mediaType", "", "maxItems", "", "isOrderedSelection", "Lcom/google/android/f9$b;", "defaultTab", "Lcom/google/android/f99;", "a", "(Lcom/google/android/f9$g;IZLcom/google/android/f9$b;)Lcom/google/android/f99;", "activity"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class g99 {
    public static final f99 a(f9.g gVar, int i, boolean z, f9.b bVar) {
        Intrinsics.checkNotNullParameter(gVar, "mediaType");
        Intrinsics.checkNotNullParameter(bVar, "defaultTab");
        return new f99.a().d(gVar).c(i).e(z).b(bVar).a();
    }

    public static /* synthetic */ f99 b(f9.g gVar, int i, boolean z, f9.b bVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            gVar = f9.c.a;
        }
        if ((i2 & 2) != 0) {
            i = d9.INSTANCE.a();
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        if ((i2 & 8) != 0) {
            bVar = f9.b.a.a;
        }
        return a(gVar, i, z, bVar);
    }
}
