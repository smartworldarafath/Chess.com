package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aC\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\f\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\f\u0010\r\u001a3\u0010\u0013\u001a\u00020\u0012\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\"\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/google/android/ur;", "V", "Lcom/google/android/f3e;", "", "playTimeMillis", "start", "end", "startVelocity", "g", "(Lcom/google/android/f3e;JLcom/google/android/ur;Lcom/google/android/ur;Lcom/google/android/ur;)Lcom/google/android/ur;", "Lcom/google/android/i3e;", "playTime", "e", "(Lcom/google/android/i3e;J)J", "visibilityThreshold", "", "dampingRatio", "stiffness", "Lcom/google/android/wr;", "f", "(Lcom/google/android/ur;FF)Lcom/google/android/wr;", "", "a", "[I", "EmptyIntArray", "", "b", "[F", "EmptyFloatArray", "Lcom/google/android/f00;", "c", "Lcom/google/android/f00;", "EmptyArcSpline", "animation-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class g3e {
    private static final int[] a = new int[0];
    private static final float[] b = new float[0];
    private static final f00 c = new f00(new int[2], new float[2], new float[][]{new float[2], new float[2]});

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\b¨\u0006\n"}, d2 = {"com/google/android/g3e$a", "Lcom/google/android/wr;", "", "index", "Lcom/google/android/mh4;", "a", "(I)Lcom/google/android/mh4;", "", "[Lcom/google/android/mh4;", "anims", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements wr {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final mh4[] anims;

        /* JADX WARN: Incorrect types in method signature: (TV;FF)V */
        a(ur urVar, float f, float f2) {
            int size = urVar.getSize();
            mh4[] mh4VarArr = new mh4[size];
            for (int i = 0; i < size; i++) {
                mh4VarArr[i] = new mh4(f, f2, urVar.a(i));
            }
            this.anims = mh4VarArr;
        }

        @Override // com.google.inputmethod.wr
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public mh4 get(int index) {
            return this.anims[index];
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\t"}, d2 = {"com/google/android/g3e$b", "Lcom/google/android/wr;", "", "index", "Lcom/google/android/mh4;", "a", "(I)Lcom/google/android/mh4;", "Lcom/google/android/mh4;", "anim", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements wr {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final mh4 anim;

        b(float f, float f2) {
            this.anim = new mh4(f, f2, 0.0f, 4, null);
        }

        @Override // com.google.inputmethod.wr
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public mh4 get(int index) {
            return this.anim;
        }
    }

    public static final long e(i3e<?> i3eVar, long j) {
        long delayMillis = j - ((long) i3eVar.getDelayMillis());
        long durationMillis = i3eVar.getDurationMillis();
        if (delayMillis < 0) {
            delayMillis = 0;
        }
        return delayMillis > durationMillis ? durationMillis : delayMillis;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <V extends ur> wr f(V v, float f, float f2) {
        return v != null ? new a(v, f, f2) : new b(f, f2);
    }

    public static final <V extends ur> V g(f3e<V> f3eVar, long j, V v, V v2, V v3) {
        return (V) f3eVar.g(j * 1000000, v, v2, v3);
    }
}
