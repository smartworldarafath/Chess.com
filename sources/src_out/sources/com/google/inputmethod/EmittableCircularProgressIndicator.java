package com.google.inputmethod;

import androidx.p008glance.g;
import kotlin.Metadata;

/* JADX INFO: renamed from: com.google.android.vp3, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0004\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u000f\u001a\u00020\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0016\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/google/android/vp3;", "Lcom/google/android/rp3;", "<init>", "()V", "copy", "()Lcom/google/android/rp3;", "", "toString", "()Ljava/lang/String;", "Landroidx/glance/g;", "a", "Landroidx/glance/g;", "()Landroidx/glance/g;", "b", "(Landroidx/glance/g;)V", "modifier", "Lcom/google/android/ti1;", "Lcom/google/android/ti1;", "c", "()Lcom/google/android/ti1;", "d", "(Lcom/google/android/ti1;)V", "color", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class EmittableCircularProgressIndicator implements rp3 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private g modifier = g.INSTANCE;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private ti1 color = vp9.a.a();

    @Override // com.google.inputmethod.rp3
    /* JADX INFO: renamed from: a, reason: from getter */
    public g getModifier() {
        return this.modifier;
    }

    @Override // com.google.inputmethod.rp3
    public void b(g gVar) {
        this.modifier = gVar;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final ti1 getColor() {
        return this.color;
    }

    @Override // com.google.inputmethod.rp3
    public rp3 copy() {
        EmittableCircularProgressIndicator emittableCircularProgressIndicator = new EmittableCircularProgressIndicator();
        emittableCircularProgressIndicator.b(getModifier());
        emittableCircularProgressIndicator.color = this.color;
        return emittableCircularProgressIndicator;
    }

    public final void d(ti1 ti1Var) {
        this.color = ti1Var;
    }

    public String toString() {
        return "EmittableCircularProgressIndicator(modifier=" + getModifier() + ", color=" + this.color + ')';
    }
}
