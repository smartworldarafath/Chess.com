package androidx.compose.ui.text;

import androidx.compose.ui.text.font.FontWeight;
import com.google.inputmethod.LocaleList;
import com.google.inputmethod.Shadow;
import com.google.inputmethod.TextGeometricTransform;
import com.google.inputmethod.b0d;
import com.google.inputmethod.ei1;
import com.google.inputmethod.gwc;
import com.google.inputmethod.qu0;
import com.google.inputmethod.vb9;
import com.google.inputmethod.wg0;
import com.google.inputmethod.wrc;
import com.google.inputmethod.wzb;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.compose.ui.text.r, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b4\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B¿\u0001\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"BÁ\u0001\b\u0016\u0012\b\b\u0002\u0010#\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010$J\u001b\u0010&\u001a\u00020\u00002\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b&\u0010'JÅ\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010#\u001a\u00020\u00172\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010%\u001a\u0004\u0018\u00010*H\u0096\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020+2\u0006\u0010%\u001a\u00020\u0000H\u0000¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020+2\u0006\u0010%\u001a\u00020\u0000H\u0000¢\u0006\u0004\b0\u0010/J\u000f\u00102\u001a\u000201H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u000201H\u0000¢\u0006\u0004\b4\u00103J\u000f\u00105\u001a\u00020\u000eH\u0016¢\u0006\u0004\b5\u00106R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u00106R\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bQ\u0010;\u001a\u0004\bR\u0010=R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bL\u0010S\u001a\u0004\bF\u0010TR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\bP\u0010U\u001a\u0004\bV\u0010WR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b<\u0010X\u001a\u0004\bY\u0010ZR\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\bD\u0010;\u001a\u0004\bB\u0010=R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\bH\u0010[\u001a\u0004\b\\\u0010]R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b@\u0010^\u001a\u0004\b_\u0010`R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\bR\u0010a\u001a\u0004\bb\u0010cR\u0019\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\bY\u0010d\u001a\u0004\bQ\u0010eR\u0011\u0010#\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\bN\u0010=R\u0013\u0010h\u001a\u0004\u0018\u00010f8F¢\u0006\u0006\u001a\u0004\bJ\u0010gR\u0011\u0010k\u001a\u00020i8F¢\u0006\u0006\u001a\u0004\b>\u0010j¨\u0006l"}, d2 = {"Landroidx/compose/ui/text/r;", "Landroidx/compose/ui/text/b$a;", "Lcom/google/android/gwc;", "textForegroundStyle", "Lcom/google/android/b0d;", "fontSize", "Landroidx/compose/ui/text/font/x;", "fontWeight", "Landroidx/compose/ui/text/font/t;", "fontStyle", "Landroidx/compose/ui/text/font/u;", "fontSynthesis", "Landroidx/compose/ui/text/font/l;", "fontFamily", "", "fontFeatureSettings", "letterSpacing", "Lcom/google/android/wg0;", "baselineShift", "Lcom/google/android/hwc;", "textGeometricTransform", "Lcom/google/android/g77;", "localeList", "Lcom/google/android/ei1;", "background", "Lcom/google/android/wrc;", "textDecoration", "Lcom/google/android/nkb;", "shadow", "Lcom/google/android/vb9;", "platformStyle", "Landroidx/compose/ui/graphics/drawscope/b;", "drawStyle", "<init>", "(Lcom/google/android/gwc;JLandroidx/compose/ui/text/font/x;Landroidx/compose/ui/text/font/t;Landroidx/compose/ui/text/font/u;Landroidx/compose/ui/text/font/l;Ljava/lang/String;JLcom/google/android/wg0;Lcom/google/android/hwc;Lcom/google/android/g77;JLcom/google/android/wrc;Lcom/google/android/nkb;Lcom/google/android/vb9;Landroidx/compose/ui/graphics/drawscope/b;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "color", "(JJLandroidx/compose/ui/text/font/x;Landroidx/compose/ui/text/font/t;Landroidx/compose/ui/text/font/u;Landroidx/compose/ui/text/font/l;Ljava/lang/String;JLcom/google/android/wg0;Lcom/google/android/hwc;Lcom/google/android/g77;JLcom/google/android/wrc;Lcom/google/android/nkb;Lcom/google/android/vb9;Landroidx/compose/ui/graphics/drawscope/b;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "y", "(Landroidx/compose/ui/text/r;)Landroidx/compose/ui/text/r;", "a", "(JJLandroidx/compose/ui/text/font/x;Landroidx/compose/ui/text/font/t;Landroidx/compose/ui/text/font/u;Landroidx/compose/ui/text/font/l;Ljava/lang/String;JLcom/google/android/wg0;Lcom/google/android/hwc;Lcom/google/android/g77;JLcom/google/android/wrc;Lcom/google/android/nkb;Lcom/google/android/vb9;Landroidx/compose/ui/graphics/drawscope/b;)Landroidx/compose/ui/text/r;", "", "", "equals", "(Ljava/lang/Object;)Z", "v", "(Landroidx/compose/ui/text/r;)Z", "w", "", "hashCode", "()I", "x", "toString", "()Ljava/lang/String;", "Lcom/google/android/gwc;", "t", "()Lcom/google/android/gwc;", "b", "J", "k", "()J", "c", "Landroidx/compose/ui/text/font/x;", "n", "()Landroidx/compose/ui/text/font/x;", "d", "Landroidx/compose/ui/text/font/t;", "l", "()Landroidx/compose/ui/text/font/t;", "e", "Landroidx/compose/ui/text/font/u;", "m", "()Landroidx/compose/ui/text/font/u;", "f", "Landroidx/compose/ui/text/font/l;", "i", "()Landroidx/compose/ui/text/font/l;", "g", "Ljava/lang/String;", "j", "h", "o", "Lcom/google/android/wg0;", "()Lcom/google/android/wg0;", "Lcom/google/android/hwc;", "u", "()Lcom/google/android/hwc;", "Lcom/google/android/g77;", "p", "()Lcom/google/android/g77;", "Lcom/google/android/wrc;", "s", "()Lcom/google/android/wrc;", "Lcom/google/android/nkb;", "r", "()Lcom/google/android/nkb;", "Lcom/google/android/vb9;", "q", "()Lcom/google/android/vb9;", "Landroidx/compose/ui/graphics/drawscope/b;", "()Landroidx/compose/ui/graphics/drawscope/b;", "Lcom/google/android/qu0;", "()Lcom/google/android/qu0;", "brush", "", "()F", "alpha", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SpanStyle implements b.a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final gwc textForegroundStyle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final long fontSize;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final FontWeight fontWeight;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final androidx.compose.ui.text.font.t fontStyle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final androidx.compose.ui.text.font.u fontSynthesis;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final androidx.compose.ui.text.font.l fontFamily;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private final String fontFeatureSettings;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    private final long letterSpacing;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    private final wg0 baselineShift;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    private final TextGeometricTransform textGeometricTransform;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    private final LocaleList localeList;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
    private final long background;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
    private final wrc textDecoration;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata and from toString */
    private final Shadow shadow;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata and from toString */
    private final vb9 platformStyle;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata and from toString */
    private final androidx.compose.ui.graphics.drawscope.b drawStyle;

    public /* synthetic */ SpanStyle(long j, long j2, FontWeight fontWeight, androidx.compose.ui.text.font.t tVar, androidx.compose.ui.text.font.u uVar, androidx.compose.ui.text.font.l lVar, String str, long j3, wg0 wg0Var, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, wrc wrcVar, Shadow shadow, vb9 vb9Var, androidx.compose.ui.graphics.drawscope.b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, fontWeight, tVar, uVar, lVar, str, j3, wg0Var, textGeometricTransform, localeList, j4, wrcVar, shadow, vb9Var, bVar);
    }

    public static /* synthetic */ SpanStyle b(SpanStyle spanStyle, long j, long j2, FontWeight fontWeight, androidx.compose.ui.text.font.t tVar, androidx.compose.ui.text.font.u uVar, androidx.compose.ui.text.font.l lVar, String str, long j3, wg0 wg0Var, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, wrc wrcVar, Shadow shadow, vb9 vb9Var, androidx.compose.ui.graphics.drawscope.b bVar, int i, Object obj) {
        long jG = (i & 1) != 0 ? spanStyle.g() : j;
        return spanStyle.a(jG, (i & 2) != 0 ? spanStyle.fontSize : j2, (i & 4) != 0 ? spanStyle.fontWeight : fontWeight, (i & 8) != 0 ? spanStyle.fontStyle : tVar, (i & 16) != 0 ? spanStyle.fontSynthesis : uVar, (i & 32) != 0 ? spanStyle.fontFamily : lVar, (i & 64) != 0 ? spanStyle.fontFeatureSettings : str, (i & 128) != 0 ? spanStyle.letterSpacing : j3, (i & 256) != 0 ? spanStyle.baselineShift : wg0Var, (i & 512) != 0 ? spanStyle.textGeometricTransform : textGeometricTransform, (i & 1024) != 0 ? spanStyle.localeList : localeList, (i & 2048) != 0 ? spanStyle.background : j4, (i & 4096) != 0 ? spanStyle.textDecoration : wrcVar, (i & 8192) != 0 ? spanStyle.shadow : shadow, (i & 16384) != 0 ? spanStyle.platformStyle : vb9Var, (i & 32768) != 0 ? spanStyle.drawStyle : bVar);
    }

    public final SpanStyle a(long color, long fontSize, FontWeight fontWeight, androidx.compose.ui.text.font.t fontStyle, androidx.compose.ui.text.font.u fontSynthesis, androidx.compose.ui.text.font.l fontFamily, String fontFeatureSettings, long letterSpacing, wg0 baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, wrc textDecoration, Shadow shadow, vb9 platformStyle, androidx.compose.ui.graphics.drawscope.b drawStyle) {
        return new SpanStyle(ei1.r(color, g()) ? this.textForegroundStyle : gwc.INSTANCE.b(color), fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, platformStyle, drawStyle, (DefaultConstructorMarker) null);
    }

    public final float c() {
        return this.textForegroundStyle.a();
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getBackground() {
        return this.background;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final wg0 getBaselineShift() {
        return this.baselineShift;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpanStyle)) {
            return false;
        }
        SpanStyle spanStyle = (SpanStyle) other;
        return v(spanStyle) && w(spanStyle);
    }

    public final qu0 f() {
        return this.textForegroundStyle.h();
    }

    public final long g() {
        return this.textForegroundStyle.d();
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final androidx.compose.ui.graphics.drawscope.b getDrawStyle() {
        return this.drawStyle;
    }

    public int hashCode() {
        int iX = ei1.x(g()) * 31;
        qu0 qu0VarF = f();
        int iHashCode = (((((iX + (qu0VarF != null ? qu0VarF.hashCode() : 0)) * 31) + Float.hashCode(c())) * 31) + b0d.i(this.fontSize)) * 31;
        FontWeight fontWeight = this.fontWeight;
        int weight = (iHashCode + (fontWeight != null ? fontWeight.getWeight() : 0)) * 31;
        androidx.compose.ui.text.font.t tVar = this.fontStyle;
        int iG = (weight + (tVar != null ? androidx.compose.ui.text.font.t.g(tVar.getValue()) : 0)) * 31;
        androidx.compose.ui.text.font.u uVar = this.fontSynthesis;
        int i = (iG + (uVar != null ? androidx.compose.ui.text.font.u.i(uVar.getValue()) : 0)) * 31;
        androidx.compose.ui.text.font.l lVar = this.fontFamily;
        int iHashCode2 = (i + (lVar != null ? lVar.hashCode() : 0)) * 31;
        String str = this.fontFeatureSettings;
        int iHashCode3 = (((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + b0d.i(this.letterSpacing)) * 31;
        wg0 wg0Var = this.baselineShift;
        int iF = (iHashCode3 + (wg0Var != null ? wg0.f(wg0Var.getMultiplier()) : 0)) * 31;
        TextGeometricTransform textGeometricTransform = this.textGeometricTransform;
        int iHashCode4 = (iF + (textGeometricTransform != null ? textGeometricTransform.hashCode() : 0)) * 31;
        LocaleList localeList = this.localeList;
        int iHashCode5 = (((iHashCode4 + (localeList != null ? localeList.hashCode() : 0)) * 31) + ei1.x(this.background)) * 31;
        wrc wrcVar = this.textDecoration;
        int iHashCode6 = (iHashCode5 + (wrcVar != null ? wrcVar.hashCode() : 0)) * 31;
        Shadow shadow = this.shadow;
        int iHashCode7 = (iHashCode6 + (shadow != null ? shadow.hashCode() : 0)) * 31;
        vb9 vb9Var = this.platformStyle;
        int iHashCode8 = (iHashCode7 + (vb9Var != null ? vb9Var.hashCode() : 0)) * 31;
        androidx.compose.ui.graphics.drawscope.b bVar = this.drawStyle;
        return iHashCode8 + (bVar != null ? bVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final androidx.compose.ui.text.font.l getFontFamily() {
        return this.fontFamily;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getFontFeatureSettings() {
        return this.fontFeatureSettings;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final long getFontSize() {
        return this.fontSize;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final androidx.compose.ui.text.font.t getFontStyle() {
        return this.fontStyle;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final androidx.compose.ui.text.font.u getFontSynthesis() {
        return this.fontSynthesis;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final FontWeight getFontWeight() {
        return this.fontWeight;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final long getLetterSpacing() {
        return this.letterSpacing;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final LocaleList getLocaleList() {
        return this.localeList;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final vb9 getPlatformStyle() {
        return this.platformStyle;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final Shadow getShadow() {
        return this.shadow;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final wrc getTextDecoration() {
        return this.textDecoration;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final gwc getTextForegroundStyle() {
        return this.textForegroundStyle;
    }

    public String toString() {
        return "SpanStyle(color=" + ((Object) ei1.y(g())) + ", brush=" + f() + ", alpha=" + c() + ", fontSize=" + ((Object) b0d.l(this.fontSize)) + ", fontWeight=" + this.fontWeight + ", fontStyle=" + this.fontStyle + ", fontSynthesis=" + this.fontSynthesis + ", fontFamily=" + this.fontFamily + ", fontFeatureSettings=" + this.fontFeatureSettings + ", letterSpacing=" + ((Object) b0d.l(this.letterSpacing)) + ", baselineShift=" + this.baselineShift + ", textGeometricTransform=" + this.textGeometricTransform + ", localeList=" + this.localeList + ", background=" + ((Object) ei1.y(this.background)) + ", textDecoration=" + this.textDecoration + ", shadow=" + this.shadow + ", platformStyle=" + this.platformStyle + ", drawStyle=" + this.drawStyle + ')';
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final TextGeometricTransform getTextGeometricTransform() {
        return this.textGeometricTransform;
    }

    public final boolean v(SpanStyle other) {
        if (this == other) {
            return true;
        }
        return b0d.e(this.fontSize, other.fontSize) && Intrinsics.e(this.fontWeight, other.fontWeight) && Intrinsics.e(this.fontStyle, other.fontStyle) && Intrinsics.e(this.fontSynthesis, other.fontSynthesis) && Intrinsics.e(this.fontFamily, other.fontFamily) && Intrinsics.e(this.fontFeatureSettings, other.fontFeatureSettings) && b0d.e(this.letterSpacing, other.letterSpacing) && Intrinsics.e(this.baselineShift, other.baselineShift) && Intrinsics.e(this.textGeometricTransform, other.textGeometricTransform) && Intrinsics.e(this.localeList, other.localeList) && ei1.r(this.background, other.background) && Intrinsics.e(this.platformStyle, other.platformStyle);
    }

    public final boolean w(SpanStyle other) {
        return Intrinsics.e(this.textForegroundStyle, other.textForegroundStyle) && Intrinsics.e(this.textDecoration, other.textDecoration) && Intrinsics.e(this.shadow, other.shadow) && Intrinsics.e(this.drawStyle, other.drawStyle);
    }

    public final int x() {
        int i = b0d.i(this.fontSize) * 31;
        FontWeight fontWeight = this.fontWeight;
        int weight = (i + (fontWeight != null ? fontWeight.getWeight() : 0)) * 31;
        androidx.compose.ui.text.font.t tVar = this.fontStyle;
        int iG = (weight + (tVar != null ? androidx.compose.ui.text.font.t.g(tVar.getValue()) : 0)) * 31;
        androidx.compose.ui.text.font.u uVar = this.fontSynthesis;
        int i2 = (iG + (uVar != null ? androidx.compose.ui.text.font.u.i(uVar.getValue()) : 0)) * 31;
        androidx.compose.ui.text.font.l lVar = this.fontFamily;
        int iHashCode = (i2 + (lVar != null ? lVar.hashCode() : 0)) * 31;
        String str = this.fontFeatureSettings;
        int iHashCode2 = (((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + b0d.i(this.letterSpacing)) * 31;
        wg0 wg0Var = this.baselineShift;
        int iF = (iHashCode2 + (wg0Var != null ? wg0.f(wg0Var.getMultiplier()) : 0)) * 31;
        TextGeometricTransform textGeometricTransform = this.textGeometricTransform;
        int iHashCode3 = (iF + (textGeometricTransform != null ? textGeometricTransform.hashCode() : 0)) * 31;
        LocaleList localeList = this.localeList;
        int iHashCode4 = (((iHashCode3 + (localeList != null ? localeList.hashCode() : 0)) * 31) + ei1.x(this.background)) * 31;
        vb9 vb9Var = this.platformStyle;
        return iHashCode4 + (vb9Var != null ? vb9Var.hashCode() : 0);
    }

    public final SpanStyle y(SpanStyle other) {
        return other == null ? this : wzb.c(this, other.textForegroundStyle.d(), other.textForegroundStyle.h(), other.textForegroundStyle.a(), other.fontSize, other.fontWeight, other.fontStyle, other.fontSynthesis, other.fontFamily, other.fontFeatureSettings, other.letterSpacing, other.baselineShift, other.textGeometricTransform, other.localeList, other.background, other.textDecoration, other.shadow, other.platformStyle, other.drawStyle);
    }

    public /* synthetic */ SpanStyle(gwc gwcVar, long j, FontWeight fontWeight, androidx.compose.ui.text.font.t tVar, androidx.compose.ui.text.font.u uVar, androidx.compose.ui.text.font.l lVar, String str, long j2, wg0 wg0Var, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j3, wrc wrcVar, Shadow shadow, vb9 vb9Var, androidx.compose.ui.graphics.drawscope.b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(gwcVar, j, fontWeight, tVar, uVar, lVar, str, j2, wg0Var, textGeometricTransform, localeList, j3, wrcVar, shadow, vb9Var, bVar);
    }

    private SpanStyle(gwc gwcVar, long j, FontWeight fontWeight, androidx.compose.ui.text.font.t tVar, androidx.compose.ui.text.font.u uVar, androidx.compose.ui.text.font.l lVar, String str, long j2, wg0 wg0Var, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j3, wrc wrcVar, Shadow shadow, vb9 vb9Var, androidx.compose.ui.graphics.drawscope.b bVar) {
        this.textForegroundStyle = gwcVar;
        this.fontSize = j;
        this.fontWeight = fontWeight;
        this.fontStyle = tVar;
        this.fontSynthesis = uVar;
        this.fontFamily = lVar;
        this.fontFeatureSettings = str;
        this.letterSpacing = j2;
        this.baselineShift = wg0Var;
        this.textGeometricTransform = textGeometricTransform;
        this.localeList = localeList;
        this.background = j3;
        this.textDecoration = wrcVar;
        this.shadow = shadow;
        this.platformStyle = vb9Var;
        this.drawStyle = bVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SpanStyle(long j, long j2, FontWeight fontWeight, androidx.compose.ui.text.font.t tVar, androidx.compose.ui.text.font.u uVar, androidx.compose.ui.text.font.l lVar, String str, long j3, wg0 wg0Var, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, wrc wrcVar, Shadow shadow, vb9 vb9Var, androidx.compose.ui.graphics.drawscope.b bVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        long jI = (i & 1) != 0 ? ei1.INSTANCE.i() : j;
        long jA = (i & 2) != 0 ? b0d.INSTANCE.a() : j2;
        FontWeight fontWeight2 = (i & 4) != 0 ? null : fontWeight;
        androidx.compose.ui.text.font.t tVar2 = (i & 8) != 0 ? null : tVar;
        androidx.compose.ui.text.font.u uVar2 = (i & 16) != 0 ? null : uVar;
        androidx.compose.ui.text.font.l lVar2 = (i & 32) != 0 ? null : lVar;
        String str2 = (i & 64) != 0 ? null : str;
        long jA2 = (i & 128) != 0 ? b0d.INSTANCE.a() : j3;
        wg0 wg0Var2 = (i & 256) != 0 ? null : wg0Var;
        TextGeometricTransform textGeometricTransform2 = (i & 512) != 0 ? null : textGeometricTransform;
        LocaleList localeList2 = (i & 1024) != 0 ? null : localeList;
        long jI2 = (i & 2048) != 0 ? ei1.INSTANCE.i() : j4;
        wrc wrcVar2 = (i & 4096) != 0 ? null : wrcVar;
        long j5 = jI;
        Shadow shadow2 = (i & 8192) != 0 ? null : shadow;
        vb9 vb9Var2 = (i & 16384) != 0 ? null : vb9Var;
        long j6 = jA;
        FontWeight fontWeight3 = fontWeight2;
        wrc wrcVar3 = wrcVar2;
        androidx.compose.ui.text.font.t tVar3 = tVar2;
        androidx.compose.ui.text.font.u uVar3 = uVar2;
        androidx.compose.ui.text.font.l lVar3 = lVar2;
        String str3 = str2;
        long j7 = jA2;
        wg0 wg0Var3 = wg0Var2;
        TextGeometricTransform textGeometricTransform3 = textGeometricTransform2;
        LocaleList localeList3 = localeList2;
        long j8 = jI2;
        this(j5, j6, fontWeight3, tVar3, uVar3, lVar3, str3, j7, wg0Var3, textGeometricTransform3, localeList3, j8, wrcVar3, shadow2, vb9Var2, (i & 32768) != 0 ? null : bVar, (DefaultConstructorMarker) null);
    }

    private SpanStyle(long j, long j2, FontWeight fontWeight, androidx.compose.ui.text.font.t tVar, androidx.compose.ui.text.font.u uVar, androidx.compose.ui.text.font.l lVar, String str, long j3, wg0 wg0Var, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, wrc wrcVar, Shadow shadow, vb9 vb9Var, androidx.compose.ui.graphics.drawscope.b bVar) {
        this(gwc.INSTANCE.b(j), j2, fontWeight, tVar, uVar, lVar, str, j3, wg0Var, textGeometricTransform, localeList, j4, wrcVar, shadow, vb9Var, bVar, (DefaultConstructorMarker) null);
    }
}
