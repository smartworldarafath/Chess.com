package com.google.inputmethod;

import android.os.Trace;
import androidx.compose.ui.b;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.j;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.node.c;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.l;
import androidx.compose.ui.text.g;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0011\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u008e\u0001BÓ\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u0016\u0012\u001e\b\u0002\u0010\u001b\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\u0016\b\u0002\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b$\u0010%J\u0017\u0010)\u001a\u00020(2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u0005H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\rH\u0002¢\u0006\u0004\b.\u0010/J\u001f\u00101\u001a\u00020\u00112\b\u00100\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b3\u0010-J]\u00104\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\u0014\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u00162\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b4\u00105Ja\u00106\u001a\u00020\u00112\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\u001c\u0010\u001b\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0014\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b6\u00107J-\u0010<\u001a\u00020\r2\u0006\u00108\u001a\u00020\u00112\u0006\u00109\u001a\u00020\u00112\u0006\u0010:\u001a\u00020\u00112\u0006\u0010;\u001a\u00020\u0011¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\rH\u0000¢\u0006\u0004\b>\u0010/J\u0013\u0010@\u001a\u00020\r*\u00020?H\u0016¢\u0006\u0004\b@\u0010AJ%\u0010I\u001a\u00020H2\u0006\u0010C\u001a\u00020B2\u0006\u0010E\u001a\u00020D2\u0006\u0010G\u001a\u00020F¢\u0006\u0004\bI\u0010JJ#\u0010K\u001a\u00020H*\u00020B2\u0006\u0010E\u001a\u00020D2\u0006\u0010G\u001a\u00020FH\u0016¢\u0006\u0004\bK\u0010JJ%\u0010P\u001a\u00020\u00132\u0006\u0010M\u001a\u00020L2\u0006\u0010E\u001a\u00020N2\u0006\u0010O\u001a\u00020\u0013¢\u0006\u0004\bP\u0010QJ#\u0010R\u001a\u00020\u0013*\u00020L2\u0006\u0010E\u001a\u00020N2\u0006\u0010O\u001a\u00020\u0013H\u0016¢\u0006\u0004\bR\u0010QJ%\u0010T\u001a\u00020\u00132\u0006\u0010M\u001a\u00020L2\u0006\u0010E\u001a\u00020N2\u0006\u0010S\u001a\u00020\u0013¢\u0006\u0004\bT\u0010QJ#\u0010U\u001a\u00020\u0013*\u00020L2\u0006\u0010E\u001a\u00020N2\u0006\u0010S\u001a\u00020\u0013H\u0016¢\u0006\u0004\bU\u0010QJ%\u0010V\u001a\u00020\u00132\u0006\u0010M\u001a\u00020L2\u0006\u0010E\u001a\u00020N2\u0006\u0010O\u001a\u00020\u0013¢\u0006\u0004\bV\u0010QJ#\u0010W\u001a\u00020\u0013*\u00020L2\u0006\u0010E\u001a\u00020N2\u0006\u0010O\u001a\u00020\u0013H\u0016¢\u0006\u0004\bW\u0010QJ%\u0010X\u001a\u00020\u00132\u0006\u0010M\u001a\u00020L2\u0006\u0010E\u001a\u00020N2\u0006\u0010S\u001a\u00020\u0013¢\u0006\u0004\bX\u0010QJ#\u0010Y\u001a\u00020\u0013*\u00020L2\u0006\u0010E\u001a\u00020N2\u0006\u0010S\u001a\u00020\u0013H\u0016¢\u0006\u0004\bY\u0010QJ\u0015\u0010\\\u001a\u00020\r2\u0006\u0010[\u001a\u00020Z¢\u0006\u0004\b\\\u0010]J\u0013\u0010^\u001a\u00020\r*\u00020ZH\u0016¢\u0006\u0004\b^\u0010]R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR$\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010gR\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010gR\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010gR$\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR,\u0010\u001b\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010fR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010oR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR$\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010fR*\u0010z\u001a\u0010\u0012\u0004\u0012\u00020v\u0012\u0004\u0012\u00020\u0013\u0018\u00010u8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bw\u0010x\u0012\u0004\by\u0010/R\u0018\u0010}\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|R+\u0010\u0080\u0001\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0~\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u007f\u0010fR+\u0010\u0087\u0001\u001a\u0004\u0018\u00010\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0017\u0010\u008a\u0001\u001a\u00020(8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0017\u0010\u008d\u0001\u001a\u00020\u00118VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001¨\u0006\u008f\u0001"}, d2 = {"Lcom/google/android/mpc;", "Landroidx/compose/ui/b$c;", "Landroidx/compose/ui/node/c;", "Lcom/google/android/yg3;", "Lcom/google/android/bfb;", "Landroidx/compose/ui/text/b;", "text", "Landroidx/compose/ui/text/y;", "style", "Landroidx/compose/ui/text/font/l$b;", "fontFamilyResolver", "Lkotlin/Function1;", "Lcom/google/android/vxc;", "", "onTextLayout", "Lcom/google/android/uyc;", "overflow", "", "softWrap", "", "maxLines", "minLines", "", "Landroidx/compose/ui/text/b$d;", "Lcom/google/android/v99;", "placeholders", "Lcom/google/android/gba;", "onPlaceholderLayout", "Lcom/google/android/xdb;", "selectionController", "Lcom/google/android/ri1;", "overrideColor", "Lcom/google/android/eqc;", "autoSize", "Lcom/google/android/mpc$a;", "onShowTranslation", "<init>", "(Landroidx/compose/ui/text/b;Landroidx/compose/ui/text/y;Landroidx/compose/ui/text/font/l$b;Lkotlin/jvm/functions/Function1;IZIILjava/util/List;Lkotlin/jvm/functions/Function1;Lcom/google/android/xdb;Lcom/google/android/ri1;Lcom/google/android/eqc;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lcom/google/android/f43;", "density", "Lcom/google/android/f38;", "z3", "(Lcom/google/android/f43;)Lcom/google/android/f38;", "updatedText", "H3", "(Landroidx/compose/ui/text/b;)Z", "A3", "()V", "color", "J3", "(Lcom/google/android/ri1;Landroidx/compose/ui/text/y;)Z", "L3", "K3", "(Landroidx/compose/ui/text/y;Ljava/util/List;IIZLandroidx/compose/ui/text/font/l$b;ILcom/google/android/eqc;)Z", "I3", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/google/android/xdb;Lkotlin/jvm/functions/Function1;)Z", "drawChanged", "textChanged", "layoutChanged", "callbacksChanged", "w3", "(ZZZZ)V", "v3", "Lcom/google/android/nfb;", "H0", "(Lcom/google/android/nfb;)V", "Landroidx/compose/ui/layout/j;", "measureScope", "Lcom/google/android/dj7;", "measurable", "Lcom/google/android/kx1;", "constraints", "Lcom/google/android/fj7;", "D3", "(Landroidx/compose/ui/layout/j;Lcom/google/android/dj7;J)Lcom/google/android/fj7;", "b", "Lcom/google/android/h66;", "intrinsicMeasureScope", "Lcom/google/android/f66;", "height", "G3", "(Lcom/google/android/h66;Lcom/google/android/f66;I)I", "z", "width", "F3", "m", "C3", "t", "B3", "i", "Lcom/google/android/fz1;", "contentDrawScope", "x3", "(Lcom/google/android/fz1;)V", "j", "p", "Landroidx/compose/ui/text/b;", "q", "Landroidx/compose/ui/text/y;", "r", "Landroidx/compose/ui/text/font/l$b;", "s", "Lkotlin/jvm/functions/Function1;", "I", "u", "Z", "v", "w", "x", "Ljava/util/List;", "y", "Lcom/google/android/xdb;", "A", "Lcom/google/android/ri1;", "B", "Lcom/google/android/eqc;", "C", "", "Lcom/google/android/uc;", "D", "Ljava/util/Map;", "getBaselineCache$annotations", "baselineCache", "E", "Lcom/google/android/f38;", "_layoutCache", "", "F", "semanticsTextLayoutResult", "G", "Lcom/google/android/mpc$a;", "getTextSubstitution$foundation", "()Lcom/google/android/mpc$a;", "setTextSubstitution$foundation", "(Lcom/google/android/mpc$a;)V", "textSubstitution", "y3", "()Lcom/google/android/f38;", "layoutCache", "Q2", "()Z", "shouldAutoInvalidate", "a", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class mpc extends b.c implements c, yg3, bfb {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private ri1 overrideColor;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private eqc autoSize;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private Function1<? super TextSubstitutionValue, Unit> onShowTranslation;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private Map<uc, Integer> baselineCache;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private f38 _layoutCache;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private Function1<? super List<TextLayoutResult>, Boolean> semanticsTextLayoutResult;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private TextSubstitutionValue textSubstitution;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private androidx.compose.ui.text.b text;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private TextStyle style;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private l.b fontFamilyResolver;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private Function1<? super TextLayoutResult, Unit> onTextLayout;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private int overflow;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private boolean softWrap;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private int maxLines;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private int minLines;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private List<androidx.compose.ui.text.b.Range<Placeholder>> placeholders;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private Function1<? super List<gba>, Unit> onPlaceholderLayout;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private xdb selectionController;

    public /* synthetic */ mpc(androidx.compose.ui.text.b bVar, TextStyle textStyle, l.b bVar2, Function1 function1, int i, boolean z, int i2, int i3, List list, Function1 function2, xdb xdbVar, ri1 ri1Var, eqc eqcVar, Function1 function3, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, textStyle, bVar2, function1, i, z, i2, i3, list, function2, xdbVar, ri1Var, eqcVar, function3);
    }

    private final void A3() {
        cfb.d(this);
        bo6.b(this);
        zg3.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E3(o oVar, o.a aVar) {
        o.a.z(aVar, oVar, 0, 0, 0.0f, 4, null);
        return Unit.a;
    }

    private final boolean H3(androidx.compose.ui.text.b updatedText) {
        TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
        if (textSubstitutionValue != null) {
            if (Intrinsics.e(updatedText, textSubstitutionValue.getSubstitution())) {
                return false;
            }
            textSubstitutionValue.g(updatedText);
            f38 layoutCache = textSubstitutionValue.getLayoutCache();
            if (layoutCache == null) {
                return false;
            }
            layoutCache.y(updatedText, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, m.p(), this.autoSize);
            return true;
        }
        TextSubstitutionValue textSubstitutionValue2 = new TextSubstitutionValue(this.text, updatedText, false, null, 12, null);
        f38 f38Var = new f38(updatedText, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, m.p(), this.autoSize, null);
        f38Var.u(y3().getDensity());
        textSubstitutionValue2.e(f38Var);
        this.textSubstitution = textSubstitutionValue2;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:12:0x00af  */
    public static final boolean r3(mpc mpcVar, List list) {
        TextLayoutResult textLayoutResultB;
        TextLayoutResult textLayoutResultJ = mpcVar.y3().getLayoutCache();
        if (textLayoutResultJ != null) {
            androidx.compose.ui.text.b text = textLayoutResultJ.getLayoutInput().getText();
            TextStyle textStyle = mpcVar.style;
            ri1 ri1Var = mpcVar.overrideColor;
            textLayoutResultB = TextLayoutResult.b(textLayoutResultJ, new TextLayoutInput(text, textStyle.K((16609104 & 1) != 0 ? ei1.INSTANCE.i() : ri1Var != null ? ri1Var.a() : ei1.INSTANCE.i(), (16609104 & 2) != 0 ? b0d.INSTANCE.a() : 0L, (16609104 & 4) != 0 ? null : null, (16609104 & 8) != 0 ? null : null, (16609104 & 16) != 0 ? null : null, (16609104 & 32) != 0 ? null : null, (16609104 & 64) != 0 ? null : null, (16609104 & 128) != 0 ? b0d.INSTANCE.a() : 0L, (16609104 & 256) != 0 ? null : null, (16609104 & 512) != 0 ? null : null, (16609104 & 1024) != 0 ? null : null, (16609104 & 2048) != 0 ? ei1.INSTANCE.i() : 0L, (16609104 & 4096) != 0 ? null : null, (16609104 & 8192) != 0 ? null : null, (16609104 & 16384) != 0 ? null : null, (16609104 & 32768) != 0 ? cpc.INSTANCE.g() : 0, (16609104 & 65536) != 0 ? dsc.INSTANCE.f() : 0, (16609104 & 131072) != 0 ? b0d.INSTANCE.a() : 0L, (16609104 & 262144) != 0 ? null : null, (16609104 & 524288) != 0 ? null : null, (16609104 & 1048576) != 0 ? d27.INSTANCE.c() : 0, (16609104 & 2097152) != 0 ? qi5.INSTANCE.c() : 0, (16609104 & 4194304) != 0 ? null : null, (16609104 & 8388608) != 0 ? null : null), textLayoutResultJ.getLayoutInput().g(), textLayoutResultJ.getLayoutInput().getMaxLines(), textLayoutResultJ.getLayoutInput().getSoftWrap(), textLayoutResultJ.getLayoutInput().getOverflow(), textLayoutResultJ.getLayoutInput().getDensity(), textLayoutResultJ.getLayoutInput().getLayoutDirection(), textLayoutResultJ.getLayoutInput().getFontFamilyResolver(), textLayoutResultJ.getLayoutInput().getConstraints(), (DefaultConstructorMarker) null), 0L, 2, null);
            if (textLayoutResultB != null) {
                list.add(textLayoutResultB);
            } else {
                textLayoutResultB = null;
            }
        } else {
            textLayoutResultB = null;
        }
        return textLayoutResultB != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean s3(mpc mpcVar, androidx.compose.ui.text.b bVar) {
        mpcVar.H3(bVar);
        mpcVar.A3();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean t3(mpc mpcVar, boolean z) {
        TextSubstitutionValue textSubstitutionValue = mpcVar.textSubstitution;
        if (textSubstitutionValue == null) {
            return false;
        }
        Function1<? super TextSubstitutionValue, Unit> function1 = mpcVar.onShowTranslation;
        if (function1 != null) {
            Intrinsics.g(textSubstitutionValue);
            function1.invoke(textSubstitutionValue);
        }
        TextSubstitutionValue textSubstitutionValue2 = mpcVar.textSubstitution;
        if (textSubstitutionValue2 != null) {
            textSubstitutionValue2.f(z);
        }
        mpcVar.A3();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean u3(mpc mpcVar) {
        mpcVar.v3();
        mpcVar.A3();
        return true;
    }

    private final f38 y3() {
        if (this._layoutCache == null) {
            this._layoutCache = new f38(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, this.autoSize, null);
        }
        f38 f38Var = this._layoutCache;
        Intrinsics.g(f38Var);
        return f38Var;
    }

    private final f38 z3(f43 density) {
        f38 layoutCache;
        TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
        if (textSubstitutionValue != null && textSubstitutionValue.getIsShowingSubstitution() && (layoutCache = textSubstitutionValue.getLayoutCache()) != null) {
            layoutCache.u(density);
            return layoutCache;
        }
        f38 f38VarY3 = y3();
        f38VarY3.u(density);
        return f38VarY3;
    }

    public final int B3(h66 intrinsicMeasureScope, f66 measurable, int width) {
        return i(intrinsicMeasureScope, measurable, width);
    }

    public final int C3(h66 intrinsicMeasureScope, f66 measurable, int height) {
        return t(intrinsicMeasureScope, measurable, height);
    }

    public final fj7 D3(j measureScope, dj7 measurable, long constraints) {
        return b(measureScope, measurable, constraints);
    }

    public final int F3(h66 intrinsicMeasureScope, f66 measurable, int width) {
        return m(intrinsicMeasureScope, measurable, width);
    }

    public final int G3(h66 intrinsicMeasureScope, f66 measurable, int height) {
        return z(intrinsicMeasureScope, measurable, height);
    }

    @Override // com.google.inputmethod.bfb
    public void H0(nfb nfbVar) {
        Function1<? super List<TextLayoutResult>, Boolean> function1 = this.semanticsTextLayoutResult;
        if (function1 == null) {
            function1 = new Function1() { // from class: com.google.android.ipc
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(mpc.r3(this.a, (List) obj));
                }
            };
            this.semanticsTextLayoutResult = function1;
        }
        SemanticsPropertiesKt.x0(nfbVar, this.text);
        TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
        if (textSubstitutionValue != null) {
            SemanticsPropertiesKt.B0(nfbVar, textSubstitutionValue.getSubstitution());
            SemanticsPropertiesKt.u0(nfbVar, textSubstitutionValue.getIsShowingSubstitution());
        }
        SemanticsPropertiesKt.D0(nfbVar, null, new Function1() { // from class: com.google.android.jpc
            public final Object invoke(Object obj) {
                return Boolean.valueOf(mpc.s3(this.a, (androidx.compose.ui.text.b) obj));
            }
        }, 1, null);
        SemanticsPropertiesKt.J0(nfbVar, null, new Function1() { // from class: com.google.android.kpc
            public final Object invoke(Object obj) {
                return Boolean.valueOf(mpc.t3(this.a, ((Boolean) obj).booleanValue()));
            }
        }, 1, null);
        SemanticsPropertiesKt.b(nfbVar, null, new Function0() { // from class: com.google.android.lpc
            public final Object invoke() {
                return Boolean.valueOf(mpc.u3(this.a));
            }
        }, 1, null);
        SemanticsPropertiesKt.q(nfbVar, null, function1, 1, null);
    }

    public final boolean I3(Function1<? super TextLayoutResult, Unit> onTextLayout, Function1<? super List<gba>, Unit> onPlaceholderLayout, xdb selectionController, Function1<? super TextSubstitutionValue, Unit> onShowTranslation) {
        boolean z;
        if (this.onTextLayout != onTextLayout) {
            this.onTextLayout = onTextLayout;
            z = true;
        } else {
            z = false;
        }
        if (this.onPlaceholderLayout != onPlaceholderLayout) {
            this.onPlaceholderLayout = onPlaceholderLayout;
            z = true;
        }
        if (!Intrinsics.e(this.selectionController, selectionController)) {
            this.selectionController = selectionController;
            z = true;
        }
        if (this.onShowTranslation == onShowTranslation) {
            return z;
        }
        this.onShowTranslation = onShowTranslation;
        return true;
    }

    public final boolean J3(ri1 color, TextStyle style) {
        boolean zE = Intrinsics.e(color, this.overrideColor);
        this.overrideColor = color;
        return (zE && style.F(this.style)) ? false : true;
    }

    public final boolean K3(TextStyle style, List<androidx.compose.ui.text.b.Range<Placeholder>> placeholders, int minLines, int maxLines, boolean softWrap, l.b fontFamilyResolver, int overflow, eqc autoSize) {
        boolean z = !this.style.G(style);
        this.style = style;
        if (!Intrinsics.e(this.placeholders, placeholders)) {
            this.placeholders = placeholders;
            z = true;
        }
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
        if (!uyc.g(this.overflow, overflow)) {
            this.overflow = overflow;
            z = true;
        }
        if (Intrinsics.e(this.autoSize, autoSize)) {
            return z;
        }
        this.autoSize = autoSize;
        return true;
    }

    public final boolean L3(androidx.compose.ui.text.b text) {
        boolean zE = Intrinsics.e(this.text.getText(), text.getText());
        boolean z = (zE && this.text.m(text)) ? false : true;
        if (z) {
            this.text = text;
        }
        if (!zE) {
            v3();
        }
        return z;
    }

    @Override // androidx.compose.ui.b.c
    /* JADX INFO: renamed from: Q2 */
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.node.c
    public fj7 b(j jVar, dj7 dj7Var, long j) {
        Trace.beginSection("TextAnnotatedStringNode:measure");
        try {
            f38 f38VarZ3 = z3(jVar);
            boolean zN = f38VarZ3.n(j, jVar.getLayoutDirection());
            TextLayoutResult textLayoutResultK = f38VarZ3.k();
            textLayoutResultK.getMultiParagraph().getIntrinsics().c();
            if (zN) {
                bo6.a(this);
                Function1<? super TextLayoutResult, Unit> function1 = this.onTextLayout;
                if (function1 != null) {
                    function1.invoke(textLayoutResultK);
                }
                xdb xdbVar = this.selectionController;
                if (xdbVar != null) {
                    xdbVar.m(textLayoutResultK);
                }
                Map<uc, Integer> linkedHashMap = this.baselineCache;
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap<>(2);
                }
                linkedHashMap.put(AlignmentLineKt.a(), Integer.valueOf(Math.round(textLayoutResultK.getFirstBaseline())));
                linkedHashMap.put(AlignmentLineKt.b(), Integer.valueOf(Math.round(textLayoutResultK.getLastBaseline())));
                this.baselineCache = linkedHashMap;
            }
            Function1<? super List<gba>, Unit> function2 = this.onPlaceholderLayout;
            if (function2 != null) {
                function2.invoke(textLayoutResultK.A());
            }
            final o oVarR0 = dj7Var.r0(kx1.INSTANCE.b((int) (textLayoutResultK.getSize() >> 32), (int) (textLayoutResultK.getSize() >> 32), (int) (textLayoutResultK.getSize() & 4294967295L), (int) (textLayoutResultK.getSize() & 4294967295L)));
            int size = (int) (textLayoutResultK.getSize() >> 32);
            int size2 = (int) (textLayoutResultK.getSize() & 4294967295L);
            Map<uc, Integer> map = this.baselineCache;
            Intrinsics.g(map);
            return jVar.h2(size, size2, map, new Function1() { // from class: com.google.android.hpc
                public final Object invoke(Object obj) {
                    return mpc.E3(oVarR0, (o.a) obj);
                }
            });
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.compose.ui.node.c
    public int i(h66 h66Var, f66 f66Var, int i) {
        return z3(h66Var).l(i, h66Var.getLayoutDirection());
    }

    @Override // com.google.inputmethod.yg3
    public void j(fz1 fz1Var) {
        if (getIsAttached()) {
            xdb xdbVar = this.selectionController;
            if (xdbVar != null) {
                xdbVar.g(fz1Var);
            }
            w41 w41VarB = fz1Var.getDrawContext().b();
            TextLayoutResult textLayoutResultK = z3(fz1Var).k();
            g multiParagraph = textLayoutResultK.getMultiParagraph();
            boolean z = true;
            boolean z2 = textLayoutResultK.i() && !uyc.g(this.overflow, uyc.INSTANCE.e());
            if (z2) {
                gba gbaVarC = kba.c(rn8.INSTANCE.c(), tsb.d((((long) Float.floatToRawIntBits((int) (textLayoutResultK.getSize() >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (textLayoutResultK.getSize() & 4294967295L))) & 4294967295L)));
                w41VarB.v();
                w41.n(w41VarB, gbaVarC, 0, 2, null);
            }
            try {
                wrc wrcVarA = this.style.A();
                if (wrcVarA == null) {
                    wrcVarA = wrc.INSTANCE.c();
                }
                wrc wrcVar = wrcVarA;
                Shadow shadowX = this.style.x();
                if (shadowX == null) {
                    shadowX = Shadow.INSTANCE.a();
                }
                Shadow shadow = shadowX;
                androidx.compose.ui.graphics.drawscope.b bVarI = this.style.i();
                if (bVarI == null) {
                    bVarI = androidx.compose.ui.graphics.drawscope.c.b;
                }
                androidx.compose.ui.graphics.drawscope.b bVar = bVarI;
                qu0 qu0VarG = this.style.g();
                if (qu0VarG != null) {
                    g.N(multiParagraph, w41VarB, qu0VarG, this.style.d(), shadow, wrcVar, bVar, 0, 64, null);
                } else {
                    ri1 ri1Var = this.overrideColor;
                    long jA = ri1Var != null ? ri1Var.a() : ei1.INSTANCE.i();
                    if (jA == 16) {
                        jA = this.style.h() != 16 ? this.style.h() : ei1.INSTANCE.a();
                    }
                    multiParagraph.K(w41VarB, (30 & 2) != 0 ? ei1.INSTANCE.i() : jA, (30 & 4) != 0 ? null : shadow, (30 & 8) != 0 ? null : wrcVar, (30 & 16) == 0 ? bVar : null, (30 & 32) != 0 ? DrawScope.INSTANCE.a() : 0);
                }
                if (z2) {
                    w41VarB.o();
                }
                TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
                if (!((textSubstitutionValue == null || !textSubstitutionValue.getIsShowingSubstitution()) ? npc.a(this.text) : false)) {
                    List<androidx.compose.ui.text.b.Range<Placeholder>> list = this.placeholders;
                    if (list != null && !list.isEmpty()) {
                        z = false;
                    }
                    if (z) {
                        return;
                    }
                }
                fz1Var.j1();
            } catch (Throwable th) {
                if (z2) {
                    w41VarB.o();
                }
                throw th;
            }
        }
    }

    @Override // androidx.compose.ui.node.c
    public int m(h66 h66Var, f66 f66Var, int i) {
        return z3(h66Var).l(i, h66Var.getLayoutDirection());
    }

    @Override // androidx.compose.ui.node.c
    public int t(h66 h66Var, f66 f66Var, int i) {
        return z3(h66Var).q(h66Var.getLayoutDirection());
    }

    public final void v3() {
        this.textSubstitution = null;
    }

    public final void w3(boolean drawChanged, boolean textChanged, boolean layoutChanged, boolean callbacksChanged) {
        if (textChanged || layoutChanged || callbacksChanged) {
            y3().y(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, this.autoSize);
        }
        if (getIsAttached()) {
            if (textChanged || (drawChanged && this.semanticsTextLayoutResult != null)) {
                cfb.d(this);
            }
            if (textChanged || layoutChanged || callbacksChanged) {
                bo6.b(this);
                zg3.a(this);
            }
            if (drawChanged) {
                zg3.a(this);
            }
        }
    }

    public final void x3(fz1 contentDrawScope) {
        j(contentDrawScope);
    }

    @Override // androidx.compose.ui.node.c
    public int z(h66 h66Var, f66 f66Var, int i) {
        return z3(h66Var).r(h66Var.getLayoutDirection());
    }

    private mpc(androidx.compose.ui.text.b bVar, TextStyle textStyle, l.b bVar2, Function1<? super TextLayoutResult, Unit> function1, int i, boolean z, int i2, int i3, List<androidx.compose.ui.text.b.Range<Placeholder>> list, Function1<? super List<gba>, Unit> function2, xdb xdbVar, ri1 ri1Var, eqc eqcVar, Function1<? super TextSubstitutionValue, Unit> function3) {
        this.text = bVar;
        this.style = textStyle;
        this.fontFamilyResolver = bVar2;
        this.onTextLayout = function1;
        this.overflow = i;
        this.softWrap = z;
        this.maxLines = i2;
        this.minLines = i3;
        this.placeholders = list;
        this.onPlaceholderLayout = function2;
        this.selectionController = xdbVar;
        this.overrideColor = ri1Var;
        this.autoSize = eqcVar;
        this.onShowTranslation = function3;
    }

    /* JADX INFO: renamed from: com.google.android.mpc$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017\"\u0004\b\u0019\u0010\u001aR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010 \u001a\u0004\b\u0014\u0010!\"\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/google/android/mpc$a;", "", "Landroidx/compose/ui/text/b;", "original", "substitution", "", "isShowingSubstitution", "Lcom/google/android/f38;", "layoutCache", "<init>", "(Landroidx/compose/ui/text/b;Landroidx/compose/ui/text/b;ZLcom/google/android/f38;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/text/b;", "b", "()Landroidx/compose/ui/text/b;", "c", "g", "(Landroidx/compose/ui/text/b;)V", "Z", "d", "()Z", "f", "(Z)V", "Lcom/google/android/f38;", "()Lcom/google/android/f38;", "e", "(Lcom/google/android/f38;)V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TextSubstitutionValue {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        private final androidx.compose.ui.text.b original;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        private androidx.compose.ui.text.b substitution;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        private boolean isShowingSubstitution;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        private f38 layoutCache;

        public TextSubstitutionValue(androidx.compose.ui.text.b bVar, androidx.compose.ui.text.b bVar2, boolean z, f38 f38Var) {
            this.original = bVar;
            this.substitution = bVar2;
            this.isShowingSubstitution = z;
            this.layoutCache = f38Var;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final f38 getLayoutCache() {
            return this.layoutCache;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final androidx.compose.ui.text.b getOriginal() {
            return this.original;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final androidx.compose.ui.text.b getSubstitution() {
            return this.substitution;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getIsShowingSubstitution() {
            return this.isShowingSubstitution;
        }

        public final void e(f38 f38Var) {
            this.layoutCache = f38Var;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextSubstitutionValue)) {
                return false;
            }
            TextSubstitutionValue textSubstitutionValue = (TextSubstitutionValue) other;
            return Intrinsics.e(this.original, textSubstitutionValue.original) && Intrinsics.e(this.substitution, textSubstitutionValue.substitution) && this.isShowingSubstitution == textSubstitutionValue.isShowingSubstitution && Intrinsics.e(this.layoutCache, textSubstitutionValue.layoutCache);
        }

        public final void f(boolean z) {
            this.isShowingSubstitution = z;
        }

        public final void g(androidx.compose.ui.text.b bVar) {
            this.substitution = bVar;
        }

        public int hashCode() {
            int iHashCode = ((((this.original.hashCode() * 31) + this.substitution.hashCode()) * 31) + Boolean.hashCode(this.isShowingSubstitution)) * 31;
            f38 f38Var = this.layoutCache;
            return iHashCode + (f38Var == null ? 0 : f38Var.hashCode());
        }

        public String toString() {
            return "TextSubstitutionValue(original=" + ((Object) this.original) + ", substitution=" + ((Object) this.substitution) + ", isShowingSubstitution=" + this.isShowingSubstitution + ", layoutCache=" + this.layoutCache + ')';
        }

        public /* synthetic */ TextSubstitutionValue(androidx.compose.ui.text.b bVar, androidx.compose.ui.text.b bVar2, boolean z, f38 f38Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(bVar, bVar2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : f38Var);
        }
    }
}
