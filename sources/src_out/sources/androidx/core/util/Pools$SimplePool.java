package androidx.core.util;

import com.google.inputmethod.jg9;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0006\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000bR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"androidx/core/util/Pools$SimplePool", "", "T", "Lcom/google/android/jg9;", "", "maxPoolSize", "<init>", "(I)V", "instance", "", "a", "(Ljava/lang/Object;)Z", "acquire", "()Ljava/lang/Object;", "release", "", "[Ljava/lang/Object;", "pool", "b", "I", "poolSize", "core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class Pools$SimplePool<T> implements jg9<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Object[] pool;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int poolSize;

    public Pools$SimplePool(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.pool = new Object[i];
    }

    private final boolean a(T instance) {
        int i = this.poolSize;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.pool[i2] == instance) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.inputmethod.jg9
    public T acquire() {
        int i = this.poolSize;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        T t = (T) this.pool[i2];
        Intrinsics.h(t, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        this.pool[i2] = null;
        this.poolSize--;
        return t;
    }

    @Override // com.google.inputmethod.jg9
    public boolean release(T instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (a(instance)) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i = this.poolSize;
        Object[] objArr = this.pool;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = instance;
        this.poolSize = i + 1;
        return true;
    }
}
