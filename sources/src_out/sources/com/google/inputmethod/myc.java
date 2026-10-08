package com.google.inputmethod;

import androidx.compose.ui.text.SpanStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/google/android/myc;", "", "Landroidx/compose/ui/text/r;", "style", "focusedStyle", "hoveredStyle", "pressedStyle", "<init>", "(Landroidx/compose/ui/text/r;Landroidx/compose/ui/text/r;Landroidx/compose/ui/text/r;Landroidx/compose/ui/text/r;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Landroidx/compose/ui/text/r;", "d", "()Landroidx/compose/ui/text/r;", "b", "c", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class myc {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final SpanStyle style;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final SpanStyle focusedStyle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final SpanStyle hoveredStyle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final SpanStyle pressedStyle;

    public myc() {
        this(null, null, null, null, 15, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final SpanStyle getFocusedStyle() {
        return this.focusedStyle;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final SpanStyle getHoveredStyle() {
        return this.hoveredStyle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final SpanStyle getPressedStyle() {
        return this.pressedStyle;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final SpanStyle getStyle() {
        return this.style;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof myc)) {
            return false;
        }
        myc mycVar = (myc) other;
        return Intrinsics.e(this.style, mycVar.style) && Intrinsics.e(this.focusedStyle, mycVar.focusedStyle) && Intrinsics.e(this.hoveredStyle, mycVar.hoveredStyle) && Intrinsics.e(this.pressedStyle, mycVar.pressedStyle);
    }

    public int hashCode() {
        SpanStyle rVar = this.style;
        int iHashCode = (rVar != null ? rVar.hashCode() : 0) * 31;
        SpanStyle rVar2 = this.focusedStyle;
        int iHashCode2 = (iHashCode + (rVar2 != null ? rVar2.hashCode() : 0)) * 31;
        SpanStyle rVar3 = this.hoveredStyle;
        int iHashCode3 = (iHashCode2 + (rVar3 != null ? rVar3.hashCode() : 0)) * 31;
        SpanStyle rVar4 = this.pressedStyle;
        return iHashCode3 + (rVar4 != null ? rVar4.hashCode() : 0);
    }

    public myc(SpanStyle rVar, SpanStyle rVar2, SpanStyle rVar3, SpanStyle rVar4) {
        this.style = rVar;
        this.focusedStyle = rVar2;
        this.hoveredStyle = rVar3;
        this.pressedStyle = rVar4;
    }

    public /* synthetic */ myc(SpanStyle rVar, SpanStyle rVar2, SpanStyle rVar3, SpanStyle rVar4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : rVar, (i & 2) != 0 ? null : rVar2, (i & 4) != 0 ? null : rVar3, (i & 8) != 0 ? null : rVar4);
    }
}
