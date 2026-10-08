package com.google.inputmethod;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.m;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/node/m;", "b", "(Landroidx/compose/ui/node/LayoutNode;)Landroidx/compose/ui/node/m;", "Lcom/google/android/f43;", "a", "Lcom/google/android/f43;", "DefaultDensity", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class fo6 {
    private static final f43 a = k43.b(1.0f, 0.0f, 2, null);

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public static final m b(LayoutNode layoutNode) throws KotlinNothingValueException {
        m owner = layoutNode.getOwner();
        if (owner != null) {
            return owner;
        }
        zw5.d("LayoutNode should be attached to an owner");
        throw new KotlinNothingValueException();
    }
}
