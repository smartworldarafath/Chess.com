package com.google.inputmethod;

import com.google.android.k3;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010(\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0006\b\u0001\u0018\u0000 $*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001%B/\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lcom/google/android/c89;", "E", "Lcom/google/android/k3;", "Lcom/google/android/e89;", "", "firstElement", "lastElement", "Lcom/google/android/c69;", "Lcom/google/android/p37;", "hashMap", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/c69;)V", "element", "", "contains", "(Ljava/lang/Object;)Z", "add", "(Ljava/lang/Object;)Lcom/google/android/e89;", "remove", "", "iterator", "()Ljava/util/Iterator;", "b", "Ljava/lang/Object;", "getFirstElement$runtime", "()Ljava/lang/Object;", "c", "getLastElement$runtime", "d", "Lcom/google/android/c69;", "getHashMap$runtime", "()Lcom/google/android/c69;", "", "getSize", "()I", "size", "e", "a", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c89<E> extends k3<E> implements e89<E> {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int f = 8;
    private static final c89 g;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Object firstElement;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Object lastElement;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final c69<E, p37> hashMap;

    /* JADX INFO: renamed from: com.google.android.c89$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0004\b\u0001\u0010\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/google/android/c89$a;", "", "<init>", "()V", "E", "Lcom/google/android/e89;", "a", "()Lcom/google/android/e89;", "Lcom/google/android/c89;", "", "EMPTY", "Lcom/google/android/c89;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <E> e89<E> a() {
            return c89.g;
        }

        private Companion() {
        }
    }

    static {
        zs3 zs3Var = zs3.a;
        g = new c89(zs3Var, zs3Var, c69.INSTANCE.a());
    }

    public c89(Object obj, Object obj2, c69<E, p37> c69Var) {
        this.firstElement = obj;
        this.lastElement = obj2;
        this.hashMap = c69Var;
    }

    @Override // com.google.inputmethod.e89, java.util.Set, java.util.Collection
    public e89<E> add(E element) {
        if (this.hashMap.containsKey(element)) {
            return this;
        }
        if (isEmpty()) {
            return new c89(element, element, this.hashMap.s(element, new p37()));
        }
        Object obj = this.lastElement;
        p37 p37Var = this.hashMap.get(obj);
        Intrinsics.g(p37Var);
        return new c89(this.firstElement, element, this.hashMap.s((E) obj, p37Var.e(element)).s(element, new p37(obj)));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object element) {
        return this.hashMap.containsKey(element);
    }

    public int getSize() {
        return this.hashMap.size();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new d89(this.firstElement, this.hashMap);
    }

    @Override // com.google.inputmethod.e89, java.util.Set, java.util.Collection
    public e89<E> remove(E element) {
        p37 p37Var = this.hashMap.get(element);
        if (p37Var == null) {
            return this;
        }
        c69 c69VarT = this.hashMap.t(element);
        if (p37Var.b()) {
            Object obj = c69VarT.get(p37Var.getPrevious());
            Intrinsics.g(obj);
            c69VarT = c69VarT.s(p37Var.getPrevious(), ((p37) obj).e(p37Var.getNext()));
        }
        if (p37Var.a()) {
            Object obj2 = c69VarT.get(p37Var.getNext());
            Intrinsics.g(obj2);
            c69VarT = c69VarT.s(p37Var.getNext(), ((p37) obj2).f(p37Var.getPrevious()));
        }
        return new c89(!p37Var.b() ? p37Var.getNext() : this.firstElement, !p37Var.a() ? p37Var.getPrevious() : this.lastElement, c69VarT);
    }
}
