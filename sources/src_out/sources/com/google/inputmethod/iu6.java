package com.google.inputmethod;

import androidx.compose.p004runtime.s0;
import androidx.compose.p004runtime.snapshots.g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0019\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00158\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R/\u0010)\u001a\u0004\u0018\u00010\u00012\b\u0010$\u001a\u0004\u0018\u00010\u00018B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b\u0016\u0010'\"\u0004\b%\u0010(R(\u0010+\u001a\u0004\u0018\u00010\u00012\b\u0010*\u001a\u0004\u0018\u00010\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010'\"\u0004\b!\u0010(¨\u0006,"}, d2 = {"Lcom/google/android/iu6;", "Lcom/google/android/n99;", "Lcom/google/android/n99$a;", "Lcom/google/android/mu6$a;", "", "key", "Lcom/google/android/mu6;", "pinnedItemList", "<init>", "(Ljava/lang/Object;Lcom/google/android/mu6;)V", "a", "()Lcom/google/android/n99$a;", "", "release", "()V", "d", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "b", "Lcom/google/android/mu6;", "", "c", "I", "getIndex", "()I", "e", "(I)V", "index", "pinsCount", "Lcom/google/android/n99$a;", "parentHandle", "", "f", "Z", "isDisposed", "<set-?>", "g", "Lcom/google/android/o58;", "()Lcom/google/android/n99;", "(Lcom/google/android/n99;)V", "_parentPinnableContainer", "value", "parentPinnableContainer", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class iu6 implements n99, n99.a, mu6.a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Object key;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final mu6 pinnedItemList;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int pinsCount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private n99.a parentHandle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean isDisposed;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int index = -1;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final o58 _parentPinnableContainer = s0.e(null, null, 2, null);

    public iu6(Object obj, mu6 mu6Var) {
        this.key = obj;
        this.pinnedItemList = mu6Var;
    }

    private final n99 c() {
        return (n99) this._parentPinnableContainer.getValue();
    }

    private final void g(n99 n99Var) {
        this._parentPinnableContainer.setValue(n99Var);
    }

    @Override // com.google.inputmethod.n99
    public n99.a a() {
        if (this.isDisposed) {
            cx5.c("Pin should not be called on an already disposed item ");
        }
        if (this.pinsCount == 0) {
            this.pinnedItemList.i(this);
            n99 n99VarB = b();
            this.parentHandle = n99VarB != null ? n99VarB.a() : null;
        }
        this.pinsCount++;
        return this;
    }

    public final n99 b() {
        return c();
    }

    public final void d() {
        this.isDisposed = true;
    }

    public void e(int i) {
        this.index = i;
    }

    public final void f(n99 n99Var) {
        g.Companion companion = g.INSTANCE;
        g gVarD = companion.d();
        Function1<Object, Unit> function1G = gVarD != null ? gVarD.g() : null;
        g gVarE = companion.e(gVarD);
        try {
            if (n99Var != c()) {
                g(n99Var);
                if (this.pinsCount > 0) {
                    n99.a aVar = this.parentHandle;
                    if (aVar != null) {
                        aVar.release();
                    }
                    this.parentHandle = n99Var != null ? n99Var.a() : null;
                }
            }
            Unit unit = Unit.a;
        } finally {
            companion.l(gVarD, gVarE, function1G);
        }
    }

    @Override // com.google.android.mu6.a
    public int getIndex() {
        return this.index;
    }

    @Override // com.google.android.mu6.a
    public Object getKey() {
        return this.key;
    }

    @Override // com.google.android.n99.a
    public void release() {
        if (this.isDisposed) {
            return;
        }
        if (!(this.pinsCount > 0)) {
            cx5.c("Release should only be called once");
        }
        int i = this.pinsCount - 1;
        this.pinsCount = i;
        if (i == 0) {
            this.pinnedItemList.j(this);
            n99.a aVar = this.parentHandle;
            if (aVar != null) {
                aVar.release();
            }
            this.parentHandle = null;
        }
    }
}
