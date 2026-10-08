package androidx.p008glance.p009appwidget;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.inputmethod.t04;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@lq2(c = "androidx.glance.appwidget.GlanceAppWidgetKt", f = "GlanceAppWidget.kt", l = {284}, m = "provideContent")
final class GlanceAppWidgetKt$provideContent$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    GlanceAppWidgetKt$provideContent$1(q22<? super GlanceAppWidgetKt$provideContent$1> q22Var) {
        super(q22Var);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= t04.INVALID_ID;
        return GlanceAppWidgetKt.a(null, null, this);
    }
}
