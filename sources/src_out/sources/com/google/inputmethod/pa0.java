package com.google.inputmethod;

import androidx.compose.ui.autofill.AutofillType;
import com.google.android.r43;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@r43
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001J\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR$\u0010\u0015\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014R%\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/google/android/pa0;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "Landroidx/compose/ui/autofill/AutofillType;", "a", "Ljava/util/List;", "()Ljava/util/List;", "autofillTypes", "Lcom/google/android/gba;", "b", "Lcom/google/android/gba;", "()Lcom/google/android/gba;", "setBoundingBox", "(Lcom/google/android/gba;)V", "boundingBox", "Lkotlin/Function1;", "", "", "c", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "onFill", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class pa0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<AutofillType> autofillTypes;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private gba boundingBox;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Function1<String, Unit> onFill;

    public final List<AutofillType> a() {
        return this.autofillTypes;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final gba getBoundingBox() {
        return this.boundingBox;
    }

    public final Function1<String, Unit> c() {
        return this.onFill;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof pa0)) {
            return false;
        }
        pa0 pa0Var = (pa0) other;
        return Intrinsics.e(this.autofillTypes, pa0Var.autofillTypes) && Intrinsics.e(this.boundingBox, pa0Var.boundingBox) && this.onFill == pa0Var.onFill;
    }

    public int hashCode() {
        int iHashCode = this.autofillTypes.hashCode() * 31;
        gba gbaVar = this.boundingBox;
        int iHashCode2 = (iHashCode + (gbaVar != null ? gbaVar.hashCode() : 0)) * 31;
        Function1<String, Unit> function1 = this.onFill;
        return iHashCode2 + (function1 != null ? function1.hashCode() : 0);
    }
}
