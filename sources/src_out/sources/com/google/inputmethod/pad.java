package com.google.inputmethod;

import androidx.compose.p001foundation.layout.g1;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006JK\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0014\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0017\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0013R\u0017\u0010\u0019\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0018\u0010\u0013R\u0017\u0010\u001b\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\u001a\u0010\u0013R\u0017\u0010\u001e\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001d\u0010\u0013R\u0017\u0010!\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0012\u001a\u0004\b \u0010\u0013R\u0017\u0010$\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\"\u0010\u0012\u001a\u0004\b#\u0010\u0013R\u0017\u0010'\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b%\u0010\u0012\u001a\u0004\b&\u0010\u0013R\u0017\u0010*\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b(\u0010\u0012\u001a\u0004\b)\u0010\u0013R\u0018\u0010.\u001a\u00020\u0004*\u00020+8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u00101\u001a\u00020/8G¢\u0006\u0006\u001a\u0004\b\u0015\u00100¨\u00062"}, d2 = {"Lcom/google/android/pad;", "", "<init>", "()V", "Lcom/google/android/oad;", "d", "(Landroidx/compose/runtime/d;I)Lcom/google/android/oad;", "Lcom/google/android/ei1;", "containerColor", "scrolledContainerColor", "navigationIconContentColor", "titleContentColor", "actionIconContentColor", "subtitleContentColor", "e", "(JJJJJJLandroidx/compose/runtime/d;II)Lcom/google/android/oad;", "Lcom/google/android/ff3;", "b", "F", "()F", "TopAppBarExpandedHeight", "c", "getMediumAppBarCollapsedHeight-D9Ej5fM", "MediumAppBarCollapsedHeight", "getMediumAppBarExpandedHeight-D9Ej5fM", "MediumAppBarExpandedHeight", "getMediumFlexibleAppBarWithoutSubtitleExpandedHeight-D9Ej5fM", "MediumFlexibleAppBarWithoutSubtitleExpandedHeight", "f", "getMediumFlexibleAppBarWithSubtitleExpandedHeight-D9Ej5fM", "MediumFlexibleAppBarWithSubtitleExpandedHeight", "g", "getLargeAppBarCollapsedHeight-D9Ej5fM", "LargeAppBarCollapsedHeight", "h", "getLargeAppBarExpandedHeight-D9Ej5fM", "LargeAppBarExpandedHeight", "i", "getLargeFlexibleAppBarWithoutSubtitleExpandedHeight-D9Ej5fM", "LargeFlexibleAppBarWithoutSubtitleExpandedHeight", "j", "getLargeFlexibleAppBarWithSubtitleExpandedHeight-D9Ej5fM", "LargeFlexibleAppBarWithSubtitleExpandedHeight", "Lcom/google/android/yi1;", "a", "(Lcom/google/android/yi1;)Lcom/google/android/oad;", "defaultTopAppBarColors", "Landroidx/compose/foundation/layout/g1;", "(Landroidx/compose/runtime/d;I)Landroidx/compose/foundation/layout/g1;", "windowInsets", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class pad {
    public static final pad a = new pad();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final float TopAppBarExpandedHeight;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final float MediumAppBarCollapsedHeight;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final float MediumAppBarExpandedHeight;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final float MediumFlexibleAppBarWithoutSubtitleExpandedHeight;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final float MediumFlexibleAppBarWithSubtitleExpandedHeight;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final float LargeAppBarCollapsedHeight;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private static final float LargeAppBarExpandedHeight;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private static final float LargeFlexibleAppBarWithoutSubtitleExpandedHeight;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private static final float LargeFlexibleAppBarWithSubtitleExpandedHeight;
    public static final int k = 0;

    static {
        gv gvVar = gv.a;
        TopAppBarExpandedHeight = gvVar.a();
        MediumAppBarCollapsedHeight = gvVar.a();
        MediumAppBarExpandedHeight = fv.a.a();
        ev evVar = ev.a;
        MediumFlexibleAppBarWithoutSubtitleExpandedHeight = evVar.a();
        MediumFlexibleAppBarWithSubtitleExpandedHeight = evVar.b();
        LargeAppBarCollapsedHeight = gvVar.a();
        LargeAppBarExpandedHeight = bv.a.a();
        av avVar = av.a;
        LargeFlexibleAppBarWithoutSubtitleExpandedHeight = avVar.a();
        LargeFlexibleAppBarWithSubtitleExpandedHeight = avVar.b();
    }

    private pad() {
    }

    public final oad a(ColorScheme colorScheme) {
        oad defaultTopAppBarColorsCached = colorScheme.getDefaultTopAppBarColorsCached();
        if (defaultTopAppBarColorsCached != null) {
            return defaultTopAppBarColorsCached;
        }
        hv hvVar = hv.a;
        oad oadVar = new oad(bj1.j(colorScheme, hvVar.a()), bj1.j(colorScheme, hvVar.c()), bj1.j(colorScheme, hvVar.b()), bj1.j(colorScheme, hvVar.e()), bj1.j(colorScheme, hvVar.f()), bj1.j(colorScheme, hvVar.d()), null);
        colorScheme.z0(oadVar);
        return oadVar;
    }

    public final float b() {
        return TopAppBarExpandedHeight;
    }

    public final g1 c(d dVar, int i) {
        if (e.k()) {
            e.o(2143182847, i, -1, "androidx.compose.material3.TopAppBarDefaults.<get-windowInsets> (AppBar.kt:1526)");
        }
        g1 g1VarA = uic.a(g1.INSTANCE, dVar, 6);
        fke.Companion companion = fke.INSTANCE;
        g1 g1VarK = rje.k(g1VarA, fke.n(companion.g(), companion.h()));
        if (e.k()) {
            e.n();
        }
        return g1VarK;
    }

    public final oad d(d dVar, int i) {
        if (e.k()) {
            e.o(-1388520854, i, -1, "androidx.compose.material3.TopAppBarDefaults.topAppBarColors (AppBar.kt:1444)");
        }
        oad oadVarA = a(kh7.a.a(dVar, 6));
        if (e.k()) {
            e.n();
        }
        return oadVarA;
    }

    public final oad e(long j, long j2, long j3, long j4, long j5, long j6, d dVar, int i, int i2) {
        long jI = (i2 & 1) != 0 ? ei1.INSTANCE.i() : j;
        long jI2 = (i2 & 2) != 0 ? ei1.INSTANCE.i() : j2;
        long jI3 = (i2 & 4) != 0 ? ei1.INSTANCE.i() : j3;
        long jI4 = (i2 & 8) != 0 ? ei1.INSTANCE.i() : j4;
        long jI5 = (i2 & 16) != 0 ? ei1.INSTANCE.i() : j5;
        long jI6 = (i2 & 32) != 0 ? ei1.INSTANCE.i() : j6;
        if (e.k()) {
            e.o(-1325733438, i, -1, "androidx.compose.material3.TopAppBarDefaults.topAppBarColors (AppBar.kt:1467)");
        }
        oad oadVarB = a(kh7.a.a(dVar, 6)).b(jI, jI2, jI3, jI4, jI5, jI6);
        if (e.k()) {
            e.n();
        }
        return oadVarB;
    }
}
