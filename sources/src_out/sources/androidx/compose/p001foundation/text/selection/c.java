package androidx.compose.p001foundation.text.selection;

import android.content.Context;
import androidx.compose.p001foundation.text.selection.SelectedTextType;
import androidx.compose.p001foundation.text.selection.c;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.x;
import com.google.android.fc3;
import com.google.android.rs4;
import com.google.inputmethod.LocaleList;
import com.google.inputmethod.ao9;
import com.google.inputmethod.brc;
import com.google.inputmethod.fs1;
import com.google.inputmethod.ks9;
import com.google.inputmethod.qb9;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u001a#\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\r\u001a\u00020\f*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001aU\u0010\u0017\u001a\u00020\u0015*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00150\u0014H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\"\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"J\u0010)\u001a$\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040 8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b!\u0010\"\u0012\u0004\b'\u0010(\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006*"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectedTextType;", "selectedTextType", "Lcom/google/android/g77;", "localeList", "Lcom/google/android/qb9;", "h", "(Landroidx/compose/foundation/text/selection/SelectedTextType;Lcom/google/android/g77;Landroidx/compose/runtime/d;I)Lcom/google/android/qb9;", "Landroidx/compose/foundation/text/selection/o;", "", "text", "Landroidx/compose/ui/text/x;", "selection", "", "g", "(Landroidx/compose/foundation/text/selection/o;Ljava/lang/CharSequence;J)Z", "Lcom/google/android/brc;", "Landroid/content/Context;", "context", "editable", "platformSelectionBehaviors", "Lkotlin/Function1;", "", "child", "f", "(Lcom/google/android/brc;Landroid/content/Context;ZLjava/lang/CharSequence;Landroidx/compose/ui/text/x;Lcom/google/android/qb9;Lkotlin/jvm/functions/Function1;)V", "Lcom/google/android/ks9;", "Lkotlin/coroutines/CoroutineContext;", "a", "Lcom/google/android/ks9;", "getLocalTextClassifierCoroutineContext", "()Lcom/google/android/ks9;", "LocalTextClassifierCoroutineContext", "Lkotlin/Function4;", "b", "Lcom/google/android/rs4;", "getPlatformSelectionBehaviorsFactory", "()Lcom/google/android/rs4;", "setPlatformSelectionBehaviorsFactory", "(Lcom/google/android/rs4;)V", "getPlatformSelectionBehaviorsFactory$annotations", "()V", "PlatformSelectionBehaviorsFactory", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c {
    private static final ks9<CoroutineContext> a = fs1.j(new Function0() { // from class: com.google.android.tb9
        public final Object invoke() {
            return c.c();
        }
    });
    private static rs4<? super CoroutineContext, ? super Context, ? super SelectedTextType, ? super LocaleList, ? extends qb9> b = new rs4() { // from class: com.google.android.ub9
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return c.d((CoroutineContext) obj, (Context) obj2, (SelectedTextType) obj3, (LocaleList) obj4);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineContext c() {
        return fc3.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlatformSelectionBehaviorsImpl d(CoroutineContext coroutineContext, Context context, SelectedTextType selectedTextType, LocaleList localeList) {
        return new PlatformSelectionBehaviorsImpl(coroutineContext, context, selectedTextType, localeList);
    }

    public static final void f(brc brcVar, Context context, boolean z, CharSequence charSequence, x xVar, qb9 qb9Var, Function1<? super brc, Unit> function1) {
        if (charSequence != null && xVar != null && qb9Var != null && (qb9Var instanceof PlatformSelectionBehaviorsImpl)) {
            ((PlatformSelectionBehaviorsImpl) qb9Var).l(brcVar, charSequence, xVar.getPackedValue(), function1);
            ao9.b(brcVar, context, z, charSequence, xVar.getPackedValue());
            return;
        }
        function1.invoke(brcVar);
        if (charSequence == null || xVar == null) {
            return;
        }
        ao9.b(brcVar, context, z, charSequence, xVar.getPackedValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(TextClassificationResult textClassificationResult, CharSequence charSequence, long j) {
        return x.g(j, textClassificationResult.getSelection()) && Intrinsics.e(charSequence, textClassificationResult.getText());
    }

    public static final qb9 h(SelectedTextType selectedTextType, LocaleList localeList, d dVar, int i) {
        dVar.y(430530635);
        if (e.k()) {
            e.o(430530635, i, -1, "androidx.compose.foundation.text.selection.rememberPlatformSelectionBehaviors (PlatformSelectionBehaviors.android.kt:95)");
        }
        Context context = (Context) dVar.v(AndroidCompositionLocals_androidKt.c());
        CoroutineContext coroutineContext = (CoroutineContext) dVar.v(a);
        boolean zX = dVar.x(coroutineContext) | dVar.x(context) | ((((i & 14) ^ 6) > 4 && dVar.C(selectedTextType.ordinal())) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && dVar.x(localeList)) || (i & 48) == 32);
        Object objR = dVar.R();
        if (zX || objR == d.INSTANCE.a()) {
            objR = (qb9) b.invoke(coroutineContext, context, selectedTextType, localeList);
            dVar.L(objR);
        }
        qb9 qb9Var = (qb9) objR;
        if (e.k()) {
            e.n();
        }
        dVar.u();
        return qb9Var;
    }
}
