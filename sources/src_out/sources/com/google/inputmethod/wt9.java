package com.google.inputmethod;

import androidx.compose.p002material3.pulltorefresh.PullToRefreshModifierNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u0004\u0010\u001cR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001cR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lcom/google/android/wt9;", "Lcom/google/android/uy7;", "Landroidx/compose/material3/pulltorefresh/PullToRefreshModifierNode;", "", "isRefreshing", "Lkotlin/Function0;", "", "onRefresh", "enabled", "Lcom/google/android/eu9;", "state", "Lcom/google/android/ff3;", "threshold", "<init>", "(ZLkotlin/jvm/functions/Function0;ZLcom/google/android/eu9;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "d", "()Landroidx/compose/material3/pulltorefresh/PullToRefreshModifierNode;", "node", "e", "(Landroidx/compose/material3/pulltorefresh/PullToRefreshModifierNode;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Z", "()Z", "Lkotlin/jvm/functions/Function0;", "getOnRefresh", "()Lkotlin/jvm/functions/Function0;", "f", "getEnabled", "g", "Lcom/google/android/eu9;", "getState", "()Lcom/google/android/eu9;", "h", "F", "getThreshold-D9Ej5fM", "()F", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class wt9 extends uy7<PullToRefreshModifierNode> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isRefreshing;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Function0<Unit> onRefresh;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean enabled;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final eu9 state;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final float threshold;

    public /* synthetic */ wt9(boolean z, Function0 function0, boolean z2, eu9 eu9Var, float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, function0, z2, eu9Var, f);
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public PullToRefreshModifierNode a() {
        return new PullToRefreshModifierNode(this.isRefreshing, this.onRefresh, this.enabled, this.state, this.threshold, null);
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(PullToRefreshModifierNode node) {
        node.L3(this.onRefresh);
        node.K3(this.enabled);
        node.N3(this.state);
        node.O3(this.threshold);
        boolean isRefreshing = node.getIsRefreshing();
        boolean z = this.isRefreshing;
        if (isRefreshing != z) {
            node.M3(z);
            node.Q3();
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof wt9)) {
            return false;
        }
        wt9 wt9Var = (wt9) other;
        return this.isRefreshing == wt9Var.isRefreshing && this.enabled == wt9Var.enabled && this.onRefresh == wt9Var.onRefresh && Intrinsics.e(this.state, wt9Var.state) && ff3.k(this.threshold, wt9Var.threshold);
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.isRefreshing) * 31) + Boolean.hashCode(this.enabled)) * 31) + this.onRefresh.hashCode()) * 31) + this.state.hashCode()) * 31) + ff3.l(this.threshold);
    }

    private wt9(boolean z, Function0<Unit> function0, boolean z2, eu9 eu9Var, float f) {
        this.isRefreshing = z;
        this.onRefresh = function0;
        this.enabled = z2;
        this.state = eu9Var;
        this.threshold = f;
    }
}
