package androidx.compose.ui.autofill;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.spatial.RectManager;
import androidx.compose.ui.state.ToggleableState;
import com.google.android.rs4;
import com.google.inputmethod.ez1;
import com.google.inputmethod.ha0;
import com.google.inputmethod.hpa;
import com.google.inputmethod.i02;
import com.google.inputmethod.ja0;
import com.google.inputmethod.k58;
import com.google.inputmethod.rfb;
import com.google.inputmethod.seb;
import com.google.inputmethod.sk;
import com.google.inputmethod.teb;
import com.google.inputmethod.ueb;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.f;
import kotlin.collections.m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a5\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroid/view/ViewStructure;", "Lcom/google/android/teb;", "semanticsInfo", "Landroid/view/autofill/AutofillId;", "rootAutofillId", "", "packageName", "Landroidx/compose/ui/spatial/RectManager;", "rectManager", "", "a", "(Landroid/view/ViewStructure;Lcom/google/android/teb;Landroid/view/autofill/AutofillId;Ljava/lang/String;Landroidx/compose/ui/spatial/RectManager;)V", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class PopulateViewStructure_androidKt {
    /* JADX WARN: Code duplicated, block: B:103:0x027f  */
    /* JADX WARN: Code duplicated, block: B:158:0x0361  */
    /* JADX WARN: Code duplicated, block: B:163:0x0369  */
    /* JADX WARN: Code duplicated, block: B:166:0x0373  */
    /* JADX WARN: Code duplicated, block: B:167:0x0375  */
    /* JADX WARN: Code duplicated, block: B:170:0x037b  */
    /* JADX WARN: Code duplicated, block: B:172:0x0384 A[LOOP:4: B:171:0x0382->B:172:0x0384, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:181:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:183:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:185:0x03da  */
    /* JADX WARN: Code duplicated, block: B:212:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:172:0x0384, please report this as an issue */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void a(final ViewStructure viewStructure, teb tebVar, AutofillId autofillId, String str, RectManager rectManager) {
        SemanticsProperties semanticsProperties;
        int i;
        long j;
        char c;
        long j2;
        ToggleableState toggleableState;
        c cVar;
        boolean z;
        androidx.compose.ui.text.b bVar;
        sk skVar;
        d dVar;
        Boolean bool;
        hpa hpaVar;
        boolean z2;
        boolean zBooleanValue;
        Integer num;
        List list;
        Integer numValueOf;
        boolean z3;
        boolean z4;
        boolean z5;
        int i2;
        String strE;
        int size;
        String str2;
        int i3;
        String[] strArrB;
        String[] strArrB2;
        k58<SemanticsPropertyKey<?>, Object> k58VarQ;
        k58<SemanticsPropertyKey<?>, Object> k58VarQ2;
        ToggleableState toggleableState2;
        SemanticsProperties semanticsProperties2;
        int i4;
        final ha0 ha0Var = ha0.a;
        SemanticsProperties semanticsProperties3 = SemanticsProperties.a;
        SemanticsActions semanticsActions = SemanticsActions.a;
        seb sebVarG = tebVar.g();
        int i5 = 8;
        if (sebVarG == null || (k58VarQ2 = sebVarG.q()) == null) {
            semanticsProperties = semanticsProperties3;
            i = 2;
            j = 255;
            c = 7;
            j2 = -9187201950435737472L;
            toggleableState = null;
            cVar = null;
            z = false;
            bVar = null;
            skVar = null;
            dVar = null;
            bool = null;
            hpaVar = null;
            z2 = false;
            zBooleanValue = true;
            num = null;
        } else {
            Object[] objArr = k58VarQ2.keys;
            j = 255;
            Object[] objArr2 = k58VarQ2.values;
            long[] jArr = k58VarQ2.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                i = 2;
                int i6 = 0;
                c = 7;
                cVar = null;
                z = false;
                toggleableState2 = null;
                bVar = null;
                skVar = null;
                dVar = null;
                bool = null;
                hpaVar = null;
                z2 = false;
                zBooleanValue = true;
                num = null;
                j2 = -9187201950435737472L;
                while (true) {
                    long j3 = jArr[i6];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j3 & 255) < 128) {
                                int i9 = (i6 << 3) + i8;
                                Object obj = objArr[i9];
                                Object obj2 = objArr2[i9];
                                i4 = i5;
                                SemanticsPropertyKey semanticsPropertyKey = (SemanticsPropertyKey) obj;
                                if (Intrinsics.e(semanticsPropertyKey, semanticsProperties3.c())) {
                                    Intrinsics.h(obj2, "null cannot be cast to non-null type androidx.compose.ui.autofill.ContentDataType");
                                    cVar = (c) obj2;
                                } else if (Intrinsics.e(semanticsPropertyKey, semanticsProperties3.d())) {
                                    Intrinsics.h(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                                    String str3 = (String) m.B0((List) obj2);
                                    if (str3 != null) {
                                        ha0Var.q(viewStructure, str3);
                                    }
                                } else if (Intrinsics.e(semanticsPropertyKey, semanticsProperties3.e())) {
                                    Intrinsics.h(obj2, "null cannot be cast to non-null type androidx.compose.ui.autofill.ContentType");
                                    dVar = (d) obj2;
                                } else if (Intrinsics.e(semanticsPropertyKey, semanticsProperties3.i())) {
                                    Intrinsics.h(obj2, "null cannot be cast to non-null type androidx.compose.ui.autofill.AndroidFillableData");
                                    skVar = (sk) obj2;
                                } else if (Intrinsics.e(semanticsPropertyKey, semanticsProperties3.g())) {
                                    Intrinsics.h(obj2, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString");
                                    bVar = (androidx.compose.ui.text.b) obj2;
                                } else {
                                    semanticsProperties2 = semanticsProperties3;
                                    if (Intrinsics.e(semanticsPropertyKey, semanticsProperties3.j())) {
                                        Intrinsics.h(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                                        ha0Var.v(viewStructure, ((Boolean) obj2).booleanValue());
                                    } else if (Intrinsics.e(semanticsPropertyKey, semanticsProperties2.B())) {
                                        Intrinsics.h(obj2, "null cannot be cast to non-null type kotlin.Int");
                                        num = (Integer) obj2;
                                    } else if (Intrinsics.e(semanticsPropertyKey, semanticsProperties2.D())) {
                                        z2 = true;
                                    } else if (Intrinsics.e(semanticsPropertyKey, semanticsProperties2.w())) {
                                        Intrinsics.h(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                                        zBooleanValue = ((Boolean) obj2).booleanValue();
                                    } else if (Intrinsics.e(semanticsPropertyKey, semanticsProperties2.F())) {
                                        Intrinsics.h(obj2, "null cannot be cast to non-null type androidx.compose.ui.semantics.Role");
                                        hpaVar = (hpa) obj2;
                                    } else if (Intrinsics.e(semanticsPropertyKey, semanticsProperties2.H())) {
                                        Intrinsics.h(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                                        bool = (Boolean) obj2;
                                    } else if (Intrinsics.e(semanticsPropertyKey, semanticsProperties2.Q())) {
                                        Intrinsics.h(obj2, "null cannot be cast to non-null type androidx.compose.ui.state.ToggleableState");
                                        toggleableState2 = (ToggleableState) obj2;
                                    } else if (Intrinsics.e(semanticsPropertyKey, semanticsActions.l())) {
                                        ha0Var.p(viewStructure, true);
                                    } else if (Intrinsics.e(semanticsPropertyKey, semanticsActions.o())) {
                                        ha0Var.y(viewStructure, true);
                                    } else if (Intrinsics.e(semanticsPropertyKey, semanticsActions.u())) {
                                        ha0Var.u(viewStructure, true);
                                    } else if (Intrinsics.e(semanticsPropertyKey, semanticsActions.A())) {
                                        z = true;
                                    }
                                }
                                semanticsProperties2 = semanticsProperties3;
                            } else {
                                semanticsProperties2 = semanticsProperties3;
                                i4 = i5;
                            }
                            j3 >>= i4;
                            i8++;
                            i5 = i4;
                            semanticsProperties3 = semanticsProperties2;
                        }
                        semanticsProperties = semanticsProperties3;
                        if (i7 != i5) {
                            break;
                        }
                    } else {
                        semanticsProperties = semanticsProperties3;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    semanticsProperties3 = semanticsProperties;
                    i5 = 8;
                }
            } else {
                semanticsProperties = semanticsProperties3;
                i = 2;
                c = 7;
                j2 = -9187201950435737472L;
                cVar = null;
                z = false;
                toggleableState2 = null;
                bVar = null;
                skVar = null;
                dVar = null;
                bool = null;
                hpaVar = null;
                z2 = false;
                zBooleanValue = true;
                num = null;
            }
            toggleableState = toggleableState2;
        }
        seb sebVarA = ueb.a(tebVar);
        if (sebVarA == null || (k58VarQ = sebVarA.q()) == null) {
            list = null;
        } else {
            Object[] objArr3 = k58VarQ.keys;
            Object[] objArr4 = k58VarQ.values;
            long[] jArr2 = k58VarQ.metadata;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i10 = 0;
                list = null;
                while (true) {
                    long j4 = jArr2[i10];
                    if ((((~j4) << c) & j4 & j2) != j2) {
                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((j4 & j) < 128) {
                                int i13 = (i10 << 3) + i12;
                                Object obj3 = objArr3[i13];
                                Object obj4 = objArr4[i13];
                                SemanticsPropertyKey semanticsPropertyKey2 = (SemanticsPropertyKey) obj3;
                                if (Intrinsics.e(semanticsPropertyKey2, semanticsProperties.f())) {
                                    ha0Var.t(viewStructure, false);
                                } else if (Intrinsics.e(semanticsPropertyKey2, semanticsProperties.L())) {
                                    Intrinsics.h(obj4, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString>");
                                    list = (List) obj4;
                                }
                            }
                            j4 >>= 8;
                        }
                        if (i11 != 8) {
                            break;
                        }
                    }
                    if (i10 == length2) {
                        break;
                    } else {
                        i10++;
                    }
                }
            } else {
                list = null;
            }
        }
        Integer numValueOf2 = Integer.valueOf(tebVar.getSemanticsId());
        if (tebVar.n() == null) {
            numValueOf2 = null;
        }
        int iIntValue = numValueOf2 != null ? numValueOf2.intValue() : -1;
        ha0Var.j(viewStructure, autofillId, iIntValue);
        ha0Var.w(viewStructure, iIntValue, str, null, null);
        if (cVar != null) {
            numValueOf = Integer.valueOf(ez1.b(cVar));
        } else if (z) {
            numValueOf = 1;
        } else {
            numValueOf = toggleableState != null ? Integer.valueOf(i) : null;
        }
        if (numValueOf != null) {
            ha0Var.k(viewStructure, numValueOf.intValue());
        }
        if (bVar != null) {
            ha0Var.l(viewStructure, ha0Var.b(bVar.getText()));
        }
        if (skVar != null) {
            ha0Var.l(viewStructure, skVar.getAutofillValue());
        }
        if (dVar != null && (strArrB2 = i02.b(dVar)) != null) {
            ha0Var.i(viewStructure, strArrB2);
        }
        rectManager.getRects().q(tebVar.getSemanticsId(), new rs4<Integer, Integer, Integer, Integer, Unit>() { // from class: androidx.compose.ui.autofill.PopulateViewStructure_androidKt$populate$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            public final void a(int i14, int i15, int i16, int i17) {
                ha0Var.s(viewStructure, i14, i15, 0, 0, i16 - i14, i17 - i15);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                a(((Number) obj5).intValue(), ((Number) obj6).intValue(), ((Number) obj7).intValue(), ((Number) obj8).intValue());
                return Unit.a;
            }
        });
        if (bool != null) {
            ha0Var.z(viewStructure, bool.booleanValue());
        }
        if (toggleableState != null) {
            ha0Var.m(viewStructure, true);
            ha0Var.n(viewStructure, toggleableState == ToggleableState.On);
        } else if (bool != null) {
            if (!(hpaVar == null ? false : hpa.m(hpaVar.getValue(), hpa.INSTANCE.h()))) {
                ha0Var.m(viewStructure, true);
                ha0Var.n(viewStructure, bool.booleanValue());
            }
        }
        String str4 = (String) f.o0(i02.b(d.INSTANCE.b()));
        if (dVar != null && (strArrB = i02.b(dVar)) != null) {
            boolean zH0 = f.h0(strArrB, str4);
            z3 = true;
            boolean z6 = zH0;
            if (!z2 || z6) {
                z4 = z3;
            } else {
                z4 = false;
            }
            if (!z4 || zBooleanValue) {
                z5 = z3;
            } else {
                z5 = false;
            }
            ha0Var.r(viewStructure, z5);
            if (tebVar.l()) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            ha0Var.B(viewStructure, i2);
            if (list != null) {
                size = list.size();
                str2 = "";
                for (i3 = 0; i3 < size; i3++) {
                    str2 = str2 + ((androidx.compose.ui.text.b) list.get(i3)).getText() + '\n';
                }
                ha0Var.A(viewStructure, str2);
                ha0Var.o(viewStructure, "android.widget.TextView");
            }
            if (tebVar.k().isEmpty() && hpaVar != null && (strE = rfb.e(hpaVar.getValue())) != null) {
                ha0Var.o(viewStructure, strE);
            }
            if (z) {
                ha0Var.o(viewStructure, "android.widget.EditText");
                if (num != null) {
                    ja0.a.a(viewStructure, num.intValue());
                }
                if (z4) {
                    ha0Var.x(viewStructure, 129);
                }
            }
        }
        z3 = true;
        if (z2) {
            z4 = z3;
        } else {
            z4 = z3;
        }
        if (z4) {
            z5 = z3;
        } else {
            z5 = z3;
        }
        ha0Var.r(viewStructure, z5);
        if (tebVar.l()) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        ha0Var.B(viewStructure, i2);
        if (list != null) {
            size = list.size();
            str2 = "";
            while (i3 < size) {
                str2 = str2 + ((androidx.compose.ui.text.b) list.get(i3)).getText() + '\n';
            }
            ha0Var.A(viewStructure, str2);
            ha0Var.o(viewStructure, "android.widget.TextView");
        }
        if (tebVar.k().isEmpty()) {
            ha0Var.o(viewStructure, strE);
        }
        if (z) {
            ha0Var.o(viewStructure, "android.widget.EditText");
            if (num != null) {
                ja0.a.a(viewStructure, num.intValue());
            }
            if (z4) {
                ha0Var.x(viewStructure, 129);
            }
        }
    }
}
