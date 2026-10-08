package androidx.datastore.p007core;

import com.google.android.a68;
import com.google.android.hl1;
import com.google.android.jl1;
import com.google.android.q22;
import com.google.android.x58;
import com.google.inputmethod.t04;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.f;
import kotlinx.coroutines.s;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H¤@¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\b\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\r¨\u0006\u000f"}, d2 = {"Landroidx/datastore/core/RunOnce;", "", "<init>", "()V", "", "b", "(Lcom/google/android/q22;)Ljava/lang/Object;", "a", "c", "Lcom/google/android/x58;", "Lcom/google/android/x58;", "runMutex", "Lcom/google/android/hl1;", "Lcom/google/android/hl1;", "didRun", "datastore-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class RunOnce {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final x58 runMutex = a68.b(false, 1, (Object) null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final hl1<Unit> didRun = jl1.c((s) null, 1, (Object) null);

    public final Object a(q22<? super Unit> q22Var) {
        Object objK0 = this.didRun.k0(q22Var);
        return objK0 == a.g() ? objK0 : Unit.a;
    }

    protected abstract Object b(q22<? super Unit> q22Var);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(q22<? super Unit> q22Var) throws Throwable {
        RunOnce$runIfNeeded$1 runOnce$runIfNeeded$1;
        x58 x58Var;
        x58 x58Var2;
        Throwable th;
        if (q22Var instanceof RunOnce$runIfNeeded$1) {
            runOnce$runIfNeeded$1 = (RunOnce$runIfNeeded$1) q22Var;
            int i = runOnce$runIfNeeded$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                runOnce$runIfNeeded$1.label = i - t04.INVALID_ID;
            } else {
                runOnce$runIfNeeded$1 = new RunOnce$runIfNeeded$1(this, q22Var);
            }
        } else {
            runOnce$runIfNeeded$1 = new RunOnce$runIfNeeded$1(this, q22Var);
        }
        Object obj = runOnce$runIfNeeded$1.result;
        Object objG = a.g();
        int i2 = runOnce$runIfNeeded$1.label;
        try {
            if (i2 == 0) {
                f.b(obj);
                if (this.didRun.isCompleted()) {
                    return Unit.a;
                }
                x58Var = this.runMutex;
                runOnce$runIfNeeded$1.L$0 = x58Var;
                runOnce$runIfNeeded$1.label = 1;
                if (x58Var.g((Object) null, runOnce$runIfNeeded$1) != objG) {
                }
                return objG;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x58Var2 = (x58) runOnce$runIfNeeded$1.L$0;
                try {
                    f.b(obj);
                    hl1<Unit> hl1Var = this.didRun;
                    Unit unit = Unit.a;
                    hl1Var.L(unit);
                    x58Var2.h((Object) null);
                    return unit;
                } catch (Throwable th2) {
                    th = th2;
                    x58Var2.h((Object) null);
                    throw th;
                }
            }
            x58 x58Var3 = (x58) runOnce$runIfNeeded$1.L$0;
            f.b(obj);
            x58Var = x58Var3;
            if (this.didRun.isCompleted()) {
                Unit unit2 = Unit.a;
                x58Var.h((Object) null);
                return unit2;
            }
            runOnce$runIfNeeded$1.L$0 = x58Var;
            runOnce$runIfNeeded$1.label = 2;
            if (b(runOnce$runIfNeeded$1) != objG) {
                x58Var2 = x58Var;
                hl1<Unit> hl1Var2 = this.didRun;
                Unit unit3 = Unit.a;
                hl1Var2.L(unit3);
                x58Var2.h((Object) null);
                return unit3;
            }
            return objG;
        } catch (Throwable th3) {
            x58Var2 = x58Var;
            th = th3;
            x58Var2.h((Object) null);
            throw th;
        }
    }
}
