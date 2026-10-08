package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import java.util.ArrayList;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class b {
    /* JADX WARN: Code duplicated, block: B:100:0x016d  */
    /* JADX WARN: Code duplicated, block: B:102:0x0173  */
    /* JADX WARN: Code duplicated, block: B:104:0x0194  */
    /* JADX WARN: Code duplicated, block: B:16:0x0033 A[PHI: r15 r16
  0x0033: PHI (r15v26 boolean) = (r15v1 boolean), (r15v28 boolean) binds: [B:26:0x0047, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]
  0x0033: PHI (r16v5 boolean) = (r16v1 boolean), (r16v7 boolean) binds: [B:26:0x0047, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:17:0x0035 A[PHI: r15 r16
  0x0035: PHI (r15v3 boolean) = (r15v1 boolean), (r15v28 boolean) binds: [B:26:0x0047, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]
  0x0035: PHI (r16v3 boolean) = (r16v1 boolean), (r16v7 boolean) binds: [B:26:0x0047, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:218:0x038a  */
    /* JADX WARN: Code duplicated, block: B:289:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:292:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:293:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:296:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:297:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:299:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:301:0x04da  */
    /* JADX WARN: Code duplicated, block: B:304:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:317:0x038b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x016a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [androidx.constraintlayout.core.d] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.constraintlayout.core.d] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [androidx.constraintlayout.core.widgets.ConstraintWidget] */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r5v17, types: [androidx.constraintlayout.core.SolverVariable] */
    static void a(d dVar, androidx.constraintlayout.core.d dVar2, int i, int i2, c cVar) {
        boolean z;
        boolean z2;
        boolean z3;
        float f;
        ?? r0;
        androidx.constraintlayout.core.d dVar3;
        ConstraintAnchor constraintAnchor;
        SolverVariable solverVariable;
        SolverVariable solverVariable2;
        int i3;
        ConstraintAnchor constraintAnchor2;
        SolverVariable solverVariable3;
        int i4;
        ConstraintAnchor[] constraintAnchorArr;
        int i5;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        SolverVariable solverVariable4;
        ConstraintAnchor constraintAnchor5;
        Object obj;
        int size;
        ConstraintAnchor constraintAnchor6;
        int i6;
        int i7 = i;
        ConstraintWidget constraintWidget = cVar.a;
        ConstraintWidget constraintWidget2 = cVar.c;
        ConstraintWidget constraintWidget3 = cVar.b;
        ConstraintWidget constraintWidget4 = cVar.d;
        ConstraintWidget constraintWidget5 = cVar.e;
        float f2 = cVar.k;
        boolean z4 = dVar.b0[i7] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (i7 == 0) {
            int i8 = constraintWidget5.J0;
            z = i8 == 0;
            z2 = i8 == 1;
            if (i8 == 2) {
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            int i9 = constraintWidget5.K0;
            z = i9 == 0;
            z2 = i9 == 1;
            if (i9 == 2) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        ?? r14 = constraintWidget;
        boolean z5 = false;
        while (true) {
            f = f2;
            Object obj2 = null;
            if (z5) {
                break;
            }
            ConstraintAnchor constraintAnchor7 = r14.Y[i2];
            int i10 = z3 ? 1 : 4;
            int iF = constraintAnchor7.f();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = r14.b0[i7];
            boolean z6 = z4;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            boolean z7 = dimensionBehaviour == dimensionBehaviour2 && r14.y[i7] == 0;
            boolean z8 = z3;
            ConstraintAnchor constraintAnchor8 = constraintAnchor7.f;
            if (constraintAnchor8 != null && r14 != constraintWidget) {
                iF += constraintAnchor8.f();
            }
            int i11 = iF;
            if (z8 && r14 != constraintWidget && r14 != constraintWidget3) {
                i10 = 8;
            }
            boolean z9 = z7;
            ConstraintAnchor constraintAnchor9 = constraintAnchor7.f;
            if (constraintAnchor9 != null) {
                if (r14 == constraintWidget3) {
                    dVar2.h(constraintAnchor7.i, constraintAnchor9.i, i11, 6);
                } else {
                    dVar2.h(constraintAnchor7.i, constraintAnchor9.i, i11, 8);
                }
                if (z9 && !z8) {
                    i10 = 5;
                }
                dVar2.e(constraintAnchor7.i, constraintAnchor7.f.i, i11, (r14 == constraintWidget3 && z8 && r14.l0(i7)) ? 5 : i10);
            } else {
                z5 = z5;
                z = z;
            }
            if (z6) {
                if (r14.Z() == 8 || r14.b0[i7] != dimensionBehaviour2) {
                    i6 = 0;
                } else {
                    ConstraintAnchor[] constraintAnchorArr2 = r14.Y;
                    i6 = 0;
                    dVar2.h(constraintAnchorArr2[i2 + 1].i, constraintAnchorArr2[i2].i, 0, 5);
                }
                dVar2.h(r14.Y[i2].i, dVar.Y[i2].i, i6, 8);
            }
            ConstraintAnchor constraintAnchor10 = r14.Y[i2 + 1].f;
            if (constraintAnchor10 != null) {
                ConstraintWidget constraintWidget6 = constraintAnchor10.d;
                ConstraintAnchor constraintAnchor11 = constraintWidget6.Y[i2].f;
                if (constraintAnchor11 != null && constraintAnchor11.d == r14) {
                    obj2 = constraintWidget6;
                }
            }
            if (obj2 != null) {
                r14 = obj2;
                z5 = z5;
            } else {
                z5 = true;
            }
            f2 = f;
            z4 = z6;
            z3 = z8;
            z = z;
            r14 = r14;
        }
        boolean z10 = z4;
        boolean z11 = z3;
        boolean z12 = z;
        if (constraintWidget4 != null) {
            int i12 = i2 + 1;
            if (constraintWidget2.Y[i12].f != null) {
                ConstraintAnchor constraintAnchor12 = constraintWidget4.Y[i12];
                if (constraintWidget4.b0[i7] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget4.y[i7] == 0 && !z11) {
                    ConstraintAnchor constraintAnchor13 = constraintAnchor12.f;
                    if (constraintAnchor13.d == dVar) {
                        dVar2.e(constraintAnchor12.i, constraintAnchor13.i, -constraintAnchor12.f(), 5);
                    } else if (z11) {
                        constraintAnchor6 = constraintAnchor12.f;
                        if (constraintAnchor6.d == dVar) {
                            dVar2.e(constraintAnchor12.i, constraintAnchor6.i, -constraintAnchor12.f(), 4);
                        }
                    }
                } else if (z11) {
                    constraintAnchor6 = constraintAnchor12.f;
                    if (constraintAnchor6.d == dVar) {
                        dVar2.e(constraintAnchor12.i, constraintAnchor6.i, -constraintAnchor12.f(), 4);
                    }
                }
                dVar2.j(constraintAnchor12.i, constraintWidget2.Y[i12].f.i, -constraintAnchor12.f(), 6);
            }
        }
        if (z10) {
            int i13 = i2 + 1;
            SolverVariable solverVariable5 = dVar.Y[i13].i;
            ConstraintAnchor constraintAnchor14 = constraintWidget2.Y[i13];
            dVar2.h(solverVariable5, constraintAnchor14.i, constraintAnchor14.f(), 8);
        }
        ArrayList<ConstraintWidget> arrayList = cVar.h;
        if (arrayList != null && (size = arrayList.size()) > 1) {
            float f3 = (!cVar.r || cVar.t) ? f : cVar.j;
            float f4 = 0.0f;
            float f5 = 0.0f;
            ConstraintWidget constraintWidget7 = null;
            int i14 = 0;
            while (i14 < size) {
                ConstraintWidget constraintWidget8 = arrayList.get(i14);
                float f6 = constraintWidget8.N0[i7];
                if (f6 < f4) {
                    if (cVar.t) {
                        ConstraintAnchor[] constraintAnchorArr3 = constraintWidget8.Y;
                        f4 = f4;
                        dVar2.e(constraintAnchorArr3[i2 + 1].i, constraintAnchorArr3[i2].i, 0, 4);
                    } else {
                        f6 = 1.0f;
                    }
                    arrayList = arrayList;
                    i14++;
                    f4 = f4;
                    arrayList = arrayList;
                }
                float f7 = f6;
                if (f7 == f4) {
                    ConstraintAnchor[] constraintAnchorArr4 = constraintWidget8.Y;
                    dVar2.e(constraintAnchorArr4[i2 + 1].i, constraintAnchorArr4[i2].i, 0, 8);
                    arrayList = arrayList;
                } else {
                    if (constraintWidget7 != null) {
                        ConstraintAnchor[] constraintAnchorArr5 = constraintWidget7.Y;
                        SolverVariable solverVariable6 = constraintAnchorArr5[i2].i;
                        int i15 = i2 + 1;
                        SolverVariable solverVariable7 = constraintAnchorArr5[i15].i;
                        ConstraintAnchor[] constraintAnchorArr6 = constraintWidget8.Y;
                        SolverVariable solverVariable8 = constraintAnchorArr6[i2].i;
                        SolverVariable solverVariable9 = constraintAnchorArr6[i15].i;
                        androidx.constraintlayout.core.b bVarR = dVar2.r();
                        bVarR.l(f5, f3, f7, solverVariable6, solverVariable7, solverVariable8, solverVariable9);
                        dVar2.d(bVarR);
                    }
                    constraintWidget7 = constraintWidget8;
                    f5 = f7;
                }
                i14++;
                f4 = f4;
                arrayList = arrayList;
            }
        }
        if (constraintWidget3 != null && (constraintWidget3 == constraintWidget4 || z11)) {
            ConstraintAnchor constraintAnchor15 = constraintWidget.Y[i2];
            int i16 = i2 + 1;
            ConstraintAnchor constraintAnchor16 = constraintWidget2.Y[i16];
            ConstraintAnchor constraintAnchor17 = constraintAnchor15.f;
            SolverVariable solverVariable10 = constraintAnchor17 != null ? constraintAnchor17.i : null;
            ConstraintAnchor constraintAnchor18 = constraintAnchor16.f;
            SolverVariable solverVariable11 = constraintAnchor18 != null ? constraintAnchor18.i : null;
            ConstraintAnchor constraintAnchor19 = constraintWidget3.Y[i2];
            if (constraintWidget4 != null) {
                constraintAnchor16 = constraintWidget4.Y[i16];
            }
            if (solverVariable10 != null && solverVariable11 != null) {
                dVar2.c(constraintAnchor19.i, solverVariable10, constraintAnchor19.f(), i7 == 0 ? constraintWidget5.q0 : constraintWidget5.r0, solverVariable11, constraintAnchor16.i, constraintAnchor16.f(), 7);
            }
        } else {
            if (!z12 || constraintWidget3 == null) {
                if (z2 && constraintWidget3 != null) {
                    int i17 = cVar.j;
                    boolean z13 = i17 > 0 && cVar.i == i17;
                    ConstraintWidget constraintWidget9 = constraintWidget3;
                    ConstraintWidget constraintWidget10 = constraintWidget9;
                    while (constraintWidget9 != null) {
                        ConstraintWidget constraintWidget11 = constraintWidget9.P0[i];
                        while (constraintWidget11 != null && constraintWidget11.Z() == 8) {
                            constraintWidget11 = constraintWidget11.P0[i];
                        }
                        if (constraintWidget9 != constraintWidget3 && constraintWidget9 != constraintWidget4 && constraintWidget11 != null) {
                            if (constraintWidget11 == constraintWidget4) {
                                constraintWidget11 = null;
                            }
                            ConstraintAnchor constraintAnchor20 = constraintWidget9.Y[i2];
                            SolverVariable solverVariable12 = constraintAnchor20.i;
                            ConstraintAnchor constraintAnchor21 = constraintAnchor20.f;
                            if (constraintAnchor21 != null) {
                                SolverVariable solverVariable13 = constraintAnchor21.i;
                            }
                            int i18 = i2 + 1;
                            SolverVariable solverVariable14 = constraintWidget10.Y[i18].i;
                            int iF2 = constraintAnchor20.f();
                            int iF3 = constraintWidget9.Y[i18].f();
                            if (constraintWidget11 != null) {
                                constraintAnchor = constraintWidget11.Y[i2];
                                solverVariable = constraintAnchor.i;
                                ConstraintAnchor constraintAnchor22 = constraintAnchor.f;
                                solverVariable2 = constraintAnchor22 != null ? constraintAnchor22.i : null;
                            } else {
                                constraintAnchor = constraintWidget4.Y[i2];
                                solverVariable = constraintAnchor != null ? constraintAnchor.i : null;
                                solverVariable2 = constraintWidget9.Y[i18].i;
                            }
                            if (constraintAnchor != null) {
                                iF3 += constraintAnchor.f();
                            }
                            int iF4 = iF2 + constraintWidget10.Y[i18].f();
                            int i19 = z13 ? 8 : 4;
                            if (solverVariable12 != null && solverVariable14 != null && solverVariable != null && solverVariable2 != null) {
                                dVar2.c(solverVariable12, solverVariable14, iF4, 0.5f, solverVariable, solverVariable2, iF3, i19);
                            }
                            constraintWidget11 = constraintWidget11;
                        }
                        if (constraintWidget9.Z() != 8) {
                            constraintWidget10 = constraintWidget9;
                        }
                        constraintWidget9 = constraintWidget11;
                    }
                    ConstraintAnchor constraintAnchor23 = constraintWidget3.Y[i2];
                    ConstraintAnchor constraintAnchor24 = constraintWidget.Y[i2].f;
                    int i20 = i2 + 1;
                    ConstraintAnchor constraintAnchor25 = constraintWidget4.Y[i20];
                    ConstraintAnchor constraintAnchor26 = constraintWidget2.Y[i20].f;
                    if (constraintAnchor24 == null) {
                        r0 = dVar2;
                    } else {
                        if (constraintWidget3 != constraintWidget4) {
                            dVar2.e(constraintAnchor23.i, constraintAnchor24.i, constraintAnchor23.f(), 5);
                        } else if (constraintAnchor26 != null) {
                            dVar3 = dVar2;
                            dVar3.c(constraintAnchor23.i, constraintAnchor24.i, constraintAnchor23.f(), 0.5f, constraintAnchor25.i, constraintAnchor26.i, constraintAnchor25.f(), 5);
                        }
                        r0 = dVar2;
                    }
                    if (constraintAnchor26 != null && constraintWidget3 != constraintWidget4) {
                        r0.e(constraintAnchor25.i, constraintAnchor26.i, -constraintAnchor25.f(), 5);
                    }
                }
                if ((z12 && !z2) || constraintWidget3 == null || constraintWidget3 == constraintWidget4) {
                    return;
                }
                constraintAnchorArr = constraintWidget3.Y;
                ConstraintAnchor constraintAnchor27 = constraintAnchorArr[i2];
                if (constraintWidget4 == null) {
                    constraintWidget4 = constraintWidget3;
                }
                i5 = i2 + 1;
                constraintAnchor3 = constraintWidget4.Y[i5];
                constraintAnchor4 = constraintAnchor27.f;
                if (constraintAnchor4 != null) {
                    solverVariable4 = constraintAnchor4.i;
                } else {
                    solverVariable4 = null;
                }
                constraintAnchor5 = constraintAnchor3.f;
                if (constraintAnchor5 != null) {
                    obj = constraintAnchor5.i;
                } else {
                    obj = null;
                }
                if (constraintWidget2 != constraintWidget4) {
                    ConstraintAnchor constraintAnchor28 = constraintWidget2.Y[i5].f;
                    obj = constraintAnchor28 != null ? constraintAnchor28.i : null;
                }
                if (constraintWidget3 == constraintWidget4) {
                    constraintAnchor3 = constraintAnchorArr[i5];
                }
                if (solverVariable4 != null || obj == null) {
                }
                r0.c(constraintAnchor27.i, solverVariable4, constraintAnchor27.f(), 0.5f, obj, constraintAnchor3.i, constraintWidget4.Y[i5].f(), 5);
                return;
            }
            int i21 = cVar.j;
            boolean z14 = i21 > 0 && cVar.i == i21;
            ConstraintWidget constraintWidget12 = constraintWidget3;
            ConstraintWidget constraintWidget13 = constraintWidget12;
            while (constraintWidget12 != null) {
                ConstraintWidget constraintWidget14 = constraintWidget12.P0[i7];
                while (true) {
                    if (constraintWidget14 == null) {
                        i3 = 8;
                        break;
                    }
                    i3 = 8;
                    if (constraintWidget14.Z() != 8) {
                        break;
                    } else {
                        constraintWidget14 = constraintWidget14.P0[i7];
                    }
                }
                if (constraintWidget14 != null || constraintWidget12 == constraintWidget4) {
                    ConstraintAnchor constraintAnchor29 = constraintWidget12.Y[i2];
                    SolverVariable solverVariable15 = constraintAnchor29.i;
                    ConstraintAnchor constraintAnchor30 = constraintAnchor29.f;
                    SolverVariable solverVariable16 = constraintAnchor30 != null ? constraintAnchor30.i : null;
                    if (constraintWidget13 != constraintWidget12) {
                        solverVariable16 = constraintWidget13.Y[i2 + 1].i;
                    } else if (constraintWidget12 == constraintWidget3) {
                        ConstraintAnchor constraintAnchor31 = constraintWidget.Y[i2].f;
                        solverVariable16 = constraintAnchor31 != null ? constraintAnchor31.i : null;
                    }
                    int iF5 = constraintAnchor29.f();
                    int i22 = i2 + 1;
                    int iF6 = constraintWidget12.Y[i22].f();
                    if (constraintWidget14 != null) {
                        constraintAnchor2 = constraintWidget14.Y[i2];
                        solverVariable3 = constraintAnchor2.i;
                    } else {
                        constraintAnchor2 = constraintWidget2.Y[i22].f;
                        solverVariable3 = constraintAnchor2 != null ? constraintAnchor2.i : null;
                    }
                    SolverVariable solverVariable17 = constraintWidget12.Y[i22].i;
                    if (constraintAnchor2 != null) {
                        iF6 += constraintAnchor2.f();
                    }
                    int iF7 = iF5 + constraintWidget13.Y[i22].f();
                    if (solverVariable15 == null || solverVariable16 == null || solverVariable3 == null || solverVariable17 == null) {
                        i4 = 8;
                    } else {
                        if (constraintWidget12 == constraintWidget3) {
                            iF7 = constraintWidget3.Y[i2].f();
                        }
                        if (constraintWidget12 == constraintWidget4) {
                            iF6 = constraintWidget4.Y[i22].f();
                        }
                        constraintWidget14 = constraintWidget14;
                        i4 = 8;
                        dVar2.c(solverVariable15, solverVariable16, iF7, 0.5f, solverVariable3, solverVariable17, iF6, z14 ? 8 : 5);
                    }
                    if (constraintWidget12.Z() != i4) {
                        constraintWidget13 = constraintWidget12;
                    }
                    i7 = i;
                    constraintWidget12 = constraintWidget14;
                } else {
                    i4 = i3;
                }
                if (constraintWidget12.Z() != i4) {
                    constraintWidget13 = constraintWidget12;
                }
                i7 = i;
                constraintWidget12 = constraintWidget14;
            }
        }
        r0 = dVar2;
        if (z12) {
        }
        constraintAnchorArr = constraintWidget3.Y;
        ConstraintAnchor constraintAnchor210 = constraintAnchorArr[i2];
        if (constraintWidget4 == null) {
            constraintWidget4 = constraintWidget3;
        }
        i5 = i2 + 1;
        constraintAnchor3 = constraintWidget4.Y[i5];
        constraintAnchor4 = constraintAnchor210.f;
        if (constraintAnchor4 != null) {
            solverVariable4 = constraintAnchor4.i;
        } else {
            solverVariable4 = null;
        }
        constraintAnchor5 = constraintAnchor3.f;
        if (constraintAnchor5 != null) {
            obj = constraintAnchor5.i;
        } else {
            obj = null;
        }
        if (constraintWidget2 != constraintWidget4) {
            ConstraintAnchor constraintAnchor211 = constraintWidget2.Y[i5].f;
            obj = constraintAnchor211 != null ? constraintAnchor211.i : null;
        }
        if (constraintWidget3 == constraintWidget4) {
            constraintAnchor3 = constraintAnchorArr[i5];
        }
        if (solverVariable4 != null) {
        }
    }

    public static void b(d dVar, androidx.constraintlayout.core.d dVar2, ArrayList<ConstraintWidget> arrayList, int i) {
        int i2;
        c[] cVarArr;
        int i3;
        if (i == 0) {
            i2 = dVar.g1;
            cVarArr = dVar.j1;
            i3 = 0;
        } else {
            i2 = dVar.h1;
            cVarArr = dVar.i1;
            i3 = 2;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            c cVar = cVarArr[i4];
            cVar.a();
            if (arrayList == null || arrayList.contains(cVar.a)) {
                a(dVar, dVar2, i, i3, cVar);
            }
        }
    }
}
