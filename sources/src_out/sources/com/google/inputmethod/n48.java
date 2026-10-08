package com.google.inputmethod;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0005J\u0015\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\tJ\u0017\u0010\u0017\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001b\u001a\u00020\u000b2\b\b\u0001\u0010\u0019\u001a\u00020\u00022\b\b\u0001\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\rJ\"\u0010\u001c\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u000b¢\u0006\u0004\b\u001e\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/google/android/n48;", "Lcom/google/android/x06;", "", "initialCapacity", "<init>", "(I)V", "element", "", "k", "(I)Z", "index", "", "j", "(II)V", "", "elements", "l", "(I[I)Z", "m", "()V", "capacity", "n", "o", "p", "(I)I", "start", "end", "q", "r", "(II)I", "s", "collection"}, k = 1, mv = {1, lo6.HASACTION_FIELD_NUMBER, 0}, xi = 48)
public final class n48 extends x06 {
    public n48(int i) {
        super(i, null);
    }

    public final void j(int index, int element) {
        if (index < 0 || index > this._size) {
            qra.c("Index must be between 0 and size");
        }
        n(this._size + 1);
        int[] iArr = this.content;
        int i = this._size;
        if (index != i) {
            f.l(iArr, iArr, index + 1, index, i);
        }
        iArr[index] = element;
        this._size++;
    }

    public final boolean k(int element) {
        n(this._size + 1);
        int[] iArr = this.content;
        int i = this._size;
        iArr[i] = element;
        this._size = i + 1;
        return true;
    }

    public final boolean l(int index, int[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (index < 0 || index > this._size) {
            qra.c("");
        }
        if (elements.length == 0) {
            return false;
        }
        n(this._size + elements.length);
        int[] iArr = this.content;
        int i = this._size;
        if (index != i) {
            f.l(iArr, iArr, elements.length + index, index, i);
        }
        f.q(elements, iArr, index, 0, 0, 12, (Object) null);
        this._size += elements.length;
        return true;
    }

    public final void m() {
        this._size = 0;
    }

    public final void n(int capacity) {
        int[] iArr = this.content;
        if (iArr.length < capacity) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, Math.max(capacity, (iArr.length * 3) / 2));
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.content = iArrCopyOf;
        }
    }

    public final boolean o(int element) {
        int iF = f(element);
        if (iF < 0) {
            return false;
        }
        p(iF);
        return true;
    }

    public final int p(int index) {
        if (index < 0 || index >= this._size) {
            qra.c("Index must be between 0 and size");
        }
        int[] iArr = this.content;
        int i = iArr[index];
        int i2 = this._size;
        if (index != i2 - 1) {
            f.l(iArr, iArr, index, index + 1, i2);
        }
        this._size--;
        return i;
    }

    public final void q(int start, int end) {
        int i;
        if (start < 0 || start > (i = this._size) || end < 0 || end > i) {
            qra.c("Index must be between 0 and size");
        }
        if (end < start) {
            qra.a("The end index must be < start index");
        }
        if (end != start) {
            int i2 = this._size;
            if (end < i2) {
                int[] iArr = this.content;
                f.l(iArr, iArr, start, end, i2);
            }
            this._size -= end - start;
        }
    }

    public final int r(int index, int element) {
        if (index < 0 || index >= this._size) {
            qra.c("Index must be between 0 and size");
        }
        int[] iArr = this.content;
        int i = iArr[index];
        iArr[index] = element;
        return i;
    }

    public final void s() {
        int i = this._size;
        if (i == 0) {
            return;
        }
        f.R(this.content, 0, i);
    }

    public /* synthetic */ n48(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 16 : i);
    }
}
