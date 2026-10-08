package com.google.inputmethod;

import androidx.datastore.p007core.CorruptionException;
import com.google.android.q22;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\t\u0010\nR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/google/android/jia;", "T", "Lcom/google/android/ya2;", "Lkotlin/Function1;", "Landroidx/datastore/core/CorruptionException;", "produceNewData", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "ex", "a", "(Landroidx/datastore/core/CorruptionException;Lcom/google/android/q22;)Ljava/lang/Object;", "Lkotlin/jvm/functions/Function1;", "datastore-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class jia<T> implements ya2<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Function1<CorruptionException, T> produceNewData;

    /* JADX WARN: Multi-variable type inference failed */
    public jia(Function1<? super CorruptionException, ? extends T> function1) {
        Intrinsics.checkNotNullParameter(function1, "produceNewData");
        this.produceNewData = function1;
    }

    @Override // com.google.inputmethod.ya2
    public Object a(CorruptionException corruptionException, q22<? super T> q22Var) throws IOException {
        return this.produceNewData.invoke(corruptionException);
    }
}
