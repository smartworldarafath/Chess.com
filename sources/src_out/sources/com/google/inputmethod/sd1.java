package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/google/android/sd1;", "Lcom/google/android/uy7;", "Lcom/google/android/l82;", "Lcom/google/android/yeb;", "Lkotlin/Function1;", "Lcom/google/android/nfb;", "", "properties", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "d", "()Lcom/google/android/l82;", "node", "e", "(Lcom/google/android/l82;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlin/jvm/functions/Function1;", "getProperties", "()Lkotlin/jvm/functions/Function1;", "Lcom/google/android/seb;", "g", "()Lcom/google/android/seb;", "semanticsConfiguration", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class sd1 extends uy7<l82> implements yeb {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Function1<nfb, Unit> properties;

    /* JADX WARN: Multi-variable type inference failed */
    public sd1(Function1<? super nfb, Unit> function1) {
        this.properties = function1;
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public l82 a() {
        return new l82(false, true, this.properties);
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(l82 node) {
        node.n3(this.properties);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof sd1) && this.properties == ((sd1) other).properties;
    }

    @Override // com.google.inputmethod.yeb
    public seb g() {
        seb sebVar = new seb();
        sebVar.v(false);
        sebVar.u(true);
        this.properties.invoke(sebVar);
        return sebVar;
    }

    public int hashCode() {
        return this.properties.hashCode();
    }
}
