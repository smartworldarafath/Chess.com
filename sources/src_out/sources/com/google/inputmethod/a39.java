package com.google.inputmethod;

import androidx.compose.ui.text.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/google/android/a39;", "Lcom/google/android/nce;", "", "mask", "<init>", "(C)V", "Landroidx/compose/ui/text/b;", "text", "Lcom/google/android/jed;", "a", "(Landroidx/compose/ui/text/b;)Lcom/google/android/jed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "C", "getMask", "()C", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a39 implements nce {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final char mask;

    public a39(char c) {
        this.mask = c;
    }

    @Override // com.google.inputmethod.nce
    public TransformedText a(b text) {
        return new TransformedText(new b(h.P(String.valueOf(this.mask), text.getText().length()), null, 2, null), zn8.INSTANCE.a());
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof a39) && this.mask == ((a39) other).mask;
    }

    public int hashCode() {
        return Character.hashCode(this.mask);
    }

    public /* synthetic */ a39(char c, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? (char) 8226 : c);
    }
}
