package com.google.inputmethod;

import androidx.p008glance.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.m;

/* JADX INFO: renamed from: com.google.android.bga, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\"\u0010\u0015\u001a\u00020\u000e8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/google/android/bga;", "Lcom/google/android/jq3;", "", "maxDepth", "<init>", "(I)V", "Lcom/google/android/rp3;", "copy", "()Lcom/google/android/rp3;", "", "toString", "()Ljava/lang/String;", "d", "I", "Landroidx/glance/g;", "e", "Landroidx/glance/g;", "a", "()Landroidx/glance/g;", "b", "(Landroidx/glance/g;)V", "modifier", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RemoteViewsRoot extends jq3 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int maxDepth;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private g modifier;

    public RemoteViewsRoot(int i) {
        super(i, false, 2, null);
        this.maxDepth = i;
        this.modifier = g.INSTANCE;
    }

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
        RemoteViewsRoot remoteViewsRoot = new RemoteViewsRoot(this.maxDepth);
        remoteViewsRoot.b(getModifier());
        List<rp3> listD = remoteViewsRoot.d();
        List<rp3> listD2 = d();
        ArrayList arrayList = new ArrayList(m.A(listD2, 10));
        Iterator<T> it = listD2.iterator();
        while (it.hasNext()) {
            arrayList.add(((rp3) it.next()).copy());
        }
        listD.addAll(arrayList);
        return remoteViewsRoot;
    }

    public String toString() {
        return "RemoteViewsRoot(modifier=" + getModifier() + ", children=[\n" + c() + "\n])";
    }
}
