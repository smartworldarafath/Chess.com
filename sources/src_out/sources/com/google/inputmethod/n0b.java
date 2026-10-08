package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a[\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00032\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0006¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00010\b\"\u0004\b\u0000\u0010\u000b¢\u0006\u0004\b\f\u0010\r\"\"\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Original", "", "Saveable", "Lkotlin/Function2;", "Lcom/google/android/o0b;", "save", "Lkotlin/Function1;", "restore", "Lcom/google/android/k0b;", "e", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)Lcom/google/android/k0b;", "T", "f", "()Lcom/google/android/k0b;", "a", "Lcom/google/android/k0b;", "AutoSaver", "runtime-saveable"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class n0b {
    private static final k0b<Object, Object> a = e(new Function2() { // from class: com.google.android.l0b
        public final Object invoke(Object obj, Object obj2) {
            return n0b.c((o0b) obj, obj2);
        }
    }, new Function1() { // from class: com.google.android.m0b
        public final Object invoke(Object obj) {
            return n0b.d(obj);
        }
    });

    /* JADX INFO: Add missing generic type declarations: [Saveable, Original] */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u001d\u0010\u0004\u001a\u0004\u0018\u00018\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0006\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"com/google/android/n0b$a", "Lcom/google/android/k0b;", "Lcom/google/android/o0b;", "value", "a", "(Lcom/google/android/o0b;Ljava/lang/Object;)Ljava/lang/Object;", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "runtime-saveable"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a<Original, Saveable> implements k0b<Original, Saveable> {
        final /* synthetic */ Function2<o0b, Original, Saveable> a;
        final /* synthetic */ Function1<Saveable, Original> b;

        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super o0b, ? super Original, ? extends Saveable> function2, Function1<? super Saveable, ? extends Original> function1) {
            this.a = function2;
            this.b = function1;
        }

        @Override // com.google.inputmethod.k0b
        public Saveable a(o0b o0bVar, Original original) {
            return (Saveable) this.a.invoke(o0bVar, original);
        }

        @Override // com.google.inputmethod.k0b
        public Original b(Saveable value) {
            return (Original) this.b.invoke(value);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object c(o0b o0bVar, Object obj) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(Object obj) {
        return obj;
    }

    public static final <Original, Saveable> k0b<Original, Saveable> e(Function2<? super o0b, ? super Original, ? extends Saveable> function2, Function1<? super Saveable, ? extends Original> function1) {
        return new a(function2, function1);
    }

    public static final <T> k0b<T, Object> f() {
        k0b<T, Object> k0bVar = (k0b<T, Object>) a;
        Intrinsics.h(k0bVar, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.SaverKt.autoSaver, kotlin.Any>");
        return k0bVar;
    }
}
