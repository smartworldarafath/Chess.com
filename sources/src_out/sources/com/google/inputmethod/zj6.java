package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002\u0012\u000eB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b\"\b\b\u0001\u0010\b*\u00020\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/google/android/zj6;", "T", "Lcom/google/android/kk3;", "Lcom/google/android/zj6$b;", "config", "<init>", "(Lcom/google/android/zj6$b;)V", "Lcom/google/android/ur;", "V", "Lcom/google/android/tjd;", "converter", "Lcom/google/android/o3e;", "g", "(Lcom/google/android/tjd;)Lcom/google/android/o3e;", "a", "Lcom/google/android/zj6$b;", "f", "()Lcom/google/android/zj6$b;", "b", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class zj6<T> implements kk3<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final b<T> config;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B%\b\u0000\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0007\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/google/android/zj6$a;", "T", "Lcom/google/android/wj6;", "value", "Lcom/google/android/vl3;", "easing", "Lcom/google/android/e00;", "arcMode", "<init>", "(Ljava/lang/Object;Lcom/google/android/vl3;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "c", "I", "d", "setArcMode-Rur9ykg$animation_core", "(I)V", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> extends wj6<T> {

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private int arcMode;

        public /* synthetic */ a(Object obj, vl3 vl3Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, vl3Var, i);
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getArcMode() {
            return this.arcMode;
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return Intrinsics.e(aVar.b(), b()) && Intrinsics.e(aVar.getEasing(), getEasing()) && e00.c(aVar.arcMode, this.arcMode);
        }

        public int hashCode() {
            T tB = b();
            return ((((tB != null ? tB.hashCode() : 0) * 31) + e00.d(this.arcMode)) * 31) + getEasing().hashCode();
        }

        private a(T t, vl3 vl3Var, int i) {
            super(t, vl3Var, null);
            this.arcMode = i;
        }

        public /* synthetic */ a(Object obj, vl3 vl3Var, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, (i2 & 2) != 0 ? em3.e() : vl3Var, (i2 & 4) != 0 ? e00.INSTANCE.a() : i, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003*\u00028\u00012\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0096\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/google/android/zj6$b;", "T", "Lcom/google/android/ak6;", "Lcom/google/android/zj6$a;", "<init>", "()V", "", "timeStamp", "f", "(Ljava/lang/Object;I)Lcom/google/android/zj6$a;", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b<T> extends ak6<T, a<T>> {
        public b() {
            super(null);
        }

        public a<T> f(T t, int i) {
            a<T> aVar = new a<>(t, null, 0, 6, null);
            c().r(i, aVar);
            return aVar;
        }
    }

    public zj6(b<T> bVar) {
        this.config = bVar;
    }

    public final b<T> f() {
        return this.config;
    }

    @Override // com.google.inputmethod.xa4, com.google.inputmethod.kr
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public <V extends ur> o3e<V> a(tjd<T, V> converter) {
        long[] jArr;
        int[] iArr;
        n48 n48Var = new n48(this.config.c().get_size() + 2);
        o48 o48Var = new o48(this.config.c().get_size());
        o48<a<T>> o48VarC = this.config.c();
        int[] iArr2 = o48VarC.keys;
        Object[] objArr = o48VarC.values;
        long[] jArr2 = o48VarC.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8;
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    int i4 = 0;
                    while (i4 < i3) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            int i6 = iArr2[i5];
                            a aVar = (a) objArr[i5];
                            n48Var.k(i6);
                            o48Var.r(i6, new VectorizedKeyframeSpecElementInfo((ur) converter.a().invoke(aVar.b()), aVar.getEasing(), aVar.getArcMode(), null));
                        }
                        j >>= i2;
                        i4++;
                        i2 = i2;
                        jArr2 = jArr2;
                        iArr2 = iArr2;
                    }
                    jArr = jArr2;
                    iArr = iArr2;
                    if (i3 != i2) {
                        break;
                    }
                } else {
                    jArr = jArr2;
                    iArr = iArr2;
                }
                if (i == length) {
                    break;
                }
                i++;
                jArr2 = jArr;
                iArr2 = iArr;
            }
        }
        if (!this.config.c().a(0)) {
            n48Var.j(0, 0);
        }
        if (!this.config.c().a(this.config.getDurationMillis())) {
            n48Var.k(this.config.getDurationMillis());
        }
        n48Var.s();
        return new o3e<>(n48Var, o48Var, this.config.getDurationMillis(), this.config.getDelayMillis(), em3.e(), e00.INSTANCE.a(), null);
    }
}
