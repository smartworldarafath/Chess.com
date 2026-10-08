package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/google/android/fle;", "Lcom/google/android/ncb;", "", "text", "Lcom/google/android/ele;", "wordIterator", "<init>", "(Ljava/lang/CharSequence;Lcom/google/android/ele;)V", "", "offset", "c", "(I)I", "a", "b", "d", "Ljava/lang/CharSequence;", "Lcom/google/android/ele;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class fle implements ncb {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final CharSequence text;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ele wordIterator;

    public fle(CharSequence charSequence, ele eleVar) {
        this.text = charSequence;
        this.wordIterator = eleVar;
    }

    @Override // com.google.inputmethod.ncb
    public int a(int offset) {
        do {
            offset = this.wordIterator.q(offset);
            if (offset == -1 || offset == 0) {
                return -1;
            }
        } while (Character.isWhitespace(this.text.charAt(offset - 1)));
        return offset;
    }

    @Override // com.google.inputmethod.ncb
    public int b(int offset) {
        do {
            offset = this.wordIterator.p(offset);
            if (offset == -1 || offset == this.text.length()) {
                return -1;
            }
        } while (Character.isWhitespace(this.text.charAt(offset)));
        return offset;
    }

    @Override // com.google.inputmethod.ncb
    public int c(int offset) {
        do {
            offset = this.wordIterator.q(offset);
            if (offset == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.text.charAt(offset)));
        return offset;
    }

    @Override // com.google.inputmethod.ncb
    public int d(int offset) {
        do {
            offset = this.wordIterator.p(offset);
            if (offset == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.text.charAt(offset - 1)));
        return offset;
    }
}
