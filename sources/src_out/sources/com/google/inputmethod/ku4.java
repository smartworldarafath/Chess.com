package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0016\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0005R\u0014\u0010\u0019\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/google/android/ku4;", "Lcom/google/android/mg;", "", "loc", "<init>", "(I)V", "Lcom/google/android/fub;", "slots", "d", "(Lcom/google/android/fub;)I", "Lcom/google/android/wub;", "writer", "e", "(Lcom/google/android/wub;)I", "", "toString", "()Ljava/lang/String;", "a", "I", "b", "()I", "c", "location", "", "()Z", "valid", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ku4 implements mg {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int location;

    public ku4(int i) {
        this.location = i;
    }

    @Override // com.google.inputmethod.mg
    public boolean a() {
        return this.location != Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getLocation() {
        return this.location;
    }

    public final void c(int i) {
        this.location = i;
    }

    public final int d(fub slots) {
        return slots.u(this);
    }

    public final int e(SlotWriter writer) {
        return writer.C(this);
    }

    public String toString() {
        return super.toString() + "{ location = " + this.location + " }";
    }
}
