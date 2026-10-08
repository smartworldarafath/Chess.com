package com.google.inputmethod;

import androidx.compose.ui.text.x;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\t\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n\u001a\u0015\u0010\f\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\r\u001a!\u0010\u0010\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\n¨\u0006\u0014"}, d2 = {"", "Landroidx/compose/ui/text/x;", "range", "", "e", "(Ljava/lang/CharSequence;J)Ljava/lang/String;", "", "start", "end", "b", "(II)J", "index", "a", "(I)J", "minimumValue", "maximumValue", "c", "(JII)J", "", "d", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class zyc {
    public static final long a(int i) {
        return b(i, i);
    }

    public static final long b(int i, int i2) {
        return x.c(d(i, i2));
    }

    public static final long c(long j, int i, int i2) {
        int iN = x.n(j);
        if (iN < i) {
            iN = i;
        }
        if (iN > i2) {
            iN = i2;
        }
        int i3 = x.i(j);
        if (i3 >= i) {
            i = i3;
        }
        if (i <= i2) {
            i2 = i;
        }
        return (iN == x.n(j) && i2 == x.i(j)) ? j : b(iN, i2);
    }

    private static final long d(int i, int i2) {
        if (!(i >= 0 && i2 >= 0)) {
            ax5.a("start and end cannot be negative. [start: " + i + ", end: " + i2 + ']');
        }
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    public static final String e(CharSequence charSequence, long j) {
        return charSequence.subSequence(x.l(j), x.k(j)).toString();
    }
}
