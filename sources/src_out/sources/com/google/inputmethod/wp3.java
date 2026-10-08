package com.google.inputmethod;

import androidx.p008glance.g;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0004\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\f\u001a\u00020\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/google/android/wp3;", "Lcom/google/android/rp3;", "<init>", "()V", "c", "()Lcom/google/android/wp3;", "Landroidx/glance/g;", "a", "Landroidx/glance/g;", "()Landroidx/glance/g;", "b", "(Landroidx/glance/g;)V", "modifier", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class wp3 implements rp3 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private g modifier = g.INSTANCE;

    @Override // com.google.inputmethod.rp3
    /* JADX INFO: renamed from: a, reason: from getter */
    public g getModifier() {
        return this.modifier;
    }

    @Override // com.google.inputmethod.rp3
    public void b(g gVar) {
        this.modifier = gVar;
    }

    @Override // com.google.inputmethod.rp3
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public wp3 copy() {
        wp3 wp3Var = new wp3();
        wp3Var.b(getModifier());
        return wp3Var;
    }
}
