package com.google.inputmethod;

import androidx.compose.p001foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode;
import com.google.android.q22;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Be\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u001e\u0010\t\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0005\u0012\u001e\u0010\n\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0005\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001cR,\u0010\t\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001dR,\u0010\n\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\"\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001d¨\u0006 "}, d2 = {"Lcom/google/android/trc;", "Lcom/google/android/uy7;", "Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuToolbarHandlerNode;", "Lcom/google/android/p9d;", "requester", "Lkotlin/Function1;", "Lcom/google/android/q22;", "", "", "onShow", "onHide", "Lcom/google/android/kn6;", "Lcom/google/android/gba;", "computeContentBounds", "<init>", "(Lcom/google/android/p9d;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "d", "()Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuToolbarHandlerNode;", "node", "e", "(Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuToolbarHandlerNode;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/android/p9d;", "Lkotlin/jvm/functions/Function1;", "f", "g", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class trc extends uy7<TextContextMenuToolbarHandlerNode> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final p9d requester;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Function1<q22<? super Unit>, Object> onShow;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Function1<q22<? super Unit>, Object> onHide;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Function1<kn6, gba> computeContentBounds;

    /* JADX WARN: Multi-variable type inference failed */
    public trc(p9d p9dVar, Function1<? super q22<? super Unit>, ? extends Object> function1, Function1<? super q22<? super Unit>, ? extends Object> function2, Function1<? super kn6, gba> function3) {
        this.requester = p9dVar;
        this.onShow = function1;
        this.onHide = function2;
        this.computeContentBounds = function3;
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public TextContextMenuToolbarHandlerNode a() {
        return new TextContextMenuToolbarHandlerNode(this.requester, this.onShow, this.onHide, this.computeContentBounds);
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(TextContextMenuToolbarHandlerNode node) {
        node.C3(this.requester);
        node.A3(this.onShow);
        node.z3(this.onHide);
        node.y3(this.computeContentBounds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof trc)) {
            return false;
        }
        trc trcVar = (trc) other;
        return this.requester == trcVar.requester && this.onShow == trcVar.onShow && this.onHide == trcVar.onHide && this.computeContentBounds == trcVar.computeContentBounds;
    }

    public int hashCode() {
        int iHashCode = this.requester.hashCode() * 31;
        Function1<q22<? super Unit>, Object> function1 = this.onShow;
        int iHashCode2 = (iHashCode + (function1 != null ? function1.hashCode() : 0)) * 31;
        Function1<q22<? super Unit>, Object> function2 = this.onHide;
        return ((iHashCode2 + (function2 != null ? function2.hashCode() : 0)) * 31) + this.computeContentBounds.hashCode();
    }
}
