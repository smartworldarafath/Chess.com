package androidx.p008glance.p009appwidget;

import androidx.compose.p004runtime.d;
import com.google.android.q22;
import com.google.inputmethod.t04;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.f;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a\"\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/glance/appwidget/GlanceAppWidget;", "Lkotlin/Function0;", "", "content", "", "a", "(Landroidx/glance/appwidget/GlanceAppWidget;Lkotlin/jvm/functions/Function2;Lcom/google/android/q22;)Ljava/lang/Object;", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class GlanceAppWidgetKt {
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(GlanceAppWidget glanceAppWidget, Function2<? super d, ? super Integer, Unit> function2, q22<?> q22Var) throws KotlinNothingValueException {
        GlanceAppWidgetKt$provideContent$1 glanceAppWidgetKt$provideContent$1;
        if (q22Var instanceof GlanceAppWidgetKt$provideContent$1) {
            glanceAppWidgetKt$provideContent$1 = (GlanceAppWidgetKt$provideContent$1) q22Var;
            int i = glanceAppWidgetKt$provideContent$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                glanceAppWidgetKt$provideContent$1.label = i - t04.INVALID_ID;
            } else {
                glanceAppWidgetKt$provideContent$1 = new GlanceAppWidgetKt$provideContent$1(q22Var);
            }
        } else {
            glanceAppWidgetKt$provideContent$1 = new GlanceAppWidgetKt$provideContent$1(q22Var);
        }
        Object obj = glanceAppWidgetKt$provideContent$1.result;
        Object objG = a.g();
        int i2 = glanceAppWidgetKt$provideContent$1.label;
        if (i2 == 0) {
            f.b(obj);
            d dVar = (d) glanceAppWidgetKt$provideContent$1.getContext().get(d.INSTANCE);
            if (dVar == null) {
                throw new IllegalStateException("provideContent requires a ContentReceiver and should only be called from GlanceAppWidget.provideGlance");
            }
            glanceAppWidgetKt$provideContent$1.label = 1;
            if (dVar.Y0(function2, glanceAppWidgetKt$provideContent$1) == objG) {
                return objG;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
