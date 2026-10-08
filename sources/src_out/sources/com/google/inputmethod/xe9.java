package com.google.inputmethod;

import androidx.compose.ui.input.pointer.HitPathTracker;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.f;
import androidx.compose.ui.node.LayoutNode;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/google/android/xe9;", "", "Landroidx/compose/ui/node/LayoutNode;", "root", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "Lcom/google/android/ve9;", "pointerEvent", "Lcom/google/android/ug9;", "positionCalculator", "", "isInBounds", "Lcom/google/android/un9;", "b", "(Lcom/google/android/ve9;Lcom/google/android/ug9;Z)I", "", "c", "()V", "a", "Landroidx/compose/ui/node/LayoutNode;", "getRoot", "()Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/input/pointer/HitPathTracker;", "Landroidx/compose/ui/input/pointer/HitPathTracker;", "hitPathTracker", "Lcom/google/android/ue9;", "Lcom/google/android/ue9;", "pointerInputChangeEventProducer", "Lcom/google/android/hd5;", "d", "Lcom/google/android/hd5;", "hitResult", "e", "Z", "isProcessing", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class xe9 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final LayoutNode root;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final HitPathTracker hitPathTracker;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final ue9 pointerInputChangeEventProducer = new ue9();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final hd5 hitResult = new hd5();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean isProcessing;

    public xe9(LayoutNode layoutNode) {
        this.root = layoutNode;
        this.hitPathTracker = new HitPathTracker(layoutNode.v());
    }

    public final void a() {
        this.hitPathTracker.c();
    }

    public final int b(ve9 pointerEvent, ug9 positionCalculator, boolean isInBounds) {
        int i;
        boolean z;
        boolean z2;
        if (this.isProcessing) {
            return ye9.a(false, false, false);
        }
        boolean z3 = true;
        try {
            this.isProcessing = true;
            o56 o56VarB = this.pointerInputChangeEventProducer.b(pointerEvent, positionCalculator);
            int iK = o56VarB.b().k();
            while (true) {
                if (i >= iK) {
                    z = true;
                    break;
                }
                PointerInputChange pointerInputChangeL = o56VarB.b().l(i);
                i = (pointerInputChangeL.getPressed() || pointerInputChangeL.getPreviousPressed()) ? 0 : i + 1;
                z = false;
                break;
            }
            int iK2 = o56VarB.b().k();
            for (int i2 = 0; i2 < iK2; i2++) {
                PointerInputChange pointerInputChangeL2 = o56VarB.b().l(i2);
                if (z || f.b(pointerInputChangeL2)) {
                    LayoutNode.N0(this.root, pointerInputChangeL2.getPosition(), this.hitResult, pointerInputChangeL2.getType(), false, 8, null);
                    if (!this.hitResult.isEmpty()) {
                        this.hitPathTracker.b(pointerInputChangeL2.getId(), this.hitResult, f.b(pointerInputChangeL2));
                        this.hitResult.clear();
                    }
                }
            }
            boolean zD = this.hitPathTracker.d(o56VarB, isInBounds);
            if (o56VarB.getSuppressMovementConsumption()) {
                z2 = false;
                break;
            }
            int iK3 = o56VarB.b().k();
            int i3 = 0;
            while (true) {
                if (i3 >= iK3) {
                    z2 = false;
                    break;
                }
                PointerInputChange pointerInputChangeL3 = o56VarB.b().l(i3);
                if (f.k(pointerInputChangeL3) && pointerInputChangeL3.q()) {
                    z2 = true;
                    break;
                }
                i3++;
            }
            int iK4 = o56VarB.b().k();
            int i4 = 0;
            while (true) {
                if (i4 >= iK4) {
                    z3 = false;
                    break;
                }
                if (o56VarB.b().l(i4).q()) {
                    break;
                }
                i4++;
            }
            return ye9.a(zD, z2, z3);
        } finally {
            this.isProcessing = false;
        }
    }

    public final void c() {
        if (this.isProcessing) {
            return;
        }
        this.pointerInputChangeEventProducer.a();
        this.hitPathTracker.e();
    }
}
