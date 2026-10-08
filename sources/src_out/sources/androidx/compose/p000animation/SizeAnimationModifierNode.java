package androidx.compose.p000animation;

import androidx.compose.p000animation.core.Animatable;
import androidx.compose.p004runtime.s0;
import androidx.compose.ui.layout.j;
import androidx.compose.ui.layout.o;
import com.google.android.rw0;
import com.google.inputmethod.co6;
import com.google.inputmethod.dj7;
import com.google.inputmethod.fj7;
import com.google.inputmethod.kr;
import com.google.inputmethod.nx1;
import com.google.inputmethod.o58;
import com.google.inputmethod.q16;
import com.google.inputmethod.rr;
import com.google.inputmethod.tc;
import com.google.inputmethod.w2e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001:\u0001CB=\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u001c\b\u0002\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J#\u0010\u0018\u001a\u00020\u0017*\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0003¢\u0006\u0004\b\u001b\u0010\u000fR(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R6\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0016\u00100\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R$\u00105\u001a\u00020\f2\u0006\u00101\u001a\u00020\f8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b2\u0010/\"\u0004\b3\u00104R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R/\u0010B\u001a\u0004\u0018\u00010:2\b\u0010;\u001a\u0004\u0018\u00010:8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010A¨\u0006D"}, d2 = {"Landroidx/compose/animation/SizeAnimationModifierNode;", "Lcom/google/android/co6;", "Lcom/google/android/kr;", "Lcom/google/android/q16;", "animationSpec", "Lcom/google/android/tc;", "alignment", "Lkotlin/Function2;", "", "listener", "<init>", "(Lcom/google/android/kr;Lcom/google/android/tc;Lkotlin/jvm/functions/Function2;)V", "Lcom/google/android/kx1;", "default", "w3", "(J)J", "X2", "()V", "V2", "Landroidx/compose/ui/layout/j;", "Lcom/google/android/dj7;", "measurable", "constraints", "Lcom/google/android/fj7;", "b", "(Landroidx/compose/ui/layout/j;Lcom/google/android/dj7;J)Lcom/google/android/fj7;", "targetSize", "m3", "q", "Lcom/google/android/kr;", "p3", "()Lcom/google/android/kr;", "t3", "(Lcom/google/android/kr;)V", "r", "Lcom/google/android/tc;", "n3", "()Lcom/google/android/tc;", "r3", "(Lcom/google/android/tc;)V", "s", "Lkotlin/jvm/functions/Function2;", "q3", "()Lkotlin/jvm/functions/Function2;", "u3", "(Lkotlin/jvm/functions/Function2;)V", "t", "J", "lookaheadSize", "value", "u", "v3", "(J)V", "lookaheadConstraints", "", "v", "Z", "lookaheadConstraintsAvailable", "Landroidx/compose/animation/SizeAnimationModifierNode$a;", "<set-?>", "w", "Lcom/google/android/o58;", "o3", "()Landroidx/compose/animation/SizeAnimationModifierNode$a;", "s3", "(Landroidx/compose/animation/SizeAnimationModifierNode$a;)V", "animData", "a", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class SizeAnimationModifierNode extends co6 {

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private kr<q16> animationSpec;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private tc alignment;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private Function2<? super q16, ? super q16, Unit> listener;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private boolean lookaheadConstraintsAvailable;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private long lookaheadSize = b.c();

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private long lookaheadConstraints = nx1.b(0, 0, 0, 0, 15, null);

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final o58 animData = s0.e(null, null, 2, null);

    /* JADX INFO: renamed from: androidx.compose.animation.SizeAnimationModifierNode$a, reason: from toString */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\"\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/compose/animation/SizeAnimationModifierNode$a;", "", "Landroidx/compose/animation/core/Animatable;", "Lcom/google/android/q16;", "Lcom/google/android/rr;", "anim", "startSize", "<init>", "(Landroidx/compose/animation/core/Animatable;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/animation/core/Animatable;", "()Landroidx/compose/animation/core/Animatable;", "b", "J", "()J", "c", "(J)V", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AnimData {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        private final Animatable<q16, rr> anim;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        private long startSize;

        public /* synthetic */ AnimData(Animatable animatable, long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(animatable, j);
        }

        public final Animatable<q16, rr> a() {
            return this.anim;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getStartSize() {
            return this.startSize;
        }

        public final void c(long j) {
            this.startSize = j;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AnimData)) {
                return false;
            }
            AnimData animData = (AnimData) other;
            return Intrinsics.e(this.anim, animData.anim) && q16.f(this.startSize, animData.startSize);
        }

        public int hashCode() {
            return (this.anim.hashCode() * 31) + q16.i(this.startSize);
        }

        public String toString() {
            return "AnimData(anim=" + this.anim + ", startSize=" + ((Object) q16.j(this.startSize)) + ')';
        }

        private AnimData(Animatable<q16, rr> animatable, long j) {
            this.anim = animatable;
            this.startSize = j;
        }
    }

    public SizeAnimationModifierNode(kr<q16> krVar, tc tcVar, Function2<? super q16, ? super q16, Unit> function2) {
        this.animationSpec = krVar;
        this.alignment = tcVar;
        this.listener = function2;
    }

    private final void v3(long j) {
        this.lookaheadConstraints = j;
        this.lookaheadConstraintsAvailable = true;
    }

    private final long w3(long j) {
        return this.lookaheadConstraintsAvailable ? this.lookaheadConstraints : j;
    }

    @Override // androidx.compose.ui.b.c
    public void V2() {
        super.V2();
        this.lookaheadSize = b.c();
        this.lookaheadConstraintsAvailable = false;
    }

    @Override // androidx.compose.ui.b.c
    public void X2() {
        super.X2();
        s3(null);
    }

    @Override // androidx.compose.ui.node.c
    public fj7 b(final j jVar, dj7 dj7Var, long j) {
        o oVarR0;
        long jD;
        if (jVar.G1()) {
            v3(j);
            oVarR0 = dj7Var.r0(j);
        } else {
            oVarR0 = dj7Var.r0(w3(j));
        }
        final o oVar = oVarR0;
        final long jC = q16.c((((long) oVar.getWidth()) << 32) | (((long) oVar.getHeight()) & 4294967295L));
        if (jVar.G1()) {
            this.lookaheadSize = jC;
            jD = jC;
        } else {
            jD = nx1.d(j, m3(b.d(this.lookaheadSize) ? this.lookaheadSize : jC));
        }
        final int i = (int) (jD >> 32);
        final int i2 = (int) (jD & 4294967295L);
        return j.Q1(jVar, i, i2, null, new Function1<o.a, Unit>() { // from class: androidx.compose.animation.SizeAnimationModifierNode$measure$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((o.a) obj);
                return Unit.a;
            }

            public final void invoke(o.a aVar) {
                o.a.F(aVar, oVar, this.this$0.getAlignment().a(jC, q16.c((((long) i) << 32) | (((long) i2) & 4294967295L)), jVar.getLayoutDirection()), 0.0f, 2, null);
            }
        }, 4, null);
    }

    public final long m3(long targetSize) {
        AnimData animDataO3 = o3();
        if (animDataO3 != null) {
            boolean z = (q16.f(targetSize, animDataO3.a().m().getPackedValue()) || animDataO3.a().p()) ? false : true;
            if (!q16.f(targetSize, animDataO3.a().k().getPackedValue()) || z) {
                animDataO3.c(animDataO3.a().m().getPackedValue());
                rw0.d(L2(), (CoroutineContext) null, (CoroutineStart) null, new C0135SizeAnimationModifierNode$animateTo$data$1$1(animDataO3, targetSize, this, null), 3, (Object) null);
            }
        } else {
            long j = 1;
            animDataO3 = new AnimData(new Animatable(q16.b(targetSize), w2e.Q(q16.INSTANCE), q16.b(q16.c((j & 4294967295L) | (j << 32))), null, 8, null), targetSize, null);
        }
        s3(animDataO3);
        return animDataO3.a().m().getPackedValue();
    }

    /* JADX INFO: renamed from: n3, reason: from getter */
    public final tc getAlignment() {
        return this.alignment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AnimData o3() {
        return (AnimData) this.animData.getValue();
    }

    public final kr<q16> p3() {
        return this.animationSpec;
    }

    public final Function2<q16, q16, Unit> q3() {
        return this.listener;
    }

    public final void r3(tc tcVar) {
        this.alignment = tcVar;
    }

    public final void s3(AnimData animData) {
        this.animData.setValue(animData);
    }

    public final void t3(kr<q16> krVar) {
        this.animationSpec = krVar;
    }

    public final void u3(Function2<? super q16, ? super q16, Unit> function2) {
        this.listener = function2;
    }
}
