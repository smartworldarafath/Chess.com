package com.google.inputmethod;

import androidx.compose.p004runtime.o;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u001d2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0014B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\f\u001a\u00020\u000b*\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/google/android/ur1;", "Lcom/google/android/sr1;", "Lcom/google/android/ts8;", "Lkotlin/coroutines/CoroutineContext$Element;", "Landroidx/compose/runtime/o;", "composer", "<init>", "(Landroidx/compose/runtime/o;)V", "", "", "composeNode", "", "d", "(Ljava/lang/Throwable;Ljava/lang/Object;)Z", "", "currentOffset", "", "Lcom/google/android/iq1;", "e", "(Ljava/lang/Integer;)Ljava/util/List;", "a", "Landroidx/compose/runtime/o;", "c", "()Z", "sourceInformationEnabled", "Lkotlin/coroutines/CoroutineContext$b;", "getKey", "()Lkotlin/coroutines/CoroutineContext$b;", "key", "b", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ur1 implements sr1, ts8, CoroutineContext.Element {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final o composer;

    /* JADX INFO: renamed from: com.google.android.ur1$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/android/ur1$a;", "Lkotlin/coroutines/CoroutineContext$b;", "Lcom/google/android/ur1;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements CoroutineContext.b<ur1> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public String toString() {
            return "CompositionErrorContext";
        }

        private Companion() {
        }
    }

    public ur1(o oVar) {
        this.composer = oVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fq1 g(ur1 ur1Var, Object obj) {
        return ur1Var.composer.p0(obj);
    }

    @Override // com.google.inputmethod.ts8
    public boolean c() {
        return this.composer.k0();
    }

    @Override // com.google.inputmethod.sr1
    public boolean d(Throwable th, final Object obj) {
        return jq1.d(th, new Function0() { // from class: com.google.android.tr1
            public final Object invoke() {
                return ur1.g(this.a, obj);
            }
        });
    }

    @Override // com.google.inputmethod.ts8
    public List<ComposeStackTraceFrame> e(Integer currentOffset) {
        return this.composer.m0();
    }

    public /* bridge */ <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) CoroutineContext.Element.a.a(this, r, function2);
    }

    public /* bridge */ <E extends CoroutineContext.Element> E get(CoroutineContext.b<E> bVar) {
        return (E) CoroutineContext.Element.a.b(this, bVar);
    }

    public CoroutineContext.b<?> getKey() {
        return INSTANCE;
    }

    public /* bridge */ CoroutineContext minusKey(CoroutineContext.b<?> bVar) {
        return CoroutineContext.Element.a.c(this, bVar);
    }

    public /* bridge */ CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.Element.a.d(this, coroutineContext);
    }
}
