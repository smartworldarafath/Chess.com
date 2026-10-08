package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\u00020\u000b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0003R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013R&\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/google/android/brc;", "", "<init>", "()V", "Lcom/google/android/frc;", "c", "()Lcom/google/android/frc;", "Lkotlin/Function1;", "Lcom/google/android/erc;", "", "filter", "", "b", "(Lkotlin/jvm/functions/Function1;)V", "component", "a", "(Lcom/google/android/erc;)V", "d", "Lcom/google/android/e58;", "Lcom/google/android/e58;", "components", "filters", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class brc {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final e58<erc> components = new e58<>(0, 1, null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final e58<Function1<erc, Boolean>> filters = new e58<>(0, 1, null);

    public final void a(erc component) {
        this.components.n(component);
    }

    public final void b(Function1<? super erc, Boolean> filter) {
        this.filters.n(filter);
    }

    public final TextContextMenuData c() {
        e58 e58Var = new e58(0, 1, null);
        e58<erc> e58Var2 = this.components;
        Object[] objArr = e58Var2.content;
        int i = e58Var2._size;
        boolean z = true;
        erc ercVar = null;
        for (int i2 = 0; i2 < i; i2++) {
            erc ercVar2 = (erc) objArr[i2];
            if (!z || ercVar2 != qrc.b) {
                if (crc.a(ercVar2) && crc.a(ercVar)) {
                    z = false;
                } else {
                    if (!crc.a(ercVar2)) {
                        e58<Function1<erc, Boolean>> e58Var3 = this.filters;
                        Object[] objArr2 = e58Var3.content;
                        int i3 = e58Var3._size;
                        int i4 = 0;
                        while (true) {
                            if (i4 < i3) {
                                if (((Boolean) ((Function1) objArr2[i4]).invoke(ercVar2)).booleanValue()) {
                                    i4++;
                                } else {
                                    z = false;
                                }
                            }
                        }
                    }
                    e58Var.n(ercVar2);
                    z = false;
                    ercVar = ercVar2;
                }
            }
        }
        if (crc.a((erc) (e58Var.g() ? null : e58Var.content[e58Var._size - 1]))) {
            e58Var.B(e58Var._size - 1);
        }
        return new TextContextMenuData(e58Var.s());
    }

    public final void d() {
        this.components.n(qrc.b);
    }
}
