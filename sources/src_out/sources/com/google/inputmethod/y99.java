package com.google.inputmethod;

import android.text.Spannable;
import androidx.compose.ui.text.b;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a/\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\u001a3\u0010\u000e\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\"\u001e\u0010\u0015\u001a\u00020\u000b*\u00020\u00108BX\u0082\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012\"\u001e\u0010\u001b\u001a\u00020\u000b*\u00020\u00168BX\u0082\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Landroid/text/Spannable;", "", "Landroidx/compose/ui/text/b$d;", "Lcom/google/android/v99;", "placeholders", "Lcom/google/android/f43;", "density", "", "d", "(Landroid/text/Spannable;Ljava/util/List;Lcom/google/android/f43;)V", "placeholder", "", "start", "end", "c", "(Landroid/text/Spannable;Lcom/google/android/v99;IILcom/google/android/f43;)V", "Lcom/google/android/b0d;", "a", "(J)I", "getSpanUnit--R2X_6o$annotations", "(J)V", "spanUnit", "Lcom/google/android/ga9;", "b", "(I)I", "getSpanVerticalAlign-do9X-Gg$annotations", "(I)V", "spanVerticalAlign", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class y99 {
    private static final int a(long j) {
        long jG = b0d.g(j);
        d0d.Companion companion = d0d.INSTANCE;
        if (d0d.g(jG, companion.b())) {
            return 0;
        }
        return d0d.g(jG, companion.a()) ? 1 : 2;
    }

    private static final int b(int i) {
        ga9.Companion companion = ga9.INSTANCE;
        if (ga9.i(i, companion.a())) {
            return 0;
        }
        if (ga9.i(i, companion.g())) {
            return 1;
        }
        if (ga9.i(i, companion.b())) {
            return 2;
        }
        if (ga9.i(i, companion.c())) {
            return 3;
        }
        if (ga9.i(i, companion.f())) {
            return 4;
        }
        if (ga9.i(i, companion.d())) {
            return 5;
        }
        if (ga9.i(i, companion.e())) {
            return 6;
        }
        throw new IllegalStateException("Invalid PlaceholderVerticalAlign");
    }

    private static final void c(Spannable spannable, Placeholder placeholder, int i, int i2, f43 f43Var) {
        for (Object obj : spannable.getSpans(i, i2, zq3.class)) {
            spannable.removeSpan((zq3) obj);
        }
        b0c.y(spannable, new ea9(b0d.h(placeholder.getWidth()), a(placeholder.getWidth()), b0d.h(placeholder.getHeight()), a(placeholder.getHeight()), f43Var, b(placeholder.getPlaceholderVerticalAlign())), i, i2);
    }

    public static final void d(Spannable spannable, List<b.Range<Placeholder>> list, f43 f43Var) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            b.Range<Placeholder> range = list.get(i);
            c(spannable, range.a(), range.getStart(), range.getEnd(), f43Var);
        }
    }
}
