package androidx.compose.p001foundation.text.selection;

import android.os.Build;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;
import androidx.compose.ui.text.x;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.x58;
import com.google.inputmethod.zyc;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/view/textclassifier/TextClassifier;", "Landroidx/compose/ui/text/x;", "<anonymous>", "(Landroid/view/textclassifier/TextClassifier;)Landroidx/compose/ui/text/x;"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2", f = "PlatformSelectionBehaviors.android.kt", l = {369, 159}, m = "invokeSuspend", v = 1)
final class PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2 extends SuspendLambda implements Function2<TextClassifier, q22<? super x>, Object> {
    final /* synthetic */ long $selection;
    final /* synthetic */ CharSequence $text;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ PlatformSelectionBehaviorsImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2(CharSequence charSequence, long j, PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl, q22<? super PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2> q22Var) {
        super(2, q22Var);
        this.$text = charSequence;
        this.$selection = j;
        this.this$0 = platformSelectionBehaviorsImpl;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(TextClassifier textClassifier, q22<? super x> q22Var) {
        return create(textClassifier, q22Var).invokeSuspend(Unit.a);
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2 platformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2 = new PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2(this.$text, this.$selection, this.this$0, q22Var);
        platformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2.L$0 = obj;
        return platformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2;
    }

    public final Object invokeSuspend(Object obj) {
        long j;
        PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl;
        x58 x58Var;
        CharSequence charSequence;
        long j2;
        TextSelection textSelection;
        Object objG = a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            TextClassifier textClassifier = (TextClassifier) this.L$0;
            TextSelection.Request.Builder defaultLocales = new TextSelection.Request.Builder(this.$text, x.l(this.$selection), x.k(this.$selection)).setDefaultLocales(this.this$0.n());
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 31) {
                defaultLocales.setIncludeTextClassification(true);
            }
            TextSelection textSelectionSuggestSelection = textClassifier.suggestSelection(defaultLocales.build());
            long jB = zyc.b(textSelectionSuggestSelection.getSelectionStartIndex(), textSelectionSuggestSelection.getSelectionEndIndex());
            if (i2 < 31 || textSelectionSuggestSelection.getTextClassification() == null) {
                PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl2 = this.this$0;
                CharSequence charSequence2 = this.$text;
                this.J$0 = jB;
                this.label = 2;
                if (platformSelectionBehaviorsImpl2.m(charSequence2, jB, textClassifier, this) != objG) {
                    j = jB;
                    j2 = j;
                }
            } else {
                x58 x58Var2 = this.this$0.mutex;
                platformSelectionBehaviorsImpl = this.this$0;
                CharSequence charSequence3 = this.$text;
                this.L$0 = textSelectionSuggestSelection;
                this.L$1 = x58Var2;
                this.L$2 = platformSelectionBehaviorsImpl;
                this.L$3 = charSequence3;
                this.J$0 = jB;
                this.label = 1;
                if (x58Var2.g((Object) null, this) != objG) {
                    x58Var = x58Var2;
                    charSequence = charSequence3;
                    j2 = jB;
                    textSelection = textSelectionSuggestSelection;
                    TextClassification textClassification = textSelection.getTextClassification();
                    Intrinsics.g(textClassification);
                    platformSelectionBehaviorsImpl.r(new TextClassificationResult(charSequence, j2, textClassification, null));
                    Unit unit = Unit.a;
                }
            }
            return objG;
        }
        if (i == 1) {
            long j3 = this.J$0;
            CharSequence charSequence4 = (CharSequence) this.L$3;
            platformSelectionBehaviorsImpl = (PlatformSelectionBehaviorsImpl) this.L$2;
            x58Var = (x58) this.L$1;
            textSelection = (TextSelection) this.L$0;
            f.b(obj);
            j2 = j3;
            charSequence = charSequence4;
            try {
                TextClassification textClassification2 = textSelection.getTextClassification();
                Intrinsics.g(textClassification2);
                platformSelectionBehaviorsImpl.r(new TextClassificationResult(charSequence, j2, textClassification2, null));
                Unit unit2 = Unit.a;
            } finally {
                x58Var.h((Object) null);
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.J$0;
            f.b(obj);
            j2 = j;
        }
        return x.b(j2);
    }
}
