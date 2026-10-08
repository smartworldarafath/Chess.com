package androidx.compose.p002material3;

import androidx.compose.p002material3.p003internal.TextFieldImplKt;
import androidx.compose.ui.layout.j;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.sh7;
import com.google.android.zk1;
import com.google.inputmethod.dj7;
import com.google.inputmethod.ej7;
import com.google.inputmethod.f43;
import com.google.inputmethod.f66;
import com.google.inputmethod.ff3;
import com.google.inputmethod.fj7;
import com.google.inputmethod.g08;
import com.google.inputmethod.g16;
import com.google.inputmethod.h66;
import com.google.inputmethod.hh4;
import com.google.inputmethod.kx1;
import com.google.inputmethod.m47;
import com.google.inputmethod.no6;
import com.google.inputmethod.nx1;
import com.google.inputmethod.pn6;
import com.google.inputmethod.rh7;
import com.google.inputmethod.rx8;
import com.google.inputmethod.tc;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0002\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ?\u0010\u0015\u001a\u00020\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016JC\u0010\u0019\u001a\u00020\u0011*\u00020\u00172\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0018\u001a\u00020\u00112\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJO\u0010$\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%Jk\u00101\u001a\u00020\u0011*\u00020&2\u0006\u0010'\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u00112\u0006\u0010*\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\u00112\u0006\u0010.\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\"2\u0006\u0010/\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u000200H\u0002¢\u0006\u0004\b1\u00102J§\u0001\u0010E\u001a\u00020D*\u0002032\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u00104\u001a\u00020\u00112\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u0002052\b\u00108\u001a\u0004\u0018\u0001052\b\u00109\u001a\u0004\u0018\u0001052\b\u0010:\u001a\u0004\u0018\u0001052\b\u0010;\u001a\u0004\u0018\u0001052\b\u0010<\u001a\u0004\u0018\u0001052\u0006\u0010=\u001a\u0002052\b\u0010>\u001a\u0004\u0018\u0001052\u0006\u0010?\u001a\u00020\u00112\u0006\u0010@\u001a\u00020\u00112\u0006\u0010/\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u0002002\u0006\u0010A\u001a\u00020\u00112\u0006\u0010C\u001a\u00020BH\u0002¢\u0006\u0004\bE\u0010FJw\u0010I\u001a\u00020D*\u0002032\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u00104\u001a\u00020\u00112\u0006\u0010G\u001a\u0002052\b\u00108\u001a\u0004\u0018\u0001052\b\u00109\u001a\u0004\u0018\u0001052\b\u0010:\u001a\u0004\u0018\u0001052\b\u0010;\u001a\u0004\u0018\u0001052\b\u0010<\u001a\u0004\u0018\u0001052\u0006\u0010=\u001a\u0002052\b\u0010>\u001a\u0004\u0018\u0001052\u0006\u0010H\u001a\u000200H\u0002¢\u0006\u0004\bI\u0010JJ)\u0010P\u001a\u00020M*\u00020K2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020L0\u000e2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\bN\u0010OJ)\u0010Q\u001a\u00020\u0011*\u00020\u00172\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0018\u001a\u00020\u0011H\u0016¢\u0006\u0004\bQ\u0010RJ)\u0010S\u001a\u00020\u0011*\u00020\u00172\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0018\u001a\u00020\u0011H\u0016¢\u0006\u0004\bS\u0010RJ)\u0010T\u001a\u00020\u0011*\u00020\u00172\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\bT\u0010RJ)\u0010U\u001a\u00020\u0011*\u00020\u00172\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\bU\u0010RR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_¨\u0006`"}, d2 = {"Landroidx/compose/material3/b2;", "Lcom/google/android/ej7;", "", "singleLine", "Landroidx/compose/material3/v1;", "labelPosition", "Lcom/google/android/hh4;", "labelProgress", "Lcom/google/android/rx8;", "paddingValues", "Lcom/google/android/ff3;", "minimizedLabelHalfHeight", "<init>", "(ZLandroidx/compose/material3/v1;Lcom/google/android/hh4;Lcom/google/android/rx8;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "Lcom/google/android/f66;", "measurables", "", "height", "Lkotlin/Function2;", "intrinsicMeasurer", "k", "(Ljava/util/List;ILkotlin/jvm/functions/Function2;)I", "Lcom/google/android/h66;", "width", "i", "(Lcom/google/android/h66;Ljava/util/List;ILkotlin/jvm/functions/Function2;)I", "leadingWidth", "trailingWidth", "prefixWidth", "suffixWidth", "textFieldWidth", "labelWidth", "placeholderWidth", "Lcom/google/android/kx1;", "constraints", "g", "(IIIIIIIJ)I", "Lcom/google/android/f43;", "textFieldHeight", "labelHeight", "leadingHeight", "trailingHeight", "prefixHeight", "suffixHeight", "placeholderHeight", "supportingHeight", "isLabelAbove", "", "f", "(Lcom/google/android/f43;IIIIIIIIJZF)I", "Landroidx/compose/ui/layout/o$a;", "totalHeight", "Landroidx/compose/ui/layout/o;", "textfieldPlaceable", "labelPlaceable", "placeholderPlaceable", "leadingPlaceable", "trailingPlaceable", "prefixPlaceable", "suffixPlaceable", "containerPlaceable", "supportingPlaceable", "labelStartY", "labelEndY", "textPosition", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "", "s", "(Landroidx/compose/ui/layout/o$a;IILandroidx/compose/ui/layout/o;Landroidx/compose/ui/layout/o;Landroidx/compose/ui/layout/o;Landroidx/compose/ui/layout/o;Landroidx/compose/ui/layout/o;Landroidx/compose/ui/layout/o;Landroidx/compose/ui/layout/o;Landroidx/compose/ui/layout/o;Landroidx/compose/ui/layout/o;IIZFILandroidx/compose/ui/unit/LayoutDirection;)V", "textPlaceable", "density", "t", "(Landroidx/compose/ui/layout/o$a;IILandroidx/compose/ui/layout/o;Landroidx/compose/ui/layout/o;Landroidx/compose/ui/layout/o;Landroidx/compose/ui/layout/o;Landroidx/compose/ui/layout/o;Landroidx/compose/ui/layout/o;Landroidx/compose/ui/layout/o;Landroidx/compose/ui/layout/o;F)V", "Landroidx/compose/ui/layout/j;", "Lcom/google/android/dj7;", "Lcom/google/android/fj7;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/j;Ljava/util/List;J)Lcom/google/android/fj7;", "measure", "maxIntrinsicHeight", "(Lcom/google/android/h66;Ljava/util/List;I)I", "minIntrinsicHeight", "maxIntrinsicWidth", "minIntrinsicWidth", "a", "Z", "b", "Landroidx/compose/material3/v1;", "c", "Lcom/google/android/hh4;", "d", "Lcom/google/android/rx8;", "e", "F", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class b2 implements ej7 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean singleLine;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final v1 labelPosition;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final hh4 labelProgress;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final rx8 paddingValues;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final float minimizedLabelHalfHeight;

    public /* synthetic */ b2(boolean z, v1 v1Var, hh4 hh4Var, rx8 rx8Var, float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, v1Var, hh4Var, rx8Var, f);
    }

    private final int f(f43 f43Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, boolean z, float f) {
        int iO1 = f43Var.O1(ff3.i(this.paddingValues.getTop() + this.paddingValues.getBottom())) + ((i2 <= 0 || z) ? 0 : Math.max(f43Var.O1(ff3.i(this.minimizedLabelHalfHeight * 2)), rh7.c(0, i2, g08.a.a().a(f)))) + zk1.l(i, new int[]{i7, i5, i6, z ? 0 : rh7.c(i2, 0, f)});
        if (!z) {
            i2 = 0;
        }
        return nx1.f(j, i2 + Math.max(i3, Math.max(i4, iO1)) + i8);
    }

    private final int g(int leadingWidth, int trailingWidth, int prefixWidth, int suffixWidth, int textFieldWidth, int labelWidth, int placeholderWidth, long constraints) {
        int i = prefixWidth + suffixWidth;
        return nx1.g(constraints, leadingWidth + Math.max(textFieldWidth + i, Math.max(placeholderWidth + i, labelWidth)) + trailingWidth);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final int i(h66 h66Var, List<? extends f66> list, int i, Function2<? super f66, ? super Integer, Integer> function2) throws KotlinNothingValueException {
        f66 f66Var;
        int i2;
        int iD;
        int iIntValue;
        f66 f66Var2;
        int iIntValue2;
        f66 f66Var3;
        f66 f66Var4;
        int iIntValue3;
        f66 f66Var5;
        int iIntValue4;
        f66 f66Var6;
        f66 f66Var7;
        int size = list.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                f66Var = null;
                break;
            }
            f66Var = list.get(i3);
            if (Intrinsics.e(no6.b(f66Var), "Leading")) {
                break;
            }
            i3++;
        }
        f66 f66Var8 = f66Var;
        if (f66Var8 != null) {
            i2 = i;
            iD = no6.d(i2, f66Var8.q0(Integer.MAX_VALUE));
            iIntValue = ((Number) function2.invoke(f66Var8, Integer.valueOf(i2))).intValue();
        } else {
            i2 = i;
            iD = i2;
            iIntValue = 0;
        }
        int size2 = list.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size2) {
                f66Var2 = null;
                break;
            }
            f66Var2 = list.get(i4);
            if (Intrinsics.e(no6.b(f66Var2), "Trailing")) {
                break;
            }
            i4++;
        }
        f66 f66Var9 = f66Var2;
        if (f66Var9 != null) {
            iD = no6.d(iD, f66Var9.q0(Integer.MAX_VALUE));
            iIntValue2 = ((Number) function2.invoke(f66Var9, Integer.valueOf(i2))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size3) {
                f66Var3 = null;
                break;
            }
            f66Var3 = list.get(i5);
            if (Intrinsics.e(no6.b(f66Var3), "Label")) {
                break;
            }
            i5++;
        }
        f66 f66Var10 = f66Var3;
        int iIntValue5 = f66Var10 != null ? ((Number) function2.invoke(f66Var10, Integer.valueOf(iD))).intValue() : 0;
        int size4 = list.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size4) {
                f66Var4 = null;
                break;
            }
            f66Var4 = list.get(i6);
            if (Intrinsics.e(no6.b(f66Var4), "Prefix")) {
                break;
            }
            i6++;
        }
        f66 f66Var11 = f66Var4;
        if (f66Var11 != null) {
            iIntValue3 = ((Number) function2.invoke(f66Var11, Integer.valueOf(iD))).intValue();
            iD = no6.d(iD, f66Var11.q0(Integer.MAX_VALUE));
        } else {
            iIntValue3 = 0;
        }
        int size5 = list.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size5) {
                f66Var5 = null;
                break;
            }
            f66Var5 = list.get(i7);
            if (Intrinsics.e(no6.b(f66Var5), "Suffix")) {
                break;
            }
            i7++;
        }
        f66 f66Var12 = f66Var5;
        if (f66Var12 != null) {
            iIntValue4 = ((Number) function2.invoke(f66Var12, Integer.valueOf(iD))).intValue();
            iD = no6.d(iD, f66Var12.q0(Integer.MAX_VALUE));
        } else {
            iIntValue4 = 0;
        }
        int size6 = list.size();
        int i8 = 0;
        while (i8 < size6) {
            f66 f66Var13 = list.get(i8);
            if (Intrinsics.e(no6.b(f66Var13), "TextField")) {
                int iIntValue6 = ((Number) function2.invoke(f66Var13, Integer.valueOf(iD))).intValue();
                int size7 = list.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size7) {
                        f66Var6 = null;
                        break;
                    }
                    f66Var6 = list.get(i9);
                    if (Intrinsics.e(no6.b(f66Var6), "Hint")) {
                        break;
                    }
                    i9++;
                }
                f66 f66Var14 = f66Var6;
                int iIntValue7 = f66Var14 != null ? ((Number) function2.invoke(f66Var14, Integer.valueOf(iD))).intValue() : 0;
                int size8 = list.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size8) {
                        f66Var7 = null;
                        break;
                    }
                    f66 f66Var15 = list.get(i10);
                    if (Intrinsics.e(no6.b(f66Var15), "Supporting")) {
                        f66Var7 = f66Var15;
                        break;
                    }
                    i10++;
                }
                f66 f66Var16 = f66Var7;
                return f(h66Var, iIntValue6, iIntValue5, iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue7, f66Var16 != null ? ((Number) function2.invoke(f66Var16, Integer.valueOf(i2))).intValue() : 0, nx1.b(0, 0, 0, 0, 15, null), this.labelPosition instanceof v1.a, this.labelProgress.invoke());
            }
            i8++;
            iIntValue = iIntValue;
            iIntValue4 = iIntValue4;
        }
        m47.f("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final int k(List<? extends f66> measurables, int height, Function2<? super f66, ? super Integer, Integer> intrinsicMeasurer) throws KotlinNothingValueException {
        f66 f66Var;
        f66 f66Var2;
        f66 f66Var3;
        f66 f66Var4;
        f66 f66Var5;
        f66 f66Var6;
        int size = measurables.size();
        for (int i = 0; i < size; i++) {
            f66 f66Var7 = measurables.get(i);
            if (Intrinsics.e(no6.b(f66Var7), "TextField")) {
                int iIntValue = ((Number) intrinsicMeasurer.invoke(f66Var7, Integer.valueOf(height))).intValue();
                int size2 = measurables.size();
                int i2 = 0;
                while (true) {
                    f66Var = null;
                    if (i2 >= size2) {
                        f66Var2 = null;
                        break;
                    }
                    f66Var2 = measurables.get(i2);
                    if (Intrinsics.e(no6.b(f66Var2), "Label")) {
                        break;
                    }
                    i2++;
                }
                f66 f66Var8 = f66Var2;
                int iIntValue2 = f66Var8 != null ? ((Number) intrinsicMeasurer.invoke(f66Var8, Integer.valueOf(height))).intValue() : 0;
                int size3 = measurables.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size3) {
                        f66Var3 = null;
                        break;
                    }
                    f66Var3 = measurables.get(i3);
                    if (Intrinsics.e(no6.b(f66Var3), "Trailing")) {
                        break;
                    }
                    i3++;
                }
                f66 f66Var9 = f66Var3;
                int iIntValue3 = f66Var9 != null ? ((Number) intrinsicMeasurer.invoke(f66Var9, Integer.valueOf(height))).intValue() : 0;
                int size4 = measurables.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size4) {
                        f66Var4 = null;
                        break;
                    }
                    f66Var4 = measurables.get(i4);
                    if (Intrinsics.e(no6.b(f66Var4), "Prefix")) {
                        break;
                    }
                    i4++;
                }
                f66 f66Var10 = f66Var4;
                int iIntValue4 = f66Var10 != null ? ((Number) intrinsicMeasurer.invoke(f66Var10, Integer.valueOf(height))).intValue() : 0;
                int size5 = measurables.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size5) {
                        f66Var5 = null;
                        break;
                    }
                    f66Var5 = measurables.get(i5);
                    if (Intrinsics.e(no6.b(f66Var5), "Suffix")) {
                        break;
                    }
                    i5++;
                }
                f66 f66Var11 = f66Var5;
                int iIntValue5 = f66Var11 != null ? ((Number) intrinsicMeasurer.invoke(f66Var11, Integer.valueOf(height))).intValue() : 0;
                int size6 = measurables.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size6) {
                        f66Var6 = null;
                        break;
                    }
                    f66Var6 = measurables.get(i6);
                    if (Intrinsics.e(no6.b(f66Var6), "Leading")) {
                        break;
                    }
                    i6++;
                }
                f66 f66Var12 = f66Var6;
                int iIntValue6 = f66Var12 != null ? ((Number) intrinsicMeasurer.invoke(f66Var12, Integer.valueOf(height))).intValue() : 0;
                int size7 = measurables.size();
                for (int i7 = 0; i7 < size7; i7++) {
                    f66 f66Var13 = measurables.get(i7);
                    if (Intrinsics.e(no6.b(f66Var13), "Hint")) {
                        f66Var = f66Var13;
                        break;
                    }
                }
                f66 f66Var14 = f66Var;
                return g(iIntValue6, iIntValue3, iIntValue4, iIntValue5, iIntValue, iIntValue2, f66Var14 != null ? ((Number) intrinsicMeasurer.invoke(f66Var14, Integer.valueOf(height))).intValue() : 0, nx1.b(0, 0, 0, 0, 15, null));
            }
        }
        m47.f("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int l(f66 f66Var, int i) {
        return f66Var.W(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int n(f66 f66Var, int i) {
        return f66Var.q0(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(Ref.ObjectRef objectRef, boolean z, b2 b2Var, int i, int i2, j jVar, int i3, int i4, o oVar, o oVar2, o oVar3, o oVar4, o oVar5, o oVar6, o oVar7, o oVar8, float f, o.a aVar) {
        j jVar2;
        int iO1;
        int i5;
        if (objectRef.element != null) {
            if (z) {
                jVar2 = jVar;
                i5 = 0;
            } else {
                if (b2Var.singleLine) {
                    iO1 = tc.INSTANCE.i().a(((o) objectRef.element).getHeight(), i);
                    jVar2 = jVar;
                } else {
                    jVar2 = jVar;
                    iO1 = i2 + jVar2.O1(b2Var.minimizedLabelHalfHeight);
                }
                i5 = iO1;
            }
            int i6 = z ? 0 : i2;
            Object obj = objectRef.element;
            b2Var.s(aVar, i3, i4, oVar, (o) obj, oVar2, oVar3, oVar4, oVar5, oVar6, oVar7, oVar8, i5, i6, z, f, i2 + (z ? 0 : ((o) obj).getHeight()), jVar2.getLayoutDirection());
        } else {
            b2Var.t(aVar, i3, i4, oVar, oVar2, oVar3, oVar4, oVar5, oVar6, oVar7, oVar8, jVar.getDensity());
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int q(f66 f66Var, int i) {
        return f66Var.d0(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int r(f66 f66Var, int i) {
        return f66Var.o0(i);
    }

    private final void s(o.a aVar, int i, int i2, o oVar, o oVar2, o oVar3, o oVar4, o oVar5, o oVar6, o oVar7, o oVar8, o oVar9, int i3, int i4, boolean z, float f, int i5, LayoutDirection layoutDirection) {
        int height = z ? oVar2.getHeight() : 0;
        o.a.z(aVar, oVar8, 0, height, 0.0f, 4, null);
        int iA = (i2 - no6.a(oVar9)) - (z ? oVar2.getHeight() : 0);
        if (oVar4 != null) {
            o.a.L(aVar, oVar4, 0, height + tc.INSTANCE.i().a(oVar4.getHeight(), iA), 0.0f, 4, null);
        }
        int iC = rh7.c(i3, i4, f);
        if (z) {
            o.a.z(aVar, oVar2, TextFieldImplKt.H(this.labelPosition).a(oVar2.getWidth(), i, layoutDirection), iC, 0.0f, 4, null);
        } else {
            int iC2 = layoutDirection == LayoutDirection.Ltr ? no6.c(oVar4) : no6.c(oVar5);
            o.a.z(aVar, oVar2, rh7.c(TextFieldImplKt.D(this.labelPosition).a(oVar2.getWidth(), (i - no6.c(oVar4)) - no6.c(oVar5), layoutDirection) + iC2, TextFieldImplKt.H(this.labelPosition).a(oVar2.getWidth(), (i - no6.c(oVar4)) - no6.c(oVar5), layoutDirection) + iC2, f), iC, 0.0f, 4, null);
        }
        if (oVar6 != null) {
            o.a.L(aVar, oVar6, no6.c(oVar4), height + i5, 0.0f, 4, null);
        }
        int iC3 = no6.c(oVar4) + no6.c(oVar6);
        int i6 = height + i5;
        o.a.L(aVar, oVar, iC3, i6, 0.0f, 4, null);
        if (oVar3 != null) {
            o.a.L(aVar, oVar3, iC3, i6, 0.0f, 4, null);
        }
        if (oVar7 != null) {
            o.a.L(aVar, oVar7, (i - no6.c(oVar5)) - oVar7.getWidth(), i6, 0.0f, 4, null);
        }
        if (oVar5 != null) {
            o.a.L(aVar, oVar5, i - oVar5.getWidth(), height + tc.INSTANCE.i().a(oVar5.getHeight(), iA), 0.0f, 4, null);
        }
        if (oVar9 != null) {
            o.a.L(aVar, oVar9, 0, height + iA, 0.0f, 4, null);
        }
    }

    private final void t(o.a aVar, int i, int i2, o oVar, o oVar2, o oVar3, o oVar4, o oVar5, o oVar6, o oVar7, o oVar8, float f) {
        o.a.F(aVar, oVar7, g16.INSTANCE.b(), 0.0f, 2, null);
        int iA = i2 - no6.a(oVar8);
        int iD = sh7.d(this.paddingValues.getTop() * f);
        if (oVar3 != null) {
            o.a.L(aVar, oVar3, 0, tc.INSTANCE.i().a(oVar3.getHeight(), iA), 0.0f, 4, null);
        }
        if (oVar5 != null) {
            o.a.L(aVar, oVar5, no6.c(oVar3), u(this, iA, iD, oVar5), 0.0f, 4, null);
        }
        int iC = no6.c(oVar5) + no6.c(oVar3);
        o.a.L(aVar, oVar, iC, u(this, iA, iD, oVar), 0.0f, 4, null);
        if (oVar2 != null) {
            o.a.L(aVar, oVar2, iC, u(this, iA, iD, oVar2), 0.0f, 4, null);
        }
        if (oVar6 != null) {
            o.a.L(aVar, oVar6, (i - no6.c(oVar4)) - oVar6.getWidth(), u(this, iA, iD, oVar6), 0.0f, 4, null);
        }
        if (oVar4 != null) {
            o.a.L(aVar, oVar4, i - oVar4.getWidth(), tc.INSTANCE.i().a(oVar4.getHeight(), iA), 0.0f, 4, null);
        }
        if (oVar8 != null) {
            o.a.L(aVar, oVar8, 0, iA, 0.0f, 4, null);
        }
    }

    private static final int u(b2 b2Var, int i, int i2, o oVar) {
        return b2Var.singleLine ? tc.INSTANCE.i().a(oVar.getHeight(), i) : i2;
    }

    @Override // com.google.inputmethod.ej7
    public int maxIntrinsicHeight(h66 h66Var, List<? extends f66> list, int i) {
        return i(h66Var, list, i, new Function2() { // from class: androidx.compose.material3.a2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(b2.l((f66) obj, ((Integer) obj2).intValue()));
            }
        });
    }

    @Override // com.google.inputmethod.ej7
    public int maxIntrinsicWidth(h66 h66Var, List<? extends f66> list, int i) {
        return k(list, i, new Function2() { // from class: androidx.compose.material3.x1
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(b2.n((f66) obj, ((Integer) obj2).intValue()));
            }
        });
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // com.google.inputmethod.ej7
    /* JADX INFO: renamed from: measure-3p2s80s */
    public fj7 mo0measure3p2s80s(final j jVar, List<? extends dj7> list, long j) throws KotlinNothingValueException {
        dj7 dj7Var;
        dj7 dj7Var2;
        long j2;
        o oVarR0;
        dj7 dj7Var3;
        dj7 dj7Var4;
        dj7 dj7Var5;
        int iD0;
        int i;
        dj7 dj7Var6;
        dj7 dj7Var7;
        final float fInvoke = this.labelProgress.invoke();
        int iO1 = jVar.O1(this.paddingValues.getTop());
        int iO2 = jVar.O1(this.paddingValues.getBottom());
        long jD = kx1.d(j, 0, 0, 0, 0, 10, null);
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                dj7Var = null;
                break;
            }
            dj7Var = list.get(i2);
            if (Intrinsics.e(pn6.a(dj7Var), "Leading")) {
                break;
            }
            i2++;
        }
        dj7 dj7Var8 = dj7Var;
        o oVarR1 = dj7Var8 != null ? dj7Var8.r0(jD) : null;
        int iC = no6.c(oVarR1);
        int iMax = Math.max(0, no6.a(oVarR1));
        int size2 = list.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size2) {
                dj7Var2 = null;
                break;
            }
            dj7Var2 = list.get(i3);
            if (Intrinsics.e(pn6.a(dj7Var2), "Trailing")) {
                break;
            }
            i3++;
        }
        dj7 dj7Var9 = dj7Var2;
        if (dj7Var9 != null) {
            j2 = jD;
            oVarR0 = dj7Var9.r0(nx1.j(j2, -iC, 0, 2, null));
        } else {
            j2 = jD;
            oVarR0 = null;
        }
        int iC2 = iC + no6.c(oVarR0);
        int iMax2 = Math.max(iMax, no6.a(oVarR0));
        int size3 = list.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size3) {
                dj7Var3 = null;
                break;
            }
            dj7Var3 = list.get(i4);
            if (Intrinsics.e(pn6.a(dj7Var3), "Prefix")) {
                break;
            }
            i4++;
        }
        dj7 dj7Var10 = dj7Var3;
        o oVarR2 = dj7Var10 != null ? dj7Var10.r0(nx1.j(j2, -iC2, 0, 2, null)) : null;
        int iC3 = iC2 + no6.c(oVarR2);
        int iMax3 = Math.max(iMax2, no6.a(oVarR2));
        int size4 = list.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size4) {
                dj7Var4 = null;
                break;
            }
            dj7Var4 = list.get(i5);
            if (Intrinsics.e(pn6.a(dj7Var4), "Suffix")) {
                break;
            }
            i5++;
        }
        dj7 dj7Var11 = dj7Var4;
        o oVarR3 = dj7Var11 != null ? dj7Var11.r0(nx1.j(j2, -iC3, 0, 2, null)) : null;
        int iC4 = iC3 + no6.c(oVarR3);
        int iMax4 = Math.max(iMax3, no6.a(oVarR3));
        final boolean z = this.labelPosition instanceof v1.a;
        int size5 = list.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size5) {
                dj7Var5 = null;
                break;
            }
            dj7Var5 = list.get(i6);
            if (Intrinsics.e(pn6.a(dj7Var5), "Label")) {
                break;
            }
            i6++;
        }
        dj7 dj7Var12 = dj7Var5;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (z) {
            iD0 = dj7Var12 != null ? dj7Var12.d0(kx1.n(j)) : 0;
        } else {
            objectRef.element = dj7Var12 != null ? dj7Var12.r0(nx1.i(j2, -iC4, -iO2)) : null;
            iD0 = 0;
        }
        int size6 = list.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size6) {
                i = iO2;
                dj7Var6 = null;
                break;
            }
            dj7Var6 = list.get(i7);
            i = iO2;
            if (Intrinsics.e(pn6.a(dj7Var6), "Supporting")) {
                break;
            }
            i7++;
            iO2 = i;
        }
        dj7 dj7Var13 = dj7Var6;
        int iD1 = dj7Var13 != null ? dj7Var13.d0(kx1.n(j)) : 0;
        int iA = no6.a((o) objectRef.element) + iD0 + iO1;
        long jI = nx1.i(kx1.d(j, 0, 0, 0, 0, 11, null), -iC4, ((-iA) - i) - iD1);
        int size7 = list.size();
        int i8 = 0;
        while (i8 < size7) {
            dj7 dj7Var14 = list.get(i8);
            int i9 = size7;
            int i10 = iA;
            if (Intrinsics.e(pn6.a(dj7Var14), "TextField")) {
                final o oVarR4 = dj7Var14.r0(jI);
                long jD2 = kx1.d(jI, 0, 0, 0, 0, 14, null);
                int size8 = list.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size8) {
                        dj7Var7 = null;
                        break;
                    }
                    dj7Var7 = list.get(i11);
                    int i12 = size8;
                    if (Intrinsics.e(pn6.a(dj7Var7), "Hint")) {
                        break;
                    }
                    i11++;
                    size8 = i12;
                }
                dj7 dj7Var15 = dj7Var7;
                o oVarR5 = dj7Var15 != null ? dj7Var15.r0(jD2) : null;
                int iMax5 = Math.max(iMax4, Math.max(no6.a(oVarR4), no6.a(oVarR5)) + i10 + i);
                long j3 = j2;
                final int i13 = iO1;
                final Ref.ObjectRef objectRef2 = objectRef;
                final int iG = g(no6.c(oVarR1), no6.c(oVarR0), no6.c(oVarR2), no6.c(oVarR3), oVarR4.getWidth(), no6.c((o) objectRef.element), no6.c(oVarR5), j);
                if (z) {
                    objectRef2.element = dj7Var12 != null ? dj7Var12.r0(kx1.d(j3, 0, iG, 0, iD0, 5, null)) : null;
                }
                final o oVarR6 = dj7Var13 != null ? dj7Var13.r0(kx1.d(nx1.j(j3, 0, -iMax5, 1, null), 0, iG, 0, 0, 9, null)) : null;
                int iA2 = no6.a(oVarR6);
                int iF = f(jVar, oVarR4.getHeight(), no6.a((o) objectRef2.element), no6.a(oVarR1), no6.a(oVarR0), no6.a(oVarR2), no6.a(oVarR3), no6.a(oVarR5), no6.a(oVarR6), j, z, fInvoke);
                final int iA3 = (iF - iA2) - (z ? no6.a((o) objectRef2.element) : 0);
                int size9 = list.size();
                int i14 = 0;
                while (i14 < size9) {
                    dj7 dj7Var16 = list.get(i14);
                    if (Intrinsics.e(pn6.a(dj7Var16), "Container")) {
                        final o oVarR7 = dj7Var16.r0(nx1.a(iG != Integer.MAX_VALUE ? iG : 0, iG, iA3 != Integer.MAX_VALUE ? iA3 : 0, iA3));
                        final int i15 = iF;
                        final o oVar = oVarR1;
                        final o oVar2 = oVarR0;
                        final o oVar3 = oVarR2;
                        final o oVar4 = oVarR3;
                        final o oVar5 = oVarR5;
                        return j.Q1(jVar, iG, i15, null, new Function1() { // from class: androidx.compose.material3.y1
                            public final Object invoke(Object obj) {
                                return b2.p(objectRef2, z, this, iA3, i13, jVar, iG, i15, oVarR4, oVar5, oVar, oVar2, oVar3, oVar4, oVarR7, oVarR6, fInvoke, (o.a) obj);
                            }
                        }, 4, null);
                    }
                    i14++;
                    iF = iF;
                    iA3 = iA3;
                }
                m47.f("Collection contains no element matching the predicate.");
                throw new KotlinNothingValueException();
            }
            i8++;
            objectRef = objectRef;
            size7 = i9;
            iA = i10;
            jI = jI;
            iO1 = iO1;
        }
        m47.f("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    @Override // com.google.inputmethod.ej7
    public int minIntrinsicHeight(h66 h66Var, List<? extends f66> list, int i) {
        return i(h66Var, list, i, new Function2() { // from class: androidx.compose.material3.z1
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(b2.q((f66) obj, ((Integer) obj2).intValue()));
            }
        });
    }

    @Override // com.google.inputmethod.ej7
    public int minIntrinsicWidth(h66 h66Var, List<? extends f66> list, int i) {
        return k(list, i, new Function2() { // from class: androidx.compose.material3.w1
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(b2.r((f66) obj, ((Integer) obj2).intValue()));
            }
        });
    }

    private b2(boolean z, v1 v1Var, hh4 hh4Var, rx8 rx8Var, float f) {
        this.singleLine = z;
        this.labelPosition = v1Var;
        this.labelProgress = hh4Var;
        this.paddingValues = rx8Var;
        this.minimizedLabelHalfHeight = f;
    }
}
