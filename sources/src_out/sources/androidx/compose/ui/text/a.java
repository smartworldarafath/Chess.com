package androidx.compose.ui.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.text.a;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import com.google.inputmethod.Shadow;
import com.google.inputmethod.ax5;
import com.google.inputmethod.b19;
import com.google.inputmethod.cpc;
import com.google.inputmethod.d27;
import com.google.inputmethod.dle;
import com.google.inputmethod.ea9;
import com.google.inputmethod.ele;
import com.google.inputmethod.fm;
import com.google.inputmethod.gba;
import com.google.inputmethod.hm;
import com.google.inputmethod.jba;
import com.google.inputmethod.km;
import com.google.inputmethod.kx1;
import com.google.inputmethod.lkb;
import com.google.inputmethod.nwc;
import com.google.inputmethod.po;
import com.google.inputmethod.qu0;
import com.google.inputmethod.rxc;
import com.google.inputmethod.tsb;
import com.google.inputmethod.uyc;
import com.google.inputmethod.w41;
import com.google.inputmethod.wrc;
import com.google.inputmethod.xi;
import com.google.inputmethod.zyc;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010 \n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r*\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u0014*\u00020\u00112\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ[\u0010&\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00042\b\b\u0002\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\u00042\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J'\u00107\u001a\u0002062\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u0002002\u0006\u00109\u001a\u00020\u0004H\u0016¢\u0006\u0004\b:\u0010;J)\u0010@\u001a\u00020\u00192\u0006\u0010<\u001a\u0002062\u0006\u0010>\u001a\u00020=2\b\b\u0001\u0010?\u001a\u00020\u0004H\u0016¢\u0006\u0004\b@\u0010AJ\u001f\u0010E\u001a\u00020D2\u0006\u0010B\u001a\u00020\u00042\u0006\u0010C\u001a\u00020\u0004H\u0016¢\u0006\u0004\bE\u0010FJ\u0017\u0010G\u001a\u0002002\u0006\u00109\u001a\u00020\u0004H\u0016¢\u0006\u0004\bG\u0010;J\u0017\u0010H\u001a\u0002062\u0006\u00109\u001a\u00020\u0004H\u0016¢\u0006\u0004\bH\u0010IJ\u0017\u0010K\u001a\u00020(2\u0006\u0010J\u001a\u00020\u0004H\u0016¢\u0006\u0004\bK\u0010LJ\u0017\u0010M\u001a\u00020(2\u0006\u0010J\u001a\u00020\u0004H\u0016¢\u0006\u0004\bM\u0010LJ\u0017\u0010N\u001a\u00020(2\u0006\u0010J\u001a\u00020\u0004H\u0016¢\u0006\u0004\bN\u0010LJ\u0017\u0010O\u001a\u00020(2\u0006\u0010J\u001a\u00020\u0004H\u0016¢\u0006\u0004\bO\u0010LJ\u0017\u0010P\u001a\u00020(2\u0006\u0010J\u001a\u00020\u0004H\u0016¢\u0006\u0004\bP\u0010LJ\u0017\u0010Q\u001a\u00020(2\u0006\u0010J\u001a\u00020\u0004H\u0016¢\u0006\u0004\bQ\u0010LJ\u0017\u0010R\u001a\u00020\u00042\u0006\u0010J\u001a\u00020\u0004H\u0016¢\u0006\u0004\bR\u0010SJ\u001f\u0010U\u001a\u00020\u00042\u0006\u0010J\u001a\u00020\u00042\u0006\u0010T\u001a\u00020\u0014H\u0016¢\u0006\u0004\bU\u0010VJ\u0017\u0010W\u001a\u00020\u00142\u0006\u0010J\u001a\u00020\u0004H\u0016¢\u0006\u0004\bW\u0010XJ\u0017\u0010Y\u001a\u00020\u00042\u0006\u00109\u001a\u00020\u0004H\u0016¢\u0006\u0004\bY\u0010SJ\u001f\u0010[\u001a\u00020(2\u0006\u00109\u001a\u00020\u00042\u0006\u0010Z\u001a\u00020\u0014H\u0016¢\u0006\u0004\b[\u0010\\J\u0017\u0010^\u001a\u00020]2\u0006\u00109\u001a\u00020\u0004H\u0016¢\u0006\u0004\b^\u0010_J\u0017\u0010`\u001a\u00020]2\u0006\u00109\u001a\u00020\u0004H\u0016¢\u0006\u0004\b`\u0010_JE\u0010k\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010b\u001a\u00020a2\b\u0010d\u001a\u0004\u0018\u00010c2\b\u0010f\u001a\u0004\u0018\u00010e2\b\u0010h\u001a\u0004\u0018\u00010g2\u0006\u0010j\u001a\u00020iH\u0016¢\u0006\u0004\bk\u0010lJM\u0010p\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010n\u001a\u00020m2\u0006\u0010o\u001a\u00020(2\b\u0010d\u001a\u0004\u0018\u00010c2\b\u0010f\u001a\u0004\u0018\u00010e2\b\u0010h\u001a\u0004\u0018\u00010g2\u0006\u0010j\u001a\u00020iH\u0016¢\u0006\u0004\bp\u0010qR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\br\u0010s\u001a\u0004\bt\u0010uR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bv\u0010O\u001a\u0004\bw\u0010xR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b^\u0010O\u001a\u0004\by\u0010xR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bN\u0010z\u001a\u0004\b{\u0010|R\u0014\u0010~\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010}R%\u0010%\u001a\u00020$8\u0000X\u0081\u0004¢\u0006\u0017\n\u0005\b\u007f\u0010\u0080\u0001\u0012\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R'\u0010\u0089\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u0001000\u0085\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b.\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0017\u0010\u008c\u0001\u001a\u00020(8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0017\u0010\u008e\u0001\u001a\u00020(8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008d\u0001\u0010\u008b\u0001R\u0016\u0010\u008f\u0001\u001a\u00020(8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bv\u0010\u008b\u0001R\u0016\u0010\u0090\u0001\u001a\u00020(8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\br\u0010\u008b\u0001R\u0016\u0010\u0091\u0001\u001a\u00020(8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u008b\u0001R\u0017\u0010\u0093\u0001\u001a\u00020(8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0092\u0001\u0010\u008b\u0001R\u0017\u0010\u0096\u0001\u001a\u00020\u00148VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0016\u0010\u0098\u0001\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0097\u0001\u0010xR \u0010\u009d\u0001\u001a\u00030\u0099\u00018@X\u0081\u0004¢\u0006\u0010\u0012\u0006\b\u009c\u0001\u0010\u0084\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001¨\u0006\u009e\u0001"}, d2 = {"Landroidx/compose/ui/text/a;", "Lcom/google/android/b19;", "Lcom/google/android/hm;", "paragraphIntrinsics", "", "maxLines", "Lcom/google/android/uyc;", "overflow", "Lcom/google/android/kx1;", "constraints", "<init>", "(Lcom/google/android/hm;IIJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lcom/google/android/rxc;", "", "Lcom/google/android/lkb;", "K", "(Lcom/google/android/rxc;)[Lcom/google/android/lkb;", "Landroid/text/Spanned;", "Ljava/lang/Class;", "clazz", "", "M", "(Landroid/text/Spanned;Ljava/lang/Class;)Z", "Lcom/google/android/w41;", "canvas", "", "N", "(Lcom/google/android/w41;)V", "alignment", "justificationMode", "Landroid/text/TextUtils$TruncateAt;", "ellipsize", "hyphens", "breakStrategy", "lineBreakStyle", "lineBreakWordStyle", "", "charSequence", "G", "(IILandroid/text/TextUtils$TruncateAt;IIIIILjava/lang/CharSequence;)Lcom/google/android/rxc;", "", "vertical", "l", "(F)I", "Lcom/google/android/rn8;", "position", "g", "(J)I", "Lcom/google/android/gba;", "rect", "Lcom/google/android/jwc;", "granularity", "Lcom/google/android/nwc;", "inclusionStrategy", "Landroidx/compose/ui/text/x;", "p", "(Lcom/google/android/gba;ILcom/google/android/nwc;)J", "offset", "C", "(I)Lcom/google/android/gba;", "range", "", "array", "arrayStart", "n", "(J[FI)V", "start", "end", "Landroidx/compose/ui/graphics/Path;", "w", "(II)Landroidx/compose/ui/graphics/Path;", "r", "e", "(I)J", "lineIndex", "m", "(I)F", "u", "d", "I", "o", "k", "h", "(I)I", "visibleEnd", "i", "(IZ)I", "s", "(I)Z", "A", "usePrimaryDirection", "x", "(IZ)F", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "c", "(I)Landroidx/compose/ui/text/style/ResolvedTextDirection;", "B", "Lcom/google/android/ei1;", "color", "Lcom/google/android/nkb;", "shadow", "Lcom/google/android/wrc;", "textDecoration", "Landroidx/compose/ui/graphics/drawscope/b;", "drawStyle", "Landroidx/compose/ui/graphics/e;", "blendMode", "q", "(Lcom/google/android/w41;JLcom/google/android/nkb;Lcom/google/android/wrc;Landroidx/compose/ui/graphics/drawscope/b;I)V", "Lcom/google/android/qu0;", "brush", "alpha", "j", "(Lcom/google/android/w41;Lcom/google/android/qu0;FLcom/google/android/nkb;Lcom/google/android/wrc;Landroidx/compose/ui/graphics/drawscope/b;I)V", "a", "Lcom/google/android/hm;", "getParagraphIntrinsics", "()Lcom/google/android/hm;", "b", "getMaxLines", "()I", "getOverflow-gIe3tQ8", "J", "getConstraints-msEJaDk", "()J", "Lcom/google/android/rxc;", "layout", "f", "Ljava/lang/CharSequence;", "getCharSequence$ui_text", "()Ljava/lang/CharSequence;", "getCharSequence$ui_text$annotations", "()V", "", "Ljava/util/List;", "D", "()Ljava/util/List;", "placeholderRects", "getWidth", "()F", "width", "getHeight", "height", "maxIntrinsicWidth", "minIntrinsicWidth", "firstBaseline", "z", "lastBaseline", "v", "()Z", "didExceedMaxLines", "t", "lineCount", "Lcom/google/android/po;", "L", "()Lcom/google/android/po;", "getTextPaint$ui_text$annotations", "textPaint", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements b19 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final hm paragraphIntrinsics;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int maxLines;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int overflow;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long constraints;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final rxc layout;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final CharSequence charSequence;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final List<gba> placeholderRects;

    public /* synthetic */ a(hm hmVar, int i, int i2, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(hmVar, i, i2, j);
    }

    private final rxc G(int alignment, int justificationMode, TextUtils.TruncateAt ellipsize, int maxLines, int hyphens, int breakStrategy, int lineBreakStyle, int lineBreakWordStyle, CharSequence charSequence) {
        return new rxc(charSequence, getWidth(), L(), alignment, ellipsize, this.paragraphIntrinsics.getTextDirectionHeuristic(), 1.0f, 0.0f, fm.b(this.paragraphIntrinsics.getStyle()), true, maxLines, breakStrategy, lineBreakStyle, lineBreakWordStyle, hyphens, justificationMode, null, null, this.paragraphIntrinsics.getLayoutIntrinsics(), 196736, null);
    }

    static /* synthetic */ rxc H(a aVar, int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence, int i8, Object obj) {
        return aVar.G(i, i2, truncateAt, i3, i4, i5, i6, i7, (i8 & 256) != 0 ? aVar.charSequence : charSequence);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean J(nwc nwcVar, RectF rectF, RectF rectF2) {
        return nwcVar.a(jba.f(rectF), jba.f(rectF2));
    }

    private final lkb[] K(rxc rxcVar) {
        if (!(rxcVar.G() instanceof Spanned)) {
            return null;
        }
        CharSequence charSequenceG = rxcVar.G();
        Intrinsics.h(charSequenceG, "null cannot be cast to non-null type android.text.Spanned");
        if (!M((Spanned) charSequenceG, lkb.class)) {
            return null;
        }
        CharSequence charSequenceG2 = rxcVar.G();
        Intrinsics.h(charSequenceG2, "null cannot be cast to non-null type android.text.Spanned");
        return (lkb[]) ((Spanned) charSequenceG2).getSpans(0, rxcVar.G().length(), lkb.class);
    }

    private final boolean M(Spanned spanned, Class<?> cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    private final void N(w41 canvas) {
        Canvas canvasD = xi.d(canvas);
        if (v()) {
            canvasD.save();
            canvasD.clipRect(0.0f, 0.0f, getWidth(), getHeight());
        }
        this.layout.M(canvasD);
        if (v()) {
            canvasD.restore();
        }
    }

    @Override // com.google.inputmethod.b19
    public int A(int offset) {
        return this.layout.q(offset);
    }

    @Override // com.google.inputmethod.b19
    public ResolvedTextDirection B(int offset) {
        return this.layout.L(offset) ? ResolvedTextDirection.Rtl : ResolvedTextDirection.Ltr;
    }

    @Override // com.google.inputmethod.b19
    public gba C(int offset) {
        boolean z = false;
        if (offset >= 0 && offset < this.charSequence.length()) {
            z = true;
        }
        if (!z) {
            ax5.a("offset(" + offset + ") is out of bounds [0," + this.charSequence.length() + ')');
        }
        RectF rectFC = this.layout.c(offset);
        return new gba(rectFC.left, rectFC.top, rectFC.right, rectFC.bottom);
    }

    @Override // com.google.inputmethod.b19
    public List<gba> D() {
        return this.placeholderRects;
    }

    public float I(int lineIndex) {
        return this.layout.k(lineIndex);
    }

    public final po L() {
        return this.paragraphIntrinsics.getTextPaint();
    }

    @Override // com.google.inputmethod.b19
    public float a() {
        return this.paragraphIntrinsics.a();
    }

    @Override // com.google.inputmethod.b19
    public float b() {
        return this.paragraphIntrinsics.b();
    }

    @Override // com.google.inputmethod.b19
    public ResolvedTextDirection c(int offset) {
        return this.layout.z(this.layout.q(offset)) == 1 ? ResolvedTextDirection.Ltr : ResolvedTextDirection.Rtl;
    }

    @Override // com.google.inputmethod.b19
    public float d(int lineIndex) {
        return this.layout.w(lineIndex);
    }

    @Override // com.google.inputmethod.b19
    public long e(int offset) {
        ele eleVarI = this.layout.I();
        return zyc.b(dle.b(eleVarI, offset), dle.a(eleVarI, offset));
    }

    @Override // com.google.inputmethod.b19
    public float f() {
        return I(0);
    }

    @Override // com.google.inputmethod.b19
    public int g(long position) {
        return this.layout.y(this.layout.r((int) Float.intBitsToFloat((int) (4294967295L & position))), Float.intBitsToFloat((int) (position >> 32)));
    }

    @Override // com.google.inputmethod.b19
    public float getHeight() {
        return this.layout.f();
    }

    @Override // com.google.inputmethod.b19
    public float getWidth() {
        return kx1.l(this.constraints);
    }

    @Override // com.google.inputmethod.b19
    public int h(int lineIndex) {
        return this.layout.v(lineIndex);
    }

    @Override // com.google.inputmethod.b19
    public int i(int lineIndex, boolean visibleEnd) {
        return visibleEnd ? this.layout.x(lineIndex) : this.layout.p(lineIndex);
    }

    @Override // com.google.inputmethod.b19
    public void j(w41 canvas, qu0 brush, float alpha, Shadow shadow, wrc textDecoration, androidx.compose.ui.graphics.drawscope.b drawStyle, int blendMode) {
        int backingBlendMode = L().getBackingBlendMode();
        po poVarL = L();
        float width = getWidth();
        poVarL.f(brush, tsb.d((((long) Float.floatToRawIntBits(getHeight())) & 4294967295L) | (Float.floatToRawIntBits(width) << 32)), alpha);
        poVarL.j(shadow);
        poVarL.k(textDecoration);
        poVarL.i(drawStyle);
        poVarL.e(blendMode);
        N(canvas);
        L().e(backingBlendMode);
    }

    @Override // com.google.inputmethod.b19
    public float k(int lineIndex) {
        return this.layout.s(lineIndex);
    }

    @Override // com.google.inputmethod.b19
    public int l(float vertical) {
        return this.layout.r((int) vertical);
    }

    @Override // com.google.inputmethod.b19
    public float m(int lineIndex) {
        return this.layout.t(lineIndex);
    }

    @Override // com.google.inputmethod.b19
    public void n(long range, float[] array, int arrayStart) {
        this.layout.a(x.l(range), x.k(range), array, arrayStart);
    }

    @Override // com.google.inputmethod.b19
    public float o(int lineIndex) {
        return this.layout.l(lineIndex);
    }

    @Override // com.google.inputmethod.b19
    public long p(gba rect, int granularity, final nwc inclusionStrategy) {
        int[] iArrC = this.layout.C(jba.c(rect), km.r(granularity), new Function2() { // from class: com.google.android.em
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(a.J(inclusionStrategy, (RectF) obj, (RectF) obj2));
            }
        });
        return iArrC == null ? x.INSTANCE.a() : zyc.b(iArrC[0], iArrC[1]);
    }

    @Override // com.google.inputmethod.b19
    public void q(w41 canvas, long color, Shadow shadow, wrc textDecoration, androidx.compose.ui.graphics.drawscope.b drawStyle, int blendMode) {
        int backingBlendMode = L().getBackingBlendMode();
        po poVarL = L();
        poVarL.h(color);
        poVarL.j(shadow);
        poVarL.k(textDecoration);
        poVarL.i(drawStyle);
        poVarL.e(blendMode);
        N(canvas);
        L().e(backingBlendMode);
    }

    @Override // com.google.inputmethod.b19
    public gba r(int offset) {
        if (!(offset >= 0 && offset <= this.charSequence.length())) {
            ax5.a("offset(" + offset + ") is out of bounds [0," + this.charSequence.length() + ']');
        }
        float fB = rxc.B(this.layout, offset, false, 2, null);
        int iQ = this.layout.q(offset);
        return new gba(fB, this.layout.w(iQ), fB, this.layout.l(iQ));
    }

    @Override // com.google.inputmethod.b19
    public boolean s(int lineIndex) {
        return this.layout.K(lineIndex);
    }

    @Override // com.google.inputmethod.b19
    public int t() {
        return this.layout.getLineCount();
    }

    @Override // com.google.inputmethod.b19
    public float u(int lineIndex) {
        return this.layout.u(lineIndex);
    }

    @Override // com.google.inputmethod.b19
    public boolean v() {
        return this.layout.getDidExceedMaxLines();
    }

    @Override // com.google.inputmethod.b19
    public Path w(int start, int end) {
        if (!(start >= 0 && start <= end && end <= this.charSequence.length())) {
            ax5.a("start(" + start + ") or end(" + end + ") is out of range [0.." + this.charSequence.length() + "], or start > end!");
        }
        android.graphics.Path path = new android.graphics.Path();
        this.layout.F(start, end, path);
        return androidx.compose.ui.graphics.d.c(path);
    }

    @Override // com.google.inputmethod.b19
    public float x(int offset, boolean usePrimaryDirection) {
        return usePrimaryDirection ? rxc.B(this.layout, offset, false, 2, null) : rxc.E(this.layout, offset, false, 2, null);
    }

    @Override // com.google.inputmethod.b19
    public float z() {
        return I(t() - 1);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:105:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:106:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:107:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:108:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:110:0x0303  */
    /* JADX WARN: Code duplicated, block: B:111:0x0308  */
    /* JADX WARN: Code duplicated, block: B:120:0x02a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0101  */
    /* JADX WARN: Code duplicated, block: B:54:0x0187  */
    /* JADX WARN: Code duplicated, block: B:57:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:59:0x01c7 A[LOOP:0: B:58:0x01c5->B:59:0x01c7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:62:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:63:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:65:0x020b  */
    /* JADX WARN: Code duplicated, block: B:67:0x0221  */
    /* JADX WARN: Code duplicated, block: B:68:0x0223  */
    /* JADX WARN: Code duplicated, block: B:74:0x023d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0246  */
    /* JADX WARN: Code duplicated, block: B:78:0x0248  */
    /* JADX WARN: Code duplicated, block: B:82:0x024f  */
    /* JADX WARN: Instruction removed from duplicated block: B:57:0x01c3, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:63:0x01f4, please report this as an issue */
    private a(hm hmVar, int i, int i2, long j) {
        TextUtils.TruncateAt truncateAt;
        rxc rxcVarH;
        int i3;
        a aVar;
        int i4;
        lkb[] lkbVarArrK;
        CharSequence charSequence;
        Spanned spanned;
        ArrayList arrayList;
        int i5;
        List<gba> listP;
        int spanEnd;
        int iQ;
        boolean z;
        boolean z2;
        boolean z3;
        gba gbaVar;
        float fD;
        int iD;
        float fA;
        int iD2;
        rxc rxcVar;
        float fK;
        int iB;
        float fW;
        float fB;
        float fK2;
        int i6;
        this.paragraphIntrinsics = hmVar;
        this.maxLines = i;
        this.overflow = i2;
        this.constraints = j;
        if (!(kx1.m(j) == 0 && kx1.n(j) == 0)) {
            ax5.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (!(i >= 1)) {
            ax5.a("maxLines should be greater than 0");
        }
        TextStyle style = hmVar.getStyle();
        uyc.Companion companion = uyc.INSTANCE;
        CharSequence charSequenceJ = km.l(style, uyc.g(i2, companion.b())) ? km.j(hmVar.getCharSequence()) : hmVar.getCharSequence();
        this.charSequence = charSequenceJ;
        int iM = km.m(style.z());
        boolean zK = cpc.k(style.z(), cpc.INSTANCE.c());
        int iO = km.o(style.v().getHyphens());
        int iN = km.n(d27.h(style.r()));
        int iP = km.p(d27.i(style.r()));
        int iQ2 = km.q(d27.j(style.r()));
        if (uyc.g(i2, companion.b())) {
            truncateAt = TextUtils.TruncateAt.END;
        } else {
            if (!uyc.g(i2, companion.c())) {
                if (uyc.g(i2, companion.d())) {
                    truncateAt = TextUtils.TruncateAt.START;
                } else {
                    truncateAt = null;
                }
                TextUtils.TruncateAt truncateAt2 = truncateAt;
                CharSequence charSequence2 = charSequenceJ;
                rxcVarH = H(this, iM, zK, truncateAt2, i, iO, iN, iP, iQ2, null, 256, null);
                if (Build.VERSION.SDK_INT < 35 || L().getLetterSpacing() == 0.0f || (!(uyc.g(i2, companion.d()) || uyc.g(i2, companion.c())) || rxcVarH.n(0) <= 0)) {
                    i3 = i;
                } else {
                    int iO2 = rxcVarH.o(0);
                    i3 = i;
                    rxcVarH = G(iM, zK, truncateAt2, i3, iO, iN, iP, iQ2, TextUtils.concat(charSequence2.subSequence(0, iO2), "…", charSequence2.subSequence(rxcVarH.n(0) + iO2, charSequence2.length())));
                }
                if (uyc.g(i2, companion.b()) || rxcVarH.f() <= kx1.k(j) || i3 <= 1) {
                    aVar = this;
                    i4 = 2;
                    aVar.layout = rxcVarH;
                } else {
                    int iK = km.k(rxcVarH, kx1.k(j));
                    if (iK < 0 || iK == i3) {
                        aVar = this;
                        i4 = 2;
                    } else {
                        i4 = 2;
                        aVar = this;
                        rxcVarH = H(aVar, iM, zK, truncateAt2, kotlin.ranges.g.e(iK, 1), iO, iN, iP, iQ2, null, 256, null);
                    }
                    aVar.layout = rxcVarH;
                }
                aVar.L().f(style.g(), tsb.d((((long) Float.floatToRawIntBits(aVar.getHeight())) & 4294967295L) | (((long) Float.floatToRawIntBits(aVar.getWidth())) << 32)), style.d());
                lkbVarArrK = aVar.K(aVar.layout);
                if (lkbVarArrK != null) {
                    for (lkb lkbVar : lkbVarArrK) {
                        lkbVar.c(tsb.d((((long) Float.floatToRawIntBits(aVar.getHeight())) & 4294967295L) | (((long) Float.floatToRawIntBits(aVar.getWidth())) << 32)));
                    }
                }
                charSequence = aVar.charSequence;
                if (charSequence instanceof Spanned) {
                    spanned = (Spanned) charSequence;
                    Object[] spans = spanned.getSpans(0, charSequence.length(), ea9.class);
                    arrayList = new ArrayList(spans.length);
                    for (Object obj : spans) {
                        ea9 ea9Var = (ea9) obj;
                        int spanStart = spanned.getSpanStart(ea9Var);
                        spanEnd = spanned.getSpanEnd(ea9Var);
                        iQ = aVar.layout.q(spanStart);
                        if (iQ >= aVar.maxLines) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (aVar.layout.n(iQ) > 0 || spanEnd <= aVar.layout.v(iQ) + aVar.layout.o(iQ)) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (spanEnd > aVar.layout.p(iQ)) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z2 && !z3 && !z) {
                            boolean z4 = aVar.layout.z(iQ) == 1;
                            boolean zL = aVar.layout.L(spanStart);
                            if (!z4 || zL) {
                                if (z4 && zL) {
                                    fA = aVar.layout.D(spanStart, false);
                                    iD2 = ea9Var.d();
                                } else if (zL) {
                                    fA = aVar.layout.A(spanStart, false);
                                    iD2 = ea9Var.d();
                                } else {
                                    fD = aVar.layout.D(spanStart, false);
                                    iD = ea9Var.d();
                                }
                                fD = fA - iD2;
                                rxcVar = aVar.layout;
                                switch (ea9Var.getVerticalAlign()) {
                                    case 0:
                                        fK = rxcVar.k(iQ);
                                        iB = ea9Var.b();
                                        fW = fK - iB;
                                        gbaVar = new gba(fD, fW, fA, ea9Var.b() + fW);
                                        break;
                                    case 1:
                                        fW = rxcVar.w(iQ);
                                        gbaVar = new gba(fD, fW, fA, ea9Var.b() + fW);
                                        break;
                                    case 2:
                                        fK = rxcVar.l(iQ);
                                        iB = ea9Var.b();
                                        fW = fK - iB;
                                        gbaVar = new gba(fD, fW, fA, ea9Var.b() + fW);
                                        break;
                                    case 3:
                                        fW = ((rxcVar.w(iQ) + rxcVar.l(iQ)) - ea9Var.b()) / i4;
                                        gbaVar = new gba(fD, fW, fA, ea9Var.b() + fW);
                                        break;
                                    case 4:
                                        fB = ea9Var.a().ascent;
                                        fK2 = rxcVar.k(iQ);
                                        fW = fB + fK2;
                                        gbaVar = new gba(fD, fW, fA, ea9Var.b() + fW);
                                        break;
                                    case 5:
                                        fW = (ea9Var.a().descent + rxcVar.k(iQ)) - ea9Var.b();
                                        gbaVar = new gba(fD, fW, fA, ea9Var.b() + fW);
                                        break;
                                    case 6:
                                        Paint.FontMetricsInt fontMetricsIntA = ea9Var.a();
                                        fB = ((fontMetricsIntA.ascent + fontMetricsIntA.descent) - ea9Var.b()) / i4;
                                        fK2 = rxcVar.k(iQ);
                                        fW = fB + fK2;
                                        gbaVar = new gba(fD, fW, fA, ea9Var.b() + fW);
                                        break;
                                    default:
                                        throw new IllegalStateException("unexpected verticalAlignment");
                                }
                            } else {
                                fD = aVar.layout.A(spanStart, false);
                                iD = ea9Var.d();
                            }
                            fA = iD + fD;
                            rxcVar = aVar.layout;
                            switch (ea9Var.getVerticalAlign()) {
                                case 0:
                                    fK = rxcVar.k(iQ);
                                    iB = ea9Var.b();
                                    fW = fK - iB;
                                    gbaVar = new gba(fD, fW, fA, ea9Var.b() + fW);
                                    break;
                                case 1:
                                    fW = rxcVar.w(iQ);
                                    gbaVar = new gba(fD, fW, fA, ea9Var.b() + fW);
                                    break;
                                case 2:
                                    fK = rxcVar.l(iQ);
                                    iB = ea9Var.b();
                                    fW = fK - iB;
                                    gbaVar = new gba(fD, fW, fA, ea9Var.b() + fW);
                                    break;
                                case 3:
                                    fW = ((rxcVar.w(iQ) + rxcVar.l(iQ)) - ea9Var.b()) / i4;
                                    gbaVar = new gba(fD, fW, fA, ea9Var.b() + fW);
                                    break;
                                case 4:
                                    fB = ea9Var.a().ascent;
                                    fK2 = rxcVar.k(iQ);
                                    fW = fB + fK2;
                                    gbaVar = new gba(fD, fW, fA, ea9Var.b() + fW);
                                    break;
                                case 5:
                                    fW = (ea9Var.a().descent + rxcVar.k(iQ)) - ea9Var.b();
                                    gbaVar = new gba(fD, fW, fA, ea9Var.b() + fW);
                                    break;
                                case 6:
                                    Paint.FontMetricsInt fontMetricsIntA2 = ea9Var.a();
                                    fB = ((fontMetricsIntA2.ascent + fontMetricsIntA2.descent) - ea9Var.b()) / i4;
                                    fK2 = rxcVar.k(iQ);
                                    fW = fB + fK2;
                                    gbaVar = new gba(fD, fW, fA, ea9Var.b() + fW);
                                    break;
                                default:
                                    throw new IllegalStateException("unexpected verticalAlignment");
                            }
                        }
                        arrayList.add(gbaVar);
                    }
                    listP = arrayList;
                } else {
                    listP = kotlin.collections.m.p();
                }
                aVar.placeholderRects = listP;
            }
            truncateAt = TextUtils.TruncateAt.MIDDLE;
        }
        TextUtils.TruncateAt truncateAt3 = truncateAt;
        CharSequence charSequence3 = charSequenceJ;
        rxcVarH = H(this, iM, zK, truncateAt3, i, iO, iN, iP, iQ2, null, 256, null);
        if (Build.VERSION.SDK_INT < 35) {
            i3 = i;
        } else {
            i3 = i;
        }
        if (uyc.g(i2, companion.b())) {
            aVar = this;
            i4 = 2;
            aVar.layout = rxcVarH;
        } else {
            aVar = this;
            i4 = 2;
            aVar.layout = rxcVarH;
        }
        aVar.L().f(style.g(), tsb.d((((long) Float.floatToRawIntBits(aVar.getHeight())) & 4294967295L) | (((long) Float.floatToRawIntBits(aVar.getWidth())) << 32)), style.d());
        lkbVarArrK = aVar.K(aVar.layout);
        if (lkbVarArrK != null) {
            while (i6 < r2) {
                lkbVar.c(tsb.d((((long) Float.floatToRawIntBits(aVar.getHeight())) & 4294967295L) | (((long) Float.floatToRawIntBits(aVar.getWidth())) << 32)));
            }
        }
        charSequence = aVar.charSequence;
        if (charSequence instanceof Spanned) {
            listP = kotlin.collections.m.p();
        } else {
            spanned = (Spanned) charSequence;
            Object[] spans2 = spanned.getSpans(0, charSequence.length(), ea9.class);
            arrayList = new ArrayList(spans2.length);
            while (i5 < r4) {
                ea9 ea9Var2 = (ea9) obj;
                int spanStart2 = spanned.getSpanStart(ea9Var2);
                spanEnd = spanned.getSpanEnd(ea9Var2);
                iQ = aVar.layout.q(spanStart2);
                if (iQ >= aVar.maxLines) {
                    z = true;
                } else {
                    z = false;
                }
                if (aVar.layout.n(iQ) > 0) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                if (spanEnd > aVar.layout.p(iQ)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                gbaVar = z2 ? null : null;
                arrayList.add(gbaVar);
            }
            listP = arrayList;
        }
        aVar.placeholderRects = listP;
    }
}
