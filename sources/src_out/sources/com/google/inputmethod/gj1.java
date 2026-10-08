package com.google.inputmethod;

import android.graphics.ColorSpace;
import android.os.Build;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.graphics.colorspace.c;
import androidx.compose.ui.graphics.colorspace.e;
import java.util.Arrays;
import java.util.function.DoubleUnaryOperator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0004*\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/google/android/gj1;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/colorspace/c;", "Landroid/graphics/ColorSpace;", "e", "(Landroidx/compose/ui/graphics/colorspace/c;)Landroid/graphics/ColorSpace;", "h", "(Landroid/graphics/ColorSpace;)Landroidx/compose/ui/graphics/colorspace/c;", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class gj1 {
    public static final gj1 a = new gj1();

    private gj1() {
    }

    public static final ColorSpace e(c cVar) {
        ColorSpace colorSpaceA;
        e eVar = e.a;
        if (Intrinsics.e(cVar, eVar.G())) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        if (Intrinsics.e(cVar, eVar.m())) {
            return ColorSpace.get(ColorSpace.Named.ACES);
        }
        if (Intrinsics.e(cVar, eVar.n())) {
            return ColorSpace.get(ColorSpace.Named.ACESCG);
        }
        if (Intrinsics.e(cVar, eVar.o())) {
            return ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        }
        if (Intrinsics.e(cVar, eVar.p())) {
            return ColorSpace.get(ColorSpace.Named.BT2020);
        }
        if (Intrinsics.e(cVar, eVar.s())) {
            return ColorSpace.get(ColorSpace.Named.BT709);
        }
        if (Intrinsics.e(cVar, eVar.t())) {
            return ColorSpace.get(ColorSpace.Named.CIE_LAB);
        }
        if (Intrinsics.e(cVar, eVar.u())) {
            return ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        }
        if (Intrinsics.e(cVar, eVar.w())) {
            return ColorSpace.get(ColorSpace.Named.DCI_P3);
        }
        if (Intrinsics.e(cVar, eVar.x())) {
            return ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        }
        if (Intrinsics.e(cVar, eVar.y())) {
            return ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        }
        if (Intrinsics.e(cVar, eVar.z())) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        }
        if (Intrinsics.e(cVar, eVar.A())) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        }
        if (Intrinsics.e(cVar, eVar.B())) {
            return ColorSpace.get(ColorSpace.Named.NTSC_1953);
        }
        if (Intrinsics.e(cVar, eVar.E())) {
            return ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        }
        if (Intrinsics.e(cVar, eVar.F())) {
            return ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        if (Build.VERSION.SDK_INT >= 34 && (colorSpaceA = jj1.a(cVar)) != null) {
            return colorSpaceA;
        }
        if (!(cVar instanceof Rgb)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        Rgb rgb = (Rgb) cVar;
        float[] fArrC = rgb.getWhitePoint().c();
        TransferParameters transferParameters = rgb.getTransferParameters();
        ColorSpace.Rgb.TransferParameters transferParameters2 = transferParameters != null ? new ColorSpace.Rgb.TransferParameters(transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getE(), transferParameters.getF(), transferParameters.getGamma()) : null;
        float[] transform = rgb.getTransform();
        if (transferParameters2 != null) {
            ColorSpace.Rgb rgb2 = new ColorSpace.Rgb(cVar.getName(), rgb.getPrimaries(), fArrC, transferParameters2);
            return (Float.isNaN(transform[0]) || Arrays.equals(rgb2.getTransform(), transform)) ? rgb2 : new ColorSpace.Rgb(cVar.getName(), transform, transferParameters2);
        }
        String name = cVar.getName();
        float[] primaries = rgb.getPrimaries();
        final Function1<Double, Double> function1D = rgb.D();
        DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: com.google.android.cj1
            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d) {
                return gj1.f(function1D, d);
            }
        };
        final Function1<Double, Double> function1Z = rgb.z();
        return new ColorSpace.Rgb(name, primaries, fArrC, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: com.google.android.dj1
            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d) {
                return gj1.g(function1Z, d);
            }
        }, rgb.f(0), rgb.e(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double f(Function1 function1, double d) {
        return ((Number) function1.invoke(Double.valueOf(d))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double g(Function1 function1, double d) {
        return ((Number) function1.invoke(Double.valueOf(d))).doubleValue();
    }

    public static final c h(final ColorSpace colorSpace) {
        int id = colorSpace.getId();
        if (id == ColorSpace.Named.SRGB.ordinal()) {
            return e.a.G();
        }
        if (id == ColorSpace.Named.ACES.ordinal()) {
            return e.a.m();
        }
        if (id == ColorSpace.Named.ACESCG.ordinal()) {
            return e.a.n();
        }
        if (id == ColorSpace.Named.ADOBE_RGB.ordinal()) {
            return e.a.o();
        }
        if (id == ColorSpace.Named.BT2020.ordinal()) {
            return e.a.p();
        }
        if (id == ColorSpace.Named.BT709.ordinal()) {
            return e.a.s();
        }
        if (id == ColorSpace.Named.CIE_LAB.ordinal()) {
            return e.a.t();
        }
        if (id == ColorSpace.Named.CIE_XYZ.ordinal()) {
            return e.a.u();
        }
        if (id == ColorSpace.Named.DCI_P3.ordinal()) {
            return e.a.w();
        }
        if (id == ColorSpace.Named.DISPLAY_P3.ordinal()) {
            return e.a.x();
        }
        if (id == ColorSpace.Named.EXTENDED_SRGB.ordinal()) {
            return e.a.y();
        }
        if (id == ColorSpace.Named.LINEAR_EXTENDED_SRGB.ordinal()) {
            return e.a.z();
        }
        if (id == ColorSpace.Named.LINEAR_SRGB.ordinal()) {
            return e.a.A();
        }
        if (id == ColorSpace.Named.NTSC_1953.ordinal()) {
            return e.a.B();
        }
        if (id == ColorSpace.Named.PRO_PHOTO_RGB.ordinal()) {
            return e.a.E();
        }
        if (id == ColorSpace.Named.SMPTE_C.ordinal()) {
            return e.a.F();
        }
        if (Build.VERSION.SDK_INT >= 34) {
            c cVarB = jj1.b(colorSpace.getId());
            if (!Intrinsics.e(cVarB, e.a.I())) {
                return cVarB;
            }
        }
        if (!(colorSpace instanceof ColorSpace.Rgb)) {
            return e.a.G();
        }
        ColorSpace.Rgb rgb = (ColorSpace.Rgb) colorSpace;
        ColorSpace.Rgb.TransferParameters transferParameters = rgb.getTransferParameters();
        return new Rgb(rgb.getName(), rgb.getPrimaries(), rgb.getWhitePoint().length == 3 ? new WhitePoint(rgb.getWhitePoint()[0], rgb.getWhitePoint()[1], rgb.getWhitePoint()[2]) : new WhitePoint(rgb.getWhitePoint()[0], rgb.getWhitePoint()[1]), rgb.getTransform(), new we3() { // from class: com.google.android.ej1
            @Override // com.google.inputmethod.we3
            public final double a(double d) {
                return gj1.i(colorSpace, d);
            }
        }, new we3() { // from class: com.google.android.fj1
            @Override // com.google.inputmethod.we3
            public final double a(double d) {
                return gj1.j(colorSpace, d);
            }
        }, rgb.getMinValue(0), rgb.getMaxValue(0), transferParameters != null ? new TransferParameters(transferParameters.g, transferParameters.a, transferParameters.b, transferParameters.c, transferParameters.d, transferParameters.e, transferParameters.f) : null, rgb.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double i(ColorSpace colorSpace, double d) {
        return ((ColorSpace.Rgb) colorSpace).getOetf().applyAsDouble(d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double j(ColorSpace colorSpace, double d) {
        return ((ColorSpace.Rgb) colorSpace).getEotf().applyAsDouble(d);
    }
}
