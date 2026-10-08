package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/google/android/tj5;", "", "<init>", "()V", "Lcom/google/android/pp5;", "b", "Lcom/google/android/pp5;", "_keyboardArrowLeft", "c", "_keyboardArrowRight", "a", "()Lcom/google/android/pp5;", "KeyboardArrowLeft", "KeyboardArrowRight", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class tj5 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static pp5 _keyboardArrowLeft;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static pp5 _keyboardArrowRight;
    public static final tj5 a = new tj5();
    public static final int d = 8;

    private tj5() {
    }

    public final pp5 a() {
        pp5 pp5Var = _keyboardArrowLeft;
        if (pp5Var != null) {
            Intrinsics.g(pp5Var);
            return pp5Var;
        }
        pp5.a aVar = new pp5.a("AutoMirrored.Filled.KeyboardArrowLeft", ff3.i(24.0f), ff3.i(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int iB = a3e.b();
        SolidColor solidColor = new SolidColor(ei1.INSTANCE.a(), null);
        int iA = wbc.INSTANCE.a();
        int iA2 = ybc.INSTANCE.a();
        d39 d39Var = new d39();
        d39Var.j(15.41f, 16.59f);
        d39Var.h(10.83f, 12.0f);
        d39Var.i(4.58f, -4.59f);
        d39Var.h(14.0f, 6.0f);
        d39Var.i(-6.0f, 6.0f);
        d39Var.i(6.0f, 6.0f);
        d39Var.i(1.41f, -1.41f);
        d39Var.b();
        pp5 pp5VarF = aVar.c(d39Var.e(), (14336 & 2) != 0 ? a3e.b() : iB, (14336 & 4) != 0 ? "" : "", (14336 & 8) != 0 ? null : solidColor, (14336 & 16) != 0 ? 1.0f : 1.0f, (14336 & 32) == 0 ? null : null, (14336 & 64) != 0 ? 1.0f : 1.0f, (14336 & 128) != 0 ? 0.0f : 1.0f, (14336 & 256) != 0 ? a3e.c() : iA, (14336 & 512) != 0 ? a3e.d() : iA2, (14336 & 1024) != 0 ? 4.0f : 1.0f, (14336 & 2048) != 0 ? 0.0f : 0.0f, (14336 & 4096) == 0 ? 0.0f : 1.0f, (14336 & 8192) != 0 ? 0.0f : 0.0f).f();
        _keyboardArrowLeft = pp5VarF;
        Intrinsics.g(pp5VarF);
        return pp5VarF;
    }

    public final pp5 b() {
        pp5 pp5Var = _keyboardArrowRight;
        if (pp5Var != null) {
            Intrinsics.g(pp5Var);
            return pp5Var;
        }
        pp5.a aVar = new pp5.a("AutoMirrored.Filled.KeyboardArrowRight", ff3.i(24.0f), ff3.i(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int iB = a3e.b();
        SolidColor solidColor = new SolidColor(ei1.INSTANCE.a(), null);
        int iA = wbc.INSTANCE.a();
        int iA2 = ybc.INSTANCE.a();
        d39 d39Var = new d39();
        d39Var.j(8.59f, 16.59f);
        d39Var.h(13.17f, 12.0f);
        d39Var.h(8.59f, 7.41f);
        d39Var.h(10.0f, 6.0f);
        d39Var.i(6.0f, 6.0f);
        d39Var.i(-6.0f, 6.0f);
        d39Var.i(-1.41f, -1.41f);
        d39Var.b();
        pp5 pp5VarF = aVar.c(d39Var.e(), (14336 & 2) != 0 ? a3e.b() : iB, (14336 & 4) != 0 ? "" : "", (14336 & 8) != 0 ? null : solidColor, (14336 & 16) != 0 ? 1.0f : 1.0f, (14336 & 32) == 0 ? null : null, (14336 & 64) != 0 ? 1.0f : 1.0f, (14336 & 128) != 0 ? 0.0f : 1.0f, (14336 & 256) != 0 ? a3e.c() : iA, (14336 & 512) != 0 ? a3e.d() : iA2, (14336 & 1024) != 0 ? 4.0f : 1.0f, (14336 & 2048) != 0 ? 0.0f : 0.0f, (14336 & 4096) == 0 ? 0.0f : 1.0f, (14336 & 8192) != 0 ? 0.0f : 0.0f).f();
        _keyboardArrowRight = pp5VarF;
        Intrinsics.g(pp5VarF);
        return pp5VarF;
    }
}
