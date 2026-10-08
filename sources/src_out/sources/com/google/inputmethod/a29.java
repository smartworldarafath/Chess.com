package com.google.inputmethod;

import androidx.compose.ui.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0006*\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u0006*\u00020\u0005¢\u0006\u0004\b\f\u0010\u000bJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eR.\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\tR\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/google/android/a29;", "Landroidx/compose/ui/b$c;", "Lcom/google/android/fhd;", "Lcom/google/android/bfb;", "Lkotlin/Function1;", "Lcom/google/android/nfb;", "", "properties", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "H0", "(Lcom/google/android/nfb;)V", "m3", "n3", "()V", "p", "Lkotlin/jvm/functions/Function1;", "getProperties", "()Lkotlin/jvm/functions/Function1;", "o3", "", "q", "Z", "semanticsConsumed", "", "r", "Ljava/lang/Object;", "p1", "()Ljava/lang/Object;", "traverseKey", "h1", "()Z", "shouldMergeDescendantSemantics", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a29 extends b.c implements fhd, bfb {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private Function1<? super nfb, Unit> properties;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private boolean semanticsConsumed;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final Object traverseKey = c29.a;

    public a29(Function1<? super nfb, Unit> function1) {
        this.properties = function1;
    }

    @Override // com.google.inputmethod.bfb
    public void H0(nfb nfbVar) {
        if (this.semanticsConsumed) {
            return;
        }
        this.properties.invoke(nfbVar);
    }

    @Override // com.google.inputmethod.bfb
    /* JADX INFO: renamed from: h1 */
    public boolean getMergeDescendants() {
        return true;
    }

    public final void m3(nfb nfbVar) {
        this.semanticsConsumed = true;
        this.properties.invoke(nfbVar);
        cfb.d(this);
    }

    public final void n3() {
        this.semanticsConsumed = false;
        cfb.d(this);
    }

    public final void o3(Function1<? super nfb, Unit> function1) {
        this.properties = function1;
    }

    @Override // com.google.inputmethod.fhd
    /* JADX INFO: renamed from: p1, reason: from getter */
    public Object getTraverseKey() {
        return this.traverseKey;
    }
}
