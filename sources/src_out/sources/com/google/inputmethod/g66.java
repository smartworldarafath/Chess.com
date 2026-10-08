package com.google.inputmethod;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\f\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\u000bJ+\u0010\u000e\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000bJ+\u0010\u000f\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u000bJ+\u0010\u0010\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u000bJ+\u0010\u0011\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u000bJ+\u0010\u0012\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u000bJ+\u0010\u0013\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/google/android/g66;", "", "<init>", "()V", "", "Lcom/google/android/f66;", "measurables", "", "availableHeight", "mainAxisSpacing", "d", "(Ljava/util/List;II)I", "h", "availableWidth", "c", "g", "b", "f", "a", "e", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g66 {
    public static final g66 a = new g66();

    private g66() {
    }

    public final int a(List<? extends f66> measurables, int availableWidth, int mainAxisSpacing) {
        if (measurables.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((measurables.size() - 1) * mainAxisSpacing, availableWidth);
        int size = measurables.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i = 0; i < size; i++) {
            f66 f66Var = measurables.get(i);
            float fE = cra.e(cra.d(f66Var));
            if (fE == 0.0f) {
                int iMin2 = Math.min(f66Var.q0(Integer.MAX_VALUE), availableWidth == Integer.MAX_VALUE ? Integer.MAX_VALUE : availableWidth - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, f66Var.W(iMin2));
            } else if (fE > 0.0f) {
                f += fE;
            }
        }
        int iRound = f == 0.0f ? 0 : availableWidth == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(availableWidth - iMin, 0) / f);
        int size2 = measurables.size();
        for (int i2 = 0; i2 < size2; i2++) {
            f66 f66Var2 = measurables.get(i2);
            float fE2 = cra.e(cra.d(f66Var2));
            if (fE2 > 0.0f) {
                iMax = Math.max(iMax, f66Var2.W(iRound != Integer.MAX_VALUE ? Math.round(iRound * fE2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final int b(List<? extends f66> measurables, int availableHeight, int mainAxisSpacing) {
        if (measurables.isEmpty()) {
            return 0;
        }
        int size = measurables.size();
        int iMax = 0;
        int i = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            f66 f66Var = measurables.get(i2);
            float fE = cra.e(cra.d(f66Var));
            int iQ0 = f66Var.q0(availableHeight);
            if (fE == 0.0f) {
                i += iQ0;
            } else if (fE > 0.0f) {
                f += fE;
                iMax = Math.max(iMax, Math.round(iQ0 / fE));
            }
        }
        return Math.round(iMax * f) + i + ((measurables.size() - 1) * mainAxisSpacing);
    }

    public final int c(List<? extends f66> measurables, int availableWidth, int mainAxisSpacing) {
        if (measurables.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((measurables.size() - 1) * mainAxisSpacing, availableWidth);
        int size = measurables.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i = 0; i < size; i++) {
            f66 f66Var = measurables.get(i);
            float fE = cra.e(cra.d(f66Var));
            if (fE == 0.0f) {
                int iMin2 = Math.min(f66Var.q0(Integer.MAX_VALUE), availableWidth == Integer.MAX_VALUE ? Integer.MAX_VALUE : availableWidth - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, f66Var.d0(iMin2));
            } else if (fE > 0.0f) {
                f += fE;
            }
        }
        int iRound = f == 0.0f ? 0 : availableWidth == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(availableWidth - iMin, 0) / f);
        int size2 = measurables.size();
        for (int i2 = 0; i2 < size2; i2++) {
            f66 f66Var2 = measurables.get(i2);
            float fE2 = cra.e(cra.d(f66Var2));
            if (fE2 > 0.0f) {
                iMax = Math.max(iMax, f66Var2.d0(iRound != Integer.MAX_VALUE ? Math.round(iRound * fE2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final int d(List<? extends f66> measurables, int availableHeight, int mainAxisSpacing) {
        if (measurables.isEmpty()) {
            return 0;
        }
        int size = measurables.size();
        int iMax = 0;
        int i = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            f66 f66Var = measurables.get(i2);
            float fE = cra.e(cra.d(f66Var));
            int iO0 = f66Var.o0(availableHeight);
            if (fE == 0.0f) {
                i += iO0;
            } else if (fE > 0.0f) {
                f += fE;
                iMax = Math.max(iMax, Math.round(iO0 / fE));
            }
        }
        return Math.round(iMax * f) + i + ((measurables.size() - 1) * mainAxisSpacing);
    }

    public final int e(List<? extends f66> measurables, int availableWidth, int mainAxisSpacing) {
        if (measurables.isEmpty()) {
            return 0;
        }
        int size = measurables.size();
        int iMax = 0;
        int i = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            f66 f66Var = measurables.get(i2);
            float fE = cra.e(cra.d(f66Var));
            int iW = f66Var.W(availableWidth);
            if (fE == 0.0f) {
                i += iW;
            } else if (fE > 0.0f) {
                f += fE;
                iMax = Math.max(iMax, Math.round(iW / fE));
            }
        }
        return Math.round(iMax * f) + i + ((measurables.size() - 1) * mainAxisSpacing);
    }

    public final int f(List<? extends f66> measurables, int availableHeight, int mainAxisSpacing) {
        if (measurables.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((measurables.size() - 1) * mainAxisSpacing, availableHeight);
        int size = measurables.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i = 0; i < size; i++) {
            f66 f66Var = measurables.get(i);
            float fE = cra.e(cra.d(f66Var));
            if (fE == 0.0f) {
                int iMin2 = Math.min(f66Var.W(Integer.MAX_VALUE), availableHeight == Integer.MAX_VALUE ? Integer.MAX_VALUE : availableHeight - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, f66Var.q0(iMin2));
            } else if (fE > 0.0f) {
                f += fE;
            }
        }
        int iRound = f == 0.0f ? 0 : availableHeight == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(availableHeight - iMin, 0) / f);
        int size2 = measurables.size();
        for (int i2 = 0; i2 < size2; i2++) {
            f66 f66Var2 = measurables.get(i2);
            float fE2 = cra.e(cra.d(f66Var2));
            if (fE2 > 0.0f) {
                iMax = Math.max(iMax, f66Var2.q0(iRound != Integer.MAX_VALUE ? Math.round(iRound * fE2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final int g(List<? extends f66> measurables, int availableWidth, int mainAxisSpacing) {
        if (measurables.isEmpty()) {
            return 0;
        }
        int size = measurables.size();
        int iMax = 0;
        int i = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            f66 f66Var = measurables.get(i2);
            float fE = cra.e(cra.d(f66Var));
            int iD0 = f66Var.d0(availableWidth);
            if (fE == 0.0f) {
                i += iD0;
            } else if (fE > 0.0f) {
                f += fE;
                iMax = Math.max(iMax, Math.round(iD0 / fE));
            }
        }
        return Math.round(iMax * f) + i + ((measurables.size() - 1) * mainAxisSpacing);
    }

    public final int h(List<? extends f66> measurables, int availableHeight, int mainAxisSpacing) {
        if (measurables.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((measurables.size() - 1) * mainAxisSpacing, availableHeight);
        int size = measurables.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i = 0; i < size; i++) {
            f66 f66Var = measurables.get(i);
            float fE = cra.e(cra.d(f66Var));
            if (fE == 0.0f) {
                int iMin2 = Math.min(f66Var.W(Integer.MAX_VALUE), availableHeight == Integer.MAX_VALUE ? Integer.MAX_VALUE : availableHeight - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, f66Var.o0(iMin2));
            } else if (fE > 0.0f) {
                f += fE;
            }
        }
        int iRound = f == 0.0f ? 0 : availableHeight == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(availableHeight - iMin, 0) / f);
        int size2 = measurables.size();
        for (int i2 = 0; i2 < size2; i2++) {
            f66 f66Var2 = measurables.get(i2);
            float fE2 = cra.e(cra.d(f66Var2));
            if (fE2 > 0.0f) {
                iMax = Math.max(iMax, f66Var2.o0(iRound != Integer.MAX_VALUE ? Math.round(iRound * fE2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }
}
