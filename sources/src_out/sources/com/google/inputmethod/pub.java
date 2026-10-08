package com.google.inputmethod;

import com.google.android.fh6;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0016¨\u0006\u001f"}, d2 = {"Lcom/google/android/pub;", "Lcom/google/android/xr1;", "", "Lcom/google/android/fub;", "table", "", "group", "version", "<init>", "(Lcom/google/android/fub;II)V", "", "b", "()V", "", "iterator", "()Ljava/util/Iterator;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "Lcom/google/android/fub;", "getTable", "()Lcom/google/android/fub;", "I", "getGroup", "c", "getVersion", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class pub implements xr1, Iterable<xr1>, fh6 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final fub table;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int group;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int version;

    public pub(fub fubVar, int i, int i2) {
        this.table = fubVar;
        this.group = i;
        this.version = i2;
    }

    private final void b() {
        if (this.table.getVersion() != this.version) {
            tub.y();
        }
    }

    public boolean equals(Object other) {
        if (!(other instanceof pub)) {
            return false;
        }
        pub pubVar = (pub) other;
        return pubVar.group == this.group && pubVar.version == this.version && Intrinsics.e(pubVar.table, this.table);
    }

    public int hashCode() {
        return this.group + (this.table.hashCode() * 31);
    }

    @Override // java.lang.Iterable
    public Iterator<xr1> iterator() {
        b();
        xu4 xu4VarR = this.table.R(this.group);
        if (xu4VarR != null) {
            fub fubVar = this.table;
            int i = this.group;
            return new izb(fubVar, i, xu4VarR, new gh(i));
        }
        fub fubVar2 = this.table;
        int i2 = this.group;
        return new y15(fubVar2, i2 + 1, i2 + tub.s(fubVar2.getGroups(), this.group));
    }
}
