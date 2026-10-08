package com.google.inputmethod;

import androidx.compose.ui.text.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;

/* JADX INFO: renamed from: com.google.android.gk1, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0018¨\u0006\u001f"}, d2 = {"Lcom/google/android/gk1;", "Lcom/google/android/cn3;", "Landroidx/compose/ui/text/b;", "annotatedString", "", "newCursorPosition", "<init>", "(Landroidx/compose/ui/text/b;I)V", "", "text", "(Ljava/lang/String;I)V", "Lcom/google/android/gn3;", "buffer", "", "a", "(Lcom/google/android/gn3;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/text/b;", "getAnnotatedString", "()Landroidx/compose/ui/text/b;", "b", "I", "c", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CommitTextCommand implements cn3 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final b annotatedString;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int newCursorPosition;

    public CommitTextCommand(b bVar, int i) {
        this.annotatedString = bVar;
        this.newCursorPosition = i;
    }

    @Override // com.google.inputmethod.cn3
    public void a(gn3 buffer) {
        if (buffer.l()) {
            buffer.m(buffer.getCompositionStart(), buffer.getCompositionEnd(), c());
        } else {
            buffer.m(buffer.getSelectionStart(), buffer.getSelectionEnd(), c());
        }
        int iG = buffer.g();
        int i = this.newCursorPosition;
        buffer.o(g.o(i > 0 ? (iG + i) - 1 : (iG + i) - c().length(), 0, buffer.h()));
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getNewCursorPosition() {
        return this.newCursorPosition;
    }

    public final String c() {
        return this.annotatedString.getText();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommitTextCommand)) {
            return false;
        }
        CommitTextCommand commitTextCommand = (CommitTextCommand) other;
        return Intrinsics.e(c(), commitTextCommand.c()) && this.newCursorPosition == commitTextCommand.newCursorPosition;
    }

    public int hashCode() {
        return (c().hashCode() * 31) + this.newCursorPosition;
    }

    public String toString() {
        return "CommitTextCommand(text='" + c() + "', newCursorPosition=" + this.newCursorPosition + ')';
    }

    public CommitTextCommand(String str, int i) {
        this(new b(str, null, 2, null), i);
    }
}
