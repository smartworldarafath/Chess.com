package com.google.inputmethod;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010*\n\u0002\b\u000b\b\u0001\u0018\u0000 .*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001*B\u0017\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00160\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u001bJ\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\t2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\t2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b#\u0010\"J\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$2\u0006\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b%\u0010&J\u0018\u0010'\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b'\u0010(J%\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b)\u0010\u001bR\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\n\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lcom/google/android/bvb;", "E", "Lcom/google/android/eq5;", "Lcom/google/android/b3;", "", "", "buffer", "<init>", "([Ljava/lang/Object;)V", "", "size", "f", "(I)[Ljava/lang/Object;", "element", "Lcom/google/android/i79;", "add", "(Ljava/lang/Object;)Lcom/google/android/i79;", "", "elements", "addAll", "(Ljava/util/Collection;)Lcom/google/android/i79;", "Lkotlin/Function1;", "", "predicate", "E0", "(Lkotlin/jvm/functions/Function1;)Lcom/google/android/i79;", "index", "(ILjava/lang/Object;)Lcom/google/android/i79;", "B1", "(I)Lcom/google/android/i79;", "Lcom/google/android/i79$a;", "builder", "()Lcom/google/android/i79$a;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "listIterator", "(I)Ljava/util/ListIterator;", "get", "(I)Ljava/lang/Object;", "set", "a", "[Ljava/lang/Object;", "getSize", "()I", "b", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class bvb<E> extends b3<E> implements eq5<E> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int c = 8;
    private static final bvb d = new bvb(new Object[0]);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Object[] buffer;

    /* JADX INFO: renamed from: com.google.android.bvb$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/google/android/bvb$a;", "", "<init>", "()V", "Lcom/google/android/bvb;", "", "EMPTY", "Lcom/google/android/bvb;", "a", "()Lcom/google/android/bvb;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final bvb a() {
            return bvb.d;
        }

        private Companion() {
        }
    }

    public bvb(Object[] objArr) {
        this.buffer = objArr;
        ok1.a(objArr.length <= 32);
    }

    private final Object[] f(int size) {
        return new Object[size];
    }

    @Override // com.google.inputmethod.i79
    public i79<E> B1(int index) {
        f47.a(index, size());
        if (size() == 1) {
            return d;
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.buffer, size() - 1);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        f.n(this.buffer, objArrCopyOf, index, index + 1, size());
        return new bvb(objArrCopyOf);
    }

    @Override // com.google.inputmethod.i79
    public i79<E> E0(Function1<? super E, Boolean> predicate) {
        Object[] objArrCopyOf = this.buffer;
        int size = size();
        int size2 = size();
        boolean z = false;
        for (int i = 0; i < size2; i++) {
            Object obj = this.buffer[i];
            if (((Boolean) predicate.invoke(obj)).booleanValue()) {
                if (!z) {
                    Object[] objArr = this.buffer;
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                    z = true;
                    size = i;
                }
            } else if (z) {
                objArrCopyOf[size] = obj;
                size++;
            }
        }
        if (size == size()) {
            return this;
        }
        return size == 0 ? d : new bvb(f.v(objArrCopyOf, 0, size));
    }

    @Override // com.google.inputmethod.i79, java.util.List, java.util.Collection
    public i79<E> add(E element) {
        if (size() >= 32) {
            return new g89(this.buffer, oyd.c(element), size() + 1, 0);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.buffer, size() + 1);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[size()] = element;
        return new bvb(objArrCopyOf);
    }

    @Override // com.google.inputmethod.b3, com.google.inputmethod.i79, java.util.List, java.util.Collection
    public i79<E> addAll(Collection<? extends E> elements) {
        if (size() + elements.size() > 32) {
            i79.a<E> aVarBuilder = builder();
            aVarBuilder.addAll(elements);
            return aVarBuilder.build();
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.buffer, size() + elements.size());
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        int size = size();
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            objArrCopyOf[size] = it.next();
            size++;
        }
        return new bvb(objArrCopyOf);
    }

    @Override // com.google.inputmethod.i79
    public i79.a<E> builder() {
        return new k89(this, null, this.buffer, 0);
    }

    @Override // java.util.List
    public E get(int index) {
        f47.a(index, size());
        return (E) this.buffer[index];
    }

    public int getSize() {
        return this.buffer.length;
    }

    @Override // java.util.List
    public int indexOf(Object element) {
        return f.E0(this.buffer, element);
    }

    @Override // java.util.List
    public int lastIndexOf(Object element) {
        return f.S0(this.buffer, element);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int index) {
        f47.b(index, size());
        return new kv0(this.buffer, index, size());
    }

    @Override // com.google.inputmethod.i79, java.util.List
    public i79<E> set(int index, E element) {
        f47.a(index, size());
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[index] = element;
        return new bvb(objArrCopyOf);
    }

    @Override // com.google.inputmethod.i79, java.util.List
    public i79<E> add(int index, E element) {
        f47.b(index, size());
        if (index == size()) {
            return add((Object) element);
        }
        if (size() < 32) {
            Object[] objArrF = f(size() + 1);
            f.s(this.buffer, objArrF, 0, 0, index, 6, (Object) null);
            f.n(this.buffer, objArrF, index + 1, index, size());
            objArrF[index] = element;
            return new bvb(objArrF);
        }
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        f.n(this.buffer, objArrCopyOf, index + 1, index, size() - 1);
        objArrCopyOf[index] = element;
        return new g89(objArrCopyOf, oyd.c(this.buffer[31]), size() + 1, 0);
    }
}
