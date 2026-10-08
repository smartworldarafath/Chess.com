package com.google.inputmethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00112\u00020\u0001:\u0001\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0002\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/google/android/qu0;", "", "<init>", "()V", "Lcom/google/android/tsb;", "size", "Lcom/google/android/q09;", "p", "", "alpha", "", "a", "(JLcom/google/android/q09;F)V", "J", "getIntrinsicSize-NH-jbRc", "()J", "intrinsicSize", "b", "Lcom/google/android/jkb;", "Lcom/google/android/ryb;", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class qu0 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long intrinsicSize;

    /* JADX INFO: renamed from: com.google.android.qu0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JY\u0010\u000f\u001a\u00020\u000e2*\u0010\b\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0004\"\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J;\u0010\u0013\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00112\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J;\u0010\u0017\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0017\u0010\u0018JY\u0010\u0019\u001a\u00020\u000e2*\u0010\b\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0004\"\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ;\u0010\u001d\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00112\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u001d\u0010\u0018JY\u0010\u001e\u001a\u00020\u000e2*\u0010\b\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0004\"\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u001e\u0010\u001aJY\u0010!\u001a\u00020\u000e2*\u0010\b\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0004\"\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0002\u0010\u001f\u001a\u00020\t2\b\b\u0002\u0010 \u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b!\u0010\"J;\u0010#\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00112\b\b\u0002\u0010\u001f\u001a\u00020\t2\b\b\u0002\u0010 \u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b#\u0010$JE\u0010%\u001a\u00020\u000e2*\u0010\b\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0004\"\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0002\u0010\u001f\u001a\u00020\tH\u0007¢\u0006\u0004\b%\u0010&J'\u0010'\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00112\b\b\u0002\u0010\u001f\u001a\u00020\tH\u0007¢\u0006\u0004\b'\u0010(J'\u0010-\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020+H\u0007¢\u0006\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lcom/google/android/qu0$a;", "", "<init>", "()V", "", "Lkotlin/Pair;", "", "Lcom/google/android/ei1;", "colorStops", "Lcom/google/android/rn8;", "start", "end", "Lcom/google/android/i5d;", "tileMode", "Lcom/google/android/qu0;", "g", "([Lkotlin/Pair;JJI)Lcom/google/android/qu0;", "", "colors", "f", "(Ljava/util/List;JJI)Lcom/google/android/qu0;", "startX", "endX", "b", "(Ljava/util/List;FFI)Lcom/google/android/qu0;", "c", "([Lkotlin/Pair;FFI)Lcom/google/android/qu0;", "startY", "endY", "q", "r", "center", "radius", "k", "([Lkotlin/Pair;JFI)Lcom/google/android/qu0;", "j", "(Ljava/util/List;JFI)Lcom/google/android/qu0;", "o", "([Lkotlin/Pair;J)Lcom/google/android/qu0;", "n", "(Ljava/util/List;J)Lcom/google/android/qu0;", "dstBrush", "srcBrush", "Landroidx/compose/ui/graphics/e;", "blendMode", "a", "(Lcom/google/android/qu0;Lcom/google/android/qu0;I)Lcom/google/android/qu0;", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ qu0 d(Companion companion, List list, float f, float f2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                f = 0.0f;
            }
            if ((i2 & 4) != 0) {
                f2 = Float.POSITIVE_INFINITY;
            }
            if ((i2 & 8) != 0) {
                i = i5d.INSTANCE.a();
            }
            return companion.b(list, f, f2, i);
        }

        public static /* synthetic */ qu0 e(Companion companion, Pair[] pairArr, float f, float f2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                f = 0.0f;
            }
            if ((i2 & 4) != 0) {
                f2 = Float.POSITIVE_INFINITY;
            }
            if ((i2 & 8) != 0) {
                i = i5d.INSTANCE.a();
            }
            return companion.c(pairArr, f, f2, i);
        }

        public static /* synthetic */ qu0 h(Companion companion, List list, long j, long j2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                j = rn8.INSTANCE.c();
            }
            long j3 = j;
            if ((i2 & 4) != 0) {
                j2 = rn8.INSTANCE.a();
            }
            long j4 = j2;
            if ((i2 & 8) != 0) {
                i = i5d.INSTANCE.a();
            }
            return companion.f(list, j3, j4, i);
        }

        public static /* synthetic */ qu0 i(Companion companion, Pair[] pairArr, long j, long j2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                j = rn8.INSTANCE.c();
            }
            long j3 = j;
            if ((i2 & 4) != 0) {
                j2 = rn8.INSTANCE.a();
            }
            long j4 = j2;
            if ((i2 & 8) != 0) {
                i = i5d.INSTANCE.a();
            }
            return companion.g(pairArr, j3, j4, i);
        }

        public static /* synthetic */ qu0 l(Companion companion, List list, long j, float f, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                j = rn8.INSTANCE.b();
            }
            long j2 = j;
            if ((i2 & 4) != 0) {
                f = Float.POSITIVE_INFINITY;
            }
            float f2 = f;
            if ((i2 & 8) != 0) {
                i = i5d.INSTANCE.a();
            }
            return companion.j(list, j2, f2, i);
        }

        public static /* synthetic */ qu0 m(Companion companion, Pair[] pairArr, long j, float f, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                j = rn8.INSTANCE.b();
            }
            long j2 = j;
            if ((i2 & 4) != 0) {
                f = Float.POSITIVE_INFINITY;
            }
            float f2 = f;
            if ((i2 & 8) != 0) {
                i = i5d.INSTANCE.a();
            }
            return companion.k(pairArr, j2, f2, i);
        }

        public static /* synthetic */ qu0 p(Companion companion, List list, long j, int i, Object obj) {
            if ((i & 2) != 0) {
                j = rn8.INSTANCE.b();
            }
            return companion.n(list, j);
        }

        public static /* synthetic */ qu0 s(Companion companion, List list, float f, float f2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                f = 0.0f;
            }
            if ((i2 & 4) != 0) {
                f2 = Float.POSITIVE_INFINITY;
            }
            if ((i2 & 8) != 0) {
                i = i5d.INSTANCE.a();
            }
            return companion.q(list, f, f2, i);
        }

        public static /* synthetic */ qu0 t(Companion companion, Pair[] pairArr, float f, float f2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                f = 0.0f;
            }
            if ((i2 & 4) != 0) {
                f2 = Float.POSITIVE_INFINITY;
            }
            if ((i2 & 8) != 0) {
                i = i5d.INSTANCE.a();
            }
            return companion.r(pairArr, f, f2, i);
        }

        public final qu0 a(qu0 dstBrush, qu0 srcBrush, int blendMode) {
            return new CompositeShaderBrush(ru0.b(dstBrush), ru0.b(srcBrush), blendMode, null);
        }

        public final qu0 b(List<ei1> colors, float startX, float endX, int tileMode) {
            return f(colors, rn8.e((((long) Float.floatToRawIntBits(startX)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L)), rn8.e((((long) Float.floatToRawIntBits(endX)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L)), tileMode);
        }

        public final qu0 c(Pair<Float, ei1>[] colorStops, float startX, float endX, int tileMode) {
            return g((Pair[]) Arrays.copyOf(colorStops, colorStops.length), rn8.e((((long) Float.floatToRawIntBits(startX)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L)), rn8.e((((long) Float.floatToRawIntBits(endX)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L)), tileMode);
        }

        public final qu0 f(List<ei1> colors, long start, long end, int tileMode) {
            return new l27(colors, null, start, end, tileMode, null);
        }

        public final qu0 g(Pair<Float, ei1>[] colorStops, long start, long end, int tileMode) {
            ArrayList arrayList = new ArrayList(colorStops.length);
            for (Pair<Float, ei1> pair : colorStops) {
                arrayList.add(ei1.l(((ei1) pair.d()).getValue()));
            }
            ArrayList arrayList2 = new ArrayList(colorStops.length);
            for (Pair<Float, ei1> pair2 : colorStops) {
                arrayList2.add(Float.valueOf(((Number) pair2.c()).floatValue()));
            }
            return new l27(arrayList, arrayList2, start, end, tileMode, null);
        }

        public final qu0 j(List<ei1> colors, long center, float radius, int tileMode) {
            return new c2a(colors, null, center, radius, tileMode, null);
        }

        public final qu0 k(Pair<Float, ei1>[] colorStops, long center, float radius, int tileMode) {
            ArrayList arrayList = new ArrayList(colorStops.length);
            for (Pair<Float, ei1> pair : colorStops) {
                arrayList.add(ei1.l(((ei1) pair.d()).getValue()));
            }
            ArrayList arrayList2 = new ArrayList(colorStops.length);
            for (Pair<Float, ei1> pair2 : colorStops) {
                arrayList2.add(Float.valueOf(((Number) pair2.c()).floatValue()));
            }
            return new c2a(arrayList, arrayList2, center, radius, tileMode, null);
        }

        public final qu0 n(List<ei1> colors, long center) {
            return new dhc(center, colors, null, null);
        }

        public final qu0 o(Pair<Float, ei1>[] colorStops, long center) {
            ArrayList arrayList = new ArrayList(colorStops.length);
            for (Pair<Float, ei1> pair : colorStops) {
                arrayList.add(ei1.l(((ei1) pair.d()).getValue()));
            }
            ArrayList arrayList2 = new ArrayList(colorStops.length);
            for (Pair<Float, ei1> pair2 : colorStops) {
                arrayList2.add(Float.valueOf(((Number) pair2.c()).floatValue()));
            }
            return new dhc(center, arrayList, arrayList2, null);
        }

        public final qu0 q(List<ei1> colors, float startY, float endY, int tileMode) {
            return f(colors, rn8.e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(startY)) & 4294967295L)), rn8.e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(endY)) & 4294967295L)), tileMode);
        }

        public final qu0 r(Pair<Float, ei1>[] colorStops, float startY, float endY, int tileMode) {
            return g((Pair[]) Arrays.copyOf(colorStops, colorStops.length), rn8.e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(startY)) & 4294967295L)), rn8.e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(endY)) & 4294967295L)), tileMode);
        }

        private Companion() {
        }
    }

    public /* synthetic */ qu0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract void a(long size, q09 p, float alpha);

    private qu0() {
        this.intrinsicSize = tsb.INSTANCE.a();
    }
}
