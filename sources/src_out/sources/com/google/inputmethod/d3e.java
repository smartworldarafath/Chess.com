package com.google.inputmethod;

import androidx.compose.ui.graphics.p;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b \b\u0007\u0018\u00002\u00020\u0001B\u009b\u0001\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b$\u0010-\u001a\u0004\b&\u0010.R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b(\u0010/\u001a\u0004\b*\u00100R\u0019\u0010\r\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b1\u0010.R\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b3\u00100R\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b4\u0010/\u001a\u0004\b5\u00100R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b1\u0010+\u001a\u0004\b6\u0010!R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b3\u0010+\u001a\u0004\b7\u0010!R\u0017\u0010\u0014\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b8\u0010/\u001a\u0004\b9\u00100R\u0017\u0010\u0015\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b:\u0010/\u001a\u0004\b;\u00100R\u0017\u0010\u0016\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b<\u0010/\u001a\u0004\b=\u00100R\u0017\u0010\u0017\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b6\u0010/\u001a\u0004\b>\u00100¨\u0006?"}, d2 = {"Lcom/google/android/d3e;", "Lcom/google/android/b3e;", "", "name", "", "Lcom/google/android/u39;", "pathData", "Landroidx/compose/ui/graphics/p;", "pathFillType", "Lcom/google/android/qu0;", "fill", "", "fillAlpha", "stroke", "strokeAlpha", "strokeLineWidth", "Lcom/google/android/wbc;", "strokeLineCap", "Lcom/google/android/ybc;", "strokeLineJoin", "strokeLineMiter", "trimPathStart", "trimPathEnd", "trimPathOffset", "<init>", "(Ljava/lang/String;Ljava/util/List;ILcom/google/android/qu0;FLcom/google/android/qu0;FFIIFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "b", "Ljava/util/List;", "e", "()Ljava/util/List;", "c", "I", "f", "Lcom/google/android/qu0;", "()Lcom/google/android/qu0;", "F", "()F", "i", "g", "j", "h", "r", "n", "o", "k", "q", "l", "u", "m", "s", "t", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d3e extends b3e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<u39> pathData;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int pathFillType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final qu0 fill;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final float fillAlpha;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final qu0 stroke;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final float strokeAlpha;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final float strokeLineWidth;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final int strokeLineCap;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final int strokeLineJoin;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final float strokeLineMiter;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final float trimPathStart;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final float trimPathEnd;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final float trimPathOffset;

    public /* synthetic */ d3e(String str, List list, int i, qu0 qu0Var, float f, qu0 qu0Var2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, i, qu0Var, f, qu0Var2, f2, f3, i2, i3, f4, f5, f6, f7);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final qu0 getFill() {
        return this.fill;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getFillAlpha() {
        return this.fillAlpha;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final List<u39> e() {
        return this.pathData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && d3e.class == other.getClass()) {
            d3e d3eVar = (d3e) other;
            return Intrinsics.e(this.name, d3eVar.name) && Intrinsics.e(this.fill, d3eVar.fill) && this.fillAlpha == d3eVar.fillAlpha && Intrinsics.e(this.stroke, d3eVar.stroke) && this.strokeAlpha == d3eVar.strokeAlpha && this.strokeLineWidth == d3eVar.strokeLineWidth && wbc.e(this.strokeLineCap, d3eVar.strokeLineCap) && ybc.e(this.strokeLineJoin, d3eVar.strokeLineJoin) && this.strokeLineMiter == d3eVar.strokeLineMiter && this.trimPathStart == d3eVar.trimPathStart && this.trimPathEnd == d3eVar.trimPathEnd && this.trimPathOffset == d3eVar.trimPathOffset && p.d(this.pathFillType, d3eVar.pathFillType) && Intrinsics.e(this.pathData, d3eVar.pathData);
        }
        return false;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getPathFillType() {
        return this.pathFillType;
    }

    public int hashCode() {
        int iHashCode = ((this.name.hashCode() * 31) + this.pathData.hashCode()) * 31;
        qu0 qu0Var = this.fill;
        int iHashCode2 = (((iHashCode + (qu0Var != null ? qu0Var.hashCode() : 0)) * 31) + Float.hashCode(this.fillAlpha)) * 31;
        qu0 qu0Var2 = this.stroke;
        return ((((((((((((((((((iHashCode2 + (qu0Var2 != null ? qu0Var2.hashCode() : 0)) * 31) + Float.hashCode(this.strokeAlpha)) * 31) + Float.hashCode(this.strokeLineWidth)) * 31) + wbc.f(this.strokeLineCap)) * 31) + ybc.f(this.strokeLineJoin)) * 31) + Float.hashCode(this.strokeLineMiter)) * 31) + Float.hashCode(this.trimPathStart)) * 31) + Float.hashCode(this.trimPathEnd)) * 31) + Float.hashCode(this.trimPathOffset)) * 31) + p.e(this.pathFillType);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final qu0 getStroke() {
        return this.stroke;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final float getStrokeAlpha() {
        return this.strokeAlpha;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getStrokeLineCap() {
        return this.strokeLineCap;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final int getStrokeLineJoin() {
        return this.strokeLineJoin;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final float getStrokeLineMiter() {
        return this.strokeLineMiter;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final float getStrokeLineWidth() {
        return this.strokeLineWidth;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final float getTrimPathEnd() {
        return this.trimPathEnd;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final float getTrimPathOffset() {
        return this.trimPathOffset;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final float getTrimPathStart() {
        return this.trimPathStart;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private d3e(String str, List<? extends u39> list, int i, qu0 qu0Var, float f, qu0 qu0Var2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        super(null);
        this.name = str;
        this.pathData = list;
        this.pathFillType = i;
        this.fill = qu0Var;
        this.fillAlpha = f;
        this.stroke = qu0Var2;
        this.strokeAlpha = f2;
        this.strokeLineWidth = f3;
        this.strokeLineCap = i2;
        this.strokeLineJoin = i3;
        this.strokeLineMiter = f4;
        this.trimPathStart = f5;
        this.trimPathEnd = f6;
        this.trimPathOffset = f7;
    }
}
