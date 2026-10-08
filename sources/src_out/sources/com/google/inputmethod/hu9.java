package com.google.inputmethod;

import androidx.compose.p000animation.core.Animatable;
import com.google.android.q22;
import com.google.android.ut0;
import com.google.android.yg4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u0000 \f2\u00020\u0001:\u0001\u0010B\u001d\b\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/google/android/hu9;", "Lcom/google/android/eu9;", "Landroidx/compose/animation/core/Animatable;", "", "Lcom/google/android/qr;", "anim", "<init>", "(Landroidx/compose/animation/core/Animatable;)V", "()V", "", "c", "(Lcom/google/android/q22;)Ljava/lang/Object;", "b", "targetValue", "d", "(FLcom/google/android/q22;)Ljava/lang/Object;", "a", "Landroidx/compose/animation/core/Animatable;", "()F", "distanceFraction", "", "e", "()Z", "isAnimating", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class hu9 implements eu9 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final k0b<hu9, Float> c = n0b.e(new Function2() { // from class: com.google.android.fu9
        public final Object invoke(Object obj, Object obj2) {
            return hu9.h((o0b) obj, (hu9) obj2);
        }
    }, new Function1() { // from class: com.google.android.gu9
        public final Object invoke(Object obj) {
            return hu9.i(((Float) obj).floatValue());
        }
    });

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Animatable<Float, qr> anim;

    /* JADX INFO: renamed from: com.google.android.hu9$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/google/android/hu9$a;", "", "<init>", "()V", "Lcom/google/android/k0b;", "Lcom/google/android/hu9;", "", "Saver", "Lcom/google/android/k0b;", "a", "()Lcom/google/android/k0b;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k0b<hu9, Float> a() {
            return hu9.c;
        }

        private Companion() {
        }
    }

    private hu9(Animatable<Float, qr> animatable) {
        this.anim = animatable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Float h(o0b o0bVar, hu9 hu9Var) {
        return hu9Var.anim.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hu9 i(float f) {
        return new hu9(new Animatable(Float.valueOf(f), w2e.N(yg4.a), null, null, 12, null));
    }

    @Override // com.google.inputmethod.eu9
    public float a() {
        return this.anim.m().floatValue();
    }

    @Override // com.google.inputmethod.eu9
    public Object b(q22<? super Unit> q22Var) {
        Object objF = Animatable.f(this.anim, ut0.d(0.0f), null, null, null, q22Var, 14, null);
        return objF == a.g() ? objF : Unit.a;
    }

    @Override // com.google.inputmethod.eu9
    public Object c(q22<? super Unit> q22Var) {
        Object objF = Animatable.f(this.anim, ut0.d(1.0f), null, null, null, q22Var, 14, null);
        return objF == a.g() ? objF : Unit.a;
    }

    @Override // com.google.inputmethod.eu9
    public Object d(float f, q22<? super Unit> q22Var) {
        Object objT = this.anim.t(ut0.d(f), q22Var);
        return objT == a.g() ? objT : Unit.a;
    }

    @Override // com.google.inputmethod.eu9
    public boolean e() {
        return this.anim.p();
    }

    public hu9() {
        this(new Animatable(Float.valueOf(0.0f), w2e.N(yg4.a), null, null, 12, null));
    }
}
