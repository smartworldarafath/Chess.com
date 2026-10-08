package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/google/android/fh;", "Lcom/google/android/jzb;", "", "Landroidx/compose/runtime/composer/linkbuffer/GroupAddress;", "group", "<init>", "(I)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "I", "getGroup", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class fh extends jzb {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int group;

    public fh(int i) {
        super(null);
        this.group = i;
    }

    public boolean equals(Object other) {
        return (other instanceof fh) && ((fh) other).group == this.group;
    }

    public int hashCode() {
        return this.group * 31;
    }
}
