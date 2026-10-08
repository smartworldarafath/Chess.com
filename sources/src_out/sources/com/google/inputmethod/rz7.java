package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u0000 \n2\u00020\u0001:\u0001\u000bR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0018\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcom/google/android/rz7;", "Lkotlin/coroutines/CoroutineContext$Element;", "", "B0", "()F", "scaleFactor", "Lkotlin/coroutines/CoroutineContext$b;", "getKey", "()Lkotlin/coroutines/CoroutineContext$b;", "key", "g2", "b", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface rz7 extends CoroutineContext.Element {

    /* JADX INFO: renamed from: g2, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public static <R> R a(rz7 rz7Var, R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) CoroutineContext.Element.a.a(rz7Var, r, function2);
        }

        public static <E extends CoroutineContext.Element> E b(rz7 rz7Var, CoroutineContext.b<E> bVar) {
            return (E) CoroutineContext.Element.a.b(rz7Var, bVar);
        }

        public static CoroutineContext c(rz7 rz7Var, CoroutineContext.b<?> bVar) {
            return CoroutineContext.Element.a.c(rz7Var, bVar);
        }

        public static CoroutineContext d(rz7 rz7Var, CoroutineContext coroutineContext) {
            return CoroutineContext.Element.a.d(rz7Var, coroutineContext);
        }
    }

    /* JADX INFO: renamed from: com.google.android.rz7$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/google/android/rz7$b;", "Lkotlin/coroutines/CoroutineContext$b;", "Lcom/google/android/rz7;", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements CoroutineContext.b<rz7> {
        static final /* synthetic */ Companion a = new Companion();

        private Companion() {
        }
    }

    float B0();

    default CoroutineContext.b<?> getKey() {
        return INSTANCE;
    }
}
