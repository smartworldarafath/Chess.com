package com.google.inputmethod;

import com.google.android.hh6;
import com.google.android.oh6;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.f;
import kotlin.collections.m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0010#\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u00015B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u0007J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u0010J\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001b\u0010\u0010J\u0015\u0010\u001c\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u0017J\u0015\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u001d\"\u0004\b\u0001\u0010 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010\u001d¢\u0006\u0004\b\u001e\u0010\"J\u001a\u0010$\u001a\u00020\u000e2\b\u0010#\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b$\u0010\u0010J\u000f\u0010%\u001a\u00020\u0004H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000*H\u0096\u0002¢\u0006\u0004\b+\u0010,J\u001d\u0010/\u001a\u00020\u000e2\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0016¢\u0006\u0004\b/\u00100J\u001d\u00101\u001a\u00020\u000e2\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0016¢\u0006\u0004\b1\u00100J\u001d\u00102\u001a\u00020\u000e2\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0016¢\u0006\u0004\b2\u00100J\u001d\u00103\u001a\u00020\u000e2\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0016¢\u0006\u0004\b3\u00100R\"\u0010;\u001a\u0002048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R*\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010<\u001a\u0004\b=\u0010\u001f\"\u0004\b>\u0010?R\"\u0010C\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u0010@\u001a\u0004\bA\u0010&\"\u0004\bB\u0010\u0007R\u0014\u0010E\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010&¨\u0006F"}, d2 = {"Lcom/google/android/g10;", "E", "", "", "", "capacity", "<init>", "(I)V", "", "clear", "()V", "minimumCapacity", "b", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "key", "indexOf", "(Ljava/lang/Object;)I", "index", "q", "(I)Ljava/lang/Object;", "isEmpty", "()Z", "add", "remove", "i", "", "toArray", "()[Ljava/lang/Object;", "T", "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", "other", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "", "iterator", "()Ljava/util/Iterator;", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "addAll", "removeAll", "retainAll", "", "a", "[I", "d", "()[I", "n", "([I)V", "hashes", "[Ljava/lang/Object;", "c", "j", "([Ljava/lang/Object;)V", "I", "f", "o", "_size", "e", "size", "collection"}, k = 1, mv = {1, lo6.HASACTION_FIELD_NUMBER, 0}, xi = 48)
public final class g10<E> implements Collection<E>, Set<E>, hh6, oh6 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int[] hashes;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private Object[] array;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int _size;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/google/android/g10$a;", "Lcom/google/android/pu5;", "<init>", "(Lcom/google/android/g10;)V", "", "index", "a", "(I)Ljava/lang/Object;", "", "b", "(I)V", "collection"}, k = 1, mv = {1, lo6.HASACTION_FIELD_NUMBER, 0}, xi = 48)
    private final class a extends pu5<E> {
        public a() {
            super(g10.this.f());
        }

        @Override // com.google.inputmethod.pu5
        protected E a(int index) {
            return g10.this.q(index);
        }

        @Override // com.google.inputmethod.pu5
        protected void b(int index) {
            g10.this.i(index);
        }
    }

    public g10() {
        this(0, 1, null);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E element) {
        int i;
        int iC;
        int iF = f();
        if (element == null) {
            iC = i10.d(this);
            i = 0;
        } else {
            int iHashCode = element.hashCode();
            i = iHashCode;
            iC = i10.c(this, element, iHashCode);
        }
        if (iC >= 0) {
            return false;
        }
        int i2 = ~iC;
        if (iF >= getHashes().length) {
            int i3 = 8;
            if (iF >= 8) {
                i3 = (iF >> 1) + iF;
            } else if (iF < 4) {
                i3 = 4;
            }
            int[] hashes = getHashes();
            Object[] array = getArray();
            i10.a(this, i3);
            if (iF != f()) {
                throw new ConcurrentModificationException();
            }
            if (!(getHashes().length == 0)) {
                f.q(hashes, getHashes(), 0, 0, hashes.length, 6, (Object) null);
                f.s(array, getArray(), 0, 0, array.length, 6, (Object) null);
            }
        }
        if (i2 < iF) {
            int i4 = i2 + 1;
            f.l(getHashes(), getHashes(), i4, i2, iF);
            f.n(getArray(), getArray(), i4, i2, iF);
        }
        if (iF != f() || i2 >= getHashes().length) {
            throw new ConcurrentModificationException();
        }
        getHashes()[i2] = i;
        getArray()[i2] = element;
        o(f() + 1);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        b(f() + elements.size());
        Iterator<? extends E> it = elements.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    public final void b(int minimumCapacity) {
        int iF = f();
        if (getHashes().length < minimumCapacity) {
            int[] hashes = getHashes();
            Object[] array = getArray();
            i10.a(this, minimumCapacity);
            if (f() > 0) {
                f.q(hashes, getHashes(), 0, 0, f(), 6, (Object) null);
                f.s(array, getArray(), 0, 0, f(), 6, (Object) null);
            }
        }
        if (f() != iF) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Object[] getArray() {
        return this.array;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        if (f() != 0) {
            n(ty1.a);
            j(ty1.c);
            o(0);
        }
        if (f() != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object element) {
        return indexOf(element) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends Object> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int[] getHashes() {
        return this.hashes;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public int get_size() {
        return this._size;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Set) || size() != ((Set) other).size()) {
            return false;
        }
        try {
            int iF = f();
            for (int i = 0; i < iF; i++) {
                if (!((Set) other).contains(q(i))) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public final int f() {
        return this._size;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] hashes = getHashes();
        int iF = f();
        int i = 0;
        for (int i2 = 0; i2 < iF; i2++) {
            i += hashes[i2];
        }
        return i;
    }

    public final E i(int index) {
        int i;
        Object[] objArr;
        int iF = f();
        E e = (E) getArray()[index];
        if (iF <= 1) {
            clear();
            return e;
        }
        int i2 = iF - 1;
        if (getHashes().length <= 8 || f() >= getHashes().length / 3) {
            if (index < i2) {
                int i3 = index + 1;
                f.l(getHashes(), getHashes(), index, i3, iF);
                f.n(getArray(), getArray(), index, i3, iF);
            }
            getArray()[i2] = null;
        } else {
            int iF2 = f() > 8 ? f() + (f() >> 1) : 8;
            int[] hashes = getHashes();
            Object[] array = getArray();
            i10.a(this, iF2);
            if (index > 0) {
                f.q(hashes, getHashes(), 0, 0, index, 6, (Object) null);
                objArr = array;
                f.s(objArr, getArray(), 0, 0, index, 6, (Object) null);
                i = index;
            } else {
                i = index;
                objArr = array;
            }
            if (i < i2) {
                int i4 = i + 1;
                f.l(hashes, getHashes(), i, i4, iF);
                f.n(objArr, getArray(), i, i4, iF);
            }
        }
        if (iF != f()) {
            throw new ConcurrentModificationException();
        }
        o(i2);
        return e;
    }

    public final int indexOf(Object key) {
        return key == null ? i10.d(this) : i10.c(this, key, key.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return f() <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return new a();
    }

    public final void j(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<set-?>");
        this.array = objArr;
    }

    public final void n(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<set-?>");
        this.hashes = iArr;
    }

    public final void o(int i) {
        this._size = i;
    }

    public final E q(int index) {
        return (E) getArray()[index];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object element) {
        int iIndexOf = indexOf(element);
        if (iIndexOf < 0) {
            return false;
        }
        i(iIndexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends Object> it = elements.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z = false;
        for (int iF = f() - 1; -1 < iF; iF--) {
            if (!m.n0(elements, getArray()[iF])) {
                i(iF);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return get_size();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return f.v(this.array, 0, this._size);
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(f() * 14);
        sb.append('{');
        int iF = f();
        for (int i = 0; i < iF; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            E eQ = q(i);
            if (eQ != this) {
                sb.append(eQ);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public g10(int i) {
        this.hashes = ty1.a;
        this.array = ty1.c;
        if (i > 0) {
            i10.a(this, i);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        T[] tArr = (T[]) h10.a(array, this._size);
        f.n(this.array, tArr, 0, 0, this._size);
        Intrinsics.g(tArr);
        return tArr;
    }

    public /* synthetic */ g10(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
