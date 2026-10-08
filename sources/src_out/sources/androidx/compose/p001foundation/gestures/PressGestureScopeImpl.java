package androidx.compose.p001foundation.gestures;

import com.google.android.a68;
import com.google.android.q22;
import com.google.android.ut0;
import com.google.android.x58;
import com.google.inputmethod.f43;
import com.google.inputmethod.ml9;
import com.google.inputmethod.t04;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.f;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\u0010\u0010\n\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\r\u0010\u000bJ\u0014\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0097\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010\u0013\u001a\u00020\u000f*\u00020\u0012H\u0097\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0014\u0010\u0016\u001a\u00020\u0015*\u00020\u000eH\u0097\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0014\u0010\u0018\u001a\u00020\u0015*\u00020\u0012H\u0097\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0014\u0010\u001a\u001a\u00020\u000e*\u00020\u0015H\u0097\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0014\u0010\u001c\u001a\u00020\u000e*\u00020\u000fH\u0097\u0001¢\u0006\u0004\b\u001c\u0010\u0011J\u0014\u0010\u001d\u001a\u00020\u000e*\u00020\u0012H\u0097\u0001¢\u0006\u0004\b\u001d\u0010\u0014J\u0014\u0010\u001e\u001a\u00020\u0012*\u00020\u0015H\u0097\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0014\u0010 \u001a\u00020\u0012*\u00020\u000fH\u0097\u0001¢\u0006\u0004\b \u0010!J\u0014\u0010\"\u001a\u00020\u0012*\u00020\u000eH\u0097\u0001¢\u0006\u0004\b\"\u0010!J\u0014\u0010%\u001a\u00020$*\u00020#H\u0097\u0001¢\u0006\u0004\b%\u0010&J\u0014\u0010'\u001a\u00020#*\u00020$H\u0097\u0001¢\u0006\u0004\b'\u0010&R\u0016\u0010)\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010(R\u0016\u0010+\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010(R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0003\u001a\u00020\u000f8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00103\u001a\u00020\u000f8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b2\u00101¨\u00064"}, d2 = {"Landroidx/compose/foundation/gestures/PressGestureScopeImpl;", "Lcom/google/android/ml9;", "Lcom/google/android/f43;", "density", "<init>", "(Lcom/google/android/f43;)V", "", "b", "()V", "f", "i", "(Lcom/google/android/q22;)Ljava/lang/Object;", "", "y2", "Lcom/google/android/ff3;", "", "x2", "(F)F", "Lcom/google/android/b0d;", "T1", "(J)F", "", "O1", "(F)I", "A2", "(J)I", "O0", "(I)F", "P0", "U", "X", "(I)J", "Y", "(F)J", "s1", "Lcom/google/android/jf3;", "Lcom/google/android/tsb;", "b1", "(J)J", "S", "Z", "isReleased", "c", "isCanceled", "Lcom/google/android/x58;", "d", "Lcom/google/android/x58;", "mutex", "getDensity", "()F", "w2", "fontScale", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PressGestureScopeImpl implements ml9, f43 {
    private final /* synthetic */ f43 a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean isReleased;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean isCanceled;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final x58 mutex = a68.a(false);

    public PressGestureScopeImpl(f43 f43Var) {
        this.a = f43Var;
    }

    @Override // com.google.inputmethod.f43
    public int A2(long j) {
        return this.a.A2(j);
    }

    @Override // com.google.inputmethod.f43
    public float O0(int i) {
        return this.a.O0(i);
    }

    @Override // com.google.inputmethod.f43
    public int O1(float f) {
        return this.a.O1(f);
    }

    @Override // com.google.inputmethod.f43
    public float P0(float f) {
        return this.a.P0(f);
    }

    @Override // com.google.inputmethod.f43
    public long S(long j) {
        return this.a.S(j);
    }

    @Override // com.google.inputmethod.f43
    public float T1(long j) {
        return this.a.T1(j);
    }

    @Override // com.google.inputmethod.hm4
    public float U(long j) {
        return this.a.U(j);
    }

    @Override // com.google.inputmethod.f43
    public long X(int i) {
        return this.a.X(i);
    }

    @Override // com.google.inputmethod.f43
    public long Y(float f) {
        return this.a.Y(f);
    }

    public final void b() {
        this.isCanceled = true;
        if (this.mutex.b()) {
            x58.a.c(this.mutex, (Object) null, 1, (Object) null);
        }
    }

    @Override // com.google.inputmethod.f43
    public long b1(long j) {
        return this.a.b1(j);
    }

    public final void f() {
        this.isReleased = true;
        if (this.mutex.b()) {
            x58.a.c(this.mutex, (Object) null, 1, (Object) null);
        }
    }

    @Override // com.google.inputmethod.f43
    public float getDensity() {
        return this.a.getDensity();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(q22<? super Unit> q22Var) {
        PressGestureScopeImpl$reset$1 pressGestureScopeImpl$reset$1;
        if (q22Var instanceof PressGestureScopeImpl$reset$1) {
            pressGestureScopeImpl$reset$1 = (PressGestureScopeImpl$reset$1) q22Var;
            int i = pressGestureScopeImpl$reset$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                pressGestureScopeImpl$reset$1.label = i - t04.INVALID_ID;
            } else {
                pressGestureScopeImpl$reset$1 = new PressGestureScopeImpl$reset$1(this, q22Var);
            }
        } else {
            pressGestureScopeImpl$reset$1 = new PressGestureScopeImpl$reset$1(this, q22Var);
        }
        Object obj = pressGestureScopeImpl$reset$1.result;
        Object objG = a.g();
        int i2 = pressGestureScopeImpl$reset$1.label;
        if (i2 == 0) {
            f.b(obj);
            x58 x58Var = this.mutex;
            pressGestureScopeImpl$reset$1.label = 1;
            if (x58.a.a(x58Var, (Object) null, pressGestureScopeImpl$reset$1, 1, (Object) null) == objG) {
                return objG;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        this.isReleased = false;
        this.isCanceled = false;
        return Unit.a;
    }

    @Override // com.google.inputmethod.hm4
    public long s1(float f) {
        return this.a.s1(f);
    }

    @Override // com.google.inputmethod.hm4
    public float w2() {
        return this.a.w2();
    }

    @Override // com.google.inputmethod.f43
    public float x2(float f) {
        return this.a.x2(f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.google.inputmethod.ml9
    public Object y2(q22<? super Boolean> q22Var) {
        PressGestureScopeImpl$tryAwaitRelease$1 pressGestureScopeImpl$tryAwaitRelease$1;
        if (q22Var instanceof PressGestureScopeImpl$tryAwaitRelease$1) {
            pressGestureScopeImpl$tryAwaitRelease$1 = (PressGestureScopeImpl$tryAwaitRelease$1) q22Var;
            int i = pressGestureScopeImpl$tryAwaitRelease$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                pressGestureScopeImpl$tryAwaitRelease$1.label = i - t04.INVALID_ID;
            } else {
                pressGestureScopeImpl$tryAwaitRelease$1 = new PressGestureScopeImpl$tryAwaitRelease$1(this, q22Var);
            }
        } else {
            pressGestureScopeImpl$tryAwaitRelease$1 = new PressGestureScopeImpl$tryAwaitRelease$1(this, q22Var);
        }
        Object obj = pressGestureScopeImpl$tryAwaitRelease$1.result;
        Object objG = a.g();
        int i2 = pressGestureScopeImpl$tryAwaitRelease$1.label;
        if (i2 == 0) {
            f.b(obj);
            if (!this.isReleased && !this.isCanceled) {
                x58 x58Var = this.mutex;
                pressGestureScopeImpl$tryAwaitRelease$1.label = 1;
                if (x58.a.a(x58Var, (Object) null, pressGestureScopeImpl$tryAwaitRelease$1, 1, (Object) null) == objG) {
                    return objG;
                }
            }
            return ut0.a(this.isReleased);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        x58.a.c(this.mutex, (Object) null, 1, (Object) null);
        return ut0.a(this.isReleased);
    }
}
