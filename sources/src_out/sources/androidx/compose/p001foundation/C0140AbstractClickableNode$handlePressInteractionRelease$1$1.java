package androidx.compose.p001foundation;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.inputmethod.r48;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.s;

/* JADX INFO: renamed from: androidx.compose.foundation.AbstractClickableNode$handlePressInteractionRelease$1$1, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteractionRelease$1$1", f = "Clickable.kt", l = {2157, 2162, 2163}, m = "invokeSuspend", v = 1)
final class C0140AbstractClickableNode$handlePressInteractionRelease$1$1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    final /* synthetic */ r48 $interactionSource;
    final /* synthetic */ s $job;
    final /* synthetic */ long $offset;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0140AbstractClickableNode$handlePressInteractionRelease$1$1(s sVar, long j, r48 r48Var, q22<? super C0140AbstractClickableNode$handlePressInteractionRelease$1$1> q22Var) {
        super(2, q22Var);
        this.$job = sVar;
        this.$offset = j;
        this.$interactionSource = r48Var;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new C0140AbstractClickableNode$handlePressInteractionRelease$1$1(this.$job, this.$offset, this.$interactionSource, q22Var);
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        if (r8.a(r1, r7) == r0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.g()
            int r1 = r7.label
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L2a
            if (r1 == r5) goto L26
            if (r1 == r4) goto L1e
            if (r1 != r3) goto L16
            kotlin.f.b(r8)
            goto L5e
        L16:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1e:
            java.lang.Object r1 = r7.L$0
            androidx.compose.foundation.interaction.a$c r1 = (androidx.compose.foundation.interaction.a.c) r1
            kotlin.f.b(r8)
            goto L51
        L26:
            kotlin.f.b(r8)
            goto L38
        L2a:
            kotlin.f.b(r8)
            kotlinx.coroutines.s r8 = r7.$job
            r7.label = r5
            java.lang.Object r8 = r8.f1(r7)
            if (r8 != r0) goto L38
            goto L5d
        L38:
            androidx.compose.foundation.interaction.a$b r8 = new androidx.compose.foundation.interaction.a$b
            long r5 = r7.$offset
            r8.<init>(r5, r2)
            androidx.compose.foundation.interaction.a$c r1 = new androidx.compose.foundation.interaction.a$c
            r1.<init>(r8)
            com.google.android.r48 r5 = r7.$interactionSource
            r7.L$0 = r1
            r7.label = r4
            java.lang.Object r8 = r5.a(r8, r7)
            if (r8 != r0) goto L51
            goto L5d
        L51:
            com.google.android.r48 r8 = r7.$interactionSource
            r7.L$0 = r2
            r7.label = r3
            java.lang.Object r8 = r8.a(r1, r7)
            if (r8 != r0) goto L5e
        L5d:
            return r0
        L5e:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p001foundation.C0140AbstractClickableNode$handlePressInteractionRelease$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
