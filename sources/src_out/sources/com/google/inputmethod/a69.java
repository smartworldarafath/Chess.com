package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b`\u0018\u00002\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u00012\u00020\u00052\u00020\u0006:\u0001\u0012J/\u0010\t\u001a\u00020\u00002\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0004H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rR$\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u00028\u00000\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Lcom/google/android/a69;", "Lcom/google/android/k79;", "Lcom/google/android/zr1;", "", "Lcom/google/android/c1e;", "Lcom/google/android/gs1;", "Lcom/google/android/as1;", "key", "value", "Y0", "(Lcom/google/android/zr1;Lcom/google/android/c1e;)Lcom/google/android/a69;", "Lcom/google/android/a69$a;", "builder", "()Lcom/google/android/a69$a;", "T", "L", "(Lcom/google/android/zr1;)Ljava/lang/Object;", "currentValue", "a", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface a69 extends k79<zr1<Object>, c1e<Object>>, gs1, as1 {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u0001J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/google/android/a69$a;", "Lcom/google/android/k79$a;", "Lcom/google/android/zr1;", "", "Lcom/google/android/c1e;", "Lcom/google/android/a69;", "build", "()Lcom/google/android/a69;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface a extends k79.a<zr1<Object>, c1e<Object>> {
        @Override // com.google.android.k79.a
        k79<zr1<Object>, c1e<Object>> build();
    }

    @Override // com.google.inputmethod.as1
    default <T> T L(zr1<T> zr1Var) {
        return (T) hs1.b(this, zr1Var);
    }

    a69 Y0(zr1<Object> key, c1e<Object> value);

    @Override // com.google.inputmethod.k79
    k79.a<zr1<Object>, c1e<Object>> builder();
}
