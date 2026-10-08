package com.google.inputmethod;

import androidx.compose.ui.text.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0013\u0010\r\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000bJ#\u0010\u0013\u001a\u00020\u0002*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/google/android/i80;", "Lcom/google/android/eqc;", "Lcom/google/android/b0d;", "minFontSize", "maxFontSize", "stepSize", "<init>", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lcom/google/android/vxc;", "", "b", "(Lcom/google/android/vxc;)Z", "c", "d", "Lcom/google/android/fqc;", "Lcom/google/android/kx1;", "constraints", "Landroidx/compose/ui/text/b;", "text", "a", "(Lcom/google/android/fqc;JLandroidx/compose/ui/text/b;)J", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class i80 implements eqc {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private long minFontSize;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long maxFontSize;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long stepSize;

    public /* synthetic */ i80(long j, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3);
    }

    private final boolean b(TextLayoutResult textLayoutResult) {
        int overflow = textLayoutResult.getLayoutInput().getOverflow();
        uyc.Companion companion = uyc.INSTANCE;
        if (uyc.g(overflow, companion.a()) || uyc.g(overflow, companion.e())) {
            return c(textLayoutResult);
        }
        if (uyc.g(overflow, companion.d()) || uyc.g(overflow, companion.c()) || uyc.g(overflow, companion.b())) {
            return d(textLayoutResult);
        }
        throw new IllegalArgumentException("TextOverflow type " + ((Object) uyc.i(textLayoutResult.getLayoutInput().getOverflow())) + " is not supported.");
    }

    private final boolean c(TextLayoutResult textLayoutResult) {
        return textLayoutResult.g() || textLayoutResult.f();
    }

    private final boolean d(TextLayoutResult textLayoutResult) {
        int iN = textLayoutResult.n();
        if (iN == 0) {
            return false;
        }
        if (iN == 1) {
            return textLayoutResult.D(0);
        }
        int overflow = textLayoutResult.getLayoutInput().getOverflow();
        uyc.Companion companion = uyc.INSTANCE;
        if (uyc.g(overflow, companion.d()) || uyc.g(overflow, companion.c())) {
            return c(textLayoutResult);
        }
        if (uyc.g(overflow, companion.b())) {
            return textLayoutResult.D(textLayoutResult.n() - 1);
        }
        return false;
    }

    @Override // com.google.inputmethod.eqc
    public long a(fqc fqcVar, long j, b bVar) {
        float fT1 = fqcVar.T1(this.stepSize);
        float fT2 = fqcVar.T1(this.minFontSize);
        float fT3 = fqcVar.T1(this.maxFontSize);
        float f = 2;
        float f2 = (fT2 + fT3) / f;
        float f3 = fT2;
        float f4 = fT3;
        while (f4 - f3 >= fT1) {
            if (b(fqcVar.H1(j, bVar, fqcVar.Y(f2)))) {
                f4 = f2;
            } else {
                f3 = f2;
            }
            f2 = (f3 + f4) / f;
        }
        float fFloor = fT2 + (((float) Math.floor((f3 - fT2) / fT1)) * fT1);
        float f5 = fT1 + fFloor;
        if (f5 <= fT3 && !b(fqcVar.H1(j, bVar, fqcVar.Y(f5)))) {
            fFloor = f5;
        }
        return fqcVar.Y(fFloor);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (other == null || !(other instanceof i80)) {
            return false;
        }
        i80 i80Var = (i80) other;
        return b0d.e(i80Var.minFontSize, this.minFontSize) && b0d.e(i80Var.maxFontSize, this.maxFontSize) && b0d.e(i80Var.stepSize, this.stepSize);
    }

    @Override // com.google.inputmethod.eqc
    public int hashCode() {
        return (((b0d.i(this.minFontSize) * 31) + b0d.i(this.maxFontSize)) * 31) + b0d.i(this.stepSize);
    }

    private i80(long j, long j2, long j3) {
        this.minFontSize = j;
        this.maxFontSize = j2;
        this.stepSize = j3;
        b0d.Companion companion = b0d.INSTANCE;
        if (b0d.e(j, companion.a())) {
            throw new IllegalArgumentException("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for minFontSize. Try using other values e.g. 10.sp");
        }
        if (b0d.e(j2, companion.a())) {
            throw new IllegalArgumentException("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for maxFontSize. Try using other values e.g. 100.sp");
        }
        if (b0d.e(j3, companion.a())) {
            throw new IllegalArgumentException("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for stepSize. Try using other values e.g. 0.25.sp");
        }
        if (d0d.g(b0d.g(this.minFontSize), b0d.g(j2))) {
            long j4 = this.minFontSize;
            c0d.c(j4, j2);
            if (Float.compare(b0d.h(j4), b0d.h(j2)) > 0) {
                this.minFontSize = j2;
            }
        }
        if (d0d.g(b0d.g(j3), d0d.INSTANCE.b())) {
            long jH = c0d.h(1.0E-4f);
            c0d.c(j3, jH);
            if (Float.compare(b0d.h(j3), b0d.h(jH)) < 0) {
                throw new IllegalArgumentException("AutoSize.StepBased: stepSize must be greater than or equal to 0.0001f.sp");
            }
        }
        if (b0d.h(this.minFontSize) < 0.0f) {
            throw new IllegalArgumentException("AutoSize.StepBased: minFontSize must not be negative");
        }
        if (b0d.h(j2) < 0.0f) {
            throw new IllegalArgumentException("AutoSize.StepBased: maxFontSize must not be negative");
        }
    }
}
