package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/google/android/uj5;", "", "<init>", "()V", "Lcom/google/android/pp5;", "b", "Lcom/google/android/pp5;", "_close", "c", "_edit", "d", "_dateRange", "e", "_arrowDropDown", "()Lcom/google/android/pp5;", "Close", "Edit", "DateRange", "a", "ArrowDropDown", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class uj5 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static pp5 _close;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static pp5 _edit;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static pp5 _dateRange;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static pp5 _arrowDropDown;
    public static final uj5 a = new uj5();
    public static final int f = 8;

    private uj5() {
    }

    public final pp5 a() {
        pp5 pp5Var = _arrowDropDown;
        if (pp5Var != null) {
            Intrinsics.g(pp5Var);
            return pp5Var;
        }
        pp5.a aVar = new pp5.a("Filled.ArrowDropDown", ff3.i(24.0f), ff3.i(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int iB = a3e.b();
        SolidColor solidColor = new SolidColor(ei1.INSTANCE.a(), null);
        int iA = wbc.INSTANCE.a();
        int iA2 = ybc.INSTANCE.a();
        d39 d39Var = new d39();
        d39Var.j(7.0f, 10.0f);
        d39Var.i(5.0f, 5.0f);
        d39Var.i(5.0f, -5.0f);
        d39Var.b();
        pp5 pp5VarF = aVar.c(d39Var.e(), (14336 & 2) != 0 ? a3e.b() : iB, (14336 & 4) != 0 ? "" : "", (14336 & 8) != 0 ? null : solidColor, (14336 & 16) != 0 ? 1.0f : 1.0f, (14336 & 32) == 0 ? null : null, (14336 & 64) != 0 ? 1.0f : 1.0f, (14336 & 128) != 0 ? 0.0f : 1.0f, (14336 & 256) != 0 ? a3e.c() : iA, (14336 & 512) != 0 ? a3e.d() : iA2, (14336 & 1024) != 0 ? 4.0f : 1.0f, (14336 & 2048) != 0 ? 0.0f : 0.0f, (14336 & 4096) == 0 ? 0.0f : 1.0f, (14336 & 8192) != 0 ? 0.0f : 0.0f).f();
        _arrowDropDown = pp5VarF;
        Intrinsics.g(pp5VarF);
        return pp5VarF;
    }

    public final pp5 b() {
        pp5 pp5Var = _close;
        if (pp5Var != null) {
            Intrinsics.g(pp5Var);
            return pp5Var;
        }
        pp5.a aVar = new pp5.a("Filled.Close", ff3.i(24.0f), ff3.i(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
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
        pp5 pp5VarF = aVar.c(d39Var.e(), (14336 & 2) != 0 ? a3e.b() : iB, (14336 & 4) != 0 ? "" : "", (14336 & 8) != 0 ? null : solidColor, (14336 & 16) != 0 ? 1.0f : 1.0f, (14336 & 32) == 0 ? null : null, (14336 & 64) != 0 ? 1.0f : 1.0f, (14336 & 128) != 0 ? 0.0f : 1.0f, (14336 & 256) != 0 ? a3e.c() : iA, (14336 & 512) != 0 ? a3e.d() : iA2, (14336 & 1024) != 0 ? 4.0f : 1.0f, (14336 & 2048) != 0 ? 0.0f : 0.0f, (14336 & 4096) == 0 ? 0.0f : 1.0f, (14336 & 8192) != 0 ? 0.0f : 0.0f).f();
        _close = pp5VarF;
        Intrinsics.g(pp5VarF);
        return pp5VarF;
    }

    public final pp5 c() {
        pp5 pp5Var = _dateRange;
        if (pp5Var != null) {
            Intrinsics.g(pp5Var);
            return pp5Var;
        }
        pp5.a aVar = new pp5.a("Filled.DateRange", ff3.i(24.0f), ff3.i(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int iB = a3e.b();
        SolidColor solidColor = new SolidColor(ei1.INSTANCE.a(), null);
        int iA = wbc.INSTANCE.a();
        int iA2 = ybc.INSTANCE.a();
        d39 d39Var = new d39();
        d39Var.j(9.0f, 11.0f);
        d39Var.h(7.0f, 11.0f);
        d39Var.n(2.0f);
        d39Var.g(2.0f);
        d39Var.n(-2.0f);
        d39Var.b();
        d39Var.j(13.0f, 11.0f);
        d39Var.g(-2.0f);
        d39Var.n(2.0f);
        d39Var.g(2.0f);
        d39Var.n(-2.0f);
        d39Var.b();
        d39Var.j(17.0f, 11.0f);
        d39Var.g(-2.0f);
        d39Var.n(2.0f);
        d39Var.g(2.0f);
        d39Var.n(-2.0f);
        d39Var.b();
        d39Var.j(19.0f, 4.0f);
        d39Var.g(-1.0f);
        d39Var.h(18.0f, 2.0f);
        d39Var.g(-2.0f);
        d39Var.n(2.0f);
        d39Var.h(8.0f, 4.0f);
        d39Var.h(8.0f, 2.0f);
        d39Var.h(6.0f, 2.0f);
        d39Var.n(2.0f);
        d39Var.h(5.0f, 4.0f);
        d39Var.d(-1.11f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        d39Var.h(3.0f, 20.0f);
        d39Var.d(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        d39Var.g(14.0f);
        d39Var.d(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d39Var.h(21.0f, 6.0f);
        d39Var.d(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        d39Var.b();
        d39Var.j(19.0f, 20.0f);
        d39Var.h(5.0f, 20.0f);
        d39Var.h(5.0f, 9.0f);
        d39Var.g(14.0f);
        d39Var.n(11.0f);
        d39Var.b();
        pp5 pp5VarF = aVar.c(d39Var.e(), (14336 & 2) != 0 ? a3e.b() : iB, (14336 & 4) != 0 ? "" : "", (14336 & 8) != 0 ? null : solidColor, (14336 & 16) != 0 ? 1.0f : 1.0f, (14336 & 32) == 0 ? null : null, (14336 & 64) != 0 ? 1.0f : 1.0f, (14336 & 128) != 0 ? 0.0f : 1.0f, (14336 & 256) != 0 ? a3e.c() : iA, (14336 & 512) != 0 ? a3e.d() : iA2, (14336 & 1024) != 0 ? 4.0f : 1.0f, (14336 & 2048) != 0 ? 0.0f : 0.0f, (14336 & 4096) == 0 ? 0.0f : 1.0f, (14336 & 8192) != 0 ? 0.0f : 0.0f).f();
        _dateRange = pp5VarF;
        Intrinsics.g(pp5VarF);
        return pp5VarF;
    }

    public final pp5 d() {
        pp5 pp5Var = _edit;
        if (pp5Var != null) {
            Intrinsics.g(pp5Var);
            return pp5Var;
        }
        pp5.a aVar = new pp5.a("Filled.Edit", ff3.i(24.0f), ff3.i(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int iB = a3e.b();
        SolidColor solidColor = new SolidColor(ei1.INSTANCE.a(), null);
        int iA = wbc.INSTANCE.a();
        int iA2 = ybc.INSTANCE.a();
        d39 d39Var = new d39();
        d39Var.j(3.0f, 17.25f);
        d39Var.m(21.0f);
        d39Var.g(3.75f);
        d39Var.h(17.81f, 9.94f);
        d39Var.i(-3.75f, -3.75f);
        d39Var.h(3.0f, 17.25f);
        d39Var.b();
        d39Var.j(20.71f, 7.04f);
        d39Var.d(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        d39Var.i(-2.34f, -2.34f);
        d39Var.d(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        d39Var.i(-1.83f, 1.83f);
        d39Var.i(3.75f, 3.75f);
        d39Var.i(1.83f, -1.83f);
        d39Var.b();
        pp5 pp5VarF = aVar.c(d39Var.e(), (14336 & 2) != 0 ? a3e.b() : iB, (14336 & 4) != 0 ? "" : "", (14336 & 8) != 0 ? null : solidColor, (14336 & 16) != 0 ? 1.0f : 1.0f, (14336 & 32) == 0 ? null : null, (14336 & 64) != 0 ? 1.0f : 1.0f, (14336 & 128) != 0 ? 0.0f : 1.0f, (14336 & 256) != 0 ? a3e.c() : iA, (14336 & 512) != 0 ? a3e.d() : iA2, (14336 & 1024) != 0 ? 4.0f : 1.0f, (14336 & 2048) != 0 ? 0.0f : 0.0f, (14336 & 4096) == 0 ? 0.0f : 1.0f, (14336 & 8192) != 0 ? 0.0f : 0.0f).f();
        _edit = pp5VarF;
        Intrinsics.g(pp5VarF);
        return pp5VarF;
    }
}
