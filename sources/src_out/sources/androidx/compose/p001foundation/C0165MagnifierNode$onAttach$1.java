package androidx.compose.p001foundation;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: androidx.compose.foundation.MagnifierNode$onAttach$1, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.MagnifierNode$onAttach$1", f = "Magnifier.android.kt", l = {382, 386}, m = "invokeSuspend", v = 1)
final class C0165MagnifierNode$onAttach$1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    int label;
    final /* synthetic */ MagnifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0165MagnifierNode$onAttach$1(MagnifierNode magnifierNode, q22<? super C0165MagnifierNode$onAttach$1> q22Var) {
        super(2, q22Var);
        this.this$0 = magnifierNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(long j) {
        return Unit.a;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new C0165MagnifierNode$onAttach$1(this.this$0, q22Var);
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021  */
    /* JADX WARN: Code duplicated, block: B:13:0x0029  */
    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    /* JADX WARN: Code duplicated, block: B:18:0x003a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0038 -> B:11:0x0021). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0045 -> B:21:0x0048). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.g()
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.f.b(r5)
            goto L48
        L12:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1a:
            kotlin.f.b(r5)
            goto L32
        L1e:
            kotlin.f.b(r5)
        L21:
            androidx.compose.foundation.MagnifierNode r5 = r4.this$0
            com.google.android.h81 r5 = androidx.compose.p001foundation.MagnifierNode.p3(r5)
            if (r5 == 0) goto L32
            r4.label = r3
            java.lang.Object r5 = r5.c(r4)
            if (r5 != r0) goto L32
            goto L47
        L32:
            androidx.compose.foundation.MagnifierNode r5 = r4.this$0
            com.google.android.gb9 r5 = androidx.compose.p001foundation.MagnifierNode.q3(r5)
            if (r5 == 0) goto L21
            androidx.compose.foundation.s r5 = new androidx.compose.foundation.s
            r5.<init>()
            r4.label = r2
            java.lang.Object r5 = androidx.compose.p004runtime.w.b(r5, r4)
            if (r5 != r0) goto L48
        L47:
            return r0
        L48:
            androidx.compose.foundation.MagnifierNode r5 = r4.this$0
            com.google.android.gb9 r5 = androidx.compose.p001foundation.MagnifierNode.q3(r5)
            if (r5 == 0) goto L21
            r5.c()
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p001foundation.C0165MagnifierNode$onAttach$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
