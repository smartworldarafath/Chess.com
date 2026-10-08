package com.google.inputmethod;

import androidx.compose.ui.node.Invalidation;
import androidx.compose.ui.node.LayoutNode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\fJ\r\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u0011\u0010\u001f\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0014¨\u0006 "}, d2 = {"Lcom/google/android/w43;", "", "", "extraAssertions", "<init>", "(Z)V", "Landroidx/compose/ui/node/LayoutNode;", "node", "affectsLookahead", "f", "(Landroidx/compose/ui/node/LayoutNode;Z)Z", "e", "(Landroidx/compose/ui/node/LayoutNode;)Z", "Landroidx/compose/ui/node/Invalidation;", "invalidation", "", "d", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/node/Invalidation;)V", "j", "h", "()Z", "i", "Lcom/google/android/u43;", "a", "Lcom/google/android/u43;", "lookaheadAndAncestorMeasureSet", "b", "lookaheadAndAncestorPlaceSet", "c", "approachSet", "g", "affectsLookaheadMeasure", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class w43 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final u43 lookaheadAndAncestorMeasureSet;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final u43 lookaheadAndAncestorPlaceSet;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final u43 approachSet;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Invalidation.values().length];
            try {
                iArr[Invalidation.LookaheadMeasurement.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Invalidation.LookaheadPlacement.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Invalidation.Measurement.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Invalidation.Placement.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public w43(boolean z) {
        this.lookaheadAndAncestorMeasureSet = new u43(z);
        this.lookaheadAndAncestorPlaceSet = new u43(z);
        this.approachSet = new u43(z);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void d(LayoutNode node, Invalidation invalidation) throws NoWhenBranchMatchedException {
        int i = a.$EnumSwitchMapping$0[invalidation.ordinal()];
        if (i == 1) {
            this.lookaheadAndAncestorMeasureSet.a(node);
            this.approachSet.a(node);
            return;
        }
        if (i == 2) {
            this.lookaheadAndAncestorPlaceSet.a(node);
            this.approachSet.a(node);
            return;
        }
        if (i == 3) {
            if (node.getLookaheadRoot() != null) {
                this.approachSet.a(node);
                return;
            } else {
                this.lookaheadAndAncestorMeasureSet.a(node);
                return;
            }
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        if (node.getLookaheadRoot() != null) {
            this.approachSet.a(node);
        } else {
            this.lookaheadAndAncestorPlaceSet.a(node);
        }
    }

    public final boolean e(LayoutNode node) {
        return this.lookaheadAndAncestorMeasureSet.b(node) || this.lookaheadAndAncestorPlaceSet.b(node) || this.approachSet.b(node);
    }

    public final boolean f(LayoutNode node, boolean affectsLookahead) {
        boolean z = node.getLookaheadRoot() == null;
        boolean z2 = this.lookaheadAndAncestorMeasureSet.b(node) || this.lookaheadAndAncestorPlaceSet.b(node);
        if (affectsLookahead) {
            return !z && z2;
        }
        return (z && z2) || this.approachSet.b(node);
    }

    public final boolean g() {
        return (this.approachSet.c() || this.lookaheadAndAncestorMeasureSet.c()) ? false : true;
    }

    public final boolean h() {
        return this.lookaheadAndAncestorMeasureSet.c() && this.approachSet.c() && this.lookaheadAndAncestorPlaceSet.c();
    }

    public final boolean i() {
        return !h();
    }

    public final boolean j(LayoutNode node) {
        return this.approachSet.e(node) || this.lookaheadAndAncestorMeasureSet.e(node) || this.lookaheadAndAncestorPlaceSet.e(node);
    }
}
