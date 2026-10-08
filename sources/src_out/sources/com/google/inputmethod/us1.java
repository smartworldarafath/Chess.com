package com.google.inputmethod;

import androidx.compose.p004runtime.e;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\b\u001a\u00028\u0000H\u0010¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/google/android/us1;", "T", "Lcom/google/android/ks9;", "Lkotlin/Function1;", "Lcom/google/android/as1;", "defaultComputation", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "value", "Lcom/google/android/os9;", "c", "(Ljava/lang/Object;)Lcom/google/android/os9;", "Lcom/google/android/vs1;", "b", "Lcom/google/android/vs1;", "i", "()Lcom/google/android/vs1;", "defaultValueHolder", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class us1<T> extends ks9<T> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ComputedValueHolder<T> defaultValueHolder;

    public us1(Function1<? super as1, ? extends T> function1) {
        super(new Function0() { // from class: com.google.android.ts1
            public final Object invoke() {
                return us1.h();
            }
        });
        this.defaultValueHolder = new ComputedValueHolder<>(function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public static final Object h() throws KotlinNothingValueException {
        e.c("Unexpected call to default provider");
        throw new KotlinNothingValueException();
    }

    @Override // com.google.inputmethod.ks9
    public os9<T> c(T value) {
        return new os9<>(this, value, value == null, null, null, null, true);
    }

    @Override // com.google.inputmethod.zr1
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public ComputedValueHolder<T> a() {
        return this.defaultValueHolder;
    }
}
