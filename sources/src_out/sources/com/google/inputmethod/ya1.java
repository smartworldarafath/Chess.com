package com.google.inputmethod;

import androidx.compose.ui.b;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0005*\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fR.\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/google/android/ya1;", "Landroidx/compose/ui/b$c;", "Lcom/google/android/bfb;", "Lkotlin/Function1;", "Lcom/google/android/nfb;", "", "properties", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "H0", "(Lcom/google/android/nfb;)V", "W2", "()V", "p", "Lkotlin/jvm/functions/Function1;", "getProperties", "()Lkotlin/jvm/functions/Function1;", "q3", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ya1 extends b.c implements bfb {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private Function1<? super nfb, Unit> properties;

    public ya1(Function1<? super nfb, Unit> function1) {
        this.properties = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean o3(nfb nfbVar, fhd fhdVar) {
        Intrinsics.h(fhdVar, "null cannot be cast to non-null type androidx.compose.material3.internal.ParentSemanticsNode");
        ((a29) fhdVar).m3(nfbVar);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p3(fhd fhdVar) {
        Intrinsics.h(fhdVar, "null cannot be cast to non-null type androidx.compose.material3.internal.ParentSemanticsNode");
        ((a29) fhdVar).n3();
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // com.google.inputmethod.bfb
    public void H0(final nfb nfbVar) throws KotlinNothingValueException {
        ghd.c(this, c29.a, new Function1() { // from class: com.google.android.wa1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ya1.o3(nfbVar, (fhd) obj));
            }
        });
        this.properties.invoke(nfbVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.ui.b.c
    public void W2() throws KotlinNothingValueException {
        super.W2();
        ghd.c(this, c29.a, new Function1() { // from class: com.google.android.xa1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ya1.p3((fhd) obj));
            }
        });
    }

    public final void q3(Function1<? super nfb, Unit> function1) {
        this.properties = function1;
    }
}
