package com.google.inputmethod;

import androidx.compose.ui.b;
import androidx.compose.ui.layout.j;
import androidx.compose.ui.layout.o;
import com.google.android.ps4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\" \u0010\u0007\u001a\u00020\u00008\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0001\u0010\u0002\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004\" \u0010\u000b\u001a\u00020\u00008\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u0002\u0012\u0004\b\n\u0010\u0006\u001a\u0004\b\t\u0010\u0004\"\u001a\u0010\u0011\u001a\u00020\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u001a\u0010\u0014\u001a\u00020\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/google/android/ff3;", "a", "F", "getHorizontalSemanticsBoundsPadding", "()F", "getHorizontalSemanticsBoundsPadding$annotations", "()V", "HorizontalSemanticsBoundsPadding", "b", "getVerticalSemanticsBoundsPadding", "getVerticalSemanticsBoundsPadding$annotations", "VerticalSemanticsBoundsPadding", "Landroidx/compose/ui/b;", "c", "Landroidx/compose/ui/b;", "getIncreaseHorizontalSemanticsBounds", "()Landroidx/compose/ui/b;", "IncreaseHorizontalSemanticsBounds", "d", "m", "IncreaseVerticalSemanticsBounds", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class i7 {
    private static final float a;
    private static final float b;
    private static final b c;
    private static final b d;

    static {
        float f = 10;
        float fI = ff3.i(f);
        a = fI;
        float fI2 = ff3.i(f);
        b = fI2;
        b.Companion companion = b.INSTANCE;
        c = nx8.p(afb.c(zn6.a(companion, new ps4() { // from class: com.google.android.c7
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return i7.g((j) obj, (dj7) obj2, (kx1) obj3);
            }
        }), true, new Function1() { // from class: com.google.android.d7
            public final Object invoke(Object obj) {
                return i7.i((nfb) obj);
            }
        }), fI, 0.0f, 2, null);
        d = nx8.p(afb.c(zn6.a(companion, new ps4() { // from class: com.google.android.e7
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return i7.j((j) obj, (dj7) obj2, (kx1) obj3);
            }
        }), true, new Function1() { // from class: com.google.android.f7
            public final Object invoke(Object obj) {
                return i7.l((nfb) obj);
            }
        }), 0.0f, fI2, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fj7 g(j jVar, dj7 dj7Var, kx1 kx1Var) {
        final int iO1 = jVar.O1(a);
        long value = kx1Var.getValue();
        int i = iO1 * 2;
        final o oVarR0 = dj7Var.r0(nx1.i(value, i, 0));
        return j.Q1(jVar, oVarR0.getWidth() - i, oVarR0.getHeight(), null, new Function1() { // from class: com.google.android.h7
            public final Object invoke(Object obj) {
                return i7.h(oVarR0, iO1, (o.a) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(o oVar, int i, o.a aVar) {
        o.a.z(aVar, oVar, -i, 0, 0.0f, 4, null);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(nfb nfbVar) {
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fj7 j(j jVar, dj7 dj7Var, kx1 kx1Var) {
        final int iO1 = jVar.O1(b);
        long value = kx1Var.getValue();
        int i = iO1 * 2;
        final o oVarR0 = dj7Var.r0(nx1.i(value, 0, i));
        return j.Q1(jVar, oVarR0.getWidth(), oVarR0.getHeight() - i, null, new Function1() { // from class: com.google.android.g7
            public final Object invoke(Object obj) {
                return i7.k(oVarR0, iO1, (o.a) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(o oVar, int i, o.a aVar) {
        o.a.z(aVar, oVar, 0, -i, 0.0f, 4, null);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(nfb nfbVar) {
        return Unit.a;
    }

    public static final b m() {
        return d;
    }
}
