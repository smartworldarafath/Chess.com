package com.google.inputmethod;

import androidx.compose.p001foundation.text.m;
import androidx.compose.ui.focus.b;
import androidx.compose.ui.text.input.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\fR\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001a\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u000e\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/google/android/mj6;", "Lcom/google/android/nj6;", "Lcom/google/android/hyb;", "keyboardController", "<init>", "(Lcom/google/android/hyb;)V", "Landroidx/compose/ui/text/input/a;", "imeAction", "", "a", "(I)Z", "d", "Lcom/google/android/hyb;", "Landroidx/compose/foundation/text/m;", "b", "Landroidx/compose/foundation/text/m;", "c", "()Landroidx/compose/foundation/text/m;", "f", "(Landroidx/compose/foundation/text/m;)V", "keyboardActions", "Lcom/google/android/ok4;", "Lcom/google/android/ok4;", "()Lcom/google/android/ok4;", "e", "(Lcom/google/android/ok4;)V", "focusManager", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class mj6 implements nj6 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final hyb keyboardController;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public m keyboardActions;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public ok4 focusManager;

    public mj6(hyb hybVar) {
        this.keyboardController = hybVar;
    }

    private final boolean a(int imeAction) {
        hyb hybVar;
        a.Companion companion = a.INSTANCE;
        if (a.m(imeAction, companion.d())) {
            b().v(b.INSTANCE.e());
            return true;
        }
        if (a.m(imeAction, companion.f())) {
            b().v(b.INSTANCE.f());
            return true;
        }
        if (!a.m(imeAction, companion.b()) || (hybVar = this.keyboardController) == null) {
            return false;
        }
        hybVar.hide();
        return true;
    }

    public final ok4 b() {
        ok4 ok4Var = this.focusManager;
        if (ok4Var != null) {
            return ok4Var;
        }
        Intrinsics.x("focusManager");
        return null;
    }

    public final m c() {
        m mVar = this.keyboardActions;
        if (mVar != null) {
            return mVar;
        }
        Intrinsics.x("keyboardActions");
        return null;
    }

    public final boolean d(int imeAction) {
        Function1<nj6, Unit> function1G;
        a.Companion companion = a.INSTANCE;
        if (a.m(imeAction, companion.b())) {
            function1G = c().b();
        } else if (a.m(imeAction, companion.c())) {
            function1G = c().c();
        } else if (a.m(imeAction, companion.d())) {
            function1G = c().d();
        } else if (a.m(imeAction, companion.f())) {
            function1G = c().e();
        } else if (a.m(imeAction, companion.g())) {
            function1G = c().f();
        } else if (a.m(imeAction, companion.h())) {
            function1G = c().g();
        } else {
            if (!a.m(imeAction, companion.a()) && !a.m(imeAction, companion.e())) {
                throw new IllegalStateException("invalid ImeAction");
            }
            function1G = null;
        }
        if (function1G == null) {
            return a(imeAction);
        }
        function1G.invoke(this);
        return true;
    }

    public final void e(ok4 ok4Var) {
        this.focusManager = ok4Var;
    }

    public final void f(m mVar) {
        this.keyboardActions = mVar;
    }
}
