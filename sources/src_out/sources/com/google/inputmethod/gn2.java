package com.google.inputmethod;

import com.google.android.ai4;
import com.google.android.p58;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.p;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bR&\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\t8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u0012\u0004\b\f\u0010\u0004R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000eR\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/google/android/gn2;", "T", "", "<init>", "()V", "Lcom/google/android/o6c;", "newState", "c", "(Lcom/google/android/o6c;)Lcom/google/android/o6c;", "Lcom/google/android/p58;", "a", "Lcom/google/android/p58;", "getCachedValue$annotations", "cachedValue", "()Lcom/google/android/o6c;", "currentState", "Lcom/google/android/ai4;", "b", "()Lcom/google/android/ai4;", "flow", "datastore-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class gn2<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final p58<o6c<T>> cachedValue;

    public gn2() {
        ksd ksdVar = ksd.b;
        Intrinsics.h(ksdVar, "null cannot be cast to non-null type androidx.datastore.core.State<T of androidx.datastore.core.DataStoreInMemoryCache>");
        this.cachedValue = p.a(ksdVar);
    }

    public final o6c<T> a() {
        return (o6c) this.cachedValue.getValue();
    }

    public final ai4<o6c<T>> b() {
        return this.cachedValue;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0044  */
    public final o6c<T> c(o6c<T> newState) {
        Object value;
        o6c<T> o6cVar;
        Intrinsics.checkNotNullParameter(newState, "newState");
        p58<o6c<T>> p58Var = this.cachedValue;
        do {
            value = p58Var.getValue();
            o6cVar = (o6c) value;
            if ((o6cVar instanceof t8a) || Intrinsics.e(o6cVar, ksd.b)) {
                o6cVar = newState;
            } else if (o6cVar instanceof ol2) {
                if (newState.getVersion() > ((ol2) o6cVar).getVersion()) {
                    o6cVar = newState;
                }
            } else if (!(o6cVar instanceof ua4)) {
                if (o6cVar instanceof ji8) {
                    throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                }
                throw new NoWhenBranchMatchedException();
            }
        } while (!p58Var.c(value, o6cVar));
        return o6cVar;
    }
}
