package androidx.compose.p000animation;

import androidx.compose.p000animation.core.Transition;
import androidx.compose.p000animation.core.TransitionKt;
import androidx.compose.p001foundation.layout.BoxScopeInstance;
import androidx.compose.p001foundation.layout.j;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.p004runtime.p0;
import androidx.compose.p004runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.b;
import androidx.compose.ui.node.ComposeUiNode;
import com.google.android.ps4;
import com.google.inputmethod.dud;
import com.google.inputmethod.ej7;
import com.google.inputmethod.gs1;
import com.google.inputmethod.k4b;
import com.google.inputmethod.k58;
import com.google.inputmethod.ko1;
import com.google.inputmethod.lr;
import com.google.inputmethod.pp1;
import com.google.inputmethod.s6b;
import com.google.inputmethod.saa;
import com.google.inputmethod.tc;
import com.google.inputmethod.xa4;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u001aU\u0010\f\u001a\u00020\n\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0004\b\f\u0010\r\u001ae\u0010\u0011\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014²\u0006\f\u0010\u0013\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"T", "targetState", "Landroidx/compose/ui/b;", "modifier", "Lcom/google/android/xa4;", "", "animationSpec", "", "label", "Lkotlin/Function1;", "", "content", "b", "(Ljava/lang/Object;Landroidx/compose/ui/b;Lcom/google/android/xa4;Ljava/lang/String;Lcom/google/android/ps4;Landroidx/compose/runtime/d;II)V", "Landroidx/compose/animation/core/Transition;", "", "contentKey", "a", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/b;Lcom/google/android/xa4;Lkotlin/jvm/functions/Function1;Lcom/google/android/ps4;Landroidx/compose/runtime/d;II)V", "alpha", "animation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class CrossfadeKt {
    /* JADX WARN: Code duplicated, block: B:102:0x0191 A[LOOP:0: B:97:0x0174->B:102:0x0191, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:105:0x0197  */
    /* JADX WARN: Code duplicated, block: B:106:0x019f  */
    /* JADX WARN: Code duplicated, block: B:109:0x01b0 A[LOOP:1: B:108:0x01ae->B:109:0x01b0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:114:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:117:0x0209  */
    /* JADX WARN: Code duplicated, block: B:118:0x020d  */
    /* JADX WARN: Code duplicated, block: B:121:0x024a  */
    /* JADX WARN: Code duplicated, block: B:123:0x0260  */
    /* JADX WARN: Code duplicated, block: B:124:0x026b  */
    /* JADX WARN: Code duplicated, block: B:128:0x028e  */
    /* JADX WARN: Code duplicated, block: B:130:0x0294  */
    /* JADX WARN: Code duplicated, block: B:133:0x029e  */
    /* JADX WARN: Code duplicated, block: B:135:0x0194 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x0195 A[EDGE_INSN: B:136:0x0195->B:104:0x0195 BREAK  A[LOOP:0: B:97:0x0174->B:102:0x0191], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Code duplicated, block: B:27:0x0047  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x0059  */
    /* JADX WARN: Code duplicated, block: B:36:0x005e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0062  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0074  */
    /* JADX WARN: Code duplicated, block: B:47:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x007d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x008a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x009a  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00af  */
    /* JADX WARN: Code duplicated, block: B:67:0x00be  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:76:0x0100  */
    /* JADX WARN: Code duplicated, block: B:78:0x010c  */
    /* JADX WARN: Code duplicated, block: B:82:0x0125  */
    /* JADX WARN: Code duplicated, block: B:84:0x0130  */
    /* JADX WARN: Code duplicated, block: B:85:0x0132  */
    /* JADX WARN: Code duplicated, block: B:88:0x0139  */
    /* JADX WARN: Code duplicated, block: B:90:0x013f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0156  */
    /* JADX WARN: Code duplicated, block: B:96:0x0169  */
    /* JADX WARN: Code duplicated, block: B:99:0x017a  */
    public static final <T> void a(final Transition<T> transition, b bVar, xa4<Float> xa4Var, Function1<? super T, ? extends Object> function1, final ps4<? super T, ? super d, ? super Integer, Unit> ps4Var, d dVar, final int i, final int i2) {
        b bVar2;
        int i3;
        xa4<Float> xa4VarL;
        int i4;
        int i5;
        Function1<? super T, ? extends Object> function2;
        int i6;
        boolean z;
        final xa4<Float> xa4Var2;
        final Function1<? super T, ? extends Object> function3;
        s6b s6bVarH;
        Object objR;
        d.Companion companion;
        Object obj;
        SnapshotStateList snapshotStateList;
        Object objR2;
        k58 k58Var;
        Function0<ComposeUiNode> function0B;
        int size;
        int i7;
        Function2 function4;
        Iterator<T> it;
        int i8;
        int size2;
        int i9;
        boolean z2;
        Object objR3;
        Object objR4;
        int i10;
        d dVarF = dVar.F(-1877370462);
        int i11 = (i & 6) == 0 ? (dVarF.x(transition) ? 4 : 2) | i : i;
        int i12 = i2 & 1;
        if (i12 == 0) {
            if ((i & 48) == 0) {
                bVar2 = bVar;
                i11 |= dVarF.x(bVar2) ? 32 : 16;
            }
            i3 = i2 & 2;
            if (i3 != 0) {
                if ((i & 384) == 0) {
                    xa4VarL = xa4Var;
                    if (dVarF.T(xa4VarL)) {
                        i4 = 256;
                    } else {
                        i4 = 128;
                    }
                    i11 |= i4;
                }
                i5 = i2 & 4;
                if (i5 != 0) {
                    if ((i & 3072) == 0) {
                        function2 = function1;
                        if (dVarF.T(function2)) {
                            i6 = 2048;
                        } else {
                            i6 = 1024;
                        }
                        i11 |= i6;
                    }
                    if ((i & 24576) == 0) {
                        if (dVarF.T(ps4Var)) {
                            i10 = 16384;
                        } else {
                            i10 = 8192;
                        }
                        i11 |= i10;
                    }
                    if ((i11 & 9363) != 9362) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i11 & 1)) {
                        if (i12 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if (i3 != 0) {
                            xa4VarL = lr.l(0, 0, null, 7, null);
                        }
                        if (i5 != 0) {
                            objR4 = dVarF.R();
                            if (objR4 == d.INSTANCE.a()) {
                                objR4 = new Function1<T, T>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$3$1
                                    public final T invoke(T t) {
                                        return t;
                                    }
                                };
                                dVarF.L(objR4);
                            }
                            function2 = (Function1) objR4;
                        }
                        if (e.k()) {
                            e.o(-1877370462, i11, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:102)");
                        }
                        objR = dVarF.R();
                        companion = d.INSTANCE;
                        obj = objR;
                        if (objR == companion.a()) {
                            SnapshotStateList snapshotStateListF = p0.f();
                            snapshotStateListF.add(transition.p());
                            dVarF.L(snapshotStateListF);
                            obj = snapshotStateListF;
                        }
                        snapshotStateList = (SnapshotStateList) obj;
                        objR2 = dVarF.R();
                        if (objR2 == companion.a()) {
                            objR2 = k4b.c();
                            dVarF.L(objR2);
                        }
                        k58Var = (k58) objR2;
                        if (Intrinsics.e(transition.p(), transition.w())) {
                            dVarF.y(321145192);
                            if (snapshotStateList.size() == 1 || !Intrinsics.e(snapshotStateList.get(0), transition.w())) {
                                dVarF.y(321279546);
                                if ((i11 & 14) == 4) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                objR3 = dVarF.R();
                                if (z2 || objR3 == companion.a()) {
                                    objR3 = new Function1<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                        public final Boolean invoke(T t) {
                                            return Boolean.valueOf(!Intrinsics.e(t, transition.w()));
                                        }
                                    };
                                    dVarF.L(objR3);
                                }
                                m.O(snapshotStateList, (Function1) objR3);
                                k58Var.k();
                                dVarF.u();
                            } else {
                                dVarF.y(321469824);
                                dVarF.u();
                            }
                            dVarF.u();
                        } else {
                            dVarF.y(321475776);
                            dVarF.u();
                        }
                        if (k58Var.b(transition.w())) {
                            dVarF.y(322279296);
                            dVarF.u();
                        } else {
                            dVarF.y(321536443);
                            it = snapshotStateList.iterator();
                            i8 = 0;
                            while (true) {
                                if (it.hasNext()) {
                                    i8 = -1;
                                    break;
                                } else if (Intrinsics.e(function2.invoke(it.next()), function2.invoke(transition.w()))) {
                                    break;
                                } else {
                                    i8++;
                                }
                            }
                            if (i8 == -1) {
                                snapshotStateList.add(transition.w());
                            } else {
                                snapshotStateList.set(i8, transition.w());
                            }
                            k58Var.k();
                            size2 = snapshotStateList.size();
                            for (i9 = 0; i9 < size2; i9++) {
                                T t = snapshotStateList.get(i9);
                                k58Var.x(t, ko1.e(-934471669, true, new CrossfadeKt$Crossfade$5$1(transition, xa4VarL, t, ps4Var), dVarF, 54));
                            }
                            dVarF.u();
                        }
                        ej7 ej7VarI = j.i(tc.INSTANCE.o(), false);
                        int iHashCode = Long.hashCode(pp1.b(dVarF, 0));
                        gs1 gs1VarJ = dVarF.j();
                        b bVarE = ComposedModifierKt.e(dVarF, bVar2);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        function0B = companion2.b();
                        if (dVarF.G() == null) {
                            pp1.d();
                        }
                        dVarF.o();
                        if (dVarF.getInserting()) {
                            dVarF.W(function0B);
                        } else {
                            dVarF.k();
                        }
                        d dVarC = dud.c(dVarF);
                        dud.i(dVarC, ej7VarI, companion2.d());
                        dud.i(dVarC, gs1VarJ, companion2.f());
                        dud.d(dVarC, Integer.valueOf(iHashCode), companion2.c());
                        dud.g(dVarC, companion2.a());
                        dud.i(dVarC, bVarE, companion2.e());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
                        dVarF.y(-1312707512);
                        size = snapshotStateList.size();
                        for (i7 = 0; i7 < size; i7++) {
                            T t2 = snapshotStateList.get(i7);
                            dVarF.V(1171574969, function2.invoke(t2));
                            function4 = (Function2) k58Var.e(t2);
                            if (function4 == null) {
                                dVarF.y(1959122128);
                                dVarF.u();
                            } else {
                                dVarF.y(1171576145);
                                function4.invoke(dVarF, 0);
                                dVarF.u();
                            }
                            dVarF.Z();
                        }
                        dVarF.u();
                        dVarF.m();
                        if (e.k()) {
                            e.n();
                        }
                    } else {
                        dVarF.q();
                    }
                    xa4Var2 = xa4VarL;
                    function3 = function2;
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        final b bVar3 = bVar2;
                        s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$7
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                                invoke((d) obj2, ((Number) obj3).intValue());
                                return Unit.a;
                            }

                            public final void invoke(d dVar2, int i13) {
                                CrossfadeKt.a(transition, bVar3, xa4Var2, function3, ps4Var, dVar2, saa.a(i | 1), i2);
                            }
                        });
                    }
                }
                i11 |= 3072;
                function2 = function1;
                if ((i & 24576) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i10 = 16384;
                    } else {
                        i10 = 8192;
                    }
                    i11 |= i10;
                }
                if ((i11 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i11 & 1)) {
                    if (i12 != 0) {
                        bVar2 = b.INSTANCE;
                    }
                    if (i3 != 0) {
                        xa4VarL = lr.l(0, 0, null, 7, null);
                    }
                    if (i5 != 0) {
                        objR4 = dVarF.R();
                        if (objR4 == d.INSTANCE.a()) {
                            objR4 = new Function1<T, T>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$3$1
                                public final T invoke(T t3) {
                                    return t3;
                                }
                            };
                            dVarF.L(objR4);
                        }
                        function2 = (Function1) objR4;
                    }
                    if (e.k()) {
                        e.o(-1877370462, i11, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:102)");
                    }
                    objR = dVarF.R();
                    companion = d.INSTANCE;
                    obj = objR;
                    if (objR == companion.a()) {
                        SnapshotStateList snapshotStateListF2 = p0.f();
                        snapshotStateListF2.add(transition.p());
                        dVarF.L(snapshotStateListF2);
                        obj = snapshotStateListF2;
                    }
                    snapshotStateList = (SnapshotStateList) obj;
                    objR2 = dVarF.R();
                    if (objR2 == companion.a()) {
                        objR2 = k4b.c();
                        dVarF.L(objR2);
                    }
                    k58Var = (k58) objR2;
                    if (Intrinsics.e(transition.p(), transition.w())) {
                        dVarF.y(321145192);
                        if (snapshotStateList.size() == 1) {
                            dVarF.y(321279546);
                            if ((i11 & 14) == 4) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objR3 = dVarF.R();
                            if (z2) {
                                objR3 = new Function1<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                    public final Boolean invoke(T t3) {
                                        return Boolean.valueOf(!Intrinsics.e(t3, transition.w()));
                                    }
                                };
                                dVarF.L(objR3);
                            } else {
                                objR3 = new Function1<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                    public final Boolean invoke(T t3) {
                                        return Boolean.valueOf(!Intrinsics.e(t3, transition.w()));
                                    }
                                };
                                dVarF.L(objR3);
                            }
                            m.O(snapshotStateList, (Function1) objR3);
                            k58Var.k();
                            dVarF.u();
                        } else {
                            dVarF.y(321279546);
                            if ((i11 & 14) == 4) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objR3 = dVarF.R();
                            if (z2) {
                                objR3 = new Function1<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                    public final Boolean invoke(T t3) {
                                        return Boolean.valueOf(!Intrinsics.e(t3, transition.w()));
                                    }
                                };
                                dVarF.L(objR3);
                            } else {
                                objR3 = new Function1<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                    public final Boolean invoke(T t3) {
                                        return Boolean.valueOf(!Intrinsics.e(t3, transition.w()));
                                    }
                                };
                                dVarF.L(objR3);
                            }
                            m.O(snapshotStateList, (Function1) objR3);
                            k58Var.k();
                            dVarF.u();
                        }
                        dVarF.u();
                    } else {
                        dVarF.y(321475776);
                        dVarF.u();
                    }
                    if (k58Var.b(transition.w())) {
                        dVarF.y(321536443);
                        it = snapshotStateList.iterator();
                        i8 = 0;
                        while (true) {
                            if (it.hasNext()) {
                                i8 = -1;
                                break;
                            } else {
                                if (Intrinsics.e(function2.invoke(it.next()), function2.invoke(transition.w()))) {
                                    break;
                                    break;
                                }
                                i8++;
                            }
                        }
                        if (i8 == -1) {
                            snapshotStateList.add(transition.w());
                        } else {
                            snapshotStateList.set(i8, transition.w());
                        }
                        k58Var.k();
                        size2 = snapshotStateList.size();
                        while (i9 < size2) {
                            T t3 = snapshotStateList.get(i9);
                            k58Var.x(t3, ko1.e(-934471669, true, new CrossfadeKt$Crossfade$5$1(transition, xa4VarL, t3, ps4Var), dVarF, 54));
                        }
                        dVarF.u();
                    } else {
                        dVarF.y(322279296);
                        dVarF.u();
                    }
                    ej7 ej7VarI2 = j.i(tc.INSTANCE.o(), false);
                    int iHashCode2 = Long.hashCode(pp1.b(dVarF, 0));
                    gs1 gs1VarJ2 = dVarF.j();
                    b bVarE2 = ComposedModifierKt.e(dVarF, bVar2);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    function0B = companion3.b();
                    if (dVarF.G() == null) {
                        pp1.d();
                    }
                    dVarF.o();
                    if (dVarF.getInserting()) {
                        dVarF.W(function0B);
                    } else {
                        dVarF.k();
                    }
                    d dVarC2 = dud.c(dVarF);
                    dud.i(dVarC2, ej7VarI2, companion3.d());
                    dud.i(dVarC2, gs1VarJ2, companion3.f());
                    dud.d(dVarC2, Integer.valueOf(iHashCode2), companion3.c());
                    dud.g(dVarC2, companion3.a());
                    dud.i(dVarC2, bVarE2, companion3.e());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.a;
                    dVarF.y(-1312707512);
                    size = snapshotStateList.size();
                    while (i7 < size) {
                        T t4 = snapshotStateList.get(i7);
                        dVarF.V(1171574969, function2.invoke(t4));
                        function4 = (Function2) k58Var.e(t4);
                        if (function4 == null) {
                            dVarF.y(1959122128);
                            dVarF.u();
                        } else {
                            dVarF.y(1171576145);
                            function4.invoke(dVarF, 0);
                            dVarF.u();
                        }
                        dVarF.Z();
                    }
                    dVarF.u();
                    dVarF.m();
                    if (e.k()) {
                        e.n();
                    }
                } else {
                    dVarF.q();
                }
                xa4Var2 = xa4VarL;
                function3 = function2;
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    final b bVar4 = bVar2;
                    s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$7
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                            invoke((d) obj2, ((Number) obj3).intValue());
                            return Unit.a;
                        }

                        public final void invoke(d dVar2, int i13) {
                            CrossfadeKt.a(transition, bVar4, xa4Var2, function3, ps4Var, dVar2, saa.a(i | 1), i2);
                        }
                    });
                }
            }
            i11 |= 384;
            xa4VarL = xa4Var;
            i5 = i2 & 4;
            if (i5 != 0) {
                if ((i & 3072) == 0) {
                    function2 = function1;
                    if (dVarF.T(function2)) {
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i11 |= i6;
                }
                if ((i & 24576) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i10 = 16384;
                    } else {
                        i10 = 8192;
                    }
                    i11 |= i10;
                }
                if ((i11 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i11 & 1)) {
                    if (i12 != 0) {
                        bVar2 = b.INSTANCE;
                    }
                    if (i3 != 0) {
                        xa4VarL = lr.l(0, 0, null, 7, null);
                    }
                    if (i5 != 0) {
                        objR4 = dVarF.R();
                        if (objR4 == d.INSTANCE.a()) {
                            objR4 = new Function1<T, T>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$3$1
                                public final T invoke(T t5) {
                                    return t5;
                                }
                            };
                            dVarF.L(objR4);
                        }
                        function2 = (Function1) objR4;
                    }
                    if (e.k()) {
                        e.o(-1877370462, i11, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:102)");
                    }
                    objR = dVarF.R();
                    companion = d.INSTANCE;
                    obj = objR;
                    if (objR == companion.a()) {
                        SnapshotStateList snapshotStateListF3 = p0.f();
                        snapshotStateListF3.add(transition.p());
                        dVarF.L(snapshotStateListF3);
                        obj = snapshotStateListF3;
                    }
                    snapshotStateList = (SnapshotStateList) obj;
                    objR2 = dVarF.R();
                    if (objR2 == companion.a()) {
                        objR2 = k4b.c();
                        dVarF.L(objR2);
                    }
                    k58Var = (k58) objR2;
                    if (Intrinsics.e(transition.p(), transition.w())) {
                        dVarF.y(321145192);
                        if (snapshotStateList.size() == 1) {
                            dVarF.y(321279546);
                            if ((i11 & 14) == 4) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objR3 = dVarF.R();
                            if (z2) {
                                objR3 = new Function1<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                    public final Boolean invoke(T t5) {
                                        return Boolean.valueOf(!Intrinsics.e(t5, transition.w()));
                                    }
                                };
                                dVarF.L(objR3);
                            } else {
                                objR3 = new Function1<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                    public final Boolean invoke(T t5) {
                                        return Boolean.valueOf(!Intrinsics.e(t5, transition.w()));
                                    }
                                };
                                dVarF.L(objR3);
                            }
                            m.O(snapshotStateList, (Function1) objR3);
                            k58Var.k();
                            dVarF.u();
                        } else {
                            dVarF.y(321279546);
                            if ((i11 & 14) == 4) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objR3 = dVarF.R();
                            if (z2) {
                                objR3 = new Function1<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                    public final Boolean invoke(T t5) {
                                        return Boolean.valueOf(!Intrinsics.e(t5, transition.w()));
                                    }
                                };
                                dVarF.L(objR3);
                            } else {
                                objR3 = new Function1<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                    public final Boolean invoke(T t5) {
                                        return Boolean.valueOf(!Intrinsics.e(t5, transition.w()));
                                    }
                                };
                                dVarF.L(objR3);
                            }
                            m.O(snapshotStateList, (Function1) objR3);
                            k58Var.k();
                            dVarF.u();
                        }
                        dVarF.u();
                    } else {
                        dVarF.y(321475776);
                        dVarF.u();
                    }
                    if (k58Var.b(transition.w())) {
                        dVarF.y(321536443);
                        it = snapshotStateList.iterator();
                        i8 = 0;
                        while (true) {
                            if (it.hasNext()) {
                                i8 = -1;
                                break;
                            } else {
                                if (Intrinsics.e(function2.invoke(it.next()), function2.invoke(transition.w()))) {
                                    break;
                                    break;
                                }
                                i8++;
                            }
                        }
                        if (i8 == -1) {
                            snapshotStateList.add(transition.w());
                        } else {
                            snapshotStateList.set(i8, transition.w());
                        }
                        k58Var.k();
                        size2 = snapshotStateList.size();
                        while (i9 < size2) {
                            T t5 = snapshotStateList.get(i9);
                            k58Var.x(t5, ko1.e(-934471669, true, new CrossfadeKt$Crossfade$5$1(transition, xa4VarL, t5, ps4Var), dVarF, 54));
                        }
                        dVarF.u();
                    } else {
                        dVarF.y(322279296);
                        dVarF.u();
                    }
                    ej7 ej7VarI3 = j.i(tc.INSTANCE.o(), false);
                    int iHashCode3 = Long.hashCode(pp1.b(dVarF, 0));
                    gs1 gs1VarJ3 = dVarF.j();
                    b bVarE3 = ComposedModifierKt.e(dVarF, bVar2);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    function0B = companion4.b();
                    if (dVarF.G() == null) {
                        pp1.d();
                    }
                    dVarF.o();
                    if (dVarF.getInserting()) {
                        dVarF.W(function0B);
                    } else {
                        dVarF.k();
                    }
                    d dVarC3 = dud.c(dVarF);
                    dud.i(dVarC3, ej7VarI3, companion4.d());
                    dud.i(dVarC3, gs1VarJ3, companion4.f());
                    dud.d(dVarC3, Integer.valueOf(iHashCode3), companion4.c());
                    dud.g(dVarC3, companion4.a());
                    dud.i(dVarC3, bVarE3, companion4.e());
                    BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.a;
                    dVarF.y(-1312707512);
                    size = snapshotStateList.size();
                    while (i7 < size) {
                        T t6 = snapshotStateList.get(i7);
                        dVarF.V(1171574969, function2.invoke(t6));
                        function4 = (Function2) k58Var.e(t6);
                        if (function4 == null) {
                            dVarF.y(1959122128);
                            dVarF.u();
                        } else {
                            dVarF.y(1171576145);
                            function4.invoke(dVarF, 0);
                            dVarF.u();
                        }
                        dVarF.Z();
                    }
                    dVarF.u();
                    dVarF.m();
                    if (e.k()) {
                        e.n();
                    }
                } else {
                    dVarF.q();
                }
                xa4Var2 = xa4VarL;
                function3 = function2;
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    final b bVar5 = bVar2;
                    s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$7
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                            invoke((d) obj2, ((Number) obj3).intValue());
                            return Unit.a;
                        }

                        public final void invoke(d dVar2, int i13) {
                            CrossfadeKt.a(transition, bVar5, xa4Var2, function3, ps4Var, dVar2, saa.a(i | 1), i2);
                        }
                    });
                }
            }
            i11 |= 3072;
            function2 = function1;
            if ((i & 24576) == 0) {
                if (dVarF.T(ps4Var)) {
                    i10 = 16384;
                } else {
                    i10 = 8192;
                }
                i11 |= i10;
            }
            if ((i11 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i11 & 1)) {
                if (i12 != 0) {
                    bVar2 = b.INSTANCE;
                }
                if (i3 != 0) {
                    xa4VarL = lr.l(0, 0, null, 7, null);
                }
                if (i5 != 0) {
                    objR4 = dVarF.R();
                    if (objR4 == d.INSTANCE.a()) {
                        objR4 = new Function1<T, T>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$3$1
                            public final T invoke(T t7) {
                                return t7;
                            }
                        };
                        dVarF.L(objR4);
                    }
                    function2 = (Function1) objR4;
                }
                if (e.k()) {
                    e.o(-1877370462, i11, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:102)");
                }
                objR = dVarF.R();
                companion = d.INSTANCE;
                obj = objR;
                if (objR == companion.a()) {
                    SnapshotStateList snapshotStateListF4 = p0.f();
                    snapshotStateListF4.add(transition.p());
                    dVarF.L(snapshotStateListF4);
                    obj = snapshotStateListF4;
                }
                snapshotStateList = (SnapshotStateList) obj;
                objR2 = dVarF.R();
                if (objR2 == companion.a()) {
                    objR2 = k4b.c();
                    dVarF.L(objR2);
                }
                k58Var = (k58) objR2;
                if (Intrinsics.e(transition.p(), transition.w())) {
                    dVarF.y(321145192);
                    if (snapshotStateList.size() == 1) {
                        dVarF.y(321279546);
                        if ((i11 & 14) == 4) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objR3 = dVarF.R();
                        if (z2) {
                            objR3 = new Function1<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final Boolean invoke(T t7) {
                                    return Boolean.valueOf(!Intrinsics.e(t7, transition.w()));
                                }
                            };
                            dVarF.L(objR3);
                        } else {
                            objR3 = new Function1<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final Boolean invoke(T t7) {
                                    return Boolean.valueOf(!Intrinsics.e(t7, transition.w()));
                                }
                            };
                            dVarF.L(objR3);
                        }
                        m.O(snapshotStateList, (Function1) objR3);
                        k58Var.k();
                        dVarF.u();
                    } else {
                        dVarF.y(321279546);
                        if ((i11 & 14) == 4) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objR3 = dVarF.R();
                        if (z2) {
                            objR3 = new Function1<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final Boolean invoke(T t7) {
                                    return Boolean.valueOf(!Intrinsics.e(t7, transition.w()));
                                }
                            };
                            dVarF.L(objR3);
                        } else {
                            objR3 = new Function1<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final Boolean invoke(T t7) {
                                    return Boolean.valueOf(!Intrinsics.e(t7, transition.w()));
                                }
                            };
                            dVarF.L(objR3);
                        }
                        m.O(snapshotStateList, (Function1) objR3);
                        k58Var.k();
                        dVarF.u();
                    }
                    dVarF.u();
                } else {
                    dVarF.y(321475776);
                    dVarF.u();
                }
                if (k58Var.b(transition.w())) {
                    dVarF.y(321536443);
                    it = snapshotStateList.iterator();
                    i8 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            i8 = -1;
                            break;
                        } else {
                            if (Intrinsics.e(function2.invoke(it.next()), function2.invoke(transition.w()))) {
                                break;
                                break;
                            }
                            i8++;
                        }
                    }
                    if (i8 == -1) {
                        snapshotStateList.add(transition.w());
                    } else {
                        snapshotStateList.set(i8, transition.w());
                    }
                    k58Var.k();
                    size2 = snapshotStateList.size();
                    while (i9 < size2) {
                        T t7 = snapshotStateList.get(i9);
                        k58Var.x(t7, ko1.e(-934471669, true, new CrossfadeKt$Crossfade$5$1(transition, xa4VarL, t7, ps4Var), dVarF, 54));
                    }
                    dVarF.u();
                } else {
                    dVarF.y(322279296);
                    dVarF.u();
                }
                ej7 ej7VarI4 = j.i(tc.INSTANCE.o(), false);
                int iHashCode4 = Long.hashCode(pp1.b(dVarF, 0));
                gs1 gs1VarJ4 = dVarF.j();
                b bVarE4 = ComposedModifierKt.e(dVarF, bVar2);
                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                function0B = companion5.b();
                if (dVarF.G() == null) {
                    pp1.d();
                }
                dVarF.o();
                if (dVarF.getInserting()) {
                    dVarF.W(function0B);
                } else {
                    dVarF.k();
                }
                d dVarC4 = dud.c(dVarF);
                dud.i(dVarC4, ej7VarI4, companion5.d());
                dud.i(dVarC4, gs1VarJ4, companion5.f());
                dud.d(dVarC4, Integer.valueOf(iHashCode4), companion5.c());
                dud.g(dVarC4, companion5.a());
                dud.i(dVarC4, bVarE4, companion5.e());
                BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.a;
                dVarF.y(-1312707512);
                size = snapshotStateList.size();
                while (i7 < size) {
                    T t8 = snapshotStateList.get(i7);
                    dVarF.V(1171574969, function2.invoke(t8));
                    function4 = (Function2) k58Var.e(t8);
                    if (function4 == null) {
                        dVarF.y(1959122128);
                        dVarF.u();
                    } else {
                        dVarF.y(1171576145);
                        function4.invoke(dVarF, 0);
                        dVarF.u();
                    }
                    dVarF.Z();
                }
                dVarF.u();
                dVarF.m();
                if (e.k()) {
                    e.n();
                }
            } else {
                dVarF.q();
            }
            xa4Var2 = xa4VarL;
            function3 = function2;
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                final b bVar6 = bVar2;
                s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$7
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                        invoke((d) obj2, ((Number) obj3).intValue());
                        return Unit.a;
                    }

                    public final void invoke(d dVar2, int i13) {
                        CrossfadeKt.a(transition, bVar6, xa4Var2, function3, ps4Var, dVar2, saa.a(i | 1), i2);
                    }
                });
            }
        }
        i11 |= 48;
        bVar2 = bVar;
        i3 = i2 & 2;
        if (i3 != 0) {
            if ((i & 384) == 0) {
                xa4VarL = xa4Var;
                if (dVarF.T(xa4VarL)) {
                    i4 = 256;
                } else {
                    i4 = 128;
                }
                i11 |= i4;
            }
            i5 = i2 & 4;
            if (i5 != 0) {
                if ((i & 3072) == 0) {
                    function2 = function1;
                    if (dVarF.T(function2)) {
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i11 |= i6;
                }
                if ((i & 24576) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i10 = 16384;
                    } else {
                        i10 = 8192;
                    }
                    i11 |= i10;
                }
                if ((i11 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i11 & 1)) {
                    if (i12 != 0) {
                        bVar2 = b.INSTANCE;
                    }
                    if (i3 != 0) {
                        xa4VarL = lr.l(0, 0, null, 7, null);
                    }
                    if (i5 != 0) {
                        objR4 = dVarF.R();
                        if (objR4 == d.INSTANCE.a()) {
                            objR4 = new Function1<T, T>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$3$1
                                public final T invoke(T t9) {
                                    return t9;
                                }
                            };
                            dVarF.L(objR4);
                        }
                        function2 = (Function1) objR4;
                    }
                    if (e.k()) {
                        e.o(-1877370462, i11, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:102)");
                    }
                    objR = dVarF.R();
                    companion = d.INSTANCE;
                    obj = objR;
                    if (objR == companion.a()) {
                        SnapshotStateList snapshotStateListF5 = p0.f();
                        snapshotStateListF5.add(transition.p());
                        dVarF.L(snapshotStateListF5);
                        obj = snapshotStateListF5;
                    }
                    snapshotStateList = (SnapshotStateList) obj;
                    objR2 = dVarF.R();
                    if (objR2 == companion.a()) {
                        objR2 = k4b.c();
                        dVarF.L(objR2);
                    }
                    k58Var = (k58) objR2;
                    if (Intrinsics.e(transition.p(), transition.w())) {
                        dVarF.y(321145192);
                        if (snapshotStateList.size() == 1) {
                            dVarF.y(321279546);
                            if ((i11 & 14) == 4) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objR3 = dVarF.R();
                            if (z2) {
                                objR3 = new Function1<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                    public final Boolean invoke(T t9) {
                                        return Boolean.valueOf(!Intrinsics.e(t9, transition.w()));
                                    }
                                };
                                dVarF.L(objR3);
                            } else {
                                objR3 = new Function1<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                    public final Boolean invoke(T t9) {
                                        return Boolean.valueOf(!Intrinsics.e(t9, transition.w()));
                                    }
                                };
                                dVarF.L(objR3);
                            }
                            m.O(snapshotStateList, (Function1) objR3);
                            k58Var.k();
                            dVarF.u();
                        } else {
                            dVarF.y(321279546);
                            if ((i11 & 14) == 4) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objR3 = dVarF.R();
                            if (z2) {
                                objR3 = new Function1<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                    public final Boolean invoke(T t9) {
                                        return Boolean.valueOf(!Intrinsics.e(t9, transition.w()));
                                    }
                                };
                                dVarF.L(objR3);
                            } else {
                                objR3 = new Function1<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                    public final Boolean invoke(T t9) {
                                        return Boolean.valueOf(!Intrinsics.e(t9, transition.w()));
                                    }
                                };
                                dVarF.L(objR3);
                            }
                            m.O(snapshotStateList, (Function1) objR3);
                            k58Var.k();
                            dVarF.u();
                        }
                        dVarF.u();
                    } else {
                        dVarF.y(321475776);
                        dVarF.u();
                    }
                    if (k58Var.b(transition.w())) {
                        dVarF.y(321536443);
                        it = snapshotStateList.iterator();
                        i8 = 0;
                        while (true) {
                            if (it.hasNext()) {
                                i8 = -1;
                                break;
                            } else {
                                if (Intrinsics.e(function2.invoke(it.next()), function2.invoke(transition.w()))) {
                                    break;
                                    break;
                                }
                                i8++;
                            }
                        }
                        if (i8 == -1) {
                            snapshotStateList.add(transition.w());
                        } else {
                            snapshotStateList.set(i8, transition.w());
                        }
                        k58Var.k();
                        size2 = snapshotStateList.size();
                        while (i9 < size2) {
                            T t9 = snapshotStateList.get(i9);
                            k58Var.x(t9, ko1.e(-934471669, true, new CrossfadeKt$Crossfade$5$1(transition, xa4VarL, t9, ps4Var), dVarF, 54));
                        }
                        dVarF.u();
                    } else {
                        dVarF.y(322279296);
                        dVarF.u();
                    }
                    ej7 ej7VarI5 = j.i(tc.INSTANCE.o(), false);
                    int iHashCode5 = Long.hashCode(pp1.b(dVarF, 0));
                    gs1 gs1VarJ5 = dVarF.j();
                    b bVarE5 = ComposedModifierKt.e(dVarF, bVar2);
                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                    function0B = companion6.b();
                    if (dVarF.G() == null) {
                        pp1.d();
                    }
                    dVarF.o();
                    if (dVarF.getInserting()) {
                        dVarF.W(function0B);
                    } else {
                        dVarF.k();
                    }
                    d dVarC5 = dud.c(dVarF);
                    dud.i(dVarC5, ej7VarI5, companion6.d());
                    dud.i(dVarC5, gs1VarJ5, companion6.f());
                    dud.d(dVarC5, Integer.valueOf(iHashCode5), companion6.c());
                    dud.g(dVarC5, companion6.a());
                    dud.i(dVarC5, bVarE5, companion6.e());
                    BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.a;
                    dVarF.y(-1312707512);
                    size = snapshotStateList.size();
                    while (i7 < size) {
                        T t10 = snapshotStateList.get(i7);
                        dVarF.V(1171574969, function2.invoke(t10));
                        function4 = (Function2) k58Var.e(t10);
                        if (function4 == null) {
                            dVarF.y(1959122128);
                            dVarF.u();
                        } else {
                            dVarF.y(1171576145);
                            function4.invoke(dVarF, 0);
                            dVarF.u();
                        }
                        dVarF.Z();
                    }
                    dVarF.u();
                    dVarF.m();
                    if (e.k()) {
                        e.n();
                    }
                } else {
                    dVarF.q();
                }
                xa4Var2 = xa4VarL;
                function3 = function2;
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    final b bVar7 = bVar2;
                    s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$7
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                            invoke((d) obj2, ((Number) obj3).intValue());
                            return Unit.a;
                        }

                        public final void invoke(d dVar2, int i13) {
                            CrossfadeKt.a(transition, bVar7, xa4Var2, function3, ps4Var, dVar2, saa.a(i | 1), i2);
                        }
                    });
                }
            }
            i11 |= 3072;
            function2 = function1;
            if ((i & 24576) == 0) {
                if (dVarF.T(ps4Var)) {
                    i10 = 16384;
                } else {
                    i10 = 8192;
                }
                i11 |= i10;
            }
            if ((i11 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i11 & 1)) {
                if (i12 != 0) {
                    bVar2 = b.INSTANCE;
                }
                if (i3 != 0) {
                    xa4VarL = lr.l(0, 0, null, 7, null);
                }
                if (i5 != 0) {
                    objR4 = dVarF.R();
                    if (objR4 == d.INSTANCE.a()) {
                        objR4 = new Function1<T, T>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$3$1
                            public final T invoke(T t11) {
                                return t11;
                            }
                        };
                        dVarF.L(objR4);
                    }
                    function2 = (Function1) objR4;
                }
                if (e.k()) {
                    e.o(-1877370462, i11, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:102)");
                }
                objR = dVarF.R();
                companion = d.INSTANCE;
                obj = objR;
                if (objR == companion.a()) {
                    SnapshotStateList snapshotStateListF6 = p0.f();
                    snapshotStateListF6.add(transition.p());
                    dVarF.L(snapshotStateListF6);
                    obj = snapshotStateListF6;
                }
                snapshotStateList = (SnapshotStateList) obj;
                objR2 = dVarF.R();
                if (objR2 == companion.a()) {
                    objR2 = k4b.c();
                    dVarF.L(objR2);
                }
                k58Var = (k58) objR2;
                if (Intrinsics.e(transition.p(), transition.w())) {
                    dVarF.y(321145192);
                    if (snapshotStateList.size() == 1) {
                        dVarF.y(321279546);
                        if ((i11 & 14) == 4) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objR3 = dVarF.R();
                        if (z2) {
                            objR3 = new Function1<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final Boolean invoke(T t11) {
                                    return Boolean.valueOf(!Intrinsics.e(t11, transition.w()));
                                }
                            };
                            dVarF.L(objR3);
                        } else {
                            objR3 = new Function1<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final Boolean invoke(T t11) {
                                    return Boolean.valueOf(!Intrinsics.e(t11, transition.w()));
                                }
                            };
                            dVarF.L(objR3);
                        }
                        m.O(snapshotStateList, (Function1) objR3);
                        k58Var.k();
                        dVarF.u();
                    } else {
                        dVarF.y(321279546);
                        if ((i11 & 14) == 4) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objR3 = dVarF.R();
                        if (z2) {
                            objR3 = new Function1<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final Boolean invoke(T t11) {
                                    return Boolean.valueOf(!Intrinsics.e(t11, transition.w()));
                                }
                            };
                            dVarF.L(objR3);
                        } else {
                            objR3 = new Function1<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final Boolean invoke(T t11) {
                                    return Boolean.valueOf(!Intrinsics.e(t11, transition.w()));
                                }
                            };
                            dVarF.L(objR3);
                        }
                        m.O(snapshotStateList, (Function1) objR3);
                        k58Var.k();
                        dVarF.u();
                    }
                    dVarF.u();
                } else {
                    dVarF.y(321475776);
                    dVarF.u();
                }
                if (k58Var.b(transition.w())) {
                    dVarF.y(321536443);
                    it = snapshotStateList.iterator();
                    i8 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            i8 = -1;
                            break;
                        } else {
                            if (Intrinsics.e(function2.invoke(it.next()), function2.invoke(transition.w()))) {
                                break;
                                break;
                            }
                            i8++;
                        }
                    }
                    if (i8 == -1) {
                        snapshotStateList.add(transition.w());
                    } else {
                        snapshotStateList.set(i8, transition.w());
                    }
                    k58Var.k();
                    size2 = snapshotStateList.size();
                    while (i9 < size2) {
                        T t11 = snapshotStateList.get(i9);
                        k58Var.x(t11, ko1.e(-934471669, true, new CrossfadeKt$Crossfade$5$1(transition, xa4VarL, t11, ps4Var), dVarF, 54));
                    }
                    dVarF.u();
                } else {
                    dVarF.y(322279296);
                    dVarF.u();
                }
                ej7 ej7VarI6 = j.i(tc.INSTANCE.o(), false);
                int iHashCode6 = Long.hashCode(pp1.b(dVarF, 0));
                gs1 gs1VarJ6 = dVarF.j();
                b bVarE6 = ComposedModifierKt.e(dVarF, bVar2);
                ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                function0B = companion7.b();
                if (dVarF.G() == null) {
                    pp1.d();
                }
                dVarF.o();
                if (dVarF.getInserting()) {
                    dVarF.W(function0B);
                } else {
                    dVarF.k();
                }
                d dVarC6 = dud.c(dVarF);
                dud.i(dVarC6, ej7VarI6, companion7.d());
                dud.i(dVarC6, gs1VarJ6, companion7.f());
                dud.d(dVarC6, Integer.valueOf(iHashCode6), companion7.c());
                dud.g(dVarC6, companion7.a());
                dud.i(dVarC6, bVarE6, companion7.e());
                BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.a;
                dVarF.y(-1312707512);
                size = snapshotStateList.size();
                while (i7 < size) {
                    T t12 = snapshotStateList.get(i7);
                    dVarF.V(1171574969, function2.invoke(t12));
                    function4 = (Function2) k58Var.e(t12);
                    if (function4 == null) {
                        dVarF.y(1959122128);
                        dVarF.u();
                    } else {
                        dVarF.y(1171576145);
                        function4.invoke(dVarF, 0);
                        dVarF.u();
                    }
                    dVarF.Z();
                }
                dVarF.u();
                dVarF.m();
                if (e.k()) {
                    e.n();
                }
            } else {
                dVarF.q();
            }
            xa4Var2 = xa4VarL;
            function3 = function2;
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                final b bVar8 = bVar2;
                s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$7
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                        invoke((d) obj2, ((Number) obj3).intValue());
                        return Unit.a;
                    }

                    public final void invoke(d dVar2, int i13) {
                        CrossfadeKt.a(transition, bVar8, xa4Var2, function3, ps4Var, dVar2, saa.a(i | 1), i2);
                    }
                });
            }
        }
        i11 |= 384;
        xa4VarL = xa4Var;
        i5 = i2 & 4;
        if (i5 != 0) {
            if ((i & 3072) == 0) {
                function2 = function1;
                if (dVarF.T(function2)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i11 |= i6;
            }
            if ((i & 24576) == 0) {
                if (dVarF.T(ps4Var)) {
                    i10 = 16384;
                } else {
                    i10 = 8192;
                }
                i11 |= i10;
            }
            if ((i11 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i11 & 1)) {
                if (i12 != 0) {
                    bVar2 = b.INSTANCE;
                }
                if (i3 != 0) {
                    xa4VarL = lr.l(0, 0, null, 7, null);
                }
                if (i5 != 0) {
                    objR4 = dVarF.R();
                    if (objR4 == d.INSTANCE.a()) {
                        objR4 = new Function1<T, T>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$3$1
                            public final T invoke(T t13) {
                                return t13;
                            }
                        };
                        dVarF.L(objR4);
                    }
                    function2 = (Function1) objR4;
                }
                if (e.k()) {
                    e.o(-1877370462, i11, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:102)");
                }
                objR = dVarF.R();
                companion = d.INSTANCE;
                obj = objR;
                if (objR == companion.a()) {
                    SnapshotStateList snapshotStateListF7 = p0.f();
                    snapshotStateListF7.add(transition.p());
                    dVarF.L(snapshotStateListF7);
                    obj = snapshotStateListF7;
                }
                snapshotStateList = (SnapshotStateList) obj;
                objR2 = dVarF.R();
                if (objR2 == companion.a()) {
                    objR2 = k4b.c();
                    dVarF.L(objR2);
                }
                k58Var = (k58) objR2;
                if (Intrinsics.e(transition.p(), transition.w())) {
                    dVarF.y(321145192);
                    if (snapshotStateList.size() == 1) {
                        dVarF.y(321279546);
                        if ((i11 & 14) == 4) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objR3 = dVarF.R();
                        if (z2) {
                            objR3 = new Function1<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final Boolean invoke(T t13) {
                                    return Boolean.valueOf(!Intrinsics.e(t13, transition.w()));
                                }
                            };
                            dVarF.L(objR3);
                        } else {
                            objR3 = new Function1<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final Boolean invoke(T t13) {
                                    return Boolean.valueOf(!Intrinsics.e(t13, transition.w()));
                                }
                            };
                            dVarF.L(objR3);
                        }
                        m.O(snapshotStateList, (Function1) objR3);
                        k58Var.k();
                        dVarF.u();
                    } else {
                        dVarF.y(321279546);
                        if ((i11 & 14) == 4) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objR3 = dVarF.R();
                        if (z2) {
                            objR3 = new Function1<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final Boolean invoke(T t13) {
                                    return Boolean.valueOf(!Intrinsics.e(t13, transition.w()));
                                }
                            };
                            dVarF.L(objR3);
                        } else {
                            objR3 = new Function1<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final Boolean invoke(T t13) {
                                    return Boolean.valueOf(!Intrinsics.e(t13, transition.w()));
                                }
                            };
                            dVarF.L(objR3);
                        }
                        m.O(snapshotStateList, (Function1) objR3);
                        k58Var.k();
                        dVarF.u();
                    }
                    dVarF.u();
                } else {
                    dVarF.y(321475776);
                    dVarF.u();
                }
                if (k58Var.b(transition.w())) {
                    dVarF.y(321536443);
                    it = snapshotStateList.iterator();
                    i8 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            i8 = -1;
                            break;
                        } else {
                            if (Intrinsics.e(function2.invoke(it.next()), function2.invoke(transition.w()))) {
                                break;
                                break;
                            }
                            i8++;
                        }
                    }
                    if (i8 == -1) {
                        snapshotStateList.add(transition.w());
                    } else {
                        snapshotStateList.set(i8, transition.w());
                    }
                    k58Var.k();
                    size2 = snapshotStateList.size();
                    while (i9 < size2) {
                        T t13 = snapshotStateList.get(i9);
                        k58Var.x(t13, ko1.e(-934471669, true, new CrossfadeKt$Crossfade$5$1(transition, xa4VarL, t13, ps4Var), dVarF, 54));
                    }
                    dVarF.u();
                } else {
                    dVarF.y(322279296);
                    dVarF.u();
                }
                ej7 ej7VarI7 = j.i(tc.INSTANCE.o(), false);
                int iHashCode7 = Long.hashCode(pp1.b(dVarF, 0));
                gs1 gs1VarJ7 = dVarF.j();
                b bVarE7 = ComposedModifierKt.e(dVarF, bVar2);
                ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                function0B = companion8.b();
                if (dVarF.G() == null) {
                    pp1.d();
                }
                dVarF.o();
                if (dVarF.getInserting()) {
                    dVarF.W(function0B);
                } else {
                    dVarF.k();
                }
                d dVarC7 = dud.c(dVarF);
                dud.i(dVarC7, ej7VarI7, companion8.d());
                dud.i(dVarC7, gs1VarJ7, companion8.f());
                dud.d(dVarC7, Integer.valueOf(iHashCode7), companion8.c());
                dud.g(dVarC7, companion8.a());
                dud.i(dVarC7, bVarE7, companion8.e());
                BoxScopeInstance boxScopeInstance7 = BoxScopeInstance.a;
                dVarF.y(-1312707512);
                size = snapshotStateList.size();
                while (i7 < size) {
                    T t14 = snapshotStateList.get(i7);
                    dVarF.V(1171574969, function2.invoke(t14));
                    function4 = (Function2) k58Var.e(t14);
                    if (function4 == null) {
                        dVarF.y(1959122128);
                        dVarF.u();
                    } else {
                        dVarF.y(1171576145);
                        function4.invoke(dVarF, 0);
                        dVarF.u();
                    }
                    dVarF.Z();
                }
                dVarF.u();
                dVarF.m();
                if (e.k()) {
                    e.n();
                }
            } else {
                dVarF.q();
            }
            xa4Var2 = xa4VarL;
            function3 = function2;
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                final b bVar9 = bVar2;
                s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$7
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                        invoke((d) obj2, ((Number) obj3).intValue());
                        return Unit.a;
                    }

                    public final void invoke(d dVar2, int i13) {
                        CrossfadeKt.a(transition, bVar9, xa4Var2, function3, ps4Var, dVar2, saa.a(i | 1), i2);
                    }
                });
            }
        }
        i11 |= 3072;
        function2 = function1;
        if ((i & 24576) == 0) {
            if (dVarF.T(ps4Var)) {
                i10 = 16384;
            } else {
                i10 = 8192;
            }
            i11 |= i10;
        }
        if ((i11 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (dVarF.g(z, i11 & 1)) {
            if (i12 != 0) {
                bVar2 = b.INSTANCE;
            }
            if (i3 != 0) {
                xa4VarL = lr.l(0, 0, null, 7, null);
            }
            if (i5 != 0) {
                objR4 = dVarF.R();
                if (objR4 == d.INSTANCE.a()) {
                    objR4 = new Function1<T, T>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$3$1
                        public final T invoke(T t15) {
                            return t15;
                        }
                    };
                    dVarF.L(objR4);
                }
                function2 = (Function1) objR4;
            }
            if (e.k()) {
                e.o(-1877370462, i11, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:102)");
            }
            objR = dVarF.R();
            companion = d.INSTANCE;
            obj = objR;
            if (objR == companion.a()) {
                SnapshotStateList snapshotStateListF8 = p0.f();
                snapshotStateListF8.add(transition.p());
                dVarF.L(snapshotStateListF8);
                obj = snapshotStateListF8;
            }
            snapshotStateList = (SnapshotStateList) obj;
            objR2 = dVarF.R();
            if (objR2 == companion.a()) {
                objR2 = k4b.c();
                dVarF.L(objR2);
            }
            k58Var = (k58) objR2;
            if (Intrinsics.e(transition.p(), transition.w())) {
                dVarF.y(321145192);
                if (snapshotStateList.size() == 1) {
                    dVarF.y(321279546);
                    if ((i11 & 14) == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objR3 = dVarF.R();
                    if (z2) {
                        objR3 = new Function1<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final Boolean invoke(T t15) {
                                return Boolean.valueOf(!Intrinsics.e(t15, transition.w()));
                            }
                        };
                        dVarF.L(objR3);
                    } else {
                        objR3 = new Function1<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final Boolean invoke(T t15) {
                                return Boolean.valueOf(!Intrinsics.e(t15, transition.w()));
                            }
                        };
                        dVarF.L(objR3);
                    }
                    m.O(snapshotStateList, (Function1) objR3);
                    k58Var.k();
                    dVarF.u();
                } else {
                    dVarF.y(321279546);
                    if ((i11 & 14) == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objR3 = dVarF.R();
                    if (z2) {
                        objR3 = new Function1<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final Boolean invoke(T t15) {
                                return Boolean.valueOf(!Intrinsics.e(t15, transition.w()));
                            }
                        };
                        dVarF.L(objR3);
                    } else {
                        objR3 = new Function1<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final Boolean invoke(T t15) {
                                return Boolean.valueOf(!Intrinsics.e(t15, transition.w()));
                            }
                        };
                        dVarF.L(objR3);
                    }
                    m.O(snapshotStateList, (Function1) objR3);
                    k58Var.k();
                    dVarF.u();
                }
                dVarF.u();
            } else {
                dVarF.y(321475776);
                dVarF.u();
            }
            if (k58Var.b(transition.w())) {
                dVarF.y(321536443);
                it = snapshotStateList.iterator();
                i8 = 0;
                while (true) {
                    if (it.hasNext()) {
                        i8 = -1;
                        break;
                    } else {
                        if (Intrinsics.e(function2.invoke(it.next()), function2.invoke(transition.w()))) {
                            break;
                            break;
                        }
                        i8++;
                    }
                }
                if (i8 == -1) {
                    snapshotStateList.add(transition.w());
                } else {
                    snapshotStateList.set(i8, transition.w());
                }
                k58Var.k();
                size2 = snapshotStateList.size();
                while (i9 < size2) {
                    T t15 = snapshotStateList.get(i9);
                    k58Var.x(t15, ko1.e(-934471669, true, new CrossfadeKt$Crossfade$5$1(transition, xa4VarL, t15, ps4Var), dVarF, 54));
                }
                dVarF.u();
            } else {
                dVarF.y(322279296);
                dVarF.u();
            }
            ej7 ej7VarI8 = j.i(tc.INSTANCE.o(), false);
            int iHashCode8 = Long.hashCode(pp1.b(dVarF, 0));
            gs1 gs1VarJ8 = dVarF.j();
            b bVarE8 = ComposedModifierKt.e(dVarF, bVar2);
            ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
            function0B = companion9.b();
            if (dVarF.G() == null) {
                pp1.d();
            }
            dVarF.o();
            if (dVarF.getInserting()) {
                dVarF.W(function0B);
            } else {
                dVarF.k();
            }
            d dVarC8 = dud.c(dVarF);
            dud.i(dVarC8, ej7VarI8, companion9.d());
            dud.i(dVarC8, gs1VarJ8, companion9.f());
            dud.d(dVarC8, Integer.valueOf(iHashCode8), companion9.c());
            dud.g(dVarC8, companion9.a());
            dud.i(dVarC8, bVarE8, companion9.e());
            BoxScopeInstance boxScopeInstance8 = BoxScopeInstance.a;
            dVarF.y(-1312707512);
            size = snapshotStateList.size();
            while (i7 < size) {
                T t16 = snapshotStateList.get(i7);
                dVarF.V(1171574969, function2.invoke(t16));
                function4 = (Function2) k58Var.e(t16);
                if (function4 == null) {
                    dVarF.y(1959122128);
                    dVarF.u();
                } else {
                    dVarF.y(1171576145);
                    function4.invoke(dVarF, 0);
                    dVarF.u();
                }
                dVarF.Z();
            }
            dVarF.u();
            dVarF.m();
            if (e.k()) {
                e.n();
            }
        } else {
            dVarF.q();
        }
        xa4Var2 = xa4VarL;
        function3 = function2;
        s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            final b bVar10 = bVar2;
            s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((d) obj2, ((Number) obj3).intValue());
                    return Unit.a;
                }

                public final void invoke(d dVar2, int i13) {
                    CrossfadeKt.a(transition, bVar10, xa4Var2, function3, ps4Var, dVar2, saa.a(i | 1), i2);
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    /* JADX WARN: Code duplicated, block: B:28:0x004a  */
    /* JADX WARN: Code duplicated, block: B:30:0x004e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:33:0x0059  */
    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:39:0x0065  */
    /* JADX WARN: Code duplicated, block: B:41:0x0069  */
    /* JADX WARN: Code duplicated, block: B:43:0x0071  */
    /* JADX WARN: Code duplicated, block: B:44:0x0074  */
    /* JADX WARN: Code duplicated, block: B:48:0x007d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x0086  */
    /* JADX WARN: Code duplicated, block: B:55:0x0090  */
    /* JADX WARN: Code duplicated, block: B:56:0x0092  */
    /* JADX WARN: Code duplicated, block: B:59:0x009b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x009d  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00af  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00de  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    public static final <T> void b(final T t, b bVar, xa4<Float> xa4Var, String str, final ps4<? super T, ? super d, ? super Integer, Unit> ps4Var, d dVar, final int i, final int i2) {
        int i3;
        b bVar2;
        int i4;
        xa4<Float> xa4Var2;
        int i5;
        int i6;
        int i7;
        boolean z;
        final b bVar3;
        final xa4<Float> xa4Var3;
        final String str2;
        s6b s6bVarH;
        int i8;
        b bVar4;
        xa4<Float> xa4VarL;
        String str3;
        int i9;
        d dVarF = dVar.F(-513216493);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? dVarF.x(t) : dVarF.T(t) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 == 0) {
            if ((i & 48) == 0) {
                bVar2 = bVar;
                i3 |= dVarF.x(bVar2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    xa4Var2 = xa4Var;
                    if (dVarF.T(xa4Var2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 3072) == 0) {
                        if (dVarF.x(str)) {
                            i7 = 2048;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    if ((i & 24576) == 0) {
                        if (dVarF.T(ps4Var)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    if ((i3 & 9363) != 9362) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i3 & 1)) {
                        if (i10 != 0) {
                            bVar4 = b.INSTANCE;
                            i8 = i6;
                        } else {
                            i8 = i6;
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            xa4VarL = lr.l(0, 0, null, 7, null);
                        } else {
                            xa4VarL = xa4Var2;
                        }
                        if (i8 != 0) {
                            str3 = "Crossfade";
                        } else {
                            str3 = str;
                        }
                        if (e.k()) {
                            e.o(-513216493, i3, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:55)");
                        }
                        a(TransitionKt.y(t, str3, dVarF, (i3 & 14) | ((i3 >> 6) & 112), 0), bVar4, xa4VarL, null, ps4Var, dVarF, i3 & 58352, 4);
                        if (e.k()) {
                            e.n();
                        }
                        str2 = str3;
                        bVar3 = bVar4;
                        xa4Var3 = xa4VarL;
                    } else {
                        dVarF.q();
                        bVar3 = bVar2;
                        xa4Var3 = xa4Var2;
                        str2 = str;
                    }
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((d) obj, ((Number) obj2).intValue());
                                return Unit.a;
                            }

                            public final void invoke(d dVar2, int i11) {
                                CrossfadeKt.b(t, bVar3, xa4Var3, str2, ps4Var, dVar2, saa.a(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 3072;
                if ((i & 24576) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((i3 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i3 & 1)) {
                    if (i10 != 0) {
                        bVar4 = b.INSTANCE;
                        i8 = i6;
                    } else {
                        i8 = i6;
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        xa4VarL = lr.l(0, 0, null, 7, null);
                    } else {
                        xa4VarL = xa4Var2;
                    }
                    if (i8 != 0) {
                        str3 = "Crossfade";
                    } else {
                        str3 = str;
                    }
                    if (e.k()) {
                        e.o(-513216493, i3, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:55)");
                    }
                    a(TransitionKt.y(t, str3, dVarF, (i3 & 14) | ((i3 >> 6) & 112), 0), bVar4, xa4VarL, null, ps4Var, dVarF, i3 & 58352, 4);
                    if (e.k()) {
                        e.n();
                    }
                    str2 = str3;
                    bVar3 = bVar4;
                    xa4Var3 = xa4VarL;
                } else {
                    dVarF.q();
                    bVar3 = bVar2;
                    xa4Var3 = xa4Var2;
                    str2 = str;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        public final void invoke(d dVar2, int i11) {
                            CrossfadeKt.b(t, bVar3, xa4Var3, str2, ps4Var, dVar2, saa.a(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 384;
            xa4Var2 = xa4Var;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    if (dVarF.x(str)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                if ((i & 24576) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((i3 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i3 & 1)) {
                    if (i10 != 0) {
                        bVar4 = b.INSTANCE;
                        i8 = i6;
                    } else {
                        i8 = i6;
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        xa4VarL = lr.l(0, 0, null, 7, null);
                    } else {
                        xa4VarL = xa4Var2;
                    }
                    if (i8 != 0) {
                        str3 = "Crossfade";
                    } else {
                        str3 = str;
                    }
                    if (e.k()) {
                        e.o(-513216493, i3, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:55)");
                    }
                    a(TransitionKt.y(t, str3, dVarF, (i3 & 14) | ((i3 >> 6) & 112), 0), bVar4, xa4VarL, null, ps4Var, dVarF, i3 & 58352, 4);
                    if (e.k()) {
                        e.n();
                    }
                    str2 = str3;
                    bVar3 = bVar4;
                    xa4Var3 = xa4VarL;
                } else {
                    dVarF.q();
                    bVar3 = bVar2;
                    xa4Var3 = xa4Var2;
                    str2 = str;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        public final void invoke(d dVar2, int i11) {
                            CrossfadeKt.b(t, bVar3, xa4Var3, str2, ps4Var, dVar2, saa.a(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 3072;
            if ((i & 24576) == 0) {
                if (dVarF.T(ps4Var)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i3 |= i9;
            }
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i3 & 1)) {
                if (i10 != 0) {
                    bVar4 = b.INSTANCE;
                    i8 = i6;
                } else {
                    i8 = i6;
                    bVar4 = bVar2;
                }
                if (i4 != 0) {
                    xa4VarL = lr.l(0, 0, null, 7, null);
                } else {
                    xa4VarL = xa4Var2;
                }
                if (i8 != 0) {
                    str3 = "Crossfade";
                } else {
                    str3 = str;
                }
                if (e.k()) {
                    e.o(-513216493, i3, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:55)");
                }
                a(TransitionKt.y(t, str3, dVarF, (i3 & 14) | ((i3 >> 6) & 112), 0), bVar4, xa4VarL, null, ps4Var, dVarF, i3 & 58352, 4);
                if (e.k()) {
                    e.n();
                }
                str2 = str3;
                bVar3 = bVar4;
                xa4Var3 = xa4VarL;
            } else {
                dVarF.q();
                bVar3 = bVar2;
                xa4Var3 = xa4Var2;
                str2 = str;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((d) obj, ((Number) obj2).intValue());
                        return Unit.a;
                    }

                    public final void invoke(d dVar2, int i11) {
                        CrossfadeKt.b(t, bVar3, xa4Var3, str2, ps4Var, dVar2, saa.a(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 48;
        bVar2 = bVar;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                xa4Var2 = xa4Var;
                if (dVarF.T(xa4Var2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    if (dVarF.x(str)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                if ((i & 24576) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((i3 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i3 & 1)) {
                    if (i10 != 0) {
                        bVar4 = b.INSTANCE;
                        i8 = i6;
                    } else {
                        i8 = i6;
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        xa4VarL = lr.l(0, 0, null, 7, null);
                    } else {
                        xa4VarL = xa4Var2;
                    }
                    if (i8 != 0) {
                        str3 = "Crossfade";
                    } else {
                        str3 = str;
                    }
                    if (e.k()) {
                        e.o(-513216493, i3, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:55)");
                    }
                    a(TransitionKt.y(t, str3, dVarF, (i3 & 14) | ((i3 >> 6) & 112), 0), bVar4, xa4VarL, null, ps4Var, dVarF, i3 & 58352, 4);
                    if (e.k()) {
                        e.n();
                    }
                    str2 = str3;
                    bVar3 = bVar4;
                    xa4Var3 = xa4VarL;
                } else {
                    dVarF.q();
                    bVar3 = bVar2;
                    xa4Var3 = xa4Var2;
                    str2 = str;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        public final void invoke(d dVar2, int i11) {
                            CrossfadeKt.b(t, bVar3, xa4Var3, str2, ps4Var, dVar2, saa.a(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 3072;
            if ((i & 24576) == 0) {
                if (dVarF.T(ps4Var)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i3 |= i9;
            }
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i3 & 1)) {
                if (i10 != 0) {
                    bVar4 = b.INSTANCE;
                    i8 = i6;
                } else {
                    i8 = i6;
                    bVar4 = bVar2;
                }
                if (i4 != 0) {
                    xa4VarL = lr.l(0, 0, null, 7, null);
                } else {
                    xa4VarL = xa4Var2;
                }
                if (i8 != 0) {
                    str3 = "Crossfade";
                } else {
                    str3 = str;
                }
                if (e.k()) {
                    e.o(-513216493, i3, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:55)");
                }
                a(TransitionKt.y(t, str3, dVarF, (i3 & 14) | ((i3 >> 6) & 112), 0), bVar4, xa4VarL, null, ps4Var, dVarF, i3 & 58352, 4);
                if (e.k()) {
                    e.n();
                }
                str2 = str3;
                bVar3 = bVar4;
                xa4Var3 = xa4VarL;
            } else {
                dVarF.q();
                bVar3 = bVar2;
                xa4Var3 = xa4Var2;
                str2 = str;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((d) obj, ((Number) obj2).intValue());
                        return Unit.a;
                    }

                    public final void invoke(d dVar2, int i11) {
                        CrossfadeKt.b(t, bVar3, xa4Var3, str2, ps4Var, dVar2, saa.a(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 384;
        xa4Var2 = xa4Var;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                if (dVarF.x(str)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            if ((i & 24576) == 0) {
                if (dVarF.T(ps4Var)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i3 |= i9;
            }
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i3 & 1)) {
                if (i10 != 0) {
                    bVar4 = b.INSTANCE;
                    i8 = i6;
                } else {
                    i8 = i6;
                    bVar4 = bVar2;
                }
                if (i4 != 0) {
                    xa4VarL = lr.l(0, 0, null, 7, null);
                } else {
                    xa4VarL = xa4Var2;
                }
                if (i8 != 0) {
                    str3 = "Crossfade";
                } else {
                    str3 = str;
                }
                if (e.k()) {
                    e.o(-513216493, i3, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:55)");
                }
                a(TransitionKt.y(t, str3, dVarF, (i3 & 14) | ((i3 >> 6) & 112), 0), bVar4, xa4VarL, null, ps4Var, dVarF, i3 & 58352, 4);
                if (e.k()) {
                    e.n();
                }
                str2 = str3;
                bVar3 = bVar4;
                xa4Var3 = xa4VarL;
            } else {
                dVarF.q();
                bVar3 = bVar2;
                xa4Var3 = xa4Var2;
                str2 = str;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((d) obj, ((Number) obj2).intValue());
                        return Unit.a;
                    }

                    public final void invoke(d dVar2, int i11) {
                        CrossfadeKt.b(t, bVar3, xa4Var3, str2, ps4Var, dVar2, saa.a(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 3072;
        if ((i & 24576) == 0) {
            if (dVarF.T(ps4Var)) {
                i9 = 16384;
            } else {
                i9 = 8192;
            }
            i3 |= i9;
        }
        if ((i3 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (dVarF.g(z, i3 & 1)) {
            if (i10 != 0) {
                bVar4 = b.INSTANCE;
                i8 = i6;
            } else {
                i8 = i6;
                bVar4 = bVar2;
            }
            if (i4 != 0) {
                xa4VarL = lr.l(0, 0, null, 7, null);
            } else {
                xa4VarL = xa4Var2;
            }
            if (i8 != 0) {
                str3 = "Crossfade";
            } else {
                str3 = str;
            }
            if (e.k()) {
                e.o(-513216493, i3, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:55)");
            }
            a(TransitionKt.y(t, str3, dVarF, (i3 & 14) | ((i3 >> 6) & 112), 0), bVar4, xa4VarL, null, ps4Var, dVarF, i3 & 58352, 4);
            if (e.k()) {
                e.n();
            }
            str2 = str3;
            bVar3 = bVar4;
            xa4Var3 = xa4VarL;
        } else {
            dVarF.q();
            bVar3 = bVar2;
            xa4Var3 = xa4Var2;
            str2 = str;
        }
        s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((d) obj, ((Number) obj2).intValue());
                    return Unit.a;
                }

                public final void invoke(d dVar2, int i11) {
                    CrossfadeKt.b(t, bVar3, xa4Var3, str2, ps4Var, dVar2, saa.a(i | 1), i2);
                }
            });
        }
    }
}
