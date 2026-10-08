package com.google.inputmethod;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import java.text.BreakIterator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ#\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010#\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u0012R\u0014\u0010%\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010$R\u0013\u0010'\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010&R\u0011\u0010(\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\"\u0010\fR\u0011\u0010)\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\f¨\u0006*"}, d2 = {"Lcom/google/android/vn6;", "", "", "charSequence", "Landroid/text/TextPaint;", "textPaint", "", "textDirectionHeuristic", "<init>", "(Ljava/lang/CharSequence;Landroid/text/TextPaint;I)V", "", "b", "()F", "a", "start", "end", "e", "(II)F", "Ljava/lang/CharSequence;", "Landroid/text/TextPaint;", "c", "I", "d", "F", "_maxIntrinsicWidth", "_minIntrinsicWidth", "Landroid/text/BoringLayout$Metrics;", "f", "Landroid/text/BoringLayout$Metrics;", "_boringMetrics", "", "g", "Z", "boringMetricsIsInit", "h", "_charSequenceForIntrinsicWidth", "()Ljava/lang/CharSequence;", "charSequenceForIntrinsicWidth", "()Landroid/text/BoringLayout$Metrics;", "boringMetrics", "minIntrinsicWidth", "maxIntrinsicWidth", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class vn6 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final CharSequence charSequence;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextPaint textPaint;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int textDirectionHeuristic;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private float _maxIntrinsicWidth = Float.NaN;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private float _minIntrinsicWidth = Float.NaN;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private BoringLayout.Metrics _boringMetrics;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean boringMetricsIsInit;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private CharSequence _charSequenceForIntrinsicWidth;

    public vn6(CharSequence charSequence, TextPaint textPaint, int i) {
        this.charSequence = charSequence;
        this.textPaint = textPaint;
        this.textDirectionHeuristic = i;
    }

    private final float a() {
        BoringLayout.Metrics metricsC = c();
        float fCeil = metricsC != null ? metricsC.width : -1;
        if (fCeil < 0.0f) {
            fCeil = (float) Math.ceil(f(this, 0, 0, 3, null));
        }
        return xn6.g(fCeil, this.charSequence, this.textPaint) ? fCeil + 0.5f : fCeil;
    }

    private final float b() {
        BreakIterator lineInstance = BreakIterator.getLineInstance(this.textPaint.getTextLocale());
        CharSequence charSequence = this.charSequence;
        int i = 0;
        lineInstance.setText(new g91(charSequence, 0, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, xn6.b);
        int next = lineInstance.next();
        while (true) {
            int i2 = i;
            i = next;
            if (i == -1) {
                break;
            }
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new IntRange(i2, i));
            } else {
                IntRange intRange = (IntRange) priorityQueue.peek();
                if (intRange != null && intRange.i() - intRange.f() < i - i2) {
                    priorityQueue.poll();
                    priorityQueue.add(new IntRange(i2, i));
                }
            }
            next = lineInstance.next();
        }
        if (priorityQueue.isEmpty()) {
            return 0.0f;
        }
        Iterator it = priorityQueue.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        IntRange intRange2 = (IntRange) it.next();
        float fE = e(intRange2.f(), intRange2.i());
        while (it.hasNext()) {
            IntRange intRange3 = (IntRange) it.next();
            fE = Math.max(fE, e(intRange3.f(), intRange3.i()));
        }
        return fE;
    }

    private final CharSequence d() {
        CharSequence charSequence = this._charSequenceForIntrinsicWidth;
        if (charSequence != null) {
            Intrinsics.g(charSequence);
            return charSequence;
        }
        if (!xn6.a) {
            return this.charSequence;
        }
        CharSequence charSequenceH = xn6.h(this.charSequence);
        this._charSequenceForIntrinsicWidth = charSequenceH;
        return charSequenceH;
    }

    private final float e(int start, int end) {
        return Layout.getDesiredWidth(d(), start, end, this.textPaint);
    }

    static /* synthetic */ float f(vn6 vn6Var, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = vn6Var.d().length();
        }
        return vn6Var.e(i, i2);
    }

    public final BoringLayout.Metrics c() {
        if (!this.boringMetricsIsInit) {
            this._boringMetrics = ur0.a.c(this.charSequence, this.textPaint, yxc.k(this.textDirectionHeuristic));
            this.boringMetricsIsInit = true;
        }
        return this._boringMetrics;
    }

    public final float g() {
        if (!Float.isNaN(this._maxIntrinsicWidth)) {
            return this._maxIntrinsicWidth;
        }
        float fA = a();
        this._maxIntrinsicWidth = fA;
        return fA;
    }

    public final float h() {
        if (!Float.isNaN(this._minIntrinsicWidth)) {
            return this._minIntrinsicWidth;
        }
        float fB = b();
        this._minIntrinsicWidth = fB;
        return fB;
    }
}
