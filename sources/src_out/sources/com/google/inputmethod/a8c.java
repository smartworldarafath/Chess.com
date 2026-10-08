package com.google.inputmethod;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b,\b\u0002\u0018\u00002\u00020\u0001B·\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\u0006\u0010\u001b\u001a\u00020\u0004\u0012\u0006\u0010\u001c\u001a\u00020\u0004\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b0\u0010)R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b\"\u00107R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b8\u0010'\u001a\u0004\b9\u0010)R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b*\u0010<R\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b=\u0010'\u001a\u0004\b,\u0010)R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u0014\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bB\u0010?\u001a\u0004\bB\u0010AR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b@\u0010'\u001a\u0004\b8\u0010)R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b9\u0010C\u001a\u0004\b5\u0010DR\u0017\u0010\u0018\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b.\u0010C\u001a\u0004\bE\u0010DR\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bF\u0010'\u001a\u0004\b&\u0010)R\u0017\u0010\u001a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010'\u001a\u0004\b=\u0010)R\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010'\u001a\u0004\b>\u0010)R\u0017\u0010\u001c\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b3\u0010'\u001a\u0004\b1\u0010)R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\bE\u0010G\u001a\u0004\b:\u0010HR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b0\u0010G\u001a\u0004\bF\u0010H¨\u0006I"}, d2 = {"Lcom/google/android/a8c;", "", "", "text", "", "start", "end", "Landroid/text/TextPaint;", "paint", "width", "Landroid/text/TextDirectionHeuristic;", "textDir", "Landroid/text/Layout$Alignment;", "alignment", "maxLines", "Landroid/text/TextUtils$TruncateAt;", "ellipsize", "ellipsizedWidth", "", "lineSpacingMultiplier", "lineSpacingExtra", "justificationMode", "", "includePadding", "useFallbackLineSpacing", "breakStrategy", "lineBreakStyle", "lineBreakWordStyle", "hyphenationFrequency", "", "leftIndents", "rightIndents", "<init>", "(Ljava/lang/CharSequence;IILandroid/text/TextPaint;ILandroid/text/TextDirectionHeuristic;Landroid/text/Layout$Alignment;ILandroid/text/TextUtils$TruncateAt;IFFIZZIIII[I[I)V", "a", "Ljava/lang/CharSequence;", "r", "()Ljava/lang/CharSequence;", "b", "I", "q", "()I", "c", "e", "d", "Landroid/text/TextPaint;", "o", "()Landroid/text/TextPaint;", "u", "f", "Landroid/text/TextDirectionHeuristic;", "s", "()Landroid/text/TextDirectionHeuristic;", "g", "Landroid/text/Layout$Alignment;", "()Landroid/text/Layout$Alignment;", "h", "n", "i", "Landroid/text/TextUtils$TruncateAt;", "()Landroid/text/TextUtils$TruncateAt;", "j", "k", "F", "m", "()F", "l", "Z", "()Z", "t", "p", "[I", "()[I", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class a8c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final CharSequence text;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int start;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int end;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextPaint paint;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int width;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final TextDirectionHeuristic textDir;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Layout.Alignment alignment;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int maxLines;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final TextUtils.TruncateAt ellipsize;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final int ellipsizedWidth;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final float lineSpacingMultiplier;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final float lineSpacingExtra;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final int justificationMode;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final boolean includePadding;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final boolean useFallbackLineSpacing;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final int breakStrategy;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final int lineBreakStyle;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final int lineBreakWordStyle;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final int hyphenationFrequency;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final int[] leftIndents;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final int[] rightIndents;

    public a8c(CharSequence charSequence, int i, int i2, TextPaint textPaint, int i3, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i4, TextUtils.TruncateAt truncateAt, int i5, float f, float f2, int i6, boolean z, boolean z2, int i7, int i8, int i9, int i10, int[] iArr, int[] iArr2) {
        this.text = charSequence;
        this.start = i;
        this.end = i2;
        this.paint = textPaint;
        this.width = i3;
        this.textDir = textDirectionHeuristic;
        this.alignment = alignment;
        this.maxLines = i4;
        this.ellipsize = truncateAt;
        this.ellipsizedWidth = i5;
        this.lineSpacingMultiplier = f;
        this.lineSpacingExtra = f2;
        this.justificationMode = i6;
        this.includePadding = z;
        this.useFallbackLineSpacing = z2;
        this.breakStrategy = i7;
        this.lineBreakStyle = i8;
        this.lineBreakWordStyle = i9;
        this.hyphenationFrequency = i10;
        this.leftIndents = iArr;
        this.rightIndents = iArr2;
        if (!(i >= 0 && i <= i2)) {
            ax5.a("invalid start value");
        }
        if (!(i2 >= 0 && i2 <= charSequence.length())) {
            ax5.a("invalid end value");
        }
        if (!(i4 >= 0)) {
            ax5.a("invalid maxLines value");
        }
        if (!(i3 >= 0)) {
            ax5.a("invalid width value");
        }
        if (!(i5 >= 0)) {
            ax5.a("invalid ellipsizedWidth value");
        }
        if (f >= 0.0f) {
            return;
        }
        ax5.a("invalid lineSpacingMultiplier value");
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Layout.Alignment getAlignment() {
        return this.alignment;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getBreakStrategy() {
        return this.breakStrategy;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextUtils.TruncateAt getEllipsize() {
        return this.ellipsize;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getEllipsizedWidth() {
        return this.ellipsizedWidth;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getEnd() {
        return this.end;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getHyphenationFrequency() {
        return this.hyphenationFrequency;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIncludePadding() {
        return this.includePadding;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getJustificationMode() {
        return this.justificationMode;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int[] getLeftIndents() {
        return this.leftIndents;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getLineBreakStyle() {
        return this.lineBreakStyle;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getLineBreakWordStyle() {
        return this.lineBreakWordStyle;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final float getLineSpacingExtra() {
        return this.lineSpacingExtra;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final float getLineSpacingMultiplier() {
        return this.lineSpacingMultiplier;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getMaxLines() {
        return this.maxLines;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final TextPaint getPaint() {
        return this.paint;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final int[] getRightIndents() {
        return this.rightIndents;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final int getStart() {
        return this.start;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final CharSequence getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final TextDirectionHeuristic getTextDir() {
        return this.textDir;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final boolean getUseFallbackLineSpacing() {
        return this.useFallbackLineSpacing;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final int getWidth() {
        return this.width;
    }
}
