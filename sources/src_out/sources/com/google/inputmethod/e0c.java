package com.google.inputmethod;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001a\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u0004\u0018\u00018\u00002\u0006\u0010\t\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u0006J\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0006J!\u0010\u0011\u001a\u0004\u0018\u00018\u00002\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0019\u0010\u000bJ\u0017\u0010\u001a\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001a\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\fH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\"\u0010\u0014J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020\u001d8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\"\u0010&R\u0016\u0010*\u001a\u00020(8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b \u0010)R\u001e\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0+8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010-R\u0016\u00100\u001a\u00020\u00038\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010/¨\u00061"}, d2 = {"Lcom/google/android/e0c;", "E", "", "", "initialCapacity", "<init>", "(I)V", "c", "()Lcom/google/android/e0c;", "key", "e", "(I)Ljava/lang/Object;", "", "j", "index", "k", "value", "l", "(ILjava/lang/Object;)Ljava/lang/Object;", "i", "(ILjava/lang/Object;)V", "m", "()I", "h", "(I)I", "n", "f", "g", "(Ljava/lang/Object;)I", "", "d", "(I)Z", "b", "()V", "a", "", "toString", "()Ljava/lang/String;", "Z", "garbage", "", "[I", "keys", "", "", "[Ljava/lang/Object;", "values", "I", "size", "collection"}, k = 1, mv = {1, lo6.HASACTION_FIELD_NUMBER, 0}, xi = 48)
public class e0c<E> implements Cloneable {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public /* synthetic */ boolean garbage;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public /* synthetic */ int[] keys;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public /* synthetic */ Object[] values;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public /* synthetic */ int size;

    public e0c() {
        this(0, 1, null);
    }

    public void a(int key, E value) {
        int i = this.size;
        if (i != 0 && key <= this.keys[i - 1]) {
            i(key, value);
            return;
        }
        if (this.garbage && i >= this.keys.length) {
            f0c.e(this);
        }
        int i2 = this.size;
        if (i2 >= this.keys.length) {
            int iE = ty1.e(i2 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.keys, iE);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.keys = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.values, iE);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.values = objArrCopyOf;
        }
        this.keys[i2] = key;
        this.values[i2] = value;
        this.size = i2 + 1;
    }

    public void b() {
        int i = this.size;
        Object[] objArr = this.values;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.size = 0;
        this.garbage = false;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public e0c<E> clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        Intrinsics.h(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        e0c<E> e0cVar = (e0c) objClone;
        e0cVar.keys = (int[]) this.keys.clone();
        e0cVar.values = (Object[]) this.values.clone();
        return e0cVar;
    }

    public boolean d(int key) {
        return f(key) >= 0;
    }

    public E e(int key) {
        return (E) f0c.c(this, key);
    }

    public int f(int key) {
        if (this.garbage) {
            f0c.e(this);
        }
        return ty1.a(this.keys, this.size, key);
    }

    public int g(E value) {
        if (this.garbage) {
            f0c.e(this);
        }
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.values[i2] == value) {
                return i2;
            }
        }
        return -1;
    }

    public int h(int index) {
        if (this.garbage) {
            f0c.e(this);
        }
        return this.keys[index];
    }

    public void i(int key, E value) {
        int iA = ty1.a(this.keys, this.size, key);
        if (iA >= 0) {
            this.values[iA] = value;
            return;
        }
        int i = ~iA;
        if (i < this.size && this.values[i] == f0c.a) {
            this.keys[i] = key;
            this.values[i] = value;
            return;
        }
        if (this.garbage && this.size >= this.keys.length) {
            f0c.e(this);
            i = ~ty1.a(this.keys, this.size, key);
        }
        int i2 = this.size;
        if (i2 >= this.keys.length) {
            int iE = ty1.e(i2 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.keys, iE);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.keys = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.values, iE);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.values = objArrCopyOf;
        }
        int i3 = this.size;
        if (i3 - i != 0) {
            int[] iArr = this.keys;
            int i4 = i + 1;
            f.l(iArr, iArr, i4, i, i3);
            Object[] objArr = this.values;
            f.n(objArr, objArr, i4, i, this.size);
        }
        this.keys[i] = key;
        this.values[i] = value;
        this.size++;
    }

    public void j(int key) {
        f0c.d(this, key);
    }

    public void k(int index) {
        if (this.values[index] != f0c.a) {
            this.values[index] = f0c.a;
            this.garbage = true;
        }
    }

    public E l(int key, E value) {
        int iF = f(key);
        if (iF < 0) {
            return null;
        }
        Object[] objArr = this.values;
        E e = (E) objArr[iF];
        objArr[iF] = value;
        return e;
    }

    public int m() {
        if (this.garbage) {
            f0c.e(this);
        }
        return this.size;
    }

    public E n(int index) {
        if (this.garbage) {
            f0c.e(this);
        }
        Object[] objArr = this.values;
        if (index < objArr.length) {
            return (E) objArr[index];
        }
        rh1 rh1Var = rh1.a;
        throw new ArrayIndexOutOfBoundsException();
    }

    public String toString() {
        if (m() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.size * 28);
        sb.append('{');
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(h(i2));
            sb.append('=');
            E eN = n(i2);
            if (eN != this) {
                sb.append(eN);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public e0c(int i) {
        if (i == 0) {
            this.keys = ty1.a;
            this.values = ty1.c;
        } else {
            int iE = ty1.e(i);
            this.keys = new int[iE];
            this.values = new Object[iE];
        }
    }

    public /* synthetic */ e0c(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 10 : i);
    }
}
