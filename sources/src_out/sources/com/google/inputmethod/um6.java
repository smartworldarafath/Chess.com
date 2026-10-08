package com.google.inputmethod;

import android.content.ComponentName;
import android.content.Intent;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/google/android/um6;", "", "<init>", "()V", "Landroid/content/ComponentName;", "receiver", "", "actionKey", "", "appWidgetId", "Landroid/content/Intent;", "a", "(Landroid/content/ComponentName;Ljava/lang/String;I)Landroid/content/Intent;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class um6 {
    public static final um6 a = new um6();

    private um6() {
    }

    public final Intent a(ComponentName receiver, String actionKey, int appWidgetId) {
        return new Intent().setComponent(receiver).setAction("ACTION_TRIGGER_LAMBDA").putExtra("EXTRA_ACTION_KEY", actionKey).putExtra("EXTRA_APPWIDGET_ID", appWidgetId);
    }
}
