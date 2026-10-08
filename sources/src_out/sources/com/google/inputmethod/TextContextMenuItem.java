package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.google.android.hrc, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/google/android/hrc;", "Lcom/google/android/erc;", "", "key", "", "label", "", "leadingIcon", "Lkotlin/Function1;", "Lcom/google/android/rrc;", "", "onClick", "<init>", "(Ljava/lang/Object;Ljava/lang/String;ILkotlin/jvm/functions/Function1;)V", "toString", "()Ljava/lang/String;", "b", "Ljava/lang/String;", "c", "I", "()I", "d", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TextContextMenuItem extends erc {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final String label;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int leadingIcon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Function1<rrc, Unit> onClick;

    /* JADX WARN: Multi-variable type inference failed */
    public TextContextMenuItem(Object obj, String str, int i, Function1<? super rrc, Unit> function1) {
        super(obj);
        this.label = str;
        this.leadingIcon = i;
        this.onClick = function1;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getLeadingIcon() {
        return this.leadingIcon;
    }

    public final Function1<rrc, Unit> d() {
        return this.onClick;
    }

    public String toString() {
        return "TextContextMenuItem(key=" + getKey() + ", label=\"" + this.label + "\", leadingIcon=" + this.leadingIcon + ')';
    }
}
