package androidx.p008glance.p009appwidget;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.inputmethod.t04;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@lq2(c = "androidx.glance.appwidget.AppWidgetUtilsKt$runGlance$1$receiver$1", f = "AppWidgetUtils.kt", l = {309}, m = "provideContent")
final class AppWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AppWidgetUtilsKt$runGlance$1$receiver$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1(AppWidgetUtilsKt$runGlance$1$receiver$1 appWidgetUtilsKt$runGlance$1$receiver$1, q22<? super AppWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1> q22Var) {
        super(q22Var);
        this.this$0 = appWidgetUtilsKt$runGlance$1$receiver$1;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= t04.INVALID_ID;
        return this.this$0.Y0(null, this);
    }
}
