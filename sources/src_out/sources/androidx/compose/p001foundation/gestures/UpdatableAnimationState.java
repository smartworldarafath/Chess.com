package androidx.compose.p001foundation.gestures;

import com.google.android.sh7;
import com.google.android.yg4;
import com.google.inputmethod.f3e;
import com.google.inputmethod.kr;
import com.google.inputmethod.qr;
import com.google.inputmethod.w2e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0001\u0018\u0000 !2\u00020\u0001:\u0001\u0010B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J=\u0010\f\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0086@\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010#\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Landroidx/compose/foundation/gestures/UpdatableAnimationState;", "", "Lcom/google/android/kr;", "", "animationSpec", "<init>", "(Lcom/google/android/kr;)V", "Lkotlin/Function1;", "", "beforeFrame", "Lkotlin/Function0;", "afterFrame", "c", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/google/android/q22;)Ljava/lang/Object;", "Lcom/google/android/f3e;", "Lcom/google/android/qr;", "a", "Lcom/google/android/f3e;", "vectorizedSpec", "", "b", "J", "lastFrameTime", "Lcom/google/android/qr;", "lastVelocity", "", "d", "Z", "isRunning", "e", "F", "getValue", "()F", "f", "(F)V", "value", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UpdatableAnimationState {
    private static final a f = new a(null);
    public static final int g = 8;
    private static final qr h = new qr(0.0f);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final f3e<qr> vectorizedSpec;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private long lastFrameTime = Long.MIN_VALUE;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private qr lastVelocity = h;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean isRunning;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private float value;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/gestures/UpdatableAnimationState$a;", "", "<init>", "()V", "", "", "a", "(F)Z", "VisibilityThreshold", "F", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(float f) {
            return Math.abs(f) < 0.01f;
        }

        private a() {
        }
    }

    public UpdatableAnimationState(kr<Float> krVar) {
        this.vectorizedSpec = krVar.a(w2e.N(yg4.a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(UpdatableAnimationState updatableAnimationState, float f2, Function1 function1, long j) {
        if (updatableAnimationState.lastFrameTime == Long.MIN_VALUE) {
            updatableAnimationState.lastFrameTime = j;
        }
        qr qrVar = new qr(updatableAnimationState.value);
        long jB = f2 == 0.0f ? updatableAnimationState.vectorizedSpec.b(new qr(updatableAnimationState.value), h, updatableAnimationState.lastVelocity) : sh7.f((j - updatableAnimationState.lastFrameTime) / f2);
        f3e<qr> f3eVar = updatableAnimationState.vectorizedSpec;
        qr qrVar2 = h;
        float value = ((qr) f3eVar.g(jB, qrVar, qrVar2, updatableAnimationState.lastVelocity)).getValue();
        updatableAnimationState.lastVelocity = (qr) updatableAnimationState.vectorizedSpec.d(jB, qrVar, qrVar2, updatableAnimationState.lastVelocity);
        updatableAnimationState.lastFrameTime = j;
        float f3 = updatableAnimationState.value - value;
        updatableAnimationState.value = value;
        function1.invoke(Float.valueOf(f3));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(UpdatableAnimationState updatableAnimationState, Function1 function1, long j) {
        float f2 = updatableAnimationState.value;
        updatableAnimationState.value = 0.0f;
        function1.invoke(Float.valueOf(f2));
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0077 A[Catch: all -> 0x0035, PHI: r12 r13 r14
  0x0077: PHI (r12v4 float) = (r12v2 float), (r12v5 float) binds: [B:29:0x0071, B:36:0x009a] A[DONT_GENERATE, DONT_INLINE]
  0x0077: PHI (r13v6 kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit>) = 
  (r13v2 kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit>)
  (r13v7 kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit>)
 binds: [B:29:0x0071, B:36:0x009a] A[DONT_GENERATE, DONT_INLINE]
  0x0077: PHI (r14v16 kotlin.jvm.functions.Function0<kotlin.Unit>) = (r14v8 kotlin.jvm.functions.Function0<kotlin.Unit>), (r14v17 kotlin.jvm.functions.Function0<kotlin.Unit>) binds: [B:29:0x0071, B:36:0x009a] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x0030, B:43:0x00bb, B:20:0x004a, B:35:0x0095, B:30:0x0077, B:32:0x0081, B:37:0x009c, B:40:0x00a8), top: B:48:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0081 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x0030, B:43:0x00bb, B:20:0x004a, B:35:0x0095, B:30:0x0077, B:32:0x0081, B:37:0x009c, B:40:0x00a8), top: B:48:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0094  */
    /* JADX WARN: Code duplicated, block: B:35:0x0095 A[Catch: all -> 0x0035, PHI: r12 r13 r14
  0x0095: PHI (r12v5 float) = (r12v4 float), (r12v9 float) binds: [B:33:0x0092, B:21:0x004d] A[DONT_GENERATE, DONT_INLINE]
  0x0095: PHI (r13v7 kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit>) = 
  (r13v6 kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit>)
  (r13v10 kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit>)
 binds: [B:33:0x0092, B:21:0x004d] A[DONT_GENERATE, DONT_INLINE]
  0x0095: PHI (r14v17 kotlin.jvm.functions.Function0<kotlin.Unit>) = (r14v16 kotlin.jvm.functions.Function0<kotlin.Unit>), (r14v18 kotlin.jvm.functions.Function0<kotlin.Unit>) binds: [B:33:0x0092, B:21:0x004d] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0035, blocks: (B:13:0x0030, B:43:0x00bb, B:20:0x004a, B:35:0x0095, B:30:0x0077, B:32:0x0081, B:37:0x009c, B:40:0x00a8), top: B:48:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x009c A[Catch: all -> 0x0035, PHI: r13 r14
  0x009c: PHI (r13v3 kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit>) = 
  (r13v6 kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit>)
  (r13v7 kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit>)
 binds: [B:31:0x007f, B:36:0x009a] A[DONT_GENERATE, DONT_INLINE]
  0x009c: PHI (r14v11 kotlin.jvm.functions.Function0<kotlin.Unit>) = (r14v16 kotlin.jvm.functions.Function0<kotlin.Unit>), (r14v17 kotlin.jvm.functions.Function0<kotlin.Unit>) binds: [B:31:0x007f, B:36:0x009a] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0035, blocks: (B:13:0x0030, B:43:0x00bb, B:20:0x004a, B:35:0x0095, B:30:0x0077, B:32:0x0081, B:37:0x009c, B:40:0x00a8), top: B:48:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a8 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x0030, B:43:0x00bb, B:20:0x004a, B:35:0x0095, B:30:0x0077, B:32:0x0081, B:37:0x009c, B:40:0x00a8), top: B:48:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0092 -> B:35:0x0095). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object c(kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> r12, kotlin.jvm.functions.Function0<kotlin.Unit> r13, com.google.android.q22<? super kotlin.Unit> r14) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p001foundation.gestures.UpdatableAnimationState.c(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, com.google.android.q22):java.lang.Object");
    }

    public final void f(float f2) {
        this.value = f2;
    }
}
