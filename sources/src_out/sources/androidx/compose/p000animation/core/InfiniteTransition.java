package androidx.compose.p000animation.core;

import androidx.compose.p000animation.core.InfiniteTransition;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.p004runtime.s0;
import com.google.inputmethod.kr;
import com.google.inputmethod.lmc;
import com.google.inputmethod.o58;
import com.google.inputmethod.q6c;
import com.google.inputmethod.r58;
import com.google.inputmethod.s6b;
import com.google.inputmethod.saa;
import com.google.inputmethod.tjd;
import com.google.inputmethod.ur;
import com.google.inputmethod.vn3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000bR\u00020\u0000H\u0000¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u000f\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000bR\u00020\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R&\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000bR\u00020\u00000\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R+\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0016\u0010%\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R+\u0010)\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010\u001d\u001a\u0004\b'\u0010\u001f\"\u0004\b(\u0010!¨\u0006*"}, d2 = {"Landroidx/compose/animation/core/InfiniteTransition;", "", "", "label", "<init>", "(Ljava/lang/String;)V", "", "playTimeNanos", "", "j", "(J)V", "Landroidx/compose/animation/core/InfiniteTransition$a;", "animation", "g", "(Landroidx/compose/animation/core/InfiniteTransition$a;)V", "k", "l", "(Landroidx/compose/runtime/d;I)V", "a", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "Lcom/google/android/r58;", "b", "Lcom/google/android/r58;", "_animations", "", "<set-?>", "c", "Lcom/google/android/o58;", "h", "()Z", "n", "(Z)V", "refreshChildNeeded", "d", "J", "startTimeNanos", "e", "i", "o", "isRunning", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InfiniteTransition {
    public static final int f = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String label;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final r58<a<?, ?>> _animations = new r58<>(new a[16], 0);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final o58 refreshChildNeeded = s0.e(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private long startTimeNanos = Long.MIN_VALUE;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final o58 isRunning = s0.e(Boolean.TRUE, null, 2, null);

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\u0004\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004BC\b\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0018\u0010\u0017R\"\u0010\u0005\u001a\u00028\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u0006\u001a\u00028\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R+\u0010.\u001a\u00028\u00002\u0006\u0010)\u001a\u00028\u00008V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u001c\"\u0004\b-\u0010\u001eR0\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102RB\u00109\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001032\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001038\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b \u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010A\u001a\u00020:8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0016\u0010C\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010<R\u0016\u0010F\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010E¨\u0006G"}, d2 = {"Landroidx/compose/animation/core/InfiniteTransition$a;", "T", "Lcom/google/android/ur;", "V", "Lcom/google/android/q6c;", "initialValue", "targetValue", "Lcom/google/android/tjd;", "typeConverter", "Lcom/google/android/kr;", "animationSpec", "", "label", "<init>", "(Landroidx/compose/animation/core/InfiniteTransition;Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/tjd;Lcom/google/android/kr;Ljava/lang/String;)V", "", "x", "(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/kr;)V", "", "playTimeNanos", "q", "(J)V", "w", "()V", "t", "a", "Ljava/lang/Object;", "c", "()Ljava/lang/Object;", "setInitialValue$animation_core", "(Ljava/lang/Object;)V", "b", "g", "setTargetValue$animation_core", "Lcom/google/android/tjd;", "getTypeConverter", "()Lcom/google/android/tjd;", "d", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "<set-?>", "e", "Lcom/google/android/o58;", "getValue", "u", "value", "f", "Lcom/google/android/kr;", "getAnimationSpec", "()Lcom/google/android/kr;", "Lcom/google/android/lmc;", "Lcom/google/android/lmc;", "getAnimation", "()Lcom/google/android/lmc;", "setAnimation$animation_core", "(Lcom/google/android/lmc;)V", "animation", "", "h", "Z", "m", "()Z", "setFinished$animation_core", "(Z)V", "isFinished", "i", "startOnTheNextFrame", "j", "J", "playTimeNanosOffset", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a<T, V extends ur> implements q6c<T> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private T initialValue;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private T targetValue;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final tjd<T, V> typeConverter;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String label;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final o58 value;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private kr<T> animationSpec;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private lmc<T, V> animation;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private boolean isFinished;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private boolean startOnTheNextFrame;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private long playTimeNanosOffset;

        public a(T t, T t2, tjd<T, V> tjdVar, kr<T> krVar, String str) {
            this.initialValue = t;
            this.targetValue = t2;
            this.typeConverter = tjdVar;
            this.label = str;
            this.value = s0.e(t, null, 2, null);
            this.animationSpec = krVar;
            this.animation = new lmc<>(this.animationSpec, tjdVar, this.initialValue, this.targetValue, null, 16, null);
        }

        public final T c() {
            return this.initialValue;
        }

        public final T g() {
            return this.targetValue;
        }

        @Override // com.google.inputmethod.q6c
        public T getValue() {
            return this.value.getValue();
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final boolean getIsFinished() {
            return this.isFinished;
        }

        public final void q(long playTimeNanos) {
            InfiniteTransition.this.n(false);
            if (this.startOnTheNextFrame) {
                this.startOnTheNextFrame = false;
                this.playTimeNanosOffset = playTimeNanos;
            }
            long j = playTimeNanos - this.playTimeNanosOffset;
            u(this.animation.e(j));
            this.isFinished = this.animation.b(j);
        }

        public final void t() {
            this.startOnTheNextFrame = true;
        }

        public void u(T t) {
            this.value.setValue(t);
        }

        public final void w() {
            u(this.animation.f());
            this.startOnTheNextFrame = true;
        }

        public final void x(T initialValue, T targetValue, kr<T> animationSpec) {
            this.initialValue = initialValue;
            this.targetValue = targetValue;
            this.animationSpec = animationSpec;
            this.animation = new lmc<>(animationSpec, this.typeConverter, initialValue, targetValue, null, 16, null);
            InfiniteTransition.this.n(true);
            this.isFinished = false;
            this.startOnTheNextFrame = true;
        }
    }

    public InfiniteTransition(String str) {
        this.label = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean h() {
        return ((Boolean) this.refreshChildNeeded.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean i() {
        return ((Boolean) this.isRunning.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(long playTimeNanos) {
        r58<a<?, ?>> r58Var = this._animations;
        a<?, ?>[] aVarArr = r58Var.content;
        int size = r58Var.getSize();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            a<?, ?> aVar = aVarArr[i];
            if (!aVar.getIsFinished()) {
                aVar.q(playTimeNanos);
            }
            if (!aVar.getIsFinished()) {
                z = false;
            }
        }
        o(!z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(InfiniteTransition infiniteTransition, int i, d dVar, int i2) {
        infiniteTransition.l(dVar, saa.a(i | 1));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(boolean z) {
        this.refreshChildNeeded.setValue(Boolean.valueOf(z));
    }

    private final void o(boolean z) {
        this.isRunning.setValue(Boolean.valueOf(z));
    }

    public final void g(a<?, ?> animation) {
        this._animations.c(animation);
        n(true);
    }

    public final void k(a<?, ?> animation) {
        this._animations.s(animation);
    }

    public final void l(d dVar, final int i) {
        int i2;
        d dVarF = dVar.F(-318043801);
        if ((i & 6) == 0) {
            i2 = (dVarF.T(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (dVarF.g((i2 & 3) != 2, i2 & 1)) {
            if (e.k()) {
                e.o(-318043801, i2, -1, "androidx.compose.animation.core.InfiniteTransition.run (InfiniteTransition.kt:164)");
            }
            Object objR = dVarF.R();
            d.Companion companion = d.INSTANCE;
            if (objR == companion.a()) {
                objR = s0.e(null, null, 2, null);
                dVarF.L(objR);
            }
            o58 o58Var = (o58) objR;
            if (i() || h()) {
                dVarF.y(-144841960);
                boolean zT = dVarF.T(this);
                Object objR2 = dVarF.R();
                if (zT || objR2 == companion.a()) {
                    objR2 = new InfiniteTransition$run$1$1(o58Var, this, null);
                    dVarF.L(objR2);
                }
                vn3.g(this, (Function2) objR2, dVarF, i2 & 14);
                dVarF.u();
            } else {
                dVarF.y(-143455237);
                dVarF.u();
            }
            if (e.k()) {
                e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.pv5
                public final Object invoke(Object obj, Object obj2) {
                    return InfiniteTransition.m(this.a, i, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
