package com.google.inputmethod;

import android.content.res.Resources;
import androidx.p008glance.g;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a(\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0016\u0010\u0007\u001a\u00020\u0006*\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a!\u0010\r\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"Landroidx/glance/g;", "Lcom/google/android/ff3;", "horizontal", "vertical", "b", "(Landroidx/glance/g;FF)Landroidx/glance/g;", "Lcom/google/android/fx8;", "d", "(F)Lcom/google/android/fx8;", "", "", "Landroid/content/res/Resources;", "resources", "c", "(Ljava/util/List;Landroid/content/res/Resources;)F", "glance_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class mx8 {
    public static final g b(g gVar, float f, float f2) {
        return gVar.a(new PaddingModifier(null, d(f), d(f2), null, d(f), d(f2), 9, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float c(List<Integer> list, Resources resources) {
        float fI = ff3.i(0);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            fI = ff3.i(fI + ff3.i(resources.getDimension(((Number) it.next()).intValue()) / resources.getDisplayMetrics().density));
        }
        return fI;
    }

    private static final PaddingDimension d(float f) {
        return new PaddingDimension(f, null, 2, null);
    }
}
