package com.google.inputmethod;

import androidx.datastore.p007core.okio.OkioStorageConnection;
import com.google.android.b39;
import com.google.android.t84;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 \u001e*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0010BG\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u001a\b\u0002\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R&\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001d\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/google/android/qp8;", "T", "Lcom/google/android/j9c;", "Lcom/google/android/t84;", "fileSystem", "Lcom/google/android/lp8;", "serializer", "Lkotlin/Function2;", "Lcom/google/android/b39;", "Lcom/google/android/f26;", "coordinatorProducer", "Lkotlin/Function0;", "producePath", "<init>", "(Lcom/google/android/t84;Lcom/google/android/lp8;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "Lcom/google/android/k9c;", "a", "()Lcom/google/android/k9c;", "Lcom/google/android/t84;", "b", "Lcom/google/android/lp8;", "c", "Lkotlin/jvm/functions/Function2;", "d", "Lkotlin/jvm/functions/Function0;", "e", "Lkotlin/Lazy;", "h", "()Lcom/google/android/b39;", "canonicalPath", "f", "datastore-core-okio"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class qp8<T> implements j9c<T> {
    private static final Set<String> g = new LinkedHashSet();
    private static final hic h = new hic();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final t84 fileSystem;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final lp8<T> serializer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Function2<b39, t84, f26> coordinatorProducer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Function0<b39> producePath;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Lazy canonicalPath;

    public qp8(t84 t84Var, lp8<T> lp8Var, Function2<? super b39, ? super t84, ? extends f26> function2, Function0<b39> function0) {
        Intrinsics.checkNotNullParameter(t84Var, "fileSystem");
        Intrinsics.checkNotNullParameter(lp8Var, "serializer");
        Intrinsics.checkNotNullParameter(function2, "coordinatorProducer");
        Intrinsics.checkNotNullParameter(function0, "producePath");
        this.fileSystem = t84Var;
        this.serializer = lp8Var;
        this.coordinatorProducer = function2;
        this.producePath = function0;
        this.canonicalPath = c.b(new Function0() { // from class: com.google.android.pp8
            public final Object invoke() {
                return qp8.f(this.a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f26 e(b39 b39Var, t84 t84Var) {
        Intrinsics.checkNotNullParameter(b39Var, "path");
        Intrinsics.checkNotNullParameter(t84Var, "<unused var>");
        return b39.a(b39Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b39 f(qp8 qp8Var) {
        b39 b39Var = (b39) qp8Var.producePath.invoke();
        if (b39Var.isAbsolute()) {
            return b39Var.i();
        }
        throw new IllegalStateException(("OkioStorage requires absolute paths, but did not get an absolute path from producePath = " + qp8Var.producePath + ", instead got " + b39Var).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(qp8 qp8Var) {
        synchronized (h) {
            g.remove(qp8Var.h().toString());
        }
        return Unit.a;
    }

    private final b39 h() {
        return (b39) this.canonicalPath.getValue();
    }

    @Override // com.google.inputmethod.j9c
    public k9c<T> a() {
        String string = h().toString();
        synchronized (h) {
            Set<String> set = g;
            if (set.contains(string)) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + string + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            set.add(string);
        }
        return new OkioStorageConnection(this.fileSystem, h(), this.serializer, (f26) this.coordinatorProducer.invoke(h(), this.fileSystem), new Function0() { // from class: com.google.android.np8
            public final Object invoke() {
                return qp8.g(this.a);
            }
        });
    }

    public /* synthetic */ qp8(t84 t84Var, lp8 lp8Var, Function2 function2, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(t84Var, lp8Var, (i & 4) != 0 ? new Function2() { // from class: com.google.android.op8
            public final Object invoke(Object obj, Object obj2) {
                return qp8.e((b39) obj, (t84) obj2);
            }
        } : function2, function0);
    }
}
