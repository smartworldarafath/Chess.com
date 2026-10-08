package com.google.inputmethod;

import androidx.compose.p004runtime.e;
import com.google.android.fh6;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0016R\u0016\u0010$\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u0016¨\u0006%"}, d2 = {"Lcom/google/android/izb;", "", "Lcom/google/android/xr1;", "Lcom/google/android/fub;", "table", "", "parent", "Lcom/google/android/xu4;", "group", "Lcom/google/android/kzb;", "path", "<init>", "(Lcom/google/android/fub;ILcom/google/android/xu4;Lcom/google/android/kzb;)V", "", "hasNext", "()Z", "a", "()Lcom/google/android/xr1;", "Lcom/google/android/fub;", "getTable", "()Lcom/google/android/fub;", "b", "I", "getParent", "()I", "c", "Lcom/google/android/xu4;", "getGroup", "()Lcom/google/android/xu4;", "d", "Lcom/google/android/kzb;", "getPath", "()Lcom/google/android/kzb;", "e", "version", "f", "index", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class izb implements Iterator<xr1>, fh6 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final fub table;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int parent;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final xu4 group;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final kzb path;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int version;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int index;

    public izb(fub fubVar, int i, xu4 xu4Var, kzb kzbVar) {
        this.table = fubVar;
        this.parent = i;
        this.group = xu4Var;
        this.path = kzbVar;
        this.version = fubVar.getVersion();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public xr1 next() throws KotlinNothingValueException {
        Object obj;
        ArrayList<Object> arrayListA = this.group.a();
        if (arrayListA != null) {
            int i = this.index;
            this.index = i + 1;
            obj = arrayListA.get(i);
        } else {
            obj = null;
        }
        if (obj instanceof ku4) {
            return new pub(this.table, ((ku4) obj).getLocation(), this.version);
        }
        if (obj instanceof xu4) {
            return new mzb(this.table, this.parent, (xu4) obj, new mea(this.path, this.index - 1));
        }
        e.c("Unexpected group information structure");
        throw new KotlinNothingValueException();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        ArrayList<Object> arrayListA = this.group.a();
        return arrayListA != null && this.index < arrayListA.size();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
