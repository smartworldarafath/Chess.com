package com.google.inputmethod;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.p004runtime.p0;
import androidx.compose.p004runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.b;
import com.google.android.ps4;
import com.google.android.zs4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.text.h;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001BO\b\u0000\u0012D\u0010\u000b\u001a@\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\n\u0012\u0004\u0012\u00020\t0\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0011\u0010\u0012JW\u0010\u0018\u001a\u00020\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00052\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\nH\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u0012RR\u0010\u000b\u001a@\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\n\u0012\u0004\u0012\u00020\t0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR&\u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u00070\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/google/android/n12;", "", "Lkotlin/Function6;", "Landroidx/compose/ui/b;", "", "", "Lcom/google/android/f12;", "Lkotlin/Function1;", "Lcom/google/android/ei1;", "", "Lkotlin/Function0;", "itemUi", "<init>", "(Lcom/google/android/zs4;)V", "colors", "c", "(Lcom/google/android/f12;Landroidx/compose/runtime/d;I)V", "e", "()V", "label", "modifier", "enabled", "leadingIcon", "onClick", "f", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/b;ZLcom/google/android/ps4;Lkotlin/jvm/functions/Function0;)V", "i", "a", "Lcom/google/android/zs4;", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "b", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "composables", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n12 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final zs4<b, String, Boolean, ContextMenuColors, ps4<? super ei1, ? super d, ? super Integer, Unit>, Function0<Unit>, d, Integer, Unit> itemUi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final SnapshotStateList<ps4<ContextMenuColors, d, Integer, Unit>> composables = p0.f();

    /* JADX WARN: Multi-variable type inference failed */
    public n12(zs4<? super b, ? super String, ? super Boolean, ? super ContextMenuColors, ? super ps4<? super ei1, ? super d, ? super Integer, Unit>, ? super Function0<Unit>, ? super d, ? super Integer, Unit> zs4Var) {
        this.itemUi = zs4Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(n12 n12Var, ContextMenuColors contextMenuColors, int i, d dVar, int i2) {
        n12Var.c(contextMenuColors, dVar, saa.a(i | 1));
        return Unit.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void g(n12 n12Var, Function2 function2, b bVar, boolean z, ps4 ps4Var, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            bVar = b.INSTANCE;
        }
        b bVar2 = bVar;
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            ps4Var = null;
        }
        n12Var.f(function2, bVar2, z2, ps4Var, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(Function2 function2, n12 n12Var, b bVar, boolean z, ps4 ps4Var, Function0 function0, ContextMenuColors contextMenuColors, d dVar, int i) {
        int i2;
        if ((i & 6) == 0) {
            i2 = i | (dVar.x(contextMenuColors) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (dVar.g((i2 & 19) != 18, i2 & 1)) {
            if (e.k()) {
                e.o(-1789283891, i2, -1, "androidx.compose.foundation.contextmenu.ContextMenuScope.item.<anonymous> (ContextMenuUi.kt:297)");
            }
            String str = (String) function2.invoke(dVar, 0);
            if (h.C0(str)) {
                cx5.c("Label must not be blank");
            }
            n12Var.itemUi.q(bVar, str, Boolean.valueOf(z), contextMenuColors, ps4Var, function0, dVar, Integer.valueOf((i2 << 9) & 7168));
            if (e.k()) {
                e.n();
            }
        } else {
            dVar.q();
        }
        return Unit.a;
    }

    public final void c(final ContextMenuColors contextMenuColors, d dVar, final int i) {
        d dVarF = dVar.F(-798501095);
        int i2 = (i & 6) == 0 ? (dVarF.x(contextMenuColors) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= dVarF.x(this) ? 32 : 16;
        }
        if (dVarF.g((i2 & 19) != 18, i2 & 1)) {
            if (e.k()) {
                e.o(-798501095, i2, -1, "androidx.compose.foundation.contextmenu.ContextMenuScope.Content (ContextMenuUi.kt:255)");
            }
            SnapshotStateList<ps4<ContextMenuColors, d, Integer, Unit>> snapshotStateList = this.composables;
            int size = snapshotStateList.size();
            for (int i3 = 0; i3 < size; i3++) {
                snapshotStateList.get(i3).invoke(contextMenuColors, dVarF, Integer.valueOf(i2 & 14));
            }
            if (e.k()) {
                e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.l12
                public final Object invoke(Object obj, Object obj2) {
                    return n12.d(this.a, contextMenuColors, i, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public final void e() {
        this.composables.clear();
    }

    public final void f(final Function2<? super d, ? super Integer, String> label, final b modifier, final boolean enabled, final ps4<? super ei1, ? super d, ? super Integer, Unit> leadingIcon, final Function0<Unit> onClick) {
        this.composables.add(ko1.c(-1789283891, true, new ps4() { // from class: com.google.android.m12
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return n12.h(label, this, modifier, enabled, leadingIcon, onClick, (ContextMenuColors) obj, (d) obj2, ((Integer) obj3).intValue());
            }
        }));
    }

    public final void i() {
        this.composables.add(xo1.a.c());
    }
}
