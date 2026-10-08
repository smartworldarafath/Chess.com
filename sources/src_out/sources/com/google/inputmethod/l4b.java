package com.google.inputmethod;

import androidx.collection.ScatterSet;
import androidx.collection.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a)\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\n\"\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\f¨\u0006\u000e"}, d2 = {"E", "Landroidx/collection/ScatterSet;", "a", "()Landroidx/collection/ScatterSet;", "Landroidx/collection/d;", "b", "()Landroidx/collection/d;", "element1", "element2", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/d;", "", "Landroidx/collection/d;", "EmptyScatterSet", "collection"}, k = 2, mv = {1, lo6.HASACTION_FIELD_NUMBER, 0}, xi = 48)
public final class l4b {
    private static final d<Object> a = new d<>(0);

    public static final <E> ScatterSet<E> a() {
        d<Object> dVar = a;
        Intrinsics.h(dVar, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>");
        return dVar;
    }

    public static final <E> d<E> b() {
        return new d<>(0, 1, null);
    }

    public static final <E> d<E> c(E e, E e2) {
        d<E> dVar = new d<>(2);
        dVar.x(e);
        dVar.x(e2);
        return dVar;
    }
}
