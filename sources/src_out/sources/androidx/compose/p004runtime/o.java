package androidx.compose.p004runtime;

import com.google.inputmethod.ComposeStackTraceFrame;
import com.google.inputmethod.fob;
import com.google.inputmethod.fq1;
import com.google.inputmethod.g81;
import com.google.inputmethod.k58;
import com.google.inputmethod.ur1;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b!\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H ¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H ¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H ¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H ¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0004H ¢\u0006\u0004\b\t\u0010\u0003J\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH ¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH ¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0013H ¢\u0006\u0004\b\u0015\u0010\u0016J;\u0010\u001d\u001a\u00020\u00042\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\n0\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00132\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH ¢\u0006\u0004\b\u001d\u0010\u001eJ-\u0010 \u001a\u00020\u001f2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\n0\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH ¢\u0006\u0004\b \u0010!J!\u0010$\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u00182\b\u0010#\u001a\u0004\u0018\u00010\nH ¢\u0006\u0004\b$\u0010%J#\u0010&\u001a\u00020\u00042\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\n0\u0017H ¢\u0006\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020\u001f8 X \u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\u001f8 X \u0004¢\u0006\u0006\u001a\u0004\b+\u0010)R\u0016\u0010/\u001a\u0004\u0018\u00010\u00188 X \u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0016\u00103\u001a\u0004\u0018\u0001008 X \u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0016\u00107\u001a\u0004\u0018\u0001048 X \u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u00109\u001a\u00020\u001f8 X \u0004¢\u0006\u0006\u001a\u0004\b8\u0010)¨\u0006:"}, d2 = {"Landroidx/compose/runtime/o;", "Landroidx/compose/runtime/d;", "<init>", "()V", "", "q0", "f0", "b0", "e0", "d0", "", "value", "Lcom/google/android/fq1;", "p0", "(Ljava/lang/Object;)Lcom/google/android/fq1;", "", "Lcom/google/android/iq1;", "m0", "()Ljava/util/List;", "Lkotlin/Function0;", "block", "n0", "(Lkotlin/jvm/functions/Function0;)V", "Lcom/google/android/r6b;", "Landroidx/compose/runtime/b0;", "invalidationsRequested", "content", "Lcom/google/android/fob;", "shouldPause", "c0", "(Lcom/google/android/k58;Lkotlin/jvm/functions/Function2;Lcom/google/android/fob;)V", "", "o0", "(Lcom/google/android/k58;Lcom/google/android/fob;)Z", "scope", "instance", "r0", "(Landroidx/compose/runtime/b0;Ljava/lang/Object;)Z", "s0", "(Lcom/google/android/k58;)V", "g0", "()Z", "areChildrenComposing", "l0", "isComposing", "h0", "()Landroidx/compose/runtime/b0;", "currentRecomposeScope", "Lcom/google/android/ur1;", "j0", "()Lcom/google/android/ur1;", "errorContext", "Lcom/google/android/g81;", "i0", "()Lcom/google/android/g81;", "deferredChanges", "k0", "sourceMarkersEnabled", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class o implements d {
    public abstract void b0();

    public abstract void c0(k58<Object, Object> invalidationsRequested, Function2<? super d, ? super Integer, Unit> content, fob shouldPause);

    public abstract void d0();

    public abstract void e0();

    public abstract void f0();

    public abstract boolean g0();

    public abstract b0 h0();

    public abstract g81 i0();

    public abstract ur1 j0();

    public abstract boolean k0();

    public abstract boolean l0();

    public abstract List<ComposeStackTraceFrame> m0();

    public abstract void n0(Function0<Unit> block);

    public abstract boolean o0(k58<Object, Object> invalidationsRequested, fob shouldPause);

    public abstract fq1 p0(Object value);

    public abstract void q0();

    public abstract boolean r0(b0 scope, Object instance);

    public abstract void s0(k58<Object, Object> invalidationsRequested);
}
