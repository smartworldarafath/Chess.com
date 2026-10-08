package com.google.inputmethod;

import androidx.p008glance.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.m;

/* JADX INFO: renamed from: com.google.android.dq3, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0011\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/google/android/dq3;", "Lcom/google/android/yp3;", "<init>", "()V", "Lcom/google/android/rp3;", "copy", "()Lcom/google/android/rp3;", "", "toString", "()Ljava/lang/String;", "Landroidx/glance/g;", "e", "Landroidx/glance/g;", "a", "()Landroidx/glance/g;", "b", "(Landroidx/glance/g;)V", "modifier", "", "f", "J", "j", "()J", "setItemId", "(J)V", "itemId", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class EmittableLazyVerticalGridListItem extends yp3 {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private g modifier = btb.c(btb.d(g.INSTANCE));

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private long itemId;

    @Override // com.google.inputmethod.rp3
    /* JADX INFO: renamed from: a, reason: from getter */
    public g getModifier() {
        return this.modifier;
    }

    @Override // com.google.inputmethod.rp3
    public void b(g gVar) {
        this.modifier = gVar;
    }

    @Override // com.google.inputmethod.rp3
    public rp3 copy() {
        EmittableLazyVerticalGridListItem emittableLazyVerticalGridListItem = new EmittableLazyVerticalGridListItem();
        emittableLazyVerticalGridListItem.itemId = this.itemId;
        emittableLazyVerticalGridListItem.i(getAlignment());
        List<rp3> listD = emittableLazyVerticalGridListItem.d();
        List<rp3> listD2 = d();
        ArrayList arrayList = new ArrayList(m.A(listD2, 10));
        Iterator<T> it = listD2.iterator();
        while (it.hasNext()) {
            arrayList.add(((rp3) it.next()).copy());
        }
        listD.addAll(arrayList);
        return emittableLazyVerticalGridListItem;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final long getItemId() {
        return this.itemId;
    }

    public String toString() {
        return "EmittableLazyVerticalGridListItem(modifier=" + getModifier() + ", alignment=" + getAlignment() + ", children=[\n" + c() + "\n])";
    }
}
