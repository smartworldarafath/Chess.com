package com.google.inputmethod;

import androidx.compose.ui.node.NodeCoordinator;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0011\u0010\u0007\u001a\u00020\u0006*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\t\u001a\u00020\u0006*\u00020\u0000H\u0007¢\u0006\u0004\b\t\u0010\b\u001a\u001b\u0010\f\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a\u0011\u0010\u000e\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u0003\u001a\u0011\u0010\u000f\u001a\u00020\u0006*\u00020\u0000¢\u0006\u0004\b\u000f\u0010\b\u001a\u0011\u0010\u0010\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/google/android/kn6;", "Lcom/google/android/rn8;", "h", "(Lcom/google/android/kn6;)J", "i", "j", "Lcom/google/android/gba;", "b", "(Lcom/google/android/kn6;)Lcom/google/android/gba;", "c", "", "clipBounds", "d", "(Lcom/google/android/kn6;Z)Lcom/google/android/gba;", "g", "a", "f", "(Lcom/google/android/kn6;)Lcom/google/android/kn6;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ln6 {
    public static final gba a(kn6 kn6Var) {
        gba gbaVarW;
        kn6 kn6VarL = kn6Var.L();
        return (kn6VarL == null || (gbaVarW = kn6.w(kn6VarL, kn6Var, false, 2, null)) == null) ? new gba(0.0f, 0.0f, (int) (kn6Var.a() >> 32), (int) (kn6Var.a() & 4294967295L)) : gbaVarW;
    }

    public static final gba b(kn6 kn6Var) {
        return kn6.w(f(kn6Var), kn6Var, false, 2, null);
    }

    public static final gba d(kn6 kn6Var, boolean z) {
        kn6 kn6VarF = f(kn6Var);
        float fA = (int) (kn6VarF.a() >> 32);
        float fA2 = (int) (kn6VarF.a() & 4294967295L);
        gba gbaVarR = kn6VarF.R(kn6Var, z);
        float left = gbaVarR.getLeft();
        if (z) {
            if (left < 0.0f) {
                left = 0.0f;
            }
            if (left > fA) {
                left = fA;
            }
        }
        float top = gbaVarR.getTop();
        if (z) {
            if (top < 0.0f) {
                top = 0.0f;
            }
            if (top > fA2) {
                top = fA2;
            }
        }
        if (z) {
            float right = gbaVarR.getRight();
            if (right < 0.0f) {
                right = 0.0f;
            }
            if (right <= fA) {
                fA = right;
            }
        } else {
            fA = gbaVarR.getRight();
        }
        if (z) {
            float bottom = gbaVarR.getBottom();
            float f = bottom >= 0.0f ? bottom : 0.0f;
            if (f <= fA2) {
                fA2 = f;
            }
        } else {
            fA2 = gbaVarR.getBottom();
        }
        if (left == fA || top == fA2) {
            return gba.INSTANCE.a();
        }
        long jD = kn6VarF.D(rn8.e((((long) Float.floatToRawIntBits(left)) << 32) | (((long) Float.floatToRawIntBits(top)) & 4294967295L)));
        long jD2 = kn6VarF.D(rn8.e((((long) Float.floatToRawIntBits(fA)) << 32) | (((long) Float.floatToRawIntBits(top)) & 4294967295L)));
        long jD3 = kn6VarF.D(rn8.e((((long) Float.floatToRawIntBits(fA)) << 32) | (((long) Float.floatToRawIntBits(fA2)) & 4294967295L)));
        long jD4 = kn6VarF.D(rn8.e((((long) Float.floatToRawIntBits(fA2)) & 4294967295L) | (((long) Float.floatToRawIntBits(left)) << 32)));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jD >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jD2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jD4 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jD3 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jD & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jD2 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jD4 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jD3 & 4294967295L));
        return new gba(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    public static /* synthetic */ gba e(kn6 kn6Var, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return d(kn6Var, z);
    }

    public static final kn6 f(kn6 kn6Var) {
        kn6 kn6Var2;
        kn6 kn6VarL = kn6Var.L();
        while (true) {
            kn6 kn6Var3 = kn6VarL;
            kn6Var2 = kn6Var;
            kn6Var = kn6Var3;
            if (kn6Var == null) {
                break;
            }
            kn6VarL = kn6Var.L();
        }
        NodeCoordinator nodeCoordinator = kn6Var2 instanceof NodeCoordinator ? (NodeCoordinator) kn6Var2 : null;
        if (nodeCoordinator == null) {
            return kn6Var2;
        }
        NodeCoordinator nodeCoordinatorM3 = nodeCoordinator.getWrappedBy();
        while (true) {
            NodeCoordinator nodeCoordinator2 = nodeCoordinatorM3;
            NodeCoordinator nodeCoordinator3 = nodeCoordinator;
            nodeCoordinator = nodeCoordinator2;
            if (nodeCoordinator == null) {
                return nodeCoordinator3;
            }
            nodeCoordinatorM3 = nodeCoordinator.getWrappedBy();
        }
    }

    public static final long g(kn6 kn6Var) {
        kn6 kn6VarL = kn6Var.L();
        return kn6VarL != null ? kn6VarL.Q(kn6Var, rn8.INSTANCE.c()) : rn8.INSTANCE.c();
    }

    public static final long h(kn6 kn6Var) {
        return kn6Var.N(rn8.INSTANCE.c());
    }

    public static final long i(kn6 kn6Var) {
        return kn6Var.D(rn8.INSTANCE.c());
    }

    public static final long j(kn6 kn6Var) {
        return kn6Var.m(rn8.INSTANCE.c());
    }
}
