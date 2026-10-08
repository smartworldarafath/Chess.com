package androidx.datastore.p007core;

import com.google.inputmethod.ym2;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\fB\u001d\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/datastore/core/c;", "Lkotlin/coroutines/CoroutineContext$Element;", "parent", "Landroidx/datastore/core/DataStoreImpl;", "instance", "<init>", "(Landroidx/datastore/core/c;Landroidx/datastore/core/DataStoreImpl;)V", "Lcom/google/android/ym2;", "candidate", "", "c", "(Lcom/google/android/ym2;)V", "a", "Landroidx/datastore/core/c;", "b", "Landroidx/datastore/core/DataStoreImpl;", "Lkotlin/coroutines/CoroutineContext$b;", "getKey", "()Lkotlin/coroutines/CoroutineContext$b;", "key", "datastore-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c implements CoroutineContext.Element {
    private static final String d = "Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final c parent;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final DataStoreImpl<?> instance;

    public c(c cVar, DataStoreImpl<?> dataStoreImpl) {
        Intrinsics.checkNotNullParameter(dataStoreImpl, "instance");
        this.parent = cVar;
        this.instance = dataStoreImpl;
    }

    public final void c(ym2<?> candidate) {
        Intrinsics.checkNotNullParameter(candidate, "candidate");
        if (this.instance == candidate) {
            throw new IllegalStateException(d.toString());
        }
        c cVar = this.parent;
        if (cVar != null) {
            cVar.c(candidate);
        }
    }

    public /* bridge */ <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) CoroutineContext.Element.a.a(this, r, function2);
    }

    public /* bridge */ <E extends CoroutineContext.Element> E get(CoroutineContext.b<E> bVar) {
        return (E) CoroutineContext.Element.a.b(this, bVar);
    }

    public CoroutineContext.b<?> getKey() {
        return Companion.C0078a.a;
    }

    public /* bridge */ CoroutineContext minusKey(CoroutineContext.b<?> bVar) {
        return CoroutineContext.Element.a.c(this, bVar);
    }

    public /* bridge */ CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.Element.a.d(this, coroutineContext);
    }
}
