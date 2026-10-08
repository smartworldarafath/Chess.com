package com.google.inputmethod;

import androidx.compose.ui.text.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.google.android.jed, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/google/android/jed;", "", "Landroidx/compose/ui/text/b;", "text", "Lcom/google/android/zn8;", "offsetMapping", "<init>", "(Landroidx/compose/ui/text/b;Lcom/google/android/zn8;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Landroidx/compose/ui/text/b;", "b", "()Landroidx/compose/ui/text/b;", "Lcom/google/android/zn8;", "()Lcom/google/android/zn8;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TransformedText {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final b text;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final zn8 offsetMapping;

    public TransformedText(b bVar, zn8 zn8Var) {
        this.text = bVar;
        this.offsetMapping = zn8Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final zn8 getOffsetMapping() {
        return this.offsetMapping;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b getText() {
        return this.text;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransformedText)) {
            return false;
        }
        TransformedText transformedText = (TransformedText) other;
        return Intrinsics.e(this.text, transformedText.text) && Intrinsics.e(this.offsetMapping, transformedText.offsetMapping);
    }

    public int hashCode() {
        return (this.text.hashCode() * 31) + this.offsetMapping.hashCode();
    }

    public String toString() {
        return "TransformedText(text=" + ((Object) this.text) + ", offsetMapping=" + this.offsetMapping + ')';
    }
}
