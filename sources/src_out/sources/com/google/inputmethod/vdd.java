package com.google.inputmethod;

import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\u0007\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\u0003\u001a\u0011\u0010\b\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\f\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u000e\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000f\u001a1\u0010\u0013\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/input/pointer/e;", "", "h", "(Landroidx/compose/ui/input/pointer/e;)F", "Lcom/google/android/rn8;", "b", "(J)F", "i", "g", "(Landroidx/compose/ui/input/pointer/e;)J", "", "useCurrent", "f", "(Landroidx/compose/ui/input/pointer/e;Z)F", "c", "(Landroidx/compose/ui/input/pointer/e;Z)J", "Lkotlin/Function1;", "Landroidx/compose/ui/input/pointer/i;", "pointerInputChangeMatcher", "d", "(Landroidx/compose/ui/input/pointer/e;ZLkotlin/jvm/functions/Function1;)J", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class vdd {
    private static final float b(long j) {
        int i = (int) (j >> 32);
        if (Float.intBitsToFloat(i) == 0.0f && Float.intBitsToFloat((int) (j & 4294967295L)) == 0.0f) {
            return 0.0f;
        }
        return ((-((float) Math.atan2(Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j & 4294967295L))))) * 180.0f) / 3.1415927f;
    }

    public static final long c(e eVar, boolean z) {
        return d(eVar, z, new Function1() { // from class: com.google.android.udd
            public final Object invoke(Object obj) {
                return Boolean.valueOf(vdd.e((PointerInputChange) obj));
            }
        });
    }

    public static final long d(e eVar, boolean z, Function1<? super PointerInputChange, Boolean> function1) {
        long jC = rn8.INSTANCE.c();
        List<PointerInputChange> listC = eVar.c();
        int size = listC.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            PointerInputChange pointerInputChange = listC.get(i2);
            if (((Boolean) function1.invoke(pointerInputChange)).booleanValue()) {
                jC = rn8.q(jC, z ? pointerInputChange.getPosition() : pointerInputChange.getPreviousPosition());
                i++;
            }
        }
        return i == 0 ? rn8.INSTANCE.b() : rn8.h(jC, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(PointerInputChange pointerInputChange) {
        return pointerInputChange.getPressed() && pointerInputChange.getPreviousPressed();
    }

    public static final float f(e eVar, boolean z) {
        long jC = c(eVar, z);
        float fK = 0.0f;
        if (rn8.j(jC, rn8.INSTANCE.b())) {
            return 0.0f;
        }
        List<PointerInputChange> listC = eVar.c();
        int size = listC.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            PointerInputChange pointerInputChange = listC.get(i2);
            if (pointerInputChange.getPressed() && pointerInputChange.getPreviousPressed()) {
                fK += rn8.k(rn8.p(z ? pointerInputChange.getPosition() : pointerInputChange.getPreviousPosition(), jC));
                i++;
            }
        }
        return fK / i;
    }

    public static final long g(e eVar) {
        long jC = c(eVar, true);
        rn8.Companion companion = rn8.INSTANCE;
        return rn8.j(jC, companion.b()) ? companion.c() : rn8.p(jC, c(eVar, false));
    }

    public static final float h(e eVar) {
        List<PointerInputChange> listC = eVar.c();
        int size = listC.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 1;
            if (i >= size) {
                break;
            }
            PointerInputChange pointerInputChange = listC.get(i);
            if (!pointerInputChange.getPreviousPressed() || !pointerInputChange.getPressed()) {
                i3 = 0;
            }
            i2 += i3;
            i++;
        }
        if (i2 < 2) {
            return 0.0f;
        }
        long jC = c(eVar, true);
        long jC2 = c(eVar, false);
        List<PointerInputChange> listC2 = eVar.c();
        int size2 = listC2.size();
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i4 = 0; i4 < size2; i4++) {
            PointerInputChange pointerInputChange2 = listC2.get(i4);
            if (pointerInputChange2.getPressed() && pointerInputChange2.getPreviousPressed()) {
                long position = pointerInputChange2.getPosition();
                long jP = rn8.p(pointerInputChange2.getPreviousPosition(), jC2);
                long jP2 = rn8.p(position, jC);
                float fB = b(jP2) - b(jP);
                float fK = rn8.k(rn8.q(jP2, jP)) / 2.0f;
                if (fB > 180.0f) {
                    fB -= 360.0f;
                } else if (fB < -180.0f) {
                    fB += 360.0f;
                }
                f2 += fB * fK;
                f += fK;
            }
        }
        if (f == 0.0f) {
            return 0.0f;
        }
        return f2 / f;
    }

    public static final float i(e eVar) {
        float f = f(eVar, true);
        float f2 = f(eVar, false);
        if (f == 0.0f || f2 == 0.0f) {
            return 1.0f;
        }
        return f / f2;
    }
}
