package androidx.compose.p002material3;

import androidx.compose.p000animation.core.Animatable;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.inputmethod.ff3;
import com.google.inputmethod.i26;
import com.google.inputmethod.qr;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: androidx.compose.material3.CardElevation$animateElevation$2$1, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 0, 0})
@lq2(c = "androidx.compose.material3.CardElevation$animateElevation$2$1", f = "Card.kt", l = {727, 737}, m = "invokeSuspend")
final class C0168CardElevation$animateElevation$2$1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    final /* synthetic */ Animatable<ff3, qr> $animatable;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ i26 $interaction;
    final /* synthetic */ float $target;
    int label;
    final /* synthetic */ CardElevation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0168CardElevation$animateElevation$2$1(Animatable<ff3, qr> animatable, float f, boolean z, CardElevation cardElevation, i26 i26Var, q22<? super C0168CardElevation$animateElevation$2$1> q22Var) {
        super(2, q22Var);
        this.$animatable = animatable;
        this.$target = f;
        this.$enabled = z;
        this.this$0 = cardElevation;
        this.$interaction = i26Var;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new C0168CardElevation$animateElevation$2$1(this.$animatable, this.$target, this.$enabled, this.this$0, this.$interaction, q22Var);
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        if (r7.t(r1, r6) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00af, code lost:
    
        if (com.google.inputmethod.eo3.d(r7, r1, r3, r4, r6) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b1, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.g()
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L17
            if (r1 != r2) goto Lf
            goto L17
        Lf:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L17:
            kotlin.f.b(r7)
            goto Lb2
        L1c:
            kotlin.f.b(r7)
            androidx.compose.animation.core.Animatable<com.google.android.ff3, com.google.android.qr> r7 = r6.$animatable
            java.lang.Object r7 = r7.k()
            com.google.android.ff3 r7 = (com.google.inputmethod.ff3) r7
            float r7 = r7.getValue()
            float r1 = r6.$target
            boolean r7 = com.google.inputmethod.ff3.k(r7, r1)
            if (r7 != 0) goto Lb2
            boolean r7 = r6.$enabled
            if (r7 != 0) goto L48
            androidx.compose.animation.core.Animatable<com.google.android.ff3, com.google.android.qr> r7 = r6.$animatable
            float r1 = r6.$target
            com.google.android.ff3 r1 = com.google.inputmethod.ff3.e(r1)
            r6.label = r3
            java.lang.Object r7 = r7.t(r1, r6)
            if (r7 != r0) goto Lb2
            goto Lb1
        L48:
            androidx.compose.animation.core.Animatable<com.google.android.ff3, com.google.android.qr> r7 = r6.$animatable
            java.lang.Object r7 = r7.k()
            com.google.android.ff3 r7 = (com.google.inputmethod.ff3) r7
            float r7 = r7.getValue()
            androidx.compose.material3.CardElevation r1 = r6.this$0
            float r1 = androidx.compose.p002material3.CardElevation.d(r1)
            boolean r1 = com.google.inputmethod.ff3.k(r7, r1)
            r3 = 0
            if (r1 == 0) goto L6e
            androidx.compose.foundation.interaction.a$b r7 = new androidx.compose.foundation.interaction.a$b
            com.google.android.rn8$a r1 = com.google.inputmethod.rn8.INSTANCE
            long r4 = r1.c()
            r7.<init>(r4, r3)
            r3 = r7
            goto La3
        L6e:
            androidx.compose.material3.CardElevation r1 = r6.this$0
            float r1 = androidx.compose.p002material3.CardElevation.c(r1)
            boolean r1 = com.google.inputmethod.ff3.k(r7, r1)
            if (r1 == 0) goto L80
            com.google.android.yf5 r3 = new com.google.android.yf5
            r3.<init>()
            goto La3
        L80:
            androidx.compose.material3.CardElevation r1 = r6.this$0
            float r1 = androidx.compose.p002material3.CardElevation.b(r1)
            boolean r1 = com.google.inputmethod.ff3.k(r7, r1)
            if (r1 == 0) goto L92
            com.google.android.lk4 r3 = new com.google.android.lk4
            r3.<init>()
            goto La3
        L92:
            androidx.compose.material3.CardElevation r1 = r6.this$0
            float r1 = androidx.compose.p002material3.CardElevation.a(r1)
            boolean r7 = com.google.inputmethod.ff3.k(r7, r1)
            if (r7 == 0) goto La3
            com.google.android.zf3 r3 = new com.google.android.zf3
            r3.<init>()
        La3:
            androidx.compose.animation.core.Animatable<com.google.android.ff3, com.google.android.qr> r7 = r6.$animatable
            float r1 = r6.$target
            com.google.android.i26 r4 = r6.$interaction
            r6.label = r2
            java.lang.Object r7 = com.google.inputmethod.eo3.d(r7, r1, r3, r4, r6)
            if (r7 != r0) goto Lb2
        Lb1:
            return r0
        Lb2:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002material3.C0168CardElevation$animateElevation$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
