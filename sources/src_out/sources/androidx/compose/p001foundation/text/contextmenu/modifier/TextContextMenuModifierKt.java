package androidx.compose.p001foundation.text.contextmenu.modifier;

import androidx.compose.p001foundation.text.contextmenu.modifier.TextContextMenuModifierKt;
import com.google.inputmethod.TextContextMenuData;
import com.google.inputmethod.brc;
import com.google.inputmethod.erc;
import com.google.inputmethod.fhd;
import com.google.inputmethod.ghd;
import com.google.inputmethod.x23;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aS\u0010\b\u001a\u00020\u0004*\u00020\u00002\u001e\u0010\u0005\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\u0012\u0004\u0012\u00020\u00040\u00012\u001e\u0010\u0007\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0001\u0012\u0004\u0012\u00020\u00040\u0001H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/google/android/x23;", "Lkotlin/Function1;", "Lcom/google/android/erc;", "", "", "filterBlock", "Lcom/google/android/brc;", "builderBlock", "e", "(Lcom/google/android/x23;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lcom/google/android/frc;", "c", "(Lcom/google/android/x23;)Lcom/google/android/frc;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class TextContextMenuModifierKt {
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public static final TextContextMenuData c(x23 x23Var) throws KotlinNothingValueException {
        final brc brcVar = new brc();
        e(x23Var, new TextContextMenuModifierKt$collectTextContextMenuData$1$1(brcVar), new Function1() { // from class: com.google.android.krc
            public final Object invoke(Object obj) {
                return TextContextMenuModifierKt.d(brcVar, (Function1) obj);
            }
        });
        return brcVar.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(brc brcVar, Function1 function1) {
        function1.invoke(brcVar);
        return Unit.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private static final void e(x23 x23Var, final Function1<? super Function1<? super erc, Boolean>, Unit> function1, final Function1<? super Function1<? super brc, Unit>, Unit> function2) throws KotlinNothingValueException {
        ghd.c(x23Var, c.a, new Function1() { // from class: com.google.android.jrc
            public final Object invoke(Object obj) {
                return Boolean.valueOf(TextContextMenuModifierKt.f(function2, function1, (fhd) obj));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(Function1 function1, Function1 function2, fhd fhdVar) {
        if (fhdVar instanceof a) {
            function1.invoke(((a) fhdVar).m3());
            return true;
        }
        if (!(fhdVar instanceof b)) {
            throw new IllegalStateException("TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode.");
        }
        function2.invoke(((b) fhdVar).m3());
        return true;
    }
}
