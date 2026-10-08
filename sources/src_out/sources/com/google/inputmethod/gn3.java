package com.google.inputmethod;

import androidx.compose.ui.text.b;
import androidx.compose.ui.text.x;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0007\u0018\u0000 .2\u00020\u0001:\u0001\u001aB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0080\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0018\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0019\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010!R*\u0010)\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000b8\u0000@BX\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R*\u0010,\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000b8\u0000@BX\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010$\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R$\u0010/\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000b8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b-\u0010$\u001a\u0004\b.\u0010&R$\u00101\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000b8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b0\u0010$\u001a\u0004\b0\u0010&R\u0016\u00103\u001a\u0004\u0018\u00010\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b-\u00102R\u0014\u0010\u0005\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R$\u00106\u001a\u00020\u000b2\u0006\u00106\u001a\u00020\u000b8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b7\u0010&\"\u0004\b8\u0010(R\u0014\u0010:\u001a\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b9\u0010&¨\u0006;"}, d2 = {"Lcom/google/android/gn3;", "", "Landroidx/compose/ui/text/b;", "text", "Landroidx/compose/ui/text/x;", "selection", "<init>", "(Landroidx/compose/ui/text/b;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "l", "()Z", "", "index", "", "c", "(I)C", "start", "end", "", "", "m", "(IILjava/lang/String;)V", "b", "(II)V", "p", "n", "a", "()V", "toString", "()Ljava/lang/String;", "s", "()Landroidx/compose/ui/text/b;", "Lcom/google/android/w29;", "Lcom/google/android/w29;", "gapBuffer", "value", "I", "k", "()I", "r", "(I)V", "selectionStart", "j", "q", "selectionEnd", "d", "f", "compositionStart", "e", "compositionEnd", "()Landroidx/compose/ui/text/x;", "composition", "i", "()J", "cursor", "g", "o", "h", "length", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class gn3 {
    public static final int g = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final w29 gapBuffer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int selectionStart;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int selectionEnd;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int compositionStart;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int compositionEnd;

    public /* synthetic */ gn3(b bVar, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, j);
    }

    private final void q(int i) {
        if (!(i >= 0)) {
            ax5.a("Cannot set selectionEnd to a negative value: " + i);
        }
        this.selectionEnd = i;
    }

    private final void r(int i) {
        if (!(i >= 0)) {
            ax5.a("Cannot set selectionStart to a negative value: " + i);
        }
        this.selectionStart = i;
    }

    public final void a() {
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public final void b(int start, int end) {
        long jB = zyc.b(start, end);
        this.gapBuffer.c(start, end, "");
        long jA = hn3.a(zyc.b(this.selectionStart, this.selectionEnd), jB);
        r(x.l(jA));
        q(x.k(jA));
        if (l()) {
            long jA2 = hn3.a(zyc.b(this.compositionStart, this.compositionEnd), jB);
            if (x.h(jA2)) {
                a();
            } else {
                this.compositionStart = x.l(jA2);
                this.compositionEnd = x.k(jA2);
            }
        }
    }

    public final char c(int index) {
        return this.gapBuffer.a(index);
    }

    public final x d() {
        if (l()) {
            return x.b(zyc.b(this.compositionStart, this.compositionEnd));
        }
        return null;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getCompositionEnd() {
        return this.compositionEnd;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getCompositionStart() {
        return this.compositionStart;
    }

    public final int g() {
        int i = this.selectionStart;
        int i2 = this.selectionEnd;
        if (i == i2) {
            return i2;
        }
        return -1;
    }

    public final int h() {
        return this.gapBuffer.b();
    }

    public final long i() {
        return zyc.b(this.selectionStart, this.selectionEnd);
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getSelectionEnd() {
        return this.selectionEnd;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getSelectionStart() {
        return this.selectionStart;
    }

    public final boolean l() {
        return this.compositionStart != -1;
    }

    public final void m(int start, int end, String text) {
        if (start < 0 || start > this.gapBuffer.b()) {
            throw new IndexOutOfBoundsException("start (" + start + ") offset is outside of text region " + this.gapBuffer.b());
        }
        if (end < 0 || end > this.gapBuffer.b()) {
            throw new IndexOutOfBoundsException("end (" + end + ") offset is outside of text region " + this.gapBuffer.b());
        }
        if (start <= end) {
            this.gapBuffer.c(start, end, text);
            r(text.length() + start);
            q(start + text.length());
            this.compositionStart = -1;
            this.compositionEnd = -1;
            return;
        }
        throw new IllegalArgumentException("Do not set reversed range: " + start + " > " + end);
    }

    public final void n(int start, int end) {
        if (start < 0 || start > this.gapBuffer.b()) {
            throw new IndexOutOfBoundsException("start (" + start + ") offset is outside of text region " + this.gapBuffer.b());
        }
        if (end < 0 || end > this.gapBuffer.b()) {
            throw new IndexOutOfBoundsException("end (" + end + ") offset is outside of text region " + this.gapBuffer.b());
        }
        if (start < end) {
            this.compositionStart = start;
            this.compositionEnd = end;
            return;
        }
        throw new IllegalArgumentException("Do not set reversed or empty range: " + start + " > " + end);
    }

    public final void o(int i) {
        p(i, i);
    }

    public final void p(int start, int end) {
        if (start < 0 || start > this.gapBuffer.b()) {
            throw new IndexOutOfBoundsException("start (" + start + ") offset is outside of text region " + this.gapBuffer.b());
        }
        if (end < 0 || end > this.gapBuffer.b()) {
            throw new IndexOutOfBoundsException("end (" + end + ") offset is outside of text region " + this.gapBuffer.b());
        }
        if (start <= end) {
            r(start);
            q(end);
            return;
        }
        throw new IllegalArgumentException("Do not set reversed range: " + start + " > " + end);
    }

    public final b s() {
        List list = null;
        return new b(toString(), list, 2, list);
    }

    public String toString() {
        return this.gapBuffer.toString();
    }

    private gn3(b bVar, long j) {
        this.gapBuffer = new w29(bVar.getText());
        this.selectionStart = x.l(j);
        this.selectionEnd = x.k(j);
        this.compositionStart = -1;
        this.compositionEnd = -1;
        int iL = x.l(j);
        int iK = x.k(j);
        if (iL < 0 || iL > bVar.length()) {
            throw new IndexOutOfBoundsException("start (" + iL + ") offset is outside of text region " + bVar.length());
        }
        if (iK < 0 || iK > bVar.length()) {
            throw new IndexOutOfBoundsException("end (" + iK + ") offset is outside of text region " + bVar.length());
        }
        if (iL <= iK) {
            return;
        }
        throw new IllegalArgumentException("Do not set reversed range: " + iL + " > " + iK);
    }
}
