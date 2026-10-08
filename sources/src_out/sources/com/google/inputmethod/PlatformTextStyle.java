package com.google.inputmethod;

import androidx.compose.ui.text.PlatformParagraphStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.google.android.cc9, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/google/android/cc9;", "", "Lcom/google/android/vb9;", "spanStyle", "Landroidx/compose/ui/text/o;", "paragraphStyle", "<init>", "(Lcom/google/android/vb9;Landroidx/compose/ui/text/o;)V", "", "includeFontPadding", "(Z)V", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "a", "Lcom/google/android/vb9;", "b", "()Lcom/google/android/vb9;", "Landroidx/compose/ui/text/o;", "()Landroidx/compose/ui/text/o;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PlatformTextStyle {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final vb9 spanStyle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final PlatformParagraphStyle paragraphSyle;

    public PlatformTextStyle(vb9 vb9Var, PlatformParagraphStyle platformParagraphStyle) {
        this.spanStyle = vb9Var;
        this.paragraphSyle = platformParagraphStyle;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final PlatformParagraphStyle getParagraphSyle() {
        return this.paragraphSyle;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final vb9 getSpanStyle() {
        return this.spanStyle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlatformTextStyle)) {
            return false;
        }
        PlatformTextStyle platformTextStyle = (PlatformTextStyle) other;
        return Intrinsics.e(this.paragraphSyle, platformTextStyle.paragraphSyle) && Intrinsics.e(this.spanStyle, platformTextStyle.spanStyle);
    }

    public int hashCode() {
        vb9 vb9Var = this.spanStyle;
        int iHashCode = (vb9Var != null ? vb9Var.hashCode() : 0) * 31;
        PlatformParagraphStyle platformParagraphStyle = this.paragraphSyle;
        return iHashCode + (platformParagraphStyle != null ? platformParagraphStyle.hashCode() : 0);
    }

    public String toString() {
        return "PlatformTextStyle(spanStyle=" + this.spanStyle + ", paragraphSyle=" + this.paragraphSyle + ')';
    }

    public PlatformTextStyle(boolean z) {
        this(null, new PlatformParagraphStyle(z));
    }
}
