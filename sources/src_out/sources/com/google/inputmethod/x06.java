package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u000bJ+\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0013\u0010\u0014JA\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00152\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u000bJ\u001a\u0010 \u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010#R\u001c\u0010(\u001a\u00020$8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u0013\u0010%\u0012\u0004\b&\u0010'R\u001c\u0010,\u001a\u00020\u00028\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b)\u0010*\u0012\u0004\b+\u0010'\u0082\u0001\u0001-¨\u0006."}, d2 = {"Lcom/google/android/x06;", "", "", "initialCapacity", "<init>", "(I)V", "element", "", "c", "(I)Z", "d", "()I", "index", "e", "(I)I", "f", "i", "fromIndex", "toIndex", "a", "(III)I", "", "separator", "prefix", "postfix", "limit", "truncated", "", "g", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;)Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "", "[I", "getContent$annotations", "()V", "content", "b", "I", "get_size$annotations", "_size", "Lcom/google/android/n48;", "collection"}, k = 1, mv = {1, lo6.HASACTION_FIELD_NUMBER, 0}, xi = 48)
public abstract class x06 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int[] content;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int _size;

    public /* synthetic */ x06(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    public static /* synthetic */ int b(x06 x06Var, int i, int i2, int i3, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: binarySearch");
        }
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = x06Var._size;
        }
        return x06Var.a(i, i2, i3);
    }

    public static /* synthetic */ String h(x06 x06Var, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i2 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i2 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        CharSequence charSequence6 = charSequence3;
        return x06Var.g(charSequence, charSequence2, charSequence6, i, charSequence5);
    }

    public final int a(int element, int fromIndex, int toIndex) {
        if (fromIndex < 0 || fromIndex >= toIndex || toIndex > this._size) {
            qra.c("");
        }
        int i = toIndex - 1;
        while (fromIndex <= i) {
            int i2 = (fromIndex + i) >>> 1;
            int i3 = this.content[i2];
            if (i3 < element) {
                fromIndex = i2 + 1;
            } else {
                if (i3 <= element) {
                    return i2;
                }
                i = i2 - 1;
            }
        }
        return -(fromIndex + 1);
    }

    public final boolean c(int element) {
        int[] iArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] == element) {
                return true;
            }
        }
        return false;
    }

    public final int d() {
        if (this._size == 0) {
            qra.d("IntList is empty.");
        }
        return this.content[0];
    }

    public final int e(int index) {
        if (index < 0 || index >= this._size) {
            qra.c("Index must be between 0 and size");
        }
        return this.content[index];
    }

    public boolean equals(Object other) {
        if (other instanceof x06) {
            x06 x06Var = (x06) other;
            int i = x06Var._size;
            int i2 = this._size;
            if (i == i2) {
                int[] iArr = this.content;
                int[] iArr2 = x06Var.content;
                IntRange intRangeA = g.A(0, i2);
                int iF = intRangeA.f();
                int i3 = intRangeA.i();
                if (iF > i3) {
                    return true;
                }
                while (iArr[iF] == iArr2[iF]) {
                    if (iF == i3) {
                        return true;
                    }
                    iF++;
                }
                return false;
            }
        }
        return false;
    }

    public final int f(int element) {
        int[] iArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            if (element == iArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    public final String g(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        int[] iArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i2 == limit) {
                sb.append(truncated);
                String string = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            }
            if (i2 != 0) {
                sb.append(separator);
            }
            sb.append(i3);
        }
        sb.append(postfix);
        String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    public int hashCode() {
        int[] iArr = this.content;
        int i = this._size;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += Integer.hashCode(iArr[i2]) * 31;
        }
        return iHashCode;
    }

    public final int i() {
        if (this._size == 0) {
            qra.d("IntList is empty.");
        }
        return this.content[this._size - 1];
    }

    public String toString() {
        return h(this, null, "[", "]", 0, null, 25, null);
    }

    private x06(int i) {
        this.content = i == 0 ? p16.a() : new int[i];
    }
}
