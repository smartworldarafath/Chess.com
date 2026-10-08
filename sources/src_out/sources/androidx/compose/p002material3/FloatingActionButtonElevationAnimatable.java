package androidx.compose.p002material3;

import androidx.compose.p000animation.core.Animatable;
import androidx.compose.p001foundation.interaction.a;
import com.google.android.q22;
import com.google.inputmethod.eo3;
import com.google.inputmethod.ff3;
import com.google.inputmethod.i26;
import com.google.inputmethod.lk4;
import com.google.inputmethod.q6c;
import com.google.inputmethod.qr;
import com.google.inputmethod.t04;
import com.google.inputmethod.w2e;
import com.google.inputmethod.yf5;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.f;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u0002*\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ0\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0004\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0018R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001bR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001dR\u0018\u0010 \u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001d¨\u0006!"}, d2 = {"Landroidx/compose/material3/FloatingActionButtonElevationAnimatable;", "", "Lcom/google/android/ff3;", "defaultElevation", "pressedElevation", "hoveredElevation", "focusedElevation", "<init>", "(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lcom/google/android/i26;", "d", "(Lcom/google/android/i26;)F", "", "e", "(Lcom/google/android/q22;)Ljava/lang/Object;", "f", "(FFFFLcom/google/android/q22;)Ljava/lang/Object;", "to", "b", "(Lcom/google/android/i26;Lcom/google/android/q22;)Ljava/lang/Object;", "Lcom/google/android/q6c;", "c", "()Lcom/google/android/q6c;", "a", "F", "Landroidx/compose/animation/core/Animatable;", "Lcom/google/android/qr;", "Landroidx/compose/animation/core/Animatable;", "animatable", "Lcom/google/android/i26;", "lastTargetInteraction", "g", "targetInteraction", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class FloatingActionButtonElevationAnimatable {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private float defaultElevation;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private float pressedElevation;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private float hoveredElevation;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private float focusedElevation;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Animatable<ff3, qr> animatable;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private i26 lastTargetInteraction;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private i26 targetInteraction;

    public /* synthetic */ FloatingActionButtonElevationAnimatable(float f, float f2, float f3, float f4, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4);
    }

    private final float d(i26 i26Var) {
        if (i26Var instanceof a.b) {
            return this.pressedElevation;
        }
        if (i26Var instanceof yf5) {
            return this.hoveredElevation;
        }
        return i26Var instanceof lk4 ? this.focusedElevation : this.defaultElevation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(q22<? super Unit> q22Var) {
        FloatingActionButtonElevationAnimatable$snapElevation$1 floatingActionButtonElevationAnimatable$snapElevation$1;
        if (q22Var instanceof FloatingActionButtonElevationAnimatable$snapElevation$1) {
            floatingActionButtonElevationAnimatable$snapElevation$1 = (FloatingActionButtonElevationAnimatable$snapElevation$1) q22Var;
            int i = floatingActionButtonElevationAnimatable$snapElevation$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                floatingActionButtonElevationAnimatable$snapElevation$1.label = i - t04.INVALID_ID;
            } else {
                floatingActionButtonElevationAnimatable$snapElevation$1 = new FloatingActionButtonElevationAnimatable$snapElevation$1(this, q22Var);
            }
        } else {
            floatingActionButtonElevationAnimatable$snapElevation$1 = new FloatingActionButtonElevationAnimatable$snapElevation$1(this, q22Var);
        }
        Object obj = floatingActionButtonElevationAnimatable$snapElevation$1.result;
        Object objG = kotlin.coroutines.intrinsics.a.g();
        int i2 = floatingActionButtonElevationAnimatable$snapElevation$1.label;
        try {
            if (i2 == 0) {
                f.b(obj);
                float fD = d(this.targetInteraction);
                if (!ff3.k(this.animatable.k().getValue(), fD)) {
                    Animatable<ff3, qr> animatable = this.animatable;
                    ff3 ff3VarE = ff3.e(fD);
                    floatingActionButtonElevationAnimatable$snapElevation$1.label = 1;
                    if (animatable.t(ff3VarE, floatingActionButtonElevationAnimatable$snapElevation$1) == objG) {
                        return objG;
                    }
                }
                return Unit.a;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            this.lastTargetInteraction = this.targetInteraction;
            return Unit.a;
        } catch (Throwable th) {
            this.lastTargetInteraction = this.targetInteraction;
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(i26 i26Var, q22<? super Unit> q22Var) {
        FloatingActionButtonElevationAnimatable$animateElevation$1 floatingActionButtonElevationAnimatable$animateElevation$1;
        if (q22Var instanceof FloatingActionButtonElevationAnimatable$animateElevation$1) {
            floatingActionButtonElevationAnimatable$animateElevation$1 = (FloatingActionButtonElevationAnimatable$animateElevation$1) q22Var;
            int i = floatingActionButtonElevationAnimatable$animateElevation$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                floatingActionButtonElevationAnimatable$animateElevation$1.label = i - t04.INVALID_ID;
            } else {
                floatingActionButtonElevationAnimatable$animateElevation$1 = new FloatingActionButtonElevationAnimatable$animateElevation$1(this, q22Var);
            }
        } else {
            floatingActionButtonElevationAnimatable$animateElevation$1 = new FloatingActionButtonElevationAnimatable$animateElevation$1(this, q22Var);
        }
        Object obj = floatingActionButtonElevationAnimatable$animateElevation$1.result;
        Object objG = kotlin.coroutines.intrinsics.a.g();
        int i2 = floatingActionButtonElevationAnimatable$animateElevation$1.label;
        try {
            if (i2 == 0) {
                f.b(obj);
                float fD = d(i26Var);
                this.targetInteraction = i26Var;
                if (!ff3.k(this.animatable.k().getValue(), fD)) {
                    Animatable<ff3, qr> animatable = this.animatable;
                    i26 i26Var2 = this.lastTargetInteraction;
                    floatingActionButtonElevationAnimatable$animateElevation$1.L$0 = i26Var;
                    floatingActionButtonElevationAnimatable$animateElevation$1.label = 1;
                    if (eo3.d(animatable, fD, i26Var2, i26Var, floatingActionButtonElevationAnimatable$animateElevation$1) == objG) {
                        return objG;
                    }
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i26Var = (i26) floatingActionButtonElevationAnimatable$animateElevation$1.L$0;
                f.b(obj);
            }
            this.lastTargetInteraction = i26Var;
            i26Var = Unit.a;
            return i26Var;
        } catch (Throwable th) {
            this.lastTargetInteraction = i26Var;
            throw th;
        }
    }

    public final q6c<ff3> c() {
        return this.animatable.g();
    }

    public final Object f(float f, float f2, float f3, float f4, q22<? super Unit> q22Var) {
        this.defaultElevation = f;
        this.pressedElevation = f2;
        this.hoveredElevation = f3;
        this.focusedElevation = f4;
        Object objE = e(q22Var);
        return objE == kotlin.coroutines.intrinsics.a.g() ? objE : Unit.a;
    }

    private FloatingActionButtonElevationAnimatable(float f, float f2, float f3, float f4) {
        this.defaultElevation = f;
        this.pressedElevation = f2;
        this.hoveredElevation = f3;
        this.focusedElevation = f4;
        this.animatable = new Animatable<>(ff3.e(this.defaultElevation), w2e.L(ff3.INSTANCE), null, null, 12, null);
    }
}
