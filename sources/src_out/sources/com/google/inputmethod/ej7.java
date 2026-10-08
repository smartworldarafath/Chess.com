package com.google.inputmethod;

import androidx.compose.ui.layout.IntrinsicMinMax;
import androidx.compose.ui.layout.IntrinsicWidthHeight;
import androidx.compose.ui.layout.f;
import androidx.compose.ui.layout.j;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bç\u0080\u0001\u0018\u00002\u00020\u0001J)\u0010\b\u001a\u00020\u0006*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ)\u0010\u000b\u001a\u00020\u0006*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\tJ)\u0010\f\u001a\u00020\u0006*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\tJ)\u0010\r\u001a\u00020\u0006*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\tJ)\u0010\u0013\u001a\u00020\u0012*\u00020\u000e2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0013\u0010\u0014ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lcom/google/android/ej7;", "", "Lcom/google/android/h66;", "", "Lcom/google/android/f66;", "measurables", "", "height", "minIntrinsicWidth", "(Lcom/google/android/h66;Ljava/util/List;I)I", "width", "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight", "Landroidx/compose/ui/layout/j;", "Lcom/google/android/dj7;", "Lcom/google/android/kx1;", "constraints", "Lcom/google/android/fj7;", "measure", "(Landroidx/compose/ui/layout/j;Ljava/util/List;Lcom/google/android/kx1;)Lcom/google/android/fj7;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ej7 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        @Deprecated
        public static int a(ej7 ej7Var, h66 h66Var, List<? extends f66> list, int i) {
            return ej7.super.maxIntrinsicHeight(h66Var, list, i);
        }

        @Deprecated
        public static int b(ej7 ej7Var, h66 h66Var, List<? extends f66> list, int i) {
            return ej7.super.maxIntrinsicWidth(h66Var, list, i);
        }

        @Deprecated
        public static int c(ej7 ej7Var, h66 h66Var, List<? extends f66> list, int i) {
            return ej7.super.minIntrinsicHeight(h66Var, list, i);
        }

        @Deprecated
        public static int d(ej7 ej7Var, h66 h66Var, List<? extends f66> list, int i) {
            return ej7.super.minIntrinsicWidth(h66Var, list, i);
        }
    }

    default int maxIntrinsicHeight(h66 h66Var, List<? extends f66> list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new px2(list.get(i2), IntrinsicMinMax.Max, IntrinsicWidthHeight.Height));
        }
        return mo0measure3p2s80s(new f(h66Var, h66Var.getLayoutDirection()), arrayList, nx1.b(0, i, 0, 0, 13, null)).getB();
    }

    default int maxIntrinsicWidth(h66 h66Var, List<? extends f66> list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new px2(list.get(i2), IntrinsicMinMax.Max, IntrinsicWidthHeight.Width));
        }
        return mo0measure3p2s80s(new f(h66Var, h66Var.getLayoutDirection()), arrayList, nx1.b(0, 0, 0, i, 7, null)).getA();
    }

    /* JADX INFO: renamed from: measure-3p2s80s */
    fj7 mo0measure3p2s80s(j jVar, List<? extends dj7> list, long j);

    default int minIntrinsicHeight(h66 h66Var, List<? extends f66> list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new px2(list.get(i2), IntrinsicMinMax.Min, IntrinsicWidthHeight.Height));
        }
        return mo0measure3p2s80s(new f(h66Var, h66Var.getLayoutDirection()), arrayList, nx1.b(0, i, 0, 0, 13, null)).getB();
    }

    default int minIntrinsicWidth(h66 h66Var, List<? extends f66> list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new px2(list.get(i2), IntrinsicMinMax.Min, IntrinsicWidthHeight.Width));
        }
        return mo0measure3p2s80s(new f(h66Var, h66Var.getLayoutDirection()), arrayList, nx1.b(0, 0, 0, i, 7, null)).getA();
    }
}
