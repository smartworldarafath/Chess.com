package com.google.inputmethod;

import android.widget.RemoteViews;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/google/android/ns1;", "", "<init>", "()V", "Landroid/widget/RemoteViews;", "rv", "", "viewId", "", "checked", "", "a", "(Landroid/widget/RemoteViews;IZ)V", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ns1 {
    public static final ns1 a = new ns1();

    private ns1() {
    }

    public final void a(RemoteViews rv, int viewId, boolean checked) {
        rv.setCompoundButtonChecked(viewId, checked);
    }
}
