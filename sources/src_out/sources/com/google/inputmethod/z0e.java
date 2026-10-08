package com.google.inputmethod;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/google/android/z0e;", "Lkotlin/sequences/Sequence;", "Lcom/google/android/y0e;", "<init>", "()V", "", "iterator", "()Ljava/util/Iterator;", "", "name", "", "value", "", "c", "(Ljava/lang/String;Ljava/lang/Object;)V", "", "a", "Ljava/util/List;", "elements", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class z0e implements Sequence<ValueElement> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<ValueElement> elements = new ArrayList();

    public final void c(String name, Object value) {
        this.elements.add(new ValueElement(name, value));
    }

    public Iterator<ValueElement> iterator() {
        return this.elements.iterator();
    }
}
