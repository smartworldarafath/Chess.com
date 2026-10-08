package com.google.inputmethod;

import com.google.android.fh6;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010*\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R \u0010/\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Lcom/google/android/mzb;", "Lcom/google/android/xr1;", "", "Lcom/google/android/fub;", "table", "", "parent", "Lcom/google/android/xu4;", "sourceInformation", "Lcom/google/android/kzb;", "identityPath", "<init>", "(Lcom/google/android/fub;ILcom/google/android/xu4;Lcom/google/android/kzb;)V", "", "iterator", "()Ljava/util/Iterator;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "Lcom/google/android/fub;", "getTable", "()Lcom/google/android/fub;", "b", "I", "getParent", "c", "Lcom/google/android/xu4;", "getSourceInformation", "()Lcom/google/android/xu4;", "d", "Lcom/google/android/kzb;", "getIdentityPath", "()Lcom/google/android/kzb;", "e", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "key", "f", "Ljava/lang/Iterable;", "getCompositionGroups", "()Ljava/lang/Iterable;", "compositionGroups", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class mzb implements xr1, Iterable<xr1>, fh6 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final fub table;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int parent;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final xu4 sourceInformation;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final kzb identityPath;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Object key;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Iterable<xr1> compositionGroups = this;

    public mzb(fub fubVar, int i, xu4 xu4Var, kzb kzbVar) {
        this.table = fubVar;
        this.parent = i;
        this.sourceInformation = xu4Var;
        this.identityPath = kzbVar;
        this.key = Integer.valueOf(xu4Var.getKey());
    }

    public boolean equals(Object other) {
        if (!(other instanceof mzb)) {
            return false;
        }
        mzb mzbVar = (mzb) other;
        return mzbVar.parent == this.parent && Intrinsics.e(mzbVar.table, this.table) && Intrinsics.e(mzbVar.identityPath, this.identityPath);
    }

    public int hashCode() {
        return (((this.parent * 31) + this.table.hashCode()) * 31) + this.identityPath.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<xr1> iterator() {
        return new izb(this.table, this.parent, this.sourceInformation, this.identityPath);
    }
}
