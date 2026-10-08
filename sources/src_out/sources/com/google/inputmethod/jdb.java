package com.google.inputmethod;

import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.b;
import androidx.compose.ui.text.font.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u001b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B»\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u0014\u0012\u001e\b\u0002\u0010\u0019\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0014\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u0002H\u0016¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020\u000f2\b\u0010(\u001a\u0004\u0018\u00010'H\u0096\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0011H\u0016¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010-R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010.R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\"\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00104R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00104R\"\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R*\u0010\u0019\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0014\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00102R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006B"}, d2 = {"Lcom/google/android/jdb;", "Lcom/google/android/uy7;", "Lcom/google/android/kdb;", "Landroidx/compose/ui/text/b;", "text", "Landroidx/compose/ui/text/y;", "style", "Landroidx/compose/ui/text/font/l$b;", "fontFamilyResolver", "Lkotlin/Function1;", "Lcom/google/android/vxc;", "", "onTextLayout", "Lcom/google/android/uyc;", "overflow", "", "softWrap", "", "maxLines", "minLines", "", "Landroidx/compose/ui/text/b$d;", "Lcom/google/android/v99;", "placeholders", "Lcom/google/android/gba;", "onPlaceholderLayout", "Lcom/google/android/xdb;", "selectionController", "Lcom/google/android/ri1;", "color", "Lcom/google/android/eqc;", "autoSize", "<init>", "(Landroidx/compose/ui/text/b;Landroidx/compose/ui/text/y;Landroidx/compose/ui/text/font/l$b;Lkotlin/jvm/functions/Function1;IZIILjava/util/List;Lkotlin/jvm/functions/Function1;Lcom/google/android/xdb;Lcom/google/android/ri1;Lcom/google/android/eqc;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "d", "()Lcom/google/android/kdb;", "node", "e", "(Lcom/google/android/kdb;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroidx/compose/ui/text/b;", "Landroidx/compose/ui/text/y;", "f", "Landroidx/compose/ui/text/font/l$b;", "g", "Lkotlin/jvm/functions/Function1;", "h", "I", "i", "Z", "j", "k", "l", "Ljava/util/List;", "m", "n", "Lcom/google/android/xdb;", "o", "Lcom/google/android/ri1;", "p", "Lcom/google/android/eqc;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class jdb extends uy7<kdb> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final b text;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextStyle style;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final l.b fontFamilyResolver;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Function1<TextLayoutResult, Unit> onTextLayout;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int overflow;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean softWrap;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final int maxLines;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final int minLines;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final List<b.Range<Placeholder>> placeholders;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final Function1<List<gba>, Unit> onPlaceholderLayout;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final xdb selectionController;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final ri1 color;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final eqc autoSize;

    public /* synthetic */ jdb(b bVar, TextStyle textStyle, l.b bVar2, Function1 function1, int i, boolean z, int i2, int i3, List list, Function1 function2, xdb xdbVar, ri1 ri1Var, eqc eqcVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, textStyle, bVar2, function1, i, z, i2, i3, list, function2, xdbVar, ri1Var, eqcVar);
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public kdb a() {
        return new kdb(this.text, this.style, this.fontFamilyResolver, this.onTextLayout, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, this.onPlaceholderLayout, this.selectionController, this.color, this.autoSize, null, 8192, null);
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(kdb node) {
        node.s3(this.text, this.style, this.placeholders, this.minLines, this.maxLines, this.softWrap, this.fontFamilyResolver, this.overflow, this.onTextLayout, this.onPlaceholderLayout, this.selectionController, this.color, this.autoSize);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof jdb)) {
            return false;
        }
        jdb jdbVar = (jdb) other;
        return Intrinsics.e(this.color, jdbVar.color) && Intrinsics.e(this.text, jdbVar.text) && Intrinsics.e(this.style, jdbVar.style) && Intrinsics.e(this.placeholders, jdbVar.placeholders) && Intrinsics.e(this.fontFamilyResolver, jdbVar.fontFamilyResolver) && Intrinsics.e(this.autoSize, jdbVar.autoSize) && this.onTextLayout == jdbVar.onTextLayout && uyc.g(this.overflow, jdbVar.overflow) && this.softWrap == jdbVar.softWrap && this.maxLines == jdbVar.maxLines && this.minLines == jdbVar.minLines && this.onPlaceholderLayout == jdbVar.onPlaceholderLayout && Intrinsics.e(this.selectionController, jdbVar.selectionController);
    }

    public int hashCode() {
        int iHashCode = ((((this.text.hashCode() * 31) + this.style.hashCode()) * 31) + this.fontFamilyResolver.hashCode()) * 31;
        Function1<TextLayoutResult, Unit> function1 = this.onTextLayout;
        int iHashCode2 = (((((((((iHashCode + (function1 != null ? function1.hashCode() : 0)) * 31) + uyc.h(this.overflow)) * 31) + Boolean.hashCode(this.softWrap)) * 31) + this.maxLines) * 31) + this.minLines) * 31;
        List<b.Range<Placeholder>> list = this.placeholders;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        Function1<List<gba>, Unit> function2 = this.onPlaceholderLayout;
        int iHashCode4 = (iHashCode3 + (function2 != null ? function2.hashCode() : 0)) * 31;
        xdb xdbVar = this.selectionController;
        int iHashCode5 = (iHashCode4 + (xdbVar != null ? xdbVar.hashCode() : 0)) * 31;
        eqc eqcVar = this.autoSize;
        int iHashCode6 = (iHashCode5 + (eqcVar != null ? eqcVar.hashCode() : 0)) * 31;
        ri1 ri1Var = this.color;
        return iHashCode6 + (ri1Var != null ? ri1Var.hashCode() : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private jdb(b bVar, TextStyle textStyle, l.b bVar2, Function1<? super TextLayoutResult, Unit> function1, int i, boolean z, int i2, int i3, List<b.Range<Placeholder>> list, Function1<? super List<gba>, Unit> function2, xdb xdbVar, ri1 ri1Var, eqc eqcVar) {
        this.text = bVar;
        this.style = textStyle;
        this.fontFamilyResolver = bVar2;
        this.onTextLayout = function1;
        this.overflow = i;
        this.softWrap = z;
        this.maxLines = i2;
        this.minLines = i3;
        this.placeholders = list;
        this.onPlaceholderLayout = function2;
        this.selectionController = xdbVar;
        this.color = ri1Var;
        this.autoSize = eqcVar;
    }
}
