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

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u0000 #2\u00020\u0001:\u0001%Be\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001f\u0010 J)\u0010#\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b/\u0010.\u001a\u0004\b1\u00100R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b5\u0010.\u001a\u0004\b6\u00100R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b%\u00108R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b)\u0010;R#\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00118\u0006¢\u0006\f\n\u0004\b3\u0010<\u001a\u0004\b9\u0010=R$\u0010D\u001a\u0004\u0018\u00010>8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR$\u0010I\u001a\u0004\u0018\u00010\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010 R\u0014\u0010J\u001a\u00020>8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u0010AR\u0011\u0010K\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b-\u00100¨\u0006L"}, d2 = {"Lcom/google/android/asc;", "", "Landroidx/compose/ui/text/b;", "text", "Landroidx/compose/ui/text/y;", "style", "", "maxLines", "minLines", "", "softWrap", "Lcom/google/android/uyc;", "overflow", "Lcom/google/android/f43;", "density", "Landroidx/compose/ui/text/font/l$b;", "fontFamilyResolver", "", "Landroidx/compose/ui/text/b$d;", "Lcom/google/android/v99;", "placeholders", "<init>", "(Landroidx/compose/ui/text/b;Landroidx/compose/ui/text/y;IIZILcom/google/android/f43;Landroidx/compose/ui/text/font/l$b;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lcom/google/android/kx1;", "constraints", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/text/g;", "n", "(JLandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/text/g;", "", "m", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "Lcom/google/android/vxc;", "prevResult", "l", "(JLandroidx/compose/ui/unit/LayoutDirection;Lcom/google/android/vxc;)Lcom/google/android/vxc;", "a", "Landroidx/compose/ui/text/b;", "k", "()Landroidx/compose/ui/text/b;", "b", "Landroidx/compose/ui/text/y;", "j", "()Landroidx/compose/ui/text/y;", "c", "I", "d", "()I", "e", "Z", "i", "()Z", "f", "g", "Lcom/google/android/f43;", "()Lcom/google/android/f43;", "h", "Landroidx/compose/ui/text/font/l$b;", "()Landroidx/compose/ui/text/font/l$b;", "Ljava/util/List;", "()Ljava/util/List;", "Landroidx/compose/ui/text/h;", "Landroidx/compose/ui/text/h;", "getParagraphIntrinsics$foundation", "()Landroidx/compose/ui/text/h;", "setParagraphIntrinsics$foundation", "(Landroidx/compose/ui/text/h;)V", "paragraphIntrinsics", "Landroidx/compose/ui/unit/LayoutDirection;", "getIntrinsicsLayoutDirection$foundation", "()Landroidx/compose/ui/unit/LayoutDirection;", "setIntrinsicsLayoutDirection$foundation", "intrinsicsLayoutDirection", "nonNullIntrinsics", "maxIntrinsicWidth", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class asc {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final b text;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextStyle style;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int maxLines;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int minLines;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean softWrap;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int overflow;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final f43 density;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final l.b fontFamilyResolver;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final List<b.Range<Placeholder>> placeholders;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private h paragraphIntrinsics;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private LayoutDirection intrinsicsLayoutDirection;

    public /* synthetic */ asc(b bVar, TextStyle textStyle, int i, int i2, boolean z, int i3, f43 f43Var, l.b bVar2, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, textStyle, i, i2, z, i3, f43Var, bVar2, list);
    }

    private final h f() {
        h hVar = this.paragraphIntrinsics;
        if (hVar != null) {
            return hVar;
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }

    private final g n(long constraints, LayoutDirection layoutDirection) {
        m(layoutDirection);
        int iN = kx1.n(constraints);
        int iL = ((this.softWrap || uyc.g(this.overflow, uyc.INSTANCE.b())) && kx1.h(constraints)) ? kx1.l(constraints) : Integer.MAX_VALUE;
        int i = (this.softWrap || !uyc.g(this.overflow, uyc.INSTANCE.b())) ? this.maxLines : 1;
        if (iN != iL) {
            iL = kotlin.ranges.g.o(c(), iN, iL);
        }
        return new g(f(), kx1.INSTANCE.b(0, iL, 0, kx1.k(constraints)), i, this.overflow, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final f43 getDensity() {
        return this.density;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final l.b getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    public final int c() {
        return csc.a(f().b());
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getMaxLines() {
        return this.maxLines;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getMinLines() {
        return this.minLines;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getOverflow() {
        return this.overflow;
    }

    public final List<b.Range<Placeholder>> h() {
        return this.placeholders;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getSoftWrap() {
        return this.softWrap;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final TextStyle getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final b getText() {
        return this.text;
    }

    public final TextLayoutResult l(long constraints, LayoutDirection layoutDirection, TextLayoutResult prevResult) {
        if (prevResult != null && uxc.a(prevResult, this.text, this.style, this.placeholders, this.maxLines, this.softWrap, this.overflow, this.density, layoutDirection, this.fontFamilyResolver, constraints)) {
            return prevResult.a(new TextLayoutInput(prevResult.getLayoutInput().getText(), this.style, prevResult.getLayoutInput().g(), prevResult.getLayoutInput().getMaxLines(), prevResult.getLayoutInput().getSoftWrap(), prevResult.getLayoutInput().getOverflow(), prevResult.getLayoutInput().getDensity(), prevResult.getLayoutInput().getLayoutDirection(), prevResult.getLayoutInput().getFontFamilyResolver(), constraints, (DefaultConstructorMarker) null), nx1.d(constraints, q16.c((((long) csc.a(prevResult.getMultiParagraph().getHeight())) & 4294967295L) | (((long) csc.a(prevResult.getMultiParagraph().getWidth())) << 32))));
        }
        g gVarN = n(constraints, layoutDirection);
        return new TextLayoutResult(new TextLayoutInput(this.text, this.style, this.placeholders, this.maxLines, this.softWrap, this.overflow, this.density, layoutDirection, this.fontFamilyResolver, constraints, (DefaultConstructorMarker) null), gVarN, nx1.d(constraints, q16.c((((long) csc.a(gVarN.getHeight())) & 4294967295L) | (((long) csc.a(gVarN.getWidth())) << 32))), null);
    }

    public final void m(LayoutDirection layoutDirection) {
        h hVar = this.paragraphIntrinsics;
        if (hVar == null || layoutDirection != this.intrinsicsLayoutDirection || hVar.c()) {
            this.intrinsicsLayoutDirection = layoutDirection;
            hVar = new h(this.text, vzc.d(this.style, layoutDirection), this.placeholders, this.density, this.fontFamilyResolver);
        }
        this.paragraphIntrinsics = hVar;
    }

    private asc(b bVar, TextStyle textStyle, int i, int i2, boolean z, int i3, f43 f43Var, l.b bVar2, List<b.Range<Placeholder>> list) {
        this.text = bVar;
        this.style = textStyle;
        this.maxLines = i;
        this.minLines = i2;
        this.softWrap = z;
        this.overflow = i3;
        this.density = f43Var;
        this.fontFamilyResolver = bVar2;
        this.placeholders = list;
        if (!(i > 0)) {
            cx5.a("no maxLines");
        }
        if (!(i2 > 0)) {
            cx5.a("no minLines");
        }
        if (i2 <= i) {
            return;
        }
        cx5.a("minLines greater than maxLines");
    }

    public /* synthetic */ asc(b bVar, TextStyle textStyle, int i, int i2, boolean z, int i3, f43 f43Var, l.b bVar2, List list, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, textStyle, (i4 & 4) != 0 ? Integer.MAX_VALUE : i, (i4 & 8) != 0 ? 1 : i2, (i4 & 16) != 0 ? true : z, (i4 & 32) != 0 ? uyc.INSTANCE.a() : i3, f43Var, bVar2, (i4 & 256) != 0 ? m.p() : list, null);
    }
}
