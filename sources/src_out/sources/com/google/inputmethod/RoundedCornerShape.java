package com.google.inputmethod;

import androidx.compose.ui.graphics.n;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.google.android.kqa, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ?\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/google/android/kqa;", "Lcom/google/android/z92;", "Lcom/google/android/ea2;", "topStart", "topEnd", "bottomEnd", "bottomStart", "<init>", "(Lcom/google/android/ea2;Lcom/google/android/ea2;Lcom/google/android/ea2;Lcom/google/android/ea2;)V", "Lcom/google/android/tsb;", "size", "", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/graphics/n;", "c", "(JFFFFLandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/graphics/n;", "h", "(Lcom/google/android/ea2;Lcom/google/android/ea2;Lcom/google/android/ea2;Lcom/google/android/ea2;)Lcom/google/android/kqa;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RoundedCornerShape extends z92 {
    public RoundedCornerShape(ea2 ea2Var, ea2 ea2Var2, ea2 ea2Var3, ea2 ea2Var4) {
        super(ea2Var, ea2Var2, ea2Var3, ea2Var4);
    }

    @Override // com.google.inputmethod.z92
    public n c(long size, float topStart, float topEnd, float bottomEnd, float bottomStart, LayoutDirection layoutDirection) {
        if (topStart + topEnd + bottomEnd + bottomStart == 0.0f) {
            return new n.b(atb.c(size));
        }
        gba gbaVarC = atb.c(size);
        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
        float f = layoutDirection == layoutDirection2 ? topStart : topEnd;
        long jB = aa2.b((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
        float f2 = layoutDirection == layoutDirection2 ? topEnd : topStart;
        long jB2 = aa2.b((((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (((long) Float.floatToRawIntBits(f2)) << 32));
        float f3 = layoutDirection == layoutDirection2 ? bottomEnd : bottomStart;
        long jB3 = aa2.b((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L));
        float f4 = layoutDirection == layoutDirection2 ? bottomStart : bottomEnd;
        return new n.c(eqa.c(gbaVarC, jB, jB2, jB3, aa2.b((((long) Float.floatToRawIntBits(f4)) & 4294967295L) | (((long) Float.floatToRawIntBits(f4)) << 32))));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoundedCornerShape)) {
            return false;
        }
        RoundedCornerShape roundedCornerShape = (RoundedCornerShape) other;
        return Intrinsics.e(getTopStart(), roundedCornerShape.getTopStart()) && Intrinsics.e(getTopEnd(), roundedCornerShape.getTopEnd()) && Intrinsics.e(getBottomEnd(), roundedCornerShape.getBottomEnd()) && Intrinsics.e(getBottomStart(), roundedCornerShape.getBottomStart());
    }

    @Override // com.google.inputmethod.z92
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public RoundedCornerShape a(ea2 topStart, ea2 topEnd, ea2 bottomEnd, ea2 bottomStart) {
        return new RoundedCornerShape(topStart, topEnd, bottomEnd, bottomStart);
    }

    public int hashCode() {
        return (((((getTopStart().hashCode() * 31) + getTopEnd().hashCode()) * 31) + getBottomEnd().hashCode()) * 31) + getBottomStart().hashCode();
    }

    public String toString() {
        return "RoundedCornerShape(topStart = " + getTopStart() + ", topEnd = " + getTopEnd() + ", bottomEnd = " + getBottomEnd() + ", bottomStart = " + getBottomStart() + ')';
    }
}
