package com.google.inputmethod;

import androidx.compose.ui.layout.j;
import com.google.android.ps4;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R/\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/google/android/mn6;", "Lcom/google/android/uy7;", "Lcom/google/android/yn6;", "Lkotlin/Function3;", "Landroidx/compose/ui/layout/j;", "Lcom/google/android/dj7;", "Lcom/google/android/kx1;", "Lcom/google/android/fj7;", "measure", "<init>", "(Lcom/google/android/ps4;)V", "d", "()Lcom/google/android/yn6;", "node", "", "e", "(Lcom/google/android/yn6;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/android/ps4;", "getMeasure", "()Lcom/google/android/ps4;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class mn6 extends uy7<LayoutModifierImpl> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final ps4<j, dj7, kx1, fj7> measure;

    /* JADX WARN: Multi-variable type inference failed */
    public mn6(ps4<? super j, ? super dj7, ? super kx1, ? extends fj7> ps4Var) {
        this.measure = ps4Var;
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public LayoutModifierImpl a() {
        return new LayoutModifierImpl(this.measure);
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(LayoutModifierImpl node) {
        node.m3(this.measure);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof mn6) && this.measure == ((mn6) other).measure;
    }

    public int hashCode() {
        return this.measure.hashCode();
    }
}
