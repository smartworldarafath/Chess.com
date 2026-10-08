package com.google.inputmethod;

import androidx.collection.ScatterSet;
import androidx.collection.d;
import androidx.compose.p004runtime.b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0013\u001a\u00020\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0003J\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00072\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010\u001fJ\u0017\u0010#\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b%\u0010$J\u0017\u0010&\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b&\u0010$J\r\u0010'\u001a\u00020\u0007¢\u0006\u0004\b'\u0010\u0003J\u0015\u0010(\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u001d¢\u0006\u0004\b(\u0010\u001fJ\u001b\u0010+\u001a\u00020\u00072\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00050)¢\u0006\u0004\b+\u0010,J\u0015\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010)¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\u0007¢\u0006\u0004\b/\u0010\u0003J\r\u00100\u001a\u00020\u0007¢\u0006\u0004\b0\u0010\u0003R\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u00101R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u00102R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u00103R\u001c\u00107\u001a\b\u0012\u0004\u0012\u00020\u0005058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u00106R\u001c\u00108\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u00103R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\n0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u00103R \u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00190\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u00103R\u001e\u0010;\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u00106R$\u0010?\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020=\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010>R$\u0010B\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010AR\u001e\u0010D\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010C¨\u0006E"}, d2 = {"Lcom/google/android/rea;", "Lcom/google/android/sea;", "<init>", "()V", "Lcom/google/android/r58;", "Lcom/google/android/zea;", "list", "", "l", "(Lcom/google/android/r58;)V", "", "instance", "s", "(Ljava/lang/Object;)V", "", "Lcom/google/android/yea;", "abandoning", "Lcom/google/android/sr1;", "traceContext", "r", "(Ljava/util/Set;Lcom/google/android/sr1;)V", "i", "d", "(Lcom/google/android/zea;)V", "e", "Lkotlin/Function0;", "effect", "a", "(Lkotlin/jvm/functions/Function0;)V", "Lcom/google/android/aq1;", "h", "(Lcom/google/android/aq1;)V", "c", "Landroidx/compose/runtime/b0;", "scope", "f", "(Landroidx/compose/runtime/b0;)V", "b", "g", "m", "k", "Landroidx/collection/ScatterSet;", "ignoreSet", "q", "(Landroidx/collection/ScatterSet;)V", "o", "()Landroidx/collection/ScatterSet;", "n", "j", "Ljava/util/Set;", "Lcom/google/android/sr1;", "Lcom/google/android/r58;", "remembering", "Landroidx/collection/d;", "Landroidx/collection/d;", "rememberSet", "currentRememberingList", "leaving", "sideEffects", "releasing", "Lcom/google/android/k58;", "Lcom/google/android/h49;", "Lcom/google/android/k58;", "pausedPlaceholders", "Lcom/google/android/w3c;", "Ljava/util/ArrayList;", "nestedRemembersLists", "Landroidx/collection/ScatterSet;", "ignoreLeavingSet", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class rea implements sea {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private Set<yea> abandoning;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private sr1 traceContext;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final r58<zea> remembering;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private d<zea> rememberSet;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private r58<zea> currentRememberingList;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final r58<Object> leaving;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final r58<Function0<Unit>> sideEffects;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private d<aq1> releasing;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private k58<b0, h49> pausedPlaceholders;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private ArrayList<r58<zea>> nestedRemembersLists;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private ScatterSet<zea> ignoreLeavingSet;

    public rea() {
        r58<zea> r58Var = new r58<>(new zea[16], 0);
        this.remembering = r58Var;
        this.rememberSet = l4b.b();
        this.currentRememberingList = r58Var;
        this.leaving = new r58<>(new Object[16], 0);
        this.sideEffects = new r58<>(new Function0[16], 0);
    }

    private final void l(r58<zea> list) {
        Set<yea> set = this.abandoning;
        if (set == null) {
            return;
        }
        zea[] zeaVarArr = list.content;
        int size = list.getSize();
        for (int i = 0; i < size; i++) {
            zea zeaVar = zeaVarArr[i];
            yea wrapped = zeaVar.getWrapped();
            set.remove(wrapped);
            try {
                wrapped.d();
                Unit unit = Unit.a;
            } catch (Throwable th) {
                sr1 sr1Var = this.traceContext;
                if (sr1Var != null) {
                    sr1Var.d(th, zeaVar);
                }
                throw th;
            }
        }
    }

    private static final boolean p(zea zeaVar, r58<zea> r58Var) {
        zea[] zeaVarArr = r58Var.content;
        int size = r58Var.getSize();
        for (int i = 0; i < size; i++) {
            yea wrapped = zeaVarArr[i].getWrapped();
            if (wrapped instanceof h49) {
                r58<zea> r58VarA = ((h49) wrapped).a();
                if (r58VarA.s(zeaVar) || p(zeaVar, r58VarA)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void s(Object instance) {
        this.leaving.c(instance);
    }

    @Override // com.google.inputmethod.sea
    public void a(Function0<Unit> effect) {
        this.sideEffects.c(effect);
    }

    @Override // com.google.inputmethod.sea
    public void b(b0 scope) {
        k58<b0, h49> k58Var = this.pausedPlaceholders;
        h49 h49VarE = k58Var != null ? k58Var.e(scope) : null;
        if (h49VarE != null) {
            ArrayList<r58<zea>> arrayListC = this.nestedRemembersLists;
            if (arrayListC == null) {
                arrayListC = w3c.c(null, 1, null);
                this.nestedRemembersLists = arrayListC;
            }
            w3c.j(arrayListC, this.currentRememberingList);
            this.currentRememberingList = h49VarE.a();
        }
    }

    @Override // com.google.inputmethod.sea
    public void c(aq1 instance) {
        d<aq1> dVarB = this.releasing;
        if (dVarB == null) {
            dVarB = l4b.b();
            this.releasing = dVarB;
        }
        dVarB.x(instance);
        s(instance);
    }

    @Override // com.google.inputmethod.sea
    public void d(zea instance) {
        this.currentRememberingList.c(instance);
        this.rememberSet.h(instance);
    }

    @Override // com.google.inputmethod.sea
    public void e(zea instance) {
        if (!this.rememberSet.a(instance)) {
            ScatterSet<zea> scatterSet = this.ignoreLeavingSet;
            if (scatterSet == null || !scatterSet.a(instance)) {
                s(instance);
                return;
            }
            return;
        }
        this.rememberSet.y(instance);
        if (!this.currentRememberingList.s(instance) && !this.remembering.s(instance)) {
            p(instance, this.remembering);
        }
        Set<yea> set = this.abandoning;
        if (set == null) {
            return;
        }
        set.add(instance.getWrapped());
    }

    @Override // com.google.inputmethod.sea
    public void f(b0 scope) {
        Set<yea> set = this.abandoning;
        if (set == null) {
            return;
        }
        h49 h49Var = new h49(set);
        k58<b0, h49> k58VarC = this.pausedPlaceholders;
        if (k58VarC == null) {
            k58VarC = k4b.c();
            this.pausedPlaceholders = k58VarC;
        }
        k58VarC.x(scope, h49Var);
        this.currentRememberingList.c(bq1.isLinkBufferComposerEnabled ? new g37(h49Var, u27.e()) : new yu4(h49Var, -1));
    }

    @Override // com.google.inputmethod.sea
    public void g(b0 scope) {
        r58<zea> r58Var;
        k58<b0, h49> k58Var = this.pausedPlaceholders;
        if (k58Var == null || k58Var.e(scope) == null) {
            return;
        }
        ArrayList<r58<zea>> arrayList = this.nestedRemembersLists;
        if (arrayList != null && (r58Var = (r58) w3c.i(arrayList)) != null) {
            this.currentRememberingList = r58Var;
        }
        k58Var.u(scope);
    }

    @Override // com.google.inputmethod.sea
    public void h(aq1 instance) {
        s(instance);
    }

    public final void i() {
        this.abandoning = null;
        this.traceContext = null;
        this.remembering.j();
        this.rememberSet.m();
        this.currentRememberingList = this.remembering;
        this.leaving.j();
        this.sideEffects.j();
        this.releasing = null;
        this.pausedPlaceholders = null;
        this.nestedRemembersLists = null;
    }

    public final void j() {
        Set<yea> set = this.abandoning;
        if (set == null || set.isEmpty()) {
            return;
        }
        Object objA = vbd.a.a("Compose:abandons");
        try {
            Iterator<yea> it = set.iterator();
            while (it.hasNext()) {
                yea next = it.next();
                it.remove();
                next.e();
            }
            Unit unit = Unit.a;
        } finally {
            vbd.a.b(objA);
        }
    }

    public final void k(aq1 instance) {
        if (this.leaving.s(instance)) {
            instance.d();
        }
    }

    public final void m() {
        Set<yea> set = this.abandoning;
        if (set == null) {
            return;
        }
        this.ignoreLeavingSet = null;
        if (this.leaving.getSize() != 0) {
            Object objA = vbd.a.a("Compose:onForgotten");
            try {
                d<aq1> dVar = this.releasing;
                int size = this.leaving.getSize();
                while (true) {
                    size--;
                    if (-1 >= size) {
                        break;
                    }
                    Object obj = this.leaving.content[size];
                    try {
                        if (obj instanceof zea) {
                            yea wrapped = ((zea) obj).getWrapped();
                            set.remove(wrapped);
                            wrapped.f();
                        }
                        if (obj instanceof aq1) {
                            if (dVar == null || !dVar.a((aq1) obj)) {
                                ((aq1) obj).d();
                            } else {
                                ((aq1) obj).c();
                            }
                        }
                        Unit unit = Unit.a;
                    } catch (Throwable th) {
                        sr1 sr1Var = this.traceContext;
                        if (sr1Var != null) {
                            sr1Var.d(th, obj);
                        }
                        throw th;
                    }
                }
                Unit unit2 = Unit.a;
                vbd.a.b(objA);
            } catch (Throwable th2) {
                vbd.a.b(objA);
                throw th2;
            }
        }
        if (this.remembering.getSize() != 0) {
            Object objA2 = vbd.a.a("Compose:onRemembered");
            try {
                l(this.remembering);
                Unit unit3 = Unit.a;
            } finally {
                vbd.a.b(objA2);
            }
        }
    }

    public final void n() {
        if (this.sideEffects.getSize() != 0) {
            Object objA = vbd.a.a("Compose:sideeffects");
            try {
                r58<Function0<Unit>> r58Var = this.sideEffects;
                Function0<Unit>[] function0Arr = r58Var.content;
                int size = r58Var.getSize();
                for (int i = 0; i < size; i++) {
                    function0Arr[i].invoke();
                }
                this.sideEffects.j();
                Unit unit = Unit.a;
            } finally {
                vbd.a.b(objA);
            }
        }
    }

    public final ScatterSet<zea> o() {
        if (!this.rememberSet.e()) {
            return null;
        }
        d<zea> dVar = this.rememberSet;
        this.rememberSet = l4b.b();
        this.remembering.j();
        return dVar;
    }

    public final void q(ScatterSet<zea> ignoreSet) {
        this.ignoreLeavingSet = ignoreSet;
    }

    public final void r(Set<yea> abandoning, sr1 traceContext) {
        i();
        this.abandoning = abandoning;
        this.traceContext = traceContext;
    }
}
