package com.google.inputmethod;

import androidx.compose.ui.graphics.drawscope.b;
import androidx.compose.ui.graphics.drawscope.c;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.l;
import androidx.compose.ui.text.font.t;
import androidx.compose.ui.text.font.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a-\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a-\u0010\u0013\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u0006\u0010\b\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0013\u0010\u0002\u001a\u00020\u0010*\u00020\u0010H\u0002¢\u0006\u0004\b\u0002\u0010\u0015\u001a-\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\f\u001a\u0004\u0018\u00010\u00162\b\u0010\r\u001a\u0004\u0018\u00010\u00162\u0006\u0010\b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0017\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a½\u0001\u0010:\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00002\b\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010'\u001a\u0004\u0018\u00010&2\b\u0010)\u001a\u0004\u0018\u00010(2\b\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010,\u001a\u00020\u00002\b\u0010.\u001a\u0004\u0018\u00010-2\b\u00100\u001a\u0004\u0018\u00010/2\b\u00102\u001a\u0004\u0018\u0001012\u0006\u00103\u001a\u00020\u001c2\b\u00105\u001a\u0004\u0018\u0001042\b\u00106\u001a\u0004\u0018\u00010\u00102\b\u00107\u001a\u0004\u0018\u00010\u00162\b\u00109\u001a\u0004\u0018\u000108H\u0000¢\u0006\u0004\b:\u0010;\u001a\u001f\u0010=\u001a\u0004\u0018\u00010\u0016*\u00020\u000b2\b\u0010<\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b=\u0010>\"\u0014\u0010@\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010?\"\u0014\u0010A\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010?\"\u0014\u0010B\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010?\"\u0014\u0010C\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010?\"\u0014\u0010F\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010E¨\u0006G"}, d2 = {"Lcom/google/android/b0d;", "a", "b", "", "t", "g", "(JJF)J", "T", "fraction", "e", "(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;", "Landroidx/compose/ui/text/r;", "start", "stop", "d", "(Landroidx/compose/ui/text/r;Landroidx/compose/ui/text/r;F)Landroidx/compose/ui/text/r;", "Lcom/google/android/nkb;", "lhs", "rhs", "i", "(Lcom/google/android/nkb;Lcom/google/android/nkb;F)Lcom/google/android/nkb;", "(Lcom/google/android/nkb;)Lcom/google/android/nkb;", "Lcom/google/android/vb9;", "f", "(Lcom/google/android/vb9;Lcom/google/android/vb9;F)Lcom/google/android/vb9;", "style", "j", "(Landroidx/compose/ui/text/r;)Landroidx/compose/ui/text/r;", "Lcom/google/android/ei1;", "color", "Lcom/google/android/qu0;", "brush", "alpha", "fontSize", "Landroidx/compose/ui/text/font/x;", "fontWeight", "Landroidx/compose/ui/text/font/t;", "fontStyle", "Landroidx/compose/ui/text/font/u;", "fontSynthesis", "Landroidx/compose/ui/text/font/l;", "fontFamily", "", "fontFeatureSettings", "letterSpacing", "Lcom/google/android/wg0;", "baselineShift", "Lcom/google/android/hwc;", "textGeometricTransform", "Lcom/google/android/g77;", "localeList", "background", "Lcom/google/android/wrc;", "textDecoration", "shadow", "platformStyle", "Landroidx/compose/ui/graphics/drawscope/b;", "drawStyle", "c", "(Landroidx/compose/ui/text/r;JLcom/google/android/qu0;FJLandroidx/compose/ui/text/font/x;Landroidx/compose/ui/text/font/t;Landroidx/compose/ui/text/font/u;Landroidx/compose/ui/text/font/l;Ljava/lang/String;JLcom/google/android/wg0;Lcom/google/android/hwc;Lcom/google/android/g77;JLcom/google/android/wrc;Lcom/google/android/nkb;Lcom/google/android/vb9;Landroidx/compose/ui/graphics/drawscope/b;)Landroidx/compose/ui/text/r;", "other", "h", "(Landroidx/compose/ui/text/r;Lcom/google/android/vb9;)Lcom/google/android/vb9;", "J", "DefaultFontSize", "DefaultLetterSpacing", "DefaultBackgroundColor", "DefaultColor", "Lcom/google/android/gwc;", "Lcom/google/android/gwc;", "DefaultColorForegroundStyle", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class wzb {
    private static final long a = c0d.i(14);
    private static final long b = c0d.i(0);
    private static final long c;
    private static final long d;
    private static final gwc e;

    static {
        ei1.Companion companion = ei1.INSTANCE;
        c = companion.h();
        long jA = companion.a();
        d = jA;
        e = gwc.INSTANCE.b(jA);
    }

    private static final Shadow b(Shadow shadow) {
        return Shadow.c(shadow, ei1.p(shadow.getColor(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0.0f, 6, null);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0183  */
    /* JADX WARN: Code duplicated, block: B:102:0x0187  */
    /* JADX WARN: Code duplicated, block: B:105:0x0193  */
    /* JADX WARN: Code duplicated, block: B:106:0x0198  */
    /* JADX WARN: Code duplicated, block: B:108:0x019c  */
    /* JADX WARN: Code duplicated, block: B:110:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:112:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:113:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:117:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:119:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:11:0x003a A[PHI: r11
  0x003a: PHI (r11v7 long) = 
  (r11v1 long)
  (r11v1 long)
  (r11v1 long)
  (r11v1 long)
  (r11v1 long)
  (r11v1 long)
  (r11v1 long)
  (r11v1 long)
  (r11v1 long)
  (r11v1 long)
  (r11v1 long)
  (r11v8 long)
 binds: [B:41:0x00ab, B:53:0x00dd, B:50:0x00d1, B:47:0x00c5, B:44:0x00b9, B:39:0x009d, B:34:0x008e, B:28:0x0076, B:25:0x006e, B:22:0x0062, B:19:0x0056, B:9:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:121:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:124:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:125:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:83:0x013e  */
    /* JADX WARN: Code duplicated, block: B:84:0x0147  */
    /* JADX WARN: Code duplicated, block: B:87:0x0157  */
    /* JADX WARN: Code duplicated, block: B:88:0x015c  */
    /* JADX WARN: Code duplicated, block: B:91:0x0166  */
    /* JADX WARN: Code duplicated, block: B:93:0x016c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0171  */
    /* JADX WARN: Code duplicated, block: B:96:0x0175  */
    /* JADX WARN: Code duplicated, block: B:97:0x017a  */
    /* JADX WARN: Code duplicated, block: B:99:0x017e  */
    public static final SpanStyle c(SpanStyle spanStyle, long j, qu0 qu0Var, float f, long j2, FontWeight fontWeight, t tVar, u uVar, l lVar, String str, long j3, wg0 wg0Var, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, wrc wrcVar, Shadow shadow, vb9 vb9Var, b bVar) {
        long fontSize;
        TextGeometricTransform textGeometricTransform2;
        long background;
        b bVar2;
        gwc gwcVarB;
        l fontFamily;
        FontWeight fontWeight2;
        t fontStyle;
        u fontSynthesis;
        long letterSpacing;
        LocaleList localeList2;
        b drawStyle;
        String fontFeatureSettings = str;
        wg0 baselineShift = wg0Var;
        wrc textDecoration = wrcVar;
        Shadow shadow2 = shadow;
        if (!(b0d.f(j2) == 0)) {
            fontSize = j2;
            if (!b0d.e(fontSize, spanStyle.getFontSize())) {
                textGeometricTransform2 = textGeometricTransform;
                background = j4;
                bVar2 = bVar;
            }
            if (qu0Var != null) {
                gwcVarB = gwc.INSTANCE.a(qu0Var, f);
            } else {
                gwcVarB = gwc.INSTANCE.b(j);
            }
            gwc gwcVarI = spanStyle.getTextForegroundStyle().i(gwcVarB);
            if (lVar == null) {
                fontFamily = spanStyle.getFontFamily();
            } else {
                fontFamily = lVar;
            }
            if (b0d.f(fontSize) == 0) {
                fontSize = spanStyle.getFontSize();
            }
            if (fontWeight == null) {
                fontWeight2 = spanStyle.getFontWeight();
            } else {
                fontWeight2 = fontWeight;
            }
            if (tVar == null) {
                fontStyle = spanStyle.getFontStyle();
            } else {
                fontStyle = tVar;
            }
            if (uVar == null) {
                fontSynthesis = spanStyle.getFontSynthesis();
            } else {
                fontSynthesis = uVar;
            }
            if (fontFeatureSettings == null) {
                fontFeatureSettings = spanStyle.getFontFeatureSettings();
            }
            if (b0d.f(j3) == 0) {
                letterSpacing = spanStyle.getLetterSpacing();
            } else {
                letterSpacing = j3;
            }
            if (baselineShift == null) {
                baselineShift = spanStyle.getBaselineShift();
            }
            if (textGeometricTransform2 == null) {
                textGeometricTransform2 = spanStyle.getTextGeometricTransform();
            }
            if (localeList == null) {
                localeList2 = spanStyle.getLocaleList();
            } else {
                localeList2 = localeList;
            }
            if (background == 16) {
                background = spanStyle.getBackground();
            }
            if (textDecoration == null) {
                textDecoration = spanStyle.getTextDecoration();
            }
            if (shadow2 == null) {
                shadow2 = spanStyle.getShadow();
            }
            Shadow shadow3 = shadow2;
            vb9 vb9VarH = h(spanStyle, vb9Var);
            if (bVar2 == null) {
                drawStyle = spanStyle.getDrawStyle();
            } else {
                drawStyle = bVar2;
            }
            return new SpanStyle(gwcVarI, fontSize, fontWeight2, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform2, localeList2, background, textDecoration, shadow3, vb9VarH, drawStyle, (DefaultConstructorMarker) null);
        }
        fontSize = j2;
        if ((qu0Var != null || j == 16 || ei1.r(j, spanStyle.getTextForegroundStyle().getValue())) && ((tVar == null || Intrinsics.e(tVar, spanStyle.getFontStyle())) && ((fontWeight == null || Intrinsics.e(fontWeight, spanStyle.getFontWeight())) && (lVar == null || lVar == spanStyle.getFontFamily())))) {
            if ((b0d.f(j3) == 0) || b0d.e(j3, spanStyle.getLetterSpacing())) {
                if ((textDecoration == null || Intrinsics.e(textDecoration, spanStyle.getTextDecoration())) && Intrinsics.e(qu0Var, spanStyle.getTextForegroundStyle().h()) && ((qu0Var == null || f == spanStyle.getTextForegroundStyle().a()) && ((uVar == null || Intrinsics.e(uVar, spanStyle.getFontSynthesis())) && ((fontFeatureSettings == null || Intrinsics.e(fontFeatureSettings, spanStyle.getFontFeatureSettings())) && (baselineShift == null || Intrinsics.e(baselineShift, spanStyle.getBaselineShift())))))) {
                    if (textGeometricTransform != null) {
                        textGeometricTransform2 = textGeometricTransform;
                        if (Intrinsics.e(textGeometricTransform2, spanStyle.getTextGeometricTransform())) {
                        }
                    } else {
                        textGeometricTransform2 = textGeometricTransform;
                    }
                    if (localeList == null || Intrinsics.e(localeList, spanStyle.getLocaleList())) {
                        if (j4 != 16) {
                            background = j4;
                            if (ei1.r(background, spanStyle.getBackground())) {
                            }
                        } else {
                            background = j4;
                        }
                        if ((shadow2 == null || Intrinsics.e(shadow2, spanStyle.getShadow())) && (vb9Var == null || Intrinsics.e(vb9Var, spanStyle.getPlatformStyle()))) {
                            bVar2 = bVar;
                            if (bVar2 == null || Intrinsics.e(bVar2, spanStyle.getDrawStyle())) {
                                return spanStyle;
                            }
                        }
                    }
                    bVar2 = bVar;
                } else {
                    textGeometricTransform2 = textGeometricTransform;
                }
                background = j4;
                bVar2 = bVar;
            } else {
                textGeometricTransform2 = textGeometricTransform;
                background = j4;
                bVar2 = bVar;
            }
        } else {
            textGeometricTransform2 = textGeometricTransform;
            background = j4;
            bVar2 = bVar;
        }
        if (qu0Var != null) {
            gwcVarB = gwc.INSTANCE.a(qu0Var, f);
        } else {
            gwcVarB = gwc.INSTANCE.b(j);
        }
        gwc gwcVarI2 = spanStyle.getTextForegroundStyle().i(gwcVarB);
        if (lVar == null) {
            fontFamily = spanStyle.getFontFamily();
        } else {
            fontFamily = lVar;
        }
        if (b0d.f(fontSize) == 0) {
            fontSize = spanStyle.getFontSize();
        }
        if (fontWeight == null) {
            fontWeight2 = spanStyle.getFontWeight();
        } else {
            fontWeight2 = fontWeight;
        }
        if (tVar == null) {
            fontStyle = spanStyle.getFontStyle();
        } else {
            fontStyle = tVar;
        }
        if (uVar == null) {
            fontSynthesis = spanStyle.getFontSynthesis();
        } else {
            fontSynthesis = uVar;
        }
        if (fontFeatureSettings == null) {
            fontFeatureSettings = spanStyle.getFontFeatureSettings();
        }
        if (b0d.f(j3) == 0) {
            letterSpacing = spanStyle.getLetterSpacing();
        } else {
            letterSpacing = j3;
        }
        if (baselineShift == null) {
            baselineShift = spanStyle.getBaselineShift();
        }
        if (textGeometricTransform2 == null) {
            textGeometricTransform2 = spanStyle.getTextGeometricTransform();
        }
        if (localeList == null) {
            localeList2 = spanStyle.getLocaleList();
        } else {
            localeList2 = localeList;
        }
        if (background == 16) {
            background = spanStyle.getBackground();
        }
        if (textDecoration == null) {
            textDecoration = spanStyle.getTextDecoration();
        }
        if (shadow2 == null) {
            shadow2 = spanStyle.getShadow();
        }
        Shadow shadow4 = shadow2;
        vb9 vb9VarH2 = h(spanStyle, vb9Var);
        if (bVar2 == null) {
            drawStyle = spanStyle.getDrawStyle();
        } else {
            drawStyle = bVar2;
        }
        return new SpanStyle(gwcVarI2, fontSize, fontWeight2, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform2, localeList2, background, textDecoration, shadow4, vb9VarH2, drawStyle, (DefaultConstructorMarker) null);
    }

    public static final SpanStyle d(SpanStyle spanStyle, SpanStyle spanStyle2, float f) {
        gwc gwcVarB = hsc.b(spanStyle.getTextForegroundStyle(), spanStyle2.getTextForegroundStyle(), f);
        l lVar = (l) e(spanStyle.getFontFamily(), spanStyle2.getFontFamily(), f);
        long jG = g(spanStyle.getFontSize(), spanStyle2.getFontSize(), f);
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.INSTANCE.f();
        }
        FontWeight fontWeight2 = spanStyle2.getFontWeight();
        if (fontWeight2 == null) {
            fontWeight2 = FontWeight.INSTANCE.f();
        }
        FontWeight fontWeightA = mm4.a(fontWeight, fontWeight2, f);
        t tVar = (t) e(spanStyle.getFontStyle(), spanStyle2.getFontStyle(), f);
        u uVar = (u) e(spanStyle.getFontSynthesis(), spanStyle2.getFontSynthesis(), f);
        String str = (String) e(spanStyle.getFontFeatureSettings(), spanStyle2.getFontFeatureSettings(), f);
        long jG2 = g(spanStyle.getLetterSpacing(), spanStyle2.getLetterSpacing(), f);
        wg0 baselineShift = spanStyle.getBaselineShift();
        float multiplier = baselineShift != null ? baselineShift.getMultiplier() : wg0.c(0.0f);
        wg0 baselineShift2 = spanStyle2.getBaselineShift();
        float fA = xg0.a(multiplier, baselineShift2 != null ? baselineShift2.getMultiplier() : wg0.c(0.0f), f);
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform == null) {
            textGeometricTransform = TextGeometricTransform.INSTANCE.a();
        }
        TextGeometricTransform textGeometricTransform2 = spanStyle2.getTextGeometricTransform();
        if (textGeometricTransform2 == null) {
            textGeometricTransform2 = TextGeometricTransform.INSTANCE.a();
        }
        return new SpanStyle(gwcVarB, jG, fontWeightA, tVar, uVar, lVar, str, jG2, wg0.b(fA), iwc.a(textGeometricTransform, textGeometricTransform2, f), (LocaleList) e(spanStyle.getLocaleList(), spanStyle2.getLocaleList(), f), ki1.h(spanStyle.getBackground(), spanStyle2.getBackground(), f), (wrc) e(spanStyle.getTextDecoration(), spanStyle2.getTextDecoration(), f), i(spanStyle.getShadow(), spanStyle2.getShadow(), f), f(spanStyle.getPlatformStyle(), spanStyle2.getPlatformStyle(), f), (b) e(spanStyle.getDrawStyle(), spanStyle2.getDrawStyle(), f), (DefaultConstructorMarker) null);
    }

    public static final <T> T e(T t, T t2, float f) {
        return ((double) f) < 0.5d ? t : t2;
    }

    private static final vb9 f(vb9 vb9Var, vb9 vb9Var2, float f) {
        if (vb9Var == null && vb9Var2 == null) {
            return null;
        }
        if (vb9Var == null) {
            vb9Var = vb9.INSTANCE.a();
        }
        if (vb9Var2 == null) {
            vb9Var2 = vb9.INSTANCE.a();
        }
        return ro.c(vb9Var, vb9Var2, f);
    }

    public static final long g(long j, long j2, float f) {
        return (b0d.f(j) == 0 || b0d.f(j2) == 0) ? ((b0d) e(b0d.b(j), b0d.b(j2), f)).getPackedValue() : c0d.j(j, j2, f);
    }

    private static final vb9 h(SpanStyle spanStyle, vb9 vb9Var) {
        if (spanStyle.getPlatformStyle() == null) {
            return vb9Var;
        }
        return vb9Var == null ? spanStyle.getPlatformStyle() : spanStyle.getPlatformStyle().b(vb9Var);
    }

    public static final Shadow i(Shadow shadow, Shadow shadow2, float f) {
        if (!nq1.isCorrectShadowLerpWithNullsEnabled) {
            if (shadow == null) {
                shadow = new Shadow(0L, 0L, 0.0f, 7, null);
            }
            if (shadow2 == null) {
                shadow2 = new Shadow(0L, 0L, 0.0f, 7, null);
            }
            return qkb.a(shadow, shadow2, f);
        }
        if (shadow == null && shadow2 == null) {
            return null;
        }
        if (shadow != null) {
            return shadow2 == null ? qkb.a(shadow, b(shadow), f) : qkb.a(shadow, shadow2, f);
        }
        Intrinsics.g(shadow2);
        return qkb.a(b(shadow2), shadow2, f);
    }

    public static final SpanStyle j(SpanStyle spanStyle) {
        gwc gwcVarC = spanStyle.getTextForegroundStyle().c(new Function0() { // from class: com.google.android.vzb
            public final Object invoke() {
                return wzb.k();
            }
        });
        long fontSize = b0d.f(spanStyle.getFontSize()) == 0 ? a : spanStyle.getFontSize();
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.INSTANCE.f();
        }
        FontWeight fontWeight2 = fontWeight;
        t fontStyle = spanStyle.getFontStyle();
        t tVarC = t.c(fontStyle != null ? fontStyle.getValue() : t.INSTANCE.b());
        u fontSynthesis = spanStyle.getFontSynthesis();
        u uVarE = u.e(fontSynthesis != null ? fontSynthesis.getValue() : u.INSTANCE.a());
        l fontFamily = spanStyle.getFontFamily();
        if (fontFamily == null) {
            fontFamily = l.INSTANCE.b();
        }
        l lVar = fontFamily;
        String fontFeatureSettings = spanStyle.getFontFeatureSettings();
        if (fontFeatureSettings == null) {
            fontFeatureSettings = "";
        }
        String str = fontFeatureSettings;
        long letterSpacing = b0d.f(spanStyle.getLetterSpacing()) == 0 ? b : spanStyle.getLetterSpacing();
        wg0 baselineShift = spanStyle.getBaselineShift();
        float multiplier = baselineShift != null ? baselineShift.getMultiplier() : wg0.INSTANCE.a();
        if (Float.isNaN(multiplier)) {
            multiplier = wg0.INSTANCE.a();
        }
        wg0 wg0VarB = wg0.b(multiplier);
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform == null) {
            textGeometricTransform = TextGeometricTransform.INSTANCE.a();
        }
        TextGeometricTransform textGeometricTransform2 = textGeometricTransform;
        LocaleList localeList = spanStyle.getLocaleList();
        if (localeList == null) {
            localeList = LocaleList.INSTANCE.a();
        }
        LocaleList localeList2 = localeList;
        long background = spanStyle.getBackground();
        if (background == 16) {
            background = c;
        }
        long j = background;
        wrc textDecoration = spanStyle.getTextDecoration();
        if (textDecoration == null) {
            textDecoration = wrc.INSTANCE.c();
        }
        wrc wrcVar = textDecoration;
        Shadow shadow = spanStyle.getShadow();
        if (shadow == null) {
            shadow = Shadow.INSTANCE.a();
        }
        Shadow shadow2 = shadow;
        vb9 platformStyle = spanStyle.getPlatformStyle();
        b drawStyle = spanStyle.getDrawStyle();
        if (drawStyle == null) {
            drawStyle = c.b;
        }
        return new SpanStyle(gwcVarC, fontSize, fontWeight2, tVarC, uVarE, lVar, str, letterSpacing, wg0VarB, textGeometricTransform2, localeList2, j, wrcVar, shadow2, platformStyle, drawStyle, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gwc k() {
        return e;
    }
}
