package com.google.inputmethod;

import androidx.p008glance.f;
import androidx.p008glance.g;
import kotlin.Metadata;

/* JADX INFO: renamed from: com.google.android.iq3, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0011\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/google/android/iq3;", "Landroidx/glance/f;", "<init>", "()V", "Lcom/google/android/rp3;", "copy", "()Lcom/google/android/rp3;", "", "toString", "()Ljava/lang/String;", "Landroidx/glance/g;", "d", "Landroidx/glance/g;", "a", "()Landroidx/glance/g;", "b", "(Landroidx/glance/g;)V", "modifier", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class EmittableText extends f {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
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
    public rp3 copy() {
        EmittableText emittableText = new EmittableText();
        emittableText.b(getModifier());
        emittableText.h(getText());
        emittableText.g(getStyle());
        emittableText.f(getMaxLines());
        return emittableText;
    }

    public String toString() {
        return "EmittableText(" + getText() + ", style=" + getStyle() + ", modifier=" + getModifier() + ", maxLines=" + getMaxLines() + ')';
    }
}
