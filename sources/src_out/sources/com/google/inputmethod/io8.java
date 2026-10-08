package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\u0003R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/google/android/io8;", "", "<init>", "()V", "Lcom/google/android/rn8;", "offset", "d", "(J)J", "", "c", "", "a", "I", "eventRotatingIndex", "Lcom/google/android/v48;", "b", "Lcom/google/android/v48;", "eventRotatingArray", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class io8 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int eventRotatingIndex;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private v48 eventRotatingArray = new v48(0, 1, null);

    private static final float e(t97 t97Var, Function1<? super Long, Float> function1) {
        long[] jArr = t97Var.content;
        int i = t97Var._size;
        float fFloatValue = 0.0f;
        for (int i2 = 0; i2 < i; i2++) {
            fFloatValue += ((Number) function1.invoke(Long.valueOf(jArr[i2]))).floatValue();
        }
        return fFloatValue / t97Var._size;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float f(long j) {
        return Float.intBitsToFloat((int) (rn8.e(j) >> 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float g(long j) {
        return Float.intBitsToFloat((int) (rn8.e(j) & 4294967295L));
    }

    public final void c() {
        this.eventRotatingIndex = 0;
        this.eventRotatingArray.f();
    }

    public final long d(long offset) {
        v48 v48Var = this.eventRotatingArray;
        if (v48Var._size == 3) {
            int i = this.eventRotatingIndex;
            this.eventRotatingIndex = i + 1;
            v48Var.j(i, offset);
        } else {
            v48Var.d(offset);
        }
        if (this.eventRotatingIndex == 3) {
            this.eventRotatingIndex = 0;
        }
        float fE = e(this.eventRotatingArray, new Function1() { // from class: com.google.android.go8
            public final Object invoke(Object obj) {
                return Float.valueOf(io8.f(((Long) obj).longValue()));
            }
        });
        return rn8.e((((long) Float.floatToRawIntBits(e(this.eventRotatingArray, new Function1() { // from class: com.google.android.ho8
            public final Object invoke(Object obj) {
                return Float.valueOf(io8.g(((Long) obj).longValue()));
            }
        }))) & 4294967295L) | (Float.floatToRawIntBits(fE) << 32));
    }
}
