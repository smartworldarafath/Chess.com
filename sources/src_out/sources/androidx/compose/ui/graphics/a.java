package androidx.compose.ui.graphics;

import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/graphics/e;", "Landroid/graphics/PorterDuff$Mode;", "b", "(I)Landroid/graphics/PorterDuff$Mode;", "Landroid/graphics/BlendMode;", "a", "(I)Landroid/graphics/BlendMode;", "ui-graphics"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a {
    public static final BlendMode a(int i) {
        e.Companion companion = e.INSTANCE;
        if (e.E(i, companion.a())) {
            return BlendMode.CLEAR;
        }
        if (e.E(i, companion.x())) {
            return BlendMode.SRC;
        }
        if (e.E(i, companion.g())) {
            return BlendMode.DST;
        }
        if (e.E(i, companion.B())) {
            return BlendMode.SRC_OVER;
        }
        if (e.E(i, companion.k())) {
            return BlendMode.DST_OVER;
        }
        if (e.E(i, companion.z())) {
            return BlendMode.SRC_IN;
        }
        if (e.E(i, companion.i())) {
            return BlendMode.DST_IN;
        }
        if (e.E(i, companion.A())) {
            return BlendMode.SRC_OUT;
        }
        if (e.E(i, companion.j())) {
            return BlendMode.DST_OUT;
        }
        if (e.E(i, companion.y())) {
            return BlendMode.SRC_ATOP;
        }
        if (e.E(i, companion.h())) {
            return BlendMode.DST_ATOP;
        }
        if (e.E(i, companion.C())) {
            return BlendMode.XOR;
        }
        if (e.E(i, companion.t())) {
            return BlendMode.PLUS;
        }
        if (e.E(i, companion.q())) {
            return BlendMode.MODULATE;
        }
        if (e.E(i, companion.v())) {
            return BlendMode.SCREEN;
        }
        if (e.E(i, companion.s())) {
            return BlendMode.OVERLAY;
        }
        if (e.E(i, companion.e())) {
            return BlendMode.DARKEN;
        }
        if (e.E(i, companion.o())) {
            return BlendMode.LIGHTEN;
        }
        if (e.E(i, companion.d())) {
            return BlendMode.COLOR_DODGE;
        }
        if (e.E(i, companion.c())) {
            return BlendMode.COLOR_BURN;
        }
        if (e.E(i, companion.m())) {
            return BlendMode.HARD_LIGHT;
        }
        if (e.E(i, companion.w())) {
            return BlendMode.SOFT_LIGHT;
        }
        if (e.E(i, companion.f())) {
            return BlendMode.DIFFERENCE;
        }
        if (e.E(i, companion.l())) {
            return BlendMode.EXCLUSION;
        }
        if (e.E(i, companion.r())) {
            return BlendMode.MULTIPLY;
        }
        if (e.E(i, companion.n())) {
            return BlendMode.HUE;
        }
        if (e.E(i, companion.u())) {
            return BlendMode.SATURATION;
        }
        if (e.E(i, companion.b())) {
            return BlendMode.COLOR;
        }
        return e.E(i, companion.p()) ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    public static final PorterDuff.Mode b(int i) {
        e.Companion companion = e.INSTANCE;
        if (e.E(i, companion.a())) {
            return PorterDuff.Mode.CLEAR;
        }
        if (e.E(i, companion.x())) {
            return PorterDuff.Mode.SRC;
        }
        if (e.E(i, companion.g())) {
            return PorterDuff.Mode.DST;
        }
        if (e.E(i, companion.B())) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (e.E(i, companion.k())) {
            return PorterDuff.Mode.DST_OVER;
        }
        if (e.E(i, companion.z())) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (e.E(i, companion.i())) {
            return PorterDuff.Mode.DST_IN;
        }
        if (e.E(i, companion.A())) {
            return PorterDuff.Mode.SRC_OUT;
        }
        if (e.E(i, companion.j())) {
            return PorterDuff.Mode.DST_OUT;
        }
        if (e.E(i, companion.y())) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        if (e.E(i, companion.h())) {
            return PorterDuff.Mode.DST_ATOP;
        }
        if (e.E(i, companion.C())) {
            return PorterDuff.Mode.XOR;
        }
        if (e.E(i, companion.t())) {
            return PorterDuff.Mode.ADD;
        }
        if (e.E(i, companion.v())) {
            return PorterDuff.Mode.SCREEN;
        }
        if (e.E(i, companion.s())) {
            return PorterDuff.Mode.OVERLAY;
        }
        if (e.E(i, companion.e())) {
            return PorterDuff.Mode.DARKEN;
        }
        if (e.E(i, companion.o())) {
            return PorterDuff.Mode.LIGHTEN;
        }
        return e.E(i, companion.q()) ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }
}
