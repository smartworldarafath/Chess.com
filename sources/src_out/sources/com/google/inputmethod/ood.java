package com.google.inputmethod;

import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.l;
import androidx.compose.ui.text.font.y;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\n\u0010\u000fR\u0017\u0010\u0012\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u0017\u0010\u0014\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcom/google/android/ood;", "", "<init>", "()V", "Landroidx/compose/ui/text/font/y;", "b", "Landroidx/compose/ui/text/font/y;", "a", "()Landroidx/compose/ui/text/font/y;", "Brand", "c", "Plain", "Landroidx/compose/ui/text/font/x;", "d", "Landroidx/compose/ui/text/font/x;", "()Landroidx/compose/ui/text/font/x;", "WeightBold", "e", "WeightMedium", "f", "WeightRegular", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ood {
    public static final ood a = new ood();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final y Brand;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final y Plain;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final FontWeight WeightBold;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final FontWeight WeightMedium;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final FontWeight WeightRegular;

    static {
        l.Companion companion = l.INSTANCE;
        Brand = companion.d();
        Plain = companion.d();
        FontWeight.Companion companion2 = FontWeight.INSTANCE;
        WeightBold = companion2.b();
        WeightMedium = companion2.e();
        WeightRegular = companion2.f();
    }

    private ood() {
    }

    public final y a() {
        return Brand;
    }

    public final y b() {
        return Plain;
    }

    public final FontWeight c() {
        return WeightBold;
    }

    public final FontWeight d() {
        return WeightMedium;
    }

    public final FontWeight e() {
        return WeightRegular;
    }
}
