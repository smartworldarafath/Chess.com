package com.google.inputmethod;

import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/google/android/tvc;", "Lcom/google/android/uy7;", "Lcom/google/android/zvc;", "Landroidx/compose/ui/text/y;", "style", "<init>", "(Landroidx/compose/ui/text/y;)V", "d", "()Lcom/google/android/zvc;", "node", "", "e", "(Lcom/google/android/zvc;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/text/y;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class tvc extends uy7<zvc> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextStyle style;

    public tvc(TextStyle textStyle) {
        this.style = textStyle;
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public zvc a() {
        return new zvc(this.style);
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(zvc node) {
        node.q3(this.style);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof tvc) {
            return Intrinsics.e(this.style, ((tvc) other).style);
        }
        return false;
    }

    public int hashCode() {
        return this.style.hashCode();
    }
}
