package com.google.inputmethod;

import androidx.compose.ui.layout.OnVisibilityChangedNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001e\u001a\u0004\b\u001f\u0010 R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/google/android/zr8;", "Lcom/google/android/uy7;", "Landroidx/compose/ui/layout/OnVisibilityChangedNode;", "", "minDurationMs", "", "minFractionVisible", "Lcom/google/android/gn6;", "viewportBounds", "Lkotlin/Function1;", "", "", "callback", "<init>", "(JFLcom/google/android/gn6;Lkotlin/jvm/functions/Function1;)V", "d", "()Landroidx/compose/ui/layout/OnVisibilityChangedNode;", "node", "e", "(Landroidx/compose/ui/layout/OnVisibilityChangedNode;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getMinDurationMs", "()J", "F", "getMinFractionVisible", "()F", "f", "Lkotlin/jvm/functions/Function1;", "getCallback", "()Lkotlin/jvm/functions/Function1;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class zr8 extends uy7<OnVisibilityChangedNode> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long minDurationMs;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final float minFractionVisible;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Function1<Boolean, Unit> callback;

    /* JADX WARN: Multi-variable type inference failed */
    public zr8(long j, float f, gn6 gn6Var, Function1<? super Boolean, Unit> function1) {
        this.minDurationMs = j;
        this.minFractionVisible = f;
        this.callback = function1;
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public OnVisibilityChangedNode a() {
        return new OnVisibilityChangedNode(this.minDurationMs, this.minFractionVisible, null, this.callback);
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(OnVisibilityChangedNode node) {
        node.v3(this.minDurationMs);
        node.w3(this.minFractionVisible);
        node.t3(this.callback);
        node.x3(null);
        node.o3();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && zr8.class == other.getClass()) {
            zr8 zr8Var = (zr8) other;
            return this.minDurationMs == zr8Var.minDurationMs && this.minFractionVisible == zr8Var.minFractionVisible && Intrinsics.e((Object) null, (Object) null) && this.callback == zr8Var.callback;
        }
        return false;
    }

    public int hashCode() {
        return (((Long.hashCode(this.minDurationMs) * 31) + Float.hashCode(this.minFractionVisible)) * 961) + this.callback.hashCode();
    }
}
