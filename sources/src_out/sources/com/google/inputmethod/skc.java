package com.google.inputmethod;

import androidx.compose.p001foundation.layout.SizeKt;
import androidx.compose.p002material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.p004runtime.s0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.j;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.node.ComposeUiNode;
import com.google.android.ps4;
import com.google.android.zk1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001ai\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001aW\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"", "selectedTabIndex", "Landroidx/compose/ui/b;", "modifier", "Lcom/google/android/ei1;", "containerColor", "contentColor", "Lkotlin/Function1;", "Lcom/google/android/gkc;", "", "indicator", "Lkotlin/Function0;", "divider", "tabs", "c", "(ILandroidx/compose/ui/b;JJLcom/google/android/ps4;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;II)V", "e", "(Landroidx/compose/ui/b;JJLcom/google/android/ps4;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;I)V", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class skc {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a implements ps4<gkc, d, Integer, Unit> {
        final /* synthetic */ int a;

        a(int i) {
            this.a = i;
        }

        public final void a(gkc gkcVar, d dVar, int i) {
            if ((i & 6) == 0) {
                i |= (i & 8) == 0 ? dVar.x(gkcVar) : dVar.T(gkcVar) ? 4 : 2;
            }
            if (!dVar.g((i & 19) != 18, i & 1)) {
                dVar.q();
                return;
            }
            if (e.k()) {
                e.o(959948692, i, -1, "androidx.compose.material3.SecondaryTabRow.<anonymous> (TabRow.kt:207)");
            }
            pkc.a.b(gkcVar.a(androidx.compose.ui.b.INSTANCE, this.a, false), 0.0f, 0L, dVar, 3072, 6);
            if (e.k()) {
                e.n();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((gkc) obj, (d) obj2, ((Number) obj3).intValue());
            return Unit.a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class b implements Function2<d, Integer, Unit> {
        final /* synthetic */ Function2<d, Integer, Unit> a;
        final /* synthetic */ Function2<d, Integer, Unit> b;
        final /* synthetic */ ps4<gkc, d, Integer, Unit> c;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class a implements Function2<d, Integer, Unit> {
            final /* synthetic */ ps4<gkc, d, Integer, Unit> a;
            final /* synthetic */ c b;

            /* JADX WARN: Multi-variable type inference failed */
            a(ps4<? super gkc, ? super d, ? super Integer, Unit> ps4Var, c cVar) {
                this.a = ps4Var;
                this.b = cVar;
            }

            public final void a(d dVar, int i) {
                if (!dVar.g((i & 3) != 2, i & 1)) {
                    dVar.q();
                    return;
                }
                if (e.k()) {
                    e.o(-1333331860, i, -1, "androidx.compose.material3.TabRowImpl.<anonymous>.<anonymous> (TabRow.kt:440)");
                }
                this.a.invoke(this.b, dVar, 6);
                if (e.k()) {
                    e.n();
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((d) obj, ((Number) obj2).intValue());
                return Unit.a;
            }
        }

        /* JADX INFO: renamed from: com.google.android.skc$b$b, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class C0122b implements r28 {
            final /* synthetic */ c a;

            C0122b(c cVar) {
                this.a = cVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit b(List list, List list2, List list3, Ref.IntRef intRef, int i, o.a aVar) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    o.a.L(aVar, (o) list.get(i2), i2 * intRef.element, 0, 0.0f, 4, null);
                }
                int size2 = list2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    o oVar = (o) list2.get(i3);
                    o.a.L(aVar, oVar, 0, i - oVar.getHeight(), 0.0f, 4, null);
                }
                int size3 = list3.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    o oVar2 = (o) list3.get(i4);
                    o.a.L(aVar, oVar2, 0, i - oVar2.getHeight(), 0.0f, 4, null);
                }
                return Unit.a;
            }

            @Override // com.google.inputmethod.r28
            /* JADX INFO: renamed from: measure-3p2s80s */
            public final fj7 mo4measure3p2s80s(j jVar, List<? extends List<? extends dj7>> list, long j) {
                List<? extends dj7> list2 = list.get(0);
                List<? extends dj7> list3 = list.get(1);
                int i = 2;
                List<? extends dj7> list4 = list.get(2);
                int iL = kx1.l(j);
                int size = list2.size();
                final Ref.IntRef intRef = new Ref.IntRef();
                if (size > 0) {
                    intRef.element = iL / size;
                }
                Integer numValueOf = 0;
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    numValueOf = Integer.valueOf(Math.max(list2.get(i2).W(intRef.element), numValueOf.intValue()));
                }
                final int iIntValue = numValueOf.intValue();
                c cVar = this.a;
                ArrayList arrayList = new ArrayList(size);
                int i3 = 0;
                while (i3 < size) {
                    arrayList.add(new TabPosition(ff3.i(jVar.O0(intRef.element) * i3), jVar.O0(intRef.element), ((ff3) zk1.m(ff3.e(ff3.i(jVar.O0(Math.min(list2.get(i3).q0(iIntValue), intRef.element)) - ff3.i(lkc.t() * i))), ff3.e(ff3.i(24)))).getValue(), null));
                    i3++;
                    i = 2;
                }
                cVar.b(arrayList);
                final ArrayList arrayList2 = new ArrayList(list2.size());
                int size3 = list2.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    dj7 dj7Var = list2.get(i4);
                    int i5 = intRef.element;
                    int i6 = iIntValue;
                    long jC = kx1.c(j, i5, i5, i6, iIntValue);
                    iIntValue = i6;
                    arrayList2.add(dj7Var.r0(jC));
                }
                final ArrayList arrayList3 = new ArrayList(list3.size());
                int size4 = list3.size();
                for (int i7 = 0; i7 < size4; i7++) {
                    arrayList3.add(list3.get(i7).r0(kx1.d(j, 0, 0, 0, 0, 11, null)));
                }
                final ArrayList arrayList4 = new ArrayList(list4.size());
                int size5 = list4.size();
                for (int i8 = 0; i8 < size5; i8++) {
                    dj7 dj7Var2 = list4.get(i8);
                    int i9 = intRef.element;
                    int i10 = iIntValue;
                    iIntValue = i10;
                    arrayList4.add(dj7Var2.r0(kx1.c(j, i9, i9, 0, i10)));
                }
                return j.Q1(jVar, iL, iIntValue, null, new Function1() { // from class: com.google.android.tkc
                    public final Object invoke(Object obj) {
                        return skc.b.C0122b.b(arrayList2, arrayList3, arrayList4, intRef, iIntValue, (o.a) obj);
                    }
                }, 4, null);
            }
        }

        @Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J#\u0010\b\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR#\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00108\u0006¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/google/android/skc$b$c", "Lcom/google/android/gkc;", "", "Landroidx/compose/ui/b;", "", "selectedTabIndex", "", "matchContentSize", "a", "(Landroidx/compose/ui/b;IZ)Landroidx/compose/ui/b;", "", "Lcom/google/android/nkc;", "positions", "", "b", "(Ljava/util/List;)V", "Lcom/google/android/o58;", "Lcom/google/android/o58;", "getTabPositions", "()Lcom/google/android/o58;", "tabPositions", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class c implements gkc {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final o58<List<TabPosition>> tabPositions = s0.e(m.p(), null, 2, null);
            final /* synthetic */ xa4<ff3> b;

            c(xa4<ff3> xa4Var) {
                this.b = xa4Var;
            }

            @Override // com.google.inputmethod.gkc
            public androidx.compose.ui.b a(androidx.compose.ui.b bVar, int i, boolean z) {
                return bVar.then(new TabIndicatorModifier(this.tabPositions, i, z, this.b));
            }

            public void b(List<TabPosition> positions) {
                this.tabPositions.setValue(positions);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        b(Function2<? super d, ? super Integer, Unit> function2, Function2<? super d, ? super Integer, Unit> function3, ps4<? super gkc, ? super d, ? super Integer, Unit> ps4Var) {
            this.a = function2;
            this.b = function3;
            this.c = ps4Var;
        }

        public final void a(d dVar, int i) {
            if (!dVar.g((i & 3) != 2, i & 1)) {
                dVar.q();
                return;
            }
            if (e.k()) {
                e.o(830280655, i, -1, "androidx.compose.material3.TabRowImpl.<anonymous> (TabRow.kt:405)");
            }
            xa4 xa4VarB = d08.b(MotionSchemeKeyTokens.DefaultSpatial, dVar, 6);
            Object objR = dVar.R();
            d.Companion companion = d.INSTANCE;
            if (objR == companion.a()) {
                objR = new c(xa4VarB);
                dVar.L(objR);
            }
            c cVar = (c) objR;
            androidx.compose.ui.b bVarH = SizeKt.h(androidx.compose.ui.b.INSTANCE, 0.0f, 1, null);
            List listS = m.s(new Function2[]{this.a, this.b, ko1.e(-1333331860, true, new a(this.c, cVar), dVar, 54)});
            Object objR2 = dVar.R();
            if (objR2 == companion.a()) {
                objR2 = new C0122b(cVar);
                dVar.L(objR2);
            }
            r28 r28Var = (r28) objR2;
            Function2<d, Integer, Unit> function2B = LayoutKt.b(listS);
            Object objR3 = dVar.R();
            if (objR3 == companion.a()) {
                objR3 = t28.a(r28Var);
                dVar.L(objR3);
            }
            ej7 ej7Var = (ej7) objR3;
            int iA = pp1.a(dVar, 0);
            gs1 gs1VarJ = dVar.j();
            androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVar, bVarH);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> function0B = companion2.b();
            if (dVar.G() == null) {
                pp1.d();
            }
            dVar.o();
            if (dVar.getInserting()) {
                dVar.W(function0B);
            } else {
                dVar.k();
            }
            d dVarC = dud.c(dVar);
            dud.i(dVarC, ej7Var, companion2.d());
            dud.i(dVarC, gs1VarJ, companion2.f());
            Function2<ComposeUiNode, Integer, Unit> function2C = companion2.c();
            if (dVarC.getInserting() || !Intrinsics.e(dVarC.R(), Integer.valueOf(iA))) {
                dVarC.L(Integer.valueOf(iA));
                dVarC.e(Integer.valueOf(iA), function2C);
            }
            dud.i(dVarC, bVarE, companion2.e());
            function2B.invoke(dVar, 0);
            dVar.m();
            if (e.k()) {
                e.n();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((d) obj, ((Number) obj2).intValue());
            return Unit.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0115  */
    /* JADX WARN: Code duplicated, block: B:105:0x0121  */
    /* JADX WARN: Code duplicated, block: B:106:0x012a  */
    /* JADX WARN: Code duplicated, block: B:108:0x012d  */
    /* JADX WARN: Code duplicated, block: B:109:0x013d  */
    /* JADX WARN: Code duplicated, block: B:111:0x0140  */
    /* JADX WARN: Code duplicated, block: B:112:0x0151  */
    /* JADX WARN: Code duplicated, block: B:115:0x0164  */
    /* JADX WARN: Code duplicated, block: B:118:0x017e  */
    /* JADX WARN: Code duplicated, block: B:120:0x0189  */
    /* JADX WARN: Code duplicated, block: B:123:0x019a  */
    /* JADX WARN: Code duplicated, block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0043  */
    /* JADX WARN: Code duplicated, block: B:28:0x0047  */
    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x005e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0062  */
    /* JADX WARN: Code duplicated, block: B:41:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x006d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0073  */
    /* JADX WARN: Code duplicated, block: B:48:0x0079  */
    /* JADX WARN: Code duplicated, block: B:50:0x007e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0082  */
    /* JADX WARN: Code duplicated, block: B:54:0x008a  */
    /* JADX WARN: Code duplicated, block: B:55:0x008d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0096  */
    /* JADX WARN: Code duplicated, block: B:61:0x009a  */
    /* JADX WARN: Code duplicated, block: B:63:0x009d  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:77:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:82:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:97:0x0109 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x010b  */
    /* JADX WARN: Code duplicated, block: B:99:0x010e  */
    public static final void c(final int i, androidx.compose.ui.b bVar, long j, long j2, ps4<? super gkc, ? super d, ? super Integer, Unit> ps4Var, Function2<? super d, ? super Integer, Unit> function2, final Function2<? super d, ? super Integer, Unit> function3, d dVar, final int i2, final int i3) {
        int i4;
        long jD;
        long j3;
        int i5;
        ps4<? super gkc, ? super d, ? super Integer, Unit> ps4Var2;
        int i6;
        int i7;
        Function2<? super d, ? super Integer, Unit> function4;
        int i8;
        int i9;
        boolean z;
        d dVar2;
        final androidx.compose.ui.b bVar2;
        final long j4;
        final long j5;
        final ps4<? super gkc, ? super d, ? super Integer, Unit> ps4Var3;
        final Function2<? super d, ? super Integer, Unit> function5;
        s6b s6bVarH;
        androidx.compose.ui.b bVar3;
        long jE;
        ps4<? super gkc, ? super d, ? super Integer, Unit> ps4VarE;
        androidx.compose.ui.b bVar4;
        long j6;
        ps4<? super gkc, ? super d, ? super Integer, Unit> ps4Var4;
        Function2<? super d, ? super Integer, Unit> function2A;
        int i10;
        long j7;
        d dVarF = dVar.F(563434725);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (dVarF.C(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i11 = i3 & 2;
        if (i11 == 0) {
            if ((i2 & 48) == 0) {
                i4 |= dVarF.x(bVar) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                if ((i3 & 4) == 0) {
                    jD = j;
                    int i12 = dVarF.D(jD) ? 256 : 128;
                    i4 |= i12;
                } else {
                    jD = j;
                }
                i4 |= i12;
            } else {
                jD = j;
            }
            if ((i2 & 3072) == 0) {
                if ((i3 & 8) == 0) {
                    j3 = j2;
                    int i13 = dVarF.D(j3) ? 2048 : 1024;
                    i4 |= i13;
                } else {
                    j3 = j2;
                }
                i4 |= i13;
            } else {
                j3 = j2;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                if ((i2 & 24576) == 0) {
                    ps4Var2 = ps4Var;
                    if (dVarF.T(ps4Var2)) {
                        i6 = 16384;
                    } else {
                        i6 = 8192;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 32;
                if (i7 != 0) {
                    if ((196608 & i2) == 0) {
                        function4 = function2;
                        if (dVarF.T(function4)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i4 |= i8;
                    }
                    if ((i3 & 64) != 0) {
                        if ((i2 & 1572864) == 0) {
                            if (dVarF.T(function3)) {
                                i9 = 1048576;
                            } else {
                                i9 = 524288;
                            }
                            i4 |= i9;
                        }
                        if ((i4 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (dVarF.g(z, i4 & 1)) {
                            dVarF.U();
                            if ((i2 & 1) != 0 || dVarF.t()) {
                                if (i11 != 0) {
                                    bVar3 = androidx.compose.ui.b.INSTANCE;
                                } else {
                                    bVar3 = bVar;
                                }
                                if ((i3 & 4) != 0) {
                                    jD = pkc.a.d(dVarF, 6);
                                    i4 &= -897;
                                }
                                if ((i3 & 8) != 0) {
                                    jE = pkc.a.e(dVarF, 6);
                                    i4 &= -7169;
                                } else {
                                    jE = j3;
                                }
                                if (i5 != 0) {
                                    ps4VarE = ko1.e(959948692, true, new a(i), dVarF, 54);
                                } else {
                                    ps4VarE = ps4Var2;
                                }
                                if (i7 != 0) {
                                    bVar4 = bVar3;
                                    j7 = jE;
                                    j6 = jD;
                                    ps4Var4 = ps4VarE;
                                    function2A = np1.a.a();
                                    i10 = 563434725;
                                } else {
                                    bVar4 = bVar3;
                                    j6 = jD;
                                    ps4Var4 = ps4VarE;
                                    function2A = function4;
                                    i10 = 563434725;
                                    j7 = jE;
                                }
                            } else {
                                dVarF.q();
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                }
                                if ((i3 & 8) != 0) {
                                    i4 &= -7169;
                                }
                                bVar4 = bVar;
                                ps4Var4 = ps4Var2;
                                function2A = function4;
                                i10 = 563434725;
                                j6 = jD;
                                j7 = j3;
                            }
                            dVarF.M();
                            if (e.k()) {
                                e.o(i10, i4, -1, "androidx.compose.material3.SecondaryTabRow (TabRow.kt:213)");
                            }
                            dVar2 = dVarF;
                            e(bVar4, j6, j7, ps4Var4, function2A, function3, dVar2, (i4 >> 3) & 524286);
                            if (e.k()) {
                                e.n();
                            }
                            bVar2 = bVar4;
                            j4 = j6;
                            j5 = j7;
                            ps4Var3 = ps4Var4;
                            function5 = function2A;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            bVar2 = bVar;
                            j4 = jD;
                            j5 = j3;
                            ps4Var3 = ps4Var2;
                            function5 = function4;
                        }
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.qkc
                                public final Object invoke(Object obj, Object obj2) {
                                    return skc.d(i, bVar2, j4, j5, ps4Var3, function5, function3, i2, i3, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i4 |= 1572864;
                    if ((i4 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i4 & 1)) {
                        dVarF.U();
                        if ((i2 & 1) != 0) {
                            if (i11 != 0) {
                                bVar3 = androidx.compose.ui.b.INSTANCE;
                            } else {
                                bVar3 = bVar;
                            }
                            if ((i3 & 4) != 0) {
                                jD = pkc.a.d(dVarF, 6);
                                i4 &= -897;
                            }
                            if ((i3 & 8) != 0) {
                                jE = pkc.a.e(dVarF, 6);
                                i4 &= -7169;
                            } else {
                                jE = j3;
                            }
                            if (i5 != 0) {
                                ps4VarE = ko1.e(959948692, true, new a(i), dVarF, 54);
                            } else {
                                ps4VarE = ps4Var2;
                            }
                            if (i7 != 0) {
                                bVar4 = bVar3;
                                j7 = jE;
                                j6 = jD;
                                ps4Var4 = ps4VarE;
                                function2A = np1.a.a();
                                i10 = 563434725;
                            } else {
                                bVar4 = bVar3;
                                j6 = jD;
                                ps4Var4 = ps4VarE;
                                function2A = function4;
                                i10 = 563434725;
                                j7 = jE;
                            }
                        } else {
                            if (i11 != 0) {
                                bVar3 = androidx.compose.ui.b.INSTANCE;
                            } else {
                                bVar3 = bVar;
                            }
                            if ((i3 & 4) != 0) {
                                jD = pkc.a.d(dVarF, 6);
                                i4 &= -897;
                            }
                            if ((i3 & 8) != 0) {
                                jE = pkc.a.e(dVarF, 6);
                                i4 &= -7169;
                            } else {
                                jE = j3;
                            }
                            if (i5 != 0) {
                                ps4VarE = ko1.e(959948692, true, new a(i), dVarF, 54);
                            } else {
                                ps4VarE = ps4Var2;
                            }
                            if (i7 != 0) {
                                bVar4 = bVar3;
                                j7 = jE;
                                j6 = jD;
                                ps4Var4 = ps4VarE;
                                function2A = np1.a.a();
                                i10 = 563434725;
                            } else {
                                bVar4 = bVar3;
                                j6 = jD;
                                ps4Var4 = ps4VarE;
                                function2A = function4;
                                i10 = 563434725;
                                j7 = jE;
                            }
                        }
                        dVarF.M();
                        if (e.k()) {
                            e.o(i10, i4, -1, "androidx.compose.material3.SecondaryTabRow (TabRow.kt:213)");
                        }
                        dVar2 = dVarF;
                        e(bVar4, j6, j7, ps4Var4, function2A, function3, dVar2, (i4 >> 3) & 524286);
                        if (e.k()) {
                            e.n();
                        }
                        bVar2 = bVar4;
                        j4 = j6;
                        j5 = j7;
                        ps4Var3 = ps4Var4;
                        function5 = function2A;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        bVar2 = bVar;
                        j4 = jD;
                        j5 = j3;
                        ps4Var3 = ps4Var2;
                        function5 = function4;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.qkc
                            public final Object invoke(Object obj, Object obj2) {
                                return skc.d(i, bVar2, j4, j5, ps4Var3, function5, function3, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i4 |= 196608;
                function4 = function2;
                if ((i3 & 64) != 0) {
                    if ((i2 & 1572864) == 0) {
                        if (dVarF.T(function3)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i4 |= i9;
                    }
                    if ((i4 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i4 & 1)) {
                        dVarF.U();
                        if ((i2 & 1) != 0) {
                            if (i11 != 0) {
                                bVar3 = androidx.compose.ui.b.INSTANCE;
                            } else {
                                bVar3 = bVar;
                            }
                            if ((i3 & 4) != 0) {
                                jD = pkc.a.d(dVarF, 6);
                                i4 &= -897;
                            }
                            if ((i3 & 8) != 0) {
                                jE = pkc.a.e(dVarF, 6);
                                i4 &= -7169;
                            } else {
                                jE = j3;
                            }
                            if (i5 != 0) {
                                ps4VarE = ko1.e(959948692, true, new a(i), dVarF, 54);
                            } else {
                                ps4VarE = ps4Var2;
                            }
                            if (i7 != 0) {
                                bVar4 = bVar3;
                                j7 = jE;
                                j6 = jD;
                                ps4Var4 = ps4VarE;
                                function2A = np1.a.a();
                                i10 = 563434725;
                            } else {
                                bVar4 = bVar3;
                                j6 = jD;
                                ps4Var4 = ps4VarE;
                                function2A = function4;
                                i10 = 563434725;
                                j7 = jE;
                            }
                        } else {
                            if (i11 != 0) {
                                bVar3 = androidx.compose.ui.b.INSTANCE;
                            } else {
                                bVar3 = bVar;
                            }
                            if ((i3 & 4) != 0) {
                                jD = pkc.a.d(dVarF, 6);
                                i4 &= -897;
                            }
                            if ((i3 & 8) != 0) {
                                jE = pkc.a.e(dVarF, 6);
                                i4 &= -7169;
                            } else {
                                jE = j3;
                            }
                            if (i5 != 0) {
                                ps4VarE = ko1.e(959948692, true, new a(i), dVarF, 54);
                            } else {
                                ps4VarE = ps4Var2;
                            }
                            if (i7 != 0) {
                                bVar4 = bVar3;
                                j7 = jE;
                                j6 = jD;
                                ps4Var4 = ps4VarE;
                                function2A = np1.a.a();
                                i10 = 563434725;
                            } else {
                                bVar4 = bVar3;
                                j6 = jD;
                                ps4Var4 = ps4VarE;
                                function2A = function4;
                                i10 = 563434725;
                                j7 = jE;
                            }
                        }
                        dVarF.M();
                        if (e.k()) {
                            e.o(i10, i4, -1, "androidx.compose.material3.SecondaryTabRow (TabRow.kt:213)");
                        }
                        dVar2 = dVarF;
                        e(bVar4, j6, j7, ps4Var4, function2A, function3, dVar2, (i4 >> 3) & 524286);
                        if (e.k()) {
                            e.n();
                        }
                        bVar2 = bVar4;
                        j4 = j6;
                        j5 = j7;
                        ps4Var3 = ps4Var4;
                        function5 = function2A;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        bVar2 = bVar;
                        j4 = jD;
                        j5 = j3;
                        ps4Var3 = ps4Var2;
                        function5 = function4;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.qkc
                            public final Object invoke(Object obj, Object obj2) {
                                return skc.d(i, bVar2, j4, j5, ps4Var3, function5, function3, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i4 |= 1572864;
                if ((i4 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i4 & 1)) {
                    dVarF.U();
                    if ((i2 & 1) != 0) {
                        if (i11 != 0) {
                            bVar3 = androidx.compose.ui.b.INSTANCE;
                        } else {
                            bVar3 = bVar;
                        }
                        if ((i3 & 4) != 0) {
                            jD = pkc.a.d(dVarF, 6);
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            jE = pkc.a.e(dVarF, 6);
                            i4 &= -7169;
                        } else {
                            jE = j3;
                        }
                        if (i5 != 0) {
                            ps4VarE = ko1.e(959948692, true, new a(i), dVarF, 54);
                        } else {
                            ps4VarE = ps4Var2;
                        }
                        if (i7 != 0) {
                            bVar4 = bVar3;
                            j7 = jE;
                            j6 = jD;
                            ps4Var4 = ps4VarE;
                            function2A = np1.a.a();
                            i10 = 563434725;
                        } else {
                            bVar4 = bVar3;
                            j6 = jD;
                            ps4Var4 = ps4VarE;
                            function2A = function4;
                            i10 = 563434725;
                            j7 = jE;
                        }
                    } else {
                        if (i11 != 0) {
                            bVar3 = androidx.compose.ui.b.INSTANCE;
                        } else {
                            bVar3 = bVar;
                        }
                        if ((i3 & 4) != 0) {
                            jD = pkc.a.d(dVarF, 6);
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            jE = pkc.a.e(dVarF, 6);
                            i4 &= -7169;
                        } else {
                            jE = j3;
                        }
                        if (i5 != 0) {
                            ps4VarE = ko1.e(959948692, true, new a(i), dVarF, 54);
                        } else {
                            ps4VarE = ps4Var2;
                        }
                        if (i7 != 0) {
                            bVar4 = bVar3;
                            j7 = jE;
                            j6 = jD;
                            ps4Var4 = ps4VarE;
                            function2A = np1.a.a();
                            i10 = 563434725;
                        } else {
                            bVar4 = bVar3;
                            j6 = jD;
                            ps4Var4 = ps4VarE;
                            function2A = function4;
                            i10 = 563434725;
                            j7 = jE;
                        }
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(i10, i4, -1, "androidx.compose.material3.SecondaryTabRow (TabRow.kt:213)");
                    }
                    dVar2 = dVarF;
                    e(bVar4, j6, j7, ps4Var4, function2A, function3, dVar2, (i4 >> 3) & 524286);
                    if (e.k()) {
                        e.n();
                    }
                    bVar2 = bVar4;
                    j4 = j6;
                    j5 = j7;
                    ps4Var3 = ps4Var4;
                    function5 = function2A;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    bVar2 = bVar;
                    j4 = jD;
                    j5 = j3;
                    ps4Var3 = ps4Var2;
                    function5 = function4;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.qkc
                        public final Object invoke(Object obj, Object obj2) {
                            return skc.d(i, bVar2, j4, j5, ps4Var3, function5, function3, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 24576;
            ps4Var2 = ps4Var;
            i7 = i3 & 32;
            if (i7 != 0) {
                if ((196608 & i2) == 0) {
                    function4 = function2;
                    if (dVarF.T(function4)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i4 |= i8;
                }
                if ((i3 & 64) != 0) {
                    if ((i2 & 1572864) == 0) {
                        if (dVarF.T(function3)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i4 |= i9;
                    }
                    if ((i4 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i4 & 1)) {
                        dVarF.U();
                        if ((i2 & 1) != 0) {
                            if (i11 != 0) {
                                bVar3 = androidx.compose.ui.b.INSTANCE;
                            } else {
                                bVar3 = bVar;
                            }
                            if ((i3 & 4) != 0) {
                                jD = pkc.a.d(dVarF, 6);
                                i4 &= -897;
                            }
                            if ((i3 & 8) != 0) {
                                jE = pkc.a.e(dVarF, 6);
                                i4 &= -7169;
                            } else {
                                jE = j3;
                            }
                            if (i5 != 0) {
                                ps4VarE = ko1.e(959948692, true, new a(i), dVarF, 54);
                            } else {
                                ps4VarE = ps4Var2;
                            }
                            if (i7 != 0) {
                                bVar4 = bVar3;
                                j7 = jE;
                                j6 = jD;
                                ps4Var4 = ps4VarE;
                                function2A = np1.a.a();
                                i10 = 563434725;
                            } else {
                                bVar4 = bVar3;
                                j6 = jD;
                                ps4Var4 = ps4VarE;
                                function2A = function4;
                                i10 = 563434725;
                                j7 = jE;
                            }
                        } else {
                            if (i11 != 0) {
                                bVar3 = androidx.compose.ui.b.INSTANCE;
                            } else {
                                bVar3 = bVar;
                            }
                            if ((i3 & 4) != 0) {
                                jD = pkc.a.d(dVarF, 6);
                                i4 &= -897;
                            }
                            if ((i3 & 8) != 0) {
                                jE = pkc.a.e(dVarF, 6);
                                i4 &= -7169;
                            } else {
                                jE = j3;
                            }
                            if (i5 != 0) {
                                ps4VarE = ko1.e(959948692, true, new a(i), dVarF, 54);
                            } else {
                                ps4VarE = ps4Var2;
                            }
                            if (i7 != 0) {
                                bVar4 = bVar3;
                                j7 = jE;
                                j6 = jD;
                                ps4Var4 = ps4VarE;
                                function2A = np1.a.a();
                                i10 = 563434725;
                            } else {
                                bVar4 = bVar3;
                                j6 = jD;
                                ps4Var4 = ps4VarE;
                                function2A = function4;
                                i10 = 563434725;
                                j7 = jE;
                            }
                        }
                        dVarF.M();
                        if (e.k()) {
                            e.o(i10, i4, -1, "androidx.compose.material3.SecondaryTabRow (TabRow.kt:213)");
                        }
                        dVar2 = dVarF;
                        e(bVar4, j6, j7, ps4Var4, function2A, function3, dVar2, (i4 >> 3) & 524286);
                        if (e.k()) {
                            e.n();
                        }
                        bVar2 = bVar4;
                        j4 = j6;
                        j5 = j7;
                        ps4Var3 = ps4Var4;
                        function5 = function2A;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        bVar2 = bVar;
                        j4 = jD;
                        j5 = j3;
                        ps4Var3 = ps4Var2;
                        function5 = function4;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.qkc
                            public final Object invoke(Object obj, Object obj2) {
                                return skc.d(i, bVar2, j4, j5, ps4Var3, function5, function3, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i4 |= 1572864;
                if ((i4 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i4 & 1)) {
                    dVarF.U();
                    if ((i2 & 1) != 0) {
                        if (i11 != 0) {
                            bVar3 = androidx.compose.ui.b.INSTANCE;
                        } else {
                            bVar3 = bVar;
                        }
                        if ((i3 & 4) != 0) {
                            jD = pkc.a.d(dVarF, 6);
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            jE = pkc.a.e(dVarF, 6);
                            i4 &= -7169;
                        } else {
                            jE = j3;
                        }
                        if (i5 != 0) {
                            ps4VarE = ko1.e(959948692, true, new a(i), dVarF, 54);
                        } else {
                            ps4VarE = ps4Var2;
                        }
                        if (i7 != 0) {
                            bVar4 = bVar3;
                            j7 = jE;
                            j6 = jD;
                            ps4Var4 = ps4VarE;
                            function2A = np1.a.a();
                            i10 = 563434725;
                        } else {
                            bVar4 = bVar3;
                            j6 = jD;
                            ps4Var4 = ps4VarE;
                            function2A = function4;
                            i10 = 563434725;
                            j7 = jE;
                        }
                    } else {
                        if (i11 != 0) {
                            bVar3 = androidx.compose.ui.b.INSTANCE;
                        } else {
                            bVar3 = bVar;
                        }
                        if ((i3 & 4) != 0) {
                            jD = pkc.a.d(dVarF, 6);
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            jE = pkc.a.e(dVarF, 6);
                            i4 &= -7169;
                        } else {
                            jE = j3;
                        }
                        if (i5 != 0) {
                            ps4VarE = ko1.e(959948692, true, new a(i), dVarF, 54);
                        } else {
                            ps4VarE = ps4Var2;
                        }
                        if (i7 != 0) {
                            bVar4 = bVar3;
                            j7 = jE;
                            j6 = jD;
                            ps4Var4 = ps4VarE;
                            function2A = np1.a.a();
                            i10 = 563434725;
                        } else {
                            bVar4 = bVar3;
                            j6 = jD;
                            ps4Var4 = ps4VarE;
                            function2A = function4;
                            i10 = 563434725;
                            j7 = jE;
                        }
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(i10, i4, -1, "androidx.compose.material3.SecondaryTabRow (TabRow.kt:213)");
                    }
                    dVar2 = dVarF;
                    e(bVar4, j6, j7, ps4Var4, function2A, function3, dVar2, (i4 >> 3) & 524286);
                    if (e.k()) {
                        e.n();
                    }
                    bVar2 = bVar4;
                    j4 = j6;
                    j5 = j7;
                    ps4Var3 = ps4Var4;
                    function5 = function2A;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    bVar2 = bVar;
                    j4 = jD;
                    j5 = j3;
                    ps4Var3 = ps4Var2;
                    function5 = function4;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.qkc
                        public final Object invoke(Object obj, Object obj2) {
                            return skc.d(i, bVar2, j4, j5, ps4Var3, function5, function3, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 196608;
            function4 = function2;
            if ((i3 & 64) != 0) {
                if ((i2 & 1572864) == 0) {
                    if (dVarF.T(function3)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i4 |= i9;
                }
                if ((i4 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i4 & 1)) {
                    dVarF.U();
                    if ((i2 & 1) != 0) {
                        if (i11 != 0) {
                            bVar3 = androidx.compose.ui.b.INSTANCE;
                        } else {
                            bVar3 = bVar;
                        }
                        if ((i3 & 4) != 0) {
                            jD = pkc.a.d(dVarF, 6);
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            jE = pkc.a.e(dVarF, 6);
                            i4 &= -7169;
                        } else {
                            jE = j3;
                        }
                        if (i5 != 0) {
                            ps4VarE = ko1.e(959948692, true, new a(i), dVarF, 54);
                        } else {
                            ps4VarE = ps4Var2;
                        }
                        if (i7 != 0) {
                            bVar4 = bVar3;
                            j7 = jE;
                            j6 = jD;
                            ps4Var4 = ps4VarE;
                            function2A = np1.a.a();
                            i10 = 563434725;
                        } else {
                            bVar4 = bVar3;
                            j6 = jD;
                            ps4Var4 = ps4VarE;
                            function2A = function4;
                            i10 = 563434725;
                            j7 = jE;
                        }
                    } else {
                        if (i11 != 0) {
                            bVar3 = androidx.compose.ui.b.INSTANCE;
                        } else {
                            bVar3 = bVar;
                        }
                        if ((i3 & 4) != 0) {
                            jD = pkc.a.d(dVarF, 6);
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            jE = pkc.a.e(dVarF, 6);
                            i4 &= -7169;
                        } else {
                            jE = j3;
                        }
                        if (i5 != 0) {
                            ps4VarE = ko1.e(959948692, true, new a(i), dVarF, 54);
                        } else {
                            ps4VarE = ps4Var2;
                        }
                        if (i7 != 0) {
                            bVar4 = bVar3;
                            j7 = jE;
                            j6 = jD;
                            ps4Var4 = ps4VarE;
                            function2A = np1.a.a();
                            i10 = 563434725;
                        } else {
                            bVar4 = bVar3;
                            j6 = jD;
                            ps4Var4 = ps4VarE;
                            function2A = function4;
                            i10 = 563434725;
                            j7 = jE;
                        }
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(i10, i4, -1, "androidx.compose.material3.SecondaryTabRow (TabRow.kt:213)");
                    }
                    dVar2 = dVarF;
                    e(bVar4, j6, j7, ps4Var4, function2A, function3, dVar2, (i4 >> 3) & 524286);
                    if (e.k()) {
                        e.n();
                    }
                    bVar2 = bVar4;
                    j4 = j6;
                    j5 = j7;
                    ps4Var3 = ps4Var4;
                    function5 = function2A;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    bVar2 = bVar;
                    j4 = jD;
                    j5 = j3;
                    ps4Var3 = ps4Var2;
                    function5 = function4;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.qkc
                        public final Object invoke(Object obj, Object obj2) {
                            return skc.d(i, bVar2, j4, j5, ps4Var3, function5, function3, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 1572864;
            if ((i4 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i4 & 1)) {
                dVarF.U();
                if ((i2 & 1) != 0) {
                    if (i11 != 0) {
                        bVar3 = androidx.compose.ui.b.INSTANCE;
                    } else {
                        bVar3 = bVar;
                    }
                    if ((i3 & 4) != 0) {
                        jD = pkc.a.d(dVarF, 6);
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jE = pkc.a.e(dVarF, 6);
                        i4 &= -7169;
                    } else {
                        jE = j3;
                    }
                    if (i5 != 0) {
                        ps4VarE = ko1.e(959948692, true, new a(i), dVarF, 54);
                    } else {
                        ps4VarE = ps4Var2;
                    }
                    if (i7 != 0) {
                        bVar4 = bVar3;
                        j7 = jE;
                        j6 = jD;
                        ps4Var4 = ps4VarE;
                        function2A = np1.a.a();
                        i10 = 563434725;
                    } else {
                        bVar4 = bVar3;
                        j6 = jD;
                        ps4Var4 = ps4VarE;
                        function2A = function4;
                        i10 = 563434725;
                        j7 = jE;
                    }
                } else {
                    if (i11 != 0) {
                        bVar3 = androidx.compose.ui.b.INSTANCE;
                    } else {
                        bVar3 = bVar;
                    }
                    if ((i3 & 4) != 0) {
                        jD = pkc.a.d(dVarF, 6);
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jE = pkc.a.e(dVarF, 6);
                        i4 &= -7169;
                    } else {
                        jE = j3;
                    }
                    if (i5 != 0) {
                        ps4VarE = ko1.e(959948692, true, new a(i), dVarF, 54);
                    } else {
                        ps4VarE = ps4Var2;
                    }
                    if (i7 != 0) {
                        bVar4 = bVar3;
                        j7 = jE;
                        j6 = jD;
                        ps4Var4 = ps4VarE;
                        function2A = np1.a.a();
                        i10 = 563434725;
                    } else {
                        bVar4 = bVar3;
                        j6 = jD;
                        ps4Var4 = ps4VarE;
                        function2A = function4;
                        i10 = 563434725;
                        j7 = jE;
                    }
                }
                dVarF.M();
                if (e.k()) {
                    e.o(i10, i4, -1, "androidx.compose.material3.SecondaryTabRow (TabRow.kt:213)");
                }
                dVar2 = dVarF;
                e(bVar4, j6, j7, ps4Var4, function2A, function3, dVar2, (i4 >> 3) & 524286);
                if (e.k()) {
                    e.n();
                }
                bVar2 = bVar4;
                j4 = j6;
                j5 = j7;
                ps4Var3 = ps4Var4;
                function5 = function2A;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                bVar2 = bVar;
                j4 = jD;
                j5 = j3;
                ps4Var3 = ps4Var2;
                function5 = function4;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.qkc
                    public final Object invoke(Object obj, Object obj2) {
                        return skc.d(i, bVar2, j4, j5, ps4Var3, function5, function3, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 48;
        if ((i2 & 384) == 0) {
            if ((i3 & 4) == 0) {
                jD = j;
                if (dVarF.D(jD)) {
                }
                i4 |= i12;
            } else {
                jD = j;
            }
            i4 |= i12;
        } else {
            jD = j;
        }
        if ((i2 & 3072) == 0) {
            if ((i3 & 8) == 0) {
                j3 = j2;
                if (dVarF.D(j3)) {
                }
                i4 |= i13;
            } else {
                j3 = j2;
            }
            i4 |= i13;
        } else {
            j3 = j2;
        }
        i5 = i3 & 16;
        if (i5 != 0) {
            if ((i2 & 24576) == 0) {
                ps4Var2 = ps4Var;
                if (dVarF.T(ps4Var2)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i4 |= i6;
            }
            i7 = i3 & 32;
            if (i7 != 0) {
                if ((196608 & i2) == 0) {
                    function4 = function2;
                    if (dVarF.T(function4)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i4 |= i8;
                }
                if ((i3 & 64) != 0) {
                    if ((i2 & 1572864) == 0) {
                        if (dVarF.T(function3)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i4 |= i9;
                    }
                    if ((i4 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i4 & 1)) {
                        dVarF.U();
                        if ((i2 & 1) != 0) {
                            if (i11 != 0) {
                                bVar3 = androidx.compose.ui.b.INSTANCE;
                            } else {
                                bVar3 = bVar;
                            }
                            if ((i3 & 4) != 0) {
                                jD = pkc.a.d(dVarF, 6);
                                i4 &= -897;
                            }
                            if ((i3 & 8) != 0) {
                                jE = pkc.a.e(dVarF, 6);
                                i4 &= -7169;
                            } else {
                                jE = j3;
                            }
                            if (i5 != 0) {
                                ps4VarE = ko1.e(959948692, true, new a(i), dVarF, 54);
                            } else {
                                ps4VarE = ps4Var2;
                            }
                            if (i7 != 0) {
                                bVar4 = bVar3;
                                j7 = jE;
                                j6 = jD;
                                ps4Var4 = ps4VarE;
                                function2A = np1.a.a();
                                i10 = 563434725;
                            } else {
                                bVar4 = bVar3;
                                j6 = jD;
                                ps4Var4 = ps4VarE;
                                function2A = function4;
                                i10 = 563434725;
                                j7 = jE;
                            }
                        } else {
                            if (i11 != 0) {
                                bVar3 = androidx.compose.ui.b.INSTANCE;
                            } else {
                                bVar3 = bVar;
                            }
                            if ((i3 & 4) != 0) {
                                jD = pkc.a.d(dVarF, 6);
                                i4 &= -897;
                            }
                            if ((i3 & 8) != 0) {
                                jE = pkc.a.e(dVarF, 6);
                                i4 &= -7169;
                            } else {
                                jE = j3;
                            }
                            if (i5 != 0) {
                                ps4VarE = ko1.e(959948692, true, new a(i), dVarF, 54);
                            } else {
                                ps4VarE = ps4Var2;
                            }
                            if (i7 != 0) {
                                bVar4 = bVar3;
                                j7 = jE;
                                j6 = jD;
                                ps4Var4 = ps4VarE;
                                function2A = np1.a.a();
                                i10 = 563434725;
                            } else {
                                bVar4 = bVar3;
                                j6 = jD;
                                ps4Var4 = ps4VarE;
                                function2A = function4;
                                i10 = 563434725;
                                j7 = jE;
                            }
                        }
                        dVarF.M();
                        if (e.k()) {
                            e.o(i10, i4, -1, "androidx.compose.material3.SecondaryTabRow (TabRow.kt:213)");
                        }
                        dVar2 = dVarF;
                        e(bVar4, j6, j7, ps4Var4, function2A, function3, dVar2, (i4 >> 3) & 524286);
                        if (e.k()) {
                            e.n();
                        }
                        bVar2 = bVar4;
                        j4 = j6;
                        j5 = j7;
                        ps4Var3 = ps4Var4;
                        function5 = function2A;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        bVar2 = bVar;
                        j4 = jD;
                        j5 = j3;
                        ps4Var3 = ps4Var2;
                        function5 = function4;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.qkc
                            public final Object invoke(Object obj, Object obj2) {
                                return skc.d(i, bVar2, j4, j5, ps4Var3, function5, function3, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i4 |= 1572864;
                if ((i4 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i4 & 1)) {
                    dVarF.U();
                    if ((i2 & 1) != 0) {
                        if (i11 != 0) {
                            bVar3 = androidx.compose.ui.b.INSTANCE;
                        } else {
                            bVar3 = bVar;
                        }
                        if ((i3 & 4) != 0) {
                            jD = pkc.a.d(dVarF, 6);
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            jE = pkc.a.e(dVarF, 6);
                            i4 &= -7169;
                        } else {
                            jE = j3;
                        }
                        if (i5 != 0) {
                            ps4VarE = ko1.e(959948692, true, new a(i), dVarF, 54);
                        } else {
                            ps4VarE = ps4Var2;
                        }
                        if (i7 != 0) {
                            bVar4 = bVar3;
                            j7 = jE;
                            j6 = jD;
                            ps4Var4 = ps4VarE;
                            function2A = np1.a.a();
                            i10 = 563434725;
                        } else {
                            bVar4 = bVar3;
                            j6 = jD;
                            ps4Var4 = ps4VarE;
                            function2A = function4;
                            i10 = 563434725;
                            j7 = jE;
                        }
                    } else {
                        if (i11 != 0) {
                            bVar3 = androidx.compose.ui.b.INSTANCE;
                        } else {
                            bVar3 = bVar;
                        }
                        if ((i3 & 4) != 0) {
                            jD = pkc.a.d(dVarF, 6);
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            jE = pkc.a.e(dVarF, 6);
                            i4 &= -7169;
                        } else {
                            jE = j3;
                        }
                        if (i5 != 0) {
                            ps4VarE = ko1.e(959948692, true, new a(i), dVarF, 54);
                        } else {
                            ps4VarE = ps4Var2;
                        }
                        if (i7 != 0) {
                            bVar4 = bVar3;
                            j7 = jE;
                            j6 = jD;
                            ps4Var4 = ps4VarE;
                            function2A = np1.a.a();
                            i10 = 563434725;
                        } else {
                            bVar4 = bVar3;
                            j6 = jD;
                            ps4Var4 = ps4VarE;
                            function2A = function4;
                            i10 = 563434725;
                            j7 = jE;
                        }
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(i10, i4, -1, "androidx.compose.material3.SecondaryTabRow (TabRow.kt:213)");
                    }
                    dVar2 = dVarF;
                    e(bVar4, j6, j7, ps4Var4, function2A, function3, dVar2, (i4 >> 3) & 524286);
                    if (e.k()) {
                        e.n();
                    }
                    bVar2 = bVar4;
                    j4 = j6;
                    j5 = j7;
                    ps4Var3 = ps4Var4;
                    function5 = function2A;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    bVar2 = bVar;
                    j4 = jD;
                    j5 = j3;
                    ps4Var3 = ps4Var2;
                    function5 = function4;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.qkc
                        public final Object invoke(Object obj, Object obj2) {
                            return skc.d(i, bVar2, j4, j5, ps4Var3, function5, function3, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 196608;
            function4 = function2;
            if ((i3 & 64) != 0) {
                if ((i2 & 1572864) == 0) {
                    if (dVarF.T(function3)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i4 |= i9;
                }
                if ((i4 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i4 & 1)) {
                    dVarF.U();
                    if ((i2 & 1) != 0) {
                        if (i11 != 0) {
                            bVar3 = androidx.compose.ui.b.INSTANCE;
                        } else {
                            bVar3 = bVar;
                        }
                        if ((i3 & 4) != 0) {
                            jD = pkc.a.d(dVarF, 6);
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            jE = pkc.a.e(dVarF, 6);
                            i4 &= -7169;
                        } else {
                            jE = j3;
                        }
                        if (i5 != 0) {
                            ps4VarE = ko1.e(959948692, true, new a(i), dVarF, 54);
                        } else {
                            ps4VarE = ps4Var2;
                        }
                        if (i7 != 0) {
                            bVar4 = bVar3;
                            j7 = jE;
                            j6 = jD;
                            ps4Var4 = ps4VarE;
                            function2A = np1.a.a();
                            i10 = 563434725;
                        } else {
                            bVar4 = bVar3;
                            j6 = jD;
                            ps4Var4 = ps4VarE;
                            function2A = function4;
                            i10 = 563434725;
                            j7 = jE;
                        }
                    } else {
                        if (i11 != 0) {
                            bVar3 = androidx.compose.ui.b.INSTANCE;
                        } else {
                            bVar3 = bVar;
                        }
                        if ((i3 & 4) != 0) {
                            jD = pkc.a.d(dVarF, 6);
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            jE = pkc.a.e(dVarF, 6);
                            i4 &= -7169;
                        } else {
                            jE = j3;
                        }
                        if (i5 != 0) {
                            ps4VarE = ko1.e(959948692, true, new a(i), dVarF, 54);
                        } else {
                            ps4VarE = ps4Var2;
                        }
                        if (i7 != 0) {
                            bVar4 = bVar3;
                            j7 = jE;
                            j6 = jD;
                            ps4Var4 = ps4VarE;
                            function2A = np1.a.a();
                            i10 = 563434725;
                        } else {
                            bVar4 = bVar3;
                            j6 = jD;
                            ps4Var4 = ps4VarE;
                            function2A = function4;
                            i10 = 563434725;
                            j7 = jE;
                        }
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(i10, i4, -1, "androidx.compose.material3.SecondaryTabRow (TabRow.kt:213)");
                    }
                    dVar2 = dVarF;
                    e(bVar4, j6, j7, ps4Var4, function2A, function3, dVar2, (i4 >> 3) & 524286);
                    if (e.k()) {
                        e.n();
                    }
                    bVar2 = bVar4;
                    j4 = j6;
                    j5 = j7;
                    ps4Var3 = ps4Var4;
                    function5 = function2A;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    bVar2 = bVar;
                    j4 = jD;
                    j5 = j3;
                    ps4Var3 = ps4Var2;
                    function5 = function4;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.qkc
                        public final Object invoke(Object obj, Object obj2) {
                            return skc.d(i, bVar2, j4, j5, ps4Var3, function5, function3, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 1572864;
            if ((i4 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i4 & 1)) {
                dVarF.U();
                if ((i2 & 1) != 0) {
                    if (i11 != 0) {
                        bVar3 = androidx.compose.ui.b.INSTANCE;
                    } else {
                        bVar3 = bVar;
                    }
                    if ((i3 & 4) != 0) {
                        jD = pkc.a.d(dVarF, 6);
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jE = pkc.a.e(dVarF, 6);
                        i4 &= -7169;
                    } else {
                        jE = j3;
                    }
                    if (i5 != 0) {
                        ps4VarE = ko1.e(959948692, true, new a(i), dVarF, 54);
                    } else {
                        ps4VarE = ps4Var2;
                    }
                    if (i7 != 0) {
                        bVar4 = bVar3;
                        j7 = jE;
                        j6 = jD;
                        ps4Var4 = ps4VarE;
                        function2A = np1.a.a();
                        i10 = 563434725;
                    } else {
                        bVar4 = bVar3;
                        j6 = jD;
                        ps4Var4 = ps4VarE;
                        function2A = function4;
                        i10 = 563434725;
                        j7 = jE;
                    }
                } else {
                    if (i11 != 0) {
                        bVar3 = androidx.compose.ui.b.INSTANCE;
                    } else {
                        bVar3 = bVar;
                    }
                    if ((i3 & 4) != 0) {
                        jD = pkc.a.d(dVarF, 6);
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jE = pkc.a.e(dVarF, 6);
                        i4 &= -7169;
                    } else {
                        jE = j3;
                    }
                    if (i5 != 0) {
                        ps4VarE = ko1.e(959948692, true, new a(i), dVarF, 54);
                    } else {
                        ps4VarE = ps4Var2;
                    }
                    if (i7 != 0) {
                        bVar4 = bVar3;
                        j7 = jE;
                        j6 = jD;
                        ps4Var4 = ps4VarE;
                        function2A = np1.a.a();
                        i10 = 563434725;
                    } else {
                        bVar4 = bVar3;
                        j6 = jD;
                        ps4Var4 = ps4VarE;
                        function2A = function4;
                        i10 = 563434725;
                        j7 = jE;
                    }
                }
                dVarF.M();
                if (e.k()) {
                    e.o(i10, i4, -1, "androidx.compose.material3.SecondaryTabRow (TabRow.kt:213)");
                }
                dVar2 = dVarF;
                e(bVar4, j6, j7, ps4Var4, function2A, function3, dVar2, (i4 >> 3) & 524286);
                if (e.k()) {
                    e.n();
                }
                bVar2 = bVar4;
                j4 = j6;
                j5 = j7;
                ps4Var3 = ps4Var4;
                function5 = function2A;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                bVar2 = bVar;
                j4 = jD;
                j5 = j3;
                ps4Var3 = ps4Var2;
                function5 = function4;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.qkc
                    public final Object invoke(Object obj, Object obj2) {
                        return skc.d(i, bVar2, j4, j5, ps4Var3, function5, function3, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 24576;
        ps4Var2 = ps4Var;
        i7 = i3 & 32;
        if (i7 != 0) {
            if ((196608 & i2) == 0) {
                function4 = function2;
                if (dVarF.T(function4)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i4 |= i8;
            }
            if ((i3 & 64) != 0) {
                if ((i2 & 1572864) == 0) {
                    if (dVarF.T(function3)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i4 |= i9;
                }
                if ((i4 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i4 & 1)) {
                    dVarF.U();
                    if ((i2 & 1) != 0) {
                        if (i11 != 0) {
                            bVar3 = androidx.compose.ui.b.INSTANCE;
                        } else {
                            bVar3 = bVar;
                        }
                        if ((i3 & 4) != 0) {
                            jD = pkc.a.d(dVarF, 6);
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            jE = pkc.a.e(dVarF, 6);
                            i4 &= -7169;
                        } else {
                            jE = j3;
                        }
                        if (i5 != 0) {
                            ps4VarE = ko1.e(959948692, true, new a(i), dVarF, 54);
                        } else {
                            ps4VarE = ps4Var2;
                        }
                        if (i7 != 0) {
                            bVar4 = bVar3;
                            j7 = jE;
                            j6 = jD;
                            ps4Var4 = ps4VarE;
                            function2A = np1.a.a();
                            i10 = 563434725;
                        } else {
                            bVar4 = bVar3;
                            j6 = jD;
                            ps4Var4 = ps4VarE;
                            function2A = function4;
                            i10 = 563434725;
                            j7 = jE;
                        }
                    } else {
                        if (i11 != 0) {
                            bVar3 = androidx.compose.ui.b.INSTANCE;
                        } else {
                            bVar3 = bVar;
                        }
                        if ((i3 & 4) != 0) {
                            jD = pkc.a.d(dVarF, 6);
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            jE = pkc.a.e(dVarF, 6);
                            i4 &= -7169;
                        } else {
                            jE = j3;
                        }
                        if (i5 != 0) {
                            ps4VarE = ko1.e(959948692, true, new a(i), dVarF, 54);
                        } else {
                            ps4VarE = ps4Var2;
                        }
                        if (i7 != 0) {
                            bVar4 = bVar3;
                            j7 = jE;
                            j6 = jD;
                            ps4Var4 = ps4VarE;
                            function2A = np1.a.a();
                            i10 = 563434725;
                        } else {
                            bVar4 = bVar3;
                            j6 = jD;
                            ps4Var4 = ps4VarE;
                            function2A = function4;
                            i10 = 563434725;
                            j7 = jE;
                        }
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(i10, i4, -1, "androidx.compose.material3.SecondaryTabRow (TabRow.kt:213)");
                    }
                    dVar2 = dVarF;
                    e(bVar4, j6, j7, ps4Var4, function2A, function3, dVar2, (i4 >> 3) & 524286);
                    if (e.k()) {
                        e.n();
                    }
                    bVar2 = bVar4;
                    j4 = j6;
                    j5 = j7;
                    ps4Var3 = ps4Var4;
                    function5 = function2A;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    bVar2 = bVar;
                    j4 = jD;
                    j5 = j3;
                    ps4Var3 = ps4Var2;
                    function5 = function4;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.qkc
                        public final Object invoke(Object obj, Object obj2) {
                            return skc.d(i, bVar2, j4, j5, ps4Var3, function5, function3, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 1572864;
            if ((i4 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i4 & 1)) {
                dVarF.U();
                if ((i2 & 1) != 0) {
                    if (i11 != 0) {
                        bVar3 = androidx.compose.ui.b.INSTANCE;
                    } else {
                        bVar3 = bVar;
                    }
                    if ((i3 & 4) != 0) {
                        jD = pkc.a.d(dVarF, 6);
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jE = pkc.a.e(dVarF, 6);
                        i4 &= -7169;
                    } else {
                        jE = j3;
                    }
                    if (i5 != 0) {
                        ps4VarE = ko1.e(959948692, true, new a(i), dVarF, 54);
                    } else {
                        ps4VarE = ps4Var2;
                    }
                    if (i7 != 0) {
                        bVar4 = bVar3;
                        j7 = jE;
                        j6 = jD;
                        ps4Var4 = ps4VarE;
                        function2A = np1.a.a();
                        i10 = 563434725;
                    } else {
                        bVar4 = bVar3;
                        j6 = jD;
                        ps4Var4 = ps4VarE;
                        function2A = function4;
                        i10 = 563434725;
                        j7 = jE;
                    }
                } else {
                    if (i11 != 0) {
                        bVar3 = androidx.compose.ui.b.INSTANCE;
                    } else {
                        bVar3 = bVar;
                    }
                    if ((i3 & 4) != 0) {
                        jD = pkc.a.d(dVarF, 6);
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jE = pkc.a.e(dVarF, 6);
                        i4 &= -7169;
                    } else {
                        jE = j3;
                    }
                    if (i5 != 0) {
                        ps4VarE = ko1.e(959948692, true, new a(i), dVarF, 54);
                    } else {
                        ps4VarE = ps4Var2;
                    }
                    if (i7 != 0) {
                        bVar4 = bVar3;
                        j7 = jE;
                        j6 = jD;
                        ps4Var4 = ps4VarE;
                        function2A = np1.a.a();
                        i10 = 563434725;
                    } else {
                        bVar4 = bVar3;
                        j6 = jD;
                        ps4Var4 = ps4VarE;
                        function2A = function4;
                        i10 = 563434725;
                        j7 = jE;
                    }
                }
                dVarF.M();
                if (e.k()) {
                    e.o(i10, i4, -1, "androidx.compose.material3.SecondaryTabRow (TabRow.kt:213)");
                }
                dVar2 = dVarF;
                e(bVar4, j6, j7, ps4Var4, function2A, function3, dVar2, (i4 >> 3) & 524286);
                if (e.k()) {
                    e.n();
                }
                bVar2 = bVar4;
                j4 = j6;
                j5 = j7;
                ps4Var3 = ps4Var4;
                function5 = function2A;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                bVar2 = bVar;
                j4 = jD;
                j5 = j3;
                ps4Var3 = ps4Var2;
                function5 = function4;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.qkc
                    public final Object invoke(Object obj, Object obj2) {
                        return skc.d(i, bVar2, j4, j5, ps4Var3, function5, function3, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 196608;
        function4 = function2;
        if ((i3 & 64) != 0) {
            if ((i2 & 1572864) == 0) {
                if (dVarF.T(function3)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i4 |= i9;
            }
            if ((i4 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i4 & 1)) {
                dVarF.U();
                if ((i2 & 1) != 0) {
                    if (i11 != 0) {
                        bVar3 = androidx.compose.ui.b.INSTANCE;
                    } else {
                        bVar3 = bVar;
                    }
                    if ((i3 & 4) != 0) {
                        jD = pkc.a.d(dVarF, 6);
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jE = pkc.a.e(dVarF, 6);
                        i4 &= -7169;
                    } else {
                        jE = j3;
                    }
                    if (i5 != 0) {
                        ps4VarE = ko1.e(959948692, true, new a(i), dVarF, 54);
                    } else {
                        ps4VarE = ps4Var2;
                    }
                    if (i7 != 0) {
                        bVar4 = bVar3;
                        j7 = jE;
                        j6 = jD;
                        ps4Var4 = ps4VarE;
                        function2A = np1.a.a();
                        i10 = 563434725;
                    } else {
                        bVar4 = bVar3;
                        j6 = jD;
                        ps4Var4 = ps4VarE;
                        function2A = function4;
                        i10 = 563434725;
                        j7 = jE;
                    }
                } else {
                    if (i11 != 0) {
                        bVar3 = androidx.compose.ui.b.INSTANCE;
                    } else {
                        bVar3 = bVar;
                    }
                    if ((i3 & 4) != 0) {
                        jD = pkc.a.d(dVarF, 6);
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jE = pkc.a.e(dVarF, 6);
                        i4 &= -7169;
                    } else {
                        jE = j3;
                    }
                    if (i5 != 0) {
                        ps4VarE = ko1.e(959948692, true, new a(i), dVarF, 54);
                    } else {
                        ps4VarE = ps4Var2;
                    }
                    if (i7 != 0) {
                        bVar4 = bVar3;
                        j7 = jE;
                        j6 = jD;
                        ps4Var4 = ps4VarE;
                        function2A = np1.a.a();
                        i10 = 563434725;
                    } else {
                        bVar4 = bVar3;
                        j6 = jD;
                        ps4Var4 = ps4VarE;
                        function2A = function4;
                        i10 = 563434725;
                        j7 = jE;
                    }
                }
                dVarF.M();
                if (e.k()) {
                    e.o(i10, i4, -1, "androidx.compose.material3.SecondaryTabRow (TabRow.kt:213)");
                }
                dVar2 = dVarF;
                e(bVar4, j6, j7, ps4Var4, function2A, function3, dVar2, (i4 >> 3) & 524286);
                if (e.k()) {
                    e.n();
                }
                bVar2 = bVar4;
                j4 = j6;
                j5 = j7;
                ps4Var3 = ps4Var4;
                function5 = function2A;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                bVar2 = bVar;
                j4 = jD;
                j5 = j3;
                ps4Var3 = ps4Var2;
                function5 = function4;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.qkc
                    public final Object invoke(Object obj, Object obj2) {
                        return skc.d(i, bVar2, j4, j5, ps4Var3, function5, function3, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 1572864;
        if ((i4 & 599187) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (dVarF.g(z, i4 & 1)) {
            dVarF.U();
            if ((i2 & 1) != 0) {
                if (i11 != 0) {
                    bVar3 = androidx.compose.ui.b.INSTANCE;
                } else {
                    bVar3 = bVar;
                }
                if ((i3 & 4) != 0) {
                    jD = pkc.a.d(dVarF, 6);
                    i4 &= -897;
                }
                if ((i3 & 8) != 0) {
                    jE = pkc.a.e(dVarF, 6);
                    i4 &= -7169;
                } else {
                    jE = j3;
                }
                if (i5 != 0) {
                    ps4VarE = ko1.e(959948692, true, new a(i), dVarF, 54);
                } else {
                    ps4VarE = ps4Var2;
                }
                if (i7 != 0) {
                    bVar4 = bVar3;
                    j7 = jE;
                    j6 = jD;
                    ps4Var4 = ps4VarE;
                    function2A = np1.a.a();
                    i10 = 563434725;
                } else {
                    bVar4 = bVar3;
                    j6 = jD;
                    ps4Var4 = ps4VarE;
                    function2A = function4;
                    i10 = 563434725;
                    j7 = jE;
                }
            } else {
                if (i11 != 0) {
                    bVar3 = androidx.compose.ui.b.INSTANCE;
                } else {
                    bVar3 = bVar;
                }
                if ((i3 & 4) != 0) {
                    jD = pkc.a.d(dVarF, 6);
                    i4 &= -897;
                }
                if ((i3 & 8) != 0) {
                    jE = pkc.a.e(dVarF, 6);
                    i4 &= -7169;
                } else {
                    jE = j3;
                }
                if (i5 != 0) {
                    ps4VarE = ko1.e(959948692, true, new a(i), dVarF, 54);
                } else {
                    ps4VarE = ps4Var2;
                }
                if (i7 != 0) {
                    bVar4 = bVar3;
                    j7 = jE;
                    j6 = jD;
                    ps4Var4 = ps4VarE;
                    function2A = np1.a.a();
                    i10 = 563434725;
                } else {
                    bVar4 = bVar3;
                    j6 = jD;
                    ps4Var4 = ps4VarE;
                    function2A = function4;
                    i10 = 563434725;
                    j7 = jE;
                }
            }
            dVarF.M();
            if (e.k()) {
                e.o(i10, i4, -1, "androidx.compose.material3.SecondaryTabRow (TabRow.kt:213)");
            }
            dVar2 = dVarF;
            e(bVar4, j6, j7, ps4Var4, function2A, function3, dVar2, (i4 >> 3) & 524286);
            if (e.k()) {
                e.n();
            }
            bVar2 = bVar4;
            j4 = j6;
            j5 = j7;
            ps4Var3 = ps4Var4;
            function5 = function2A;
        } else {
            dVar2 = dVarF;
            dVar2.q();
            bVar2 = bVar;
            j4 = jD;
            j5 = j3;
            ps4Var3 = ps4Var2;
            function5 = function4;
        }
        s6bVarH = dVar2.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.qkc
                public final Object invoke(Object obj, Object obj2) {
                    return skc.d(i, bVar2, j4, j5, ps4Var3, function5, function3, i2, i3, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(int i, androidx.compose.ui.b bVar, long j, long j2, ps4 ps4Var, Function2 function2, Function2 function3, int i2, int i3, d dVar, int i4) {
        c(i, bVar, j, j2, ps4Var, function2, function3, dVar, saa.a(i2 | 1), i3);
        return Unit.a;
    }

    private static final void e(androidx.compose.ui.b bVar, final long j, final long j2, final ps4<? super gkc, ? super d, ? super Integer, Unit> ps4Var, final Function2<? super d, ? super Integer, Unit> function2, final Function2<? super d, ? super Integer, Unit> function3, d dVar, final int i) {
        androidx.compose.ui.b bVar2;
        int i2;
        d dVar2;
        d dVarF = dVar.F(1955286154);
        if ((i & 6) == 0) {
            bVar2 = bVar;
            i2 = (dVarF.x(bVar2) ? 4 : 2) | i;
        } else {
            bVar2 = bVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dVarF.D(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dVarF.D(j2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= dVarF.T(ps4Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= dVarF.T(function2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= dVarF.T(function3) ? 131072 : 65536;
        }
        if (dVarF.g((74899 & i2) != 74898, i2 & 1)) {
            if (e.k()) {
                e.o(1955286154, i2, -1, "androidx.compose.material3.TabRowImpl (TabRow.kt:398)");
            }
            int i3 = i2 << 3;
            dVar2 = dVarF;
            afc.c(gdb.b(bVar2), null, j, j2, 0.0f, 0.0f, null, ko1.e(830280655, true, new b(function3, function2, ps4Var), dVarF, 54), dVar2, (i3 & 896) | 12582912 | (i3 & 7168), 114);
            if (e.k()) {
                e.n();
            }
        } else {
            dVar2 = dVarF;
            dVar2.q();
        }
        s6b s6bVarH = dVar2.H();
        if (s6bVarH != null) {
            final androidx.compose.ui.b bVar3 = bVar2;
            s6bVarH.a(new Function2() { // from class: com.google.android.rkc
                public final Object invoke(Object obj, Object obj2) {
                    return skc.f(bVar3, j, j2, ps4Var, function2, function3, i, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(androidx.compose.ui.b bVar, long j, long j2, ps4 ps4Var, Function2 function2, Function2 function3, int i, d dVar, int i2) {
        e(bVar, j, j2, ps4Var, function2, function3, dVar, saa.a(i | 1));
        return Unit.a;
    }
}
