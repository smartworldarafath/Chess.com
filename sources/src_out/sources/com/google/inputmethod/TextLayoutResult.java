package com.google.inputmethod;

import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.g;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.google.android.vxc, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u0016J\u0015\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\rJ\u0015\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010 \u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u000e¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b%\u0010$J\u0015\u0010(\u001a\u00020\n2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u0015\u0010+\u001a\u00020*2\u0006\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b+\u0010,J\u0015\u0010.\u001a\u00020-2\u0006\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b.\u0010/J\u0015\u00100\u001a\u00020*2\u0006\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b0\u0010,J\u001d\u00104\u001a\u0002032\u0006\u00101\u001a\u00020\n2\u0006\u00102\u001a\u00020\n¢\u0006\u0004\b4\u00105J!\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b6\u00107J\u001a\u00109\u001a\u00020\u000e2\b\u00108\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\nH\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b>\u0010?R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010G\u001a\u0004\bH\u0010IR\u0017\u0010M\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b+\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010O\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b0\u0010J\u001a\u0004\bN\u0010LR\u001f\u0010U\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0P8\u0006¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u0011\u0010W\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bQ\u0010VR\u0011\u0010Y\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bX\u0010VR\u0011\u0010[\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bZ\u0010VR\u0011\u0010]\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\\\u0010<¨\u0006^"}, d2 = {"Lcom/google/android/vxc;", "", "Landroidx/compose/ui/text/u;", "layoutInput", "Landroidx/compose/ui/text/g;", "multiParagraph", "Lcom/google/android/q16;", "size", "<init>", "(Landroidx/compose/ui/text/u;Landroidx/compose/ui/text/g;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "lineIndex", "u", "(I)I", "", "visibleEnd", "o", "(IZ)I", "D", "(I)Z", "", "v", "(I)F", "m", "s", "t", "offset", "q", "vertical", "r", "(F)I", "usePrimaryDirection", "j", "(IZ)F", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "y", "(I)Landroidx/compose/ui/text/style/ResolvedTextDirection;", "c", "Lcom/google/android/rn8;", "position", "x", "(J)I", "Lcom/google/android/gba;", "d", "(I)Lcom/google/android/gba;", "Landroidx/compose/ui/text/x;", "C", "(I)J", "e", "start", "end", "Landroidx/compose/ui/graphics/Path;", "z", "(II)Landroidx/compose/ui/graphics/Path;", "a", "(Landroidx/compose/ui/text/u;J)Lcom/google/android/vxc;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/text/u;", "l", "()Landroidx/compose/ui/text/u;", "b", "Landroidx/compose/ui/text/g;", "w", "()Landroidx/compose/ui/text/g;", "J", "B", "()J", "F", "h", "()F", "firstBaseline", "k", "lastBaseline", "", "f", "Ljava/util/List;", "A", "()Ljava/util/List;", "placeholderRects", "()Z", "didOverflowHeight", "g", "didOverflowWidth", "i", "hasVisualOverflow", "n", "lineCount", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TextLayoutResult {
    public static final int g = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final TextLayoutInput layoutInput;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final g multiParagraph;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final long size;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final float firstBaseline;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final float lastBaseline;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final List<gba> placeholderRects;

    public /* synthetic */ TextLayoutResult(TextLayoutInput textLayoutInput, g gVar, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(textLayoutInput, gVar, j);
    }

    public static /* synthetic */ TextLayoutResult b(TextLayoutResult textLayoutResult, TextLayoutInput textLayoutInput, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            textLayoutInput = textLayoutResult.layoutInput;
        }
        if ((i & 2) != 0) {
            j = textLayoutResult.size;
        }
        return textLayoutResult.a(textLayoutInput, j);
    }

    public static /* synthetic */ int p(TextLayoutResult textLayoutResult, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return textLayoutResult.o(i, z);
    }

    public final List<gba> A() {
        return this.placeholderRects;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    public final long C(int offset) {
        return this.multiParagraph.I(offset);
    }

    public final boolean D(int lineIndex) {
        return this.multiParagraph.J(lineIndex);
    }

    public final TextLayoutResult a(TextLayoutInput layoutInput, long size) {
        return new TextLayoutResult(layoutInput, this.multiParagraph, size, null);
    }

    public final ResolvedTextDirection c(int offset) {
        return this.multiParagraph.f(offset);
    }

    public final gba d(int offset) {
        return this.multiParagraph.g(offset);
    }

    public final gba e(int offset) {
        return this.multiParagraph.h(offset);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextLayoutResult)) {
            return false;
        }
        TextLayoutResult textLayoutResult = (TextLayoutResult) other;
        return Intrinsics.e(this.layoutInput, textLayoutResult.layoutInput) && Intrinsics.e(this.multiParagraph, textLayoutResult.multiParagraph) && q16.f(this.size, textLayoutResult.size) && this.firstBaseline == textLayoutResult.firstBaseline && this.lastBaseline == textLayoutResult.lastBaseline && Intrinsics.e(this.placeholderRects, textLayoutResult.placeholderRects);
    }

    public final boolean f() {
        return this.multiParagraph.getDidExceedMaxLines() || ((float) ((int) (this.size & 4294967295L))) < this.multiParagraph.getHeight();
    }

    public final boolean g() {
        return ((float) ((int) (this.size >> 32))) < this.multiParagraph.getWidth();
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final float getFirstBaseline() {
        return this.firstBaseline;
    }

    public int hashCode() {
        return (((((((((this.layoutInput.hashCode() * 31) + this.multiParagraph.hashCode()) * 31) + q16.i(this.size)) * 31) + Float.hashCode(this.firstBaseline)) * 31) + Float.hashCode(this.lastBaseline)) * 31) + this.placeholderRects.hashCode();
    }

    public final boolean i() {
        return g() || f();
    }

    public final float j(int offset, boolean usePrimaryDirection) {
        return this.multiParagraph.l(offset, usePrimaryDirection);
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final float getLastBaseline() {
        return this.lastBaseline;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final TextLayoutInput getLayoutInput() {
        return this.layoutInput;
    }

    public final float m(int lineIndex) {
        return this.multiParagraph.o(lineIndex);
    }

    public final int n() {
        return this.multiParagraph.getLineCount();
    }

    public final int o(int lineIndex, boolean visibleEnd) {
        return this.multiParagraph.q(lineIndex, visibleEnd);
    }

    public final int q(int offset) {
        return this.multiParagraph.s(offset);
    }

    public final int r(float vertical) {
        return this.multiParagraph.t(vertical);
    }

    public final float s(int lineIndex) {
        return this.multiParagraph.v(lineIndex);
    }

    public final float t(int lineIndex) {
        return this.multiParagraph.w(lineIndex);
    }

    public String toString() {
        return "TextLayoutResult(layoutInput=" + this.layoutInput + ", multiParagraph=" + this.multiParagraph + ", size=" + ((Object) q16.j(this.size)) + ", firstBaseline=" + this.firstBaseline + ", lastBaseline=" + this.lastBaseline + ", placeholderRects=" + this.placeholderRects + ')';
    }

    public final int u(int lineIndex) {
        return this.multiParagraph.x(lineIndex);
    }

    public final float v(int lineIndex) {
        return this.multiParagraph.y(lineIndex);
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final g getMultiParagraph() {
        return this.multiParagraph;
    }

    public final int x(long position) {
        return this.multiParagraph.A(position);
    }

    public final ResolvedTextDirection y(int offset) {
        return this.multiParagraph.B(offset);
    }

    public final Path z(int start, int end) {
        return this.multiParagraph.D(start, end);
    }

    private TextLayoutResult(TextLayoutInput textLayoutInput, g gVar, long j) {
        this.layoutInput = textLayoutInput;
        this.multiParagraph = gVar;
        this.size = j;
        this.firstBaseline = gVar.j();
        this.lastBaseline = gVar.n();
        this.placeholderRects = gVar.F();
    }
}
