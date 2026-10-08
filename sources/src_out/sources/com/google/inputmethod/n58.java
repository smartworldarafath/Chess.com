package com.google.inputmethod;

import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.l;
import androidx.compose.ui.text.font.t;
import androidx.compose.ui.text.font.u;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bA\b\u0002\u0018\u00002\u00020\u0001B§\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010?\u001a\u0004\b@\u0010A\"\u0004\b/\u0010BR\"\u0010\u0010\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010\"\u001a\u0004\bC\u0010$\"\u0004\bD\u0010&R$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\b'\u0010HR$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR$\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\"\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010\"\u001a\u0004\bU\u0010$\"\u0004\b!\u0010&R$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010V\u001a\u0004\bW\u0010X\"\u0004\bO\u0010YR$\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\bI\u0010^¨\u0006_"}, d2 = {"Lcom/google/android/n58;", "", "Lcom/google/android/ei1;", "color", "Lcom/google/android/b0d;", "fontSize", "Landroidx/compose/ui/text/font/x;", "fontWeight", "Landroidx/compose/ui/text/font/t;", "fontStyle", "Landroidx/compose/ui/text/font/u;", "fontSynthesis", "Landroidx/compose/ui/text/font/l;", "fontFamily", "", "fontFeatureSettings", "letterSpacing", "Lcom/google/android/wg0;", "baselineShift", "Lcom/google/android/hwc;", "textGeometricTransform", "Lcom/google/android/g77;", "localeList", "background", "Lcom/google/android/wrc;", "textDecoration", "Lcom/google/android/nkb;", "shadow", "<init>", "(JJLandroidx/compose/ui/text/font/x;Landroidx/compose/ui/text/font/t;Landroidx/compose/ui/text/font/u;Landroidx/compose/ui/text/font/l;Ljava/lang/String;JLcom/google/android/wg0;Lcom/google/android/hwc;Lcom/google/android/g77;JLcom/google/android/wrc;Lcom/google/android/nkb;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/text/r;", "m", "()Landroidx/compose/ui/text/r;", "a", "J", "getColor-0d7_KjU", "()J", "c", "(J)V", "b", "getFontSize-XSAIIZE", "e", "Landroidx/compose/ui/text/font/x;", "getFontWeight", "()Landroidx/compose/ui/text/font/x;", "h", "(Landroidx/compose/ui/text/font/x;)V", "d", "Landroidx/compose/ui/text/font/t;", "getFontStyle-4Lr2A7w", "()Landroidx/compose/ui/text/font/t;", "f", "(Landroidx/compose/ui/text/font/t;)V", "Landroidx/compose/ui/text/font/u;", "getFontSynthesis-ZQGJjVo", "()Landroidx/compose/ui/text/font/u;", "g", "(Landroidx/compose/ui/text/font/u;)V", "Landroidx/compose/ui/text/font/l;", "getFontFamily", "()Landroidx/compose/ui/text/font/l;", "setFontFamily", "(Landroidx/compose/ui/text/font/l;)V", "Ljava/lang/String;", "getFontFeatureSettings", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "getLetterSpacing-XSAIIZE", "i", "Lcom/google/android/wg0;", "getBaselineShift-5SSeXJ0", "()Lcom/google/android/wg0;", "(Lcom/google/android/wg0;)V", "j", "Lcom/google/android/hwc;", "getTextGeometricTransform", "()Lcom/google/android/hwc;", "l", "(Lcom/google/android/hwc;)V", "k", "Lcom/google/android/g77;", "getLocaleList", "()Lcom/google/android/g77;", "setLocaleList", "(Lcom/google/android/g77;)V", "getBackground-0d7_KjU", "Lcom/google/android/wrc;", "getTextDecoration", "()Lcom/google/android/wrc;", "(Lcom/google/android/wrc;)V", "n", "Lcom/google/android/nkb;", "getShadow", "()Lcom/google/android/nkb;", "(Lcom/google/android/nkb;)V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class n58 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private long color;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private long fontSize;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private FontWeight fontWeight;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private t fontStyle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private u fontSynthesis;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private l fontFamily;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private String fontFeatureSettings;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private long letterSpacing;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private wg0 baselineShift;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private TextGeometricTransform textGeometricTransform;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private LocaleList localeList;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private long background;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private wrc textDecoration;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private Shadow shadow;

    public /* synthetic */ n58(long j, long j2, FontWeight fontWeight, t tVar, u uVar, l lVar, String str, long j3, wg0 wg0Var, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, wrc wrcVar, Shadow shadow, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, fontWeight, tVar, uVar, lVar, str, j3, wg0Var, textGeometricTransform, localeList, j4, wrcVar, shadow);
    }

    public final void a(long j) {
        this.background = j;
    }

    public final void b(wg0 wg0Var) {
        this.baselineShift = wg0Var;
    }

    public final void c(long j) {
        this.color = j;
    }

    public final void d(String str) {
        this.fontFeatureSettings = str;
    }

    public final void e(long j) {
        this.fontSize = j;
    }

    public final void f(t tVar) {
        this.fontStyle = tVar;
    }

    public final void g(u uVar) {
        this.fontSynthesis = uVar;
    }

    public final void h(FontWeight fontWeight) {
        this.fontWeight = fontWeight;
    }

    public final void i(long j) {
        this.letterSpacing = j;
    }

    public final void j(Shadow shadow) {
        this.shadow = shadow;
    }

    public final void k(wrc wrcVar) {
        this.textDecoration = wrcVar;
    }

    public final void l(TextGeometricTransform textGeometricTransform) {
        this.textGeometricTransform = textGeometricTransform;
    }

    public final SpanStyle m() {
        return new SpanStyle(this.color, this.fontSize, this.fontWeight, this.fontStyle, this.fontSynthesis, this.fontFamily, this.fontFeatureSettings, this.letterSpacing, this.baselineShift, this.textGeometricTransform, this.localeList, this.background, this.textDecoration, this.shadow, null, null, 49152, null);
    }

    private n58(long j, long j2, FontWeight fontWeight, t tVar, u uVar, l lVar, String str, long j3, wg0 wg0Var, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, wrc wrcVar, Shadow shadow) {
        this.color = j;
        this.fontSize = j2;
        this.fontWeight = fontWeight;
        this.fontStyle = tVar;
        this.fontSynthesis = uVar;
        this.fontFamily = lVar;
        this.fontFeatureSettings = str;
        this.letterSpacing = j3;
        this.baselineShift = wg0Var;
        this.textGeometricTransform = textGeometricTransform;
        this.localeList = localeList;
        this.background = j4;
        this.textDecoration = wrcVar;
        this.shadow = shadow;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ n58(long j, long j2, FontWeight fontWeight, t tVar, u uVar, l lVar, String str, long j3, wg0 wg0Var, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, wrc wrcVar, Shadow shadow, int i, DefaultConstructorMarker defaultConstructorMarker) {
        long jI = (i & 1) != 0 ? ei1.INSTANCE.i() : j;
        long jA = (i & 2) != 0 ? b0d.INSTANCE.a() : j2;
        FontWeight fontWeight2 = (i & 4) != 0 ? null : fontWeight;
        t tVar2 = (i & 8) != 0 ? null : tVar;
        u uVar2 = (i & 16) != 0 ? null : uVar;
        l lVar2 = (i & 32) != 0 ? null : lVar;
        String str2 = (i & 64) != 0 ? null : str;
        long jA2 = (i & 128) != 0 ? b0d.INSTANCE.a() : j3;
        wg0 wg0Var2 = (i & 256) != 0 ? null : wg0Var;
        TextGeometricTransform textGeometricTransform2 = (i & 512) != 0 ? null : textGeometricTransform;
        LocaleList localeList2 = (i & 1024) != 0 ? null : localeList;
        long jI2 = (i & 2048) != 0 ? ei1.INSTANCE.i() : j4;
        t tVar3 = tVar2;
        u uVar3 = uVar2;
        l lVar3 = lVar2;
        String str3 = str2;
        long j5 = jA2;
        wg0 wg0Var3 = wg0Var2;
        TextGeometricTransform textGeometricTransform3 = textGeometricTransform2;
        LocaleList localeList3 = localeList2;
        long j6 = jI2;
        this(jI, jA, fontWeight2, tVar3, uVar3, lVar3, str3, j5, wg0Var3, textGeometricTransform3, localeList3, j6, (i & 4096) != 0 ? null : wrcVar, (i & 8192) != 0 ? null : shadow, null);
    }
}
