package androidx.datastore.p007core;

import com.google.android.a68;
import com.google.android.ai4;
import com.google.android.q22;
import com.google.android.ut0;
import com.google.android.x58;
import com.google.inputmethod.f26;
import com.google.inputmethod.s30;
import com.google.inputmethod.t04;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u001c\u0010\n\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ:\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\rH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001bR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b\u0017\u0010 ¨\u0006\""}, d2 = {"Landroidx/datastore/core/SingleProcessCoordinator;", "Lcom/google/android/f26;", "", "filePath", "<init>", "(Ljava/lang/String;)V", "T", "Lkotlin/Function1;", "Lcom/google/android/q22;", "", "block", "d", "(Lkotlin/jvm/functions/Function1;Lcom/google/android/q22;)Ljava/lang/Object;", "Lkotlin/Function2;", "", "c", "(Lkotlin/jvm/functions/Function2;Lcom/google/android/q22;)Ljava/lang/Object;", "", "a", "(Lcom/google/android/q22;)Ljava/lang/Object;", "e", "Ljava/lang/String;", "Lcom/google/android/x58;", "b", "Lcom/google/android/x58;", "mutex", "Lcom/google/android/s30;", "Lcom/google/android/s30;", "version", "Lcom/google/android/ai4;", "", "Lcom/google/android/ai4;", "()Lcom/google/android/ai4;", "updateNotifications", "datastore-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SingleProcessCoordinator implements f26 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String filePath;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final x58 mutex;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final s30 version;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final ai4<Unit> updateNotifications;

    public SingleProcessCoordinator(String str) {
        Intrinsics.checkNotNullParameter(str, "filePath");
        this.filePath = str;
        this.mutex = a68.b(false, 1, (Object) null);
        this.version = new s30(0);
        this.updateNotifications = d.O(new ui4(null));
    }

    @Override // com.google.inputmethod.f26
    public Object a(q22<? super Integer> q22Var) {
        return ut0.e(this.version.b());
    }

    @Override // com.google.inputmethod.f26
    public ai4<Unit> b() {
        return this.updateNotifications;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0059  */
    /* JADX WARN: Code duplicated, block: B:29:0x0063  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.google.inputmethod.f26
    public <T> Object c(Function2<? super Boolean, ? super q22<? super T>, ? extends Object> function2, q22<? super T> q22Var) throws Throwable {
        SingleProcessCoordinator$tryLock$1 singleProcessCoordinator$tryLock$1;
        x58 x58Var;
        Throwable th;
        boolean z;
        if (q22Var instanceof SingleProcessCoordinator$tryLock$1) {
            singleProcessCoordinator$tryLock$1 = (SingleProcessCoordinator$tryLock$1) q22Var;
            int i = singleProcessCoordinator$tryLock$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                singleProcessCoordinator$tryLock$1.label = i - t04.INVALID_ID;
            } else {
                singleProcessCoordinator$tryLock$1 = new SingleProcessCoordinator$tryLock$1(this, q22Var);
            }
        } else {
            singleProcessCoordinator$tryLock$1 = new SingleProcessCoordinator$tryLock$1(this, q22Var);
        }
        Object obj = singleProcessCoordinator$tryLock$1.result;
        Object objG = a.g();
        int i2 = singleProcessCoordinator$tryLock$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = singleProcessCoordinator$tryLock$1.Z$0;
            x58Var = (x58) singleProcessCoordinator$tryLock$1.L$0;
            try {
                f.b(obj);
                if (z) {
                    x58Var.h((Object) null);
                }
                return obj;
            } catch (Throwable th2) {
                th = th2;
                if (z) {
                    x58Var.h((Object) null);
                }
                throw th;
            }
        }
        f.b(obj);
        x58 x58Var2 = this.mutex;
        boolean zA = x58Var2.a((Object) null);
        try {
            Boolean boolA = ut0.a(zA);
            singleProcessCoordinator$tryLock$1.L$0 = x58Var2;
            singleProcessCoordinator$tryLock$1.Z$0 = zA;
            singleProcessCoordinator$tryLock$1.label = 1;
            Object objInvoke = function2.invoke(boolA, singleProcessCoordinator$tryLock$1);
            if (objInvoke == objG) {
                return objG;
            }
            x58Var = x58Var2;
            obj = objInvoke;
            z = zA;
            if (z) {
                x58Var.h((Object) null);
            }
            return obj;
        } catch (Throwable th3) {
            x58Var = x58Var2;
            th = th3;
            z = zA;
            if (z) {
                x58Var.h((Object) null);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.google.inputmethod.f26
    public <T> Object d(Function1<? super q22<? super T>, ? extends Object> function1, q22<? super T> q22Var) throws Throwable {
        SingleProcessCoordinator$lock$1 singleProcessCoordinator$lock$1;
        x58 x58Var;
        Throwable th;
        x58 x58Var2;
        if (q22Var instanceof SingleProcessCoordinator$lock$1) {
            singleProcessCoordinator$lock$1 = (SingleProcessCoordinator$lock$1) q22Var;
            int i = singleProcessCoordinator$lock$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                singleProcessCoordinator$lock$1.label = i - t04.INVALID_ID;
            } else {
                singleProcessCoordinator$lock$1 = new SingleProcessCoordinator$lock$1(this, q22Var);
            }
        } else {
            singleProcessCoordinator$lock$1 = new SingleProcessCoordinator$lock$1(this, q22Var);
        }
        Object obj = singleProcessCoordinator$lock$1.result;
        Object objG = a.g();
        int i2 = singleProcessCoordinator$lock$1.label;
        try {
            if (i2 == 0) {
                f.b(obj);
                x58Var = this.mutex;
                singleProcessCoordinator$lock$1.L$0 = function1;
                singleProcessCoordinator$lock$1.L$1 = x58Var;
                singleProcessCoordinator$lock$1.label = 1;
                if (x58Var.g((Object) null, singleProcessCoordinator$lock$1) != objG) {
                }
                return objG;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x58Var2 = (x58) singleProcessCoordinator$lock$1.L$0;
                try {
                    f.b(obj);
                    x58Var2.h((Object) null);
                    return obj;
                } catch (Throwable th2) {
                    th = th2;
                    x58Var2.h((Object) null);
                    throw th;
                }
            }
            x58 x58Var3 = (x58) singleProcessCoordinator$lock$1.L$1;
            Function1<? super q22<? super T>, ? extends Object> function2 = (Function1) singleProcessCoordinator$lock$1.L$0;
            f.b(obj);
            x58Var = x58Var3;
            function1 = function2;
            singleProcessCoordinator$lock$1.L$0 = x58Var;
            singleProcessCoordinator$lock$1.L$1 = null;
            singleProcessCoordinator$lock$1.label = 2;
            Object objInvoke = function1.invoke(singleProcessCoordinator$lock$1);
            if (objInvoke != objG) {
                x58 x58Var4 = x58Var;
                obj = objInvoke;
                x58Var2 = x58Var4;
                x58Var2.h((Object) null);
                return obj;
            }
            return objG;
        } catch (Throwable th3) {
            x58 x58Var5 = x58Var;
            th = th3;
            x58Var2 = x58Var5;
            x58Var2.h((Object) null);
            throw th;
        }
    }

    @Override // com.google.inputmethod.f26
    public Object e(q22<? super Integer> q22Var) {
        return ut0.e(this.version.d());
    }
}
