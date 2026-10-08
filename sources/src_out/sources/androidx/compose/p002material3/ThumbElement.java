package androidx.compose.p002material3;

import com.google.inputmethod.bo6;
import com.google.inputmethod.j26;
import com.google.inputmethod.uy7;
import com.google.inputmethod.xa4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.compose.material3.c2, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Landroidx/compose/material3/c2;", "Lcom/google/android/uy7;", "Landroidx/compose/material3/ThumbNode;", "Lcom/google/android/j26;", "interactionSource", "", "checked", "Lcom/google/android/xa4;", "", "animationSpec", "<init>", "(Lcom/google/android/j26;ZLcom/google/android/xa4;)V", "d", "()Landroidx/compose/material3/ThumbNode;", "node", "", "e", "(Landroidx/compose/material3/ThumbNode;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/google/android/j26;", "getInteractionSource", "()Lcom/google/android/j26;", "Z", "getChecked", "()Z", "f", "Lcom/google/android/xa4;", "getAnimationSpec", "()Lcom/google/android/xa4;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class ThumbElement extends uy7<ThumbNode> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final j26 interactionSource;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final boolean checked;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final xa4<Float> animationSpec;

    public ThumbElement(j26 j26Var, boolean z, xa4<Float> xa4Var) {
        this.interactionSource = j26Var;
        this.checked = z;
        this.animationSpec = xa4Var;
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public ThumbNode a() {
        return new ThumbNode(this.interactionSource, this.checked, this.animationSpec);
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(ThumbNode node) {
        node.x3(this.interactionSource);
        if (node.getChecked() != this.checked) {
            bo6.b(node);
        }
        node.w3(this.checked);
        node.v3(this.animationSpec);
        node.y3();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThumbElement)) {
            return false;
        }
        ThumbElement thumbElement = (ThumbElement) other;
        return Intrinsics.e(this.interactionSource, thumbElement.interactionSource) && this.checked == thumbElement.checked && Intrinsics.e(this.animationSpec, thumbElement.animationSpec);
    }

    public int hashCode() {
        return (((this.interactionSource.hashCode() * 31) + Boolean.hashCode(this.checked)) * 31) + this.animationSpec.hashCode();
    }

    public String toString() {
        return "ThumbElement(interactionSource=" + this.interactionSource + ", checked=" + this.checked + ", animationSpec=" + this.animationSpec + ')';
    }
}
