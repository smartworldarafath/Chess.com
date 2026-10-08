package androidx.compose.ui.input.pointer;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import com.google.inputmethod.HistoricalChange;
import com.google.inputmethod.IndirectPointerInputChange;
import com.google.inputmethod.PointerInputEventData;
import com.google.inputmethod.el;
import com.google.inputmethod.fl;
import com.google.inputmethod.fv5;
import com.google.inputmethod.ha7;
import com.google.inputmethod.mq1;
import com.google.inputmethod.rn8;
import com.google.inputmethod.se9;
import com.google.inputmethod.ug9;
import com.google.inputmethod.ve9;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\tJ\u001b\u0010\u000e\u001a\u00020\r*\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\tJ9\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u001f\u0010 J%\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!H\u0000¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b&\u0010'R\u0016\u0010*\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010)R \u00100\u001a\u00020+8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010,\u0012\u0004\b/\u0010\u0003\u001a\u0004\b-\u0010.R\u0014\u00103\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u00102R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u001b048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00105R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u000208078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u00109R\u0016\u0010<\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010;R\u0016\u0010=\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010;R\u0016\u0010?\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010>R\u0016\u0010@\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010>R\u0018\u0010B\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010A¨\u0006C"}, d2 = {"Landroidx/compose/ui/input/pointer/a;", "", "<init>", "()V", "", "j", "Landroid/view/MotionEvent;", "motionEvent", "a", "(Landroid/view/MotionEvent;)V", "i", "", "pointerId", "", "h", "(Landroid/view/MotionEvent;I)Z", "motionEventPointerId", "Lcom/google/android/se9;", "g", "(I)J", "b", "Lcom/google/android/ug9;", "positionCalculator", "Lcom/google/android/rn8;", "rawPositionOverride", "index", "pressed", "Lcom/google/android/we9;", "e", "(Lcom/google/android/ug9;Landroid/view/MotionEvent;Lcom/google/android/rn8;IZ)Lcom/google/android/we9;", "Lcom/google/android/ve9;", "d", "(Landroid/view/MotionEvent;Lcom/google/android/ug9;)Lcom/google/android/ve9;", "Lcom/google/android/fv5;", "primaryDirectionalMotionAxisOverride", "Lcom/google/android/el;", "c", "(Landroid/view/MotionEvent;Lcom/google/android/fv5;)Lcom/google/android/el;", "f", "(I)V", "", "J", "nextId", "Landroid/util/SparseLongArray;", "Landroid/util/SparseLongArray;", "getMotionEventToComposePointerIdMap$ui", "()Landroid/util/SparseLongArray;", "getMotionEventToComposePointerIdMap$ui$annotations", "motionEventToComposePointerIdMap", "Landroid/util/SparseBooleanArray;", "Landroid/util/SparseBooleanArray;", "activeHoverIds", "", "Ljava/util/List;", "pointers", "Lcom/google/android/ha7;", "Landroidx/compose/ui/input/pointer/a$a;", "Lcom/google/android/ha7;", "previousIndirectPointerEventData", "I", "previousToolType", "previousSource", "Z", "isInFakeFingerGesture", "isReinterpretingFakeFingerGesture", "Lcom/google/android/rn8;", "inferredCursorRawOffset", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private long nextId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final SparseLongArray motionEventToComposePointerIdMap = new SparseLongArray();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final SparseBooleanArray activeHoverIds = new SparseBooleanArray();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<PointerInputEventData> pointers = new ArrayList();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final ha7<C0057a> previousIndirectPointerEventData = new ha7<>(0, 1, null);

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int previousToolType = -1;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int previousSource = -1;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean isInFakeFingerGesture;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private boolean isReinterpretingFakeFingerGesture;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private rn8 inferredCursorRawOffset;

    /* JADX INFO: renamed from: androidx.compose.ui.input.pointer.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0083@\u0018\u0000 \u000b2\u00020\u0001:\u0001\u0016B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u000f\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\fR\u0011\u0010\u0005\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\f\u0088\u0001\n\u0092\u0001\u00020\u0002¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/input/pointer/a$a;", "", "", "uptime", "Lcom/google/android/rn8;", "position", "", "down", "c", "(JJZ)J", "packedValue", "b", "(J)J", "", "i", "(J)Ljava/lang/String;", "", "h", "(J)I", "other", "d", "(JLjava/lang/Object;)Z", "a", "J", "getPackedValue", "()J", "e", "(J)Z", "g", "f", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class C0057a {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final long packedValue;

        /* JADX INFO: renamed from: androidx.compose.ui.input.pointer.a$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/input/pointer/a$a$a;", "", "<init>", "()V", "", "val1", "val2", "", "d", "(SS)I", "value", "e", "(I)S", "f", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int d(short val1, short val2) {
                return (val1 << 16) | (val2 & 65535);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final short e(int value) {
                return (short) (value >>> 16);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final short f(int value) {
                return (short) (value & 65535);
            }

            private Companion() {
            }
        }

        private /* synthetic */ C0057a(long j) {
            this.packedValue = j;
        }

        public static final /* synthetic */ C0057a a(long j) {
            return new C0057a(j);
        }

        public static long b(long j) {
            return j;
        }

        public static long c(long j, long j2, boolean z) {
            return b(((j & 2147483647L) << 1) | (z ? 1L : 0L) | (((long) INSTANCE.d((short) Float.intBitsToFloat((int) (j2 >> 32)), (short) Float.intBitsToFloat((int) (j2 & 4294967295L)))) << 32));
        }

        public static boolean d(long j, Object obj) {
            return (obj instanceof C0057a) && j == ((C0057a) obj).getPackedValue();
        }

        public static final boolean e(long j) {
            return (j & 1) != 0;
        }

        public static final long f(long j) {
            int i = (int) (j >>> 32);
            Companion companion = INSTANCE;
            float fE = companion.e(i);
            return rn8.e((((long) Float.floatToRawIntBits(companion.f(i))) & 4294967295L) | (Float.floatToRawIntBits(fE) << 32));
        }

        public static final long g(long j) {
            return (j >> 1) & 2147483647L;
        }

        public static int h(long j) {
            return Long.hashCode(j);
        }

        public static String i(long j) {
            return "IndirectPointerEventData(packedValue=" + j + ')';
        }

        public boolean equals(Object obj) {
            return d(this.packedValue, obj);
        }

        public int hashCode() {
            return h(this.packedValue);
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final /* synthetic */ long getPackedValue() {
            return this.packedValue;
        }

        public String toString() {
            return i(this.packedValue);
        }
    }

    private final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked != 9) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            if (this.motionEventToComposePointerIdMap.indexOfKey(pointerId) < 0) {
                SparseLongArray sparseLongArray = this.motionEventToComposePointerIdMap;
                long j = this.nextId;
                this.nextId = 1 + j;
                sparseLongArray.put(pointerId, j);
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (this.motionEventToComposePointerIdMap.indexOfKey(pointerId2) < 0) {
            SparseLongArray sparseLongArray2 = this.motionEventToComposePointerIdMap;
            long j2 = this.nextId;
            this.nextId = 1 + j2;
            sparseLongArray2.put(pointerId2, j2);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.activeHoverIds.put(pointerId2, true);
            }
        }
    }

    private final void b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType == this.previousToolType && source == this.previousSource) {
            return;
        }
        this.previousToolType = toolType;
        this.previousSource = source;
        this.activeHoverIds.clear();
        this.motionEventToComposePointerIdMap.clear();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0091  */
    /* JADX WARN: Code duplicated, block: B:21:0x0096  */
    /* JADX WARN: Code duplicated, block: B:23:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x009b  */
    /* JADX WARN: Code duplicated, block: B:26:0x009e  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:32:0x00be  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:48:0x010d  */
    /* JADX WARN: Code duplicated, block: B:68:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:69:0x01de  */
    /* JADX WARN: Code duplicated, block: B:78:0x0207  */
    /* JADX WARN: Code duplicated, block: B:80:0x020b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0242  */
    /* JADX WARN: Code duplicated, block: B:91:0x01b1 A[EDGE_INSN: B:91:0x01b1->B:66:0x01b1 BREAK  A[LOOP:0: B:46:0x0105->B:65:0x01ab], SYNTHETIC] */
    private final PointerInputEventData e(ug9 positionCalculator, MotionEvent motionEvent, rn8 rawPositionOverride, int index, boolean pressed) {
        char c;
        long j;
        long jM;
        long j2;
        long jI;
        int toolType;
        char c2;
        int iE;
        int historySize;
        int i;
        float fFloatValue;
        long jC;
        long jC2;
        Float f;
        float historicalX;
        long jG = g(motionEvent.getPointerId(index));
        float pressure = motionEvent.getPressure(index);
        long jE = rn8.e((((long) Float.floatToRawIntBits(motionEvent.getY(index))) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getX(index))) << 32));
        if (index != 0) {
            c = ' ';
            j = 4294967295L;
            if (Build.VERSION.SDK_INT >= 29) {
                jM = rawPositionOverride != null ? rawPositionOverride.getPackedValue() : b.a.a(motionEvent, index);
                jI = positionCalculator.i(jM);
            } else {
                jM = positionCalculator.m(jE);
                j2 = jE;
            }
            long j3 = jM;
            toolType = motionEvent.getToolType(index);
            if (toolType != 0) {
                c2 = c;
                if (toolType != 1) {
                    if (toolType != 2) {
                        iE = j.INSTANCE.c();
                    } else if (toolType != 3) {
                        iE = j.INSTANCE.b();
                    } else if (toolType != 4) {
                        iE = j.INSTANCE.e();
                    } else {
                        iE = j.INSTANCE.a();
                    }
                } else if (!mq1.isTrackpadGestureHandlingEnabled) {
                    iE = ((!motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584)) && (!this.isInFakeFingerGesture || this.isReinterpretingFakeFingerGesture)) ? j.INSTANCE.b() : j.INSTANCE.d();
                } else {
                    iE = j.INSTANCE.d();
                }
            } else {
                c2 = c;
                iE = j.INSTANCE.e();
            }
            ArrayList arrayList = new ArrayList(motionEvent.getHistorySize());
            historySize = motionEvent.getHistorySize();
            int i2 = iE;
            i = 0;
            while (true) {
                fFloatValue = 1.0f;
                if (i < historySize) {
                    break;
                }
                historicalX = motionEvent.getHistoricalX(index, i);
                float historicalY = motionEvent.getHistoricalY(index, i);
                long j4 = jE;
                if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) >= 2139095040 && (Float.floatToRawIntBits(historicalY) & Integer.MAX_VALUE) < 2139095040) {
                    long jE2 = rn8.e((((long) Float.floatToRawIntBits(historicalX)) << c2) | (((long) Float.floatToRawIntBits(historicalY)) & j));
                    long historicalEventTime = motionEvent.getHistoricalEventTime(i);
                    Float fValueOf = Float.valueOf(motionEvent.getHistoricalAxisValue(52, index, i));
                    f = fValueOf.floatValue() > 0.0f ? fValueOf : null;
                    arrayList.add(new HistoricalChange(historicalEventTime, jE2, f != null ? f.floatValue() : 1.0f, (Build.VERSION.SDK_INT < 29 || motionEvent.getClassification() != 3) ? rn8.INSTANCE.c() : rn8.e((((long) Float.floatToRawIntBits(motionEvent.getHistoricalAxisValue(50, index, i))) << c2) | (((long) Float.floatToRawIntBits(motionEvent.getHistoricalAxisValue(51, index, i))) & j)), jE2, null));
                }
                i++;
                jE = j4;
            }
            long j5 = jE;
            if (motionEvent.getActionMasked() == 8) {
                jC = rn8.e((((long) Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + 0.0f)) & j) | (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(10))) << c2));
            } else {
                jC = rn8.INSTANCE.c();
            }
            if (mq1.isTrackpadGestureHandlingEnabled && Build.VERSION.SDK_INT >= 29 && motionEvent.getClassification() == 5) {
                Float fValueOf2 = Float.valueOf(motionEvent.getAxisValue(52, index));
                f = fValueOf2.floatValue() > 0.0f ? fValueOf2 : null;
                if (f != null) {
                    fFloatValue = f.floatValue();
                }
            }
            if (mq1.isTrackpadGestureHandlingEnabled || Build.VERSION.SDK_INT < 29 || motionEvent.getClassification() != 3) {
                jC2 = rn8.INSTANCE.c();
            } else {
                jC2 = rn8.e((((long) Float.floatToRawIntBits(motionEvent.getAxisValue(50, index))) << c2) | (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(51, index))) & j));
            }
            return new PointerInputEventData(jG, motionEvent.getEventTime(), j3, j2, pressed, pressure, i2, this.activeHoverIds.get(motionEvent.getPointerId(index), false), arrayList, jC, fFloatValue, jC2, j5, null);
        }
        if (rawPositionOverride != null) {
            c = ' ';
            jM = rawPositionOverride.getPackedValue();
            j = 4294967295L;
        } else {
            c = ' ';
            j = 4294967295L;
            jM = rn8.e((((long) Float.floatToRawIntBits(motionEvent.getRawX())) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getRawY())) & 4294967295L));
        }
        jI = positionCalculator.i(jM);
        j2 = jI;
        long j6 = jM;
        toolType = motionEvent.getToolType(index);
        if (toolType != 0) {
            c2 = c;
            if (toolType != 1) {
                if (toolType != 2) {
                    iE = j.INSTANCE.c();
                } else if (toolType != 3) {
                    iE = j.INSTANCE.b();
                } else if (toolType != 4) {
                    iE = j.INSTANCE.e();
                } else {
                    iE = j.INSTANCE.a();
                }
            } else if (!mq1.isTrackpadGestureHandlingEnabled) {
                iE = j.INSTANCE.d();
            } else if (motionEvent.isFromSource(8194)) {
            }
        } else {
            c2 = c;
            iE = j.INSTANCE.e();
        }
        ArrayList arrayList2 = new ArrayList(motionEvent.getHistorySize());
        historySize = motionEvent.getHistorySize();
        int i3 = iE;
        i = 0;
        while (true) {
            fFloatValue = 1.0f;
            if (i < historySize) {
                break;
                break;
            }
            historicalX = motionEvent.getHistoricalX(index, i);
            float historicalY2 = motionEvent.getHistoricalY(index, i);
            long j7 = jE;
            if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) >= 2139095040) {
            }
            i++;
            jE = j7;
        }
        long j8 = jE;
        if (motionEvent.getActionMasked() == 8) {
            jC = rn8.e((((long) Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + 0.0f)) & j) | (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(10))) << c2));
        } else {
            jC = rn8.INSTANCE.c();
        }
        if (mq1.isTrackpadGestureHandlingEnabled) {
            Float fValueOf3 = Float.valueOf(motionEvent.getAxisValue(52, index));
            if (fValueOf3.floatValue() > 0.0f) {
            }
            if (f != null) {
                fFloatValue = f.floatValue();
            }
        }
        if (mq1.isTrackpadGestureHandlingEnabled) {
            jC2 = rn8.INSTANCE.c();
        } else {
            jC2 = rn8.INSTANCE.c();
        }
        return new PointerInputEventData(jG, motionEvent.getEventTime(), j6, j2, pressed, pressure, i3, this.activeHoverIds.get(motionEvent.getPointerId(index), false), arrayList2, jC, fFloatValue, jC2, j8, null);
    }

    private final long g(int motionEventPointerId) {
        long jValueAt;
        int iIndexOfKey = this.motionEventToComposePointerIdMap.indexOfKey(motionEventPointerId);
        if (iIndexOfKey >= 0) {
            jValueAt = this.motionEventToComposePointerIdMap.valueAt(iIndexOfKey);
        } else {
            jValueAt = this.nextId;
            this.nextId = 1 + jValueAt;
            this.motionEventToComposePointerIdMap.put(motionEventPointerId, jValueAt);
        }
        return se9.a(jValueAt);
    }

    private final boolean h(MotionEvent motionEvent, int i) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            if (motionEvent.getPointerId(i2) == i) {
                return true;
            }
        }
        return false;
    }

    private final void i(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!this.activeHoverIds.get(pointerId, false)) {
                this.motionEventToComposePointerIdMap.delete(pointerId);
                this.activeHoverIds.delete(pointerId);
            }
        }
        if (this.motionEventToComposePointerIdMap.size() > motionEvent.getPointerCount()) {
            for (int size = this.motionEventToComposePointerIdMap.size() - 1; -1 < size; size--) {
                int iKeyAt = this.motionEventToComposePointerIdMap.keyAt(size);
                if (!h(motionEvent, iKeyAt)) {
                    this.motionEventToComposePointerIdMap.removeAt(size);
                    this.activeHoverIds.delete(iKeyAt);
                }
            }
        }
    }

    private final void j() {
        this.isInFakeFingerGesture = false;
        this.isReinterpretingFakeFingerGesture = false;
        this.inferredCursorRawOffset = null;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d5  */
    public final el c(MotionEvent motionEvent, fv5 primaryDirectionalMotionAxisOverride) {
        int actionIndex;
        long eventTime;
        long jF;
        boolean zE;
        int actionMasked = motionEvent.getActionMasked();
        b(motionEvent);
        if (actionMasked == 3) {
            this.motionEventToComposePointerIdMap.clear();
            this.activeHoverIds.clear();
            return null;
        }
        a(motionEvent);
        if (actionMasked != 1) {
            actionIndex = actionMasked != 6 ? -1 : motionEvent.getActionIndex();
        } else {
            actionIndex = 0;
        }
        boolean z = actionMasked == 0 || actionMasked == 2 || actionMasked == 5;
        int pointerCount = motionEvent.getPointerCount();
        boolean z2 = false;
        ArrayList arrayList = new ArrayList(pointerCount);
        int i = 0;
        while (i < pointerCount) {
            long jG = g(motionEvent.getPointerId(i));
            long jE = rn8.e((((long) Float.floatToRawIntBits(motionEvent.getY(i))) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getX(i))) << 32));
            boolean z3 = i != actionIndex ? true : z2;
            C0057a c0057aD = this.previousIndirectPointerEventData.d(jG);
            if (i == actionIndex) {
                this.previousIndirectPointerEventData.i(jG);
            } else {
                if (z) {
                    this.previousIndirectPointerEventData.h(jG, C0057a.a(C0057a.c(motionEvent.getEventTime(), jE, true)));
                }
                long eventTime2 = motionEvent.getEventTime();
                int i2 = i;
                float pressure = motionEvent.getPressure(i2);
                if (c0057aD != null) {
                    eventTime = C0057a.g(c0057aD.getPackedValue());
                } else {
                    eventTime = motionEvent.getEventTime();
                }
                if (c0057aD != null) {
                    jF = C0057a.f(c0057aD.getPackedValue());
                } else {
                    jF = jE;
                }
                if (c0057aD != null) {
                    zE = C0057a.e(c0057aD.getPackedValue());
                } else {
                    zE = false;
                }
                arrayList.add(new IndirectPointerInputChange(jG, eventTime2, jE, z3, pressure, eventTime, jF, zE, null));
                i = i2 + 1;
                z2 = false;
            }
            long eventTime3 = motionEvent.getEventTime();
            int i3 = i;
            float pressure2 = motionEvent.getPressure(i3);
            if (c0057aD != null) {
                eventTime = C0057a.g(c0057aD.getPackedValue());
            } else {
                eventTime = motionEvent.getEventTime();
            }
            if (c0057aD != null) {
                jF = C0057a.f(c0057aD.getPackedValue());
            } else {
                jF = jE;
            }
            if (c0057aD != null) {
                zE = C0057a.e(c0057aD.getPackedValue());
            } else {
                zE = false;
            }
            arrayList.add(new IndirectPointerInputChange(jG, eventTime3, jE, z3, pressure2, eventTime, jF, zE, null));
            i = i3 + 1;
            z2 = false;
        }
        i(motionEvent);
        return new el(arrayList, fl.a(actionMasked), primaryDirectionalMotionAxisOverride != null ? primaryDirectionalMotionAxisOverride.getValue() : fl.c(motionEvent), motionEvent, null);
    }

    public final ve9 d(MotionEvent motionEvent, ug9 positionCalculator) {
        int actionIndex;
        a aVar;
        MotionEvent motionEvent2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3 || actionMasked == 4) {
            this.motionEventToComposePointerIdMap.clear();
            this.activeHoverIds.clear();
            j();
            return null;
        }
        b(motionEvent);
        a(motionEvent);
        boolean z = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
        boolean z2 = actionMasked == 8;
        if (z) {
            this.activeHoverIds.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        if (actionMasked != 1) {
            actionIndex = actionMasked != 6 ? -1 : motionEvent.getActionIndex();
        } else {
            actionIndex = 0;
        }
        this.pointers.clear();
        if (mq1.isTrackpadGestureHandlingEnabled && motionEvent.getActionMasked() == 0) {
            boolean z3 = Build.VERSION.SDK_INT >= 34 && (motionEvent.getClassification() == 3 || motionEvent.getClassification() == 5);
            boolean z4 = motionEvent.getButtonState() == 0 && (motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584));
            if (z3 || z4) {
                this.isInFakeFingerGesture = true;
            }
        }
        if (mq1.isTrackpadGestureHandlingEnabled && Build.VERSION.SDK_INT >= 34 && motionEvent.getClassification() == 3) {
            this.isReinterpretingFakeFingerGesture = true;
            if (motionEvent.getActionMasked() == 0) {
                this.inferredCursorRawOffset = rn8.d(rn8.e((((long) Float.floatToRawIntBits(motionEvent.getRawY(0))) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getRawX(0))) << 32)));
            }
            motionEvent2 = motionEvent;
            aVar = this;
            this.pointers.add(e(positionCalculator, motionEvent2, this.inferredCursorRawOffset, 0, false));
        } else {
            aVar = this;
            MotionEvent motionEvent3 = motionEvent;
            ug9 ug9Var = positionCalculator;
            aVar.isReinterpretingFakeFingerGesture = false;
            int pointerCount = motionEvent3.getPointerCount();
            int i = 0;
            while (i < pointerCount) {
                aVar.pointers.add(aVar.e(ug9Var, motionEvent3, null, i, (z || i == actionIndex || (z2 && motionEvent3.getButtonState() == 0)) ? false : true));
                i++;
                motionEvent3 = motionEvent3;
                ug9Var = ug9Var;
            }
            motionEvent2 = motionEvent3;
        }
        if (motionEvent2.getActionMasked() == 1) {
            j();
        }
        i(motionEvent2);
        return new ve9(motionEvent2.getEventTime(), aVar.pointers, motionEvent2);
    }

    public final void f(int pointerId) {
        this.activeHoverIds.delete(pointerId);
        this.motionEventToComposePointerIdMap.delete(pointerId);
    }
}
