package androidx.compose.p001foundation.layout;

import androidx.compose.ui.b;
import androidx.compose.ui.platform.InspectableValueKt;
import com.google.inputmethod.jz5;
import com.google.inputmethod.rx8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u001b\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/b;", "Landroidx/compose/foundation/layout/g1;", "insets", "d", "(Landroidx/compose/ui/b;Landroidx/compose/foundation/layout/g1;)Landroidx/compose/ui/b;", "a", "Lcom/google/android/rx8;", "paddingValues", "b", "(Landroidx/compose/ui/b;Lcom/google/android/rx8;)Landroidx/compose/ui/b;", "Lkotlin/Function1;", "", "block", "c", "(Landroidx/compose/ui/b;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/b;", "foundation-layout"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class WindowInsetsPaddingKt {
    public static final b a(b bVar, final g1 g1Var) {
        return bVar.then(new a1(g1Var, InspectableValueKt.b() ? new Function1<jz5, Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsPaddingKt$consumeWindowInsets$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            public final void a(jz5 jz5Var) {
                jz5Var.b("consumeWindowInsets");
                jz5Var.getProperties().c("insets", g1Var);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((jz5) obj);
                return Unit.a;
            }
        } : InspectableValueKt.a()));
    }

    public static final b b(b bVar, final rx8 rx8Var) {
        return bVar.then(new r0(rx8Var, InspectableValueKt.b() ? new Function1<jz5, Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsPaddingKt$consumeWindowInsets$$inlined$debugInspectorInfo$2
            {
                super(1);
            }

            public final void a(jz5 jz5Var) {
                jz5Var.b("consumeWindowInsets");
                jz5Var.getProperties().c("paddingValues", rx8Var);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((jz5) obj);
                return Unit.a;
            }
        } : InspectableValueKt.a()));
    }

    public static final b c(b bVar, final Function1<? super g1, Unit> function1) {
        return bVar.then(new q(function1, InspectableValueKt.b() ? new Function1<jz5, Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsPaddingKt$onConsumedWindowInsetsChanged$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(jz5 jz5Var) {
                jz5Var.b("onConsumedWindowInsetsChanged");
                jz5Var.getProperties().c("block", function1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((jz5) obj);
                return Unit.a;
            }
        } : InspectableValueKt.a()));
    }

    public static final b d(b bVar, final g1 g1Var) {
        return bVar.then(new k0(g1Var, InspectableValueKt.b() ? new Function1<jz5, Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsPaddingKt$windowInsetsPadding$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            public final void a(jz5 jz5Var) {
                jz5Var.b("windowInsetsPadding");
                jz5Var.getProperties().c("insets", g1Var);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((jz5) obj);
                return Unit.a;
            }
        } : InspectableValueKt.a()));
    }
}
