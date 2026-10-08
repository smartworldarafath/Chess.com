package com.google.inputmethod;

import android.view.textclassifier.TextClassification;
import kotlin.Metadata;

/* JADX INFO: renamed from: com.google.android.src, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\r\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/google/android/src;", "Lcom/google/android/erc;", "", "key", "Landroid/view/textclassifier/TextClassification;", "textClassification", "", "index", "<init>", "(Ljava/lang/Object;Landroid/view/textclassifier/TextClassification;I)V", "", "toString", "()Ljava/lang/String;", "b", "Landroid/view/textclassifier/TextClassification;", "c", "()Landroid/view/textclassifier/TextClassification;", "I", "()I", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TextContextMenuRemoteActionItem extends erc {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final TextClassification textClassification;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int index;

    public TextContextMenuRemoteActionItem(Object obj, TextClassification textClassification, int i) {
        super(obj);
        this.textClassification = textClassification;
        this.index = i;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextClassification getTextClassification() {
        return this.textClassification;
    }

    public String toString() {
        return "TextContextMenuRemoteActionItem(key=" + getKey() + ", textClassification=" + this.textClassification + ", index=" + this.index + ')';
    }
}
