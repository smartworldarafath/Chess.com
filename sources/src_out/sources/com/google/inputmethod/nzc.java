package com.google.inputmethod;

import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.l;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BS\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010 R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010!R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010%R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010%R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lcom/google/android/nzc;", "Lcom/google/android/uy7;", "Lcom/google/android/tzc;", "", "text", "Landroidx/compose/ui/text/y;", "style", "Landroidx/compose/ui/text/font/l$b;", "fontFamilyResolver", "Lcom/google/android/uyc;", "overflow", "", "softWrap", "", "maxLines", "minLines", "Lcom/google/android/ri1;", "color", "<init>", "(Ljava/lang/String;Landroidx/compose/ui/text/y;Landroidx/compose/ui/text/font/l$b;IZIILcom/google/android/ri1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "d", "()Lcom/google/android/tzc;", "node", "", "e", "(Lcom/google/android/tzc;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Ljava/lang/String;", "Landroidx/compose/ui/text/y;", "f", "Landroidx/compose/ui/text/font/l$b;", "g", "I", "h", "Z", "i", "j", "k", "Lcom/google/android/ri1;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class nzc extends uy7<tzc> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String text;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextStyle style;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final l.b fontFamilyResolver;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int overflow;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean softWrap;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final int maxLines;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final int minLines;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final ri1 color;

    public /* synthetic */ nzc(String str, TextStyle textStyle, l.b bVar, int i, boolean z, int i2, int i3, ri1 ri1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textStyle, bVar, i, z, i2, i3, ri1Var);
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public tzc a() {
        return new tzc(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.color, null);
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(tzc node) {
        node.w3(node.E3(this.color, this.style), node.G3(this.text), node.F3(this.style, this.minLines, this.maxLines, this.softWrap, this.fontFamilyResolver, this.overflow));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof nzc)) {
            return false;
        }
        nzc nzcVar = (nzc) other;
        return Intrinsics.e(this.color, nzcVar.color) && Intrinsics.e(this.text, nzcVar.text) && Intrinsics.e(this.style, nzcVar.style) && Intrinsics.e(this.fontFamilyResolver, nzcVar.fontFamilyResolver) && uyc.g(this.overflow, nzcVar.overflow) && this.softWrap == nzcVar.softWrap && this.maxLines == nzcVar.maxLines && this.minLines == nzcVar.minLines;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.text.hashCode() * 31) + this.style.hashCode()) * 31) + this.fontFamilyResolver.hashCode()) * 31) + uyc.h(this.overflow)) * 31) + Boolean.hashCode(this.softWrap)) * 31) + this.maxLines) * 31) + this.minLines) * 31;
        ri1 ri1Var = this.color;
        return iHashCode + (ri1Var != null ? ri1Var.hashCode() : 0);
    }

    private nzc(String str, TextStyle textStyle, l.b bVar, int i, boolean z, int i2, int i3, ri1 ri1Var) {
        this.text = str;
        this.style = textStyle;
        this.fontFamilyResolver = bVar;
        this.overflow = i;
        this.softWrap = z;
        this.maxLines = i2;
        this.minLines = i3;
        this.color = ri1Var;
    }
}
