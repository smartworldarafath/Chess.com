package com.google.inputmethod;

import androidx.compose.ui.layout.j;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003*\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rR\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u0012\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/google/android/bad;", "Lcom/google/android/aad;", "Lkotlin/Function0;", "Lcom/google/android/kn6;", "getAnchorBounds", "Lcom/google/android/rg9;", "positionProvider", "<init>", "(Lkotlin/jvm/functions/Function0;Lcom/google/android/rg9;)V", "Landroidx/compose/ui/layout/j;", "b", "(Landroidx/compose/ui/layout/j;)Lcom/google/android/kn6;", "a", "()Lcom/google/android/rg9;", "Lkotlin/jvm/functions/Function0;", "getGetAnchorBounds", "()Lkotlin/jvm/functions/Function0;", "Lcom/google/android/rg9;", "getPositionProvider", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class bad implements aad {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Function0<kn6> getAnchorBounds;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final rg9 positionProvider;

    /* JADX WARN: Multi-variable type inference failed */
    public bad(Function0<? extends kn6> function0, rg9 rg9Var) {
        this.getAnchorBounds = function0;
        this.positionProvider = rg9Var;
    }

    @Override // com.google.inputmethod.aad
    /* JADX INFO: renamed from: a, reason: from getter */
    public rg9 getPositionProvider() {
        return this.positionProvider;
    }

    @Override // com.google.inputmethod.aad
    public kn6 b(j jVar) {
        return (kn6) this.getAnchorBounds.invoke();
    }
}
