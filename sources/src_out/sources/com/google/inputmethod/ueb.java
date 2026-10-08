package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/google/android/teb;", "Lcom/google/android/seb;", "a", "(Lcom/google/android/teb;)Lcom/google/android/seb;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ueb {
    public static final seb a(teb tebVar) {
        seb sebVarG = tebVar.g();
        if (sebVarG != null && sebVarG.getIsMergingSemanticsOfDescendants() && !sebVarG.getIsClearingSemantics()) {
            sebVarG = sebVarG.f();
            e58 e58Var = new e58(tebVar.k().size());
            e58Var.r(tebVar.k());
            while (e58Var.h()) {
                teb tebVar2 = (teb) e58Var.B(e58Var._size - 1);
                seb sebVarG2 = tebVar2.g();
                if (sebVarG2 != null && !sebVarG2.getIsMergingSemanticsOfDescendants()) {
                    sebVarG.t(sebVarG2);
                    if (!sebVarG2.getIsClearingSemantics()) {
                        e58Var.r(tebVar2.k());
                    }
                }
            }
        }
        return sebVarG;
    }
}
