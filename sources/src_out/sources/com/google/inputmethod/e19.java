package com.google.inputmethod;

import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.b;
import androidx.compose.ui.text.font.l;
import androidx.compose.ui.text.h;
import androidx.compose.ui.text.k;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0013H\u0002¢\u0006\u0004\b!\u0010\"J\u001d\u0010#\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b#\u0010 J\u001d\u0010%\u001a\u00020\f2\u0006\u0010$\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b%\u0010&JE\u0010'\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b'\u0010(J\u001f\u0010*\u001a\u00020)2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b-\u0010.J\u0015\u0010/\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b/\u00100J\u0015\u00101\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b1\u00100J\u000f\u00102\u001a\u00020\u0002H\u0016¢\u0006\u0004\b2\u00103R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010;R\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010;R\u0016\u0010@\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010?R.\u0010G\u001a\u0004\u0018\u00010A2\b\u0010B\u001a\u0004\u0018\u00010A8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010C\u001a\u0004\b4\u0010D\"\u0004\bE\u0010FR$\u0010L\u001a\u0004\u0018\u00010)8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u0010H\u001a\u0004\b<\u0010I\"\u0004\bJ\u0010KR\"\u0010P\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b/\u0010=\u001a\u0004\b6\u0010M\"\u0004\bN\u0010OR\"\u0010T\u001a\u00020Q8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010?\u001a\u0004\b8\u0010R\"\u0004\bS\u0010\u0015R\u0018\u0010W\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010VR\u0018\u0010Y\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010XR\u0018\u0010[\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010ZR\u0016\u0010\\\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010?R\u0016\u0010]\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010;R\u0016\u0010^\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010;R(\u0010d\u001a\u00020_8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b`\u0010?\u0012\u0004\bc\u0010\"\u001a\u0004\ba\u0010R\"\u0004\bb\u0010\u0015R\u0014\u0010f\u001a\u00020\u00138@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b:\u0010e¨\u0006g"}, d2 = {"Lcom/google/android/e19;", "", "", "text", "Landroidx/compose/ui/text/y;", "style", "Landroidx/compose/ui/text/font/l$b;", "fontFamilyResolver", "Lcom/google/android/uyc;", "overflow", "", "softWrap", "", "maxLines", "minLines", "<init>", "(Ljava/lang/String;Landroidx/compose/ui/text/y;Landroidx/compose/ui/text/font/l$b;IZIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lcom/google/android/hn6;", "op", "", "m", "(J)V", "Lcom/google/android/kx1;", "constraints", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "r", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/y;)J", "Lcom/google/android/d19;", "o", "(Landroidx/compose/ui/unit/LayoutDirection;)Lcom/google/android/d19;", "l", "(JLandroidx/compose/ui/unit/LayoutDirection;)Z", "i", "()V", "h", "width", "f", "(ILandroidx/compose/ui/unit/LayoutDirection;)I", "q", "(Ljava/lang/String;Landroidx/compose/ui/text/y;Landroidx/compose/ui/text/font/l$b;IZII)V", "Lcom/google/android/b19;", "g", "(JLandroidx/compose/ui/unit/LayoutDirection;)Lcom/google/android/b19;", "Lcom/google/android/vxc;", "p", "(Landroidx/compose/ui/text/y;)Lcom/google/android/vxc;", "k", "(Landroidx/compose/ui/unit/LayoutDirection;)I", "j", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "Landroidx/compose/ui/text/y;", "c", "Landroidx/compose/ui/text/font/l$b;", "d", "I", "e", "Z", "Lcom/google/android/gx5;", "J", "lastDensity", "Lcom/google/android/f43;", "value", "Lcom/google/android/f43;", "()Lcom/google/android/f43;", "n", "(Lcom/google/android/f43;)V", "density", "Lcom/google/android/b19;", "()Lcom/google/android/b19;", "setParagraph$foundation", "(Lcom/google/android/b19;)V", "paragraph", "()Z", "setDidOverflow$foundation", "(Z)V", "didOverflow", "Lcom/google/android/q16;", "()J", "setLayoutSize-ozmzZPI$foundation", "layoutSize", "Lcom/google/android/nw7;", "Lcom/google/android/nw7;", "mMinLinesConstrainer", "Lcom/google/android/d19;", "paragraphIntrinsics", "Landroidx/compose/ui/unit/LayoutDirection;", "intrinsicsLayoutDirection", "prevConstraints", "cachedIntrinsicHeightInputWidth", "cachedIntrinsicHeight", "", "s", "getHistoryFlag$foundation", "setHistoryFlag$foundation", "getHistoryFlag$foundation$annotations", "historyFlag", "()Lkotlin/Unit;", "observeFontChanges", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e19 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private String text;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private TextStyle style;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private l.b fontFamilyResolver;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int overflow;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean softWrap;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int maxLines;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int minLines;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private long lastDensity;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private f43 density;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private b19 paragraph;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private boolean didOverflow;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private long layoutSize;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private nw7 mMinLinesConstrainer;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private d19 paragraphIntrinsics;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private LayoutDirection intrinsicsLayoutDirection;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private long prevConstraints;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private int cachedIntrinsicHeightInputWidth;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private int cachedIntrinsicHeight;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private long historyFlag;

    public /* synthetic */ e19(String str, TextStyle textStyle, l.b bVar, int i, boolean z, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textStyle, bVar, i, z, i2, i3);
    }

    private final void i() {
        this.paragraph = null;
        this.paragraphIntrinsics = null;
        this.intrinsicsLayoutDirection = null;
        this.cachedIntrinsicHeightInputWidth = -1;
        this.cachedIntrinsicHeight = -1;
        this.prevConstraints = kx1.INSTANCE.c(0, 0);
        long j = 0;
        this.layoutSize = q16.c((j & 4294967295L) | (j << 32));
        this.didOverflow = false;
    }

    private final boolean l(long constraints, LayoutDirection layoutDirection) {
        d19 d19Var;
        b19 b19Var = this.paragraph;
        if (b19Var == null || (d19Var = this.paragraphIntrinsics) == null || d19Var.c() || layoutDirection != this.intrinsicsLayoutDirection) {
            return true;
        }
        if (kx1.f(constraints, this.prevConstraints)) {
            return false;
        }
        return kx1.l(constraints) != kx1.l(this.prevConstraints) || kx1.n(constraints) != kx1.n(this.prevConstraints) || ((float) kx1.k(constraints)) < b19Var.getHeight() || b19Var.v();
    }

    private final void m(long op) {
        this.historyFlag = op | (this.historyFlag << 2);
    }

    private final d19 o(LayoutDirection layoutDirection) {
        d19 d19VarA = this.paragraphIntrinsics;
        if (d19VarA == null || layoutDirection != this.intrinsicsLayoutDirection || d19VarA.c()) {
            this.intrinsicsLayoutDirection = layoutDirection;
            String str = this.text;
            TextStyle textStyleD = vzc.d(this.style, layoutDirection);
            List listP = m.p();
            f43 f43Var = this.density;
            Intrinsics.g(f43Var);
            d19VarA = k.a(str, textStyleD, listP, f43Var, this.fontFamilyResolver, m.p());
        }
        this.paragraphIntrinsics = d19VarA;
        return d19VarA;
    }

    private final long r(long constraints, LayoutDirection layoutDirection, TextStyle style) {
        nw7.Companion companion = nw7.INSTANCE;
        nw7 nw7Var = this.mMinLinesConstrainer;
        f43 f43Var = this.density;
        Intrinsics.g(f43Var);
        nw7 nw7VarA = companion.a(nw7Var, layoutDirection, style, f43Var, this.fontFamilyResolver);
        this.mMinLinesConstrainer = nw7VarA;
        return nw7VarA.c(constraints, this.minLines);
    }

    static /* synthetic */ long s(e19 e19Var, long j, LayoutDirection layoutDirection, TextStyle textStyle, int i, Object obj) {
        if ((i & 4) != 0) {
            textStyle = e19Var.style;
        }
        return e19Var.r(j, layoutDirection, textStyle);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final f43 getDensity() {
        return this.density;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getDidOverflow() {
        return this.didOverflow;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getLayoutSize() {
        return this.layoutSize;
    }

    public final Unit d() {
        d19 d19Var = this.paragraphIntrinsics;
        if (d19Var != null) {
            d19Var.c();
        }
        return Unit.a;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final b19 getParagraph() {
        return this.paragraph;
    }

    public final int f(int width, LayoutDirection layoutDirection) {
        e19 e19Var;
        LayoutDirection layoutDirection2;
        int i = this.cachedIntrinsicHeightInputWidth;
        int i2 = this.cachedIntrinsicHeight;
        if (width == i && i != -1) {
            return i2;
        }
        long jA = nx1.a(0, width, 0, Integer.MAX_VALUE);
        if (this.minLines > 1) {
            e19Var = this;
            layoutDirection2 = layoutDirection;
            jA = s(e19Var, jA, layoutDirection2, null, 4, null);
        } else {
            e19Var = this;
            layoutDirection2 = layoutDirection;
        }
        int iE = g.e(csc.a(g(jA, layoutDirection2).getHeight()), kx1.m(jA));
        e19Var.cachedIntrinsicHeightInputWidth = width;
        e19Var.cachedIntrinsicHeight = iE;
        return iE;
    }

    public final b19 g(long constraints, LayoutDirection layoutDirection) {
        d19 d19VarO = o(layoutDirection);
        return androidx.compose.ui.text.l.c(d19VarO, oo6.a(constraints, this.softWrap, this.overflow, d19VarO.b()), oo6.b(this.softWrap, this.overflow, this.maxLines), this.overflow);
    }

    public final boolean h(long constraints, LayoutDirection layoutDirection) {
        e19 e19Var;
        LayoutDirection layoutDirection2;
        m(hn6.INSTANCE.a());
        boolean z = true;
        if (this.minLines > 1) {
            e19Var = this;
            layoutDirection2 = layoutDirection;
            constraints = s(e19Var, constraints, layoutDirection2, null, 4, null);
        } else {
            e19Var = this;
            layoutDirection2 = layoutDirection;
        }
        boolean z2 = false;
        if (l(constraints, layoutDirection2)) {
            b19 b19VarG = g(constraints, layoutDirection2);
            e19Var.prevConstraints = constraints;
            long jD = nx1.d(constraints, q16.c((((long) csc.a(b19VarG.getWidth())) << 32) | (((long) csc.a(b19VarG.getHeight())) & 4294967295L)));
            e19Var.layoutSize = jD;
            if (!uyc.g(e19Var.overflow, uyc.INSTANCE.e()) && (((int) (jD >> 32)) < b19VarG.getWidth() || ((int) (jD & 4294967295L)) < b19VarG.getHeight())) {
                z2 = true;
            }
            e19Var.didOverflow = z2;
            e19Var.paragraph = b19VarG;
            return true;
        }
        if (!kx1.f(constraints, e19Var.prevConstraints)) {
            b19 b19Var = e19Var.paragraph;
            Intrinsics.g(b19Var);
            long jD2 = nx1.d(constraints, q16.c((((long) csc.a(Math.min(b19Var.b(), b19Var.getWidth()))) << 32) | (((long) csc.a(b19Var.getHeight())) & 4294967295L)));
            e19Var.layoutSize = jD2;
            if (uyc.g(e19Var.overflow, uyc.INSTANCE.e()) || (((int) (jD2 >> 32)) >= b19Var.getWidth() && ((int) (4294967295L & jD2)) >= b19Var.getHeight())) {
                z = false;
            }
            e19Var.didOverflow = z;
            e19Var.prevConstraints = constraints;
        }
        return false;
    }

    public final int j(LayoutDirection layoutDirection) {
        return csc.a(o(layoutDirection).b());
    }

    public final int k(LayoutDirection layoutDirection) {
        return csc.a(o(layoutDirection).a());
    }

    public final void n(f43 f43Var) {
        f43 f43Var2 = this.density;
        long jD = f43Var != null ? gx5.d(f43Var) : gx5.INSTANCE.a();
        if (f43Var2 == null) {
            this.density = f43Var;
            this.lastDensity = jD;
        } else if (f43Var == null || !gx5.e(this.lastDensity, jD)) {
            this.density = f43Var;
            this.lastDensity = jD;
            m(hn6.INSTANCE.b());
            i();
        }
    }

    public final TextLayoutResult p(TextStyle style) {
        f43 f43Var;
        LayoutDirection layoutDirection = this.intrinsicsLayoutDirection;
        if (layoutDirection == null || (f43Var = this.density) == null) {
            return null;
        }
        b bVar = new b(this.text, null, 2, null);
        if (this.paragraph == null || this.paragraphIntrinsics == null) {
            return null;
        }
        long jB = kx1.b(this.prevConstraints & (-8589934589L));
        return new TextLayoutResult(new TextLayoutInput(bVar, style, m.p(), this.maxLines, this.softWrap, this.overflow, f43Var, layoutDirection, this.fontFamilyResolver, jB, (DefaultConstructorMarker) null), new androidx.compose.ui.text.g(new h(bVar, style, m.p(), f43Var, this.fontFamilyResolver), jB, this.maxLines, this.overflow, null), this.layoutSize, null);
    }

    public final void q(String text, TextStyle style, l.b fontFamilyResolver, int overflow, boolean softWrap, int maxLines, int minLines) {
        this.text = text;
        this.style = style;
        this.fontFamilyResolver = fontFamilyResolver;
        this.overflow = overflow;
        this.softWrap = softWrap;
        this.maxLines = maxLines;
        this.minLines = minLines;
        m(hn6.INSTANCE.c());
        i();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ParagraphLayoutCache(paragraph=");
        sb.append(this.paragraph != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        sb.append((Object) gx5.h(this.lastDensity));
        sb.append(", history=");
        sb.append(this.historyFlag);
        sb.append(", constraints=$)");
        return sb.toString();
    }

    private e19(String str, TextStyle textStyle, l.b bVar, int i, boolean z, int i2, int i3) {
        this.text = str;
        this.style = textStyle;
        this.fontFamilyResolver = bVar;
        this.overflow = i;
        this.softWrap = z;
        this.maxLines = i2;
        this.minLines = i3;
        this.lastDensity = gx5.INSTANCE.a();
        long j = 0;
        this.layoutSize = q16.c((j & 4294967295L) | (j << 32));
        this.prevConstraints = kx1.INSTANCE.c(0, 0);
        this.cachedIntrinsicHeightInputWidth = -1;
        this.cachedIntrinsicHeight = -1;
    }
}
