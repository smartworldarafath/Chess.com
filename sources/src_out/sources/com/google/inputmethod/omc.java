package com.google.inputmethod;

import com.google.android.q22;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J0\u0010\b\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005H¦@¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\n\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcom/google/android/omc;", "Lcom/google/android/qg4;", "Lcom/google/android/p9b;", "", "initialVelocity", "Lkotlin/Function1;", "", "onRemainingDistanceUpdated", "b", "(Lcom/google/android/p9b;FLkotlin/jvm/functions/Function1;Lcom/google/android/q22;)Ljava/lang/Object;", "a", "(Lcom/google/android/p9b;FLcom/google/android/q22;)Ljava/lang/Object;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface omc extends qg4 {
    static /* synthetic */ Object c(omc omcVar, p9b p9bVar, float f, q22<? super Float> q22Var) {
        return omcVar.b(p9bVar, f, qmc.a, q22Var);
    }

    @Override // com.google.inputmethod.qg4
    default Object a(p9b p9bVar, float f, q22<? super Float> q22Var) {
        return c(this, p9bVar, f, q22Var);
    }

    Object b(p9b p9bVar, float f, Function1<? super Float, Unit> function1, q22<? super Float> q22Var);
}
