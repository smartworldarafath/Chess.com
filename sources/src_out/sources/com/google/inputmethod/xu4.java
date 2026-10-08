package com.google.inputmethod;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0002\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\rR\u001a\u0010\u001f\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR$\u0010'\u001a\u0004\u0018\u00010 8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010)\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010\u001c\u001a\u0004\b(\u0010\u001eR6\u00100\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010*j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`+8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b#\u0010,\u001a\u0004\b\u001b\u0010-\"\u0004\b.\u0010/R\"\u00106\u001a\u00020\u000b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u00109\u001a\u00020\u00108\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b!\u0010\u001e\"\u0004\b7\u00108¨\u0006:"}, d2 = {"Lcom/google/android/xu4;", "Lcom/google/android/a25;", "h", "()Lcom/google/android/xu4;", "", "group", "", "e", "(Ljava/lang/Object;)V", "Lcom/google/android/ku4;", "anchor", "", "g", "(Lcom/google/android/ku4;)Z", "Lcom/google/android/wub;", "writer", "", "k", "(Lcom/google/android/wub;I)V", "Lcom/google/android/fub;", "table", "j", "(Lcom/google/android/fub;I)V", "predecessor", "f", "(Lcom/google/android/wub;II)V", "i", "a", "I", "getKey", "()I", "key", "", "b", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "setSourceInformation", "(Ljava/lang/String;)V", "sourceInformation", "c", "dataStartOffset", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "()Ljava/util/ArrayList;", "l", "(Ljava/util/ArrayList;)V", "groups", "Z", "getClosed", "()Z", "setClosed", "(Z)V", "closed", "setDataEndOffset", "(I)V", "dataEndOffset", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class xu4 implements a25 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int key;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String sourceInformation;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int dataStartOffset;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private ArrayList<Object> groups;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean closed;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int dataEndOffset;

    private final void e(Object group) {
        ArrayList<Object> arrayListA = a();
        if (arrayListA == null) {
            arrayListA = new ArrayList<>();
        }
        l(arrayListA);
        arrayListA.add(group);
    }

    private final boolean g(ku4 anchor) {
        ArrayList<Object> arrayListA = a();
        if (arrayListA != null) {
            int size = arrayListA.size();
            for (int i = 0; i < size; i++) {
                Object obj = arrayListA.get(i);
                if (Intrinsics.e(obj, anchor)) {
                    return true;
                }
                if ((obj instanceof xu4) && ((xu4) obj).g(anchor)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final xu4 h() {
        Object obj;
        xu4 xu4VarH;
        ArrayList<Object> arrayListA = a();
        if (arrayListA == null) {
            obj = null;
            break;
        }
        int size = arrayListA.size() - 1;
        while (true) {
            if (size < 0) {
                obj = null;
                break;
            }
            obj = arrayListA.get(size);
            if ((obj instanceof xu4) && !((xu4) obj).getClosed()) {
                break;
            }
            size--;
        }
        xu4 xu4Var = obj instanceof xu4 ? (xu4) obj : null;
        return (xu4Var == null || (xu4VarH = xu4Var.h()) == null) ? this : xu4VarH;
    }

    @Override // com.google.inputmethod.a25
    public ArrayList<Object> a() {
        return this.groups;
    }

    @Override // com.google.inputmethod.a25
    /* JADX INFO: renamed from: b, reason: from getter */
    public int getDataEndOffset() {
        return this.dataEndOffset;
    }

    @Override // com.google.inputmethod.a25
    /* JADX INFO: renamed from: c, reason: from getter */
    public int getDataStartOffset() {
        return this.dataStartOffset;
    }

    @Override // com.google.inputmethod.a25
    /* JADX INFO: renamed from: d, reason: from getter */
    public String getSourceInformation() {
        return this.sourceInformation;
    }

    public final void f(SlotWriter writer, int predecessor, int group) {
        ku4 ku4VarR1;
        ArrayList<Object> arrayListA = a();
        if (arrayListA == null) {
            arrayListA = new ArrayList<>();
            l(arrayListA);
        }
        int i = 0;
        if (predecessor >= 0 && (ku4VarR1 = writer.r1(predecessor)) != null) {
            int size = arrayListA.size();
            while (i < size) {
                Object obj = arrayListA.get(i);
                if (!Intrinsics.e(obj, ku4VarR1) && (!(obj instanceof xu4) || !((xu4) obj).g(ku4VarR1))) {
                    i++;
                }
            }
            i = -1;
        }
        arrayListA.add(i, writer.B(group));
    }

    @Override // com.google.inputmethod.a25
    public boolean getClosed() {
        return this.closed;
    }

    @Override // com.google.inputmethod.a25
    public int getKey() {
        return this.key;
    }

    public final boolean i(ku4 anchor) {
        ArrayList<Object> arrayListA = a();
        if (arrayListA != null) {
            for (int size = arrayListA.size() - 1; size >= 0; size--) {
                Object obj = arrayListA.get(size);
                if (obj instanceof ku4) {
                    if (Intrinsics.e(obj, anchor)) {
                        arrayListA.remove(size);
                    }
                } else if ((obj instanceof xu4) && !((xu4) obj).i(anchor)) {
                    arrayListA.remove(size);
                }
            }
            if (arrayListA.isEmpty()) {
                l(null);
                return false;
            }
        }
        return true;
    }

    public final void j(fub table, int group) {
        h().e(table.t(group));
    }

    public final void k(SlotWriter writer, int group) {
        h().e(writer.B(group));
    }

    public void l(ArrayList<Object> arrayList) {
        this.groups = arrayList;
    }
}
