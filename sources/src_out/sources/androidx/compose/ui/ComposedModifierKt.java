package androidx.compose.ui;

import androidx.compose.p004runtime.d;
import androidx.compose.ui.platform.InspectableValueKt;
import com.google.android.ps4;
import com.google.inputmethod.jz5;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a;\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\n\u001a\u00020\u0000*\u00020\b2\u0006\u0010\t\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\f\u001a\u00020\u0000*\u00020\b2\u0006\u0010\t\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/compose/ui/b;", "Lkotlin/Function1;", "Lcom/google/android/jz5;", "", "inspectorInfo", "factory", "b", "(Landroidx/compose/ui/b;Lkotlin/jvm/functions/Function1;Lcom/google/android/ps4;)Landroidx/compose/ui/b;", "Landroidx/compose/runtime/d;", "modifier", "e", "(Landroidx/compose/runtime/d;Landroidx/compose/ui/b;)Landroidx/compose/ui/b;", "d", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ComposedModifierKt {
    public static final b b(b bVar, Function1<? super jz5, Unit> function1, ps4<? super b, ? super d, ? super Integer, ? extends b> ps4Var) {
        return bVar.then(new a(function1, ps4Var));
    }

    public static /* synthetic */ b c(b bVar, Function1 function1, ps4 ps4Var, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = InspectableValueKt.a();
        }
        return b(bVar, function1, ps4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b d(final d dVar, b bVar) {
        if (bVar.all(new Function1<b.InterfaceC0050b, Boolean>() { // from class: androidx.compose.ui.ComposedModifierKt$materializeImpl$1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(b.InterfaceC0050b interfaceC0050b) {
                return Boolean.valueOf(!(interfaceC0050b instanceof a));
            }
        })) {
            return bVar;
        }
        dVar.Q(1219399079);
        b bVar2 = (b) bVar.foldIn(b.INSTANCE, new Function2<b, b.InterfaceC0050b, b>() { // from class: androidx.compose.ui.ComposedModifierKt$materializeImpl$result$1
            {
                super(2);
            }

            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b invoke(b bVar3, b.InterfaceC0050b interfaceC0050b) {
                boolean z = interfaceC0050b instanceof a;
                b bVarD = interfaceC0050b;
                if (z) {
                    ps4<b, d, Integer, b> ps4VarA = ((a) interfaceC0050b).a();
                    Intrinsics.h(ps4VarA, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, kotlin.Int, androidx.compose.ui.Modifier>");
                    bVarD = ComposedModifierKt.d(dVar, (b) ((ps4) kotlin.jvm.internal.a.f(ps4VarA, 3)).invoke(b.INSTANCE, dVar, 0));
                }
                return bVar3.then(bVarD);
            }
        });
        dVar.a0();
        return bVar2;
    }

    public static final b e(d dVar, b bVar) {
        dVar.y(439770924);
        b bVarD = d(dVar, bVar);
        dVar.u();
        return bVarD;
    }
}
