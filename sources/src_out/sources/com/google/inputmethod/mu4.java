package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.collections.f;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0019\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001e\u001a\u00020\f2\n\u0010\u001d\u001a\u00060\u001bj\u0002`\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0004¢\u0006\u0004\b \u0010\nJ\u000f\u0010!\u001a\u00020\u0017H\u0016¢\u0006\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010#R\u0016\u0010&\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010%R\u0016\u0010'\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010#R\u0016\u0010(\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010#¨\u0006)"}, d2 = {"Lcom/google/android/mu4;", "", "", "initBuffer", "", "initGapStart", "initGapEnd", "<init>", "([CII)V", "c", "()I", "requestSize", "", "f", "(I)V", "start", "end", "b", "(II)V", "index", "", "d", "(I)C", "", "text", "g", "(IILjava/lang/String;)V", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "a", "(Ljava/lang/StringBuilder;)V", "e", "toString", "()Ljava/lang/String;", "I", "capacity", "[C", "buffer", "gapStart", "gapEnd", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class mu4 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int capacity;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private char[] buffer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int gapStart;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int gapEnd;

    public mu4(char[] cArr, int i, int i2) {
        this.capacity = cArr.length;
        this.buffer = cArr;
        this.gapStart = i;
        this.gapEnd = i2;
    }

    private final void b(int start, int end) {
        int i = this.gapStart;
        if (start < i && end <= i) {
            int i2 = i - end;
            char[] cArr = this.buffer;
            f.j(cArr, cArr, this.gapEnd - i2, end, i);
            this.gapStart = start;
            this.gapEnd -= i2;
            return;
        }
        if (start < i && end >= i) {
            this.gapEnd = end + c();
            this.gapStart = start;
            return;
        }
        int iC = start + c();
        int iC2 = end + c();
        int i3 = this.gapEnd;
        char[] cArr2 = this.buffer;
        f.j(cArr2, cArr2, this.gapStart, i3, iC);
        this.gapStart += iC - i3;
        this.gapEnd = iC2;
    }

    private final int c() {
        return this.gapEnd - this.gapStart;
    }

    private final void f(int requestSize) {
        if (requestSize <= c()) {
            return;
        }
        int iC = requestSize - c();
        int i = this.capacity;
        do {
            i *= 2;
        } while (i - this.capacity < iC);
        char[] cArr = new char[i];
        f.j(this.buffer, cArr, 0, 0, this.gapStart);
        int i2 = this.capacity;
        int i3 = this.gapEnd;
        int i4 = i2 - i3;
        int i5 = i - i4;
        f.j(this.buffer, cArr, i5, i3, i4 + i3);
        this.buffer = cArr;
        this.capacity = i;
        this.gapEnd = i5;
    }

    public final void a(StringBuilder builder) {
        builder.append(this.buffer, 0, this.gapStart);
        Intrinsics.checkNotNullExpressionValue(builder, "append(...)");
        char[] cArr = this.buffer;
        int i = this.gapEnd;
        builder.append(cArr, i, this.capacity - i);
        Intrinsics.checkNotNullExpressionValue(builder, "append(...)");
    }

    public final char d(int index) {
        int i = this.gapStart;
        return index < i ? this.buffer[index] : this.buffer[(index - i) + this.gapEnd];
    }

    public final int e() {
        return this.capacity - c();
    }

    public final void g(int start, int end, String text) {
        f(text.length() - (end - start));
        b(start, end);
        nu4.b(text, this.buffer, this.gapStart);
        this.gapStart += text.length();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) sb);
        return sb.toString();
    }
}
