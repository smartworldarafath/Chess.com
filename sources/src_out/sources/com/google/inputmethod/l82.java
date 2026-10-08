package com.google.inputmethod;

import androidx.compose.ui.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0018\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\b*\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0005\u0010\u0011\"\u0004\b\u0015\u0010\u0013R.\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0011R\u0014\u0010\u001f\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0011¨\u0006 "}, d2 = {"Lcom/google/android/l82;", "Landroidx/compose/ui/b$c;", "Lcom/google/android/bfb;", "", "mergeDescendants", "isClearingSemantics", "Lkotlin/Function1;", "Lcom/google/android/nfb;", "", "properties", "<init>", "(ZZLkotlin/jvm/functions/Function1;)V", "H0", "(Lcom/google/android/nfb;)V", "p", "Z", "getMergeDescendants", "()Z", "m3", "(Z)V", "q", "setClearingSemantics", "r", "Lkotlin/jvm/functions/Function1;", "getProperties", "()Lkotlin/jvm/functions/Function1;", "n3", "(Lkotlin/jvm/functions/Function1;)V", "z1", "shouldClearDescendantSemantics", "h1", "shouldMergeDescendantSemantics", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l82 extends b.c implements bfb {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private boolean mergeDescendants;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private boolean isClearingSemantics;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private Function1<? super nfb, Unit> properties;

    public l82(boolean z, boolean z2, Function1<? super nfb, Unit> function1) {
        this.mergeDescendants = z;
        this.isClearingSemantics = z2;
        this.properties = function1;
    }

    @Override // com.google.inputmethod.bfb
    public void H0(nfb nfbVar) {
        this.properties.invoke(nfbVar);
    }

    @Override // com.google.inputmethod.bfb
    /* JADX INFO: renamed from: h1, reason: from getter */
    public boolean getMergeDescendants() {
        return this.mergeDescendants;
    }

    public final void m3(boolean z) {
        this.mergeDescendants = z;
    }

    public final void n3(Function1<? super nfb, Unit> function1) {
        this.properties = function1;
    }

    @Override // com.google.inputmethod.bfb
    /* JADX INFO: renamed from: z1, reason: from getter */
    public boolean getIsClearingSemantics() {
        return this.isClearingSemantics;
    }
}
