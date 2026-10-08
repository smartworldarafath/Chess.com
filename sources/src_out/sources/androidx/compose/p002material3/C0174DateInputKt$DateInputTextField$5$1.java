package androidx.compose.p002material3;

import androidx.compose.ui.text.x;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.inputmethod.DateInputFormat;
import com.google.inputmethod.TextFieldValue;
import com.google.inputmethod.d21;
import com.google.inputmethod.o58;
import com.google.inputmethod.zyc;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: androidx.compose.material3.DateInputKt$DateInputTextField$5$1, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 0, 0})
@lq2(c = "androidx.compose.material3.DateInputKt$DateInputTextField$5$1", f = "DateInput.kt", l = {}, m = "invokeSuspend")
final class C0174DateInputKt$DateInputTextField$5$1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    final /* synthetic */ d21 $calendarModel;
    final /* synthetic */ DateInputFormat $dateInputFormat;
    final /* synthetic */ Long $initialDateMillis;
    final /* synthetic */ Locale $locale;
    final /* synthetic */ o58<TextFieldValue> $text$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0174DateInputKt$DateInputTextField$5$1(Long l, d21 d21Var, DateInputFormat dateInputFormat, Locale locale, o58<TextFieldValue> o58Var, q22<? super C0174DateInputKt$DateInputTextField$5$1> q22Var) {
        super(2, q22Var);
        this.$initialDateMillis = l;
        this.$calendarModel = d21Var;
        this.$dateInputFormat = dateInputFormat;
        this.$locale = locale;
        this.$text$delegate = o58Var;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new C0174DateInputKt$DateInputTextField$5$1(this.$initialDateMillis, this.$calendarModel, this.$dateInputFormat, this.$locale, this.$text$delegate, q22Var);
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        a.g();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        Long l = this.$initialDateMillis;
        if (l != null) {
            d21 d21Var = this.$calendarModel;
            DateInputFormat dateInputFormat = this.$dateInputFormat;
            Locale locale = this.$locale;
            o58<TextFieldValue> o58Var = this.$text$delegate;
            String strA = d21Var.a(l.longValue(), dateInputFormat.getPatternWithoutDelimiters(), locale);
            DateInputKt.o(o58Var, new TextFieldValue(strA, strA.length() == 0 ? x.INSTANCE.a() : zyc.b(strA.length(), strA.length()), (x) null, 4, (DefaultConstructorMarker) null));
        }
        return Unit.a;
    }
}
