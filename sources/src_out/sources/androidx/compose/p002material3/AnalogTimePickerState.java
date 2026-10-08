package androidx.compose.p002material3;

import androidx.compose.p000animation.core.Animatable;
import androidx.compose.p001foundation.MutatePriority;
import androidx.compose.p001foundation.MutatorMutex;
import androidx.compose.p004runtime.s0;
import androidx.compose.p004runtime.snapshots.g;
import com.google.android.q22;
import com.google.android.ut0;
import com.google.inputmethod.aca;
import com.google.inputmethod.aq;
import com.google.inputmethod.ff3;
import com.google.inputmethod.j7d;
import com.google.inputmethod.kr;
import com.google.inputmethod.o58;
import com.google.inputmethod.qr;
import com.google.inputmethod.x06;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\n*\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\rJ\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u0012*\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\rJ\u001e\u0010\u001a\u001a\u00020\u000e2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u0018H\u0086@¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u001c\u001a\u00020\u000e2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u0018H\u0086@¢\u0006\u0004\b\u001c\u0010\u001bJ0\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\n2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u00182\b\b\u0002\u0010\u001d\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R+\u00100\u001a\u00020(2\u0006\u0010)\u001a\u00020(8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0016\u00102\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010\u000fR\u0016\u00104\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010\u000fR\"\u00109\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u000206058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0011\u0010?\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b>\u0010-R\u0011\u0010C\u001a\u00020@8F¢\u0006\u0006\u001a\u0004\bA\u0010BR$\u0010G\u001a\u00020\u00122\u0006\u0010D\u001a\u00020\u00128V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b7\u0010E\"\u0004\b3\u0010FR$\u0010H\u001a\u00020\u00122\u0006\u0010D\u001a\u00020\u00128V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b \u0010E\"\u0004\b1\u0010FR\u001c\u0010K\u001a\u00020\u00048\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b;\u0010\t\"\u0004\bI\u0010JR\u001c\u0010M\u001a\u00020L8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b*\u0010E\"\u0004\b$\u0010F¨\u0006N"}, d2 = {"Landroidx/compose/material3/AnalogTimePickerState;", "Lcom/google/android/j7d;", "state", "Lcom/google/android/aca;", "", "userOverride", "<init>", "(Lcom/google/android/j7d;Lcom/google/android/aca;)V", "w", "()Z", "", "new", "r", "(F)F", "", "F", "()V", "x", "", "D", "(F)I", "E", "angle", "y", "Lcom/google/android/kr;", "animationSpec", "q", "(Lcom/google/android/kr;Lcom/google/android/q22;)Ljava/lang/Object;", "z", "animate", "A", "(FLcom/google/android/kr;ZLcom/google/android/q22;)Ljava/lang/Object;", "a", "Lcom/google/android/j7d;", "v", "()Lcom/google/android/j7d;", "b", "Lcom/google/android/aca;", "getUserOverride", "()Lcom/google/android/aca;", "Lcom/google/android/ff3;", "<set-?>", "c", "Lcom/google/android/o58;", "u", "()F", "C", "(F)V", "currentDiameter", "d", "hourAngle", "e", "minuteAngle", "Landroidx/compose/animation/core/Animatable;", "Lcom/google/android/qr;", "f", "Landroidx/compose/animation/core/Animatable;", "anim", "Landroidx/compose/foundation/MutatorMutex;", "g", "Landroidx/compose/foundation/MutatorMutex;", "mutex", "t", "currentAngle", "Lcom/google/android/x06;", "s", "()Lcom/google/android/x06;", "clockFaceValues", "value", "()I", "(I)V", "minute", "hour", "set24hour", "(Z)V", "is24hour", "Landroidx/compose/material3/m2;", "selection", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AnalogTimePickerState implements j7d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final j7d state;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final aca<Boolean> userOverride;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private float hourAngle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private float minuteAngle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private Animatable<Float, qr> anim;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final o58 currentDiameter = s0.e(ff3.e(ff3.i(0)), null, 2, null);

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final MutatorMutex mutex = new MutatorMutex();

    public AnalogTimePickerState(j7d j7dVar, aca<Boolean> acaVar) {
        this.state = j7dVar;
        this.userOverride = acaVar;
        this.hourAngle = ((j7dVar.a() % 12) * 0.5235988f) - 1.5707964f;
        this.minuteAngle = (j7dVar.f() * 0.10471976f) - 1.5707964f;
        this.anim = aq.b(this.hourAngle, 0.0f, 2, null);
    }

    public static /* synthetic */ Object B(AnalogTimePickerState analogTimePickerState, float f, kr krVar, boolean z, q22 q22Var, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return analogTimePickerState.A(f, krVar, z, q22Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int D(float f) {
        return ((int) ((((double) f) + (((double) 0.2617994f) + 1.5707963267948966d)) / ((double) 0.5235988f))) % 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int E(float f) {
        return ((int) ((((double) f) + (((double) 0.05235988f) + 1.5707963267948966d)) / ((double) 0.10471976f))) % 60;
    }

    private final void F() {
        g.Companion companion = g.INSTANCE;
        g gVarD = companion.d();
        Function1<Object, Unit> function1G = gVarD != null ? gVarD.g() : null;
        g gVarE = companion.e(gVarD);
        try {
            this.state.e(f());
            Unit unit = Unit.a;
        } finally {
            companion.l(gVarD, gVarE, function1G);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float r(float f) {
        float fFloatValue = this.anim.m().floatValue() - f;
        while (fFloatValue > 3.1415927f) {
            fFloatValue -= 6.2831855f;
        }
        while (fFloatValue <= -3.1415927f) {
            fFloatValue += 6.2831855f;
        }
        return this.anim.m().floatValue() - fFloatValue;
    }

    private final boolean w() {
        int iC = c();
        m2.Companion companion = m2.INSTANCE;
        if (m2.f(iC, companion.a()) && x(this.anim.k().floatValue()) == x(this.hourAngle)) {
            return false;
        }
        return (m2.f(c(), companion.b()) && x(this.anim.k().floatValue()) == x(this.minuteAngle)) ? false : true;
    }

    private final float x(float f) {
        double d = ((double) f) % 6.283185307179586d;
        if (d < 0.0d) {
            d += 6.283185307179586d;
        }
        return (float) d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float y(float angle) {
        float f = angle + 1.5707964f;
        return f < 0.0f ? f + 6.2831855f : f;
    }

    public final Object A(float f, kr<Float> krVar, boolean z, q22<? super Unit> q22Var) {
        this.userOverride.b(ut0.a(false));
        Object objD = this.mutex.d(MutatePriority.UserInput, new AnalogTimePickerState$rotateTo$2(this, f, z, krVar, null), q22Var);
        return objD == a.g() ? objD : Unit.a;
    }

    public final void C(float f) {
        this.currentDiameter.setValue(ff3.e(f));
    }

    @Override // com.google.inputmethod.j7d
    public int a() {
        return this.state.a();
    }

    @Override // com.google.inputmethod.j7d
    public void b(int i) {
        this.state.b(i);
    }

    @Override // com.google.inputmethod.j7d
    public int c() {
        return this.state.c();
    }

    @Override // com.google.inputmethod.j7d
    public void d(int i) {
        this.hourAngle = ((i % 12) * 0.5235988f) - 1.5707964f;
        this.state.d(i);
        if (m2.f(c(), m2.INSTANCE.a())) {
            this.anim = aq.b(this.hourAngle, 0.0f, 2, null);
        }
    }

    @Override // com.google.inputmethod.j7d
    public void e(int i) {
        this.minuteAngle = (i * 0.10471976f) - 1.5707964f;
        this.state.e(i);
        if (m2.f(c(), m2.INSTANCE.b())) {
            this.anim = aq.b(this.minuteAngle, 0.0f, 2, null);
        }
        F();
    }

    @Override // com.google.inputmethod.j7d
    public int f() {
        return this.state.f();
    }

    @Override // com.google.inputmethod.j7d
    public boolean g() {
        return this.state.g();
    }

    public final Object q(kr<Float> krVar, q22<? super Unit> q22Var) {
        if (!w()) {
            return Unit.a;
        }
        Object objD = this.mutex.d(MutatePriority.PreventUserInput, new AnalogTimePickerState$animateToCurrent$2(this, m2.f(c(), m2.INSTANCE.a()) ? r(this.hourAngle) : r(this.minuteAngle), krVar, null), q22Var);
        return objD == a.g() ? objD : Unit.a;
    }

    public final x06 s() {
        return m2.f(c(), m2.INSTANCE.b()) ? TimePickerKt.j : TimePickerKt.k;
    }

    public final float t() {
        return this.anim.m().floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float u() {
        return ((ff3) this.currentDiameter.getValue()).getValue();
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final j7d getState() {
        return this.state;
    }

    public final Object z(kr<Float> krVar, q22<? super Unit> q22Var) {
        Object objD = this.mutex.d(MutatePriority.PreventUserInput, new AnalogTimePickerState$onGestureEnd$2(this, r(m2.f(c(), m2.INSTANCE.a()) ? this.hourAngle : this.minuteAngle), krVar, null), q22Var);
        return objD == a.g() ? objD : Unit.a;
    }
}
