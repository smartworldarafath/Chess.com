package com.google.inputmethod;

import androidx.compose.p004runtime.s0;
import com.google.inputmethod.ur;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.google.android.nr, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b&\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004BM\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0001\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R+\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u00008V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR*\u0010%\u001a\u00028\u00012\u0006\u0010\u001e\u001a\u00028\u00018\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R*\u0010\n\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\t8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R*\u0010\u000b\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\t8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010'\u001a\u0004\b\u001f\u0010)\"\u0004\b-\u0010+R*\u0010\r\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\f8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0011\u00105\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b4\u0010\u001b¨\u00066"}, d2 = {"Lcom/google/android/nr;", "T", "Lcom/google/android/ur;", "V", "Lcom/google/android/q6c;", "Lcom/google/android/tjd;", "typeConverter", "initialValue", "initialVelocityVector", "", "lastFrameTimeNanos", "finishedTimeNanos", "", "isRunning", "<init>", "(Lcom/google/android/tjd;Ljava/lang/Object;Lcom/google/android/ur;JJZ)V", "", "toString", "()Ljava/lang/String;", "a", "Lcom/google/android/tjd;", "m", "()Lcom/google/android/tjd;", "<set-?>", "b", "Lcom/google/android/o58;", "getValue", "()Ljava/lang/Object;", "B", "(Ljava/lang/Object;)V", "value", "c", "Lcom/google/android/ur;", "t", "()Lcom/google/android/ur;", "F", "(Lcom/google/android/ur;)V", "velocityVector", "d", "J", "g", "()J", "x", "(J)V", "e", "w", "f", "Z", "u", "()Z", "A", "(Z)V", "q", "velocity", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AnimationState<T, V extends ur> implements q6c<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final tjd<T, V> typeConverter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final o58 value;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private V velocityVector;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private long lastFrameTimeNanos;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private long finishedTimeNanos;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private boolean isRunning;

    public AnimationState(tjd<T, V> tjdVar, T t, V v, long j, long j2, boolean z) {
        V v2;
        this.typeConverter = tjdVar;
        this.value = s0.e(t, null, 2, null);
        this.velocityVector = (v == null || (v2 = (V) vr.e(v)) == null) ? (V) or.i(tjdVar, t) : v2;
        this.lastFrameTimeNanos = j;
        this.finishedTimeNanos = j2;
        this.isRunning = z;
    }

    public final void A(boolean z) {
        this.isRunning = z;
    }

    public void B(T t) {
        this.value.setValue(t);
    }

    public final void F(V v) {
        this.velocityVector = v;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getFinishedTimeNanos() {
        return this.finishedTimeNanos;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getLastFrameTimeNanos() {
        return this.lastFrameTimeNanos;
    }

    @Override // com.google.inputmethod.q6c
    public T getValue() {
        return this.value.getValue();
    }

    public final tjd<T, V> m() {
        return this.typeConverter;
    }

    public final T q() {
        return (T) this.typeConverter.b().invoke(this.velocityVector);
    }

    public final V t() {
        return this.velocityVector;
    }

    public String toString() {
        return "AnimationState(value=" + getValue() + ", velocity=" + q() + ", isRunning=" + this.isRunning + ", lastFrameTimeNanos=" + this.lastFrameTimeNanos + ", finishedTimeNanos=" + this.finishedTimeNanos + ')';
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final boolean getIsRunning() {
        return this.isRunning;
    }

    public final void w(long j) {
        this.finishedTimeNanos = j;
    }

    public final void x(long j) {
        this.lastFrameTimeNanos = j;
    }

    public /* synthetic */ AnimationState(tjd tjdVar, Object obj, ur urVar, long j, long j2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(tjdVar, obj, (i & 4) != 0 ? null : urVar, (i & 8) != 0 ? Long.MIN_VALUE : j, (i & 16) != 0 ? Long.MIN_VALUE : j2, (i & 32) != 0 ? false : z);
    }
}
