package com.google.inputmethod;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.p004runtime.p0;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aO\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"I", "O", "Lcom/google/android/z8;", "contract", "Lkotlin/Function1;", "", "onResult", "Lcom/google/android/ze7;", "d", "(Lcom/google/android/z8;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/d;I)Lcom/google/android/ze7;", "activity-compose"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class t9 {

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/google/android/t9$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements jd3 {
        final /* synthetic */ m9 a;

        public a(m9 m9Var) {
            this.a = m9Var;
        }

        @Override // com.google.inputmethod.jd3
        public void dispose() {
            this.a.c();
        }
    }

    public static final <I, O> ze7<I, O> d(final z8<I, O> z8Var, Function1<? super O, Unit> function1, d dVar, int i) {
        final p9 p9Var;
        if (e.k()) {
            e.o(-1408504823, i, -1, "androidx.activity.compose.rememberLauncherForActivityResult (ActivityResultRegistry.kt:82)");
        }
        q6c q6cVarR = p0.r(z8Var, dVar, i & 14);
        final q6c q6cVarR2 = p0.r(function1, dVar, (i >> 3) & 14);
        Object[] objArr = new Object[0];
        Object objR = dVar.R();
        d.Companion companion = d.INSTANCE;
        if (objR == companion.a()) {
            objR = new Function0() { // from class: com.google.android.q9
                public final Object invoke() {
                    return t9.e();
                }
            };
            dVar.L(objR);
        }
        final String str = (String) dfa.l(objArr, (Function0) objR, dVar, 48);
        u9 u9VarC = u57.a.c(dVar, 6);
        if (u9VarC == null) {
            throw new IllegalStateException("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
        }
        p9 activityResultRegistry = u9VarC.getActivityResultRegistry();
        Object objR2 = dVar.R();
        if (objR2 == companion.a()) {
            objR2 = new m9();
            dVar.L(objR2);
        }
        final m9 m9Var = (m9) objR2;
        Object objR3 = dVar.R();
        if (objR3 == companion.a()) {
            objR3 = new ze7(m9Var, q6cVarR);
            dVar.L(objR3);
        }
        ze7<I, O> ze7Var = (ze7) objR3;
        boolean zT = dVar.T(m9Var) | dVar.T(activityResultRegistry) | dVar.x(str) | dVar.T(z8Var) | dVar.x(q6cVarR2);
        Object objR4 = dVar.R();
        if (zT || objR4 == companion.a()) {
            p9Var = activityResultRegistry;
            Object obj = new Function1() { // from class: com.google.android.r9
                public final Object invoke(Object obj2) {
                    return t9.f(m9Var, p9Var, str, z8Var, q6cVarR2, (kd3) obj2);
                }
            };
            str = str;
            dVar.L(obj);
            objR4 = obj;
        } else {
            p9Var = activityResultRegistry;
        }
        p9 p9Var2 = p9Var;
        vn3.a(p9Var2, str, z8Var, (Function1) objR4, dVar, (i << 6) & 896);
        if (e.k()) {
            e.n();
        }
        return ze7Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String e() {
        return UUID.randomUUID().toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jd3 f(m9 m9Var, p9 p9Var, String str, z8 z8Var, final q6c q6cVar, kd3 kd3Var) {
        m9Var.b(p9Var.n(str, z8Var, new x8() { // from class: com.google.android.s9
            @Override // com.google.inputmethod.x8
            public final void a(Object obj) {
                t9.g(q6cVar, obj);
            }
        }));
        return new a(m9Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(q6c q6cVar, Object obj) {
        ((Function1) q6cVar.getValue()).invoke(obj);
    }
}
