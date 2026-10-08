package androidx.compose.p004runtime;

import com.google.android.oq2;
import com.google.android.q22;
import com.google.inputmethod.io9;
import com.google.inputmethod.o58;
import com.google.inputmethod.t04;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.f;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.e;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\f\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0017\u001a\u00028\u00008\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Landroidx/compose/runtime/ProduceStateScopeImpl;", "T", "Lcom/google/android/io9;", "Lcom/google/android/o58;", "state", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "(Lcom/google/android/o58;Lkotlin/coroutines/CoroutineContext;)V", "Lkotlin/Function0;", "", "onDispose", "", "S0", "(Lkotlin/jvm/functions/Function0;Lcom/google/android/q22;)Ljava/lang/Object;", "b", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "value", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class ProduceStateScopeImpl<T> implements io9<T>, o58<T> {
    private final /* synthetic */ o58<T> a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final CoroutineContext coroutineContext;

    public ProduceStateScopeImpl(o58<T> o58Var, CoroutineContext coroutineContext) {
        this.a = o58Var;
        this.coroutineContext = coroutineContext;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.google.inputmethod.io9
    public Object S0(Function0<Unit> function0, q22<?> q22Var) {
        ProduceStateScopeImpl$awaitDispose$1 produceStateScopeImpl$awaitDispose$1;
        if (q22Var instanceof ProduceStateScopeImpl$awaitDispose$1) {
            produceStateScopeImpl$awaitDispose$1 = (ProduceStateScopeImpl$awaitDispose$1) q22Var;
            int i = produceStateScopeImpl$awaitDispose$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                produceStateScopeImpl$awaitDispose$1.label = i - t04.INVALID_ID;
            } else {
                produceStateScopeImpl$awaitDispose$1 = new ProduceStateScopeImpl$awaitDispose$1(this, q22Var);
            }
        } else {
            produceStateScopeImpl$awaitDispose$1 = new ProduceStateScopeImpl$awaitDispose$1(this, q22Var);
        }
        Object obj = produceStateScopeImpl$awaitDispose$1.result;
        Object objG = a.g();
        int i2 = produceStateScopeImpl$awaitDispose$1.label;
        try {
            if (i2 == 0) {
                f.b(obj);
                produceStateScopeImpl$awaitDispose$1.L$0 = function0;
                produceStateScopeImpl$awaitDispose$1.label = 1;
                e eVar = new e(a.d(produceStateScopeImpl$awaitDispose$1), 1);
                eVar.G();
                Object objY = eVar.y();
                if (objY == a.g()) {
                    oq2.c(produceStateScopeImpl$awaitDispose$1);
                }
                if (objY == objG) {
                    return objG;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function0 = (Function0) produceStateScopeImpl$awaitDispose$1.L$0;
                f.b(obj);
            }
            throw new KotlinNothingValueException();
        } catch (Throwable th) {
            function0.invoke();
            throw th;
        }
    }

    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // com.google.inputmethod.o58, com.google.inputmethod.q6c
    public T getValue() {
        return this.a.getValue();
    }

    @Override // com.google.inputmethod.o58
    public void setValue(T t) {
        this.a.setValue(t);
    }
}
