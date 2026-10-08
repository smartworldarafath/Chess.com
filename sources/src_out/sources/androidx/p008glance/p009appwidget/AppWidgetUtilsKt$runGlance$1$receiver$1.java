package androidx.p008glance.p009appwidget;

import androidx.compose.p004runtime.d;
import com.google.android.g41;
import com.google.android.jo9;
import com.google.android.oq2;
import com.google.android.q22;
import com.google.android.ut0;
import com.google.inputmethod.t04;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.e;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Function0;", "", "content", "", "Y0", "(Lkotlin/jvm/functions/Function2;Lcom/google/android/q22;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
final class AppWidgetUtilsKt$runGlance$1$receiver$1 implements d {
    final /* synthetic */ AtomicReference<g41<?>> a;
    final /* synthetic */ jo9<Function2<? super d, ? super Integer, Unit>> b;

    AppWidgetUtilsKt$runGlance$1$receiver$1(AtomicReference<g41<?>> atomicReference, jo9<? super Function2<? super d, ? super Integer, Unit>> jo9Var) {
        this.a = atomicReference;
        this.b = jo9Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.p008glance.p009appwidget.d
    public final Object Y0(Function2<? super d, ? super Integer, Unit> function2, q22<?> q22Var) throws KotlinNothingValueException {
        AppWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1 appWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1;
        if (q22Var instanceof AppWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1) {
            appWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1 = (AppWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1) q22Var;
            int i = appWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                appWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1.label = i - t04.INVALID_ID;
            } else {
                appWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1 = new AppWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1(this, q22Var);
            }
        } else {
            appWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1 = new AppWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1(this, q22Var);
        }
        Object obj = appWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1.result;
        Object objG = a.g();
        int i2 = appWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1.label;
        if (i2 == 0) {
            f.b(obj);
            AtomicReference<g41<?>> atomicReference = this.a;
            final jo9<Function2<? super d, ? super Integer, Unit>> jo9Var = this.b;
            appWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1.L$0 = function2;
            appWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1.L$1 = atomicReference;
            appWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1.L$2 = jo9Var;
            appWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1.label = 1;
            e eVar = new e(a.d(appWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1), 1);
            eVar.G();
            eVar.D(new Function1<Throwable, Unit>() { // from class: androidx.glance.appwidget.AppWidgetUtilsKt$runGlance$1$receiver$1$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((Throwable) obj2);
                    return Unit.a;
                }

                public final void invoke(Throwable th) {
                    jo9Var.e((Object) null);
                }
            });
            g41<?> andSet = atomicReference.getAndSet(eVar);
            if (andSet != null) {
                ut0.a(g41.a.a(andSet, (Throwable) null, 1, (Object) null));
            }
            jo9Var.e(function2);
            Object objY = eVar.y();
            if (objY == a.g()) {
                oq2.c(appWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1);
            }
            if (objY == objG) {
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

    public <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) d.a.a(this, r, function2);
    }

    public <E extends CoroutineContext.Element> E get(CoroutineContext.b<E> bVar) {
        return (E) d.a.b(this, bVar);
    }

    public CoroutineContext minusKey(CoroutineContext.b<?> bVar) {
        return d.a.c(this, bVar);
    }

    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return d.a.d(this, coroutineContext);
    }
}
