package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/google/android/d02;", "", "Lcom/google/android/tsb;", "srcSize", "dstSize", "Lcom/google/android/e4b;", "a", "(JJ)J", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface d02 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.a;

    /* JADX INFO: renamed from: com.google.android.d02$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR \u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\f\u0010\bR \u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0006\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u000b\u0010\bR \u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u000f\u0010\bR \u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0006\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0014\u0010\bR \u0010\u001c\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u0018\u0010\u001aR \u0010\u001f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u0006\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u0005\u0010\b¨\u0006 "}, d2 = {"Lcom/google/android/d02$a;", "", "<init>", "()V", "Lcom/google/android/d02;", "b", "Lcom/google/android/d02;", "a", "()Lcom/google/android/d02;", "getCrop$annotations", "Crop", "c", "e", "getFit$annotations", "Fit", "d", "getFillHeight$annotations", "FillHeight", "getFillWidth$annotations", "FillWidth", "f", "getInside$annotations", "Inside", "Lcom/google/android/ke4;", "g", "Lcom/google/android/ke4;", "()Lcom/google/android/ke4;", "getNone$annotations", "None", "h", "getFillBounds$annotations", "FillBounds", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion a = new Companion();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private static final d02 Crop = new C0105a();

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private static final d02 Fit = new e();

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private static final d02 FillHeight = new c();

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private static final d02 FillWidth = new d();

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private static final d02 Inside = new f();

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private static final FixedScale None = new FixedScale(1.0f);

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private static final d02 FillBounds = new b();

        /* JADX INFO: renamed from: com.google.android.d02$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"com/google/android/d02$a$a", "Lcom/google/android/d02;", "Lcom/google/android/tsb;", "srcSize", "dstSize", "Lcom/google/android/e4b;", "a", "(JJ)J", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C0105a implements d02 {
            C0105a() {
            }

            @Override // com.google.inputmethod.d02
            public long a(long srcSize, long dstSize) {
                float fC = f02.c(srcSize, dstSize);
                return e4b.a((((long) Float.floatToRawIntBits(fC)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fC))));
            }
        }

        /* JADX INFO: renamed from: com.google.android.d02$a$b */
        @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"com/google/android/d02$a$b", "Lcom/google/android/d02;", "Lcom/google/android/tsb;", "srcSize", "dstSize", "Lcom/google/android/e4b;", "a", "(JJ)J", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b implements d02 {
            b() {
            }

            @Override // com.google.inputmethod.d02
            public long a(long srcSize, long dstSize) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (dstSize >> 32)) / Float.intBitsToFloat((int) (srcSize >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (dstSize & 4294967295L)) / Float.intBitsToFloat((int) (srcSize & 4294967295L));
                return e4b.a((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
            }
        }

        /* JADX INFO: renamed from: com.google.android.d02$a$c */
        @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"com/google/android/d02$a$c", "Lcom/google/android/d02;", "Lcom/google/android/tsb;", "srcSize", "dstSize", "Lcom/google/android/e4b;", "a", "(JJ)J", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c implements d02 {
            c() {
            }

            @Override // com.google.inputmethod.d02
            public long a(long srcSize, long dstSize) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (dstSize & 4294967295L)) / Float.intBitsToFloat((int) (srcSize & 4294967295L));
                return e4b.a((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L));
            }
        }

        /* JADX INFO: renamed from: com.google.android.d02$a$d */
        @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"com/google/android/d02$a$d", "Lcom/google/android/d02;", "Lcom/google/android/tsb;", "srcSize", "dstSize", "Lcom/google/android/e4b;", "a", "(JJ)J", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class d implements d02 {
            d() {
            }

            @Override // com.google.inputmethod.d02
            public long a(long srcSize, long dstSize) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (dstSize >> 32)) / Float.intBitsToFloat((int) (srcSize >> 32));
                return e4b.a((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L));
            }
        }

        /* JADX INFO: renamed from: com.google.android.d02$a$e */
        @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"com/google/android/d02$a$e", "Lcom/google/android/d02;", "Lcom/google/android/tsb;", "srcSize", "dstSize", "Lcom/google/android/e4b;", "a", "(JJ)J", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class e implements d02 {
            e() {
            }

            @Override // com.google.inputmethod.d02
            public long a(long srcSize, long dstSize) {
                float fD = f02.d(srcSize, dstSize);
                return e4b.a((((long) Float.floatToRawIntBits(fD)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fD))));
            }
        }

        /* JADX INFO: renamed from: com.google.android.d02$a$f */
        @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"com/google/android/d02$a$f", "Lcom/google/android/d02;", "Lcom/google/android/tsb;", "srcSize", "dstSize", "Lcom/google/android/e4b;", "a", "(JJ)J", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class f implements d02 {
            f() {
            }

            @Override // com.google.inputmethod.d02
            public long a(long srcSize, long dstSize) {
                if (Float.intBitsToFloat((int) (srcSize >> 32)) <= Float.intBitsToFloat((int) (dstSize >> 32)) && Float.intBitsToFloat((int) (srcSize & 4294967295L)) <= Float.intBitsToFloat((int) (dstSize & 4294967295L))) {
                    return e4b.a((((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L));
                }
                float fD = f02.d(srcSize, dstSize);
                return e4b.a((((long) Float.floatToRawIntBits(fD)) << 32) | (((long) Float.floatToRawIntBits(fD)) & 4294967295L));
            }
        }

        private Companion() {
        }

        public final d02 a() {
            return Crop;
        }

        public final d02 b() {
            return FillBounds;
        }

        public final d02 c() {
            return FillHeight;
        }

        public final d02 d() {
            return FillWidth;
        }

        public final d02 e() {
            return Fit;
        }

        public final d02 f() {
            return Inside;
        }

        public final FixedScale g() {
            return None;
        }
    }

    long a(long srcSize, long dstSize);
}
