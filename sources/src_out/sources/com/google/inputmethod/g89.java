package com.google.inputmethod;

import java.util.Arrays;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\r\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B7\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJE\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012JA\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\b2\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0018\u0010\u0019JI\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ=\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\bH\u0002¢\u0006\u0004\b \u0010!J5\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\"\u0010#JA\u0010%\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u001bH\u0002¢\u0006\u0004\b%\u0010&J?\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u001bH\u0002¢\u0006\u0004\b'\u0010&J\u001f\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u001a\u001a\u00020\bH\u0002¢\u0006\u0004\b(\u0010)JA\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b2\b\u0010(\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b*\u0010+J\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b,\u0010-J%\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b,\u0010.J\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b/\u00100J)\u00104\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020201H\u0016¢\u0006\u0004\b4\u00105J\u0015\u00107\u001a\b\u0012\u0004\u0012\u00028\u000006H\u0016¢\u0006\u0004\b7\u00108J\u001d\u0010:\u001a\b\u0012\u0004\u0012\u00028\u0000092\u0006\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b:\u0010;J\u0018\u0010<\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b<\u0010=J%\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b>\u0010.R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010@R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010\u000eR\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010C¨\u0006F"}, d2 = {"Lcom/google/android/g89;", "E", "Lcom/google/android/i79;", "Lcom/google/android/b3;", "", "", "root", "tail", "", "size", "rootShift", "<init>", "([Ljava/lang/Object;[Ljava/lang/Object;II)V", "u", "()I", "filledTail", "newTail", "q", "([Ljava/lang/Object;[Ljava/lang/Object;[Ljava/lang/Object;)Lcom/google/android/g89;", "shift", "r", "([Ljava/lang/Object;I[Ljava/lang/Object;)[Ljava/lang/Object;", "tailIndex", "element", "j", "([Ljava/lang/Object;ILjava/lang/Object;)Lcom/google/android/g89;", "index", "Lcom/google/android/fm8;", "elementCarry", "i", "([Ljava/lang/Object;IILjava/lang/Object;Lcom/google/android/fm8;)[Ljava/lang/Object;", "rootSize", "t", "([Ljava/lang/Object;III)Lcom/google/android/i79;", "o", "([Ljava/lang/Object;II)Lcom/google/android/i79;", "tailCarry", "n", "([Ljava/lang/Object;IILcom/google/android/fm8;)[Ljava/lang/Object;", "s", "e", "(I)[Ljava/lang/Object;", "v", "([Ljava/lang/Object;IILjava/lang/Object;)[Ljava/lang/Object;", "add", "(Ljava/lang/Object;)Lcom/google/android/i79;", "(ILjava/lang/Object;)Lcom/google/android/i79;", "B1", "(I)Lcom/google/android/i79;", "Lkotlin/Function1;", "", "predicate", "E0", "(Lkotlin/jvm/functions/Function1;)Lcom/google/android/i79;", "Lcom/google/android/k89;", "f", "()Lcom/google/android/k89;", "", "listIterator", "(I)Ljava/util/ListIterator;", "get", "(I)Ljava/lang/Object;", "set", "a", "[Ljava/lang/Object;", "b", "c", "I", "getSize", "d", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g89<E> extends b3<E> implements i79<E> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Object[] root;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Object[] tail;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int size;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int rootShift;

    public g89(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.root = objArr;
        this.tail = objArr2;
        this.size = i;
        this.rootShift = i2;
        if (!(size() > 32)) {
            ei9.a("Trie-based persistent vector should have at least 33 elements, got " + size());
        }
        ok1.a(size() - oyd.d(size()) <= g.j(objArr2.length, 32));
    }

    private final Object[] e(int index) {
        if (u() <= index) {
            return this.tail;
        }
        Object[] objArr = this.root;
        for (int i = this.rootShift; i > 0; i -= 5) {
            Object[] objArr2 = objArr[oyd.a(index, i)];
            Intrinsics.h(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    private final Object[] i(Object[] root, int shift, int index, Object element, fm8 elementCarry) {
        Object[] objArrCopyOf;
        int iA = oyd.a(index, shift);
        if (shift == 0) {
            if (iA == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(root, 32);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            }
            f.n(root, objArrCopyOf, iA + 1, iA, 31);
            elementCarry.b(root[31]);
            objArrCopyOf[iA] = element;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(root, 32);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(...)");
        int i = shift - 5;
        Object obj = root[iA];
        Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iA] = i((Object[]) obj, i, index, element, elementCarry);
        while (true) {
            iA++;
            if (iA >= 32 || objArrCopyOf2[iA] == null) {
                break;
            }
            Object obj2 = root[iA];
            Intrinsics.h(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf2[iA] = i((Object[]) obj2, i, 0, elementCarry.getValue(), elementCarry);
        }
        return objArrCopyOf2;
    }

    private final g89<E> j(Object[] root, int tailIndex, Object element) {
        int size = size() - u();
        Object[] objArrCopyOf = Arrays.copyOf(this.tail, 32);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        if (size < 32) {
            f.n(this.tail, objArrCopyOf, tailIndex + 1, tailIndex, size);
            objArrCopyOf[tailIndex] = element;
            return new g89<>(root, objArrCopyOf, size() + 1, this.rootShift);
        }
        Object[] objArr = this.tail;
        Object obj = objArr[31];
        f.n(objArr, objArrCopyOf, tailIndex + 1, tailIndex, size - 1);
        objArrCopyOf[tailIndex] = element;
        return q(root, objArrCopyOf, oyd.c(obj));
    }

    private final Object[] n(Object[] root, int shift, int index, fm8 tailCarry) {
        Object[] objArrN;
        int iA = oyd.a(index, shift);
        if (shift == 5) {
            tailCarry.b(root[iA]);
            objArrN = null;
        } else {
            Object obj = root[iA];
            Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrN = n((Object[]) obj, shift - 5, index, tailCarry);
        }
        if (objArrN == null && iA == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(root, 32);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[iA] = objArrN;
        return objArrCopyOf;
    }

    private final i79<E> o(Object[] root, int rootSize, int shift) {
        if (shift == 0) {
            if (root.length == 33) {
                root = Arrays.copyOf(root, 32);
                Intrinsics.checkNotNullExpressionValue(root, "copyOf(...)");
            }
            return new bvb(root);
        }
        fm8 fm8Var = new fm8(null);
        Object[] objArrN = n(root, shift, rootSize - 1, fm8Var);
        Intrinsics.g(objArrN);
        Object value = fm8Var.getValue();
        Intrinsics.h(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) value;
        if (objArrN[1] != null) {
            return new g89(objArrN, objArr, rootSize, shift);
        }
        Object obj = objArrN[0];
        Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return new g89((Object[]) obj, objArr, rootSize, shift - 5);
    }

    private final g89<E> q(Object[] root, Object[] filledTail, Object[] newTail) {
        int size = size() >> 5;
        int i = this.rootShift;
        if (size <= (1 << i)) {
            return new g89<>(r(root, i, filledTail), newTail, size() + 1, this.rootShift);
        }
        Object[] objArrC = oyd.c(root);
        int i2 = this.rootShift + 5;
        return new g89<>(r(objArrC, i2, filledTail), newTail, size() + 1, i2);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0019  */
    private final Object[] r(Object[] root, int shift, Object[] tail) {
        Object[] objArrCopyOf;
        int iA = oyd.a(size() - 1, shift);
        if (root != null) {
            objArrCopyOf = Arrays.copyOf(root, 32);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            if (objArrCopyOf == null) {
                objArrCopyOf = new Object[32];
            }
        } else {
            objArrCopyOf = new Object[32];
        }
        if (shift == 5) {
            objArrCopyOf[iA] = tail;
            return objArrCopyOf;
        }
        objArrCopyOf[iA] = r((Object[]) objArrCopyOf[iA], shift - 5, tail);
        return objArrCopyOf;
    }

    private final Object[] s(Object[] root, int shift, int index, fm8 tailCarry) {
        Object[] objArrCopyOf;
        int iA = oyd.a(index, shift);
        if (shift == 0) {
            if (iA == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(root, 32);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            }
            f.n(root, objArrCopyOf, iA, iA + 1, 32);
            objArrCopyOf[31] = tailCarry.getValue();
            tailCarry.b(root[iA]);
            return objArrCopyOf;
        }
        int iA2 = root[31] == null ? oyd.a(u() - 1, shift) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(root, 32);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(...)");
        int i = shift - 5;
        int i2 = iA + 1;
        if (i2 <= iA2) {
            while (true) {
                Object obj = objArrCopyOf2[iA2];
                Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrCopyOf2[iA2] = s((Object[]) obj, i, 0, tailCarry);
                if (iA2 == i2) {
                    break;
                }
                iA2--;
            }
        }
        Object obj2 = objArrCopyOf2[iA];
        Intrinsics.h(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iA] = s((Object[]) obj2, i, index, tailCarry);
        return objArrCopyOf2;
    }

    private final i79<E> t(Object[] root, int rootSize, int shift, int index) {
        int size = size() - rootSize;
        ok1.a(index < size);
        if (size == 1) {
            return o(root, rootSize, shift);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.tail, 32);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        int i = size - 1;
        if (index < i) {
            f.n(this.tail, objArrCopyOf, index, index + 1, size);
        }
        objArrCopyOf[i] = null;
        return new g89(root, objArrCopyOf, (rootSize + size) - 1, shift);
    }

    private final int u() {
        return oyd.d(size());
    }

    private final Object[] v(Object[] root, int shift, int index, Object e) {
        int iA = oyd.a(index, shift);
        Object[] objArrCopyOf = Arrays.copyOf(root, 32);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        if (shift == 0) {
            objArrCopyOf[iA] = e;
            return objArrCopyOf;
        }
        Object obj = objArrCopyOf[iA];
        Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf[iA] = v((Object[]) obj, shift - 5, index, e);
        return objArrCopyOf;
    }

    @Override // com.google.inputmethod.i79
    public i79<E> B1(int index) {
        f47.a(index, size());
        int iU = u();
        return index >= iU ? t(this.root, iU, this.rootShift, index - iU) : t(s(this.root, this.rootShift, index, new fm8(this.tail[0])), iU, this.rootShift, 0);
    }

    @Override // com.google.inputmethod.i79
    public i79<E> E0(Function1<? super E, Boolean> predicate) {
        k89<E> k89VarBuilder = builder();
        k89VarBuilder.K(predicate);
        return k89VarBuilder.build();
    }

    @Override // com.google.inputmethod.i79, java.util.List, java.util.Collection
    public i79<E> add(E element) {
        int size = size() - u();
        if (size >= 32) {
            return q(this.root, this.tail, oyd.c(element));
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.tail, 32);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[size] = element;
        return new g89(this.root, objArrCopyOf, size() + 1, this.rootShift);
    }

    @Override // com.google.inputmethod.i79
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public k89<E> builder() {
        return new k89<>(this, this.root, this.tail, this.rootShift);
    }

    @Override // java.util.List
    public E get(int index) {
        f47.a(index, size());
        return (E) e(index)[index & 31];
    }

    public int getSize() {
        return this.size;
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int index) {
        f47.b(index, size());
        return new m89(this.root, this.tail, index, size(), (this.rootShift / 5) + 1);
    }

    @Override // com.google.inputmethod.i79, java.util.List
    public i79<E> set(int index, E element) {
        f47.a(index, size());
        if (u() > index) {
            return new g89(v(this.root, this.rootShift, index, element), this.tail, size(), this.rootShift);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.tail, 32);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[index & 31] = element;
        return new g89(this.root, objArrCopyOf, size(), this.rootShift);
    }

    @Override // com.google.inputmethod.i79, java.util.List
    public i79<E> add(int index, E element) {
        f47.b(index, size());
        if (index == size()) {
            return add((Object) element);
        }
        int iU = u();
        if (index >= iU) {
            return j(this.root, index - iU, element);
        }
        fm8 fm8Var = new fm8(null);
        return j(i(this.root, this.rootShift, index, element, fm8Var), 0, fm8Var.getValue());
    }
}
