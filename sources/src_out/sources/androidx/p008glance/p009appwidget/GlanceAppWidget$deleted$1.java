package androidx.p008glance.p009appwidget;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.inputmethod.t04;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@lq2(c = "androidx.glance.appwidget.GlanceAppWidget", f = "GlanceAppWidget.kt", l = {124, 128, 135, 135, 135, 135}, m = "deleted$glance_appwidget_release")
final class GlanceAppWidget$deleted$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GlanceAppWidget this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GlanceAppWidget$deleted$1(GlanceAppWidget glanceAppWidget, q22<? super GlanceAppWidget$deleted$1> q22Var) {
        super(q22Var);
        this.this$0 = glanceAppWidget;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= t04.INVALID_ID;
        return this.this$0.a(null, 0, this);
    }
}
