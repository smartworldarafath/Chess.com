package com.google.inputmethod;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aK\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/google/android/x23;", "node", "", "topLeft", "bottomRight", "Lcom/google/android/g16;", "windowOffset", "screenOffset", "windowSize", "Lcom/google/android/zh7;", "viewToWindowMatrix", "Lcom/google/android/nea;", "a", "(Lcom/google/android/x23;JJJJJ[F)Lcom/google/android/nea;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class s1d {
    public static final nea a(x23 x23Var, long j, long j2, long j3, long j4, long j5, float[] fArr) {
        NodeCoordinator nodeCoordinatorL = y23.l(x23Var, ni8.a(2));
        LayoutNode layoutNodeQ = y23.q(x23Var);
        if (!layoutNodeQ.x()) {
            return null;
        }
        if (layoutNodeQ.x0() == nodeCoordinatorL) {
            return new nea(j, j2, j3, j4, j5, fArr, x23Var, null);
        }
        long jF = g16.f(j);
        long jE = rn8.e((((long) Float.floatToRawIntBits(g16.k(jF))) << 32) | (((long) Float.floatToRawIntBits(g16.l(jF))) & 4294967295L));
        long jA = nodeCoordinatorL.v().a();
        long jD = h16.d(layoutNodeQ.x0().v().Q(nodeCoordinatorL, jE));
        return new nea(jD, g16.f((((long) (g16.k(jD) + ((int) (jA >> 32)))) << 32) | (((long) (g16.l(jD) + ((int) (jA & 4294967295L)))) & 4294967295L)), j3, j4, j5, fArr, x23Var, null);
    }
}
