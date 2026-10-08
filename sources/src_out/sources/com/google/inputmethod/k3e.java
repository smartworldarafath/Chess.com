package com.google.inputmethod;

import com.google.inputmethod.ur;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0013\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ/\u0010\u0010\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0012\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J'\u0010\u0013\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019R\u0016\u0010\u001c\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0016\u0010\u001d\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/google/android/k3e;", "Lcom/google/android/ur;", "V", "Lcom/google/android/j3e;", "Lcom/google/android/wr;", "anims", "<init>", "(Lcom/google/android/wr;)V", "Lcom/google/android/ug4;", "anim", "(Lcom/google/android/ug4;)V", "", "playTimeNanos", "initialValue", "targetValue", "initialVelocity", "g", "(JLcom/google/android/ur;Lcom/google/android/ur;Lcom/google/android/ur;)Lcom/google/android/ur;", "d", "e", "(Lcom/google/android/ur;Lcom/google/android/ur;Lcom/google/android/ur;)Lcom/google/android/ur;", "b", "(Lcom/google/android/ur;Lcom/google/android/ur;Lcom/google/android/ur;)J", "a", "Lcom/google/android/wr;", "Lcom/google/android/ur;", "valueVector", "c", "velocityVector", "endVelocityVector", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k3e<V extends ur> implements j3e<V> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final wr anims;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private V valueVector;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private V velocityVector;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private V endVelocityVector;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/google/android/k3e$a", "Lcom/google/android/wr;", "", "index", "Lcom/google/android/ug4;", "get", "(I)Lcom/google/android/ug4;", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements wr {
        final /* synthetic */ ug4 a;

        a(ug4 ug4Var) {
            this.a = ug4Var;
        }

        @Override // com.google.inputmethod.wr
        public ug4 get(int index) {
            return this.a;
        }
    }

    public k3e(wr wrVar) {
        this.anims = wrVar;
    }

    @Override // com.google.inputmethod.f3e
    public long b(V initialValue, V targetValue, V initialVelocity) {
        int size = initialValue.getSize();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            jMax = Math.max(jMax, this.anims.get(i).c(initialValue.a(i), targetValue.a(i), initialVelocity.a(i)));
        }
        return jMax;
    }

    @Override // com.google.inputmethod.f3e
    public V d(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        if (this.velocityVector == null) {
            this.velocityVector = (V) vr.g(initialVelocity);
        }
        V v = this.velocityVector;
        if (v == null) {
            Intrinsics.x("velocityVector");
            v = null;
        }
        int size = v.getSize();
        for (int i = 0; i < size; i++) {
            V v2 = this.velocityVector;
            if (v2 == null) {
                Intrinsics.x("velocityVector");
                v2 = null;
            }
            v2.e(i, this.anims.get(i).b(playTimeNanos, initialValue.a(i), targetValue.a(i), initialVelocity.a(i)));
        }
        V v3 = this.velocityVector;
        if (v3 != null) {
            return v3;
        }
        Intrinsics.x("velocityVector");
        return null;
    }

    @Override // com.google.inputmethod.f3e
    public V e(V initialValue, V targetValue, V initialVelocity) {
        if (this.endVelocityVector == null) {
            this.endVelocityVector = (V) vr.g(initialVelocity);
        }
        V v = this.endVelocityVector;
        if (v == null) {
            Intrinsics.x("endVelocityVector");
            v = null;
        }
        int size = v.getSize();
        for (int i = 0; i < size; i++) {
            V v2 = this.endVelocityVector;
            if (v2 == null) {
                Intrinsics.x("endVelocityVector");
                v2 = null;
            }
            v2.e(i, this.anims.get(i).d(initialValue.a(i), targetValue.a(i), initialVelocity.a(i)));
        }
        V v3 = this.endVelocityVector;
        if (v3 != null) {
            return v3;
        }
        Intrinsics.x("endVelocityVector");
        return null;
    }

    @Override // com.google.inputmethod.f3e
    public V g(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        if (this.valueVector == null) {
            this.valueVector = (V) vr.g(initialValue);
        }
        V v = this.valueVector;
        if (v == null) {
            Intrinsics.x("valueVector");
            v = null;
        }
        int size = v.getSize();
        for (int i = 0; i < size; i++) {
            V v2 = this.valueVector;
            if (v2 == null) {
                Intrinsics.x("valueVector");
                v2 = null;
            }
            v2.e(i, this.anims.get(i).e(playTimeNanos, initialValue.a(i), targetValue.a(i), initialVelocity.a(i)));
        }
        V v3 = this.valueVector;
        if (v3 != null) {
            return v3;
        }
        Intrinsics.x("valueVector");
        return null;
    }

    public k3e(ug4 ug4Var) {
        this(new a(ug4Var));
    }
}
