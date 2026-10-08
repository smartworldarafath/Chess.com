package com.google.inputmethod;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\u001d\u0010\u000e\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\nJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0010J=\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ=\u0010\"\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010\u001bJ-\u0010#\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b#\u0010$J-\u0010%\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006¢\u0006\u0004\b%\u0010$JE\u0010,\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020)2\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b,\u0010-R$\u00102\u001a\u0012\u0012\u0004\u0012\u00020/0.j\b\u0012\u0004\u0012\u00020/`08\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u00101R\u0017\u00106\u001a\b\u0012\u0004\u0012\u00020/038F¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Lcom/google/android/d39;", "", "<init>", "()V", "b", "()Lcom/google/android/d39;", "", "x", "y", "j", "(FF)Lcom/google/android/d39;", "h", "dx", "dy", "i", "f", "(F)Lcom/google/android/d39;", "g", "m", "n", "x1", "y1", "x2", "y2", "x3", "y3", "c", "(FFFFFF)Lcom/google/android/d39;", "dx1", "dy1", "dx2", "dy2", "dx3", "dy3", "d", "k", "(FFFF)Lcom/google/android/d39;", "l", "horizontalEllipseRadius", "verticalEllipseRadius", "theta", "", "isMoreThanHalf", "isPositiveArc", "a", "(FFFZZFF)Lcom/google/android/d39;", "Ljava/util/ArrayList;", "Lcom/google/android/u39;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "_nodes", "", "e", "()Ljava/util/List;", "nodes", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d39 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ArrayList<u39> _nodes = new ArrayList<>(32);

    public final d39 a(float horizontalEllipseRadius, float verticalEllipseRadius, float theta, boolean isMoreThanHalf, boolean isPositiveArc, float x1, float y1) {
        this._nodes.add(new u39.ArcTo(horizontalEllipseRadius, verticalEllipseRadius, theta, isMoreThanHalf, isPositiveArc, x1, y1));
        return this;
    }

    public final d39 b() {
        this._nodes.add(u39.b.c);
        return this;
    }

    public final d39 c(float x1, float y1, float x2, float y2, float x3, float y3) {
        this._nodes.add(new u39.CurveTo(x1, y1, x2, y2, x3, y3));
        return this;
    }

    public final d39 d(float dx1, float dy1, float dx2, float dy2, float dx3, float dy3) {
        this._nodes.add(new u39.RelativeCurveTo(dx1, dy1, dx2, dy2, dx3, dy3));
        return this;
    }

    public final List<u39> e() {
        return this._nodes;
    }

    public final d39 f(float x) {
        this._nodes.add(new u39.HorizontalTo(x));
        return this;
    }

    public final d39 g(float dx) {
        this._nodes.add(new u39.RelativeHorizontalTo(dx));
        return this;
    }

    public final d39 h(float x, float y) {
        this._nodes.add(new u39.LineTo(x, y));
        return this;
    }

    public final d39 i(float dx, float dy) {
        this._nodes.add(new u39.RelativeLineTo(dx, dy));
        return this;
    }

    public final d39 j(float x, float y) {
        this._nodes.add(new u39.MoveTo(x, y));
        return this;
    }

    public final d39 k(float x1, float y1, float x2, float y2) {
        this._nodes.add(new u39.ReflectiveCurveTo(x1, y1, x2, y2));
        return this;
    }

    public final d39 l(float dx1, float dy1, float dx2, float dy2) {
        this._nodes.add(new u39.RelativeReflectiveCurveTo(dx1, dy1, dx2, dy2));
        return this;
    }

    public final d39 m(float y) {
        this._nodes.add(new u39.VerticalTo(y));
        return this;
    }

    public final d39 n(float dy) {
        this._nodes.add(new u39.RelativeVerticalTo(dy));
        return this;
    }
}
