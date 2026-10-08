package com.google.inputmethod;

import androidx.compose.p001foundation.MutatePriority;
import androidx.compose.p001foundation.gestures.ScrollExtensionsKt;
import androidx.compose.p001foundation.gestures.u;
import androidx.compose.p004runtime.p0;
import com.google.android.q22;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006*\u00016\b\u0007\u0018\u0000 J2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J<\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00022\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u0015H\u0086@¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0019\u0010\u001aR+\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00028G@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010\u0005R+\u0010#\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00028F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010\u0005R+\u0010'\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00028@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010\u0005R\u001a\u0010,\u001a\u00020(8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010)\u001a\u0004\b*\u0010+R\u0016\u0010/\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010\u001cR\u0016\u00102\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00105\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001b\u0010>\u001a\u00020:8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b$\u0010=R\u001b\u0010@\u001a\u00020:8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b?\u0010<\u001a\u0004\b0\u0010=R$\u0010D\u001a\u00020\u00022\u0006\u0010A\u001a\u00020\u00028F@@X\u0086\u000e¢\u0006\f\u001a\u0004\bB\u0010\u001e\"\u0004\bC\u0010\u0005R\u0011\u0010H\u001a\u00020E8F¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0014\u0010I\u001a\u00020:8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010=¨\u0006K"}, d2 = {"Lcom/google/android/v9b;", "Lcom/google/android/hab;", "", "initial", "<init>", "(I)V", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Lcom/google/android/p9b;", "Lcom/google/android/q22;", "", "", "block", "a", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lcom/google/android/q22;)Ljava/lang/Object;", "", "delta", "d", "(F)F", "value", "Lcom/google/android/kr;", "animationSpec", "o", "(ILcom/google/android/kr;Lcom/google/android/q22;)Ljava/lang/Object;", "w", "(ILcom/google/android/q22;)Ljava/lang/Object;", "<set-?>", "Lcom/google/android/q48;", "v", "()I", "A", "b", "getViewportSize", "B", "viewportSize", "c", "getContentSize$foundation", "y", "contentSize", "Lcom/google/android/r48;", "Lcom/google/android/r48;", "t", "()Lcom/google/android/r48;", "internalInteractionSource", "Lcom/google/android/q48;", "e", "_maxValueState", "f", "F", "accumulator", "g", "Lcom/google/android/hab;", "scrollableState", "com/google/android/v9b$b", "h", "Lcom/google/android/v9b$b;", "_scrollIndicatorState", "", "i", "Lcom/google/android/q6c;", "()Z", "canScrollForward", "j", "canScrollBackward", "newMax", "u", "z", "maxValue", "Lcom/google/android/j26;", "s", "()Lcom/google/android/j26;", "interactionSource", "isScrollInProgress", "k", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v9b implements hab {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final k0b<v9b, ?> l = n0b.e(new Function2() { // from class: com.google.android.t9b
        public final Object invoke(Object obj, Object obj2) {
            return v9b.l((o0b) obj, (v9b) obj2);
        }
    }, new Function1() { // from class: com.google.android.u9b
        public final Object invoke(Object obj) {
            return v9b.m(((Integer) obj).intValue());
        }
    });

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final q48 value;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private float accumulator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final q48 viewportSize = mwb.a(0);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final q48 contentSize = mwb.a(0);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final r48 internalInteractionSource = k26.a();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private q48 _maxValueState = mwb.a(Integer.MAX_VALUE);

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final hab scrollableState = u.b(new Function1() { // from class: com.google.android.q9b
        public final Object invoke(Object obj) {
            return Float.valueOf(v9b.x(this.a, ((Float) obj).floatValue()));
        }
    });

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final b _scrollIndicatorState = new b();

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final q6c canScrollForward = p0.e(new Function0() { // from class: com.google.android.r9b
        public final Object invoke() {
            return Boolean.valueOf(v9b.r(this.a));
        }
    });

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final q6c canScrollBackward = p0.e(new Function0() { // from class: com.google.android.s9b
        public final Object invoke() {
            return Boolean.valueOf(v9b.q(this.a));
        }
    });

    /* JADX INFO: renamed from: com.google.android.v9b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/google/android/v9b$a;", "", "<init>", "()V", "Lcom/google/android/k0b;", "Lcom/google/android/v9b;", "Saver", "Lcom/google/android/k0b;", "a", "()Lcom/google/android/k0b;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k0b<v9b, ?> a() {
            return v9b.l;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/google/android/v9b$b", "", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        b() {
        }
    }

    public v9b(int i) {
        this.value = mwb.a(i);
    }

    private final void A(int i) {
        this.value.f(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer l(o0b o0bVar, v9b v9bVar) {
        return Integer.valueOf(v9bVar.v());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v9b m(int i) {
        return new v9b(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object p(v9b v9bVar, int i, kr krVar, q22 q22Var, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            krVar = new w2c(0.0f, 0.0f, null, 7, null);
        }
        return v9bVar.o(i, krVar, q22Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean q(v9b v9bVar) {
        return v9bVar.v() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean r(v9b v9bVar) {
        return v9bVar.v() < v9bVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float x(v9b v9bVar, float f) {
        float fV = v9bVar.v() + f + v9bVar.accumulator;
        float fN = g.n(fV, 0.0f, v9bVar.u());
        boolean z = fV == fN;
        float fV2 = fN - v9bVar.v();
        int iRound = Math.round(fV2);
        v9bVar.A(v9bVar.v() + iRound);
        v9bVar.accumulator = fV2 - iRound;
        return !z ? fV2 : f;
    }

    public final void B(int i) {
        this.viewportSize.f(i);
    }

    @Override // com.google.inputmethod.hab
    public Object a(MutatePriority mutatePriority, Function2<? super p9b, ? super q22<? super Unit>, ? extends Object> function2, q22<? super Unit> q22Var) {
        Object objA = this.scrollableState.a(mutatePriority, function2, q22Var);
        return objA == a.g() ? objA : Unit.a;
    }

    @Override // com.google.inputmethod.hab
    public boolean b() {
        return this.scrollableState.b();
    }

    @Override // com.google.inputmethod.hab
    public boolean c() {
        return ((Boolean) this.canScrollForward.getValue()).booleanValue();
    }

    @Override // com.google.inputmethod.hab
    public float d(float delta) {
        return this.scrollableState.d(delta);
    }

    @Override // com.google.inputmethod.hab
    public boolean f() {
        return ((Boolean) this.canScrollBackward.getValue()).booleanValue();
    }

    public final Object o(int i, kr<Float> krVar, q22<? super Unit> q22Var) {
        Object objA = ScrollExtensionsKt.a(this, i - v(), krVar, q22Var);
        return objA == a.g() ? objA : Unit.a;
    }

    public final j26 s() {
        return this.internalInteractionSource;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final r48 getInternalInteractionSource() {
        return this.internalInteractionSource;
    }

    public final int u() {
        return this._maxValueState.getIntValue();
    }

    public final int v() {
        return this.value.getIntValue();
    }

    public final Object w(int i, q22<? super Float> q22Var) {
        return ScrollExtensionsKt.c(this, i - v(), q22Var);
    }

    public final void y(int i) {
        this.contentSize.f(i);
    }

    public final void z(int i) {
        this._maxValueState.f(i);
        androidx.compose.p004runtime.snapshots.g.Companion companion = androidx.compose.p004runtime.snapshots.g.INSTANCE;
        androidx.compose.p004runtime.snapshots.g gVarD = companion.d();
        Function1<Object, Unit> function1G = gVarD != null ? gVarD.g() : null;
        androidx.compose.p004runtime.snapshots.g gVarE = companion.e(gVarD);
        try {
            if (v() > i) {
                A(i);
            }
            Unit unit = Unit.a;
        } finally {
            companion.l(gVarD, gVarE, function1G);
        }
    }
}
