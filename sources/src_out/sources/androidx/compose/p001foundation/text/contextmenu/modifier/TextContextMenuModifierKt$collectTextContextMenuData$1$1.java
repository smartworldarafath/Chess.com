package androidx.compose.p001foundation.text.contextmenu.modifier;

import com.google.inputmethod.brc;
import com.google.inputmethod.erc;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class TextContextMenuModifierKt$collectTextContextMenuData$1$1 extends FunctionReferenceImpl implements Function1<Function1<? super erc, ? extends Boolean>, Unit> {
    TextContextMenuModifierKt$collectTextContextMenuData$1$1(Object obj) {
        super(1, obj, brc.class, "addFilter", "addFilter$foundation(Lkotlin/jvm/functions/Function1;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m((Function1) obj);
        return Unit.a;
    }

    public final void m(Function1<? super erc, Boolean> function1) {
        ((brc) ((CallableReference) this).receiver).b(function1);
    }
}
