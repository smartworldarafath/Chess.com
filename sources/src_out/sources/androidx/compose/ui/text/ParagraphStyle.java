package androidx.compose.ui.text;

import com.google.inputmethod.LineHeightStyle;
import com.google.inputmethod.TextIndent;
import com.google.inputmethod.ax5;
import com.google.inputmethod.b0d;
import com.google.inputmethod.cpc;
import com.google.inputmethod.d27;
import com.google.inputmethod.dsc;
import com.google.inputmethod.qi5;
import com.google.inputmethod.ryc;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.compose.ui.text.m, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0007\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0017\u0010\u0018Jo\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0016\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010%\u001a\u0004\b&\u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b(\u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b+\u00101\u001a\u0004\b2\u00103R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b4\u00106R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b2\u0010%\u001a\u0004\b-\u0010!R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b&\u0010%\u001a\u0004\b)\u0010!R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b(\u00107\u001a\u0004\b8\u00109¨\u0006:"}, d2 = {"Landroidx/compose/ui/text/m;", "Landroidx/compose/ui/text/b$a;", "Lcom/google/android/cpc;", "textAlign", "Lcom/google/android/dsc;", "textDirection", "Lcom/google/android/b0d;", "lineHeight", "Lcom/google/android/owc;", "textIndent", "Landroidx/compose/ui/text/o;", "platformStyle", "Lcom/google/android/g27;", "lineHeightStyle", "Lcom/google/android/d27;", "lineBreak", "Lcom/google/android/qi5;", "hyphens", "Lcom/google/android/ryc;", "textMotion", "<init>", "(IIJLcom/google/android/owc;Landroidx/compose/ui/text/o;Lcom/google/android/g27;IILcom/google/android/ryc;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "l", "(Landroidx/compose/ui/text/m;)Landroidx/compose/ui/text/m;", "a", "(IIJLcom/google/android/owc;Landroidx/compose/ui/text/o;Lcom/google/android/g27;IILcom/google/android/ryc;)Landroidx/compose/ui/text/m;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "I", "h", "b", "i", "c", "J", "e", "()J", "d", "Lcom/google/android/owc;", "j", "()Lcom/google/android/owc;", "Landroidx/compose/ui/text/o;", "g", "()Landroidx/compose/ui/text/o;", "f", "Lcom/google/android/g27;", "()Lcom/google/android/g27;", "Lcom/google/android/ryc;", "k", "()Lcom/google/android/ryc;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ParagraphStyle implements b.a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int textAlign;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int textDirection;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final long lineHeight;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final TextIndent textIndent;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final PlatformParagraphStyle platformStyle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final LineHeightStyle lineHeightStyle;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private final int lineBreak;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    private final int hyphens;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    private final ryc textMotion;

    public /* synthetic */ ParagraphStyle(int i, int i2, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i3, int i4, ryc rycVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, j, textIndent, platformParagraphStyle, lineHeightStyle, i3, i4, rycVar);
    }

    public static /* synthetic */ ParagraphStyle b(ParagraphStyle paragraphStyle, int i, int i2, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i3, int i4, ryc rycVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = paragraphStyle.textAlign;
        }
        if ((i5 & 2) != 0) {
            i2 = paragraphStyle.textDirection;
        }
        if ((i5 & 4) != 0) {
            j = paragraphStyle.lineHeight;
        }
        if ((i5 & 8) != 0) {
            textIndent = paragraphStyle.textIndent;
        }
        if ((i5 & 16) != 0) {
            platformParagraphStyle = paragraphStyle.platformStyle;
        }
        if ((i5 & 32) != 0) {
            lineHeightStyle = paragraphStyle.lineHeightStyle;
        }
        if ((i5 & 64) != 0) {
            i3 = paragraphStyle.lineBreak;
        }
        if ((i5 & 128) != 0) {
            i4 = paragraphStyle.hyphens;
        }
        if ((i5 & 256) != 0) {
            rycVar = paragraphStyle.textMotion;
        }
        int i6 = i4;
        ryc rycVar2 = rycVar;
        long j2 = j;
        return paragraphStyle.a(i, i2, j2, textIndent, platformParagraphStyle, lineHeightStyle, i3, i6, rycVar2);
    }

    public final ParagraphStyle a(int textAlign, int textDirection, long lineHeight, TextIndent textIndent, PlatformParagraphStyle platformStyle, LineHeightStyle lineHeightStyle, int lineBreak, int hyphens, ryc textMotion) {
        return new ParagraphStyle(textAlign, textDirection, lineHeight, textIndent, platformStyle, lineHeightStyle, lineBreak, hyphens, textMotion, null);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getHyphens() {
        return this.hyphens;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getLineBreak() {
        return this.lineBreak;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getLineHeight() {
        return this.lineHeight;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParagraphStyle)) {
            return false;
        }
        ParagraphStyle paragraphStyle = (ParagraphStyle) other;
        return cpc.k(this.textAlign, paragraphStyle.textAlign) && dsc.j(this.textDirection, paragraphStyle.textDirection) && b0d.e(this.lineHeight, paragraphStyle.lineHeight) && Intrinsics.e(this.textIndent, paragraphStyle.textIndent) && Intrinsics.e(this.platformStyle, paragraphStyle.platformStyle) && Intrinsics.e(this.lineHeightStyle, paragraphStyle.lineHeightStyle) && d27.g(this.lineBreak, paragraphStyle.lineBreak) && qi5.g(this.hyphens, paragraphStyle.hyphens) && Intrinsics.e(this.textMotion, paragraphStyle.textMotion);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final LineHeightStyle getLineHeightStyle() {
        return this.lineHeightStyle;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final PlatformParagraphStyle getPlatformStyle() {
        return this.platformStyle;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getTextAlign() {
        return this.textAlign;
    }

    public int hashCode() {
        int iL = ((((cpc.l(this.textAlign) * 31) + dsc.k(this.textDirection)) * 31) + b0d.i(this.lineHeight)) * 31;
        TextIndent textIndent = this.textIndent;
        int iHashCode = (iL + (textIndent != null ? textIndent.hashCode() : 0)) * 31;
        PlatformParagraphStyle platformParagraphStyle = this.platformStyle;
        int iHashCode2 = (iHashCode + (platformParagraphStyle != null ? platformParagraphStyle.hashCode() : 0)) * 31;
        LineHeightStyle lineHeightStyle = this.lineHeightStyle;
        int iHashCode3 = (((((iHashCode2 + (lineHeightStyle != null ? lineHeightStyle.hashCode() : 0)) * 31) + d27.k(this.lineBreak)) * 31) + qi5.h(this.hyphens)) * 31;
        ryc rycVar = this.textMotion;
        return iHashCode3 + (rycVar != null ? rycVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getTextDirection() {
        return this.textDirection;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final TextIndent getTextIndent() {
        return this.textIndent;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final ryc getTextMotion() {
        return this.textMotion;
    }

    public final ParagraphStyle l(ParagraphStyle other) {
        return other == null ? this : n.a(this, other.textAlign, other.textDirection, other.lineHeight, other.textIndent, other.platformStyle, other.lineHeightStyle, other.lineBreak, other.hyphens, other.textMotion);
    }

    public String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) cpc.m(this.textAlign)) + ", textDirection=" + ((Object) dsc.l(this.textDirection)) + ", lineHeight=" + ((Object) b0d.l(this.lineHeight)) + ", textIndent=" + this.textIndent + ", platformStyle=" + this.platformStyle + ", lineHeightStyle=" + this.lineHeightStyle + ", lineBreak=" + ((Object) d27.l(this.lineBreak)) + ", hyphens=" + ((Object) qi5.i(this.hyphens)) + ", textMotion=" + this.textMotion + ')';
    }

    private ParagraphStyle(int i, int i2, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i3, int i4, ryc rycVar) {
        this.textAlign = i;
        this.textDirection = i2;
        this.lineHeight = j;
        this.textIndent = textIndent;
        this.platformStyle = platformParagraphStyle;
        this.lineHeightStyle = lineHeightStyle;
        this.lineBreak = i3;
        this.hyphens = i4;
        this.textMotion = rycVar;
        if (b0d.e(j, b0d.INSTANCE.a())) {
            return;
        }
        if (b0d.h(j) >= 0.0f) {
            return;
        }
        ax5.c("lineHeight can't be negative (" + b0d.h(j) + ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ParagraphStyle(int i, int i2, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i3, int i4, ryc rycVar, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        int iG = (i5 & 1) != 0 ? cpc.INSTANCE.g() : i;
        int iF = (i5 & 2) != 0 ? dsc.INSTANCE.f() : i2;
        long jA = (i5 & 4) != 0 ? b0d.INSTANCE.a() : j;
        TextIndent textIndent2 = (i5 & 8) != 0 ? null : textIndent;
        PlatformParagraphStyle platformParagraphStyle2 = (i5 & 16) != 0 ? null : platformParagraphStyle;
        LineHeightStyle lineHeightStyle2 = (i5 & 32) != 0 ? null : lineHeightStyle;
        int iC = (i5 & 64) != 0 ? d27.INSTANCE.c() : i3;
        int iC2 = (i5 & 128) != 0 ? qi5.INSTANCE.c() : i4;
        this(iG, iF, jA, textIndent2, platformParagraphStyle2, lineHeightStyle2, iC, iC2, (i5 & 256) == 0 ? rycVar : null, null);
    }
}
