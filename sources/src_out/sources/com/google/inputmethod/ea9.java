package com.google.inputmethod;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u0000 :2\u00020\u0001:\u0001#BA\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fB9\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u000fJ;\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0017¢\u0006\u0004\b\u0018\u0010\u0019JY\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010$R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010&R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010$R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010$R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b'\u0010,R$\u00101\u001a\u00020\u00162\u0006\u0010-\u001a\u00020\u00168\u0006@BX\u0086.¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b#\u00100R$\u00103\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u00048F@BX\u0086\u000e¢\u0006\f\n\u0004\b2\u0010&\u001a\u0004\b(\u0010,R$\u00105\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u00048F@BX\u0086\u000e¢\u0006\f\n\u0004\b4\u0010&\u001a\u0004\b%\u0010,R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108¨\u0006;"}, d2 = {"Lcom/google/android/ea9;", "Landroid/text/style/ReplacementSpan;", "", "width", "", "widthUnit", "height", "heightUnit", "widthAsSpInPx", "heightAsSpInPx", "verticalAlign", "<init>", "(FIFIFFI)V", "Lcom/google/android/f43;", "density", "(FIFILcom/google/android/f43;I)V", "Landroid/graphics/Paint;", "paint", "", "text", "start", "end", "Landroid/graphics/Paint$FontMetricsInt;", "fm", "getSize", "(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I", "Landroid/graphics/Canvas;", "canvas", "x", "top", "y", "bottom", "", "draw", "(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V", "a", "F", "b", "I", "c", "d", "e", "f", "g", "()I", "value", "h", "Landroid/graphics/Paint$FontMetricsInt;", "()Landroid/graphics/Paint$FontMetricsInt;", "fontMetrics", "i", "widthPx", "j", "heightPx", "", "k", "Z", "isLaidOut", "l", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ea9 extends ReplacementSpan {
    public static final int m = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float width;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int widthUnit;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float height;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int heightUnit;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final float widthAsSpInPx;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final float heightAsSpInPx;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int verticalAlign;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private Paint.FontMetricsInt fontMetrics;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private int widthPx;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private int heightPx;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private boolean isLaidOut;

    private ea9(float f, int i, float f2, int i2, float f3, float f4, int i3) {
        this.width = f;
        this.widthUnit = i;
        this.height = f2;
        this.heightUnit = i2;
        this.widthAsSpInPx = f3;
        this.heightAsSpInPx = f4;
        this.verticalAlign = i3;
    }

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.fontMetrics;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        Intrinsics.x("fontMetrics");
        return null;
    }

    public final int b() {
        if (!this.isLaidOut) {
            ax5.c("PlaceholderSpan is not laid out yet.");
        }
        return this.heightPx;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getVerticalAlign() {
        return this.verticalAlign;
    }

    public final int d() {
        if (!this.isLaidOut) {
            ax5.c("PlaceholderSpan is not laid out yet.");
        }
        return this.widthPx;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, Paint paint) {
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence text, int start, int end, Paint.FontMetricsInt fm) throws KotlinNothingValueException {
        float f;
        float f2;
        this.isLaidOut = true;
        float textSize = paint.getTextSize();
        this.fontMetrics = paint.getFontMetricsInt();
        if (!(a().descent > a().ascent)) {
            ax5.a("Invalid fontMetrics: line height can not be negative.");
        }
        int i = this.widthUnit;
        if (i == 0) {
            f = this.widthAsSpInPx;
        } else {
            if (i != 1) {
                ax5.b("Unsupported unit.");
                throw new KotlinNothingValueException();
            }
            f = this.width * textSize;
        }
        this.widthPx = fa9.a(f);
        int i2 = this.heightUnit;
        if (i2 == 0) {
            f2 = this.heightAsSpInPx;
        } else {
            if (i2 != 1) {
                ax5.b("Unsupported unit.");
                throw new KotlinNothingValueException();
            }
            f2 = this.height * textSize;
        }
        this.heightPx = fa9.a(f2);
        if (fm != null) {
            fm.ascent = a().ascent;
            fm.descent = a().descent;
            fm.leading = a().leading;
            switch (this.verticalAlign) {
                case 0:
                    if (fm.ascent > (-b())) {
                        fm.ascent = -b();
                    }
                    break;
                case 1:
                case 4:
                    if (fm.ascent + b() > fm.descent) {
                        fm.descent = fm.ascent + b();
                    }
                    break;
                case 2:
                case 5:
                    if (fm.ascent > fm.descent - b()) {
                        fm.ascent = fm.descent - b();
                    }
                    break;
                case 3:
                case 6:
                    if (fm.descent - fm.ascent < b()) {
                        int iB = fm.ascent - ((b() - (fm.descent - fm.ascent)) / 2);
                        fm.ascent = iB;
                        fm.descent = iB + b();
                    }
                    break;
                default:
                    ax5.a("Unknown verticalAlign.");
                    break;
            }
            fm.top = Math.min(a().top, fm.ascent);
            fm.bottom = Math.max(a().bottom, fm.descent);
        }
        return d();
    }

    public ea9(float f, int i, float f2, int i2, f43 f43Var, int i3) {
        this(f, i, f2, i2, i == 0 ? f43Var.T1(c0d.h(f)) : 0.0f, i2 == 0 ? f43Var.T1(c0d.h(f2)) : 0.0f, i3);
    }
}
