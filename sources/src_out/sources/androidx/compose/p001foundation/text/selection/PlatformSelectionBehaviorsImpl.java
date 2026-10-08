package androidx.compose.p001foundation.text.selection;

import android.app.RemoteAction;
import android.content.Context;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import androidx.compose.p004runtime.s0;
import androidx.compose.ui.text.x;
import com.google.android.a68;
import com.google.android.q22;
import com.google.android.rw0;
import com.google.android.x58;
import com.google.inputmethod.LocaleList;
import com.google.inputmethod.brc;
import com.google.inputmethod.drc;
import com.google.inputmethod.e77;
import com.google.inputmethod.o58;
import com.google.inputmethod.qb9;
import com.google.inputmethod.rn8;
import com.google.inputmethod.t04;
import com.google.inputmethod.zqc;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0015\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J<\u0010\u001c\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00172\"\u0010\u001b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0018H\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ\"\u0010\u001e\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u001e\u0010\u0012J*\u0010!\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0096@¢\u0006\u0004\b!\u0010\"J \u0010#\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b#\u0010\u0012J7\u0010'\u001a\u00020\u0010*\u00020$2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00100%H\u0000¢\u0006\u0004\b'\u0010(J\u001f\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010.R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00107\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R/\u0010@\u001a\u0004\u0018\u0001082\b\u00109\u001a\u0004\u0018\u0001088B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u0014\u0010C\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010G\u001a\u00020D8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bE\u0010F¨\u0006H"}, d2 = {"Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviorsImpl;", "Lcom/google/android/qb9;", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Landroid/content/Context;", "context", "Landroidx/compose/foundation/text/selection/SelectedTextType;", "selectedTextType", "Lcom/google/android/g77;", "localeList", "<init>", "(Lkotlin/coroutines/CoroutineContext;Landroid/content/Context;Landroidx/compose/foundation/text/selection/SelectedTextType;Lcom/google/android/g77;)V", "", "text", "Landroidx/compose/ui/text/x;", "selection", "", "p", "(Ljava/lang/CharSequence;JLcom/google/android/q22;)Ljava/lang/Object;", "Landroid/view/textclassifier/TextClassifier;", "textClassifier", "m", "(Ljava/lang/CharSequence;JLandroid/view/textclassifier/TextClassifier;Lcom/google/android/q22;)Ljava/lang/Object;", "T", "Lkotlin/Function2;", "Lcom/google/android/q22;", "", "block", "q", "(Lkotlin/jvm/functions/Function2;Lcom/google/android/q22;)Ljava/lang/Object;", "b", "Lcom/google/android/rn8;", "secondaryClickLocation", "c", "(Ljava/lang/CharSequence;JLcom/google/android/rn8;Lcom/google/android/q22;)Ljava/lang/Object;", "a", "Lcom/google/android/brc;", "Lkotlin/Function1;", "child", "l", "(Lcom/google/android/brc;Ljava/lang/CharSequence;JLkotlin/jvm/functions/Function1;)V", "Landroid/view/textclassifier/TextClassification;", "s", "(Ljava/lang/CharSequence;J)Landroid/view/textclassifier/TextClassification;", "Lkotlin/coroutines/CoroutineContext;", "Landroid/content/Context;", "Landroidx/compose/foundation/text/selection/SelectedTextType;", "d", "Lcom/google/android/g77;", "Lcom/google/android/x58;", "e", "Lcom/google/android/x58;", "mutex", "f", "Landroid/view/textclassifier/TextClassifier;", "textClassificationSession", "Landroidx/compose/foundation/text/selection/o;", "<set-?>", "g", "Lcom/google/android/o58;", "o", "()Landroidx/compose/foundation/text/selection/o;", "r", "(Landroidx/compose/foundation/text/selection/o;)V", "textClassificationResult", "h", "Ljava/lang/Object;", "AssistantItemKey", "Landroid/os/LocaleList;", "n", "()Landroid/os/LocaleList;", "androidLocalList", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PlatformSelectionBehaviorsImpl implements qb9 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final CoroutineContext coroutineContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final SelectedTextType selectedTextType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final LocaleList localeList;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private TextClassifier textClassificationSession;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final x58 mutex = a68.b(false, 1, (Object) null);

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final o58 textClassificationResult = s0.e(null, null, 2, null);

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final Object AssistantItemKey = new Object();

    public PlatformSelectionBehaviorsImpl(CoroutineContext coroutineContext, Context context, SelectedTextType selectedTextType, LocaleList localeList) {
        this.coroutineContext = coroutineContext;
        this.context = context;
        this.selectedTextType = selectedTextType;
        this.localeList = localeList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object m(CharSequence charSequence, long j, TextClassifier textClassifier, q22<? super Unit> q22Var) {
        PlatformSelectionBehaviorsImpl$classifyText$1 platformSelectionBehaviorsImpl$classifyText$1;
        x58 x58Var;
        TextClassifier textClassifier2;
        long j2;
        CharSequence charSequence2;
        TextClassification textClassificationClassifyText;
        x58 x58Var2;
        long j3;
        CharSequence charSequence3;
        if (q22Var instanceof PlatformSelectionBehaviorsImpl$classifyText$1) {
            platformSelectionBehaviorsImpl$classifyText$1 = (PlatformSelectionBehaviorsImpl$classifyText$1) q22Var;
            int i = platformSelectionBehaviorsImpl$classifyText$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                platformSelectionBehaviorsImpl$classifyText$1.label = i - t04.INVALID_ID;
            } else {
                platformSelectionBehaviorsImpl$classifyText$1 = new PlatformSelectionBehaviorsImpl$classifyText$1(this, q22Var);
            }
        } else {
            platformSelectionBehaviorsImpl$classifyText$1 = new PlatformSelectionBehaviorsImpl$classifyText$1(this, q22Var);
        }
        Object obj = platformSelectionBehaviorsImpl$classifyText$1.result;
        Object objG = a.g();
        int i2 = platformSelectionBehaviorsImpl$classifyText$1.label;
        try {
            if (i2 == 0) {
                f.b(obj);
                x58Var = this.mutex;
                platformSelectionBehaviorsImpl$classifyText$1.L$0 = charSequence;
                platformSelectionBehaviorsImpl$classifyText$1.L$1 = textClassifier;
                platformSelectionBehaviorsImpl$classifyText$1.L$2 = x58Var;
                platformSelectionBehaviorsImpl$classifyText$1.J$0 = j;
                platformSelectionBehaviorsImpl$classifyText$1.label = 1;
                if (x58Var.g((Object) null, platformSelectionBehaviorsImpl$classifyText$1) != objG) {
                    textClassifier2 = textClassifier;
                    j2 = j;
                    charSequence2 = charSequence;
                }
                return objG;
            }
            if (i2 == 1) {
                j2 = platformSelectionBehaviorsImpl$classifyText$1.J$0;
                x58Var = (x58) platformSelectionBehaviorsImpl$classifyText$1.L$2;
                textClassifier2 = (TextClassifier) platformSelectionBehaviorsImpl$classifyText$1.L$1;
                charSequence2 = (CharSequence) platformSelectionBehaviorsImpl$classifyText$1.L$0;
                f.b(obj);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j4 = platformSelectionBehaviorsImpl$classifyText$1.J$0;
                x58Var2 = (x58) platformSelectionBehaviorsImpl$classifyText$1.L$2;
                textClassificationClassifyText = (TextClassification) platformSelectionBehaviorsImpl$classifyText$1.L$1;
                CharSequence charSequence4 = (CharSequence) platformSelectionBehaviorsImpl$classifyText$1.L$0;
                f.b(obj);
                charSequence3 = charSequence4;
                j3 = j4;
            }
            try {
                r(new TextClassificationResult(charSequence3, j3, textClassificationClassifyText, null));
                Unit unit = Unit.a;
                return Unit.a;
            } finally {
                x58Var2.h((Object) null);
            }
            TextClassificationResult textClassificationResultO = o();
            if (textClassificationResultO != null && c.g(textClassificationResultO, charSequence2, j2)) {
                Unit unit2 = Unit.a;
                x58Var.h((Object) null);
                return unit2;
            }
            Unit unit3 = Unit.a;
            x58Var.h((Object) null);
            textClassificationClassifyText = textClassifier2.classifyText(new TextClassification.Request.Builder(charSequence2, x.l(j2), x.k(j2)).setDefaultLocales(n()).build());
            x58 x58Var3 = this.mutex;
            platformSelectionBehaviorsImpl$classifyText$1.L$0 = charSequence2;
            platformSelectionBehaviorsImpl$classifyText$1.L$1 = textClassificationClassifyText;
            platformSelectionBehaviorsImpl$classifyText$1.L$2 = x58Var3;
            platformSelectionBehaviorsImpl$classifyText$1.J$0 = j2;
            platformSelectionBehaviorsImpl$classifyText$1.label = 2;
            if (x58Var3.g((Object) null, platformSelectionBehaviorsImpl$classifyText$1) != objG) {
                x58Var2 = x58Var3;
                j3 = j2;
                charSequence3 = charSequence2;
                r(new TextClassificationResult(charSequence3, j3, textClassificationClassifyText, null));
                Unit unit4 = Unit.a;
                return Unit.a;
            }
            return objG;
        } catch (Throwable th) {
            x58Var.h((Object) null);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.os.LocaleList n() {
        android.os.LocaleList localeListC;
        LocaleList localeList = this.localeList;
        return (localeList == null || (localeListC = zqc.a.c(localeList)) == null) ? new android.os.LocaleList(e77.INSTANCE.a().getPlatformLocale()) : localeListC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final TextClassificationResult o() {
        return (TextClassificationResult) this.textClassificationResult.getValue();
    }

    private final Object p(CharSequence charSequence, long j, q22<? super Unit> q22Var) {
        return (charSequence.length() == 0 || x.h(j)) ? Unit.a : q(new PlatformSelectionBehaviorsImpl$onShowContextMenuOrSelectionToolbar$2(this, charSequence, j, null), q22Var);
    }

    private final <T> Object q(Function2<? super TextClassifier, ? super q22<? super T>, ? extends Object> function2, q22<? super T> q22Var) {
        return rw0.g(this.coroutineContext, new PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2(this, function2, null), q22Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(TextClassificationResult textClassificationResult) {
        this.textClassificationResult.setValue(textClassificationResult);
    }

    @Override // com.google.inputmethod.qb9
    public Object a(CharSequence charSequence, long j, q22<? super Unit> q22Var) {
        Object objP = p(charSequence, j, q22Var);
        return objP == a.g() ? objP : Unit.a;
    }

    @Override // com.google.inputmethod.qb9
    public Object b(CharSequence charSequence, long j, q22<? super x> q22Var) {
        if (charSequence.length() == 0 || x.h(j)) {
            return null;
        }
        return q(new PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2(charSequence, j, this, null), q22Var);
    }

    @Override // com.google.inputmethod.qb9
    public Object c(CharSequence charSequence, long j, rn8 rn8Var, q22<? super Unit> q22Var) {
        Object objP = p(charSequence, j, q22Var);
        return objP == a.g() ? objP : Unit.a;
    }

    public final void l(brc brcVar, CharSequence charSequence, long j, Function1<? super brc, Unit> function1) {
        TextClassification textClassificationS = s(charSequence, j);
        if (textClassificationS == null) {
            function1.invoke(brcVar);
            return;
        }
        if (!textClassificationS.getActions().isEmpty()) {
            drc.c(brcVar, this.AssistantItemKey, textClassificationS, 0);
        } else if (zqc.a.b(textClassificationS)) {
            drc.c(brcVar, this.AssistantItemKey, textClassificationS, -1);
        }
        function1.invoke(brcVar);
        List<RemoteAction> actions = textClassificationS.getActions();
        int size = actions.size();
        for (int i = 0; i < size; i++) {
            actions.get(i);
            if (i > 0) {
                drc.c(brcVar, this.AssistantItemKey, textClassificationS, i);
            }
        }
    }

    public final TextClassification s(CharSequence text, long selection) {
        if (!x58.a.b(this.mutex, (Object) null, 1, (Object) null)) {
            return null;
        }
        TextClassificationResult textClassificationResultO = o();
        TextClassification textClassification = (textClassificationResultO == null || !c.g(textClassificationResultO, text, selection)) ? null : textClassificationResultO.getTextClassification();
        x58.a.c(this.mutex, (Object) null, 1, (Object) null);
        return textClassification;
    }
}
