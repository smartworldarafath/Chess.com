package com.google.inputmethod;

import androidx.compose.p001foundation.text.selection.Selection;
import androidx.compose.ui.b;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001eR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\"R\u0018\u0010%\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010$R\u0017\u0010*\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b\u000f\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/google/android/xdb;", "Lcom/google/android/yea;", "", "selectableId", "Lcom/google/android/neb;", "selectionRegistrar", "Lcom/google/android/ei1;", "backgroundSelectionColor", "Lcom/google/android/g8c;", "params", "<init>", "(JLcom/google/android/neb;JLcom/google/android/g8c;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "d", "()V", "f", "e", "Lcom/google/android/vxc;", "textLayoutResult", "m", "(Lcom/google/android/vxc;)V", "Lcom/google/android/kn6;", "coordinates", "l", "(Lcom/google/android/kn6;)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "drawScope", "g", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "a", "J", "b", "Lcom/google/android/neb;", "c", "Lcom/google/android/g8c;", "Lcom/google/android/cdb;", "Lcom/google/android/cdb;", "selectable", "Landroidx/compose/ui/b;", "Landroidx/compose/ui/b;", "h", "()Landroidx/compose/ui/b;", "modifier", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class xdb implements yea {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long selectableId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final neb selectionRegistrar;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long backgroundSelectionColor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private g8c params;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private cdb selectable;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final b modifier;

    public /* synthetic */ xdb(long j, neb nebVar, long j2, g8c g8cVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, nebVar, j2, g8cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kn6 i(xdb xdbVar) {
        return xdbVar.params.getLayoutCoordinates();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kn6 j(xdb xdbVar) {
        return xdbVar.params.getLayoutCoordinates();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextLayoutResult k(xdb xdbVar) {
        return xdbVar.params.getTextLayoutResult();
    }

    @Override // com.google.inputmethod.yea
    public void d() {
        this.selectable = this.selectionRegistrar.i(new androidx.compose.p001foundation.text.selection.b(this.selectableId, new Function0() { // from class: com.google.android.udb
            public final Object invoke() {
                return xdb.j(this.a);
            }
        }, new Function0() { // from class: com.google.android.vdb
            public final Object invoke() {
                return xdb.k(this.a);
            }
        }));
    }

    @Override // com.google.inputmethod.yea
    public void e() {
        cdb cdbVar = this.selectable;
        if (cdbVar != null) {
            this.selectionRegistrar.b(cdbVar);
            this.selectable = null;
        }
    }

    @Override // com.google.inputmethod.yea
    public void f() {
        cdb cdbVar = this.selectable;
        if (cdbVar != null) {
            this.selectionRegistrar.b(cdbVar);
            this.selectable = null;
        }
    }

    public final void g(DrawScope drawScope) {
        Selection selectionB = this.selectionRegistrar.f().b(this.selectableId);
        if (selectionB == null) {
            return;
        }
        int offset = !selectionB.getHandlesCrossed() ? selectionB.getStart().getOffset() : selectionB.getEnd().getOffset();
        int offset2 = !selectionB.getHandlesCrossed() ? selectionB.getEnd().getOffset() : selectionB.getStart().getOffset();
        if (offset == offset2) {
            return;
        }
        cdb cdbVar = this.selectable;
        int iA = cdbVar != null ? cdbVar.a() : 0;
        Path pathE = this.params.e(g.j(offset, iA), g.j(offset2, iA));
        if (pathE == null) {
            return;
        }
        if (!this.params.f()) {
            DrawScope.g0(drawScope, pathE, this.backgroundSelectionColor, 0.0f, null, null, 0, 60, null);
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.d() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.d() & 4294967295L));
        int iB = gf1.INSTANCE.b();
        vg3 drawContext = drawScope.getDrawContext();
        long jD = drawContext.d();
        drawContext.b().v();
        try {
            drawContext.getTransform().b(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, iB);
            DrawScope.g0(drawScope, pathE, this.backgroundSelectionColor, 0.0f, null, null, 0, 60, null);
        } finally {
            drawContext.b().o();
            drawContext.c(jD);
        }
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final b getModifier() {
        return this.modifier;
    }

    public final void l(kn6 coordinates) {
        this.params = g8c.c(this.params, coordinates, null, 2, null);
        this.selectionRegistrar.c(this.selectableId);
    }

    public final void m(TextLayoutResult textLayoutResult) {
        TextLayoutResult textLayoutResult2 = this.params.getTextLayoutResult();
        if (textLayoutResult2 != null && !Intrinsics.e(textLayoutResult2.getLayoutInput().getText(), textLayoutResult.getLayoutInput().getText())) {
            this.selectionRegistrar.h(this.selectableId);
        }
        this.params = g8c.c(this.params, null, textLayoutResult, 1, null);
    }

    private xdb(long j, neb nebVar, long j2, g8c g8cVar) {
        this.selectableId = j;
        this.selectionRegistrar = nebVar;
        this.backgroundSelectionColor = j2;
        this.params = g8cVar;
        this.modifier = pe9.b(zdb.a(nebVar, j, new Function0() { // from class: com.google.android.wdb
            public final Object invoke() {
                return xdb.i(this.a);
            }
        }), ne9.INSTANCE.c(), false, 2, null);
    }

    public /* synthetic */ xdb(long j, neb nebVar, long j2, g8c g8cVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, nebVar, j2, (i & 8) != 0 ? g8c.INSTANCE.a() : g8cVar, null);
    }
}
