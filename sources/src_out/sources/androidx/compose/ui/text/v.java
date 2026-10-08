package androidx.compose.ui.text;

import androidx.compose.ui.unit.LayoutDirection;
import com.google.inputmethod.Placeholder;
import com.google.inputmethod.TextLayoutResult;
import com.google.inputmethod.f43;
import com.google.inputmethod.kx1;
import com.google.inputmethod.nx1;
import com.google.inputmethod.q16;
import com.google.inputmethod.qyc;
import com.google.inputmethod.sxc;
import com.google.inputmethod.uyc;
import com.google.inputmethod.vzc;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 /2\u00020\u0001:\u0001#B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0087\u0001\u0010 \u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\b2\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00152\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u0012H\u0007¢\u0006\u0004\b \u0010!Jq\u0010#\u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\"2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u0012H\u0007¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010.\u001a\u0004\u0018\u00010+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u00060"}, d2 = {"Landroidx/compose/ui/text/v;", "", "Landroidx/compose/ui/text/font/l$b;", "defaultFontFamilyResolver", "Lcom/google/android/f43;", "defaultDensity", "Landroidx/compose/ui/unit/LayoutDirection;", "defaultLayoutDirection", "", "cacheSize", "<init>", "(Landroidx/compose/ui/text/font/l$b;Lcom/google/android/f43;Landroidx/compose/ui/unit/LayoutDirection;I)V", "Landroidx/compose/ui/text/b;", "text", "Landroidx/compose/ui/text/y;", "style", "Lcom/google/android/uyc;", "overflow", "", "softWrap", "maxLines", "", "Landroidx/compose/ui/text/b$d;", "Lcom/google/android/v99;", "placeholders", "Lcom/google/android/kx1;", "constraints", "layoutDirection", "density", "fontFamilyResolver", "skipCache", "Lcom/google/android/vxc;", "c", "(Landroidx/compose/ui/text/b;Landroidx/compose/ui/text/y;IZILjava/util/List;JLandroidx/compose/ui/unit/LayoutDirection;Lcom/google/android/f43;Landroidx/compose/ui/text/font/l$b;Z)Lcom/google/android/vxc;", "", "a", "(Ljava/lang/String;Landroidx/compose/ui/text/y;IZIJLandroidx/compose/ui/unit/LayoutDirection;Lcom/google/android/f43;Landroidx/compose/ui/text/font/l$b;Z)Lcom/google/android/vxc;", "Landroidx/compose/ui/text/font/l$b;", "b", "Lcom/google/android/f43;", "Landroidx/compose/ui/unit/LayoutDirection;", "d", "I", "Lcom/google/android/sxc;", "e", "Lcom/google/android/sxc;", "textLayoutCache", "f", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final androidx.compose.ui.text.font.l.b defaultFontFamilyResolver;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final f43 defaultDensity;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final LayoutDirection defaultLayoutDirection;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int cacheSize;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final sxc textLayoutCache;

    /* JADX INFO: renamed from: androidx.compose.ui.text.v$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/v$a;", "", "<init>", "()V", "Landroidx/compose/ui/text/u;", "textLayoutInput", "Lcom/google/android/vxc;", "b", "(Landroidx/compose/ui/text/u;)Lcom/google/android/vxc;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final TextLayoutResult b(TextLayoutInput textLayoutInput) {
            h hVar = new h(textLayoutInput.getText(), vzc.d(textLayoutInput.getStyle(), textLayoutInput.getLayoutDirection()), textLayoutInput.g(), textLayoutInput.getDensity(), textLayoutInput.getFontFamilyResolver());
            int iN = kx1.n(textLayoutInput.getConstraints());
            int iL = ((textLayoutInput.getSoftWrap() || qyc.b(textLayoutInput.getOverflow())) && kx1.h(textLayoutInput.getConstraints())) ? kx1.l(textLayoutInput.getConstraints()) : Integer.MAX_VALUE;
            int maxLines = (textLayoutInput.getSoftWrap() || !qyc.b(textLayoutInput.getOverflow())) ? textLayoutInput.getMaxLines() : 1;
            if (iN != iL) {
                iL = kotlin.ranges.g.o(l.d(hVar.b()), iN, iL);
            }
            g gVar = new g(hVar, kx1.INSTANCE.b(0, iL, 0, kx1.k(textLayoutInput.getConstraints())), maxLines, textLayoutInput.getOverflow(), null);
            return new TextLayoutResult(textLayoutInput, gVar, nx1.d(textLayoutInput.getConstraints(), q16.c((((long) ((int) Math.ceil(gVar.getWidth()))) << 32) | (((long) ((int) Math.ceil(gVar.getHeight()))) & 4294967295L))), null);
        }

        private Companion() {
        }
    }

    public v(androidx.compose.ui.text.font.l.b bVar, f43 f43Var, LayoutDirection layoutDirection, int i) {
        this.defaultFontFamilyResolver = bVar;
        this.defaultDensity = f43Var;
        this.defaultLayoutDirection = layoutDirection;
        this.cacheSize = i;
        this.textLayoutCache = i > 0 ? new sxc(i) : null;
    }

    public static /* synthetic */ TextLayoutResult b(v vVar, String str, TextStyle textStyle, int i, boolean z, int i2, long j, LayoutDirection layoutDirection, f43 f43Var, androidx.compose.ui.text.font.l.b bVar, boolean z2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            textStyle = TextStyle.INSTANCE.a();
        }
        TextStyle textStyle2 = textStyle;
        if ((i3 & 4) != 0) {
            i = uyc.INSTANCE.a();
        }
        return vVar.a(str, textStyle2, i, (i3 & 8) != 0 ? true : z, (i3 & 16) != 0 ? Integer.MAX_VALUE : i2, (i3 & 32) != 0 ? nx1.b(0, 0, 0, 0, 15, null) : j, (i3 & 64) != 0 ? vVar.defaultLayoutDirection : layoutDirection, (i3 & 128) != 0 ? vVar.defaultDensity : f43Var, (i3 & 256) != 0 ? vVar.defaultFontFamilyResolver : bVar, (i3 & 512) != 0 ? false : z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TextLayoutResult d(v vVar, b bVar, TextStyle textStyle, int i, boolean z, int i2, List list, long j, LayoutDirection layoutDirection, f43 f43Var, androidx.compose.ui.text.font.l.b bVar2, boolean z2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            textStyle = TextStyle.INSTANCE.a();
        }
        return vVar.c(bVar, textStyle, (i3 & 4) != 0 ? uyc.INSTANCE.a() : i, (i3 & 8) != 0 ? true : z, (i3 & 16) != 0 ? Integer.MAX_VALUE : i2, (i3 & 32) != 0 ? kotlin.collections.m.p() : list, (i3 & 64) != 0 ? nx1.b(0, 0, 0, 0, 15, null) : j, (i3 & 128) != 0 ? vVar.defaultLayoutDirection : layoutDirection, (i3 & 256) != 0 ? vVar.defaultDensity : f43Var, (i3 & 512) != 0 ? vVar.defaultFontFamilyResolver : bVar2, (i3 & 1024) != 0 ? false : z2);
    }

    public final TextLayoutResult a(String text, TextStyle style, int overflow, boolean softWrap, int maxLines, long constraints, LayoutDirection layoutDirection, f43 density, androidx.compose.ui.text.font.l.b fontFamilyResolver, boolean skipCache) {
        return d(this, new b(text, null, 2, null), style, overflow, softWrap, maxLines, null, constraints, layoutDirection, density, fontFamilyResolver, skipCache, 32, null);
    }

    public final TextLayoutResult c(b text, TextStyle style, int overflow, boolean softWrap, int maxLines, List<b.Range<Placeholder>> placeholders, long constraints, LayoutDirection layoutDirection, f43 density, androidx.compose.ui.text.font.l.b fontFamilyResolver, boolean skipCache) {
        sxc sxcVar;
        TextLayoutInput textLayoutInput = new TextLayoutInput(text, style, placeholders, maxLines, softWrap, overflow, density, layoutDirection, fontFamilyResolver, constraints, (DefaultConstructorMarker) null);
        TextLayoutResult textLayoutResultA = (skipCache || (sxcVar = this.textLayoutCache) == null) ? null : sxcVar.a(textLayoutInput);
        if (textLayoutResultA != null) {
            return textLayoutResultA.a(textLayoutInput, nx1.d(constraints, q16.c((((long) l.d(textLayoutResultA.getMultiParagraph().getWidth())) << 32) | (((long) l.d(textLayoutResultA.getMultiParagraph().getHeight())) & 4294967295L))));
        }
        TextLayoutResult textLayoutResultB = INSTANCE.b(textLayoutInput);
        sxc sxcVar2 = this.textLayoutCache;
        if (sxcVar2 != null) {
            sxcVar2.b(textLayoutInput, textLayoutResultB);
        }
        return textLayoutResultB;
    }

    public /* synthetic */ v(androidx.compose.ui.text.font.l.b bVar, f43 f43Var, LayoutDirection layoutDirection, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, f43Var, layoutDirection, (i2 & 8) != 0 ? 8 : i);
    }
}
