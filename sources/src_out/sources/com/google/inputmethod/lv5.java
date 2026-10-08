package com.google.inputmethod;

import androidx.collection.ObjectList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/google/android/lv5;", "", "<init>", "()V", "Lcom/google/android/hv5;", "change", "Lcom/google/android/rn8;", "c", "(Lcom/google/android/hv5;)J", "", "a", "I", "eventRotatingIndex", "Lcom/google/android/e58;", "b", "Lcom/google/android/e58;", "eventRotatingArray", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class lv5 {
    public static final int d = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int eventRotatingIndex;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private e58<IndirectPointerInputChange> eventRotatingArray = new e58<>(0, 1, null);

    private static final <T> float d(ObjectList<T> objectList, Function1<? super T, Float> function1) {
        Object[] objArr = objectList.content;
        int i = objectList._size;
        float fFloatValue = 0.0f;
        for (int i2 = 0; i2 < i; i2++) {
            fFloatValue += ((Number) function1.invoke(objArr[i2])).floatValue();
        }
        return fFloatValue / objectList.get_size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float e(IndirectPointerInputChange indirectPointerInputChange) {
        return Float.intBitsToFloat((int) (indirectPointerInputChange.getPosition() >> 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float f(IndirectPointerInputChange indirectPointerInputChange) {
        return Float.intBitsToFloat((int) (indirectPointerInputChange.getPosition() & 4294967295L));
    }

    public final long c(IndirectPointerInputChange change) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (change.getPosition() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (change.getPosition() & 4294967295L));
        if (iv5.g(change)) {
            this.eventRotatingIndex = 0;
            this.eventRotatingArray.u();
        }
        if (!iv5.h(change) && !iv5.g(change)) {
            if (this.eventRotatingArray.get_size() == 3) {
                e58<IndirectPointerInputChange> e58Var = this.eventRotatingArray;
                int i = this.eventRotatingIndex;
                this.eventRotatingIndex = i + 1;
                e58Var.F(i, change);
            } else {
                this.eventRotatingArray.n(change);
            }
            if (this.eventRotatingIndex == 3) {
                this.eventRotatingIndex = 0;
            }
            fIntBitsToFloat = d(this.eventRotatingArray, new Function1() { // from class: com.google.android.jv5
                public final Object invoke(Object obj) {
                    return Float.valueOf(lv5.e((IndirectPointerInputChange) obj));
                }
            });
            fIntBitsToFloat2 = d(this.eventRotatingArray, new Function1() { // from class: com.google.android.kv5
                public final Object invoke(Object obj) {
                    return Float.valueOf(lv5.f((IndirectPointerInputChange) obj));
                }
            });
        }
        return rn8.e((((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
    }
}
