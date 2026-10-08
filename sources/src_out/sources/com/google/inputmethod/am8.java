package com.google.inputmethod;

import androidx.collection.ObjectList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0007\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a'\u0010\b\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\n¢\u0006\u0004\b\f\u0010\r\u001a!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a)\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u0016\"\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\"\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"", "", "index", "", "d", "(Ljava/util/List;I)V", "fromIndex", "toIndex", "e", "(Ljava/util/List;II)V", "E", "Landroidx/collection/ObjectList;", "f", "()Landroidx/collection/ObjectList;", "element1", "i", "(Ljava/lang/Object;)Landroidx/collection/ObjectList;", "Lcom/google/android/e58;", "g", "(Ljava/lang/Object;)Lcom/google/android/e58;", "element2", "h", "(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/e58;", "", "", "a", "[Ljava/lang/Object;", "EmptyArray", "b", "Landroidx/collection/ObjectList;", "EmptyObjectList", "collection"}, k = 2, mv = {1, lo6.HASACTION_FIELD_NUMBER, 0}, xi = 48)
public final class am8 {
    private static final Object[] a = new Object[0];
    private static final ObjectList<Object> b = new e58(0);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(List<?> list, int i) {
        int size = list.size();
        if (i < 0 || i >= size) {
            qra.c("Index " + i + " is out of bounds. The list has " + size + " elements.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(List<?> list, int i, int i2) {
        int size = list.size();
        if (i > i2) {
            qra.a("Indices are out of order. fromIndex (" + i + ") is greater than toIndex (" + i2 + ").");
        }
        if (i < 0) {
            qra.c("fromIndex (" + i + ") is less than 0.");
        }
        if (i2 > size) {
            qra.c("toIndex (" + i2 + ") is more than than the list size (" + size + ')');
        }
    }

    public static final <E> ObjectList<E> f() {
        ObjectList<E> objectList = (ObjectList<E>) b;
        Intrinsics.h(objectList, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>");
        return objectList;
    }

    public static final <E> e58<E> g(E e) {
        e58<E> e58Var = new e58<>(1);
        e58Var.n(e);
        return e58Var;
    }

    public static final <E> e58<E> h(E e, E e2) {
        e58<E> e58Var = new e58<>(2);
        e58Var.n(e);
        e58Var.n(e2);
        return e58Var;
    }

    public static final <E> ObjectList<E> i(E e) {
        return g(e);
    }
}
