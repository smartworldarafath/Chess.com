package com.google.inputmethod;

import androidx.compose.ui.draw.BlockDropShadowNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/google/android/yo0;", "Lcom/google/android/uy7;", "Landroidx/compose/ui/draw/BlockDropShadowNode;", "Lcom/google/android/xkb;", "shape", "Lkotlin/Function1;", "Lcom/google/android/nj3;", "", "block", "<init>", "(Lcom/google/android/xkb;Lkotlin/jvm/functions/Function1;)V", "d", "()Landroidx/compose/ui/draw/BlockDropShadowNode;", "node", "e", "(Landroidx/compose/ui/draw/BlockDropShadowNode;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/android/xkb;", "getShape", "()Lcom/google/android/xkb;", "Lkotlin/jvm/functions/Function1;", "getBlock", "()Lkotlin/jvm/functions/Function1;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class yo0 extends uy7<BlockDropShadowNode> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final xkb shape;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Function1<nj3, Unit> block;

    /* JADX WARN: Multi-variable type inference failed */
    public yo0(xkb xkbVar, Function1<? super nj3, Unit> function1) {
        this.shape = xkbVar;
        this.block = function1;
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public BlockDropShadowNode a() {
        return new BlockDropShadowNode(this.shape, this.block);
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(BlockDropShadowNode node) {
        node.x3(this.shape, this.block);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof yo0)) {
            return false;
        }
        yo0 yo0Var = (yo0) other;
        return Intrinsics.e(this.shape, yo0Var.shape) && this.block == yo0Var.block;
    }

    public int hashCode() {
        return (this.shape.hashCode() * 31) + this.block.hashCode();
    }
}
