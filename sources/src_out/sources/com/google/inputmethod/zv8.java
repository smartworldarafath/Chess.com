package com.google.inputmethod;

import androidx.compose.ui.b;
import com.google.android.q22;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J3\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006H&¢\u0006\u0004\b\b\u0010\tJ<\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\"\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fH¦@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001aÀ\u0006\u0001"}, d2 = {"Lcom/google/android/zv8;", "", "Lcom/google/android/rn8;", "delta", "Lcom/google/android/we8;", "source", "Lkotlin/Function1;", "performScroll", "c", "(JILkotlin/jvm/functions/Function1;)J", "Lcom/google/android/t3e;", "velocity", "Lkotlin/Function2;", "Lcom/google/android/q22;", "performFling", "", "a", "(JLkotlin/jvm/functions/Function2;Lcom/google/android/q22;)Ljava/lang/Object;", "", "b", "()Z", "isInProgress", "Lcom/google/android/x23;", "F", "()Lcom/google/android/x23;", "node", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface zv8 {

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/google/android/zv8$a", "Landroidx/compose/ui/b$c;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends b.c {
        a() {
        }
    }

    default x23 F() {
        return new a();
    }

    Object a(long j, Function2<? super t3e, ? super q22<? super t3e>, ? extends Object> function2, q22<? super Unit> q22Var);

    boolean b();

    long c(long delta, int source, Function1<? super rn8, rn8> performScroll);
}
