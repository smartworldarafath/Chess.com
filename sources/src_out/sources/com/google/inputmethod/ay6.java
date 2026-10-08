package com.google.inputmethod;

import androidx.compose.p004runtime.d;
import com.google.android.rs4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJs\u0010\u0013\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00042\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00042\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00042\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010 \u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/google/android/ay6;", "Lcom/google/android/wy6;", "Lcom/google/android/ct6;", "Lcom/google/android/zx6;", "Lkotlin/Function1;", "", "content", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "count", "", "key", "contentType", "Lcom/google/android/w4c;", "span", "Lkotlin/Function2;", "Lcom/google/android/fy6;", "itemContent", "h", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/google/android/rs4;)V", "Lcom/google/android/t48;", "a", "Lcom/google/android/t48;", "r", "()Lcom/google/android/t48;", "intervals", "Lcom/google/android/bz6;", "b", "Lcom/google/android/bz6;", "s", "()Lcom/google/android/bz6;", "spanProvider", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ay6 extends ct6<zx6> implements wy6 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final t48<zx6> intervals = new t48<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final bz6 spanProvider = new bz6(o());

    public ay6(Function1<? super wy6, Unit> function1) {
        function1.invoke(this);
    }

    @Override // com.google.inputmethod.wy6
    public void h(int count, Function1<? super Integer, ? extends Object> key, Function1<? super Integer, ? extends Object> contentType, Function1<? super Integer, w4c> span, rs4<? super fy6, ? super Integer, ? super d, ? super Integer, Unit> itemContent) {
        o().b(count, new zx6(key, contentType, span, itemContent));
    }

    @Override // com.google.inputmethod.ct6
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public t48<zx6> o() {
        return this.intervals;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final bz6 getSpanProvider() {
        return this.spanProvider;
    }
}
