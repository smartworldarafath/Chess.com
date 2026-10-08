package com.google.inputmethod;

import com.google.android.fh6;
import com.google.android.zh1;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010*\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002=\u0014B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0004J\u001d\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00112\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ3\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00112\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u001b¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\"\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\"\u0010#J\u001d\u0010&\u001a\u00020\u00112\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0018\u0010)\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u0002H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0011H\u0016¢\u0006\u0004\b-\u0010\u0013J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00020.H\u0096\u0002¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u0002H\u0016¢\u0006\u0004\b1\u0010,J\u0015\u00103\u001a\b\u0012\u0004\u0012\u00020\u000202H\u0016¢\u0006\u0004\b3\u00104J\u001d\u00103\u001a\b\u0012\u0004\u0012\u00020\u0002022\u0006\u0010(\u001a\u00020\bH\u0016¢\u0006\u0004\b3\u00105J%\u00108\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u00106\u001a\u00020\b2\u0006\u00107\u001a\u00020\bH\u0016¢\u0006\u0004\b8\u00109J\r\u0010:\u001a\u00020\n¢\u0006\u0004\b:\u0010\u0004R\u001c\u0010?\u001a\b\u0012\u0004\u0012\u00020<0;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010B\u001a\u00020@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010AR\u0016\u0010E\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010H\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010G¨\u0006I"}, d2 = {"Lcom/google/android/hd5;", "", "Landroidx/compose/ui/b$c;", "<init>", "()V", "Lcom/google/android/rd3;", "n", "()J", "", "depth", "", "w", "(I)V", "startDepth", "endDepth", "x", "(II)V", "", "r", "()Z", "b", "", "distanceFromEdge", "isInLayer", "u", "(FZ)Z", "node", "Lkotlin/Function0;", "childHitTest", "s", "(Landroidx/compose/ui/b$c;ZLkotlin/jvm/functions/Function0;)V", "y", "(Landroidx/compose/ui/b$c;FZLkotlin/jvm/functions/Function0;)V", "element", "j", "(Landroidx/compose/ui/b$c;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "index", "o", "(I)Landroidx/compose/ui/b$c;", "t", "(Landroidx/compose/ui/b$c;)I", "isEmpty", "", "iterator", "()Ljava/util/Iterator;", "v", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "clear", "Lcom/google/android/e58;", "", "a", "Lcom/google/android/e58;", "values", "Lcom/google/android/v48;", "Lcom/google/android/v48;", "distanceFromEdgeAndFlags", "c", "I", "hitDepth", "q", "()I", "size", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class hd5 implements List<androidx.compose.ui.b.c>, fh6 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private e58<Object> values = new e58<>(16);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private v48 distanceFromEdgeAndFlags = new v48(16);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int hitDepth = -1;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\n\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010*\n\u0002\b\u000f\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u0014J\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001c\u0010\u001eJ%\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0003H\u0016¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b'\u0010&R\u0014\u0010)\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010&¨\u0006*"}, d2 = {"Lcom/google/android/hd5$b;", "", "Landroidx/compose/ui/b$c;", "", "minIndex", "maxIndex", "<init>", "(Lcom/google/android/hd5;II)V", "element", "", "b", "(Landroidx/compose/ui/b$c;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "index", "c", "(I)Landroidx/compose/ui/b$c;", "e", "(Landroidx/compose/ui/b$c;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "f", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "a", "I", "getMinIndex", "()I", "getMaxIndex", "d", "size", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class b implements List<androidx.compose.ui.b.c>, fh6 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int minIndex;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int maxIndex;

        public b(int i, int i2) {
            this.minIndex = i;
            this.maxIndex = i2;
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ void add(int i, androidx.compose.ui.b.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection<? extends androidx.compose.ui.b.c> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* bridge */ /* synthetic */ void addFirst(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* bridge */ /* synthetic */ void addLast(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean b(androidx.compose.ui.b.c element) {
            return indexOf(element) != -1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public androidx.compose.ui.b.c get(int index) {
            E eD = hd5.this.values.d(index + this.minIndex);
            Intrinsics.h(eD, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (androidx.compose.ui.b.c) eD;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof androidx.compose.ui.b.c) {
                return b((androidx.compose.ui.b.c) obj);
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<?> elements) {
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (!contains((androidx.compose.ui.b.c) it.next())) {
                    return false;
                }
            }
            return true;
        }

        public int d() {
            return this.maxIndex - this.minIndex;
        }

        public int e(androidx.compose.ui.b.c element) {
            int i = this.minIndex;
            int i2 = this.maxIndex;
            if (i > i2) {
                return -1;
            }
            while (!Intrinsics.e(hd5.this.values.d(i), element)) {
                if (i == i2) {
                    return -1;
                }
                i++;
            }
            return i - this.minIndex;
        }

        public int f(androidx.compose.ui.b.c element) {
            int i = this.maxIndex;
            int i2 = this.minIndex;
            if (i2 > i) {
                return -1;
            }
            while (!Intrinsics.e(hd5.this.values.d(i), element)) {
                if (i == i2) {
                    return -1;
                }
                i--;
            }
            return i - this.minIndex;
        }

        @Override // java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof androidx.compose.ui.b.c) {
                return e((androidx.compose.ui.b.c) obj);
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return size() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<androidx.compose.ui.b.c> iterator() {
            hd5 hd5Var = hd5.this;
            int i = this.minIndex;
            return hd5Var.new a(i, i, this.maxIndex);
        }

        @Override // java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof androidx.compose.ui.b.c) {
                return f((androidx.compose.ui.b.c) obj);
            }
            return -1;
        }

        @Override // java.util.List
        public ListIterator<androidx.compose.ui.b.c> listIterator() {
            hd5 hd5Var = hd5.this;
            int i = this.minIndex;
            return hd5Var.new a(i, i, this.maxIndex);
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ androidx.compose.ui.b.c remove(int i) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* bridge */ /* synthetic */ Object removeFirst() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* bridge */ /* synthetic */ Object removeLast() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public void replaceAll(UnaryOperator<androidx.compose.ui.b.c> unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ androidx.compose.ui.b.c set(int i, androidx.compose.ui.b.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return d();
        }

        @Override // java.util.List
        public void sort(Comparator<? super androidx.compose.ui.b.c> comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public List<androidx.compose.ui.b.c> subList(int fromIndex, int toIndex) {
            hd5 hd5Var = hd5.this;
            int i = this.minIndex;
            return hd5Var.new b(fromIndex + i, i + toIndex);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return zh1.a(this);
        }

        @Override // java.util.List, java.util.Collection
        public /* bridge */ /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends androidx.compose.ui.b.c> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public ListIterator<androidx.compose.ui.b.c> listIterator(int index) {
            hd5 hd5Var = hd5.this;
            int i = this.minIndex;
            return hd5Var.new a(index + i, i, this.maxIndex);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) zh1.b(this, tArr);
        }
    }

    private final long n() {
        long jB = id5.b(Float.POSITIVE_INFINITY, false, false, 4, null);
        int i = this.hitDepth + 1;
        int iR = m.r(this);
        if (i <= iR) {
            while (true) {
                long jB2 = rd3.b(this.distanceFromEdgeAndFlags.a(i));
                if (rd3.a(jB2, jB) < 0) {
                    jB = jB2;
                }
                if ((rd3.c(jB) < 0.0f && rd3.e(jB)) || i == iR) {
                    break;
                }
                i++;
            }
        }
        return jB;
    }

    private final void w(int depth) {
        this.values.B(depth);
        this.distanceFromEdgeAndFlags.h(depth);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(int startDepth, int endDepth) {
        if (startDepth >= endDepth) {
            return;
        }
        this.values.C(startDepth, endDepth);
        this.distanceFromEdgeAndFlags.i(startDepth, endDepth);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i, androidx.compose.ui.b.c cVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends androidx.compose.ui.b.c> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void b() {
        this.hitDepth = size() - 1;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.hitDepth = -1;
        this.values.u();
        this.distanceFromEdgeAndFlags.f();
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof androidx.compose.ui.b.c) {
            return j((androidx.compose.ui.b.c) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> elements) {
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains((androidx.compose.ui.b.c) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof androidx.compose.ui.b.c) {
            return t((androidx.compose.ui.b.c) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.values.g();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<androidx.compose.ui.b.c> iterator() {
        return new a(this, 0, 0, 0, 7, null);
    }

    public boolean j(androidx.compose.ui.b.c element) {
        return indexOf(element) != -1;
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof androidx.compose.ui.b.c) {
            return v((androidx.compose.ui.b.c) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<androidx.compose.ui.b.c> listIterator() {
        return new a(this, 0, 0, 0, 7, null);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public androidx.compose.ui.b.c get(int index) {
        Object objD = this.values.d(index);
        Intrinsics.h(objD, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (androidx.compose.ui.b.c) objD;
    }

    public int q() {
        return this.values.get_size();
    }

    public final boolean r() {
        long jN = n();
        return rd3.c(jN) < 0.0f && rd3.e(jN) && !rd3.d(jN);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ androidx.compose.ui.b.c remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<androidx.compose.ui.b.c> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void s(androidx.compose.ui.b.c node, boolean isInLayer, Function0<Unit> childHitTest) {
        if (this.hitDepth == m.r(this)) {
            int i = this.hitDepth;
            x(this.hitDepth + 1, size());
            this.hitDepth++;
            this.values.n(node);
            this.distanceFromEdgeAndFlags.d(id5.a(0.0f, isInLayer, true));
            childHitTest.invoke();
            this.hitDepth = i;
            return;
        }
        long jN = n();
        int i2 = this.hitDepth;
        if (!rd3.d(jN)) {
            if (rd3.c(jN) > 0.0f) {
                int i3 = this.hitDepth;
                x(this.hitDepth + 1, size());
                this.hitDepth++;
                this.values.n(node);
                this.distanceFromEdgeAndFlags.d(id5.a(0.0f, isInLayer, true));
                childHitTest.invoke();
                this.hitDepth = i3;
                return;
            }
            return;
        }
        this.hitDepth = m.r(this);
        int i4 = this.hitDepth;
        x(this.hitDepth + 1, size());
        this.hitDepth++;
        this.values.n(node);
        this.distanceFromEdgeAndFlags.d(id5.a(0.0f, isInLayer, true));
        childHitTest.invoke();
        this.hitDepth = i4;
        if (rd3.c(n()) < 0.0f) {
            x(i2 + 1, this.hitDepth + 1);
        }
        this.hitDepth = i2;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ androidx.compose.ui.b.c set(int i, androidx.compose.ui.b.c cVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return q();
    }

    @Override // java.util.List
    public void sort(Comparator<? super androidx.compose.ui.b.c> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<androidx.compose.ui.b.c> subList(int fromIndex, int toIndex) {
        return new b(fromIndex, toIndex);
    }

    public int t(androidx.compose.ui.b.c element) {
        int iR = m.r(this);
        if (iR < 0) {
            return -1;
        }
        int i = 0;
        while (!Intrinsics.e(this.values.d(i), element)) {
            if (i == iR) {
                return -1;
            }
            i++;
        }
        return i;
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return zh1.a(this);
    }

    public final boolean u(float distanceFromEdge, boolean isInLayer) {
        if (this.hitDepth == m.r(this)) {
            return true;
        }
        return rd3.a(n(), id5.b(distanceFromEdge, isInLayer, false, 4, null)) > 0;
    }

    public int v(androidx.compose.ui.b.c element) {
        for (int iR = m.r(this); -1 < iR; iR--) {
            if (Intrinsics.e(this.values.d(iR), element)) {
                return iR;
            }
        }
        return -1;
    }

    public final void y(androidx.compose.ui.b.c node, float distanceFromEdge, boolean isInLayer, Function0<Unit> childHitTest) {
        if (this.hitDepth == m.r(this)) {
            int i = this.hitDepth;
            x(this.hitDepth + 1, size());
            this.hitDepth++;
            this.values.n(node);
            this.distanceFromEdgeAndFlags.d(id5.a(distanceFromEdge, isInLayer, false));
            childHitTest.invoke();
            this.hitDepth = i;
            if (this.hitDepth + 1 == m.r(this) || rd3.d(n())) {
                w(this.hitDepth + 1);
                return;
            }
            return;
        }
        long jN = n();
        int i2 = this.hitDepth;
        this.hitDepth = m.r(this);
        int i3 = this.hitDepth;
        x(this.hitDepth + 1, size());
        this.hitDepth++;
        this.values.n(node);
        this.distanceFromEdgeAndFlags.d(id5.a(distanceFromEdge, isInLayer, false));
        childHitTest.invoke();
        this.hitDepth = i3;
        long jN2 = n();
        if (this.hitDepth + 1 >= m.r(this) || rd3.a(jN, jN2) <= 0) {
            x(this.hitDepth + 1, size());
        } else {
            x(i2 + 1, rd3.d(jN2) ? this.hitDepth + 2 : this.hitDepth + 1);
        }
        this.hitDepth = i2;
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends androidx.compose.ui.b.c> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public ListIterator<androidx.compose.ui.b.c> listIterator(int index) {
        return new a(this, index, 0, 0, 6, null);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) zh1.b(this, tArr);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010*\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0010R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0013\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0017\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/google/android/hd5$a;", "", "Landroidx/compose/ui/b$c;", "", "index", "minIndex", "maxIndex", "<init>", "(Lcom/google/android/hd5;III)V", "", "hasNext", "()Z", "hasPrevious", "a", "()Landroidx/compose/ui/b$c;", "nextIndex", "()I", "b", "previousIndex", "I", "getIndex", "setIndex", "(I)V", "getMinIndex", "c", "getMaxIndex", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class a implements ListIterator<androidx.compose.ui.b.c>, fh6 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private int index;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int minIndex;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final int maxIndex;

        public a(int i, int i2, int i3) {
            this.index = i;
            this.minIndex = i2;
            this.maxIndex = i3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public androidx.compose.ui.b.c next() {
            e58 e58Var = hd5.this.values;
            int i = this.index;
            this.index = i + 1;
            E eD = e58Var.d(i);
            Intrinsics.h(eD, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (androidx.compose.ui.b.c) eD;
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void add(androidx.compose.ui.b.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public androidx.compose.ui.b.c previous() {
            e58 e58Var = hd5.this.values;
            int i = this.index - 1;
            this.index = i;
            E eD = e58Var.d(i);
            Intrinsics.h(eD, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (androidx.compose.ui.b.c) eD;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.index < this.maxIndex;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.index > this.minIndex;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.index - this.minIndex;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return (this.index - this.minIndex) - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void set(androidx.compose.ui.b.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* synthetic */ a(hd5 hd5Var, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? hd5Var.size() : i3);
        }
    }
}
