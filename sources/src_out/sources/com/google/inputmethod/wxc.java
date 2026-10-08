package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\u00020\t*\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0015\u0010\u000bJ\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001a\u0010\u001d\"\u0004\b \u0010\u001f¨\u0006!"}, d2 = {"Lcom/google/android/wxc;", "", "Lcom/google/android/vxc;", "value", "Lcom/google/android/kn6;", "innerTextFieldCoordinates", "decorationBoxCoordinates", "<init>", "(Lcom/google/android/vxc;Lcom/google/android/kn6;Lcom/google/android/kn6;)V", "Lcom/google/android/rn8;", "a", "(J)J", "position", "", "coerceInVisibleBounds", "", "d", "(JZ)I", "offset", "g", "(J)Z", "j", "k", "Lcom/google/android/vxc;", "f", "()Lcom/google/android/vxc;", "b", "Lcom/google/android/kn6;", "c", "()Lcom/google/android/kn6;", "i", "(Lcom/google/android/kn6;)V", "h", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class wxc {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextLayoutResult value;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private kn6 innerTextFieldCoordinates;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private kn6 decorationBoxCoordinates;

    public wxc(TextLayoutResult textLayoutResult, kn6 kn6Var, kn6 kn6Var2) {
        this.value = textLayoutResult;
        this.innerTextFieldCoordinates = kn6Var;
        this.decorationBoxCoordinates = kn6Var2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001e  */
    private final long a(long j) {
        gba gbaVarA;
        kn6 kn6Var = this.innerTextFieldCoordinates;
        if (kn6Var == null) {
            gbaVarA = gba.INSTANCE.a();
        } else {
            if (kn6Var.b()) {
                kn6 kn6Var2 = this.decorationBoxCoordinates;
                gbaVarA = null;
                if (kn6Var2 != null) {
                    gbaVarA = kn6.w(kn6Var2, kn6Var, false, 2, null);
                }
            } else {
                gbaVarA = gba.INSTANCE.a();
            }
            if (gbaVarA == null) {
                gbaVarA = gba.INSTANCE.a();
            }
        }
        return xxc.b(j, gbaVarA);
    }

    public static /* synthetic */ int e(wxc wxcVar, long j, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return wxcVar.d(j, z);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final kn6 getDecorationBoxCoordinates() {
        return this.decorationBoxCoordinates;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final kn6 getInnerTextFieldCoordinates() {
        return this.innerTextFieldCoordinates;
    }

    public final int d(long position, boolean coerceInVisibleBounds) {
        if (coerceInVisibleBounds) {
            position = a(position);
        }
        return this.value.x(j(position));
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextLayoutResult getValue() {
        return this.value;
    }

    public final boolean g(long offset) {
        long j = j(a(offset));
        int iR = this.value.r(Float.intBitsToFloat((int) (4294967295L & j)));
        int i = (int) (j >> 32);
        return Float.intBitsToFloat(i) >= this.value.s(iR) && Float.intBitsToFloat(i) <= this.value.t(iR);
    }

    public final void h(kn6 kn6Var) {
        this.decorationBoxCoordinates = kn6Var;
    }

    public final void i(kn6 kn6Var) {
        this.innerTextFieldCoordinates = kn6Var;
    }

    public final long j(long offset) {
        kn6 kn6Var;
        kn6 kn6Var2 = this.innerTextFieldCoordinates;
        if (kn6Var2 == null) {
            return offset;
        }
        if (!kn6Var2.b()) {
            kn6Var2 = null;
        }
        if (kn6Var2 == null || (kn6Var = this.decorationBoxCoordinates) == null) {
            return offset;
        }
        kn6 kn6Var3 = kn6Var.b() ? kn6Var : null;
        return kn6Var3 == null ? offset : kn6Var2.Q(kn6Var3, offset);
    }

    public final long k(long offset) {
        kn6 kn6Var;
        kn6 kn6Var2 = this.innerTextFieldCoordinates;
        if (kn6Var2 == null) {
            return offset;
        }
        if (!kn6Var2.b()) {
            kn6Var2 = null;
        }
        if (kn6Var2 == null || (kn6Var = this.decorationBoxCoordinates) == null) {
            return offset;
        }
        kn6 kn6Var3 = kn6Var.b() ? kn6Var : null;
        return kn6Var3 == null ? offset : kn6Var3.Q(kn6Var2, offset);
    }

    public /* synthetic */ wxc(TextLayoutResult textLayoutResult, kn6 kn6Var, kn6 kn6Var2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(textLayoutResult, (i & 2) != 0 ? null : kn6Var, (i & 4) != 0 ? null : kn6Var2);
    }
}
