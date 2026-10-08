package com.google.inputmethod;

import androidx.compose.p004runtime.InvalidationResult;
import androidx.compose.p004runtime.b0;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.p004runtime.f;
import com.google.android.bqd;
import com.google.android.qjd;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.m;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001a3\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0002¢\u0006\u0004\b\t\u0010\n\u001a3\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u000b\u001a\u00060\u0005j\u0002`\u00062\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a#\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0010\u001a\u00060\fj\u0002`\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a;\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a1\u0010\u001f\u001a\u00020\u001b*\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001e\u001a\u00020\u00002\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0002¢\u0006\u0004\b\u001f\u0010 \u001a\u001b\u0010!\u001a\u00020\u001c*\u00020\u001c2\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b!\u0010\"*\f\b\u0000\u0010#\"\u00020\f2\u00020\f¨\u0006$"}, d2 = {"Lcom/google/android/kub;", "slots", "Lcom/google/android/ez;", "", "applier", "", "Landroidx/compose/runtime/composer/linkbuffer/GroupHandle;", "handle", "", "j", "(Lcom/google/android/kub;Lcom/google/android/ez;J)V", "destination", "", "i", "(Lcom/google/android/kub;JLcom/google/android/ez;)I", "Landroidx/compose/runtime/composer/linkbuffer/GroupAddress;", "group", "h", "(Lcom/google/android/kub;I)I", "Lcom/google/android/x22;", "composition", "Landroidx/compose/runtime/f;", "parentContext", "Lcom/google/android/r08;", "reference", "k", "(Lcom/google/android/x22;Landroidx/compose/runtime/f;Lcom/google/android/r08;Lcom/google/android/kub;Lcom/google/android/ez;)V", "", "Lcom/google/android/ts8;", "errorContext", "editor", "f", "(Ljava/lang/Throwable;Lcom/google/android/ts8;Lcom/google/android/kub;J)Ljava/lang/Throwable;", "l", "(Lcom/google/android/ts8;Lcom/google/android/kub;)Lcom/google/android/ts8;", "IntParameter", "runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class xs8 {

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"com/google/android/xs8$a", "Lcom/google/android/taa;", "Landroidx/compose/runtime/b0;", "scope", "", "instance", "Landroidx/compose/runtime/InvalidationResult;", "m", "(Landroidx/compose/runtime/b0;Ljava/lang/Object;)Landroidx/compose/runtime/InvalidationResult;", "", "d", "(Landroidx/compose/runtime/b0;)V", "value", "a", "(Ljava/lang/Object;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements taa {
        final /* synthetic */ x22 a;
        final /* synthetic */ r08 b;

        a(x22 x22Var, r08 r08Var) {
            this.a = x22Var;
            this.b = r08Var;
        }

        @Override // com.google.inputmethod.taa
        public void a(Object value) {
        }

        @Override // com.google.inputmethod.taa
        public void d(b0 scope) {
        }

        @Override // com.google.inputmethod.taa
        public InvalidationResult m(b0 scope, Object instance) {
            InvalidationResult invalidationResultM;
            x22 x22Var = this.a;
            taa taaVar = x22Var instanceof taa ? (taa) x22Var : null;
            if (taaVar == null || (invalidationResultM = taaVar.m(scope, instance)) == null) {
                invalidationResultM = InvalidationResult.IGNORED;
            }
            if (invalidationResultM != InvalidationResult.IGNORED) {
                return invalidationResultM;
            }
            r08 r08Var = this.b;
            List<Pair<b0, Object>> listD = r08Var.d();
            if (instance == null) {
                instance = q6b.a;
            }
            r08Var.i(m.b1(listD, qjd.a(scope, instance)));
            return InvalidationResult.SCHEDULED;
        }
    }

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"com/google/android/xs8$b", "Lcom/google/android/ts8;", "", "currentOffset", "", "Lcom/google/android/iq1;", "e", "(Ljava/lang/Integer;)Ljava/util/List;", "", "c", "()Z", "sourceInformationEnabled", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements ts8 {
        final /* synthetic */ ts8 a;
        final /* synthetic */ kub b;

        b(ts8 ts8Var, kub kubVar) {
            this.a = ts8Var;
            this.b = kubVar;
        }

        @Override // com.google.inputmethod.ts8
        public boolean c() {
            return this.a.c();
        }

        @Override // com.google.inputmethod.ts8
        public List<ComposeStackTraceFrame> e(Integer currentOffset) {
            List<ComposeStackTraceFrame> listE = this.a.e(null);
            int parent = this.b.getParent();
            return parent < 0 ? listE : m.a1(nub.c(this.b, currentOffset, parent), listE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable f(Throwable th, final ts8 ts8Var, final kub kubVar, final long j) {
        return ts8Var == null ? th : jq1.b(th, new Function0() { // from class: com.google.android.vs8
            public final Object invoke() {
                return xs8.g(j, kubVar, ts8Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fq1 g(long j, kub kubVar, ts8 ts8Var) {
        if (j != -1) {
            kubVar.F(j);
        }
        List listD = nub.d(kubVar, null, 0, 3, null);
        ComposeStackTraceFrame composeStackTraceFrame = (ComposeStackTraceFrame) m.N0(listD);
        Integer groupOffset = composeStackTraceFrame != null ? composeStackTraceFrame.getGroupOffset() : null;
        List<ComposeStackTraceFrame> listE = ts8Var.e(groupOffset);
        if (groupOffset != null && !listE.isEmpty()) {
            listE = m.a1(m.e(ComposeStackTraceFrame.b((ComposeStackTraceFrame) m.z0(listE), 0, null, groupOffset, 3, null)), m.q0(listE, 1));
        }
        return new fq1(m.a1(listD, listE), ts8Var.c());
    }

    private static final int h(kub kubVar, int i) {
        if (i < 0) {
            return 0;
        }
        eub table = kubVar.getTable();
        int[] groups = table.getAddressSpace().getGroups();
        int i2 = i;
        int i3 = i2;
        int iY = 0;
        while (i2 > 0) {
            if (kubVar.r(i2)) {
                return iY;
            }
            int iZ = kubVar.z(i2);
            int[] groups2 = table.getAddressSpace().getGroups();
            for (int root = iZ < 0 ? table.getRoot() : kubVar.e(iZ); root >= 0 && root != i3; root = groups2[root + 1]) {
                iY += kubVar.y(root);
            }
            i2 = groups[i2 + 2];
            i3 = iZ;
        }
        if (!(i2 != 0)) {
            e.b("Traversing parent of group not in the slot table: " + i);
        }
        return iY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int i(kub kubVar, long j, ez<Object> ezVar) {
        j(kubVar, ezVar, j);
        int parent = kubVar.getParent();
        int iB = v15.b(j);
        t16 t16Var = new t16();
        int[] groups = kubVar.getTable().getAddressSpace().getGroups();
        int i = iB;
        while (true) {
            if (i <= 0) {
                if (!(i != 0)) {
                    e.b("Traversing parent of group not in the slot table: " + iB);
                    break;
                }
                break;
            }
            if (i == parent) {
                break;
            }
            t16Var.i(i);
            i = groups[i + 2];
        }
        if (!(kubVar.getParent() == parent)) {
            e.b("Unexpected slot table structure when inserting movable content");
        }
        int current = kubVar.getCurrent();
        int iJ = 0;
        boolean z = false;
        while (kubVar.getCurrent() != iB) {
            if (t16Var.tos == 0 || kubVar.getCurrent() != t16Var.c()) {
                iJ += kubVar.J();
            } else {
                if (kubVar.q()) {
                    ezVar.j(kubVar.i());
                    z = true;
                    iJ = 0;
                }
                kubVar.K();
                t16Var.g();
            }
        }
        return iJ + (z ? 0 : h(kubVar, current));
    }

    private static final void j(kub kubVar, ez<Object> ezVar, long j) {
        if (kubVar.getParent() >= 0) {
            p48 p48VarB = p16.b();
            eub table = kubVar.getTable();
            int iZ = kubVar.z(v15.b(j));
            int[] groups = table.getAddressSpace().getGroups();
            int i = iZ;
            while (i > 0) {
                p48VarB.g(i);
                i = groups[i + 2];
            }
            if (!(i != 0)) {
                e.b("Traversing parent of group not in the slot table: " + iZ);
            }
            while (kubVar.getParent() >= 0 && !p48VarB.a(kubVar.getParent())) {
                if (kubVar.s()) {
                    ezVar.k();
                }
                kubVar.d();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public static final void k(x22 x22Var, f fVar, r08 r08Var, kub kubVar, ez<?> ezVar) throws KotlinNothingValueException {
        eub table = kubVar.getTable();
        eub.Companion companion = eub.INSTANCE;
        iub iubVar = new iub(table.getAddressSpace(), false, false);
        iubVar.f();
        n08<Object> n08VarC = r08Var.c();
        iubVar.C(126665345, n08VarC == d.INSTANCE.a() ? 0 : 16777216, n08VarC, null, null);
        iubVar.b(268435456);
        iubVar.c(r08Var.getParameter());
        iubVar.v(kubVar, (((long) 0) << 32) | (((long) bqd.c(kubVar.getTable().getAddressSpace().getGroups()[u27.c(r08Var.getAnchor()).getAddress() + 3])) & 4294967295L));
        iubVar.i();
        eub eubVarD = iubVar.d();
        q08 q08Var = new q08(eubVarD);
        if (eubVarD.J(eubVarD.getRoot())) {
            sub.e(eubVarD, eubVarD.getRoot(), new a(x22Var, r08Var));
        }
        fVar.p(r08Var, q08Var, ezVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ts8 l(ts8 ts8Var, kub kubVar) {
        return new b(ts8Var, kubVar);
    }
}
