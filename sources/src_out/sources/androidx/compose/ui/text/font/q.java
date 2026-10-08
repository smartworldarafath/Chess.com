package androidx.compose.ui.text.font;

import com.google.android.qjd;
import com.google.inputmethod.TypefaceRequest;
import com.google.inputmethod.wa9;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aY\u0010\f\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000\u0012\u0004\u0012\u00020\t0\u000b*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "Landroidx/compose/ui/text/font/k;", "Lcom/google/android/kod;", "typefaceRequest", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "asyncTypefaceCache", "Lcom/google/android/wa9;", "platformFontLoader", "Lkotlin/Function1;", "", "createDefaultTypeface", "Lkotlin/Pair;", "b", "(Ljava/util/List;Lcom/google/android/kod;Landroidx/compose/ui/text/font/AsyncTypefaceCache;Lcom/google/android/wa9;Lkotlin/jvm/functions/Function1;)Lkotlin/Pair;", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class q {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Pair<List<k>, Object> b(List<? extends k> list, TypefaceRequest typefaceRequest, AsyncTypefaceCache asyncTypefaceCache, wa9 wa9Var, Function1<? super TypefaceRequest, ? extends Object> function1) {
        Object objInvoke;
        Object objInvoke2;
        Object objB;
        Object result;
        int size = list.size();
        List listV = null;
        for (int i = 0; i < size; i++) {
            k kVar = list.get(i);
            int loadingStrategy = kVar.getLoadingStrategy();
            r.Companion companion = r.INSTANCE;
            if (r.e(loadingStrategy, companion.b())) {
                synchronized (asyncTypefaceCache.cacheLock) {
                    try {
                        AsyncTypefaceCache.Key key = new AsyncTypefaceCache.Key(kVar, wa9Var.getCacheKey());
                        AsyncTypefaceCache.a aVar = (AsyncTypefaceCache.a) asyncTypefaceCache.resultCache.d(key);
                        if (aVar == null) {
                            aVar = (AsyncTypefaceCache.a) asyncTypefaceCache.permanentCache.e(key);
                        }
                        if (aVar != null) {
                            objInvoke2 = aVar.getResult();
                        } else {
                            Unit unit = Unit.a;
                            try {
                                objInvoke = wa9Var.a(kVar);
                            } catch (Exception unused) {
                                objInvoke = function1.invoke(typefaceRequest);
                            }
                            Object obj = objInvoke;
                            AsyncTypefaceCache.f(asyncTypefaceCache, kVar, wa9Var, obj, false, 8, null);
                            objInvoke2 = obj;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (objInvoke2 == null) {
                    objInvoke2 = function1.invoke(typefaceRequest);
                }
                return qjd.a(listV, v.a(typefaceRequest.getFontSynthesis(), objInvoke2, kVar, typefaceRequest.getFontWeight(), typefaceRequest.getFontStyle()));
            }
            if (r.e(loadingStrategy, companion.c())) {
                synchronized (asyncTypefaceCache.cacheLock) {
                    try {
                        AsyncTypefaceCache.Key key2 = new AsyncTypefaceCache.Key(kVar, wa9Var.getCacheKey());
                        AsyncTypefaceCache.a aVar2 = (AsyncTypefaceCache.a) asyncTypefaceCache.resultCache.d(key2);
                        if (aVar2 == null) {
                            aVar2 = (AsyncTypefaceCache.a) asyncTypefaceCache.permanentCache.e(key2);
                        }
                        if (aVar2 != null) {
                            result = aVar2.getResult();
                        } else {
                            Unit unit2 = Unit.a;
                            try {
                                Result.a aVar3 = Result.a;
                                objB = Result.b(wa9Var.a(kVar));
                            } catch (Throwable th2) {
                                Result.a aVar4 = Result.a;
                                objB = Result.b(kotlin.f.a(th2));
                            }
                            Object obj2 = Result.g(objB) ? null : objB;
                            AsyncTypefaceCache.f(asyncTypefaceCache, kVar, wa9Var, obj2, false, 8, null);
                            result = obj2;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (result != null) {
                    return qjd.a(listV, v.a(typefaceRequest.getFontSynthesis(), result, kVar, typefaceRequest.getFontWeight(), typefaceRequest.getFontStyle()));
                }
            } else {
                if (!r.e(loadingStrategy, companion.a())) {
                    throw new IllegalStateException("Unknown font type " + kVar);
                }
                AsyncTypefaceCache.a aVarD = asyncTypefaceCache.d(kVar, wa9Var);
                if (aVarD != null) {
                    if (!AsyncTypefaceCache.a.e(aVarD.getResult()) && aVarD.getResult() != null) {
                        return qjd.a(listV, v.a(typefaceRequest.getFontSynthesis(), aVarD.getResult(), kVar, typefaceRequest.getFontWeight(), typefaceRequest.getFontStyle()));
                    }
                } else if (listV == null) {
                    listV = kotlin.collections.m.v(new k[]{kVar});
                } else {
                    listV.add(kVar);
                }
            }
        }
        return qjd.a(listV, function1.invoke(typefaceRequest));
    }
}
