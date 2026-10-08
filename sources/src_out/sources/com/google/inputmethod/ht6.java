package com.google.inputmethod;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0012B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00012\b\u0010\t\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u00060\u0018R\u00020\u00000\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/google/android/ht6;", "", "Lcom/google/android/cya;", "saveableStateHolder", "Lkotlin/Function0;", "Lcom/google/android/lt6;", "itemProvider", "<init>", "(Lcom/google/android/cya;Lkotlin/jvm/functions/Function0;)V", "key", "c", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "index", "contentType", "", "b", "(ILjava/lang/Object;Ljava/lang/Object;)Lkotlin/jvm/functions/Function2;", "a", "Lcom/google/android/cya;", "Lkotlin/jvm/functions/Function0;", "d", "()Lkotlin/jvm/functions/Function0;", "Lcom/google/android/k58;", "Lcom/google/android/ht6$a;", "Lcom/google/android/k58;", "lambdasCache", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ht6 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final cya saveableStateHolder;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Function0<lt6> itemProvider;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final k58<Object, a> lambdasCache = k4b.c();

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0082\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR$\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0017R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\b8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/google/android/ht6$a;", "", "", "index", "key", "contentType", "<init>", "(Lcom/google/android/ht6;ILjava/lang/Object;Ljava/lang/Object;)V", "Lkotlin/Function0;", "", "d", "()Lkotlin/jvm/functions/Function2;", "a", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "b", "h", "value", "c", "I", "i", "()I", "Lkotlin/jvm/functions/Function2;", "_content", "g", "content", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Object key;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Object contentType;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private int index;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private Function2<? super d, ? super Integer, Unit> _content;

        /* JADX INFO: renamed from: com.google.android.ht6$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/google/android/ht6$a$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C0112a implements jd3 {
            public C0112a() {
            }

            @Override // com.google.inputmethod.jd3
            public void dispose() {
                a.this._content = null;
            }
        }

        public a(int i, Object obj, Object obj2) {
            this.key = obj;
            this.contentType = obj2;
            this.index = i;
        }

        private final Function2<d, Integer, Unit> d() {
            final ht6 ht6Var = ht6.this;
            return ko1.c(818252804, true, new Function2() { // from class: com.google.android.ft6
                public final Object invoke(Object obj, Object obj2) {
                    return ht6.a.e(ht6Var, this, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(ht6 ht6Var, final a aVar, d dVar, int i) {
            d dVar2;
            if (dVar.g((i & 3) != 2, i & 1)) {
                if (e.k()) {
                    e.o(818252804, i, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent.createContentLambda.<anonymous> (LazyLayoutItemContentFactory.kt:85)");
                }
                lt6 lt6Var = (lt6) ht6Var.d().invoke();
                int iC = aVar.index;
                if ((iC >= lt6Var.a() || !Intrinsics.e(lt6Var.d(iC), aVar.key)) && (iC = lt6Var.c(aVar.key)) != -1) {
                    aVar.index = iC;
                }
                int i2 = iC;
                if (i2 != -1) {
                    dVar.y(-1664741271);
                    dVar2 = dVar;
                    kt6.c(lt6Var, v3c.a(ht6Var.saveableStateHolder), i2, v3c.a(aVar.key), dVar2, 0);
                    dVar2.u();
                } else {
                    dVar2 = dVar;
                    dVar2.y(-1664505826);
                    dVar2.u();
                }
                Object obj = aVar.key;
                boolean zT = dVar2.T(aVar);
                Object objR = dVar2.R();
                if (zT || objR == d.INSTANCE.a()) {
                    objR = new Function1() { // from class: com.google.android.gt6
                        public final Object invoke(Object obj2) {
                            return ht6.a.f(this.a, (kd3) obj2);
                        }
                    };
                    dVar2.L(objR);
                }
                vn3.c(obj, (Function1) objR, dVar2, 0);
                if (e.k()) {
                    e.n();
                }
            } else {
                dVar.q();
            }
            return Unit.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jd3 f(a aVar, kd3 kd3Var) {
            return aVar.new C0112a();
        }

        public final Function2<d, Integer, Unit> g() {
            Function2 function2 = this._content;
            if (function2 != null) {
                return function2;
            }
            Function2<d, Integer, Unit> function2D = d();
            this._content = function2D;
            return function2D;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final Object getContentType() {
            return this.contentType;
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final int getIndex() {
            return this.index;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ht6(cya cyaVar, Function0<? extends lt6> function0) {
        this.saveableStateHolder = cyaVar;
        this.itemProvider = function0;
    }

    public final Function2<d, Integer, Unit> b(int index, Object key, Object contentType) {
        a aVarE = this.lambdasCache.e(key);
        if (aVarE != null && aVarE.getIndex() == index && Intrinsics.e(aVarE.getContentType(), contentType)) {
            return aVarE.g();
        }
        a aVar = new a(index, key, contentType);
        this.lambdasCache.x(key, aVar);
        return aVar.g();
    }

    public final Object c(Object key) {
        if (key == null) {
            return null;
        }
        a aVarE = this.lambdasCache.e(key);
        if (aVarE != null) {
            return aVarE.getContentType();
        }
        lt6 lt6Var = (lt6) this.itemProvider.invoke();
        int iC = lt6Var.c(key);
        if (iC != -1) {
            return lt6Var.f(iC);
        }
        return null;
    }

    public final Function0<lt6> d() {
        return this.itemProvider;
    }
}
