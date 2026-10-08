package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0006\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/google/android/pp5;", "a", "Lcom/google/android/pp5;", "_clear", "Lcom/google/android/vj5$a;", "(Lcom/google/android/vj5$a;)Lcom/google/android/pp5;", "Clear", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class wd1 {
    private static pp5 a;

    public static final pp5 a(vj5.a aVar) {
        pp5 pp5Var = a;
        if (pp5Var != null) {
            Intrinsics.g(pp5Var);
            return pp5Var;
        }
        pp5.a aVar2 = new pp5.a("Filled.Clear", ff3.i(24.0f), ff3.i(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int iB = a3e.b();
        SolidColor solidColor = new SolidColor(ei1.INSTANCE.a(), null);
        int iA = wbc.INSTANCE.a();
        int iA2 = ybc.INSTANCE.a();
        d39 d39Var = new d39();
        d39Var.j(19.0f, 6.41f);
        d39Var.h(17.59f, 5.0f);
        d39Var.h(12.0f, 10.59f);
        d39Var.h(6.41f, 5.0f);
        d39Var.h(5.0f, 6.41f);
        d39Var.h(10.59f, 12.0f);
        d39Var.h(5.0f, 17.59f);
        d39Var.h(6.41f, 19.0f);
        d39Var.h(12.0f, 13.41f);
        d39Var.h(17.59f, 19.0f);
        d39Var.h(19.0f, 17.59f);
        d39Var.h(13.41f, 12.0f);
        d39Var.b();
        pp5 pp5VarF = aVar2.c(d39Var.e(), (14336 & 2) != 0 ? a3e.b() : iB, (14336 & 4) != 0 ? "" : "", (14336 & 8) != 0 ? null : solidColor, (14336 & 16) != 0 ? 1.0f : 1.0f, (14336 & 32) == 0 ? null : null, (14336 & 64) != 0 ? 1.0f : 1.0f, (14336 & 128) != 0 ? 0.0f : 1.0f, (14336 & 256) != 0 ? a3e.c() : iA, (14336 & 512) != 0 ? a3e.d() : iA2, (14336 & 1024) != 0 ? 4.0f : 1.0f, (14336 & 2048) != 0 ? 0.0f : 0.0f, (14336 & 4096) == 0 ? 0.0f : 1.0f, (14336 & 8192) != 0 ? 0.0f : 0.0f).f();
        a = pp5VarF;
        Intrinsics.g(pp5VarF);
        return pp5VarF;
    }
}
