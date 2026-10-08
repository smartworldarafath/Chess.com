package com.google.inputmethod;

import androidx.compose.ui.text.ParagraphInfo;
import androidx.compose.ui.text.x;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.m;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a%\u0010\u0005\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\t\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a9\u0010\u0010\u001a\u00020\u000e2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000e0\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a%\u0010\u0013\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0012\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0013\u0010\u0006¨\u0006\u0014"}, d2 = {"", "Landroidx/compose/ui/text/j;", "paragraphInfoList", "", "index", "b", "(Ljava/util/List;I)I", "", "y", "e", "(Ljava/util/List;F)I", "Landroidx/compose/ui/text/x;", "range", "Lkotlin/Function1;", "", "action", "f", "(Ljava/util/List;JLkotlin/jvm/functions/Function1;)V", "lineIndex", "d", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e38 {
    public static final int b(List<ParagraphInfo> list, int i) {
        int i2;
        byte b;
        int endIndex = ((ParagraphInfo) m.L0(list)).getEndIndex();
        boolean z = false;
        if (!(i <= ((ParagraphInfo) m.L0(list)).getEndIndex())) {
            ax5.a("Index " + i + " should be less or equal than last line's end " + endIndex);
        }
        int size = list.size() - 1;
        int i3 = 0;
        while (true) {
            if (i3 > size) {
                i2 = -(i3 + 1);
                break;
            }
            i2 = (i3 + size) >>> 1;
            ParagraphInfo paragraphInfo = list.get(i2);
            if (paragraphInfo.getStartIndex() > i) {
                b = 1;
            } else {
                b = paragraphInfo.getEndIndex() <= i ? (byte) -1 : (byte) 0;
            }
            if (b >= 0) {
                if (b <= 0) {
                    break;
                }
                size = i2 - 1;
            } else {
                i3 = i2 + 1;
            }
        }
        if (i2 >= 0 && i2 < list.size()) {
            z = true;
        }
        if (!z) {
            ax5.a("Found paragraph index " + i2 + " should be in range [0, " + list.size() + ").\nDebug info: index=" + i + ", paragraphs=[" + m47.e(list, null, null, null, 0, null, new Function1() { // from class: com.google.android.d38
                public final Object invoke(Object obj) {
                    return e38.c((ParagraphInfo) obj);
                }
            }, 31, null) + ']');
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence c(ParagraphInfo paragraphInfo) {
        return '[' + paragraphInfo.getStartIndex() + ", " + paragraphInfo.getEndIndex() + ')';
    }

    public static final int d(List<ParagraphInfo> list, int i) {
        byte b;
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            ParagraphInfo paragraphInfo = list.get(i3);
            if (paragraphInfo.getStartLineIndex() > i) {
                b = 1;
            } else {
                b = paragraphInfo.getEndLineIndex() <= i ? (byte) -1 : (byte) 0;
            }
            if (b < 0) {
                i2 = i3 + 1;
            } else {
                if (b <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final int e(List<ParagraphInfo> list, float f) {
        byte b;
        if (f <= 0.0f) {
            return 0;
        }
        if (f >= ((ParagraphInfo) m.L0(list)).getBottom()) {
            return m.r(list);
        }
        int size = list.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            ParagraphInfo paragraphInfo = list.get(i2);
            if (paragraphInfo.getTop() > f) {
                b = 1;
            } else {
                b = paragraphInfo.getBottom() <= f ? (byte) -1 : (byte) 0;
            }
            if (b < 0) {
                i = i2 + 1;
            } else {
                if (b <= 0) {
                    return i2;
                }
                size = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static final void f(List<ParagraphInfo> list, long j, Function1<? super ParagraphInfo, Unit> function1) {
        int size = list.size();
        for (int iB = b(list, x.l(j)); iB < size; iB++) {
            ParagraphInfo paragraphInfo = list.get(iB);
            if (paragraphInfo.getStartIndex() >= x.k(j)) {
                return;
            }
            if (paragraphInfo.getStartIndex() != paragraphInfo.getEndIndex()) {
                function1.invoke(paragraphInfo);
            }
        }
    }
}
