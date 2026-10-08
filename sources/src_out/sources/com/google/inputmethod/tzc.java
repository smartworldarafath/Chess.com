package com.google.inputmethod;

import android.os.Trace;
import androidx.compose.ui.b;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.j;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.node.c;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.l;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001nBS\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0018\u001a\u00020\u0017*\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0017H\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u0005H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020#H\u0002¢\u0006\u0004\b&\u0010%J\u001f\u0010(\u001a\u00020\r2\b\u0010'\u001a\u0004\u0018\u00010\u00122\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b(\u0010)J\u0015\u0010*\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b*\u0010\"J=\u0010+\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b+\u0010,J%\u00100\u001a\u00020#2\u0006\u0010-\u001a\u00020\r2\u0006\u0010.\u001a\u00020\r2\u0006\u0010/\u001a\u00020\r¢\u0006\u0004\b0\u00101J\u0013\u00103\u001a\u00020#*\u000202H\u0016¢\u0006\u0004\b3\u00104J#\u0010;\u001a\u00020:*\u0002052\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b;\u0010<J#\u0010?\u001a\u00020\u000f*\u00020\u00162\u0006\u00107\u001a\u00020=2\u0006\u0010>\u001a\u00020\u000fH\u0016¢\u0006\u0004\b?\u0010@J#\u0010B\u001a\u00020\u000f*\u00020\u00162\u0006\u00107\u001a\u00020=2\u0006\u0010A\u001a\u00020\u000fH\u0016¢\u0006\u0004\bB\u0010@J#\u0010C\u001a\u00020\u000f*\u00020\u00162\u0006\u00107\u001a\u00020=2\u0006\u0010>\u001a\u00020\u000fH\u0016¢\u0006\u0004\bC\u0010@J#\u0010D\u001a\u00020\u000f*\u00020\u00162\u0006\u00107\u001a\u00020=2\u0006\u0010A\u001a\u00020\u000fH\u0016¢\u0006\u0004\bD\u0010@J\u0013\u0010F\u001a\u00020#*\u00020EH\u0016¢\u0006\u0004\bF\u0010GR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010PR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010OR\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010OR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR*\u0010Z\u001a\u0010\u0012\u0004\u0012\u00020V\u0012\u0004\u0012\u00020\u000f\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bW\u0010X\u0012\u0004\bY\u0010%R\u0018\u0010]\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0018\u0010^\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010KR*\u0010d\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020a0`\u0012\u0004\u0012\u00020\r\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0018\u0010h\u001a\u0004\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010j\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bi\u0010\u001fR\u0014\u0010m\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bk\u0010l¨\u0006o"}, d2 = {"Lcom/google/android/tzc;", "Landroidx/compose/ui/b$c;", "Landroidx/compose/ui/node/c;", "Lcom/google/android/yg3;", "Lcom/google/android/bfb;", "", "text", "Landroidx/compose/ui/text/y;", "style", "Landroidx/compose/ui/text/font/l$b;", "fontFamilyResolver", "Lcom/google/android/uyc;", "overflow", "", "softWrap", "", "maxLines", "minLines", "Lcom/google/android/ri1;", "overrideColor", "<init>", "(Ljava/lang/String;Landroidx/compose/ui/text/y;Landroidx/compose/ui/text/font/l$b;IZIILcom/google/android/ri1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lcom/google/android/h66;", "Lcom/google/android/e19;", "y3", "(Lcom/google/android/h66;)Lcom/google/android/e19;", "Lcom/google/android/fcc;", "phase", "C3", "(I)Z", "z3", "()Lcom/google/android/e19;", "updatedText", "D3", "(Ljava/lang/String;)Z", "", "v3", "()V", "A3", "color", "E3", "(Lcom/google/android/ri1;Landroidx/compose/ui/text/y;)Z", "G3", "F3", "(Landroidx/compose/ui/text/y;IIZLandroidx/compose/ui/text/font/l$b;I)Z", "drawChanged", "textChanged", "layoutChanged", "w3", "(ZZZ)V", "Lcom/google/android/nfb;", "H0", "(Lcom/google/android/nfb;)V", "Landroidx/compose/ui/layout/j;", "Lcom/google/android/dj7;", "measurable", "Lcom/google/android/kx1;", "constraints", "Lcom/google/android/fj7;", "b", "(Landroidx/compose/ui/layout/j;Lcom/google/android/dj7;J)Lcom/google/android/fj7;", "Lcom/google/android/f66;", "height", "z", "(Lcom/google/android/h66;Lcom/google/android/f66;I)I", "width", "m", "t", "i", "Lcom/google/android/fz1;", "j", "(Lcom/google/android/fz1;)V", "p", "Ljava/lang/String;", "q", "Landroidx/compose/ui/text/y;", "r", "Landroidx/compose/ui/text/font/l$b;", "s", "I", "Z", "u", "v", "w", "Lcom/google/android/ri1;", "", "Lcom/google/android/uc;", "x", "Ljava/util/Map;", "getBaselineCache$annotations", "baselineCache", "y", "Lcom/google/android/e19;", "_layoutCache", "resolvedInheritedStyle", "Lkotlin/Function1;", "", "Lcom/google/android/vxc;", "A", "Lkotlin/jvm/functions/Function1;", "semanticsTextLayoutResult", "Lcom/google/android/tzc$a;", "B", "Lcom/google/android/tzc$a;", "textSubstitution", "x3", "layoutCache", "Q2", "()Z", "shouldAutoInvalidate", "a", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class tzc extends b.c implements c, yg3, bfb {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private Function1<? super List<TextLayoutResult>, Boolean> semanticsTextLayoutResult;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private TextSubstitution textSubstitution;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private String text;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private TextStyle style;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private l.b fontFamilyResolver;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private int overflow;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private boolean softWrap;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private int maxLines;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private int minLines;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private ri1 overrideColor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private Map<uc, Integer> baselineCache;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private e19 _layoutCache;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private TextStyle resolvedInheritedStyle;

    public /* synthetic */ tzc(String str, TextStyle textStyle, l.b bVar, int i, boolean z, int i2, int i3, ri1 ri1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textStyle, bVar, i, z, i2, i3, ri1Var);
    }

    private final void A3() {
        cfb.d(this);
        bo6.b(this);
        zg3.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B3(o oVar, o.a aVar) {
        o.a.z(aVar, oVar, 0, 0, 0.0f, 4, null);
        return Unit.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final boolean C3(int phase) throws KotlinNothingValueException {
        TextStyle textStyle = this.resolvedInheritedStyle;
        TextStyle textStyleB = xzc.b(this, phase, this.style);
        this.resolvedInheritedStyle = textStyleB;
        if (textStyle == null) {
            return false;
        }
        return !Intrinsics.e(textStyle, textStyleB);
    }

    private final boolean D3(String updatedText) {
        TextSubstitution textSubstitution = this.textSubstitution;
        if (textSubstitution != null) {
            if (Intrinsics.e(updatedText, textSubstitution.getSubstitution())) {
                return false;
            }
            textSubstitution.f(updatedText);
            e19 layoutCache = textSubstitution.getLayoutCache();
            if (layoutCache == null) {
                return false;
            }
            layoutCache.q(updatedText, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines);
            return true;
        }
        TextSubstitution textSubstitution2 = new TextSubstitution(this.text, updatedText, false, null, 12, null);
        e19 e19Var = new e19(updatedText, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, null);
        e19Var.n(x3().getDensity());
        textSubstitution2.d(e19Var);
        this.textSubstitution = textSubstitution2;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean r3(tzc tzcVar, List list) {
        e19 e19VarX3 = tzcVar.x3();
        TextStyle textStyle = tzcVar.style;
        ri1 ri1Var = tzcVar.overrideColor;
        TextLayoutResult textLayoutResultP = e19VarX3.p(textStyle.K((16609104 & 1) != 0 ? ei1.INSTANCE.i() : ri1Var != null ? ri1Var.a() : ei1.INSTANCE.i(), (16609104 & 2) != 0 ? b0d.INSTANCE.a() : 0L, (16609104 & 4) != 0 ? null : null, (16609104 & 8) != 0 ? null : null, (16609104 & 16) != 0 ? null : null, (16609104 & 32) != 0 ? null : null, (16609104 & 64) != 0 ? null : null, (16609104 & 128) != 0 ? b0d.INSTANCE.a() : 0L, (16609104 & 256) != 0 ? null : null, (16609104 & 512) != 0 ? null : null, (16609104 & 1024) != 0 ? null : null, (16609104 & 2048) != 0 ? ei1.INSTANCE.i() : 0L, (16609104 & 4096) != 0 ? null : null, (16609104 & 8192) != 0 ? null : null, (16609104 & 16384) != 0 ? null : null, (16609104 & 32768) != 0 ? cpc.INSTANCE.g() : 0, (16609104 & 65536) != 0 ? dsc.INSTANCE.f() : 0, (16609104 & 131072) != 0 ? b0d.INSTANCE.a() : 0L, (16609104 & 262144) != 0 ? null : null, (16609104 & 524288) != 0 ? null : null, (16609104 & 1048576) != 0 ? d27.INSTANCE.c() : 0, (16609104 & 2097152) != 0 ? qi5.INSTANCE.c() : 0, (16609104 & 4194304) != 0 ? null : null, (16609104 & 8388608) != 0 ? null : null));
        if (textLayoutResultP != null) {
            list.add(textLayoutResultP);
        } else {
            textLayoutResultP = null;
        }
        return textLayoutResultP != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean s3(tzc tzcVar, androidx.compose.ui.text.b bVar) {
        tzcVar.D3(bVar.getText());
        tzcVar.A3();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean t3(tzc tzcVar, boolean z) {
        TextSubstitution textSubstitution = tzcVar.textSubstitution;
        if (textSubstitution == null) {
            return false;
        }
        if (textSubstitution != null) {
            textSubstitution.e(z);
        }
        tzcVar.A3();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean u3(tzc tzcVar) {
        tzcVar.v3();
        tzcVar.A3();
        return true;
    }

    private final void v3() {
        this.textSubstitution = null;
    }

    private final e19 x3() {
        TextStyle textStyle;
        if (!up1.isInheritedTextStyleEnabled || (textStyle = this.resolvedInheritedStyle) == null) {
            textStyle = this.style;
        }
        TextStyle textStyle2 = textStyle;
        if (this._layoutCache == null) {
            this._layoutCache = new e19(this.text, textStyle2, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, null);
        }
        e19 e19Var = this._layoutCache;
        Intrinsics.g(e19Var);
        return e19Var;
    }

    private final e19 y3(h66 h66Var) {
        if (up1.isInheritedTextStyleEnabled && C3(fcc.INSTANCE.b())) {
            TextStyle textStyle = this.resolvedInheritedStyle;
            if (textStyle == null) {
                textStyle = this.style;
            }
            x3().q(this.text, textStyle, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines);
        }
        e19 e19VarZ3 = z3();
        e19VarZ3.n(h66Var);
        return e19VarZ3;
    }

    private final e19 z3() {
        e19 layoutCache;
        TextSubstitution textSubstitution = this.textSubstitution;
        if (textSubstitution != null) {
            if (!textSubstitution.getIsShowingSubstitution()) {
                textSubstitution = null;
            }
            if (textSubstitution != null && (layoutCache = textSubstitution.getLayoutCache()) != null) {
                return layoutCache;
            }
        }
        return x3();
    }

    public final boolean E3(ri1 color, TextStyle style) {
        boolean zE = Intrinsics.e(color, this.overrideColor);
        this.overrideColor = color;
        return (zE && style.F(this.style)) ? false : true;
    }

    public final boolean F3(TextStyle style, int minLines, int maxLines, boolean softWrap, l.b fontFamilyResolver, int overflow) {
        boolean z = !this.style.G(style);
        this.style = style;
        if (this.minLines != minLines) {
            this.minLines = minLines;
            z = true;
        }
        if (this.maxLines != maxLines) {
            this.maxLines = maxLines;
            z = true;
        }
        if (this.softWrap != softWrap) {
            this.softWrap = softWrap;
            z = true;
        }
        if (!Intrinsics.e(this.fontFamilyResolver, fontFamilyResolver)) {
            this.fontFamilyResolver = fontFamilyResolver;
            z = true;
        }
        if (uyc.g(this.overflow, overflow)) {
            return z;
        }
        this.overflow = overflow;
        return true;
    }

    public final boolean G3(String text) {
        if (Intrinsics.e(this.text, text)) {
            return false;
        }
        this.text = text;
        v3();
        return true;
    }

    @Override // com.google.inputmethod.bfb
    public void H0(nfb nfbVar) {
        Function1<? super List<TextLayoutResult>, Boolean> function1 = this.semanticsTextLayoutResult;
        if (function1 == null) {
            function1 = new Function1() { // from class: com.google.android.ozc
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(tzc.r3(this.a, (List) obj));
                }
            };
            this.semanticsTextLayoutResult = function1;
        }
        SemanticsPropertiesKt.x0(nfbVar, new androidx.compose.ui.text.b(this.text, null, 2, null));
        TextSubstitution textSubstitution = this.textSubstitution;
        if (textSubstitution != null) {
            SemanticsPropertiesKt.u0(nfbVar, textSubstitution.getIsShowingSubstitution());
            SemanticsPropertiesKt.B0(nfbVar, new androidx.compose.ui.text.b(textSubstitution.getSubstitution(), null, 2, null));
        }
        SemanticsPropertiesKt.D0(nfbVar, null, new Function1() { // from class: com.google.android.pzc
            public final Object invoke(Object obj) {
                return Boolean.valueOf(tzc.s3(this.a, (androidx.compose.ui.text.b) obj));
            }
        }, 1, null);
        SemanticsPropertiesKt.J0(nfbVar, null, new Function1() { // from class: com.google.android.qzc
            public final Object invoke(Object obj) {
                return Boolean.valueOf(tzc.t3(this.a, ((Boolean) obj).booleanValue()));
            }
        }, 1, null);
        SemanticsPropertiesKt.b(nfbVar, null, new Function0() { // from class: com.google.android.rzc
            public final Object invoke() {
                return Boolean.valueOf(tzc.u3(this.a));
            }
        }, 1, null);
        SemanticsPropertiesKt.q(nfbVar, null, function1, 1, null);
    }

    @Override // androidx.compose.ui.b.c
    /* JADX INFO: renamed from: Q2 */
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.node.c
    public fj7 b(j jVar, dj7 dj7Var, long j) {
        Trace.beginSection("TextStringSimpleNode::measure");
        try {
            e19 e19VarY3 = y3(jVar);
            boolean zH = e19VarY3.h(j, jVar.getLayoutDirection());
            e19VarY3.d();
            b19 paragraph = e19VarY3.getParagraph();
            Intrinsics.g(paragraph);
            long layoutSize = e19VarY3.getLayoutSize();
            if (zH) {
                bo6.a(this);
                Map map = this.baselineCache;
                if (map == null) {
                    map = new HashMap(2);
                    this.baselineCache = map;
                }
                map.put(AlignmentLineKt.a(), Integer.valueOf(Math.round(paragraph.f())));
                map.put(AlignmentLineKt.b(), Integer.valueOf(Math.round(paragraph.z())));
            }
            int i = (int) (layoutSize >> 32);
            int i2 = (int) (layoutSize & 4294967295L);
            final o oVarR0 = dj7Var.r0(kx1.INSTANCE.b(i, i, i2, i2));
            Map<uc, Integer> map2 = this.baselineCache;
            Intrinsics.g(map2);
            return jVar.h2(i, i2, map2, new Function1() { // from class: com.google.android.szc
                public final Object invoke(Object obj) {
                    return tzc.B3(oVarR0, (o.a) obj);
                }
            });
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.compose.ui.node.c
    public int i(h66 h66Var, f66 f66Var, int i) {
        return y3(h66Var).f(i, h66Var.getLayoutDirection());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // com.google.inputmethod.yg3
    public void j(fz1 fz1Var) throws KotlinNothingValueException {
        TextStyle textStyle;
        if (getIsAttached()) {
            e19 e19VarZ3 = z3();
            b19 paragraph = e19VarZ3.getParagraph();
            if (paragraph == null) {
                cx5.b("Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache=" + this._layoutCache + ", textSubstitution=" + this.textSubstitution + ')');
                throw new KotlinNothingValueException();
            }
            w41 w41VarB = fz1Var.getDrawContext().b();
            boolean didOverflow = e19VarZ3.getDidOverflow();
            if (didOverflow) {
                float layoutSize = (int) (e19VarZ3.getLayoutSize() >> 32);
                float layoutSize2 = (int) (e19VarZ3.getLayoutSize() & 4294967295L);
                w41VarB.v();
                w41.i(w41VarB, 0.0f, 0.0f, layoutSize, layoutSize2, 0, 16, null);
            }
            try {
                if (up1.isInheritedTextStyleEnabled) {
                    C3(fcc.INSTANCE.a());
                    textStyle = this.resolvedInheritedStyle;
                    if (textStyle == null) {
                        textStyle = this.style;
                    }
                } else {
                    textStyle = this.style;
                }
                wrc wrcVarA = textStyle.A();
                if (wrcVarA == null) {
                    wrcVarA = wrc.INSTANCE.c();
                }
                wrc wrcVar = wrcVarA;
                Shadow shadowX = textStyle.x();
                if (shadowX == null) {
                    shadowX = Shadow.INSTANCE.a();
                }
                Shadow shadow = shadowX;
                androidx.compose.ui.graphics.drawscope.b bVarI = textStyle.i();
                if (bVarI == null) {
                    bVarI = androidx.compose.ui.graphics.drawscope.c.b;
                }
                androidx.compose.ui.graphics.drawscope.b bVar = bVarI;
                qu0 qu0VarG = textStyle.g();
                if (qu0VarG != null) {
                    b19.y(paragraph, w41VarB, qu0VarG, textStyle.d(), shadow, wrcVar, bVar, 0, 64, null);
                } else {
                    ri1 ri1Var = this.overrideColor;
                    long jA = ri1Var != null ? ri1Var.a() : ei1.INSTANCE.i();
                    if (jA == 16) {
                        jA = textStyle.h() != 16 ? textStyle.h() : ei1.INSTANCE.a();
                    }
                    b19.E(paragraph, w41VarB, jA, shadow, wrcVar, bVar, 0, 32, null);
                }
            } finally {
                if (didOverflow) {
                    w41VarB.o();
                }
            }
        }
    }

    @Override // androidx.compose.ui.node.c
    public int m(h66 h66Var, f66 f66Var, int i) {
        return y3(h66Var).f(i, h66Var.getLayoutDirection());
    }

    @Override // androidx.compose.ui.node.c
    public int t(h66 h66Var, f66 f66Var, int i) {
        return y3(h66Var).j(h66Var.getLayoutDirection());
    }

    public final void w3(boolean drawChanged, boolean textChanged, boolean layoutChanged) {
        if (drawChanged || textChanged || layoutChanged) {
            this.resolvedInheritedStyle = null;
        }
        if (textChanged || layoutChanged) {
            x3().q(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines);
        }
        if (getIsAttached()) {
            if (textChanged || (drawChanged && this.semanticsTextLayoutResult != null)) {
                cfb.d(this);
            }
            if (textChanged || layoutChanged) {
                bo6.b(this);
                zg3.a(this);
            }
            if (drawChanged) {
                zg3.a(this);
            }
        }
    }

    @Override // androidx.compose.ui.node.c
    public int z(h66 h66Var, f66 f66Var, int i) {
        return y3(h66Var).k(h66Var.getLayoutDirection());
    }

    private tzc(String str, TextStyle textStyle, l.b bVar, int i, boolean z, int i2, int i3, ri1 ri1Var) {
        this.text = str;
        this.style = textStyle;
        this.fontFamilyResolver = bVar;
        this.overflow = i;
        this.softWrap = z;
        this.maxLines = i2;
        this.minLines = i3;
        this.overrideColor = ri1Var;
    }

    /* JADX INFO: renamed from: com.google.android.tzc$a, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u0018R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0013\u0010 \"\u0004\b\u001e\u0010!¨\u0006\""}, d2 = {"Lcom/google/android/tzc$a;", "", "", "original", "substitution", "", "isShowingSubstitution", "Lcom/google/android/e19;", "layoutCache", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLcom/google/android/e19;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getOriginal", "b", "f", "(Ljava/lang/String;)V", "c", "Z", "()Z", "e", "(Z)V", "d", "Lcom/google/android/e19;", "()Lcom/google/android/e19;", "(Lcom/google/android/e19;)V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TextSubstitution {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String original;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private String substitution;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        private boolean isShowingSubstitution;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        private e19 layoutCache;

        public TextSubstitution(String str, String str2, boolean z, e19 e19Var) {
            this.original = str;
            this.substitution = str2;
            this.isShowingSubstitution = z;
            this.layoutCache = e19Var;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final e19 getLayoutCache() {
            return this.layoutCache;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSubstitution() {
            return this.substitution;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsShowingSubstitution() {
            return this.isShowingSubstitution;
        }

        public final void d(e19 e19Var) {
            this.layoutCache = e19Var;
        }

        public final void e(boolean z) {
            this.isShowingSubstitution = z;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextSubstitution)) {
                return false;
            }
            TextSubstitution textSubstitution = (TextSubstitution) other;
            return Intrinsics.e(this.original, textSubstitution.original) && Intrinsics.e(this.substitution, textSubstitution.substitution) && this.isShowingSubstitution == textSubstitution.isShowingSubstitution && Intrinsics.e(this.layoutCache, textSubstitution.layoutCache);
        }

        public final void f(String str) {
            this.substitution = str;
        }

        public int hashCode() {
            int iHashCode = ((((this.original.hashCode() * 31) + this.substitution.hashCode()) * 31) + Boolean.hashCode(this.isShowingSubstitution)) * 31;
            e19 e19Var = this.layoutCache;
            return iHashCode + (e19Var == null ? 0 : e19Var.hashCode());
        }

        public String toString() {
            return "TextSubstitution(layoutCache=" + this.layoutCache + ", isShowingSubstitution=" + this.isShowingSubstitution + ')';
        }

        public /* synthetic */ TextSubstitution(String str, String str2, boolean z, e19 e19Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : e19Var);
        }
    }
}
