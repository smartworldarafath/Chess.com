package com.google.inputmethod;

import androidx.collection.ObjectList;
import com.google.android.zk1;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.m;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a%\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001aK\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00010\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001aE\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00010\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0007H\u0000¢\u0006\u0004\b\f\u0010\r\u001aE\u0010\u000f\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00010\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0007H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001f\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"T", "Landroidx/collection/ObjectList;", "Lcom/google/android/e58;", "e", "(Landroidx/collection/ObjectList;)Lcom/google/android/e58;", "", "K", "Lkotlin/Function1;", "selector", "d", "(Landroidx/collection/ObjectList;Lkotlin/jvm/functions/Function1;)Landroidx/collection/ObjectList;", "", "a", "(Landroidx/collection/ObjectList;Lkotlin/jvm/functions/Function1;)Z", "", "c", "(Lcom/google/android/e58;Lkotlin/jvm/functions/Function1;)V", "b", "(Lcom/google/android/e58;)Ljava/lang/Object;", "runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class i24 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        final /* synthetic */ Function1 a;

        public a(Function1 function1) {
            this.a = function1;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Function1 function1 = this.a;
            return zk1.e((Comparable) function1.invoke(t), (Comparable) function1.invoke(t2));
        }
    }

    public static final <T, K extends Comparable<? super K>> boolean a(ObjectList<T> objectList, Function1<? super T, ? extends K> function1) {
        if (objectList.get_size() <= 1) {
            return true;
        }
        Comparable comparable = (Comparable) function1.invoke(objectList.d(0));
        if (comparable == null) {
            return false;
        }
        int i = objectList.get_size();
        int i2 = 1;
        while (i2 < i) {
            Comparable comparable2 = (Comparable) function1.invoke(objectList.d(i2));
            if (comparable2 == null || comparable.compareTo(comparable2) > 0) {
                return false;
            }
            i2++;
            comparable = comparable2;
        }
        return true;
    }

    public static final <T> T b(e58<T> e58Var) {
        if (e58Var.g()) {
            throw new NoSuchElementException("List is empty.");
        }
        int i = e58Var.get_size() - 1;
        T tD = e58Var.d(i);
        e58Var.B(i);
        return tD;
    }

    public static final <T, K extends Comparable<? super K>> void c(e58<T> e58Var, Function1<? super T, ? extends K> function1) {
        List<T> listT = e58Var.t();
        if (listT.size() > 1) {
            m.F(listT, new a(function1));
        }
    }

    public static final <T, K extends Comparable<? super K>> ObjectList<T> d(ObjectList<T> objectList, Function1<? super T, ? extends K> function1) {
        if (a(objectList, function1)) {
            return objectList;
        }
        e58 e58VarE = e(objectList);
        c(e58VarE, function1);
        return e58VarE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> e58<T> e(ObjectList<T> objectList) {
        e58<T> e58Var = (e58<T>) new e58(objectList.get_size());
        Object[] objArr = objectList.content;
        int i = objectList._size;
        for (int i2 = 0; i2 < i; i2++) {
            e58Var.n(objArr[i2]);
        }
        return e58Var;
    }
}
