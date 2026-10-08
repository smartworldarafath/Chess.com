package androidx.compose.p001foundation;

import androidx.compose.p001foundation.IndicationKt;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.b;
import androidx.compose.ui.platform.InspectableValueKt;
import com.google.android.ps4;
import com.google.inputmethod.av5;
import com.google.inputmethod.fs1;
import com.google.inputmethod.j26;
import com.google.inputmethod.jz5;
import com.google.inputmethod.ks9;
import com.google.inputmethod.wu5;
import com.google.inputmethod.xu5;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a#\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006\"\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/compose/ui/b;", "Lcom/google/android/j26;", "interactionSource", "Lcom/google/android/wu5;", "indication", "e", "(Landroidx/compose/ui/b;Lcom/google/android/j26;Lcom/google/android/wu5;)Landroidx/compose/ui/b;", "Lcom/google/android/ks9;", "a", "Lcom/google/android/ks9;", "d", "()Lcom/google/android/ks9;", "LocalIndication", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class IndicationKt {
    private static final ks9<wu5> a = fs1.h(null, new Function0() { // from class: com.google.android.yu5
        public final Object invoke() {
            return IndicationKt.c();
        }
    }, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final wu5 c() {
        return DefaultDebugIndication.a;
    }

    public static final ks9<wu5> d() {
        return a;
    }

    public static final b e(b bVar, final j26 j26Var, final wu5 wu5Var) {
        if (wu5Var == null) {
            return bVar;
        }
        if (wu5Var instanceof av5) {
            return bVar.then(new q(j26Var, (av5) wu5Var));
        }
        return ComposedModifierKt.b(bVar, InspectableValueKt.b() ? new Function1<jz5, Unit>() { // from class: androidx.compose.foundation.IndicationKt$indication$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(jz5 jz5Var) {
                jz5Var.b("indication");
                jz5Var.getProperties().c("interactionSource", j26Var);
                jz5Var.getProperties().c("indication", wu5Var);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((jz5) obj);
                return Unit.a;
            }
        } : InspectableValueKt.a(), new ps4() { // from class: com.google.android.zu5
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return IndicationKt.f(wu5Var, j26Var, (b) obj, (d) obj2, ((Integer) obj3).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b f(wu5 wu5Var, j26 j26Var, b bVar, d dVar, int i) {
        dVar.y(-353972293);
        if (e.k()) {
            e.o(-353972293, i, -1, "androidx.compose.foundation.indication.<anonymous> (Indication.kt:176)");
        }
        xu5 xu5VarA = wu5Var.a(j26Var, dVar, 0);
        boolean zX = dVar.x(xu5VarA);
        Object objR = dVar.R();
        if (zX || objR == d.INSTANCE.a()) {
            objR = new p(xu5VarA);
            dVar.L(objR);
        }
        p pVar = (p) objR;
        if (e.k()) {
            e.n();
        }
        dVar.u();
        return pVar;
    }
}
