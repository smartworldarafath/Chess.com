package com.google.inputmethod;

import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0014\n\u0002\b\u0005\u001a!\u0010\u0004\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a_\u0010\r\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\r\u0010\u0013\u001a_\u0010\f\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\u001a\"\u001a\u0010\u001f\u001a\u00020\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"", "Lcom/google/android/u39;", "Landroidx/compose/ui/graphics/Path;", "target", "c", "(Ljava/util/List;Landroidx/compose/ui/graphics/Path;)Landroidx/compose/ui/graphics/Path;", "p", "", "x0", "y0", "x1", "y1", "a", "b", "theta", "", "isMoreThanHalf", "isPositiveArc", "", "(Landroidx/compose/ui/graphics/Path;DDDDDDDZZ)V", "cx", "cy", "e1x", "e1y", "start", "sweep", "(Landroidx/compose/ui/graphics/Path;DDDDDDDDD)V", "", "[F", "getEmptyArray", "()[F", "EmptyArray", "ui-graphics"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class z39 {
    private static final float[] a = new float[0];

    private static final void a(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        double d10 = 4;
        int iCeil = (int) Math.ceil(Math.abs((d9 * d10) / 3.141592653589793d));
        double dCos = Math.cos(d7);
        double dSin = Math.sin(d7);
        double dCos2 = Math.cos(d8);
        double dSin2 = Math.sin(d8);
        double d11 = -d3;
        double d12 = d11 * dCos;
        double d13 = d4 * dSin;
        double d14 = (d12 * dSin2) - (d13 * dCos2);
        double d15 = d11 * dSin;
        double d16 = d4 * dCos;
        double d17 = (dSin2 * d15) + (dCos2 * d16);
        double d18 = d9 / ((double) iCeil);
        double d19 = d17;
        double d20 = d14;
        int i = 0;
        double d21 = d5;
        double d22 = d6;
        double d23 = d8;
        while (i < iCeil) {
            double d24 = d23 + d18;
            double dSin3 = Math.sin(d24);
            double dCos3 = Math.cos(d24);
            int i2 = i;
            double d25 = (d + ((d3 * dCos) * dCos3)) - (d13 * dSin3);
            double d26 = d10;
            double d27 = d2 + (d3 * dSin * dCos3) + (d16 * dSin3);
            double d28 = (d12 * dSin3) - (d13 * dCos3);
            double d29 = (dSin3 * d15) + (dCos3 * d16);
            double d30 = d24 - d23;
            int i3 = iCeil;
            double dTan = Math.tan(d30 / ((double) 2));
            double dSin4 = (Math.sin(d30) * (Math.sqrt(d26 + ((3.0d * dTan) * dTan)) - ((double) 1))) / ((double) 3);
            path.d((float) (d21 + (d20 * dSin4)), (float) (d22 + (d19 * dSin4)), (float) (d25 - (dSin4 * d28)), (float) (d27 - (dSin4 * d29)), (float) d25, (float) d27);
            dSin = dSin;
            d18 = d18;
            d21 = d25;
            d22 = d27;
            i = i2 + 1;
            d23 = d24;
            d19 = d29;
            iCeil = i3;
            d20 = d28;
            dCos = dCos;
            d10 = d26;
        }
    }

    private static final void b(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        double d10 = (d7 / ((double) 180)) * 3.141592653589793d;
        double dCos = Math.cos(d10);
        double dSin = Math.sin(d10);
        double d11 = ((d * dCos) + (d2 * dSin)) / d5;
        double d12 = (((-d) * dSin) + (d2 * dCos)) / d6;
        double d13 = ((d3 * dCos) + (d4 * dSin)) / d5;
        double d14 = (((-d3) * dSin) + (d4 * dCos)) / d6;
        double d15 = d11 - d13;
        double d16 = d12 - d14;
        double d17 = 2;
        double d18 = (d11 + d13) / d17;
        double d19 = (d12 + d14) / d17;
        double d20 = (d15 * d15) + (d16 * d16);
        if (d20 == 0.0d) {
            return;
        }
        double d21 = (1.0d / d20) - 0.25d;
        if (d21 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d20) / 1.99999d);
            b(path, d, d2, d3, d4, d5 * dSqrt, d6 * dSqrt, d7, z, z2);
            return;
        }
        double dSqrt2 = Math.sqrt(d21);
        double d22 = d15 * dSqrt2;
        double d23 = dSqrt2 * d16;
        if (z == z2) {
            d8 = d18 - d23;
            d9 = d19 + d22;
        } else {
            d8 = d18 + d23;
            d9 = d19 - d22;
        }
        double dAtan2 = Math.atan2(d12 - d9, d11 - d8);
        double dAtan3 = Math.atan2(d14 - d9, d13 - d8) - dAtan2;
        if (z2 != (dAtan3 >= 0.0d)) {
            dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
        }
        double d24 = d8 * d5;
        double d25 = d9 * d6;
        a(path, (d24 * dCos) - (d25 * dSin), (d24 * dSin) + (d25 * dCos), d5, d6, d, d2, d10, dAtan2, dAtan3);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final Path c(List<? extends u39> list, Path path) throws NoWhenBranchMatchedException {
        float f;
        float f2;
        float x1;
        float x2;
        float y2;
        float dy2;
        float f3;
        float f4;
        float dx1;
        float dy1;
        float dy3;
        List<? extends u39> list2 = list;
        Path path2 = path;
        int iM = path2.m();
        path2.rewind();
        path2.u(iM);
        u39 u39Var = list2.isEmpty() ? u39.b.c : list2.get(0);
        int size = list2.size();
        float f5 = 0.0f;
        int i = 0;
        float arcStartX = 0.0f;
        float arcStartY = 0.0f;
        float x = 0.0f;
        float y = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        while (i < size) {
            u39 u39Var2 = list2.get(i);
            if (u39Var2 instanceof u39.b) {
                path2.close();
                size = size;
                f5 = f5;
                u39Var2 = u39Var2;
                arcStartX = f6;
                x = arcStartX;
                arcStartY = f7;
            } else {
                if (u39Var2 instanceof u39.RelativeMoveTo) {
                    u39.RelativeMoveTo relativeMoveTo = (u39.RelativeMoveTo) u39Var2;
                    x += relativeMoveTo.getDx();
                    y += relativeMoveTo.getDy();
                    path2.f(relativeMoveTo.getDx(), relativeMoveTo.getDy());
                    f6 = x;
                    f7 = y;
                } else if (u39Var2 instanceof u39.MoveTo) {
                    u39.MoveTo moveTo = (u39.MoveTo) u39Var2;
                    float x3 = moveTo.getX();
                    float y3 = moveTo.getY();
                    path2.b(moveTo.getX(), moveTo.getY());
                    x = x3;
                    f6 = x;
                    y = y3;
                    f7 = y;
                } else {
                    if (u39Var2 instanceof u39.RelativeLineTo) {
                        u39.RelativeLineTo relativeLineTo = (u39.RelativeLineTo) u39Var2;
                        path2.z(relativeLineTo.getDx(), relativeLineTo.getDy());
                        x += relativeLineTo.getDx();
                        dy2 = relativeLineTo.getDy();
                    } else {
                        if (u39Var2 instanceof u39.LineTo) {
                            u39.LineTo lineTo = (u39.LineTo) u39Var2;
                            path2.c(lineTo.getX(), lineTo.getY());
                            x2 = lineTo.getX();
                            y2 = lineTo.getY();
                        } else if (u39Var2 instanceof u39.RelativeHorizontalTo) {
                            u39.RelativeHorizontalTo relativeHorizontalTo = (u39.RelativeHorizontalTo) u39Var2;
                            path2.z(relativeHorizontalTo.getDx(), f5);
                            x += relativeHorizontalTo.getDx();
                        } else if (u39Var2 instanceof u39.HorizontalTo) {
                            u39.HorizontalTo horizontalTo = (u39.HorizontalTo) u39Var2;
                            path2.c(horizontalTo.getX(), y);
                            x = horizontalTo.getX();
                        } else if (u39Var2 instanceof u39.RelativeVerticalTo) {
                            u39.RelativeVerticalTo relativeVerticalTo = (u39.RelativeVerticalTo) u39Var2;
                            path2.z(f5, relativeVerticalTo.getDy());
                            dy2 = relativeVerticalTo.getDy();
                        } else if (u39Var2 instanceof u39.VerticalTo) {
                            u39.VerticalTo verticalTo = (u39.VerticalTo) u39Var2;
                            path2.c(x, verticalTo.getY());
                            y = verticalTo.getY();
                        } else {
                            if (u39Var2 instanceof u39.RelativeCurveTo) {
                                u39.RelativeCurveTo relativeCurveTo = (u39.RelativeCurveTo) u39Var2;
                                path2.g(relativeCurveTo.getDx1(), relativeCurveTo.getDy1(), relativeCurveTo.getDx2(), relativeCurveTo.getDy2(), relativeCurveTo.getDx3(), relativeCurveTo.getDy3());
                                dx1 = relativeCurveTo.getDx2() + x;
                                dy1 = relativeCurveTo.getDy2() + y;
                                x += relativeCurveTo.getDx3();
                                dy3 = relativeCurveTo.getDy3();
                            } else {
                                if (u39Var2 instanceof u39.CurveTo) {
                                    u39.CurveTo curveTo = (u39.CurveTo) u39Var2;
                                    path.d(curveTo.getX1(), curveTo.getY1(), curveTo.getX2(), curveTo.getY2(), curveTo.getX3(), curveTo.getY3());
                                    float x4 = curveTo.getX2();
                                    float y4 = curveTo.getY2();
                                    float x5 = curveTo.getX3();
                                    float y5 = curveTo.getY3();
                                    x = x5;
                                    y = y5;
                                    size = size;
                                    f5 = f5;
                                    i = i;
                                    u39Var2 = u39Var2;
                                    arcStartX = x4;
                                    arcStartY = y4;
                                } else if (u39Var2 instanceof u39.RelativeReflectiveCurveTo) {
                                    if (u39Var.getIsCurve()) {
                                        float f8 = x - arcStartX;
                                        f4 = y - arcStartY;
                                        f3 = f8;
                                    } else {
                                        f3 = f5;
                                        f4 = f3;
                                    }
                                    u39.RelativeReflectiveCurveTo relativeReflectiveCurveTo = (u39.RelativeReflectiveCurveTo) u39Var2;
                                    path.g(f3, f4, relativeReflectiveCurveTo.getDx1(), relativeReflectiveCurveTo.getDy1(), relativeReflectiveCurveTo.getDx2(), relativeReflectiveCurveTo.getDy2());
                                    dx1 = relativeReflectiveCurveTo.getDx1() + x;
                                    dy1 = relativeReflectiveCurveTo.getDy1() + y;
                                    x += relativeReflectiveCurveTo.getDx2();
                                    dy3 = relativeReflectiveCurveTo.getDy2();
                                } else {
                                    if (u39Var2 instanceof u39.ReflectiveCurveTo) {
                                        if (u39Var.getIsCurve()) {
                                            float f9 = 2;
                                            x = (x * f9) - arcStartX;
                                            y = (f9 * y) - arcStartY;
                                        }
                                        u39.ReflectiveCurveTo reflectiveCurveTo = (u39.ReflectiveCurveTo) u39Var2;
                                        path.d(x, y, reflectiveCurveTo.getX1(), reflectiveCurveTo.getY1(), reflectiveCurveTo.getX2(), reflectiveCurveTo.getY2());
                                        x1 = reflectiveCurveTo.getX1();
                                        float y1 = reflectiveCurveTo.getY1();
                                        float x6 = reflectiveCurveTo.getX2();
                                        float y6 = reflectiveCurveTo.getY2();
                                        x = x6;
                                        y = y6;
                                        arcStartY = y1;
                                    } else if (u39Var2 instanceof u39.RelativeQuadTo) {
                                        u39.RelativeQuadTo relativeQuadTo = (u39.RelativeQuadTo) u39Var2;
                                        path.j(relativeQuadTo.getDx1(), relativeQuadTo.getDy1(), relativeQuadTo.getDx2(), relativeQuadTo.getDy2());
                                        arcStartX = relativeQuadTo.getDx1() + x;
                                        arcStartY = relativeQuadTo.getDy1() + y;
                                        x += relativeQuadTo.getDx2();
                                        dy2 = relativeQuadTo.getDy2();
                                    } else if (u39Var2 instanceof u39.QuadTo) {
                                        u39.QuadTo quadTo = (u39.QuadTo) u39Var2;
                                        path.v(quadTo.getX1(), quadTo.getY1(), quadTo.getX2(), quadTo.getY2());
                                        arcStartX = quadTo.getX1();
                                        arcStartY = quadTo.getY1();
                                        x2 = quadTo.getX2();
                                        y2 = quadTo.getY2();
                                    } else if (u39Var2 instanceof u39.RelativeReflectiveQuadTo) {
                                        if (u39Var.getIsQuad()) {
                                            f = x - arcStartX;
                                            f2 = y - arcStartY;
                                        } else {
                                            f = f5;
                                            f2 = f;
                                        }
                                        u39.RelativeReflectiveQuadTo relativeReflectiveQuadTo = (u39.RelativeReflectiveQuadTo) u39Var2;
                                        path.j(f, f2, relativeReflectiveQuadTo.getDx(), relativeReflectiveQuadTo.getDy());
                                        x1 = f + x;
                                        float f10 = f2 + y;
                                        x += relativeReflectiveQuadTo.getDx();
                                        y += relativeReflectiveQuadTo.getDy();
                                        arcStartY = f10;
                                    } else if (u39Var2 instanceof u39.ReflectiveQuadTo) {
                                        if (u39Var.getIsQuad()) {
                                            float f11 = 2;
                                            x = (x * f11) - arcStartX;
                                            y = (f11 * y) - arcStartY;
                                        }
                                        u39.ReflectiveQuadTo reflectiveQuadTo = (u39.ReflectiveQuadTo) u39Var2;
                                        path.v(x, y, reflectiveQuadTo.getX(), reflectiveQuadTo.getY());
                                        float f12 = x;
                                        x = reflectiveQuadTo.getX();
                                        arcStartX = f12;
                                        size = size;
                                        f5 = f5;
                                        i = i;
                                        arcStartY = y;
                                        u39Var2 = u39Var2;
                                        y = reflectiveQuadTo.getY();
                                    } else if (u39Var2 instanceof u39.RelativeArcTo) {
                                        u39.RelativeArcTo relativeArcTo = (u39.RelativeArcTo) u39Var2;
                                        float arcStartDx = relativeArcTo.getArcStartDx() + x;
                                        float arcStartDy = relativeArcTo.getArcStartDy() + y;
                                        f5 = f5;
                                        u39Var2 = u39Var2;
                                        size = size;
                                        b(path, x, y, arcStartDx, arcStartDy, relativeArcTo.getHorizontalEllipseRadius(), relativeArcTo.getVerticalEllipseRadius(), relativeArcTo.getTheta(), relativeArcTo.getIsMoreThanHalf(), relativeArcTo.getIsPositiveArc());
                                        arcStartX = arcStartDx;
                                        x = arcStartX;
                                        arcStartY = arcStartDy;
                                    } else {
                                        size = size;
                                        f5 = f5;
                                        u39Var2 = u39Var2;
                                        if (!(u39Var2 instanceof u39.ArcTo)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        u39.ArcTo arcTo = (u39.ArcTo) u39Var2;
                                        b(path, x, y, arcTo.getArcStartX(), arcTo.getArcStartY(), arcTo.getHorizontalEllipseRadius(), arcTo.getVerticalEllipseRadius(), arcTo.getTheta(), arcTo.getIsMoreThanHalf(), arcTo.getIsPositiveArc());
                                        arcStartX = arcTo.getArcStartX();
                                        x = arcStartX;
                                        arcStartY = arcTo.getArcStartY();
                                    }
                                    arcStartX = x1;
                                }
                                i++;
                                path2 = path;
                                u39Var = u39Var2;
                                size = size;
                                f5 = f5;
                                list2 = list;
                            }
                            y += dy3;
                            arcStartX = dx1;
                            arcStartY = dy1;
                        }
                        y = y2;
                        x = x2;
                    }
                    y += dy2;
                }
                u39Var2 = u39Var2;
                i++;
                path2 = path;
                u39Var = u39Var2;
                size = size;
                f5 = f5;
                list2 = list;
            }
            y = arcStartY;
            i++;
            path2 = path;
            u39Var = u39Var2;
            size = size;
            f5 = f5;
            list2 = list;
        }
        return path;
    }

    public static /* synthetic */ Path d(List list, Path path, int i, Object obj) {
        if ((i & 1) != 0) {
            path = d.a();
        }
        return c(list, path);
    }
}
