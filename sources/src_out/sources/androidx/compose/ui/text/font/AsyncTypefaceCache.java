package androidx.compose.ui.text.font;

import com.google.android.q22;
import com.google.inputmethod.dd7;
import com.google.inputmethod.gic;
import com.google.inputmethod.k4b;
import com.google.inputmethod.k58;
import com.google.inputmethod.t04;
import com.google.inputmethod.wa9;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0016\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010JJ\u0010\u0014\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u001e\u0010\u0013\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011H\u0086@¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000e0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000e0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010#¨\u0006%"}, d2 = {"Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "", "<init>", "()V", "Landroidx/compose/ui/text/font/k;", "font", "Lcom/google/android/wa9;", "platformFontLoader", "result", "", "forever", "", "e", "(Landroidx/compose/ui/text/font/k;Lcom/google/android/wa9;Ljava/lang/Object;Z)V", "Landroidx/compose/ui/text/font/AsyncTypefaceCache$a;", "d", "(Landroidx/compose/ui/text/font/k;Lcom/google/android/wa9;)Landroidx/compose/ui/text/font/AsyncTypefaceCache$a;", "Lkotlin/Function1;", "Lcom/google/android/q22;", "block", "g", "(Landroidx/compose/ui/text/font/k;Lcom/google/android/wa9;ZLkotlin/jvm/functions/Function1;Lcom/google/android/q22;)Ljava/lang/Object;", "a", "Ljava/lang/Object;", "PermanentFailure", "Lcom/google/android/dd7;", "Landroidx/compose/ui/text/font/AsyncTypefaceCache$b;", "b", "Lcom/google/android/dd7;", "resultCache", "Lcom/google/android/k58;", "c", "Lcom/google/android/k58;", "permanentCache", "Lcom/google/android/gic;", "Lcom/google/android/gic;", "cacheLock", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AsyncTypefaceCache {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Object PermanentFailure = a.b(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final dd7<Key, a> resultCache = new dd7<>(16);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final k58<Key, a> permanentCache = k4b.c();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final gic cacheLock = new gic();

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081@\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0014\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000e\u0088\u0001\u0002\u0092\u0001\u0004\u0018\u00010\u0001¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/text/font/AsyncTypefaceCache$a;", "", "result", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "getResult", "()Ljava/lang/Object;", "e", "isPermanentFailure", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Object result;

        private /* synthetic */ a(Object obj) {
            this.result = obj;
        }

        public static final /* synthetic */ a a(Object obj) {
            return new a(obj);
        }

        public static Object b(Object obj) {
            return obj;
        }

        public static boolean c(Object obj, Object obj2) {
            return (obj2 instanceof a) && Intrinsics.e(obj, ((a) obj2).getResult());
        }

        public static int d(Object obj) {
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public static final boolean e(Object obj) {
            return obj == null;
        }

        public static String f(Object obj) {
            return "AsyncTypefaceResult(result=" + obj + ')';
        }

        public boolean equals(Object other) {
            return c(this.result, other);
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final /* synthetic */ Object getResult() {
            return this.result;
        }

        public int hashCode() {
            return d(this.result);
        }

        public String toString() {
            return f(this.result);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.text.font.AsyncTypefaceCache$b, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/text/font/AsyncTypefaceCache$b;", "", "Landroidx/compose/ui/text/font/k;", "font", "loaderKey", "<init>", "(Landroidx/compose/ui/text/font/k;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/text/font/k;", "getFont", "()Landroidx/compose/ui/text/font/k;", "b", "Ljava/lang/Object;", "getLoaderKey", "()Ljava/lang/Object;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Key {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        private final k font;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        private final Object loaderKey;

        public Key(k kVar, Object obj) {
            this.font = kVar;
            this.loaderKey = obj;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Key)) {
                return false;
            }
            Key key = (Key) other;
            return Intrinsics.e(this.font, key.font) && Intrinsics.e(this.loaderKey, key.loaderKey);
        }

        public int hashCode() {
            int iHashCode = this.font.hashCode() * 31;
            Object obj = this.loaderKey;
            return iHashCode + (obj == null ? 0 : obj.hashCode());
        }

        public String toString() {
            return "Key(font=" + this.font + ", loaderKey=" + this.loaderKey + ')';
        }
    }

    public static /* synthetic */ void f(AsyncTypefaceCache asyncTypefaceCache, k kVar, wa9 wa9Var, Object obj, boolean z, int i, Object obj2) {
        if ((i & 8) != 0) {
            z = false;
        }
        asyncTypefaceCache.e(kVar, wa9Var, obj, z);
    }

    public final a d(k font, wa9 platformFontLoader) {
        a aVarD;
        Key key = new Key(font, platformFontLoader.getCacheKey());
        synchronized (this.cacheLock) {
            aVarD = this.resultCache.d(key);
            if (aVarD == null) {
                aVarD = this.permanentCache.e(key);
            }
        }
        return aVarD;
    }

    public final void e(k font, wa9 platformFontLoader, Object result, boolean forever) {
        Key key = new Key(font, platformFontLoader.getCacheKey());
        synchronized (this.cacheLock) {
            try {
                if (result == null) {
                    this.permanentCache.x(key, a.a(this.PermanentFailure));
                    Unit unit = Unit.a;
                } else if (forever) {
                    this.permanentCache.x(key, a.a(a.b(result)));
                    Unit unit2 = Unit.a;
                } else {
                    this.resultCache.f(key, a.a(a.b(result)));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(k kVar, wa9 wa9Var, boolean z, Function1<? super q22<Object>, ? extends Object> function1, q22<Object> q22Var) {
        AsyncTypefaceCache$runCached$1 asyncTypefaceCache$runCached$1;
        Key key;
        if (q22Var instanceof AsyncTypefaceCache$runCached$1) {
            asyncTypefaceCache$runCached$1 = (AsyncTypefaceCache$runCached$1) q22Var;
            int i = asyncTypefaceCache$runCached$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                asyncTypefaceCache$runCached$1.label = i - t04.INVALID_ID;
            } else {
                asyncTypefaceCache$runCached$1 = new AsyncTypefaceCache$runCached$1(this, q22Var);
            }
        } else {
            asyncTypefaceCache$runCached$1 = new AsyncTypefaceCache$runCached$1(this, q22Var);
        }
        Object obj = asyncTypefaceCache$runCached$1.result;
        Object objG = kotlin.coroutines.intrinsics.a.g();
        int i2 = asyncTypefaceCache$runCached$1.label;
        if (i2 == 0) {
            kotlin.f.b(obj);
            Key key2 = new Key(kVar, wa9Var.getCacheKey());
            synchronized (this.cacheLock) {
                try {
                    a aVarD = this.resultCache.d(key2);
                    if (aVarD == null) {
                        aVarD = this.permanentCache.e(key2);
                    }
                    if (aVarD != null) {
                        return aVarD.getResult();
                    }
                    Unit unit = Unit.a;
                    asyncTypefaceCache$runCached$1.L$0 = key2;
                    asyncTypefaceCache$runCached$1.Z$0 = z;
                    asyncTypefaceCache$runCached$1.label = 1;
                    Object objInvoke = function1.invoke(asyncTypefaceCache$runCached$1);
                    if (objInvoke == objG) {
                        return objG;
                    }
                    obj = objInvoke;
                    key = key2;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = asyncTypefaceCache$runCached$1.Z$0;
            key = (Key) asyncTypefaceCache$runCached$1.L$0;
            kotlin.f.b(obj);
        }
        synchronized (this.cacheLock) {
            try {
                if (obj == null) {
                    this.permanentCache.x(key, a.a(this.PermanentFailure));
                } else if (z) {
                    this.permanentCache.x(key, a.a(a.b(obj)));
                } else {
                    this.resultCache.f(key, a.a(a.b(obj)));
                }
                Unit unit2 = Unit.a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }
}
