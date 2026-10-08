package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: renamed from: com.google.android.y33, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u0012¨\u0006\u001a"}, d2 = {"Lcom/google/android/y33;", "Lcom/google/android/cn3;", "", "lengthBeforeCursor", "lengthAfterCursor", "<init>", "(II)V", "Lcom/google/android/gn3;", "buffer", "", "a", "(Lcom/google/android/gn3;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "I", "getLengthBeforeCursor", "b", "getLengthAfterCursor", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DeleteSurroundingTextInCodePointsCommand implements cn3 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int lengthBeforeCursor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int lengthAfterCursor;

    public DeleteSurroundingTextInCodePointsCommand(int i, int i2) {
        this.lengthBeforeCursor = i;
        this.lengthAfterCursor = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        ax5.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // com.google.inputmethod.cn3
    public void a(gn3 buffer) {
        int i = this.lengthBeforeCursor;
        int selectionStart = 0;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = selectionStart + 1;
            if (buffer.getSelectionStart() <= i3) {
                selectionStart = buffer.getSelectionStart();
                break;
            }
            selectionStart = dn3.b(buffer.c((buffer.getSelectionStart() - i3) + (-1)), buffer.c(buffer.getSelectionStart() - i3)) ? selectionStart + 2 : i3;
        }
        int i4 = this.lengthAfterCursor;
        int iH = 0;
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = iH + 1;
            if (buffer.getSelectionEnd() + i6 >= buffer.h()) {
                iH = buffer.h() - buffer.getSelectionEnd();
                break;
            }
            iH = dn3.b(buffer.c((buffer.getSelectionEnd() + i6) + (-1)), buffer.c(buffer.getSelectionEnd() + i6)) ? iH + 2 : i6;
        }
        buffer.b(buffer.getSelectionEnd(), buffer.getSelectionEnd() + iH);
        buffer.b(buffer.getSelectionStart() - selectionStart, buffer.getSelectionStart());
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeleteSurroundingTextInCodePointsCommand)) {
            return false;
        }
        DeleteSurroundingTextInCodePointsCommand deleteSurroundingTextInCodePointsCommand = (DeleteSurroundingTextInCodePointsCommand) other;
        return this.lengthBeforeCursor == deleteSurroundingTextInCodePointsCommand.lengthBeforeCursor && this.lengthAfterCursor == deleteSurroundingTextInCodePointsCommand.lengthAfterCursor;
    }

    public int hashCode() {
        return (this.lengthBeforeCursor * 31) + this.lengthAfterCursor;
    }

    public String toString() {
        return "DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=" + this.lengthBeforeCursor + ", lengthAfterCursor=" + this.lengthAfterCursor + ')';
    }
}
