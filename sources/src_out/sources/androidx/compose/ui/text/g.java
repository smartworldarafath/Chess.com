package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.text.ParagraphInfo;
import androidx.compose.ui.text.g;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import com.google.inputmethod.ParagraphIntrinsicInfo;
import com.google.inputmethod.Shadow;
import com.google.inputmethod.ax5;
import com.google.inputmethod.b19;
import com.google.inputmethod.bm;
import com.google.inputmethod.e38;
import com.google.inputmethod.gba;
import com.google.inputmethod.kx1;
import com.google.inputmethod.nwc;
import com.google.inputmethod.nx1;
import com.google.inputmethod.qu0;
import com.google.inputmethod.w41;
import com.google.inputmethod.wrc;
import com.google.inputmethod.zyc;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u000fJM\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 JU\u0010%\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020!2\b\b\u0002\u0010$\u001a\u00020#2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b%\u0010&J\u001d\u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0006¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u00020\u00062\u0006\u0010,\u001a\u00020#¢\u0006\u0004\b-\u0010.J\u0015\u00101\u001a\u00020\u00062\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J%\u0010:\u001a\u0002092\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207¢\u0006\u0004\b:\u0010;J\u0015\u0010<\u001a\u0002032\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b<\u0010=J'\u0010B\u001a\u00020?2\u0006\u0010>\u001a\u0002092\u0006\u0010@\u001a\u00020?2\b\b\u0001\u0010A\u001a\u00020\u0006¢\u0006\u0004\bB\u0010CJ\u001d\u0010F\u001a\u00020#2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010E\u001a\u00020D¢\u0006\u0004\bF\u0010GJ\u0015\u0010I\u001a\u00020H2\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\bI\u0010JJ\u0015\u0010K\u001a\u00020H2\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\bK\u0010JJ\u0015\u0010L\u001a\u0002092\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\bL\u0010MJ\u0015\u0010N\u001a\u0002032\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\bN\u0010=J\u0015\u0010O\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\bO\u0010PJ\u0015\u0010Q\u001a\u00020#2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\bQ\u0010RJ\u0015\u0010S\u001a\u00020#2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\bS\u0010RJ\u0015\u0010T\u001a\u00020#2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\bT\u0010RJ\u0015\u0010U\u001a\u00020#2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\bU\u0010RJ\u0015\u0010V\u001a\u00020#2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\bV\u0010RJ\u0015\u0010W\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\bW\u0010PJ\u001f\u0010Y\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010X\u001a\u00020D¢\u0006\u0004\bY\u0010ZJ\u0015\u0010[\u001a\u00020D2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b[\u0010\\R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\ba\u0010L\u001a\u0004\bb\u0010cR\u0017\u0010g\u001a\u00020D8\u0006¢\u0006\f\n\u0004\bB\u0010d\u001a\u0004\be\u0010fR\u0017\u0010l\u001a\u00020#8\u0006¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010kR\u0017\u0010o\u001a\u00020#8\u0006¢\u0006\f\n\u0004\bm\u0010i\u001a\u0004\bn\u0010kR\u0017\u0010q\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bp\u0010cR\u001f\u0010u\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030r8\u0006¢\u0006\f\n\u0004\b<\u0010s\u001a\u0004\bi\u0010tR \u0010x\u001a\b\u0012\u0004\u0012\u00020v0r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bN\u0010s\u001a\u0004\bw\u0010tR\u0014\u0010{\u001a\u00020y8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bm\u0010zR\u0011\u0010}\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b|\u0010kR\u0011\u0010\u007f\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b~\u0010k¨\u0006\u0080\u0001"}, d2 = {"Landroidx/compose/ui/text/g;", "", "Landroidx/compose/ui/text/h;", "intrinsics", "Lcom/google/android/kx1;", "constraints", "", "maxLines", "Lcom/google/android/uyc;", "overflow", "<init>", "(Landroidx/compose/ui/text/h;JIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "offset", "", "O", "(I)V", "P", "lineIndex", "Q", "Lcom/google/android/w41;", "canvas", "Lcom/google/android/ei1;", "color", "Lcom/google/android/nkb;", "shadow", "Lcom/google/android/wrc;", "decoration", "Landroidx/compose/ui/graphics/drawscope/b;", "drawStyle", "Landroidx/compose/ui/graphics/e;", "blendMode", "K", "(Lcom/google/android/w41;JLcom/google/android/nkb;Lcom/google/android/wrc;Landroidx/compose/ui/graphics/drawscope/b;I)V", "Lcom/google/android/qu0;", "brush", "", "alpha", "M", "(Lcom/google/android/w41;Lcom/google/android/qu0;FLcom/google/android/nkb;Lcom/google/android/wrc;Landroidx/compose/ui/graphics/drawscope/b;I)V", "start", "end", "Landroidx/compose/ui/graphics/Path;", "D", "(II)Landroidx/compose/ui/graphics/Path;", "vertical", "t", "(F)I", "Lcom/google/android/rn8;", "position", "A", "(J)I", "Lcom/google/android/gba;", "rect", "Lcom/google/android/jwc;", "granularity", "Lcom/google/android/nwc;", "inclusionStrategy", "Landroidx/compose/ui/text/x;", "G", "(Lcom/google/android/gba;ILcom/google/android/nwc;)J", "g", "(I)Lcom/google/android/gba;", "range", "", "array", "arrayStart", "c", "(J[FI)[F", "", "usePrimaryDirection", "l", "(IZ)F", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "B", "(I)Landroidx/compose/ui/text/style/ResolvedTextDirection;", "f", "I", "(I)J", "h", "s", "(I)I", "v", "(I)F", "w", "y", "o", "u", "x", "visibleEnd", "q", "(IZ)I", "J", "(I)Z", "a", "Landroidx/compose/ui/text/h;", "m", "()Landroidx/compose/ui/text/h;", "b", "z", "()I", "Z", "i", "()Z", "didExceedMaxLines", "d", "F", "H", "()F", "width", "e", "k", "height", "p", "lineCount", "", "Ljava/util/List;", "()Ljava/util/List;", "placeholderRects", "Landroidx/compose/ui/text/j;", "C", "paragraphInfoList", "Landroidx/compose/ui/text/b;", "()Landroidx/compose/ui/text/b;", "annotatedString", "j", "firstBaseline", "n", "lastBaseline", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final h intrinsics;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int maxLines;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean didExceedMaxLines;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final float width;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final float height;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int lineCount;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final List<gba> placeholderRects;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final List<ParagraphInfo> paragraphInfoList;

    public /* synthetic */ g(h hVar, long j, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(hVar, j, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(Path path, int i, int i2, ParagraphInfo paragraphInfo) {
        Path.n(path, paragraphInfo.i(paragraphInfo.getParagraph().w(paragraphInfo.r(i), paragraphInfo.r(i2))), 0L, 2, null);
        return Unit.a;
    }

    public static /* synthetic */ void N(g gVar, w41 w41Var, qu0 qu0Var, float f, Shadow nkbVar, wrc wrcVar, androidx.compose.ui.graphics.drawscope.b bVar, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            f = Float.NaN;
        }
        gVar.M(w41Var, qu0Var, f, (i2 & 8) != 0 ? null : nkbVar, (i2 & 16) != 0 ? null : wrcVar, (i2 & 32) != 0 ? null : bVar, (i2 & 64) != 0 ? DrawScope.INSTANCE.a() : i);
    }

    private final void O(int offset) {
        boolean z = false;
        if (offset >= 0 && offset < e().getText().length()) {
            z = true;
        }
        if (z) {
            return;
        }
        ax5.a("offset(" + offset + ") is out of bounds [0, " + e().length() + ')');
    }

    private final void P(int offset) {
        boolean z = false;
        if (offset >= 0 && offset <= e().getText().length()) {
            z = true;
        }
        if (z) {
            return;
        }
        ax5.a("offset(" + offset + ") is out of bounds [0, " + e().length() + ']');
    }

    private final void Q(int lineIndex) {
        boolean z = false;
        if (lineIndex >= 0 && lineIndex < this.lineCount) {
            z = true;
        }
        if (z) {
            return;
        }
        ax5.a("lineIndex(" + lineIndex + ") is out of bounds [0, " + this.lineCount + ')');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(long j, float[] fArr, Ref.IntRef intRef, Ref.FloatRef floatRef, ParagraphInfo paragraphInfo) {
        long jB = zyc.b(paragraphInfo.r(paragraphInfo.getStartIndex() > x.l(j) ? paragraphInfo.getStartIndex() : x.l(j)), paragraphInfo.r(paragraphInfo.getEndIndex() < x.k(j) ? paragraphInfo.getEndIndex() : x.k(j)));
        paragraphInfo.getParagraph().n(jB, fArr, intRef.element);
        int iJ = intRef.element + (x.j(jB) * 4);
        for (int i = intRef.element; i < iJ; i += 4) {
            int i2 = i + 1;
            float f = fArr[i2];
            float f2 = floatRef.element;
            fArr[i2] = f + f2;
            int i3 = i + 3;
            fArr[i3] = fArr[i3] + f2;
        }
        intRef.element = iJ;
        floatRef.element += paragraphInfo.getParagraph().getHeight();
        return Unit.a;
    }

    private final b e() {
        return this.intrinsics.getAnnotatedString();
    }

    public static /* synthetic */ int r(g gVar, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return gVar.q(i, z);
    }

    public final int A(long position) {
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(e38.e(this.paragraphInfoList, Float.intBitsToFloat((int) (4294967295L & position))));
        return paragraphInfo.d() == 0 ? paragraphInfo.getStartIndex() : paragraphInfo.m(paragraphInfo.getParagraph().g(paragraphInfo.q(position)));
    }

    public final ResolvedTextDirection B(int offset) {
        P(offset);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(offset == e().length() ? kotlin.collections.m.r(this.paragraphInfoList) : e38.b(this.paragraphInfoList, offset));
        return paragraphInfo.getParagraph().c(paragraphInfo.r(offset));
    }

    public final List<ParagraphInfo> C() {
        return this.paragraphInfoList;
    }

    public final Path D(final int start, final int end) {
        if (!(start >= 0 && start <= end && end <= e().getText().length())) {
            ax5.a("Start(" + start + ") or End(" + end + ") is out of range [0.." + e().getText().length() + "), or start > end!");
        }
        if (start == end) {
            return androidx.compose.ui.graphics.d.a();
        }
        final Path pathA = androidx.compose.ui.graphics.d.a();
        e38.f(this.paragraphInfoList, zyc.b(start, end), new Function1() { // from class: com.google.android.a38
            public final Object invoke(Object obj) {
                return g.E(pathA, start, end, (ParagraphInfo) obj);
            }
        });
        return pathA;
    }

    public final List<gba> F() {
        return this.placeholderRects;
    }

    public final long G(gba rect, int granularity, nwc inclusionStrategy) {
        x.Companion companion;
        x.Companion companion2;
        int iE = e38.e(this.paragraphInfoList, rect.getTop());
        if (this.paragraphInfoList.get(iE).getBottom() >= rect.getBottom() || iE == kotlin.collections.m.r(this.paragraphInfoList)) {
            ParagraphInfo paragraphInfo = this.paragraphInfoList.get(iE);
            return ParagraphInfo.l(paragraphInfo, paragraphInfo.getParagraph().p(paragraphInfo.p(rect), granularity, inclusionStrategy), false, 1, null);
        }
        int iE2 = e38.e(this.paragraphInfoList, rect.getBottom());
        long jA = x.INSTANCE.a();
        while (true) {
            companion = x.INSTANCE;
            if (!x.g(jA, companion.a()) || iE > iE2) {
                break;
            }
            ParagraphInfo paragraphInfo2 = this.paragraphInfoList.get(iE);
            jA = ParagraphInfo.l(paragraphInfo2, paragraphInfo2.getParagraph().p(paragraphInfo2.p(rect), granularity, inclusionStrategy), false, 1, null);
            iE++;
        }
        if (x.g(jA, companion.a())) {
            return companion.a();
        }
        long jA2 = companion.a();
        while (true) {
            companion2 = x.INSTANCE;
            if (!x.g(jA2, companion2.a()) || iE > iE2) {
                break;
            }
            ParagraphInfo paragraphInfo3 = this.paragraphInfoList.get(iE2);
            jA2 = ParagraphInfo.l(paragraphInfo3, paragraphInfo3.getParagraph().p(paragraphInfo3.p(rect), granularity, inclusionStrategy), false, 1, null);
            iE2--;
        }
        return x.g(jA2, companion2.a()) ? jA : zyc.b(x.n(jA), x.i(jA2));
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final float getWidth() {
        return this.width;
    }

    public final long I(int offset) {
        P(offset);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(offset == e().length() ? kotlin.collections.m.r(this.paragraphInfoList) : e38.b(this.paragraphInfoList, offset));
        return paragraphInfo.k(paragraphInfo.getParagraph().e(paragraphInfo.r(offset)), false);
    }

    public final boolean J(int lineIndex) {
        Q(lineIndex);
        return this.paragraphInfoList.get(e38.d(this.paragraphInfoList, lineIndex)).getParagraph().s(lineIndex);
    }

    public final void K(w41 canvas, long color, Shadow shadow, wrc decoration, androidx.compose.ui.graphics.drawscope.b drawStyle, int blendMode) {
        canvas.v();
        List<ParagraphInfo> list = this.paragraphInfoList;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ParagraphInfo paragraphInfo = list.get(i);
            paragraphInfo.getParagraph().q(canvas, color, shadow, decoration, drawStyle, blendMode);
            canvas.c(0.0f, paragraphInfo.getParagraph().getHeight());
        }
        canvas.o();
    }

    public final void M(w41 canvas, qu0 brush, float alpha, Shadow shadow, wrc decoration, androidx.compose.ui.graphics.drawscope.b drawStyle, int blendMode) {
        bm.a(this, canvas, brush, alpha, shadow, decoration, drawStyle, blendMode);
    }

    public final float[] c(final long range, final float[] array, int arrayStart) {
        O(x.l(range));
        P(x.k(range));
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = arrayStart;
        final Ref.FloatRef floatRef = new Ref.FloatRef();
        e38.f(this.paragraphInfoList, range, new Function1() { // from class: com.google.android.z28
            public final Object invoke(Object obj) {
                return g.d(range, array, intRef, floatRef, (ParagraphInfo) obj);
            }
        });
        return array;
    }

    public final ResolvedTextDirection f(int offset) {
        P(offset);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(offset == e().length() ? kotlin.collections.m.r(this.paragraphInfoList) : e38.b(this.paragraphInfoList, offset));
        return paragraphInfo.getParagraph().B(paragraphInfo.r(offset));
    }

    public final gba g(int offset) {
        O(offset);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(e38.b(this.paragraphInfoList, offset));
        return paragraphInfo.j(paragraphInfo.getParagraph().C(paragraphInfo.r(offset)));
    }

    public final gba h(int offset) {
        P(offset);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(offset == e().length() ? kotlin.collections.m.r(this.paragraphInfoList) : e38.b(this.paragraphInfoList, offset));
        return paragraphInfo.j(paragraphInfo.getParagraph().r(paragraphInfo.r(offset)));
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getDidExceedMaxLines() {
        return this.didExceedMaxLines;
    }

    public final float j() {
        if (this.paragraphInfoList.isEmpty()) {
            return 0.0f;
        }
        return this.paragraphInfoList.get(0).getParagraph().f();
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final float getHeight() {
        return this.height;
    }

    public final float l(int offset, boolean usePrimaryDirection) {
        P(offset);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(offset == e().length() ? kotlin.collections.m.r(this.paragraphInfoList) : e38.b(this.paragraphInfoList, offset));
        return paragraphInfo.getParagraph().x(paragraphInfo.r(offset), usePrimaryDirection);
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final h getIntrinsics() {
        return this.intrinsics;
    }

    public final float n() {
        if (this.paragraphInfoList.isEmpty()) {
            return 0.0f;
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) kotlin.collections.m.L0(this.paragraphInfoList);
        return paragraphInfo.o(paragraphInfo.getParagraph().z());
    }

    public final float o(int lineIndex) {
        Q(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(e38.d(this.paragraphInfoList, lineIndex));
        return paragraphInfo.o(paragraphInfo.getParagraph().o(paragraphInfo.s(lineIndex)));
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final int getLineCount() {
        return this.lineCount;
    }

    public final int q(int lineIndex, boolean visibleEnd) {
        Q(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(e38.d(this.paragraphInfoList, lineIndex));
        return paragraphInfo.m(paragraphInfo.getParagraph().i(paragraphInfo.s(lineIndex), visibleEnd));
    }

    public final int s(int offset) {
        int iB;
        if (offset >= e().length()) {
            iB = kotlin.collections.m.r(this.paragraphInfoList);
        } else {
            iB = offset < 0 ? 0 : e38.b(this.paragraphInfoList, offset);
        }
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(iB);
        return paragraphInfo.n(paragraphInfo.getParagraph().A(paragraphInfo.r(offset)));
    }

    public final int t(float vertical) {
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(e38.e(this.paragraphInfoList, vertical));
        return paragraphInfo.d() == 0 ? paragraphInfo.getStartLineIndex() : paragraphInfo.n(paragraphInfo.getParagraph().l(paragraphInfo.t(vertical)));
    }

    public final float u(int lineIndex) {
        Q(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(e38.d(this.paragraphInfoList, lineIndex));
        return paragraphInfo.getParagraph().k(paragraphInfo.s(lineIndex));
    }

    public final float v(int lineIndex) {
        Q(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(e38.d(this.paragraphInfoList, lineIndex));
        return paragraphInfo.getParagraph().m(paragraphInfo.s(lineIndex));
    }

    public final float w(int lineIndex) {
        Q(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(e38.d(this.paragraphInfoList, lineIndex));
        return paragraphInfo.getParagraph().u(paragraphInfo.s(lineIndex));
    }

    public final int x(int lineIndex) {
        Q(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(e38.d(this.paragraphInfoList, lineIndex));
        return paragraphInfo.m(paragraphInfo.getParagraph().h(paragraphInfo.s(lineIndex)));
    }

    public final float y(int lineIndex) {
        Q(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(e38.d(this.paragraphInfoList, lineIndex));
        return paragraphInfo.o(paragraphInfo.getParagraph().d(paragraphInfo.s(lineIndex)));
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final int getMaxLines() {
        return this.maxLines;
    }

    private g(h hVar, long j, int i, int i2) {
        this.intrinsics = hVar;
        this.maxLines = i;
        boolean z = true;
        if (!(kx1.n(j) == 0 && kx1.m(j) == 0)) {
            ax5.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        List<ParagraphIntrinsicInfo> listH = hVar.h();
        int size = listH.size();
        int i3 = 0;
        float f = 0.0f;
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                z = false;
                break;
            }
            ParagraphIntrinsicInfo paragraphIntrinsicInfo = listH.get(i4);
            b19 b19VarC = l.c(paragraphIntrinsicInfo.getIntrinsics(), nx1.b(0, kx1.l(j), 0, kx1.g(j) ? kotlin.ranges.g.e(kx1.k(j) - l.d(f), 0) : kx1.k(j), 5, null), this.maxLines - i3, i2);
            float height = f + b19VarC.getHeight();
            int iT = i3 + b19VarC.t();
            arrayList.add(new ParagraphInfo(b19VarC, paragraphIntrinsicInfo.getStartIndex(), paragraphIntrinsicInfo.getEndIndex(), i3, iT, f, height));
            if (b19VarC.v() || (iT == this.maxLines && i4 != kotlin.collections.m.r(this.intrinsics.h()))) {
                i3 = iT;
                f = height;
                break;
            } else {
                i4++;
                i3 = iT;
                f = height;
            }
        }
        this.height = f;
        this.lineCount = i3;
        this.didExceedMaxLines = z;
        this.paragraphInfoList = arrayList;
        this.width = kx1.l(j);
        List<gba> arrayList2 = new ArrayList<>(arrayList.size());
        int size2 = arrayList.size();
        for (int i5 = 0; i5 < size2; i5++) {
            ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i5);
            List<gba> listD = paragraphInfo.getParagraph().D();
            ArrayList arrayList3 = new ArrayList(listD.size());
            int size3 = listD.size();
            for (int i6 = 0; i6 < size3; i6++) {
                gba gbaVar = listD.get(i6);
                arrayList3.add(gbaVar != null ? paragraphInfo.j(gbaVar) : null);
            }
            kotlin.collections.m.G(arrayList2, arrayList3);
        }
        if (arrayList2.size() < this.intrinsics.i().size()) {
            int size4 = this.intrinsics.i().size() - arrayList2.size();
            ArrayList arrayList4 = new ArrayList(size4);
            for (int i7 = 0; i7 < size4; i7++) {
                arrayList4.add(null);
            }
            arrayList2 = kotlin.collections.m.a1(arrayList2, arrayList4);
        }
        this.placeholderRects = arrayList2;
    }
}
