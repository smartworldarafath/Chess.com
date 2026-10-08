package com.google.inputmethod;

import androidx.compose.p004runtime.snapshots.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\n\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\b\u0000\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001d\u001a\u00020\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010 \u001a\u00020\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001c¨\u0006!"}, d2 = {"Lcom/google/android/v6c;", "T", "Lcom/google/android/c7c;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Lcom/google/android/i79;", "list", "<init>", "(JLcom/google/android/i79;)V", "value", "", "c", "(Lcom/google/android/c7c;)V", "d", "()Lcom/google/android/c7c;", "e", "(J)Lcom/google/android/c7c;", "Lcom/google/android/i79;", "j", "()Lcom/google/android/i79;", "m", "(Lcom/google/android/i79;)V", "", "I", "k", "()I", "n", "(I)V", "modification", "l", "o", "structuralChange", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v6c<T> extends c7c {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private i79<? extends T> list;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int modification;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int structuralChange;

    public v6c(long j, i79<? extends T> i79Var) {
        super(j);
        this.list = i79Var;
    }

    @Override // com.google.inputmethod.c7c
    public void c(c7c value) {
        synchronized (ixb.a) {
            Intrinsics.h(value, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.StateListStateRecord>");
            this.list = ((v6c) value).list;
            this.modification = ((v6c) value).modification;
            this.structuralChange = ((v6c) value).structuralChange;
            Unit unit = Unit.a;
        }
    }

    @Override // com.google.inputmethod.c7c
    public c7c d() {
        return e(i.K().getSnapshotId());
    }

    @Override // com.google.inputmethod.c7c
    public c7c e(long snapshotId) {
        return new v6c(snapshotId, this.list);
    }

    public final i79<T> j() {
        return this.list;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getModification() {
        return this.modification;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getStructuralChange() {
        return this.structuralChange;
    }

    public final void m(i79<? extends T> i79Var) {
        this.list = i79Var;
    }

    public final void n(int i) {
        this.modification = i;
    }

    public final void o(int i) {
        this.structuralChange = i;
    }
}
