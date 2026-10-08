package com.google.inputmethod;

import androidx.compose.ui.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a'\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0005\u001a%\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/b;", "Lcom/google/android/ff3;", "x", "y", "i", "(Landroidx/compose/ui/b;FF)Landroidx/compose/ui/b;", "d", "Lkotlin/Function1;", "Lcom/google/android/f43;", "Lcom/google/android/g16;", "offset", "g", "(Landroidx/compose/ui/b;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/b;", "foundation-layout"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class yn8 {
    public static final b d(b bVar, final float f, final float f2) {
        return bVar.then(new OffsetModifierElement(f, f2, false, new Function1() { // from class: com.google.android.wn8
            public final Object invoke(Object obj) {
                return yn8.f(f, f2, (jz5) obj);
            }
        }, null));
    }

    public static /* synthetic */ b e(b bVar, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = ff3.i(0);
        }
        if ((i & 2) != 0) {
            f2 = ff3.i(0);
        }
        return d(bVar, f, f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(float f, float f2, jz5 jz5Var) {
        jz5Var.b("absoluteOffset");
        jz5Var.getProperties().c("x", ff3.e(f));
        jz5Var.getProperties().c("y", ff3.e(f2));
        return Unit.a;
    }

    public static final b g(b bVar, final Function1<? super f43, g16> function1) {
        return bVar.then(new OffsetPxModifier(function1, true, new Function1() { // from class: com.google.android.vn8
            public final Object invoke(Object obj) {
                return yn8.h(function1, (jz5) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(Function1 function1, jz5 jz5Var) {
        jz5Var.b("offset");
        jz5Var.getProperties().c("offset", function1);
        return Unit.a;
    }

    public static final b i(b bVar, final float f, final float f2) {
        return bVar.then(new OffsetModifierElement(f, f2, true, new Function1() { // from class: com.google.android.un8
            public final Object invoke(Object obj) {
                return yn8.k(f, f2, (jz5) obj);
            }
        }, null));
    }

    public static /* synthetic */ b j(b bVar, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = ff3.i(0);
        }
        if ((i & 2) != 0) {
            f2 = ff3.i(0);
        }
        return i(bVar, f, f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(float f, float f2, jz5 jz5Var) {
        jz5Var.b("offset");
        jz5Var.getProperties().c("x", ff3.e(f));
        jz5Var.getProperties().c("y", ff3.e(f2));
        return Unit.a;
    }
}
