package com.google.inputmethod;

import androidx.compose.ui.b;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\f*\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR*\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R*\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R*\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013\"\u0004\b\u001a\u0010\u0015¨\u0006\u001b"}, d2 = {"Lcom/google/android/ts6;", "Landroidx/compose/ui/b$c;", "Lcom/google/android/x19;", "Lcom/google/android/xa4;", "", "fadeInSpec", "Lcom/google/android/g16;", "placementSpec", "fadeOutSpec", "<init>", "(Lcom/google/android/xa4;Lcom/google/android/xa4;Lcom/google/android/xa4;)V", "Lcom/google/android/f43;", "", "parentData", "r", "(Lcom/google/android/f43;Ljava/lang/Object;)Ljava/lang/Object;", "p", "Lcom/google/android/xa4;", "m3", "()Lcom/google/android/xa4;", "p3", "(Lcom/google/android/xa4;)V", "q", "o3", "r3", "n3", "q3", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ts6 extends b.c implements x19 {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private xa4<Float> fadeInSpec;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private xa4<g16> placementSpec;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private xa4<Float> fadeOutSpec;

    public ts6(xa4<Float> xa4Var, xa4<g16> xa4Var2, xa4<Float> xa4Var3) {
        this.fadeInSpec = xa4Var;
        this.placementSpec = xa4Var2;
        this.fadeOutSpec = xa4Var3;
    }

    public final xa4<Float> m3() {
        return this.fadeInSpec;
    }

    public final xa4<Float> n3() {
        return this.fadeOutSpec;
    }

    public final xa4<g16> o3() {
        return this.placementSpec;
    }

    public final void p3(xa4<Float> xa4Var) {
        this.fadeInSpec = xa4Var;
    }

    public final void q3(xa4<Float> xa4Var) {
        this.fadeOutSpec = xa4Var;
    }

    @Override // com.google.inputmethod.x19
    public Object r(f43 f43Var, Object obj) {
        return this;
    }

    public final void r3(xa4<g16> xa4Var) {
        this.placementSpec = xa4Var;
    }
}
