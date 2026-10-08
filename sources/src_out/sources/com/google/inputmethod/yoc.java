package com.google.inputmethod;

import androidx.compose.ui.b;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/google/android/yoc;", "Landroidx/compose/ui/b$c;", "Lcom/google/android/bfb;", "", "tag", "<init>", "(Ljava/lang/String;)V", "Lcom/google/android/nfb;", "", "H0", "(Lcom/google/android/nfb;)V", "p", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "m3", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class yoc extends b.c implements bfb {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private String tag;

    public yoc(String str) {
        this.tag = str;
    }

    @Override // com.google.inputmethod.bfb
    public void H0(nfb nfbVar) {
        SemanticsPropertiesKt.w0(nfbVar, this.tag);
    }

    public final void m3(String str) {
        this.tag = str;
    }
}
