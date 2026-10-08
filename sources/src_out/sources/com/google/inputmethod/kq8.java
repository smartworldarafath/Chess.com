package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a;\u0010\t\u001a\u00020\u0006*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/google/android/jq8;", "Lcom/google/android/n17;", "owner", "", "enabled", "Lkotlin/Function1;", "Lcom/google/android/eq8;", "", "onBackPressed", "a", "(Lcom/google/android/jq8;Lcom/google/android/n17;ZLkotlin/jvm/functions/Function1;)Lcom/google/android/eq8;", "activity"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class kq8 {

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/google/android/kq8$a", "Lcom/google/android/eq8;", "", "handleOnBackPressed", "()V", "activity"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends eq8 {
        final /* synthetic */ Function1<eq8, Unit> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(boolean z, Function1<? super eq8, Unit> function1) {
            super(z);
            this.a = function1;
        }

        @Override // com.google.inputmethod.eq8
        public void handleOnBackPressed() {
            this.a.invoke(this);
        }
    }

    public static final eq8 a(jq8 jq8Var, n17 n17Var, boolean z, Function1<? super eq8, Unit> function1) {
        Intrinsics.checkNotNullParameter(jq8Var, "<this>");
        Intrinsics.checkNotNullParameter(function1, "onBackPressed");
        a aVar = new a(z, function1);
        if (n17Var != null) {
            jq8Var.f(n17Var, aVar);
            return aVar;
        }
        jq8Var.g(aVar);
        return aVar;
    }

    public static /* synthetic */ eq8 b(jq8 jq8Var, n17 n17Var, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            n17Var = null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return a(jq8Var, n17Var, z, function1);
    }
}
