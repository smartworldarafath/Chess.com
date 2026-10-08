package com.google.inputmethod;

import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.b;
import androidx.compose.ui.text.font.l;
import androidx.compose.ui.text.g;
import androidx.compose.ui.text.h;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001:\u0001?Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J'\u0010&\u001a\u00020%2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020(2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b)\u0010*J\u001f\u0010+\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b+\u0010,J%\u0010-\u001a\u00020\n*\u0004\u0018\u00010%2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0019H\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0019H\u0002¢\u0006\u0004\b1\u00100J\u001d\u00102\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b2\u00103J\u001d\u00105\u001a\u00020\f2\u0006\u00104\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b5\u00106Je\u00107\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0014\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0018\u00010\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b7\u00108J\u0015\u00109\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b9\u0010:J\u0015\u0010;\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b;\u0010:J\u000f\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\b=\u0010>R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010DR\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010DR$\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010P\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010T\u001a\u00020Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR.\u0010\\\u001a\u0004\u0018\u00010U2\b\u0010V\u001a\u0004\u0018\u00010U8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bK\u0010Y\"\u0004\bZ\u0010[R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010V\u001a\u00020\u00048\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b5\u0010]\"\u0004\b^\u0010_R\u0018\u0010a\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010`R\u0018\u0010c\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010bR\u0018\u0010e\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010dR\u0016\u0010f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010DR\u0016\u0010g\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010DR\u001c\u0010j\u001a\b\u0018\u00010hR\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010iR(\u0010p\u001a\u00020k8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b-\u0010S\u0012\u0004\bo\u00100\u001a\u0004\bl\u0010m\"\u0004\bn\u0010\u001bR\u0018\u0010r\u001a\u00060hR\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bN\u0010qR\u0011\u0010t\u001a\u00020%8F¢\u0006\u0006\u001a\u0004\bW\u0010sR\u0013\u0010u\u001a\u0004\u0018\u00010%8F¢\u0006\u0006\u001a\u0004\bR\u0010s¨\u0006v"}, d2 = {"Lcom/google/android/f38;", "", "Landroidx/compose/ui/text/b;", "text", "Landroidx/compose/ui/text/y;", "style", "Landroidx/compose/ui/text/font/l$b;", "fontFamilyResolver", "Lcom/google/android/uyc;", "overflow", "", "softWrap", "", "maxLines", "minLines", "", "Landroidx/compose/ui/text/b$d;", "Lcom/google/android/v99;", "placeholders", "Lcom/google/android/eqc;", "autoSize", "<init>", "(Landroidx/compose/ui/text/b;Landroidx/compose/ui/text/y;Landroidx/compose/ui/text/font/l$b;IZIILjava/util/List;Lcom/google/android/eqc;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lcom/google/android/hn6;", "op", "", "t", "(J)V", "Lcom/google/android/kx1;", "constraints", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "z", "(JLandroidx/compose/ui/unit/LayoutDirection;)J", "finalConstraints", "Landroidx/compose/ui/text/g;", "multiParagraph", "Lcom/google/android/vxc;", "x", "(Landroidx/compose/ui/unit/LayoutDirection;JLandroidx/compose/ui/text/g;)Lcom/google/android/vxc;", "Landroidx/compose/ui/text/h;", "v", "(Landroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/text/h;", "m", "(JLandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/text/g;", "s", "(Lcom/google/android/vxc;JLandroidx/compose/ui/unit/LayoutDirection;)Z", "o", "()V", "p", "n", "(JLandroidx/compose/ui/unit/LayoutDirection;)Z", "width", "l", "(ILandroidx/compose/ui/unit/LayoutDirection;)I", "y", "(Landroidx/compose/ui/text/b;Landroidx/compose/ui/text/y;Landroidx/compose/ui/text/font/l$b;IZIILjava/util/List;Lcom/google/android/eqc;)V", "q", "(Landroidx/compose/ui/unit/LayoutDirection;)I", "r", "", "toString", "()Ljava/lang/String;", "a", "Landroidx/compose/ui/text/b;", "b", "Landroidx/compose/ui/text/font/l$b;", "c", "I", "d", "Z", "e", "f", "g", "Ljava/util/List;", "h", "Lcom/google/android/eqc;", "Lcom/google/android/nw7;", "i", "Lcom/google/android/nw7;", "mMinLinesConstrainer", "Lcom/google/android/gx5;", "j", "J", "lastDensity", "Lcom/google/android/f43;", "value", "k", "Lcom/google/android/f43;", "()Lcom/google/android/f43;", "u", "(Lcom/google/android/f43;)V", "density", "Landroidx/compose/ui/text/y;", "w", "(Landroidx/compose/ui/text/y;)V", "Landroidx/compose/ui/text/h;", "paragraphIntrinsics", "Landroidx/compose/ui/unit/LayoutDirection;", "intrinsicsLayoutDirection", "Lcom/google/android/vxc;", "layoutCache", "cachedIntrinsicHeightInputWidth", "cachedIntrinsicHeight", "Lcom/google/android/f38$a;", "Lcom/google/android/f38$a;", "_textAutoSizeLayoutScope", "", "getHistoryFlag$foundation", "()J", "setHistoryFlag$foundation", "getHistoryFlag$foundation$annotations", "historyFlag", "()Lcom/google/android/f38$a;", "fontSizeSearchScope", "()Lcom/google/android/vxc;", "textLayoutResult", "layoutOrNull", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f38 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private b text;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private l.b fontFamilyResolver;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int overflow;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean softWrap;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int maxLines;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int minLines;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private List<b.Range<Placeholder>> placeholders;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private eqc autoSize;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private nw7 mMinLinesConstrainer;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private long lastDensity;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private f43 density;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private TextStyle style;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private h paragraphIntrinsics;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private LayoutDirection intrinsicsLayoutDirection;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private TextLayoutResult layoutCache;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private int cachedIntrinsicHeightInputWidth;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private int cachedIntrinsicHeight;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private a _textAutoSizeLayoutScope;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private long historyFlag;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000e\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR(\u0010\u0015\u001a\u0004\u0018\u00010\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/google/android/f38$a;", "Lcom/google/android/fqc;", "<init>", "(Lcom/google/android/f38;)V", "Lcom/google/android/kx1;", "constraints", "Landroidx/compose/ui/text/b;", "text", "Lcom/google/android/b0d;", "fontSize", "Lcom/google/android/vxc;", "H1", "(JLandroidx/compose/ui/text/b;J)Lcom/google/android/vxc;", "", "T1", "(J)F", "value", "a", "Lcom/google/android/vxc;", "b", "()Lcom/google/android/vxc;", "lastLayoutResult", "getDensity", "()F", "density", "w2", "fontScale", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class a implements fqc {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private TextLayoutResult lastLayoutResult;

        public a() {
        }

        @Override // com.google.inputmethod.fqc
        public TextLayoutResult H1(long constraints, b text, long fontSize) {
            long jZ;
            TextStyle textStyle = f38.this.style;
            long jB = b0d.j(fontSize) ? g38.b(f38.this.style.l(), fontSize) : fontSize;
            if (!b0d.e(jB, f38.this.style.l())) {
                f38 f38Var = f38.this;
                f38Var.w(TextStyle.c(f38Var.style, 0L, jB, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null));
            }
            if (f38.this.minLines > 1) {
                f38 f38Var2 = f38.this;
                LayoutDirection layoutDirection = f38Var2.intrinsicsLayoutDirection;
                Intrinsics.g(layoutDirection);
                jZ = f38Var2.z(constraints, layoutDirection);
            } else {
                jZ = constraints;
            }
            f38 f38Var3 = f38.this;
            LayoutDirection layoutDirection2 = f38Var3.intrinsicsLayoutDirection;
            Intrinsics.g(layoutDirection2);
            g gVarM = f38Var3.m(jZ, layoutDirection2);
            f38 f38Var4 = f38.this;
            LayoutDirection layoutDirection3 = f38Var4.intrinsicsLayoutDirection;
            Intrinsics.g(layoutDirection3);
            TextLayoutResult textLayoutResultX = f38Var4.x(layoutDirection3, jZ, gVarM);
            this.lastLayoutResult = textLayoutResultX;
            f38.this.w(textStyle);
            return textLayoutResultX;
        }

        @Override // com.google.inputmethod.f43
        public float T1(long j) {
            if (!b0d.j(j)) {
                return x2(U(j));
            }
            if (b0d.j(f38.this.style.l())) {
                throw new IllegalStateException("InternalAutoSize -> toPx(): Cannot convert Em to Px when style.fontSize is Em\nDeclare the composable's style.fontSize with Sp units instead.");
            }
            if (b0d.e(f38.this.style.l(), b0d.INSTANCE.a())) {
                throw new IllegalStateException("InternalAutoSize -> toPx(): Cannot convert Em to Px when style.fontSize is not set. Please specify a font size.");
            }
            return T1(f38.this.style.l()) * b0d.h(j);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextLayoutResult getLastLayoutResult() {
            return this.lastLayoutResult;
        }

        @Override // com.google.inputmethod.f43
        public float getDensity() {
            f43 density = f38.this.getDensity();
            Intrinsics.g(density);
            return density.getDensity();
        }

        @Override // com.google.inputmethod.hm4
        /* JADX INFO: renamed from: w2 */
        public float getFontScale() {
            f43 density = f38.this.getDensity();
            Intrinsics.g(density);
            return density.getFontScale();
        }
    }

    public /* synthetic */ f38(b bVar, TextStyle textStyle, l.b bVar2, int i, boolean z, int i2, int i3, List list, eqc eqcVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, textStyle, bVar2, i, z, i2, i3, list, eqcVar);
    }

    private final a i() {
        if (this._textAutoSizeLayoutScope == null) {
            this._textAutoSizeLayoutScope = new a();
        }
        a aVar = this._textAutoSizeLayoutScope;
        Intrinsics.g(aVar);
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g m(long constraints, LayoutDirection layoutDirection) {
        h hVarV = v(layoutDirection);
        return new g(hVarV, oo6.a(constraints, this.softWrap, this.overflow, hVarV.b()), oo6.b(this.softWrap, this.overflow, this.maxLines), this.overflow, null);
    }

    private final void o() {
        this.paragraphIntrinsics = null;
        this.layoutCache = null;
        this.cachedIntrinsicHeight = -1;
        this.cachedIntrinsicHeightInputWidth = -1;
        this._textAutoSizeLayoutScope = null;
    }

    private final void p() {
        t(hn6.INSTANCE.d());
        this.paragraphIntrinsics = null;
        this.layoutCache = null;
        this.cachedIntrinsicHeight = -1;
        this.cachedIntrinsicHeightInputWidth = -1;
    }

    private final boolean s(TextLayoutResult textLayoutResult, long j, LayoutDirection layoutDirection) {
        if (textLayoutResult == null || textLayoutResult.getMultiParagraph().getIntrinsics().c() || layoutDirection != textLayoutResult.getLayoutInput().getLayoutDirection()) {
            return true;
        }
        if (kx1.f(j, textLayoutResult.getLayoutInput().getConstraints())) {
            return false;
        }
        return kx1.l(j) != kx1.l(textLayoutResult.getLayoutInput().getConstraints()) || kx1.n(j) != kx1.n(textLayoutResult.getLayoutInput().getConstraints()) || ((float) kx1.k(j)) < textLayoutResult.getMultiParagraph().getHeight() || textLayoutResult.getMultiParagraph().getDidExceedMaxLines();
    }

    private final void t(long op) {
        this.historyFlag = op | (this.historyFlag << 2);
    }

    private final h v(LayoutDirection layoutDirection) {
        h hVar = this.paragraphIntrinsics;
        if (hVar == null || layoutDirection != this.intrinsicsLayoutDirection || hVar.c()) {
            this.intrinsicsLayoutDirection = layoutDirection;
            b bVar = this.text;
            TextStyle textStyleD = vzc.d(this.style, layoutDirection);
            f43 f43Var = this.density;
            Intrinsics.g(f43Var);
            l.b bVar2 = this.fontFamilyResolver;
            List<b.Range<Placeholder>> listP = this.placeholders;
            if (listP == null) {
                listP = m.p();
            }
            hVar = new h(bVar, textStyleD, listP, f43Var, bVar2);
        }
        this.paragraphIntrinsics = hVar;
        return hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(TextStyle textStyle) {
        boolean zG = textStyle.G(this.style);
        this.style = textStyle;
        if (zG) {
            return;
        }
        p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextLayoutResult x(LayoutDirection layoutDirection, long finalConstraints, g multiParagraph) {
        float fMin = Math.min(multiParagraph.getIntrinsics().b(), multiParagraph.getWidth());
        b bVar = this.text;
        TextStyle textStyle = this.style;
        List<b.Range<Placeholder>> listP = this.placeholders;
        if (listP == null) {
            listP = m.p();
        }
        int i = this.maxLines;
        boolean z = this.softWrap;
        int i2 = this.overflow;
        f43 f43Var = this.density;
        Intrinsics.g(f43Var);
        return new TextLayoutResult(new TextLayoutInput(bVar, textStyle, listP, i, z, i2, f43Var, layoutDirection, this.fontFamilyResolver, finalConstraints, (DefaultConstructorMarker) null), multiParagraph, nx1.d(finalConstraints, q16.c((((long) csc.a(fMin)) << 32) | (((long) csc.a(multiParagraph.getHeight())) & 4294967295L))), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long z(long constraints, LayoutDirection layoutDirection) {
        nw7.Companion companion = nw7.INSTANCE;
        nw7 nw7Var = this.mMinLinesConstrainer;
        TextStyle textStyle = this.style;
        f43 f43Var = this.density;
        Intrinsics.g(f43Var);
        nw7 nw7VarA = companion.a(nw7Var, layoutDirection, textStyle, f43Var, this.fontFamilyResolver);
        this.mMinLinesConstrainer = nw7VarA;
        return nw7VarA.c(constraints, this.minLines);
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final f43 getDensity() {
        return this.density;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final TextLayoutResult getLayoutCache() {
        return this.layoutCache;
    }

    public final TextLayoutResult k() {
        TextLayoutResult textLayoutResult = this.layoutCache;
        if (textLayoutResult != null) {
            return textLayoutResult;
        }
        throw new IllegalStateException("Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: " + this);
    }

    public final int l(int width, LayoutDirection layoutDirection) {
        int i = this.cachedIntrinsicHeightInputWidth;
        int i2 = this.cachedIntrinsicHeight;
        if (width == i && i != -1) {
            return i2;
        }
        long jA = nx1.a(0, width, 0, Integer.MAX_VALUE);
        if (this.minLines > 1) {
            jA = z(jA, layoutDirection);
        }
        int iE = kotlin.ranges.g.e(csc.a(m(jA, layoutDirection).getHeight()), kx1.m(jA));
        this.cachedIntrinsicHeightInputWidth = width;
        this.cachedIntrinsicHeight = iE;
        return iE;
    }

    public final boolean n(long constraints, LayoutDirection layoutDirection) {
        t(hn6.INSTANCE.a());
        long jZ = this.minLines > 1 ? z(constraints, layoutDirection) : constraints;
        if (!s(this.layoutCache, jZ, layoutDirection)) {
            TextLayoutResult textLayoutResult = this.layoutCache;
            Intrinsics.g(textLayoutResult);
            if (kx1.f(jZ, textLayoutResult.getLayoutInput().getConstraints())) {
                return false;
            }
            TextLayoutResult textLayoutResult2 = this.layoutCache;
            Intrinsics.g(textLayoutResult2);
            this.layoutCache = x(layoutDirection, jZ, textLayoutResult2.getMultiParagraph());
            return true;
        }
        if (this.autoSize != null) {
            this.intrinsicsLayoutDirection = layoutDirection;
            long jL = this.style.l();
            eqc eqcVar = this.autoSize;
            Intrinsics.g(eqcVar);
            long jA = eqcVar.a(i(), constraints, this.text);
            if (b0d.j(jA)) {
                jA = g38.b(jL, jA);
            }
            long j = jA;
            TextLayoutResult lastLayoutResult = i().getLastLayoutResult();
            if (lastLayoutResult != null && b0d.e(j, lastLayoutResult.getLayoutInput().getStyle().l()) && uyc.g(lastLayoutResult.getLayoutInput().getOverflow(), this.overflow)) {
                this.layoutCache = lastLayoutResult;
                return true;
            }
            w(TextStyle.c(this.style, 0L, j, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null));
        }
        this.layoutCache = x(layoutDirection, jZ, m(jZ, layoutDirection));
        return true;
    }

    public final int q(LayoutDirection layoutDirection) {
        return csc.a(v(layoutDirection).b());
    }

    public final int r(LayoutDirection layoutDirection) {
        return csc.a(v(layoutDirection).a());
    }

    public String toString() {
        TextLayoutInput layoutInput;
        StringBuilder sb = new StringBuilder();
        sb.append("MultiParagraphLayoutCache(textLayoutResult=");
        Object objA = "null";
        sb.append(this.layoutCache != null ? "<TextLayoutResult>" : "null");
        sb.append(", lastDensity=");
        sb.append((Object) gx5.h(this.lastDensity));
        sb.append(", history=");
        sb.append(this.historyFlag);
        sb.append(", constraints=");
        TextLayoutResult textLayoutResult = this.layoutCache;
        if (textLayoutResult != null && (layoutInput = textLayoutResult.getLayoutInput()) != null) {
            objA = kx1.a(layoutInput.getConstraints());
        }
        sb.append(objA);
        sb.append(')');
        return sb.toString();
    }

    public final void u(f43 f43Var) {
        f43 f43Var2 = this.density;
        long jD = f43Var != null ? gx5.d(f43Var) : gx5.INSTANCE.a();
        if (f43Var2 == null) {
            this.density = f43Var;
            this.lastDensity = jD;
        } else if (f43Var == null || !gx5.e(this.lastDensity, jD)) {
            this.density = f43Var;
            this.lastDensity = jD;
            t(hn6.INSTANCE.b());
            o();
        }
    }

    public final void y(b text, TextStyle style, l.b fontFamilyResolver, int overflow, boolean softWrap, int maxLines, int minLines, List<b.Range<Placeholder>> placeholders, eqc autoSize) {
        this.text = text;
        w(style);
        this.fontFamilyResolver = fontFamilyResolver;
        this.overflow = overflow;
        this.softWrap = softWrap;
        this.maxLines = maxLines;
        this.minLines = minLines;
        this.placeholders = placeholders;
        this.autoSize = autoSize;
        t(hn6.INSTANCE.c());
        o();
    }

    private f38(b bVar, TextStyle textStyle, l.b bVar2, int i, boolean z, int i2, int i3, List<b.Range<Placeholder>> list, eqc eqcVar) {
        this.text = bVar;
        this.fontFamilyResolver = bVar2;
        this.overflow = i;
        this.softWrap = z;
        this.maxLines = i2;
        this.minLines = i3;
        this.placeholders = list;
        this.autoSize = eqcVar;
        this.lastDensity = gx5.INSTANCE.a();
        this.style = textStyle;
        this.cachedIntrinsicHeightInputWidth = -1;
        this.cachedIntrinsicHeight = -1;
    }
}
