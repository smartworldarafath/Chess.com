package com.google.inputmethod;

import androidx.compose.p002material3.TabIndicatorOffsetNode;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.google.android.dkc, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR#\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0014\u0010\"\u001a\u0004\b#\u0010\u001aR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lcom/google/android/dkc;", "Lcom/google/android/uy7;", "Landroidx/compose/material3/TabIndicatorOffsetNode;", "Lcom/google/android/q6c;", "", "Lcom/google/android/nkc;", "tabPositionsState", "", "selectedTabIndex", "", "followContentSize", "Lcom/google/android/xa4;", "Lcom/google/android/ff3;", "animationSpec", "<init>", "(Lcom/google/android/q6c;IZLcom/google/android/xa4;)V", "d", "()Landroidx/compose/material3/TabIndicatorOffsetNode;", "node", "", "e", "(Landroidx/compose/material3/TabIndicatorOffsetNode;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/google/android/q6c;", "getTabPositionsState", "()Lcom/google/android/q6c;", "I", "getSelectedTabIndex", "f", "Z", "getFollowContentSize", "()Z", "g", "Lcom/google/android/xa4;", "getAnimationSpec", "()Lcom/google/android/xa4;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TabIndicatorModifier extends uy7<TabIndicatorOffsetNode> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final q6c<List<TabPosition>> tabPositionsState;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final int selectedTabIndex;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final boolean followContentSize;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private final xa4<ff3> animationSpec;

    /* JADX WARN: Multi-variable type inference failed */
    public TabIndicatorModifier(q6c<? extends List<TabPosition>> q6cVar, int i, boolean z, xa4<ff3> xa4Var) {
        this.tabPositionsState = q6cVar;
        this.selectedTabIndex = i;
        this.followContentSize = z;
        this.animationSpec = xa4Var;
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public TabIndicatorOffsetNode a() {
        return new TabIndicatorOffsetNode(this.tabPositionsState, this.selectedTabIndex, this.followContentSize, this.animationSpec);
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(TabIndicatorOffsetNode node) {
        node.u3(this.tabPositionsState);
        node.t3(this.selectedTabIndex);
        node.s3(this.followContentSize);
        node.r3(this.animationSpec);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TabIndicatorModifier)) {
            return false;
        }
        TabIndicatorModifier tabIndicatorModifier = (TabIndicatorModifier) other;
        return Intrinsics.e(this.tabPositionsState, tabIndicatorModifier.tabPositionsState) && this.selectedTabIndex == tabIndicatorModifier.selectedTabIndex && this.followContentSize == tabIndicatorModifier.followContentSize && Intrinsics.e(this.animationSpec, tabIndicatorModifier.animationSpec);
    }

    public int hashCode() {
        return (((((this.tabPositionsState.hashCode() * 31) + Integer.hashCode(this.selectedTabIndex)) * 31) + Boolean.hashCode(this.followContentSize)) * 31) + this.animationSpec.hashCode();
    }

    public String toString() {
        return "TabIndicatorModifier(tabPositionsState=" + this.tabPositionsState + ", selectedTabIndex=" + this.selectedTabIndex + ", followContentSize=" + this.followContentSize + ", animationSpec=" + this.animationSpec + ')';
    }
}
