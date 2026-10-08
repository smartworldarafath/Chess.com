package com.google.inputmethod;

import android.os.Build;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0006\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/google/android/acd;", "", "<init>", "()V", "", "a", "b", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getEnabled", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "enabled", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class acd {
    public static final acd a = new acd();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final AtomicBoolean enabled = new AtomicBoolean(false);
    public static final int c = 8;

    private acd() {
    }

    public final void a() {
        if (Build.VERSION.SDK_INT < 29 || !enabled.get()) {
            return;
        }
        bcd.a.a("GlanceAppWidget::update", 0);
    }

    public final void b() {
        if (Build.VERSION.SDK_INT < 29 || !enabled.get()) {
            return;
        }
        bcd.a.b("GlanceAppWidget::update", 0);
    }
}
