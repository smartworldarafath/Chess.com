package com.google.inputmethod;

import com.google.android.fh6;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001d\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u0017¨\u0006 "}, d2 = {"Lcom/google/android/oub;", "Lcom/google/android/xr1;", "", "Lcom/google/android/eub;", "table", "", "Landroidx/compose/runtime/composer/linkbuffer/GroupAddress;", "group", "version", "<init>", "(Lcom/google/android/eub;II)V", "", "b", "()V", "", "iterator", "()Ljava/util/Iterator;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "Lcom/google/android/eub;", "getTable", "()Lcom/google/android/eub;", "I", "getGroup", "c", "getVersion", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class oub implements xr1, Iterable<xr1>, fh6 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final eub table;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int group;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int version;

    public oub(eub eubVar, int i, int i2) {
        this.table = eubVar;
        this.group = i;
        this.version = i2;
    }

    private final void b() {
        if (this.table.getVersion() != this.version) {
            sub.o();
        }
    }

    public boolean equals(Object other) {
        if (!(other instanceof oub)) {
            return false;
        }
        oub oubVar = (oub) other;
        return oubVar.group == this.group && oubVar.version == this.version && Intrinsics.e(oubVar.table, this.table);
    }

    public int hashCode() {
        return this.group + (this.table.hashCode() * 31);
    }

    @Override // java.lang.Iterable
    public Iterator<xr1> iterator() {
        b();
        d37 d37VarF = this.table.getAddressSpace().F(this.group);
        if (d37VarF == null) {
            eub eubVar = this.table;
            return new x15(eubVar, eubVar.y(this.group));
        }
        eub eubVar2 = this.table;
        int i = this.group;
        return new hzb(eubVar2, i, d37VarF, new fh(i));
    }
}
