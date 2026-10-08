package com.google.inputmethod;

import androidx.compose.ui.b;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\u0003R\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/google/android/emc;", "Landroidx/compose/ui/b$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "V2", "W2", "", "p", "Z", "m3", "()Z", "setAttachHasBeenRun", "(Z)V", "attachHasBeenRun", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class emc extends b.c {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private boolean attachHasBeenRun;

    public emc() {
        b3(0);
    }

    @Override // androidx.compose.ui.b.c
    public void V2() {
        this.attachHasBeenRun = true;
    }

    @Override // androidx.compose.ui.b.c
    public void W2() {
        this.attachHasBeenRun = false;
    }

    /* JADX INFO: renamed from: m3, reason: from getter */
    public final boolean getAttachHasBeenRun() {
        return this.attachHasBeenRun;
    }

    public String toString() {
        return "<tail>";
    }
}
