package com.google.inputmethod;

import android.text.Layout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/google/android/epc;", "", "<init>", "()V", "", "value", "Landroid/text/Layout$Alignment;", "a", "(I)Landroid/text/Layout$Alignment;", "b", "Landroid/text/Layout$Alignment;", "ALIGN_LEFT_FRAMEWORK", "c", "ALIGN_RIGHT_FRAMEWORK", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class epc {
    public static final epc a = new epc();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final Layout.Alignment ALIGN_LEFT_FRAMEWORK;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final Layout.Alignment ALIGN_RIGHT_FRAMEWORK;

    static {
        Layout.Alignment[] alignmentArrValues = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : alignmentArrValues) {
            if (Intrinsics.e(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (Intrinsics.e(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        ALIGN_LEFT_FRAMEWORK = alignment;
        ALIGN_RIGHT_FRAMEWORK = alignment2;
    }

    private epc() {
    }

    public final Layout.Alignment a(int value) {
        if (value == 0) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        if (value == 1) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (value == 2) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (value != 3) {
            return value != 4 ? Layout.Alignment.ALIGN_NORMAL : ALIGN_RIGHT_FRAMEWORK;
        }
        return ALIGN_LEFT_FRAMEWORK;
    }
}
