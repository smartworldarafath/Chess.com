package com.google.inputmethod;

import androidx.compose.ui.b;
import androidx.compose.ui.draw.ShadowGraphicsLayerElement;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.graphics.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aC\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a#\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a/\u0010\u0014\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a#\u0010\u0016\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0016\u0010\u000f\u001a\u0013\u0010\u0018\u001a\u00020\u0012*\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/b;", "Lcom/google/android/ff3;", "elevation", "Lcom/google/android/xkb;", "shape", "", "clip", "Lcom/google/android/ei1;", "ambientColor", "spotColor", "f", "(Landroidx/compose/ui/b;FLcom/google/android/xkb;ZJJ)Landroidx/compose/ui/b;", "Lcom/google/android/okb;", "shadow", "b", "(Landroidx/compose/ui/b;Lcom/google/android/xkb;Lcom/google/android/okb;)Landroidx/compose/ui/b;", "Lkotlin/Function1;", "Lcom/google/android/nj3;", "", "block", "c", "(Landroidx/compose/ui/b;Lcom/google/android/xkb;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/b;", "d", "Lcom/google/android/ukb;", "e", "(Lcom/google/android/ukb;)V", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class rkb {
    public static final b b(b bVar, xkb xkbVar, Shadow shadow) {
        return bVar.then(new SimpleDropShadowElement(xkbVar, shadow));
    }

    public static final b c(b bVar, xkb xkbVar, Function1<? super nj3, Unit> function1) {
        return bVar.then(new yo0(xkbVar, function1));
    }

    public static final b d(b bVar, xkb xkbVar, Shadow shadow) {
        return bVar.then(new SimpleInnerShadowElement(xkbVar, shadow));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(ukb ukbVar) {
        ukbVar.setRadius(0.0f);
        ukbVar.M0(0.0f);
        ukbVar.o2(rn8.INSTANCE.c());
        ukbVar.n(ei1.INSTANCE.a());
        ukbVar.Z1(null);
        ukbVar.c(1.0f);
        ukbVar.e(e.INSTANCE.B());
    }

    public static final b f(b bVar, float f, xkb xkbVar, boolean z, long j, long j2) {
        return (ff3.h(f, ff3.i((float) 0)) > 0 || z) ? bVar.then(new ShadowGraphicsLayerElement(f, xkbVar, z, j, j2, null)) : bVar;
    }

    public static /* synthetic */ b g(b bVar, float f, xkb xkbVar, boolean z, long j, long j2, int i, Object obj) {
        boolean z2;
        xkb xkbVarA = (i & 2) != 0 ? r.a() : xkbVar;
        if ((i & 4) != 0) {
            z2 = false;
            if (ff3.h(f, ff3.i(0)) > 0) {
                z2 = true;
            }
        } else {
            z2 = z;
        }
        return f(bVar, f, xkbVarA, z2, (i & 8) != 0 ? l05.a() : j, (i & 16) != 0 ? l05.a() : j2);
    }
}
