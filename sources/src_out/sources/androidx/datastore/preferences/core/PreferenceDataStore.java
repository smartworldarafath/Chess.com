package androidx.datastore.preferences.core;

import com.google.android.ai4;
import com.google.android.q22;
import com.google.inputmethod.uk9;
import com.google.inputmethod.ym2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\n\u001a\u00020\u00022\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Landroidx/datastore/preferences/core/PreferenceDataStore;", "Lcom/google/android/ym2;", "Lcom/google/android/uk9;", "delegate", "<init>", "(Lcom/google/android/ym2;)V", "Lkotlin/Function2;", "Lcom/google/android/q22;", "", "transform", "a", "(Lkotlin/jvm/functions/Function2;Lcom/google/android/q22;)Ljava/lang/Object;", "Lcom/google/android/ym2;", "Lcom/google/android/ai4;", "getData", "()Lcom/google/android/ai4;", "data", "datastore-preferences-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PreferenceDataStore implements ym2<uk9> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ym2<uk9> delegate;

    public PreferenceDataStore(ym2<uk9> ym2Var) {
        Intrinsics.checkNotNullParameter(ym2Var, "delegate");
        this.delegate = ym2Var;
    }

    @Override // com.google.inputmethod.ym2
    public Object a(Function2<? super uk9, ? super q22<? super uk9>, ? extends Object> function2, q22<? super uk9> q22Var) {
        return this.delegate.a(new PreferenceDataStore$updateData$2(function2, null), q22Var);
    }

    @Override // com.google.inputmethod.ym2
    public ai4<uk9> getData() {
        return this.delegate.getData();
    }
}
