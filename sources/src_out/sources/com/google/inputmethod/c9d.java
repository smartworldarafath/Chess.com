package com.google.inputmethod;

import androidx.compose.p001foundation.IndicationKt;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.state.ToggleableState;
import com.google.android.ps4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aO\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\f\u001aW\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000f\u0010\u0010\u001aQ\u0010\u0015\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u0013¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/b;", "", "value", "enabled", "Lcom/google/android/hpa;", "role", "Lcom/google/android/r48;", "interactionSource", "Lkotlin/Function1;", "", "onValueChange", "b", "(Landroidx/compose/ui/b;ZZLcom/google/android/hpa;Lcom/google/android/r48;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/b;", "Lcom/google/android/wu5;", "indication", "a", "(Landroidx/compose/ui/b;ZLcom/google/android/r48;Lcom/google/android/wu5;ZLcom/google/android/hpa;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/b;", "Landroidx/compose/ui/state/ToggleableState;", "state", "Lkotlin/Function0;", "onClick", "d", "(Landroidx/compose/ui/b;Landroidx/compose/ui/state/ToggleableState;Lcom/google/android/r48;Lcom/google/android/wu5;ZLcom/google/android/hpa;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/b;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c9d {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements ps4<androidx.compose.ui.b, d, Integer, androidx.compose.ui.b> {
        final /* synthetic */ wu5 a;
        final /* synthetic */ boolean b;
        final /* synthetic */ boolean c;
        final /* synthetic */ hpa d;
        final /* synthetic */ Function1 e;

        public a(wu5 wu5Var, boolean z, boolean z2, hpa hpaVar, Function1 function1) {
            this.a = wu5Var;
            this.b = z;
            this.c = z2;
            this.d = hpaVar;
            this.e = function1;
        }

        public final androidx.compose.ui.b a(androidx.compose.ui.b bVar, d dVar, int i) {
            dVar.y(-1525724089);
            if (e.k()) {
                e.o(-1525724089, i, -1, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:637)");
            }
            Object objR = dVar.R();
            if (objR == d.INSTANCE.a()) {
                objR = k26.a();
                dVar.L(objR);
            }
            r48 r48Var = (r48) objR;
            androidx.compose.ui.b bVarThen = IndicationKt.e(androidx.compose.ui.b.INSTANCE, r48Var, this.a).then(new b9d(this.b, r48Var, null, false, this.c, this.d, this.e, null));
            if (e.k()) {
                e.n();
            }
            dVar.u();
            return bVarThen;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((androidx.compose.ui.b) obj, (d) obj2, ((Number) obj3).intValue());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements ps4<androidx.compose.ui.b, d, Integer, androidx.compose.ui.b> {
        final /* synthetic */ wu5 a;
        final /* synthetic */ ToggleableState b;
        final /* synthetic */ boolean c;
        final /* synthetic */ hpa d;
        final /* synthetic */ Function0 e;

        public b(wu5 wu5Var, ToggleableState toggleableState, boolean z, hpa hpaVar, Function0 function0) {
            this.a = wu5Var;
            this.b = toggleableState;
            this.c = z;
            this.d = hpaVar;
            this.e = function0;
        }

        public final androidx.compose.ui.b a(androidx.compose.ui.b bVar, d dVar, int i) {
            dVar.y(-1525724089);
            if (e.k()) {
                e.o(-1525724089, i, -1, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:637)");
            }
            Object objR = dVar.R();
            if (objR == d.INSTANCE.a()) {
                objR = k26.a();
                dVar.L(objR);
            }
            r48 r48Var = (r48) objR;
            androidx.compose.ui.b bVarThen = IndicationKt.e(androidx.compose.ui.b.INSTANCE, r48Var, this.a).then(new nhd(this.b, r48Var, null, false, this.c, this.d, this.e, null));
            if (e.k()) {
                e.n();
            }
            dVar.u();
            return bVarThen;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((androidx.compose.ui.b) obj, (d) obj2, ((Number) obj3).intValue());
        }
    }

    public static final androidx.compose.ui.b a(androidx.compose.ui.b bVar, boolean z, r48 r48Var, wu5 wu5Var, boolean z2, hpa hpaVar, Function1<? super Boolean, Unit> function1) {
        androidx.compose.ui.b bVarThen;
        if (wu5Var instanceof av5) {
            bVarThen = new b9d(z, r48Var, (av5) wu5Var, false, z2, hpaVar, function1, null);
        } else if (wu5Var == null) {
            bVarThen = new b9d(z, r48Var, null, false, z2, hpaVar, function1, null);
        } else {
            bVarThen = r48Var != null ? IndicationKt.e(androidx.compose.ui.b.INSTANCE, r48Var, wu5Var).then(new b9d(z, r48Var, null, false, z2, hpaVar, function1, null)) : ComposedModifierKt.c(androidx.compose.ui.b.INSTANCE, null, new a(wu5Var, z, z2, hpaVar, function1), 1, null);
        }
        return bVar.then(bVarThen);
    }

    public static final androidx.compose.ui.b b(androidx.compose.ui.b bVar, boolean z, boolean z2, hpa hpaVar, r48 r48Var, Function1<? super Boolean, Unit> function1) {
        return bVar.then(new b9d(z, r48Var, null, true, z2, hpaVar, function1, null));
    }

    public static /* synthetic */ androidx.compose.ui.b c(androidx.compose.ui.b bVar, boolean z, boolean z2, hpa hpaVar, r48 r48Var, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        return b(bVar, z, z2, (i & 4) != 0 ? null : hpaVar, (i & 8) != 0 ? null : r48Var, function1);
    }

    public static final androidx.compose.ui.b d(androidx.compose.ui.b bVar, ToggleableState toggleableState, r48 r48Var, wu5 wu5Var, boolean z, hpa hpaVar, Function0<Unit> function0) {
        androidx.compose.ui.b bVarThen;
        if (wu5Var instanceof av5) {
            bVarThen = new nhd(toggleableState, r48Var, (av5) wu5Var, false, z, hpaVar, function0, null);
        } else if (wu5Var == null) {
            bVarThen = new nhd(toggleableState, r48Var, null, false, z, hpaVar, function0, null);
        } else {
            bVarThen = r48Var != null ? IndicationKt.e(androidx.compose.ui.b.INSTANCE, r48Var, wu5Var).then(new nhd(toggleableState, r48Var, null, false, z, hpaVar, function0, null)) : ComposedModifierKt.c(androidx.compose.ui.b.INSTANCE, null, new b(wu5Var, toggleableState, z, hpaVar, function0), 1, null);
        }
        return bVar.then(bVarThen);
    }
}
