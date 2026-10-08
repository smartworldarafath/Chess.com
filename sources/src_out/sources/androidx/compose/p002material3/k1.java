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
import com.google.inputmethod.h66;
import com.google.inputmethod.hh4;
import com.google.inputmethod.kx1;
import com.google.inputmethod.m47;
import com.google.inputmethod.no6;
import com.google.inputmethod.nx1;
import com.google.inputmethod.nx8;
import com.google.inputmethod.pn6;
import com.google.inputmethod.rh7;
import com.google.inputmethod.rx8;
import com.google.inputmethod.tc;
import com.google.inputmethod.tsb;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0002\u0018\u00002\u00020\u0001BC\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011JC\u0010\u001a\u001a\u00020\u0016*\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJC\u0010\u001d\u001a\u00020\u0016*\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u001c\u001a\u00020\u00162\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001bJ[\u0010)\u001a\u00020\u0016*\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\u00162\u0006\u0010'\u001a\u00020&2\u0006\u0010\u000b\u001a\u00020(H\u0002¢\u0006\u0004\b)\u0010*Jk\u00104\u001a\u00020\u0016*\u00020\u001e2\u0006\u0010+\u001a\u00020\u00162\u0006\u0010,\u001a\u00020\u00162\u0006\u0010-\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\u00162\u0006\u0010/\u001a\u00020\u00162\u0006\u00100\u001a\u00020\u00162\u0006\u00101\u001a\u00020\u00162\u0006\u00102\u001a\u00020\u00162\u0006\u0010'\u001a\u00020&2\u0006\u00103\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020(H\u0002¢\u0006\u0004\b4\u00105J¡\u0001\u0010F\u001a\u00020\u0004*\u0002062\u0006\u00107\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00162\b\u00109\u001a\u0004\u0018\u0001082\b\u0010:\u001a\u0004\u0018\u0001082\b\u0010;\u001a\u0004\u0018\u0001082\b\u0010<\u001a\u0004\u0018\u0001082\u0006\u0010=\u001a\u0002082\b\u0010>\u001a\u0004\u0018\u0001082\b\u0010?\u001a\u0004\u0018\u0001082\u0006\u0010@\u001a\u0002082\b\u0010A\u001a\u0004\u0018\u0001082\u0006\u0010B\u001a\u00020(2\u0006\u0010D\u001a\u00020C2\u0006\u00103\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020(2\u0006\u0010E\u001a\u00020(H\u0002¢\u0006\u0004\bF\u0010GJ)\u0010M\u001a\u00020J*\u00020H2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020I0\u00132\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\bK\u0010LJ)\u0010N\u001a\u00020\u0016*\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u001c\u001a\u00020\u0016H\u0016¢\u0006\u0004\bN\u0010OJ)\u0010P\u001a\u00020\u0016*\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u001c\u001a\u00020\u0016H\u0016¢\u0006\u0004\bP\u0010OJ)\u0010Q\u001a\u00020\u0016*\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\bQ\u0010OJ)\u0010R\u001a\u00020\u0016*\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\bR\u0010OR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010]¨\u0006^"}, d2 = {"Landroidx/compose/material3/k1;", "Lcom/google/android/ej7;", "Lkotlin/Function1;", "Lcom/google/android/tsb;", "", "onLabelMeasured", "", "singleLine", "Landroidx/compose/material3/v1;", "labelPosition", "Lcom/google/android/hh4;", "labelProgress", "Lcom/google/android/rx8;", "paddingValues", "Lcom/google/android/ff3;", "horizontalIconPadding", "<init>", "(Lkotlin/jvm/functions/Function1;ZLandroidx/compose/material3/v1;Lcom/google/android/hh4;Lcom/google/android/rx8;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lcom/google/android/h66;", "", "Lcom/google/android/f66;", "measurables", "", "height", "Lkotlin/Function2;", "intrinsicMeasurer", "k", "(Lcom/google/android/h66;Ljava/util/List;ILkotlin/jvm/functions/Function2;)I", "width", "i", "Lcom/google/android/f43;", "leadingPlaceableWidth", "trailingPlaceableWidth", "prefixPlaceableWidth", "suffixPlaceableWidth", "textFieldPlaceableWidth", "labelPlaceableWidth", "placeholderPlaceableWidth", "Lcom/google/android/kx1;", "constraints", "", "g", "(Lcom/google/android/f43;IIIIIIIJF)I", "leadingHeight", "trailingHeight", "prefixHeight", "suffixHeight", "textFieldHeight", "labelHeight", "placeholderHeight", "supportingHeight", "isLabelAbove", "f", "(Lcom/google/android/f43;IIIIIIIIJZF)I", "Landroidx/compose/ui/layout/o$a;", "totalHeight", "Landroidx/compose/ui/layout/o;", "leadingPlaceable", "trailingPlaceable", "prefixPlaceable", "suffixPlaceable", "textFieldPlaceable", "labelPlaceable", "placeholderPlaceable", "containerPlaceable", "supportingPlaceable", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "iconPadding", "s", "(Landroidx/compose/ui/layout/o$a;IILandroidx/compose/ui/layout/o;Landroidx/compose/ui/layout/o;Landroidx/compose/ui/layout/o;Landroidx/compose/ui/layout/o;Landroidx/compose/ui/layout/o;Landroidx/compose/ui/layout/o;Landroidx/compose/ui/layout/o;Landroidx/compose/ui/layout/o;Landroidx/compose/ui/layout/o;FLandroidx/compose/ui/unit/LayoutDirection;ZFF)V", "Landroidx/compose/ui/layout/j;", "Lcom/google/android/dj7;", "Lcom/google/android/fj7;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/j;Ljava/util/List;J)Lcom/google/android/fj7;", "measure", "maxIntrinsicHeight", "(Lcom/google/android/h66;Ljava/util/List;I)I", "minIntrinsicHeight", "maxIntrinsicWidth", "minIntrinsicWidth", "a", "Lkotlin/jvm/functions/Function1;", "b", "Z", "c", "Landroidx/compose/material3/v1;", "d", "Lcom/google/android/hh4;", "e", "Lcom/google/android/rx8;", "F", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class k1 implements ej7 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Function1<tsb, Unit> onLabelMeasured;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean singleLine;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final v1 labelPosition;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final hh4 labelProgress;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final rx8 paddingValues;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final float horizontalIconPadding;

    public /* synthetic */ k1(Function1 function1, boolean z, v1 v1Var, hh4 hh4Var, rx8 rx8Var, float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, z, v1Var, hh4Var, rx8Var, f);
    }

    private final int f(f43 f43Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, boolean z, float f) {
        int iL = zk1.l(i5, new int[]{i7, i3, i4, z ? 0 : rh7.c(i6, 0, f)});
        float fX2 = f43Var.x2(this.paddingValues.getTop());
        if (!z) {
            fX2 = rh7.b(fX2, Math.max(fX2, i6 / 2.0f), f);
        }
        float fX3 = fX2 + iL + f43Var.x2(this.paddingValues.getBottom());
        if (!z) {
            i6 = 0;
        }
        return nx1.f(j, i6 + Math.max(i, Math.max(i2, sh7.d(fX3))) + i8);
    }

    private final int g(f43 f43Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, float f) {
        int i8 = i3 + i4;
        int iMax = i + Math.max(i5 + i8, Math.max(i7 + i8, rh7.c(i6, 0, f))) + i2;
        rx8 rx8Var = this.paddingValues;
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        return nx1.g(j, Math.max(iMax, sh7.d((i6 + f43Var.x2(ff3.i(rx8Var.b(layoutDirection) + this.paddingValues.c(layoutDirection)))) * f)));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final int i(h66 h66Var, List<? extends f66> list, int i, Function2<? super f66, ? super Integer, Integer> function2) throws KotlinNothingValueException {
        f66 f66Var;
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
        k1 k1Var = this;
        float fInvoke = k1Var.labelProgress.invoke();
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                f66Var = null;
                break;
            }
            f66Var = list.get(i2);
            if (Intrinsics.e(no6.b(f66Var), "Leading")) {
                break;
            }
            i2++;
        }
        f66 f66Var8 = f66Var;
        if (f66Var8 != null) {
            iD = no6.d(i, f66Var8.q0(Integer.MAX_VALUE));
            iIntValue = ((Number) function2.invoke(f66Var8, Integer.valueOf(i))).intValue();
        } else {
            iD = i;
            iIntValue = 0;
        }
        int size2 = list.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size2) {
                f66Var2 = null;
                break;
            }
            f66Var2 = list.get(i3);
            if (Intrinsics.e(no6.b(f66Var2), "Trailing")) {
                break;
            }
            i3++;
        }
        f66 f66Var9 = f66Var2;
        if (f66Var9 != null) {
            iD = no6.d(iD, f66Var9.q0(Integer.MAX_VALUE));
            iIntValue2 = ((Number) function2.invoke(f66Var9, Integer.valueOf(i))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size3) {
                f66Var3 = null;
                break;
            }
            f66Var3 = list.get(i4);
            if (Intrinsics.e(no6.b(f66Var3), "Label")) {
                break;
            }
            i4++;
        }
        f66 f66Var10 = f66Var3;
        int iIntValue5 = f66Var10 != null ? ((Number) function2.invoke(f66Var10, Integer.valueOf(rh7.c(iD, i, fInvoke)))).intValue() : 0;
        int size4 = list.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size4) {
                f66Var4 = null;
                break;
            }
            f66Var4 = list.get(i5);
            if (Intrinsics.e(no6.b(f66Var4), "Prefix")) {
                break;
            }
            i5++;
        }
        f66 f66Var11 = f66Var4;
        if (f66Var11 != null) {
            iIntValue3 = ((Number) function2.invoke(f66Var11, Integer.valueOf(iD))).intValue();
            iD = no6.d(iD, f66Var11.q0(Integer.MAX_VALUE));
        } else {
            iIntValue3 = 0;
        }
        int size5 = list.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size5) {
                f66Var5 = null;
                break;
            }
            f66Var5 = list.get(i6);
            if (Intrinsics.e(no6.b(f66Var5), "Suffix")) {
                break;
            }
            i6++;
        }
        f66 f66Var12 = f66Var5;
        if (f66Var12 != null) {
            iIntValue4 = ((Number) function2.invoke(f66Var12, Integer.valueOf(iD))).intValue();
            iD = no6.d(iD, f66Var12.q0(Integer.MAX_VALUE));
        } else {
            iIntValue4 = 0;
        }
        int size6 = list.size();
        int i7 = 0;
        while (i7 < size6) {
            f66 f66Var13 = list.get(i7);
            if (Intrinsics.e(no6.b(f66Var13), "TextField")) {
                int iIntValue6 = ((Number) function2.invoke(f66Var13, Integer.valueOf(iD))).intValue();
                int size7 = list.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size7) {
                        f66Var6 = null;
                        break;
                    }
                    f66Var6 = list.get(i8);
                    if (Intrinsics.e(no6.b(f66Var6), "Hint")) {
                        break;
                    }
                    i8++;
                }
                f66 f66Var14 = f66Var6;
                int iIntValue7 = f66Var14 != null ? ((Number) function2.invoke(f66Var14, Integer.valueOf(iD))).intValue() : 0;
                int size8 = list.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size8) {
                        f66Var7 = null;
                        break;
                    }
                    f66Var7 = list.get(i9);
                    if (Intrinsics.e(no6.b(f66Var7), "Supporting")) {
                        break;
                    }
                    i9++;
                }
                f66 f66Var15 = f66Var7;
                return k1Var.f(h66Var, iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue6, iIntValue5, iIntValue7, f66Var15 != null ? ((Number) function2.invoke(f66Var15, Integer.valueOf(i))).intValue() : 0, nx1.b(0, 0, 0, 0, 15, null), k1Var.labelPosition instanceof v1.a, fInvoke);
            }
            i7++;
            iIntValue4 = iIntValue4;
            iIntValue3 = iIntValue3;
            iIntValue = iIntValue;
            k1Var = this;
        }
        m47.f("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final int k(h66 h66Var, List<? extends f66> list, int i, Function2<? super f66, ? super Integer, Integer> function2) throws KotlinNothingValueException {
        f66 f66Var;
        f66 f66Var2;
        f66 f66Var3;
        f66 f66Var4;
        f66 f66Var5;
        f66 f66Var6;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            f66 f66Var7 = list.get(i2);
            if (Intrinsics.e(no6.b(f66Var7), "TextField")) {
                int iIntValue = ((Number) function2.invoke(f66Var7, Integer.valueOf(i))).intValue();
                int size2 = list.size();
                int i3 = 0;
                while (true) {
                    f66Var = null;
                    if (i3 >= size2) {
                        f66Var2 = null;
                        break;
                    }
                    f66Var2 = list.get(i3);
                    if (Intrinsics.e(no6.b(f66Var2), "Label")) {
                        break;
                    }
                    i3++;
                }
                f66 f66Var8 = f66Var2;
                int iIntValue2 = f66Var8 != null ? ((Number) function2.invoke(f66Var8, Integer.valueOf(i))).intValue() : 0;
                int size3 = list.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        f66Var3 = null;
                        break;
                    }
                    f66Var3 = list.get(i4);
                    if (Intrinsics.e(no6.b(f66Var3), "Trailing")) {
                        break;
                    }
                    i4++;
                }
                f66 f66Var9 = f66Var3;
                int iIntValue3 = f66Var9 != null ? ((Number) function2.invoke(f66Var9, Integer.valueOf(i))).intValue() : 0;
                int size4 = list.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        f66Var4 = null;
                        break;
                    }
                    f66Var4 = list.get(i5);
                    if (Intrinsics.e(no6.b(f66Var4), "Leading")) {
                        break;
                    }
                    i5++;
                }
                f66 f66Var10 = f66Var4;
                int iIntValue4 = f66Var10 != null ? ((Number) function2.invoke(f66Var10, Integer.valueOf(i))).intValue() : 0;
                int size5 = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size5) {
                        f66Var5 = null;
                        break;
                    }
                    f66Var5 = list.get(i6);
                    if (Intrinsics.e(no6.b(f66Var5), "Prefix")) {
                        break;
                    }
                    i6++;
                }
                f66 f66Var11 = f66Var5;
                int iIntValue5 = f66Var11 != null ? ((Number) function2.invoke(f66Var11, Integer.valueOf(i))).intValue() : 0;
                int size6 = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size6) {
                        f66Var6 = null;
                        break;
                    }
                    f66Var6 = list.get(i7);
                    if (Intrinsics.e(no6.b(f66Var6), "Suffix")) {
                        break;
                    }
                    i7++;
                }
                f66 f66Var12 = f66Var6;
                int iIntValue6 = f66Var12 != null ? ((Number) function2.invoke(f66Var12, Integer.valueOf(i))).intValue() : 0;
                int size7 = list.size();
                for (int i8 = 0; i8 < size7; i8++) {
                    f66 f66Var13 = list.get(i8);
                    if (Intrinsics.e(no6.b(f66Var13), "Hint")) {
                        f66Var = f66Var13;
                        break;
                    }
                }
                f66 f66Var14 = f66Var;
                return g(h66Var, iIntValue4, iIntValue3, iIntValue5, iIntValue6, iIntValue, iIntValue2, f66Var14 != null ? ((Number) function2.invoke(f66Var14, Integer.valueOf(i))).intValue() : 0, nx1.b(0, 0, 0, 0, 15, null), this.labelProgress.invoke());
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
    public static final Unit p(k1 k1Var, int i, int i2, o oVar, o oVar2, o oVar3, o oVar4, o oVar5, Ref.ObjectRef objectRef, o oVar6, o oVar7, o oVar8, j jVar, boolean z, float f, o.a aVar) {
        k1Var.s(aVar, i, i2, oVar, oVar2, oVar3, oVar4, oVar5, (o) objectRef.element, oVar6, oVar7, oVar8, jVar.getDensity(), jVar.getLayoutDirection(), z, f, jVar.x2(k1Var.horizontalIconPadding));
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

    private final void s(o.a aVar, int i, int i2, o oVar, o oVar2, o oVar3, o oVar4, o oVar5, o oVar6, o oVar7, o oVar8, o oVar9, float f, LayoutDirection layoutDirection, boolean z, float f2, float f3) {
        int i3;
        int i4;
        int i5;
        int iA;
        int iA2 = z ? no6.a(oVar6) : 0;
        o.a.z(aVar, oVar8, 0, iA2, 0.0f, 4, null);
        int iA3 = (i - no6.a(oVar9)) - (z ? no6.a(oVar6) : 0);
        int iD = sh7.d(this.paddingValues.getTop() * f);
        if (oVar != null) {
            o.a.L(aVar, oVar, 0, iA2 + tc.INSTANCE.i().a(oVar.getHeight(), iA3), 0.0f, 4, null);
        }
        if (oVar6 != null) {
            if (z) {
                iA = 0;
            } else {
                iA = this.singleLine ? tc.INSTANCE.i().a(oVar6.getHeight(), iA3) : iD;
            }
            int iC = rh7.c(iA, z ? 0 : -(oVar6.getHeight() / 2), f2);
            if (z) {
                o.a.z(aVar, oVar6, TextFieldImplKt.H(this.labelPosition).a(oVar6.getWidth(), i2, layoutDirection), iC, 0.0f, 4, null);
            } else {
                float fK = nx8.k(this.paddingValues, layoutDirection) * f;
                float fJ = nx8.j(this.paddingValues, layoutDirection) * f;
                float width = oVar == null ? fK : oVar.getWidth() + g.d(fK - f3, 0.0f);
                float width2 = oVar2 == null ? fJ : oVar2.getWidth() + g.d(fJ - f3, 0.0f);
                LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
                o.a.z(aVar, oVar6, sh7.d(rh7.b(TextFieldImplKt.D(this.labelPosition).a(oVar6.getWidth(), i2 - sh7.d(width + width2), layoutDirection) + (layoutDirection == layoutDirection2 ? width : width2), TextFieldImplKt.H(this.labelPosition).a(oVar6.getWidth(), i2 - sh7.d(fK + fJ), layoutDirection) + (layoutDirection == layoutDirection2 ? fK : fJ), f2)), iC, 0.0f, 4, null);
            }
        }
        if (oVar3 != null) {
            i3 = iA3;
            i4 = iD;
            i5 = iA2;
            o.a.L(aVar, oVar3, no6.c(oVar), t(i5, this, i3, i4, oVar6, oVar3), 0.0f, 4, null);
        } else {
            i3 = iA3;
            i4 = iD;
            i5 = iA2;
        }
        int iC2 = no6.c(oVar) + no6.c(oVar3);
        o.a.L(aVar, oVar5, iC2, t(i5, this, i3, i4, oVar6, oVar5), 0.0f, 4, null);
        if (oVar7 != null) {
            o.a.L(aVar, oVar7, iC2, t(i5, this, i3, i4, oVar6, oVar7), 0.0f, 4, null);
        }
        if (oVar4 != null) {
            o.a.L(aVar, oVar4, (i2 - no6.c(oVar2)) - oVar4.getWidth(), t(i5, this, i3, i4, oVar6, oVar4), 0.0f, 4, null);
        }
        if (oVar2 != null) {
            o.a.L(aVar, oVar2, i2 - oVar2.getWidth(), i5 + tc.INSTANCE.i().a(oVar2.getHeight(), i3), 0.0f, 4, null);
        }
        if (oVar9 != null) {
            o.a.L(aVar, oVar9, 0, i5 + i3, 0.0f, 4, null);
        }
    }

    private static final int t(int i, k1 k1Var, int i2, int i3, o oVar, o oVar2) {
        if (k1Var.singleLine) {
            i3 = tc.INSTANCE.i().a(oVar2.getHeight(), i2);
        }
        int i4 = i + i3;
        return k1Var.labelPosition instanceof v1.a ? i4 : Math.max(i4, no6.a(oVar) / 2);
    }

    @Override // com.google.inputmethod.ej7
    public int maxIntrinsicHeight(h66 h66Var, List<? extends f66> list, int i) {
        return i(h66Var, list, i, new Function2() { // from class: androidx.compose.material3.i1
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(k1.l((f66) obj, ((Integer) obj2).intValue()));
            }
        });
    }

    @Override // com.google.inputmethod.ej7
    public int maxIntrinsicWidth(h66 h66Var, List<? extends f66> list, int i) {
        return k(h66Var, list, i, new Function2() { // from class: androidx.compose.material3.g1
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(k1.n((f66) obj, ((Integer) obj2).intValue()));
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
        List<? extends dj7> list2;
        dj7 dj7Var6;
        dj7 dj7Var7;
        long j3;
        long jB;
        long jB2;
        final float fInvoke = this.labelProgress.invoke();
        int iO1 = jVar.O1(this.paddingValues.getBottom());
        long jD = kx1.d(j, 0, 0, 0, 0, 10, null);
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                dj7Var = null;
                break;
            }
            dj7Var = list.get(i);
            if (Intrinsics.e(pn6.a(dj7Var), "Leading")) {
                break;
            }
            i++;
        }
        dj7 dj7Var8 = dj7Var;
        o oVarR1 = dj7Var8 != null ? dj7Var8.r0(jD) : null;
        int iC = no6.c(oVarR1);
        int iMax = Math.max(0, no6.a(oVarR1));
        int size2 = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size2) {
                dj7Var2 = null;
                break;
            }
            dj7Var2 = list.get(i2);
            if (Intrinsics.e(pn6.a(dj7Var2), "Trailing")) {
                break;
            }
            i2++;
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
        int i3 = 0;
        while (true) {
            if (i3 >= size3) {
                dj7Var3 = null;
                break;
            }
            dj7Var3 = list.get(i3);
            if (Intrinsics.e(pn6.a(dj7Var3), "Prefix")) {
                break;
            }
            i3++;
        }
        dj7 dj7Var10 = dj7Var3;
        o oVarR2 = dj7Var10 != null ? dj7Var10.r0(nx1.j(j2, -iC2, 0, 2, null)) : null;
        int iC3 = iC2 + no6.c(oVarR2);
        int iMax3 = Math.max(iMax2, no6.a(oVarR2));
        int size4 = list.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size4) {
                dj7Var4 = null;
                break;
            }
            dj7Var4 = list.get(i4);
            if (Intrinsics.e(pn6.a(dj7Var4), "Suffix")) {
                break;
            }
            i4++;
        }
        dj7 dj7Var11 = dj7Var4;
        o oVarR3 = dj7Var11 != null ? dj7Var11.r0(nx1.j(j2, -iC3, 0, 2, null)) : null;
        int iC4 = iC3 + no6.c(oVarR3);
        int iMax4 = Math.max(iMax3, no6.a(oVarR3));
        boolean z = this.labelPosition instanceof v1.a;
        int size5 = list.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size5) {
                dj7Var5 = null;
                break;
            }
            dj7Var5 = list.get(i5);
            if (Intrinsics.e(pn6.a(dj7Var5), "Label")) {
                break;
            }
            i5++;
        }
        dj7 dj7Var12 = dj7Var5;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (z) {
            iD0 = dj7Var12 != null ? dj7Var12.d0(kx1.n(j)) : 0;
        } else {
            int iO2 = jVar.O1(this.paddingValues.b(jVar.getLayoutDirection())) + jVar.O1(this.paddingValues.c(jVar.getLayoutDirection()));
            o oVarR4 = dj7Var12 != null ? dj7Var12.r0(nx1.i(j2, -rh7.c(iC4 + iO2, iO2, fInvoke), -iO1)) : null;
            objectRef.element = oVarR4;
            if (oVarR4 != null) {
                jB2 = tsb.d((((long) Float.floatToRawIntBits(oVarR4.getHeight())) & 4294967295L) | (((long) Float.floatToRawIntBits(oVarR4.getWidth())) << 32));
            } else {
                jB2 = tsb.INSTANCE.b();
            }
            this.onLabelMeasured.invoke(tsb.c(jB2));
            iD0 = 0;
        }
        int size6 = list.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size6) {
                list2 = list;
                dj7Var6 = null;
                break;
            }
            list2 = list;
            dj7Var6 = list2.get(i6);
            int i7 = size6;
            if (Intrinsics.e(pn6.a(dj7Var6), "Supporting")) {
                break;
            }
            i6++;
            size6 = i7;
        }
        dj7 dj7Var13 = dj7Var6;
        int iD1 = dj7Var13 != null ? dj7Var13.d0(kx1.n(j)) : 0;
        int iO3 = z ? jVar.O1(this.paddingValues.getTop()) : Math.max(no6.a((o) objectRef.element) / 2, jVar.O1(this.paddingValues.getTop()));
        long jD2 = kx1.d(nx1.i(j, -iC4, (((-iO1) - iO3) - iD0) - iD1), 0, 0, 0, 0, 11, null);
        int size7 = list2.size();
        int i8 = 0;
        while (i8 < size7) {
            dj7 dj7Var14 = list2.get(i8);
            int i9 = iO1;
            int i10 = size7;
            if (Intrinsics.e(pn6.a(dj7Var14), "TextField")) {
                final o oVarR5 = dj7Var14.r0(jD2);
                long jD3 = kx1.d(jD2, 0, 0, 0, 0, 14, null);
                int size8 = list2.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size8) {
                        dj7Var7 = null;
                        break;
                    }
                    dj7Var7 = list2.get(i11);
                    int i12 = size8;
                    if (Intrinsics.e(pn6.a(dj7Var7), "Hint")) {
                        break;
                    }
                    i11++;
                    size8 = i12;
                }
                dj7 dj7Var15 = dj7Var7;
                o oVarR6 = dj7Var15 != null ? dj7Var15.r0(jD3) : null;
                int iMax5 = Math.max(iMax4, Math.max(no6.a(oVarR5), no6.a(oVarR6)) + iO3 + i9);
                long j4 = j2;
                Ref.ObjectRef objectRef2 = objectRef;
                dj7 dj7Var16 = dj7Var13;
                int iG = g(jVar, no6.c(oVarR1), no6.c(oVarR0), no6.c(oVarR2), no6.c(oVarR3), oVarR5.getWidth(), no6.c((o) objectRef.element), no6.c(oVarR6), j, fInvoke);
                if (z) {
                    j3 = j4;
                    o oVarR7 = dj7Var12 != null ? dj7Var12.r0(kx1.d(j3, 0, iG, 0, iD0, 5, null)) : null;
                    objectRef2.element = oVarR7;
                    if (oVarR7 != null) {
                        jB = tsb.d((((long) Float.floatToRawIntBits(oVarR7.getWidth())) << 32) | (((long) Float.floatToRawIntBits(oVarR7.getHeight())) & 4294967295L));
                    } else {
                        jB = tsb.INSTANCE.b();
                    }
                    this.onLabelMeasured.invoke(tsb.c(jB));
                } else {
                    j3 = j4;
                }
                long jD4 = kx1.d(nx1.j(j3, 0, -iMax5, 1, null), 0, iG, 0, 0, 9, null);
                int i13 = iG;
                o oVarR8 = dj7Var16 != null ? dj7Var16.r0(jD4) : null;
                int iA = no6.a(oVarR8);
                boolean z2 = z;
                final int iF = f(jVar, no6.a(oVarR1), no6.a(oVarR0), no6.a(oVarR2), no6.a(oVarR3), oVarR5.getHeight(), no6.a((o) objectRef2.element), no6.a(oVarR6), no6.a(oVarR8), j, z2, fInvoke);
                int iA2 = (iF - iA) - (z2 ? no6.a((o) objectRef2.element) : 0);
                int size9 = list.size();
                int i14 = 0;
                while (i14 < size9) {
                    dj7 dj7Var17 = list.get(i14);
                    if (Intrinsics.e(pn6.a(dj7Var17), "Container")) {
                        final o oVarR9 = dj7Var17.r0(nx1.a(i13 != Integer.MAX_VALUE ? i13 : 0, i13, iA2 != Integer.MAX_VALUE ? iA2 : 0, iA2));
                        final Ref.ObjectRef objectRef3 = objectRef2;
                        final int i15 = i13;
                        final o oVar = oVarR0;
                        final o oVar2 = oVarR2;
                        final o oVar3 = oVarR3;
                        final o oVar4 = oVarR6;
                        final boolean z3 = z2;
                        final o oVar5 = oVarR8;
                        final o oVar6 = oVarR1;
                        return j.Q1(jVar, i15, iF, null, new Function1() { // from class: androidx.compose.material3.h1
                            public final Object invoke(Object obj) {
                                return k1.p(this.a, iF, i15, oVar6, oVar, oVar2, oVar3, oVarR5, objectRef3, oVar4, oVarR9, oVar5, jVar, z3, fInvoke, (o.a) obj);
                            }
                        }, 4, null);
                    }
                    i14++;
                    iF = iF;
                    z2 = z2;
                    objectRef2 = objectRef2;
                    i13 = i13;
                }
                m47.f("Collection contains no element matching the predicate.");
                throw new KotlinNothingValueException();
            }
            i8++;
            list2 = list2;
            objectRef = objectRef;
            z = z;
            iO1 = i9;
            size7 = i10;
            j2 = j2;
            dj7Var13 = dj7Var13;
            jD2 = jD2;
        }
        m47.f("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    @Override // com.google.inputmethod.ej7
    public int minIntrinsicHeight(h66 h66Var, List<? extends f66> list, int i) {
        return i(h66Var, list, i, new Function2() { // from class: androidx.compose.material3.f1
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(k1.q((f66) obj, ((Integer) obj2).intValue()));
            }
        });
    }

    @Override // com.google.inputmethod.ej7
    public int minIntrinsicWidth(h66 h66Var, List<? extends f66> list, int i) {
        return k(h66Var, list, i, new Function2() { // from class: androidx.compose.material3.j1
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(k1.r((f66) obj, ((Integer) obj2).intValue()));
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private k1(Function1<? super tsb, Unit> function1, boolean z, v1 v1Var, hh4 hh4Var, rx8 rx8Var, float f) {
        this.onLabelMeasured = function1;
        this.singleLine = z;
        this.labelPosition = v1Var;
        this.labelProgress = hh4Var;
        this.paddingValues = rx8Var;
        this.horizontalIconPadding = f;
    }
}
