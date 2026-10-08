package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR&\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/google/android/t27;", "Lcom/google/android/mg;", "", "Landroidx/compose/runtime/composer/linkbuffer/GroupAddress;", "address", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "a", "I", "b", "()I", "c", "", "()Z", "valid", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class t27 implements mg {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int address;

    public t27(int i) {
        this.address = i;
    }

    @Override // com.google.inputmethod.mg
    public boolean a() {
        return this.address != -1;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getAddress() {
        return this.address;
    }

    public final void c(int i) {
        this.address = i;
    }

    public String toString() {
        return super.toString() + "{ address: " + this.address + " }";
    }
}
