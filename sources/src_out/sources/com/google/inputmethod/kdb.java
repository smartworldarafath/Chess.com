package com.google.inputmethod;

import androidx.compose.ui.layout.j;
import androidx.compose.ui.node.c;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.b;
import androidx.compose.ui.text.font.l;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004BÓ\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u0016\u0012\u001e\b\u0002\u0010\u001b\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\u0016\b\u0002\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\r2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u0013\u0010+\u001a\u00020\r*\u00020*H\u0016¢\u0006\u0004\b+\u0010,J#\u00103\u001a\u000202*\u00020-2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b3\u00104J#\u00108\u001a\u00020\u0013*\u0002052\u0006\u0010/\u001a\u0002062\u0006\u00107\u001a\u00020\u0013H\u0016¢\u0006\u0004\b8\u00109J#\u0010;\u001a\u00020\u0013*\u0002052\u0006\u0010/\u001a\u0002062\u0006\u0010:\u001a\u00020\u0013H\u0016¢\u0006\u0004\b;\u00109J#\u0010<\u001a\u00020\u0013*\u0002052\u0006\u0010/\u001a\u0002062\u0006\u00107\u001a\u00020\u0013H\u0016¢\u0006\u0004\b<\u00109J#\u0010=\u001a\u00020\u0013*\u0002052\u0006\u0010/\u001a\u0002062\u0006\u0010:\u001a\u00020\u0013H\u0016¢\u0006\u0004\b=\u00109J\u00ad\u0001\u0010?\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0014\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u00162\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\u001c\u0010\u001b\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010>\u001a\u0004\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b?\u0010@R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR$\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010G\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010FR\u0014\u0010J\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010I¨\u0006K"}, d2 = {"Lcom/google/android/kdb;", "Lcom/google/android/k33;", "Landroidx/compose/ui/node/c;", "Lcom/google/android/yg3;", "Lcom/google/android/dz4;", "Landroidx/compose/ui/text/b;", "text", "Landroidx/compose/ui/text/y;", "style", "Landroidx/compose/ui/text/font/l$b;", "fontFamilyResolver", "Lkotlin/Function1;", "Lcom/google/android/vxc;", "", "onTextLayout", "Lcom/google/android/uyc;", "overflow", "", "softWrap", "", "maxLines", "minLines", "", "Landroidx/compose/ui/text/b$d;", "Lcom/google/android/v99;", "placeholders", "Lcom/google/android/gba;", "onPlaceholderLayout", "Lcom/google/android/xdb;", "selectionController", "Lcom/google/android/ri1;", "overrideColor", "Lcom/google/android/eqc;", "autoSize", "Lcom/google/android/mpc$a;", "onShowTranslation", "<init>", "(Landroidx/compose/ui/text/b;Landroidx/compose/ui/text/y;Landroidx/compose/ui/text/font/l$b;Lkotlin/jvm/functions/Function1;IZIILjava/util/List;Lkotlin/jvm/functions/Function1;Lcom/google/android/xdb;Lcom/google/android/ri1;Lcom/google/android/eqc;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lcom/google/android/kn6;", "coordinates", "D", "(Lcom/google/android/kn6;)V", "Lcom/google/android/fz1;", "j", "(Lcom/google/android/fz1;)V", "Landroidx/compose/ui/layout/j;", "Lcom/google/android/dj7;", "measurable", "Lcom/google/android/kx1;", "constraints", "Lcom/google/android/fj7;", "b", "(Landroidx/compose/ui/layout/j;Lcom/google/android/dj7;J)Lcom/google/android/fj7;", "Lcom/google/android/h66;", "Lcom/google/android/f66;", "height", "z", "(Lcom/google/android/h66;Lcom/google/android/f66;I)I", "width", "m", "t", "i", "color", "s3", "(Landroidx/compose/ui/text/b;Landroidx/compose/ui/text/y;Ljava/util/List;IIZLandroidx/compose/ui/text/font/l$b;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/google/android/xdb;Lcom/google/android/ri1;Lcom/google/android/eqc;)V", "r", "Lcom/google/android/xdb;", "s", "Lkotlin/jvm/functions/Function1;", "Lcom/google/android/mpc;", "Lcom/google/android/mpc;", "textAnnotatedStringNode", "Q2", "()Z", "shouldAutoInvalidate", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class kdb extends k33 implements c, yg3, dz4 {

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private xdb selectionController;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private Function1<? super mpc.TextSubstitutionValue, Unit> onShowTranslation;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final mpc textAnnotatedStringNode;

    public /* synthetic */ kdb(b bVar, TextStyle textStyle, l.b bVar2, Function1 function1, int i, boolean z, int i2, int i3, List list, Function1 function2, xdb xdbVar, ri1 ri1Var, eqc eqcVar, Function1 function3, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, textStyle, bVar2, function1, i, z, i2, i3, list, function2, xdbVar, ri1Var, eqcVar, function3);
    }

    @Override // com.google.inputmethod.dz4
    public void D(kn6 coordinates) {
        xdb xdbVar = this.selectionController;
        if (xdbVar != null) {
            xdbVar.l(coordinates);
        }
    }

    @Override // androidx.compose.ui.b.c
    /* JADX INFO: renamed from: Q2 */
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.node.c
    public fj7 b(j jVar, dj7 dj7Var, long j) {
        return this.textAnnotatedStringNode.D3(jVar, dj7Var, j);
    }

    @Override // androidx.compose.ui.node.c
    public int i(h66 h66Var, f66 f66Var, int i) {
        return this.textAnnotatedStringNode.B3(h66Var, f66Var, i);
    }

    @Override // com.google.inputmethod.yg3
    public void j(fz1 fz1Var) {
        this.textAnnotatedStringNode.x3(fz1Var);
    }

    @Override // androidx.compose.ui.node.c
    public int m(h66 h66Var, f66 f66Var, int i) {
        return this.textAnnotatedStringNode.F3(h66Var, f66Var, i);
    }

    public final void s3(b text, TextStyle style, List<b.Range<Placeholder>> placeholders, int minLines, int maxLines, boolean softWrap, l.b fontFamilyResolver, int overflow, Function1<? super TextLayoutResult, Unit> onTextLayout, Function1<? super List<gba>, Unit> onPlaceholderLayout, xdb selectionController, ri1 color, eqc autoSize) {
        mpc mpcVar = this.textAnnotatedStringNode;
        mpcVar.w3(mpcVar.J3(color, style), this.textAnnotatedStringNode.L3(text), this.textAnnotatedStringNode.K3(style, placeholders, minLines, maxLines, softWrap, fontFamilyResolver, overflow, autoSize), this.textAnnotatedStringNode.I3(onTextLayout, onPlaceholderLayout, selectionController, this.onShowTranslation));
        this.selectionController = selectionController;
        bo6.b(this);
    }

    @Override // androidx.compose.ui.node.c
    public int t(h66 h66Var, f66 f66Var, int i) {
        return this.textAnnotatedStringNode.C3(h66Var, f66Var, i);
    }

    @Override // androidx.compose.ui.node.c
    public int z(h66 h66Var, f66 f66Var, int i) {
        return this.textAnnotatedStringNode.G3(h66Var, f66Var, i);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private kdb(b bVar, TextStyle textStyle, l.b bVar2, Function1<? super TextLayoutResult, Unit> function1, int i, boolean z, int i2, int i3, List<b.Range<Placeholder>> list, Function1<? super List<gba>, Unit> function2, xdb xdbVar, ri1 ri1Var, eqc eqcVar, Function1<? super mpc.TextSubstitutionValue, Unit> function3) throws KotlinNothingValueException {
        this.selectionController = xdbVar;
        this.onShowTranslation = function3;
        this.textAnnotatedStringNode = (mpc) m3(new mpc(bVar, textStyle, bVar2, function1, i, z, i2, i3, list, function2, this.selectionController, ri1Var, eqcVar, this.onShowTranslation, null));
        if (this.selectionController != null) {
            return;
        }
        cx5.b("Do not use SelectionCapableStaticTextModifier unless selectionController != null");
        throw new KotlinNothingValueException();
    }

    public /* synthetic */ kdb(b bVar, TextStyle textStyle, l.b bVar2, Function1 function1, int i, boolean z, int i2, int i3, List list, Function1 function2, xdb xdbVar, ri1 ri1Var, eqc eqcVar, Function1 function3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, textStyle, bVar2, (i4 & 8) != 0 ? null : function1, (i4 & 16) != 0 ? uyc.INSTANCE.a() : i, (i4 & 32) != 0 ? true : z, (i4 & 64) != 0 ? Integer.MAX_VALUE : i2, (i4 & 128) != 0 ? 1 : i3, (i4 & 256) != 0 ? null : list, (i4 & 512) != 0 ? null : function2, (i4 & 1024) != 0 ? null : xdbVar, (i4 & 2048) != 0 ? null : ri1Var, (i4 & 4096) != 0 ? null : eqcVar, (i4 & 8192) != 0 ? null : function3, null);
    }
}
