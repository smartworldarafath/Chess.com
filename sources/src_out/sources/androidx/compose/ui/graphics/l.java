package androidx.compose.ui.graphics;

import androidx.compose.ui.platform.InspectableValueKt;
import com.google.android.r43;
import com.google.inputmethod.ega;
import com.google.inputmethod.l05;
import com.google.inputmethod.xkb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a¿\u0001\u0010\u0019\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001aÕ\u0001\u0010\u001f\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0007¢\u0006\u0004\b\u001f\u0010 \u001a'\u0010%\u001a\u00020\u0000*\u00020\u00002\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0!H\u0007¢\u0006\u0004\b%\u0010&\u001a\u0013\u0010'\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b'\u0010(\"\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, d2 = {"Landroidx/compose/ui/b;", "", "scaleX", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "Landroidx/compose/ui/graphics/t;", "transformOrigin", "Lcom/google/android/xkb;", "shape", "", "clip", "Lcom/google/android/ega;", "renderEffect", "Lcom/google/android/ei1;", "ambientShadowColor", "spotShadowColor", "Landroidx/compose/ui/graphics/j;", "compositingStrategy", "d", "(Landroidx/compose/ui/b;FFFFFFFFFFJLcom/google/android/xkb;ZLcom/google/android/ega;JJI)Landroidx/compose/ui/b;", "Landroidx/compose/ui/graphics/e;", "blendMode", "Landroidx/compose/ui/graphics/h;", "colorFilter", "f", "(Landroidx/compose/ui/b;FFFFFFFFFFJLcom/google/android/xkb;ZLcom/google/android/ega;JJIILandroidx/compose/ui/graphics/h;)Landroidx/compose/ui/b;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/m;", "", "block", "c", "(Landroidx/compose/ui/b;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/b;", "h", "(Landroidx/compose/ui/b;)Landroidx/compose/ui/b;", "Landroidx/compose/ui/graphics/s;", "a", "Landroidx/compose/ui/graphics/s;", "reusableGraphicsLayerScope", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class l {
    private static s a;

    public static final androidx.compose.ui.b c(androidx.compose.ui.b bVar, Function1<? super m, Unit> function1) {
        return bVar.then(new g(function1));
    }

    @r43
    public static final /* synthetic */ androidx.compose.ui.b d(androidx.compose.ui.b bVar, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, xkb xkbVar, boolean z, ega egaVar, long j2, long j3, int i) {
        return f(bVar, f, f2, f3, f4, f5, f6, f7, f8, f9, f10, j, xkbVar, z, egaVar, j2, j3, i, e.INSTANCE.B(), null);
    }

    public static final androidx.compose.ui.b f(androidx.compose.ui.b bVar, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, xkb xkbVar, boolean z, ega egaVar, long j2, long j3, int i, int i2, h hVar) {
        return bVar.then(new GraphicsLayerElement(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, j, xkbVar, z, egaVar, j2, j3, i, i2, hVar, null));
    }

    public static /* synthetic */ androidx.compose.ui.b g(androidx.compose.ui.b bVar, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, xkb xkbVar, boolean z, ega egaVar, long j2, long j3, int i, int i2, h hVar, int i3, Object obj) {
        return f(bVar, (i3 & 1) != 0 ? 1.0f : f, (i3 & 2) != 0 ? 1.0f : f2, (i3 & 4) == 0 ? f3 : 1.0f, (i3 & 8) != 0 ? 0.0f : f4, (i3 & 16) != 0 ? 0.0f : f5, (i3 & 32) != 0 ? 0.0f : f6, (i3 & 64) != 0 ? 0.0f : f7, (i3 & 128) != 0 ? 0.0f : f8, (i3 & 256) == 0 ? f9 : 0.0f, (i3 & 512) != 0 ? 8.0f : f10, (i3 & 1024) != 0 ? t.INSTANCE.a() : j, (i3 & 2048) != 0 ? r.a() : xkbVar, (i3 & 4096) != 0 ? false : z, (i3 & 8192) != 0 ? null : egaVar, (i3 & 16384) != 0 ? l05.a() : j2, (32768 & i3) != 0 ? l05.a() : j3, (65536 & i3) != 0 ? j.INSTANCE.a() : i, (i3 & 131072) != 0 ? e.INSTANCE.B() : i2, (i3 & 262144) != 0 ? null : hVar);
    }

    public static final androidx.compose.ui.b h(androidx.compose.ui.b bVar) {
        return InspectableValueKt.b() ? bVar.then(g(androidx.compose.ui.b.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 0, null, 524287, null)) : bVar;
    }
}
