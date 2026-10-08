package androidx.p008glance.p009appwidget.translators;

import android.widget.RemoteViews;
import androidx.core.widget.a;
import com.google.inputmethod.ResourceColorProvider;
import com.google.inputmethod.TranslationContext;
import com.google.inputmethod.bq2;
import com.google.inputmethod.ki1;
import com.google.inputmethod.ti1;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/glance/appwidget/translators/b;", "", "<init>", "()V", "Lcom/google/android/bgd;", "translationContext", "Landroid/widget/RemoteViews;", "rv", "Lcom/google/android/ti1;", "colorProvider", "", "viewId", "", "a", "(Lcom/google/android/bgd;Landroid/widget/RemoteViews;Lcom/google/android/ti1;I)V", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class b {
    public static final b a = new b();

    private b() {
    }

    public final void a(TranslationContext translationContext, RemoteViews rv, ti1 colorProvider, int viewId) {
        if (colorProvider instanceof bq2) {
            bq2 bq2Var = (bq2) colorProvider;
            ImageTranslatorKt.c(rv, viewId, bq2Var.b(), bq2Var.c());
        } else if (colorProvider instanceof ResourceColorProvider) {
            a.f(rv, viewId, ((ResourceColorProvider) colorProvider).getResId());
        } else {
            a.d(rv, viewId, ki1.j(colorProvider.a(translationContext.getContext())));
        }
    }
}
