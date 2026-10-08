package androidx.compose.p001foundation.lazy.layout;

import com.google.inputmethod.AnimationState;
import com.google.inputmethod.ff3;
import com.google.inputmethod.jr;
import com.google.inputmethod.qu6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a4\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\bH\u0080@¢\u0006\u0004\b\u000b\u0010\f\"\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0012\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f\"\u0014\u0010\u0013\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/google/android/qu6;", "", "index", "", "g", "(Lcom/google/android/qu6;I)Z", "scrollOffset", "numOfItemsForTeleport", "Lcom/google/android/f43;", "density", "", "c", "(Lcom/google/android/qu6;IIILcom/google/android/f43;Lcom/google/android/q22;)Ljava/lang/Object;", "Lcom/google/android/ff3;", "a", "F", "TargetDistance", "b", "BoundDistance", "MinimumDistance", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class LazyLayoutScrollScopeKt {
    private static final float a = ff3.i(2500);
    private static final float b = ff3.i(1500);
    private static final float c = ff3.i(50);

    /* JADX WARN: Code duplicated, block: B:37:0x00ea A[Catch: ItemFoundInScroll -> 0x01ec, TryCatch #6 {ItemFoundInScroll -> 0x01ec, blocks: (B:35:0x00e6, B:37:0x00ea, B:39:0x00f0, B:53:0x0121, B:57:0x015d, B:61:0x0165), top: B:117:0x00e6 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x011a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x011c  */
    /* JADX WARN: Code duplicated, block: B:55:0x015a  */
    /* JADX WARN: Code duplicated, block: B:56:0x015c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0160  */
    /* JADX WARN: Code duplicated, block: B:60:0x0163  */
    /* JADX WARN: Code duplicated, block: B:70:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x01b5 -> B:18:0x0072). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object c(com.google.inputmethod.qu6 r37, int r38, int r39, int r40, com.google.inputmethod.f43 r41, com.google.android.q22<? super kotlin.Unit> r42) {
        /*
            Method dump skipped, instruction units count: 643
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p001foundation.lazy.layout.LazyLayoutScrollScopeKt.c(com.google.android.qu6, int, int, int, com.google.android.f43, com.google.android.q22):java.lang.Object");
    }

    private static final boolean d(boolean z, qu6 qu6Var, int i, int i2) {
        if (z) {
            if (qu6Var.b() > i) {
                return true;
            }
            return qu6Var.b() == i && qu6Var.g() > i2;
        }
        if (qu6Var.b() < i) {
            return true;
        }
        return qu6Var.b() == i && qu6Var.g() < i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(qu6 qu6Var, int i, float f, Ref.FloatRef floatRef, Ref.BooleanRef booleanRef, boolean z, float f2, Ref.IntRef intRef, int i2, int i3, Ref.ObjectRef objectRef, jr jrVar) {
        if (!g(qu6Var, i)) {
            float fI = (f > 0.0f ? g.i(((Number) jrVar.e()).floatValue(), f) : g.d(((Number) jrVar.e()).floatValue(), f)) - floatRef.element;
            float fE = qu6Var.e(fI);
            if (!g(qu6Var, i) && !d(z, qu6Var, i, i3)) {
                if (fI != fE) {
                    jrVar.a();
                    booleanRef.element = false;
                    return Unit.a;
                }
                floatRef.element += fI;
                if (z) {
                    if (((Number) jrVar.e()).floatValue() > f2) {
                        jrVar.a();
                    }
                } else if (((Number) jrVar.e()).floatValue() < (-f2)) {
                    jrVar.a();
                }
                if (z) {
                    if (intRef.element >= 2 && i - qu6Var.c() > i2) {
                        qu6Var.d(i - i2, 0);
                    }
                } else if (intRef.element >= 2 && qu6Var.b() - i > i2) {
                    qu6Var.d(i2 + i, 0);
                }
            }
        }
        if (!d(z, qu6Var, i, i3)) {
            if (g(qu6Var, i)) {
                throw new ItemFoundInScroll(qu6.h(qu6Var, i, 0, 2, null), (AnimationState) objectRef.element);
            }
            return Unit.a;
        }
        qu6Var.d(i, i3);
        booleanRef.element = false;
        jrVar.a();
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(float f, Ref.FloatRef floatRef, qu6 qu6Var, jr jrVar) {
        float fD = 0.0f;
        if (f > 0.0f) {
            fD = g.i(((Number) jrVar.e()).floatValue(), f);
        } else if (f < 0.0f) {
            fD = g.d(((Number) jrVar.e()).floatValue(), f);
        }
        float f2 = fD - floatRef.element;
        if (f2 != qu6Var.e(f2) || fD != ((Number) jrVar.e()).floatValue()) {
            jrVar.a();
        }
        floatRef.element += f2;
        return Unit.a;
    }

    public static final boolean g(qu6 qu6Var, int i) {
        return i <= qu6Var.c() && qu6Var.b() <= i;
    }
}
