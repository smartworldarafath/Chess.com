package com.google.inputmethod;

import androidx.compose.ui.b;
import androidx.compose.ui.focus.f;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/google/android/cl4;", "Lcom/google/android/al4;", "Landroidx/compose/ui/b$c;", "Landroidx/compose/ui/focus/f;", "focusRequester", "<init>", "(Landroidx/compose/ui/focus/f;)V", "", "V2", "()V", "W2", "p", "Landroidx/compose/ui/focus/f;", "m3", "()Landroidx/compose/ui/focus/f;", "n3", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class cl4 extends b.c implements al4 {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private f focusRequester;

    public cl4(f fVar) {
        this.focusRequester = fVar;
    }

    @Override // androidx.compose.ui.b.c
    public void V2() {
        super.V2();
        this.focusRequester.f().c(this);
    }

    @Override // androidx.compose.ui.b.c
    public void W2() {
        this.focusRequester.f().s(this);
        super.W2();
    }

    /* JADX INFO: renamed from: m3, reason: from getter */
    public final f getFocusRequester() {
        return this.focusRequester;
    }

    public final void n3(f fVar) {
        this.focusRequester = fVar;
    }
}
